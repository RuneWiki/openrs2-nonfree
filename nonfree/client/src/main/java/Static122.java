import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "Lclient!mq;")
	public static Class212 aClass212_2;

	@OriginalMember(owner = "client!eh", name = "db", descriptor = "Lclient!sw;")
	public static Class309 aClass309_3;

	@OriginalMember(owner = "client!eh", name = "fb", descriptor = "[Lclient!ob;")
	public static Class236[] aClass236Array3;

	@OriginalMember(owner = "client!eh", name = "N", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_93 = new Class123(91, 9);

	@OriginalMember(owner = "client!eh", name = "gb", descriptor = "I")
	public static int anInt2858 = 0;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(III)Z")
	public static boolean method2357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static317.method4702(arg1, arg0) || Static576.method7812(arg1, arg0);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIII[Lclient!pca;IZI)V")
	public static void method2358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class251[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		Static319.aClass31_11.da(arg8, arg3, arg4, arg0);
		for (@Pc(13) int local13 = 0; local13 < arg6.length; local13++) {
			@Pc(21) Class251 local21 = arg6[local13];
			if (local21 != null && (local21.anInt7280 == arg7 || arg7 == -1412584499 && Static2.aClass251_1 == local21)) {
				@Pc(46) int local46;
				if (arg1 == -1) {
					Class3_Sub16_Sub1.aRectangleArray2[Static314.anInt5780].setBounds(local21.anInt7224 + arg5, arg2 + local21.anInt7281, local21.anInt7285, local21.anInt7215);
					local46 = Static314.anInt5780++;
				} else {
					local46 = arg1;
				}
				local21.anInt7282 = Static397.anInt6998;
				local21.anInt7286 = local46;
				if (!Static70.method1711(local21)) {
					if (local21.anInt7249 != 0) {
						Static98.method2037(local21);
					}
					@Pc(94) int local94 = arg5 + local21.anInt7224;
					@Pc(99) int local99 = local21.anInt7281 + arg2;
					@Pc(102) int local102 = local21.anInt7240;
					if (Static355.aBoolean446 && (Static70.method1716(local21).anInt3988 != 0 || local21.anInt7231 == 0) && local102 > 127) {
						local102 = 127;
					}
					@Pc(159) int local159;
					@Pc(163) int local163;
					if (Static2.aClass251_1 == local21) {
						if (arg7 != -1412584499 && (local21.anInt7205 == Static107.anInt2623 || local21.anInt7205 == Static543.anInt9487)) {
							Static114.anInt2704 = arg2;
							Static98.anInt2413 = arg5;
							Static302.aClass251Array2 = arg6;
							continue;
						}
						if (Static558.aBoolean641 && Static70.aBoolean157) {
							local159 = Static234.aClass54_4.method7306();
							local163 = Static234.aClass54_4.method7315();
							local163 -= Static369.anInt6482;
							local159 -= Static495.anInt8599;
							if (local159 < Static527.anInt10289) {
								local159 = Static527.anInt10289;
							}
							if (local163 < Static507.anInt8787) {
								local163 = Static507.anInt8787;
							}
							if (Static527.anInt10289 + Static45.aClass251_3.anInt7285 < local21.anInt7285 + local159) {
								local159 = Static45.aClass251_3.anInt7285 + Static527.anInt10289 - local21.anInt7285;
							}
							if (local163 + local21.anInt7215 > Static507.anInt8787 - -Static45.aClass251_3.anInt7215) {
								local163 = Static507.anInt8787 + Static45.aClass251_3.anInt7215 - local21.anInt7215;
							}
							local94 = local159;
							local99 = local163;
						}
						if (Static543.anInt9487 == local21.anInt7205) {
							local102 = 128;
						}
					}
					@Pc(248) int local248;
					@Pc(242) int local242;
					@Pc(255) int local255;
					@Pc(261) int local261;
					if (local21.anInt7231 == 2) {
						local242 = arg0;
						local163 = arg3;
						local159 = arg8;
						local248 = arg4;
					} else {
						local255 = local94 + local21.anInt7285;
						local261 = local99 + local21.anInt7215;
						local159 = local94 <= arg8 ? arg8 : local94;
						if (local21.anInt7231 == 9) {
							local261++;
							local255++;
						}
						local163 = arg3 >= local99 ? arg3 : local99;
						local248 = local255 < arg4 ? local255 : arg4;
						local242 = arg0 <= local261 ? arg0 : local261;
					}
					if (local159 < local248 && local242 > local163) {
						@Pc(540) int local540;
						@Pc(553) int local553;
						@Pc(645) int local645;
						@Pc(507) int local507;
						@Pc(538) int local538;
						if (local21.anInt7249 != 0) {
							if (local21.anInt7249 == Static92.anInt2341 || Static371.anInt6485 == local21.anInt7249) {
								Static12.method116(local99, local21.anInt7215, local94, local21.anInt7285, local21.anInt7249 == Static371.anInt6485);
								Static544.aBooleanArray32[local46] = true;
								Static319.aClass31_11.da(arg8, arg3, arg4, arg0);
								continue;
							}
							if (Static354.anInt6316 == local21.anInt7249) {
								if (local21.method5693(Static319.aClass31_11) != null) {
									Static245.method3870();
									Static416.method5814(Static319.aClass31_11, local99, local94, local21);
									Static383.aBooleanArray20[local46] = true;
									Static319.aClass31_11.da(arg8, arg3, arg4, arg0);
								}
								continue;
							}
							if (Static497.anInt8613 == local21.anInt7249) {
								if (local21.method5693(Static319.aClass31_11) != null) {
									Static292.method4403(local21, local94, local99);
									Static383.aBooleanArray20[local46] = true;
									Static319.aClass31_11.da(arg8, arg3, arg4, arg0);
								}
								continue;
							}
							if (Static556.anInt9447 == local21.anInt7249) {
								Static284.method4275(Static319.aClass31_11, local21.anInt7215, local94, local21.anInt7285, local99, Static100.anInterface4_13);
								Static544.aBooleanArray32[local46] = true;
								Static319.aClass31_11.da(arg8, arg3, arg4, arg0);
								continue;
							}
							if (Static435.anInt7693 == local21.anInt7249) {
								Static567.method4399(Static319.aClass31_11, local21.anInt7215, local94, local21.anInt7285, local99);
								Static544.aBooleanArray32[local46] = true;
								Static319.aClass31_11.da(arg8, arg3, arg4, arg0);
								continue;
							}
							if (Static512.anInt8853 == local21.anInt7249) {
								if (!Static306.aBoolean385 && !Static451.aBoolean554) {
									continue;
								}
								local255 = local94 + local21.anInt7285;
								local261 = local99 + 15;
								if (Static306.aBoolean385) {
									local507 = -256;
									if (Static180.anInt3953 < 20) {
										local507 = -65536;
									}
									Static2.aClass63_1.method6879(local261, -1, local255, local507, "Fps:" + Static180.anInt3953);
									local261 += 15;
									@Pc(529) Runtime local529 = Runtime.getRuntime();
									local538 = (int) ((local529.totalMemory() - local529.freeMemory()) / 1024L);
									local540 = -256;
									if (local538 > 98304) {
										local540 = -65536;
										if (Static437.aBoolean538) {
											Static119.method2327();
											for (local553 = 0; local553 < 10; local553++) {
												System.gc();
											}
											local538 = (int) ((local529.totalMemory() - local529.freeMemory()) / 1024L);
											if (local538 > 65536) {
												Static260.method4014("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static2.aClass63_1.method6879(local261, -1, local255, local540, "Mem:" + local538 + "k");
									local261 += 15;
									Static2.aClass63_1.method6879(local261, -1, local255, -256, "In:" + Static456.anInt7973 + "B/s Out:" + Static529.anInt9243 + "B/s");
									local261 += 15;
									local553 = Static319.aClass31_11.b() / 1024;
									Static2.aClass63_1.method6879(local261, -1, local255, local553 <= 65536 ? -256 : -65536, "Offheap:" + local553 + "k");
									local261 += 15;
									local645 = 0;
									@Pc(647) int local647 = 0;
									@Pc(649) int local649 = 0;
									for (@Pc(651) int local651 = 0; local651 < 35; local651++) {
										if (Static449.aClass98_Sub1Array1[local651] != null) {
											local645 += Static449.aClass98_Sub1Array1[local651].method4628();
											local647 += Static449.aClass98_Sub1Array1[local651].method4624();
											local649 += Static449.aClass98_Sub1Array1[local651].method4621();
										}
									}
									@Pc(693) int local693 = local649 * 100 / local645;
									@Pc(699) int local699 = local647 * 10000 / local645;
									@Pc(719) String local719 = "Cache:" + Static338.method4929((long) local699, true, 0, 2) + "% (" + local693 + "%)";
									Static393.aClass63_9.method6879(local261, -1, local255, -256, local719);
									local261 += 12;
								}
								if (Static65.anInt1813 > 0) {
									Static393.aClass63_9.method6879(local261, -1, local255, -256, "Particles: " + Static524.anInt9194 + " / " + Static65.anInt1813);
								}
								local261 += 12;
								if (Static451.aBoolean554) {
									Static393.aClass63_9.method6879(local261, -1, local255, -256, "Polys: " + Static319.aClass31_11.DA() + " Models: " + Static319.aClass31_11.T());
									local261 += 12;
									Static393.aClass63_9.method6879(local261, -1, local255, -256, "Ls: " + Static73.anInt7669 + " La: " + Static565.anInt9794 + " NPC: " + Static331.anInt6011 + " Pl: " + Static465.anInt8094);
									local261 += 12;
									Static566.method7705();
								}
								Static544.aBooleanArray32[local46] = true;
								continue;
							}
						}
						if (local21.anInt7231 == 0) {
							if (Static314.anInt5781 == local21.anInt7249 && Static319.aClass31_11.method8085()) {
								Static319.aClass31_11.method8021(local94, local99, local21.anInt7285, local21.anInt7215);
							}
							method2358(local242, local46, local99 - local21.anInt7275, local163, local248, local94 - local21.anInt7274, arg6, local21.anInt7279, local159);
							if (local21.aClass251Array3 != null) {
								method2358(local242, local46, local99 - local21.anInt7275, local163, local248, local94 - local21.anInt7274, local21.aClass251Array3, local21.anInt7279, local159);
							}
							@Pc(879) Class3_Sub49 local879 = (Class3_Sub49) Static204.aClass297_16.method6531((long) local21.anInt7279);
							if (local879 != null) {
								Static353.method5077(local879.anInt9244, local248, local46, local159, local99, local163, local94, local242);
							}
							if (Static314.anInt5781 == local21.anInt7249 && Static319.aClass31_11.method8085()) {
								Static319.aClass31_11.method8023();
							}
							Static319.aClass31_11.da(arg8, arg3, arg4, arg0);
						}
						if (Static178.aBooleanArray11[local46] || Static92.anInt2339 > 1) {
							if (local21.anInt7231 == 3) {
								if (local102 == 0) {
									if (local21.aBoolean510) {
										Static319.aClass31_11.J(local94, local99, local21.anInt7285, local21.anInt7215, local21.anInt7278, 0);
									} else {
										Static319.aClass31_11.method8035(local94, local99, local21.anInt7285, local21.anInt7215, local21.anInt7278, 0);
									}
								} else if (local21.aBoolean510) {
									Static319.aClass31_11.J(local94, local99, local21.anInt7285, local21.anInt7215, local21.anInt7278 & 0xFFFFFF | 255 - (local102 & 0xFF) << 24, 1);
								} else {
									Static319.aClass31_11.method8035(local94, local99, local21.anInt7285, local21.anInt7215, local21.anInt7278 & 0xFFFFFF | 255 - (local102 & 0xFF) << 24, 1);
								}
							} else if (local21.anInt7231 == 4) {
								@Pc(1018) Class63 local1018 = local21.method5705(Static319.aClass31_11);
								if (local1018 != null) {
									local261 = local21.anInt7278;
									@Pc(1033) String local1033 = local21.aString189;
									if (local21.anInt7254 != -1) {
										@Pc(1043) Class133 local1043 = Static272.aClass121_2.method3327(local21.anInt7254);
										local1033 = local1043.aString106;
										if (local1033 == null) {
											local1033 = "null";
										}
										if ((local1043.anInt4411 == 1 || local21.anInt7248 != 1) && local21.anInt7248 != -1) {
											local1033 = "<col=ff9040>" + local1033 + "</col> x" + Static403.method5708(local21.anInt7248);
										}
									}
									if (Static463.aClass251_12 == local21) {
										local1033 = Static573.aClass350_35.method7730(Static201.anInt4321);
										local261 = local21.anInt7278;
									}
									if (Static313.aBoolean392) {
										Static319.aClass31_11.V(local94, local99, local94 + local21.anInt7285, local99 - -local21.anInt7215);
									}
									local1018.method6894(local261 | 255 - (local102 & 0xFF) << 24, local94, local1033, local21.anInt7257, 0, local21.anInt7215, local21.aBoolean512 ? 255 - (local102 & 0xFF) << 24 : -1, local21.anInt7285, local21.anInt7225, local99, 0, local21.anInt7228, null, Static459.aClass73Array12, null, local21.anInt7239);
									if (Static313.aBoolean392) {
										Static319.aClass31_11.da(arg8, arg3, arg4, arg0);
									}
								} else if (Static373.aBoolean457) {
									Static588.method8016(local21);
								}
							} else {
								@Pc(1258) int local1258;
								if (local21.anInt7231 == 5) {
									if (local21.anInt7277 >= 0) {
										local21.method5697(Static345.aClass103_1, Static240.aClass13_1).method5769(0, local21.anInt7232 << 3, Static319.aClass31_11, local99, 0, local21.anInt7244 << 3, local21.anInt7215, local21.anInt7285, local94);
									} else {
										@Pc(1225) Class73 local1225;
										if (local21.anInt7254 == -1) {
											local1225 = local21.method5701(Static319.aClass31_11);
										} else {
											@Pc(1207) Class131 local1207 = local21.aBoolean513 ? Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1 : null;
											local1225 = Static272.aClass121_2.method3328(local21.anInt7227 | 0xFF000000, local21.anInt7254, local21.anInt7253, Static319.aClass31_11, local1207, local21.anInt7248, local21.anInt7273);
										}
										if (local1225 != null) {
											local261 = local1225.A();
											local507 = local1225.ca();
											local1258 = (local21.anInt7278 == 0 ? 16777215 : local21.anInt7278 & 0xFFFFFF) | 255 - (local102 & 0xFF) << 24;
											if (local21.aBoolean515) {
												Static319.aClass31_11.V(local94, local99, local94 + local21.anInt7285, local99 - -local21.anInt7215);
												if (local21.anInt7255 != 0) {
													local538 = (local21.anInt7285 + local261 - 1) / local261;
													local540 = (local507 + local21.anInt7215 - 1) / local507;
													for (local553 = 0; local553 < local538; local553++) {
														for (local645 = 0; local645 < local540; local645++) {
															if (local21.anInt7278 == 0) {
																local1225.method7960((float) (local94 + local553 * local261) + (float) local261 / 2.0F, (float) local507 / 2.0F + (float) (local645 * local507 + local99), 4096, local21.anInt7255);
															} else {
																local1225.method7956((float) local261 / 2.0F + (float) (local553 * local261 + local94), (float) (local507 * local645 + local99) + (float) local507 / 2.0F, 4096, local21.anInt7255, local1258);
															}
														}
													}
												} else if (local21.anInt7278 == 0 && local102 == 0) {
													local1225.method7953(local94, local99, local21.anInt7285, local21.anInt7215);
												} else {
													local1225.DA(local94, local99, local21.anInt7285, local21.anInt7215, 0, local1258, 1);
												}
												Static319.aClass31_11.da(arg8, arg3, arg4, arg0);
											} else if (local21.anInt7278 == 0 && local102 == 0) {
												if (local21.anInt7255 != 0) {
													local1225.method7960((float) local21.anInt7285 / 2.0F + (float) local94, (float) local21.anInt7215 / 2.0F + (float) local99, local21.anInt7285 * 4096 / local261, local21.anInt7255);
												} else if (local21.anInt7285 == local261 && local507 == local21.anInt7215) {
													local1225.method7957(local94, local99);
												} else {
													local1225.method7955(local94, local99, local21.anInt7285, local21.anInt7215);
												}
											} else if (local21.anInt7255 != 0) {
												local1225.method7956((float) local94 + (float) local21.anInt7285 / 2.0F, (float) local99 + (float) local21.anInt7215 / 2.0F, local21.anInt7285 * 4096 / local261, local21.anInt7255, local1258);
											} else if (local21.anInt7285 == local261 && local507 == local21.anInt7215) {
												local1225.V(local94, local99, 0, local1258, 1);
											} else {
												local1225.method7949(local94, local99, local21.anInt7285, local21.anInt7215, 0, local1258, 1);
											}
										} else if (Static373.aBoolean457) {
											Static588.method8016(local21);
										}
									}
								} else if (local21.anInt7231 == 6) {
									Static142.method2744();
									@Pc(1576) Class52 local1576 = null;
									local261 = 0;
									@Pc(1609) Class270 local1609;
									@Pc(1617) Class131 local1617;
									if (local21.anInt7254 != -1) {
										@Pc(1589) Class133 local1589 = Static272.aClass121_2.method3327(local21.anInt7254);
										if (local1589 != null) {
											local1589 = local1589.method3544(local21.anInt7248);
											local1609 = local21.anInt7266 == -1 ? null : Static245.aClass155_1.method3820(local21.anInt7266);
											local1617 = local21.aBoolean513 ? Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1 : null;
											local1576 = local1589.method3545(local1617, 1, 2048, local21.anInt7222, local21.anInt7271, local21.anInt7270, Static319.aClass31_11, local1609);
											if (local1576 == null) {
												Static588.method8016(local21);
											} else {
												local261 = -local1576.J() >> 1;
											}
										}
									} else if (local21.anInt7288 == 5) {
										local507 = local21.anInt7229;
										if (local507 >= 0 && local507 < 2048) {
											@Pc(1794) Class25_Sub2_Sub2_Sub5_Sub1 local1794 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local507];
											@Pc(1806) Class270 local1806 = local21.anInt7266 == -1 ? null : Static245.aClass155_1.method3820(local21.anInt7266);
											if (local1794 != null && (local507 == Static147.anInt3433 || Static454.method6255(local1794.aString183) == local21.anInt7219)) {
												local1576 = local1794.aClass131_1.method3492(0, 0, Static324.aClass356_1, local21.anInt7222, null, local21.anInt7270, -1, Static206.aClass143_3, 2048, 0, null, Static319.aClass31_11, Static181.aClass60_1, local1806, Static98.aClass313_1, local21.anInt7271, null, Static272.aClass121_2, Static245.aClass155_1);
											}
										}
									} else if (local21.anInt7288 == 8 || local21.anInt7288 == 9) {
										@Pc(1670) Class3_Sub44 local1670 = Static470.method6424(false, local21.anInt7229);
										local1609 = local21.anInt7266 == -1 ? null : Static245.aClass155_1.method3820(local21.anInt7266);
										if (local1670 != null) {
											local1617 = local21.aBoolean513 ? Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1 : null;
											local1576 = local1670.method6086(local21.anInt7288 == 9, local1617, local21.anInt7219, local21.anInt7271, local21.anInt7270, local1609, Static319.aClass31_11, local21.anInt7222);
										}
									} else if (local21.anInt7266 == -1) {
										local1576 = local21.method5704(0, Static272.aClass121_2, -1, Static98.aClass313_1, Static245.aClass155_1, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1, Static181.aClass60_1, null, Static324.aClass356_1, -1, 2048, Static206.aClass143_3, Static319.aClass31_11);
										if (local1576 == null && Static373.aBoolean457) {
											Static588.method8016(local21);
										}
									} else {
										@Pc(1727) Class270 local1727 = Static245.aClass155_1.method3820(local21.anInt7266);
										local1576 = local21.method5704(local21.anInt7222, Static272.aClass121_2, local21.anInt7271, Static98.aClass313_1, Static245.aClass155_1, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1, Static181.aClass60_1, local1727, Static324.aClass356_1, local21.anInt7270, 2048, Static206.aClass143_3, Static319.aClass31_11);
										if (local1576 == null && Static373.aBoolean457) {
											Static588.method8016(local21);
										}
									}
									if (local1576 != null) {
										if (local21.anInt7220 > 0) {
											local507 = (local21.anInt7285 << 9) / local21.anInt7220;
										} else {
											local507 = 512;
										}
										if (local21.anInt7261 <= 0) {
											local1258 = 512;
										} else {
											local1258 = (local21.anInt7215 << 9) / local21.anInt7261;
										}
										local538 = local94 + local21.anInt7285 / 2;
										local540 = local21.anInt7215 / 2 + local99;
										if (!local21.aBoolean500) {
											local540 += local21.anInt7216 * local1258 >> 9;
											local538 += local21.anInt7203 * local507 >> 9;
										}
										Static585.aClass42_6.Y();
										Static319.aClass31_11.method8062(Static585.aClass42_6);
										Static319.aClass31_11.la(local538, local540, local507, local1258);
										Static319.aClass31_11.ya();
										if (local21.aBoolean499) {
											Static319.aClass31_11.ZA(false);
										}
										if (local21.aBoolean500) {
											Static378.aClass42_4.oa(local21.anInt7252);
											Static378.aClass42_4.ZA(local21.anInt7269);
											Static378.aClass42_4.AA(local21.anInt7262);
											Static378.aClass42_4.U(local21.anInt7203, local21.anInt7216, local21.anInt7208);
										} else {
											local553 = Class3_Sub28.anIntArray232[local21.anInt7252 << 3] * (local21.anInt7210 << 2) >> 14;
											local645 = Class3_Sub28.anIntArray231[local21.anInt7252 << 3] * (local21.anInt7210 << 2) >> 14;
											Static378.aClass42_4.J(-local21.anInt7262 << 3);
											Static378.aClass42_4.ZA(local21.anInt7269 << 3);
											Static378.aClass42_4.U(local21.anInt7237 << 2, (local21.anInt7260 << 2) + local553 + local261, (local21.anInt7260 << 2) + local645);
											Static378.aClass42_4.w(local21.anInt7252 << 3);
										}
										local21.method5702(Static319.aClass31_11, local1576, Static378.aClass42_4, Static397.anInt6998);
										if (Static313.aBoolean392) {
											Static319.aClass31_11.V(local94, local99, local94 + local21.anInt7285, local99 - -local21.anInt7215);
										}
										if (local21.aBoolean500) {
											if (local21.aBoolean506) {
												local1576.method7619(Static378.aClass42_4, null, local21.anInt7210, 1);
											} else {
												local1576.method7617(Static378.aClass42_4, null, 1);
												if (local21.aClass25_Sub7_6 != null) {
													Static319.aClass31_11.method8090(local21.aClass25_Sub7_6.method3781());
												}
											}
										} else if (local21.aBoolean506) {
											local1576.method7619(Static378.aClass42_4, null, local21.anInt7210 << 2, 1);
										} else {
											local1576.method7617(Static378.aClass42_4, null, 1);
											if (local21.aClass25_Sub7_6 != null) {
												Static319.aClass31_11.method8090(local21.aClass25_Sub7_6.method3781());
											}
										}
										if (Static313.aBoolean392) {
											Static319.aClass31_11.da(arg8, arg3, arg4, arg0);
										}
										if (local21.aBoolean499) {
											Static319.aClass31_11.ZA(true);
										}
									}
								} else if (local21.anInt7231 == 9) {
									if (local21.aBoolean503) {
										local1258 = local99;
										local507 = local21.anInt7285 + local94;
										local261 = local21.anInt7215 + local99;
									} else {
										local507 = local21.anInt7285 + local94;
										local1258 = local21.anInt7215 + local99;
										local261 = local99;
									}
									if (local21.anInt7201 == 1) {
										Static319.aClass31_11.method8059(local94, local261, local507, local1258, local21.anInt7278, 0);
									} else {
										Static319.aClass31_11.method8092(local94, local261, local507, local1258, local21.anInt7278, local21.anInt7201);
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
