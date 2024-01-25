import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!pu", name = "R", descriptor = "Lclient!sc;")
	public static Class223 aClass223_6;

	@OriginalMember(owner = "client!pu", name = "S", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!pu", name = "fb", descriptor = "I")
	public static int anInt5851;

	@OriginalMember(owner = "client!pu", name = "P", descriptor = "I")
	public static int anInt5843 = 0;

	@OriginalMember(owner = "client!pu", name = "W", descriptor = "Z")
	public static boolean aBoolean409 = false;

	@OriginalMember(owner = "client!pu", name = "X", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_100 = new Class231("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!mn;ILclient!za;)V")
	public static void method4637(@OriginalArg(0) Class171 arg0, @OriginalArg(2) Class75 arg1) {
		if (Static228.aBoolean426) {
			return;
		}
		arg1.t(0);
		Static193.aClass41_8 = arg1.method5986(Static470.method4239(arg0, Static192.anInt3359));
		Static193.aClass41_8.method6090((Static49.anInt789 - Static193.aClass41_8.RA()) / 2, (Static344.anInt6105 - Static193.aClass41_8.Q()) / 2);
		Static28.aClass41_1 = arg1.method5986(Static470.method4239(arg0, Static72.anInt1217));
		Static28.aClass41_1.method6090((Static49.anInt789 - Static28.aClass41_1.RA()) / 2, 18);
		Static228.aBoolean426 = true;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I[B)[B")
	public static byte[] method4638(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static472.method5022(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(Z)V")
	public static void method4639() {
		if (Static292.anInt5209 > 1) {
			Static29.anInt504 = Static144.anInt2663;
			Static292.anInt5209--;
		}
		if (Static149.aBoolean502) {
			Static149.aBoolean502 = false;
			Static75.method1141();
			return;
		}
		if (!Static45.aBoolean34) {
			Static461.method6252();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static246.method3417(); local29++) {
		}
		if (Static433.anInt7309 != 9) {
			return;
		}
		Static62.method1003(Static125.aClass208_47.method4853(), Static389.aClass2_Sub17_Sub1_2);
		if (Static264.aClass2_Sub44_1 == null) {
			if (Static461.aLong399 <= Static432.method5870()) {
				Static264.aClass2_Sub44_1 = Static11.aClass233_1.method5271(Static163.aClass263_3.aString71);
			}
		} else if (Static264.aClass2_Sub44_1.anInt7320 != -1) {
			Static164.method2403(Static444.aClass208_105);
			Static389.aClass2_Sub17_Sub1_2.method6130(Static264.aClass2_Sub44_1.anInt7320);
			Static264.aClass2_Sub44_1 = null;
			Static461.aLong399 = Static432.method5870() + 30000L;
		}
		@Pc(93) Class2_Sub11 local93 = (Class2_Sub11) Static292.aClass181_26.method3972();
		@Pc(130) int local130;
		@Pc(148) int local148;
		@Pc(161) boolean local161;
		@Pc(210) int local210;
		@Pc(217) int local217;
		@Pc(229) int local229;
		if (local93 != null || Static432.method5870() - 2000L > Static361.aLong334) {
			@Pc(104) boolean local104 = false;
			@Pc(107) int local107 = Static389.aClass2_Sub17_Sub1_2.anInt7523;
			for (@Pc(112) Class2_Sub11 local112 = (Class2_Sub11) Static361.aClass181_34.method3972(); local112 != null && Static389.aClass2_Sub17_Sub1_2.anInt7523 - local107 < 240; local112 = (Class2_Sub11) Static361.aClass181_34.method3975()) {
				local112.method6260();
				local130 = local112.method4368();
				if (local130 < 0) {
					local130 = 0;
				} else if (local130 > 65534) {
					local130 = 65534;
				}
				local148 = local112.method4365();
				if (local148 < 0) {
					local148 = 0;
				} else if (local148 > 65534) {
					local148 = 65534;
				}
				local161 = false;
				if (local112.method4368() == -1 && local112.method4365() == -1) {
					local148 = -1;
					local130 = -1;
					local161 = true;
				}
				if (local148 != Static111.anInt1852 || local130 != Static437.anInt7351) {
					if (!local104) {
						Static164.method2403(Static134.aClass208_30);
						Static389.aClass2_Sub17_Sub1_2.method6172(0);
						local107 = Static389.aClass2_Sub17_Sub1_2.anInt7523;
						local104 = true;
					}
					local210 = local148 - Static111.anInt1852;
					Static111.anInt1852 = local148;
					local217 = local130 - Static437.anInt7351;
					Static437.anInt7351 = local130;
					local229 = (int) ((local112.method4367() - Static361.aLong334) / 20L);
					if (local229 < 8 && local210 >= -32 && local210 <= 31 && local217 >= -32 && local217 <= 31) {
						local210 += 32;
						local217 += 32;
						Static389.aClass2_Sub17_Sub1_2.method6130(local217 + (local210 << 6) + (local229 << 12));
					} else if (local229 < 32 && local210 >= -128 && local210 <= 127 && local217 >= -128 && local217 <= 127) {
						local210 += 128;
						Static389.aClass2_Sub17_Sub1_2.method6172(local229 + 128);
						local217 += 128;
						Static389.aClass2_Sub17_Sub1_2.method6130((local210 << 8) + local217);
					} else if (local229 < 32) {
						Static389.aClass2_Sub17_Sub1_2.method6172(local229 + 192);
						if (local161) {
							Static389.aClass2_Sub17_Sub1_2.method6170(Integer.MIN_VALUE);
						} else {
							Static389.aClass2_Sub17_Sub1_2.method6170(local148 | local130 << 16);
						}
					} else {
						Static389.aClass2_Sub17_Sub1_2.method6130(local229 + 57344);
						if (local161) {
							Static389.aClass2_Sub17_Sub1_2.method6170(Integer.MIN_VALUE);
						} else {
							Static389.aClass2_Sub17_Sub1_2.method6170(local148 | local130 << 16);
						}
					}
					Static361.aLong334 = local112.method4367();
				}
			}
			if (local104) {
				Static389.aClass2_Sub17_Sub1_2.method6131(Static389.aClass2_Sub17_Sub1_2.anInt7523 - local107);
			}
		}
		@Pc(405) int local405;
		@Pc(452) int local452;
		if (local93 != null) {
			@Pc(389) long local389 = (local93.method4367() - Static1.aLong9) / 50L;
			Static1.aLong9 = local93.method4367();
			if (local389 > 32767L) {
				local389 = 32767L;
			}
			local405 = local93.method4368();
			if (local405 < 0) {
				local405 = 0;
			} else if (local405 > 65535) {
				local405 = 65535;
			}
			local130 = local93.method4365();
			if (local130 < 0) {
				local130 = 0;
			} else if (local130 > 65535) {
				local130 = 65535;
			}
			@Pc(440) byte local440 = 0;
			if (local93.method4364() == 2) {
				local440 = 1;
			}
			local452 = (int) local389;
			Static164.method2403(Static186.aClass208_50);
			Static389.aClass2_Sub17_Sub1_2.method6130(local452 | local440 << 15);
			Static389.aClass2_Sub17_Sub1_2.method6165(local130 | local405 << 16);
		}
		@Pc(495) int local495;
		if (Static425.anInt7247 > 0) {
			Static164.method2403(Static400.aClass208_97);
			Static389.aClass2_Sub17_Sub1_2.method6172(Static425.anInt7247 * 3);
			for (local495 = 0; local495 < Static425.anInt7247; local495++) {
				@Pc(501) Interface2 local501 = Static189.anInterface2Array2[local495];
				@Pc(510) long local510 = (local501.method2884() - Static448.aLong394) / 50L;
				Static448.aLong394 = local501.method2884();
				if (local510 > 65535L) {
					local510 = 65535L;
				}
				Static389.aClass2_Sub17_Sub1_2.method6172(local501.method2885());
				Static389.aClass2_Sub17_Sub1_2.method6130((int) local510);
			}
		}
		if (Static351.anInt6204 > 0) {
			Static351.anInt6204--;
		}
		if (Static94.aBoolean395 && Static351.anInt6204 <= 0) {
			Static351.anInt6204 = 20;
			Static94.aBoolean395 = false;
			Static164.method2403(Static47.aClass208_9);
			Static389.aClass2_Sub17_Sub1_2.method6112((int) Static234.aFloat30 >> 3);
			Static389.aClass2_Sub17_Sub1_2.method6130((int) Static37.aFloat9 >> 3);
		}
		if (Static159.aBoolean182 && !Static314.aBoolean398) {
			Static314.aBoolean398 = true;
			Static164.method2403(Static357.aClass208_85);
			Static389.aClass2_Sub17_Sub1_2.method6172(1);
		}
		if (!Static159.aBoolean182 && Static314.aBoolean398) {
			Static314.aBoolean398 = false;
			Static164.method2403(Static357.aClass208_85);
			Static389.aClass2_Sub17_Sub1_2.method6172(0);
		}
		if (!Static214.aBoolean244) {
			Static164.method2403(Static127.aClass208_27);
			Static389.aClass2_Sub17_Sub1_2.method6172(0);
			local495 = Static389.aClass2_Sub17_Sub1_2.anInt7523;
			@Pc(638) Class2_Sub17 local638 = Static434.aClass165_Sub1_1.method3393();
			Static389.aClass2_Sub17_Sub1_2.method6167(local638.aByteArray94, local638.anInt7523);
			Static389.aClass2_Sub17_Sub1_2.method6131(Static389.aClass2_Sub17_Sub1_2.anInt7523 - local495);
			Static214.aBoolean244 = true;
		}
		if (Static175.aClass36ArrayArrayArray1 != null) {
			if (Static25.anInt7273 == 2) {
				Static89.method963();
			} else if (Static25.anInt7273 == 3) {
				Static13.method315();
			}
		}
		if (Static42.aBoolean410) {
			Static42.aBoolean410 = false;
		} else {
			Static104.aFloat13 /= 2.0F;
		}
		if (Static157.aBoolean179) {
			Static157.aBoolean179 = false;
		} else {
			Static417.aFloat93 /= 2.0F;
		}
		Static143.method2204();
		if (Static433.anInt7309 != 9) {
			return;
		}
		Static104.method1545();
		Static199.method2807();
		Static337.method4780();
		Static271.method3896();
		Static434.anInt7319++;
		if (Static434.anInt7319 > 750) {
			Static75.method1141();
			return;
		}
		Static63.method5433();
		Static417.method5727();
		Static426.method5822();
		for (local495 = Static63.aClass120_2.method2530(true); local495 != -1; local495 = Static63.aClass120_2.method2530(false)) {
			Static412.method5669(local495);
			Static282.anIntArray422[Static46.anInt759++ & 0x1F] = local495;
		}
		@Pc(860) Class93 local860;
		for (@Pc(758) Class2_Sub1_Sub6 local758 = Static175.method2564(); local758 != null; local758 = Static175.method2564()) {
			local405 = local758.method2579();
			local130 = local758.method2577();
			if (local405 == 1) {
				Static388.anIntArray542[local130] = local758.anInt3131;
				Static410.aBoolean468 |= Static203.aBooleanArray15[local130];
				Static242.anIntArray379[Static252.anInt4351++ & 0x1F] = local130;
			} else if (local405 == 2) {
				Static308.aStringArray51[local130] = local758.aString30;
				Static10.anIntArray17[Static461.anInt7748++ & 0x1F] = local130;
			} else if (local405 == 3) {
				local860 = Static160.method2380(local130);
				if (!local758.aString30.equals(local860.aString24)) {
					local860.aString24 = local758.aString30;
					Static383.method5263(local860);
				}
			} else if (local405 == 4) {
				local860 = Static160.method2380(local130);
				local452 = local758.anInt3131;
				local210 = local758.anInt3130;
				local217 = local758.anInt3128;
				if (local860.anInt2431 != local452 || local210 != local860.anInt2512 || local860.anInt2496 != local217) {
					local860.anInt2512 = local210;
					local860.anInt2431 = local452;
					local860.anInt2496 = local217;
					Static383.method5263(local860);
				}
			} else if (local405 == 5) {
				local860 = Static160.method2380(local130);
				if (local860.anInt2428 != local758.anInt3131 || local758.anInt3131 == -1) {
					local860.anInt2438 = 0;
					local860.anInt2428 = local758.anInt3131;
					local860.anInt2455 = 1;
					local860.anInt2433 = 0;
					Static383.method5263(local860);
				}
			} else if (local405 == 6) {
				local148 = local758.anInt3131;
				local452 = local148 >> 10 & 0x1F;
				local210 = local148 >> 5 & 0x1F;
				local217 = local148 & 0x1F;
				local229 = (local452 << 19) + (local210 << 11) + (local217 << 3);
				@Pc(832) Class93 local832 = Static160.method2380(local130);
				if (local832.anInt2439 != local229) {
					local832.anInt2439 = local229;
					Static383.method5263(local832);
				}
			} else if (local405 == 7) {
				local860 = Static160.method2380(local130);
				local161 = local758.anInt3131 == 1;
				if (local161 != local860.aBoolean160) {
					local860.aBoolean160 = local161;
					Static383.method5263(local860);
				}
			} else if (local405 == 8) {
				local860 = Static160.method2380(local130);
				if (local860.anInt2462 != local758.anInt3131 || local758.anInt3130 != local860.anInt2474 || local860.anInt2483 != local758.anInt3128) {
					local860.anInt2462 = local758.anInt3131;
					local860.anInt2483 = local758.anInt3128;
					local860.anInt2474 = local758.anInt3130;
					if (local860.anInt2488 != -1) {
						if (local860.anInt2479 > 0) {
							local860.anInt2483 = local860.anInt2483 * 32 / local860.anInt2479;
						} else if (local860.anInt2481 > 0) {
							local860.anInt2483 = local860.anInt2483 * 32 / local860.anInt2481;
						}
					}
					Static383.method5263(local860);
				}
			} else if (local405 == 9) {
				local860 = Static160.method2380(local130);
				if (local860.anInt2488 != local758.anInt3131 || local860.anInt2466 != local758.anInt3130) {
					local860.anInt2488 = local758.anInt3131;
					local860.anInt2466 = local758.anInt3130;
					Static383.method5263(local860);
				}
			} else if (local405 == 10) {
				local860 = Static160.method2380(local130);
				if (local758.anInt3131 != local860.anInt2502 || local758.anInt3130 != local860.anInt2491 || local860.anInt2465 != local758.anInt3128) {
					local860.anInt2502 = local758.anInt3131;
					local860.anInt2491 = local758.anInt3130;
					local860.anInt2465 = local758.anInt3128;
					Static383.method5263(local860);
				}
			} else if (local405 == 11) {
				local860 = Static160.method2380(local130);
				local860.anInt2448 = local860.anInt2507 = local758.anInt3130;
				local860.aByte40 = 0;
				local860.aByte43 = 0;
				local860.anInt2460 = local860.anInt2444 = local758.anInt3131;
				Static383.method5263(local860);
			} else if (local405 == 12) {
				local860 = Static160.method2380(local130);
				local452 = local758.anInt3131;
				if (local860 != null && local860.anInt2494 == 0) {
					if (local452 > local860.anInt2450 - local860.anInt2495) {
						local452 = local860.anInt2450 - local860.anInt2495;
					}
					if (local452 < 0) {
						local452 = 0;
					}
					if (local860.anInt2435 != local452) {
						local860.anInt2435 = local452;
						Static383.method5263(local860);
					}
				}
			} else if (local405 == 14) {
				local860 = Static160.method2380(local130);
				local860.anInt2467 = local758.anInt3131;
			} else if (local405 == 15) {
				Static68.aBoolean65 = true;
				Static249.anInt4279 = local758.anInt3131;
				Static331.anInt5943 = local758.anInt3130;
			} else if (local405 == 16) {
				local860 = Static160.method2380(local130);
				local860.anInt2446 = local758.anInt3131;
			}
		}
		Static417.anInt7158++;
		if (Static369.anInt6467 != 0) {
			Static118.anInt2007 += 20;
			if (Static118.anInt2007 >= 400) {
				Static369.anInt6467 = 0;
			}
		}
		if (Static276.aClass93_16 != null) {
			Static358.anInt7401++;
			if (Static358.anInt7401 >= 15) {
				Static383.method5263(Static276.aClass93_16);
				Static276.aClass93_16 = null;
			}
		}
		Static227.aBoolean255 = false;
		Static240.aClass93_14 = null;
		Static144.aBoolean168 = false;
		Static415.aClass93_18 = null;
		Static74.method1136(null, -1, -1);
		Static437.method5904(-1, null, -1);
		if (!Static11.aBoolean7) {
			Static236.anInt3995 = -1;
		}
		Static262.method3687();
		Static144.anInt2663++;
		if (Static191.aBoolean215) {
			Static164.method2403(Static148.aClass208_36);
			Static389.aClass2_Sub17_Sub1_2.method6122(Static410.anInt7045 | Static394.anInt7627 << 14 | Static195.anInt3387 << 28);
			Static191.aBoolean215 = false;
		}
		while (true) {
			@Pc(1412) Class2_Sub18 local1412;
			@Pc(1417) Class93 local1417;
			do {
				local1412 = (Class2_Sub18) Static300.aClass181_29.method3976();
				if (local1412 == null) {
					while (true) {
						do {
							local1412 = (Class2_Sub18) Static426.aClass181_48.method3976();
							if (local1412 == null) {
								while (true) {
									do {
										local1412 = (Class2_Sub18) Static406.aClass181_46.method3976();
										if (local1412 == null) {
											if (Static415.aClass93_18 == null) {
												Static102.anInt1595 = 0;
											}
											if (Static125.aClass93_11 != null) {
												Static360.method5071();
											}
											if (Static81.anInt1300 > 0 && Static161.aClass115_1.method2374(82) && Static161.aClass115_1.method2374(81) && Static72.anInt1221 != 0) {
												local405 = Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 - Static72.anInt1221;
												if (local405 < 0) {
													local405 = 0;
												} else if (local405 > 3) {
													local405 = 3;
												}
												Static35.method575(Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray632[0] + Static386.anInt7205, local405, Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray633[0] + Static153.anInt2798);
											}
											Static70.method1095();
											for (local405 = 0; local405 < 5; local405++) {
												@Pc(1623) int local1623 = Static257.anIntArray393[local405]++;
											}
											if (Static410.aBoolean468 && Static432.method5870() - 60000L > Static206.aLong172) {
												Static331.method4731();
											}
											for (@Pc(1646) Class28_Sub2_Sub2 local1646 = (Class28_Sub2_Sub2) Static19.aClass97_1.method2145(); local1646 != null; local1646 = (Class28_Sub2_Sub2) Static19.aClass97_1.method2148()) {
												if (Static432.method5870() / 1000L - 5L > (long) local1646.anInt5211) {
													if (local1646.aShort71 > 0) {
														Static94.method4447("", "", local1646.aString44 + Static30.aClass231_12.method5261(Static80.anInt6195), 5, 0);
													}
													if (local1646.aShort71 == 0) {
														Static94.method4447("", "", local1646.aString44 + Static27.aClass231_11.method5261(Static80.anInt6195), 5, 0);
													}
													local1646.method5916();
												}
											}
											Static187.anInt3297++;
											if (Static187.anInt3297 > 500) {
												Static187.anInt3297 = 0;
												local148 = (int) (Math.random() * 8.0D);
												if ((local148 & 0x2) == 2) {
													Static113.anInt1913 += Static161.anInt2909;
												}
												if ((local148 & 0x4) == 4) {
													Static289.anInt5181 += Static404.anInt2753;
												}
												if ((local148 & 0x1) == 1) {
													Static255.anInt4459 += Static125.anInt3195;
												}
											}
											if (Static255.anInt4459 < -50) {
												Static125.anInt3195 = 2;
											}
											if (Static113.anInt1913 < -55) {
												Static161.anInt2909 = 2;
											}
											if (Static255.anInt4459 > 50) {
												Static125.anInt3195 = -2;
											}
											if (Static289.anInt5181 < -40) {
												Static404.anInt2753 = 1;
											}
											if (Static113.anInt1913 > 55) {
												Static161.anInt2909 = -2;
											}
											Static114.anInt1921++;
											if (Static289.anInt5181 > 40) {
												Static404.anInt2753 = -1;
											}
											if (Static114.anInt1921 > 500) {
												Static114.anInt1921 = 0;
												local148 = (int) (Math.random() * 8.0D);
												if ((local148 & 0x1) == 1) {
													Static149.anInt7397 += Static401.anInt7011;
												}
												if ((local148 & 0x2) == 2) {
													Static148.anInt2711 += Static256.anInt5639;
												}
											}
											if (Static149.anInt7397 < -60) {
												Static401.anInt7011 = 2;
											}
											if (Static149.anInt7397 > 60) {
												Static401.anInt7011 = -2;
											}
											if (Static148.anInt2711 < -20) {
												Static256.anInt5639 = 1;
											}
											if (Static148.anInt2711 > 10) {
												Static256.anInt5639 = -1;
											}
											Static392.anInt6754++;
											if (Static392.anInt6754 > 50) {
												Static164.method2403(Static128.aClass208_28);
											}
											if (Static89.aBoolean59) {
												Static64.method1048();
												Static89.aBoolean59 = false;
											}
											try {
												if (Static339.aClass66_2 != null && Static389.aClass2_Sub17_Sub1_2.anInt7523 > 0) {
													Static241.anInt4070 += Static389.aClass2_Sub17_Sub1_2.anInt7523;
													Static339.aClass66_2.method1392(Static389.aClass2_Sub17_Sub1_2.anInt7523, Static389.aClass2_Sub17_Sub1_2.aByteArray94);
													Static389.aClass2_Sub17_Sub1_2.anInt7523 = 0;
													Static392.anInt6754 = 0;
													return;
												}
												return;
											} catch (@Pc(1908) IOException local1908) {
												Static75.method1141();
												return;
											}
										}
										local1417 = local1412.aClass93_10;
										if (local1417.anInt2424 < 0) {
											break;
										}
										local860 = Static160.method2380(local1417.anInt2426);
									} while (local860 == null || local860.aClass93Array1 == null || local860.aClass93Array1.length <= local1417.anInt2424 || local1417 != local860.aClass93Array1[local1417.anInt2424]);
									Static76.method1143(local1412);
								}
							}
							local1417 = local1412.aClass93_10;
							if (local1417.anInt2424 < 0) {
								break;
							}
							local860 = Static160.method2380(local1417.anInt2426);
						} while (local860 == null || local860.aClass93Array1 == null || local860.aClass93Array1.length <= local1417.anInt2424 || local860.aClass93Array1[local1417.anInt2424] != local1417);
						Static76.method1143(local1412);
					}
				}
				local1417 = local1412.aClass93_10;
				if (local1417.anInt2424 < 0) {
					break;
				}
				local860 = Static160.method2380(local1417.anInt2426);
			} while (local860 == null || local860.aClass93Array1 == null || local860.aClass93Array1.length <= local1417.anInt2424 || local860.aClass93Array1[local1417.anInt2424] != local1417);
			Static76.method1143(local1412);
		}
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(III)Z")
	public static boolean method4644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
