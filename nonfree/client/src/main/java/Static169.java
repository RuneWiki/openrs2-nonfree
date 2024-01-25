import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "Lclient!tga;")
	public static Class83_Sub1 aClass83_Sub1_1;

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
	public static int anInt3281 = 0;

	@OriginalMember(owner = "client!fw", name = "o", descriptor = "Lclient!hca;")
	public static final Class139 aClass139_4 = new Class139();

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIIZII[Lclient!uv;I)V")
	public static void method2819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class344[] arg8, @OriginalArg(10) int arg9) {
		Static266.aClass82_8.KA(arg4, arg5, arg9, arg1);
		for (@Pc(18) int local18 = 0; local18 < arg8.length; local18++) {
			@Pc(24) Class344 local24 = arg8[local18];
			if (local24 != null && (arg7 == local24.anInt9632 || arg7 == -1412584499 && local24 == Static429.aClass344_9)) {
				@Pc(43) int local43 = local24.anInt9569 + arg3;
				@Pc(48) int local48 = local24.anInt9573 + arg0;
				@Pc(55) int local55 = local24.anInt9546 + local43 + 1;
				@Pc(62) int local62 = local48 + local24.anInt9602 + 1;
				@Pc(67) int local67;
				if (arg2 == -1) {
					Class18_Sub3.aRectangleArray1[Static453.anInt7674].setBounds(arg3 + local24.anInt9569, arg0 + local24.anInt9573, local24.anInt9546, local24.anInt9602);
					local67 = Static453.anInt7674++;
				} else {
					local67 = arg2;
				}
				local24.anInt9589 = local67;
				local24.anInt9620 = Static304.anInt8391;
				if (!Static76.method1324(local24)) {
					if (local24.anInt9604 != 0) {
						Static28.method379(local24);
					}
					@Pc(112) int local112 = local24.anInt9569 + arg3;
					@Pc(117) int local117 = arg0 + local24.anInt9573;
					@Pc(119) int local119 = 0;
					@Pc(121) int local121 = 0;
					if (Static80.aBoolean118) {
						local119 = Static211.method3297();
						local121 = Static551.method7856();
					}
					@Pc(134) int local134 = local24.anInt9606;
					if (Static349.aBoolean768 && (Static76.method1311(local24).anInt9447 != 0 || local24.anInt9554 == 0) && local134 > 127) {
						local134 = 127;
					}
					@Pc(183) int local183;
					@Pc(189) int local189;
					if (local24 == Static429.aClass344_9) {
						if (arg7 != -1412584499 && (local24.anInt9555 == Static207.anInt3783 || local24.anInt9555 == Static302.anInt5958)) {
							Static590.anInt9671 = arg3;
							Static436.aClass344Array1 = arg8;
							Static422.anInt7634 = arg0;
							continue;
						}
						if (Static597.aBoolean736 && Static28.aBoolean21) {
							local183 = local119 + Static281.aClass49_1.method2426();
							local189 = Static281.aClass49_1.method2429() + local121;
							local189 -= Static114.anInt2516;
							local183 -= Static73.anInt1444;
							if (Static355.anInt10009 > local183) {
								local183 = Static355.anInt10009;
							}
							if (Static322.anInt6165 > local189) {
								local189 = Static322.anInt6165;
							}
							if (local24.anInt9546 + local183 > Static355.anInt10009 + Static495.aClass344_11.anInt9546) {
								local183 = Static355.anInt10009 + Static495.aClass344_11.anInt9546 - local24.anInt9546;
							}
							if (local24.anInt9602 + local189 > Static495.aClass344_11.anInt9602 + Static322.anInt6165) {
								local189 = Static495.aClass344_11.anInt9602 + Static322.anInt6165 - local24.anInt9602;
							}
							local112 = local183;
							local117 = local189;
						}
						if (local24.anInt9555 == Static302.anInt5958) {
							local134 = 128;
						}
					}
					@Pc(302) int local302;
					@Pc(313) int local313;
					@Pc(270) int local270;
					@Pc(275) int local275;
					if (local24.anInt9554 == 2) {
						local189 = arg5;
						local313 = arg1;
						local302 = arg9;
						local183 = arg4;
					} else {
						local270 = local24.anInt9546 + local112;
						local275 = local117 + local24.anInt9602;
						if (local24.anInt9554 == 9) {
							local275++;
							local270++;
						}
						local189 = local117 <= arg5 ? arg5 : local117;
						local183 = arg4 < local112 ? local112 : arg4;
						local302 = arg9 > local270 ? local270 : arg9;
						local313 = arg1 <= local275 ? arg1 : local275;
					}
					if (local183 < local302 && local189 < local313) {
						@Pc(588) int local588;
						@Pc(632) int local632;
						@Pc(731) int local731;
						@Pc(733) int local733;
						@Pc(621) int local621;
						@Pc(623) int local623;
						if (local24.anInt9604 != 0) {
							if (Static601.anInt9746 == local24.anInt9604 || local24.anInt9604 == Static282.anInt5419) {
								Static286.method4620(local117, local24, local112);
								if (!Static80.aBoolean118) {
									Static595.method8230(local24.anInt9604 == Static282.anInt5419, local24.anInt9602, local117, local112, local24.anInt9546);
									Static266.aClass82_8.KA(arg4, arg5, arg9, arg1);
								}
								Static110.aBooleanArray5[local67] = true;
								continue;
							}
							if (Static587.anInt9531 == local24.anInt9604) {
								if (local24.method8166(Static266.aClass82_8) != null) {
									Static234.method3998();
									Static227.method3939(Static266.aClass82_8, local117, local112, local24);
									Static356.aBooleanArray21[local67] = true;
									Static266.aClass82_8.KA(arg4, arg5, arg9, arg1);
									if (Static80.aBoolean118) {
										if (arg6) {
											Static304.method7235(local55, local62, local43, local48);
										} else {
											Static629.method8521(local48, local43, local62, local55);
										}
									}
								}
								continue;
							}
							if (local24.anInt9604 == Static215.anInt4435) {
								if (local24.method8166(Static266.aClass82_8) != null) {
									Static440.method6623(local117, local112, local24);
									Static356.aBooleanArray21[local67] = true;
									Static266.aClass82_8.KA(arg4, arg5, arg9, arg1);
									if (Static80.aBoolean118) {
										if (arg6) {
											Static304.method7235(local55, local62, local43, local48);
										} else {
											Static629.method8521(local48, local43, local62, local55);
										}
									}
								}
								continue;
							}
							if (Static280.anInt5388 == local24.anInt9604) {
								Static520.method7577(local117, local24.anInt9602, local24.anInt9546, Static266.aClass82_8, local112, Static621.anInterface5_12);
								Static110.aBooleanArray5[local67] = true;
								Static266.aClass82_8.KA(arg4, arg5, arg9, arg1);
								continue;
							}
							if (local24.anInt9604 == Static576.anInt9430) {
								Static30.method427(local24.anInt9602, local117, Static266.aClass82_8, local24.anInt9546, local112);
								Static110.aBooleanArray5[local67] = true;
								Static266.aClass82_8.KA(arg4, arg5, arg9, arg1);
								continue;
							}
							if (local24.anInt9604 == Static534.anInt8991) {
								if (!Static196.aBoolean264 && !Static628.aBoolean759) {
									continue;
								}
								local270 = local112 + local24.anInt9546;
								local275 = local117 + 15;
								if (Static80.aBoolean118) {
									if (arg6) {
										Static304.method7235(local55, local62, local43, local48);
									} else {
										Static629.method8521(local48, local43, local62, local55);
									}
								}
								if (Static196.aBoolean264) {
									local588 = -256;
									if (Static557.anInt9262 < 20) {
										local588 = -65536;
									}
									Static232.aClass63_6.method7752(local270, local588, local275, "Fps:" + Static557.anInt9262, -1);
									local275 += 15;
									@Pc(612) Runtime local612 = Runtime.getRuntime();
									local621 = (int) ((local612.totalMemory() - local612.freeMemory()) / 1024L);
									local623 = -256;
									if (local621 > 98304) {
										if (Static367.aBoolean487) {
											Static515.method7512();
											for (local632 = 0; local632 < 10; local632++) {
												System.gc();
											}
											local621 = (int) ((local612.totalMemory() - local612.freeMemory()) / 1024L);
											if (local621 > 65536) {
												Static608.method8332("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local623 = -65536;
									}
									Static232.aClass63_6.method7752(local270, local623, local275, "Mem:" + local621 + "k", -1);
									local275 += 15;
									Static232.aClass63_6.method7752(local270, -256, local275, "In:" + Static583.anInt10159 + "B/s Out:" + Static646.anInt4673 + "B/s", -1);
									local275 += 15;
									local632 = Static266.aClass82_8.E() / 1024;
									Static232.aClass63_6.method7752(local270, local632 <= 65536 ? -256 : -65536, local275, "Offheap:" + local632 + "k", -1);
									local275 += 15;
									local731 = 0;
									local733 = 0;
									@Pc(735) int local735 = 0;
									for (@Pc(737) int local737 = 0; local737 < 37; local737++) {
										if (Static624.aClass40_Sub1Array2[local737] != null) {
											local731 += Static624.aClass40_Sub1Array2[local737].method7340();
											local733 += Static624.aClass40_Sub1Array2[local737].method7349();
											local735 += Static624.aClass40_Sub1Array2[local737].method7350();
										}
									}
									@Pc(779) int local779 = local735 * 100 / local731;
									@Pc(785) int local785 = local733 * 10000 / local731;
									@Pc(805) String local805 = "Cache:" + Static257.method4310(2, true, 0, (long) local785) + "% (" + local779 + "%)";
									Static227.aClass63_5.method7752(local270, -256, local275, local805, -1);
									local275 += 12;
								}
								if (Static119.anInt2612 > 0) {
									Static227.aClass63_5.method7752(local270, -256, local275, "Particles: " + Static90.anInt8336 + " / " + Static119.anInt2612, -1);
								}
								local275 += 12;
								if (Static628.aBoolean759) {
									Static227.aClass63_5.method7752(local270, -256, local275, "Polys: " + Static266.aClass82_8.I() + " Models: " + Static266.aClass82_8.M(), -1);
									local275 += 12;
									Static227.aClass63_5.method7752(local270, -256, local275, "Ls: " + Static483.anInt8232 + " La: " + Static230.anInt4638 + " NPC: " + Static225.anInt4563 + " Pl: " + Static454.anInt7699, -1);
									Static470.method6946();
									local275 += 12;
								}
								Static110.aBooleanArray5[local67] = true;
								continue;
							}
						}
						@Pc(970) Class3_Sub1 local970;
						if (local24.anInt9554 == 0) {
							if (Static254.anInt1415 == local24.anInt9604 && Static266.aClass82_8.method6103()) {
								Static266.aClass82_8.method6178(local112, local117, local24.anInt9546, local24.anInt9602);
							}
							method2819(local117 - local24.anInt9618, local313, local67, local112 - local24.anInt9621, local183, local189, arg6, local24.anInt9571, arg8, local302);
							if (local24.aClass344Array2 != null) {
								method2819(local117 - local24.anInt9618, local313, local67, local112 - local24.anInt9621, local183, local189, arg6, local24.anInt9571, local24.aClass344Array2, local302);
							}
							local970 = (Class3_Sub1) Static128.aClass25_7.method426((long) local24.anInt9571);
							if (local970 != null) {
								Static502.method7304(local313, local67, local112, local302, local970.anInt24, local117, local189, local183);
							}
							if (local24.anInt9604 == Static254.anInt1415 && Static266.aClass82_8.method6103()) {
								Static266.aClass82_8.method6130();
							}
							Static266.aClass82_8.KA(arg4, arg5, arg9, arg1);
						}
						if (Static125.aBooleanArray14[local67] || Static55.anInt1040 > 1) {
							if (local24.anInt9554 == 3) {
								if (local134 == 0) {
									if (local24.lb) {
										Static266.aClass82_8.aa(local112, local117, local24.anInt9546, local24.anInt9602, local24.anInt9543, 0);
									} else {
										Static266.aClass82_8.method6179(local112, local117, local24.anInt9546, local24.anInt9602, local24.anInt9543, 0);
									}
								} else if (local24.lb) {
									Static266.aClass82_8.aa(local112, local117, local24.anInt9546, local24.anInt9602, 255 - (local134 & 0xFF) << 24 | local24.anInt9543 & 0xFFFFFF, 1);
								} else {
									Static266.aClass82_8.method6179(local112, local117, local24.anInt9546, local24.anInt9602, 255 - (local134 & 0xFF) << 24 | local24.anInt9543 & 0xFFFFFF, 1);
								}
								if (Static80.aBoolean118) {
									if (arg6) {
										Static304.method7235(local55, local62, local43, local48);
									} else {
										Static629.method8521(local48, local43, local62, local55);
									}
								}
							} else {
								@Pc(1156) Class259 local1156;
								if (local24.anInt9554 == 4) {
									@Pc(1131) Class63 local1131 = local24.method8177(Static266.aClass82_8);
									if (local1131 != null) {
										local275 = local24.anInt9543;
										@Pc(1146) String local1146 = local24.aString95;
										if (local24.anInt9567 != -1) {
											local1156 = Static298.aClass132_1.method3062(local24.anInt9567);
											local1146 = local1156.aString63;
											if (local1146 == null) {
												local1146 = "null";
											}
											if ((local1156.anInt7370 == 1 || local24.anInt9565 != 1) && local24.anInt9565 != -1) {
												local1146 = "<col=ff9040>" + local1146 + "</col> x" + Static430.method6560(local24.anInt9565);
											}
										}
										if (local24.anInt9545 != -1) {
											local1146 = Static572.method8041(local24.anInt9545);
											if (local1146 == null) {
												local1146 = "";
											}
										}
										if (local24 == Static9.aClass344_1) {
											local1146 = Static369.aClass235_34.method5893(Static455.anInt7738);
											local275 = local24.anInt9543;
										}
										if (Static603.aBoolean740) {
											Static266.aClass82_8.T(local112, local117, local24.anInt9546 + local112, local117 + local24.anInt9602);
										}
										local1131.method7759(local24.anInt9602, local24.anInt9612, Static427.aClass103Array16, local24.aBoolean718 ? 255 - (local134 & 0xFF) << 24 : -1, local112, local1146, (int[]) null, local24.anInt9570, local24.anInt9552, local117, local24.anInt9550, local24.anInt9546, 0, (Class1) null, 0, local275 | 255 - (local134 & 0xFF) << 24);
										if (Static603.aBoolean740) {
											Static266.aClass82_8.KA(arg4, arg5, arg9, arg1);
										}
										if (local1146.trim().length() > 0) {
											if (!Static603.aBoolean740) {
												@Pc(1321) Class93 local1321 = Static54.method983(Static266.aClass82_8, local24.anInt9548);
												local621 = local1321.method2316(Static427.aClass103Array16, local1146, local24.anInt9546);
												local623 = local1321.method2314(local24.anInt9546, local24.anInt9552, local1146, Static427.aClass103Array16);
												if (Static80.aBoolean118) {
													if (arg6) {
														Static304.method7235(local621 + local112, local117 - -local623, local112, local117);
													} else {
														Static629.method8521(local117, local112, local117 + local623, local621 + local112);
													}
												}
											} else if (Static80.aBoolean118) {
												if (arg6) {
													Static304.method7235(local55, local62, local43, local48);
												} else {
													Static629.method8521(local48, local43, local62, local55);
												}
											}
										}
									} else if (Static454.aBoolean557) {
										Static605.method8323(local24);
									}
								} else {
									@Pc(1498) int local1498;
									if (local24.anInt9554 == 5) {
										if (local24.anInt9575 >= 0) {
											local24.method8181(Static148.aClass212_1, Static166.aClass310_1).method3189(local24.anInt9594 << 3, local112, local117, local24.anInt9546, 0, Static266.aClass82_8, local24.anInt9602, 0, local24.anInt9566 << 3);
										} else {
											@Pc(1437) Class103 local1437;
											if (local24.anInt9567 != -1) {
												@Pc(1419) Class375 local1419 = local24.aBoolean729 ? Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1 : null;
												local1437 = Static298.aClass132_1.method3057(local1419, local24.anInt9588, Static266.aClass82_8, local24.anInt9567, local24.anInt9565, local24.anInt9600 | 0xFF000000, local24.anInt9619);
											} else if (local24.anInt9545 == -1) {
												local1437 = local24.method8171(Static266.aClass82_8);
											} else {
												local1437 = Static24.method330(local24.anInt9545, Static266.aClass82_8);
											}
											if (local1437 != null) {
												local275 = local1437.method7454();
												local588 = local1437.method7451();
												local1498 = (local24.anInt9543 == 0 ? 16777215 : local24.anInt9543 & 0xFFFFFF) | 255 - (local134 & 0xFF) << 24;
												if (local24.aBoolean720) {
													Static266.aClass82_8.T(local112, local117, local24.anInt9546 + local112, local117 - -local24.anInt9602);
													if (local24.anInt9583 != 0) {
														local621 = (local24.anInt9546 + local275 - 1) / local275;
														local623 = (local588 + local24.anInt9602 - 1) / local588;
														for (local632 = 0; local632 < local621; local632++) {
															for (local731 = 0; local731 < local623; local731++) {
																if (local24.anInt9543 == 0) {
																	local1437.method7450((float) (local632 * local275 + local112) + (float) local275 / 2.0F, (float) (local588 * local731 + local117) + (float) local588 / 2.0F, 4096, local24.anInt9583);
																} else {
																	local1437.method7460((float) local275 / 2.0F + (float) (local632 * local275 + local112), (float) (local117 - -(local588 * local731)) + (float) local588 / 2.0F, 4096, local24.anInt9583, local1498);
																}
															}
														}
													} else if (local24.anInt9543 == 0 && local134 == 0) {
														local1437.method7455(local112, local117, local24.anInt9546, local24.anInt9602);
													} else {
														local1437.method7456(local112, local117, local24.anInt9546, local24.anInt9602, 0, local1498, 1);
													}
													Static266.aClass82_8.KA(arg4, arg5, arg9, arg1);
												} else if (local24.anInt9543 == 0 && local134 == 0) {
													if (local24.anInt9583 != 0) {
														local1437.method7450((float) local24.anInt9546 / 2.0F + (float) local112, (float) local24.anInt9602 / 2.0F + (float) local117, local24.anInt9546 * 4096 / local275, local24.anInt9583);
													} else if (local24.anInt9546 == local275 && local588 == local24.anInt9602) {
														local1437.method7462(local112, local117);
													} else {
														local1437.method7449(local112, local117, local24.anInt9546, local24.anInt9602);
													}
												} else if (local24.anInt9583 != 0) {
													local1437.method7460((float) local24.anInt9546 / 2.0F + (float) local112, (float) local24.anInt9602 / 2.0F + (float) local117, local24.anInt9546 * 4096 / local275, local24.anInt9583, local1498);
												} else if (local275 == local24.anInt9546 && local24.anInt9602 == local588) {
													local1437.method7444(local112, local117, 0, local1498, 1);
												} else {
													local1437.method7461(local112, local117, local24.anInt9546, local24.anInt9602, 0, local1498, 1);
												}
											} else if (Static454.aBoolean557) {
												Static605.method8323(local24);
											}
										}
										if (Static80.aBoolean118) {
											if (arg6) {
												Static304.method7235(local55, local62, local43, local48);
											} else {
												Static629.method8521(local48, local43, local62, local55);
											}
										}
									} else if (local24.anInt9554 == 6) {
										Static519.method7551();
										local970 = null;
										@Pc(1820) Class75 local1820 = null;
										local588 = 0;
										@Pc(1855) Class267 local1855;
										@Pc(1863) Class375 local1863;
										if (local24.anInt9567 != -1) {
											local1156 = Static298.aClass132_1.method3062(local24.anInt9567);
											if (local1156 != null) {
												local1156 = local1156.method6457(local24.anInt9565);
												local1855 = local24.anInt9601 == -1 ? null : Static474.aClass264_2.method6574(local24.anInt9601);
												local1863 = local24.aBoolean729 ? Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1 : null;
												local1820 = local1156.method6464(local1855, local24.anInt9630, 1, Static266.aClass82_8, local1863, 2048, local24.anInt9582, local24.anInt9556);
												if (local1820 == null) {
													Static605.method8323(local24);
												} else {
													local588 = -local1820.fa() >> 1;
												}
											}
										} else if (local24.anInt9611 == 5) {
											local1498 = local24.anInt9549;
											if (local1498 >= 0 && local1498 < 2048) {
												@Pc(2047) Class9_Sub2_Sub1_Sub2_Sub1 local2047 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local1498];
												@Pc(2059) Class267 local2059 = local24.anInt9601 == -1 ? null : Static474.aClass264_2.method6574(local24.anInt9601);
												if (local2047 != null && (Static54.anInt1032 == local1498 || Static470.method6941(local2047.aString5) == local24.anInt9603)) {
													local1820 = local2047.aClass375_1.method8541(Static474.aClass264_2, local2059, Static298.aClass132_1, Static266.aClass82_8, 0, 2048, local24.anInt9582, Static54.aClass22_1, local24.anInt9630, (int[]) null, -1, (Class267) null, 0, 0, Static61.aClass119_1, Static153.aClass2_1, (Class140[]) null, local24.anInt9556, Static183.aClass285_1);
												}
											}
										} else if (local24.anInt9611 == 8 || local24.anInt9611 == 9) {
											@Pc(1987) Class3_Sub52 local1987 = Static504.method7331(false, local24.anInt9549);
											local1855 = local24.anInt9601 == -1 ? null : Static474.aClass264_2.method6574(local24.anInt9601);
											if (local1987 != null) {
												local1863 = local24.aBoolean729 ? Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1 : null;
												local1820 = local1987.method8478(local24.anInt9603, local24.anInt9630, local1855, local24.anInt9611 == 9, local24.anInt9582, Static266.aClass82_8, local1863, local24.anInt9556);
											}
										} else if (local24.anInt9601 == -1) {
											local1820 = local24.method8180(Static153.aClass2_1, -1, Static298.aClass132_1, Static474.aClass264_2, local970, 0, 2048, Static266.aClass82_8, -1, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1, Static61.aClass119_1, Static54.aClass22_1, Static183.aClass285_1, (Class267) null);
											if (local1820 == null && Static454.aBoolean557) {
												Static605.method8323(local24);
											}
										} else {
											@Pc(1951) Class267 local1951 = Static474.aClass264_2.method6574(local24.anInt9601);
											local1820 = local24.method8180(Static153.aClass2_1, local24.anInt9582, Static298.aClass132_1, Static474.aClass264_2, local970, local24.anInt9556, 2048, Static266.aClass82_8, local24.anInt9630, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1, Static61.aClass119_1, Static54.aClass22_1, Static183.aClass285_1, local1951);
											if (local1820 == null && Static454.aBoolean557) {
												Static605.method8323(local24);
											}
										}
										if (local1820 != null) {
											if (local24.anInt9585 > 0) {
												local1498 = (local24.anInt9546 << 9) / local24.anInt9585;
											} else {
												local1498 = 512;
											}
											if (local24.anInt9615 > 0) {
												local621 = (local24.anInt9602 << 9) / local24.anInt9615;
											} else {
												local621 = 512;
											}
											local623 = local112 + local24.anInt9546 / 2;
											local632 = local24.anInt9602 / 2 + local117;
											if (!local24.aBoolean722) {
												local632 += local24.anInt9578 * local621 >> 9;
												local623 += local24.anInt9625 * local1498 >> 9;
											}
											Static570.aClass31_14.method7926();
											Static266.aClass82_8.method6160(Static570.aClass31_14);
											Static266.aClass82_8.DA(local623, local632, local1498, local621);
											Static266.aClass82_8.ya();
											if (local24.aBoolean726) {
												Static266.aClass82_8.C(false);
											}
											if (local24.aBoolean722) {
												Static292.aClass31_20.method7935(local24.anInt9609);
												Static292.aClass31_20.method7924(local24.anInt9614);
												Static292.aClass31_20.method7927(local24.anInt9613);
												Static292.aClass31_20.method7930(local24.anInt9625, local24.anInt9578, local24.anInt9579);
											} else {
												local731 = (local24.anInt9626 << 2) * Class3_Sub13.anIntArray147[local24.anInt9609 << 3] >> 14;
												local733 = (local24.anInt9626 << 2) * Class3_Sub13.anIntArray146[local24.anInt9609 << 3] >> 14;
												Static292.aClass31_20.method7922(-local24.anInt9613 << 3);
												Static292.aClass31_20.method7924(local24.anInt9614 << 3);
												Static292.aClass31_20.method7930(local24.anInt9572 << 2, local588 + local731 + (local24.anInt9593 << 2), local733 - -(local24.anInt9593 << 2));
												Static292.aClass31_20.method7936(local24.anInt9609 << 3);
											}
											local24.method8167(Static292.aClass31_20, Static266.aClass82_8, Static304.anInt8391, local1820);
											if (Static603.aBoolean740) {
												Static266.aClass82_8.T(local112, local117, local24.anInt9546 + local112, local117 - -local24.anInt9602);
											}
											if (local24.aBoolean722) {
												if (local24.aBoolean719) {
													local1820.method6788(Static292.aClass31_20, (Class9_Sub5) null, local24.anInt9626, 1);
												} else {
													local1820.method6799(Static292.aClass31_20, (Class9_Sub5) null, 1);
													if (local24.aClass9_Sub8_7 != null) {
														Static266.aClass82_8.method6161(local24.aClass9_Sub8_7.method5939());
													}
												}
											} else if (local24.aBoolean719) {
												local1820.method6788(Static292.aClass31_20, (Class9_Sub5) null, local24.anInt9626 << 2, 1);
											} else {
												local1820.method6799(Static292.aClass31_20, (Class9_Sub5) null, 1);
												if (local24.aClass9_Sub8_7 != null) {
													Static266.aClass82_8.method6161(local24.aClass9_Sub8_7.method5939());
												}
											}
											if (Static603.aBoolean740) {
												Static266.aClass82_8.KA(arg4, arg5, arg9, arg1);
											}
											if (local24.aBoolean726) {
												Static266.aClass82_8.C(true);
											}
										}
										if (Static80.aBoolean118) {
											if (arg6) {
												Static304.method7235(local55, local62, local43, local48);
											} else {
												Static629.method8521(local48, local43, local62, local55);
											}
										}
									} else if (local24.anInt9554 == 9) {
										if (local24.aBoolean724) {
											local588 = local24.anInt9546 + local112;
											local275 = local24.anInt9602 + local117;
											local1498 = local117;
										} else {
											local1498 = local24.anInt9602 + local117;
											local275 = local117;
											local588 = local24.anInt9546 + local112;
										}
										if (local24.anInt9551 == 1) {
											Static266.aClass82_8.method6164(local112, local275, local588, local1498, local24.anInt9543, 0);
										} else {
											Static266.aClass82_8.method6116(local112, local275, local588, local1498, local24.anInt9543, local24.anInt9551);
										}
										if (Static80.aBoolean118) {
											if (arg6) {
												Static304.method7235(local55, local62, local43, local48);
											} else {
												Static629.method8521(local48, local43, local62, local55);
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
	}
}
