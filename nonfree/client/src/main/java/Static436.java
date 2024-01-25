import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "[Lclient!xa;")
	public static Class4[] aClass4Array14;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III[Lclient!fca;IIIIII)V")
	public static void method6279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class97[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static176.aClass121_5.ca(arg1, arg5, arg6, arg7);
		for (@Pc(17) int local17 = 0; local17 < arg3.length; local17++) {
			@Pc(23) Class97 local23 = arg3[local17];
			if (local23 != null && (arg4 == local23.anInt2325 || arg4 == -1412584499 && Static382.aClass97_10 == local23)) {
				@Pc(64) int local64;
				if (arg0 == -1) {
					Class6_Sub1_Sub11.aRectangleArray1[Static73.anInt1201].setBounds(local23.anInt2265 + arg2, local23.anInt2331 - -arg8, local23.anInt2340, local23.anInt2305);
					local64 = Static73.anInt1201++;
				} else {
					local64 = arg0;
				}
				local23.anInt2303 = Static358.anInt6263;
				local23.anInt2353 = local64;
				if (!Static65.method860(local23)) {
					if (local23.anInt2324 != 0) {
						Static440.method6324(local23);
					}
					@Pc(88) int local88 = local23.anInt2265 + arg2;
					@Pc(93) int local93 = arg8 + local23.anInt2331;
					@Pc(96) int local96 = local23.anInt2316;
					if (Static446.aBoolean529 && (Static65.method862(local23).anInt7805 != 0 || local23.anInt2264 == 0) && local96 > 127) {
						local96 = 127;
					}
					@Pc(147) int local147;
					@Pc(151) int local151;
					if (Static382.aClass97_10 == local23) {
						if (arg4 != -1412584499 && (local23.anInt2319 == Static225.anInt3803 || Static454.anInt7789 == local23.anInt2319)) {
							Static50.anInt846 = arg2;
							Static109.anInt9293 = arg8;
							Static502.aClass97Array2 = arg3;
							continue;
						}
						if (Static576.aBoolean669 && Static332.aBoolean393) {
							local147 = Static427.aClass134_1.method6093();
							local151 = Static427.aClass134_1.method6092();
							local151 -= Static339.anInt6017;
							local147 -= Static575.anInt9609;
							if (Static465.anInt7892 > local147) {
								local147 = Static465.anInt7892;
							}
							if (Static319.anInt5782 > local151) {
								local151 = Static319.anInt5782;
							}
							if (local147 + local23.anInt2340 > Static340.aClass97_9.anInt2340 + Static465.anInt7892) {
								local147 = Static340.aClass97_9.anInt2340 + Static465.anInt7892 - local23.anInt2340;
							}
							local88 = local147;
							if (local23.anInt2305 + local151 > Static319.anInt5782 + Static340.aClass97_9.anInt2305) {
								local151 = Static319.anInt5782 + Static340.aClass97_9.anInt2305 - local23.anInt2305;
							}
							local93 = local151;
						}
						if (local23.anInt2319 == Static454.anInt7789) {
							local96 = 128;
						}
					}
					@Pc(280) int local280;
					@Pc(273) int local273;
					@Pc(237) int local237;
					@Pc(242) int local242;
					if (local23.anInt2264 == 2) {
						local151 = arg5;
						local273 = arg7;
						local280 = arg6;
						local147 = arg1;
					} else {
						local237 = local23.anInt2340 + local88;
						local242 = local23.anInt2305 + local93;
						local151 = arg5 < local93 ? local93 : arg5;
						if (local23.anInt2264 == 9) {
							local242++;
							local237++;
						}
						local147 = local88 <= arg1 ? arg1 : local88;
						local273 = arg7 <= local242 ? arg7 : local242;
						local280 = arg6 > local237 ? local237 : arg6;
					}
					if (local147 < local280 && local151 < local273) {
						@Pc(491) int local491;
						@Pc(526) int local526;
						@Pc(535) int local535;
						@Pc(634) int local634;
						@Pc(524) int local524;
						if (local23.anInt2324 != 0) {
							if (Static197.anInt3440 == local23.anInt2324 || local23.anInt2324 == Static284.anInt4686) {
								Static405.method5919(local23.anInt2305, local88, local23.anInt2340, local93, local23.anInt2324 == Static284.anInt4686);
								Static258.aBooleanArray27[local64] = true;
								Static176.aClass121_5.ca(arg1, arg5, arg6, arg7);
								continue;
							}
							if (Static505.anInt8414 == local23.anInt2324) {
								if (local23.method1976(Static176.aClass121_5) != null) {
									Static11.method182();
									Static397.method268(local23, Static176.aClass121_5, local93, local88);
									Static44.aBooleanArray5[local64] = true;
									Static176.aClass121_5.ca(arg1, arg5, arg6, arg7);
								}
								continue;
							}
							if (local23.anInt2324 == Static511.anInt8645) {
								if (local23.method1976(Static176.aClass121_5) != null) {
									Static33.method466(local23, local88, local93);
									Static44.aBooleanArray5[local64] = true;
									Static176.aClass121_5.ca(arg1, arg5, arg6, arg7);
								}
								continue;
							}
							if (local23.anInt2324 == Static470.anInt7952) {
								Static536.method7458(local88, local23.anInt2340, Static176.aClass121_5, Static499.anInterface7_13, local23.anInt2305, local93);
								Static258.aBooleanArray27[local64] = true;
								Static176.aClass121_5.ca(arg1, arg5, arg6, arg7);
								continue;
							}
							if (Static176.anInt3146 == local23.anInt2324) {
								Static173.method2673(local23.anInt2305, local23.anInt2340, local93, local88, Static176.aClass121_5);
								Static258.aBooleanArray27[local64] = true;
								Static176.aClass121_5.ca(arg1, arg5, arg6, arg7);
								continue;
							}
							if (Static205.anInt3499 == local23.anInt2324) {
								if (!Static386.aBoolean486 && !Static60.aBoolean49) {
									continue;
								}
								local237 = local88 + local23.anInt2340;
								local242 = local93 + 15;
								if (Static386.aBoolean486) {
									local491 = -256;
									if (Static443.anInt7696 < 20) {
										local491 = -65536;
									}
									Static85.aClass56_2.method7867("Fps:" + Static443.anInt7696, -1, local242, local237, local491);
									local242 += 15;
									@Pc(515) Runtime local515 = Runtime.getRuntime();
									local524 = (int) ((local515.totalMemory() - local515.freeMemory()) / 1024L);
									local526 = -256;
									if (local524 > 65536) {
										if (Static95.aBoolean102) {
											Static414.method6083();
											for (local535 = 0; local535 < 10; local535++) {
												System.gc();
											}
											local524 = (int) ((local515.totalMemory() - local515.freeMemory()) / 1024L);
											if (local524 > 65536) {
												Static418.method6132("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local526 = -65536;
									}
									Static85.aClass56_2.method7867("Mem:" + local524 + "k", -1, local242, local237, local526);
									local242 += 15;
									Static85.aClass56_2.method7867("In:" + Static284.anInt4689 + "B/s Out:" + Static36.anInt602 + "B/s", -1, local242, local237, -256);
									local242 += 15;
									local535 = Static176.aClass121_5.v() / 1024;
									Static85.aClass56_2.method7867("Offheap:" + local535 + "k", -1, local242, local237, local535 > 65536 ? -65536 : -256);
									local242 += 15;
									local634 = 0;
									@Pc(636) int local636 = 0;
									@Pc(638) int local638 = 0;
									for (@Pc(640) int local640 = 0; local640 < 34; local640++) {
										local634 += Static329.aClass98_Sub1Array2[local640].method4082();
										local636 += Static329.aClass98_Sub1Array2[local640].method4084();
										local638 += Static329.aClass98_Sub1Array2[local640].method4080();
									}
									@Pc(678) int local678 = local638 * 100 / local634;
									@Pc(684) int local684 = local636 * 10000 / local634;
									@Pc(704) String local704 = "Cache:" + Static334.method5112((long) local684, 0, 2, true) + "% (" + local678 + "%)";
									Static43.aClass56_1.method7867(local704, -1, local242, local237, -256);
									local242 += 12;
								}
								if (Static537.anInt9109 > 0) {
									Static43.aClass56_1.method7867("Particles: " + Static428.anInt7537 + " / " + Static537.anInt9109, -1, local242, local237, -256);
								}
								local242 += 12;
								if (Static60.aBoolean49) {
									Static43.aClass56_1.method7867("Polys: " + Static176.aClass121_5.SA() + " Models: " + Static176.aClass121_5.aa(), -1, local242, local237, -256);
									local242 += 12;
									Static43.aClass56_1.method7867("Ls: " + Static401.anInt7056 + " La: " + Static90.anInt1536 + " NPC: " + Static410.anInt7192 + " Pl: " + Static493.anInt8238, -1, local242, local237, -256);
									local242 += 12;
									Static272.method3835();
								}
								Static258.aBooleanArray27[local64] = true;
								continue;
							}
						}
						if (local23.anInt2264 == 0) {
							if (Static562.anInt9395 == local23.anInt2324 && Static176.aClass121_5.method7141()) {
								Static176.aClass121_5.method7152(local88, local93, local23.anInt2340, local23.anInt2305);
							}
							method6279(local64, local147, local88 - local23.anInt2271, arg3, local23.anInt2311, local151, local280, local273, local93 - local23.anInt2334);
							if (local23.aClass97Array1 != null) {
								method6279(local64, local147, local88 - local23.anInt2271, local23.aClass97Array1, local23.anInt2311, local151, local280, local273, local93 - local23.anInt2334);
							}
							@Pc(869) Class6_Sub31 local869 = (Class6_Sub31) Static564.aClass212_39.method5106((long) local23.anInt2311);
							if (local869 != null) {
								Static154.method2267(local93, local869.anInt4563, local147, local273, local280, local151, local88, local64);
							}
							if (local23.anInt2324 == Static562.anInt9395 && Static176.aClass121_5.method7141()) {
								Static176.aClass121_5.method7130();
								Static364.aBoolean436 = true;
							}
							Static176.aClass121_5.ca(arg1, arg5, arg6, arg7);
						}
						if (Static40.aBooleanArray4[local64] || Static278.anInt6568 > 1) {
							if (local23.anInt2264 == 3) {
								if (local96 == 0) {
									if (local23.aBoolean153) {
										Static176.aClass121_5.C(local88, local93, local23.anInt2340, local23.anInt2305, local23.anInt2352, 0);
									} else {
										Static176.aClass121_5.method7127(local88, local93, local23.anInt2340, local23.anInt2305, local23.anInt2352, 0);
									}
								} else if (local23.aBoolean153) {
									Static176.aClass121_5.C(local88, local93, local23.anInt2340, local23.anInt2305, 255 - (local96 & 0xFF) << 24 | local23.anInt2352 & 0xFFFFFF, 1);
								} else {
									Static176.aClass121_5.method7127(local88, local93, local23.anInt2340, local23.anInt2305, 255 - (local96 & 0xFF) << 24 | local23.anInt2352 & 0xFFFFFF, 1);
								}
							} else if (local23.anInt2264 == 4) {
								@Pc(1009) Class56 local1009 = local23.method1977(Static176.aClass121_5);
								if (local1009 != null) {
									local242 = local23.anInt2352;
									@Pc(1024) String local1024 = local23.aString38;
									if (local23.anInt2277 != -1) {
										@Pc(1035) Class110 local1035 = Static295.aClass256_2.method5924(local23.anInt2277);
										local1024 = local1035.aString41;
										if (local1024 == null) {
											local1024 = "null";
										}
										if ((local1035.anInt2639 == 1 || local23.anInt2329 != 1) && local23.anInt2329 != -1) {
											local1024 = "<col=ff9040>" + local1024 + "</col> x" + Static316.method4906(local23.anInt2329);
										}
									}
									if (local23 == Static473.aClass97_13) {
										local1024 = Static141.aClass104_76.method2145(Static470.anInt7957);
										local242 = local23.anInt2352;
									}
									if (Static14.aBoolean11) {
										Static176.aClass121_5.Q(local88, local93, local88 + local23.anInt2340, local93 - -local23.anInt2305);
									}
									local1009.method7870(local23.anInt2292, null, local23.anInt2274, 0, local23.anInt2294, 0, null, Static52.aClass4Array1, local1024, local23.anInt2305, local93, local88, local23.aBoolean151 ? 255 - (local96 & 0xFF) << 24 : -1, local23.anInt2285, local242 | 255 - (local96 & 0xFF) << 24, local23.anInt2340);
									if (Static14.aBoolean11) {
										Static176.aClass121_5.ca(arg1, arg5, arg6, arg7);
									}
								} else if (Static371.aBoolean441) {
									Static390.method5794(local23);
								}
							} else {
								@Pc(1267) int local1267;
								if (local23.anInt2264 == 5) {
									if (local23.anInt2267 >= 0) {
										local23.method1986(Static316.aClass141_1, Static264.aClass124_1).method1816(0, local23.anInt2340, local88, Static176.aClass121_5, local23.anInt2305, local23.anInt2298 << 3, 0, local23.anInt2313 << 3, local93);
									} else {
										@Pc(1224) Class4 local1224;
										if (local23.anInt2277 == -1) {
											local1224 = local23.method1985(Static176.aClass121_5);
										} else {
											@Pc(1206) Class246 local1206 = local23.aBoolean148 ? Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1 : null;
											local1224 = Static295.aClass256_2.method5921(local23.anInt2277, local23.anInt2329, Static176.aClass121_5, local23.anInt2308, local23.anInt2333, local23.anInt2300 | 0xFF000000, local1206);
										}
										if (local1224 != null) {
											local242 = local1224.AA();
											local491 = local1224.a();
											local1267 = 255 - (local96 & 0xFF) << 24 | (local23.anInt2352 == 0 ? 16777215 : local23.anInt2352 & 0xFFFFFF);
											if (local23.aBoolean163) {
												Static176.aClass121_5.Q(local88, local93, local88 + local23.anInt2340, local23.anInt2305 + local93);
												if (local23.anInt2296 != 0) {
													local524 = (local23.anInt2340 + local242 - 1) / local242;
													local526 = (local491 + local23.anInt2305 - 1) / local491;
													for (local535 = 0; local535 < local524; local535++) {
														for (local634 = 0; local634 < local526; local634++) {
															if (local23.anInt2352 == 0) {
																local1224.method6512((float) (local535 * local242 + local88) + (float) local242 / 2.0F, (float) local491 / 2.0F + (float) (local93 + local491 * local634), 4096, local23.anInt2296);
															} else {
																local1224.method6515((float) (local242 * local535 + local88) + (float) local242 / 2.0F, (float) local491 / 2.0F + (float) (local491 * local634 + local93), 4096, local23.anInt2296, local1267);
															}
														}
													}
												} else if (local23.anInt2352 == 0 && local96 == 0) {
													local1224.method6516(local88, local93, local23.anInt2340, local23.anInt2305);
												} else {
													local1224.ba(local88, local93, local23.anInt2340, local23.anInt2305, 0, local1267, 1);
												}
												Static176.aClass121_5.ca(arg1, arg5, arg6, arg7);
											} else if (local23.anInt2352 == 0 && local96 == 0) {
												if (local23.anInt2296 != 0) {
													local1224.method6512((float) local88 + (float) local23.anInt2340 / 2.0F, (float) local93 + (float) local23.anInt2305 / 2.0F, local23.anInt2340 * 4096 / local242, local23.anInt2296);
												} else if (local23.anInt2340 == local242 && local491 == local23.anInt2305) {
													local1224.method6514(local88, local93);
												} else {
													local1224.method6509(local88, local93, local23.anInt2340, local23.anInt2305);
												}
											} else if (local23.anInt2296 != 0) {
												local1224.method6515((float) local23.anInt2340 / 2.0F + (float) local88, (float) local23.anInt2305 / 2.0F + (float) local93, local23.anInt2340 * 4096 / local242, local23.anInt2296, local1267);
											} else if (local242 == local23.anInt2340 && local23.anInt2305 == local491) {
												local1224.I(local88, local93, 0, local1267, 1);
											} else {
												local1224.KA(local88, local93, local23.anInt2340, local23.anInt2305, 0, local1267, 1);
											}
										} else if (Static371.aBoolean441) {
											Static390.method5794(local23);
										}
									}
								} else if (local23.anInt2264 == 6) {
									Static422.method6198();
									@Pc(1583) Class22 local1583 = null;
									local242 = 0;
									@Pc(1689) Class108 local1689;
									@Pc(1699) Class246 local1699;
									if (local23.anInt2277 != -1) {
										@Pc(1797) Class110 local1797 = Static295.aClass256_2.method5924(local23.anInt2277);
										if (local1797 != null) {
											local1797 = local1797.method2199(local23.anInt2329);
											local1689 = local23.anInt2310 == -1 ? null : Static31.aClass345_1.method7798(local23.anInt2310);
											local1699 = local23.aBoolean148 ? Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1 : null;
											local1583 = local1797.method2196(2048, Static176.aClass121_5, 1, local23.anInt2304, local23.anInt2287, local23.anInt2272, local1699, local1689);
											if (local1583 == null) {
												Static390.method5794(local23);
											} else {
												local242 = -local1583.DA() >> 1;
											}
										}
									} else if (local23.anInt2262 == 5) {
										local491 = local23.anInt2263;
										if (local491 >= 0 && local491 < 2048) {
											@Pc(1608) Class29_Sub2_Sub1_Sub2 local1608 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local491];
											@Pc(1620) Class108 local1620 = local23.anInt2310 == -1 ? null : Static31.aClass345_1.method7798(local23.anInt2310);
											if (local1608 != null && (local491 == Static44.anInt711 || Static194.method2914(local1608.aString108) == local23.anInt2273)) {
												local1583 = local1608.aClass246_1.method5781(Static505.aClass30_1, 0, Static31.aClass345_1, -1, local23.anInt2287, null, null, Static51.aClass202_1, Static78.aClass344_1, Static176.aClass121_5, local1620, 0, 2048, local23.anInt2272, Static492.aClass189_1, Static295.aClass256_2, local23.anInt2304);
											}
										}
									} else if (local23.anInt2262 == 8 || local23.anInt2262 == 9) {
										@Pc(1677) Class6_Sub13 local1677 = Static59.method44(local23.anInt2263, false);
										local1689 = local23.anInt2310 == -1 ? null : Static31.aClass345_1.method7798(local23.anInt2310);
										if (local1677 != null) {
											local1699 = local23.aBoolean148 ? Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1 : null;
											local1583 = local1677.method1294(local23.anInt2304, Static176.aClass121_5, local23.anInt2262 == 9, local1699, local23.anInt2272, local23.anInt2287, local1689, local23.anInt2273);
										}
									} else if (local23.anInt2310 == -1) {
										local1583 = local23.method1984(Static295.aClass256_2, Static31.aClass345_1, 0, null, Static51.aClass202_1, Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1, Static505.aClass30_1, Static492.aClass189_1, -1, -1, 2048, Static176.aClass121_5, Static78.aClass344_1);
										if (local1583 == null && Static371.aBoolean441) {
											Static390.method5794(local23);
										}
									} else {
										@Pc(1762) Class108 local1762 = Static31.aClass345_1.method7798(local23.anInt2310);
										local1583 = local23.method1984(Static295.aClass256_2, Static31.aClass345_1, local23.anInt2272, local1762, Static51.aClass202_1, Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1, Static505.aClass30_1, Static492.aClass189_1, local23.anInt2304, local23.anInt2287, 2048, Static176.aClass121_5, Static78.aClass344_1);
										if (local1583 == null && Static371.aBoolean441) {
											Static390.method5794(local23);
										}
									}
									if (local1583 != null) {
										if (local23.anInt2318 > 0) {
											local491 = (local23.anInt2340 << 9) / local23.anInt2318;
										} else {
											local491 = 512;
										}
										if (local23.anInt2293 <= 0) {
											local1267 = 512;
										} else {
											local1267 = (local23.anInt2305 << 9) / local23.anInt2293;
										}
										local524 = local88 + local23.anInt2340 / 2 + (local491 * local23.anInt2280 >> 9);
										local526 = (local1267 * local23.anInt2350 >> 9) + local93 + local23.anInt2305 / 2;
										Static90.aClass34_8.Y();
										Static176.aClass121_5.method7112(Static90.aClass34_8);
										Static176.aClass121_5.m(local524, local526, local491, local1267);
										Static176.aClass121_5.ka((float) (local23.anInt2282 << 2), local23.aBoolean152 ? (float) (local23.anInt2326 << 2) : (float) (local23.anInt2326 << 2) * 1.5F);
										if (arg4 == -1412584499 || Static364.aBoolean436) {
											Static176.aClass121_5.F();
											Static176.aClass121_5.method7084();
											Static176.aClass121_5.ca(arg1, arg5, arg6, arg7);
											Static364.aBoolean436 = false;
										}
										if (local23.aBoolean162) {
											Static176.aClass121_5.method7129(false);
										}
										local535 = Class138.anIntArray392[local23.anInt2322 << 3] * (local23.anInt2312 << 2) >> 14;
										local634 = Class138.anIntArray393[local23.anInt2322 << 3] * (local23.anInt2312 << 2) >> 14;
										Static19.aClass34_9.ra(-local23.anInt2351 << 3);
										Static19.aClass34_9.P(local23.anInt2279 << 3);
										Static19.aClass34_9.G(local23.anInt2266 << 2, local535 + (local23.anInt2332 << 2) + local242, (local23.anInt2332 << 2) + local634);
										Static19.aClass34_9.S(local23.anInt2322 << 3);
										local23.method1974(Static19.aClass34_9, local1583, Static358.anInt6263, Static176.aClass121_5);
										if (Static14.aBoolean11) {
											Static176.aClass121_5.Q(local88, local93, local23.anInt2340 + local88, local93 + local23.anInt2305);
										}
										if (local23.aBoolean152) {
											local1583.method4702(Static19.aClass34_9, null, local23.anInt2312 << 2);
										} else if (local23.aClass102_Sub6_3 == null) {
											local1583.method4689(Static19.aClass34_9, null, 1);
										} else {
											Static176.aClass121_5.method7118(local1583, local23.aClass102_Sub6_3.method6840(), Static19.aClass34_9, null, 1);
										}
										if (Static14.aBoolean11) {
											Static176.aClass121_5.ca(arg1, arg5, arg6, arg7);
										}
										if (local23.aBoolean162) {
											Static176.aClass121_5.method7129(true);
										}
										Static176.aClass121_5.ka(0.0F, 0.0F);
									}
								} else if (local23.anInt2264 == 9) {
									if (local23.aBoolean161) {
										local242 = local93 + local23.anInt2305;
										local491 = local23.anInt2340 + local88;
										local1267 = local93;
									} else {
										local491 = local88 + local23.anInt2340;
										local1267 = local23.anInt2305 + local93;
										local242 = local93;
									}
									if (local23.anInt2348 == 1) {
										Static176.aClass121_5.method7094(local88, local242, local491, local1267, local23.anInt2352, 0);
									} else {
										Static176.aClass121_5.method7154(local88, local242, local491, local1267, local23.anInt2352, local23.anInt2348);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)I")
	public static int method6280(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!lb;Lclient!maa;ILclient!oa;II)Z")
	public static boolean method6281(@OriginalArg(0) Class179 arg0, @OriginalArg(1) Class6_Sub34 arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray449 != null) {
			local9 = Static349.anInt7459 + (Static349.anInt7460 - Static349.anInt7459) * (arg1.anInt4906 + (arg0.anInt4588 - Static349.anInt7461)) / (Static349.anInt7462 - Static349.anInt7461);
			local13 = Static349.anInt7456 - (Static349.anInt7456 - Static349.anInt7464) * (arg0.anInt4597 + arg1.anInt4905 - Static349.anInt7467) / (Static349.anInt7458 - Static349.anInt7467);
			local7 = (arg1.anInt4906 + arg0.anInt4598 - Static349.anInt7461) * (Static349.anInt7460 - Static349.anInt7459) / (Static349.anInt7462 - Static349.anInt7461) + Static349.anInt7459;
			local11 = Static349.anInt7456 - (arg1.anInt4905 + arg0.anInt4593 - Static349.anInt7467) * (Static349.anInt7456 - Static349.anInt7464) / (Static349.anInt7458 - Static349.anInt7467);
		}
		@Pc(100) Class4 local100 = null;
		@Pc(102) int local102 = 0;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		if (arg0.anInt4581 != -1) {
			if (arg1.aBoolean294 && arg0.anInt4599 != -1) {
				local100 = arg0.method3964(arg2, true);
			} else {
				local100 = arg0.method3964(arg2, false);
			}
			if (local100 != null) {
				local102 = arg1.anInt4908 - (local100.AA() + 1 >> 1);
				local104 = arg1.anInt4908 + (local100.AA() + 1 >> 1);
				if (local7 > local102) {
					local7 = local102;
				}
				local106 = arg1.anInt4911 - (local100.a() + 1 >> 1);
				if (local9 < local104) {
					local9 = local104;
				}
				local108 = arg1.anInt4911 + (local100.a() + 1 >> 1);
				if (local11 > local106) {
					local11 = local106;
				}
				if (local13 < local108) {
					local13 = local108;
				}
			}
		}
		@Pc(211) Class85 local211 = null;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(274) int local274;
		@Pc(297) int local297;
		if (arg0.aString63 != null) {
			local211 = Static516.method7314(arg0.anInt4595);
			if (local211 != null) {
				local213 = Static383.aClass146_9.method3172(arg0.aString63, Static533.aStringArray35, null, null);
				local215 = arg1.anInt4911;
				if (local100 == null) {
					local215 -= local213 * local211.method1786() / 2;
				} else {
					local215 -= (local100.a() >> 1) + local213 * local211.method1783();
				}
				for (local274 = 0; local274 < local213; local274++) {
					@Pc(280) String local280 = Static533.aStringArray35[local274];
					if (local213 - 1 > local274) {
						local280 = local280.substring(0, local280.length() - 4);
					}
					local297 = local211.method1788(local280);
					if (local297 > local217) {
						local217 = local297;
					}
				}
				local219 = arg1.anInt4908 - local217 / 2;
				local221 = local217 / 2 + arg1.anInt4908;
				if (local219 < local7) {
					local7 = local219;
				}
				local223 = local215;
				if (local9 < local221) {
					local9 = local221;
				}
				if (local11 > local223) {
					local11 = local223;
				}
				local225 = local213 * local211.method1783() + local215;
				if (local13 < local225) {
					local13 = local225;
				}
			}
		}
		if (local9 < Static349.anInt7459 || local7 > Static349.anInt7460 || local13 < Static349.anInt7464 || local11 > Static349.anInt7456) {
			return true;
		}
		@Pc(404) int local404;
		if (arg0.anIntArray449 != null) {
			@Pc(402) int[] local402 = new int[arg0.anIntArray449.length];
			for (local404 = 0; local404 < local402.length / 2; local404++) {
				local297 = arg1.anInt4906 + arg0.anIntArray449[local404 * 2];
				@Pc(428) int local428 = arg1.anInt4905 + arg0.anIntArray449[local404 * 2 + 1];
				local402[local404 * 2] = (local297 - Static349.anInt7461) * (-Static349.anInt7459 + Static349.anInt7460) / (Static349.anInt7462 - Static349.anInt7461) + Static349.anInt7459;
				local402[local404 * 2 + 1] = Static349.anInt7456 - (Static349.anInt7456 - Static349.anInt7464) * (local428 + -Static349.anInt7467) / (Static349.anInt7458 - Static349.anInt7467);
			}
			Static233.method3420(arg2, local402, arg0.anInt4578);
			for (local297 = 0; local297 < local402.length / 2 - 1; local297++) {
				arg2.method7149(arg0.anInt4586, local402[(local297 + 1) * 2], local402[(local297 + 1) * 2 + 1], local402[local297 * 2 + 1], local402[local297 * 2]);
			}
			arg2.method7149(arg0.anInt4586, local402[0], local402[1], local402[local402.length - 1], local402[local402.length - 2]);
		}
		if (local100 != null) {
			if (Static102.anInt1883 > 0 && (Static492.anInt8232 != -1 && Static492.anInt8232 == arg1.anInt4907 || Static20.anInt364 != -1 && arg0.anInt4584 == Static20.anInt364)) {
				if (Static104.anInt1939 > 50) {
					local274 = (100 - Static104.anInt1939) * 2;
				} else {
					local274 = Static104.anInt1939 * 2;
				}
				local404 = local274 << 24 | 0xFFFF00;
				arg2.method7106(local404, arg1.anInt4908, arg1.anInt4911, local100.QA() / 2 + 7);
				arg2.method7106(local404, arg1.anInt4908, arg1.anInt4911, local100.QA() / 2 + 5);
				arg2.method7106(local404, arg1.anInt4908, arg1.anInt4911, local100.QA() / 2 + 3);
				arg2.method7106(local404, arg1.anInt4908, arg1.anInt4911, local100.QA() / 2 + 1);
				arg2.method7106(local404, arg1.anInt4908, arg1.anInt4911, local100.QA() / 2);
			}
			local100.method6514(arg1.anInt4908 - (local100.AA() >> 1), arg1.anInt4911 + -(local100.a() >> 1));
		}
		if (arg0.aString63 != null && local211 != null) {
			Static182.method2732(local217, local213, arg2, arg0, arg1, local215, local211);
		}
		if (arg0.anInt4581 != -1 || arg0.aString63 != null) {
			@Pc(717) Class6_Sub17 local717 = new Class6_Sub17(arg1);
			local717.anInt1870 = local221;
			local717.anInt1860 = local102;
			local717.anInt1864 = local225;
			local717.anInt1871 = local219;
			local717.anInt1868 = local108;
			local717.anInt1867 = local106;
			local717.anInt1866 = local104;
			local717.anInt1865 = local223;
			Static553.aClass275_194.method6370(local717);
		}
		return false;
	}
}
