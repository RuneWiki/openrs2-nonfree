import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!wn", name = "Ab", descriptor = "[J")
	public static final long[] aLongArray56 = new long[32];

	@OriginalMember(owner = "client!wn", name = "Db", descriptor = "I")
	public static int anInt10264 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([Lclient!paa;IIIIIIIIZI)V")
	public static void method8556(@OriginalArg(0) Class261[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		Static192.aClass95_4.KA(arg1, arg6, arg9, arg4);
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(19) Class261 local19 = arg0[local13];
			if (local19 != null && (local19.anInt6631 == arg5 || arg5 == -1412584499 && local19 == Static444.aClass261_9)) {
				@Pc(40) int local40 = arg7 + local19.anInt6642;
				@Pc(45) int local45 = arg2 + local19.anInt6623;
				@Pc(52) int local52 = local40 + local19.anInt6595 + 1;
				@Pc(59) int local59 = local45 + local19.anInt6622 + 1;
				@Pc(84) int local84;
				if (arg3 == -1) {
					Class2_Sub2_Sub10.aRectangleArray1[Static385.anInt6044].setBounds(arg7 + local19.anInt6642, arg2 + local19.anInt6623, local19.anInt6595, local19.anInt6622);
					local84 = Static385.anInt6044++;
				} else {
					local84 = arg3;
				}
				local19.anInt6625 = local84;
				local19.anInt6591 = Static262.anInt5597;
				if (!Static76.method1080(local19)) {
					if (local19.anInt6573 != 0) {
						Static303.method4175(local19);
					}
					@Pc(112) int local112 = local19.anInt6642 + arg7;
					@Pc(117) int local117 = arg2 + local19.anInt6623;
					@Pc(119) int local119 = 0;
					@Pc(121) int local121 = 0;
					if (Static319.aBoolean356) {
						local119 = Static274.method3801();
						local121 = Static69.method966();
					}
					@Pc(132) int local132 = local19.anInt6628;
					if (Static488.aBoolean602 && (Static76.method1071(local19).anInt8108 != 0 || local19.anInt6635 == 0) && local132 > 127) {
						local132 = 127;
					}
					@Pc(191) int local191;
					@Pc(197) int local197;
					if (local19 == Static444.aClass261_9) {
						if (arg5 != -1412584499 && (local19.anInt6646 == Static136.anInt9999 || local19.anInt6646 == Static200.anInt3397)) {
							Static589.anInt9581 = arg2;
							Static366.aClass261Array1 = arg0;
							Static14.anInt165 = arg7;
							continue;
						}
						if (Static118.aBoolean156 && Static443.aBoolean532) {
							local191 = Static507.aClass335_1.method7811() + local119;
							local197 = local121 + Static507.aClass335_1.method7821();
							local191 -= Static280.anInt4507;
							local197 -= Static434.anInt7016;
							if (Static496.anInt8111 > local191) {
								local191 = Static496.anInt8111;
							}
							if (local19.anInt6595 + local191 > Static583.aClass261_12.anInt6595 + Static496.anInt8111) {
								local191 = Static496.anInt8111 + Static583.aClass261_12.anInt6595 - local19.anInt6595;
							}
							if (Static217.anInt3575 > local197) {
								local197 = Static217.anInt3575;
							}
							if (local197 + local19.anInt6622 > Static217.anInt3575 - -Static583.aClass261_12.anInt6622) {
								local197 = Static217.anInt3575 + Static583.aClass261_12.anInt6622 - local19.anInt6622;
							}
							local112 = local191;
							local117 = local197;
						}
						if (local19.anInt6646 == Static200.anInt3397) {
							local132 = 128;
						}
					}
					@Pc(332) int local332;
					@Pc(321) int local321;
					@Pc(285) int local285;
					@Pc(290) int local290;
					if (local19.anInt6635 == 2) {
						local197 = arg6;
						local321 = arg4;
						local332 = arg9;
						local191 = arg1;
					} else {
						local285 = local19.anInt6595 + local112;
						local290 = local117 + local19.anInt6622;
						local191 = arg1 < local112 ? local112 : arg1;
						local197 = arg6 < local117 ? local117 : arg6;
						if (local19.anInt6635 == 9) {
							local290++;
							local285++;
						}
						local321 = arg4 <= local290 ? arg4 : local290;
						local332 = local285 >= arg9 ? arg9 : local285;
					}
					if (local332 > local191 && local197 < local321) {
						@Pc(639) int local639;
						@Pc(648) int local648;
						@Pc(745) int local745;
						@Pc(604) int local604;
						@Pc(637) int local637;
						if (local19.anInt6573 != 0) {
							if (local19.anInt6573 == Static476.anInt7607 || Static324.anInt5147 == local19.anInt6573) {
								Static70.method970(local112, local117, local19);
								if (!Static319.aBoolean356) {
									Static45.method743(local19.anInt6595, local112, local19.anInt6622, local117, Static324.anInt5147 == local19.anInt6573);
									Static192.aClass95_4.KA(arg1, arg6, arg9, arg4);
								}
								Static69.aBooleanArray25[local84] = true;
								continue;
							}
							if (local19.anInt6573 == Static534.anInt8757) {
								if (local19.method5621(Static192.aClass95_4) != null) {
									Static48.method803();
									Static644.method8650(local19, local117, local112, Static192.aClass95_4);
									Static498.aBooleanArray144[local84] = true;
									Static192.aClass95_4.KA(arg1, arg6, arg9, arg4);
									if (Static319.aBoolean356) {
										if (arg8) {
											Static170.method7976(local52, local59, local40, local45);
										} else {
											Static204.method2872(local59, local52, local45, local40);
										}
									}
								}
								continue;
							}
							if (Static192.anInt3299 == local19.anInt6573) {
								if (local19.method5621(Static192.aClass95_4) != null) {
									Static442.method6036(local112, local19, local117);
									Static498.aBooleanArray144[local84] = true;
									Static192.aClass95_4.KA(arg1, arg6, arg9, arg4);
									if (Static319.aBoolean356) {
										if (arg8) {
											Static170.method7976(local52, local59, local40, local45);
										} else {
											Static204.method2872(local59, local52, local45, local40);
										}
									}
								}
								continue;
							}
							if (Static40.anInt796 == local19.anInt6573) {
								Static321.method4298(local19.anInt6595, local19.anInt6622, local117, local112, Static192.aClass95_4, Static252.anInterface6_14);
								Static69.aBooleanArray25[local84] = true;
								Static192.aClass95_4.KA(arg1, arg6, arg9, arg4);
								continue;
							}
							if (Static42.anInt5797 == local19.anInt6573) {
								Static106.method1600(local19.anInt6622, local117, local19.anInt6595, local112, Static192.aClass95_4);
								Static69.aBooleanArray25[local84] = true;
								Static192.aClass95_4.KA(arg1, arg6, arg9, arg4);
								continue;
							}
							if (Static194.anInt9147 == local19.anInt6573) {
								if (!Static80.aBoolean117 && !Static435.aBoolean240) {
									continue;
								}
								local285 = local112 + local19.anInt6595;
								if (Static319.aBoolean356) {
									if (arg8) {
										Static170.method7976(local52, local59, local40, local45);
									} else {
										Static204.method2872(local59, local52, local45, local40);
									}
								}
								local290 = local117 + 15;
								if (Static80.aBoolean117) {
									local604 = -256;
									if (Static70.anInt1230 < 20) {
										local604 = -65536;
									}
									Static505.aClass62_21.method5679(local604, local285, -1, local290, "Fps:" + Static70.anInt1230);
									local290 += 15;
									@Pc(628) Runtime local628 = Runtime.getRuntime();
									local637 = (int) ((local628.totalMemory() - local628.freeMemory()) / 1024L);
									local639 = -256;
									if (local637 > 98304) {
										if (Static540.aBoolean664) {
											Static378.method8123();
											for (local648 = 0; local648 < 10; local648++) {
												System.gc();
											}
											local637 = (int) ((local628.totalMemory() - local628.freeMemory()) / 1024L);
											if (local637 > 65536) {
												Static3.method8592("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local639 = -65536;
									}
									Static505.aClass62_21.method5679(local639, local285, -1, local290, "Mem:" + local637 + "k");
									local290 += 15;
									Static505.aClass62_21.method5679(-256, local285, -1, local290, "In:" + Static443.anInt7088 + "B/s Out:" + Static46.anInt977 + "B/s");
									local290 += 15;
									local648 = Static192.aClass95_4.E() / 1024;
									Static505.aClass62_21.method5679(local648 <= 65536 ? -256 : -65536, local285, -1, local290, "Offheap:" + local648 + "k");
									local290 += 15;
									local745 = 0;
									@Pc(747) int local747 = 0;
									@Pc(749) int local749 = 0;
									for (@Pc(751) int local751 = 0; local751 < 37; local751++) {
										if (Static181.aClass20_Sub1Array2[local751] != null) {
											local745 += Static181.aClass20_Sub1Array2[local751].method475();
											local747 += Static181.aClass20_Sub1Array2[local751].method468();
											local749 += Static181.aClass20_Sub1Array2[local751].method472();
										}
									}
									@Pc(793) int local793 = local749 * 100 / local745;
									@Pc(799) int local799 = local747 * 10000 / local745;
									@Pc(819) String local819 = "Cache:" + Static350.method4701(2, true, (long) local799, 0) + "% (" + local793 + "%)";
									Static139.aClass62_7.method5679(-256, local285, -1, local290, local819);
									local290 += 12;
								}
								if (Static546.anInt8995 > 0) {
									Static139.aClass62_7.method5679(-256, local285, -1, local290, "Particles: " + Static324.anInt5141 + " / " + Static546.anInt8995);
								}
								local290 += 12;
								if (Static435.aBoolean240) {
									Static139.aClass62_7.method5679(-256, local285, -1, local290, "Polys: " + Static192.aClass95_4.I() + " Models: " + Static192.aClass95_4.M());
									local290 += 12;
									Static139.aClass62_7.method5679(-256, local285, -1, local290, "Ls: " + Static572.anInt9323 + " La: " + Static286.anInt4685 + " NPC: " + Static202.anInt3422 + " Pl: " + Static235.anInt3825);
									local290 += 12;
									Static564.method7733();
								}
								Static69.aBooleanArray25[local84] = true;
								continue;
							}
						}
						if (local19.anInt6635 == 0) {
							if (local19.anInt6573 == Static176.anInt3099 && Static192.aClass95_4.method6951()) {
								Static192.aClass95_4.method6928(local112, local117, local19.anInt6595, local19.anInt6622);
							}
							method8556(arg0, local191, local117 - local19.anInt6624, local84, local321, local19.anInt6614, local197, local112 - local19.anInt6598, arg8, local332);
							if (local19.aClass261Array2 != null) {
								method8556(local19.aClass261Array2, local191, local117 - local19.anInt6624, local84, local321, local19.anInt6614, local197, local112 - local19.anInt6598, arg8, local332);
							}
							@Pc(985) Class2_Sub9 local985 = (Class2_Sub9) Static606.aClass118_47.method2595((long) local19.anInt6614);
							if (local985 != null) {
								Static613.method8239(local985.anInt2171, local84, local117, local191, local332, local321, local197, local112);
							}
							if (Static176.anInt3099 == local19.anInt6573 && Static192.aClass95_4.method6951()) {
								Static192.aClass95_4.method6991();
							}
							Static192.aClass95_4.KA(arg1, arg6, arg9, arg4);
						}
						if (Static556.aBooleanArray182[local84] || Static205.anInt6319 > 1) {
							if (local19.anInt6635 == 3) {
								if (local132 == 0) {
									if (local19.aBoolean473) {
										Static192.aClass95_4.aa(local112, local117, local19.anInt6595, local19.anInt6622, local19.anInt6650, 0);
									} else {
										Static192.aClass95_4.method6997(local112, local117, local19.anInt6595, local19.anInt6622, local19.anInt6650, 0);
									}
								} else if (local19.aBoolean473) {
									Static192.aClass95_4.aa(local112, local117, local19.anInt6595, local19.anInt6622, 255 - (local132 & 0xFF) << 24 | local19.anInt6650 & 0xFFFFFF, 1);
								} else {
									Static192.aClass95_4.method6997(local112, local117, local19.anInt6595, local19.anInt6622, local19.anInt6650 & 0xFFFFFF | 255 - (local132 & 0xFF) << 24, 1);
								}
								if (Static319.aBoolean356) {
									if (arg8) {
										Static170.method7976(local52, local59, local40, local45);
									} else {
										Static204.method2872(local59, local52, local45, local40);
									}
								}
							} else if (local19.anInt6635 == 4) {
								@Pc(1137) Class62 local1137 = local19.method5636(Static192.aClass95_4);
								if (local1137 != null) {
									local290 = local19.anInt6650;
									@Pc(1152) String local1152 = local19.aString93;
									if (local19.anInt6585 != -1) {
										@Pc(1162) Class34 local1162 = Static72.aClass225_2.method4789(local19.anInt6585);
										local1152 = local1162.aString11;
										if (local1152 == null) {
											local1152 = "null";
										}
										if ((local1162.anInt858 == 1 || local19.anInt6626 != 1) && local19.anInt6626 != -1) {
											local1152 = "<col=ff9040>" + local1152 + "</col> x" + Static35.method8315(local19.anInt6626);
										}
									}
									if (local19.anInt6605 != -1) {
										local1152 = Static38.method622(local19.anInt6605);
										if (local1152 == null) {
											local1152 = "";
										}
									}
									if (Static11.aClass261_1 == local19) {
										local1152 = Static434.aClass271_31.method5972(Static483.anInt7694);
										local290 = local19.anInt6650;
									}
									if (Static150.aBoolean205) {
										Static192.aClass95_4.T(local112, local117, local112 + local19.anInt6595, local19.anInt6622 + local117);
									}
									local1137.method5695(local19.anInt6664, local19.anInt6595, local19.anInt6608, null, local19.anInt6575, null, local19.anInt6580, local290 | 255 - (local132 & 0xFF) << 24, local19.anInt6622, 0, local19.aBoolean479 ? 255 - (local132 & 0xFF) << 24 : -1, local1152, Static176.aClass61Array5, local117, 0, local112);
									if (Static150.aBoolean205) {
										Static192.aClass95_4.KA(arg1, arg6, arg9, arg4);
									}
									if (local1152.trim().length() > 0) {
										if (!Static150.aBoolean205) {
											@Pc(1327) Class256 local1327 = Static542.method7481(Static192.aClass95_4, local19.anInt6651);
											local637 = local1327.method5533(local19.anInt6595, local1152, Static176.aClass61Array5);
											local639 = local1327.method5536(local19.anInt6575, local19.anInt6595, local1152, Static176.aClass61Array5);
											if (Static319.aBoolean356) {
												if (arg8) {
													Static170.method7976(local112 + local637, local639 + local117, local112, local117);
												} else {
													Static204.method2872(local117 + local639, local637 + local112, local117, local112);
												}
											}
										} else if (Static319.aBoolean356) {
											if (arg8) {
												Static170.method7976(local52, local59, local40, local45);
											} else {
												Static204.method2872(local59, local52, local45, local40);
											}
										}
									}
								} else if (Static45.aBoolean72) {
									Static624.method8351(local19);
								}
							} else {
								@Pc(1496) int local1496;
								if (local19.anInt6635 == 5) {
									if (local19.anInt6662 >= 0) {
										local19.method5629(Static355.aClass157_1, Static263.aClass224_1).method3443(Static192.aClass95_4, 0, local19.anInt6586 << 3, 0, local19.anInt6595, local112, local117, local19.anInt6587 << 3, local19.anInt6622);
									} else {
										@Pc(1439) Class61 local1439;
										if (local19.anInt6585 != -1) {
											@Pc(1421) Class218 local1421 = local19.aBoolean477 ? Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1 : null;
											local1439 = Static72.aClass225_2.method4781(local19.anInt6626, local19.anInt6658, local19.anInt6592 | 0xFF000000, local19.anInt6619, local19.anInt6585, local1421, Static192.aClass95_4);
										} else if (local19.anInt6605 == -1) {
											local1439 = local19.method5632(Static192.aClass95_4);
										} else {
											local1439 = Static396.method5407(Static192.aClass95_4, local19.anInt6605);
										}
										if (local1439 != null) {
											local290 = local1439.method6446();
											local604 = local1439.method6438();
											local1496 = (local19.anInt6650 == 0 ? 16777215 : local19.anInt6650 & 0xFFFFFF) | 255 - (local132 & 0xFF) << 24;
											if (local19.aBoolean475) {
												Static192.aClass95_4.T(local112, local117, local19.anInt6595 + local112, local117 + local19.anInt6622);
												if (local19.anInt6584 != 0) {
													local637 = (local290 + local19.anInt6595 - 1) / local290;
													local639 = (local604 + local19.anInt6622 - 1) / local604;
													for (local648 = 0; local648 < local637; local648++) {
														for (local745 = 0; local745 < local639; local745++) {
															if (local19.anInt6650 == 0) {
																local1439.method6442((float) (local112 + local648 * local290) + (float) local290 / 2.0F, (float) (local117 + local604 * local745) + (float) local604 / 2.0F, 4096, local19.anInt6584);
															} else {
																local1439.method6452((float) local290 / 2.0F + (float) (local648 * local290 + local112), (float) (local745 * local604 + local117) + (float) local604 / 2.0F, 4096, local19.anInt6584, local1496);
															}
														}
													}
												} else if (local19.anInt6650 == 0 && local132 == 0) {
													local1439.method6439(local112, local117, local19.anInt6595, local19.anInt6622);
												} else {
													local1439.method6435(local112, local117, local19.anInt6595, local19.anInt6622, 0, local1496, 1);
												}
												Static192.aClass95_4.KA(arg1, arg6, arg9, arg4);
											} else if (local19.anInt6650 == 0 && local132 == 0) {
												if (local19.anInt6584 != 0) {
													local1439.method6442((float) local112 + (float) local19.anInt6595 / 2.0F, (float) local117 + (float) local19.anInt6622 / 2.0F, local19.anInt6595 * 4096 / local290, local19.anInt6584);
												} else if (local290 == local19.anInt6595 && local604 == local19.anInt6622) {
													local1439.method6431(local112, local117);
												} else {
													local1439.method6430(local112, local117, local19.anInt6595, local19.anInt6622);
												}
											} else if (local19.anInt6584 != 0) {
												local1439.method6452((float) local19.anInt6595 / 2.0F + (float) local112, (float) local117 + (float) local19.anInt6622 / 2.0F, local19.anInt6595 * 4096 / local290, local19.anInt6584, local1496);
											} else if (local19.anInt6595 == local290 && local19.anInt6622 == local604) {
												local1439.method6434(local112, local117, 0, local1496, 1);
											} else {
												local1439.method6440(local112, local117, local19.anInt6595, local19.anInt6622, 0, local1496, 1);
											}
										} else if (Static45.aBoolean72) {
											Static624.method8351(local19);
										}
									}
									if (Static319.aBoolean356) {
										if (arg8) {
											Static170.method7976(local52, local59, local40, local45);
										} else {
											Static204.method2872(local59, local52, local45, local40);
										}
									}
								} else if (local19.anInt6635 == 6) {
									Static489.method1464();
									@Pc(1819) Class182 local1819 = null;
									local290 = 0;
									@Pc(1862) Class81 local1862;
									@Pc(1872) Class218 local1872;
									if (local19.anInt6585 != -1) {
										@Pc(2041) Class34 local2041 = Static72.aClass225_2.method4789(local19.anInt6585);
										if (local2041 != null) {
											local2041 = local2041.method693(local19.anInt6626);
											local1862 = local19.anInt6578 == -1 ? null : Static540.aClass173_2.method3791(local19.anInt6578);
											local1872 = local19.aBoolean477 ? Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1 : null;
											local1819 = local2041.method692(1, Static192.aClass95_4, local1872, local1862, 2048, local19.anInt6581, local19.anInt6636, local19.anInt6597);
											if (local1819 == null) {
												Static624.method8351(local19);
											} else {
												local290 = -local1819.fa() >> 1;
											}
										}
									} else if (local19.anInt6634 == 5) {
										local604 = local19.anInt6576;
										if (local604 >= 0 && local604 < 2048) {
											@Pc(1973) Class13_Sub1_Sub1_Sub1_Sub2 local1973 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local604];
											@Pc(1986) Class81 local1986 = local19.anInt6578 == -1 ? null : Static540.aClass173_2.method3791(local19.anInt6578);
											if (local1973 != null && (Static528.anInt8672 == local604 || Static435.method2764(local1973.aString50) == local19.anInt6593)) {
												local1819 = local1973.aClass218_1.method4614(Static431.aClass205_1, local1986, -1, null, 0, Static43.aClass283_1, local19.anInt6636, Static540.aClass173_2, Static502.aClass23_2, local19.anInt6597, null, Static192.aClass95_4, Static72.aClass225_2, 0, 2048, 0, null, local19.anInt6581, Static409.aClass107_2);
											}
										}
									} else if (local19.anInt6634 == 8 || local19.anInt6634 == 9) {
										@Pc(1849) Class2_Sub8 local1849 = Static384.method5147(local19.anInt6576, false);
										local1862 = local19.anInt6578 == -1 ? null : Static540.aClass173_2.method3791(local19.anInt6578);
										if (local1849 != null) {
											local1872 = local19.aBoolean477 ? Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1 : null;
											local1819 = local1849.method1257(Static192.aClass95_4, local19.anInt6593, local19.anInt6597, local19.anInt6634 == 9, local1862, local19.anInt6581, local19.anInt6636, local1872);
										}
									} else if (local19.anInt6578 == -1) {
										local1819 = local19.method5622(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1, Static502.aClass23_2, Static43.aClass283_1, -1, -1, Static540.aClass173_2, Static409.aClass107_2, Static431.aClass205_1, Static72.aClass225_2, 0, 2048, Static192.aClass95_4, null);
										if (local1819 == null && Static45.aBoolean72) {
											Static624.method8351(local19);
										}
									} else {
										@Pc(1932) Class81 local1932 = Static540.aClass173_2.method3791(local19.anInt6578);
										local1819 = local19.method5622(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1, Static502.aClass23_2, Static43.aClass283_1, local19.anInt6581, local19.anInt6636, Static540.aClass173_2, Static409.aClass107_2, Static431.aClass205_1, Static72.aClass225_2, local19.anInt6597, 2048, Static192.aClass95_4, local1932);
										if (local1819 == null && Static45.aBoolean72) {
											Static624.method8351(local19);
										}
									}
									if (local1819 != null) {
										if (local19.anInt6609 <= 0) {
											local604 = 512;
										} else {
											local604 = (local19.anInt6595 << 9) / local19.anInt6609;
										}
										if (local19.anInt6577 > 0) {
											local1496 = (local19.anInt6622 << 9) / local19.anInt6577;
										} else {
											local1496 = 512;
										}
										local637 = local19.anInt6595 / 2 + local112;
										local639 = local117 + local19.anInt6622 / 2;
										if (!local19.aBoolean476) {
											local637 += local604 * local19.anInt6583 >> 9;
											local639 += local1496 * local19.anInt6630 >> 9;
										}
										Static185.aClass177_4.method7876();
										Static192.aClass95_4.method6941(Static185.aClass177_4);
										Static192.aClass95_4.DA(local637, local639, local604, local1496);
										Static192.aClass95_4.ya();
										if (local19.aBoolean480) {
											Static192.aClass95_4.C(false);
										}
										if (local19.aBoolean476) {
											Static458.aClass177_9.method7880(local19.anInt6644);
											Static458.aClass177_9.method7874(local19.anInt6667);
											Static458.aClass177_9.method7873(local19.anInt6647);
											Static458.aClass177_9.method7872(local19.anInt6583, local19.anInt6630, local19.anInt6594);
										} else {
											local648 = (local19.anInt6613 << 2) * Canvas_Sub1.anIntArray497[local19.anInt6644 << 3] >> 14;
											local745 = (local19.anInt6613 << 2) * Canvas_Sub1.anIntArray498[local19.anInt6644 << 3] >> 14;
											Static458.aClass177_9.method7870(-local19.anInt6647 << 3);
											Static458.aClass177_9.method7874(local19.anInt6667 << 3);
											Static458.aClass177_9.method7872(local19.anInt6649 << 2, local290 + local648 + (local19.anInt6602 << 2), local745 - -(local19.anInt6602 << 2));
											Static458.aClass177_9.method7883(local19.anInt6644 << 3);
										}
										local19.method5626(local1819, Static458.aClass177_9, Static192.aClass95_4, Static262.anInt5597);
										if (Static150.aBoolean205) {
											Static192.aClass95_4.T(local112, local117, local112 + local19.anInt6595, local117 + local19.anInt6622);
										}
										if (local19.aBoolean476) {
											if (local19.aBoolean484) {
												local1819.method6194(Static458.aClass177_9, null, local19.anInt6613, 1);
											} else {
												local1819.method6206(Static458.aClass177_9, null, 1);
												if (local19.aClass13_Sub9_6 != null) {
													Static192.aClass95_4.method6960(local19.aClass13_Sub9_6.method5648());
												}
											}
										} else if (local19.aBoolean484) {
											local1819.method6194(Static458.aClass177_9, null, local19.anInt6613 << 2, 1);
										} else {
											local1819.method6206(Static458.aClass177_9, null, 1);
											if (local19.aClass13_Sub9_6 != null) {
												Static192.aClass95_4.method6960(local19.aClass13_Sub9_6.method5648());
											}
										}
										if (Static150.aBoolean205) {
											Static192.aClass95_4.KA(arg1, arg6, arg9, arg4);
										}
										if (local19.aBoolean480) {
											Static192.aClass95_4.C(true);
										}
									}
									if (Static319.aBoolean356) {
										if (arg8) {
											Static170.method7976(local52, local59, local40, local45);
										} else {
											Static204.method2872(local59, local52, local45, local40);
										}
									}
								} else if (local19.anInt6635 == 9) {
									if (local19.aBoolean483) {
										local1496 = local117;
										local290 = local19.anInt6622 + local117;
										local604 = local19.anInt6595 + local112;
									} else {
										local604 = local19.anInt6595 + local112;
										local290 = local117;
										local1496 = local19.anInt6622 + local117;
									}
									if (local19.anInt6603 == 1) {
										Static192.aClass95_4.method6937(local112, local290, local604, local1496, local19.anInt6650, 0);
									} else {
										Static192.aClass95_4.method6940(local112, local290, local604, local1496, local19.anInt6650, local19.anInt6603);
									}
									if (Static319.aBoolean356) {
										if (arg8) {
											Static170.method7976(local52, local59, local40, local45);
										} else {
											Static204.method2872(local59, local52, local45, local40);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([[BI[BB[II[I[[B)I")
	public static int method8558(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(14) int local14 = arg5[arg1];
		@Pc(21) int local21 = local14 + arg3[arg1];
		@Pc(25) int local25 = arg5[arg4];
		@Pc(31) int local31 = arg3[arg4] + local25;
		@Pc(33) int local33 = local14;
		if (local14 < local25) {
			local33 = local25;
		}
		@Pc(40) int local40 = local21;
		if (local21 > local31) {
			local40 = local31;
		}
		@Pc(55) int local55 = arg2[arg1] & 0xFF;
		if ((arg2[arg4] & 0xFF) < local55) {
			local55 = arg2[arg4] & 0xFF;
		}
		@Pc(76) byte[] local76 = arg6[arg1];
		@Pc(80) byte[] local80 = arg0[arg4];
		@Pc(85) int local85 = local33 - local14;
		@Pc(89) int local89 = local33 - local25;
		for (@Pc(91) int local91 = local33; local91 < local40; local91++) {
			@Pc(103) int local103 = local80[local89++] + local76[local85++];
			if (local103 < local55) {
				local55 = local103;
			}
		}
		return -local55;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B[B)V")
	public static void method8567(@OriginalArg(1) byte[] arg0) {
		@Pc(18) Class2_Sub22 local18 = new Class2_Sub22(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(22) int local22 = local18.method8547();
					if (local22 == 0) {
						return;
					}
					if (local22 == 1) {
						@Pc(116) int[] local116 = Static65.anIntArray92 = new int[6];
						local116[0] = local18.method8546();
						local116[1] = local18.method8546();
						local116[2] = local18.method8546();
						local116[3] = local18.method8546();
						local116[4] = local18.method8546();
						local116[5] = local18.method8546();
					} else {
						@Pc(45) int local45;
						@Pc(40) int local40;
						if (local22 == 4) {
							local40 = local18.method8547();
							Static343.anIntArray358 = new int[local40];
							for (local45 = 0; local45 < local40; local45++) {
								Static343.anIntArray358[local45] = local18.method8546();
								if (Static343.anIntArray358[local45] == 65535) {
									Static343.anIntArray358[local45] = -1;
								}
							}
						} else if (local22 == 5) {
							local40 = local18.method8547();
							Static8.anIntArray32 = new int[local40];
							for (local45 = 0; local45 < local40; local45++) {
								Static8.anIntArray32[local45] = local18.method8546();
								if (Static8.anIntArray32[local45] == 65535) {
									Static8.anIntArray32[local45] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "(B)V")
	public static void method8568() {
		Static407.aClass118_46.method2599();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIILclient!jm;ILclient!ha;III)V")
	public static void method8571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub2_Sub11 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class95 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg9 > arg1 && arg9 < arg1 + arg3 && arg0 - 13 < arg10 && arg0 + 3 > arg10 && arg5.aBoolean300) {
			arg2 = arg8;
		}
		@Pc(41) int[] local41 = null;
		if (Static56.method4531(arg5.anInt4369)) {
			local41 = Static72.aClass225_2.method4789((int) arg5.aLong122).anIntArray77;
		} else if (arg5.anInt4364 != -1) {
			local41 = Static72.aClass225_2.method4789(arg5.anInt4364).anIntArray77;
		} else if (Static62.method916(arg5.anInt4369)) {
			@Pc(74) Class2_Sub43 local74 = (Class2_Sub43) Static440.aClass118_41.method2595((long) arg5.aLong122);
			if (local74 != null) {
				@Pc(79) Class13_Sub1_Sub1_Sub1_Sub1 local79 = local74.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				@Pc(82) Class150 local82 = local79.aClass150_1;
				if (local82.anIntArray262 != null) {
					local82 = local82.method3196(Static431.aClass205_1);
				}
				if (local82 != null) {
					local41 = local82.anIntArray263;
				}
			}
		} else if (Static230.method3178(arg5.anInt4369)) {
			@Pc(118) Class191 local118;
			if (arg5.anInt4369 == 1001) {
				local118 = Static319.aClass141_4.method2971((int) arg5.aLong122);
			} else {
				local118 = Static319.aClass141_4.method2971((int) (arg5.aLong122 >>> 32 & 0x7FFFFFFFL));
			}
			if (local118.anIntArray323 != null) {
				local118 = local118.method4057(Static431.aClass205_1);
			}
			if (local118 != null) {
				local41 = local118.anIntArray322;
			}
		}
		@Pc(153) String local153 = Static425.method5665(arg5);
		if (local41 != null) {
			local153 = local153 + Static486.method6810(local41);
		}
		Static194.aClass62_22.method5694(arg1 + 3, local153, Static140.aClass61Array4, arg0, arg2, Static610.anIntArray675);
		if (arg5.aBoolean299) {
			Static205.aClass61_19.method6431(arg1 + Static228.aClass256_7.method5534(local153) + 5, arg0 + -12);
		}
	}
}
