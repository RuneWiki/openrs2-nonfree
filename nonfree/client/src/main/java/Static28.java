import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
	public static int anInt601;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
	public static int anInt605;

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
	public static int anInt606;

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_13 = new Class205(58, 8);

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_3 = new Class160(32);

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
	public static int anInt607 = 0;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
	public static int anInt608 = 0;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static243.anInt4326 <= arg6 && arg1 <= Static235.anInt4193 && arg4 >= Static138.anInt932 && Static40.anInt818 >= arg3) {
			Static150.method2784(arg5, arg2, arg3, arg1, arg4, arg0, arg6);
		} else {
			Static6.method144(arg6, arg4, arg0, arg1, arg2, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBI)V")
	public static void method500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static216.method3597(Static390.aClass11_95);
		Static372.aClass2_Sub16_Sub2_4.method5365(arg1);
		Static372.aClass2_Sub16_Sub2_4.method5355(arg0);
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	public static void method501() {
		for (@Pc(6) Class2_Sub42 local6 = (Class2_Sub42) Static184.aClass30_26.method694(); local6 != null; local6 = (Class2_Sub42) Static184.aClass30_26.method682()) {
			if (Static64.aClass251ArrayArrayArray1 == null) {
				local6.method5617();
			} else {
				@Pc(24) int local24;
				@Pc(122) Class1_Sub5 local122;
				@Pc(79) Class1_Sub3 local79;
				@Pc(161) Class1_Sub2 local161;
				@Pc(34) Class1_Sub1 local34;
				@Pc(92) Class1_Sub3_Sub3 local92;
				@Pc(174) Class1_Sub2_Sub1 local174;
				@Pc(47) Class1_Sub1_Sub3 local47;
				if (Static253.anInt4469 >= local6.anInt6016) {
					local24 = Static181.anIntArray1303[local6.anInt6017];
					if (local24 == 0) {
						local34 = Static368.method4614(local6.anInt6018, local6.anInt6019, local6.anInt6005);
						if (local34 instanceof Class1_Sub1_Sub3) {
							Static368.method4612(local6.anInt6018, local6.anInt6019, local6.anInt6005);
							local47 = (Class1_Sub1_Sub3) local34;
							if (local47.aClass1_Sub1_1 != null) {
								Static267.method4109(local6.anInt6018, local6.anInt6019, local6.anInt6005, local47.aClass1_Sub1_1, null);
							}
						}
					} else if (local24 == 1) {
						local161 = Static95.method5549(local6.anInt6018, local6.anInt6019, local6.anInt6005);
						if (local161 instanceof Class1_Sub2_Sub1) {
							Static382.method5604(local6.anInt6018, local6.anInt6019, local6.anInt6005);
							local174 = (Class1_Sub2_Sub1) local161;
							if (local174.aClass1_Sub2_1 != null) {
								Static140.method2661(local6.anInt6018, local6.anInt6019, local6.anInt6005, local174.aClass1_Sub2_1, null);
							}
						}
					} else if (local24 == 2) {
						local122 = Static292.method4418(local6.anInt6018, local6.anInt6019, local6.anInt6005, dc.class);
						if (local122 instanceof Class1_Sub5_Sub3) {
							Static322.method4783(local6.anInt6018, local6.anInt6019, local6.anInt6005, dc.class);
							@Pc(143) Class1_Sub5_Sub3 local143 = (Class1_Sub5_Sub3) local122;
							if (local143.aClass1_Sub5_2 != null) {
								Static356.method5230(local143.aClass1_Sub5_2, false);
							}
						}
					} else if (local24 == 3) {
						local79 = Static102.method2138(local6.anInt6018, local6.anInt6019, local6.anInt6005);
						if (local79 instanceof Class1_Sub3_Sub3) {
							Static236.method1933(local6.anInt6018, local6.anInt6019, local6.anInt6005);
							local92 = (Class1_Sub3_Sub3) local79;
							if (local92.aClass1_Sub3_1 != null) {
								Static262.method4045(local6.anInt6018, local6.anInt6019, local6.anInt6005, local92.aClass1_Sub3_1);
							}
						}
					}
					local6.method5617();
				} else if (Static253.anInt4469 == local6.anInt6014) {
					local24 = Static181.anIntArray1303[local6.anInt6017];
					if (local24 == 0) {
						local34 = Static368.method4614(local6.anInt6018, local6.anInt6019, local6.anInt6005);
						if (local34 instanceof Class1_Sub1_Sub3) {
							local6.method5617();
						} else if (Static141.method2666(local6.anInt6018, local6.anInt6019, local6.anInt6005) == null) {
							local47 = new Class1_Sub1_Sub3(local6.anInt6017, local6.anInt6008, local6.anInt6007, local6.anInt6023, local6.anInt6021, local34);
							Static267.method4109(local6.anInt6018, local6.anInt6019, local6.anInt6005, local47, null);
						} else {
							local6.method5617();
						}
					} else if (local24 == 1) {
						local161 = Static95.method5549(local6.anInt6018, local6.anInt6019, local6.anInt6005);
						if (local161 instanceof Class1_Sub2_Sub1) {
							local6.method5617();
						} else if (Static197.method3324(local6.anInt6018, local6.anInt6019, local6.anInt6005) == null) {
							local174 = new Class1_Sub2_Sub1(local6.anInt6017, local6.anInt6008, local6.anInt6007, local6.anInt6023, local6.anInt6021, local161);
							Static140.method2661(local6.anInt6018, local6.anInt6019, local6.anInt6005, local174, null);
						} else {
							local6.method5617();
						}
					} else if (local24 == 2) {
						local122 = Static292.method4418(local6.anInt6018, local6.anInt6019, local6.anInt6005, dc.class);
						if (local122 instanceof Class1_Sub5_Sub3) {
							local6.method5617();
						} else {
							Static322.method4783(local6.anInt6018, local6.anInt6019, local6.anInt6005, dc.class);
							@Pc(411) Class172 local411 = Static221.aClass118_6.method2858(local6.anInt6006);
							@Pc(424) int local424;
							@Pc(427) int local427;
							if (local6.anInt6008 == 1 || local6.anInt6008 == 3) {
								local427 = local411.anInt4106;
								local424 = local411.anInt4113;
							} else {
								local424 = local411.anInt4106;
								local427 = local411.anInt4113;
							}
							@Pc(468) Class1_Sub5_Sub3 local468 = new Class1_Sub5_Sub3(local6.anInt6017, local6.anInt6008, local6.anInt6018, local6.anInt6007, local6.anInt6023, local6.anInt6021, local6.anInt6019, local424 + local6.anInt6019 - 1, local6.anInt6005, local6.anInt6005 + local427 - 1, local122);
							Static356.method5230(local468, false);
						}
					} else if (local24 == 3) {
						local79 = Static102.method2138(local6.anInt6018, local6.anInt6019, local6.anInt6005);
						if (local79 instanceof Class1_Sub3_Sub3) {
							local6.method5617();
						} else {
							local92 = new Class1_Sub3_Sub3(local6.anInt6007, local6.anInt6023, local6.anInt6021, local79);
							Static262.method4045(local6.anInt6018, local6.anInt6019, local6.anInt6005, local92);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIZIIB)V")
	public static void method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static64.aClass251ArrayArrayArray1 == null) {
			Static111.aClass63_3.method1951(arg4, arg1, arg0, -16777216, arg3);
		} else if (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 >= 0 && Static246.anInt4374 * 128 > Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 && Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 >= 0 && Static185.anInt3485 * 128 > Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386) {
			Static196.anInt4050++;
			if (Static206.aClass1_Sub5_Sub1_Sub1_1 != null && Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 - (Static206.aClass1_Sub5_Sub1_Sub1_1.method5547() - 1) * 64 >> 7 == Static60.anInt1159 && Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 - (Static206.aClass1_Sub5_Sub1_Sub1_1.method5547() - 1) * 64 >> 7 == Static358.anInt2084) {
				Static358.anInt2084 = -1;
				Static60.anInt1159 = -1;
				Static237.method3838();
			}
			Static261.method4034();
			if (!arg2) {
				Static337.method4968();
			}
			Static90.method1686();
			Static333.method4911(arg4, arg1, arg3, arg0, true);
			@Pc(120) int local120 = Static206.anInt3801;
			@Pc(122) int local122 = Static198.anInt3653;
			@Pc(124) int local124 = Static243.anInt4331;
			@Pc(126) int local126 = Static65.anInt4686;
			@Pc(134) int local134;
			@Pc(167) int local167;
			if (Static79.anInt4624 == 1) {
				local134 = (int) Static1.aFloat80;
				if (local134 < Static50.anInt1038 >> 8) {
					local134 = Static50.anInt1038 >> 8;
				}
				if (Static88.aBooleanArray12[4] && Static365.anIntArray1304[4] + 128 > local134) {
					local134 = Static365.anIntArray1304[4] + 128;
				}
				local167 = Static189.anInt6619 + (int) Static127.aFloat41 & 0x3FFF;
				Static154.method2827((local134 >> 3) * 3 + 600, Static289.anInt5022, local134, local167, Static170.method3006(Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390, Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386, Static382.anInt6523) - 50, local120, anInt601);
			} else if (Static79.anInt4624 == 4) {
				local134 = (int) Static1.aFloat80;
				if (Static50.anInt1038 >> 8 > local134) {
					local134 = Static50.anInt1038 >> 8;
				}
				if (Static88.aBooleanArray12[4] && Static365.anIntArray1304[4] + 128 > local134) {
					local134 = Static365.anIntArray1304[4] + 128;
				}
				local167 = (int) Static127.aFloat41 & 0x3FFF;
				Static154.method2827((local134 >> 3) * 3 + 600, Static289.anInt5022, local134, local167, Static170.method3006(Static290.anInt5046, Static295.anInt5082, Static382.anInt6523) - 50, local120, anInt601);
			} else if (Static79.anInt4624 == 5) {
				Static228.method3717(local120);
			}
			local134 = Static224.anInt4006;
			local167 = Static285.anInt4940;
			@Pc(268) int local268 = Static51.anInt1057;
			@Pc(270) int local270 = Static14.anInt360;
			@Pc(272) int local272 = Static235.anInt4191;
			@Pc(316) int local316;
			for (@Pc(274) int local274 = 0; local274 < 5; local274++) {
				if (Static88.aBooleanArray12[local274]) {
					local316 = (int) ((double) -Static53.anIntArray225[local274] + Math.random() * (double) (Static53.anIntArray225[local274] * 2 + 1) + Math.sin((double) Static100.anIntArray438[local274] / 100.0D * (double) Static47.anIntArray190[local274]) * (double) Static365.anIntArray1304[local274]);
					if (local274 == 4) {
						Static14.anInt360 += local316;
						if (Static14.anInt360 < 1024) {
							Static14.anInt360 = 1024;
						} else if (Static14.anInt360 > 3072) {
							Static14.anInt360 = 3072;
						}
					}
					if (local274 == 0) {
						Static224.anInt4006 += local316;
					}
					if (local274 == 1) {
						Static285.anInt4940 += local316;
					}
					if (local274 == 3) {
						Static235.anInt4191 = Static235.anInt4191 + local316 & 0x3FFF;
					}
					if (local274 == 2) {
						Static51.anInt1057 += local316;
					}
				}
			}
			if (Static224.anInt4006 < 0) {
				Static224.anInt4006 = 0;
			}
			if (Static224.anInt4006 > (Static12.anInt312 << 7) - 1) {
				Static224.anInt4006 = (Static12.anInt312 << 7) - 1;
			}
			if (Static51.anInt1057 < 0) {
				Static51.anInt1057 = 0;
			}
			if ((Static341.anInt5833 << 7) - 1 < Static51.anInt1057) {
				Static51.anInt1057 = (Static341.anInt5833 << 7) - 1;
			}
			Static128.method2527();
			Static359.method5248();
			Static111.aClass63_3.method1958(local126, local122, local124 + local126, local120 + local122);
			Static111.aClass63_3.method2041();
			local316 = Static131.anInt2691;
			if (Static103.aClass33_1 == null) {
				Static111.aClass63_3.method2020(local316);
			} else {
				Static103.aClass33_1.method706(Static14.anInt360, Static111.aClass63_3, local120, local316, local122, Static16.anInt387 << 3, Static235.anInt4191, local126, local124);
			}
			Static271.method4164();
			Static18.aClass44_1.method3528(Static224.anInt4006, Static285.anInt4940, Static51.anInt1057, -Static14.anInt360 & 0x3FFF, -Static235.anInt4191 & 0x3FFF, -Static288.anInt5007 & 0x3FFF);
			Static111.aClass63_3.method1961(Static18.aClass44_1);
			Static111.aClass63_3.method2006(local126 + local124 / 2, local122 - -(local120 / 2), Static350.anInt3740 << 1, Static350.anInt3740 << 1);
			Static287.method4351(Static350.anInt3740 << 1, local126 + local124 / 2, local122 + local120 / 2, Static350.anInt3740 << 1);
			Static351.method5639(Static285.anInt4940, Static224.anInt4006, -Static235.anInt4191 & 0x3FFF, Static51.anInt1057, -Static14.anInt360 & 0x3FFF, -Static288.anInt5007 & 0x3FFF);
			@Pc(542) byte local542 = Static84.method1290() == 2 ? (byte) Static196.anInt4050 : 1;
			Static390.method5659(Static111.aClass63_3, Static253.anInt4469, Static295.anInt5086, Static18.aClass44_1, Static224.anInt4006, Static285.anInt4940, Static51.anInt1057, Static68.aByteArrayArrayArray1, Static9.anIntArray76, Static356.anIntArray1261, Static297.anIntArray1008, Static167.anIntArray1056, Static86.anIntArray361, Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 + 1, local542, Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 >> 7, Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 >> 7, !Static10.aBoolean424);
			Static271.method4164();
			if (Static391.anInt6627 == 30) {
				Static106.method2249(local120, local126, local122, local124);
				Static36.method669(local124, local122, local126, local120);
				Static333.method4909(local124, local122, local126, local120);
				Static210.method3521(local124, local122, local120, local126);
			}
			Static212.method3553();
			Static51.anInt1057 = local268;
			Static285.anInt4940 = local167;
			Static235.anInt4191 = local272;
			Static224.anInt4006 = local134;
			Static14.anInt360 = local270;
			if (Static67.aBoolean96 && Static333.aClass106_2.method2692() == 0) {
				Static67.aBoolean96 = false;
			}
			if (Static67.aBoolean96) {
				Static111.aClass63_3.method1951(local122, local120, local124, -16777216, local126);
				Static108.method4606(Static319.aClass9_3, false, Static55.aClass32_21.method701(Static107.anInt2498));
			}
		} else {
			Static111.aClass63_3.method1951(arg4, arg1, arg0, -16777216, arg3);
		}
	}
}
