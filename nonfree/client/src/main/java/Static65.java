import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	public static int anInt1116;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_21 = new Class160(35, 4);

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_27 = new Class40(96, 12);

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_28 = new Class40(54, 6);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method853() {
		for (@Pc(1) int local1 = 0; local1 < Static402.anInt7079; local1++) {
			@Pc(6) Class29_Sub2 local6 = Static187.aClass29_Sub2Array3[local1];
			Static322.method4983(local6);
			Static187.aClass29_Sub2Array3[local1] = null;
		}
		Static402.anInt7079 = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!fca;IIIIIIIII)V")
	public static void method855(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class97 local6 = arg0[local1];
			if (local6 != null && local6.anInt2325 == arg1) {
				@Pc(17) int local17 = local6.anInt2265 + arg6;
				@Pc(22) int local22 = local6.anInt2331 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2264 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2340;
					@Pc(45) int local45 = local22 + local6.anInt2305;
					if (local6.anInt2264 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2264 == 0 || local6.aBoolean159 || method862(local6).anInt7805 != 0 || local6 == Static340.aClass97_9 || local6.anInt2324 == Static505.anInt8414) {
					if (!method860(local6)) {
						if (local6 == Static382.aClass97_10 && Static96.method1494(Static382.aClass97_10) != null) {
							Static143.aBoolean537 = true;
							Static450.anInt7765 = local17;
							Static381.anInt6580 = local22;
						}
						if (local6.aBoolean158 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean155 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class6_Sub36 local152 = (Class6_Sub36) Static446.aClass275_163.method6366(); local152 != null; local152 = (Class6_Sub36) Static446.aClass275_163.method6364()) {
									if (local152.aBoolean367) {
										local152.method7849();
										local152.aClass97_7.aBoolean156 = false;
									}
								}
								if (Static334.anInt5970 == 0) {
									Static382.aClass97_10 = null;
									Static340.aClass97_9 = null;
								}
								Static540.anInt9139 = 0;
								Static402.aBoolean494 = false;
								Static258.aBoolean269 = false;
								if (!Static330.aBoolean415) {
									Static560.method6157();
								}
							}
							@Pc(208) boolean local208;
							if (Static427.aClass134_1.method6093() >= local28 && Static427.aClass134_1.method6092() >= local30 && Static427.aClass134_1.method6093() < local32 && Static427.aClass134_1.method6092() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static492.aBoolean560 && local208) {
								if (local6.anInt2317 >= 0) {
									Static278.anInt6564 = local6.anInt2317;
								} else if (local6.aBoolean155) {
									Static278.anInt6564 = -1;
								}
							}
							if (!Static330.aBoolean415 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static303.method4235(arg9 - local22, local6, arg8 - local17);
							}
							@Pc(252) boolean local252 = false;
							if (Static427.aClass134_1.method6094() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class6_Sub8 local267 = (Class6_Sub8) Static274.aClass275_64.method6366();
							if (local267 != null && local267.method7651() == 0 && local267.method7645() >= local28 && local267.method7643() >= local30 && local267.method7645() < local32 && local267.method7643() < local34) {
								local262 = true;
							}
							@Pc(303) int local303;
							@Pc(437) int local437;
							if (local6.aByteArray39 != null && !Static409.method1601()) {
								for (local303 = 0; local303 < local6.aByteArray39.length; local303++) {
									if (Static539.aClass88_1.method6348(local6.aByteArray39[local303])) {
										if (local6.anIntArray292 == null || Static358.anInt6263 >= local6.anIntArray292[local303]) {
											@Pc(335) byte local335 = local6.aByteArray38[local303];
											if (local335 == 0 || ((local335 & 0x8) == 0 || !Static539.aClass88_1.method6348(86) && !Static539.aClass88_1.method6348(82) && !Static539.aClass88_1.method6348(81)) && ((local335 & 0x2) == 0 || Static539.aClass88_1.method6348(86)) && ((local335 & 0x1) == 0 || Static539.aClass88_1.method6348(82)) && ((local335 & 0x4) == 0 || Static539.aClass88_1.method6348(81))) {
												if (local303 < 10) {
													Static344.method5185(local303 + 1, -1, "", local6.anInt2311);
												} else if (local303 == 10) {
													Static465.method6520();
													@Pc(406) Class6_Sub44 local406 = method862(local6);
													Static259.method3637(local6, local406.anInt7804, local406.method6471());
													Static516.aString112 = Static463.method7851(local6);
													if (Static516.aString112 == null) {
														Static516.aString112 = "Null";
													}
													Static474.aString98 = local6.aString36 + "<col=ffffff>";
												}
												local437 = local6.anIntArray286[local303];
												if (local6.anIntArray292 == null) {
													local6.anIntArray292 = new int[local6.aByteArray39.length];
												}
												if (local437 == 0) {
													local6.anIntArray292[local303] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray292[local303] = Static358.anInt6263 + local437;
												}
											}
										}
									} else if (local6.anIntArray292 != null) {
										local6.anIntArray292[local303] = 0;
									}
								}
							}
							if (local262) {
								Static540.method7486(local6, local267.method7645() - local17, local267.method7643() - local22);
							}
							if (Static382.aClass97_10 != null && Static382.aClass97_10 != local6 && local208 && method862(local6).method6468()) {
								Static551.aClass97_14 = local6;
							}
							if (local6 == Static340.aClass97_9) {
								Static332.aBoolean393 = true;
								Static465.anInt7892 = local17;
								Static319.anInt5782 = local22;
							}
							if (local6.aBoolean159 || local6.anInt2324 != 0) {
								@Pc(522) Class6_Sub36 local522;
								if (local208 && Static563.anInt9404 != 0 && local6.anObjectArray19 != null) {
									local522 = new Class6_Sub36();
									local522.aBoolean367 = true;
									local522.aClass97_7 = local6;
									local522.anInt5754 = Static563.anInt9404;
									local522.anObjectArray34 = local6.anObjectArray19;
									Static446.aClass275_163.method6370(local522);
								}
								if (Static382.aClass97_10 != null || Static330.aBoolean415 || local6.anInt2324 != Static470.anInt7952 && Static540.anInt9139 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(677) int local677;
								if (local6.anInt2324 != 0) {
									if (local6.anInt2324 == Static197.anInt3440 || local6.anInt2324 == Static284.anInt4686) {
										Static405.aClass97_11 = local6;
										if (Static285.aClass89_1 != null) {
											Static285.aClass89_1.method1813(local6.anInt2305, Static176.aClass121_5);
										}
										if (local6.anInt2324 == Static197.anInt3440) {
											if (!Static330.aBoolean415 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static322.method4984(Static176.aClass121_5, arg9, arg8);
												for (@Pc(605) Class102_Sub8 local605 = (Class102_Sub8) Static501.aClass249_8.method5817(); local605 != null; local605 = (Class102_Sub8) Static501.aClass249_8.method5815()) {
													if (arg8 >= local605.anInt9286 && arg8 < local605.anInt9284 && arg9 >= local605.anInt9283 && arg9 < local605.anInt9282) {
														Static560.method6157();
														Static381.method5556(local605.aClass29_Sub2_Sub1_1);
													}
												}
											}
											Static508.method7012(local6, local22, local17);
											continue;
										}
									}
									@Pc(716) int local716;
									if (local6.anInt2324 == Static505.anInt8414) {
										if (local6.method1976(Static176.aClass121_5) == null || Static573.anInt9601 != 0 && Static573.anInt9601 != 3 || Static330.aBoolean415 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local303 = arg8 - local17;
										local677 = arg9 - local22;
										local437 = local6.anIntArray290[local677];
										if (local303 < local437 || local303 > local437 + local6.anIntArray287[local677]) {
											continue;
										}
										local303 -= local6.anInt2340 / 2;
										local677 -= local6.anInt2305 / 2;
										if (Static354.anInt6233 == 4) {
											local716 = (int) Static399.aFloat167 & 0x3FFF;
										} else {
											local716 = (int) Static399.aFloat167 + Static574.anInt6272 & 0x3FFF;
										}
										@Pc(728) int local728 = Class138.anIntArray392[local716];
										@Pc(732) int local732 = Class138.anIntArray393[local716];
										if (Static354.anInt6233 != 4) {
											local728 = local728 * (Static291.anInt4749 + 256) >> 8;
											local732 = local732 * (Static291.anInt4749 + 256) >> 8;
										}
										@Pc(761) int local761 = local677 * local728 + local303 * local732 >> 14;
										@Pc(771) int local771 = local677 * local732 - local303 * local728 >> 14;
										@Pc(782) int local782;
										@Pc(790) int local790;
										if (Static354.anInt6233 == 4) {
											local782 = (Static135.anInt2370 >> 9) + (local761 >> 2);
											local790 = (Static224.anInt3801 >> 9) - (local771 >> 2);
										} else {
											@Pc(799) int local799 = (Static426.aClass29_Sub2_Sub1_Sub2_2.method7008() - 1) * 256;
											local782 = (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 - local799 >> 9) + (local761 >> 2);
											local790 = (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 - local799 >> 9) - (local771 >> 2);
										}
										if (Static492.aBoolean560 && (Static217.anInt3710 & 0x40) != 0) {
											@Pc(832) Class97 local832 = Static50.method681(Static288.anInt4713, Static443.anInt7698);
											if (local832 == null) {
												Static465.method6520();
											} else {
												Static246.method3528(local790, 1L, local782, Static516.aString112, Static324.anInt5830, 46, " ->", local6.anInt2277, true, false);
											}
											continue;
										}
										if (Static57.aClass314_1 == Static533.aClass314_4) {
											Static246.method3528(local790, 1L, local782, Static141.aClass104_72.method2145(Static470.anInt7957), -1, 19, "", -1, true, false);
										}
										Static246.method3528(local790, 1L, local782, Static287.aString122, Static132.anInt2327, 58, "", -1, true, false);
										continue;
									}
									if (local6.anInt2324 == Static470.anInt7952) {
										Static157.aClass97_5 = local6;
										if (local208) {
											Static402.aBoolean494 = true;
										}
										if (local262) {
											local303 = (int) ((double) (local267.method7645() - local17 - local6.anInt2340 / 2) * 2.0D / (double) Static349.aFloat170);
											local677 = (int) -((double) (local267.method7643() - local22 - local6.anInt2305 / 2) * 2.0D / (double) Static349.aFloat170);
											local437 = Static95.anInt1576 + local303 + Static349.anInt7457;
											local716 = Static387.anInt6906 + local677 + Static349.anInt7465;
											@Pc(946) Class6_Sub1_Sub9 local946 = Static277.method3984();
											if (local946 == null) {
												continue;
											}
											@Pc(951) int[] local951 = new int[3];
											local946.method2745(local716, local951, local437);
											if (local951 != null) {
												if (Static539.aClass88_1.method6348(82) && Static231.anInt3930 > 0) {
													Static169.method2642(local951[0], local951[2], local951[1]);
													continue;
												}
												Static258.aBoolean269 = true;
												Static566.anInt9474 = local951[0];
												Static61.anInt981 = local951[1];
												Static24.anInt5487 = local951[2];
											}
											Static540.anInt9139 = 1;
											Static225.aBoolean252 = false;
											Static575.anInt9609 = Static427.aClass134_1.method6093();
											Static339.anInt6017 = Static427.aClass134_1.method6092();
											continue;
										}
										if (local252 && Static540.anInt9139 > 0) {
											if (Static540.anInt9139 == 1 && (Static575.anInt9609 != Static427.aClass134_1.method6093() || Static339.anInt6017 != Static427.aClass134_1.method6092())) {
												Static172.anInt3092 = Static95.anInt1576;
												Static16.anInt308 = Static387.anInt6906;
												Static540.anInt9139 = 2;
											}
											if (Static540.anInt9139 == 2) {
												Static225.aBoolean252 = true;
												Static156.method2289(Static172.anInt3092 + (int) ((double) (Static575.anInt9609 - Static427.aClass134_1.method6093()) * 2.0D / (double) Static349.aFloat169));
												Static353.method5289(Static16.anInt308 - (int) ((double) (Static339.anInt6017 - Static427.aClass134_1.method6092()) * 2.0D / (double) Static349.aFloat169));
											}
											continue;
										}
										if (Static540.anInt9139 > 0 && !Static225.aBoolean252) {
											if ((Static129.anInt2230 == 1 || Static346.method5212()) && Static374.anInt6451 > 2) {
												Static135.method2003(Static339.anInt6017, Static575.anInt9609);
											} else if (Static6.method1743()) {
												Static135.method2003(Static339.anInt6017, Static575.anInt9609);
											}
										}
										Static540.anInt9139 = 0;
										continue;
									}
									if (local6.anInt2324 == Static176.anInt3146) {
										if (local252) {
											Static477.method7202(Static427.aClass134_1.method6092() - local22, local6.anInt2340, local6.anInt2305, Static427.aClass134_1.method6093() - local17);
										}
										continue;
									}
									if (local6.anInt2324 == Static191.anInt3293) {
										Static465.method6523(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean160 && local262) {
									local6.aBoolean160 = true;
									if (local6.anObjectArray1 != null) {
										local522 = new Class6_Sub36();
										local522.aBoolean367 = true;
										local522.aClass97_7 = local6;
										local522.anInt5755 = local267.method7645() - local17;
										local522.anInt5754 = local267.method7643() - local22;
										local522.anObjectArray34 = local6.anObjectArray1;
										Static446.aClass275_163.method6370(local522);
									}
								}
								if (local6.aBoolean160 && local252 && local6.anObjectArray13 != null) {
									local522 = new Class6_Sub36();
									local522.aBoolean367 = true;
									local522.aClass97_7 = local6;
									local522.anInt5755 = Static427.aClass134_1.method6093() - local17;
									local522.anInt5754 = Static427.aClass134_1.method6092() - local22;
									local522.anObjectArray34 = local6.anObjectArray13;
									Static446.aClass275_163.method6370(local522);
								}
								if (local6.aBoolean160 && !local252) {
									local6.aBoolean160 = false;
									if (local6.anObjectArray23 != null) {
										local522 = new Class6_Sub36();
										local522.aBoolean367 = true;
										local522.aClass97_7 = local6;
										local522.anInt5755 = Static427.aClass134_1.method6093() - local17;
										local522.anInt5754 = Static427.aClass134_1.method6092() - local22;
										local522.anObjectArray34 = local6.anObjectArray23;
										Static543.aClass275_192.method6370(local522);
									}
								}
								if (local252 && local6.anObjectArray15 != null) {
									local522 = new Class6_Sub36();
									local522.aBoolean367 = true;
									local522.aClass97_7 = local6;
									local522.anInt5755 = Static427.aClass134_1.method6093() - local17;
									local522.anInt5754 = Static427.aClass134_1.method6092() - local22;
									local522.anObjectArray34 = local6.anObjectArray15;
									Static446.aClass275_163.method6370(local522);
								}
								if (!local6.aBoolean156 && local208) {
									local6.aBoolean156 = true;
									if (local6.anObjectArray14 != null) {
										local522 = new Class6_Sub36();
										local522.aBoolean367 = true;
										local522.aClass97_7 = local6;
										local522.anInt5755 = Static427.aClass134_1.method6093() - local17;
										local522.anInt5754 = Static427.aClass134_1.method6092() - local22;
										local522.anObjectArray34 = local6.anObjectArray14;
										Static446.aClass275_163.method6370(local522);
									}
								}
								if (local6.aBoolean156 && local208 && local6.anObjectArray26 != null) {
									local522 = new Class6_Sub36();
									local522.aBoolean367 = true;
									local522.aClass97_7 = local6;
									local522.anInt5755 = Static427.aClass134_1.method6093() - local17;
									local522.anInt5754 = Static427.aClass134_1.method6092() - local22;
									local522.anObjectArray34 = local6.anObjectArray26;
									Static446.aClass275_163.method6370(local522);
								}
								if (local6.aBoolean156 && !local208) {
									local6.aBoolean156 = false;
									if (local6.anObjectArray17 != null) {
										local522 = new Class6_Sub36();
										local522.aBoolean367 = true;
										local522.aClass97_7 = local6;
										local522.anInt5755 = Static427.aClass134_1.method6093() - local17;
										local522.anInt5754 = Static427.aClass134_1.method6092() - local22;
										local522.anObjectArray34 = local6.anObjectArray17;
										Static543.aClass275_192.method6370(local522);
									}
								}
								if (local6.anObjectArray16 != null) {
									local522 = new Class6_Sub36();
									local522.aClass97_7 = local6;
									local522.anObjectArray34 = local6.anObjectArray16;
									Static80.aClass275_33.method6370(local522);
								}
								@Pc(1490) Class6_Sub36 local1490;
								if (local6.anObjectArray9 != null && Static422.anInt7469 > local6.anInt2301) {
									if (local6.anIntArray295 == null || Static422.anInt7469 - local6.anInt2301 > 32) {
										local522 = new Class6_Sub36();
										local522.aClass97_7 = local6;
										local522.anObjectArray34 = local6.anObjectArray9;
										Static446.aClass275_163.method6370(local522);
									} else {
										label681: for (local303 = local6.anInt2301; local303 < Static422.anInt7469; local303++) {
											local677 = Static31.anIntArray42[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray295.length; local437++) {
												if (local6.anIntArray295[local437] == local677) {
													local1490 = new Class6_Sub36();
													local1490.aClass97_7 = local6;
													local1490.anObjectArray34 = local6.anObjectArray9;
													Static446.aClass275_163.method6370(local1490);
													break label681;
												}
											}
										}
									}
									local6.anInt2301 = Static422.anInt7469;
								}
								if (local6.anObjectArray8 != null && Static430.anInt5649 > local6.anInt2291) {
									if (local6.anIntArray293 == null || Static430.anInt5649 - local6.anInt2291 > 32) {
										local522 = new Class6_Sub36();
										local522.aClass97_7 = local6;
										local522.anObjectArray34 = local6.anObjectArray8;
										Static446.aClass275_163.method6370(local522);
									} else {
										label657: for (local303 = local6.anInt2291; local303 < Static430.anInt5649; local303++) {
											local677 = Static82.anIntArray173[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray293.length; local437++) {
												if (local6.anIntArray293[local437] == local677) {
													local1490 = new Class6_Sub36();
													local1490.aClass97_7 = local6;
													local1490.anObjectArray34 = local6.anObjectArray8;
													Static446.aClass275_163.method6370(local1490);
													break label657;
												}
											}
										}
									}
									local6.anInt2291 = Static430.anInt5649;
								}
								if (local6.anObjectArray11 != null && Static20.anInt365 > local6.anInt2295) {
									if (local6.anIntArray296 == null || Static20.anInt365 - local6.anInt2295 > 32) {
										local522 = new Class6_Sub36();
										local522.aClass97_7 = local6;
										local522.anObjectArray34 = local6.anObjectArray11;
										Static446.aClass275_163.method6370(local522);
									} else {
										label633: for (local303 = local6.anInt2295; local303 < Static20.anInt365; local303++) {
											local677 = Static339.anIntArray527[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray296.length; local437++) {
												if (local6.anIntArray296[local437] == local677) {
													local1490 = new Class6_Sub36();
													local1490.aClass97_7 = local6;
													local1490.anObjectArray34 = local6.anObjectArray11;
													Static446.aClass275_163.method6370(local1490);
													break label633;
												}
											}
										}
									}
									local6.anInt2295 = Static20.anInt365;
								}
								if (local6.anObjectArray27 != null && Static265.anInt4387 > local6.anInt2345) {
									if (local6.anIntArray288 == null || Static265.anInt4387 - local6.anInt2345 > 32) {
										local522 = new Class6_Sub36();
										local522.aClass97_7 = local6;
										local522.anObjectArray34 = local6.anObjectArray27;
										Static446.aClass275_163.method6370(local522);
									} else {
										label609: for (local303 = local6.anInt2345; local303 < Static265.anInt4387; local303++) {
											local677 = Static508.anIntArray662[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray288.length; local437++) {
												if (local6.anIntArray288[local437] == local677) {
													local1490 = new Class6_Sub36();
													local1490.aClass97_7 = local6;
													local1490.anObjectArray34 = local6.anObjectArray27;
													Static446.aClass275_163.method6370(local1490);
													break label609;
												}
											}
										}
									}
									local6.anInt2345 = Static265.anInt4387;
								}
								if (local6.anObjectArray29 != null && Static376.anInt6487 > local6.anInt2278) {
									if (local6.anIntArray289 == null || Static376.anInt6487 - local6.anInt2278 > 32) {
										local522 = new Class6_Sub36();
										local522.aClass97_7 = local6;
										local522.anObjectArray34 = local6.anObjectArray29;
										Static446.aClass275_163.method6370(local522);
									} else {
										label585: for (local303 = local6.anInt2278; local303 < Static376.anInt6487; local303++) {
											local677 = Static475.anIntArray627[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray289.length; local437++) {
												if (local6.anIntArray289[local437] == local677) {
													local1490 = new Class6_Sub36();
													local1490.aClass97_7 = local6;
													local1490.anObjectArray34 = local6.anObjectArray29;
													Static446.aClass275_163.method6370(local1490);
													break label585;
												}
											}
										}
									}
									local6.anInt2278 = Static376.anInt6487;
								}
								if (Static74.anInt1211 > local6.anInt2309 && local6.anObjectArray4 != null) {
									local522 = new Class6_Sub36();
									local522.aClass97_7 = local6;
									local522.anObjectArray34 = local6.anObjectArray4;
									Static446.aClass275_163.method6370(local522);
								}
								if (Static350.anInt6167 > local6.anInt2309 && local6.anObjectArray30 != null) {
									local522 = new Class6_Sub36();
									local522.aClass97_7 = local6;
									local522.anObjectArray34 = local6.anObjectArray30;
									Static446.aClass275_163.method6370(local522);
								}
								if (Static158.anInt2782 > local6.anInt2309 && local6.anObjectArray3 != null) {
									local522 = new Class6_Sub36();
									local522.aClass97_7 = local6;
									local522.anObjectArray34 = local6.anObjectArray3;
									Static446.aClass275_163.method6370(local522);
								}
								if (Static503.anInt1076 > local6.anInt2309 && local6.anObjectArray31 != null) {
									local522 = new Class6_Sub36();
									local522.aClass97_7 = local6;
									local522.anObjectArray34 = local6.anObjectArray31;
									Static446.aClass275_163.method6370(local522);
								}
								if (Static555.anInt8692 > local6.anInt2309 && local6.anObjectArray10 != null) {
									local522 = new Class6_Sub36();
									local522.aClass97_7 = local6;
									local522.anObjectArray34 = local6.anObjectArray10;
									Static446.aClass275_163.method6370(local522);
								}
								local6.anInt2309 = Static48.anInt821;
								if (local6.anObjectArray22 != null) {
									for (local303 = 0; local303 < Static71.anInt1181; local303++) {
										@Pc(1958) Class6_Sub36 local1958 = new Class6_Sub36();
										local1958.aClass97_7 = local6;
										local1958.anInt5756 = Static142.anInterface16Array1[local303].method944();
										local1958.anInt5759 = Static142.anInterface16Array1[local303].method947();
										local1958.anObjectArray34 = local6.anObjectArray22;
										Static446.aClass275_163.method6370(local1958);
									}
								}
								if (Static123.aBoolean140 && local6.anObjectArray21 != null) {
									local522 = new Class6_Sub36();
									local522.aClass97_7 = local6;
									local522.anObjectArray34 = local6.anObjectArray21;
									Static446.aClass275_163.method6370(local522);
								}
							}
							if (local6.anInt2264 == 5 && local6.anInt2267 != -1) {
								local6.method1986(Static316.aClass141_1, Static264.aClass124_1).method1813(local6.anInt2305, Static176.aClass121_5);
							}
							Static278.method5544(local6);
							if (local6.anInt2264 == 0) {
								method855(arg0, local6.anInt2311, local28, local30, local32, local34, local17 - local6.anInt2271, local22 - local6.anInt2334, arg8, arg9);
								if (local6.aClass97Array1 != null) {
									method855(local6.aClass97Array1, local6.anInt2311, local28, local30, local32, local34, local17 - local6.anInt2271, local22 - local6.anInt2334, arg8, arg9);
								}
								@Pc(2080) Class6_Sub31 local2080 = (Class6_Sub31) Static564.aClass212_39.method5106((long) local6.anInt2311);
								if (local2080 != null) {
									if (Static57.aClass314_1 == Static140.aClass314_2 && local2080.anInt4562 == 0 && !Static330.aBoolean415 && local208 && !Static446.aBoolean529) {
										Static560.method6157();
									}
									Static474.method6605(local22, local2080.anInt4563, arg9, local28, local34, local30, local32, local17, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static278.method5544(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method857() {
		Static154.anInt2738 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static516.anInt8936; local3++) {
			@Pc(14) Class29_Sub2_Sub1_Sub1 local14 = ((Class6_Sub28) Static31.aClass212_1.method5106((long) Static274.anIntArray385[local3])).aClass29_Sub2_Sub1_Sub1_2;
			if (local14.aBoolean598 && local14.method7001() != -1) {
				@Pc(32) int local32 = (local14.method7008() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt9222 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt9218 - local32 >> 9;
				@Pc(53) Class29_Sub2_Sub1 local53 = Static314.method4894(local39, local14.aByte103, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt8541;
					if (local53 instanceof Class29_Sub2_Sub1_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt8510 == 0 && local53.method7001() != -1) {
						Static292.anIntArray456[Static154.anInt2738] = local58;
						Static25.anIntArray36[Static154.anInt2738] = local58;
						Static154.anInt2738++;
						local53.anInt8510++;
					}
					Static292.anIntArray456[Static154.anInt2738] = local58;
					Static25.anIntArray36[Static154.anInt2738] = local14.anInt8541 + 2048;
					Static154.anInt2738++;
					local53.anInt8510++;
				}
			}
		}
		Static461.method6477(0, Static292.anIntArray456, Static25.anIntArray36, Static154.anInt2738 - 1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!fca;)Lclient!fca;")
	public static Class97 method858(@OriginalArg(0) Class97 arg0) {
		@Pc(4) int local4 = method862(arg0).method6470();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static133.method4068(arg0.anInt2325);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!fca;)Z")
	public static boolean method860(@OriginalArg(0) Class97 arg0) {
		if (Static446.aBoolean529) {
			if (method862(arg0).anInt7805 != 0) {
				return false;
			}
			if (arg0.anInt2264 == 0) {
				return false;
			}
		}
		return arg0.aBoolean150;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method861() {
		@Pc(1) int local1 = Static199.anInt3448;
		@Pc(3) int[] local3 = Static272.anIntArray443;
		@Pc(11) int local11 = Static63.aBoolean53 ? local1 : local1 + Static516.anInt8936;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class29_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class6_Sub28) Static31.aClass212_1.method5106((long) Static274.anIntArray385[local13 - local1])).aClass29_Sub2_Sub1_Sub1_2;
			}
			if (local23.anInt8518 >= 0) {
				@Pc(43) int local43 = local23.method7008();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt9222 & 0x1FF) == 0 && (local23.anInt9218 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt9222 & 0x1FF) == 256 && (local23.anInt9218 & 0x1FF) == 256) {
					continue;
				}
				if (local23 instanceof Class29_Sub2_Sub1_Sub2 && local23.aClass6_Sub4_3 != null && Static358.anInt6263 >= local23.aClass6_Sub4_3.anInt519 && Static358.anInt6263 < local23.aClass6_Sub4_3.anInt521) {
					((Class29_Sub2_Sub1_Sub2) local23).aBoolean602 = false;
				}
				local23.anInt9223 = Static490.method6768(local23.anInt9222, local23.aByte103, local23.anInt9218);
				Static280.method3996(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!fca;)Lclient!sca;")
	public static Class6_Sub44 method862(@OriginalArg(0) Class97 arg0) {
		@Pc(13) Class6_Sub44 local13 = (Class6_Sub44) Static575.aClass212_41.method5106(((long) arg0.anInt2311 << 32) + (long) arg0.lb);
		return local13 == null ? arg0.aClass6_Sub44_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method863() {
		@Pc(1) int local1 = Static199.anInt3448;
		@Pc(3) int[] local3 = Static272.anIntArray443;
		@Pc(20) boolean local20 = Static480.aClass6_Sub37_Sub1_1.anInt6042 == 1 && local1 > 200 || Static480.aClass6_Sub37_Sub1_1.anInt6042 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class29_Sub2_Sub1_Sub2 local29 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local3[local22]];
			if (local29.method7016()) {
				local29.method7547();
				if (local29.aShort122 >= 0 && local29.aShort121 >= 0 && local29.aShort124 < Static301.anInt4912 && local29.aShort123 < Static473.anInt7969) {
					local29.aBoolean602 = local29.aBoolean597 ? local20 : false;
					if (local29 == Static426.aClass29_Sub2_Sub1_Sub2_2) {
						local29.anInt8518 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean598) {
							local75++;
						}
						if (local29.anInt8514 > Static358.anInt6263) {
							local75 += 2;
						}
						local75 += 5 - local29.method7008() << 2;
						if (local29.aBoolean601) {
							local75 += 512;
						} else {
							if (Static176.anInt3154 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt8518 = local75 + 1;
					}
				} else {
					local29.anInt8518 = -1;
				}
			} else {
				local29.anInt8518 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static516.anInt8936; local116++) {
			@Pc(127) Class29_Sub2_Sub1_Sub1 local127 = ((Class6_Sub28) Static31.aClass212_1.method5106((long) Static274.anIntArray385[local116])).aClass29_Sub2_Sub1_Sub1_2;
			if (local127.method1587() && local127.aClass257_1.method5940(Static505.aClass30_1)) {
				local127.method7547();
				if (local127.aShort122 >= 0 && local127.aShort121 >= 0 && local127.aShort124 < Static301.anInt4912 && local127.aShort123 < Static473.anInt7969) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean598) {
						local164++;
					}
					if (local127.anInt8514 > Static358.anInt6263) {
						local164 += 2;
					}
					local164 += 5 - local127.method7008() << 2;
					if (Static176.anInt3154 == 0) {
						if (local127.aClass257_1.aBoolean499) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static176.anInt3154 == 1) {
						if (local127.aClass257_1.aBoolean499) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass257_1.aBoolean503) {
						local164 += 1024;
					} else if (!local127.aClass257_1.aBoolean502) {
						local164 += 256;
					}
					local127.anInt8518 = local164 + 1;
				} else {
					local127.anInt8518 = -1;
				}
			} else {
				local127.anInt8518 = -1;
			}
		}
		for (local75 = 0; local75 < Static34.aClass129Array4.length; local75++) {
			@Pc(230) Class129 local230 = Static34.aClass129Array4[local75];
			if (local230 != null) {
				if (local230.anInt3170 == 1) {
					@Pc(244) Class6_Sub28 local244 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local230.anInt3177);
					if (local244 != null) {
						@Pc(249) Class29_Sub2_Sub1_Sub1 local249 = local244.aClass29_Sub2_Sub1_Sub1_2;
						if (local249.anInt8518 >= 0) {
							local249.anInt8518 += 2048;
						}
					}
				} else if (local230.anInt3170 == 10) {
					@Pc(268) Class29_Sub2_Sub1_Sub2 local268 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local230.anInt3177];
					if (local268 != null && local268 != Static426.aClass29_Sub2_Sub1_Sub2_2 && local268.anInt8518 >= 0) {
						local268.anInt8518 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method864() {
		for (@Pc(1) int local1 = 0; local1 < Static301.anInt4912; local1++) {
			@Pc(6) int[] local6 = Static56.anIntArrayArray8[local1];
			for (@Pc(8) int local8 = 0; local8 < Static473.anInt7969; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method869(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static199.anInt3448;
		@Pc(3) int[] local3 = Static272.anIntArray443;
		@Pc(11) int local11 = Static63.aBoolean53 ? local1 : local1 + Static516.anInt8936;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class29_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class6_Sub28) Static31.aClass212_1.method5106((long) Static274.anIntArray385[local13 - local1])).aClass29_Sub2_Sub1_Sub1_2;
			}
			if (local23.aByte103 == arg0) {
				local23.anInt8510 = 0;
				if (local23.anInt8518 < 0) {
					local23.aBoolean598 = false;
				} else {
					@Pc(54) int local54 = local23.method7008();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt9222 & 0x1FF) != 0 || (local23.anInt9218 & 0x1FF) != 0) {
							local23.aBoolean598 = false;
							continue;
						}
					} else if ((local23.anInt9222 & 0x1FF) != 256 || (local23.anInt9218 & 0x1FF) != 256) {
						local23.aBoolean598 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt9222 >> 9;
						local101 = local23.anInt9218 >> 9;
						if (local23.anInt8518 != Static56.anIntArrayArray8[local96][local101]) {
							local23.aBoolean598 = true;
							continue;
						}
						if (Static236.anIntArrayArray50[local96][local101] > 1) {
							local126 = Static236.anIntArrayArray50[local96][local101]--;
							local23.aBoolean598 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt9222 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt9218 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt9222 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt9218 + local96 >> 9;
						if (!Static240.method3495(local23.anInt8518, local169, local101, local162, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt8518 == Static56.anIntArrayArray8[local180][local183]) {
										local126 = Static236.anIntArrayArray50[local180][local183]--;
									}
								}
							}
							local23.aBoolean598 = true;
							continue;
						}
					}
					if (local23 instanceof Class29_Sub2_Sub1_Sub2 && local23.aClass6_Sub4_3 != null && Static358.anInt6263 >= local23.aClass6_Sub4_3.anInt519 && Static358.anInt6263 < local23.aClass6_Sub4_3.anInt521) {
						((Class29_Sub2_Sub1_Sub2) local23).aBoolean602 = false;
					}
					local23.aBoolean598 = false;
					local23.anInt9223 = Static490.method6768(local23.anInt9222, local23.aByte103, local23.anInt9218);
					Static280.method3996(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	public static void method870(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static199.anInt3448;
		@Pc(3) int[] local3 = Static272.anIntArray443;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static516.anInt8936; local5++) {
			@Pc(15) Class29_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class6_Sub28) Static31.aClass212_1.method5106((long) Static274.anIntArray385[local5 - local1])).aClass29_Sub2_Sub1_Sub1_2;
			}
			if (local15.aByte103 == arg0 && local15.anInt8518 >= 0) {
				@Pc(39) int local39 = local15.method7008();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt9222 & 0x1FF) != 0 || (local15.anInt9218 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9222 & 0x1FF) != 256 || (local15.anInt9218 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt9222 >> 9;
					local80 = local15.anInt9218 >> 9;
					if (local15.anInt8518 > Static56.anIntArrayArray8[local75][local80]) {
						Static56.anIntArrayArray8[local75][local80] = local15.anInt8518;
						Static236.anIntArrayArray50[local75][local80] = 1;
					} else if (local15.anInt8518 == Static56.anIntArrayArray8[local75][local80]) {
						local116 = Static236.anIntArrayArray50[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt9222 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt9218 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt9222 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt9218 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt8518 > Static56.anIntArrayArray8[local158][local161]) {
								Static56.anIntArrayArray8[local158][local161] = local15.anInt8518;
								Static236.anIntArrayArray50[local158][local161] = 1;
							} else if (local15.anInt8518 == Static56.anIntArrayArray8[local158][local161]) {
								local116 = Static236.anIntArrayArray50[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}
}
