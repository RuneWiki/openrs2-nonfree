import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!f", name = "M", descriptor = "Lclient!fc;")
	public static Class25 aClass25_378 = Static78.method1313("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!f", name = "P", descriptor = "I")
	public static volatile int anInt895 = 0;

	@OriginalMember(owner = "client!f", name = "db", descriptor = "Lclient!fc;")
	private static Class25 aClass25_383 = Static78.method1313("Select a world");

	@OriginalMember(owner = "client!f", name = "R", descriptor = "Lclient!fc;")
	public static Class25 aClass25_379 = aClass25_383;

	@OriginalMember(owner = "client!f", name = "T", descriptor = "I")
	public static int anInt898 = 0;

	@OriginalMember(owner = "client!f", name = "W", descriptor = "Lclient!fc;")
	public static Class25 aClass25_380 = Static78.method1313("(U5");

	@OriginalMember(owner = "client!f", name = "ab", descriptor = "Lclient!fc;")
	public static Class25 aClass25_381 = Static78.method1313("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!f", name = "bb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_382 = Static78.method1313("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ob;Z)V")
	public static void method728(@OriginalArg(0) Class1_Sub2_Sub14 arg0) {
		@Pc(8) int local8 = arg0.anInt1937 >> 16;
		if (Static33.anInt916 == local8 || Static108.anInt2502 == local8) {
			Static110.aBoolean113 = true;
		}
		if (local8 == Static33.anInt922 || Static22.anIntArray162[Static90.anInt2027] == local8) {
			Static90.aBoolean98 = true;
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	public static void method729() {
		Static84.aClass7_13.method1096();
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
	public static void method730() {
		aClass25_380 = null;
		aClass25_379 = null;
		aClass25_383 = null;
		aClass25_378 = null;
		aClass25_381 = null;
		aClass25_382 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	public static void method732(@OriginalArg(0) int arg0) {
		Static66.anInt1459 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(B)V")
	public static void method734() {
		Static103.anInt2772 = 0;
		@Pc(73) int local73;
		for (@Pc(9) int local9 = -1; local9 < Static13.anInt383 + Static96.anInt2797; local9++) {
			@Pc(17) Class1_Sub2_Sub3_Sub4 local17;
			if (local9 == -1) {
				local17 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1;
			} else if (Static96.anInt2797 > local9) {
				local17 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[Static28.anIntArray150[local9]];
			} else {
				local17 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[Static106.anIntArray423[local9 - Static96.anInt2797]];
			}
			if (local17 != null && local17.method1977()) {
				@Pc(54) Class1_Sub2_Sub13 local54;
				if (local17 instanceof Class1_Sub2_Sub3_Sub4_Sub1) {
					local54 = ((Class1_Sub2_Sub3_Sub4_Sub1) local17).aClass1_Sub2_Sub13_1;
					if (local54.anIntArray332 != null) {
						local54 = local54.method1408();
					}
					if (local54 == null) {
						continue;
					}
				}
				if (Static96.anInt2797 <= local9) {
					local54 = ((Class1_Sub2_Sub3_Sub4_Sub1) local17).aClass1_Sub2_Sub13_1;
					if (local54.anIntArray332 != null) {
						local54 = local54.method1408();
					}
					if (local54.anInt1851 >= 0 && Static42.aClass1_Sub2_Sub2_Sub1Array4.length > local54.anInt1851) {
						Static59.method1065(local17.anInt2838 + 15, local17);
						if (Static12.anInt333 > -1) {
							Static42.aClass1_Sub2_Sub2_Sub1Array4[local54.anInt1851].method204(Static12.anInt333 - 12, Static53.anInt2569 + -30);
						}
					}
					if (Static3.anInt59 == 1 && Static114.anInt2636 == Static106.anIntArray423[local9 - Static96.anInt2797] && Static60.anInt1366 % 20 < 10) {
						Static59.method1065(local17.anInt2838 + 15, local17);
						if (Static12.anInt333 > -1) {
							Static118.aClass1_Sub2_Sub2_Sub1Array9[0].method204(Static12.anInt333 - 12, Static53.anInt2569 + -28);
						}
					}
				} else {
					@Pc(71) Class1_Sub2_Sub3_Sub4_Sub2 local71 = (Class1_Sub2_Sub3_Sub4_Sub2) local17;
					local73 = 30;
					if (local71.anInt2842 != -1 || local71.anInt2862 != -1) {
						Static59.method1065(local17.anInt2838 + 15, local17);
						if (Static12.anInt333 > -1) {
							if (local71.anInt2842 != -1) {
								Static62.aClass1_Sub2_Sub2_Sub1Array6[local71.anInt2842].method204(Static12.anInt333 - 12, Static53.anInt2569 + -30);
								local73 += 25;
							}
							if (local71.anInt2862 != -1) {
								Static42.aClass1_Sub2_Sub2_Sub1Array4[local71.anInt2862].method204(Static12.anInt333 - 12, -local73 + Static53.anInt2569);
								local73 += 25;
							}
						}
					}
					if (local9 >= 0 && Static3.anInt59 == 10 && Static28.anIntArray150[local9] == Static65.anInt1452) {
						Static59.method1065(local17.anInt2838 + 15, local17);
						if (Static12.anInt333 > -1) {
							Static118.aClass1_Sub2_Sub2_Sub1Array9[1].method204(Static12.anInt333 - 12, -local73 + Static53.anInt2569);
						}
					}
				}
				if (local17.aClass25_1379 != null && (Static96.anInt2797 <= local9 || Static82.anInt1811 == 0 || Static82.anInt1811 == 3 || Static82.anInt1811 == 1 && Static31.method704(((Class1_Sub2_Sub3_Sub4_Sub2) local17).aClass25_1384))) {
					Static59.method1065(local17.anInt2838, local17);
					if (Static12.anInt333 > -1 && Static103.anInt2772 < Static74.anInt1546) {
						Static74.anIntArray291[Static103.anInt2772] = Static83.aClass1_Sub2_Sub2_Sub3_3.method1187(local17.aClass25_1379) / 2;
						Static74.anIntArray290[Static103.anInt2772] = Static83.aClass1_Sub2_Sub2_Sub3_3.anInt1519;
						Static74.anIntArray289[Static103.anInt2772] = Static12.anInt333;
						Static74.anIntArray296[Static103.anInt2772] = Static53.anInt2569;
						Static74.anIntArray292[Static103.anInt2772] = local17.anInt2836;
						Static74.anIntArray294[Static103.anInt2772] = local17.anInt2823;
						Static74.anIntArray293[Static103.anInt2772] = local17.anInt2783;
						Static74.aClass25Array9[Static103.anInt2772] = local17.aClass25_1379;
						Static103.anInt2772++;
					}
				}
				if (local17.anInt2801 > Static60.anInt1366) {
					Static59.method1065(local17.anInt2838 + 15, local17);
					if (Static12.anInt333 > -1) {
						local73 = local17.anInt2786 * 30 / local17.anInt2784;
						if (local73 > 30) {
							local73 = 30;
						}
						Static128.method1935(Static12.anInt333 - 15, Static53.anInt2569 + -3, local73, 5, 65280);
						Static128.method1935(Static12.anInt333 + local73 - 15, Static53.anInt2569 - 3, 30 - local73, 5, 16711680);
					}
				}
				for (local73 = 0; local73 < 4; local73++) {
					if (local17.anIntArray482[local73] > Static60.anInt1366) {
						Static59.method1065(local17.anInt2838 / 2, local17);
						if (Static12.anInt333 > -1) {
							if (local73 == 1) {
								Static53.anInt2569 -= 20;
							}
							if (local73 == 2) {
								Static53.anInt2569 -= 10;
								Static12.anInt333 -= 15;
							}
							if (local73 == 3) {
								Static53.anInt2569 -= 10;
								Static12.anInt333 += 15;
							}
							Static97.aClass1_Sub2_Sub2_Sub1Array8[local17.anIntArray481[local73]].method204(Static12.anInt333 - 12, Static53.anInt2569 - 12);
							Static46.aClass1_Sub2_Sub2_Sub3_2.method1200(Static74.method1214(local17.anIntArray483[local73]), Static12.anInt333 - 1, Static53.anInt2569 - -3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(495) int local495 = 0; local495 < Static103.anInt2772; local495++) {
			@Pc(501) int local501 = Static74.anIntArray296[local495];
			local73 = Static74.anIntArray289[local495];
			@Pc(509) int local509 = Static74.anIntArray290[local495];
			@Pc(511) boolean local511 = true;
			@Pc(515) int local515 = Static74.anIntArray291[local495];
			while (local511) {
				local511 = false;
				for (@Pc(521) int local521 = 0; local521 < local495; local521++) {
					if (Static74.anIntArray296[local521] - Static74.anIntArray290[local521] < local501 + 2 && local501 - local509 < Static74.anIntArray296[local521] + 2 && Static74.anIntArray291[local521] + Static74.anIntArray289[local521] > local73 + -local515 && Static74.anIntArray289[local521] - Static74.anIntArray291[local521] < local515 + local73 && local501 > Static74.anIntArray296[local521] - Static74.anIntArray290[local521]) {
						local501 = Static74.anIntArray296[local521] - Static74.anIntArray290[local521];
						local511 = true;
					}
				}
			}
			Static12.anInt333 = Static74.anIntArray289[local495];
			Static53.anInt2569 = Static74.anIntArray296[local495] = local501;
			@Pc(621) Class25 local621 = Static74.aClass25Array9[local495];
			if (Static27.anInt744 == 0) {
				@Pc(625) int local625 = 16776960;
				if (Static74.anIntArray292[local495] < 6) {
					local625 = Static31.anIntArray170[Static74.anIntArray292[local495]];
				}
				if (Static74.anIntArray292[local495] == 6) {
					local625 = Static124.anInt2899 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static74.anIntArray292[local495] == 7) {
					local625 = Static124.anInt2899 % 20 < 10 ? 255 : 65535;
				}
				if (Static74.anIntArray292[local495] == 8) {
					local625 = Static124.anInt2899 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(696) int local696;
				if (Static74.anIntArray292[local495] == 9) {
					local696 = 150 - Static74.anIntArray293[local495];
					if (local696 < 50) {
						local625 = local696 * 1280 + 16711680;
					} else if (local696 < 100) {
						local625 = 16776960 - (local696 - 50) * 327680;
					} else if (local696 < 150) {
						local625 = (local696 - 100) * 5 + 65280;
					}
				}
				if (Static74.anIntArray292[local495] == 10) {
					local696 = 150 - Static74.anIntArray293[local495];
					if (local696 < 50) {
						local625 = local696 * 5 + 16711680;
					} else if (local696 < 100) {
						local625 = 16711935 - (local696 - 50) * 327680;
					} else if (local696 < 150) {
						local625 = (local696 - 100) * 327680 + 255 - (local696 - 100) * 5;
					}
				}
				if (Static74.anIntArray292[local495] == 11) {
					local696 = 150 - Static74.anIntArray293[local495];
					if (local696 < 50) {
						local625 = 16777215 - local696 * 327685;
					} else if (local696 < 100) {
						local625 = (local696 - 50) * 327685 + 65280;
					} else if (local696 < 150) {
						local625 = 49545215 - local696 * 327680;
					}
				}
				if (Static74.anIntArray294[local495] == 0) {
					Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(local621, Static12.anInt333, Static53.anInt2569, local625, 0);
				}
				if (Static74.anIntArray294[local495] == 1) {
					Static83.aClass1_Sub2_Sub2_Sub3_3.method1191(local621, Static12.anInt333, Static53.anInt2569, local625, Static124.anInt2899);
				}
				if (Static74.anIntArray294[local495] == 2) {
					Static83.aClass1_Sub2_Sub2_Sub3_3.method1190(local621, Static12.anInt333, Static53.anInt2569, local625, Static124.anInt2899);
				}
				if (Static74.anIntArray294[local495] == 3) {
					Static83.aClass1_Sub2_Sub2_Sub3_3.method1193(local621, Static12.anInt333, Static53.anInt2569, local625, Static124.anInt2899, 150 - Static74.anIntArray293[local495]);
				}
				@Pc(922) int local922;
				if (Static74.anIntArray294[local495] == 4) {
					local696 = Static83.aClass1_Sub2_Sub2_Sub3_3.method1187(local621);
					local922 = (local696 + 100) * (150 - Static74.anIntArray293[local495]) / 150;
					Static128.method1942(Static12.anInt333 - 50, 0, Static12.anInt333 + 50, 334);
					Static83.aClass1_Sub2_Sub2_Sub3_3.method1180(local621, Static12.anInt333 + 50 - local922, Static53.anInt2569, local625, 0);
					Static128.method1946();
				}
				if (Static74.anIntArray294[local495] == 5) {
					local696 = 150 - Static74.anIntArray293[local495];
					Static128.method1942(0, Static53.anInt2569 - Static83.aClass1_Sub2_Sub2_Sub3_3.anInt1519 - 1, 512, Static53.anInt2569 + 5);
					local922 = 0;
					if (local696 < 25) {
						local922 = local696 - 25;
					} else if (local696 > 125) {
						local922 = local696 - 125;
					}
					Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(local621, Static12.anInt333, Static53.anInt2569 + local922, local625, 0);
					Static128.method1946();
				}
			} else {
				Static83.aClass1_Sub2_Sub2_Sub3_3.method1200(local621, Static12.anInt333, Static53.anInt2569, 16776960, 0);
			}
		}
	}
}
