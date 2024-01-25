import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
	public static int anInt4763 = 0;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
	public static int anInt4764 = 0;

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "Lclient!hs;")
	public static final Class136 aClass136_68 = new Class136(1, 1);

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_59 = new Class316(2, 2);

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_60 = new Class316(38, 2);

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "Z")
	public static boolean aBoolean353 = false;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!ql;Z)V")
	public static void method4035(@OriginalArg(0) Class6_Sub12_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static534.anInt8867; local3++) {
			@Pc(9) int local9 = Static124.anIntArray181[local3];
			@Pc(13) Class15_Sub2_Sub4_Sub2 local13 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local9];
			@Pc(17) int local17 = arg0.method6019();
			if ((local17 & 0x20) != 0) {
				local17 += arg0.method6019() << 8;
			}
			if ((local17 & 0x8000) != 0) {
				local17 += arg0.method6019() << 16;
			}
			Static34.method541(local9, local17, arg0, local13);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([Lclient!faa;IIIIIIIIB)V")
	public static void method4037(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static554.aClass90_12.ca(arg1, arg8, arg5, arg7);
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(24) Class97 local24 = arg0[local13];
			if (local24 != null && (arg4 == local24.anInt2655 || arg4 == -1412584499 && local24 == Static165.aClass97_8)) {
				@Pc(69) int local69;
				if (arg6 == -1) {
					Class343.aRectangleArray5[Static97.anInt1562].setBounds(local24.anInt2642 + arg3, local24.anInt2641 - -arg2, local24.anInt2690, local24.anInt2670);
					local69 = Static97.anInt1562++;
				} else {
					local69 = arg6;
				}
				local24.anInt2662 = local69;
				local24.anInt2623 = Static363.anInt6671;
				if (!Static74.method1046(local24)) {
					if (local24.anInt2625 != 0) {
						Static69.method977(local24);
					}
					@Pc(93) int local93 = arg3 + local24.anInt2642;
					@Pc(98) int local98 = arg2 + local24.anInt2641;
					@Pc(101) int local101 = local24.anInt2602;
					if (Static37.aBoolean48 && (Static74.method1044(local24).anInt7305 != 0 || local24.anInt2637 == 0) && local101 > 127) {
						local101 = 127;
					}
					@Pc(153) int local153;
					@Pc(157) int local157;
					if (Static165.aClass97_8 == local24) {
						if (arg4 != -1412584499 && (local24.lb == Static392.anInt7163 || Static386.anInt7091 == local24.lb)) {
							Static240.anInt4400 = arg2;
							Static78.aClass97Array1 = arg0;
							Static511.anInt8791 = arg3;
							continue;
						}
						if (Static301.aBoolean383 && Static471.aBoolean538) {
							local153 = Static9.aClass29_1.method2946();
							local157 = Static9.aClass29_1.method2942();
							local157 -= Static63.anInt1087;
							local153 -= Static403.anInt7295;
							if (Static232.anInt9855 > local153) {
								local153 = Static232.anInt9855;
							}
							if (Static580.aClass97_26.anInt2690 + Static232.anInt9855 < local24.anInt2690 + local153) {
								local153 = Static232.anInt9855 + Static580.aClass97_26.anInt2690 - local24.anInt2690;
							}
							if (local157 < Static86.anInt9999) {
								local157 = Static86.anInt9999;
							}
							local93 = local153;
							if (local24.anInt2670 + local157 > Static86.anInt9999 - -Static580.aClass97_26.anInt2670) {
								local157 = Static86.anInt9999 + Static580.aClass97_26.anInt2670 - local24.anInt2670;
							}
							local98 = local157;
						}
						if (Static386.anInt7091 == local24.lb) {
							local101 = 128;
						}
					}
					@Pc(247) int local247;
					@Pc(249) int local249;
					@Pc(256) int local256;
					@Pc(261) int local261;
					if (local24.anInt2637 == 2) {
						local157 = arg8;
						local153 = arg1;
						local247 = arg5;
						local249 = arg7;
					} else {
						local256 = local93 + local24.anInt2690;
						local261 = local98 + local24.anInt2670;
						if (local24.anInt2637 == 9) {
							local261++;
							local256++;
						}
						local157 = arg8 < local98 ? local98 : arg8;
						local153 = arg1 >= local93 ? arg1 : local93;
						local247 = arg5 <= local256 ? arg5 : local256;
						local249 = local261 >= arg7 ? arg7 : local261;
					}
					if (local247 > local153 && local157 < local249) {
						@Pc(499) int local499;
						@Pc(532) int local532;
						@Pc(545) int local545;
						@Pc(638) int local638;
						@Pc(530) int local530;
						if (local24.anInt2625 != 0) {
							if (Static44.anInt827 == local24.anInt2625 || local24.anInt2625 == Static216.anInt1263) {
								Static93.method1389(local24.anInt2670, local98, local93, local24.anInt2690, local24.anInt2625 == Static216.anInt1263);
								Static543.aBooleanArray30[local69] = true;
								Static554.aClass90_12.ca(arg1, arg8, arg5, arg7);
								continue;
							}
							if (Static563.anInt9781 == local24.anInt2625) {
								if (local24.method2294(Static554.aClass90_12) != null) {
									Static262.method3999();
									Static444.method6285(Static554.aClass90_12, local93, local24, local98);
									Static366.aBooleanArray23[local69] = true;
									Static554.aClass90_12.ca(arg1, arg8, arg5, arg7);
								}
								continue;
							}
							if (local24.anInt2625 == Static14.anInt7434) {
								if (local24.method2294(Static554.aClass90_12) != null) {
									Static438.method6207(local98, local24, local93);
									Static366.aBooleanArray23[local69] = true;
									Static554.aClass90_12.ca(arg1, arg8, arg5, arg7);
								}
								continue;
							}
							if (local24.anInt2625 == Static171.anInt9042) {
								Static261.method3997(local24.anInt2670, local24.anInt2690, local98, Static214.anInterface2_13, Static554.aClass90_12, local93);
								Static543.aBooleanArray30[local69] = true;
								Static554.aClass90_12.ca(arg1, arg8, arg5, arg7);
								continue;
							}
							if (Static528.anInt9121 == local24.anInt2625) {
								Static310.method4665(local24.anInt2690, local98, local93, local24.anInt2670, Static554.aClass90_12);
								Static543.aBooleanArray30[local69] = true;
								Static554.aClass90_12.ca(arg1, arg8, arg5, arg7);
								continue;
							}
							if (Static124.anInt2132 == local24.anInt2625) {
								if (!Static32.aBoolean33 && !Static542.aBoolean620) {
									continue;
								}
								local256 = local93 + local24.anInt2690;
								local261 = local98 + 15;
								if (Static32.aBoolean33) {
									local499 = -256;
									if (Static236.anInt4289 < 20) {
										local499 = -65536;
									}
									Static75.aClass82_1.method7868(local261, local256, local499, "Fps:" + Static236.anInt4289, -1);
									local261 += 15;
									@Pc(521) Runtime local521 = Runtime.getRuntime();
									local530 = (int) ((local521.totalMemory() - local521.freeMemory()) / 1024L);
									local532 = -256;
									if (local530 > 65536) {
										local532 = -65536;
										if (Static198.aBoolean301) {
											Static436.method6187();
											for (local545 = 0; local545 < 10; local545++) {
												System.gc();
											}
											local530 = (int) ((local521.totalMemory() - local521.freeMemory()) / 1024L);
											if (local530 > 65536) {
												Static141.method2337("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static75.aClass82_1.method7868(local261, local256, local532, "Mem:" + local530 + "k", -1);
									local261 += 15;
									Static75.aClass82_1.method7868(local261, local256, -256, "In:" + Static362.anInt6653 + "B/s Out:" + Static286.anInt5275 + "B/s", -1);
									local261 += 15;
									local545 = Static554.aClass90_12.v() / 1024;
									Static75.aClass82_1.method7868(local261, local256, local545 <= 65536 ? -256 : -65536, "Offheap:" + local545 + "k", -1);
									local261 += 15;
									local638 = 0;
									@Pc(640) int local640 = 0;
									@Pc(642) int local642 = 0;
									for (@Pc(644) int local644 = 0; local644 < 34; local644++) {
										local638 += Static355.aClass58_Sub1Array2[local644].method1070();
										local640 += Static355.aClass58_Sub1Array2[local644].method1068();
										local642 += Static355.aClass58_Sub1Array2[local644].method1074();
									}
									@Pc(680) int local680 = local642 * 100 / local638;
									@Pc(686) int local686 = local640 * 10000 / local638;
									@Pc(706) String local706 = "Cache:" + Static126.method1948(2, (long) local686, 0, true) + "% (" + local680 + "%)";
									Static266.aClass82_4.method7868(local261, local256, -256, local706, -1);
									local261 += 12;
								}
								if (Static518.anInt8889 > 0) {
									Static266.aClass82_4.method7868(local261, local256, -256, "Particles: " + Static102.anInt1603 + " / " + Static518.anInt8889, -1);
								}
								local261 += 12;
								if (Static542.aBoolean620) {
									Static266.aClass82_4.method7868(local261, local256, -256, "Polys: " + Static554.aClass90_12.SA() + " Models: " + Static554.aClass90_12.aa(), -1);
									local261 += 12;
									Static266.aClass82_4.method7868(local261, local256, -256, "Ls: " + Static556.anInt9659 + " La: " + Static400.anInt7246 + " NPC: " + Static186.anInt3614 + " Pl: " + Static116.anInt1993, -1);
									Static437.method6194();
									local261 += 12;
								}
								Static543.aBooleanArray30[local69] = true;
								continue;
							}
						}
						if (local24.anInt2637 == 0) {
							if (local24.anInt2625 == Static21.anInt379 && Static554.aClass90_12.method7496()) {
								Static554.aClass90_12.method7465(local93, local98, local24.anInt2690, local24.anInt2670);
							}
							method4037(arg0, local153, local98 - local24.anInt2665, local93 - local24.anInt2691, local24.anInt2678, local247, local69, local249, local157);
							if (local24.aClass97Array2 != null) {
								method4037(local24.aClass97Array2, local153, local98 - local24.anInt2665, local93 + -local24.anInt2691, local24.anInt2678, local247, local69, local249, local157);
							}
							@Pc(873) Class6_Sub43 local873 = (Class6_Sub43) Static162.aClass234_23.method5464((long) local24.anInt2678);
							if (local873 != null) {
								Static170.method2694(local69, local247, local249, local873.anInt8192, local98, local157, local93, local153);
							}
							if (Static21.anInt379 == local24.anInt2625 && Static554.aClass90_12.method7496()) {
								Static554.aClass90_12.method7501();
								Static17.aBoolean16 = true;
							}
							Static554.aClass90_12.ca(arg1, arg8, arg5, arg7);
						}
						if (Static100.aBooleanArray7[local69] || Static365.anInt6688 > 1) {
							if (local24.anInt2637 == 3) {
								if (local101 == 0) {
									if (local24.aBoolean196) {
										Static554.aClass90_12.C(local93, local98, local24.anInt2690, local24.anInt2670, local24.anInt2606, 0);
									} else {
										Static554.aClass90_12.method7494(local93, local98, local24.anInt2690, local24.anInt2670, local24.anInt2606, 0);
									}
								} else if (local24.aBoolean196) {
									Static554.aClass90_12.C(local93, local98, local24.anInt2690, local24.anInt2670, local24.anInt2606 & 0xFFFFFF | 255 - (local101 & 0xFF) << 24, 1);
								} else {
									Static554.aClass90_12.method7494(local93, local98, local24.anInt2690, local24.anInt2670, 255 - (local101 & 0xFF) << 24 | local24.anInt2606 & 0xFFFFFF, 1);
								}
							} else if (local24.anInt2637 == 4) {
								@Pc(1004) Class82 local1004 = local24.method2297(Static554.aClass90_12);
								if (local1004 != null) {
									local261 = local24.anInt2606;
									@Pc(1019) String local1019 = local24.aString18;
									if (local24.anInt2607 != -1) {
										@Pc(1030) Class236 local1030 = Static119.aClass244_4.method5726(local24.anInt2607);
										local1019 = local1030.aString53;
										if (local1019 == null) {
											local1019 = "null";
										}
										if ((local1030.anInt6783 == 1 || local24.anInt2660 != 1) && local24.anInt2660 != -1) {
											local1019 = "<col=ff9040>" + local1019 + "</col> x" + Static76.method1082(local24.anInt2660);
										}
									}
									if (Static200.aClass97_11 == local24) {
										local1019 = Static146.aClass103_78.method2355(Static188.anInt28);
										local261 = local24.anInt2606;
									}
									if (Static543.aBoolean621) {
										Static554.aClass90_12.Q(local93, local98, local24.anInt2690 + local93, local98 + local24.anInt2670);
									}
									local1004.method7867(local24.anInt2670, 255 - (local101 & 0xFF) << 24 | local261, Static390.aClass71Array43, local24.aBoolean203 ? 255 - (local101 & 0xFF) << 24 : -1, local24.anInt2690, local1019, local93, null, 0, 0, null, local24.anInt2648, local98, local24.anInt2652, local24.anInt2684, local24.anInt2617);
									if (Static543.aBoolean621) {
										Static554.aClass90_12.ca(arg1, arg8, arg5, arg7);
									}
								} else if (Static180.aBoolean282) {
									Static479.method6666(local24);
								}
							} else {
								@Pc(1256) int local1256;
								if (local24.anInt2637 == 5) {
									if (local24.anInt2654 >= 0) {
										local24.method2281(Static376.aClass116_1, Static57.aClass14_1).method3487(local98, local24.anInt2670, local24.anInt2619 << 3, 0, local93, local24.anInt2690, 0, local24.anInt2612 << 3, Static554.aClass90_12);
									} else {
										@Pc(1194) Class71 local1194;
										if (local24.anInt2607 == -1) {
											local1194 = local24.method2286(Static554.aClass90_12);
										} else {
											@Pc(1204) Class212 local1204 = local24.aBoolean201 ? Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1 : null;
											local1194 = Static119.aClass244_4.method5712(local1204, local24.anInt2634, Static554.aClass90_12, local24.anInt2689, local24.anInt2607, local24.anInt2647 | 0xFF000000, local24.anInt2660);
										}
										if (local1194 != null) {
											local261 = local1194.AA();
											local499 = local1194.a();
											local1256 = 255 - (local101 & 0xFF) << 24 | (local24.anInt2606 == 0 ? 16777215 : local24.anInt2606 & 0xFFFFFF);
											if (local24.aBoolean205) {
												Static554.aClass90_12.Q(local93, local98, local24.anInt2690 + local93, local24.anInt2670 + local98);
												if (local24.anInt2649 != 0) {
													local530 = (local24.anInt2690 + local261 - 1) / local261;
													local532 = (local24.anInt2670 + local499 - 1) / local499;
													for (local545 = 0; local545 < local530; local545++) {
														for (local638 = 0; local638 < local532; local638++) {
															if (local24.anInt2606 == 0) {
																local1194.method7768((float) (local93 + local261 * local545) + (float) local261 / 2.0F, (float) local499 / 2.0F + (float) (local98 + local638 * local499), 4096, local24.anInt2649);
															} else {
																local1194.method7770((float) local261 / 2.0F + (float) (local93 + local545 * local261), (float) local499 / 2.0F + (float) (local638 * local499 + local98), 4096, local24.anInt2649, local1256);
															}
														}
													}
												} else if (local24.anInt2606 == 0 && local101 == 0) {
													local1194.method7776(local93, local98, local24.anInt2690, local24.anInt2670);
												} else {
													local1194.ba(local93, local98, local24.anInt2690, local24.anInt2670, 0, local1256, 1);
												}
												Static554.aClass90_12.ca(arg1, arg8, arg5, arg7);
											} else if (local24.anInt2606 == 0 && local101 == 0) {
												if (local24.anInt2649 != 0) {
													local1194.method7768((float) local24.anInt2690 / 2.0F + (float) local93, (float) local24.anInt2670 / 2.0F + (float) local98, local24.anInt2690 * 4096 / local261, local24.anInt2649);
												} else if (local261 == local24.anInt2690 && local499 == local24.anInt2670) {
													local1194.method7775(local93, local98);
												} else {
													local1194.method7774(local93, local98, local24.anInt2690, local24.anInt2670);
												}
											} else if (local24.anInt2649 != 0) {
												local1194.method7770((float) local93 + (float) local24.anInt2690 / 2.0F, (float) local24.anInt2670 / 2.0F + (float) local98, local24.anInt2690 * 4096 / local261, local24.anInt2649, local1256);
											} else if (local24.anInt2690 == local261 && local499 == local24.anInt2670) {
												local1194.I(local93, local98, 0, local1256, 1);
											} else {
												local1194.KA(local93, local98, local24.anInt2690, local24.anInt2670, 0, local1256, 1);
											}
										} else if (Static180.aBoolean282) {
											Static479.method6666(local24);
										}
									}
								} else if (local24.anInt2637 == 6) {
									Static51.method780();
									@Pc(1564) Class24 local1564 = null;
									local261 = 0;
									@Pc(1743) Class63 local1743;
									@Pc(1753) Class212 local1753;
									if (local24.anInt2607 != -1) {
										@Pc(1783) Class236 local1783 = Static119.aClass244_4.method5726(local24.anInt2607);
										if (local1783 != null) {
											local1783 = local1783.method5485(local24.anInt2660);
											local1743 = local24.anInt2620 == -1 ? null : Static388.aClass324_2.method7265(local24.anInt2620);
											local1753 = local24.aBoolean201 ? Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1 : null;
											local1564 = local1783.method5488(local24.anInt2685, 1, local24.anInt2626, Static554.aClass90_12, local1753, 2048, local1743, local24.anInt2601);
											if (local1564 == null) {
												Static479.method6666(local24);
											} else {
												local261 = -local1564.DA() >> 1;
											}
										}
									} else if (local24.anInt2681 == 5) {
										local499 = local24.anInt2636;
										if (local499 >= 0 && local499 < 2048) {
											@Pc(1591) Class15_Sub2_Sub4_Sub2 local1591 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local499];
											@Pc(1604) Class63 local1604 = local24.anInt2620 == -1 ? null : Static388.aClass324_2.method7265(local24.anInt2620);
											if (local1591 != null && (local499 == Static517.anInt8881 || Static194.method3294(local1591.aString82) == local24.anInt2682)) {
												local1564 = local1591.aClass212_1.method5073(Static554.aClass90_12, Static388.aClass324_2, local24.anInt2601, 0, local24.anInt2685, null, Static518.aClass242_2, local1604, local24.anInt2626, Static119.aClass244_4, 2048, -1, null, Static119.aClass226_4, 0, Static81.aClass12_1, Static65.aClass51_1);
											}
										}
									} else if (local24.anInt2681 == 8 || local24.anInt2681 == 9) {
										@Pc(1730) Class6_Sub46 local1730 = Static378.method5549(false, local24.anInt2636);
										local1743 = local24.anInt2620 == -1 ? null : Static388.aClass324_2.method7265(local24.anInt2620);
										if (local1730 != null) {
											local1753 = local24.aBoolean201 ? Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1 : null;
											local1564 = local1730.method6589(local24.anInt2601, Static554.aClass90_12, local1753, local24.anInt2685, local24.anInt2682, local24.anInt2626, local24.anInt2681 == 9, local1743);
										}
									} else if (local24.anInt2620 == -1) {
										local1564 = local24.method2295(2048, Static388.aClass324_2, -1, 0, -1, Static518.aClass242_2, Static119.aClass226_4, Static81.aClass12_1, Static119.aClass244_4, Static65.aClass51_1, null, Static554.aClass90_12, Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1);
										if (local1564 == null && Static180.aBoolean282) {
											Static479.method6666(local24);
										}
									} else {
										@Pc(1669) Class63 local1669 = Static388.aClass324_2.method7265(local24.anInt2620);
										local1564 = local24.method2295(2048, Static388.aClass324_2, local24.anInt2601, local24.anInt2685, local24.anInt2626, Static518.aClass242_2, Static119.aClass226_4, Static81.aClass12_1, Static119.aClass244_4, Static65.aClass51_1, local1669, Static554.aClass90_12, Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1);
										if (local1564 == null && Static180.aBoolean282) {
											Static479.method6666(local24);
										}
									}
									if (local1564 != null) {
										if (local24.anInt2633 > 0) {
											local499 = (local24.anInt2690 << 9) / local24.anInt2633;
										} else {
											local499 = 512;
										}
										if (local24.anInt2621 > 0) {
											local1256 = (local24.anInt2670 << 9) / local24.anInt2621;
										} else {
											local1256 = 512;
										}
										local530 = (local24.anInt2624 * local499 >> 9) + local93 + local24.anInt2690 / 2;
										local532 = (local1256 * local24.anInt2645 >> 9) + local24.anInt2670 / 2 + local98;
										Static211.aClass93_7.Y();
										Static554.aClass90_12.method7492(Static211.aClass93_7);
										Static554.aClass90_12.m(local530, local532, local499, local1256);
										Static554.aClass90_12.ka((float) (local24.anInt2611 << 2), local24.aBoolean206 ? (float) (local24.anInt2653 << 2) : (float) (local24.anInt2653 << 2) * 1.5F);
										if (arg4 == -1412584499 || Static17.aBoolean16) {
											Static554.aClass90_12.F();
											Static554.aClass90_12.method7521();
											Static554.aClass90_12.ca(arg1, arg8, arg5, arg7);
											Static17.aBoolean16 = false;
										}
										if (local24.aBoolean194) {
											Static554.aClass90_12.method7500(false);
										}
										local545 = (local24.anInt2683 << 2) * Class22.anIntArray20[local24.anInt2687 << 3] >> 14;
										local638 = Class22.anIntArray19[local24.anInt2687 << 3] * (local24.anInt2683 << 2) >> 14;
										Static445.aClass93_8.ra(-local24.anInt2661 << 3);
										Static445.aClass93_8.P(local24.anInt2639 << 3);
										Static445.aClass93_8.G(local24.anInt2630 << 2, local545 + (local24.anInt2614 << 2) + local261, (local24.anInt2614 << 2) + local638);
										Static445.aClass93_8.S(local24.anInt2687 << 3);
										local24.method2289(Static363.anInt6671, Static445.aClass93_8, local1564, Static554.aClass90_12);
										if (Static543.aBoolean621) {
											Static554.aClass90_12.Q(local93, local98, local93 + local24.anInt2690, local98 + local24.anInt2670);
										}
										if (local24.aBoolean206) {
											local1564.method7392(Static445.aClass93_8, null, local24.anInt2683 << 2);
										} else if (local24.aClass60_Sub4_2 == null) {
											local1564.method7393(Static445.aClass93_8, null, 1);
										} else {
											Static554.aClass90_12.method7470(local1564, local24.aClass60_Sub4_2.method3575(), Static445.aClass93_8, null, 1);
										}
										if (Static543.aBoolean621) {
											Static554.aClass90_12.ca(arg1, arg8, arg5, arg7);
										}
										if (local24.aBoolean194) {
											Static554.aClass90_12.method7500(true);
										}
										Static554.aClass90_12.ka(0.0F, 0.0F);
									}
								} else if (local24.anInt2637 == 9) {
									if (local24.aBoolean197) {
										local499 = local24.anInt2690 + local93;
										local261 = local98 + local24.anInt2670;
										local1256 = local98;
									} else {
										local499 = local24.anInt2690 + local93;
										local261 = local98;
										local1256 = local98 + local24.anInt2670;
									}
									if (local24.anInt2631 == 1) {
										Static554.aClass90_12.method7484(local93, local261, local499, local1256, local24.anInt2606, 0);
									} else {
										Static554.aClass90_12.method7515(local93, local261, local499, local1256, local24.anInt2606, local24.anInt2631);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILclient!ti;Lclient!ti;)V")
	public static void method4038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub4 arg3, @OriginalArg(4) Class15_Sub4 arg4) {
		@Pc(4) Class133 local4 = Static90.method4174(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass15_Sub4_2 = arg3;
			local4.aClass15_Sub4_1 = arg4;
		}
	}
}
