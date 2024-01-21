import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!a;")
	public static Class1 aClass1_1849 = Static94.method1596("Cabbage");

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!cb;")
	public static Class11 aClass11_14 = new Class11(64);

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Lclient!a;")
	public static Class1 aClass1_1850 = Static94.method1596("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!m", name = "v", descriptor = "Lclient!a;")
	private static Class1 aClass1_1854 = Static94.method1596("Loading config )2 ");

	@OriginalMember(owner = "client!m", name = "i", descriptor = "Lclient!a;")
	public static Class1 aClass1_1851 = aClass1_1854;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	public static int anInt1832 = 0;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Lclient!a;")
	public static Class1 aClass1_1852 = Static94.method1596("::");

	@OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
	public static int[] anIntArray196 = new int[500];

	@OriginalMember(owner = "client!m", name = "u", descriptor = "Lclient!a;")
	public static Class1 aClass1_1853 = Static94.method1596(")1");

	@OriginalMember(owner = "client!m", name = "w", descriptor = "Lclient!a;")
	public static Class1 aClass1_1855 = Static94.method1596("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!m", name = "x", descriptor = "Lclient!a;")
	private static Class1 aClass1_1856 = Static94.method1596("No response from server)3");

	@OriginalMember(owner = "client!m", name = "y", descriptor = "Lclient!a;")
	public static Class1 aClass1_1857 = aClass1_1856;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
	public static synchronized void method1275() {
		if (Static45.method1023()) {
			Static40.method1084();
			Static47.aBoolean85 = false;
			Static33.aClass8_12 = null;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZIILclient!bd;IIZ)V")
	public static synchronized void method1276(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class8 arg2, @OriginalArg(5) int arg3) {
		if (!Static45.method1023()) {
			return;
		}
		Static17.aBoolean27 = false;
		Static10.anInt2576 = 10;
		Static18.anInt843 = arg3;
		Static47.aBoolean85 = true;
		Static33.aClass8_12 = arg2;
		Static101.anInt2586 = -1;
		Static29.anInt1102 = arg0;
		Static50.anInt1639 = 0;
		Static12.anInt2642 = arg1;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method1277() {
		Static59.anInt1825 = 0;
		@Pc(167) int local167;
		for (@Pc(13) int local13 = -1; local13 < Static99.anInt2521 + Static44.anInt1516; local13++) {
			@Pc(21) Class2_Sub1_Sub1_Sub1 local21;
			if (local13 == -1) {
				local21 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1;
			} else if (Static99.anInt2521 > local13) {
				local21 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[Static93.anIntArray292[local13]];
			} else {
				local21 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[Static20.anIntArray89[local13 - Static99.anInt2521]];
			}
			if (local21 != null && local21.method1783()) {
				@Pc(62) Class2_Sub1_Sub7 local62;
				if (local21 instanceof Class2_Sub1_Sub1_Sub1_Sub2) {
					local62 = ((Class2_Sub1_Sub1_Sub1_Sub2) local21).aClass2_Sub1_Sub7_1;
					if (local62.anIntArray140 != null) {
						local62 = local62.method939();
					}
					if (local62 == null) {
						continue;
					}
				}
				if (local13 >= Static99.anInt2521) {
					local62 = ((Class2_Sub1_Sub1_Sub1_Sub2) local21).aClass2_Sub1_Sub7_1;
					if (local62.anInt1338 >= 0 && local62.anInt1338 < Static4.aClass2_Sub1_Sub2_Sub4Array1.length) {
						Static46.method1044(local21.anInt2740 + 15, local21);
						if (Static34.anInt1275 > -1) {
							Static4.aClass2_Sub1_Sub2_Sub4Array1[local62.anInt1338].method1140(Static34.anInt1275 - 12, Static73.anInt1989 + -30);
						}
					}
					if (Static2.anInt299 == 1 && Static20.anIntArray89[local13 - Static99.anInt2521] == Static111.anInt2779 && Static69.anInt2806 % 20 < 10) {
						Static46.method1044(local21.anInt2740 + 15, local21);
						if (Static34.anInt1275 > -1) {
							Static64.aClass2_Sub1_Sub2_Sub4Array10[0].method1140(Static34.anInt1275 - 12, Static73.anInt1989 + -28);
						}
					}
				} else {
					@Pc(165) Class2_Sub1_Sub1_Sub1_Sub1 local165 = (Class2_Sub1_Sub1_Sub1_Sub1) local21;
					local167 = 30;
					if (local165.anInt288 != -1 || local165.anInt291 != -1) {
						Static46.method1044(local21.anInt2740 + 15, local21);
						if (Static34.anInt1275 > -1) {
							if (local165.anInt288 != -1) {
								Static46.aClass2_Sub1_Sub2_Sub4Array8[local165.anInt288].method1140(Static34.anInt1275 - 12, Static73.anInt1989 - 30);
								local167 += 25;
							}
							if (local165.anInt291 != -1) {
								Static4.aClass2_Sub1_Sub2_Sub4Array1[local165.anInt291].method1140(Static34.anInt1275 - 12, Static73.anInt1989 + -local167);
								local167 += 25;
							}
						}
					}
					if (local13 >= 0 && Static2.anInt299 == 10 && Static113.anInt2237 == Static93.anIntArray292[local13]) {
						Static46.method1044(local21.anInt2740 + 15, local21);
						if (Static34.anInt1275 > -1) {
							Static64.aClass2_Sub1_Sub2_Sub4Array10[1].method1140(Static34.anInt1275 - 12, Static73.anInt1989 + -local167);
						}
					}
				}
				if (local21.aClass1_2863 != null && (local13 >= Static99.anInt2521 || Static63.anInt1889 == 0 || Static63.anInt1889 == 3 || Static63.anInt1889 == 1 && Static11.method410(((Class2_Sub1_Sub1_Sub1_Sub1) local21).aClass1_264))) {
					Static46.method1044(local21.anInt2740, local21);
					if (Static34.anInt1275 > -1 && Static57.anInt1797 > Static59.anInt1825) {
						Static57.anIntArray183[Static59.anInt1825] = Static97.aClass2_Sub1_Sub2_Sub1_3.method370(local21.aClass1_2863) / 2;
						Static57.anIntArray186[Static59.anInt1825] = Static97.aClass2_Sub1_Sub2_Sub1_3.anInt562;
						Static57.anIntArray191[Static59.anInt1825] = Static34.anInt1275;
						Static57.anIntArray185[Static59.anInt1825] = Static73.anInt1989;
						Static57.anIntArray189[Static59.anInt1825] = local21.anInt2728;
						Static57.anIntArray188[Static59.anInt1825] = local21.anInt2745;
						Static57.anIntArray184[Static59.anInt1825] = local21.anInt2709;
						Static57.aClass1Array16[Static59.anInt1825] = local21.aClass1_2863;
						Static59.anInt1825++;
					}
				}
				if (Static69.anInt2806 < local21.anInt2757) {
					Static46.method1044(local21.anInt2740 + 15, local21);
					if (Static34.anInt1275 > -1) {
						local167 = local21.anInt2751 * 30 / local21.anInt2727;
						if (local167 > 30) {
							local167 = 30;
						}
						Static92.method1120(Static34.anInt1275 - 15, Static73.anInt1989 + -3, local167, 5, 65280);
						Static92.method1120(Static34.anInt1275 + local167 - 15, Static73.anInt1989 + -3, 30 - local167, 5, 16711680);
					}
				}
				for (local167 = 0; local167 < 4; local167++) {
					if (Static69.anInt2806 < local21.anIntArray344[local167]) {
						Static46.method1044(local21.anInt2740 / 2, local21);
						if (Static34.anInt1275 > -1) {
							if (local167 == 1) {
								Static73.anInt1989 -= 20;
							}
							if (local167 == 2) {
								Static34.anInt1275 -= 15;
								Static73.anInt1989 -= 10;
							}
							if (local167 == 3) {
								Static34.anInt1275 += 15;
								Static73.anInt1989 -= 10;
							}
							Static42.aClass2_Sub1_Sub2_Sub4Array6[local21.anIntArray339[local167]].method1140(Static34.anInt1275 - 12, Static73.anInt1989 + -12);
							Static97.aClass2_Sub1_Sub2_Sub1_2.method371(Static43.method994(local21.anIntArray340[local167]), Static34.anInt1275, Static73.anInt1989 + 4, 0);
							Static97.aClass2_Sub1_Sub2_Sub1_2.method371(Static43.method994(local21.anIntArray340[local167]), Static34.anInt1275 - 1, Static73.anInt1989 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(507) int local507 = 0; local507 < Static59.anInt1825; local507++) {
			local167 = Static57.anIntArray191[local507];
			@Pc(517) int local517 = Static57.anIntArray185[local507];
			@Pc(521) int local521 = Static57.anIntArray183[local507];
			@Pc(525) int local525 = Static57.anIntArray186[local507];
			@Pc(527) boolean local527 = true;
			while (local527) {
				local527 = false;
				for (@Pc(533) int local533 = 0; local533 < local507; local533++) {
					if (Static57.anIntArray185[local533] - Static57.anIntArray186[local533] < local517 + 2 && local517 - local525 < Static57.anIntArray185[local533] + 2 && local167 - local521 < Static57.anIntArray191[local533] + Static57.anIntArray183[local533] && local521 + local167 > -Static57.anIntArray183[local533] + Static57.anIntArray191[local533] && local517 > Static57.anIntArray185[local533] - Static57.anIntArray186[local533]) {
						local527 = true;
						local517 = Static57.anIntArray185[local533] - Static57.anIntArray186[local533];
					}
				}
			}
			Static34.anInt1275 = Static57.anIntArray191[local507];
			Static73.anInt1989 = Static57.anIntArray185[local507] = local517;
			@Pc(642) Class1 local642 = Static57.aClass1Array16[local507];
			if (Static14.anInt682 == 0) {
				@Pc(662) int local662 = 16776960;
				if (Static57.anIntArray189[local507] < 6) {
					local662 = Static50.anIntArray166[Static57.anIntArray189[local507]];
				}
				if (Static57.anIntArray189[local507] == 6) {
					local662 = Static80.anInt2129 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static57.anIntArray189[local507] == 7) {
					local662 = Static80.anInt2129 % 20 < 10 ? 255 : 65535;
				}
				if (Static57.anIntArray189[local507] == 8) {
					local662 = Static80.anInt2129 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(736) int local736;
				if (Static57.anIntArray189[local507] == 9) {
					local736 = 150 - Static57.anIntArray184[local507];
					if (local736 < 50) {
						local662 = local736 * 1280 + 16711680;
					} else if (local736 < 100) {
						local662 = 16776960 - (local736 - 50) * 327680;
					} else if (local736 < 150) {
						local662 = (local736 - 100) * 5 + 65280;
					}
				}
				if (Static57.anIntArray189[local507] == 10) {
					local736 = 150 - Static57.anIntArray184[local507];
					if (local736 < 50) {
						local662 = local736 * 5 + 16711680;
					} else if (local736 < 100) {
						local662 = 16711935 + 16384000 - local736 * 327680;
					} else if (local736 < 150) {
						local662 = (local736 - 100) * 327680 + 255 + 500 - local736 * 5;
					}
				}
				if (Static57.anIntArray189[local507] == 11) {
					local736 = 150 - Static57.anIntArray184[local507];
					if (local736 < 50) {
						local662 = 16777215 - local736 * 327685;
					} else if (local736 < 100) {
						local662 = (local736 - 50) * 327685 + 65280;
					} else if (local736 < 150) {
						local662 = 16777215 - (local736 - 100) * 327680;
					}
				}
				if (Static57.anIntArray188[local507] == 0) {
					Static97.aClass2_Sub1_Sub2_Sub1_3.method371(local642, Static34.anInt1275, Static73.anInt1989 + 1, 0);
					Static97.aClass2_Sub1_Sub2_Sub1_3.method371(local642, Static34.anInt1275, Static73.anInt1989, local662);
				}
				if (Static57.anIntArray188[local507] == 1) {
					Static97.aClass2_Sub1_Sub2_Sub1_3.method358(local642, Static34.anInt1275, Static73.anInt1989 + 1, 0, Static80.anInt2129);
					Static97.aClass2_Sub1_Sub2_Sub1_3.method358(local642, Static34.anInt1275, Static73.anInt1989, local662, Static80.anInt2129);
				}
				if (Static57.anIntArray188[local507] == 2) {
					Static97.aClass2_Sub1_Sub2_Sub1_3.method360(local642, Static34.anInt1275, Static73.anInt1989 + 1, 0, Static80.anInt2129);
					Static97.aClass2_Sub1_Sub2_Sub1_3.method360(local642, Static34.anInt1275, Static73.anInt1989, local662, Static80.anInt2129);
				}
				if (Static57.anIntArray188[local507] == 3) {
					Static97.aClass2_Sub1_Sub2_Sub1_3.method363(local642, Static34.anInt1275, Static73.anInt1989 + 1, 0, Static80.anInt2129, 150 - Static57.anIntArray184[local507]);
					Static97.aClass2_Sub1_Sub2_Sub1_3.method363(local642, Static34.anInt1275, Static73.anInt1989, local662, Static80.anInt2129, 150 - Static57.anIntArray184[local507]);
				}
				@Pc(1009) int local1009;
				if (Static57.anIntArray188[local507] == 4) {
					local736 = Static97.aClass2_Sub1_Sub2_Sub1_3.method370(local642);
					local1009 = (local736 + 100) * (-Static57.anIntArray184[local507] + 150) / 150;
					Static92.method1119(Static34.anInt1275 - 50, 0, Static34.anInt1275 + 50, 334);
					Static97.aClass2_Sub1_Sub2_Sub1_3.method375(local642, Static34.anInt1275 + 50 - local1009, Static73.anInt1989 + 1, 0);
					Static97.aClass2_Sub1_Sub2_Sub1_3.method375(local642, Static34.anInt1275 + 50 - local1009, Static73.anInt1989, local662);
					Static92.method1126();
				}
				if (Static57.anIntArray188[local507] == 5) {
					local1009 = 0;
					local736 = 150 - Static57.anIntArray184[local507];
					Static92.method1119(0, Static73.anInt1989 - Static97.aClass2_Sub1_Sub2_Sub1_3.anInt562 - 1, 512, Static73.anInt1989 + 5);
					if (local736 < 25) {
						local1009 = local736 - 25;
					} else if (local736 > 125) {
						local1009 = local736 - 125;
					}
					Static97.aClass2_Sub1_Sub2_Sub1_3.method371(local642, Static34.anInt1275, local1009 + Static73.anInt1989 + 1, 0);
					Static97.aClass2_Sub1_Sub2_Sub1_3.method371(local642, Static34.anInt1275, local1009 + Static73.anInt1989, local662);
					Static92.method1126();
				}
			} else {
				Static97.aClass2_Sub1_Sub2_Sub1_3.method371(local642, Static34.anInt1275, Static73.anInt1989 + 1, 0);
				Static97.aClass2_Sub1_Sub2_Sub1_3.method371(local642, Static34.anInt1275, Static73.anInt1989, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public static synchronized void method1278() {
		if (Static45.method1023()) {
			Static29.method757();
			Static33.aClass8_12 = null;
			Static47.aBoolean85 = false;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)V")
	public static void method1279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			Static59.aClass2_Sub3_Sub1_2.method841(111);
			Static59.aClass2_Sub3_Sub1_2.method829(arg2);
			Static59.aClass2_Sub3_Sub1_2.method797(arg0);
		}
		if (arg1 == 2) {
			Static59.aClass2_Sub3_Sub1_2.method841(9);
			Static59.aClass2_Sub3_Sub1_2.method829(arg2);
			Static59.aClass2_Sub3_Sub1_2.method797(arg0);
		}
		if (arg1 == 3) {
			Static59.aClass2_Sub3_Sub1_2.method841(193);
			Static59.aClass2_Sub3_Sub1_2.method829(arg2);
			Static59.aClass2_Sub3_Sub1_2.method797(arg0);
		}
		if (arg1 == 4) {
			Static59.aClass2_Sub3_Sub1_2.method841(53);
			Static59.aClass2_Sub3_Sub1_2.method829(arg2);
			Static59.aClass2_Sub3_Sub1_2.method797(arg0);
		}
		if (arg1 == 5) {
			Static59.aClass2_Sub3_Sub1_2.method841(94);
			Static59.aClass2_Sub3_Sub1_2.method829(arg2);
			Static59.aClass2_Sub3_Sub1_2.method797(arg0);
		}
		if (arg1 == 6) {
			Static59.aClass2_Sub3_Sub1_2.method841(213);
			Static59.aClass2_Sub3_Sub1_2.method829(arg2);
			Static59.aClass2_Sub3_Sub1_2.method797(arg0);
		}
		if (arg1 == 7) {
			Static59.aClass2_Sub3_Sub1_2.method841(46);
			Static59.aClass2_Sub3_Sub1_2.method829(arg2);
			Static59.aClass2_Sub3_Sub1_2.method797(arg0);
		}
		if (arg1 == 8) {
			Static59.aClass2_Sub3_Sub1_2.method841(130);
			Static59.aClass2_Sub3_Sub1_2.method829(arg2);
			Static59.aClass2_Sub3_Sub1_2.method797(arg0);
		}
		if (arg1 == 9) {
			Static59.aClass2_Sub3_Sub1_2.method841(157);
			Static59.aClass2_Sub3_Sub1_2.method829(arg2);
			Static59.aClass2_Sub3_Sub1_2.method797(arg0);
		}
		if (arg1 == 10) {
			Static59.aClass2_Sub3_Sub1_2.method841(84);
			Static59.aClass2_Sub3_Sub1_2.method829(arg2);
			Static59.aClass2_Sub3_Sub1_2.method797(arg0);
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
	public static synchronized void method1280() {
		Static110.method1796();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1281() {
		aClass1_1850 = null;
		aClass1_1857 = null;
		aClass1_1852 = null;
		anIntArray196 = null;
		aClass1_1854 = null;
		aClass1_1853 = null;
		aClass1_1849 = null;
		aClass1_1855 = null;
		aClass11_14 = null;
		aClass1_1851 = null;
		aClass1_1856 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)Z")
	public static boolean method1282(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static66.anIntArray290[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 45;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIZ)I")
	public static int method1283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!a;Lclient!a;Lclient!a;B)V")
	public static void method1284(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) Class1 arg2) {
		Static104.aClass1_1588 = arg0;
		Static104.aClass1_1597 = arg2;
		Static104.aClass1_1587 = arg1;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!bd;IBLclient!a;ILclient!a;I)V")
	public static synchronized void method1285(@OriginalArg(1) Class8 arg0, @OriginalArg(4) Class1 arg1, @OriginalArg(6) Class1 arg2, @OriginalArg(7) int arg3) {
		if (Static45.method1023()) {
			@Pc(24) int local24 = arg0.method1695(arg1);
			@Pc(32) int local32 = arg0.method1691(local24, arg2);
			method1276(arg3, local24, arg0, local32);
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
	public static synchronized void method1286() {
		if (!Static45.method1023()) {
			return;
		}
		if (Static47.aBoolean85) {
			@Pc(18) byte[] local18 = Static1.method25(Static18.anInt843, Static33.aClass8_12, Static12.anInt2642, Static50.anInt1639);
			if (local18 != null) {
				if (Static10.anInt2576 >= 0) {
					Static71.method1363(Static29.anInt1102, Static17.aBoolean27, local18, Static10.anInt2576);
				} else if (Static101.anInt2586 < 0) {
					Static1.method7(Static17.aBoolean27, local18, Static29.anInt1102);
				} else {
					Static30.method776(Static29.anInt1102, Static17.aBoolean27, Static101.anInt2586, local18);
				}
				Static47.aBoolean85 = false;
				Static33.aClass8_12 = null;
			}
		}
		Static98.method1661();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIIIILclient!bd;I)V")
	public static synchronized void method1287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class8 arg3) {
		if (!Static45.method1023()) {
			return;
		}
		Static47.aBoolean85 = true;
		Static101.anInt2586 = -1;
		Static10.anInt2576 = -1;
		Static29.anInt1102 = arg2;
		Static18.anInt843 = 0;
		Static17.aBoolean27 = false;
		Static50.anInt1639 = arg0;
		Static33.aClass8_12 = arg3;
		Static12.anInt2642 = arg1;
	}
}
