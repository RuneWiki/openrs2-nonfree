import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!me", name = "A", descriptor = "I")
	public static int anInt6031;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_51 = new Class236(80, 4);

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public static void method5009(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub2_Sub7 local12 = Static144.method2728(arg0, 6);
		local12.method1324();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
	public static void method5010() {
		if (Static34.anInt869 > 1) {
			Static34.anInt869--;
			Static51.anInt1105 = Static356.anInt6716;
		}
		if (Static233.aBoolean269) {
			Static233.aBoolean269 = false;
			Static493.method6846();
			return;
		}
		if (!Static218.aBoolean250) {
			Static390.method7043();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static487.method6758(); local27++) {
		}
		if (Static389.anInt7024 != 9) {
			return;
		}
		Static152.method2797(Static164.aClass5_Sub3_Sub1_2, Static234.aClass236_45.method5694());
		if (Static485.aClass5_Sub38_2 == null) {
			if (Static287.aLong157 <= Static105.method2132()) {
				Static485.aClass5_Sub38_2 = Static187.aClass201_1.method5073(Static212.aClass43_2.aString27);
			}
		} else if (Static485.aClass5_Sub38_2.anInt6970 != -1) {
			Static415.method5995(Static41.aClass236_5);
			Static164.aClass5_Sub3_Sub1_2.method4181(Static485.aClass5_Sub38_2.anInt6970);
			Static485.aClass5_Sub38_2 = null;
			Static287.aLong157 = Static105.method2132() + 30000L;
		}
		@Pc(101) Class5_Sub42 local101 = (Class5_Sub42) Static483.aClass99_76.method2526();
		@Pc(144) int local144;
		@Pc(161) int local161;
		@Pc(210) int local210;
		@Pc(217) int local217;
		@Pc(228) int local228;
		if (local101 != null || Static307.aLong171 < Static105.method2132() - 2000L) {
			@Pc(116) boolean local116 = false;
			@Pc(119) int local119 = Static164.aClass5_Sub3_Sub1_2.anInt4960;
			for (@Pc(124) Class5_Sub42 local124 = (Class5_Sub42) Static7.aClass99_2.method2526(); local124 != null && Static164.aClass5_Sub3_Sub1_2.anInt4960 - local119 < 240; local124 = (Class5_Sub42) Static7.aClass99_2.method2519()) {
				local124.method7425();
				local144 = local124.method7432();
				if (local144 < -1) {
					local144 = -1;
				} else if (local144 > 65534) {
					local144 = 65534;
				}
				local161 = local124.method7433();
				if (local161 < -1) {
					local161 = -1;
				} else if (local161 > 65534) {
					local161 = 65534;
				}
				if (Static270.anInt5290 != local161 || local144 != Static392.anInt7043) {
					if (!local116) {
						Static415.method5995(Static488.aClass236_54);
						Static164.aClass5_Sub3_Sub1_2.method4192(0);
						local119 = Static164.aClass5_Sub3_Sub1_2.anInt4960;
						local116 = true;
					}
					local210 = local161 - Static270.anInt5290;
					Static270.anInt5290 = local161;
					local217 = local144 - Static392.anInt7043;
					Static392.anInt7043 = local144;
					local228 = (int) ((local124.method7430() - Static307.aLong171) / 20L);
					if (local228 < 8 && local210 >= -32 && local210 <= 31 && local217 >= -32 && local217 <= 31) {
						local217 += 32;
						local210 += 32;
						Static164.aClass5_Sub3_Sub1_2.method4181(local217 + (local210 << 6) + (local228 << 12));
					} else if (local228 < 32 && local210 >= -128 && local210 <= 127 && local217 >= -128 && local217 <= 127) {
						local217 += 128;
						local210 += 128;
						Static164.aClass5_Sub3_Sub1_2.method4192(local228 + 128);
						Static164.aClass5_Sub3_Sub1_2.method4181((local210 << 8) + local217);
					} else if (local228 < 32) {
						Static164.aClass5_Sub3_Sub1_2.method4192(local228 + 192);
						if (local161 == 1 || local144 == -1) {
							Static164.aClass5_Sub3_Sub1_2.method4184(Integer.MIN_VALUE);
						} else {
							Static164.aClass5_Sub3_Sub1_2.method4184(local144 << 16 | local161);
						}
					} else {
						Static164.aClass5_Sub3_Sub1_2.method4181(local228 + 57344);
						if (local161 == 1 || local144 == -1) {
							Static164.aClass5_Sub3_Sub1_2.method4184(Integer.MIN_VALUE);
						} else {
							Static164.aClass5_Sub3_Sub1_2.method4184(local144 << 16 | local161);
						}
					}
					Static307.aLong171 = local124.method7430();
				}
			}
			if (local116) {
				Static164.aClass5_Sub3_Sub1_2.method4170(Static164.aClass5_Sub3_Sub1_2.anInt4960 - local119);
			}
		}
		@Pc(414) int local414;
		if (local101 != null) {
			@Pc(400) long local400 = (local101.method7430() - Static248.aLong160) / 50L;
			Static248.aLong160 = local101.method7430();
			if (local400 > 32767L) {
				local400 = 32767L;
			}
			local414 = local101.method7432();
			if (local414 < 0) {
				local414 = 0;
			} else if (local414 > 65535) {
				local414 = 65535;
			}
			local144 = local101.method7433();
			if (local144 < 0) {
				local144 = 0;
			} else if (local144 > 65535) {
				local144 = 65535;
			}
			@Pc(452) byte local452 = 0;
			if (local101.method7431() == 2) {
				local452 = 1;
			}
			Static415.method5995(Static111.aClass236_21);
			local210 = (int) local400;
			Static164.aClass5_Sub3_Sub1_2.method4181(local210 | local452 << 15);
			Static164.aClass5_Sub3_Sub1_2.method4221(local414 << 16 | local144);
		}
		@Pc(504) int local504;
		if (Static170.anInt3419 > 0) {
			Static415.method5995(Static494.aClass236_87);
			Static164.aClass5_Sub3_Sub1_2.method4192(Static170.anInt3419 * 3);
			for (local504 = 0; local504 < Static170.anInt3419; local504++) {
				@Pc(510) Interface1 local510 = Static456.anInterface1Array2[local504];
				@Pc(520) long local520 = (local510.method5004() - Static162.aLong110) / 50L;
				if (local520 > 65535L) {
					local520 = 65535L;
				}
				Static162.aLong110 = local510.method5004();
				Static164.aClass5_Sub3_Sub1_2.method4192(local510.method5005());
				Static164.aClass5_Sub3_Sub1_2.method4181((int) local520);
			}
		}
		if (Static444.anInt7778 > 0) {
			Static444.anInt7778--;
		}
		if (Static474.aBoolean196 && Static444.anInt7778 <= 0) {
			Static444.anInt7778 = 20;
			Static474.aBoolean196 = false;
			Static415.method5995(Static315.aClass236_53);
			Static164.aClass5_Sub3_Sub1_2.method4229((int) Static535.aFloat364 >> 3);
			Static164.aClass5_Sub3_Sub1_2.method4181((int) Static476.aFloat339 >> 3);
		}
		if (Static538.aBoolean658 && !Static393.aBoolean495) {
			Static393.aBoolean495 = true;
			Static415.method5995(Static463.aClass236_79);
			Static164.aClass5_Sub3_Sub1_2.method4192(1);
		}
		if (!Static538.aBoolean658 && Static393.aBoolean495) {
			Static393.aBoolean495 = false;
			Static415.method5995(Static463.aClass236_79);
			Static164.aClass5_Sub3_Sub1_2.method4192(0);
		}
		if (!Static495.aBoolean612) {
			Static415.method5995(Static100.aClass236_18);
			Static164.aClass5_Sub3_Sub1_2.method4192(0);
			local504 = Static164.aClass5_Sub3_Sub1_2.anInt4960;
			@Pc(655) Class5_Sub3 local655 = new Class5_Sub3(Static430.method6133());
			Static300.aClass5_Sub28_Sub1_1.method4114(local655);
			Static164.aClass5_Sub3_Sub1_2.method4207(local655.anInt4960, local655.aByteArray66);
			Static164.aClass5_Sub3_Sub1_2.method4170(Static164.aClass5_Sub3_Sub1_2.anInt4960 - local504);
			Static495.aBoolean612 = true;
		}
		if (Static152.aClass37ArrayArrayArray1 != null) {
			if (Static166.anInt3343 == 2) {
				Static322.method5171();
			} else if (Static166.anInt3343 == 3) {
				Static317.method5104();
			}
		}
		if (Static287.aBoolean405) {
			Static287.aBoolean405 = false;
		} else {
			Static124.aFloat137 /= 2.0F;
		}
		if (Static354.aBoolean473) {
			Static354.aBoolean473 = false;
		} else {
			Static19.aFloat319 /= 2.0F;
		}
		Static466.method6497();
		if (Static389.anInt7024 != 9) {
			return;
		}
		Static167.method2981();
		Static141.method2630();
		Static304.method4996();
		Static419.method6030();
		Static385.anInt7006++;
		if (Static385.anInt7006 > 750) {
			Static493.method6846();
			return;
		}
		Static107.method2148();
		Static292.method4884();
		Static3.method206();
		for (local504 = Static540.aClass242_1.method5721(true); local504 != -1; local504 = Static540.aClass242_1.method5721(false)) {
			Static138.method2578(local504);
			Static496.anIntArray660[Static352.anInt6563++ & 0x1F] = local504;
		}
		@Pc(838) Class220 local838;
		for (@Pc(782) Class5_Sub2_Sub7 local782 = Static486.method6736(); local782 != null; local782 = Static486.method6736()) {
			local414 = local782.method1321();
			local144 = local782.method1325();
			if (local414 == 1) {
				Static481.anIntArray650[local144] = local782.anInt1437;
				Static218.aBoolean249 |= Static466.aBooleanArray34[local144];
				Static243.anIntArray310[Static106.anInt2320++ & 0x1F] = local144;
			} else if (local414 == 2) {
				Static37.aStringArray11[local144] = local782.aString28;
				Static78.anIntArray172[Static539.anInt9044++ & 0x1F] = local144;
			} else if (local414 == 3) {
				local838 = Static352.method5447(local144);
				if (!local782.aString28.equals(local838.aString65)) {
					local838.aString65 = local782.aString28;
					Static377.method5650(local838);
				}
			} else if (local414 == 4) {
				local838 = Static352.method5447(local144);
				local210 = local782.anInt1437;
				local217 = local782.anInt1433;
				local228 = local782.anInt1434;
				if (local838.anInt6675 != local210 || local217 != local838.anInt6612 || local838.anInt6637 != local228) {
					local838.anInt6612 = local217;
					local838.anInt6675 = local210;
					local838.anInt6637 = local228;
					Static377.method5650(local838);
				}
			} else if (local414 == 5) {
				local838 = Static352.method5447(local144);
				if (local838.anInt6643 != local782.anInt1437 || local782.anInt1437 == -1) {
					local838.anInt6649 = 0;
					local838.anInt6643 = local782.anInt1437;
					local838.anInt6604 = 1;
					local838.anInt6619 = 0;
					Static377.method5650(local838);
				}
			} else if (local414 == 6) {
				local161 = local782.anInt1437;
				local210 = local161 >> 10 & 0x1F;
				local217 = local161 >> 5 & 0x1F;
				local228 = local161 & 0x1F;
				@Pc(905) int local905 = (local210 << 19) + (local217 << 11) + (local228 << 3);
				@Pc(909) Class220 local909 = Static352.method5447(local144);
				if (local909.anInt6680 != local905) {
					local909.anInt6680 = local905;
					Static377.method5650(local909);
				}
			} else if (local414 == 7) {
				local838 = Static352.method5447(local144);
				@Pc(942) boolean local942 = local782.anInt1437 == 1;
				if (local838.aBoolean463 != local942) {
					local838.aBoolean463 = local942;
					Static377.method5650(local838);
				}
			} else if (local414 == 8) {
				local838 = Static352.method5447(local144);
				if (local782.anInt1437 != local838.anInt6683 || local782.anInt1433 != local838.anInt6617 || local782.anInt1434 != local838.anInt6650) {
					local838.anInt6617 = local782.anInt1433;
					local838.anInt6650 = local782.anInt1434;
					local838.anInt6683 = local782.anInt1437;
					if (local838.anInt6641 != -1) {
						if (local838.anInt6621 > 0) {
							local838.anInt6650 = local838.anInt6650 * 32 / local838.anInt6621;
						} else if (local838.anInt6630 > 0) {
							local838.anInt6650 = local838.anInt6650 * 32 / local838.anInt6630;
						}
					}
					Static377.method5650(local838);
				}
			} else if (local414 == 9) {
				local838 = Static352.method5447(local144);
				if (local838.anInt6641 != local782.anInt1437 || local838.anInt6664 != local782.anInt1433) {
					local838.anInt6641 = local782.anInt1437;
					local838.anInt6664 = local782.anInt1433;
					Static377.method5650(local838);
				}
			} else if (local414 == 10) {
				local838 = Static352.method5447(local144);
				if (local782.anInt1437 != local838.anInt6692 || local782.anInt1433 != local838.anInt6672 || local838.anInt6666 != local782.anInt1434) {
					local838.anInt6666 = local782.anInt1434;
					local838.anInt6692 = local782.anInt1437;
					local838.anInt6672 = local782.anInt1433;
					Static377.method5650(local838);
				}
			} else if (local414 == 11) {
				local838 = Static352.method5447(local144);
				local838.aByte65 = 0;
				local838.anInt6603 = local838.anInt6676 = local782.anInt1437;
				local838.aByte67 = 0;
				local838.anInt6631 = local838.anInt6622 = local782.anInt1433;
				Static377.method5650(local838);
			} else if (local414 == 12) {
				local838 = Static352.method5447(local144);
				local210 = local782.anInt1437;
				if (local838 != null && local838.anInt6669 == 0) {
					if (local210 > local838.anInt6670 - local838.anInt6681) {
						local210 = local838.anInt6670 - local838.anInt6681;
					}
					if (local210 < 0) {
						local210 = 0;
					}
					if (local210 != local838.anInt6609) {
						local838.anInt6609 = local210;
						Static377.method5650(local838);
					}
				}
			} else if (local414 == 14) {
				local838 = Static352.method5447(local144);
				local838.anInt6633 = local782.anInt1437;
			} else if (local414 == 15) {
				Static415.aBoolean523 = true;
				Static40.anInt919 = local782.anInt1433;
				Static384.anInt7374 = local782.anInt1437;
			} else if (local414 == 16) {
				local838 = Static352.method5447(local144);
				local838.anInt6658 = local782.anInt1437;
			}
		}
		Static168.anInt7198++;
		if (Static42.anInt967 != 0) {
			Static310.anInt6067 += 20;
			if (Static310.anInt6067 >= 400) {
				Static42.anInt967 = 0;
			}
		}
		if (Static14.aClass220_1 != null) {
			Static195.anInt3782++;
			if (Static195.anInt3782 >= 15) {
				Static377.method5650(Static14.aClass220_1);
				Static14.aClass220_1 = null;
			}
		}
		Static527.aBoolean646 = false;
		Static75.aClass220_4 = null;
		Static525.aBoolean644 = false;
		Static350.aClass220_11 = null;
		Static90.method1963(-1, -1, null);
		Static282.method4791(-1, -1, null);
		if (!Static479.aBoolean594) {
			Static92.anInt2142 = -1;
		}
		Static47.method1049();
		Static356.anInt6716++;
		if (Static11.aBoolean11) {
			Static415.method5995(Static132.aClass236_24);
			Static164.aClass5_Sub3_Sub1_2.method4221(Static250.anInt5060 << 14 | Static127.anInt2676 << 28 | Static300.anInt5968);
			Static11.aBoolean11 = false;
		}
		while (true) {
			@Pc(1424) Class5_Sub17 local1424;
			@Pc(1429) Class220 local1429;
			do {
				local1424 = (Class5_Sub17) Static443.aClass99_67.method2516();
				if (local1424 == null) {
					while (true) {
						do {
							local1424 = (Class5_Sub17) Static24.aClass99_25.method2516();
							if (local1424 == null) {
								while (true) {
									do {
										local1424 = (Class5_Sub17) Static287.aClass99_49.method2516();
										if (local1424 == null) {
											if (Static75.aClass220_4 == null) {
												Static464.anInt7969 = 0;
											}
											if (Static499.aClass220_17 != null) {
												Static108.method2155();
											}
											if (Static137.anInt1383 > 0 && Static59.aClass18_1.method5977(82) && Static59.aClass18_1.method5977(81) && Static189.anInt4752 != 0) {
												local414 = Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 - Static189.anInt4752;
												if (local414 < 0) {
													local414 = 0;
												} else if (local414 > 3) {
													local414 = 3;
												}
												Static281.method4575(Static515.anInt3214 + Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray306[0], local414, Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray307[0] + Static338.anInt6353);
											}
											Static138.method2580();
											for (local414 = 0; local414 < 5; local414++) {
												@Pc(1625) int local1625 = Static93.anIntArray185[local414]++;
											}
											if (Static218.aBoolean249 && Static115.aLong83 < Static105.method2132() - 60000L) {
												Static520.method7265();
											}
											for (@Pc(1650) Class30_Sub2_Sub2 local1650 = (Class30_Sub2_Sub2) Static66.aClass77_4.method2157(); local1650 != null; local1650 = (Class30_Sub2_Sub2) Static66.aClass77_4.method2160()) {
												if ((long) local1650.anInt5243 < Static105.method2132() / 1000L - 5L) {
													if (local1650.aShort69 > 0) {
														Static328.method5200("", 0, 5, local1650.aString54 + Static371.aClass40_106.method1063(Static194.anInt3737), "");
													}
													if (local1650.aShort69 == 0) {
														Static328.method5200("", 0, 5, local1650.aString54 + Static54.aClass40_17.method1063(Static194.anInt3737), "");
													}
													local1650.method6004();
												}
											}
											Static238.anInt4813++;
											if (Static238.anInt4813 > 500) {
												Static238.anInt4813 = 0;
												local161 = (int) (Math.random() * 8.0D);
												if ((local161 & 0x1) == 1) {
													Static393.anInt7056 += Static128.anInt2705;
												}
												if ((local161 & 0x2) == 2) {
													Static492.anInt8455 += Static430.anInt7566;
												}
												if ((local161 & 0x4) == 4) {
													Static297.anInt7034 += Static544.anInt2285;
												}
											}
											if (Static393.anInt7056 < -50) {
												Static128.anInt2705 = 2;
											}
											if (Static492.anInt8455 < -55) {
												Static430.anInt7566 = 2;
											}
											if (Static393.anInt7056 > 50) {
												Static128.anInt2705 = -2;
											}
											if (Static297.anInt7034 < -40) {
												Static544.anInt2285 = 1;
											}
											if (Static492.anInt8455 > 55) {
												Static430.anInt7566 = -2;
											}
											if (Static297.anInt7034 > 40) {
												Static544.anInt2285 = -1;
											}
											Static471.anInt8135++;
											if (Static471.anInt8135 > 500) {
												Static471.anInt8135 = 0;
												local161 = (int) (Math.random() * 8.0D);
												if ((local161 & 0x1) == 1) {
													Static352.anInt6565 += Static73.anInt1447;
												}
												if ((local161 & 0x2) == 2) {
													Static145.anInt3048 += Static430.anInt7560;
												}
											}
											if (Static352.anInt6565 < -60) {
												Static73.anInt1447 = 2;
											}
											if (Static145.anInt3048 < -20) {
												Static430.anInt7560 = 1;
											}
											if (Static352.anInt6565 > 60) {
												Static73.anInt1447 = -2;
											}
											if (Static145.anInt3048 > 10) {
												Static430.anInt7560 = -1;
											}
											Static414.anInt8913++;
											if (Static414.anInt8913 > 50) {
												Static415.method5995(Static524.aClass236_94);
											}
											if (Static360.aBoolean479) {
												Static241.method4093();
												Static360.aBoolean479 = false;
											}
											try {
												if (client.lb != null && Static164.aClass5_Sub3_Sub1_2.anInt4960 > 0) {
													Static432.anInt7587 += Static164.aClass5_Sub3_Sub1_2.anInt4960;
													client.lb.method4910(Static164.aClass5_Sub3_Sub1_2.anInt4960, Static164.aClass5_Sub3_Sub1_2.aByteArray66);
													Static164.aClass5_Sub3_Sub1_2.anInt4960 = 0;
													Static414.anInt8913 = 0;
													return;
												}
												return;
											} catch (@Pc(1908) IOException local1908) {
												Static493.method6846();
												return;
											}
										}
										local1429 = local1424.aClass220_5;
										if (local1429.anInt6674 < 0) {
											break;
										}
										local838 = Static352.method5447(local1429.anInt6605);
									} while (local838 == null || local838.aClass220Array6 == null || local1429.anInt6674 >= local838.aClass220Array6.length || local1429 != local838.aClass220Array6[local1429.anInt6674]);
									Static266.method4403(local1424);
								}
							}
							local1429 = local1424.aClass220_5;
							if (local1429.anInt6674 < 0) {
								break;
							}
							local838 = Static352.method5447(local1429.anInt6605);
						} while (local838 == null || local838.aClass220Array6 == null || local1429.anInt6674 >= local838.aClass220Array6.length || local1429 != local838.aClass220Array6[local1429.anInt6674]);
						Static266.method4403(local1424);
					}
				}
				local1429 = local1424.aClass220_5;
				if (local1429.anInt6674 < 0) {
					break;
				}
				local838 = Static352.method5447(local1429.anInt6605);
			} while (local838 == null || local838.aClass220Array6 == null || local838.aClass220Array6.length <= local1429.anInt6674 || local1429 != local838.aClass220Array6[local1429.anInt6674]);
			Static266.method4403(local1424);
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Lclient!fa;")
	public static Class94 method5011(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static245.aFloat312 == 3.0D) {
				return Static229.aClass94_5;
			}
			if ((double) Static245.aFloat312 == 4.0D) {
				return Static63.aClass94_2;
			}
			if ((double) Static245.aFloat312 == 6.0D) {
				return Static77.aClass94_6;
			}
			if ((double) Static245.aFloat312 >= 8.0D) {
				return Static313.aClass94_7;
			}
		} else if (arg0 == 1) {
			if ((double) Static245.aFloat312 == 3.0D) {
				return Static77.aClass94_6;
			}
			if ((double) Static245.aFloat312 == 4.0D) {
				return Static313.aClass94_7;
			}
			if ((double) Static245.aFloat312 == 6.0D) {
				return Static159.aClass94_4;
			}
			if ((double) Static245.aFloat312 >= 8.0D) {
				return Static503.aClass94_9;
			}
		} else if (arg0 == 2) {
			if ((double) Static245.aFloat312 == 3.0D) {
				return Static159.aClass94_4;
			}
			if ((double) Static245.aFloat312 == 4.0D) {
				return Static503.aClass94_9;
			}
			if ((double) Static245.aFloat312 == 6.0D) {
				return Static320.aClass94_8;
			}
			if ((double) Static245.aFloat312 >= 8.0D) {
				return Static37.aClass94_1;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!gp;IBI)Lclient!bea;")
	public static Class5_Sub2_Sub5 method5012(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class5_Sub3 local14 = new Class5_Sub3(arg0.method2962(arg1, arg2));
		@Pc(49) Class5_Sub2_Sub5 local49 = new Class5_Sub2_Sub5(arg1, local14.method4234(), local14.method4234(), local14.method4230(), local14.method4230(), local14.method4220() == 1, local14.method4220(), local14.method4220());
		@Pc(55) int local55 = local14.method4220();
		for (@Pc(63) int local63 = 0; local63 < local55; local63++) {
			local49.aClass99_10.method2513(new Class5_Sub30(local14.method4220(), local14.method4227(), local14.method4227(), local14.method4227(), local14.method4227(), local14.method4227(), local14.method4227(), local14.method4227(), local14.method4227()));
		}
		local49.method821();
		return local49;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!hn;B)V")
	public static void method5013(@OriginalArg(0) Class15_Sub2_Sub1 arg0) {
		arg0.anInt4738 = 0;
		@Pc(19) Class31 local19;
		if (arg0.anInt4725 != -1) {
			local19 = Static155.aClass76_2.method2152(arg0.anInt4725);
			if (local19 == null || local19.anIntArray69 == null) {
				arg0.anInt4725 = -1;
				arg0.aBoolean299 = false;
			} else {
				label394: {
					arg0.anInt4677++;
					if (local19.anIntArray69.length > arg0.anInt4682 && local19.anIntArray68[arg0.anInt4682] < arg0.anInt4677) {
						arg0.anInt4677 = 1;
						arg0.anInt4682++;
						arg0.anInt4703++;
						Static279.method4554(arg0 == Static35.aClass15_Sub2_Sub1_Sub1_1, arg0.anInt8493, arg0.anInt4682, local19, arg0.anInt8492, arg0.aByte91);
					}
					if (arg0.anInt4682 >= local19.anIntArray69.length) {
						arg0.anInt4677 = 0;
						arg0.anInt4682 = 0;
						if (arg0.aBoolean299) {
							arg0.anInt4725 = arg0.method4026().method6588();
							if (arg0.anInt4725 == -1) {
								arg0.aBoolean299 = false;
								break label394;
							}
							local19 = Static155.aClass76_2.method2152(arg0.anInt4725);
						}
						Static279.method4554(Static35.aClass15_Sub2_Sub1_Sub1_1 == arg0, arg0.anInt8493, arg0.anInt4682, local19, arg0.anInt8492, arg0.aByte91);
					}
					arg0.anInt4703 = arg0.anInt4682 + 1;
					if (local19.anIntArray69.length <= arg0.anInt4703) {
						arg0.anInt4703 = 0;
					}
				}
			}
		}
		@Pc(188) int local188;
		@Pc(202) Class31 local202;
		@Pc(185) Class48 local185;
		if (arg0.anInt4689 != -1 && arg0.anInt4685 <= Static481.anInt8318) {
			local185 = Static501.aClass41_2.method1068(arg0.anInt4689);
			local188 = local185.anInt1218;
			if (local188 == -1) {
				arg0.anInt4689 = -1;
			} else {
				label396: {
					local202 = Static155.aClass76_2.method2152(local188);
					if (local185.aBoolean68) {
						if (local202.anInt934 == 3) {
							if (arg0.anInt4756 > 0 && arg0.anInt4721 <= Static481.anInt8318 && Static481.anInt8318 > arg0.anInt4718) {
								arg0.anInt4689 = -1;
								break label396;
							}
						} else if (local202.anInt934 == 1 && arg0.anInt4756 > 0 && Static481.anInt8318 >= arg0.anInt4721 && arg0.anInt4718 < Static481.anInt8318) {
							arg0.anInt4685 = Static481.anInt8318 + 1;
							break label396;
						}
					}
					if (local202 == null || local202.anIntArray69 == null) {
						arg0.anInt4689 = -1;
					} else {
						if (arg0.anInt4744 < 0) {
							arg0.anInt4744 = 0;
							Static279.method4554(Static35.aClass15_Sub2_Sub1_Sub1_1 == arg0, arg0.anInt8493, 0, local202, arg0.anInt8492, arg0.aByte91);
						}
						arg0.anInt4694++;
						if (local202.anIntArray69.length > arg0.anInt4744 && local202.anIntArray68[arg0.anInt4744] < arg0.anInt4694) {
							arg0.anInt4744++;
							arg0.anInt4694 = 1;
							Static279.method4554(Static35.aClass15_Sub2_Sub1_Sub1_1 == arg0, arg0.anInt8493, arg0.anInt4744, local202, arg0.anInt8492, arg0.aByte91);
						}
						if (local202.anIntArray69.length <= arg0.anInt4744) {
							if (local185.aBoolean68) {
								arg0.anInt4744 -= local202.anInt927;
								arg0.anInt4695++;
								if (arg0.anInt4695 >= local202.anInt921) {
									arg0.anInt4689 = -1;
								} else if (arg0.anInt4744 >= 0 && local202.anIntArray69.length > arg0.anInt4744) {
									Static279.method4554(arg0 == Static35.aClass15_Sub2_Sub1_Sub1_1, arg0.anInt8493, arg0.anInt4744, local202, arg0.anInt8492, arg0.aByte91);
								} else {
									arg0.anInt4689 = -1;
								}
							} else {
								arg0.anInt4689 = -1;
							}
						}
						arg0.anInt4726 = arg0.anInt4744 + 1;
						if (local202.anIntArray69.length <= arg0.anInt4726) {
							if (local185.aBoolean68) {
								arg0.anInt4726 -= local202.anInt927;
								if (local202.anInt921 <= arg0.anInt4695 + 1) {
									arg0.anInt4726 = -1;
								} else if (arg0.anInt4726 < 0 || local202.anIntArray69.length <= arg0.anInt4726) {
									arg0.anInt4726 = -1;
								}
							} else {
								arg0.anInt4726 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4715 != -1 && arg0.anInt4708 <= Static481.anInt8318) {
			local185 = Static501.aClass41_2.method1068(arg0.anInt4715);
			local188 = local185.anInt1218;
			if (local188 == -1) {
				arg0.anInt4715 = -1;
			} else {
				label399: {
					local202 = Static155.aClass76_2.method2152(local188);
					if (local185.aBoolean68) {
						if (local202.anInt934 == 3) {
							if (arg0.anInt4756 > 0 && arg0.anInt4721 <= Static481.anInt8318 && Static481.anInt8318 > arg0.anInt4718) {
								arg0.anInt4715 = -1;
								break label399;
							}
						} else if (local202.anInt934 == 1 && arg0.anInt4756 > 0 && Static481.anInt8318 >= arg0.anInt4721 && arg0.anInt4718 < Static481.anInt8318) {
							arg0.anInt4708 = Static481.anInt8318 + 1;
							break label399;
						}
					}
					if (local202 == null || local202.anIntArray69 == null) {
						arg0.anInt4715 = -1;
					} else {
						if (arg0.anInt4728 < 0) {
							arg0.anInt4728 = 0;
							Static279.method4554(Static35.aClass15_Sub2_Sub1_Sub1_1 == arg0, arg0.anInt8493, 0, local202, arg0.anInt8492, arg0.aByte91);
						}
						arg0.anInt4710++;
						if (arg0.anInt4728 < local202.anIntArray69.length && local202.anIntArray68[arg0.anInt4728] < arg0.anInt4710) {
							arg0.anInt4710 = 1;
							arg0.anInt4728++;
							Static279.method4554(arg0 == Static35.aClass15_Sub2_Sub1_Sub1_1, arg0.anInt8493, arg0.anInt4728, local202, arg0.anInt8492, arg0.aByte91);
						}
						if (local202.anIntArray69.length <= arg0.anInt4728) {
							if (local185.aBoolean68) {
								arg0.anInt4693++;
								arg0.anInt4728 -= local202.anInt927;
								if (local202.anInt921 <= arg0.anInt4693) {
									arg0.anInt4715 = -1;
								} else if (arg0.anInt4728 >= 0 && local202.anIntArray69.length > arg0.anInt4728) {
									Static279.method4554(Static35.aClass15_Sub2_Sub1_Sub1_1 == arg0, arg0.anInt8493, arg0.anInt4728, local202, arg0.anInt8492, arg0.aByte91);
								} else {
									arg0.anInt4715 = -1;
								}
							} else {
								arg0.anInt4715 = -1;
							}
						}
						arg0.anInt4750 = arg0.anInt4728 + 1;
						if (arg0.anInt4750 >= local202.anIntArray69.length) {
							if (local185.aBoolean68) {
								arg0.anInt4750 -= local202.anInt927;
								if (local202.anInt921 <= arg0.anInt4693 + 1) {
									arg0.anInt4750 = -1;
								} else if (arg0.anInt4750 < 0 || local202.anIntArray69.length <= arg0.anInt4750) {
									arg0.anInt4750 = -1;
								}
							} else {
								arg0.anInt4750 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4711 != -1 && arg0.anInt4714 <= 1) {
			local19 = Static155.aClass76_2.method2152(arg0.anInt4711);
			if (local19.anInt934 == 3) {
				if (arg0.anInt4756 > 0 && Static481.anInt8318 >= arg0.anInt4721 && Static481.anInt8318 > arg0.anInt4718) {
					arg0.anInt4711 = -1;
				}
			} else if (local19.anInt934 == 1 && arg0.anInt4756 > 0 && Static481.anInt8318 >= arg0.anInt4721 && Static481.anInt8318 > arg0.anInt4718) {
				arg0.anInt4714 = 2;
			}
		}
		if (arg0.anInt4711 != -1 && arg0.anInt4714 == 0) {
			local19 = Static155.aClass76_2.method2152(arg0.anInt4711);
			if (local19 == null || local19.anIntArray69 == null) {
				arg0.anInt4711 = -1;
			} else {
				arg0.anInt4704++;
				if (local19.anIntArray69.length > arg0.anInt4709 && arg0.anInt4704 > local19.anIntArray68[arg0.anInt4709]) {
					arg0.anInt4709++;
					arg0.anInt4704 = 1;
					Static279.method4554(arg0 == Static35.aClass15_Sub2_Sub1_Sub1_1, arg0.anInt8493, arg0.anInt4709, local19, arg0.anInt8492, arg0.aByte91);
				}
				if (arg0.anInt4709 >= local19.anIntArray69.length) {
					arg0.anInt4709 -= local19.anInt927;
					arg0.anInt4690++;
					if (local19.anInt921 <= arg0.anInt4690) {
						arg0.anInt4711 = -1;
					} else if (arg0.anInt4709 >= 0 && arg0.anInt4709 < local19.anIntArray69.length) {
						Static279.method4554(Static35.aClass15_Sub2_Sub1_Sub1_1 == arg0, arg0.anInt8493, arg0.anInt4709, local19, arg0.anInt8492, arg0.aByte91);
					} else {
						arg0.anInt4711 = -1;
					}
				}
				arg0.anInt4730 = arg0.anInt4709 + 1;
				if (arg0.anInt4730 >= local19.anIntArray69.length) {
					arg0.anInt4730 -= local19.anInt927;
					if (arg0.anInt4690 + 1 >= local19.anInt921) {
						arg0.anInt4730 = -1;
					} else if (arg0.anInt4730 < 0 || local19.anIntArray69.length <= arg0.anInt4730) {
						arg0.anInt4730 = -1;
					}
				}
				arg0.anInt4738 = local19.anInt929;
			}
		}
		if (arg0.anInt4714 > 0) {
			arg0.anInt4714--;
		}
		for (@Pc(1073) int local1073 = 0; local1073 < arg0.aClass170Array3.length; local1073++) {
			@Pc(1080) Class170 local1080 = arg0.aClass170Array3[local1073];
			if (local1080 != null) {
				if (local1080.anInt5052 > 0) {
					local1080.anInt5052--;
				} else {
					local202 = Static155.aClass76_2.method2152(local1080.anInt5058);
					if (local202 == null || local202.anIntArray69 == null) {
						arg0.aClass170Array3[local1073] = null;
					} else {
						local1080.anInt5055++;
						if (local1080.anInt5054 < local202.anIntArray69.length && local202.anIntArray68[local1080.anInt5054] < local1080.anInt5055) {
							local1080.anInt5055 = 1;
							local1080.anInt5054++;
							Static279.method4554(Static35.aClass15_Sub2_Sub1_Sub1_1 == arg0, arg0.anInt8493, local1080.anInt5054, local202, arg0.anInt8492, arg0.aByte91);
						}
						if (local1080.anInt5054 >= local202.anIntArray69.length) {
							local1080.anInt5053++;
							local1080.anInt5054 -= local202.anInt927;
							if (local1080.anInt5053 >= local202.anInt921) {
								arg0.aClass170Array3[local1073] = null;
							} else if (local1080.anInt5054 >= 0 && local1080.anInt5054 < local202.anIntArray69.length) {
								Static279.method4554(Static35.aClass15_Sub2_Sub1_Sub1_1 == arg0, arg0.anInt8493, local1080.anInt5054, local202, arg0.anInt8492, arg0.aByte91);
							} else {
								arg0.aClass170Array3[local1073] = null;
							}
						}
						local1080.anInt5056 = local1080.anInt5054 + 1;
						if (local1080.anInt5056 >= local202.anIntArray69.length) {
							local1080.anInt5056 -= local202.anInt927;
							if (local1080.anInt5053 + 1 >= local202.anInt921) {
								local1080.anInt5056 = -1;
							} else if (local1080.anInt5056 < 0 || local202.anIntArray69.length <= local1080.anInt5056) {
								local1080.anInt5056 = -1;
							}
						}
					}
				}
			}
		}
	}
}
