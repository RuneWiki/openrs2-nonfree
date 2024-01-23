import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
	public static int anInt3030 = 0;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public static int anInt3032 = 0;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!ie;")
	public static Class53 aClass53_21 = new Class53(64);

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array22 = new Class51[100];

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray8 = new byte[50][];

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1062 = Static64.method1101("0(U");

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
	public static int anInt3042 = 0;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!p;IIII)V")
	public static void method2408(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class1_Sub18 local10 = (Class1_Sub18) Static23.aClass105_3.method3120(); local10 != null; local10 = (Class1_Sub18) Static23.aClass105_3.method3109()) {
			if (local10.anInt2498 == arg3 && local10.anInt2487 == arg1 * 128 && arg2 * 128 == local10.anInt2499 && arg0.anInt3296 == local10.aClass82_1.anInt3296) {
				if (local10.aClass1_Sub4_Sub4_2 != null) {
					Static111.aClass1_Sub4_Sub3_2.method2304(local10.aClass1_Sub4_Sub4_2);
					local10.aClass1_Sub4_Sub4_2 = null;
				}
				if (local10.aClass1_Sub4_Sub4_3 != null) {
					Static111.aClass1_Sub4_Sub3_2.method2304(local10.aClass1_Sub4_Sub4_3);
					local10.aClass1_Sub4_Sub4_3 = null;
				}
				local10.method3758();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!me;Lclient!ia;B)Lclient!ia;")
	public static Class51 method2409(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class51 arg1) {
		if (arg1.method1403(Static25.aClass51_199) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(12) int local12 = arg1.method1403(Static118.aClass51_855);
			if (local12 == -1) {
				while (true) {
					local12 = arg1.method1403(Static38.aClass51_262);
					if (local12 == -1) {
						while (true) {
							local12 = arg1.method1403(Static218.aClass51_753);
							if (local12 == -1) {
								while (true) {
									local12 = arg1.method1403(Static116.aClass51_394);
									if (local12 == -1) {
										while (true) {
											local12 = arg1.method1403(Static167.aClass51_1278);
											if (local12 == -1) {
												while (true) {
													local12 = arg1.method1403(Static169.aClass51_1298);
													if (local12 == -1) {
														return arg1;
													}
													@Pc(226) Class51 local226 = Static81.aClass51_607;
													if (Static22.aClass38_2 != null) {
														local226 = Static104.method1770(Static22.aClass38_2.anInt1235);
														try {
															if (Static22.aClass38_2.anObject3 != null) {
																@Pc(242) byte[] local242 = ((String) Static22.aClass38_2.anObject3).getBytes("ISO-8859-1");
																local226 = Static191.method3197(local242.length, 0, local242);
															}
														} catch (@Pc(251) UnsupportedEncodingException local251) {
														}
													}
													arg1 = Static150.method2574(new Class51[] { arg1.method1433(0, local12), local226, arg1.method1394(local12 + 4) });
												}
											}
											arg1 = Static150.method2574(new Class51[] { arg1.method1433(0, local12), Static54.method936(Static37.method652(arg0, 4)), arg1.method1394(local12 + 2) });
										}
									}
									arg1 = Static150.method2574(new Class51[] { arg1.method1433(0, local12), Static54.method936(Static37.method652(arg0, 3)), arg1.method1394(local12 + 2) });
								}
							}
							arg1 = Static150.method2574(new Class51[] { arg1.method1433(0, local12), Static54.method936(Static37.method652(arg0, 2)), arg1.method1394(local12 + 2) });
						}
					}
					arg1 = Static150.method2574(new Class51[] { arg1.method1433(0, local12), Static54.method936(Static37.method652(arg0, 1)), arg1.method1394(local12 + 2) });
				}
			}
			arg1 = Static150.method2574(new Class51[] { arg1.method1433(0, local12), Static54.method936(Static37.method652(arg0, 0)), arg1.method1394(local12 + 2) });
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V")
	public static void method2412() {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(36) int local36;
		if (Static216.anInt4583 == 80) {
			local14 = Static225.aClass1_Sub16_Sub1_4.method3793();
			local22 = (local14 >> 4 & 0x7) + Static212.anInt4511;
			local28 = Static30.anInt2193 + (local14 & 0x7);
			local32 = Static225.aClass1_Sub16_Sub1_4.method3805();
			local36 = Static225.aClass1_Sub16_Sub1_4.method3805();
			local40 = Static225.aClass1_Sub16_Sub1_4.method3805();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				@Pc(58) Class105 local58 = Static111.aClass105ArrayArrayArray1[Static197.anInt2422][local22][local28];
				if (local58 != null) {
					for (@Pc(65) Class1_Sub2_Sub2 local65 = (Class1_Sub2_Sub2) local58.method3120(); local65 != null; local65 = (Class1_Sub2_Sub2) local58.method3109()) {
						@Pc(70) Class5_Sub4 local70 = local65.aClass5_Sub4_1;
						if (local70.anInt2768 == (local32 & 0x7FFF) && local36 == local70.anInt2772) {
							local70.anInt2772 = local40;
							break;
						}
					}
					Static211.method3499(local28, local22);
				}
			}
			return;
		}
		@Pc(141) int local141;
		@Pc(170) int local170;
		@Pc(151) int local151;
		if (Static216.anInt4583 == 29) {
			local14 = Static225.aClass1_Sub16_Sub1_4.method3793();
			local28 = (local14 & 0x7) + Static30.anInt2193;
			local22 = (local14 >> 4 & 0x7) + Static212.anInt4511;
			local32 = Static225.aClass1_Sub16_Sub1_4.method3805();
			if (local32 == 65535) {
				local32 = -1;
			}
			local36 = Static225.aClass1_Sub16_Sub1_4.method3793();
			local141 = local36 & 0x7;
			local40 = local36 >> 4 & 0xF;
			local151 = Static225.aClass1_Sub16_Sub1_4.method3793();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				local170 = local40 + 1;
				if (local22 - local170 <= Static73.aClass5_Sub1_Sub1_1.anIntArray238[0] && local22 + local170 >= Static73.aClass5_Sub1_Sub1_1.anIntArray238[0] && local28 - local170 <= Static73.aClass5_Sub1_Sub1_1.anIntArray233[0] && Static73.aClass5_Sub1_Sub1_1.anIntArray233[0] <= local170 + local28 && Static123.anInt2717 != 0 && local141 > 0 && Static161.anInt3459 < 50 && local32 != -1) {
					Static225.anIntArray375[Static161.anInt3459] = local32;
					Static66.anIntArray99[Static161.anInt3459] = local141;
					Static123.anIntArray162[Static161.anInt3459] = local151;
					Static141.aClass91Array2[Static161.anInt3459] = null;
					Static129.anIntArray189[Static161.anInt3459] = local40 + (local28 << 8) + (local22 << 16);
					Static161.anInt3459++;
				}
			}
		} else if (Static216.anInt4583 == 224) {
			local14 = Static225.aClass1_Sub16_Sub1_4.method3763();
			local22 = (local14 >> 4 & 0x7) + Static212.anInt4511;
			local28 = (local14 & 0x7) + Static30.anInt2193;
			local32 = Static225.aClass1_Sub16_Sub1_4.method3783();
			local36 = Static225.aClass1_Sub16_Sub1_4.method3787();
			local40 = local36 >> 2;
			local141 = local36 & 0x3;
			local151 = Static126.anIntArray173[local40];
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				Static132.method2335(local40, local22, -1, local28, Static197.anInt2422, local151, 0, local32, local141);
			}
		} else if (Static216.anInt4583 == 66) {
			local14 = Static225.aClass1_Sub16_Sub1_4.method3793();
			local22 = local14 >> 2;
			local32 = Static126.anIntArray173[local22];
			local28 = local14 & 0x3;
			local36 = Static225.aClass1_Sub16_Sub1_4.method3763();
			local40 = (local36 >> 4 & 0x7) + Static212.anInt4511;
			local141 = Static30.anInt2193 + (local36 & 0x7);
			if (local40 >= 0 && local141 >= 0 && local40 < 104 && local141 < 104) {
				Static132.method2335(local22, local40, -1, local141, Static197.anInt2422, local32, 0, -1, local28);
			}
		} else if (Static216.anInt4583 == 36) {
			local14 = Static225.aClass1_Sub16_Sub1_4.method3793();
			local28 = Static30.anInt2193 + (local14 & 0x7);
			local22 = Static212.anInt4511 + (local14 >> 4 & 0x7);
			local32 = Static225.aClass1_Sub16_Sub1_4.method3805();
			local36 = Static225.aClass1_Sub16_Sub1_4.method3793();
			local40 = Static225.aClass1_Sub16_Sub1_4.method3805();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				local22 = local22 * 128 + 64;
				local28 = local28 * 128 + 64;
				@Pc(478) Class5_Sub3 local478 = new Class5_Sub3(local32, Static197.anInt2422, local22, local28, Static26.method2454(Static197.anInt2422, local28, local22) - local36, local40, Static109.anInt2430);
				Static205.aClass105_21.method3119(new Class1_Sub2_Sub16(local478));
			}
		} else {
			@Pc(549) int local549;
			@Pc(553) int local553;
			@Pc(557) int local557;
			@Pc(561) int local561;
			@Pc(637) Class5_Sub7 local637;
			if (Static216.anInt4583 == 254) {
				local14 = Static225.aClass1_Sub16_Sub1_4.method3793();
				local28 = (local14 & 0xF) + Static30.anInt2193 * 2;
				local22 = Static212.anInt4511 * 2 + (local14 >> 4 & 0xF);
				local32 = Static225.aClass1_Sub16_Sub1_4.method3802() + local22;
				local36 = local28 + Static225.aClass1_Sub16_Sub1_4.method3802();
				local40 = Static225.aClass1_Sub16_Sub1_4.method3817();
				local141 = Static225.aClass1_Sub16_Sub1_4.method3805();
				local151 = Static225.aClass1_Sub16_Sub1_4.method3793() * 4;
				local170 = Static225.aClass1_Sub16_Sub1_4.method3793() * 4;
				local549 = Static225.aClass1_Sub16_Sub1_4.method3805();
				local553 = Static225.aClass1_Sub16_Sub1_4.method3805();
				local557 = Static225.aClass1_Sub16_Sub1_4.method3793();
				local561 = Static225.aClass1_Sub16_Sub1_4.method3793();
				if (local22 >= 0 && local28 >= 0 && local22 < 208 && local28 < 208 && local32 >= 0 && local36 >= 0 && local32 < 208 && local36 < 208 && local141 != 65535) {
					local28 = local28 * 64;
					local32 = local32 * 64;
					local36 *= 64;
					local22 = local22 * 64;
					local637 = new Class5_Sub7(local141, Static197.anInt2422, local22, local28, Static26.method2454(Static197.anInt2422, local28, local22) - local151, local549 - -Static109.anInt2430, local553 + Static109.anInt2430, local557, local561, local40, local170);
					local637.method3685(Static26.method2454(Static197.anInt2422, local36, local32) - local170, local549 + Static109.anInt2430, local32, local36);
					Static64.aClass105_7.method3119(new Class1_Sub2_Sub9(local637));
				}
			} else if (Static216.anInt4583 == 21) {
				local14 = Static225.aClass1_Sub16_Sub1_4.method3763();
				local22 = (local14 >> 4 & 0x7) + Static212.anInt4511;
				local28 = Static30.anInt2193 + (local14 & 0x7);
				local32 = Static225.aClass1_Sub16_Sub1_4.method3793();
				local36 = local32 >> 2;
				local141 = Static126.anIntArray173[local36];
				local40 = local32 & 0x3;
				local151 = Static225.aClass1_Sub16_Sub1_4.method3783();
				if (local151 == 65535) {
					local151 = -1;
				}
				Static191.method3196(local40, local141, local36, local151, local22, Static197.anInt2422, local28);
			} else if (Static216.anInt4583 == 55) {
				local14 = Static225.aClass1_Sub16_Sub1_4.method3783();
				local22 = Static225.aClass1_Sub16_Sub1_4.method3793();
				local28 = Static212.anInt4511 + (local22 >> 4 & 0x7);
				local32 = (local22 & 0x7) + Static30.anInt2193;
				if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104) {
					@Pc(773) Class105 local773 = Static111.aClass105ArrayArrayArray1[Static197.anInt2422][local28][local32];
					if (local773 != null) {
						for (@Pc(780) Class1_Sub2_Sub2 local780 = (Class1_Sub2_Sub2) local773.method3120(); local780 != null; local780 = (Class1_Sub2_Sub2) local773.method3109()) {
							if (local780.aClass5_Sub4_1.anInt2768 == (local14 & 0x7FFF)) {
								local780.method3758();
								break;
							}
						}
						if (local773.method3120() == null) {
							Static111.aClass105ArrayArrayArray1[Static197.anInt2422][local28][local32] = null;
						}
						Static211.method3499(local32, local28);
					}
				}
			} else if (Static216.anInt4583 == 34) {
				local14 = Static225.aClass1_Sub16_Sub1_4.method3794();
				local22 = Static225.aClass1_Sub16_Sub1_4.method3794();
				local28 = Static225.aClass1_Sub16_Sub1_4.method3787();
				local36 = (local28 & 0x7) + Static30.anInt2193;
				local32 = Static212.anInt4511 + (local28 >> 4 & 0x7);
				if (local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104) {
					@Pc(864) Class5_Sub4 local864 = new Class5_Sub4();
					local864.anInt2772 = local22;
					local864.anInt2768 = local14;
					if (Static111.aClass105ArrayArrayArray1[Static197.anInt2422][local32][local36] == null) {
						Static111.aClass105ArrayArrayArray1[Static197.anInt2422][local32][local36] = new Class105();
					}
					Static111.aClass105ArrayArrayArray1[Static197.anInt2422][local32][local36].method3119(new Class1_Sub2_Sub2(local864));
					Static211.method3499(local36, local32);
				}
			} else if (Static216.anInt4583 == 170) {
				local14 = Static225.aClass1_Sub16_Sub1_4.method3771();
				local28 = (local14 & 0x7) + Static30.anInt2193;
				local22 = (local14 >> 4 & 0x7) + Static212.anInt4511;
				local32 = Static225.aClass1_Sub16_Sub1_4.method3809();
				local36 = Static225.aClass1_Sub16_Sub1_4.method3809();
				local40 = Static225.aClass1_Sub16_Sub1_4.method3783();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && Static228.anInt4794 != local32) {
					@Pc(963) Class5_Sub4 local963 = new Class5_Sub4();
					local963.anInt2772 = local40;
					local963.anInt2768 = local36;
					if (Static111.aClass105ArrayArrayArray1[Static197.anInt2422][local22][local28] == null) {
						Static111.aClass105ArrayArrayArray1[Static197.anInt2422][local22][local28] = new Class105();
					}
					Static111.aClass105ArrayArrayArray1[Static197.anInt2422][local22][local28].method3119(new Class1_Sub2_Sub2(local963));
					Static211.method3499(local28, local22);
				}
			} else {
				if (Static216.anInt4583 == 203) {
					local14 = Static225.aClass1_Sub16_Sub1_4.method3771();
					local22 = local14 >> 2;
					local28 = local14 & 0x3;
					local32 = Static126.anIntArray173[local22];
					@Pc(1032) byte local1032 = Static225.aClass1_Sub16_Sub1_4.method3800();
					local40 = Static225.aClass1_Sub16_Sub1_4.method3783();
					local141 = Static225.aClass1_Sub16_Sub1_4.method3809();
					@Pc(1044) byte local1044 = Static225.aClass1_Sub16_Sub1_4.method3777();
					local170 = Static225.aClass1_Sub16_Sub1_4.method3787();
					local553 = Static30.anInt2193 + (local170 & 0x7);
					local549 = Static212.anInt4511 + (local170 >> 4 & 0x7);
					local557 = Static225.aClass1_Sub16_Sub1_4.method3805();
					@Pc(1071) byte local1071 = Static225.aClass1_Sub16_Sub1_4.method3777();
					@Pc(1075) byte local1075 = Static225.aClass1_Sub16_Sub1_4.method3802();
					@Pc(1079) int local1079 = Static225.aClass1_Sub16_Sub1_4.method3805();
					@Pc(1086) Class5_Sub1_Sub1 local1086;
					if (local1079 == Static228.anInt4794) {
						local1086 = Static73.aClass5_Sub1_Sub1_1;
					} else {
						local1086 = Static191.aClass5_Sub1_Sub1Array1[local1079];
					}
					if (local1086 != null) {
						@Pc(1096) Class82 local1096 = Static9.method132(local40);
						@Pc(1110) int local1110;
						@Pc(1107) int local1107;
						if (local28 == 1 || local28 == 3) {
							local1110 = local1096.anInt3279;
							local1107 = local1096.anInt3258;
						} else {
							local1107 = local1096.anInt3279;
							local1110 = local1096.anInt3258;
						}
						@Pc(1124) int local1124 = local549 + (local1110 >> 1);
						@Pc(1132) int local1132 = (local1110 + 1 >> 1) + local549;
						@Pc(1138) int local1138 = (local1107 >> 1) + local553;
						@Pc(1142) int[][] local1142 = Static20.anIntArrayArrayArray2[Static197.anInt2422];
						@Pc(1144) int[][] local1144 = null;
						@Pc(1152) int local1152 = (local1107 + 1 >> 1) + local553;
						@Pc(1161) int local1161 = (local553 << 7) + (local1107 << 6);
						@Pc(1170) int local1170 = (local549 << 7) + (local1110 << 6);
						if (Static197.anInt2422 < 3) {
							local1144 = Static20.anIntArrayArrayArray2[Static197.anInt2422 + 1];
						}
						@Pc(1207) int local1207 = local1142[local1132][local1152] + local1142[local1132][local1138] + local1142[local1124][local1138] + local1142[local1124][local1152] >> 2;
						@Pc(1222) Class120 local1222 = local1096.method2577(false, null, local22, local1096.aBoolean145, local1170, local28, local1142, local1207, local1161, local1144);
						if (local1222 != null) {
							Static132.method2335(0, local549, local141 + 1, local553, Static197.anInt2422, local32, local557 + 1, -1, 0);
							local1086.anInt1943 = local1207;
							local1086.anInt1952 = local141 + Static109.anInt2430;
							local1086.anInt1954 = local557 + Static109.anInt2430;
							local1086.anInt1942 = local549 * 128 + local1110 * 64;
							local1086.anInt1957 = local553 * 128 + local1107 * 64;
							local1086.aClass5_Sub2_1 = (Class5_Sub2) local1222.aClass5_10;
							@Pc(1288) byte local1288;
							if (local1071 < local1032) {
								local1288 = local1032;
								local1032 = local1071;
								local1071 = local1288;
							}
							if (local1075 > local1044) {
								local1288 = local1075;
								local1075 = local1044;
								local1044 = local1288;
							}
							local1086.anInt1938 = local549 + local1071;
							local1086.anInt1959 = local1032 + local549;
							local1086.anInt1937 = local553 + local1075;
							local1086.anInt1953 = local1044 + local553;
						}
					}
				}
				if (Static216.anInt4583 == 168) {
					local14 = Static225.aClass1_Sub16_Sub1_4.method3793();
					local28 = Static30.anInt2193 + (local14 & 0x7);
					local22 = Static212.anInt4511 + (local14 >> 4 & 0x7);
					local32 = local22 + Static225.aClass1_Sub16_Sub1_4.method3802();
					local36 = Static225.aClass1_Sub16_Sub1_4.method3802() + local28;
					local40 = Static225.aClass1_Sub16_Sub1_4.method3817();
					local141 = Static225.aClass1_Sub16_Sub1_4.method3805();
					local151 = Static225.aClass1_Sub16_Sub1_4.method3793() * 4;
					local170 = Static225.aClass1_Sub16_Sub1_4.method3793() * 4;
					local549 = Static225.aClass1_Sub16_Sub1_4.method3805();
					local553 = Static225.aClass1_Sub16_Sub1_4.method3805();
					local557 = Static225.aClass1_Sub16_Sub1_4.method3793();
					local561 = Static225.aClass1_Sub16_Sub1_4.method3793();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104 && local141 != 65535) {
						local28 = local28 * 128 + 64;
						local22 = local22 * 128 + 64;
						local36 = local36 * 128 + 64;
						local32 = local32 * 128 + 64;
						local637 = new Class5_Sub7(local141, Static197.anInt2422, local22, local28, Static26.method2454(Static197.anInt2422, local28, local22) - local151, Static109.anInt2430 + local549, local553 + Static109.anInt2430, local557, local561, local40, local170);
						local637.method3685(Static26.method2454(Static197.anInt2422, local36, local32) - local170, local549 - -Static109.anInt2430, local32, local36);
						Static64.aClass105_7.method3119(new Class1_Sub2_Sub9(local637));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method2413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = 0;
		@Pc(14) int local14 = arg6 - arg2;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = arg6 * arg6;
		@Pc(24) int local24 = arg1 * arg1;
		@Pc(29) int local29 = arg1 - arg2;
		@Pc(33) int local33 = local14 * local14;
		@Pc(37) int local37 = local29 * local29;
		@Pc(41) int local41 = local24 << 1;
		@Pc(50) int local50 = local20 << 1;
		@Pc(54) int local54 = local37 << 1;
		@Pc(58) int local58 = local33 << 1;
		@Pc(62) int local62 = local29 << 1;
		@Pc(66) int local66 = arg1 << 1;
		@Pc(75) int local75 = (1 - local66) * local20 + local41;
		@Pc(84) int local84 = local54 + local33 * (1 - local62);
		@Pc(93) int local93 = local24 - (local66 - 1) * local50;
		@Pc(97) int local97 = local20 << 2;
		@Pc(105) int local105 = local37 - (local62 - 1) * local58;
		@Pc(109) int local109 = local24 << 2;
		@Pc(113) int local113 = local33 << 2;
		@Pc(117) int local117 = local37 << 2;
		@Pc(123) int local123 = local58 * (local62 - 3);
		@Pc(127) int local127 = local54 * 3;
		@Pc(131) int local131 = local41 * 3;
		@Pc(133) int local133 = local109;
		@Pc(139) int local139 = (arg1 - 1) * local97;
		@Pc(145) int local145 = local50 * (local66 - 3);
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = (local29 - 1) * local113;
		@Pc(176) int local176;
		@Pc(184) int local184;
		@Pc(193) int local193;
		@Pc(201) int local201;
		if (arg5 >= Static225.anInt4729 && arg5 <= Static122.anInt2710) {
			@Pc(167) int[] local167 = Static113.anIntArrayArray10[arg5];
			local176 = Static28.method525(Static149.anInt3252, arg0 - arg6, Static160.anInt3454);
			local184 = Static28.method525(Static149.anInt3252, arg6 + arg0, Static160.anInt3454);
			local193 = Static28.method525(Static149.anInt3252, arg0 - local14, Static160.anInt3454);
			local201 = Static28.method525(Static149.anInt3252, local14 + arg0, Static160.anInt3454);
			Static71.method1261(local167, local176, arg3, local193);
			Static71.method1261(local167, local193, arg4, local201);
			Static71.method1261(local167, local201, arg3, local184);
		}
		while (local7 > 0) {
			@Pc(228) boolean local228 = local7 <= local29;
			if (local228) {
				if (local84 < 0) {
					while (local84 < 0) {
						local16++;
						local105 += local147;
						local84 += local127;
						local147 += local117;
						local127 += local117;
					}
				}
				if (local105 < 0) {
					local84 += local127;
					local105 += local147;
					local16++;
					local147 += local117;
					local127 += local117;
				}
				local105 += -local123;
				local84 += -local153;
				local123 -= local113;
				local153 -= local113;
			}
			local7--;
			local176 = arg5 - local7;
			if (local75 < 0) {
				while (local75 < 0) {
					local93 += local133;
					local133 += local109;
					local75 += local131;
					local9++;
					local131 += local109;
				}
			}
			if (local93 < 0) {
				local93 += local133;
				local133 += local109;
				local9++;
				local75 += local131;
				local131 += local109;
			}
			local93 += -local145;
			local75 += -local139;
			local139 -= local97;
			local145 -= local97;
			local184 = arg5 + local7;
			if (Static225.anInt4729 <= local184 && Static122.anInt2710 >= local176) {
				local193 = Static28.method525(Static149.anInt3252, arg0 + local9, Static160.anInt3454);
				local201 = Static28.method525(Static149.anInt3252, arg0 - local9, Static160.anInt3454);
				if (local228) {
					@Pc(411) int local411 = Static28.method525(Static149.anInt3252, local16 + arg0, Static160.anInt3454);
					@Pc(420) int local420 = Static28.method525(Static149.anInt3252, arg0 - local16, Static160.anInt3454);
					@Pc(431) int[] local431;
					if (Static225.anInt4729 <= local176) {
						local431 = Static113.anIntArrayArray10[local176];
						Static71.method1261(local431, local201, arg3, local420);
						Static71.method1261(local431, local420, arg4, local411);
						Static71.method1261(local431, local411, arg3, local193);
					}
					if (local184 <= Static122.anInt2710) {
						local431 = Static113.anIntArrayArray10[local184];
						Static71.method1261(local431, local201, arg3, local420);
						Static71.method1261(local431, local420, arg4, local411);
						Static71.method1261(local431, local411, arg3, local193);
					}
				} else {
					if (local176 >= Static225.anInt4729) {
						Static71.method1261(Static113.anIntArrayArray10[local176], local201, arg3, local193);
					}
					if (Static122.anInt2710 >= local184) {
						Static71.method1261(Static113.anIntArrayArray10[local184], local201, arg3, local193);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public static void method2414() {
		for (@Pc(1) int local1 = 0; local1 < Static174.anInt3861; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static58.anInt1373; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static172.anInt3854; local7++) {
					@Pc(16) Class1_Sub7 local16 = Static22.aClass1_Sub7ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class62 local21 = local16.aClass62_1;
						if (local21 != null && local21.aClass5_2.method3681()) {
							Static116.method967(local21.aClass5_2, local1, local4, local7, 1, 1);
							if (local21.aClass5_1 != null && local21.aClass5_1.method3681()) {
								Static116.method967(local21.aClass5_1, local1, local4, local7, 1, 1);
								local21.aClass5_2.method3678(local21.aClass5_1, 0, 0, 0, false);
								local21.aClass5_1 = local21.aClass5_1.method3682();
							}
							local21.aClass5_2 = local21.aClass5_2.method3682();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt1124; local77++) {
							@Pc(83) Class83 local83 = local16.aClass83Array3[local77];
							if (local83 != null && local83.aClass5_5.method3681()) {
								Static116.method967(local83.aClass5_5, local1, local4, local7, local83.anInt3342 + 1 - local83.anInt3340, local83.anInt3346 - local83.anInt3336 + 1);
								local83.aClass5_5 = local83.aClass5_5.method3682();
							}
						}
						@Pc(125) Class119 local125 = local16.aClass119_1;
						if (local125 != null && local125.aClass5_9.method3681()) {
							Static20.method443(local125.aClass5_9, local1, local4, local7);
							local125.aClass5_9 = local125.aClass5_9.method3682();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)I")
	public static int method2416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(21) int local21 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local21;
		}
		return arg1;
	}
}
