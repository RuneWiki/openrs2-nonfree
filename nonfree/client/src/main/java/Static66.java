import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cga", name = "h", descriptor = "I")
	public static int anInt1575;

	@OriginalMember(owner = "client!cga", name = "j", descriptor = "[I")
	public static int[] anIntArray84;

	@OriginalMember(owner = "client!cga", name = "e", descriptor = "Lclient!sk;")
	public static final Class297 aClass297_2 = new Class297(1);

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IBLclient!wv;I)V")
	private static void method1432(@OriginalArg(0) int arg0, @OriginalArg(2) Class365 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class200 local18 = arg1.method7902(Static136.aClass12_8);
		if (local18 == null) {
			return;
		}
		Static136.aClass12_8.da(arg2, arg0, arg2 + arg1.anInt9578, arg1.anInt9638 + arg0);
		if (Static389.anInt6778 < 3) {
			Static9.aClass10_4.method7684((float) arg2 + (float) arg1.anInt9578 / 2.0F, (float) arg0 + (float) arg1.anInt9638 / 2.0F, ((int) -Static143.aFloat61 & 0x3FFF) << 2, local18, arg2, arg0);
		} else {
			Static136.aClass12_8.FA(-16777216, local18, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIIII[Lclient!wv;III)V")
	public static void method1434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class365[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		Static136.aClass12_8.da(arg0, arg7, arg3, arg2);
		for (@Pc(17) int local17 = 0; local17 < arg6.length; local17++) {
			@Pc(23) Class365 local23 = arg6[local17];
			if (local23 != null && (local23.anInt9590 == arg4 || arg4 == -1412584499 && Static363.aClass365_14 == local23)) {
				@Pc(44) int local44;
				if (arg8 == -1) {
					Class220.aRectangleArray1[Static288.anInt5333].setBounds(arg5 + local23.anInt9581, local23.anInt9625 + arg1, local23.anInt9578, local23.anInt9638);
					local44 = Static288.anInt5333++;
				} else {
					local44 = arg8;
				}
				local23.anInt9657 = Static81.anInt1910;
				local23.anInt9600 = local44;
				if (!Static72.method1562(local23)) {
					if (local23.anInt9607 != 0) {
						Static530.method7228(local23);
					}
					@Pc(88) int local88 = arg5 + local23.anInt9581;
					@Pc(93) int local93 = local23.anInt9625 + arg1;
					@Pc(96) int local96 = local23.anInt9601;
					if (Static484.aBoolean581 && (Static72.method1565(local23).anInt5698 != 0 || local23.anInt9595 == 0) && local96 > 127) {
						local96 = 127;
					}
					@Pc(145) int local145;
					@Pc(149) int local149;
					if (Static363.aClass365_14 == local23) {
						if (arg4 != -1412584499 && (local23.anInt9648 == Static338.anInt6015 || local23.anInt9648 == Static120.anInt2410)) {
							Static291.anInt5362 = arg1;
							Static328.aClass365Array1 = arg6;
							Static482.anInt8056 = arg5;
							continue;
						}
						if (Static103.aBoolean168 && Static204.aBoolean333) {
							local145 = Static287.aClass256_8.method7558();
							local149 = Static287.aClass256_8.method7561();
							local145 -= Static318.anInt5733;
							local149 -= Static212.anInt4159;
							if (local145 < Static424.anInt7197) {
								local145 = Static424.anInt7197;
							}
							if (local149 < Static199.anInt4027) {
								local149 = Static199.anInt4027;
							}
							if (Static394.aClass365_11.anInt9578 + Static424.anInt7197 < local145 + local23.anInt9578) {
								local145 = Static424.anInt7197 + Static394.aClass365_11.anInt9578 - local23.anInt9578;
							}
							local88 = local145;
							if (local149 + local23.anInt9638 > Static199.anInt4027 - -Static394.aClass365_11.anInt9638) {
								local149 = Static394.aClass365_11.anInt9638 + Static199.anInt4027 - local23.anInt9638;
							}
							local93 = local149;
						}
						if (local23.anInt9648 == Static120.anInt2410) {
							local96 = 128;
						}
					}
					@Pc(243) int local243;
					@Pc(245) int local245;
					@Pc(254) int local254;
					@Pc(259) int local259;
					if (local23.anInt9595 == 2) {
						local149 = arg7;
						local243 = arg3;
						local245 = arg2;
						local145 = arg0;
					} else {
						local254 = local23.anInt9578 + local88;
						local259 = local23.anInt9638 + local93;
						local145 = arg0 >= local88 ? arg0 : local88;
						local149 = local93 > arg7 ? local93 : arg7;
						if (local23.anInt9595 == 9) {
							local259++;
							local254++;
						}
						local245 = arg2 > local259 ? local259 : arg2;
						local243 = arg3 > local254 ? local254 : arg3;
					}
					if (local243 > local145 && local245 > local149) {
						@Pc(543) int local543;
						@Pc(554) int local554;
						@Pc(651) int local651;
						@Pc(509) int local509;
						@Pc(541) int local541;
						if (local23.anInt9607 != 0) {
							if (local23.anInt9607 == Static440.anInt7395 || local23.anInt9607 == Static314.anInt5663) {
								Static348.method5141(Static314.anInt5663 == local23.anInt9607, local23.anInt9638, local23.anInt9578, local88, local93);
								Static510.aBooleanArray29[local44] = true;
								Static136.aClass12_8.da(arg0, arg7, arg3, arg2);
								continue;
							}
							if (local23.anInt9607 == Static114.anInt2295) {
								if (local23.method7902(Static136.aClass12_8) != null) {
									Static99.method1834();
									Static260.method4066(local23, Static136.aClass12_8, local88, local93);
									Static551.aBooleanArray28[local44] = true;
									Static136.aClass12_8.da(arg0, arg7, arg3, arg2);
								}
								continue;
							}
							if (local23.anInt9607 == Static448.anInt7734) {
								if (local23.method7902(Static136.aClass12_8) != null) {
									method1432(local93, local23, local88);
									Static551.aBooleanArray28[local44] = true;
									Static136.aClass12_8.da(arg0, arg7, arg3, arg2);
								}
								continue;
							}
							if (local23.anInt9607 == Static275.anInt5082) {
								Static108.method5949(Static136.aClass12_8, local93, local23.anInt9638, local88, local23.anInt9578, Static478.anInterface5_11);
								Static510.aBooleanArray29[local44] = true;
								Static136.aClass12_8.da(arg0, arg7, arg3, arg2);
								continue;
							}
							if (Static530.anInt8766 == local23.anInt9607) {
								Static12.method207(local23.anInt9578, Static136.aClass12_8, local93, local23.anInt9638, local88);
								Static510.aBooleanArray29[local44] = true;
								Static136.aClass12_8.da(arg0, arg7, arg3, arg2);
								continue;
							}
							if (Static40.anInt6330 == local23.anInt9607) {
								if (!Static115.aBoolean175 && !Static297.aBoolean596) {
									continue;
								}
								local254 = local88 + local23.anInt9578;
								local259 = local93 + 15;
								if (Static115.aBoolean175) {
									local509 = -256;
									if (Static259.anInt4764 < 20) {
										local509 = -65536;
									}
									Static21.aClass35_1.method4943(local509, -1, "Fps:" + Static259.anInt4764, local259, local254);
									local259 += 15;
									@Pc(531) Runtime local531 = Runtime.getRuntime();
									local541 = (int) ((local531.totalMemory() - local531.freeMemory()) / 1024L);
									local543 = -256;
									if (local541 > 65536) {
										local543 = -65536;
										if (Static249.aBoolean362) {
											Static152.method2399();
											for (local554 = 0; local554 < 10; local554++) {
												System.gc();
											}
											local541 = (int) ((local531.totalMemory() - local531.freeMemory()) / 1024L);
											if (local541 > 65536) {
												Static172.method2626("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static21.aClass35_1.method4943(local543, -1, "Mem:" + local541 + "k", local259, local254);
									local259 += 15;
									Static21.aClass35_1.method4943(-256, -1, "In:" + Static379.anInt6706 + "B/s Out:" + Static386.anInt6764 + "B/s", local259, local254);
									local259 += 15;
									local554 = Static136.aClass12_8.b() / 1024;
									Static21.aClass35_1.method4943(local554 > 65536 ? -65536 : -256, -1, "Offheap:" + local554 + "k", local259, local254);
									local259 += 15;
									local651 = 0;
									@Pc(653) int local653 = 0;
									@Pc(655) int local655 = 0;
									for (@Pc(657) int local657 = 0; local657 < 35; local657++) {
										if (Static553.aClass252_Sub1Array2[local657] != null) {
											local651 += Static553.aClass252_Sub1Array2[local657].method7939();
											local653 += Static553.aClass252_Sub1Array2[local657].method7930();
											local655 += Static553.aClass252_Sub1Array2[local657].method7938();
										}
									}
									@Pc(699) int local699 = local655 * 100 / local651;
									@Pc(705) int local705 = local653 * 10000 / local651;
									@Pc(725) String local725 = "Cache:" + Static429.method6006((long) local705, 0, true, 2) + "% (" + local699 + "%)";
									Static443.aClass35_11.method4943(-256, -1, local725, local259, local254);
									local259 += 12;
								}
								if (Static376.anInt6636 > 0) {
									Static443.aClass35_11.method4943(-256, -1, "Particles: " + Static525.anInt8670 + " / " + Static376.anInt6636, local259, local254);
								}
								local259 += 12;
								if (Static297.aBoolean596) {
									Static443.aClass35_11.method4943(-256, -1, "Polys: " + Static136.aClass12_8.DA() + " Models: " + Static136.aClass12_8.T(), local259, local254);
									local259 += 12;
									Static443.aClass35_11.method4943(-256, -1, "Ls: " + Static242.anInt4615 + " La: " + Static212.anInt4157 + " NPC: " + Static212.anInt4158 + " Pl: " + Static97.anInt6027, local259, local254);
									local259 += 12;
									Static509.method7015();
								}
								Static510.aBooleanArray29[local44] = true;
								continue;
							}
						}
						if (local23.anInt9595 == 0) {
							if (local23.anInt9607 == Static518.anInt8572 && Static136.aClass12_8.method6451()) {
								Static136.aClass12_8.method6438(local88, local93, local23.anInt9578, local23.anInt9638);
							}
							method1434(local145, local93 - local23.anInt9617, local245, local243, local23.anInt9646, local88 - local23.anInt9571, arg6, local149, local44);
							if (local23.aClass365Array2 != null) {
								method1434(local145, local93 - local23.anInt9617, local245, local243, local23.anInt9646, local88 - local23.anInt9571, local23.aClass365Array2, local149, local44);
							}
							@Pc(882) Class1_Sub16 local882 = (Class1_Sub16) Static68.aClass356_4.method7796((long) local23.anInt9646);
							if (local882 != null) {
								Static121.method2073(local245, local93, local243, local88, local44, local145, local882.anInt2681, local149);
							}
							if (Static518.anInt8572 == local23.anInt9607 && Static136.aClass12_8.method6451()) {
								Static136.aClass12_8.method6425();
							}
							Static136.aClass12_8.da(arg0, arg7, arg3, arg2);
						}
						if (Static210.aBooleanArray10[local44] || Static401.anInt6896 > 1) {
							if (local23.anInt9595 == 3) {
								if (local96 == 0) {
									if (local23.aBoolean697) {
										Static136.aClass12_8.J(local88, local93, local23.anInt9578, local23.anInt9638, local23.anInt9633, 0);
									} else {
										Static136.aClass12_8.method6435(local88, local93, local23.anInt9578, local23.anInt9638, local23.anInt9633, 0);
									}
								} else if (local23.aBoolean697) {
									Static136.aClass12_8.J(local88, local93, local23.anInt9578, local23.anInt9638, local23.anInt9633 & 0xFFFFFF | 255 - (local96 & 0xFF) << 24, 1);
								} else {
									Static136.aClass12_8.method6435(local88, local93, local23.anInt9578, local23.anInt9638, 255 - (local96 & 0xFF) << 24 | local23.anInt9633 & 0xFFFFFF, 1);
								}
							} else if (local23.anInt9595 == 4) {
								@Pc(1018) Class35 local1018 = local23.method7918(Static136.aClass12_8);
								if (local1018 != null) {
									local259 = local23.anInt9633;
									@Pc(1033) String local1033 = local23.aString99;
									if (local23.anInt9573 != -1) {
										@Pc(1044) Class322 local1044 = Static46.aClass234_1.method5390(local23.anInt9573);
										local1033 = local1044.aString89;
										if (local1033 == null) {
											local1033 = "null";
										}
										if ((local1044.anInt8612 == 1 || local23.anInt9575 != 1) && local23.anInt9575 != -1) {
											local1033 = "<col=ff9040>" + local1033 + "</col> x" + Static267.method4192(local23.anInt9575);
										}
									}
									if (Static211.aClass365_8 == local23) {
										local1033 = Static103.aClass77_33.method1864(Static562.anInt9127);
										local259 = local23.anInt9633;
									}
									if (Static362.aBoolean450) {
										Static136.aClass12_8.V(local88, local93, local23.anInt9578 + local88, local23.anInt9638 + local93);
									}
									local1018.method4944(local23.anInt9635, null, 0, 0, 255 - (local96 & 0xFF) << 24 | local259, local1033, local23.anInt9652, Static39.aClass10Array5, local93, local23.anInt9638, null, local88, local23.anInt9578, local23.anInt9636, local23.aBoolean698 ? 255 - (local96 & 0xFF) << 24 : -1, local23.anInt9585);
									if (Static362.aBoolean450) {
										Static136.aClass12_8.da(arg0, arg7, arg3, arg2);
									}
								} else if (Static285.aBoolean683) {
									Static201.method5537(local23);
								}
							} else {
								@Pc(1233) int local1233;
								if (local23.anInt9595 == 5) {
									if (local23.anInt9647 < 0) {
										@Pc(1199) Class10 local1199;
										if (local23.anInt9573 == -1) {
											local1199 = local23.method7906(Static136.aClass12_8);
										} else {
											@Pc(1181) Class34 local1181 = local23.aBoolean707 ? Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1 : null;
											local1199 = Static46.aClass234_1.method5398(local23.anInt9573, local23.anInt9619, local23.anInt9575, Static136.aClass12_8, local23.anInt9632, local23.anInt9637 | 0xFF000000, local1181);
										}
										if (local1199 != null) {
											local259 = local1199.A();
											local509 = local1199.ca();
											local1233 = (local23.anInt9633 == 0 ? 16777215 : local23.anInt9633 & 0xFFFFFF) | 255 - (local96 & 0xFF) << 24;
											if (local23.aBoolean708) {
												Static136.aClass12_8.V(local88, local93, local23.anInt9578 + local88, local93 + local23.anInt9638);
												if (local23.anInt9606 != 0) {
													local541 = (local259 + local23.anInt9578 - 1) / local259;
													local543 = (local509 + local23.anInt9638 - 1) / local509;
													for (local554 = 0; local554 < local541; local554++) {
														for (local651 = 0; local651 < local543; local651++) {
															if (local23.anInt9633 == 0) {
																local1199.method7678((float) local259 / 2.0F + (float) (local259 * local554 + local88), (float) (local509 * local651 + local93) + (float) local509 / 2.0F, 4096, local23.anInt9606);
															} else {
																local1199.method7672((float) (local554 * local259 + local88) + (float) local259 / 2.0F, (float) (local509 * local651 + local93) + (float) local509 / 2.0F, 4096, local23.anInt9606, local1233);
															}
														}
													}
												} else if (local23.anInt9633 == 0 && local96 == 0) {
													local1199.method7681(local88, local93, local23.anInt9578, local23.anInt9638);
												} else {
													local1199.DA(local88, local93, local23.anInt9578, local23.anInt9638, 0, local1233, 1);
												}
												Static136.aClass12_8.da(arg0, arg7, arg3, arg2);
											} else if (local23.anInt9633 == 0 && local96 == 0) {
												if (local23.anInt9606 != 0) {
													local1199.method7678((float) local23.anInt9578 / 2.0F + (float) local88, (float) local23.anInt9638 / 2.0F + (float) local93, local23.anInt9578 * 4096 / local259, local23.anInt9606);
												} else if (local23.anInt9578 == local259 && local23.anInt9638 == local509) {
													local1199.method7679(local88, local93);
												} else {
													local1199.method7682(local88, local93, local23.anInt9578, local23.anInt9638);
												}
											} else if (local23.anInt9606 != 0) {
												local1199.method7672((float) local88 + (float) local23.anInt9578 / 2.0F, (float) local23.anInt9638 / 2.0F + (float) local93, local23.anInt9578 * 4096 / local259, local23.anInt9606, local1233);
											} else if (local23.anInt9578 == local259 && local23.anInt9638 == local509) {
												local1199.V(local88, local93, 0, local1233, 1);
											} else {
												local1199.method7680(local88, local93, local23.anInt9578, local23.anInt9638, 0, local1233, 1);
											}
										} else if (Static285.aBoolean683) {
											Static201.method5537(local23);
										}
									} else {
										local23.method7912(Static395.aClass263_1, Static117.aClass345_1).method5125(local23.anInt9638, local88, local23.anInt9642 << 3, 0, 0, Static136.aClass12_8, local23.anInt9618 << 3, local23.anInt9578, local93);
									}
								} else if (local23.anInt9595 == 6) {
									Static170.method2601();
									@Pc(1580) Class61 local1580 = null;
									local259 = 0;
									@Pc(1616) Class131 local1616;
									@Pc(1624) Class34 local1624;
									if (local23.anInt9573 != -1) {
										@Pc(1592) Class322 local1592 = Static46.aClass234_1.method5390(local23.anInt9573);
										if (local1592 != null) {
											local1592 = local1592.method7121(local23.anInt9575);
											local1616 = local23.anInt9611 == -1 ? null : Static594.aClass311_2.method7009(local23.anInt9611);
											local1624 = local23.aBoolean707 ? Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1 : null;
											local1580 = local1592.method7117(local23.anInt9583, local1616, 1, 2048, local1624, local23.anInt9574, local23.anInt9643, Static136.aClass12_8);
											if (local1580 == null) {
												Static201.method5537(local23);
											} else {
												local259 = -local1580.J() >> 1;
											}
										}
									} else if (local23.anInt9576 == 5) {
										local509 = local23.anInt9620;
										if (local509 >= 0 && local509 < 2048) {
											@Pc(1673) Class20_Sub2_Sub4_Sub1_Sub1 local1673 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local509];
											@Pc(1685) Class131 local1685 = local23.anInt9611 == -1 ? null : Static594.aClass311_2.method7009(local23.anInt9611);
											if (local1673 != null && (Static594.anInt9653 == local509 || Static318.method4845(local1673.aString49) == local23.anInt9572)) {
												local1580 = local1673.aClass34_1.method1020(Static594.aClass311_2, local1685, Static136.aClass12_8, 0, null, 2048, null, local23.anInt9643, -1, Static121.aClass148_1, local23.anInt9583, Static161.aClass291_1, Static183.aClass182_1, 0, local23.anInt9574, Static412.aClass93_1, Static46.aClass234_1);
											}
										}
									} else if (local23.anInt9576 == 8 || local23.anInt9576 == 9) {
										@Pc(1808) Class1_Sub46 local1808 = Static365.method5363(false, local23.anInt9620);
										local1616 = local23.anInt9611 == -1 ? null : Static594.aClass311_2.method7009(local23.anInt9611);
										if (local1808 != null) {
											local1624 = local23.aBoolean707 ? Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1 : null;
											local1580 = local1808.method7000(local1616, local23.anInt9574, Static136.aClass12_8, local23.anInt9572, local23.anInt9643, local23.anInt9583, local23.anInt9576 == 9, local1624);
										}
									} else if (local23.anInt9611 == -1) {
										local1580 = local23.method7919(Static136.aClass12_8, 0, null, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1, Static46.aClass234_1, -1, Static594.aClass311_2, Static161.aClass291_1, Static121.aClass148_1, -1, 2048, Static183.aClass182_1, Static412.aClass93_1);
										if (local1580 == null && Static285.aBoolean683) {
											Static201.method5537(local23);
										}
									} else {
										@Pc(1773) Class131 local1773 = Static594.aClass311_2.method7009(local23.anInt9611);
										local1580 = local23.method7919(Static136.aClass12_8, local23.anInt9643, local1773, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1, Static46.aClass234_1, local23.anInt9574, Static594.aClass311_2, Static161.aClass291_1, Static121.aClass148_1, local23.anInt9583, 2048, Static183.aClass182_1, Static412.aClass93_1);
										if (local1580 == null && Static285.aBoolean683) {
											Static201.method5537(local23);
										}
									}
									if (local1580 != null) {
										if (local23.anInt9615 > 0) {
											local509 = (local23.anInt9578 << 9) / local23.anInt9615;
										} else {
											local509 = 512;
										}
										if (local23.anInt9658 > 0) {
											local1233 = (local23.anInt9638 << 9) / local23.anInt9658;
										} else {
											local1233 = 512;
										}
										local541 = local88 + local23.anInt9578 / 2;
										local543 = local23.anInt9638 / 2 + local93;
										if (!local23.aBoolean702) {
											local541 += local23.anInt9569 * local509 >> 9;
											local543 += local1233 * local23.anInt9613 >> 9;
										}
										Static583.aClass209_6.Y();
										Static136.aClass12_8.method6471(Static583.aClass209_6);
										Static136.aClass12_8.la(local541, local543, local509, local1233);
										Static136.aClass12_8.ya();
										if (local23.aBoolean710) {
											Static136.aClass12_8.ZA(false);
										}
										if (local23.aBoolean702) {
											Static22.aClass209_1.oa(local23.anInt9660);
											Static22.aClass209_1.ZA(local23.anInt9612);
											Static22.aClass209_1.AA(local23.anInt9622);
											Static22.aClass209_1.U(local23.anInt9569, local23.anInt9613, local23.anInt9655);
										} else {
											local554 = Class151.anIntArray244[local23.anInt9660 << 3] * (local23.anInt9608 << 2) >> 14;
											local651 = Class151.anIntArray245[local23.anInt9660 << 3] * (local23.anInt9608 << 2) >> 14;
											Static22.aClass209_1.J(-local23.anInt9622 << 3);
											Static22.aClass209_1.ZA(local23.anInt9612 << 3);
											Static22.aClass209_1.U(local23.anInt9623 << 2, local259 + local554 + (local23.anInt9651 << 2), local651 + (local23.anInt9651 << 2));
											Static22.aClass209_1.w(local23.anInt9660 << 3);
										}
										local23.method7904(Static136.aClass12_8, local1580, Static81.anInt1910, Static22.aClass209_1);
										if (Static362.aBoolean450) {
											Static136.aClass12_8.V(local88, local93, local23.anInt9578 + local88, local23.anInt9638 + local93);
										}
										if (local23.aBoolean702) {
											if (local23.aBoolean713) {
												local1580.method7592(Static22.aClass209_1, null, local23.anInt9608, 1);
											} else {
												local1580.method7587(Static22.aClass209_1, null, 1);
												if (local23.aClass20_Sub5_8 != null) {
													Static136.aClass12_8.method6460(local23.aClass20_Sub5_8.method3663());
												}
											}
										} else if (local23.aBoolean713) {
											local1580.method7592(Static22.aClass209_1, null, local23.anInt9608 << 2, 1);
										} else {
											local1580.method7587(Static22.aClass209_1, null, 1);
											if (local23.aClass20_Sub5_8 != null) {
												Static136.aClass12_8.method6460(local23.aClass20_Sub5_8.method3663());
											}
										}
										if (Static362.aBoolean450) {
											Static136.aClass12_8.da(arg0, arg7, arg3, arg2);
										}
										if (local23.aBoolean710) {
											Static136.aClass12_8.ZA(true);
										}
									}
								} else if (local23.anInt9595 == 9) {
									if (local23.aBoolean709) {
										local509 = local88 + local23.anInt9578;
										local1233 = local93;
										local259 = local93 + local23.anInt9638;
									} else {
										local1233 = local23.anInt9638 + local93;
										local509 = local88 + local23.anInt9578;
										local259 = local93;
									}
									if (local23.anInt9641 == 1) {
										Static136.aClass12_8.method6468(local88, local259, local509, local1233, local23.anInt9633, 0);
									} else {
										Static136.aClass12_8.method6458(local88, local259, local509, local1233, local23.anInt9633, local23.anInt9641);
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
