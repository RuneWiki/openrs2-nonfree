import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!kg", name = "X", descriptor = "[Lclient!lj;")
	public static Class60[] aClass60Array27;

	@OriginalMember(owner = "client!kg", name = "db", descriptor = "I")
	public static int anInt2489;

	@OriginalMember(owner = "client!kg", name = "gb", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!kg", name = "jb", descriptor = "I")
	public static int anInt2493;

	@OriginalMember(owner = "client!kg", name = "R", descriptor = "Lclient!i;")
	public static Class41 aClass41_738 = Static184.method2923("titlebutton");

	@OriginalMember(owner = "client!kg", name = "T", descriptor = "J")
	public static volatile long aLong74 = 0L;

	@OriginalMember(owner = "client!kg", name = "ab", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7 = new byte[4][104][104];

	@OriginalMember(owner = "client!kg", name = "eb", descriptor = "I")
	public static int anInt2490 = 0;

	@OriginalMember(owner = "client!kg", name = "fb", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V")
	public static void method1754(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static96.aBoolean127) {
			Static1.method2636();
		} else if (arg0 != -1 && (arg0 != Static2.anInt70 || !Static89.method1562()) && Static58.anInt1633 != 0 && !Static96.aBoolean127) {
			Static93.method1624(Static58.anInt1633, arg0, Static86.aClass15_Sub1_57);
		}
		Static2.anInt70 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V")
	public static void method1755() {
		if (Static100.anInt2441 > 1) {
			Static100.anInt2441--;
			Static184.anInt4240 = Static60.anInt4782;
		}
		if (Static92.anInt2287 > 0) {
			Static92.anInt2287--;
		}
		if (Static53.aBoolean83) {
			Static53.aBoolean83 = false;
			Static177.method2842();
			return;
		}
		for (@Pc(42) int local42 = 0; local42 < 100 && Static11.method285(); local42++) {
		}
		if (Static203.anInt4533 != 30) {
			return;
		}
		Static14.method295(Static131.aClass2_Sub3_Sub1_2);
		@Pc(64) Object local64 = Static194.aClass26_2.anObject2;
		@Pc(92) int local92;
		@Pc(94) int local94;
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(131) int local131;
		synchronized (Static194.aClass26_2.anObject2) {
			if (!Static52.aBoolean76) {
				Static194.aClass26_2.anInt1028 = 0;
			} else if (Static34.anInt909 != 0 || Static194.aClass26_2.anInt1028 >= 40) {
				Static131.aClass2_Sub3_Sub1_2.method221(111);
				Static131.aClass2_Sub3_Sub1_2.method208(0);
				local92 = Static131.aClass2_Sub3_Sub1_2.anInt239;
				local94 = 0;
				for (local96 = 0; local96 < Static194.aClass26_2.anInt1028 && Static131.aClass2_Sub3_Sub1_2.anInt239 - local92 < 240; local96++) {
					local94++;
					local113 = Static194.aClass26_2.anIntArray88[local96];
					if (local113 < 0) {
						local113 = 0;
					} else if (local113 > 502) {
						local113 = 502;
					}
					local131 = Static194.aClass26_2.anIntArray89[local96];
					if (local131 < 0) {
						local131 = 0;
					} else if (local131 > 764) {
						local131 = 764;
					}
					@Pc(149) int local149 = local113 * 765 + local131;
					if (Static194.aClass26_2.anIntArray88[local96] == -1 && Static194.aClass26_2.anIntArray89[local96] == -1) {
						local149 = 524287;
						local131 = -1;
						local113 = -1;
					}
					if (local131 != Static6.anInt315 || Static187.anInt4309 != local113) {
						@Pc(190) int local190 = local113 - Static187.anInt4309;
						Static187.anInt4309 = local113;
						@Pc(196) int local196 = local131 - Static6.anInt315;
						Static6.anInt315 = local131;
						if (Static132.anInt3020 < 8 && local196 >= -32 && local196 <= 31 && local190 >= -32 && local190 <= 31) {
							local190 += 32;
							local196 += 32;
							Static131.aClass2_Sub3_Sub1_2.method167(local190 + (Static132.anInt3020 << 12) + (local196 << 6));
							Static132.anInt3020 = 0;
						} else if (Static132.anInt3020 < 8) {
							Static131.aClass2_Sub3_Sub1_2.method199((Static132.anInt3020 << 19) + local149 + 8388608);
							Static132.anInt3020 = 0;
						} else {
							Static131.aClass2_Sub3_Sub1_2.method200(local149 + (Static132.anInt3020 << 19) - 1073741824);
							Static132.anInt3020 = 0;
						}
					} else if (Static132.anInt3020 < 2047) {
						Static132.anInt3020++;
					}
				}
				Static131.aClass2_Sub3_Sub1_2.method203(Static131.aClass2_Sub3_Sub1_2.anInt239 - local92);
				if (local94 < Static194.aClass26_2.anInt1028) {
					Static194.aClass26_2.anInt1028 -= local94;
					for (local113 = 0; local113 < Static194.aClass26_2.anInt1028; local113++) {
						Static194.aClass26_2.anIntArray89[local113] = Static194.aClass26_2.anIntArray89[local113 + local94];
						Static194.aClass26_2.anIntArray88[local113] = Static194.aClass26_2.anIntArray88[local113 + local94];
					}
				} else {
					Static194.aClass26_2.anInt1028 = 0;
				}
			}
		}
		if (Static34.anInt909 != 0) {
			@Pc(350) long local350 = (Static34.aLong22 - Static86.aLong64) / 50L;
			Static86.aLong64 = Static34.aLong22;
			local92 = Static154.anInt3614;
			local94 = Static200.anInt4491;
			if (local92 < 0) {
				local92 = 0;
			} else if (local92 > 502) {
				local92 = 502;
			}
			if (local94 < 0) {
				local94 = 0;
			} else if (local94 > 764) {
				local94 = 764;
			}
			if (local350 > 4095L) {
				local350 = 4095L;
			}
			@Pc(391) byte local391 = 0;
			local96 = local92 * 765 + local94;
			if (Static34.anInt909 == 2) {
				local391 = 1;
			}
			Static131.aClass2_Sub3_Sub1_2.method221(63);
			local131 = (int) local350;
			Static131.aClass2_Sub3_Sub1_2.method188((local391 << 19) + ((local131 << 20) + local96));
		}
		if (Static219.aBooleanArray25[96] || Static219.aBooleanArray25[97] || Static219.aBooleanArray25[98] || Static219.aBooleanArray25[99]) {
			Static158.aBoolean231 = true;
		}
		if (Static77.anInt1994 > 0) {
			Static77.anInt1994--;
		}
		if (Static158.aBoolean231 && Static77.anInt1994 <= 0) {
			Static158.aBoolean231 = false;
			Static77.anInt1994 = 20;
			Static131.aClass2_Sub3_Sub1_2.method221(173);
			Static131.aClass2_Sub3_Sub1_2.method193(Static183.anInt1324);
			Static131.aClass2_Sub3_Sub1_2.method167(Static57.anInt1618);
		}
		if (Static157.aBoolean228 && !Static20.aBoolean30) {
			Static20.aBoolean30 = true;
			Static131.aClass2_Sub3_Sub1_2.method221(130);
			Static131.aClass2_Sub3_Sub1_2.method208(1);
		}
		if (!Static157.aBoolean228 && Static20.aBoolean30) {
			Static20.aBoolean30 = false;
			Static131.aClass2_Sub3_Sub1_2.method221(130);
			Static131.aClass2_Sub3_Sub1_2.method208(0);
		}
		Static168.method2712();
		if (Static203.anInt4533 != 30) {
			return;
		}
		Static99.method1710();
		Static44.method929();
		Static170.anInt3984++;
		if (Static170.anInt3984 > 750) {
			Static177.method2842();
			return;
		}
		Static153.method2492();
		Static150.method2347();
		Static138.method2202();
		if (Static79.aClass80_8 != null) {
			Static167.method2699();
		}
		if (Static142.anInt3253 != 0) {
			Static41.anInt1265 += 20;
			if (Static41.anInt1265 >= 400) {
				Static142.anInt3253 = 0;
			}
		}
		Static16.anInt432++;
		if (Static52.aClass80_6 != null) {
			Static124.anInt2947++;
			if (Static124.anInt2947 >= 15) {
				Static176.method2833(Static52.aClass80_6);
				Static52.aClass80_6 = null;
			}
		}
		@Pc(679) Class80 local679;
		if (Static120.aClass80_11 != null) {
			Static176.method2833(Static120.aClass80_11);
			Static220.anInt4800++;
			if (Static26.anInt663 > Static194.anInt4770 + 5 || Static194.anInt4770 - 5 > Static26.anInt663 || Static212.anInt4711 > Static44.anInt1329 + 5 || Static44.anInt1329 - 5 > Static212.anInt4711) {
				Static39.aBoolean56 = true;
			}
			if (Static141.anInt3252 == 0) {
				if (Static39.aBoolean56 && Static220.anInt4800 >= 5) {
					if (Static120.aClass80_11 == Static199.aClass80_15 && Static17.anInt473 != Static154.anInt3610) {
						local679 = Static120.aClass80_11;
						@Pc(681) byte local681 = 0;
						if (Static140.anInt3231 == 1 && local679.anInt3670 == 206) {
							local681 = 1;
						}
						if (local679.anIntArray380[Static154.anInt3610] <= 0) {
							local681 = 0;
						}
						if (Static144.method2241(Static70.method1287(local679))) {
							local92 = Static17.anInt473;
							local94 = Static154.anInt3610;
							local679.anIntArray380[local94] = local679.anIntArray380[local92];
							local679.anIntArray390[local94] = local679.anIntArray390[local92];
							local679.anIntArray380[local92] = -1;
							local679.anIntArray390[local92] = 0;
						} else if (local681 == 1) {
							local92 = Static17.anInt473;
							local94 = Static154.anInt3610;
							while (local94 != local92) {
								if (local94 < local92) {
									local679.method2541(local92 - 1, local92);
									local92--;
								} else if (local92 < local94) {
									local679.method2541(local92 + 1, local92);
									local92++;
								}
							}
						} else {
							local679.method2541(Static154.anInt3610, Static17.anInt473);
						}
						Static131.aClass2_Sub3_Sub1_2.method221(207);
						Static131.aClass2_Sub3_Sub1_2.method213(Static120.aClass80_11.anInt3661);
						Static131.aClass2_Sub3_Sub1_2.method176(Static17.anInt473);
						Static131.aClass2_Sub3_Sub1_2.method189(local681);
						Static131.aClass2_Sub3_Sub1_2.method206(Static154.anInt3610);
					}
				} else if ((Static179.anInt4148 == 1 || Static208.method3215(Static179.anInt4150 - 1)) && Static179.anInt4150 > 2) {
					Static121.method3317();
				} else if (Static179.anInt4150 > 0) {
					Static157.method2554(Static179.anInt4150 - 1);
				}
				Static34.anInt909 = 0;
				Static124.anInt2947 = 10;
				Static120.aClass80_11 = null;
			}
		}
		Static71.anInt1877 = 0;
		Static134.aBoolean180 = false;
		Static108.aClass80_9 = null;
		@Pc(821) Class80 local821 = Static34.aClass80_1;
		local679 = Static58.aClass80_7;
		Static58.aClass80_7 = null;
		Static27.aBoolean122 = false;
		Static34.aClass80_1 = null;
		while (Static39.method823() && Static71.anInt1877 < 128) {
			Static215.anIntArray490[Static71.anInt1877] = Static122.anInt2920;
			Static169.anIntArray415[Static71.anInt1877] = Static194.anInt4772;
			Static71.anInt1877++;
		}
		Static79.aClass80_8 = null;
		if (Static39.anInt1055 != -1) {
			Static204.method3146(0, Static130.anInt3906, 0, 0, Static197.anInt4442, Static39.anInt1055, 0);
		}
		Static60.anInt4782++;
		while (true) {
			@Pc(874) Class2_Sub5 local874;
			@Pc(887) Class80 local887;
			@Pc(879) Class80 local879;
			do {
				local874 = (Class2_Sub5) Static33.aClass108_1.method3325();
				if (local874 == null) {
					while (true) {
						do {
							local874 = (Class2_Sub5) Static175.aClass108_14.method3325();
							if (local874 == null) {
								while (true) {
									do {
										local874 = (Class2_Sub5) Static65.aClass108_6.method3325();
										if (local874 == null) {
											if (Static157.aBoolean229 && Static79.aClass80_8 == null) {
												Static157.aBoolean229 = false;
											}
											if (Static160.aClass80_13 != null) {
												Static86.method1533();
											}
											if (Static100.anInt2439 != -1) {
												local92 = Static100.anInt2439;
												local94 = Static79.anInt2049;
												@Pc(1047) boolean local1047 = Static183.method925(0, 0, local94, local92, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 0, 0, 0, true, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
												Static100.anInt2439 = -1;
												if (local1047) {
													Static132.anInt3013 = Static200.anInt4491;
													Static41.anInt1265 = 0;
													Static140.anInt3235 = Static154.anInt3614;
													Static142.anInt3253 = 1;
												}
											}
											Static46.method2852();
											if (local679 != Static58.aClass80_7) {
												if (local679 != null) {
													Static176.method2833(local679);
												}
												if (Static58.aClass80_7 != null) {
													Static176.method2833(Static58.aClass80_7);
												}
											}
											if (local821 != Static34.aClass80_1 && Static123.anInt1020 == Static42.anInt265) {
												if (local821 != null) {
													Static176.method2833(local821);
												}
												if (Static34.aClass80_1 != null) {
													Static176.method2833(Static34.aClass80_1);
												}
											}
											if (Static34.aClass80_1 == null) {
												if (Static42.anInt265 > 0) {
													Static42.anInt265--;
												}
											} else if (Static123.anInt1020 > Static42.anInt265) {
												Static42.anInt265++;
												if (Static123.anInt1020 == Static42.anInt265) {
													Static176.method2833(Static34.aClass80_1);
												}
											}
											Static161.method2614();
											if (Static160.aBoolean233) {
												Static212.method3254();
											}
											for (local92 = 0; local92 < 5; local92++) {
												@Pc(1142) int local1142 = Static168.anIntArray408[local92]++;
											}
											local94 = Static132.method2096();
											local96 = Static92.method1623();
											if (local94 > 4500 && local96 > 4500) {
												Static92.anInt2287 = 250;
												Static136.method2163(4000);
												Static131.aClass2_Sub3_Sub1_2.method221(226);
											}
											Static97.anInt2381++;
											Static67.anInt1758++;
											Static129.anInt566++;
											if (Static97.anInt2381 > 500) {
												Static97.anInt2381 = 0;
												local113 = (int) (Math.random() * 8.0D);
												if ((local113 & 0x4) == 4) {
													Static85.anInt2165 += Static27.anInt2300;
												}
												if ((local113 & 0x2) == 2) {
													Static30.anInt722 += Static206.anInt4611;
												}
												if ((local113 & 0x1) == 1) {
													Static198.anInt4446 += Static121.anInt4789;
												}
											}
											if (Static67.anInt1758 > 500) {
												Static67.anInt1758 = 0;
												local113 = (int) (Math.random() * 8.0D);
												if ((local113 & 0x2) == 2) {
													Static58.anInt1635 += Static146.anInt3318;
												}
												if ((local113 & 0x1) == 1) {
													Static47.anInt1372 += Static77.anInt1998;
												}
											}
											if (Static58.anInt1635 < -20) {
												Static146.anInt3318 = 1;
											}
											if (Static58.anInt1635 > 10) {
												Static146.anInt3318 = -1;
											}
											if (Static30.anInt722 < -55) {
												Static206.anInt4611 = 2;
											}
											if (Static47.anInt1372 < -60) {
												Static77.anInt1998 = 2;
											}
											if (Static85.anInt2165 < -40) {
												Static27.anInt2300 = 1;
											}
											if (Static30.anInt722 > 55) {
												Static206.anInt4611 = -2;
											}
											if (Static85.anInt2165 > 40) {
												Static27.anInt2300 = -1;
											}
											if (Static47.anInt1372 > 60) {
												Static77.anInt1998 = -2;
											}
											if (Static198.anInt4446 < -50) {
												Static121.anInt4789 = 2;
											}
											if (Static198.anInt4446 > 50) {
												Static121.anInt4789 = -2;
											}
											if (Static129.anInt566 > 50) {
												Static131.aClass2_Sub3_Sub1_2.method221(19);
											}
											try {
												if (Static30.aClass63_1 != null && Static131.aClass2_Sub3_Sub1_2.anInt239 > 0) {
													Static30.aClass63_1.method2037(Static131.aClass2_Sub3_Sub1_2.anInt239, Static131.aClass2_Sub3_Sub1_2.aByteArray4);
													Static131.aClass2_Sub3_Sub1_2.anInt239 = 0;
													Static129.anInt566 = 0;
													return;
												}
												return;
											} catch (@Pc(1354) IOException local1354) {
												Static177.method2842();
												return;
											}
										}
										local879 = local874.aClass80_3;
										if (local879.anInt3649 < 0) {
											break;
										}
										local887 = Static212.method3256(local879.anInt3697);
									} while (local887 == null || local887.aClass80Array1 == null || local879.anInt3649 >= local887.aClass80Array1.length || local887.aClass80Array1[local879.anInt3649] != local879);
									Static176.method2835(local874);
								}
							}
							local879 = local874.aClass80_3;
							if (local879.anInt3649 < 0) {
								break;
							}
							local887 = Static212.method3256(local879.anInt3697);
						} while (local887 == null || local887.aClass80Array1 == null || local887.aClass80Array1.length <= local879.anInt3649 || local887.aClass80Array1[local879.anInt3649] != local879);
						Static176.method2835(local874);
					}
				}
				local879 = local874.aClass80_3;
				if (local879.anInt3649 < 0) {
					break;
				}
				local887 = Static212.method3256(local879.anInt3697);
			} while (local887 == null || local887.aClass80Array1 == null || local887.aClass80Array1.length <= local879.anInt3649 || local879 != local887.aClass80Array1[local879.anInt3649]);
			Static176.method2835(local874);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1756(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static39.aClass11_1);
		arg0.removeMouseMotionListener(Static39.aClass11_1);
		arg0.removeFocusListener(Static39.aClass11_1);
		Static42.anInt217 = 0;
	}
}
