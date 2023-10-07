package com.ljq.house;

import com.google.common.hash.HashCode;
import com.ljq.house.common.utils.HashUtils;
import org.springframework.boot.SpringApplication;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.nio.charset.Charset;

public class MyTest {
    public static void main(String[] args) {
        final HashFunction FUNCTION = Hashing.md5();

        final String SALT = "ljq.com";
        String password = "27912e74b37d0126b83e4ccc44e424e2";
        String xx = HashUtils.encryPassword(password);
        System.out.println(xx);
        HashCode hashCode = FUNCTION.hashString(password + SALT, Charset.forName("UTF-8"));
        HashCode ss = FUNCTION.hashUnencodedChars(password);

    }
}
