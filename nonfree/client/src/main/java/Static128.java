import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "Lclient!ke;")
	public static Class1_Sub2_Sub4 aClass1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	public static int anInt3212;

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
	public static int anInt3220;

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
	public static int anInt3216 = 0;

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
	public static int anInt3218 = 0;

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString205 = "Loaded config";

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString206 = "Walk here";

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)Lclient!id;")
	public static Class59 method2422(@OriginalArg(1) int arg0) {
		@Pc(10) Class59 local10 = (Class59) Static182.aClass79_28.method2483((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static253.aClass51_56.method1874(32, arg0);
		local10 = new Class59();
		if (local28 != null) {
			local10.method2098(new Class1_Sub13(local28));
		}
		local10.method2099();
		Static182.aClass79_28.method2486(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZIIIII)V")
	public static void method2423(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static82.anInt2220++;
		Static125.method2401();
		@Pc(28) int local28;
		if (arg0) {
			Static57.method1100(false, 0, false);
		} else {
			Static115.method2301(0);
			Static57.method1100(true, 0, false);
			if (Static241.anInt5187 == 0) {
				for (local28 = 1; local28 <= 5; local28++) {
					Static57.method1100(false, local28, false);
					Static57.method1100(false, local28, true);
					Static115.method2301(local28);
				}
			} else {
				for (local28 = 1; local28 <= 5; local28++) {
					Static115.method2301(local28);
					Static57.method1100(false, local28, false);
					Static57.method1100(false, local28, true);
				}
			}
		}
		if (!arg0) {
			Static223.method3711();
		}
		Static71.method1366();
		@Pc(107) int local107;
		if (Static61.anInt1682 == 1) {
			local107 = Static198.anInt4590 + (int) Static230.aFloat51 & 0x7FF;
			local28 = (int) Static158.aFloat32;
			if (Static257.anInt5461 / 256 > local28) {
				local28 = Static257.anInt5461 / 256;
			}
			if (Static125.aBooleanArray8[4] && local28 < Static47.anIntArray104[4] + 128) {
				local28 = Static47.anIntArray104[4] + 128;
			}
			Static240.method3947(Static57.anInt1583, Static200.method3326(Static137.anInt3321, Static83.aClass9_Sub1_Sub1_1.anInt479, Static83.aClass9_Sub1_Sub1_1.anInt427) - 50, local107, Static81.anInt2193, local28 * 3 + 600, local28, arg2);
		} else if (Static61.anInt1682 == 5) {
			Static75.method1471(arg2);
		}
		local28 = Static174.anInt4003;
		local107 = Static109.anInt2904;
		@Pc(171) int local171 = Static110.anInt2935;
		@Pc(173) int local173 = Static127.anInt3198;
		@Pc(175) int local175 = Static200.anInt4412;
		@Pc(218) int local218;
		for (@Pc(177) int local177 = 0; local177 < 5; local177++) {
			if (Static125.aBooleanArray8[local177]) {
				local218 = (int) (Math.random() * (double) (Static125.anIntArray243[local177] * 2 + 1) - (double) Static125.anIntArray243[local177] + Math.sin((double) Static102.anIntArray203[local177] / 100.0D * (double) Static219.anIntArray384[local177]) * (double) Static47.anIntArray104[local177]);
				if (local177 == 1) {
					Static109.anInt2904 += local218;
				}
				if (local177 == 4) {
					Static200.anInt4412 += local218;
					if (Static200.anInt4412 < 128) {
						Static200.anInt4412 = 128;
					}
					if (Static200.anInt4412 > 383) {
						Static200.anInt4412 = 383;
					}
				}
				if (local177 == 2) {
					Static110.anInt2935 += local218;
				}
				if (local177 == 3) {
					Static127.anInt3198 = local218 + Static127.anInt3198 & 0x7FF;
				}
				if (local177 == 0) {
					Static174.anInt4003 += local218;
				}
			}
		}
		Static247.method4020();
		Static189.method3190(arg4, arg1, arg3 + arg4, arg2 + arg1);
		Static235.method3902();
		if (Static54.anInt1509 >= 0) {
			@Pc(295) Class95 local295 = Static222.method3677(Static29.anInt910, Static66.anInt1837, Static117.anInt3032, Static54.anInt1509);
			local295.method2829(Static33.anInt5179, arg4, arg1, arg3, arg2, Static200.anInt4412, Static127.anInt3198);
		} else {
			Static189.method3193(arg4, arg1, arg3, arg2, 0);
		}
		if (Static259.aBoolean280 || arg4 > Static221.anInt4838 || Static221.anInt4838 >= arg4 + arg3 || arg1 > Static242.anInt5237 || Static242.anInt5237 >= arg1 + arg2) {
			Static36.aBoolean42 = false;
			Static109.anInt2895 = 0;
		} else {
			Static36.aBoolean42 = true;
			local218 = Static174.anInt4002;
			@Pc(343) int local343 = Static180.anInt4132;
			@Pc(345) int local345 = Static48.anInt1415;
			Static109.anInt2895 = 0;
			@Pc(349) int local349 = Static132.anInt3289;
			Static136.anInt3372 = local345 + (Static242.anInt5237 - arg1) * (local349 - local345) / arg2;
			Static12.anInt504 = (Static221.anInt4838 - arg4) * (-local218 + local343) / arg3 + local218;
		}
		Static98.method2086();
		@Pc(399) byte local399 = Static254.method4105() == 2 ? (byte) Static82.anInt2220 : 1;
		Static188.method3170(Static174.anInt4003, Static109.anInt2904, Static110.anInt2935, Static200.anInt4412, Static127.anInt3198, Static132.aByteArrayArrayArray10, Static13.anIntArray45, Static212.anIntArray355, Static101.anIntArray200, Static4.anIntArray5, Static86.anIntArray179, Static137.anInt3321 + 1, local399, Static83.aClass9_Sub1_Sub1_1.anInt427 >> 7, Static83.aClass9_Sub1_Sub1_1.anInt479 >> 7);
		Static98.method2086();
		Static42.method791();
		Static151.method2717(arg2, arg1, arg4, arg3);
		Static241.method3956(arg1, arg3, arg2, arg4);
		((Class15_Sub1) Static235.anInterface1_1).method395(Static37.anInt999);
		Static137.method2506(arg1, arg2, arg3, arg4);
		Static174.anInt4003 = local28;
		Static109.anInt2904 = local107;
		Static200.anInt4412 = local175;
		Static110.anInt2935 = local171;
		Static127.anInt3198 = local173;
		if (Static19.aBoolean36 && Static196.aClass18_2.method441() == 0) {
			Static19.aBoolean36 = false;
		}
		if (Static19.aBoolean36) {
			Static189.method3193(arg4, arg1, arg3, arg2, 0);
			Static179.method3059(false, Static136.aString218);
		}
		if (!arg0 && !Static19.aBoolean36 && !Static259.aBoolean280 && arg4 <= Static221.anInt4838 && arg3 + arg4 > Static221.anInt4838 && arg1 <= Static242.anInt5237 && Static242.anInt5237 < arg2 + arg1) {
			Static144.method2610(arg2, arg3, arg1, arg4, Static221.anInt4838, Static242.anInt5237);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIZ)V")
	public static void method2424() {
		Static94.anInt4252 = 104;
		Static239.anInt5153 = 104;
		Static187.anInt4201 = 25;
		Static84.aClass1_Sub16ArrayArrayArray1 = new Class1_Sub16[4][Static94.anInt4252][Static239.anInt5153];
		Static4.anIntArrayArrayArray1 = new int[4][Static94.anInt4252 + 1][Static239.anInt5153 + 1];
		Static150.aClass1_Sub16ArrayArrayArray5 = null;
		Static36.anIntArrayArray7 = null;
		Static32.anIntArrayArrayArray5 = null;
		Static125.method2397(false);
		Static255.aClass2Array2 = new Class2[500];
		Static217.anInt4761 = 0;
		Static217.aClass2Array1 = new Class2[500];
		Static206.anInt4551 = 0;
		Static248.anIntArrayArrayArray13 = new int[4][Static94.anInt4252 + 1][Static239.anInt5153 + 1];
		Static145.aClass47Array2 = new Class47[5000];
		Static11.anInt496 = 0;
		Static252.aClass47Array3 = new Class47[100];
		Static77.aBooleanArrayArray1 = new boolean[Static187.anInt4201 + Static187.anInt4201 + 1][Static187.anInt4201 + Static187.anInt4201 + 1];
		Static210.aBooleanArrayArray2 = new boolean[Static187.anInt4201 + Static187.anInt4201 + 2][Static187.anInt4201 + Static187.anInt4201 + 2];
		Static144.aByteArrayArrayArray12 = new byte[4][Static94.anInt4252][Static239.anInt5153];
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZJZ)V")
	public static void method2425(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (Static167.anInt3911 >= 100) {
			Static50.method1013("", Static113.aString389, 0);
			return;
		}
		@Pc(29) String local29 = Static169.method2944(arg1);
		for (@Pc(31) int local31 = 0; local31 < Static167.anInt3911; local31++) {
			if (arg1 == Static150.aLongArray23[local31]) {
				Static50.method1013("", local29 + Static109.aString185, 0);
				return;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static265.anInt5544; local62++) {
			if (arg1 == Static139.aLongArray38[local62]) {
				Static50.method1013("", Static237.aString366 + local29 + Static168.aString257, 0);
				return;
			}
		}
		if (local29.equals(Static83.aClass9_Sub1_Sub1_1.aString12)) {
			Static50.method1013("", Static259.aString386, 0);
			return;
		}
		Static150.aLongArray23[Static167.anInt3911] = arg1;
		Static226.aStringArray37[Static167.anInt3911++] = Static42.method790(arg1);
		Static181.aBooleanArray16[Static167.anInt3911++] = arg0;
		Static52.anInt1461 = Static243.anInt5249;
		Static171.aClass1_Sub13_Sub1_3.method1825(122);
		Static171.aClass1_Sub13_Sub1_3.method1770(arg1);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZI[[[Lclient!jd;II)Z")
	public static boolean method2426(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub16[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte local10 = arg0 ? 1 : (byte) (Static82.anInt2220 & 0xFF);
		if (Static132.aByteArrayArrayArray10[Static137.anInt3321][arg4][arg3] == local10) {
			return false;
		} else if ((Static145.aByteArrayArrayArray13[Static137.anInt3321][arg4][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) byte local42 = 0;
			Static197.anIntArray175[0] = arg4;
			@Pc(49) int local49 = local42 + 1;
			Static116.anIntArray219[0] = arg3;
			@Pc(53) int local53 = 0;
			Static132.aByteArrayArrayArray10[Static137.anInt3321][arg4][arg3] = local10;
			while (local49 != local53) {
				@Pc(69) int local69 = Static197.anIntArray175[local53] & 0xFFFF;
				@Pc(77) int local77 = Static197.anIntArray175[local53] >> 16 & 0xFF;
				@Pc(83) int local83 = Static116.anIntArray219[local53] & 0xFFFF;
				@Pc(91) int local91 = Static197.anIntArray175[local53] >> 24 & 0xFF;
				@Pc(93) boolean local93 = false;
				@Pc(101) int local101 = Static116.anIntArray219[local53] >> 16 & 0xFF;
				local53 = local53 + 1 & 0xFFF;
				if ((Static145.aByteArrayArrayArray13[Static137.anInt3321][local69][local83] & 0x4) == 0) {
					local93 = true;
				}
				@Pc(124) boolean local124 = false;
				@Pc(163) int local163;
				@Pc(201) int local201;
				label223: for (@Pc(128) int local128 = Static137.anInt3321 + 1; local128 <= 3; local128++) {
					if ((Static145.aByteArrayArrayArray13[local128][local69][local83] & 0x8) == 0) {
						@Pc(321) int local321;
						if (local93 && arg2[local128][local69][local83] != null) {
							if (arg2[local128][local69][local83].aClass144_1 != null) {
								local163 = Static123.method895(local77);
								if (arg2[local128][local69][local83].aClass144_1.anInt5339 == local163 || local163 == arg2[local128][local69][local83].aClass144_1.anInt5343) {
									continue;
								}
								if (local91 != 0) {
									local201 = Static123.method895(local91);
									if (arg2[local128][local69][local83].aClass144_1.anInt5339 == local201 || local201 == arg2[local128][local69][local83].aClass144_1.anInt5343) {
										continue;
									}
								}
								if (local101 != 0) {
									local201 = Static123.method895(local101);
									if (local201 == arg2[local128][local69][local83].aClass144_1.anInt5339 || local201 == arg2[local128][local69][local83].aClass144_1.anInt5343) {
										continue;
									}
								}
							}
							if (arg2[local128][local69][local83].aClass47Array1 != null) {
								for (local163 = 0; local163 < arg2[local128][local69][local83].anInt2929; local163++) {
									local201 = (int) (arg2[local128][local69][local83].aClass47Array1[local163].aLong73 >> 14 & 0x3FL);
									@Pc(310) int local310 = (int) (arg2[local128][local69][local83].aClass47Array1[local163].aLong73 >> 20 & 0x3L);
									if (local201 == 21) {
										local201 = 19;
									}
									local321 = local310 << 6 | local201;
									if (local321 == local77 || local91 != 0 && local321 == local91 || local101 != 0 && local101 == local321) {
										continue label223;
									}
								}
							}
						}
						local124 = true;
						@Pc(376) Class1_Sub16 local376 = arg2[local128][local69][local83];
						if (local376 != null && local376.anInt2929 > 0) {
							for (local201 = 0; local201 < local376.anInt2929; local201++) {
								@Pc(390) Class47 local390 = local376.aClass47Array1[local201];
								if (local390.anInt2160 != local390.anInt2146 || local390.anInt2148 != local390.anInt2158) {
									for (local321 = local390.anInt2146; local321 <= local390.anInt2160; local321++) {
										for (@Pc(412) int local412 = local390.anInt2148; local412 <= local390.anInt2158; local412++) {
											Static132.aByteArrayArrayArray10[local128][local321][local412] = local10;
										}
									}
								}
							}
						}
						Static132.aByteArrayArrayArray10[local128][local69][local83] = local10;
					}
				}
				if (local124) {
					local163 = local69 << 7;
					local201 = local83 << 7;
					if (Static38.anIntArrayArrayArray6[Static137.anInt3321 + 1][local69][local83] > Static13.anIntArray45[arg1]) {
						Static13.anIntArray45[arg1] = Static38.anIntArrayArrayArray6[Static137.anInt3321 + 1][local69][local83];
					}
					if (Static212.anIntArray355[arg1] > local163) {
						Static212.anIntArray355[arg1] = local163;
					} else if (local163 > Static101.anIntArray200[arg1]) {
						Static101.anIntArray200[arg1] = local163;
					}
					if (local201 < Static86.anIntArray179[arg1]) {
						Static86.anIntArray179[arg1] = local201;
					} else if (Static4.anIntArray5[arg1] < local201) {
						Static4.anIntArray5[arg1] = local201;
					}
				}
				if (!local93) {
					if (local69 >= 1 && local10 != Static132.aByteArrayArrayArray10[Static137.anInt3321][local69 - 1][local83]) {
						Static197.anIntArray175[local49] = local69 - 1 | 0x120000 | 0xD3000000;
						Static116.anIntArray219[local49] = local83 | 0x130000;
						Static132.aByteArrayArrayArray10[Static137.anInt3321][local69 - 1][local83] = local10;
						local49 = local49 + 1 & 0xFFF;
					}
					local83++;
					if (local83 < 104) {
						if (local69 - 1 >= 0 && Static132.aByteArrayArrayArray10[Static137.anInt3321][local69 - 1][local83] != local10 && (Static145.aByteArrayArrayArray13[Static137.anInt3321][local69][local83] & 0x4) == 0 && (Static145.aByteArrayArrayArray13[Static137.anInt3321][local69 - 1][local83 - 1] & 0x4) == 0) {
							Static197.anIntArray175[local49] = 0x52000000 | 0x120000 | local69 - 1;
							Static116.anIntArray219[local49] = local83 | 0x130000;
							Static132.aByteArrayArrayArray10[Static137.anInt3321][local69 - 1][local83] = local10;
							local49 = local49 + 1 & 0xFFF;
						}
						if (local10 != Static132.aByteArrayArrayArray10[Static137.anInt3321][local69][local83]) {
							Static197.anIntArray175[local49] = 0x13000000 | 0x520000 | local69;
							Static116.anIntArray219[local49] = local83 | 0x530000;
							local49 = local49 + 1 & 0xFFF;
							Static132.aByteArrayArrayArray10[Static137.anInt3321][local69][local83] = local10;
						}
						if (local69 + 1 < 104 && Static132.aByteArrayArrayArray10[Static137.anInt3321][local69 + 1][local83] != local10 && (Static145.aByteArrayArrayArray13[Static137.anInt3321][local69][local83] & 0x4) == 0 && (Static145.aByteArrayArrayArray13[Static137.anInt3321][local69 + 1][local83 - 1] & 0x4) == 0) {
							Static197.anIntArray175[local49] = 0x92000000 | 0x520000 | local69 + 1;
							Static116.anIntArray219[local49] = local83 | 0x530000;
							local49 = local49 + 1 & 0xFFF;
							Static132.aByteArrayArrayArray10[Static137.anInt3321][local69 + 1][local83] = local10;
						}
					}
					local83--;
					if (local69 + 1 < 104 && Static132.aByteArrayArrayArray10[Static137.anInt3321][local69 + 1][local83] != local10) {
						Static197.anIntArray175[local49] = local69 + 1 | 0x920000 | 0x53000000;
						Static116.anIntArray219[local49] = local83 | 0x930000;
						Static132.aByteArrayArrayArray10[Static137.anInt3321][local69 + 1][local83] = local10;
						local49 = local49 + 1 & 0xFFF;
					}
					local83--;
					if (local83 >= 0) {
						if (local69 - 1 >= 0 && local10 != Static132.aByteArrayArrayArray10[Static137.anInt3321][local69 - 1][local83] && (Static145.aByteArrayArrayArray13[Static137.anInt3321][local69][local83] & 0x4) == 0 && (Static145.aByteArrayArrayArray13[Static137.anInt3321][local69 - 1][local83 + 1] & 0x4) == 0) {
							Static197.anIntArray175[local49] = local69 - 1 | 0xD20000 | 0x12000000;
							Static116.anIntArray219[local49] = local83 | 0xD30000;
							Static132.aByteArrayArrayArray10[Static137.anInt3321][local69 - 1][local83] = local10;
							local49 = local49 + 1 & 0xFFF;
						}
						if (local10 != Static132.aByteArrayArrayArray10[Static137.anInt3321][local69][local83]) {
							Static197.anIntArray175[local49] = local69 | 0xD20000 | 0x93000000;
							Static116.anIntArray219[local49] = local83 | 0xD30000;
							Static132.aByteArrayArrayArray10[Static137.anInt3321][local69][local83] = local10;
							local49 = local49 + 1 & 0xFFF;
						}
						if (local69 + 1 < 104 && local10 != Static132.aByteArrayArrayArray10[Static137.anInt3321][local69 + 1][local83] && (Static145.aByteArrayArrayArray13[Static137.anInt3321][local69][local83] & 0x4) == 0 && (Static145.aByteArrayArrayArray13[Static137.anInt3321][local69 + 1][local83 + 1] & 0x4) == 0) {
							Static197.anIntArray175[local49] = 0xD2000000 | 0x920000 | local69 + 1;
							Static116.anIntArray219[local49] = local83 | 0x930000;
							Static132.aByteArrayArrayArray10[Static137.anInt3321][local69 + 1][local83] = local10;
							local49 = local49 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static13.anIntArray45[arg1] != -1000000) {
				Static13.anIntArray45[arg1] += 10;
				Static212.anIntArray355[arg1] -= 50;
				Static101.anIntArray200[arg1] += 50;
				Static4.anIntArray5[arg1] += 50;
				Static86.anIntArray179[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	public static void method2427() {
		Static174.aClass79_27.method2487();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2429(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(21) char local21 = arg0.charAt(local15);
			if (local13 == 0) {
				local21 = Character.toLowerCase(local21);
			} else if (local13 == 2 || Character.isUpperCase(local21)) {
				local21 = Static12.method229(local21);
			}
			if (Character.isLetter(local21)) {
				local13 = 0;
			} else if (local21 == '.' || local21 == '?' || local21 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local21)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local15] = local21;
		}
		return new String(local11);
	}
}
