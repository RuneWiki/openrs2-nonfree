import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wm", name = "Fb", descriptor = "Lclient!uk;")
	public static Class247 aClass247_1;

	@OriginalMember(owner = "client!wm", name = "Gb", descriptor = "[[I")
	public static final int[][] anIntArrayArray186 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[Lclient!gi;IIIIII)V")
	public static void method6176(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class93[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static257.aClass75_8.ba(arg4, arg0, arg8, arg1);
		for (@Pc(13) int local13 = 0; local13 < arg2.length; local13++) {
			@Pc(19) Class93 local19 = arg2[local13];
			if (local19 != null && (arg6 == local19.anInt2426 || arg6 == -1412584499 && Static125.aClass93_11 == local19)) {
				@Pc(59) int local59;
				if (arg3 == -1) {
					Class2_Sub2_Sub9.aRectangleArray1[Static153.anInt2793].setBounds(local19.anInt2460 + arg7, arg5 + local19.anInt2448, local19.anInt2436, local19.anInt2495);
					local59 = Static153.anInt2793++;
				} else {
					local59 = arg3;
				}
				local19.anInt2476 = Static277.anInt5022;
				local19.anInt2449 = local59;
				if (!Static53.method876(local19)) {
					if (local19.anInt2469 != 0) {
						Static236.method3225(local19);
					}
					@Pc(84) int local84 = local19.anInt2460 + arg7;
					@Pc(90) int local90 = local19.anInt2448 + arg5;
					@Pc(93) int local93 = local19.anInt2485;
					if (Static464.aBoolean176 && (Static53.method860(local19).anInt7337 != 0 || local19.anInt2494 == 0) && local93 > 127) {
						local93 = 127;
					}
					@Pc(149) int local149;
					@Pc(153) int local153;
					if (Static125.aClass93_11 == local19) {
						if (arg6 != -1412584499 && (local19.anInt2457 == Static271.anInt4926 || Static313.anInt5628 == local19.anInt2457)) {
							Static428.anInt7260 = arg5;
							Static427.aClass93Array2 = arg2;
							Static260.anInt4602 = arg7;
							continue;
						}
						if (Static191.aBoolean214 && Static227.aBoolean255) {
							local149 = Static196.aClass126_1.method5366();
							local153 = Static196.aClass126_1.method5364();
							local149 -= Static86.anInt1457;
							local153 -= Static321.anInt5761;
							if (local149 < Static146.anInt2670) {
								local149 = Static146.anInt2670;
							}
							if (Static146.anInt2670 + Static148.aClass93_8.anInt2436 < local149 - -local19.anInt2436) {
								local149 = Static148.aClass93_8.anInt2436 + Static146.anInt2670 - local19.anInt2436;
							}
							if (local153 < Static20.anInt410) {
								local153 = Static20.anInt410;
							}
							local84 = local149;
							if (Static20.anInt410 + Static148.aClass93_8.anInt2495 < local153 - -local19.anInt2495) {
								local153 = Static148.aClass93_8.anInt2495 + Static20.anInt410 - local19.anInt2495;
							}
							local90 = local153;
						}
						if (local19.anInt2457 == Static313.anInt5628) {
							local93 = 128;
						}
					}
					@Pc(290) int local290;
					@Pc(279) int local279;
					@Pc(237) int local237;
					@Pc(242) int local242;
					if (local19.anInt2494 == 2) {
						local290 = arg8;
						local279 = arg1;
						local149 = arg4;
						local153 = arg0;
					} else {
						local237 = local84 + local19.anInt2436;
						local242 = local19.anInt2495 + local90;
						if (local19.anInt2494 == 9) {
							local242++;
							local237++;
						}
						local149 = arg4 >= local84 ? arg4 : local84;
						local153 = local90 <= arg0 ? arg0 : local90;
						local279 = arg1 > local242 ? local242 : arg1;
						local290 = local237 < arg8 ? local237 : arg8;
					}
					if (local149 < local290 && local279 > local153) {
						@Pc(538) int local538;
						@Pc(586) int local586;
						@Pc(610) int local610;
						@Pc(504) int local504;
						@Pc(536) int local536;
						if (local19.anInt2469 != 0) {
							if (Static414.anInt7109 == local19.anInt2469 || local19.anInt2469 == Static141.anInt7047) {
								Static456.method6188(local19.anInt2469 == Static141.anInt7047, local84, local90, local19.anInt2436, local19.anInt2495);
								Static186.aBooleanArray12[local59] = true;
								Static257.aClass75_8.ba(arg4, arg0, arg8, arg1);
								continue;
							}
							if (local19.anInt2469 == Static64.anInt1149) {
								if (local19.method2124(Static257.aClass75_8) != null) {
									Static230.method3117();
									Static464.method2324(local84, Static257.aClass75_8, local19, local90);
									Static120.aBooleanArray3[local59] = true;
									Static257.aClass75_8.ba(arg4, arg0, arg8, arg1);
								}
								continue;
							}
							if (local19.anInt2469 == Static278.anInt5038) {
								if (local19.method2124(Static257.aClass75_8) != null) {
									Static361.method5084(local84, local90, local19);
									Static120.aBooleanArray3[local59] = true;
									Static257.aClass75_8.ba(arg4, arg0, arg8, arg1);
								}
								continue;
							}
							if (local19.anInt2469 == Static417.anInt7159) {
								Static47.method734(local19.anInt2436, local19.anInt2495, Static396.anInterface7_6, local84, Static257.aClass75_8, local90);
								Static186.aBooleanArray12[local59] = true;
								Static257.aClass75_8.ba(arg4, arg0, arg8, arg1);
								continue;
							}
							if (local19.anInt2469 == Static45.anInt720) {
								Static333.method4745(local90, Static257.aClass75_8, local84, local19.anInt2436, local19.anInt2495);
								Static186.aBooleanArray12[local59] = true;
								Static257.aClass75_8.ba(arg4, arg0, arg8, arg1);
								continue;
							}
							if (Static3.anInt72 == local19.anInt2469) {
								if (!Static441.aBoolean501 && !Static123.aBoolean129) {
									continue;
								}
								local237 = local84 + local19.anInt2436;
								local242 = local90 + 15;
								if (Static441.aBoolean501) {
									local504 = -256;
									if (Static431.anInt7307 < 20) {
										local504 = -65536;
									}
									Static11.aClass14_1.method4882(local504, local237, local242, "Fps:" + Static431.anInt7307);
									local242 += 15;
									@Pc(526) Runtime local526 = Runtime.getRuntime();
									local536 = (int) ((local526.totalMemory() - local526.freeMemory()) / 1024L);
									local538 = -256;
									if (local536 > 65536) {
										local538 = -65536;
									}
									Static11.aClass14_1.method4882(local538, local237, local242, "Mem:" + local536 + "k");
									local242 += 15;
									Static11.aClass14_1.method4882(-256, local237, local242, "In:" + Static404.anInt2751 + "B/s Out:" + Static216.anInt7641 + "B/s");
									local242 += 15;
									local586 = Static257.aClass75_8.pa() / 1024;
									Static11.aClass14_1.method4882(local586 > 65536 ? -65536 : -256, local237, local242, "Offheap:" + local586 + "k");
									local242 += 15;
									local610 = 0;
									@Pc(612) int local612 = 0;
									@Pc(614) int local614 = 0;
									for (@Pc(616) int local616 = 0; local616 < 30; local616++) {
										local610 += Static156.aClass10_Sub1Array1[local616].method5092();
										local612 += Static156.aClass10_Sub1Array1[local616].method5091();
										local614 += Static156.aClass10_Sub1Array1[local616].method5086();
									}
									@Pc(654) int local654 = local614 * 100 / local610;
									@Pc(660) int local660 = local612 * 10000 / local610;
									@Pc(680) String local680 = "Cache:" + Static64.method1050((long) local660, 0, true, 2) + "% (" + local654 + "%)";
									Static352.aClass14_3.method4882(-256, local237, local242, local680);
									local242 += 12;
								}
								if (Static313.anInt5629 > 0) {
									Static352.aClass14_3.method4882(-256, local237, local242, "Particles: " + Static358.anInt7402 + " / " + Static313.anInt5629);
								}
								local242 += 12;
								if (Static123.aBoolean129) {
									Static352.aClass14_3.method4882(-256, local237, local242, "Polys: " + Static257.aClass75_8.OA() + " Models: " + Static257.aClass75_8.Y());
									local242 += 12;
									Static352.aClass14_3.method4882(-256, local237, local242, "Ls: " + Static176.anInt3132 + " La: " + Static397.anInt6875 + " NPC: " + Static127.anInt2141 + " Pl: " + Static265.anInt4444);
									Static119.method1941();
									local242 += 12;
								}
								Static186.aBooleanArray12[local59] = true;
								continue;
							}
						}
						if (local19.anInt2494 == 0) {
							if (local19.anInt2469 == Static319.anInt5722 && Static257.aClass75_8.method5972()) {
								Static257.aClass75_8.method5997(local84, local90, local19.anInt2436, local19.anInt2495);
							}
							method6176(local153, local279, arg2, local59, local149, local90 - local19.anInt2435, local19.anInt2508, local84 - local19.anInt2451, local290);
							if (local19.aClass93Array1 != null) {
								method6176(local153, local279, local19.aClass93Array1, local59, local149, local90 - local19.anInt2435, local19.anInt2508, local84 - local19.anInt2451, local290);
							}
							@Pc(841) Class2_Sub9 local841 = (Class2_Sub9) Static394.aClass220_45.method5099((long) local19.anInt2508);
							if (local841 != null) {
								Static365.method3531(local841.anInt1143, local84, local290, local59, local90, local279, local149, local153);
							}
							if (Static319.anInt5722 == local19.anInt2469 && Static257.aClass75_8.method5972()) {
								Static257.aClass75_8.method5992();
								Static142.aBoolean166 = true;
							}
							Static257.aClass75_8.ba(arg4, arg0, arg8, arg1);
						}
						if (Static316.aBooleanArray20[local59] || Static407.anInt7039 > 1) {
							if (local19.anInt2494 == 3) {
								if (local93 == 0) {
									if (local19.aBoolean151) {
										Static257.aClass75_8.P(local84, local90, local19.anInt2436, local19.anInt2495, local19.anInt2439, 0);
									} else {
										Static257.aClass75_8.method5979(local84, local90, local19.anInt2436, local19.anInt2495, local19.anInt2439, 0);
									}
								} else if (local19.aBoolean151) {
									Static257.aClass75_8.P(local84, local90, local19.anInt2436, local19.anInt2495, 255 - (local93 & 0xFF) << 24 | local19.anInt2439 & 0xFFFFFF, 1);
								} else {
									Static257.aClass75_8.method5979(local84, local90, local19.anInt2436, local19.anInt2495, local19.anInt2439 & 0xFFFFFF | 255 - (local93 & 0xFF) << 24, 1);
								}
							} else if (local19.anInt2494 == 4) {
								@Pc(982) Class14 local982 = local19.method2128(Static257.aClass75_8);
								if (local982 != null) {
									local242 = local19.anInt2439;
									@Pc(997) String local997 = local19.aString24;
									if (local19.anInt2488 != -1) {
										@Pc(1007) Class218 local1007 = Static413.aClass271_2.method6193(local19.anInt2488);
										local997 = local1007.aString65;
										if (local997 == null) {
											local997 = "null";
										}
										if ((local1007.anInt6274 == 1 || local19.anInt2466 != 1) && local19.anInt2466 != -1) {
											local997 = "<col=ff9040>" + local997 + "</col> x" + Static82.method3172(local19.anInt2466);
										}
									}
									if (Static361.aClass93_17 == local19) {
										local997 = Static426.aClass231_120.method5261(Static80.anInt6195);
										local242 = local19.anInt2439;
									}
									if (Static318.aBoolean402) {
										Static257.aClass75_8.HA(local84, local90, local84 + local19.anInt2436, local19.anInt2495 + local90);
									}
									local982.method4897(null, 0, local997, local19.anInt2497, local19.aBoolean162 ? 255 - (local93 & 0xFF) << 24 : -1, Static179.aClass41Array3, null, local84, 255 - (local93 & 0xFF) << 24 | local242, local19.anInt2436, 0, local19.anInt2458, local19.anInt2473, local19.anInt2427, local19.anInt2495, local90);
									if (Static318.aBoolean402) {
										Static257.aClass75_8.ba(arg4, arg0, arg8, arg1);
									}
								} else if (Static293.aBoolean367) {
									Static383.method5263(local19);
								}
							} else {
								@Pc(1234) int local1234;
								if (local19.anInt2494 == 5) {
									if (local19.anInt2454 >= 0) {
										local19.method2119(Static388.aClass35_1, Static174.aClass147_1).method5668(local19.anInt2445 << 3, local19.anInt2429 << 3, local19.anInt2495, local19.anInt2436, 0, 0, local90, Static257.aClass75_8, local84);
									} else {
										@Pc(1195) Class41 local1195;
										if (local19.anInt2488 == -1) {
											local1195 = local19.method2120(Static257.aClass75_8);
										} else {
											@Pc(1177) Class26 local1177 = local19.aBoolean154 ? Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1 : null;
											local1195 = Static413.aClass271_2.method6190(local19.anInt2506 | 0xFF000000, Static257.aClass75_8, local19.anInt2434, local19.anInt2488, local19.anInt2432, local1177, local19.anInt2466);
										}
										if (local1195 != null) {
											local242 = local1195.RA();
											local504 = local1195.Q();
											local1234 = (local19.anInt2439 == 0 ? 16777215 : local19.anInt2439 & 0xFFFFFF) | 255 - (local93 & 0xFF) << 24;
											if (local19.aBoolean153) {
												Static257.aClass75_8.HA(local84, local90, local19.anInt2436 + local84, local19.anInt2495 + local90);
												if (local19.anInt2501 != 0) {
													local536 = (local242 + local19.anInt2436 - 1) / local242;
													local538 = (local504 + local19.anInt2495 - 1) / local504;
													for (local586 = 0; local586 < local536; local586++) {
														for (local610 = 0; local610 < local538; local610++) {
															if (local19.anInt2439 == 0) {
																local1195.method6084((float) local242 / 2.0F + (float) (local586 * local242 + local84), (float) (local504 * local610 + local90) + (float) local504 / 2.0F, 4096, local19.anInt2501);
															} else {
																local1195.method6083((float) (local242 * local586 + local84) + (float) local242 / 2.0F, (float) (local90 + local610 * local504) + (float) local504 / 2.0F, 4096, local19.anInt2501, local1234);
															}
														}
													}
												} else if (local19.anInt2439 == 0 && local93 == 0) {
													local1195.method6085(local84, local90, local19.anInt2436, local19.anInt2495);
												} else {
													local1195.la(local84, local90, local19.anInt2436, local19.anInt2495, 0, local1234, 1);
												}
												Static257.aClass75_8.ba(arg4, arg0, arg8, arg1);
											} else if (local19.anInt2439 == 0 && local93 == 0) {
												if (local19.anInt2501 != 0) {
													local1195.method6084((float) local19.anInt2436 / 2.0F + (float) local84, (float) local19.anInt2495 / 2.0F + (float) local90, local19.anInt2436 * 4096 / local242, local19.anInt2501);
												} else if (local242 == local19.anInt2436 && local504 == local19.anInt2495) {
													local1195.method6090(local84, local90);
												} else {
													local1195.method6089(local84, local90, local19.anInt2436, local19.anInt2495);
												}
											} else if (local19.anInt2501 != 0) {
												local1195.method6083((float) local19.anInt2436 / 2.0F + (float) local84, (float) local19.anInt2495 / 2.0F + (float) local90, local19.anInt2436 * 4096 / local242, local19.anInt2501, local1234);
											} else if (local19.anInt2436 == local242 && local504 == local19.anInt2495) {
												local1195.W(local84, local90, 0, local1234, 1);
											} else {
												local1195.ya(local84, local90, local19.anInt2436, local19.anInt2495, 0, local1234, 1);
											}
										} else if (Static293.aBoolean367) {
											Static383.method5263(local19);
										}
									}
								} else if (local19.anInt2494 == 6) {
									Static236.method3224();
									@Pc(1545) Class63 local1545 = null;
									local242 = 0;
									@Pc(1589) Class109 local1589;
									@Pc(1599) Class26 local1599;
									if (local19.anInt2488 != -1) {
										@Pc(1771) Class218 local1771 = Static413.aClass271_2.method6193(local19.anInt2488);
										if (local1771 != null) {
											local1771 = local1771.method5012(local19.anInt2466);
											local1589 = local19.anInt2428 == -1 ? null : Static37.aClass80_1.method1879(local19.anInt2428);
											local1599 = local19.aBoolean154 ? Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1 : null;
											local1545 = local1771.method4999(local19.anInt2455, 1, local1589, local19.anInt2433, local19.anInt2438, local1599, Static257.aClass75_8, 2048);
											if (local1545 == null) {
												Static383.method5263(local19);
											} else {
												local242 = -local1545.B() >> 1;
											}
										}
									} else if (local19.anInt2431 == 5) {
										local504 = local19.anInt2512;
										if (local504 >= 0 && local504 < 2048) {
											@Pc(1706) Class11_Sub5_Sub2_Sub1 local1706 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local504];
											@Pc(1718) Class109 local1718 = local19.anInt2428 == -1 ? null : Static37.aClass80_1.method1879(local19.anInt2428);
											if (local1706 != null && (Static94.anInt5592 == local504 || Static383.method5265(local1706.aString20) == local19.anInt2496)) {
												local1545 = local1706.aClass26_1.method515(null, Static413.aClass271_2, Static227.aClass54_2, local1718, 0, Static257.aClass262_1, Static257.aClass75_8, local19.anInt2438, 2048, local19.anInt2455, -1, Static421.aClass174_2, local19.anInt2433, 0, null, Static37.aClass80_1, Static63.aClass120_2);
											}
										}
									} else if (local19.anInt2431 == 8 || local19.anInt2431 == 9) {
										@Pc(1576) Class2_Sub12 local1576 = Static92.method1397(local19.anInt2512, false);
										local1589 = local19.anInt2428 == -1 ? null : Static37.aClass80_1.method1879(local19.anInt2428);
										if (local1576 != null) {
											local1599 = local19.aBoolean154 ? Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1 : null;
											local1545 = local1576.method2163(Static257.aClass75_8, local1589, local19.anInt2431 == 9, local19.anInt2433, local19.anInt2496, local1599, local19.anInt2455, local19.anInt2438);
										}
									} else if (local19.anInt2428 == -1) {
										local1545 = local19.method2114(Static257.aClass262_1, Static257.aClass75_8, null, -1, Static227.aClass54_2, Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1, Static37.aClass80_1, 0, Static421.aClass174_2, 2048, Static63.aClass120_2, Static413.aClass271_2, -1);
										if (local1545 == null && Static293.aBoolean367) {
											Static383.method5263(local19);
										}
									} else {
										@Pc(1635) Class109 local1635 = Static37.aClass80_1.method1879(local19.anInt2428);
										local1545 = local19.method2114(Static257.aClass262_1, Static257.aClass75_8, local1635, local19.anInt2455, Static227.aClass54_2, Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1, Static37.aClass80_1, local19.anInt2433, Static421.aClass174_2, 2048, Static63.aClass120_2, Static413.aClass271_2, local19.anInt2438);
										if (local1545 == null && Static293.aBoolean367) {
											Static383.method5263(local19);
										}
									}
									if (local1545 != null) {
										if (local19.anInt2479 > 0) {
											local504 = (local19.anInt2436 << 9) / local19.anInt2479;
										} else {
											local504 = 512;
										}
										if (local19.anInt2441 > 0) {
											local1234 = (local19.anInt2495 << 9) / local19.anInt2441;
										} else {
											local1234 = 512;
										}
										local536 = (local19.anInt2493 * local504 >> 9) + local84 + local19.anInt2436 / 2;
										local538 = local90 + local19.anInt2495 / 2 + (local19.anInt2470 * local1234 >> 9);
										Static186.aClass6_2.v();
										Static257.aClass75_8.SA(Static186.aClass6_2);
										Static257.aClass75_8.GA(local536, local538, local504, local1234);
										Static257.aClass75_8.da((float) (local19.anInt2484 << 0), local19.aBoolean157 ? (float) (local19.anInt2498 << 0) : (float) (local19.anInt2498 << 0) * 1.5F);
										if (arg6 == -1412584499 || Static142.aBoolean166) {
											Static257.aClass75_8.va();
											Static257.aClass75_8.method5963();
											Static257.aClass75_8.ba(arg4, arg0, arg8, arg1);
											Static142.aBoolean166 = false;
										}
										if (local19.aBoolean152) {
											Static257.aClass75_8.method5971(false);
										}
										local586 = Class229.anIntArray537[local19.anInt2462 << 3] * (local19.anInt2483 << 0) >> 15;
										local610 = Class229.anIntArray536[local19.anInt2462 << 3] * (local19.anInt2483 << 0) >> 15;
										Static190.aClass6_3.A(-local19.anInt2465 << 3);
										Static190.aClass6_3.EA(local19.anInt2474 << 3);
										Static190.aClass6_3.W(local19.anInt2502 << 0, local242 + (local19.anInt2491 << 0) + local586, local610 + (local19.anInt2491 << 0));
										Static190.aClass6_3.ea(local19.anInt2462 << 3);
										if (Static318.aBoolean402) {
											Static257.aClass75_8.HA(local84, local90, local84 + local19.anInt2436, local90 - -local19.anInt2495);
										}
										if (local19.aBoolean157) {
											local1545.method6287(Static190.aClass6_3, null, local19.anInt2483 << 0);
										} else {
											local1545.method6293(Static190.aClass6_3, null, 1);
										}
										if (Static318.aBoolean402) {
											Static257.aClass75_8.ba(arg4, arg0, arg8, arg1);
										}
										if (local19.aBoolean152) {
											Static257.aClass75_8.method5971(true);
										}
										Static257.aClass75_8.da(0.0F, 0.0F);
									}
								} else if (local19.anInt2494 == 9) {
									if (local19.aBoolean148) {
										local242 = local90 + local19.anInt2495;
										local504 = local84 + local19.anInt2436;
										local1234 = local90;
									} else {
										local242 = local90;
										local504 = local19.anInt2436 + local84;
										local1234 = local19.anInt2495 + local90;
									}
									if (local19.anInt2505 == 1) {
										Static257.aClass75_8.method5962(local84, local242, local504, local1234, local19.anInt2439, 0);
									} else {
										Static257.aClass75_8.method6007(local84, local242, local504, local1234, local19.anInt2439, local19.anInt2505);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method6178(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) int local14 = arg4 % 8;
		@Pc(24) int local24;
		if (local14 == 0) {
			local24 = 0;
		} else {
			local24 = 8 - local14;
		}
		@Pc(37) int local37 = -((arg1 + 8 - 1) / 8);
		@Pc(47) int local47 = -((arg4 + 8 - 1) / 8);
		for (@Pc(49) int local49 = local37; local49 < 0; local49++) {
			for (@Pc(53) int local53 = local47; local53 < 0; local53++) {
				if (arg2[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local24;
			if (arg2[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg3;
		}
		return false;
	}
}
