import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
	public static int anInt6147;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
	public static int anInt6149 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public static void method5244() {
		@Pc(7) Class267[] local7 = Class105.aClass267Array1;
		synchronized (Class105.aClass267Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class105.aClass267Array1.length; local11++) {
				Class105.aClass267Array1[local11] = new Class267();
				Static284.anIntArray404[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([Lclient!ep;IIIIIIIBI)V")
	public static void method5246(@OriginalArg(0) Class93[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		Static323.aClass9_8.ca(arg3, arg4, arg5, arg7);
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(21) Class93 local21 = arg0[local13];
			if (local21 != null && (arg6 == local21.anInt2820 || arg6 == -1412584499 && local21 == Static122.aClass93_7)) {
				@Pc(44) int local44;
				if (arg8 == -1) {
					Class93.aRectangleArray2[Static190.anInt4121].setBounds(arg1 + local21.anInt2753, arg2 + local21.anInt2750, local21.anInt2777, local21.anInt2738);
					local44 = Static190.anInt4121++;
				} else {
					local44 = arg8;
				}
				local21.anInt2759 = Static508.anInt8998;
				local21.anInt2764 = local44;
				if (!Static69.method1450(local21)) {
					if (local21.anInt2812 != 0) {
						Static26.method970(local21);
					}
					@Pc(88) int local88 = arg1 + local21.anInt2753;
					@Pc(94) int local94 = local21.anInt2750 + arg2;
					@Pc(97) int local97 = local21.anInt2755;
					if (Static13.aBoolean37 && (Static69.method1454(local21).anInt8800 != 0 || local21.anInt2823 == 0) && local97 > 127) {
						local97 = 127;
					}
					@Pc(153) int local153;
					@Pc(157) int local157;
					if (local21 == Static122.aClass93_7) {
						if (arg6 != -1412584499 && (local21.anInt2819 == Static526.anInt9120 || local21.anInt2819 == Static549.anInt9382)) {
							Static376.anInt7066 = arg2;
							Static315.aClass93Array3 = arg0;
							Static162.anInt3683 = arg1;
							continue;
						}
						if (Static191.aBoolean330 && Static545.aBoolean697) {
							local153 = Static401.aClass4_1.method1216();
							local157 = Static401.aClass4_1.method1215();
							local157 -= Static323.anInt6113;
							local153 -= Static416.anInt7781;
							if (local153 < Static87.anInt2163) {
								local153 = Static87.anInt2163;
							}
							if (Static371.aClass93_12.anInt2777 + Static87.anInt2163 < local153 - -local21.anInt2777) {
								local153 = Static87.anInt2163 + Static371.aClass93_12.anInt2777 - local21.anInt2777;
							}
							if (Static116.anInt2579 > local157) {
								local157 = Static116.anInt2579;
							}
							local88 = local153;
							if (local157 + local21.anInt2738 > Static116.anInt2579 + Static371.aClass93_12.anInt2738) {
								local157 = Static116.anInt2579 + Static371.aClass93_12.anInt2738 - local21.anInt2738;
							}
							local94 = local157;
						}
						if (Static549.anInt9382 == local21.anInt2819) {
							local97 = 128;
						}
					}
					@Pc(288) int local288;
					@Pc(281) int local281;
					@Pc(239) int local239;
					@Pc(244) int local244;
					if (local21.anInt2823 == 2) {
						local288 = arg5;
						local153 = arg3;
						local281 = arg7;
						local157 = arg4;
					} else {
						local239 = local88 + local21.anInt2777;
						local244 = local94 + local21.anInt2738;
						local153 = arg3 >= local88 ? arg3 : local88;
						local157 = arg4 < local94 ? local94 : arg4;
						if (local21.anInt2823 == 9) {
							local244++;
							local239++;
						}
						local281 = local244 < arg7 ? local244 : arg7;
						local288 = arg5 <= local239 ? arg5 : local239;
					}
					if (local153 < local288 && local157 < local281) {
						@Pc(539) int local539;
						@Pc(550) int local550;
						@Pc(642) int local642;
						@Pc(503) int local503;
						@Pc(537) int local537;
						if (local21.anInt2812 != 0) {
							if (local21.anInt2812 == Static262.anInt5265 || Static309.anInt5840 == local21.anInt2812) {
								Static74.method7242(local21.anInt2738, local21.anInt2777, Static309.anInt5840 == local21.anInt2812, local94, local88);
								Static429.aBooleanArray27[local44] = true;
								Static323.aClass9_8.ca(arg3, arg4, arg5, arg7);
								continue;
							}
							if (Static218.anInt4634 == local21.anInt2812) {
								if (local21.method2490(Static323.aClass9_8) != null) {
									Static186.method3607();
									Static198.method3730(Static323.aClass9_8, local88, local21, local94);
									Static3.aBooleanArray22[local44] = true;
									Static323.aClass9_8.ca(arg3, arg4, arg5, arg7);
								}
								continue;
							}
							if (Static42.anInt1255 == local21.anInt2812) {
								if (local21.method2490(Static323.aClass9_8) != null) {
									Static363.method5830(local21, local94, local88);
									Static3.aBooleanArray22[local44] = true;
									Static323.aClass9_8.ca(arg3, arg4, arg5, arg7);
								}
								continue;
							}
							if (local21.anInt2812 == Static29.anInt1014) {
								Static525.method7652(local21.anInt2777, local88, Static323.aClass9_8, local21.anInt2738, local94, Static517.anInterface2_13);
								Static429.aBooleanArray27[local44] = true;
								Static323.aClass9_8.ca(arg3, arg4, arg5, arg7);
								continue;
							}
							if (local21.anInt2812 == Static556.anInt9484) {
								Static259.method4511(local88, local21.anInt2777, local21.anInt2738, local94, Static323.aClass9_8);
								Static429.aBooleanArray27[local44] = true;
								Static323.aClass9_8.ca(arg3, arg4, arg5, arg7);
								continue;
							}
							if (local21.anInt2812 == Static314.anInt8007) {
								if (!Static266.aBoolean375 && !Static354.aBoolean512) {
									continue;
								}
								local239 = local21.anInt2777 + local88;
								local244 = local94 + 15;
								if (Static266.aBoolean375) {
									local503 = -256;
									if (Static56.anInt9395 < 20) {
										local503 = -65536;
									}
									Static42.aClass73_1.method7893(local239, -1, "Fps:" + Static56.anInt9395, local503, local244);
									local244 += 15;
									@Pc(527) Runtime local527 = Runtime.getRuntime();
									local537 = (int) ((local527.totalMemory() - local527.freeMemory()) / 1024L);
									local539 = -256;
									if (local537 > 65536) {
										local539 = -65536;
										if (Static52.aBoolean148) {
											Static104.method6572();
											for (local550 = 0; local550 < 10; local550++) {
												System.gc();
											}
											local537 = (int) ((local527.totalMemory() - local527.freeMemory()) / 1024L);
											if (local537 > 65536) {
												Static99.method2135("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static42.aClass73_1.method7893(local239, -1, "Mem:" + local537 + "k", local539, local244);
									local244 += 15;
									Static42.aClass73_1.method7893(local239, -1, "In:" + Static120.anInt2612 + "B/s Out:" + Static218.anInt4636 + "B/s", -256, local244);
									local244 += 15;
									local550 = Static323.aClass9_8.v() / 1024;
									Static42.aClass73_1.method7893(local239, -1, "Offheap:" + local550 + "k", local550 > 65536 ? -65536 : -256, local244);
									local244 += 15;
									local642 = 0;
									@Pc(644) int local644 = 0;
									@Pc(646) int local646 = 0;
									for (@Pc(648) int local648 = 0; local648 < 34; local648++) {
										local642 += Static206.aClass164_Sub1Array1[local648].method4278();
										local644 += Static206.aClass164_Sub1Array1[local648].method4271();
										local646 += Static206.aClass164_Sub1Array1[local648].method4277();
									}
									@Pc(684) int local684 = local646 * 100 / local642;
									@Pc(690) int local690 = local644 * 10000 / local642;
									@Pc(710) String local710 = "Cache:" + Static282.method4622((long) local690, 0, 2, true) + "% (" + local684 + "%)";
									Static467.aClass73_3.method7893(local239, -1, local710, -256, local244);
									local244 += 12;
								}
								if (Static334.anInt6216 > 0) {
									Static467.aClass73_3.method7893(local239, -1, "Particles: " + Static178.anInt3986 + " / " + Static334.anInt6216, -256, local244);
								}
								local244 += 12;
								if (Static354.aBoolean512) {
									Static467.aClass73_3.method7893(local239, -1, "Polys: " + Static323.aClass9_8.SA() + " Models: " + Static323.aClass9_8.aa(), -256, local244);
									local244 += 12;
									Static467.aClass73_3.method7893(local239, -1, "Ls: " + Static435.anInt7938 + " La: " + Static214.anInt4563 + " NPC: " + Static397.anInt7513 + " Pl: " + Static471.anInt8685, -256, local244);
									Static74.method7243();
									local244 += 12;
								}
								Static429.aBooleanArray27[local44] = true;
								continue;
							}
						}
						if (local21.anInt2823 == 0) {
							if (local21.anInt2812 == Static382.anInt7173 && Static323.aClass9_8.method5398()) {
								Static323.aClass9_8.method5466(local88, local94, local21.anInt2777, local21.anInt2738);
							}
							method5246(arg0, local88 - local21.anInt2761, -local21.anInt2789 + local94, local153, local157, local288, local21.anInt2790, local281, local44);
							if (local21.aClass93Array4 != null) {
								method5246(local21.aClass93Array4, local88 - local21.anInt2761, -local21.anInt2789 + local94, local153, local157, local288, local21.anInt2790, local281, local44);
							}
							@Pc(875) Class6_Sub48 local875 = (Class6_Sub48) Static459.aClass305_24.method7447((long) local21.anInt2790);
							if (local875 != null) {
								Static204.method3799(local153, local94, local88, local44, local281, local875.anInt9207, local157, local288);
							}
							if (Static382.anInt7173 == local21.anInt2812 && Static323.aClass9_8.method5398()) {
								Static323.aClass9_8.method5441();
								Static459.aBoolean363 = true;
							}
							Static323.aClass9_8.ca(arg3, arg4, arg5, arg7);
						}
						if (Static14.aBooleanArray2[local44] || Static337.anInt6225 > 1) {
							if (local21.anInt2823 == 3) {
								if (local97 == 0) {
									if (local21.aBoolean231) {
										Static323.aClass9_8.C(local88, local94, local21.anInt2777, local21.anInt2738, local21.anInt2821, 0);
									} else {
										Static323.aClass9_8.method5436(local88, local94, local21.anInt2777, local21.anInt2738, local21.anInt2821, 0);
									}
								} else if (local21.aBoolean231) {
									Static323.aClass9_8.C(local88, local94, local21.anInt2777, local21.anInt2738, 255 - (local97 & 0xFF) << 24 | local21.anInt2821 & 0xFFFFFF, 1);
								} else {
									Static323.aClass9_8.method5436(local88, local94, local21.anInt2777, local21.anInt2738, local21.anInt2821 & 0xFFFFFF | 255 - (local97 & 0xFF) << 24, 1);
								}
							} else if (local21.anInt2823 == 4) {
								@Pc(1016) Class73 local1016 = local21.method2493(Static323.aClass9_8);
								if (local1016 != null) {
									local244 = local21.anInt2821;
									@Pc(1031) String local1031 = local21.aString33;
									if (local21.anInt2822 != -1) {
										@Pc(1042) Class145 local1042 = Static98.aClass203_1.method4899(local21.anInt2822);
										local1031 = local1042.aString52;
										if (local1031 == null) {
											local1031 = "null";
										}
										if ((local1042.anInt4481 == 1 || local21.anInt2739 != 1) && local21.anInt2739 != -1) {
											local1031 = "<col=ff9040>" + local1031 + "</col> x" + Static8.method614(local21.anInt2739);
										}
									}
									if (Static469.aClass93_15 == local21) {
										local1031 = Static222.aClass152_76.method4002(Static286.anInt5468);
										local244 = local21.anInt2821;
									}
									if (Static174.aBoolean324) {
										Static323.aClass9_8.Q(local88, local94, local21.anInt2777 + local88, local94 + local21.anInt2738);
									}
									local1016.method7885(0, null, 0, Static569.aClass66Array15, local21.lb, local21.anInt2763, local21.anInt2803, null, local21.anInt2785, local21.anInt2738, local244 | 255 - (local97 & 0xFF) << 24, local1031, local94, local21.aBoolean230 ? 255 - (local97 & 0xFF) << 24 : -1, local88, local21.anInt2777);
									if (Static174.aBoolean324) {
										Static323.aClass9_8.ca(arg3, arg4, arg5, arg7);
									}
								} else if (Static454.aBoolean623) {
									Static468.method7221(local21);
								}
							} else {
								@Pc(1242) int local1242;
								if (local21.anInt2823 == 5) {
									if (local21.anInt2825 < 0) {
										@Pc(1199) Class66 local1199;
										if (local21.anInt2822 == -1) {
											local1199 = local21.method2494(Static323.aClass9_8);
										} else {
											@Pc(1181) Class67 local1181 = local21.aBoolean224 ? Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1 : null;
											local1199 = Static98.aClass203_1.method4909(local21.anInt2739, Static323.aClass9_8, local21.anInt2822, local21.anInt2740, local1181, local21.anInt2787 | 0xFF000000, local21.anInt2747);
										}
										if (local1199 != null) {
											local244 = local1199.AA();
											local503 = local1199.a();
											local1242 = 255 - (local97 & 0xFF) << 24 | (local21.anInt2821 == 0 ? 16777215 : local21.anInt2821 & 0xFFFFFF);
											if (local21.aBoolean236) {
												Static323.aClass9_8.Q(local88, local94, local21.anInt2777 + local88, local94 - -local21.anInt2738);
												if (local21.anInt2771 != 0) {
													local537 = (local21.anInt2777 + local244 - 1) / local244;
													local539 = (local503 + local21.anInt2738 - 1) / local503;
													for (local550 = 0; local550 < local537; local550++) {
														for (local642 = 0; local642 < local539; local642++) {
															if (local21.anInt2821 == 0) {
																local1199.method8061((float) local244 / 2.0F + (float) (local88 + local244 * local550), (float) local503 / 2.0F + (float) (local642 * local503 + local94), 4096, local21.anInt2771);
															} else {
																local1199.method8068((float) local244 / 2.0F + (float) (local88 + local550 * local244), (float) local503 / 2.0F + (float) (local94 - -(local503 * local642)), 4096, local21.anInt2771, local1242);
															}
														}
													}
												} else if (local21.anInt2821 == 0 && local97 == 0) {
													local1199.method8060(local88, local94, local21.anInt2777, local21.anInt2738);
												} else {
													local1199.ba(local88, local94, local21.anInt2777, local21.anInt2738, 0, local1242, 1);
												}
												Static323.aClass9_8.ca(arg3, arg4, arg5, arg7);
											} else if (local21.anInt2821 == 0 && local97 == 0) {
												if (local21.anInt2771 != 0) {
													local1199.method8061((float) local21.anInt2777 / 2.0F + (float) local88, (float) local21.anInt2738 / 2.0F + (float) local94, local21.anInt2777 * 4096 / local244, local21.anInt2771);
												} else if (local244 == local21.anInt2777 && local503 == local21.anInt2738) {
													local1199.method8066(local88, local94);
												} else {
													local1199.method8065(local88, local94, local21.anInt2777, local21.anInt2738);
												}
											} else if (local21.anInt2771 != 0) {
												local1199.method8068((float) local88 + (float) local21.anInt2777 / 2.0F, (float) local21.anInt2738 / 2.0F + (float) local94, local21.anInt2777 * 4096 / local244, local21.anInt2771, local1242);
											} else if (local21.anInt2777 == local244 && local21.anInt2738 == local503) {
												local1199.I(local88, local94, 0, local1242, 1);
											} else {
												local1199.KA(local88, local94, local21.anInt2777, local21.anInt2738, 0, local1242, 1);
											}
										} else if (Static454.aBoolean623) {
											Static468.method7221(local21);
										}
									} else {
										local21.method2488(Static273.aClass115_1, Static61.aClass15_1).method1132(local94, local88, 0, local21.anInt2794 << 3, local21.anInt2777, 0, Static323.aClass9_8, local21.anInt2738, local21.anInt2828 << 3);
									}
								} else if (local21.anInt2823 == 6) {
									Static180.method3563();
									@Pc(1585) Class23 local1585 = null;
									local244 = 0;
									@Pc(1619) Class16 local1619;
									@Pc(1627) Class67 local1627;
									if (local21.anInt2822 != -1) {
										@Pc(1598) Class145 local1598 = Static98.aClass203_1.method4899(local21.anInt2822);
										if (local1598 != null) {
											local1598 = local1598.method3842(local21.anInt2739);
											local1619 = local21.anInt2786 == -1 ? null : Static114.aClass156_2.method4101(local21.anInt2786);
											local1627 = local21.aBoolean224 ? Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1 : null;
											local1585 = local1598.method3855(local21.anInt2737, 1, 2048, local1619, Static323.aClass9_8, local1627, local21.anInt2795, local21.anInt2772);
											if (local1585 == null) {
												Static468.method7221(local21);
											} else {
												local244 = -local1585.DA() >> 1;
											}
										}
									} else if (local21.anInt2779 == 5) {
										local503 = local21.anInt2805;
										if (local503 >= 0 && local503 < 2048) {
											@Pc(1800) Class11_Sub1_Sub1_Sub2 local1800 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local503];
											@Pc(1813) Class16 local1813 = local21.anInt2786 == -1 ? null : Static114.aClass156_2.method4101(local21.anInt2786);
											if (local1800 != null && (local503 == Static412.anInt7714 || Static197.method3728(local1800.aString95) == local21.anInt2773)) {
												local1585 = local1800.aClass67_1.method1977(0, Static504.aClass343_2, local21.anInt2737, Static435.aClass234_1, local21.anInt2772, 2048, Static114.aClass156_2, Static416.aClass250_1, null, local1813, Static323.aClass9_8, local21.anInt2795, null, -1, 0, Static517.aClass285_2, Static98.aClass203_1);
											}
										}
									} else if (local21.anInt2779 == 8 || local21.anInt2779 == 9) {
										@Pc(1676) Class6_Sub15 local1676 = Static519.method7596(local21.anInt2805, false);
										local1619 = local21.anInt2786 == -1 ? null : Static114.aClass156_2.method4101(local21.anInt2786);
										if (local1676 != null) {
											local1627 = local21.aBoolean224 ? Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1 : null;
											local1585 = local1676.method2101(local21.anInt2737, Static323.aClass9_8, local21.anInt2772, local21.anInt2773, local21.anInt2795, local1619, local21.anInt2779 == 9, local1627);
										}
									} else if (local21.anInt2786 == -1) {
										local1585 = local21.method2492(0, Static435.aClass234_1, Static504.aClass343_2, null, Static517.aClass285_2, 2048, Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1, Static416.aClass250_1, Static114.aClass156_2, -1, -1, Static323.aClass9_8, Static98.aClass203_1);
										if (local1585 == null && Static454.aBoolean623) {
											Static468.method7221(local21);
										}
									} else {
										@Pc(1733) Class16 local1733 = Static114.aClass156_2.method4101(local21.anInt2786);
										local1585 = local21.method2492(local21.anInt2737, Static435.aClass234_1, Static504.aClass343_2, local1733, Static517.aClass285_2, 2048, Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1, Static416.aClass250_1, Static114.aClass156_2, local21.anInt2772, local21.anInt2795, Static323.aClass9_8, Static98.aClass203_1);
										if (local1585 == null && Static454.aBoolean623) {
											Static468.method7221(local21);
										}
									}
									if (local1585 != null) {
										if (local21.anInt2809 <= 0) {
											local503 = 512;
										} else {
											local503 = (local21.anInt2777 << 9) / local21.anInt2809;
										}
										if (local21.anInt2802 <= 0) {
											local1242 = 512;
										} else {
											local1242 = (local21.anInt2738 << 9) / local21.anInt2802;
										}
										local537 = (local21.anInt2757 * local503 >> 9) + local88 + local21.anInt2777 / 2;
										local539 = local21.anInt2738 / 2 + local94 + (local1242 * local21.anInt2808 >> 9);
										Static19.aClass8_2.Y();
										Static323.aClass9_8.method5429(Static19.aClass8_2);
										Static323.aClass9_8.m(local537, local539, local503, local1242);
										Static323.aClass9_8.ka((float) (local21.anInt2813 << 2), local21.aBoolean221 ? (float) (local21.anInt2801 << 2) : (float) (local21.anInt2801 << 2) * 1.5F);
										if (arg6 == -1412584499 || Static459.aBoolean363) {
											Static323.aClass9_8.F();
											Static323.aClass9_8.method5430();
											Static323.aClass9_8.ca(arg3, arg4, arg5, arg7);
											Static459.aBoolean363 = false;
										}
										if (local21.aBoolean223) {
											Static323.aClass9_8.method5455(false);
										}
										local550 = Class179.anIntArray756[local21.anInt2758 << 3] * (local21.anInt2800 << 2) >> 14;
										local642 = (local21.anInt2800 << 2) * Class179.anIntArray757[local21.anInt2758 << 3] >> 14;
										Static308.aClass8_7.ra(-local21.anInt2816 << 3);
										Static308.aClass8_7.P(local21.anInt2783 << 3);
										Static308.aClass8_7.G(local21.anInt2814 << 2, local244 + local550 + (local21.anInt2754 << 2), (local21.anInt2754 << 2) + local642);
										Static308.aClass8_7.S(local21.anInt2758 << 3);
										local21.method2489(Static308.aClass8_7, local1585, Static323.aClass9_8, Static508.anInt8998);
										if (Static174.aBoolean324) {
											Static323.aClass9_8.Q(local88, local94, local88 + local21.anInt2777, local21.anInt2738 + local94);
										}
										if (local21.aBoolean221) {
											local1585.method7075(Static308.aClass8_7, null, local21.anInt2800 << 2);
										} else if (local21.aClass5_Sub2_4 == null) {
											local1585.method7077(Static308.aClass8_7, null, 1);
										} else {
											Static323.aClass9_8.method5457(local1585, local21.aClass5_Sub2_4.method3782(), Static308.aClass8_7, null, 1);
										}
										if (Static174.aBoolean324) {
											Static323.aClass9_8.ca(arg3, arg4, arg5, arg7);
										}
										if (local21.aBoolean223) {
											Static323.aClass9_8.method5455(true);
										}
										Static323.aClass9_8.ka(0.0F, 0.0F);
									}
								} else if (local21.anInt2823 == 9) {
									if (local21.aBoolean232) {
										local244 = local94 + local21.anInt2738;
										local503 = local21.anInt2777 + local88;
										local1242 = local94;
									} else {
										local503 = local21.anInt2777 + local88;
										local1242 = local94 + local21.anInt2738;
										local244 = local94;
									}
									if (local21.anInt2792 == 1) {
										Static323.aClass9_8.method5450(local88, local244, local503, local1242, local21.anInt2821, 0);
									} else {
										Static323.aClass9_8.method5399(local88, local244, local503, local1242, local21.anInt2821, local21.anInt2792);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!pi;I)I")
	public static int method5248(@OriginalArg(0) Class11_Sub1_Sub1_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt7458;
		@Pc(17) Class169 local17 = arg0.method6209();
		if (arg0.aBoolean545) {
			local13 = arg0.anInt7461;
		} else if (arg0.anInt7390 == local17.anInt5181 || local17.anInt5178 == arg0.anInt7390 || arg0.anInt7390 == local17.anInt5164 || arg0.anInt7390 == local17.anInt5191) {
			local13 = arg0.anInt7451;
		} else if (local17.anInt5161 == arg0.anInt7390 || arg0.anInt7390 == local17.anInt5160 || arg0.anInt7390 == local17.anInt5166 || arg0.anInt7390 == local17.anInt5194) {
			local13 = arg0.anInt7442;
		}
		return local13;
	}
}
