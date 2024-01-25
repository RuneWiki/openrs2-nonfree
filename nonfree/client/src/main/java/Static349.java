import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "[I")
	public static final int[] anIntArray475 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

	@OriginalMember(owner = "client!nea", name = "h", descriptor = "[I")
	public static final int[] anIntArray476 = new int[13];

	@OriginalMember(owner = "client!nea", name = "i", descriptor = "F")
	public static float aFloat131 = 1.0F;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "([Lclient!vg;IIIIIIIII)V")
	public static void method4737(@OriginalArg(0) Class341[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static16.aClass134_1.da(arg5, arg1, arg7, arg2);
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(24) Class341 local24 = arg0[local13];
			if (local24 != null && (local24.anInt9252 == arg6 || arg6 == -1412584499 && Static93.aClass341_8 == local24)) {
				@Pc(67) int local67;
				if (arg3 == -1) {
					Class81.aRectangleArray1[Static367.anInt6098].setBounds(local24.anInt9293 + arg8, local24.lb - -arg4, local24.anInt9300, local24.anInt9248);
					local67 = Static367.anInt6098++;
				} else {
					local67 = arg3;
				}
				local24.anInt9241 = Static301.anInt5197;
				local24.anInt9299 = local67;
				if (!Static63.method1134(local24)) {
					if (local24.anInt9297 != 0) {
						Static387.method5342(local24);
					}
					@Pc(94) int local94 = arg8 + local24.anInt9293;
					@Pc(99) int local99 = arg4 + local24.lb;
					@Pc(102) int local102 = local24.anInt9257;
					if (Static595.aBoolean755 && (Static63.method1137(local24).anInt9530 != 0 || local24.anInt9309 == 0) && local102 > 127) {
						local102 = 127;
					}
					@Pc(158) int local158;
					@Pc(162) int local162;
					if (Static93.aClass341_8 == local24) {
						if (arg6 != -1412584499 && (local24.anInt9307 == Static455.anInt7832 || Static49.anInt848 == local24.anInt9307)) {
							Static126.aClass341Array1 = arg0;
							Static512.anInt8689 = arg4;
							Static447.anInt7725 = arg8;
							continue;
						}
						if (Static468.aBoolean614 && Static388.aBoolean537) {
							local158 = Static166.aClass25_1.method4783();
							local162 = Static166.aClass25_1.method4788();
							local158 -= Static571.anInt9433;
							local162 -= Static467.anInt7995;
							if (local158 < Static60.anInt1133) {
								local158 = Static60.anInt1133;
							}
							if (Static72.anInt1425 > local162) {
								local162 = Static72.anInt1425;
							}
							if (Static303.aClass341_13.anInt9300 + Static60.anInt1133 < local24.anInt9300 + local158) {
								local158 = Static303.aClass341_13.anInt9300 + Static60.anInt1133 - local24.anInt9300;
							}
							local94 = local158;
							if (Static72.anInt1425 + Static303.aClass341_13.anInt9248 < local162 - -local24.anInt9248) {
								local162 = Static303.aClass341_13.anInt9248 + Static72.anInt1425 - local24.anInt9248;
							}
							local99 = local162;
						}
						if (Static49.anInt848 == local24.anInt9307) {
							local102 = 128;
						}
					}
					@Pc(290) int local290;
					@Pc(297) int local297;
					@Pc(250) int local250;
					@Pc(255) int local255;
					if (local24.anInt9309 == 2) {
						local162 = arg1;
						local290 = arg7;
						local297 = arg2;
						local158 = arg5;
					} else {
						local250 = local94 + local24.anInt9300;
						local255 = local24.anInt9248 + local99;
						local162 = local99 <= arg1 ? arg1 : local99;
						if (local24.anInt9309 == 9) {
							local250++;
							local255++;
						}
						local158 = arg5 >= local94 ? arg5 : local94;
						local290 = local250 >= arg7 ? arg7 : local250;
						local297 = arg2 <= local255 ? arg2 : local255;
					}
					if (local158 < local290 && local162 < local297) {
						@Pc(543) int local543;
						@Pc(554) int local554;
						@Pc(645) int local645;
						@Pc(508) int local508;
						@Pc(541) int local541;
						if (local24.anInt9297 != 0) {
							if (local24.anInt9297 == Static371.anInt6169 || Static432.anInt7575 == local24.anInt9297) {
								Static396.method5495(Static432.anInt7575 == local24.anInt9297, local24.anInt9300, local99, local94, local24.anInt9248);
								Static166.aBooleanArray5[local67] = true;
								Static16.aClass134_1.da(arg5, arg1, arg7, arg2);
								continue;
							}
							if (local24.anInt9297 == Static157.anInt2851) {
								if (local24.method7563(Static16.aClass134_1) != null) {
									Static510.method7089();
									Static113.method1785(local24, local94, local99, Static16.aClass134_1);
									Static544.aBooleanArray24[local67] = true;
									Static16.aClass134_1.da(arg5, arg1, arg7, arg2);
								}
								continue;
							}
							if (Static224.anInt7363 == local24.anInt9297) {
								if (local24.method7563(Static16.aClass134_1) != null) {
									Static183.method2580(local94, local99, local24);
									Static544.aBooleanArray24[local67] = true;
									Static16.aClass134_1.da(arg5, arg1, arg7, arg2);
								}
								continue;
							}
							if (local24.anInt9297 == Static290.anInt5022) {
								Static335.method4659(local24.anInt9248, local94, Static584.anInterface7_12, local99, local24.anInt9300, Static16.aClass134_1);
								Static166.aBooleanArray5[local67] = true;
								Static16.aClass134_1.da(arg5, arg1, arg7, arg2);
								continue;
							}
							if (Static170.anInt3016 == local24.anInt9297) {
								Static234.method3550(local24.anInt9300, Static16.aClass134_1, local24.anInt9248, local94, local99);
								Static166.aBooleanArray5[local67] = true;
								Static16.aClass134_1.da(arg5, arg1, arg7, arg2);
								continue;
							}
							if (local24.anInt9297 == Static340.anInt5706) {
								if (!Static57.aBoolean487 && !Static236.aBoolean332) {
									continue;
								}
								local250 = local24.anInt9300 + local94;
								local255 = local99 + 15;
								if (Static57.aBoolean487) {
									local508 = -256;
									if (Static163.anInt2947 < 20) {
										local508 = -65536;
									}
									Static442.aClass64_12.method6618(local255, "Fps:" + Static163.anInt2947, -1, local250, local508);
									local255 += 15;
									@Pc(532) Runtime local532 = Runtime.getRuntime();
									local541 = (int) ((local532.totalMemory() - local532.freeMemory()) / 1024L);
									local543 = -256;
									if (local541 > 65536) {
										local543 = -65536;
										if (Static103.aBoolean162) {
											Static156.method2271();
											for (local554 = 0; local554 < 10; local554++) {
												System.gc();
											}
											local541 = (int) ((local532.totalMemory() - local532.freeMemory()) / 1024L);
											if (local541 > 65536) {
												Static571.method7692("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static442.aClass64_12.method6618(local255, "Mem:" + local541 + "k", -1, local250, local543);
									local255 += 15;
									Static442.aClass64_12.method6618(local255, "In:" + Static405.anInt7086 + "B/s Out:" + Static159.anInt2868 + "B/s", -1, local250, -256);
									local255 += 15;
									local554 = Static16.aClass134_1.b() / 1024;
									Static442.aClass64_12.method6618(local255, "Offheap:" + local554 + "k", -1, local250, local554 > 65536 ? -65536 : -256);
									local255 += 15;
									local645 = 0;
									@Pc(647) int local647 = 0;
									@Pc(649) int local649 = 0;
									for (@Pc(651) int local651 = 0; local651 < 35; local651++) {
										if (Static273.aClass29_Sub1Array1[local651] != null) {
											local645 += Static273.aClass29_Sub1Array1[local651].method7187();
											local647 += Static273.aClass29_Sub1Array1[local651].method7190();
											local649 += Static273.aClass29_Sub1Array1[local651].method7188();
										}
									}
									@Pc(691) int local691 = local649 * 100 / local645;
									@Pc(697) int local697 = local647 * 10000 / local645;
									@Pc(717) String local717 = "Cache:" + Static529.method7270((long) local697, true, 0, 2) + "% (" + local691 + "%)";
									Static28.aClass64_1.method6618(local255, local717, -1, local250, -256);
									local255 += 12;
								}
								if (Static269.anInt4744 > 0) {
									Static28.aClass64_1.method6618(local255, "Particles: " + Static501.anInt8570 + " / " + Static269.anInt4744, -1, local250, -256);
								}
								local255 += 12;
								if (Static236.aBoolean332) {
									Static28.aClass64_1.method6618(local255, "Polys: " + Static16.aClass134_1.DA() + " Models: " + Static16.aClass134_1.T(), -1, local250, -256);
									local255 += 12;
									Static28.aClass64_1.method6618(local255, "Ls: " + Static345.anInt5746 + " La: " + Static519.anInt8802 + " NPC: " + Static444.anInt5035 + " Pl: " + Static203.anInt4033, -1, local250, -256);
									local255 += 12;
									Static38.method542();
								}
								Static166.aBooleanArray5[local67] = true;
								continue;
							}
						}
						if (local24.anInt9309 == 0) {
							if (Static274.anInt308 == local24.anInt9297 && Static16.aClass134_1.method6917()) {
								Static16.aClass134_1.method6957(local94, local99, local24.anInt9300, local24.anInt9248);
							}
							method4737(arg0, local162, local297, local67, local99 - local24.anInt9256, local158, local24.anInt9306, local290, local94 - local24.anInt9267);
							if (local24.aClass341Array2 != null) {
								method4737(local24.aClass341Array2, local162, local297, local67, local99 - local24.anInt9256, local158, local24.anInt9306, local290, local94 - local24.anInt9267);
							}
							@Pc(875) Class1_Sub44 local875 = (Class1_Sub44) Static78.aClass187_8.method3797((long) local24.anInt9306);
							if (local875 != null) {
								Static280.method3936(local99, local158, local162, local297, local67, local290, local875.anInt7685, local94);
							}
							if (local24.anInt9297 == Static274.anInt308 && Static16.aClass134_1.method6917()) {
								Static16.aClass134_1.method6898();
							}
							Static16.aClass134_1.da(arg5, arg1, arg7, arg2);
						}
						if (Static504.aBooleanArray14[local67] || Static305.anInt5270 > 1) {
							if (local24.anInt9309 == 3) {
								if (local102 == 0) {
									if (local24.aBoolean720) {
										Static16.aClass134_1.J(local94, local99, local24.anInt9300, local24.anInt9248, local24.anInt9303, 0);
									} else {
										Static16.aClass134_1.method6958(local94, local99, local24.anInt9300, local24.anInt9248, local24.anInt9303, 0);
									}
								} else if (local24.aBoolean720) {
									Static16.aClass134_1.J(local94, local99, local24.anInt9300, local24.anInt9248, local24.anInt9303 & 0xFFFFFF | 255 - (local102 & 0xFF) << 24, 1);
								} else {
									Static16.aClass134_1.method6958(local94, local99, local24.anInt9300, local24.anInt9248, 255 - (local102 & 0xFF) << 24 | local24.anInt9303 & 0xFFFFFF, 1);
								}
							} else if (local24.anInt9309 == 4) {
								@Pc(1007) Class64 local1007 = local24.method7575(Static16.aClass134_1);
								if (local1007 != null) {
									local255 = local24.anInt9303;
									@Pc(1022) String local1022 = local24.aString95;
									if (local24.anInt9328 != -1) {
										@Pc(1033) Class245 local1033 = Static175.aClass114_4.method2217(local24.anInt9328);
										local1022 = local1033.aString62;
										if (local1022 == null) {
											local1022 = "null";
										}
										if ((local1033.anInt6233 == 1 || local24.anInt9324 != 1) && local24.anInt9324 != -1) {
											local1022 = "<col=ff9040>" + local1022 + "</col> x" + Static579.method7403(local24.anInt9324);
										}
									}
									if (Static205.aClass341_21 == local24) {
										local1022 = Static568.aClass351_35.method7651(Static307.anInt5279);
										local255 = local24.anInt9303;
									}
									if (Static378.aBoolean493) {
										Static16.aClass134_1.V(local94, local99, local24.anInt9300 + local94, local99 + local24.anInt9248);
									}
									local1007.method6611(0, local24.anInt9298, local24.anInt9294, local24.anInt9248, local24.anInt9300, local1022, local24.anInt9282, local24.anInt9240, local24.aBoolean723 ? 255 - (local102 & 0xFF) << 24 : -1, local94, null, local99, 255 - (local102 & 0xFF) << 24 | local255, Static369.aClass22Array18, 0, null);
									if (Static378.aBoolean493) {
										Static16.aClass134_1.da(arg5, arg1, arg7, arg2);
									}
								} else if (Static559.aBoolean727) {
									Static442.method6111(local24);
								}
							} else {
								@Pc(1258) int local1258;
								if (local24.anInt9309 == 5) {
									if (local24.anInt9308 >= 0) {
										local24.method7562(Static321.aClass279_1, Static485.aClass318_1).method3944(local24.anInt9248, 0, local24.anInt9300, local24.anInt9264 << 3, 0, local24.anInt9321 << 3, Static16.aClass134_1, local99, local94);
									} else {
										@Pc(1196) Class22 local1196;
										if (local24.anInt9328 == -1) {
											local1196 = local24.method7566(Static16.aClass134_1);
										} else {
											@Pc(1206) Class190 local1206 = local24.aBoolean715 ? Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1 : null;
											local1196 = Static175.aClass114_4.method2216(local24.anInt9318 | 0xFF000000, local24.anInt9277, local24.anInt9324, local24.anInt9260, local24.anInt9328, Static16.aClass134_1, local1206);
										}
										if (local1196 != null) {
											local255 = local1196.A();
											local508 = local1196.ca();
											local1258 = 255 - (local102 & 0xFF) << 24 | (local24.anInt9303 == 0 ? 16777215 : local24.anInt9303 & 0xFFFFFF);
											if (local24.aBoolean710) {
												Static16.aClass134_1.V(local94, local99, local24.anInt9300 + local94, local99 - -local24.anInt9248);
												if (local24.anInt9320 != 0) {
													local541 = (local24.anInt9300 + local255 - 1) / local255;
													local543 = (local508 + local24.anInt9248 - 1) / local508;
													for (local554 = 0; local554 < local541; local554++) {
														for (local645 = 0; local645 < local543; local645++) {
															if (local24.anInt9303 == 0) {
																local1196.method7658((float) (local94 + local255 * local554) + (float) local255 / 2.0F, (float) (local645 * local508 + local99) + (float) local508 / 2.0F, 4096, local24.anInt9320);
															} else {
																local1196.method7652((float) local255 / 2.0F + (float) (local554 * local255 + local94), (float) (local508 * local645 + local99) + (float) local508 / 2.0F, 4096, local24.anInt9320, local1258);
															}
														}
													}
												} else if (local24.anInt9303 == 0 && local102 == 0) {
													local1196.method7657(local94, local99, local24.anInt9300, local24.anInt9248);
												} else {
													local1196.DA(local94, local99, local24.anInt9300, local24.anInt9248, 0, local1258, 1);
												}
												Static16.aClass134_1.da(arg5, arg1, arg7, arg2);
											} else if (local24.anInt9303 == 0 && local102 == 0) {
												if (local24.anInt9320 != 0) {
													local1196.method7658((float) local24.anInt9300 / 2.0F + (float) local94, (float) local24.anInt9248 / 2.0F + (float) local99, local24.anInt9300 * 4096 / local255, local24.anInt9320);
												} else if (local255 == local24.anInt9300 && local508 == local24.anInt9248) {
													local1196.method7662(local94, local99);
												} else {
													local1196.method7653(local94, local99, local24.anInt9300, local24.anInt9248);
												}
											} else if (local24.anInt9320 != 0) {
												local1196.method7652((float) local24.anInt9300 / 2.0F + (float) local94, (float) local99 + (float) local24.anInt9248 / 2.0F, local24.anInt9300 * 4096 / local255, local24.anInt9320, local1258);
											} else if (local255 == local24.anInt9300 && local508 == local24.anInt9248) {
												local1196.V(local94, local99, 0, local1258, 1);
											} else {
												local1196.method7654(local94, local99, local24.anInt9300, local24.anInt9248, 0, local1258, 1);
											}
										} else if (Static559.aBoolean727) {
											Static442.method6111(local24);
										}
									}
								} else if (local24.anInt9309 == 6) {
									Static381.method5111();
									@Pc(1561) Class63 local1561 = null;
									local255 = 0;
									@Pc(1666) Class290 local1666;
									@Pc(1676) Class190 local1676;
									if (local24.anInt9328 != -1) {
										@Pc(1778) Class245 local1778 = Static175.aClass114_4.method2217(local24.anInt9328);
										if (local1778 != null) {
											local1778 = local1778.method5004(local24.anInt9324);
											local1666 = local24.anInt9259 == -1 ? null : Static192.aClass211_1.method4277(local24.anInt9259);
											local1676 = local24.aBoolean715 ? Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1 : null;
											local1561 = local1778.method5005(local24.anInt9253, 2048, local24.anInt9288, 1, local1676, local24.anInt9246, Static16.aClass134_1, local1666);
											if (local1561 == null) {
												Static442.method6111(local24);
											} else {
												local255 = -local1561.J() >> 1;
											}
										}
									} else if (local24.anInt9280 == 5) {
										local508 = local24.anInt9322;
										if (local508 >= 0 && local508 < 2048) {
											@Pc(1716) Class8_Sub3_Sub3_Sub1_Sub1 local1716 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local508];
											@Pc(1729) Class290 local1729 = local24.anInt9259 == -1 ? null : Static192.aClass211_1.method4277(local24.anInt9259);
											if (local1716 != null && (local508 == Static296.anInt5113 || Static61.method1095(local1716.aString16) == local24.anInt9261)) {
												local1561 = local1716.aClass190_1.method3834(null, local24.anInt9246, Static175.aClass114_4, Static430.aClass321_1, null, local24.anInt9253, 2048, Static16.aClass134_1, -1, 0, Static192.aClass211_1, Static384.aClass305_1, Static22.aClass71_1, local1729, 0, local24.anInt9288, Static322.aClass326_2);
											}
										}
									} else if (local24.anInt9280 == 8 || local24.anInt9280 == 9) {
										@Pc(1653) Class1_Sub25 local1653 = Static189.method2917(local24.anInt9322, false);
										local1666 = local24.anInt9259 == -1 ? null : Static192.aClass211_1.method4277(local24.anInt9259);
										if (local1653 != null) {
											local1676 = local24.aBoolean715 ? Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1 : null;
											local1561 = local1653.method3292(local24.anInt9246, local24.anInt9280 == 9, local24.anInt9253, local24.anInt9288, Static16.aClass134_1, local1676, local24.anInt9261, local1666);
										}
									} else if (local24.anInt9259 == -1) {
										local1561 = local24.method7567(Static22.aClass71_1, Static175.aClass114_4, -1, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1, null, Static384.aClass305_1, 0, 2048, Static16.aClass134_1, Static192.aClass211_1, -1, Static322.aClass326_2, Static430.aClass321_1);
										if (local1561 == null && Static559.aBoolean727) {
											Static442.method6111(local24);
										}
									} else {
										@Pc(1592) Class290 local1592 = Static192.aClass211_1.method4277(local24.anInt9259);
										local1561 = local24.method7567(Static22.aClass71_1, Static175.aClass114_4, local24.anInt9288, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1, local1592, Static384.aClass305_1, local24.anInt9246, 2048, Static16.aClass134_1, Static192.aClass211_1, local24.anInt9253, Static322.aClass326_2, Static430.aClass321_1);
										if (local1561 == null && Static559.aBoolean727) {
											Static442.method6111(local24);
										}
									}
									if (local1561 != null) {
										if (local24.anInt9285 > 0) {
											local508 = (local24.anInt9300 << 9) / local24.anInt9285;
										} else {
											local508 = 512;
										}
										if (local24.anInt9242 <= 0) {
											local1258 = 512;
										} else {
											local1258 = (local24.anInt9248 << 9) / local24.anInt9242;
										}
										local541 = local24.anInt9300 / 2 + local94;
										local543 = local24.anInt9248 / 2 + local99;
										if (!local24.aBoolean718) {
											local541 += local24.anInt9296 * local508 >> 9;
											local543 += local24.anInt9315 * local1258 >> 9;
										}
										Static458.aClass113_6.Y();
										Static16.aClass134_1.method6919(Static458.aClass113_6);
										Static16.aClass134_1.la(local541, local543, local508, local1258);
										Static16.aClass134_1.ya();
										if (local24.aBoolean711) {
											Static16.aClass134_1.ZA(false);
										}
										if (local24.aBoolean718) {
											Static250.aClass113_2.oa(local24.anInt9269);
											Static250.aClass113_2.ZA(local24.anInt9323);
											Static250.aClass113_2.AA(local24.anInt9238);
											Static250.aClass113_2.U(local24.anInt9296, local24.anInt9315, local24.anInt9304);
										} else {
											local554 = (local24.anInt9276 << 2) * Class1_Sub6_Sub2.anIntArray675[local24.anInt9269 << 3] >> 14;
											local645 = Class1_Sub6_Sub2.anIntArray676[local24.anInt9269 << 3] * (local24.anInt9276 << 2) >> 14;
											Static250.aClass113_2.J(-local24.anInt9238 << 3);
											Static250.aClass113_2.ZA(local24.anInt9323 << 3);
											Static250.aClass113_2.U(local24.anInt9291 << 2, local554 + (local24.anInt9239 << 2) + local255, (local24.anInt9239 << 2) + local645);
											Static250.aClass113_2.w(local24.anInt9269 << 3);
										}
										local24.method7564(local1561, Static250.aClass113_2, Static16.aClass134_1, Static301.anInt5197);
										if (Static378.aBoolean493) {
											Static16.aClass134_1.V(local94, local99, local94 + local24.anInt9300, local24.anInt9248 + local99);
										}
										if (local24.aBoolean718) {
											if (local24.aBoolean714) {
												local1561.method7420(Static250.aClass113_2, null, local24.anInt9276, 1);
											} else {
												local1561.method7429(Static250.aClass113_2, null, 1);
												if (local24.aClass8_Sub7_8 != null) {
													Static16.aClass134_1.method6940(local24.aClass8_Sub7_8.method4398());
												}
											}
										} else if (local24.aBoolean714) {
											local1561.method7420(Static250.aClass113_2, null, local24.anInt9276 << 2, 1);
										} else {
											local1561.method7429(Static250.aClass113_2, null, 1);
											if (local24.aClass8_Sub7_8 != null) {
												Static16.aClass134_1.method6940(local24.aClass8_Sub7_8.method4398());
											}
										}
										if (Static378.aBoolean493) {
											Static16.aClass134_1.da(arg5, arg1, arg7, arg2);
										}
										if (local24.aBoolean711) {
											Static16.aClass134_1.ZA(true);
										}
									}
								} else if (local24.anInt9309 == 9) {
									if (local24.aBoolean716) {
										local508 = local24.anInt9300 + local94;
										local255 = local24.anInt9248 + local99;
										local1258 = local99;
									} else {
										local255 = local99;
										local1258 = local24.anInt9248 + local99;
										local508 = local94 + local24.anInt9300;
									}
									if (local24.anInt9283 == 1) {
										Static16.aClass134_1.method6959(local94, local255, local508, local1258, local24.anInt9303, 0);
									} else {
										Static16.aClass134_1.method6949(local94, local255, local508, local1258, local24.anInt9303, local24.anInt9283);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIB)B")
	public static byte method4738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(CI)Z")
	public static boolean method4739(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
