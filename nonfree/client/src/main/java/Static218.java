import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "[I")
	public static int[] anIntArray410;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
	public static int anInt4149;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "[Lclient!jl;")
	public static final Class131_Sub1[] aClass131_Sub1Array2 = new Class131_Sub1[30];

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_68 = new Class27(11, -1);

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "[I")
	public static final int[] anIntArray411 = new int[8];

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII[Lclient!gh;IIIII)V")
	public static void method3307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class89[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		Static412.aClass50_8.ba(arg7, arg2, arg8, arg5);
		for (@Pc(21) int local21 = 0; local21 < arg4.length; local21++) {
			@Pc(27) Class89 local27 = arg4[local21];
			if (local27 != null && (arg6 == local27.anInt2694 || arg6 == -1412584499 && Static458.aClass89_14 == local27)) {
				@Pc(67) int local67;
				if (arg1 == -1) {
					Class10_Sub1_Sub7.aRectangleArray4[Static167.anInt3304].setBounds(arg3 + local27.anInt2678, arg0 + local27.anInt2721, local27.anInt2703, local27.anInt2682);
					local67 = Static167.anInt3304++;
				} else {
					local67 = arg1;
				}
				local27.anInt2723 = local67;
				local27.anInt2669 = Static400.anInt6752;
				if (!Static56.method998(local27)) {
					if (local27.anInt2715 != 0) {
						Static302.method4198(local27);
					}
					@Pc(94) int local94 = arg3 + local27.anInt2678;
					@Pc(99) int local99 = local27.anInt2721 + arg0;
					@Pc(102) int local102 = local27.anInt2690;
					if (Static372.aBoolean418 && (Static56.method1002(local27).anInt5644 != 0 || local27.anInt2727 == 0) && local102 > 127) {
						local102 = 127;
					}
					@Pc(160) int local160;
					@Pc(164) int local164;
					if (local27 == Static458.aClass89_14) {
						if (arg6 != -1412584499 && (Static118.anInt2407 == local27.anInt2705 || local27.anInt2705 == Static106.anInt2138)) {
							Static355.anInt6049 = arg0;
							Static345.anInt5877 = arg3;
							Static392.aClass89Array2 = arg4;
							continue;
						}
						if (Static95.aBoolean121 && Static48.aBoolean51) {
							local160 = Static113.aClass13_1.method4116();
							local164 = Static113.aClass13_1.method4123();
							local160 -= Static200.anInt3972;
							local164 -= Static182.anInt3704;
							if (local160 < Static415.anInt6935) {
								local160 = Static415.anInt6935;
							}
							if (Static385.anInt6587 > local164) {
								local164 = Static385.anInt6587;
							}
							if (Static67.aClass89_2.anInt2703 + Static415.anInt6935 < local27.anInt2703 + local160) {
								local160 = Static415.anInt6935 + Static67.aClass89_2.anInt2703 - local27.anInt2703;
							}
							local94 = local160;
							if (Static67.aClass89_2.anInt2682 + Static385.anInt6587 < local164 - -local27.anInt2682) {
								local164 = Static385.anInt6587 + Static67.aClass89_2.anInt2682 - local27.anInt2682;
							}
							local99 = local164;
						}
						if (Static106.anInt2138 == local27.anInt2705) {
							local102 = 128;
						}
					}
					@Pc(305) int local305;
					@Pc(312) int local312;
					@Pc(261) int local261;
					@Pc(266) int local266;
					if (local27.anInt2727 == 2) {
						local164 = arg2;
						local160 = arg7;
						local312 = arg5;
						local305 = arg8;
					} else {
						local261 = local94 + local27.anInt2703;
						local266 = local27.anInt2682 + local99;
						local164 = local99 > arg2 ? local99 : arg2;
						if (local27.anInt2727 == 9) {
							local261++;
							local266++;
						}
						local160 = local94 <= arg7 ? arg7 : local94;
						local305 = local261 < arg8 ? local261 : arg8;
						local312 = arg5 <= local266 ? arg5 : local266;
					}
					if (local305 > local160 && local312 > local164) {
						@Pc(562) int local562;
						@Pc(612) int local612;
						@Pc(636) int local636;
						@Pc(526) int local526;
						@Pc(560) int local560;
						if (local27.anInt2715 != 0) {
							if (local27.anInt2715 == Static411.anInt6879 || local27.anInt2715 == Static337.anInt5682) {
								Static215.method3291(local27.anInt2703, local94, local27.anInt2682, local27.anInt2715 == Static337.anInt5682, local99);
								Static432.aBooleanArray24[local67] = true;
								Static412.aClass50_8.ba(arg7, arg2, arg8, arg5);
								continue;
							}
							if (Static356.anInt6055 == local27.anInt2715) {
								if (local27.method2292(Static412.aClass50_8) != null) {
									Static278.method4705();
									Static130.method2273(Static412.aClass50_8, local99, local27, local94);
									Static373.aBooleanArray19[local67] = true;
									Static412.aClass50_8.ba(arg7, arg2, arg8, arg5);
								}
								continue;
							}
							if (local27.anInt2715 == Static109.anInt2180) {
								if (local27.method2292(Static412.aClass50_8) != null) {
									Static157.method2657(local94, local27, local99);
									Static373.aBooleanArray19[local67] = true;
									Static412.aClass50_8.ba(arg7, arg2, arg8, arg5);
								}
								continue;
							}
							if (local27.anInt2715 == Static265.anInt4701) {
								Static104.method1822(local27.anInt2682, local94, Static412.aClass50_8, Static413.anInterface7_7, local99, local27.anInt2703);
								Static432.aBooleanArray24[local67] = true;
								Static412.aClass50_8.ba(arg7, arg2, arg8, arg5);
								continue;
							}
							if (local27.anInt2715 == Static288.anInt5048) {
								Static87.method1637(local27.anInt2703, Static412.aClass50_8, local99, local27.anInt2682, local94);
								Static432.aBooleanArray24[local67] = true;
								Static412.aClass50_8.ba(arg7, arg2, arg8, arg5);
								continue;
							}
							if (Static96.anInt1984 == local27.anInt2715) {
								if (!Static419.aBoolean462 && !Static389.aBoolean437) {
									continue;
								}
								local261 = local27.anInt2703 + local94;
								local266 = local99 + 15;
								if (Static419.aBoolean462) {
									local526 = -256;
									if (Static273.anInt4775 < 20) {
										local526 = -65536;
									}
									Static114.aClass57_4.method5958("Fps:" + Static273.anInt4775, local266, local261, local526);
									local266 += 15;
									@Pc(550) Runtime local550 = Runtime.getRuntime();
									local560 = (int) ((local550.totalMemory() - local550.freeMemory()) / 1024L);
									local562 = -256;
									if (local560 > 65536) {
										local562 = -65536;
									}
									Static114.aClass57_4.method5958("Mem:" + local560 + "k", local266, local261, local562);
									local266 += 15;
									Static114.aClass57_4.method5958("In:" + Static337.anInt5683 + "B/s Out:" + Static19.anInt343 + "B/s", local266, local261, -256);
									local266 += 15;
									local612 = Static412.aClass50_8.pa() / 1024;
									Static114.aClass57_4.method5958("Offheap:" + local612 + "k", local266, local261, local612 > 65536 ? -65536 : -256);
									local266 += 15;
									local636 = 0;
									@Pc(638) int local638 = 0;
									@Pc(640) int local640 = 0;
									for (@Pc(642) int local642 = 0; local642 < 30; local642++) {
										local636 += aClass131_Sub1Array2[local642].method3135();
										local638 += aClass131_Sub1Array2[local642].method3133();
										local640 += aClass131_Sub1Array2[local642].method3134();
									}
									@Pc(680) int local680 = local640 * 100 / local636;
									@Pc(686) int local686 = local638 * 10000 / local636;
									@Pc(706) String local706 = "Cache:" + Static117.method2051((long) local686, true, 0, 2) + "% (" + local680 + "%)";
									Static383.aClass57_5.method5958(local706, local266, local261, -256);
									local266 += 12;
								}
								if (Static260.anInt4625 > 0) {
									Static383.aClass57_5.method5958("Particles: " + Static104.anInt2115 + " / " + Static260.anInt4625, local266, local261, -256);
								}
								local266 += 12;
								if (Static389.aBoolean437) {
									Static383.aClass57_5.method5958("Polys: " + Static412.aClass50_8.OA() + " Models: " + Static412.aClass50_8.Y(), local266, local261, -256);
									local266 += 12;
									Static383.aClass57_5.method5958("Ls: " + Static313.anInt5427 + " La: " + Static100.anInt2070 + " NPC: " + Static430.anInt7235 + " Pl: " + Static339.anInt5724, local266, local261, -256);
									Static230.method3437();
									local266 += 12;
								}
								Static432.aBooleanArray24[local67] = true;
								continue;
							}
						}
						if (local27.anInt2727 == 0) {
							if (local27.anInt2715 == Static94.anInt1941 && Static412.aClass50_8.method5882()) {
								Static412.aClass50_8.method5849(local94, local99, local27.anInt2703, local27.anInt2682);
							}
							method3307(local99 - local27.anInt2699, local67, local164, local94 - local27.anInt2725, arg4, local312, local27.anInt2677, local160, local305);
							if (local27.aClass89Array1 != null) {
								method3307(local99 - local27.anInt2699, local67, local164, local94 - local27.anInt2725, local27.aClass89Array1, local312, local27.anInt2677, local160, local305);
							}
							@Pc(866) Class10_Sub21 local866 = (Class10_Sub21) Static114.aClass167_12.method3709((long) local27.anInt2677);
							if (local866 != null) {
								Static425.method5652(local99, local67, local164, local160, local305, local94, local866.anInt3646, local312);
							}
							if (Static94.anInt1941 == local27.anInt2715 && Static412.aClass50_8.method5882()) {
								Static412.aClass50_8.method5862();
								Static97.aBoolean74 = true;
							}
							Static412.aClass50_8.ba(arg7, arg2, arg8, arg5);
						}
						if (Static301.aBooleanArray15[local67] || Static334.anInt5662 > 1) {
							if (local27.anInt2727 == 3) {
								if (local102 == 0) {
									if (local27.aBoolean206) {
										Static412.aClass50_8.P(local94, local99, local27.anInt2703, local27.anInt2682, local27.anInt2662, 0);
									} else {
										Static412.aClass50_8.method5811(local94, local99, local27.anInt2703, local27.anInt2682, local27.anInt2662, 0);
									}
								} else if (local27.aBoolean206) {
									Static412.aClass50_8.P(local94, local99, local27.anInt2703, local27.anInt2682, local27.anInt2662 & 0xFFFFFF | 255 - (local102 & 0xFF) << 24, 1);
								} else {
									Static412.aClass50_8.method5811(local94, local99, local27.anInt2703, local27.anInt2682, 255 - (local102 & 0xFF) << 24 | local27.anInt2662 & 0xFFFFFF, 1);
								}
							} else if (local27.anInt2727 == 4) {
								@Pc(998) Class57 local998 = local27.method2291(Static412.aClass50_8);
								if (local998 != null) {
									local266 = local27.anInt2662;
									@Pc(1013) String local1013 = local27.aString17;
									if (local27.anInt2670 != -1) {
										@Pc(1023) Class60 local1023 = Static313.aClass272_2.method6068(local27.anInt2670);
										local1013 = local1023.aString11;
										if (local1013 == null) {
											local1013 = "null";
										}
										if ((local1023.anInt1718 == 1 || local27.anInt2719 != 1) && local27.anInt2719 != -1) {
											local1013 = "<col=ff9040>" + local1013 + "</col> x" + Static254.method3694(local27.anInt2719);
										}
									}
									if (local27 == Static378.aClass89_13) {
										local1013 = Static209.aClass182_139.method4155(Static191.anInt3842);
										local266 = local27.anInt2662;
									}
									if (Static76.aBoolean109) {
										Static412.aClass50_8.HA(local94, local99, local94 + local27.anInt2703, local99 - -local27.anInt2682);
									}
									local998.method5946(null, Static301.aClass80Array16, 255 - (local102 & 0xFF) << 24 | local266, local94, null, local27.aBoolean195 ? 255 - (local102 & 0xFF) << 24 : -1, local99, 0, local27.anInt2750, 0, local27.anInt2738, local1013, local27.anInt2686, local27.anInt2703, local27.anInt2682, local27.anInt2741);
									if (Static76.aBoolean109) {
										Static412.aClass50_8.ba(arg7, arg2, arg8, arg5);
									}
								} else if (Static309.aBoolean356) {
									Static135.method5400(local27);
								}
							} else {
								@Pc(1243) int local1243;
								if (local27.anInt2727 == 5) {
									if (local27.anInt2744 >= 0) {
										local27.method2290(Static88.aClass47_2, Static314.aClass158_1).method5133(Static412.aClass50_8, local94, local27.anInt2731 << 3, local27.anInt2682, 0, local27.anInt2703, local99, local27.anInt2749 << 3, 0);
									} else {
										@Pc(1189) Class80 local1189;
										if (local27.anInt2670 == -1) {
											local1189 = local27.method2280(Static412.aClass50_8);
										} else {
											@Pc(1199) Class75 local1199 = local27.aBoolean199 ? Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1 : null;
											local1189 = Static313.aClass272_2.method6072(local1199, local27.anInt2719, local27.anInt2714, local27.anInt2670, Static412.aClass50_8, local27.anInt2743 | 0xFF000000, local27.anInt2739);
										}
										if (local1189 != null) {
											local266 = local1189.RA();
											local526 = local1189.Q();
											local1243 = (local27.anInt2662 == 0 ? 16777215 : local27.anInt2662 & 0xFFFFFF) | 255 - (local102 & 0xFF) << 24;
											if (local27.aBoolean205) {
												Static412.aClass50_8.HA(local94, local99, local94 + local27.anInt2703, local27.anInt2682 + local99);
												if (local27.anInt2701 != 0) {
													local560 = (local27.anInt2703 + local266 - 1) / local266;
													local562 = (local526 + local27.anInt2682 - 1) / local526;
													for (local612 = 0; local612 < local560; local612++) {
														for (local636 = 0; local636 < local562; local636++) {
															if (local27.anInt2662 == 0) {
																local1189.method5561((float) (local94 + local612 * local266) + (float) local266 / 2.0F, (float) (local99 - -(local526 * local636)) + (float) local526 / 2.0F, 4096, local27.anInt2701);
															} else {
																local1189.method5556((float) (local266 * local612 + local94) + (float) local266 / 2.0F, (float) local526 / 2.0F + (float) (local99 - -(local526 * local636)), 4096, local27.anInt2701, local1243);
															}
														}
													}
												} else if (local27.anInt2662 == 0 && local102 == 0) {
													local1189.method5560(local94, local99, local27.anInt2703, local27.anInt2682);
												} else {
													local1189.la(local94, local99, local27.anInt2703, local27.anInt2682, 0, local1243, 1);
												}
												Static412.aClass50_8.ba(arg7, arg2, arg8, arg5);
											} else if (local27.anInt2662 == 0 && local102 == 0) {
												if (local27.anInt2701 != 0) {
													local1189.method5561((float) local27.anInt2703 / 2.0F + (float) local94, (float) local99 + (float) local27.anInt2682 / 2.0F, local27.anInt2703 * 4096 / local266, local27.anInt2701);
												} else if (local266 == local27.anInt2703 && local27.anInt2682 == local526) {
													local1189.method5558(local94, local99);
												} else {
													local1189.method5554(local94, local99, local27.anInt2703, local27.anInt2682);
												}
											} else if (local27.anInt2701 != 0) {
												local1189.method5556((float) local94 + (float) local27.anInt2703 / 2.0F, (float) local27.anInt2682 / 2.0F + (float) local99, local27.anInt2703 * 4096 / local266, local27.anInt2701, local1243);
											} else if (local27.anInt2703 == local266 && local27.anInt2682 == local526) {
												local1189.W(local94, local99, 0, local1243, 1);
											} else {
												local1189.ya(local94, local99, local27.anInt2703, local27.anInt2682, 0, local1243, 1);
											}
										} else if (Static309.aBoolean356) {
											Static135.method5400(local27);
										}
									}
								} else if (local27.anInt2727 == 6) {
									Static298.method4145();
									@Pc(1558) Class63 local1558 = null;
									local266 = 0;
									@Pc(1591) Class137 local1591;
									@Pc(1599) Class75 local1599;
									if (local27.anInt2670 != -1) {
										@Pc(1570) Class60 local1570 = Static313.aClass272_2.method6068(local27.anInt2670);
										if (local1570 != null) {
											local1570 = local1570.method1535(local27.anInt2719);
											local1591 = local27.anInt2697 == -1 ? null : Static281.aClass98_3.method2405(local27.anInt2697);
											local1599 = local27.aBoolean199 ? Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1 : null;
											local1558 = local1570.method1534(2048, local27.anInt2704, local27.anInt2665, local1599, Static412.aClass50_8, local27.anInt2661, local1591, 1);
											if (local1558 == null) {
												Static135.method5400(local27);
											} else {
												local266 = -local1558.B() >> 1;
											}
										}
									} else if (local27.anInt2728 == 5) {
										local526 = local27.anInt2733;
										if (local526 >= 0 && local526 < 2048) {
											@Pc(1773) Class24_Sub3_Sub2_Sub2 local1773 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local526];
											@Pc(1785) Class137 local1785 = local27.anInt2697 == -1 ? null : Static281.aClass98_3.method2405(local27.anInt2697);
											if (local1773 != null && (local526 == Static245.anInt4435 || Static308.method4263(local1773.aString58) == local27.anInt2722)) {
												local1558 = local1773.aClass75_1.method1898(null, local1785, Static281.aClass98_3, local27.anInt2661, Static313.aClass272_2, Static133.aClass223_1, -1, Static8.aClass100_1, local27.anInt2704, local27.anInt2665, Static412.aClass50_8, 0, Static448.aClass38_4, Static329.aClass201_9, null, 0, 2048);
											}
										}
									} else if (local27.anInt2728 == 8 || local27.anInt2728 == 9) {
										@Pc(1648) Class10_Sub44 local1648 = Static40.method555(local27.anInt2733, false);
										local1591 = local27.anInt2697 == -1 ? null : Static281.aClass98_3.method2405(local27.anInt2697);
										if (local1648 != null) {
											local1599 = local27.aBoolean199 ? Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1 : null;
											local1558 = local1648.method5715(local27.anInt2704, local27.anInt2665, local1591, local27.anInt2728 == 9, Static412.aClass50_8, local27.anInt2661, local27.anInt2722, local1599);
										}
									} else if (local27.anInt2697 == -1) {
										local1558 = local27.method2279(0, Static281.aClass98_3, Static133.aClass223_1, 2048, null, Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1, Static448.aClass38_4, Static313.aClass272_2, Static329.aClass201_9, -1, -1, Static8.aClass100_1, Static412.aClass50_8);
										if (local1558 == null && Static309.aBoolean356) {
											Static135.method5400(local27);
										}
									} else {
										@Pc(1730) Class137 local1730 = Static281.aClass98_3.method2405(local27.anInt2697);
										local1558 = local27.method2279(local27.anInt2661, Static281.aClass98_3, Static133.aClass223_1, 2048, local1730, Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1, Static448.aClass38_4, Static313.aClass272_2, Static329.aClass201_9, local27.anInt2665, local27.anInt2704, Static8.aClass100_1, Static412.aClass50_8);
										if (local1558 == null && Static309.aBoolean356) {
											Static135.method5400(local27);
										}
									}
									if (local1558 != null) {
										if (local27.anInt2706 > 0) {
											local526 = (local27.anInt2703 << 9) / local27.anInt2706;
										} else {
											local526 = 512;
										}
										if (local27.anInt2681 > 0) {
											local1243 = (local27.anInt2682 << 9) / local27.anInt2681;
										} else {
											local1243 = 512;
										}
										local560 = local94 + local27.anInt2703 / 2 + (local27.anInt2676 * local526 >> 9);
										local562 = (local1243 * local27.anInt2713 >> 9) + (local99 + (local27.anInt2682 / 2));
										Static342.aClass34_4.v();
										Static412.aClass50_8.SA(Static342.aClass34_4);
										Static412.aClass50_8.GA(local560, local562, local526, local1243);
										Static412.aClass50_8.da((float) (local27.anInt2693 << 0), local27.aBoolean204 ? (float) (local27.anInt2724 << 0) : (float) (local27.anInt2724 << 0) * 1.5F);
										if (arg6 == -1412584499 || Static97.aBoolean74) {
											Static412.aClass50_8.va();
											Static412.aClass50_8.method5848();
											Static412.aClass50_8.ba(arg7, arg2, arg8, arg5);
											Static97.aBoolean74 = false;
										}
										if (local27.aBoolean207) {
											Static412.aClass50_8.method5837(false);
										}
										local612 = (local27.anInt2688 << 0) * Class250.anIntArray675[local27.anInt2663 << 3] >> 15;
										local636 = Class250.anIntArray674[local27.anInt2663 << 3] * (local27.anInt2688 << 0) >> 15;
										Static259.aClass34_6.A(-local27.anInt2675 << 3);
										Static259.aClass34_6.EA(local27.anInt2685 << 3);
										Static259.aClass34_6.W(local27.anInt2668 << 0, local612 + (local27.anInt2680 << 0) + local266, local636 - -(local27.anInt2680 << 0));
										Static259.aClass34_6.ea(local27.anInt2663 << 3);
										if (Static76.aBoolean109) {
											Static412.aClass50_8.HA(local94, local99, local27.anInt2703 + local94, local27.anInt2682 + local99);
										}
										if (local27.aBoolean204) {
											local1558.method6097(Static259.aClass34_6, null, local27.anInt2688 << 0);
										} else {
											local1558.method6090(Static259.aClass34_6, null, 1);
										}
										if (Static76.aBoolean109) {
											Static412.aClass50_8.ba(arg7, arg2, arg8, arg5);
										}
										if (local27.aBoolean207) {
											Static412.aClass50_8.method5837(true);
										}
										Static412.aClass50_8.da(0.0F, 0.0F);
									}
								} else if (local27.anInt2727 == 9) {
									if (local27.aBoolean202) {
										local526 = local94 + local27.anInt2703;
										local1243 = local99;
										local266 = local27.anInt2682 + local99;
									} else {
										local266 = local99;
										local526 = local27.anInt2703 + local94;
										local1243 = local27.anInt2682 + local99;
									}
									if (local27.anInt2729 == 1) {
										Static412.aClass50_8.method5874(local94, local266, local526, local1243, local27.anInt2662, 0);
									} else {
										Static412.aClass50_8.method5809(local94, local266, local526, local1243, local27.anInt2662, local27.anInt2729);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ha;II)Z")
	public static boolean method3308(@OriginalArg(0) Class10_Sub8_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0.method2525(2);
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(105) int local105;
		@Pc(109) int local109;
		@Pc(115) int local115;
		if (local13 == 0) {
			if (arg0.method2525(1) != 0) {
				method3308(arg0, arg1);
			}
			local33 = arg0.method2525(6);
			local38 = arg0.method2525(6);
			@Pc(48) boolean local48 = arg0.method2525(1) == 1;
			if (local48) {
				Static284.anIntArray491[Static106.anInt2139++] = arg1;
			}
			if (Static360.aClass24_Sub3_Sub2_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(71) Class32 local71 = Static458.aClass32Array1[arg1];
			@Pc(79) Class24_Sub3_Sub2_Sub2 local79 = Static360.aClass24_Sub3_Sub2_Sub2Array1[arg1] = new Class24_Sub3_Sub2_Sub2();
			local79.anInt6228 = arg1;
			if (Static134.aClass10_Sub8Array1[arg1] != null) {
				local79.method4930(Static134.aClass10_Sub8Array1[arg1]);
			}
			local79.method4907(true, local71.anInt724);
			local79.anInt6241 = local71.anInt725;
			local105 = local71.anInt726;
			local109 = local105 >> 28;
			local115 = local105 >> 14 & 0xFF;
			@Pc(119) int local119 = local105 & 0xFF;
			local79.aBoolean408 = local71.aBoolean48;
			local79.aByteArray80[0] = Static393.aByteArray87[arg1];
			local79.aByte98 = (byte) local109;
			local79.method4925((local115 << 6) + local33 - Static168.anInt3353, -Static72.anInt1488 + local38 + (local119 << 6));
			local79.aBoolean407 = false;
			Static458.aClass32Array1[arg1] = null;
			return true;
		} else if (local13 == 1) {
			local33 = arg0.method2525(2);
			local38 = Static458.aClass32Array1[arg1].anInt726;
			Static458.aClass32Array1[arg1].anInt726 = (((local38 >> 28) + local33 & 0x3) << 28) + (local38 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(212) int local212;
			@Pc(217) int local217;
			@Pc(225) int local225;
			if (local13 != 2) {
				local33 = arg0.method2525(18);
				local38 = local33 >> 16;
				local212 = local33 >> 8 & 0xFF;
				local217 = local33 & 0xFF;
				local225 = Static458.aClass32Array1[arg1].anInt726;
				local105 = local38 + (local225 >> 28) & 0x3;
				local109 = (local225 >> 14) + local212 & 0xFF;
				local115 = local217 + local225 & 0xFF;
				Static458.aClass32Array1[arg1].anInt726 = (local105 << 28) - (-(local109 << 14) - local115);
				return false;
			}
			local33 = arg0.method2525(5);
			local38 = local33 >> 3;
			local212 = local33 & 0x7;
			local217 = Static458.aClass32Array1[arg1].anInt726;
			local225 = local38 + (local217 >> 28) & 0x3;
			local105 = local217 >> 14 & 0xFF;
			local109 = local217 & 0xFF;
			if (local212 == 0) {
				local109--;
				local105--;
			}
			if (local212 == 1) {
				local109--;
			}
			if (local212 == 2) {
				local109--;
				local105++;
			}
			if (local212 == 3) {
				local105--;
			}
			if (local212 == 4) {
				local105++;
			}
			if (local212 == 5) {
				local105--;
				local109++;
			}
			if (local212 == 6) {
				local109++;
			}
			if (local212 == 7) {
				local105++;
				local109++;
			}
			Static458.aClass32Array1[arg1].anInt726 = local109 + (local105 << 14) + (local225 << 28);
			return false;
		}
	}
}
