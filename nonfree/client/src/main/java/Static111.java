import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	public static int anInt2079;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	public static int anInt2077 = 0;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_54 = new Class103();

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "Z")
	public static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "[I")
	public static final int[] anIntArray206 = new int[3];

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)V")
	public static void method1962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static134.anIntArray205[arg0] = arg1;
		@Pc(19) Class5_Sub28 local19 = (Class5_Sub28) Static276.aClass190_30.method5466((long) arg0);
		if (local19 == null) {
			local19 = new Class5_Sub28(Static340.method5863() + 500L);
			Static276.aClass190_30.method5464(local19, (long) arg0);
		} else {
			local19.aLong159 = Static340.method5863() + 500L;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!gg;III)V")
	public static void method1963(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static308.anIntArrayArrayArray9[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt5456 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass5_Sub9_Sub1Array3[arg0.anInt5456++] = Static182.aClass5_Sub9_Sub1Array2[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt5456; local19 < 4; local19++) {
			arg0.aClass5_Sub9_Sub1Array3[local19] = null;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIIII[Lclient!vg;I)V")
	public static void method1964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class201[] arg7, @OriginalArg(9) int arg8) {
		Static236.aClass55_9.method5258(arg2, arg6, arg0, arg8);
		for (@Pc(13) int local13 = 0; local13 < arg7.length; local13++) {
			@Pc(19) Class201 local19 = arg7[local13];
			if (local19 != null && (arg4 == local19.anInt6491 || arg4 == -1412584499 && Static204.aClass201_8 == local19)) {
				@Pc(60) int local60;
				if (arg1 == -1) {
					Class4_Sub3_Sub2.aRectangleArray2[Static66.anInt5818].setBounds(arg3 + local19.anInt6554, local19.anInt6516 + arg5, local19.anInt6505, local19.anInt6510);
					local60 = Static66.anInt5818++;
				} else {
					local60 = arg1;
				}
				local19.anInt6501 = local60;
				local19.anInt6518 = Static283.anInt5563;
				if (!Static45.method710(local19)) {
					if (local19.anInt6555 > 0) {
						Static181.method3304(local19);
					}
					@Pc(88) int local88 = local19.anInt6554 + arg3;
					@Pc(94) int local94 = local19.anInt6516 + arg5;
					@Pc(97) int local97 = local19.anInt6487;
					if (Static346.aBoolean577 && (Static45.method707(local19).anInt6436 != 0 || local19.anInt6559 == 0) && local97 > 127) {
						local97 = 127;
					}
					@Pc(142) int local142;
					@Pc(146) int local146;
					if (local19 == Static204.aClass201_8) {
						if (arg4 != -1412584499 && !local19.aBoolean559) {
							Static338.aClass201Array124 = arg7;
							Static252.anInt4998 = arg3;
							Static237.anInt4728 = arg5;
							continue;
						}
						if (Static303.aBoolean489 && Static205.aBoolean336) {
							local142 = Static316.aClass118_3.method4054();
							local146 = Static316.aClass118_3.method4050();
							local142 -= Static95.anInt1816;
							local146 -= Static139.anInt2691;
							if (local142 < Static331.anInt6418) {
								local142 = Static331.anInt6418;
							}
							if (Static342.aClass201_13.anInt6505 + Static331.anInt6418 < local142 + local19.anInt6505) {
								local142 = Static342.aClass201_13.anInt6505 + Static331.anInt6418 - local19.anInt6505;
							}
							if (local146 < Static150.anInt2941) {
								local146 = Static150.anInt2941;
							}
							local88 = local142;
							if (local19.anInt6510 + local146 > Static150.anInt2941 - -Static342.aClass201_13.anInt6510) {
								local146 = Static342.aClass201_13.anInt6510 + Static150.anInt2941 - local19.anInt6510;
							}
							local94 = local146;
						}
						if (!local19.aBoolean559) {
							local97 = 128;
						}
					}
					@Pc(224) int local224;
					@Pc(230) int local230;
					@Pc(238) int local238;
					@Pc(243) int local243;
					if (local19.anInt6559 == 2) {
						local224 = arg0;
						local142 = arg2;
						local146 = arg6;
						local230 = arg8;
					} else {
						local238 = local88 + local19.anInt6505;
						local243 = local19.anInt6510 + local94;
						local146 = arg6 >= local94 ? arg6 : local94;
						local142 = arg2 >= local88 ? arg2 : local88;
						if (local19.anInt6559 == 9) {
							local238++;
							local243++;
						}
						local230 = local243 >= arg8 ? arg8 : local243;
						local224 = local238 >= arg0 ? arg0 : local238;
					}
					if (local142 < local224 && local230 > local146) {
						@Pc(523) int local523;
						@Pc(549) int local549;
						@Pc(551) int local551;
						@Pc(492) int local492;
						@Pc(494) int local494;
						if (local19.anInt6555 != 0) {
							if (local19.anInt6555 == 1337 || local19.anInt6555 == 1403) {
								Static19.method355(local94, local19.anInt6505, local88, local19.anInt6555 == 1403, local19.anInt6510);
								Static287.aBooleanArray23[local60] = true;
								Static236.aClass55_9.method5258(arg2, arg6, arg0, arg8);
								continue;
							}
							if (local19.anInt6555 == 1338) {
								if (local19.method5811(Static236.aClass55_9) != null) {
									Static315.method5535();
									Static250.method4436(local94, local19, Static236.aClass55_9, local88);
									Static133.aBooleanArray10[local60] = true;
									Static236.aClass55_9.method5258(arg2, arg6, arg0, arg8);
								}
								continue;
							}
							if (local19.anInt6555 == 1339) {
								if (local19.method5811(Static236.aClass55_9) != null) {
									Static283.method4926(local19, local88, local94);
									Static133.aBooleanArray10[local60] = true;
									Static236.aClass55_9.method5258(arg2, arg6, arg0, arg8);
								}
								continue;
							}
							if (local19.anInt6555 == 1400) {
								Static234.method4161(local19.anInt6505, local94, Static236.aClass55_9, local88, Static182.anInterface3_3, local19.anInt6510);
								Static287.aBooleanArray23[local60] = true;
								Static236.aClass55_9.method5258(arg2, arg6, arg0, arg8);
								continue;
							}
							if (local19.anInt6555 == 1401) {
								Static103.method4838(local94, Static236.aClass55_9, local19.anInt6505, local19.anInt6510, local88);
								Static287.aBooleanArray23[local60] = true;
								Static236.aClass55_9.method5258(arg2, arg6, arg0, arg8);
								continue;
							}
							if (local19.anInt6555 == 1405) {
								if (!Static320.aBoolean515 && !Static73.aBoolean95) {
									continue;
								}
								local238 = local19.anInt6505 + local88;
								local243 = local94 + 15;
								if (Static320.aBoolean515) {
									Static204.aClass18_3.method4184(local243, "Fps:" + Static205.anInt4080, local238, -256);
									local243 += 15;
									@Pc(483) Runtime local483 = Runtime.getRuntime();
									local492 = (int) ((local483.totalMemory() - local483.freeMemory()) / 1024L);
									local494 = -256;
									if (local492 > 65536) {
										local494 = -65536;
									}
									Static204.aClass18_3.method4184(local243, "Mem:" + local492 + "k", local238, local494);
									local243 += 15;
									local523 = Static236.aClass55_9.method5196() / 1024;
									Static204.aClass18_3.method4184(local243, "Offheap:" + local523 + "k", local238, local523 <= 65536 ? -256 : -65536);
									local243 += 15;
									local549 = 0;
									local551 = 0;
									@Pc(553) int local553 = 0;
									for (@Pc(555) int local555 = 0; local555 < 29; local555++) {
										local549 += Static157.aClass82_Sub1Array1[local555].method1934();
										local551 += Static157.aClass82_Sub1Array1[local555].method1937();
										local553 += Static157.aClass82_Sub1Array1[local555].method1931();
									}
									@Pc(591) int local591 = local553 * 100 / local549;
									@Pc(597) int local597 = local551 * 10000 / local549;
									@Pc(617) String local617 = "Cache:" + Static272.method4783(true, (long) local597, 0, 2) + "% (" + local591 + "%)";
									Static355.aClass18_4.method4184(local243, local617, local238, -256);
									local243 += 12;
								}
								if (Static236.anInt4221 > 0) {
									Static355.aClass18_4.method4184(local243, "Particles: " + Static315.anInt6170 + " / " + Static236.anInt4221, local238, -256);
								}
								local243 += 12;
								if (Static73.aBoolean95) {
									Static355.aClass18_4.method4184(local243, "Polys: " + Static236.aClass55_9.method5242() + " Models: " + Static236.aClass55_9.method5222(), local238, -256);
									local243 += 12;
									Static355.aClass18_4.method4184(local243, "Ls: " + Static183.anInt3674 + " La: " + Static299.anInt6792 + " NPC: " + Static325.anInt6278 + " Pl: " + Static308.anInt6006, local238, -256);
									Static194.method3442();
									local243 += 12;
								}
								Static287.aBooleanArray23[local60] = true;
								continue;
							}
						}
						if (local19.anInt6559 == 0) {
							if (local19.anInt6555 == 1407 && Static236.aClass55_9.method5247()) {
								Static236.aClass55_9.method5167(local88, local94, local19.anInt6505, local19.anInt6510);
							}
							method1964(local224, local60, local142, local88 - local19.anInt6558, local19.anInt6541, local94 - local19.anInt6543, local146, arg7, local230);
							if (local19.aClass201Array121 != null) {
								method1964(local224, local60, local142, local88 - local19.anInt6558, local19.anInt6541, local94 - local19.anInt6543, local146, local19.aClass201Array121, local230);
							}
							@Pc(780) Class5_Sub18 local780 = (Class5_Sub18) Static198.aClass190_21.method5466((long) local19.anInt6541);
							if (local780 != null) {
								Static232.method4187(local146, local224, local780.anInt1871, local142, local60, local94, local230, local88);
							}
							if (local19.anInt6555 == 1407 && Static236.aClass55_9.method5247()) {
								Static236.aClass55_9.method5220();
								Static88.aBoolean117 = true;
							}
							Static236.aClass55_9.method5258(arg2, arg6, arg0, arg8);
						}
						if (Static34.aBooleanArray5[local60] || Static159.anInt3164 > 1) {
							if (local19.anInt6559 == 3) {
								if (local97 == 0) {
									if (local19.aBoolean552) {
										Static236.aClass55_9.method5205(local88, local94, local19.anInt6505, local19.anInt6510, local19.anInt6488, 0);
									} else {
										Static236.aClass55_9.method5204(local88, local94, local19.anInt6505, local19.anInt6510, local19.anInt6488, 0);
									}
								} else if (local19.aBoolean552) {
									Static236.aClass55_9.method5205(local88, local94, local19.anInt6505, local19.anInt6510, 255 - (local97 & 0xFF) << 24 | local19.anInt6488 & 0xFFFFFF, 1);
								} else {
									Static236.aClass55_9.method5204(local88, local94, local19.anInt6505, local19.anInt6510, local19.anInt6488 & 0xFFFFFF | 255 - (local97 & 0xFF) << 24, 1);
								}
							} else if (local19.anInt6559 == 4) {
								@Pc(921) Class18 local921 = local19.method5802(Static236.aClass55_9);
								if (local921 != null) {
									local243 = local19.anInt6488;
									@Pc(936) String local936 = local19.aString60;
									if (local19.anInt6509 != -1) {
										@Pc(945) Class130 local945 = Static322.method544(local19.anInt6509);
										local936 = local945.aString26;
										if (local936 == null) {
											local936 = "null";
										}
										if ((local945.anInt3841 == 1 || local19.anInt6499 != 1) && local19.anInt6499 != -1) {
											local936 = "<col=ff9040>" + local936 + "</col> x" + Static346.method5931(local19.anInt6499);
										}
									}
									if (Static208.aClass201_9 == local19) {
										local936 = Static204.aClass85_93.method2020(Static41.anInt726);
										local243 = local19.anInt6488;
									}
									if (Static166.aBoolean259) {
										Static236.aClass55_9.method5162(local88, local94, local88 + local19.anInt6505, local19.anInt6510 + local94);
									}
									local921.method4178(local19.aBoolean553 ? -16777216 : -1, local19.anInt6542, local936, local243 | 0xFF000000, local19.anInt6546, local19.anInt6510, local19.anInt6544, null, local88, null, Static132.aClass95Array9, local94, 0, 0, local19.anInt6505);
									if (Static166.aBoolean259) {
										Static236.aClass55_9.method5258(arg2, arg6, arg0, arg8);
									}
								} else if (Static80.aBoolean104) {
									Static189.method3383(local19);
								}
							} else {
								@Pc(1138) int local1138;
								if (local19.anInt6559 == 5) {
									if (local19.anInt6551 >= 0) {
										local19.method5808().method5010(local19.anInt6510, local19.anInt6520 << 3, local94, 0, local19.anInt6492 << 3, 0, Static236.aClass55_9, local19.anInt6505, local88);
									} else {
										@Pc(1096) Class95 local1096;
										if (local19.anInt6509 == -1) {
											local1096 = local19.method5804(Static236.aClass55_9);
										} else {
											@Pc(1106) Class31 local1106 = local19.aBoolean562 ? Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2 : null;
											local1096 = Static194.method3452(local19.anInt6535 | 0xFF000000, Static236.aClass55_9, local1106, local19.anInt6509, local19.anInt6537, local19.anInt6536, local19.anInt6499);
										}
										if (local1096 != null) {
											local243 = local1096.method5507();
											local1138 = local1096.method5494();
											if (local19.aBoolean554) {
												Static236.aClass55_9.method5162(local88, local94, local19.anInt6505 + local88, local19.anInt6510 + local94);
												if (local19.anInt6502 != 0) {
													local492 = (local243 + local19.anInt6505 - 1) / local243;
													local494 = (local19.anInt6510 + local1138 - 1) / local1138;
													for (local523 = 0; local523 < local492; local523++) {
														for (local549 = 0; local549 < local494; local549++) {
															local1096.method5505((float) local243 / 2.0F + (float) (local523 * local243 + local88), (float) (local549 * local1138 + local94) + (float) local1138 / 2.0F, 4096, local19.anInt6502);
														}
													}
												} else if (local97 == 0) {
													local1096.method5502(local88, local94, local19.anInt6505, local19.anInt6510, 0, 0);
												} else {
													local1096.method5502(local88, local94, local19.anInt6505, local19.anInt6510, 1, 255 - (local97 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static236.aClass55_9.method5258(arg2, arg6, arg0, arg8);
											} else if (local97 != 0) {
												local492 = 255 - (local97 & 0xFF) << 24 | 0xFFFFFF;
												if (local19.anInt6502 != 0) {
													local1096.method5504((float) local88 + (float) local19.anInt6505 / 2.0F, (float) local19.anInt6510 / 2.0F + (float) local94, local19.anInt6505 * 4096 / local243, local19.anInt6502, local492);
												} else if (local19.anInt6505 == local243 && local19.anInt6510 == local1138) {
													local1096.method5492(local88, local94, 1, local492);
												} else {
													local1096.method5493(local88, local94, local19.anInt6505, local19.anInt6510, 1, local492, 1);
												}
											} else if (local19.anInt6502 != 0) {
												local1096.method5505((float) local19.anInt6505 / 2.0F + (float) local88, (float) local19.anInt6510 / 2.0F + (float) local94, local19.anInt6505 * 4096 / local243, local19.anInt6502);
											} else if (local243 == local19.anInt6505 && local1138 == local19.anInt6510) {
												local1096.method5491(local88, local94);
											} else {
												local1096.method5490(local88, local94, local19.anInt6505, local19.anInt6510);
											}
										} else if (Static80.aBoolean104) {
											Static189.method3383(local19);
										}
									}
								} else if (local19.anInt6559 == 6) {
									Static272.method4782();
									@Pc(1432) Class112 local1432 = null;
									local243 = 0;
									@Pc(1559) Class89 local1559;
									@Pc(1569) Class31 local1569;
									if (local19.anInt6509 != -1) {
										@Pc(1657) Class130 local1657 = Static322.method544(local19.anInt6509);
										if (local1657 != null) {
											local1657 = local1657.method3456(local19.anInt6499);
											local1559 = local19.anInt6526 == -1 ? null : Static162.method2849(local19.anInt6526);
											local1569 = local19.aBoolean562 ? Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2 : null;
											local1432 = local1657.method3445(1024, 1, local19.anInt6534, local1559, Static236.aClass55_9, local1569, local19.anInt6490, local19.anInt6549);
											if (local1432 == null) {
												Static189.method3383(local19);
											} else {
												local243 = -local1432.method4331() / 2;
											}
										}
									} else if (local19.anInt6556 == 5) {
										if (local19.anInt6511 == -1) {
											local1432 = Static54.aClass31_1.method591(-1, null, -1, 1024, null, 0, -1, -1, Static236.aClass55_9, 0, null);
										} else {
											local1138 = local19.anInt6511;
											@Pc(1462) Class4_Sub5_Sub2_Sub1 local1462;
											if (Static166.anInt3304 == local1138) {
												local1462 = Static192.aClass4_Sub5_Sub2_Sub1_2;
											} else {
												local1462 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local1138];
											}
											@Pc(1480) Class89 local1480 = local19.anInt6526 == -1 ? null : Static162.method2849(local19.anInt6526);
											if (local1462 != null && (local1138 == 2047 || Static190.method431(local1462.aString40) == local19.anInt6533)) {
												local1432 = local1462.aClass31_2.method591(-1, null, 0, 1024, null, local19.anInt6534, local19.anInt6549, local19.anInt6490, Static236.aClass55_9, 0, local1480);
											}
										}
									} else if (local19.anInt6556 == 8 || local19.anInt6556 == 9) {
										@Pc(1548) Class5_Sub14 local1548 = Static319.method5550(false, local19.anInt6511);
										local1559 = local19.anInt6526 == -1 ? null : Static162.method2849(local19.anInt6526);
										if (local1548 != null) {
											local1569 = local19.aBoolean562 ? Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2 : null;
											local1432 = local1548.method1464(local19.anInt6549, local1569, local19.anInt6556 == 9, local19.anInt6534, local1559, local19.anInt6490, local19.anInt6533, Static236.aClass55_9);
										}
									} else if (local19.anInt6526 == -1) {
										local1432 = local19.method5803(-1, Static236.aClass55_9, null, Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2, -1, 1024, 0);
										if (local1432 == null && Static80.aBoolean104) {
											Static189.method3383(local19);
										}
									} else {
										@Pc(1627) Class89 local1627 = Static162.method2849(local19.anInt6526);
										local1432 = local19.method5803(local19.anInt6549, Static236.aClass55_9, local1627, Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2, local19.anInt6490, 1024, local19.anInt6534);
										if (local1432 == null && Static80.aBoolean104) {
											Static189.method3383(local19);
										}
									}
									if (local1432 != null) {
										if (local19.anInt6519 > 0) {
											local1138 = (local19.anInt6505 << 9) / local19.anInt6519;
										} else {
											local1138 = 512;
										}
										if (local19.anInt6508 <= 0) {
											local492 = 512;
										} else {
											local492 = (local19.anInt6510 << 9) / local19.anInt6508;
										}
										local494 = (local1138 * local19.anInt6507 >> 9) + local88 + local19.anInt6505 / 2;
										local523 = local19.anInt6510 / 2 + local94 + (local492 * local19.anInt6540 >> 9);
										Static303.aClass66_5.method5812();
										Static236.aClass55_9.method5252(Static303.aClass66_5);
										local549 = local19.anInt6524 * Class187.anIntArray571[local19.anInt6484 << 3] >> 15;
										local551 = local19.anInt6524 * Class187.anIntArray570[local19.anInt6484 << 3] >> 15;
										Static236.aClass55_9.method5161(local494, local523, local1138, local492);
										Static236.aClass55_9.method5156((float) local19.aShort85, local19.aBoolean561 ? (float) local19.aShort86 : (float) local19.aShort86 * 1.5F);
										if (Static88.aBoolean117) {
											Static236.aClass55_9.method5186();
											Static236.aClass55_9.method5256();
											Static236.aClass55_9.method5258(arg2, arg6, arg0, arg8);
											Static88.aBoolean117 = false;
										}
										if (local19.aBoolean558) {
											Static236.aClass55_9.method5259(false);
										}
										Static301.aClass66_4.method5818(-local19.anInt6538 << 3);
										Static301.aClass66_4.method5821(local19.anInt6561 << 3);
										Static301.aClass66_4.method5825(local19.anInt6503, local19.anInt6563 + local243 + local549, local551 - -local19.anInt6563);
										Static301.aClass66_4.method5815(local19.anInt6484 << 3);
										if (Static166.aBoolean259) {
											Static236.aClass55_9.method5162(local88, local94, local19.anInt6505 + local88, local94 - -local19.anInt6510);
										}
										if (local19.aBoolean561) {
											local1432.method4323(Static301.aClass66_4, null, local19.anInt6524);
										} else {
											local1432.method4338(Static301.aClass66_4, null, 1);
										}
										if (Static166.aBoolean259) {
											Static236.aClass55_9.method5258(arg2, arg6, arg0, arg8);
										}
										if (local19.aBoolean558) {
											Static236.aClass55_9.method5259(true);
										}
									}
								} else if (local19.anInt6559 == 9) {
									if (local19.aBoolean565) {
										local243 = local94 + local19.anInt6510;
										local492 = local94;
										local1138 = local19.anInt6505 + local88;
									} else {
										local492 = local94 + local19.anInt6510;
										local243 = local94;
										local1138 = local88 + local19.anInt6505;
									}
									if (local19.anInt6504 == 1) {
										Static236.aClass55_9.method5216(local88, local243, local1138, local492, local19.anInt6488, 0);
									} else {
										Static236.aClass55_9.method5219(local88, local243, local1138, local492, local19.anInt6488, local19.anInt6504);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V")
	public static void method1966() {
		Static99.aClass109_22.method2858();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)Lclient!p;")
	public static Class156 method1967(@OriginalArg(1) int arg0) {
		@Pc(10) Class109 local10 = Static110.aClass109_25;
		@Pc(19) Class156 local19;
		synchronized (Static110.aClass109_25) {
			local19 = (Class156) Static110.aClass109_25.method2857((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(41) byte[] local41 = Static70.aClass93_26.method2410(Static352.method5979(arg0), Static162.method2856(arg0));
		local19 = new Class156();
		local19.lb = arg0;
		if (local41 != null) {
			local19.method4220(new Class5_Sub12(local41));
		}
		local19.method4237();
		if (local19.aBoolean387) {
			local19.aBoolean391 = false;
			local19.anInt4779 = 0;
		}
		if (!Static194.aBoolean299 && local19.aBoolean384) {
			local19.anIntArray436 = null;
			local19.aStringArray50 = null;
		}
		@Pc(82) Class109 local82 = Static110.aClass109_25;
		synchronized (Static110.aClass109_25) {
			Static110.aClass109_25.method2855((long) arg0, local19);
			return local19;
		}
	}
}
