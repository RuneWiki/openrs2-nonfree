import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!ei;")
	public static final Class89 aClass89_3 = new Class89("runescape", 0);

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	public static int anInt1960 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!pca;)V")
	private static void method1703(@OriginalArg(1) Class251 arg0) {
		if (arg0.anInt7231 == 5 && arg0.anInt7254 != -1) {
			Static160.method2924(Static319.aClass31_11, arg0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!pca;)Lclient!pca;")
	public static Class251 method1704(@OriginalArg(0) Class251 arg0) {
		@Pc(4) int local4 = method1716(arg0).method3240();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static105.method2180(arg0.anInt7280);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1705() {
		for (@Pc(7) int local7 = 0; local7 < Static58.anInt1550; local7++) {
			Static100.aClass236Array5[local7] = null;
		}
		Static58.anInt1550 = 0;
		@Pc(33) int local33;
		@Pc(37) int local37;
		for (@Pc(29) int local29 = 0; local29 < Static590.anInt10277; local29++) {
			for (local33 = 0; local33 < Static349.anInt6237; local33++) {
				for (local37 = 0; local37 < Static414.anInt7451; local37++) {
					@Pc(47) Class333 local47 = Static189.aClass333ArrayArrayArray1[local29][local37][local33];
					if (local47 != null) {
						if (local47.aShort116 > 0) {
							local47.aShort116 = (short) (local47.aShort116 * -1);
						}
						if (local47.aShort118 > 0) {
							local47.aShort118 = (short) (local47.aShort118 * -1);
						}
					}
				}
			}
		}
		for (local33 = 0; local33 < Static590.anInt10277; local33++) {
			for (local37 = 0; local37 < Static349.anInt6237; local37++) {
				for (@Pc(101) int local101 = 0; local101 < Static414.anInt7451; local101++) {
					@Pc(111) Class333 local111 = Static189.aClass333ArrayArrayArray1[local33][local101][local37];
					if (local111 != null) {
						@Pc(134) boolean local134 = Static189.aClass333ArrayArrayArray1[0][local101][local37] != null && Static189.aClass333ArrayArrayArray1[0][local101][local37].aClass333_1 != null;
						@Pc(142) int local142;
						@Pc(144) int local144;
						@Pc(158) Class333 local158;
						@Pc(166) int local166;
						@Pc(318) int local318;
						@Pc(332) int local332;
						@Pc(339) int local339;
						@Pc(355) int local355;
						@Pc(362) int local362;
						@Pc(366) int local366;
						@Pc(370) int local370;
						@Pc(376) int local376;
						@Pc(415) int local415;
						@Pc(419) int local419;
						if (local111.aShort118 < 0) {
							local142 = local37;
							local144 = local37;
							local158 = Static189.aClass333ArrayArrayArray1[local33][local101][local37 - 1];
							local166 = Static420.aClass127Array6[local33].method7862(local37, local101);
							while (local142 > 0 && local158 != null && local158.aShort118 < 0 && local158.aShort118 == local111.aShort118 && local158.aShort117 == local111.aShort117 && Static420.aClass127Array6[local33].method7862(local142 - 1, local101) == local166 && (local142 - 1 <= 0 || Static420.aClass127Array6[local33].method7862(local142 - 2, local101) == local166)) {
								local142--;
								local158 = Static189.aClass333ArrayArrayArray1[local33][local101][local142 - 1];
							}
							for (local158 = Static189.aClass333ArrayArrayArray1[local33][local101][local37 + 1]; Static414.anInt7451 > local144 && local158 != null && local158.aShort118 < 0 && local111.aShort118 == local158.aShort118 && local158.aShort117 == local111.aShort117 && Static420.aClass127Array6[local33].method7862(local144 + 1, local101) == local166 && (local144 + 1 >= Static414.anInt7451 || Static420.aClass127Array6[local33].method7862(local144 + 2, local101) == local166); local158 = Static189.aClass333ArrayArrayArray1[local33][local101][local144 + 1]) {
								local144++;
							}
							local318 = local33 + 1 - local33;
							local332 = Static420.aClass127Array6[local134 ? local33 + 1 : local33].method7862(local142, local101);
							local339 = local318 * local111.aShort118 + local332;
							local355 = Static420.aClass127Array6[local134 ? local33 + 1 : local33].method7862(local144 + 1, local101);
							local362 = local111.aShort118 * local318 + local355;
							local366 = local101 << Static385.anInt6657;
							local370 = local142 << Static385.anInt6657;
							local376 = Static331.anInt6010 + (local144 << Static385.anInt6657);
							Static100.aClass236Array5[Static58.anInt1550++] = new Class236(1, local33, local366 + local111.aShort117, local366 + local111.aShort117, local111.aShort117 + local366, local366 + local111.aShort117, local332, local355, local362, local339, local370, local376, local376, local370);
							for (local415 = local33; local415 <= local33; local415++) {
								for (local419 = local142; local419 <= local144; local419++) {
									Static189.aClass333ArrayArrayArray1[local415][local101][local419].aShort118 = (short) (Static189.aClass333ArrayArrayArray1[local415][local101][local419].aShort118 * -1);
								}
							}
						}
						if (local111.aShort116 < 0) {
							local142 = local101;
							local144 = local101;
							local158 = Static189.aClass333ArrayArrayArray1[local33][local101 - 1][local37];
							local166 = Static420.aClass127Array6[local33].method7862(local37, local101);
							while (local142 > 0 && local158 != null && local158.aShort116 < 0 && local111.aShort116 == local158.aShort116 && local158.aShort119 == local111.aShort119 && local166 == Static420.aClass127Array6[local33].method7862(local37, local142 - 1) && (local142 - 1 <= 0 || Static420.aClass127Array6[local33].method7862(local37, local142 - 2) == local166)) {
								local142--;
								local158 = Static189.aClass333ArrayArrayArray1[local33][local142 - 1][local37];
							}
							for (local158 = Static189.aClass333ArrayArrayArray1[local33][local101 + 1][local37]; Static349.anInt6237 > local144 && local158 != null && local158.aShort116 < 0 && local158.aShort116 == local111.aShort116 && local111.aShort119 == local158.aShort119 && local166 == Static420.aClass127Array6[local33].method7862(local37, local144 + 1) && (Static349.anInt6237 <= local144 + 1 || local166 == Static420.aClass127Array6[local33].method7862(local37, local144 + 2)); local158 = Static189.aClass333ArrayArrayArray1[local33][local144 + 1][local37]) {
								local144++;
							}
							local318 = local33 + 1 - local33;
							local332 = Static420.aClass127Array6[local134 ? local33 + 1 : local33].method7862(local37, local142);
							local339 = local332 + local318 * local111.aShort116;
							local355 = Static420.aClass127Array6[local134 ? local33 + 1 : local33].method7862(local37, local144 + 1);
							local362 = local111.aShort116 * local318 + local355;
							local366 = local142 << Static385.anInt6657;
							local370 = Static331.anInt6010 + (local144 << Static385.anInt6657);
							local376 = local37 << Static385.anInt6657;
							Static100.aClass236Array5[Static58.anInt1550++] = new Class236(2, local33, local366, local370, local370, local366, local332, local355, local362, local339, local376 + local111.aShort119, local111.aShort119 + local376, local376 + local111.aShort119, local111.aShort119 + local376);
							for (local415 = local33; local415 <= local33; local415++) {
								for (local419 = local142; local419 <= local144; local419++) {
									Static189.aClass333ArrayArrayArray1[local415][local419][local37].aShort116 = (short) (Static189.aClass333ArrayArrayArray1[local415][local419][local37].aShort116 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static467.aBoolean560 = true;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!pca;IIIIIIIII)V")
	public static void method1708(@OriginalArg(0) Class251[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class251 local6 = arg0[local1];
			if (local6 != null && local6.anInt7280 == arg1) {
				@Pc(17) int local17 = local6.anInt7224 + arg6;
				@Pc(22) int local22 = local6.anInt7281 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt7231 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt7285;
					@Pc(45) int local45 = local22 + local6.anInt7215;
					if (local6.anInt7231 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt7231 == 0 || local6.aBoolean514 || method1716(local6).anInt3988 != 0 || local6 == Static45.aClass251_3 || local6.anInt7249 == Static354.anInt6316 || local6.anInt7249 == Static263.anInt5057) {
					if (!method1711(local6)) {
						if (local6 == Static2.aClass251_1 && Static111.method2259(Static2.aClass251_1) != null) {
							Static463.aBoolean557 = true;
							Static529.anInt9246 = local17;
							Static72.anInt1988 = local22;
						}
						if (local6.aBoolean505 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean504 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(156) Class3_Sub36 local156 = (Class3_Sub36) Static206.aClass244_38.method5572(); local156 != null; local156 = (Class3_Sub36) Static206.aClass244_38.method5576()) {
									if (local156.aBoolean452) {
										local156.method8128();
										local156.aClass251_8.aBoolean501 = false;
									}
								}
								if (Static514.anInt8866 == 0) {
									Static2.aClass251_1 = null;
									Static45.aClass251_3 = null;
								}
								Static202.anInt4324 = 0;
								Static418.aBoolean521 = false;
								Static558.aBoolean642 = false;
								if (!Static289.aBoolean370) {
									Static97.method2033();
								}
							}
							@Pc(212) boolean local212;
							if (Static234.aClass54_4.method7306() >= local28 && Static234.aClass54_4.method7315() >= local30 && Static234.aClass54_4.method7306() < local32 && Static234.aClass54_4.method7315() < local34) {
								local212 = true;
							} else {
								local212 = false;
							}
							if (!Static253.aBoolean325 && local212) {
								if (local6.anInt7242 >= 0) {
									Static580.anInt10049 = local6.anInt7242;
								} else if (local6.aBoolean504) {
									Static580.anInt10049 = -1;
								}
							}
							if (!Static289.aBoolean370 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static534.method7317(arg8 - local17, local6, arg9 - local22);
							}
							@Pc(256) boolean local256 = false;
							if (Static234.aClass54_4.method7307() && local212) {
								local256 = true;
							}
							@Pc(266) boolean local266 = false;
							@Pc(271) Class3_Sub27 local271 = (Class3_Sub27) Static114.aClass244_23.method5572();
							if (local271 != null && local271.method5341() == 0 && local271.method5338() >= local28 && local271.method5337() >= local30 && local271.method5338() < local32 && local271.method5337() < local34) {
								local266 = true;
							}
							@Pc(307) int local307;
							@Pc(441) int local441;
							if (local6.aByteArray175 != null && !Static418.method5830()) {
								for (local307 = 0; local307 < local6.aByteArray175.length; local307++) {
									if (Static446.aClass237_1.method5292(local6.aByteArray175[local307])) {
										if (local6.anIntArray410 == null || Static397.anInt6998 >= local6.anIntArray410[local307]) {
											@Pc(339) byte local339 = local6.aByteArray176[local307];
											if (local339 == 0 || ((local339 & 0x8) == 0 || !Static446.aClass237_1.method5292(86) && !Static446.aClass237_1.method5292(82) && !Static446.aClass237_1.method5292(81)) && ((local339 & 0x2) == 0 || Static446.aClass237_1.method5292(86)) && ((local339 & 0x1) == 0 || Static446.aClass237_1.method5292(82)) && ((local339 & 0x4) == 0 || Static446.aClass237_1.method5292(81))) {
												if (local307 < 10) {
													Static53.method1328(-1, local6.anInt7279, "", local307 + 1);
												} else if (local307 == 10) {
													Static213.method3571();
													@Pc(410) Class3_Sub24 local410 = method1716(local6);
													Static196.method3431(local6, local410.method3242(), local410.anInt3989);
													Static421.aString201 = Static169.method3024(local6);
													if (Static421.aString201 == null) {
														Static421.aString201 = "Null";
													}
													Static238.aString114 = local6.aString187 + "<col=ffffff>";
												}
												local441 = local6.anIntArray411[local307];
												if (local6.anIntArray410 == null) {
													local6.anIntArray410 = new int[local6.aByteArray175.length];
												}
												if (local441 == 0) {
													local6.anIntArray410[local307] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray410[local307] = Static397.anInt6998 + local441;
												}
											}
										}
									} else if (local6.anIntArray410 != null) {
										local6.anIntArray410[local307] = 0;
									}
								}
							}
							if (local266) {
								Static474.method6453(local271.method5338() - local17, local6, local271.method5337() - local22);
							}
							if (Static2.aClass251_1 != null && Static2.aClass251_1 != local6 && local212 && method1716(local6).method3245()) {
								Static43.aClass251_2 = local6;
							}
							if (local6 == Static45.aClass251_3) {
								aBoolean157 = true;
								Static527.anInt10289 = local17;
								Static507.anInt8787 = local22;
							}
							if (local6.aBoolean514 || local6.anInt7249 != 0) {
								@Pc(526) Class3_Sub36 local526;
								if (local212 && Static492.anInt8441 != 0 && local6.anObjectArray9 != null) {
									local526 = new Class3_Sub36();
									local526.aBoolean452 = true;
									local526.aClass251_8 = local6;
									local526.anInt6429 = Static492.anInt8441;
									local526.anObjectArray1 = local6.anObjectArray9;
									Static206.aClass244_38.method5570(local526);
								}
								if (Static2.aClass251_1 != null || Static289.aBoolean370 || local6.anInt7249 != Static556.anInt9447 && Static202.anInt4324 > 0) {
									local266 = false;
									local256 = false;
									local212 = false;
								}
								@Pc(681) int local681;
								if (local6.anInt7249 != 0) {
									if (local6.anInt7249 == Static92.anInt2341 || local6.anInt7249 == Static371.anInt6485) {
										Static160.aClass251_4 = local6;
										if (Static177.aClass256_1 != null) {
											Static177.aClass256_1.method5766(Static319.aClass31_11, local6.anInt7215);
										}
										if (local6.anInt7249 == Static92.anInt2341) {
											if (!Static289.aBoolean370 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static112.method2263(Static319.aClass31_11, arg9, arg8);
												for (@Pc(609) Class25_Sub3 local609 = (Class25_Sub3) Static213.aClass269_2.method5974(); local609 != null; local609 = (Class25_Sub3) Static213.aClass269_2.method5979()) {
													if (arg8 >= local609.anInt2297 && arg8 < local609.anInt2295 && arg9 >= local609.anInt2298 && arg9 < local609.anInt2300) {
														Static97.method2033();
														Static331.method4881(local609.aClass25_Sub2_Sub2_Sub5_1);
													}
												}
											}
											Static313.method4669(local22, local6, local17);
											continue;
										}
									}
									@Pc(720) int local720;
									if (local6.anInt7249 == Static354.anInt6316) {
										if (local6.method5693(Static319.aClass31_11) == null || Static298.anInt5561 != 0 && Static298.anInt5561 != 3 || Static289.aBoolean370 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local307 = arg8 - local17;
										local681 = arg9 - local22;
										local441 = local6.anIntArray409[local681];
										if (local307 < local441 || local307 > local441 + local6.anIntArray414[local681]) {
											continue;
										}
										local307 -= local6.anInt7285 / 2;
										local681 -= local6.anInt7215 / 2;
										if (Static188.anInt4080 == 4) {
											local720 = (int) Static209.aFloat229 & 0x3FFF;
										} else {
											local720 = (int) Static209.aFloat229 + Static270.anInt5118 & 0x3FFF;
										}
										@Pc(732) int local732 = Class3_Sub28.anIntArray232[local720];
										@Pc(736) int local736 = Class3_Sub28.anIntArray231[local720];
										if (Static188.anInt4080 != 4) {
											local732 = local732 * (Static350.anInt6241 + 256) >> 8;
											local736 = local736 * (Static350.anInt6241 + 256) >> 8;
										}
										@Pc(765) int local765 = local681 * local732 + local307 * local736 >> 14;
										@Pc(775) int local775 = local681 * local736 - local307 * local732 >> 14;
										@Pc(786) int local786;
										@Pc(794) int local794;
										if (Static188.anInt4080 == 4) {
											local786 = (Static357.anInt6340 >> 9) + (local765 >> 2);
											local794 = (Static372.anInt6492 >> 9) - (local775 >> 2);
										} else {
											@Pc(803) int local803 = (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method6668() - 1) * 256;
											local786 = (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476 - local803 >> 9) + (local765 >> 2);
											local794 = (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482 - local803 >> 9) - (local775 >> 2);
										}
										if (Static253.aBoolean325 && (Static182.anInt3987 & 0x40) != 0) {
											@Pc(836) Class251 local836 = Static137.method2669(Static164.anInt3670, Static149.anInt3464);
											if (local836 == null) {
												Static213.method3571();
											} else {
												Static367.method5215(local794, local6.anInt7254, Static421.aString201, " ->", true, 15, false, 1L, local786, Static455.anInt7961);
											}
											continue;
										}
										if (Static31.aClass89_1 == Static40.aClass89_2) {
											Static367.method5215(local794, -1, Static573.aClass350_31.method7730(Static201.anInt4321), "", true, 3, false, 1L, local786, -1);
										}
										Static367.method5215(local794, -1, Static19.aString10, "", true, 6, false, 1L, local786, Static580.anInt10050);
										continue;
									}
									if (local6.anInt7249 == Static556.anInt9447) {
										Static389.aClass251_13 = local6;
										if (local212) {
											Static418.aBoolean521 = true;
										}
										if (local266) {
											local307 = (int) ((double) (local271.method5338() - local17 - local6.anInt7285 / 2) * 2.0D / (double) Static157.aFloat71);
											local681 = (int) -((double) (local271.method5337() - local22 - local6.anInt7215 / 2) * 2.0D / (double) Static157.aFloat71);
											local441 = Static79.anInt2117 + local307 + Static157.anInt2670;
											local720 = Static461.anInt8061 + local681 + Static157.anInt2671;
											@Pc(950) Class3_Sub7_Sub1 local950 = Static109.method2205();
											if (local950 == null) {
												continue;
											}
											@Pc(955) int[] local955 = new int[3];
											local950.method328(local441, local955, local720);
											if (local955 != null) {
												if (Static446.aClass237_1.method5292(82) && Static212.anInt5852 > 0) {
													Static74.method1792(local955[1], local955[2], local955[0]);
													continue;
												}
												Static558.aBoolean642 = true;
												Static445.anInt7882 = local955[0];
												Static249.anInt8900 = local955[1];
												Static373.anInt6496 = local955[2];
											}
											Static202.anInt4324 = 1;
											Static543.aBoolean629 = false;
											Static495.anInt8599 = Static234.aClass54_4.method7306();
											Static369.anInt6482 = Static234.aClass54_4.method7315();
											continue;
										}
										if (local256 && Static202.anInt4324 > 0) {
											if (Static202.anInt4324 == 1 && (Static495.anInt8599 != Static234.aClass54_4.method7306() || Static369.anInt6482 != Static234.aClass54_4.method7315())) {
												Static205.anInt4365 = Static79.anInt2117;
												Static288.anInt5397 = Static461.anInt8061;
												Static202.anInt4324 = 2;
											}
											if (Static202.anInt4324 == 2) {
												Static543.aBoolean629 = true;
												Static485.method6588(Static205.anInt4365 + (int) ((double) (Static495.anInt8599 - Static234.aClass54_4.method7306()) * 2.0D / (double) Static157.aFloat72));
												Static420.method5842(Static288.anInt5397 - (int) ((double) (Static369.anInt6482 - Static234.aClass54_4.method7315()) * 2.0D / (double) Static157.aFloat72));
											}
											continue;
										}
										if (Static202.anInt4324 > 0 && !Static543.aBoolean629) {
											if ((Static103.anInt2586 == 1 || Static132.method2603()) && Static161.anInt3613 > 2) {
												Static441.method6148(Static369.anInt6482, Static495.anInt8599);
											} else if (Static498.method5886()) {
												Static441.method6148(Static369.anInt6482, Static495.anInt8599);
											}
										}
										Static202.anInt4324 = 0;
										continue;
									}
									if (local6.anInt7249 == Static435.anInt7693) {
										if (local256) {
											Static261.method4018(local6.anInt7285, Static234.aClass54_4.method7306() - local17, local6.anInt7215, Static234.aClass54_4.method7315() - local22);
										}
										continue;
									}
									if (local6.anInt7249 == Static263.anInt5057) {
										Static183.method3258(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean502 && local266) {
									local6.aBoolean502 = true;
									if (local6.anObjectArray28 != null) {
										local526 = new Class3_Sub36();
										local526.aBoolean452 = true;
										local526.aClass251_8 = local6;
										local526.anInt6425 = local271.method5338() - local17;
										local526.anInt6429 = local271.method5337() - local22;
										local526.anObjectArray1 = local6.anObjectArray28;
										Static206.aClass244_38.method5570(local526);
									}
								}
								if (local6.aBoolean502 && local256 && local6.anObjectArray14 != null) {
									local526 = new Class3_Sub36();
									local526.aBoolean452 = true;
									local526.aClass251_8 = local6;
									local526.anInt6425 = Static234.aClass54_4.method7306() - local17;
									local526.anInt6429 = Static234.aClass54_4.method7315() - local22;
									local526.anObjectArray1 = local6.anObjectArray14;
									Static206.aClass244_38.method5570(local526);
								}
								if (local6.aBoolean502 && !local256) {
									local6.aBoolean502 = false;
									if (local6.anObjectArray18 != null) {
										local526 = new Class3_Sub36();
										local526.aBoolean452 = true;
										local526.aClass251_8 = local6;
										local526.anInt6425 = Static234.aClass54_4.method7306() - local17;
										local526.anInt6429 = Static234.aClass54_4.method7315() - local22;
										local526.anObjectArray1 = local6.anObjectArray18;
										Static461.aClass244_58.method5570(local526);
									}
								}
								if (local256 && local6.anObjectArray22 != null) {
									local526 = new Class3_Sub36();
									local526.aBoolean452 = true;
									local526.aClass251_8 = local6;
									local526.anInt6425 = Static234.aClass54_4.method7306() - local17;
									local526.anInt6429 = Static234.aClass54_4.method7315() - local22;
									local526.anObjectArray1 = local6.anObjectArray22;
									Static206.aClass244_38.method5570(local526);
								}
								if (!local6.aBoolean501 && local212) {
									local6.aBoolean501 = true;
									if (local6.anObjectArray6 != null) {
										local526 = new Class3_Sub36();
										local526.aBoolean452 = true;
										local526.aClass251_8 = local6;
										local526.anInt6425 = Static234.aClass54_4.method7306() - local17;
										local526.anInt6429 = Static234.aClass54_4.method7315() - local22;
										local526.anObjectArray1 = local6.anObjectArray6;
										Static206.aClass244_38.method5570(local526);
									}
								}
								if (local6.aBoolean501 && local212 && local6.anObjectArray21 != null) {
									local526 = new Class3_Sub36();
									local526.aBoolean452 = true;
									local526.aClass251_8 = local6;
									local526.anInt6425 = Static234.aClass54_4.method7306() - local17;
									local526.anInt6429 = Static234.aClass54_4.method7315() - local22;
									local526.anObjectArray1 = local6.anObjectArray21;
									Static206.aClass244_38.method5570(local526);
								}
								if (local6.aBoolean501 && !local212) {
									local6.aBoolean501 = false;
									if (local6.anObjectArray32 != null) {
										local526 = new Class3_Sub36();
										local526.aBoolean452 = true;
										local526.aClass251_8 = local6;
										local526.anInt6425 = Static234.aClass54_4.method7306() - local17;
										local526.anInt6429 = Static234.aClass54_4.method7315() - local22;
										local526.anObjectArray1 = local6.anObjectArray32;
										Static461.aClass244_58.method5570(local526);
									}
								}
								if (local6.anObjectArray2 != null) {
									local526 = new Class3_Sub36();
									local526.aClass251_8 = local6;
									local526.anObjectArray1 = local6.anObjectArray2;
									Static106.aClass244_19.method5570(local526);
								}
								@Pc(1494) Class3_Sub36 local1494;
								if (local6.anObjectArray29 != null && Static305.anInt5661 > local6.anInt7236) {
									if (local6.anIntArray406 == null || Static305.anInt5661 - local6.anInt7236 > 32) {
										local526 = new Class3_Sub36();
										local526.aClass251_8 = local6;
										local526.anObjectArray1 = local6.anObjectArray29;
										Static206.aClass244_38.method5570(local526);
									} else {
										label683: for (local307 = local6.anInt7236; local307 < Static305.anInt5661; local307++) {
											local681 = Static53.anIntArray41[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray406.length; local441++) {
												if (local6.anIntArray406[local441] == local681) {
													local1494 = new Class3_Sub36();
													local1494.aClass251_8 = local6;
													local1494.anObjectArray1 = local6.anObjectArray29;
													Static206.aClass244_38.method5570(local1494);
													break label683;
												}
											}
										}
									}
									local6.anInt7236 = Static305.anInt5661;
								}
								if (local6.anObjectArray13 != null && Static45.anInt1213 > local6.anInt7243) {
									if (local6.anIntArray408 == null || Static45.anInt1213 - local6.anInt7243 > 32) {
										local526 = new Class3_Sub36();
										local526.aClass251_8 = local6;
										local526.anObjectArray1 = local6.anObjectArray13;
										Static206.aClass244_38.method5570(local526);
									} else {
										label659: for (local307 = local6.anInt7243; local307 < Static45.anInt1213; local307++) {
											local681 = Static173.anIntArray157[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray408.length; local441++) {
												if (local6.anIntArray408[local441] == local681) {
													local1494 = new Class3_Sub36();
													local1494.aClass251_8 = local6;
													local1494.anObjectArray1 = local6.anObjectArray13;
													Static206.aClass244_38.method5570(local1494);
													break label659;
												}
											}
										}
									}
									local6.anInt7243 = Static45.anInt1213;
								}
								if (local6.anObjectArray16 != null && Static230.anInt4679 > local6.anInt7207) {
									if (local6.anIntArray413 == null || Static230.anInt4679 - local6.anInt7207 > 32) {
										local526 = new Class3_Sub36();
										local526.aClass251_8 = local6;
										local526.anObjectArray1 = local6.anObjectArray16;
										Static206.aClass244_38.method5570(local526);
									} else {
										label635: for (local307 = local6.anInt7207; local307 < Static230.anInt4679; local307++) {
											local681 = Static423.anIntArray429[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray413.length; local441++) {
												if (local6.anIntArray413[local441] == local681) {
													local1494 = new Class3_Sub36();
													local1494.aClass251_8 = local6;
													local1494.anObjectArray1 = local6.anObjectArray16;
													Static206.aClass244_38.method5570(local1494);
													break label635;
												}
											}
										}
									}
									local6.anInt7207 = Static230.anInt4679;
								}
								if (local6.anObjectArray20 != null && Static196.anInt4252 > local6.anInt7263) {
									if (local6.anIntArray405 == null || Static196.anInt4252 - local6.anInt7263 > 32) {
										local526 = new Class3_Sub36();
										local526.aClass251_8 = local6;
										local526.anObjectArray1 = local6.anObjectArray20;
										Static206.aClass244_38.method5570(local526);
									} else {
										label611: for (local307 = local6.anInt7263; local307 < Static196.anInt4252; local307++) {
											local681 = Static276.anIntArray242[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray405.length; local441++) {
												if (local6.anIntArray405[local441] == local681) {
													local1494 = new Class3_Sub36();
													local1494.aClass251_8 = local6;
													local1494.anObjectArray1 = local6.anObjectArray20;
													Static206.aClass244_38.method5570(local1494);
													break label611;
												}
											}
										}
									}
									local6.anInt7263 = Static196.anInt4252;
								}
								if (local6.anObjectArray15 != null && Static575.anInt9957 > local6.anInt7221) {
									if (local6.anIntArray407 == null || Static575.anInt9957 - local6.anInt7221 > 32) {
										local526 = new Class3_Sub36();
										local526.aClass251_8 = local6;
										local526.anObjectArray1 = local6.anObjectArray15;
										Static206.aClass244_38.method5570(local526);
									} else {
										label587: for (local307 = local6.anInt7221; local307 < Static575.anInt9957; local307++) {
											local681 = Static397.anIntArray394[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray407.length; local441++) {
												if (local6.anIntArray407[local441] == local681) {
													local1494 = new Class3_Sub36();
													local1494.aClass251_8 = local6;
													local1494.anObjectArray1 = local6.anObjectArray15;
													Static206.aClass244_38.method5570(local1494);
													break label587;
												}
											}
										}
									}
									local6.anInt7221 = Static575.anInt9957;
								}
								if (Static229.anInt4663 > local6.lb && local6.anObjectArray23 != null) {
									local526 = new Class3_Sub36();
									local526.aClass251_8 = local6;
									local526.anObjectArray1 = local6.anObjectArray23;
									Static206.aClass244_38.method5570(local526);
								}
								if (Static356.anInt6330 > local6.lb && local6.anObjectArray11 != null) {
									local526 = new Class3_Sub36();
									local526.aClass251_8 = local6;
									local526.anObjectArray1 = local6.anObjectArray11;
									Static206.aClass244_38.method5570(local526);
								}
								if (Static573.anInt9839 > local6.lb && local6.anObjectArray19 != null) {
									local526 = new Class3_Sub36();
									local526.aClass251_8 = local6;
									local526.anObjectArray1 = local6.anObjectArray19;
									Static206.aClass244_38.method5570(local526);
								}
								if (Static67.anInt1837 > local6.lb && local6.anObjectArray25 != null) {
									local526 = new Class3_Sub36();
									local526.aClass251_8 = local6;
									local526.anObjectArray1 = local6.anObjectArray25;
									Static206.aClass244_38.method5570(local526);
								}
								if (Static194.anInt4230 > local6.lb && local6.anObjectArray27 != null) {
									local526 = new Class3_Sub36();
									local526.aClass251_8 = local6;
									local526.anObjectArray1 = local6.anObjectArray27;
									Static206.aClass244_38.method5570(local526);
								}
								local6.lb = Static523.anInt9188;
								if (local6.anObjectArray4 != null) {
									for (local307 = 0; local307 < Static294.anInt5507; local307++) {
										@Pc(1962) Class3_Sub36 local1962 = new Class3_Sub36();
										local1962.aClass251_8 = local6;
										local1962.anInt6431 = Static487.anInterface21Array2[local307].method5127();
										local1962.anInt6427 = Static487.anInterface21Array2[local307].method5125();
										local1962.anObjectArray1 = local6.anObjectArray4;
										Static206.aClass244_38.method5570(local1962);
									}
								}
								if (Static169.aBoolean263 && local6.anObjectArray8 != null) {
									local526 = new Class3_Sub36();
									local526.aClass251_8 = local6;
									local526.anObjectArray1 = local6.anObjectArray8;
									Static206.aClass244_38.method5570(local526);
								}
							}
							if (local6.anInt7231 == 5 && local6.anInt7277 != -1) {
								local6.method5697(Static345.aClass103_1, Static240.aClass13_1).method5766(Static319.aClass31_11, local6.anInt7215);
							}
							method1703(local6);
							if (local6.anInt7231 == 0) {
								method1708(arg0, local6.anInt7279, local28, local30, local32, local34, local17 - local6.anInt7274, local22 - local6.anInt7275, arg8, arg9);
								if (local6.aClass251Array3 != null) {
									method1708(local6.aClass251Array3, local6.anInt7279, local28, local30, local32, local34, local17 - local6.anInt7274, local22 - local6.anInt7275, arg8, arg9);
								}
								@Pc(2084) Class3_Sub49 local2084 = (Class3_Sub49) Static204.aClass297_16.method6531((long) local6.anInt7279);
								if (local2084 != null) {
									if (Static31.aClass89_1 == aClass89_3 && local2084.anInt9245 == 0 && !Static289.aBoolean370 && local212 && !Static355.aBoolean446) {
										Static97.method2033();
									}
									Static460.method6318(arg8, local30, local34, local32, local28, local17, local2084.anInt9244, local22, arg9);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					method1703(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1709() {
		for (@Pc(1) int local1 = 0; local1 < Static345.anInt6228; local1++) {
			@Pc(6) int[] local6 = Static212.anIntArrayArray58[local1];
			for (@Pc(8) int local8 = 0; local8 < Static535.anInt9341; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1710() {
		@Pc(1) int local1 = Static31.anInt499;
		@Pc(3) int[] local3 = Static315.anIntArray279;
		@Pc(20) boolean local20 = Static348.aClass3_Sub51_Sub1_5.anInt9943 == 1 && local1 > 200 || Static348.aClass3_Sub51_Sub1_5.anInt9943 == 0 && local1 > 50;
		@Pc(82) int local82;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class25_Sub2_Sub2_Sub5_Sub1 local29 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local3[local22]];
			if (!local29.method5671()) {
				local29.anInt8520 = -1;
			} else if (local29.aBoolean495) {
				local29.anInt8520 = -1;
			} else {
				local29.method6661();
				if (local29.aShort106 >= 0 && local29.aShort107 >= 0 && local29.aShort108 < Static345.anInt6228 && local29.aShort109 < Static535.anInt9341) {
					local29.aBoolean492 = local29.aBoolean579 ? local20 : false;
					if (local29 == Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1) {
						local29.anInt8520 = Integer.MAX_VALUE;
					} else {
						local82 = 0;
						if (!local29.aBoolean578) {
							local82++;
						}
						if (local29.anInt8523 > Static397.anInt6998) {
							local82 += 2;
						}
						local82 += 5 - local29.method6668() << 2;
						if (local29.aBoolean494) {
							local82 += 512;
						} else {
							if (Static378.anInt6559 == 0) {
								local82 += 32;
							} else {
								local82 += 128;
							}
							local82 += 256;
						}
						local29.anInt8520 = local82 + 1;
					}
				} else {
					local29.anInt8520 = -1;
				}
			}
		}
		for (@Pc(123) int local123 = 0; local123 < Static60.anInt1599; local123++) {
			@Pc(134) Class25_Sub2_Sub2_Sub5_Sub2 local134 = ((Class3_Sub39) Static581.aClass297_39.method6531((long) Static529.anIntArray535[local123])).aClass25_Sub2_Sub2_Sub5_Sub2_2;
			if (local134.method6694() && local134.aClass213_1.method4999(Static206.aClass143_3)) {
				local134.method6661();
				if (local134.aShort106 >= 0 && local134.aShort107 >= 0 && local134.aShort108 < Static345.anInt6228 && local134.aShort109 < Static535.anInt9341) {
					@Pc(171) int local171 = 0;
					if (!local134.aBoolean578) {
						local171++;
					}
					if (local134.anInt8523 > Static397.anInt6998) {
						local171 += 2;
					}
					local171 += 5 - local134.method6668() << 2;
					if (Static378.anInt6559 == 0) {
						if (local134.aClass213_1.aBoolean439) {
							local171 += 64;
						} else {
							local171 += 128;
						}
					} else if (Static378.anInt6559 == 1) {
						if (local134.aClass213_1.aBoolean439) {
							local171 += 32;
						} else {
							local171 += 64;
						}
					}
					if (local134.aClass213_1.aBoolean438) {
						local171 += 1024;
					} else if (!local134.aClass213_1.aBoolean441) {
						local171 += 256;
					}
					local134.anInt8520 = local171 + 1;
				} else {
					local134.anInt8520 = -1;
				}
			} else {
				local134.anInt8520 = -1;
			}
		}
		for (local82 = 0; local82 < Static98.aClass167Array1.length; local82++) {
			@Pc(237) Class167 local237 = Static98.aClass167Array1[local82];
			if (local237 != null) {
				if (local237.anInt5096 == 1) {
					@Pc(251) Class3_Sub39 local251 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local237.anInt5098);
					if (local251 != null) {
						@Pc(256) Class25_Sub2_Sub2_Sub5_Sub2 local256 = local251.aClass25_Sub2_Sub2_Sub5_Sub2_2;
						if (local256.anInt8520 >= 0) {
							local256.anInt8520 += 2048;
						}
					}
				} else if (local237.anInt5096 == 10) {
					@Pc(275) Class25_Sub2_Sub2_Sub5_Sub1 local275 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local237.anInt5098];
					if (local275 != null && local275 != Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 && local275.anInt8520 >= 0) {
						local275.anInt8520 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!pca;)Z")
	public static boolean method1711(@OriginalArg(0) Class251 arg0) {
		if (Static355.aBoolean446) {
			if (method1716(arg0).anInt3988 != 0) {
				return false;
			}
			if (arg0.anInt7231 == 0) {
				return false;
			}
		}
		return arg0.aBoolean507;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1712() {
		@Pc(1) int local1 = Static31.anInt499;
		@Pc(3) int[] local3 = Static315.anIntArray279;
		@Pc(11) int local11 = Static28.aBoolean23 ? local1 : local1 + Static60.anInt1599;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class25_Sub2_Sub2_Sub5 local23;
			if (local13 < local1) {
				local23 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub39) Static581.aClass297_39.method6531((long) Static529.anIntArray535[local13 - local1])).aClass25_Sub2_Sub2_Sub5_Sub2_2;
			}
			if (local23.anInt8520 >= 0) {
				@Pc(43) int local43 = local23.method6668();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8476 & 0x1FF) == 0 && (local23.anInt8482 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt8476 & 0x1FF) == 256 && (local23.anInt8482 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt8480 = Static78.method3298(local23.anInt8476, local23.aByte117, local23.anInt8482);
				Static492.method6621(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1713(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static31.anInt499;
		@Pc(3) int[] local3 = Static315.anIntArray279;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static60.anInt1599; local5++) {
			@Pc(15) Class25_Sub2_Sub2_Sub5 local15;
			if (local5 < local1) {
				local15 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class3_Sub39) Static581.aClass297_39.method6531((long) Static529.anIntArray535[local5 - local1])).aClass25_Sub2_Sub2_Sub5_Sub2_2;
			}
			if (local15.aByte117 == arg0 && local15.anInt8520 >= 0) {
				@Pc(39) int local39 = local15.method6668();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8476 & 0x1FF) != 0 || (local15.anInt8482 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt8476 & 0x1FF) != 256 || (local15.anInt8482 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8476 >> 9;
					local80 = local15.anInt8482 >> 9;
					if (local15.anInt8520 > Static212.anIntArrayArray58[local75][local80]) {
						Static212.anIntArrayArray58[local75][local80] = local15.anInt8520;
						Static348.anIntArrayArray32[local75][local80] = 1;
					} else if (local15.anInt8520 == Static212.anIntArrayArray58[local75][local80]) {
						local116 = Static348.anIntArrayArray32[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt8476 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt8482 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt8476 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt8482 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt8520 > Static212.anIntArrayArray58[local158][local161]) {
								Static212.anIntArrayArray58[local158][local161] = local15.anInt8520;
								Static348.anIntArrayArray32[local158][local161] = 1;
							} else if (local15.anInt8520 == Static212.anIntArrayArray58[local158][local161]) {
								local116 = Static348.anIntArrayArray32[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1714(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static31.anInt499;
		@Pc(3) int[] local3 = Static315.anIntArray279;
		@Pc(11) int local11 = Static28.aBoolean23 ? local1 : local1 + Static60.anInt1599;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class25_Sub2_Sub2_Sub5 local23;
			if (local13 < local1) {
				local23 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub39) Static581.aClass297_39.method6531((long) Static529.anIntArray535[local13 - local1])).aClass25_Sub2_Sub2_Sub5_Sub2_2;
			}
			if (local23.aByte117 == arg0) {
				local23.anInt8501 = 0;
				if (local23.anInt8520 < 0) {
					local23.aBoolean578 = false;
				} else {
					@Pc(54) int local54 = local23.method6668();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8476 & 0x1FF) != 0 || (local23.anInt8482 & 0x1FF) != 0) {
							local23.aBoolean578 = false;
							continue;
						}
					} else if ((local23.anInt8476 & 0x1FF) != 256 || (local23.anInt8482 & 0x1FF) != 256) {
						local23.aBoolean578 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8476 >> 9;
						local101 = local23.anInt8482 >> 9;
						if (local23.anInt8520 != Static212.anIntArrayArray58[local96][local101]) {
							local23.aBoolean578 = true;
							continue;
						}
						if (Static348.anIntArrayArray32[local96][local101] > 1) {
							local126 = Static348.anIntArrayArray32[local96][local101]--;
							local23.aBoolean578 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt8476 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt8482 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt8476 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt8482 + local96 >> 9;
						if (!Static95.method1998(local23.anInt8520, local169, local162, local155, local101)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt8520 == Static212.anIntArrayArray58[local180][local183]) {
										local126 = Static348.anIntArrayArray32[local180][local183]--;
									}
								}
							}
							local23.aBoolean578 = true;
							continue;
						}
					}
					local23.aBoolean578 = false;
					local23.anInt8480 = Static78.method3298(local23.anInt8476, local23.aByte117, local23.anInt8482);
					Static492.method6621(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!pca;)Lclient!gv;")
	public static Class3_Sub24 method1716(@OriginalArg(0) Class251 arg0) {
		@Pc(13) Class3_Sub24 local13 = (Class3_Sub24) Static573.aClass297_38.method6531(((long) arg0.anInt7279 << 32) + (long) arg0.anInt7268);
		return local13 == null ? arg0.aClass3_Sub24_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1718() {
		Static125.anInt2869 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static60.anInt1599; local3++) {
			@Pc(14) Class25_Sub2_Sub2_Sub5_Sub2 local14 = ((Class3_Sub39) Static581.aClass297_39.method6531((long) Static529.anIntArray535[local3])).aClass25_Sub2_Sub2_Sub5_Sub2_2;
			if (local14.aBoolean578 && local14.method6674() != -1) {
				@Pc(32) int local32 = (local14.method6668() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt8476 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt8482 - local32 >> 9;
				@Pc(53) Class25_Sub2_Sub2_Sub5 local53 = Static552.method7564(local46, local39, local14.aByte117);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt8529;
					if (local53 instanceof Class25_Sub2_Sub2_Sub5_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt8501 == 0 && local53.method6674() != -1) {
						Static42.anIntArray32[Static125.anInt2869] = local58;
						Static374.anIntArray363[Static125.anInt2869] = local58;
						Static125.anInt2869++;
						local53.anInt8501++;
					}
					Static42.anIntArray32[Static125.anInt2869] = local58;
					Static374.anIntArray363[Static125.anInt2869] = local14.anInt8529 + 2048;
					Static125.anInt2869++;
					local53.anInt8501++;
				}
			}
		}
		Static174.method6965(Static125.anInt2869 - 1, Static374.anIntArray363, 0, Static42.anIntArray32);
	}
}
