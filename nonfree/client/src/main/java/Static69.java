import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	public static int anInt1684;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ep;)Lclient!ep;")
	public static Class93 method1449(@OriginalArg(0) Class93 arg0) {
		@Pc(4) int local4 = method1454(arg0).method7361();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static223.method4011(arg0.anInt2820);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ep;)Z")
	public static boolean method1450(@OriginalArg(0) Class93 arg0) {
		if (Static13.aBoolean37) {
			if (method1454(arg0).anInt8800 != 0) {
				return false;
			}
			if (arg0.anInt2823 == 0) {
				return false;
			}
		}
		return arg0.aBoolean234;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ep;IIIIIIIII)V")
	public static void method1451(@OriginalArg(0) Class93[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class93 local6 = arg0[local1];
			if (local6 != null && local6.anInt2820 == arg1) {
				@Pc(17) int local17 = local6.anInt2753 + arg6;
				@Pc(22) int local22 = local6.anInt2750 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2823 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2777;
					@Pc(45) int local45 = local22 + local6.anInt2738;
					if (local6.anInt2823 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2823 == 0 || local6.aBoolean229 || method1454(local6).anInt8800 != 0 || local6 == Static371.aClass93_12 || local6.anInt2812 == Static218.anInt4634) {
					if (!method1450(local6)) {
						if (local6 == Static122.aClass93_7 && Static165.method3346(Static122.aClass93_7) != null) {
							Static107.aBoolean206 = true;
							Static81.anInt1952 = local17;
							Static407.anInt1180 = local22;
						}
						if (local6.aBoolean226 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean228 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class6_Sub38 local152 = (Class6_Sub38) Static226.aClass211_30.method5183(); local152 != null; local152 = (Class6_Sub38) Static226.aClass211_30.method5177()) {
									if (local152.aBoolean564) {
										local152.method8151();
										local152.aClass93_14.aBoolean233 = false;
									}
								}
								if (Static151.anInt3285 == 0) {
									Static122.aClass93_7 = null;
									Static371.aClass93_12 = null;
								}
								Static119.anInt2418 = 0;
								Static512.aBoolean644 = false;
								Static556.aBoolean705 = false;
								if (!Static218.aBoolean366) {
									Static463.method7155();
								}
							}
							@Pc(208) boolean local208;
							if (Static401.aClass4_1.method1216() >= local28 && Static401.aClass4_1.method1215() >= local30 && Static401.aClass4_1.method1216() < local32 && Static401.aClass4_1.method1215() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static25.aBoolean80 && local208) {
								if (local6.anInt2788 >= 0) {
									Static530.anInt9191 = local6.anInt2788;
								} else if (local6.aBoolean228) {
									Static530.anInt9191 = -1;
								}
							}
							if (!Static218.aBoolean366 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static4.method204(arg9 - local22, local6, arg8 - local17);
							}
							@Pc(252) boolean local252 = false;
							if (Static401.aClass4_1.method1212() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class6_Sub39 local267 = (Class6_Sub39) Static512.aClass211_67.method5183();
							if (local267 != null && local267.method8017() == 0 && local267.method8012() >= local28 && local267.method8018() >= local30 && local267.method8012() < local32 && local267.method8018() < local34) {
								local262 = true;
							}
							@Pc(303) int local303;
							@Pc(437) int local437;
							if (local6.aByteArray44 != null && !Static440.method6724()) {
								for (local303 = 0; local303 < local6.aByteArray44.length; local303++) {
									if (Static387.aClass273_1.method6617(local6.aByteArray44[local303])) {
										if (local6.anIntArray216 == null || Static508.anInt8998 >= local6.anIntArray216[local303]) {
											@Pc(335) byte local335 = local6.aByteArray45[local303];
											if (local335 == 0 || ((local335 & 0x8) == 0 || !Static387.aClass273_1.method6617(86) && !Static387.aClass273_1.method6617(82) && !Static387.aClass273_1.method6617(81)) && ((local335 & 0x2) == 0 || Static387.aClass273_1.method6617(86)) && ((local335 & 0x1) == 0 || Static387.aClass273_1.method6617(82)) && ((local335 & 0x4) == 0 || Static387.aClass273_1.method6617(81))) {
												if (local303 < 10) {
													Static303.method4902(local6.anInt2790, local303 + 1, "", -1);
												} else if (local303 == 10) {
													Static353.method5744();
													@Pc(406) Class6_Sub44 local406 = method1454(local6);
													Static178.method3537(local406.anInt8798, local406.method7359(), local6);
													Static467.aString104 = Static519.method7599(local6);
													if (Static467.aString104 == null) {
														Static467.aString104 = "Null";
													}
													Static568.aString113 = local6.aString31 + "<col=ffffff>";
												}
												local437 = local6.anIntArray219[local303];
												if (local6.anIntArray216 == null) {
													local6.anIntArray216 = new int[local6.aByteArray44.length];
												}
												if (local437 == 0) {
													local6.anIntArray216[local303] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray216[local303] = Static508.anInt8998 + local437;
												}
											}
										}
									} else if (local6.anIntArray216 != null) {
										local6.anIntArray216[local303] = 0;
									}
								}
							}
							if (local262) {
								Static8.method606(local267.method8012() - local17, local267.method8018() - local22, local6);
							}
							if (Static122.aClass93_7 != null && Static122.aClass93_7 != local6 && local208 && method1454(local6).method7363()) {
								Static27.aClass93_1 = local6;
							}
							if (local6 == Static371.aClass93_12) {
								Static545.aBoolean697 = true;
								Static87.anInt2163 = local17;
								Static116.anInt2579 = local22;
							}
							if (local6.aBoolean229 || local6.anInt2812 != 0) {
								@Pc(522) Class6_Sub38 local522;
								if (local208 && Static136.anInt2884 != 0 && local6.anObjectArray33 != null) {
									local522 = new Class6_Sub38();
									local522.aBoolean564 = true;
									local522.aClass93_14 = local6;
									local522.anInt7666 = Static136.anInt2884;
									local522.anObjectArray36 = local6.anObjectArray33;
									Static226.aClass211_30.method5173(local522);
								}
								if (Static122.aClass93_7 != null || Static218.aBoolean366 || local6.anInt2812 != Static29.anInt1014 && Static119.anInt2418 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(677) int local677;
								if (local6.anInt2812 != 0) {
									if (local6.anInt2812 == Static262.anInt5265 || local6.anInt2812 == Static309.anInt5840) {
										Static93.aClass93_6 = local6;
										if (Static74.aClass38_3 != null) {
											Static74.aClass38_3.method1129(local6.anInt2738, Static323.aClass9_8);
										}
										if (local6.anInt2812 == Static262.anInt5265) {
											if (!Static218.aBoolean366 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static37.method1090(Static323.aClass9_8, arg8, arg9);
												for (@Pc(605) Class5_Sub8 local605 = (Class5_Sub8) Static436.aClass267_6.method6544(); local605 != null; local605 = (Class5_Sub8) Static436.aClass267_6.method6543()) {
													if (arg8 >= local605.anInt8717 && arg8 < local605.anInt8716 && arg9 >= local605.anInt8720 && arg9 < local605.anInt8715) {
														Static463.method7155();
														Static476.method7283(local605.aClass11_Sub1_Sub1_1);
													}
												}
											}
											Static178.method3534(local6, local17, local22);
											continue;
										}
									}
									@Pc(716) int local716;
									if (local6.anInt2812 == Static218.anInt4634) {
										if (local6.method2490(Static323.aClass9_8) == null || Static426.anInt7851 != 0 && Static426.anInt7851 != 3 || Static218.aBoolean366 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local303 = arg8 - local17;
										local677 = arg9 - local22;
										local437 = local6.anIntArray212[local677];
										if (local303 < local437 || local303 > local437 + local6.anIntArray210[local677]) {
											continue;
										}
										local303 -= local6.anInt2777 / 2;
										local677 -= local6.anInt2738 / 2;
										if (Static84.anInt1994 == 4) {
											local716 = (int) Static412.aFloat175 & 0x3FFF;
										} else {
											local716 = (int) Static412.aFloat175 + Static47.anInt1291 & 0x3FFF;
										}
										@Pc(728) int local728 = Class179.anIntArray756[local716];
										@Pc(732) int local732 = Class179.anIntArray757[local716];
										if (Static84.anInt1994 != 4) {
											local728 = local728 * (Static146.anInt8629 + 256) >> 8;
											local732 = local732 * (Static146.anInt8629 + 256) >> 8;
										}
										@Pc(761) int local761 = local677 * local728 + local303 * local732 >> 14;
										@Pc(771) int local771 = local677 * local732 - local303 * local728 >> 14;
										@Pc(782) int local782;
										@Pc(790) int local790;
										if (Static84.anInt1994 == 4) {
											local782 = (Static99.anInt2351 >> 9) + (local761 >> 2);
											local790 = (Static131.anInt2843 >> 9) - (local771 >> 2);
										} else {
											@Pc(799) int local799 = (Static350.aClass11_Sub1_Sub1_Sub2_4.method6212() - 1) * 256;
											local782 = (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 - local799 >> 9) + (local761 >> 2);
											local790 = (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 - local799 >> 9) - (local771 >> 2);
										}
										if (Static25.aBoolean80 && (Static429.anInt7864 & 0x40) != 0) {
											@Pc(832) Class93 local832 = Static100.method2145(Static150.anInt7378, Static244.anInt4934);
											if (local832 == null) {
												Static353.method5744();
											} else {
												Static232.method4112(false, local6.anInt2822, " ->", local782, true, local790, 1L, Static467.aString104, 18, Static567.anInt7672);
											}
											continue;
										}
										if (Static38.aClass162_1 == Static303.aClass162_2) {
											Static232.method4112(false, -1, "", local782, true, local790, 1L, Static222.aClass152_72.method4002(Static286.anInt5468), 46, -1);
										}
										Static232.method4112(false, -1, "", local782, true, local790, 1L, Static427.aString115, 9, Static380.anInt7112);
										continue;
									}
									if (local6.anInt2812 == Static29.anInt1014) {
										Static141.aClass93_9 = local6;
										if (local208) {
											Static512.aBoolean644 = true;
										}
										if (local262) {
											local303 = (int) ((double) (local267.method8012() - local17 - local6.anInt2777 / 2) * 2.0D / (double) Static461.aFloat3);
											local677 = (int) -((double) (local267.method8018() - local22 - local6.anInt2738 / 2) * 2.0D / (double) Static461.aFloat3);
											local437 = Static556.anInt9488 + local303 + Static461.anInt57;
											local716 = Static567.anInt7671 + local677 + Static461.anInt58;
											@Pc(946) Class6_Sub4_Sub12 local946 = Static163.method3316();
											if (local946 == null) {
												continue;
											}
											@Pc(951) int[] local951 = new int[3];
											local946.method5813(local951, local716, local437);
											if (local951 != null) {
												if (Static387.aClass273_1.method6617(82) && Static456.anInt8437 > 0) {
													Static480.method7890(local951[0], local951[1], local951[2]);
													continue;
												}
												Static556.aBoolean705 = true;
												Static148.anInt9737 = local951[0];
												Static344.anInt6661 = local951[1];
												Static456.anInt8435 = local951[2];
											}
											Static119.anInt2418 = 1;
											Static68.aBoolean156 = false;
											Static416.anInt7781 = Static401.aClass4_1.method1216();
											Static323.anInt6113 = Static401.aClass4_1.method1215();
											continue;
										}
										if (local252 && Static119.anInt2418 > 0) {
											if (Static119.anInt2418 == 1 && (Static416.anInt7781 != Static401.aClass4_1.method1216() || Static323.anInt6113 != Static401.aClass4_1.method1215())) {
												Static23.anInt904 = Static556.anInt9488;
												Static576.anInt9762 = Static567.anInt7671;
												Static119.anInt2418 = 2;
											}
											if (Static119.anInt2418 == 2) {
												Static68.aBoolean156 = true;
												Static175.method3516(Static23.anInt904 + (int) ((double) (Static416.anInt7781 - Static401.aClass4_1.method1216()) * 2.0D / (double) Static461.aFloat4));
												Static31.method1003(Static576.anInt9762 - (int) ((double) (Static323.anInt6113 - Static401.aClass4_1.method1215()) * 2.0D / (double) Static461.aFloat4));
											}
											continue;
										}
										if (Static119.anInt2418 > 0 && !Static68.aBoolean156) {
											if ((Static37.anInt1211 == 1 || Static11.method625()) && Static205.anInt4369 > 2) {
												Static503.method7506(Static323.anInt6113, Static416.anInt7781);
											} else if (Static234.method4120()) {
												Static503.method7506(Static323.anInt6113, Static416.anInt7781);
											}
										}
										Static119.anInt2418 = 0;
										continue;
									}
									if (local6.anInt2812 == Static556.anInt9484) {
										if (local252) {
											Static82.method1822(Static401.aClass4_1.method1215() - local22, local6.anInt2738, local6.anInt2777, Static401.aClass4_1.method1216() - local17);
										}
										continue;
									}
									if (local6.anInt2812 == Static186.anInt4096) {
										Static7.method509(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean235 && local262) {
									local6.aBoolean235 = true;
									if (local6.anObjectArray15 != null) {
										local522 = new Class6_Sub38();
										local522.aBoolean564 = true;
										local522.aClass93_14 = local6;
										local522.anInt7664 = local267.method8012() - local17;
										local522.anInt7666 = local267.method8018() - local22;
										local522.anObjectArray36 = local6.anObjectArray15;
										Static226.aClass211_30.method5173(local522);
									}
								}
								if (local6.aBoolean235 && local252 && local6.anObjectArray6 != null) {
									local522 = new Class6_Sub38();
									local522.aBoolean564 = true;
									local522.aClass93_14 = local6;
									local522.anInt7664 = Static401.aClass4_1.method1216() - local17;
									local522.anInt7666 = Static401.aClass4_1.method1215() - local22;
									local522.anObjectArray36 = local6.anObjectArray6;
									Static226.aClass211_30.method5173(local522);
								}
								if (local6.aBoolean235 && !local252) {
									local6.aBoolean235 = false;
									if (local6.anObjectArray23 != null) {
										local522 = new Class6_Sub38();
										local522.aBoolean564 = true;
										local522.aClass93_14 = local6;
										local522.anInt7664 = Static401.aClass4_1.method1216() - local17;
										local522.anInt7666 = Static401.aClass4_1.method1215() - local22;
										local522.anObjectArray36 = local6.anObjectArray23;
										Static46.aClass211_15.method5173(local522);
									}
								}
								if (local252 && local6.anObjectArray3 != null) {
									local522 = new Class6_Sub38();
									local522.aBoolean564 = true;
									local522.aClass93_14 = local6;
									local522.anInt7664 = Static401.aClass4_1.method1216() - local17;
									local522.anInt7666 = Static401.aClass4_1.method1215() - local22;
									local522.anObjectArray36 = local6.anObjectArray3;
									Static226.aClass211_30.method5173(local522);
								}
								if (!local6.aBoolean233 && local208) {
									local6.aBoolean233 = true;
									if (local6.anObjectArray17 != null) {
										local522 = new Class6_Sub38();
										local522.aBoolean564 = true;
										local522.aClass93_14 = local6;
										local522.anInt7664 = Static401.aClass4_1.method1216() - local17;
										local522.anInt7666 = Static401.aClass4_1.method1215() - local22;
										local522.anObjectArray36 = local6.anObjectArray17;
										Static226.aClass211_30.method5173(local522);
									}
								}
								if (local6.aBoolean233 && local208 && local6.anObjectArray12 != null) {
									local522 = new Class6_Sub38();
									local522.aBoolean564 = true;
									local522.aClass93_14 = local6;
									local522.anInt7664 = Static401.aClass4_1.method1216() - local17;
									local522.anInt7666 = Static401.aClass4_1.method1215() - local22;
									local522.anObjectArray36 = local6.anObjectArray12;
									Static226.aClass211_30.method5173(local522);
								}
								if (local6.aBoolean233 && !local208) {
									local6.aBoolean233 = false;
									if (local6.anObjectArray8 != null) {
										local522 = new Class6_Sub38();
										local522.aBoolean564 = true;
										local522.aClass93_14 = local6;
										local522.anInt7664 = Static401.aClass4_1.method1216() - local17;
										local522.anInt7666 = Static401.aClass4_1.method1215() - local22;
										local522.anObjectArray36 = local6.anObjectArray8;
										Static46.aClass211_15.method5173(local522);
									}
								}
								if (local6.anObjectArray14 != null) {
									local522 = new Class6_Sub38();
									local522.aClass93_14 = local6;
									local522.anObjectArray36 = local6.anObjectArray14;
									Static272.aClass211_36.method5173(local522);
								}
								@Pc(1490) Class6_Sub38 local1490;
								if (local6.anObjectArray22 != null && Static399.anInt9629 > local6.anInt2791) {
									if (local6.anIntArray211 == null || Static399.anInt9629 - local6.anInt2791 > 32) {
										local522 = new Class6_Sub38();
										local522.aClass93_14 = local6;
										local522.anObjectArray36 = local6.anObjectArray22;
										Static226.aClass211_30.method5173(local522);
									} else {
										label681: for (local303 = local6.anInt2791; local303 < Static399.anInt9629; local303++) {
											local677 = Static512.anIntArray753[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray211.length; local437++) {
												if (local6.anIntArray211[local437] == local677) {
													local1490 = new Class6_Sub38();
													local1490.aClass93_14 = local6;
													local1490.anObjectArray36 = local6.anObjectArray22;
													Static226.aClass211_30.method5173(local1490);
													break label681;
												}
											}
										}
									}
									local6.anInt2791 = Static399.anInt9629;
								}
								if (local6.anObjectArray30 != null && Static238.anInt4881 > local6.anInt2767) {
									if (local6.anIntArray213 == null || Static238.anInt4881 - local6.anInt2767 > 32) {
										local522 = new Class6_Sub38();
										local522.aClass93_14 = local6;
										local522.anObjectArray36 = local6.anObjectArray30;
										Static226.aClass211_30.method5173(local522);
									} else {
										label657: for (local303 = local6.anInt2767; local303 < Static238.anInt4881; local303++) {
											local677 = Static226.anIntArray305[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray213.length; local437++) {
												if (local6.anIntArray213[local437] == local677) {
													local1490 = new Class6_Sub38();
													local1490.aClass93_14 = local6;
													local1490.anObjectArray36 = local6.anObjectArray30;
													Static226.aClass211_30.method5173(local1490);
													break label657;
												}
											}
										}
									}
									local6.anInt2767 = Static238.anInt4881;
								}
								if (local6.anObjectArray25 != null && Static498.anInt8882 > local6.anInt2749) {
									if (local6.anIntArray218 == null || Static498.anInt8882 - local6.anInt2749 > 32) {
										local522 = new Class6_Sub38();
										local522.aClass93_14 = local6;
										local522.anObjectArray36 = local6.anObjectArray25;
										Static226.aClass211_30.method5173(local522);
									} else {
										label633: for (local303 = local6.anInt2749; local303 < Static498.anInt8882; local303++) {
											local677 = Static172.anIntArray261[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray218.length; local437++) {
												if (local6.anIntArray218[local437] == local677) {
													local1490 = new Class6_Sub38();
													local1490.aClass93_14 = local6;
													local1490.anObjectArray36 = local6.anObjectArray25;
													Static226.aClass211_30.method5173(local1490);
													break label633;
												}
											}
										}
									}
									local6.anInt2749 = Static498.anInt8882;
								}
								if (local6.anObjectArray29 != null && Static222.anInt4654 > local6.anInt2762) {
									if (local6.anIntArray214 == null || Static222.anInt4654 - local6.anInt2762 > 32) {
										local522 = new Class6_Sub38();
										local522.aClass93_14 = local6;
										local522.anObjectArray36 = local6.anObjectArray29;
										Static226.aClass211_30.method5173(local522);
									} else {
										label609: for (local303 = local6.anInt2762; local303 < Static222.anInt4654; local303++) {
											local677 = Static105.anIntArray182[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray214.length; local437++) {
												if (local6.anIntArray214[local437] == local677) {
													local1490 = new Class6_Sub38();
													local1490.aClass93_14 = local6;
													local1490.anObjectArray36 = local6.anObjectArray29;
													Static226.aClass211_30.method5173(local1490);
													break label609;
												}
											}
										}
									}
									local6.anInt2762 = Static222.anInt4654;
								}
								if (local6.anObjectArray9 != null && Static321.anInt6070 > local6.anInt2781) {
									if (local6.anIntArray217 == null || Static321.anInt6070 - local6.anInt2781 > 32) {
										local522 = new Class6_Sub38();
										local522.aClass93_14 = local6;
										local522.anObjectArray36 = local6.anObjectArray9;
										Static226.aClass211_30.method5173(local522);
									} else {
										label585: for (local303 = local6.anInt2781; local303 < Static321.anInt6070; local303++) {
											local677 = Static382.anIntArray504[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray217.length; local437++) {
												if (local6.anIntArray217[local437] == local677) {
													local1490 = new Class6_Sub38();
													local1490.aClass93_14 = local6;
													local1490.anObjectArray36 = local6.anObjectArray9;
													Static226.aClass211_30.method5173(local1490);
													break label585;
												}
											}
										}
									}
									local6.anInt2781 = Static321.anInt6070;
								}
								if (Static374.anInt7028 > local6.anInt2784 && local6.anObjectArray13 != null) {
									local522 = new Class6_Sub38();
									local522.aClass93_14 = local6;
									local522.anObjectArray36 = local6.anObjectArray13;
									Static226.aClass211_30.method5173(local522);
								}
								if (Static435.anInt7935 > local6.anInt2784 && local6.anObjectArray7 != null) {
									local522 = new Class6_Sub38();
									local522.aClass93_14 = local6;
									local522.anObjectArray36 = local6.anObjectArray7;
									Static226.aClass211_30.method5173(local522);
								}
								if (Static91.anInt2223 > local6.anInt2784 && local6.anObjectArray16 != null) {
									local522 = new Class6_Sub38();
									local522.aClass93_14 = local6;
									local522.anObjectArray36 = local6.anObjectArray16;
									Static226.aClass211_30.method5173(local522);
								}
								if (Static454.anInt8400 > local6.anInt2784 && local6.anObjectArray19 != null) {
									local522 = new Class6_Sub38();
									local522.aClass93_14 = local6;
									local522.anObjectArray36 = local6.anObjectArray19;
									Static226.aClass211_30.method5173(local522);
								}
								if (Static409.anInt7646 > local6.anInt2784 && local6.anObjectArray28 != null) {
									local522 = new Class6_Sub38();
									local522.aClass93_14 = local6;
									local522.anObjectArray36 = local6.anObjectArray28;
									Static226.aClass211_30.method5173(local522);
								}
								local6.anInt2784 = Static32.anInt1035;
								if (local6.anObjectArray4 != null) {
									for (local303 = 0; local303 < Static244.anInt4935; local303++) {
										@Pc(1958) Class6_Sub38 local1958 = new Class6_Sub38();
										local1958.aClass93_14 = local6;
										local1958.anInt7660 = Static353.anInterface13Array1[local303].method7433();
										local1958.anInt7665 = Static353.anInterface13Array1[local303].method7432();
										local1958.anObjectArray36 = local6.anObjectArray4;
										Static226.aClass211_30.method5173(local1958);
									}
								}
								if (Static197.aBoolean342 && local6.anObjectArray10 != null) {
									local522 = new Class6_Sub38();
									local522.aClass93_14 = local6;
									local522.anObjectArray36 = local6.anObjectArray10;
									Static226.aClass211_30.method5173(local522);
								}
							}
							if (local6.anInt2823 == 5 && local6.anInt2825 != -1) {
								local6.method2488(Static273.aClass115_1, Static61.aClass15_1).method1129(local6.anInt2738, Static323.aClass9_8);
							}
							Static52.method1235(local6);
							if (local6.anInt2823 == 0) {
								method1451(arg0, local6.anInt2790, local28, local30, local32, local34, local17 - local6.anInt2761, local22 - local6.anInt2789, arg8, arg9);
								if (local6.aClass93Array4 != null) {
									method1451(local6.aClass93Array4, local6.anInt2790, local28, local30, local32, local34, local17 - local6.anInt2761, local22 - local6.anInt2789, arg8, arg9);
								}
								@Pc(2080) Class6_Sub48 local2080 = (Class6_Sub48) Static459.aClass305_24.method7447((long) local6.anInt2790);
								if (local2080 != null) {
									if (Static38.aClass162_1 == Static476.aClass162_3 && local2080.anInt9210 == 0 && !Static218.aBoolean366 && local208 && !Static13.aBoolean37) {
										Static463.method7155();
									}
									Static316.method5103(local32, local30, arg8, local2080.anInt9207, arg9, local34, local28, local22, local17);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static52.method1235(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ep;)Lclient!tf;")
	public static Class6_Sub44 method1454(@OriginalArg(0) Class93 arg0) {
		@Pc(13) Class6_Sub44 local13 = (Class6_Sub44) Static122.aClass305_17.method7447(((long) arg0.anInt2790 << 32) + (long) arg0.anInt2806);
		return local13 == null ? arg0.aClass6_Sub44_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1455(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static81.anInt1953;
		@Pc(3) int[] local3 = Static227.anIntArray309;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static208.anInt4409; local5++) {
			@Pc(15) Class11_Sub1_Sub1 local15;
			if (local5 < local1) {
				local15 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class6_Sub33) Static506.aClass305_36.method7447((long) Static70.anIntArray111[local5 - local1])).aClass11_Sub1_Sub1_Sub1_2;
			}
			if (local15.aByte77 == arg0 && local15.anInt7416 >= 0) {
				@Pc(39) int local39 = local15.method6212();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt7347 & 0x1FF) != 0 || (local15.anInt7351 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt7347 & 0x1FF) != 256 || (local15.anInt7351 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt7347 >> 9;
					local80 = local15.anInt7351 >> 9;
					if (local15.anInt7416 > Static238.anIntArrayArray34[local75][local80]) {
						Static238.anIntArrayArray34[local75][local80] = local15.anInt7416;
						Static143.anIntArrayArray20[local75][local80] = 1;
					} else if (local15.anInt7416 == Static238.anIntArrayArray34[local75][local80]) {
						local116 = Static143.anIntArrayArray20[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt7347 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt7351 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt7347 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt7351 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt7416 > Static238.anIntArrayArray34[local158][local161]) {
								Static238.anIntArrayArray34[local158][local161] = local15.anInt7416;
								Static143.anIntArrayArray20[local158][local161] = 1;
							} else if (local15.anInt7416 == Static238.anIntArrayArray34[local158][local161]) {
								local116 = Static143.anIntArrayArray20[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1456(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static81.anInt1953;
		@Pc(3) int[] local3 = Static227.anIntArray309;
		@Pc(11) int local11 = Static274.aBoolean401 ? local1 : local1 + Static208.anInt4409;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class6_Sub33) Static506.aClass305_36.method7447((long) Static70.anIntArray111[local13 - local1])).aClass11_Sub1_Sub1_Sub1_2;
			}
			if (local23.aByte77 == arg0) {
				local23.anInt7424 = 0;
				if (local23.anInt7416 < 0) {
					local23.aBoolean543 = false;
				} else {
					@Pc(54) int local54 = local23.method6212();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt7347 & 0x1FF) != 0 || (local23.anInt7351 & 0x1FF) != 0) {
							local23.aBoolean543 = false;
							continue;
						}
					} else if ((local23.anInt7347 & 0x1FF) != 256 || (local23.anInt7351 & 0x1FF) != 256) {
						local23.aBoolean543 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt7347 >> 9;
						local101 = local23.anInt7351 >> 9;
						if (local23.anInt7416 != Static238.anIntArrayArray34[local96][local101]) {
							local23.aBoolean543 = true;
							continue;
						}
						if (Static143.anIntArrayArray20[local96][local101] > 1) {
							local126 = Static143.anIntArrayArray20[local96][local101]--;
							local23.aBoolean543 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt7347 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt7351 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt7347 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt7351 + local96 >> 9;
						if (!Static256.method4465(local23.anInt7416, local169, local155, local101, local162)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt7416 == Static238.anIntArrayArray34[local180][local183]) {
										local126 = Static143.anIntArrayArray20[local180][local183]--;
									}
								}
							}
							local23.aBoolean543 = true;
							continue;
						}
					}
					if (local23 instanceof Class11_Sub1_Sub1_Sub2 && local23.aClass6_Sub14_3 != null && Static508.anInt8998 >= local23.aClass6_Sub14_3.anInt1911 && Static508.anInt8998 < local23.aClass6_Sub14_3.anInt1910) {
						((Class11_Sub1_Sub1_Sub2) local23).aBoolean549 = false;
					}
					local23.aBoolean543 = false;
					local23.anInt7350 = Static482.method7333(local23.aByte77, local23.anInt7351, local23.anInt7347);
					Static88.method1973(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1457() {
		Static406.anInt9841 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static208.anInt4409; local3++) {
			@Pc(14) Class11_Sub1_Sub1_Sub1 local14 = ((Class6_Sub33) Static506.aClass305_36.method7447((long) Static70.anIntArray111[local3])).aClass11_Sub1_Sub1_Sub1_2;
			if (local14.aBoolean543 && local14.method6205() != -1) {
				@Pc(32) int local32 = (local14.method6212() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt7347 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt7351 - local32 >> 9;
				@Pc(53) Class11_Sub1_Sub1 local53 = Static527.method7660(local46, local14.aByte77, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt7392;
					if (local53 instanceof Class11_Sub1_Sub1_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt7424 == 0 && local53.method6205() != -1) {
						Static148.anIntArray839[Static406.anInt9841] = local58;
						Static527.anIntArray800[Static406.anInt9841] = local58;
						Static406.anInt9841++;
						local53.anInt7424++;
					}
					Static148.anIntArray839[Static406.anInt9841] = local58;
					Static527.anIntArray800[Static406.anInt9841] = local14.anInt7392 + 2048;
					Static406.anInt9841++;
					local53.anInt7424++;
				}
			}
		}
		Static174.method3504(Static148.anIntArray839, 0, Static406.anInt9841 - 1, Static527.anIntArray800);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1460() {
		for (@Pc(1) int local1 = 0; local1 < Static228.anInt4746; local1++) {
			@Pc(6) int[] local6 = Static238.anIntArrayArray34[local1];
			for (@Pc(8) int local8 = 0; local8 < Static44.anInt1275; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1462() {
		@Pc(1) int local1 = Static81.anInt1953;
		@Pc(3) int[] local3 = Static227.anIntArray309;
		@Pc(20) boolean local20 = Static104.aClass6_Sub6_Sub1_4.anInt1156 == 1 && local1 > 200 || Static104.aClass6_Sub6_Sub1_4.anInt1156 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class11_Sub1_Sub1_Sub2 local29 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local3[local22]];
			if (local29.method6233()) {
				local29.method6201();
				if (local29.aShort78 >= 0 && local29.aShort80 >= 0 && local29.aShort79 < Static228.anInt4746 && local29.aShort77 < Static44.anInt1275) {
					local29.aBoolean549 = local29.aBoolean545 ? local20 : false;
					if (local29 == Static350.aClass11_Sub1_Sub1_Sub2_4) {
						local29.anInt7416 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean543) {
							local75++;
						}
						if (local29.anInt7375 > Static508.anInt8998) {
							local75 += 2;
						}
						local75 += 5 - local29.method6212() << 2;
						if (local29.aBoolean548) {
							local75 += 512;
						} else {
							if (Static387.anInt7250 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt7416 = local75 + 1;
					}
				} else {
					local29.anInt7416 = -1;
				}
			} else {
				local29.anInt7416 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static208.anInt4409; local116++) {
			@Pc(127) Class11_Sub1_Sub1_Sub1 local127 = ((Class6_Sub33) Static506.aClass305_36.method7447((long) Static70.anIntArray111[local116])).aClass11_Sub1_Sub1_Sub1_2;
			if (local127.method613() && local127.aClass222_1.method5325(Static435.aClass234_1)) {
				local127.method6201();
				if (local127.aShort78 >= 0 && local127.aShort80 >= 0 && local127.aShort79 < Static228.anInt4746 && local127.aShort77 < Static44.anInt1275) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean543) {
						local164++;
					}
					if (local127.anInt7375 > Static508.anInt8998) {
						local164 += 2;
					}
					local164 += 5 - local127.method6212() << 2;
					if (Static387.anInt7250 == 0) {
						if (local127.aClass222_1.aBoolean465) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static387.anInt7250 == 1) {
						if (local127.aClass222_1.aBoolean465) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass222_1.aBoolean463) {
						local164 += 1024;
					} else if (!local127.aClass222_1.aBoolean461) {
						local164 += 256;
					}
					local127.anInt7416 = local164 + 1;
				} else {
					local127.anInt7416 = -1;
				}
			} else {
				local127.anInt7416 = -1;
			}
		}
		for (local75 = 0; local75 < Static83.aClass332Array2.length; local75++) {
			@Pc(230) Class332 local230 = Static83.aClass332Array2[local75];
			if (local230 != null) {
				if (local230.anInt9341 == 1) {
					@Pc(244) Class6_Sub33 local244 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local230.anInt9334);
					if (local244 != null) {
						@Pc(249) Class11_Sub1_Sub1_Sub1 local249 = local244.aClass11_Sub1_Sub1_Sub1_2;
						if (local249.anInt7416 >= 0) {
							local249.anInt7416 += 2048;
						}
					}
				} else if (local230.anInt9341 == 10) {
					@Pc(268) Class11_Sub1_Sub1_Sub2 local268 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local230.anInt9334];
					if (local268 != null && local268 != Static350.aClass11_Sub1_Sub1_Sub2_4 && local268.anInt7416 >= 0) {
						local268.anInt7416 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1465() {
		@Pc(1) int local1 = Static81.anInt1953;
		@Pc(3) int[] local3 = Static227.anIntArray309;
		@Pc(11) int local11 = Static274.aBoolean401 ? local1 : local1 + Static208.anInt4409;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class6_Sub33) Static506.aClass305_36.method7447((long) Static70.anIntArray111[local13 - local1])).aClass11_Sub1_Sub1_Sub1_2;
			}
			if (local23.anInt7416 >= 0) {
				@Pc(43) int local43 = local23.method6212();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt7347 & 0x1FF) == 0 && (local23.anInt7351 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt7347 & 0x1FF) == 256 && (local23.anInt7351 & 0x1FF) == 256) {
					continue;
				}
				if (local23 instanceof Class11_Sub1_Sub1_Sub2 && local23.aClass6_Sub14_3 != null && Static508.anInt8998 >= local23.aClass6_Sub14_3.anInt1911 && Static508.anInt8998 < local23.aClass6_Sub14_3.anInt1910) {
					((Class11_Sub1_Sub1_Sub2) local23).aBoolean549 = false;
				}
				local23.anInt7350 = Static482.method7333(local23.aByte77, local23.anInt7351, local23.anInt7347);
				Static88.method1973(local23, true);
			}
		}
	}
}
