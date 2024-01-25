import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
	public static int anInt6445;

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_46 = new Class116();

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILclient!qb;II)V")
	public static void method5433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub36 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg1 << 14 | arg3 << 28 | arg0);
		@Pc(22) Class4_Sub19 local22 = (Class4_Sub19) Static165.aClass43_20.method1273(local16);
		if (local22 == null) {
			local22 = new Class4_Sub19();
			Static165.aClass43_20.method1276(local22, local16);
			local22.aClass116_15.method3274(arg2);
			return;
		}
		@Pc(44) Class210 local44 = Static177.method3465(arg2.anInt5156);
		@Pc(47) int local47 = local44.anInt6519;
		if (local44.anInt6501 == 1) {
			local47 *= arg2.anInt5159 + 1;
		}
		for (@Pc(72) Class4_Sub36 local72 = (Class4_Sub36) local22.aClass116_15.method3270(); local72 != null; local72 = (Class4_Sub36) local22.aClass116_15.method3272()) {
			local44 = Static177.method3465(local72.anInt5156);
			@Pc(82) int local82 = local44.anInt6519;
			if (local44.anInt6501 == 1) {
				local82 *= local72.anInt5159 + 1;
			}
			if (local47 > local82) {
				Static262.method4565(arg2, local72);
				return;
			}
		}
		local22.aClass116_15.method3274(arg2);
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(B)V")
	public static void method5434() {
		if (Static128.anInt3034 > 0) {
			Static128.anInt3034--;
		}
		if (Static258.anInt5208 > 1) {
			Static258.anInt5208--;
			Static248.anInt5059 = Static66.anInt1751;
		}
		if (Static357.aBoolean490) {
			Static357.aBoolean490 = false;
			Static291.method4882();
			return;
		}
		if (!Static272.aBoolean393) {
			Static188.method3568();
		}
		for (@Pc(41) int local41 = 0; local41 < 100 && Static256.method4470(); local41++) {
		}
		if (Static139.anInt3199 != 30) {
			return;
		}
		Static108.method2352(Static15.aClass4_Sub11_Sub1_2);
		@Pc(80) int local80;
		@Pc(101) int local101;
		@Pc(119) int local119;
		@Pc(135) boolean local135;
		@Pc(186) int local186;
		@Pc(193) int local193;
		@Pc(204) int local204;
		if (Static138.aClass4_Sub28_2 != null || Static251.aLong157 < Static208.method3879() - 2000L) {
			@Pc(77) boolean local77 = false;
			local80 = Static15.aClass4_Sub11_Sub1_2.anInt3768;
			for (@Pc(85) Class4_Sub28 local85 = (Class4_Sub28) Static37.aClass116_3.method3270(); local85 != null && Static15.aClass4_Sub11_Sub1_2.anInt3768 - local80 < 240; local85 = (Class4_Sub28) Static37.aClass116_3.method3272()) {
				local85.method5687();
				local101 = local85.method5559();
				if (local101 < 0) {
					local101 = 0;
				} else if (local101 > 65534) {
					local101 = 65534;
				}
				local119 = local85.method5555();
				if (local119 < 0) {
					local119 = 0;
				} else if (local119 > 65534) {
					local119 = 65534;
				}
				local135 = false;
				if (local85.method5559() == -1 && local85.method5555() == -1) {
					local101 = -1;
					local119 = -1;
					local135 = true;
				}
				if (Static221.anInt2808 != local119 || Static266.anInt5335 != local101) {
					if (!local77) {
						Static15.aClass4_Sub11_Sub1_2.method706(81);
						Static15.aClass4_Sub11_Sub1_2.method3434(0);
						local77 = true;
						local80 = Static15.aClass4_Sub11_Sub1_2.anInt3768;
					}
					local186 = local119 - Static221.anInt2808;
					Static221.anInt2808 = local119;
					local193 = local101 - Static266.anInt5335;
					Static266.anInt5335 = local101;
					local204 = (int) ((local85.method5560() - Static251.aLong157) / 20L);
					if (local204 < 8 && local186 >= -32 && local186 <= 31 && local193 >= -32 && local193 <= 31) {
						local186 += 32;
						local193 += 32;
						Static15.aClass4_Sub11_Sub1_2.method3402((local204 << 12) + (local186 << 6) + local193);
					} else if (local204 < 32 && local186 >= -128 && local186 <= 127 && local193 >= -128 && local193 <= 127) {
						local193 += 128;
						local186 += 128;
						Static15.aClass4_Sub11_Sub1_2.method3434(local204 + 128);
						Static15.aClass4_Sub11_Sub1_2.method3402((local186 << 8) + local193);
					} else if (local204 < 32) {
						Static15.aClass4_Sub11_Sub1_2.method3434(local204 + 192);
						if (local135) {
							Static15.aClass4_Sub11_Sub1_2.method3452(Integer.MIN_VALUE);
						} else {
							Static15.aClass4_Sub11_Sub1_2.method3452(local101 << 16 | local119);
						}
					} else {
						Static15.aClass4_Sub11_Sub1_2.method3402(local204 + 57344);
						if (local135) {
							Static15.aClass4_Sub11_Sub1_2.method3452(Integer.MIN_VALUE);
						} else {
							Static15.aClass4_Sub11_Sub1_2.method3452(local101 << 16 | local119);
						}
					}
					Static251.aLong157 = local85.method5560();
				}
			}
			if (local77) {
				Static15.aClass4_Sub11_Sub1_2.method3458(Static15.aClass4_Sub11_Sub1_2.anInt3768 - local80);
			}
		}
		@Pc(380) int local380;
		@Pc(430) int local430;
		if (Static138.aClass4_Sub28_2 != null) {
			@Pc(366) long local366 = (Static138.aClass4_Sub28_2.method5560() - Static176.aLong58) / 50L;
			if (local366 > 32767L) {
				local366 = 32767L;
			}
			Static176.aLong58 = Static138.aClass4_Sub28_2.method5560();
			local380 = Static138.aClass4_Sub28_2.method5559();
			if (local380 < 0) {
				local380 = 0;
			} else if (local380 > 65535) {
				local380 = 65535;
			}
			local101 = Static138.aClass4_Sub28_2.method5555();
			if (local101 < 0) {
				local101 = 0;
			} else if (local101 > 65535) {
				local101 = 65535;
			}
			@Pc(416) byte local416 = 0;
			if (Static138.aClass4_Sub28_2.method5558() == 2) {
				local416 = 1;
			}
			local430 = (int) local366;
			Static15.aClass4_Sub11_Sub1_2.method706(68);
			Static15.aClass4_Sub11_Sub1_2.method3452(local101 | local380 << 16);
			Static15.aClass4_Sub11_Sub1_2.method3402(local430 | local416 << 15);
		}
		@Pc(454) int local454;
		if (Static11.anInt241 > 0) {
			local454 = 0;
			for (local80 = 0; local80 < Static11.anInt241; local80++) {
				if (Static88.aClass157Array1[local80].method5192()) {
					local454++;
				}
			}
			if (local454 > 0) {
				Static15.aClass4_Sub11_Sub1_2.method706(143);
				if (local454 > 75) {
					local454 = 75;
				}
				Static15.aClass4_Sub11_Sub1_2.method3434(local454 * 3);
				for (local380 = 0; local380 < Static11.anInt241; local380++) {
					@Pc(502) Class157 local502 = Static88.aClass157Array1[local380];
					if (local502.method5192()) {
						@Pc(514) long local514 = (local502.method5191() - Static4.aLong167) / 50L;
						if (local514 > 65535L) {
							local514 = 65535L;
						}
						Static4.aLong167 = local502.method5191();
						Static15.aClass4_Sub11_Sub1_2.method3434(local502.method5193());
						Static15.aClass4_Sub11_Sub1_2.method3402((int) local514);
					}
				}
			}
		}
		if (Static43.anInt1144 > 0) {
			Static43.anInt1144--;
		}
		if (Static73.aBoolean138 && Static43.anInt1144 <= 0) {
			Static73.aBoolean138 = false;
			Static43.anInt1144 = 20;
			Static15.aClass4_Sub11_Sub1_2.method706(125);
			Static15.aClass4_Sub11_Sub1_2.method3438((int) Static106.aFloat31 >> 3);
			Static15.aClass4_Sub11_Sub1_2.method3459((int) Static77.aFloat23 >> 3);
		}
		if (Static96.aBoolean470 && !Static282.aBoolean359) {
			Static282.aBoolean359 = true;
			Static15.aClass4_Sub11_Sub1_2.method706(193);
			Static15.aClass4_Sub11_Sub1_2.method3434(1);
		}
		if (!Static96.aBoolean470 && Static282.aBoolean359) {
			Static282.aBoolean359 = false;
			Static15.aClass4_Sub11_Sub1_2.method706(193);
			Static15.aClass4_Sub11_Sub1_2.method3434(0);
		}
		if (!Static313.aBoolean449) {
			Static15.aClass4_Sub11_Sub1_2.method706(105);
			Static15.aClass4_Sub11_Sub1_2.method3411(Static212.method2561());
			Static313.aBoolean449 = true;
		}
		if (Static273.aClass128ArrayArrayArray4 != null) {
			if (Static353.anInt2640 == 2) {
				Static97.method2226();
			} else if (Static353.anInt2640 == 3) {
				Static292.method4890();
			}
		}
		if (Static345.aBoolean488) {
			Static345.aBoolean488 = false;
		} else {
			Static172.aFloat67 /= 2.0F;
		}
		if (Static51.aBoolean101) {
			Static51.aBoolean101 = false;
		} else {
			Static168.aFloat98 /= 2.0F;
		}
		Static314.method5185();
		if (Static139.anInt3199 != 30) {
			return;
		}
		Static307.method5039();
		Static268.method4617();
		Static183.method3513();
		Static57.anInt1518++;
		if (Static57.anInt1518 > 750) {
			Static291.method4882();
			return;
		}
		Static75.method1746();
		Static253.method4461();
		Static166.method3254();
		for (local454 = Static190.method3609(true); local454 != -1; local454 = Static190.method3609(false)) {
			Static198.method3735(local454);
			Static269.anIntArray440[Static2.anInt57++ & 0x1F] = local454;
		}
		@Pc(769) Class21 local769;
		for (@Pc(741) Class4_Sub4_Sub18 local741 = Static272.method4653(); local741 != null; local741 = Static272.method4653()) {
			local380 = local741.method4910();
			local101 = local741.method4901();
			if (local380 == 1) {
				Static118.anIntArray244[local101] = local741.anInt5705;
				Static133.aBoolean245 |= Static169.aBooleanArray18[local101];
				Static91.anIntArray471[Static263.anInt6815++ & 0x1F] = local101;
			} else if (local380 == 2) {
				Static174.aStringArray45[local101] = local741.aString58;
				Static331.anIntArray489[Static182.anInt3852++ & 0x1F] = local101;
			} else if (local380 == 3) {
				local769 = Static92.method534(local101);
				if (!local741.aString58.equals(local769.aString12)) {
					local769.aString12 = local741.aString58;
					Static349.method5536(local769);
				}
			} else if (local380 == 4) {
				local769 = Static92.method534(local101);
				local430 = local741.anInt5705;
				local186 = local741.anInt5703;
				local193 = local741.anInt5704;
				if (local430 != local769.anInt787 || local769.anInt771 != local186 || local193 != local769.anInt745) {
					local769.anInt787 = local430;
					local769.anInt771 = local186;
					local769.anInt745 = local193;
					Static349.method5536(local769);
				}
			} else if (local380 == 5) {
				local769 = Static92.method534(local101);
				if (local741.anInt5705 != local769.anInt716 || local741.anInt5705 == -1) {
					local769.anInt756 = 0;
					local769.anInt749 = 0;
					local769.anInt764 = 1;
					local769.anInt716 = local741.anInt5705;
					Static349.method5536(local769);
				}
			} else if (local380 == 6) {
				local119 = local741.anInt5705;
				local430 = local119 >> 10 & 0x1F;
				local186 = local119 >> 5 & 0x1F;
				local193 = local119 & 0x1F;
				local204 = (local430 << 19) + (local186 << 11) + (local193 << 3);
				@Pc(890) Class21 local890 = Static92.method534(local101);
				if (local204 != local890.anInt724) {
					local890.anInt724 = local204;
					Static349.method5536(local890);
				}
			} else if (local380 == 7) {
				local769 = Static92.method534(local101);
				local135 = local741.anInt5705 == 1;
				if (local769.aBoolean79 != local135) {
					local769.aBoolean79 = local135;
					Static349.method5536(local769);
				}
			} else if (local380 == 8) {
				local769 = Static92.method534(local101);
				if (local741.anInt5705 != local769.anInt734 || local769.anInt783 != local741.anInt5703 || local769.anInt748 != local741.anInt5704) {
					local769.anInt748 = local741.anInt5704;
					local769.anInt783 = local741.anInt5703;
					local769.anInt734 = local741.anInt5705;
					if (local769.anInt770 != -1) {
						if (local769.anInt750 > 0) {
							local769.anInt748 = local769.anInt748 * 32 / local769.anInt750;
						} else if (local769.anInt718 > 0) {
							local769.anInt748 = local769.anInt748 * 32 / local769.anInt718;
						}
					}
					Static349.method5536(local769);
				}
			} else if (local380 == 9) {
				local769 = Static92.method534(local101);
				if (local769.anInt770 != local741.anInt5705 || local769.anInt776 != local741.anInt5703) {
					local769.anInt770 = local741.anInt5705;
					local769.anInt776 = local741.anInt5703;
					Static349.method5536(local769);
				}
			} else if (local380 == 10) {
				local769 = Static92.method534(local101);
				if (local741.anInt5705 != local769.anInt720 || local741.anInt5703 != local769.anInt774 || local741.anInt5704 != local769.anInt755) {
					local769.anInt755 = local741.anInt5704;
					local769.anInt720 = local741.anInt5705;
					local769.anInt774 = local741.anInt5703;
					Static349.method5536(local769);
				}
			} else if (local380 == 11) {
				local769 = Static92.method534(local101);
				local769.aByte10 = 0;
				local769.aByte13 = 0;
				local769.anInt709 = local769.anInt743 = local741.anInt5705;
				local769.anInt712 = local769.anInt786 = local741.anInt5703;
				Static349.method5536(local769);
			} else if (local380 == 12) {
				local769 = Static92.method534(local101);
				local430 = local741.anInt5705;
				if (local769 != null && local769.anInt722 == 0) {
					if (local769.anInt761 - local769.anInt758 < local430) {
						local430 = local769.anInt761 - local769.anInt758;
					}
					if (local430 < 0) {
						local430 = 0;
					}
					if (local769.anInt736 != local430) {
						local769.anInt736 = local430;
						Static349.method5536(local769);
					}
				}
			} else if (local380 == 14) {
				local769 = Static92.method534(local101);
				local769.anInt788 = local741.anInt5705;
			} else if (local380 == 15) {
				Static10.aBoolean21 = true;
				Static18.anInt369 = local741.anInt5705;
				Static39.anInt1027 = local741.anInt5703;
			} else if (local380 == 16) {
				local769 = Static92.method534(local101);
				local769.anInt742 = local741.anInt5705;
			}
		}
		Static218.anInt4454++;
		if (Static215.anInt4410 != 0) {
			Static247.anInt5050 += 20;
			if (Static247.anInt5050 >= 400) {
				Static215.anInt4410 = 0;
			}
		}
		if (Static302.aClass21_15 != null) {
			Static332.anInt6353++;
			if (Static332.anInt6353 >= 15) {
				Static349.method5536(Static302.aClass21_15);
				Static302.aClass21_15 = null;
			}
		}
		Static173.aClass21_8 = null;
		Static284.aBoolean419 = false;
		Static211.aBoolean343 = false;
		Static181.aClass21_9 = null;
		Static308.method5087(null, -1, -1);
		Static290.method4876(null, -1, -1);
		Static201.method3776();
		Static66.anInt1751++;
		if (Static307.aBoolean442) {
			Static15.aClass4_Sub11_Sub1_2.method706(91);
			Static15.aClass4_Sub11_Sub1_2.method3411(Static77.anInt2070 | Static339.anInt8 << 14 | Static238.anInt5296 << 28);
			Static307.aBoolean442 = false;
		}
		while (true) {
			@Pc(1370) Class4_Sub34 local1370;
			@Pc(1375) Class21 local1375;
			do {
				local1370 = (Class4_Sub34) Static135.aClass116_26.method3266();
				if (local1370 == null) {
					while (true) {
						do {
							local1370 = (Class4_Sub34) Static301.aClass116_44.method3266();
							if (local1370 == null) {
								while (true) {
									do {
										local1370 = (Class4_Sub34) Static318.aClass116_45.method3266();
										if (local1370 == null) {
											if (Static173.aClass21_8 == null) {
												Static93.anInt2506 = 0;
											}
											if (Static103.aClass21_5 != null) {
												Static195.method3696();
											}
											if (Static23.anInt452 > 0 && Static264.aClass92_3.method2620(82) && Static264.aClass92_3.method2620(81) && Static310.anInt6021 != 0) {
												local380 = Static12.anInt267 - Static310.anInt6021;
												if (local380 < 0) {
													local380 = 0;
												} else if (local380 > 3) {
													local380 = 3;
												}
												Static296.method4922(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0] + Static286.anInt6699, Static136.anInt3193 + Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local380);
											}
											Static308.method5088();
											for (local380 = 0; local380 < 5; local380++) {
												@Pc(1567) int local1567 = Static149.anIntArray333[local380]++;
											}
											if (Static133.aBoolean245 && Static208.method3879() - 60000L > Static150.aLong96) {
												Static149.method3565();
											}
											Static51.anInt1372++;
											if (Static51.anInt1372 > 500) {
												Static51.anInt1372 = 0;
												local101 = (int) (Math.random() * 8.0D);
												if ((local101 & 0x4) == 4) {
													Static70.anInt1840 += Static142.anInt3234;
												}
												if ((local101 & 0x1) == 1) {
													Static245.anInt5012 += Static258.anInt5209;
												}
												if ((local101 & 0x2) == 2) {
													Static243.anInt5994 += Static340.anInt6524;
												}
											}
											if (Static245.anInt5012 < -50) {
												Static258.anInt5209 = 2;
											}
											if (Static245.anInt5012 > 50) {
												Static258.anInt5209 = -2;
											}
											if (Static243.anInt5994 < -55) {
												Static340.anInt6524 = 2;
											}
											if (Static243.anInt5994 > 55) {
												Static340.anInt6524 = -2;
											}
											if (Static70.anInt1840 < -40) {
												Static142.anInt3234 = 1;
											}
											if (Static70.anInt1840 > 40) {
												Static142.anInt3234 = -1;
											}
											Static171.anInt3662++;
											if (Static171.anInt3662 > 500) {
												Static171.anInt3662 = 0;
												local101 = (int) (Math.random() * 8.0D);
												if ((local101 & 0x1) == 1) {
													Static75.anInt1928 += Static133.anInt3105;
												}
												if ((local101 & 0x2) == 2) {
													Static255.anInt5169 += Static277.anInt5512;
												}
											}
											if (Static75.anInt1928 < -60) {
												Static133.anInt3105 = 2;
											}
											if (Static75.anInt1928 > 60) {
												Static133.anInt3105 = -2;
											}
											if (Static255.anInt5169 < -20) {
												Static277.anInt5512 = 1;
											}
											if (Static255.anInt5169 > 10) {
												Static277.anInt5512 = -1;
											}
											Static165.anInt3518++;
											if (Static165.anInt3518 > 50) {
												Static15.aClass4_Sub11_Sub1_2.method706(156);
											}
											if (Static156.aBoolean385) {
												Static314.method5183();
												Static156.aBoolean385 = false;
											}
											try {
												if (Static155.aClass114_3 != null && Static15.aClass4_Sub11_Sub1_2.anInt3768 > 0) {
													Static155.aClass114_3.method3163(Static15.aClass4_Sub11_Sub1_2.aByteArray55, Static15.aClass4_Sub11_Sub1_2.anInt3768);
													Static15.aClass4_Sub11_Sub1_2.anInt3768 = 0;
													Static165.anInt3518 = 0;
													return;
												}
												return;
											} catch (@Pc(1768) IOException local1768) {
												Static291.method4882();
												return;
											}
										}
										local1375 = local1370.aClass21_12;
										if (local1375.anInt791 < 0) {
											break;
										}
										local769 = Static92.method534(local1375.anInt723);
									} while (local769 == null || local769.aClass21Array1 == null || local1375.anInt791 >= local769.aClass21Array1.length || local1375 != local769.aClass21Array1[local1375.anInt791]);
									Static164.method3189(local1370);
								}
							}
							local1375 = local1370.aClass21_12;
							if (local1375.anInt791 < 0) {
								break;
							}
							local769 = Static92.method534(local1375.anInt723);
						} while (local769 == null || local769.aClass21Array1 == null || local769.aClass21Array1.length <= local1375.anInt791 || local769.aClass21Array1[local1375.anInt791] != local1375);
						Static164.method3189(local1370);
					}
				}
				local1375 = local1370.aClass21_12;
				if (local1375.anInt791 < 0) {
					break;
				}
				local769 = Static92.method534(local1375.anInt723);
			} while (local769 == null || local769.aClass21Array1 == null || local769.aClass21Array1.length <= local1375.anInt791 || local1375 != local769.aClass21Array1[local1375.anInt791]);
			Static164.method3189(local1370);
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(IIII)V")
	public static void method5435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			Static15.aClass4_Sub11_Sub1_2.method706(205);
		}
		if (arg1 == 1) {
			Static15.aClass4_Sub11_Sub1_2.method706(28);
		}
		Static15.aClass4_Sub11_Sub1_2.method3438(arg2 + Static286.anInt6699);
		Static15.aClass4_Sub11_Sub1_2.method3441(Static264.aClass92_3.method2620(82) ? 1 : 0);
		Static15.aClass4_Sub11_Sub1_2.method3402(Static136.anInt3193 + arg0);
		Static10.aBoolean21 = false;
		Static39.anInt1027 = arg0;
		Static18.anInt369 = arg2;
		Static342.method5467();
	}
}
