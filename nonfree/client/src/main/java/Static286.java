import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!ima", name = "q", descriptor = "Lclient!hw;")
	public static Class169 aClass169_5;

	@OriginalMember(owner = "client!ima", name = "n", descriptor = "I")
	public static int anInt4374;

	@OriginalMember(owner = "client!ima", name = "j", descriptor = "Lclient!ula;")
	public static final Class379 aClass379_8 = new Class379("LIVE", "", "", 0);

	@OriginalMember(owner = "client!ima", name = "r", descriptor = "I")
	public static int anInt4372 = 0;

	@OriginalMember(owner = "client!ima", name = "k", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_77 = new Class397(47, 4);

	@OriginalMember(owner = "client!ima", name = "p", descriptor = "[I")
	public static final int[] anIntArray337 = new int[5];

	@OriginalMember(owner = "client!ima", name = "a", descriptor = "(ID)V")
	public static void method4023(@OriginalArg(1) double arg0) {
		Static276.aClass58_3.method9516(Static245.aClass58_2);
		Static276.aClass58_3.method9509(0, 0, (int) arg0);
		Static536.aClass22_11.method9405(Static276.aClass58_3);
	}

	@OriginalMember(owner = "client!ima", name = "a", descriptor = "(III[Lclient!nt;IIIZIII)V")
	public static void method4024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class270[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static153.aClass22_4.KA(arg5, arg8, arg0, arg3);
		for (@Pc(20) int local20 = 0; local20 < arg2.length; local20++) {
			@Pc(26) Class270 local26 = arg2[local20];
			if (local26 != null && (local26.anInt7050 == arg4 || arg4 == -1412584499 && local26 == Static334.aClass270_10)) {
				@Pc(55) int local55 = arg1 + local26.anInt7036;
				@Pc(60) int local60 = local26.anInt6981 + arg7;
				@Pc(67) int local67 = local55 + local26.anInt7015 + 1;
				@Pc(74) int local74 = local60 + local26.anInt7045 + 1;
				@Pc(79) int local79;
				if (arg9 == -1) {
					Class202.aRectangleArray1[Static440.anInt6772].setBounds(local26.anInt7036 + arg1, arg7 + local26.anInt6981, local26.anInt7015, local26.anInt7045);
					local79 = Static440.anInt6772++;
				} else {
					local79 = arg9;
				}
				local26.anInt7029 = local79;
				local26.anInt6964 = Static716.anInt11157;
				if (!Static85.method1865(local26)) {
					if (local26.anInt7042 != 0) {
						Static410.method2595(local26);
					}
					@Pc(127) int local127 = arg1 + local26.anInt7036;
					@Pc(133) int local133 = local26.anInt6981 + arg7;
					@Pc(135) int local135 = 0;
					@Pc(137) int local137 = 0;
					if (Static347.aBoolean360) {
						local135 = Static308.method4570();
						local137 = Static541.method7180();
					}
					@Pc(148) int local148 = local26.anInt7002;
					if (Static571.aBoolean583 && (Static85.method1871(local26).anInt7682 != 0 || local26.anInt7008 == 0) && local148 > 127) {
						local148 = 127;
					}
					@Pc(222) int local222;
					@Pc(228) int local228;
					if (local26 == Static334.aClass270_10) {
						if (arg4 != -1412584499 && (local26.anInt7018 == Static466.anInt7300 || local26.anInt7018 == Static561.anInt8574)) {
							Static116.aClass270Array1 = arg2;
							Static489.anInt10879 = arg1;
							Static129.anInt2541 = arg7;
							continue;
						}
						if (Static634.aBoolean657 && Static512.aBoolean721) {
							local222 = Static334.aClass18_1.method4192() + local135;
							local228 = Static334.aClass18_1.method4196() + local137;
							local228 -= Static720.anInt11175;
							local222 -= Static323.anInt5198;
							if (Static570.anInt8655 > local222) {
								local222 = Static570.anInt8655;
							}
							if (Static725.anInt11253 > local228) {
								local228 = Static725.anInt11253;
							}
							if (local222 + local26.anInt7015 > Static309.aClass270_9.anInt7015 + Static570.anInt8655) {
								local222 = Static309.aClass270_9.anInt7015 + Static570.anInt8655 - local26.anInt7015;
							}
							local127 = local222;
							if (Static725.anInt11253 + Static309.aClass270_9.anInt7045 < local26.anInt7045 + local228) {
								local228 = Static309.aClass270_9.anInt7045 + Static725.anInt11253 - local26.anInt7045;
							}
							local133 = local228;
						}
						if (Static561.anInt8574 == local26.anInt7018) {
							local148 = 128;
						}
					}
					@Pc(354) int local354;
					@Pc(362) int local362;
					@Pc(309) int local309;
					@Pc(314) int local314;
					if (local26.anInt7008 == 2) {
						local228 = arg8;
						local362 = arg3;
						local222 = arg5;
						local354 = arg0;
					} else {
						local309 = local26.anInt7015 + local127;
						local314 = local26.anInt7045 + local133;
						local228 = arg8 < local133 ? local133 : arg8;
						local222 = local127 <= arg5 ? arg5 : local127;
						if (local26.anInt7008 == 9) {
							local314++;
							local309++;
						}
						local354 = arg0 > local309 ? local309 : arg0;
						local362 = arg3 > local314 ? local314 : arg3;
					}
					if (local222 < local354 && local228 < local362) {
						@Pc(740) int local740;
						@Pc(773) int local773;
						@Pc(786) int local786;
						@Pc(930) int local930;
						@Pc(932) int local932;
						@Pc(775) int local775;
						if (local26.anInt7042 != 0) {
							if (Static727.anInt11271 == local26.anInt7042 || Static344.anInt5515 == local26.anInt7042) {
								Static713.method9475(local127, local133, local26);
								if (!Static347.aBoolean360) {
									Static187.method2944(local26.anInt7015, local127, local26.anInt7042 == Static344.anInt5515, local26.anInt7045, local133);
									Static153.aClass22_4.KA(arg5, arg8, arg0, arg3);
								}
								Static572.aBooleanArray23[local79] = true;
								continue;
							}
							if (local26.anInt7042 == Static673.anInt10807 && Static103.anInt2245 == 0) {
								if (local26.method6017(Static153.aClass22_4) != null) {
									Static445.method5895();
									Static28.method1029(local26, local133, Static153.aClass22_4, local127);
									Static472.aBooleanArray19[local79] = true;
									Static153.aClass22_4.KA(arg5, arg8, arg0, arg3);
									if (Static347.aBoolean360) {
										if (arg6) {
											Static218.method3251(local74, local55, local67, local60);
										} else {
											Static476.method6482(local74, local67, local55, local60);
										}
									}
								}
								continue;
							}
							if (Static184.anInt3194 == local26.anInt7042) {
								Static504.method6880(local26, local127, local133, Static153.aClass22_4);
								continue;
							}
							if (local26.anInt7042 == Static689.anInt10732) {
								Static431.method5714(local127, local26, -89, local133, local26.anInt6972 % 64, Static153.aClass22_4);
								continue;
							}
							if (Static373.anInt2731 == local26.anInt7042) {
								if (local26.method6017(Static153.aClass22_4) != null) {
									Static536.method7117(local127, local133, local26);
									Static472.aBooleanArray19[local79] = true;
									Static153.aClass22_4.KA(arg5, arg8, arg0, arg3);
									if (Static347.aBoolean360) {
										if (arg6) {
											Static218.method3251(local74, local55, local67, local60);
										} else {
											Static476.method6482(local74, local67, local55, local60);
										}
									}
								}
								continue;
							}
							if (Static308.anInt4972 == local26.anInt7042) {
								Static269.method3819(local133, local127, local26.anInt7015, Static153.aClass22_4, local26.anInt7045, Static240.anInterface4_11);
								Static572.aBooleanArray23[local79] = true;
								Static153.aClass22_4.KA(arg5, arg8, arg0, arg3);
								continue;
							}
							if (Static592.anInt9022 == local26.anInt7042) {
								Static2.method26(local133, local26.anInt7045, Static153.aClass22_4, local26.anInt7015, local127);
								Static572.aBooleanArray23[local79] = true;
								Static153.aClass22_4.KA(arg5, arg8, arg0, arg3);
								continue;
							}
							if (Static404.anInt6301 == local26.anInt7042) {
								if (!Static714.aBoolean755 && !Static559.aBoolean578) {
									continue;
								}
								local309 = local26.anInt7015 + local127;
								local314 = local133 + 15;
								if (Static347.aBoolean360) {
									if (arg6) {
										Static218.method3251(local74, local55, local67, local60);
									} else {
										Static476.method6482(local74, local67, local55, local60);
									}
								}
								if (Static714.aBoolean755) {
									local740 = -256;
									if (Static605.anInt9179 < 20) {
										local740 = -65536;
									}
									Static480.aClass57_9.method9134(local314, -1, local309, "Fps:" + Static605.anInt9179, local740);
									local314 += 15;
									@Pc(764) Runtime local764 = Runtime.getRuntime();
									local773 = (int) ((local764.totalMemory() - local764.freeMemory()) / 1024L);
									local775 = -256;
									if (local773 > 98304) {
										local775 = -65536;
										if (Static67.aBoolean116) {
											Static135.method9078();
											for (local786 = 0; local786 < 10; local786++) {
												System.gc();
											}
											local773 = (int) ((local764.totalMemory() - local764.freeMemory()) / 1024L);
											if (local773 > 65536) {
												Static304.method4498("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static480.aClass57_9.method9134(local314, -1, local309, "Mem:" + local773 + "k", local775);
									local314 += 15;
									Static480.aClass57_9.method9134(local314, -1, local309, "Game: In:" + Static95.aClass292_2.anInt8016 + "B/s Out:" + Static95.aClass292_2.anInt8014 + "B/s", -256);
									local314 += 15;
									Static480.aClass57_9.method9134(local314, -1, local309, "Lobby: In:" + Static95.aClass292_1.anInt8016 + "B/s Out:" + Static95.aClass292_1.anInt8014 + "B/s", -256);
									local314 += 15;
									local786 = Static153.aClass22_4.E() / 1024;
									Static480.aClass57_9.method9134(local314, -1, local309, "Offheap:" + local786 + "k", local786 > 65536 ? -65536 : -256);
									local314 += 15;
									local930 = 0;
									local932 = 0;
									@Pc(934) int local934 = 0;
									for (@Pc(936) int local936 = 0; local936 < 37; local936++) {
										if (Static384.aClass102_Sub1Array2[local936] != null) {
											local930 += Static384.aClass102_Sub1Array2[local936].method2514();
											local932 += Static384.aClass102_Sub1Array2[local936].method2518();
											local934 += Static384.aClass102_Sub1Array2[local936].method2516();
										}
									}
									@Pc(978) int local978 = local934 * 100 / local930;
									@Pc(984) int local984 = local932 * 10000 / local930;
									@Pc(1010) String local1010 = "Cache:" + Static234.method3394(true, 0, 2, (long) local984) + "% (" + local978 + "%)";
									Static607.aClass57_12.method9134(local314, -1, local309, local1010, -256);
									local314 += 12;
								}
								if (Static397.anInt6167 > 0) {
									Static607.aClass57_12.method9134(local314, -1, local309, "Particles: " + Static668.anInt10258 + " / " + Static397.anInt6167, -256);
								}
								local314 += 12;
								if (Static559.aBoolean578) {
									Static607.aClass57_12.method9134(local314, -1, local309, "Polys: " + Static153.aClass22_4.I() + " Models: " + Static153.aClass22_4.M(), -256);
									local314 += 12;
									Static607.aClass57_12.method9134(local314, -1, local309, "Ls: " + Static522.anInt8176 + " La: " + Static442.anInt6788 + " NPC: " + Static48.anInt1322 + " Pl: " + Static445.anInt6823, -256);
									local314 += 12;
									Static449.method5960();
								}
								Static572.aBooleanArray23[local79] = true;
								continue;
							}
						}
						@Pc(1245) int local1245;
						@Pc(1204) Class3_Sub20 local1204;
						if (local26.anInt7008 == 0) {
							if (Static628.anInt9691 == local26.anInt7042 && Static153.aClass22_4.method9332()) {
								Static153.aClass22_4.method9352(local127, local133, local26.anInt7015, local26.anInt7045);
							}
							method4024(local354, local127 - local26.anInt6982, arg2, local362, local26.anInt6973, local222, arg6, local133 - local26.lb, local228, local79);
							if (local26.aClass270Array2 != null) {
								method4024(local354, local127 - local26.anInt6982, local26.aClass270Array2, local362, local26.anInt6973, local222, arg6, local133 - local26.lb, local228, local79);
							}
							local1204 = (Class3_Sub20) Static432.aClass313_34.method7104((long) local26.anInt6973);
							if (local1204 != null) {
								Static437.method5769(local222, local1204.anInt2493, local79, local228, local133, local362, local354, local127);
							}
							if (local26.anInt7042 == Static628.anInt9691) {
								if (Static153.aClass22_4.method9332()) {
									Static153.aClass22_4.method9396();
								}
								if (Static103.anInt2245 == 3) {
									local314 = Static600.anInt9097;
									local740 = Static42.anInt1244;
									local1245 = Static332.anInt5345;
									local773 = Static191.anInt3283;
									if (Static716.anInt11157 < Static1.anInt11166) {
										@Pc(1265) float local1265 = (float) (Static716.anInt11157 - Static27.anInt1055) / (float) (Static1.anInt11166 - Static27.anInt1055);
										local1245 = (int) (local1265 * (float) Static332.anInt5345 + (float) Static499.anInt7942 * (1.0F - local1265));
										local740 = (int) ((1.0F - local1265) * (float) Static526.anInt8219 + (float) Static42.anInt1244 * local1265);
										local314 = (int) ((float) Static109.anInt2312 * (1.0F - local1265) + (float) Static600.anInt9097 * local1265);
										local773 = (int) ((float) Static336.anInt5402 * (1.0F - local1265) + local1265 * (float) Static191.anInt3283);
									}
									if (local314 > 0) {
										Static153.aClass22_4.method9378(local228, local222, local1245 << 8 | local740 << 16 | local314 << 24 | local773, local362 - local228, -local222 + local354);
									}
								}
							}
							Static153.aClass22_4.KA(arg5, arg8, arg0, arg3);
						}
						if (Static452.aBooleanArray17[local79] || Static262.anInt4080 > 1) {
							if (local26.anInt7008 == 3) {
								if (local148 == 0) {
									if (local26.aBoolean473) {
										Static153.aClass22_4.aa(local127, local133, local26.anInt7015, local26.anInt7045, local26.anInt6972, 0);
									} else {
										Static153.aClass22_4.method9403(local127, local133, local26.anInt7015, local26.anInt7045, local26.anInt6972, 0);
									}
								} else if (local26.aBoolean473) {
									Static153.aClass22_4.aa(local127, local133, local26.anInt7015, local26.anInt7045, 255 - (local148 & 0xFF) << 24 | local26.anInt6972 & 0xFFFFFF, 1);
								} else {
									Static153.aClass22_4.method9403(local127, local133, local26.anInt7015, local26.anInt7045, local26.anInt6972 & 0xFFFFFF | 255 - (local148 & 0xFF) << 24, 1);
								}
								if (Static347.aBoolean360) {
									if (arg6) {
										Static218.method3251(local74, local55, local67, local60);
									} else {
										Static476.method6482(local74, local67, local55, local60);
									}
								}
							} else {
								@Pc(1535) Class275 local1535;
								if (local26.anInt7008 == 4) {
									@Pc(1506) Class57 local1506 = local26.method6028(Static153.aClass22_4);
									if (local1506 != null) {
										local314 = local26.anInt6972;
										@Pc(1525) String local1525 = local26.aString89;
										if (local26.anInt7001 != -1) {
											local1535 = Static606.aClass62_2.method1887(local26.anInt7001);
											local1525 = local1535.aString94;
											if (local1525 == null) {
												local1525 = "null";
											}
											if ((local1535.anInt7250 == 1 || local26.anInt7003 != 1) && local26.anInt7003 != -1) {
												local1525 = "<col=ff9040>" + local1525 + "</col> x" + Static415.method9120(local26.anInt7003);
											}
										}
										if (local26.anInt7044 != -1) {
											local1525 = Static85.method1861(local26.anInt7044);
											if (local1525 == null) {
												local1525 = "";
											}
										}
										if (Static710.aClass270_11 == local26) {
											local1525 = Static430.aClass257_30.method5699(Static456.anInt7118);
											local314 = local26.anInt6972;
										}
										if (Static517.aBoolean546) {
											Static153.aClass22_4.T(local127, local133, local26.anInt7015 + local127, local26.anInt7045 + local133);
										}
										local1506.method9138(local26.anInt6963, local133, local127, local26.anInt7045, (int[]) null, 0, 0, local26.anInt7034, local26.aBoolean469 ? 255 - (local148 & 0xFF) << 24 : -1, Static212.aClass178Array8, local1525, (Class1) null, local26.anInt7015, 255 - (local148 & 0xFF) << 24 | local314, local26.anInt6959, local26.anInt6971);
										if (Static517.aBoolean546) {
											Static153.aClass22_4.KA(arg5, arg8, arg0, arg3);
										}
										if (local1525.trim().length() > 0) {
											if (!Static517.aBoolean546) {
												@Pc(1723) Class169 local1723 = Static279.method3944(local26.anInt6987, Static153.aClass22_4);
												local773 = local1723.method3652(local26.anInt7015, Static212.aClass178Array8, local1525);
												local775 = local1723.method3651(local26.anInt7034, Static212.aClass178Array8, local26.anInt7015, local1525);
												if (Static347.aBoolean360) {
													if (arg6) {
														Static218.method3251(local133 + local775, local127, local127 + local773, local133);
													} else {
														Static476.method6482(local775 + local133, local127 + local773, local127, local133);
													}
												}
											} else if (Static347.aBoolean360) {
												if (arg6) {
													Static218.method3251(local74, local55, local67, local60);
												} else {
													Static476.method6482(local74, local67, local55, local60);
												}
											}
										}
									} else if (Static276.aBoolean283) {
										Static539.method7146(local26);
									}
								} else if (local26.anInt7008 == 5) {
									if (local26.anInt6962 < 0) {
										@Pc(1824) Class178 local1824;
										if (local26.anInt7001 != -1) {
											@Pc(1806) Class34 local1806 = local26.aBoolean478 ? Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1 : null;
											local1824 = Static606.aClass62_2.method1889(local1806, local26.anInt6968 | 0xFF000000, local26.anInt6961, Static153.aClass22_4, local26.anInt6990, local26.anInt7003, local26.anInt7001);
										} else if (local26.anInt7044 == -1) {
											local1824 = local26.method6027(Static153.aClass22_4);
										} else {
											local1824 = Static158.method2580(Static153.aClass22_4, local26.anInt7044);
										}
										if (local1824 != null) {
											local314 = local1824.method7627();
											local740 = local1824.method7632();
											local1245 = (local26.anInt6972 == 0 ? 16777215 : local26.anInt6972 & 0xFFFFFF) | 255 - (local148 & 0xFF) << 24;
											if (local26.aBoolean471) {
												Static153.aClass22_4.T(local127, local133, local127 + local26.anInt7015, local133 - -local26.anInt7045);
												if (local26.anInt6966 != 0) {
													local773 = (local26.anInt7015 + local314 - 1) / local314;
													local775 = (local26.anInt7045 + local740 - 1) / local740;
													for (local786 = 0; local786 < local773; local786++) {
														for (local930 = 0; local930 < local775; local930++) {
															if (local26.anInt6972 == 0) {
																local1824.method7619((float) (local314 * local786 + local127) + (float) local314 / 2.0F, (float) (local133 - -(local740 * local930)) + (float) local740 / 2.0F, 4096, local26.anInt6966);
															} else {
																local1824.method7634((float) local314 / 2.0F + (float) (local314 * local786 + local127), (float) local740 / 2.0F + (float) (local133 + local930 * local740), 4096, local26.anInt6966, local1245);
															}
														}
													}
												} else if (local26.anInt6972 == 0 && local148 == 0) {
													local1824.method7621(local127, local133, local26.anInt7015, local26.anInt7045);
												} else {
													local1824.method7629(local127, local133, local26.anInt7015, local26.anInt7045, 0, local1245, 1);
												}
												Static153.aClass22_4.KA(arg5, arg8, arg0, arg3);
											} else if (local26.anInt6972 == 0 && local148 == 0) {
												if (local26.anInt6966 != 0) {
													local1824.method7619((float) local26.anInt7015 / 2.0F + (float) local127, (float) local26.anInt7045 / 2.0F + (float) local133, local26.anInt7015 * 4096 / local314, local26.anInt6966);
												} else if (local314 == local26.anInt7015 && local740 == local26.anInt7045) {
													local1824.method7637(local127, local133);
												} else {
													local1824.method7613(local127, local133, local26.anInt7015, local26.anInt7045);
												}
											} else if (local26.anInt6966 != 0) {
												local1824.method7634((float) local127 + (float) local26.anInt7015 / 2.0F, (float) local133 + (float) local26.anInt7045 / 2.0F, local26.anInt7015 * 4096 / local314, local26.anInt6966, local1245);
											} else if (local314 == local26.anInt7015 && local26.anInt7045 == local740) {
												local1824.method7616(local127, local133, 0, local1245, 1);
											} else {
												local1824.method7630(local127, local133, local26.anInt7015, local26.anInt7045, 0, local1245, 1);
											}
										} else if (Static276.aBoolean283) {
											Static539.method7146(local26);
										}
									} else {
										local26.method6026(Class3_Sub33_Sub3.lb, Static499.aClass297_1).method4695(local26.anInt7015, local26.anInt7023 << 3, local127, local26.anInt7045, local133, local26.anInt6965 << 3, Static153.aClass22_4);
									}
									if (Static347.aBoolean360) {
										if (arg6) {
											Static218.method3251(local74, local55, local67, local60);
										} else {
											Static476.method6482(local74, local67, local55, local60);
										}
									}
								} else if (local26.anInt7008 == 6) {
									Static31.method1034();
									local1204 = null;
									@Pc(2296) Class170 local2296 = null;
									local740 = 0;
									if (local26.anInt7001 != -1) {
										local1535 = Static606.aClass62_2.method1887(local26.anInt7001);
										if (local1535 != null) {
											local1535 = local1535.method6282(local26.anInt7003);
											local2296 = local1535.method6287(1, 2048, Static153.aClass22_4, local26.aBoolean478 ? Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1 : null, local26.aClass45_8);
											if (local2296 == null) {
												Static539.method7146(local26);
											} else {
												local740 = -local2296.fa() >> 1;
											}
										}
									} else if (local26.anInt7027 == 5) {
										local1245 = local26.anInt7007;
										if (local1245 >= 0 && local1245 < 2048) {
											@Pc(2442) Class9_Sub1_Sub1_Sub2_Sub1 local2442 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local1245];
											if (local2442 != null && (local1245 == Static574.anInt8718 || Static411.method5499(120, local2442.aString4) == local26.anInt6977)) {
												local2296 = local2442.aClass34_1.method1154(Static288.aClass97_1, Static255.aClass14_1, Static592.aClass155_2, Static606.aClass62_2, local26.aClass45_8, (int[]) null, (Class45) null, Static661.aClass73_1, (Class45[]) null, Static153.aClass22_4, 0, 2048, Static257.aClass124_2, Static380.aClass127_1);
											}
										}
									} else if (local26.anInt7027 == 8 || local26.anInt7027 == 9) {
										@Pc(2395) Class3_Sub38 local2395 = Static14.method503(false, local26.anInt7007);
										if (local2395 != null) {
											local2296 = local2395.method5053(local26.aClass45_8, local26.anInt7027 == 9, Static153.aClass22_4, local26.anInt6977, local26.aBoolean478 ? Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1 : null);
										}
									} else if (local26.aClass45_8 != null && local26.aClass45_8.method6572()) {
										local2296 = local26.method6008(Static592.aClass155_2, Static255.aClass14_1, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1, Static606.aClass62_2, Static380.aClass127_1, Static661.aClass73_1, local26.aClass45_8, Static153.aClass22_4, Static288.aClass97_1, 2048, local1204);
										if (local2296 == null && Static276.aBoolean283) {
											Static539.method7146(local26);
										}
									} else {
										local2296 = local26.method6008(Static592.aClass155_2, Static255.aClass14_1, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1, Static606.aClass62_2, Static380.aClass127_1, Static661.aClass73_1, (Class45) null, Static153.aClass22_4, Static288.aClass97_1, 2048, local1204);
										if (local2296 == null && Static276.aBoolean283) {
											Static539.method7146(local26);
										}
									}
									if (local2296 != null) {
										if (local26.anInt7016 <= 0) {
											local1245 = 512;
										} else {
											local1245 = (local26.anInt7015 << 9) / local26.anInt7016;
										}
										if (local26.anInt7032 <= 0) {
											local773 = 512;
										} else {
											local773 = (local26.anInt7045 << 9) / local26.anInt7032;
										}
										local775 = local127 + local26.anInt7015 / 2;
										local786 = local26.anInt7045 / 2 + local133;
										if (!local26.aBoolean479) {
											local775 += local1245 * local26.anInt7024 >> 9;
											local786 += local26.anInt6998 * local773 >> 9;
										}
										Static158.aClass58_1.method9508();
										Static153.aClass22_4.method9405(Static158.aClass58_1);
										Static153.aClass22_4.DA(local775, local786, local1245, local773);
										Static153.aClass22_4.ya();
										if (local26.aBoolean466) {
											Static153.aClass22_4.C(false);
										}
										if (local26.aBoolean479) {
											Static598.aClass58_9.method9510(local26.anInt6989);
											Static598.aClass58_9.method9521(local26.anInt6993);
											Static598.aClass58_9.method9517(local26.anInt7046);
											Static598.aClass58_9.method9509(local26.anInt7024, local26.anInt6998, local26.anInt7035);
										} else {
											local930 = (local26.anInt7004 << 2) * Class3_Sub7_Sub17_Sub1.anIntArray549[local26.anInt6989 << 3] >> 14;
											local932 = (local26.anInt7004 << 2) * Class3_Sub7_Sub17_Sub1.anIntArray548[local26.anInt6989 << 3] >> 14;
											Static598.aClass58_9.method9513(-local26.anInt7046 << 3);
											Static598.aClass58_9.method9521(local26.anInt6993 << 3);
											Static598.aClass58_9.method9509(local26.anInt7009 << 2, local740 + local930 + (local26.anInt7043 << 2), (local26.anInt7043 << 2) + local932);
											Static598.aClass58_9.method9518(local26.anInt6989 << 3);
										}
										local26.method6015(Static153.aClass22_4, Static716.anInt11157, Static598.aClass58_9, local2296);
										if (Static517.aBoolean546) {
											Static153.aClass22_4.T(local127, local133, local127 + local26.anInt7015, local26.anInt7045 + local133);
										}
										if (local26.aBoolean479) {
											if (local26.aBoolean467) {
												local2296.method8350(Static598.aClass58_9, (Class9_Sub9) null, local26.anInt7004, 1);
											} else {
												local2296.method8360(Static598.aClass58_9, (Class9_Sub9) null, 1);
												if (local26.aClass9_Sub5_7 != null) {
													Static153.aClass22_4.method9384(local26.aClass9_Sub5_7.method5574());
												}
											}
										} else if (local26.aBoolean467) {
											local2296.method8350(Static598.aClass58_9, (Class9_Sub9) null, local26.anInt7004 << 2, 1);
										} else {
											local2296.method8360(Static598.aClass58_9, (Class9_Sub9) null, 1);
											if (local26.aClass9_Sub5_7 != null) {
												Static153.aClass22_4.method9384(local26.aClass9_Sub5_7.method5574());
											}
										}
										if (Static517.aBoolean546) {
											Static153.aClass22_4.KA(arg5, arg8, arg0, arg3);
										}
										if (local26.aBoolean466) {
											Static153.aClass22_4.C(true);
										}
									}
									if (Static347.aBoolean360) {
										if (arg6) {
											Static218.method3251(local74, local55, local67, local60);
										} else {
											Static476.method6482(local74, local67, local55, local60);
										}
									}
								} else if (local26.anInt7008 == 9) {
									if (local26.aBoolean476) {
										local740 = local127 + local26.anInt7015;
										local314 = local26.anInt7045 + local133;
										local1245 = local133;
									} else {
										local314 = local133;
										local740 = local26.anInt7015 + local127;
										local1245 = local26.anInt7045 + local133;
									}
									if (local26.anInt7033 == 1) {
										Static153.aClass22_4.method9404(local127, local314, local740, local1245, local26.anInt6972, 0);
									} else {
										Static153.aClass22_4.method9349(local127, local314, local740, local1245, local26.anInt6972, local26.anInt7033);
									}
									if (Static347.aBoolean360) {
										if (arg6) {
											Static218.method3251(local74, local55, local67, local60);
										} else {
											Static476.method6482(local74, local67, local55, local60);
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
