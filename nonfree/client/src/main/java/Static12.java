import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;I)V")
	public static void method111(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class259 local9 = Static46.aClass259Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static46.aClass259Array1[local11] = Static46.aClass259Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class259(arg7, arg3, arg0, arg6, arg5, arg1, arg4, arg2);
		} else {
			local9.method5816(arg1, arg3, arg6, arg4, arg0, arg2, arg7, arg5);
		}
		Static46.aClass259Array1[0] = local9;
		Static229.anInt4663 = Static523.anInt9188;
		Static196.anInt4255++;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!r;Lclient!ega;)I")
	public static int method113(@OriginalArg(1) Class31 arg0, @OriginalArg(2) Class88 arg1) {
		if (arg1.anInt2815 != -1) {
			return arg1.anInt2815;
		}
		if (arg1.anInt2807 != -1) {
			@Pc(32) Class172 local32 = arg0.anInterface4_14.method7229(arg1.anInt2807);
			if (!local32.aBoolean349) {
				return local32.aShort66;
			}
		}
		return arg1.anInt2812;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIIIIZ)V")
	public static void method116(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static189.aClass333ArrayArrayArray1 == null) {
			Static319.aClass31_11.method8094(arg0, arg2, arg1, arg3, -16777216);
		} else if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476 >= 0 && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476 < Static345.anInt6228 * 512 && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482 >= 0 && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482 < Static535.anInt9341 * 512) {
			Static335.anInt6052++;
			if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 != null && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476 + 256 - Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method6668() * 256 >> 9 == Static349.anInt6239 && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482 + 256 - Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method6668() * 256 >> 9 == Static262.anInt5041) {
				Static349.anInt6239 = -1;
				Static262.anInt5041 = -1;
				Static28.method333();
			}
			Static424.method7517();
			if (!arg4) {
				Static231.method3760();
			}
			Static152.method2844();
			Static591.method8124(arg0, true, arg3, arg2, arg1);
			@Pc(115) int local115 = Static302.anInt1927;
			@Pc(117) int local117 = Static401.anInt7159;
			@Pc(119) int local119 = Static409.anInt1458;
			@Pc(121) int local121 = Static278.anInt5261;
			@Pc(127) int local127;
			@Pc(169) int local169;
			if (Static188.anInt4080 == 1) {
				local127 = (int) Static123.aFloat75;
				if (Static6.anInt46 >> 8 > local127) {
					local127 = Static6.anInt46 >> 8;
				}
				if (Static359.aBooleanArray17[4] && Static153.anIntArray134[4] + 128 > local127) {
					local127 = Static153.anIntArray134[4] + 128;
				}
				local169 = (int) Static209.aFloat229 + Static427.anInt7545 & 0x3FFF;
				Static467.method6393((local127 >> 3) * 3 + 600 << 2, Static262.anInt5037, Static377.anInt6530, local169, Static78.method3298(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476, Static594.anInt10310, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482) - 200, local119, local127);
			} else if (Static188.anInt4080 == 4) {
				local127 = (int) Static123.aFloat75;
				if (local127 < Static6.anInt46 >> 8) {
					local127 = Static6.anInt46 >> 8;
				}
				if (Static359.aBooleanArray17[4] && Static153.anIntArray134[4] + 128 > local127) {
					local127 = Static153.anIntArray134[4] + 128;
				}
				local169 = (int) Static209.aFloat229 & 0x3FFF;
				Static467.method6393((local127 >> 3) * 3 + 600 << 2, Static262.anInt5037, Static377.anInt6530, local169, Static78.method3298(Static357.anInt6340, Static594.anInt10310, Static372.anInt6492) - 200, local119, local127);
			} else if (Static188.anInt4080 == 5) {
				Static188.method3312(local119);
			}
			local127 = Static407.anInt7345;
			local169 = Static335.anInt6057;
			@Pc(276) int local276 = Static418.anInt7466;
			@Pc(278) int local278 = Static568.anInt9808;
			@Pc(280) int local280 = Static421.anInt7497;
			@Pc(323) int local323;
			for (@Pc(282) int local282 = 0; local282 < 5; local282++) {
				if (Static359.aBooleanArray17[local282]) {
					local323 = (int) ((double) (Static247.anIntArray228[local282] * 2 + 1) * Math.random() - (double) Static247.anIntArray228[local282] + Math.sin((double) Static461.anIntArray477[local282] * ((double) Static581.anIntArray581[local282] / 100.0D)) * (double) Static153.anIntArray134[local282]);
					if (local282 == 0) {
						Static407.anInt7345 += local323 << 2;
					}
					if (local282 == 1) {
						Static335.anInt6057 += local323 << 2;
					}
					if (local282 == 3) {
						Static421.anInt7497 = Static421.anInt7497 + local323 & 0x3FFF;
					}
					if (local282 == 2) {
						Static418.anInt7466 += local323 << 2;
					}
					if (local282 == 4) {
						Static568.anInt9808 += local323;
						if (Static568.anInt9808 < 1024) {
							Static568.anInt9808 = 1024;
						} else if (Static568.anInt9808 > 3072) {
							Static568.anInt9808 = 3072;
						}
					}
				}
			}
			if (Static407.anInt7345 < 0) {
				Static407.anInt7345 = 0;
			}
			if ((Static349.anInt6237 << 9) - 1 < Static407.anInt7345) {
				Static407.anInt7345 = (Static349.anInt6237 << 9) - 1;
			}
			if (Static418.anInt7466 < 0) {
				Static418.anInt7466 = 0;
			}
			if ((Static414.anInt7451 << 9) - 1 < Static418.anInt7466) {
				Static418.anInt7466 = (Static414.anInt7451 << 9) - 1;
			}
			Static310.method4647();
			Static489.method7314();
			Static319.aClass31_11.da(local117, local121, local117 + local115, local121 - -local119);
			Static319.aClass31_11.ya();
			local323 = Static79.anInt2119;
			if (Static177.aClass256_1 == null) {
				Static319.aClass31_11.ja(local323);
			} else {
				Static177.aClass256_1.method5769(local323, Static568.anInt9808, Static319.aClass31_11, local121, Static111.anInt2678 << 3, Static421.anInt7497, local119, local115, local117);
			}
			Static245.method3870();
			Static585.aClass42_6.na(Static407.anInt7345, Static335.anInt6057, Static418.anInt7466, -Static568.anInt9808 & 0x3FFF, -Static421.anInt7497 & 0x3FFF, -Static528.anInt10345 & 0x3FFF);
			Static319.aClass31_11.method8062(Static585.aClass42_6);
			Static319.aClass31_11.la(local115 / 2 + local117, local121 - -(local119 / 2), Static122.anInt2858 << 1, Static122.anInt2858 << 1);
			Static278.method4205(Static122.anInt2858 << 1, local115 / 2 + local117, local119 / 2 + local121, Static122.anInt2858 << 1);
			Static548.method7510(Static407.anInt7345, -Static568.anInt9808 & 0x3FFF, -Static528.anInt10345 & 0x3FFF, Static335.anInt6057, -Static421.anInt7497 & 0x3FFF, Static418.anInt7466);
			@Pc(560) byte local560 = Static348.aClass3_Sub51_Sub1_5.method7843(Static37.anInt1122) == 2 ? (byte) Static335.anInt6052 : 1;
			Static126.method2376(Static397.anInt6998, Static407.anInt7345, Static335.anInt6057, Static418.anInt7466, Static435.aByteArrayArrayArray11, Static375.anIntArray365, Static56.anIntArray43, Static279.anIntArray244, Static439.anIntArray462, Static559.anIntArray562, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 + 1, local560, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476 >> 9, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482 >> 9, !Static348.aClass3_Sub51_Sub1_5.aBoolean673);
			Static245.method3870();
			if (Static409.anInt1461 == 10) {
				Static555.method7610(local117, local115, local121, local119);
				Static512.method6923(local115, local119, local121, local117);
				Static320.method4729(local119, local121, local115, local117);
				Static494.method6509(local117, local119, local121, local115);
			}
			Static465.method6368();
			Static568.anInt9808 = local278;
			Static418.anInt7466 = local276;
			Static407.anInt7345 = local127;
			Static421.anInt7497 = local280;
			Static335.anInt6057 = local169;
			if (Static125.aBoolean197 && Static153.aClass117_1.method3172() == 0) {
				Static125.aBoolean197 = false;
			}
			if (Static125.aBoolean197) {
				Static319.aClass31_11.method8094(local121, local117, local119, local115, -16777216);
				Static452.method6235(Static2.aClass63_1, Static573.aClass350_16.method7730(Static201.anInt4321), Static319.aClass31_11, Static318.aClass328_8, false);
			}
		} else {
			Static319.aClass31_11.method8094(arg0, arg2, arg1, arg3, -16777216);
		}
	}
}
