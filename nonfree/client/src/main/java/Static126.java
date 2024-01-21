import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!ob;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3[] aClass2_Sub1_Sub9_Sub3Array10;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1202 = Static2.method59("hitmarks");

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1203 = Static2.method59("::fpsoff");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIII)I")
	public static int method1983(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static108.aByteArrayArrayArray7[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static108.aByteArrayArrayArray7[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!se;I)V")
	public static void method1986(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0) {
		if (arg0.anInt2383 == Static10.anInt300 || arg0.anInt2374 == -1 || arg0.anInt2353 != 0 || arg0.anInt2358 + 1 > Static93.method1443(arg0.anInt2374).anIntArray174[arg0.anInt2339]) {
			@Pc(42) int local42 = arg0.anInt2383 - arg0.anInt2366;
			@Pc(48) int local48 = Static10.anInt300 - arg0.anInt2366;
			@Pc(58) int local58 = arg0.anInt2364 * 64 + arg0.anInt2325 * 128;
			@Pc(69) int local69 = arg0.anInt2332 * 128 + arg0.anInt2364 * 64;
			@Pc(80) int local80 = arg0.anInt2320 * 128 + arg0.anInt2364 * 64;
			@Pc(91) int local91 = arg0.anInt2341 * 128 + arg0.anInt2364 * 64;
			arg0.anInt2370 = (local58 * (local42 - local48) + local48 * local91) / local42;
			arg0.anInt2324 = ((local42 - local48) * local69 + local48 * local80) / local42;
		}
		arg0.anInt2336 = 0;
		if (arg0.anInt2376 == 0) {
			arg0.anInt2375 = 1024;
		}
		if (arg0.anInt2376 == 1) {
			arg0.anInt2375 = 1536;
		}
		if (arg0.anInt2376 == 2) {
			arg0.anInt2375 = 0;
		}
		if (arg0.anInt2376 == 3) {
			arg0.anInt2375 = 512;
		}
		arg0.anInt2347 = arg0.anInt2375;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public static void method1989() {
		aClass80_1202 = null;
		aClass55_1 = null;
		aClass2_Sub1_Sub9_Sub3Array10 = null;
		aClass80_1203 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIIZZ)Lclient!ce;")
	public static Class11_Sub1 method1992(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class60 local10 = null;
		if (Static95.aClass6_3 != null) {
			local10 = new Class60(arg1, Static95.aClass6_3, Static67.aClass6Array1[arg1], 1000000);
		}
		return new Class11_Sub1(local10, Static27.aClass60_3, arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	public static void method1993() {
		Static62.anInt1798 = 0;
		@Pc(170) int local170;
		for (@Pc(11) int local11 = -1; local11 < Static110.anInt2908 + Static92.anInt2273; local11++) {
			@Pc(19) Class2_Sub1_Sub1_Sub4 local19;
			if (local11 == -1) {
				local19 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1;
			} else if (local11 < Static92.anInt2273) {
				local19 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static53.anIntArray208[local11]];
			} else {
				local19 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static85.anIntArray277[local11 - Static92.anInt2273]];
			}
			if (local19 != null && local19.method1431()) {
				@Pc(60) Class2_Sub1_Sub13 local60;
				if (local19 instanceof Class2_Sub1_Sub1_Sub4_Sub1) {
					local60 = ((Class2_Sub1_Sub1_Sub4_Sub1) local19).aClass2_Sub1_Sub13_1;
					if (local60.anIntArray331 != null) {
						local60 = local60.method1582();
					}
					if (local60 == null) {
						continue;
					}
				}
				if (Static92.anInt2273 <= local11) {
					local60 = ((Class2_Sub1_Sub1_Sub4_Sub1) local19).aClass2_Sub1_Sub13_1;
					if (local60.anIntArray331 != null) {
						local60 = local60.method1582();
					}
					if (local60.anInt2560 >= 0 && local60.anInt2560 < Static23.aClass2_Sub1_Sub9_Sub1Array4.length) {
						Static37.method655(local19, local19.anInt2327 + 15);
						if (Static105.anInt2322 > -1) {
							Static23.aClass2_Sub1_Sub9_Sub1Array4[local60.anInt2560].method825(Static105.anInt2322 - 12, Static59.anInt1769 - 30);
						}
					}
					if (Static85.anInt2063 == 1 && Static28.anInt2314 == Static85.anIntArray277[local11 - Static92.anInt2273] && Static10.anInt300 % 20 < 10) {
						Static37.method655(local19, local19.anInt2327 + 15);
						if (Static105.anInt2322 > -1) {
							Static57.aClass2_Sub1_Sub9_Sub1Array8[0].method825(Static105.anInt2322 - 12, Static59.anInt1769 + -28);
						}
					}
				} else {
					local170 = 30;
					@Pc(173) Class2_Sub1_Sub1_Sub4_Sub2 local173 = (Class2_Sub1_Sub1_Sub4_Sub2) local19;
					if (local173.anInt2403 != -1 || local173.anInt2399 != -1) {
						Static37.method655(local19, local19.anInt2327 + 15);
						if (Static105.anInt2322 > -1) {
							if (local173.anInt2403 != -1) {
								Static36.aClass2_Sub1_Sub9_Sub1Array6[local173.anInt2403].method825(Static105.anInt2322 - 12, Static59.anInt1769 - 30);
								local170 += 25;
							}
							if (local173.anInt2399 != -1) {
								Static23.aClass2_Sub1_Sub9_Sub1Array4[local173.anInt2399].method825(Static105.anInt2322 - 12, Static59.anInt1769 + -local170);
								local170 += 25;
							}
						}
					}
					if (local11 >= 0 && Static85.anInt2063 == 10 && Static53.anIntArray208[local11] == Static83.anInt2048) {
						Static37.method655(local19, local19.anInt2327 + 15);
						if (Static105.anInt2322 > -1) {
							Static57.aClass2_Sub1_Sub9_Sub1Array8[1].method825(Static105.anInt2322 - 12, -local170 + Static59.anInt1769);
						}
					}
				}
				if (local19.aClass80_918 != null && (Static92.anInt2273 <= local11 || Static112.anInt2924 == 0 || Static112.anInt2924 == 3 || Static112.anInt2924 == 1 && Static110.method1844(((Class2_Sub1_Sub1_Sub4_Sub2) local19).aClass80_924))) {
					Static37.method655(local19, local19.anInt2327);
					if (Static105.anInt2322 > -1 && Static77.anInt1979 > Static62.anInt1798) {
						Static77.anIntArray266[Static62.anInt1798] = Static111.aClass2_Sub1_Sub9_Sub4_34.method1910(local19.aClass80_918) / 2;
						Static77.anIntArray261[Static62.anInt1798] = Static111.aClass2_Sub1_Sub9_Sub4_34.anInt2980;
						Static77.anIntArray264[Static62.anInt1798] = Static105.anInt2322;
						Static77.anIntArray267[Static62.anInt1798] = Static59.anInt1769;
						Static77.anIntArray268[Static62.anInt1798] = local19.anInt2337;
						Static77.anIntArray263[Static62.anInt1798] = local19.anInt2359;
						Static77.anIntArray265[Static62.anInt1798] = local19.anInt2328;
						Static77.aClass80Array12[Static62.anInt1798] = local19.aClass80_918;
						Static62.anInt1798++;
					}
				}
				if (Static10.anInt300 < local19.anInt2378) {
					Static37.method655(local19, local19.anInt2327 + 15);
					if (Static105.anInt2322 > -1) {
						local170 = local19.anInt2338 * 30 / local19.anInt2371;
						if (local170 > 30) {
							local170 = 30;
						}
						Static99.method1894(Static105.anInt2322 - 15, Static59.anInt1769 + -3, local170, 5, 65280);
						Static99.method1894(Static105.anInt2322 + local170 - 15, Static59.anInt1769 - 3, 30 - local170, 5, 16711680);
					}
				}
				for (local170 = 0; local170 < 4; local170++) {
					if (local19.anIntArray313[local170] > Static10.anInt300) {
						Static37.method655(local19, local19.anInt2327 / 2);
						if (Static105.anInt2322 > -1) {
							if (local170 == 1) {
								Static59.anInt1769 -= 20;
							}
							if (local170 == 2) {
								Static59.anInt1769 -= 10;
								Static105.anInt2322 -= 15;
							}
							if (local170 == 3) {
								Static59.anInt1769 -= 10;
								Static105.anInt2322 += 15;
							}
							Static103.aClass2_Sub1_Sub9_Sub1Array12[local19.anIntArray311[local170]].method825(Static105.anInt2322 - 12, Static59.anInt1769 + -12);
							Static88.aClass2_Sub1_Sub9_Sub4_25.method1924(Static28.method1422(local19.anIntArray310[local170]), Static105.anInt2322, Static59.anInt1769 + 4, 0);
							Static88.aClass2_Sub1_Sub9_Sub4_25.method1924(Static28.method1422(local19.anIntArray310[local170]), Static105.anInt2322 - 1, Static59.anInt1769 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(526) int local526 = 0; local526 < Static62.anInt1798; local526++) {
			local170 = Static77.anIntArray264[local526];
			@Pc(536) int local536 = Static77.anIntArray267[local526];
			@Pc(540) int local540 = Static77.anIntArray266[local526];
			@Pc(544) int local544 = Static77.anIntArray261[local526];
			@Pc(546) boolean local546 = true;
			while (local546) {
				local546 = false;
				for (@Pc(552) int local552 = 0; local552 < local526; local552++) {
					if (local536 + 2 > Static77.anIntArray267[local552] + -Static77.anIntArray261[local552] && Static77.anIntArray267[local552] + 2 > local536 + -local544 && Static77.anIntArray266[local552] + Static77.anIntArray264[local552] > -local540 + local170 && local170 + local540 > -Static77.anIntArray266[local552] + Static77.anIntArray264[local552] && Static77.anIntArray267[local552] - Static77.anIntArray261[local552] < local536) {
						local536 = Static77.anIntArray267[local552] - Static77.anIntArray261[local552];
						local546 = true;
					}
				}
			}
			Static105.anInt2322 = Static77.anIntArray264[local526];
			Static59.anInt1769 = Static77.anIntArray267[local526] = local536;
			@Pc(649) Class80 local649 = Static77.aClass80Array12[local526];
			if (Static93.anInt2409 == 0) {
				@Pc(672) int local672 = 16776960;
				if (Static77.anIntArray268[local526] < 6) {
					local672 = Static91.anIntArray302[Static77.anIntArray268[local526]];
				}
				if (Static77.anIntArray268[local526] == 6) {
					local672 = Static48.anInt1498 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static77.anIntArray268[local526] == 7) {
					local672 = Static48.anInt1498 % 20 >= 10 ? 65535 : 255;
				}
				if (Static77.anIntArray268[local526] == 8) {
					local672 = Static48.anInt1498 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(745) int local745;
				if (Static77.anIntArray268[local526] == 9) {
					local745 = 150 - Static77.anIntArray265[local526];
					if (local745 < 50) {
						local672 = local745 * 1280 + 16711680;
					} else if (local745 < 100) {
						local672 = 16776960 + 16384000 - local745 * 327680;
					} else if (local745 < 150) {
						local672 = local745 * 5 + 65280 - 500;
					}
				}
				if (Static77.anIntArray268[local526] == 10) {
					local745 = 150 - Static77.anIntArray265[local526];
					if (local745 < 50) {
						local672 = local745 * 5 + 16711680;
					} else if (local745 < 100) {
						local672 = 33095935 - local745 * 327680;
					} else if (local745 < 150) {
						local672 = local745 * 327680 - (local745 - 100) * 5 - 32767745;
					}
				}
				if (Static77.anIntArray268[local526] == 11) {
					local745 = 150 - Static77.anIntArray265[local526];
					if (local745 < 50) {
						local672 = 16777215 - local745 * 327685;
					} else if (local745 < 100) {
						local672 = local745 * 327685 + 65280 - 16384250;
					} else if (local745 < 150) {
						local672 = 32768000 + 16777215 - local745 * 327680;
					}
				}
				if (Static77.anIntArray263[local526] == 0) {
					Static111.aClass2_Sub1_Sub9_Sub4_34.method1924(local649, Static105.anInt2322, Static59.anInt1769 + 1, 0);
					Static111.aClass2_Sub1_Sub9_Sub4_34.method1924(local649, Static105.anInt2322, Static59.anInt1769, local672);
				}
				if (Static77.anIntArray263[local526] == 1) {
					Static111.aClass2_Sub1_Sub9_Sub4_34.method1921(local649, Static105.anInt2322, Static59.anInt1769 + 1, 0, Static48.anInt1498);
					Static111.aClass2_Sub1_Sub9_Sub4_34.method1921(local649, Static105.anInt2322, Static59.anInt1769, local672, Static48.anInt1498);
				}
				if (Static77.anIntArray263[local526] == 2) {
					Static111.aClass2_Sub1_Sub9_Sub4_34.method1909(local649, Static105.anInt2322, Static59.anInt1769 + 1, 0, Static48.anInt1498);
					Static111.aClass2_Sub1_Sub9_Sub4_34.method1909(local649, Static105.anInt2322, Static59.anInt1769, local672, Static48.anInt1498);
				}
				if (Static77.anIntArray263[local526] == 3) {
					Static111.aClass2_Sub1_Sub9_Sub4_34.method1914(local649, Static105.anInt2322, Static59.anInt1769 + 1, 0, Static48.anInt1498, 150 - Static77.anIntArray265[local526]);
					Static111.aClass2_Sub1_Sub9_Sub4_34.method1914(local649, Static105.anInt2322, Static59.anInt1769, local672, Static48.anInt1498, 150 - Static77.anIntArray265[local526]);
				}
				@Pc(1013) int local1013;
				if (Static77.anIntArray263[local526] == 4) {
					local745 = Static111.aClass2_Sub1_Sub9_Sub4_34.method1910(local649);
					local1013 = (local745 + 100) * (-Static77.anIntArray265[local526] + 150) / 150;
					Static99.method1896(Static105.anInt2322 - 50, 0, Static105.anInt2322 + 50, 334);
					Static111.aClass2_Sub1_Sub9_Sub4_34.method1925(local649, Static105.anInt2322 + 50 - local1013, Static59.anInt1769 - -1, 0);
					Static111.aClass2_Sub1_Sub9_Sub4_34.method1925(local649, Static105.anInt2322 + 50 - local1013, Static59.anInt1769, local672);
					Static99.method1893();
				}
				if (Static77.anIntArray263[local526] == 5) {
					local1013 = 0;
					local745 = 150 - Static77.anIntArray265[local526];
					Static99.method1896(0, Static59.anInt1769 - Static111.aClass2_Sub1_Sub9_Sub4_34.anInt2980 - 1, 512, Static59.anInt1769 + 5);
					if (local745 < 25) {
						local1013 = local745 - 25;
					} else if (local745 > 125) {
						local1013 = local745 - 125;
					}
					Static111.aClass2_Sub1_Sub9_Sub4_34.method1924(local649, Static105.anInt2322, Static59.anInt1769 + local1013 + 1, 0);
					Static111.aClass2_Sub1_Sub9_Sub4_34.method1924(local649, Static105.anInt2322, local1013 + Static59.anInt1769, local672);
					Static99.method1893();
				}
			} else {
				Static111.aClass2_Sub1_Sub9_Sub4_34.method1924(local649, Static105.anInt2322, Static59.anInt1769 + 1, 0);
				Static111.aClass2_Sub1_Sub9_Sub4_34.method1924(local649, Static105.anInt2322, Static59.anInt1769, 16776960);
			}
		}
	}
}
