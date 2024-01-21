import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public static int anInt1849;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt1850;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!ce;")
	public static Class13 aClass13_4;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	public static int anInt1855;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!wb;")
	public static Class65 aClass65_835 = Static24.method441(":  ");

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!wb;")
	private static Class65 aClass65_837 = Static24.method441("Error loading your profile)3");

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Lclient!wb;")
	public static Class65 aClass65_836 = aClass65_837;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!wb;")
	private static Class65 aClass65_840 = Static24.method441("wishes to duel with you)3");

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!wb;")
	public static Class65 aClass65_838 = aClass65_840;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	public static int[] anIntArray248 = new int[2048];

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!wb;")
	public static Class65 aClass65_839 = Static24.method441("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6 = new int[4][105][105];

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	public static int anInt1856 = -1;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "[I")
	public static int[] anIntArray249 = new int[100];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
	public static boolean method1080(@OriginalArg(0) int arg0) {
		if (!Static46.method816(arg0)) {
			return false;
		}
		@Pc(18) boolean local18 = false;
		@Pc(22) Class2_Sub1_Sub2[] local22 = Static89.aClass2_Sub1_Sub2ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class2_Sub1_Sub2 local30 = local22[local24];
			if (local30 != null && local30.anInt179 == 6) {
				@Pc(55) int local55;
				if (local30.anInt154 != -1 || local30.anInt177 != -1) {
					@Pc(50) boolean local50 = Static80.method1359(local30);
					if (local50) {
						local55 = local30.anInt177;
					} else {
						local55 = local30.anInt154;
					}
					if (local55 != -1) {
						@Pc(68) Class2_Sub1_Sub6 local68 = Static71.method1291(local55);
						local30.anInt196 += Static28.anInt794;
						label50: while (true) {
							do {
								do {
									if (local68.anIntArray157[local30.anInt190] >= local30.anInt196) {
										break label50;
									}
									local18 = true;
									local30.anInt196 -= local68.anIntArray157[local30.anInt190];
									local30.anInt190++;
								} while (local68.anIntArray155.length > local30.anInt190);
								local30.anInt190 -= local68.anInt1205;
							} while (local30.anInt190 >= 0 && local68.anIntArray155.length > local30.anInt190);
							local30.anInt190 = 0;
						}
					}
				}
				if (local30.anInt182 != 0) {
					local18 = true;
					@Pc(144) int local144 = local30.anInt182 >> 16;
					local55 = local30.anInt182 << 16 >> 16;
					@Pc(155) int local155 = local144 * Static28.anInt794;
					local30.anInt195 = local30.anInt195 + local155 & 0x7FF;
					local55 *= Static28.anInt794;
					local30.anInt165 = local30.anInt165 + local55 & 0x7FF;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIBI)V")
	public static void method1081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = 2048 - arg2 & 0x7FF;
		@Pc(25) int local25 = 2048 - arg5 & 0x7FF;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = arg1;
		@Pc(31) int local31 = 0;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(52) int local52;
		if (local18 != 0) {
			local37 = Static86.anIntArray354[local18];
			local41 = Static86.anIntArray363[local18];
			local52 = local41 * 0 - local37 * arg1 >> 16;
			local29 = local37 * 0 + arg1 * local41 >> 16;
			local31 = local52;
		}
		if (local25 != 0) {
			local37 = Static86.anIntArray354[local25];
			local41 = Static86.anIntArray363[local25];
			local52 = local29 * local37 + local41 * 0 >> 16;
			local29 = local29 * local41 - local37 * 0 >> 16;
			local27 = local52;
		}
		Static9.anInt318 = arg2;
		Static51.anInt1481 = arg0 - local29;
		Static97.anInt2699 = arg5;
		Static26.anInt2923 = arg4 - local31;
		Static87.anInt2520 = arg3 - local27;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method1082() {
		Static92.anInt2580 = 0;
		@Pc(76) int local76;
		for (@Pc(9) int local9 = -1; local9 < Static51.anInt1482 + Static54.anInt1640; local9++) {
			@Pc(16) Class2_Sub1_Sub1_Sub2 local16;
			if (local9 == -1) {
				local16 = Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1;
			} else if (Static54.anInt1640 <= local9) {
				local16 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[Static23.anIntArray92[local9 - Static54.anInt1640]];
			} else {
				local16 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[Static24.anIntArray99[local9]];
			}
			if (local16 != null && local16.method925()) {
				@Pc(56) Class2_Sub1_Sub11 local56;
				if (local16 instanceof Class2_Sub1_Sub1_Sub2_Sub1) {
					local56 = ((Class2_Sub1_Sub1_Sub2_Sub1) local16).aClass2_Sub1_Sub11_1;
					if (local56.anIntArray285 != null) {
						local56 = local56.method1262();
					}
					if (local56 == null) {
						continue;
					}
				}
				if (Static54.anInt1640 <= local9) {
					local56 = ((Class2_Sub1_Sub1_Sub2_Sub1) local16).aClass2_Sub1_Sub11_1;
					if (local56.anInt2097 >= 0 && local56.anInt2097 < Static38.aClass2_Sub1_Sub4_Sub2Array6.length) {
						Static102.method1718(local16.anInt1523 + 15, local16);
						if (Static98.anInt2759 > -1) {
							Static38.aClass2_Sub1_Sub4_Sub2Array6[local56.anInt2097].method486(Static98.anInt2759 - 12, Static17.anInt575 + -30);
						}
					}
					if (Static108.anInt2865 == 1 && Static23.anIntArray92[local9 - Static54.anInt1640] == Static99.anInt2539 && Static108.anInt2902 % 20 < 10) {
						Static102.method1718(local16.anInt1523 + 15, local16);
						if (Static98.anInt2759 > -1) {
							Static102.aClass2_Sub1_Sub4_Sub2Array9[0].method486(Static98.anInt2759 - 12, Static17.anInt575 + -28);
						}
					}
				} else {
					local76 = 30;
					@Pc(79) Class2_Sub1_Sub1_Sub2_Sub2 local79 = (Class2_Sub1_Sub1_Sub2_Sub2) local16;
					if (local79.anInt1597 != -1 || local79.anInt1587 != -1) {
						Static102.method1718(local16.anInt1523 + 15, local16);
						if (Static98.anInt2759 > -1) {
							if (local79.anInt1597 != -1) {
								Static6.aClass2_Sub1_Sub4_Sub2Array4[local79.anInt1597].method486(Static98.anInt2759 - 12, Static17.anInt575 + -30);
								local76 += 25;
							}
							if (local79.anInt1587 != -1) {
								Static38.aClass2_Sub1_Sub4_Sub2Array6[local79.anInt1587].method486(Static98.anInt2759 - 12, -local76 + Static17.anInt575);
								local76 += 25;
							}
						}
					}
					if (local9 >= 0 && Static108.anInt2865 == 10 && Static24.anIntArray99[local9] == Static25.anInt729) {
						Static102.method1718(local16.anInt1523 + 15, local16);
						if (Static98.anInt2759 > -1) {
							Static102.aClass2_Sub1_Sub4_Sub2Array9[1].method486(Static98.anInt2759 - 12, -local76 + Static17.anInt575);
						}
					}
				}
				if (local16.aClass65_707 != null && (Static54.anInt1640 <= local9 || Static103.anInt2811 == 0 || Static103.anInt2811 == 3 || Static103.anInt2811 == 1 && Static4.method102(((Class2_Sub1_Sub1_Sub2_Sub2) local16).aClass65_726))) {
					Static102.method1718(local16.anInt1523, local16);
					if (Static98.anInt2759 > -1 && Static59.anInt1804 > Static92.anInt2580) {
						Static59.anIntArray238[Static92.anInt2580] = Static38.aClass2_Sub1_Sub4_Sub4_1.method1839(local16.aClass65_707) / 2;
						Static59.anIntArray240[Static92.anInt2580] = Static38.aClass2_Sub1_Sub4_Sub4_1.anInt2931;
						Static59.anIntArray235[Static92.anInt2580] = Static98.anInt2759;
						Static59.anIntArray239[Static92.anInt2580] = Static17.anInt575;
						Static59.anIntArray241[Static92.anInt2580] = local16.anInt1529;
						Static59.anIntArray245[Static92.anInt2580] = local16.anInt1551;
						Static59.anIntArray244[Static92.anInt2580] = local16.anInt1531;
						Static59.aClass65Array7[Static92.anInt2580] = local16.aClass65_707;
						Static92.anInt2580++;
					}
				}
				if (local16.anInt1543 > Static108.anInt2902) {
					Static102.method1718(local16.anInt1523 + 15, local16);
					if (Static98.anInt2759 > -1) {
						local76 = local16.anInt1530 * 30 / local16.anInt1532;
						if (local76 > 30) {
							local76 = 30;
						}
						Static43.method1815(Static98.anInt2759 - 15, Static17.anInt575 + -3, local76, 5, 65280);
						Static43.method1815(local76 + Static98.anInt2759 - 15, Static17.anInt575 + -3, 30 - local76, 5, 16711680);
					}
				}
				for (local76 = 0; local76 < 4; local76++) {
					if (Static108.anInt2902 < local16.anIntArray212[local76]) {
						Static102.method1718(local16.anInt1523 / 2, local16);
						if (Static98.anInt2759 > -1) {
							if (local76 == 1) {
								Static17.anInt575 -= 20;
							}
							if (local76 == 2) {
								Static17.anInt575 -= 10;
								Static98.anInt2759 -= 15;
							}
							if (local76 == 3) {
								Static98.anInt2759 += 15;
								Static17.anInt575 -= 10;
							}
							Static97.aClass2_Sub1_Sub4_Sub2Array8[local16.anIntArray211[local76]].method486(Static98.anInt2759 - 12, Static17.anInt575 + -12);
							Static60.aClass2_Sub1_Sub4_Sub4_2.method1838(Static93.method1617(local16.anIntArray210[local76]), Static98.anInt2759, Static17.anInt575 + 4, 0);
							Static60.aClass2_Sub1_Sub4_Sub4_2.method1838(Static93.method1617(local16.anIntArray210[local76]), Static98.anInt2759 - 1, Static17.anInt575 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(496) int local496 = 0; local496 < Static92.anInt2580; local496++) {
			local76 = Static59.anIntArray235[local496];
			@Pc(506) int local506 = Static59.anIntArray238[local496];
			@Pc(510) int local510 = Static59.anIntArray239[local496];
			@Pc(514) int local514 = Static59.anIntArray240[local496];
			@Pc(516) boolean local516 = true;
			while (local516) {
				local516 = false;
				for (@Pc(522) int local522 = 0; local522 < local496; local522++) {
					if (Static59.anIntArray239[local522] - Static59.anIntArray240[local522] < local510 - -2 && local510 - local514 < Static59.anIntArray239[local522] - -2 && Static59.anIntArray238[local522] + Static59.anIntArray235[local522] > local76 - local506 && Static59.anIntArray235[local522] - Static59.anIntArray238[local522] < local506 + local76 && Static59.anIntArray239[local522] - Static59.anIntArray240[local522] < local510) {
						local510 = Static59.anIntArray239[local522] - Static59.anIntArray240[local522];
						local516 = true;
					}
				}
			}
			Static98.anInt2759 = Static59.anIntArray235[local496];
			Static17.anInt575 = Static59.anIntArray239[local496] = local510;
			@Pc(621) Class65 local621 = Static59.aClass65Array7[local496];
			if (Static46.anInt1374 == 0) {
				@Pc(644) int local644 = 16776960;
				if (Static59.anIntArray241[local496] < 6) {
					local644 = Static24.anIntArray97[Static59.anIntArray241[local496]];
				}
				if (Static59.anIntArray241[local496] == 6) {
					local644 = Static100.anInt2785 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static59.anIntArray241[local496] == 7) {
					local644 = Static100.anInt2785 % 20 >= 10 ? 65535 : 255;
				}
				if (Static59.anIntArray241[local496] == 8) {
					local644 = Static100.anInt2785 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(713) int local713;
				if (Static59.anIntArray241[local496] == 9) {
					local713 = 150 - Static59.anIntArray244[local496];
					if (local713 < 50) {
						local644 = local713 * 1280 + 16711680;
					} else if (local713 < 100) {
						local644 = 16776960 + 16384000 - local713 * 327680;
					} else if (local713 < 150) {
						local644 = (local713 - 100) * 5 + 65280;
					}
				}
				if (Static59.anIntArray241[local496] == 10) {
					local713 = 150 - Static59.anIntArray244[local496];
					if (local713 < 50) {
						local644 = local713 * 5 + 16711680;
					} else if (local713 < 100) {
						local644 = 16384000 + 16711935 - local713 * 327680;
					} else if (local713 < 150) {
						local644 = (local713 - 100) * 327680 + 255 - (local713 + -100) * 5;
					}
				}
				if (Static59.anIntArray241[local496] == 11) {
					local713 = 150 - Static59.anIntArray244[local496];
					if (local713 < 50) {
						local644 = 16777215 - local713 * 327685;
					} else if (local713 < 100) {
						local644 = (local713 - 50) * 327685 + 65280;
					} else if (local713 < 150) {
						local644 = 16777215 - (local713 - 100) * 327680;
					}
				}
				if (Static59.anIntArray245[local496] == 0) {
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(local621, Static98.anInt2759, Static17.anInt575 + 1, 0);
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(local621, Static98.anInt2759, Static17.anInt575, local644);
				}
				if (Static59.anIntArray245[local496] == 1) {
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1820(local621, Static98.anInt2759, Static17.anInt575 + 1, 0, Static100.anInt2785);
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1820(local621, Static98.anInt2759, Static17.anInt575, local644, Static100.anInt2785);
				}
				if (Static59.anIntArray245[local496] == 2) {
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1836(local621, Static98.anInt2759, Static17.anInt575 + 1, 0, Static100.anInt2785);
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1836(local621, Static98.anInt2759, Static17.anInt575, local644, Static100.anInt2785);
				}
				if (Static59.anIntArray245[local496] == 3) {
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1821(local621, Static98.anInt2759, Static17.anInt575 + 1, 0, Static100.anInt2785, 150 - Static59.anIntArray244[local496]);
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1821(local621, Static98.anInt2759, Static17.anInt575, local644, Static100.anInt2785, 150 - Static59.anIntArray244[local496]);
				}
				@Pc(976) int local976;
				if (Static59.anIntArray245[local496] == 4) {
					local713 = Static38.aClass2_Sub1_Sub4_Sub4_1.method1839(local621);
					local976 = (local713 + 100) * (-Static59.anIntArray244[local496] + 150) / 150;
					Static43.method1807(Static98.anInt2759 - 50, 0, Static98.anInt2759 + 50, 334);
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1828(local621, Static98.anInt2759 + 50 - local976, Static17.anInt575 + 1, 0);
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1828(local621, Static98.anInt2759 + 50 - local976, Static17.anInt575, local644);
					Static43.method1812();
				}
				if (Static59.anIntArray245[local496] == 5) {
					local713 = 150 - Static59.anIntArray244[local496];
					local976 = 0;
					Static43.method1807(0, Static17.anInt575 - Static38.aClass2_Sub1_Sub4_Sub4_1.anInt2931 - 1, 512, Static17.anInt575 + 5);
					if (local713 < 25) {
						local976 = local713 - 25;
					} else if (local713 > 125) {
						local976 = local713 - 125;
					}
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(local621, Static98.anInt2759, local976 + Static17.anInt575 + 1, 0);
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(local621, Static98.anInt2759, Static17.anInt575 + local976, local644);
					Static43.method1812();
				}
			} else {
				Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(local621, Static98.anInt2759, Static17.anInt575 + 1, 0);
				Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(local621, Static98.anInt2759, Static17.anInt575, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method1083() {
		@Pc(9) int local9 = Static47.anInt1385 * 128 + 64;
		@Pc(15) int local15 = anInt1850 * 128 + 64;
		@Pc(23) int local23 = Static25.method447(Static62.anInt1879, local15, local9) - Static84.anInt2417;
		if (Static87.anInt2520 < local9) {
			Static87.anInt2520 += Static57.anInt1723 + (local9 - Static87.anInt2520) * Static54.anInt1639 / 1000;
			if (Static87.anInt2520 > local9) {
				Static87.anInt2520 = local9;
			}
		}
		if (local9 < Static87.anInt2520) {
			Static87.anInt2520 -= (Static87.anInt2520 - local9) * Static54.anInt1639 / 1000 + Static57.anInt1723;
			if (Static87.anInt2520 < local9) {
				Static87.anInt2520 = local9;
			}
		}
		if (Static26.anInt2923 < local23) {
			Static26.anInt2923 += Static57.anInt1723 + Static54.anInt1639 * (local23 - Static26.anInt2923) / 1000;
			if (Static26.anInt2923 > local23) {
				Static26.anInt2923 = local23;
			}
		}
		local9 = anInt1855 * 128 + 64;
		if (local23 < Static26.anInt2923) {
			Static26.anInt2923 -= Static57.anInt1723 + (Static26.anInt2923 - local23) * Static54.anInt1639 / 1000;
			if (local23 > Static26.anInt2923) {
				Static26.anInt2923 = local23;
			}
		}
		if (local15 > Static51.anInt1481) {
			Static51.anInt1481 += (local15 - Static51.anInt1481) * Static54.anInt1639 / 1000 + Static57.anInt1723;
			if (local15 < Static51.anInt1481) {
				Static51.anInt1481 = local15;
			}
		}
		if (Static51.anInt1481 > local15) {
			Static51.anInt1481 -= Static57.anInt1723 + (Static51.anInt1481 - local15) * Static54.anInt1639 / 1000;
			if (local15 > Static51.anInt1481) {
				Static51.anInt1481 = local15;
			}
		}
		local15 = Static99.anInt2541 * 128 + 64;
		local23 = Static25.method447(Static62.anInt1879, local15, local9) - Static89.anInt2554;
		@Pc(198) int local198 = local9 - Static87.anInt2520;
		@Pc(203) int local203 = local15 - Static51.anInt1481;
		@Pc(208) int local208 = local23 - Static26.anInt2923;
		@Pc(219) int local219 = (int) Math.sqrt((double) (local198 * local198 + local203 * local203));
		@Pc(230) int local230 = (int) (Math.atan2((double) local208, (double) local219) * 325.949D) & 0x7FF;
		@Pc(241) int local241 = (int) (Math.atan2((double) local198, (double) local203) * -325.949D) & 0x7FF;
		if (local230 < 128) {
			local230 = 128;
		}
		@Pc(251) int local251 = local241 - Static97.anInt2699;
		if (local251 > 1024) {
			local251 -= 2048;
		}
		if (local230 > 383) {
			local230 = 383;
		}
		if (local251 < -1024) {
			local251 += 2048;
		}
		if (Static9.anInt318 < local230) {
			Static9.anInt318 += Static33.anInt2338 * (local230 - Static9.anInt318) / 1000 + Static21.anInt2493;
			if (Static9.anInt318 > local230) {
				Static9.anInt318 = local230;
			}
		}
		if (Static9.anInt318 > local230) {
			Static9.anInt318 -= (Static9.anInt318 - local230) * Static33.anInt2338 / 1000 + Static21.anInt2493;
			if (Static9.anInt318 < local230) {
				Static9.anInt318 = local230;
			}
		}
		if (local251 > 0) {
			Static97.anInt2699 += Static21.anInt2493 + local251 * Static33.anInt2338 / 1000;
			Static97.anInt2699 &= 0x7FF;
		}
		if (local251 < 0) {
			Static97.anInt2699 -= Static21.anInt2493 + Static33.anInt2338 * -local251 / 1000;
			Static97.anInt2699 &= 0x7FF;
		}
		@Pc(363) int local363 = local241 - Static97.anInt2699;
		if (local363 > 1024) {
			local363 -= 2048;
		}
		if (local363 < -1024) {
			local363 += 2048;
		}
		if (local363 < 0 && local251 > 0 || local363 > 0 && local251 < 0) {
			Static97.anInt2699 = local241;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z")
	public static boolean method1084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0 && arg0 == Static46.anInt1373) {
			return true;
		} else if (arg1 == 1 && arg0 == Static69.anInt2069) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static67.anInt2023 == arg0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1085() {
		Static8.anInt307 = -1;
		Static24.anInt717 = 0;
		Static56.anInt1693 = -1;
		Static57.anInt1714 = -1;
		Static57.anInt1718 = 0;
		Static108.anInt2897 = 0;
		Static24.anInt719 = 0;
		Static41.anInt1302 = -1;
		Static99.anInt2533 = 0;
		Static33.anInt2359 = 0;
		Static12.aClass2_Sub8_Sub1_8.anInt2342 = 0;
		Static51.aBoolean83 = false;
		Static59.aClass2_Sub8_Sub1_19.anInt2342 = 0;
		for (@Pc(39) int local39 = 0; local39 < Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1.length; local39++) {
			if (Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local39] != null) {
				Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local39].anInt1527 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1.length; local57++) {
			if (Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local57] != null) {
				Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local57].anInt1527 = -1;
			}
		}
		Static76.method1307(30);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
	public static void method1086() {
		aClass65_836 = null;
		anIntArray248 = null;
		anIntArray249 = null;
		aClass65_837 = null;
		aClass65_840 = null;
		aClass65_839 = null;
		anIntArrayArrayArray6 = null;
		aClass65_835 = null;
		aClass65_838 = null;
		aClass13_4 = null;
	}
}
