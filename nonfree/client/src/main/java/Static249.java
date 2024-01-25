import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public static int anInt4441;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
	public static int anInt4440 = 0;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
	public static int anInt4442 = -1;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[Lclient!hm;IIIIIIII)V")
	public static void method3534(@OriginalArg(0) int arg0, @OriginalArg(1) Class107[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static186.aClass117_3.ba(arg8, arg6, arg7, arg5);
		for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
			@Pc(21) Class107 local21 = arg1[local13];
			if (local21 != null && (arg3 == local21.anInt2624 || arg3 == -1412584499 && local21 == Static364.aClass107_13)) {
				@Pc(66) int local66;
				if (arg0 == -1) {
					Class1_Sub29.aRectangleArray4[Static88.anInt1187].setBounds(arg2 + local21.anInt2594, arg4 + local21.anInt2618, local21.anInt2648, local21.anInt2606);
					local66 = Static88.anInt1187++;
				} else {
					local66 = arg0;
				}
				local21.anInt2580 = Static98.anInt1304;
				local21.anInt2665 = local66;
				if (!Static55.method764(local21)) {
					if (local21.anInt2588 != 0) {
						Static383.method4930(local21);
					}
					@Pc(92) int local92 = local21.anInt2594 + arg2;
					@Pc(97) int local97 = arg4 + local21.anInt2618;
					@Pc(100) int local100 = local21.anInt2655;
					if (Static312.aBoolean465 && (Static55.method767(local21).anInt3891 != 0 || local21.anInt2598 == 0) && local100 > 127) {
						local100 = 127;
					}
					@Pc(155) int local155;
					@Pc(159) int local159;
					if (local21 == Static364.aClass107_13) {
						if (arg3 != -1412584499 && (local21.anInt2651 == Static72.anInt1053 || Static274.anInt4727 == local21.anInt2651)) {
							Static137.aClass107Array1 = arg1;
							Static366.anInt5956 = arg4;
							Static71.anInt1036 = arg2;
							continue;
						}
						if (Static373.aBoolean642 && Static333.aBoolean496) {
							local155 = Static181.aClass224_1.method5613();
							local159 = Static181.aClass224_1.method5615();
							local159 -= Static456.anInt3744;
							local155 -= Static256.anInt4522;
							if (Static277.anInt4736 > local155) {
								local155 = Static277.anInt4736;
							}
							if (Static416.anInt6714 > local159) {
								local159 = Static416.anInt6714;
							}
							if (local155 + local21.anInt2648 > Static277.anInt4736 - -Static192.aClass107_9.anInt2648) {
								local155 = Static277.anInt4736 + Static192.aClass107_9.anInt2648 - local21.anInt2648;
							}
							local92 = local155;
							if (local21.anInt2606 + local159 > Static192.aClass107_9.anInt2606 + Static416.anInt6714) {
								local159 = Static416.anInt6714 + Static192.aClass107_9.anInt2606 - local21.anInt2606;
							}
							local97 = local159;
						}
						if (local21.anInt2651 == Static274.anInt4727) {
							local100 = 128;
						}
					}
					@Pc(288) int local288;
					@Pc(281) int local281;
					@Pc(235) int local235;
					@Pc(240) int local240;
					if (local21.anInt2598 == 2) {
						local155 = arg8;
						local281 = arg5;
						local159 = arg6;
						local288 = arg7;
					} else {
						local235 = local21.anInt2648 + local92;
						local240 = local97 + local21.anInt2606;
						local159 = local97 > arg6 ? local97 : arg6;
						if (local21.anInt2598 == 9) {
							local240++;
							local235++;
						}
						local155 = arg8 < local92 ? local92 : arg8;
						local281 = local240 < arg5 ? local240 : arg5;
						local288 = arg7 <= local235 ? arg7 : local235;
					}
					if (local155 < local288 && local281 > local159) {
						@Pc(493) int local493;
						@Pc(527) int local527;
						@Pc(579) int local579;
						@Pc(605) int local605;
						@Pc(525) int local525;
						if (local21.anInt2588 != 0) {
							if (Static286.anInt4796 == local21.anInt2588 || local21.anInt2588 == Static212.anInt3925) {
								Static385.method4961(Static212.anInt3925 == local21.anInt2588, local97, local92, local21.anInt2648, local21.anInt2606);
								Static179.aBooleanArray69[local66] = true;
								Static186.aClass117_3.ba(arg8, arg6, arg7, arg5);
								continue;
							}
							if (Static103.anInt6435 == local21.anInt2588) {
								if (local21.method2116(Static186.aClass117_3) != null) {
									Static459.method5910();
									Static54.method705(local21, Static186.aClass117_3, local97, local92);
									Static150.aBooleanArray107[local66] = true;
									Static186.aClass117_3.ba(arg8, arg6, arg7, arg5);
								}
								continue;
							}
							if (local21.anInt2588 == Static42.anInt629) {
								if (local21.method2116(Static186.aClass117_3) != null) {
									Static107.method1330(local21, local92, local97);
									Static150.aBooleanArray107[local66] = true;
									Static186.aClass117_3.ba(arg8, arg6, arg7, arg5);
								}
								continue;
							}
							if (local21.anInt2588 == Static380.anInt6112) {
								Static416.method5321(Static302.anInterface4_7, local21.anInt2648, Static186.aClass117_3, local97, local21.anInt2606, local92);
								Static179.aBooleanArray69[local66] = true;
								Static186.aClass117_3.ba(arg8, arg6, arg7, arg5);
								continue;
							}
							if (local21.anInt2588 == Static237.anInt4276) {
								Static260.method3630(local21.anInt2648, local97, local21.anInt2606, local92, Static186.aClass117_3);
								Static179.aBooleanArray69[local66] = true;
								Static186.aClass117_3.ba(arg8, arg6, arg7, arg5);
								continue;
							}
							if (Static56.anInt904 == local21.anInt2588) {
								if (!Static209.aBoolean360 && !Static305.aBoolean462) {
									continue;
								}
								local235 = local92 + local21.anInt2648;
								local240 = local97 + 15;
								if (Static209.aBoolean360) {
									local493 = -256;
									if (Static218.anInt3991 < 20) {
										local493 = -65536;
									}
									Static464.aClass137_8.method4594(local240, local235, "Fps:" + Static218.anInt3991, local493);
									local240 += 15;
									@Pc(515) Runtime local515 = Runtime.getRuntime();
									local525 = (int) ((local515.totalMemory() - local515.freeMemory()) / 1024L);
									local527 = -256;
									if (local525 > 65536) {
										local527 = -65536;
									}
									Static464.aClass137_8.method4594(local240, local235, "Mem:" + local525 + "k", local527);
									local240 += 15;
									Static464.aClass137_8.method4594(local240, local235, "In:" + Static15.anInt252 + "B/s Out:" + Static316.anInt5219 + "B/s", -256);
									local240 += 15;
									local579 = Static186.aClass117_3.pa() / 1024;
									Static464.aClass137_8.method4594(local240, local235, "Offheap:" + local579 + "k", local579 <= 65536 ? -256 : -65536);
									local240 += 15;
									local605 = 0;
									@Pc(607) int local607 = 0;
									@Pc(609) int local609 = 0;
									for (@Pc(611) int local611 = 0; local611 < 30; local611++) {
										local605 += Static109.aClass82_Sub1Array1[local611].method2277();
										local607 += Static109.aClass82_Sub1Array1[local611].method2272();
										local609 += Static109.aClass82_Sub1Array1[local611].method2269();
									}
									@Pc(649) int local649 = local609 * 100 / local605;
									@Pc(655) int local655 = local607 * 10000 / local605;
									@Pc(675) String local675 = "Cache:" + Static331.method4345(2, 0, true, (long) local655) + "% (" + local649 + "%)";
									Static300.aClass137_7.method4594(local240, local235, local675, -256);
									local240 += 12;
								}
								if (Static374.anInt6023 > 0) {
									Static300.aClass137_7.method4594(local240, local235, "Particles: " + Static408.anInt4869 + " / " + Static374.anInt6023, -256);
								}
								local240 += 12;
								if (Static305.aBoolean462) {
									Static300.aClass137_7.method4594(local240, local235, "Polys: " + Static186.aClass117_3.OA() + " Models: " + Static186.aClass117_3.Y(), -256);
									local240 += 12;
									Static300.aClass137_7.method4594(local240, local235, "Ls: " + Static227.anInt4114 + " La: " + Static275.anInt4732 + " NPC: " + Static248.anInt4432 + " Pl: " + Static178.anInt3199, -256);
									local240 += 12;
									Static385.method4958();
								}
								Static179.aBooleanArray69[local66] = true;
								continue;
							}
						}
						if (local21.anInt2598 == 0) {
							if (Static256.anInt4515 == local21.anInt2588 && Static186.aClass117_3.method5713()) {
								Static186.aClass117_3.method5687(local92, local97, local21.anInt2648, local21.anInt2606);
							}
							method3534(local66, arg1, local92 - local21.anInt2663, local21.anInt2660, local97 - local21.anInt2646, local281, local159, local288, local155);
							if (local21.aClass107Array2 != null) {
								method3534(local66, local21.aClass107Array2, local92 - local21.anInt2663, local21.anInt2660, local97 - local21.anInt2646, local281, local159, local288, local155);
							}
							@Pc(839) Class1_Sub37 local839 = (Class1_Sub37) Static462.aClass208_42.method4405((long) local21.anInt2660);
							if (local839 != null) {
								Static220.method3159(local288, local97, local839.anInt5481, local159, local155, local281, local92, local66);
							}
							if (local21.anInt2588 == Static256.anInt4515 && Static186.aClass117_3.method5713()) {
								Static186.aClass117_3.method5730();
								Static223.aBoolean510 = true;
							}
							Static186.aClass117_3.ba(arg8, arg6, arg7, arg5);
						}
						if (Static106.aBooleanArray162[local66] || Static202.anInt7380 > 1) {
							if (local21.anInt2598 == 3) {
								if (local100 == 0) {
									if (local21.aBoolean264) {
										Static186.aClass117_3.P(local92, local97, local21.anInt2648, local21.anInt2606, local21.anInt2584, 0);
									} else {
										Static186.aClass117_3.method5690(local92, local97, local21.anInt2648, local21.anInt2606, local21.anInt2584, 0);
									}
								} else if (local21.aBoolean264) {
									Static186.aClass117_3.P(local92, local97, local21.anInt2648, local21.anInt2606, local21.anInt2584 & 0xFFFFFF | 255 - (local100 & 0xFF) << 24, 1);
								} else {
									Static186.aClass117_3.method5690(local92, local97, local21.anInt2648, local21.anInt2606, 255 - (local100 & 0xFF) << 24 | local21.anInt2584 & 0xFFFFFF, 1);
								}
							} else if (local21.anInt2598 == 4) {
								@Pc(975) Class137 local975 = local21.method2103(Static186.aClass117_3);
								if (local975 != null) {
									local240 = local21.anInt2584;
									@Pc(990) String local990 = local21.aString26;
									if (local21.anInt2631 != -1) {
										@Pc(1000) Class135 local1000 = Static285.aClass226_2.method4788(local21.anInt2631);
										local990 = local1000.aString41;
										if (local990 == null) {
											local990 = "null";
										}
										if ((local1000.anInt3825 == 1 || local21.anInt2586 != 1) && local21.anInt2586 != -1) {
											local990 = "<col=ff9040>" + local990 + "</col> x" + Static285.method3786(local21.anInt2586);
										}
									}
									if (Static414.aClass107_15 == local21) {
										local990 = Class1_Sub29.aClass142_118.method3118(Static63.anInt981);
										local240 = local21.anInt2584;
									}
									if (Static118.aBoolean191) {
										Static186.aClass117_3.HA(local92, local97, local21.anInt2648 + local92, local21.anInt2606 + local97);
									}
									local975.method4593(Static251.aClass85Array7, local21.anInt2617, local21.anInt2593, local240 | 255 - (local100 & 0xFF) << 24, local21.anInt2606, local92, local21.aBoolean253 ? 255 - (local100 & 0xFF) << 24 : -1, null, 0, 0, local21.anInt2648, local21.anInt2667, local21.anInt2658, local990, null, local97);
									if (Static118.aBoolean191) {
										Static186.aClass117_3.ba(arg8, arg6, arg7, arg5);
									}
								} else if (Static435.aBoolean533) {
									Static260.method3633(local21);
								}
							} else {
								@Pc(1223) int local1223;
								if (local21.anInt2598 == 5) {
									if (local21.anInt2632 >= 0) {
										local21.method2110(Static202.aClass237_27, Static429.aClass126_1).method4171(0, Static186.aClass117_3, local21.anInt2606, 0, local97, local21.anInt2591 << 3, local92, local21.anInt2648, local21.anInt2610 << 3);
									} else {
										@Pc(1163) Class85 local1163;
										if (local21.anInt2631 == -1) {
											local1163 = local21.method2111(Static186.aClass117_3);
										} else {
											@Pc(1173) Class131 local1173 = local21.aBoolean263 ? Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1 : null;
											local1163 = Static285.aClass226_2.method4787(local21.anInt2586, local21.anInt2645, Static186.aClass117_3, local21.anInt2631, local21.anInt2641 | 0xFF000000, local1173, local21.anInt2587);
										}
										if (local1163 != null) {
											local240 = local1163.RA();
											local493 = local1163.Q();
											local1223 = 255 - (local100 & 0xFF) << 24 | (local21.anInt2584 == 0 ? 16777215 : local21.anInt2584 & 0xFFFFFF);
											if (local21.aBoolean259) {
												Static186.aClass117_3.HA(local92, local97, local21.anInt2648 + local92, local97 + local21.anInt2606);
												if (local21.anInt2639 != 0) {
													local525 = (local21.anInt2648 + local240 - 1) / local240;
													local527 = (local493 + local21.anInt2606 - 1) / local493;
													for (local579 = 0; local579 < local525; local579++) {
														for (local605 = 0; local605 < local527; local605++) {
															if (local21.anInt2584 == 0) {
																local1163.method5401((float) local240 / 2.0F + (float) (local240 * local579 + local92), (float) (local97 - -(local605 * local493)) + (float) local493 / 2.0F, 4096, local21.anInt2639);
															} else {
																local1163.method5407((float) local240 / 2.0F + (float) (local92 + local240 * local579), (float) local493 / 2.0F + (float) (local97 + local493 * local605), 4096, local21.anInt2639, local1223);
															}
														}
													}
												} else if (local21.anInt2584 == 0 && local100 == 0) {
													local1163.method5410(local92, local97, local21.anInt2648, local21.anInt2606);
												} else {
													local1163.la(local92, local97, local21.anInt2648, local21.anInt2606, 0, local1223, 1);
												}
												Static186.aClass117_3.ba(arg8, arg6, arg7, arg5);
											} else if (local21.anInt2584 == 0 && local100 == 0) {
												if (local21.anInt2639 != 0) {
													local1163.method5401((float) local92 + (float) local21.anInt2648 / 2.0F, (float) local21.anInt2606 / 2.0F + (float) local97, local21.anInt2648 * 4096 / local240, local21.anInt2639);
												} else if (local240 == local21.anInt2648 && local21.anInt2606 == local493) {
													local1163.method5406(local92, local97);
												} else {
													local1163.method5405(local92, local97, local21.anInt2648, local21.anInt2606);
												}
											} else if (local21.anInt2639 != 0) {
												local1163.method5407((float) local21.anInt2648 / 2.0F + (float) local92, (float) local97 + (float) local21.anInt2606 / 2.0F, local21.anInt2648 * 4096 / local240, local21.anInt2639, local1223);
											} else if (local240 == local21.anInt2648 && local21.anInt2606 == local493) {
												local1163.W(local92, local97, 0, local1223, 1);
											} else {
												local1163.ya(local92, local97, local21.anInt2648, local21.anInt2606, 0, local1223, 1);
											}
										} else if (Static435.aBoolean533) {
											Static260.method3633(local21);
										}
									}
								} else if (local21.anInt2598 == 6) {
									Static387.method4979();
									@Pc(1540) Class8 local1540 = null;
									local240 = 0;
									@Pc(1725) Class64 local1725;
									@Pc(1735) Class131 local1735;
									if (local21.anInt2631 != -1) {
										@Pc(1769) Class135 local1769 = Static285.aClass226_2.method4788(local21.anInt2631);
										if (local1769 != null) {
											local1769 = local1769.method3009(local21.anInt2586);
											local1725 = local21.anInt2647 == -1 ? null : Static402.aClass37_2.method665(local21.anInt2647);
											local1735 = local21.aBoolean263 ? Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1 : null;
											local1540 = local1769.method2991(local21.anInt2662, 1, local1735, local21.anInt2590, Static186.aClass117_3, local1725, local21.anInt2619, 2048);
											if (local1540 == null) {
												Static260.method3633(local21);
											} else {
												local240 = -local1540.B() >> 1;
											}
										}
									} else if (local21.anInt2615 == 5) {
										local493 = local21.anInt2596;
										if (local493 >= 0 && local493 < 2048) {
											@Pc(1565) Class11_Sub1_Sub3_Sub2 local1565 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local493];
											@Pc(1577) Class64 local1577 = local21.anInt2647 == -1 ? null : Static402.aClass37_2.method665(local21.anInt2647);
											if (local1565 != null && (local493 == Static220.anInt4038 || Static383.method4927(local1565.aString32) == local21.anInt2652)) {
												local1540 = local1565.aClass131_1.method2830(Static428.aClass196_1, Static186.aClass117_3, Static241.aClass97_1, Static32.aClass4_1, local21.anInt2590, 0, null, null, local21.anInt2662, Static106.aClass199_131, Static402.aClass37_2, -1, local1577, 0, local21.anInt2619, Static285.aClass226_2, 2048);
											}
										}
									} else if (local21.anInt2615 == 8 || local21.anInt2615 == 9) {
										@Pc(1712) Class1_Sub28 local1712 = Static133.method1698(false, local21.anInt2596);
										local1725 = local21.anInt2647 == -1 ? null : Static402.aClass37_2.method665(local21.anInt2647);
										if (local1712 != null) {
											local1735 = local21.aBoolean263 ? Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1 : null;
											local1540 = local1712.method3227(local1735, local21.anInt2652, local21.anInt2619, Static186.aClass117_3, local1725, local21.anInt2590, local21.anInt2662, local21.anInt2615 == 9);
										}
									} else if (local21.anInt2647 == -1) {
										local1540 = local21.method2106(-1, Static32.aClass4_1, Static402.aClass37_2, Static106.aClass199_131, Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1, Static285.aClass226_2, 0, null, Static186.aClass117_3, Static428.aClass196_1, Static241.aClass97_1, 2048, -1);
										if (local1540 == null && Static435.aBoolean533) {
											Static260.method3633(local21);
										}
									} else {
										@Pc(1675) Class64 local1675 = Static402.aClass37_2.method665(local21.anInt2647);
										local1540 = local21.method2106(local21.anInt2590, Static32.aClass4_1, Static402.aClass37_2, Static106.aClass199_131, Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1, Static285.aClass226_2, local21.anInt2619, local1675, Static186.aClass117_3, Static428.aClass196_1, Static241.aClass97_1, 2048, local21.anInt2662);
										if (local1540 == null && Static435.aBoolean533) {
											Static260.method3633(local21);
										}
									}
									if (local1540 != null) {
										if (local21.anInt2602 <= 0) {
											local493 = 512;
										} else {
											local493 = (local21.anInt2648 << 9) / local21.anInt2602;
										}
										if (local21.anInt2616 > 0) {
											local1223 = (local21.anInt2606 << 9) / local21.anInt2616;
										} else {
											local1223 = 512;
										}
										local525 = (local493 * local21.anInt2625 >> 9) + (local92 + (local21.anInt2648 / 2));
										local527 = (local21.anInt2613 * local1223 >> 9) + local21.anInt2606 / 2 + local97;
										Static329.aClass34_5.v();
										Static186.aClass117_3.SA(Static329.aClass34_5);
										Static186.aClass117_3.GA(local525, local527, local493, local1223);
										Static186.aClass117_3.da((float) (local21.anInt2634 << 0), local21.aBoolean261 ? (float) (local21.anInt2604 << 0) : (float) (local21.anInt2604 << 0) * 1.5F);
										if (arg3 == -1412584499 || Static223.aBoolean510) {
											Static186.aClass117_3.va();
											Static186.aClass117_3.method5665();
											Static186.aClass117_3.ba(arg8, arg6, arg7, arg5);
											Static223.aBoolean510 = false;
										}
										if (local21.aBoolean257) {
											Static186.aClass117_3.method5677(false);
										}
										local579 = (local21.anInt2592 << 0) * Class1_Sub29.anIntArray537[local21.anInt2599 << 3] >> 15;
										local605 = (local21.anInt2592 << 0) * Class1_Sub29.anIntArray536[local21.anInt2599 << 3] >> 15;
										Static18.aClass34_4.A(-local21.anInt2644 << 3);
										Static18.aClass34_4.EA(local21.anInt2659 << 3);
										Static18.aClass34_4.W(local21.anInt2608 << 0, local579 + (local21.anInt2627 << 0) + local240, (local21.anInt2627 << 0) + local605);
										Static18.aClass34_4.ea(local21.anInt2599 << 3);
										if (Static118.aBoolean191) {
											Static186.aClass117_3.HA(local92, local97, local21.anInt2648 + local92, local21.anInt2606 + local97);
										}
										if (local21.aBoolean261) {
											local1540.method5999(Static18.aClass34_4, null, local21.anInt2592 << 0);
										} else {
											local1540.method5987(Static18.aClass34_4, null, 1);
										}
										if (Static118.aBoolean191) {
											Static186.aClass117_3.ba(arg8, arg6, arg7, arg5);
										}
										if (local21.aBoolean257) {
											Static186.aClass117_3.method5677(true);
										}
										Static186.aClass117_3.da(0.0F, 0.0F);
									}
								} else if (local21.anInt2598 == 9) {
									if (local21.aBoolean268) {
										local240 = local97 + local21.anInt2606;
										local493 = local92 + local21.anInt2648;
										local1223 = local97;
									} else {
										local240 = local97;
										local1223 = local21.anInt2606 + local97;
										local493 = local21.anInt2648 + local92;
									}
									if (local21.anInt2633 == 1) {
										Static186.aClass117_3.method5729(local92, local240, local493, local1223, local21.anInt2584, 0);
									} else {
										Static186.aClass117_3.method5668(local92, local240, local493, local1223, local21.anInt2584, local21.anInt2633);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BII)V")
	public static void method3535(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub3_Sub1 local16 = Static427.method5426(arg1, 7);
		local16.method384();
		local16.anInt381 = arg0;
	}
}
