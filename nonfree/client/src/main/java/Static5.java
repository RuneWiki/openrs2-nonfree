import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "X", descriptor = "I")
	public static int anInt362;

	@OriginalMember(owner = "client!af", name = "S", descriptor = "I")
	public static int anInt358 = 99;

	@OriginalMember(owner = "client!af", name = "V", descriptor = "[I")
	public static int[] anIntArray28 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!af", name = "W", descriptor = "I")
	public static int anInt361 = -1;

	@OriginalMember(owner = "client!af", name = "Y", descriptor = "Lclient!id;")
	public static Class34 aClass34_172 = Static9.method266("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!af", name = "Z", descriptor = "Lclient!qd;")
	public static Class63 aClass63_2 = new Class63(100);

	@OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
	public static int anInt363 = 0;

	@OriginalMember(owner = "client!af", name = "bb", descriptor = "Lclient!id;")
	private static Class34 aClass34_173 = Static9.method266(" has logged out)3");

	@OriginalMember(owner = "client!af", name = "cb", descriptor = "Lclient!id;")
	public static Class34 aClass34_174 = aClass34_173;

	@OriginalMember(owner = "client!af", name = "db", descriptor = "Lclient!id;")
	public static Class34 aClass34_175 = Static9.method266("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!af", name = "fb", descriptor = "Lclient!id;")
	public static Class34 aClass34_176 = Static9.method266("Neuer Benutzer");

	@OriginalMember(owner = "client!af", name = "hb", descriptor = "I")
	public static int anInt366 = 0;

	@OriginalMember(owner = "client!af", name = "ib", descriptor = "Lclient!id;")
	private static Class34 aClass34_177 = Static9.method266("This world is full)3");

	@OriginalMember(owner = "client!af", name = "jb", descriptor = "Lclient!id;")
	public static Class34 aClass34_178 = aClass34_177;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
	public static void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static101.anInt2540 = 0;
		@Pc(68) int local68;
		for (@Pc(9) int local9 = -1; local9 < Static40.anInt1154 + Static64.anInt1731; local9++) {
			@Pc(16) Class1_Sub1_Sub1_Sub1 local16;
			if (local9 == -1) {
				local16 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1;
			} else if (Static40.anInt1154 <= local9) {
				local16 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static1.anIntArray19[local9 - Static40.anInt1154]];
			} else {
				local16 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static102.anIntArray321[local9]];
			}
			if (local16 != null && local16.method901()) {
				@Pc(52) Class1_Sub1_Sub17 local52;
				if (local16 instanceof Class1_Sub1_Sub1_Sub1_Sub2) {
					local52 = ((Class1_Sub1_Sub1_Sub1_Sub2) local16).aClass1_Sub1_Sub17_1;
					if (local52.anIntArray375 != null) {
						local52 = local52.method2010();
					}
					if (local52 == null) {
						continue;
					}
				}
				if (local9 >= Static40.anInt1154) {
					local52 = ((Class1_Sub1_Sub1_Sub1_Sub2) local16).aClass1_Sub1_Sub17_1;
					if (local52.anIntArray375 != null) {
						local52 = local52.method2010();
					}
					if (local52.anInt3039 >= 0 && Static78.aClass1_Sub1_Sub2_Sub1Array7.length > local52.anInt3039) {
						Static124.method1966(local16, local16.anInt1451 + 15);
						if (Static123.anInt2916 > -1) {
							Static78.aClass1_Sub1_Sub2_Sub1Array7[local52.anInt3039].method182(arg0 + Static123.anInt2916 - 12, arg2 - -Static95.anInt2447 - 30);
						}
					}
					if (Static93.anInt2428 == 1 && Static67.anInt1766 == Static1.anIntArray19[local9 - Static40.anInt1154] && Static73.anInt1947 % 20 < 10) {
						Static124.method1966(local16, local16.anInt1451 + 15);
						if (Static123.anInt2916 > -1) {
							Static24.aClass1_Sub1_Sub2_Sub1Array3[0].method182(arg0 + Static123.anInt2916 - 12, Static95.anInt2447 + arg2 - 28);
						}
					}
				} else {
					local68 = 30;
					@Pc(71) Class1_Sub1_Sub1_Sub1_Sub1 local71 = (Class1_Sub1_Sub1_Sub1_Sub1) local16;
					if (local71.anInt260 != -1 || local71.anInt252 != -1) {
						Static124.method1966(local16, local16.anInt1451 + 15);
						if (Static123.anInt2916 > -1) {
							if (local71.anInt260 != -1) {
								Static12.aClass1_Sub1_Sub2_Sub1Array2[local71.anInt260].method182(Static123.anInt2916 + arg0 - 12, Static95.anInt2447 + -30 + arg2);
								local68 += 25;
							}
							if (local71.anInt252 != -1) {
								Static78.aClass1_Sub1_Sub2_Sub1Array7[local71.anInt252].method182(arg0 + Static123.anInt2916 - 12, -local68 + Static95.anInt2447 + arg2);
								local68 += 25;
							}
						}
					}
					if (local9 >= 0 && Static93.anInt2428 == 10 && Static122.anInt2886 == Static102.anIntArray321[local9]) {
						Static124.method1966(local16, local16.anInt1451 + 15);
						if (Static123.anInt2916 > -1) {
							Static24.aClass1_Sub1_Sub2_Sub1Array3[1].method182(arg0 + Static123.anInt2916 - 12, Static95.anInt2447 + (arg2 - local68));
						}
					}
				}
				if (local16.aClass34_701 != null && (Static40.anInt1154 <= local9 || Static9.anInt457 == 0 || Static9.anInt457 == 3 || Static9.anInt457 == 1 && Static114.method1825(((Class1_Sub1_Sub1_Sub1_Sub1) local16).aClass34_97))) {
					Static124.method1966(local16, local16.anInt1451);
					if (Static123.anInt2916 > -1 && Static76.anInt2065 > Static101.anInt2540) {
						Static76.anIntArray235[Static101.anInt2540] = Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method838(local16.aClass34_701) / 2;
						Static76.anIntArray238[Static101.anInt2540] = Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.anInt1315;
						Static76.anIntArray236[Static101.anInt2540] = Static123.anInt2916;
						Static76.anIntArray240[Static101.anInt2540] = Static95.anInt2447;
						Static76.anIntArray239[Static101.anInt2540] = local16.anInt1410;
						Static76.anIntArray234[Static101.anInt2540] = local16.anInt1406;
						Static76.anIntArray233[Static101.anInt2540] = local16.anInt1408;
						Static76.aClass34Array19[Static101.anInt2540] = local16.aClass34_701;
						Static101.anInt2540++;
					}
				}
				if (Static73.anInt1947 < local16.anInt1397) {
					Static124.method1966(local16, local16.anInt1451 + 15);
					if (Static123.anInt2916 > -1) {
						local68 = local16.anInt1413 * 30 / local16.anInt1450;
						if (local68 > 30) {
							local68 = 30;
						}
						Static111.method1747(Static123.anInt2916 + arg0 - 15, Static95.anInt2447 + arg2 + -3, local68, 5, 65280);
						Static111.method1747(local68 + Static123.anInt2916 + arg0 - 15, arg2 - -Static95.anInt2447 - 3, 30 - local68, 5, 16711680);
					}
				}
				for (local68 = 0; local68 < 4; local68++) {
					if (local16.anIntArray145[local68] > Static73.anInt1947) {
						Static124.method1966(local16, local16.anInt1451 / 2);
						if (Static123.anInt2916 > -1) {
							if (local68 == 1) {
								Static95.anInt2447 -= 20;
							}
							if (local68 == 2) {
								Static123.anInt2916 -= 15;
								Static95.anInt2447 -= 10;
							}
							if (local68 == 3) {
								Static95.anInt2447 -= 10;
								Static123.anInt2916 += 15;
							}
							Static6.aClass1_Sub1_Sub2_Sub1Array1[local16.anIntArray148[local68]].method182(arg0 + Static123.anInt2916 - 12, arg2 - -Static95.anInt2447 - 12);
							Static16.aClass1_Sub1_Sub2_Sub3_Sub1_3.method848(Static85.method1456(local16.anIntArray146[local68]), Static123.anInt2916 + arg0 - 1, Static95.anInt2447 + 3 + arg2, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(533) int local533 = 0; local533 < Static101.anInt2540; local533++) {
			local68 = Static76.anIntArray236[local533];
			@Pc(543) int local543 = Static76.anIntArray240[local533];
			@Pc(547) int local547 = Static76.anIntArray238[local533];
			@Pc(551) int local551 = Static76.anIntArray235[local533];
			@Pc(553) boolean local553 = true;
			while (local553) {
				local553 = false;
				for (@Pc(559) int local559 = 0; local559 < local533; local559++) {
					if (local543 + 2 > -Static76.anIntArray238[local559] + Static76.anIntArray240[local559] && Static76.anIntArray240[local559] + 2 > -local547 + local543 && local68 - local551 < Static76.anIntArray235[local559] + Static76.anIntArray236[local559] && local551 + local68 > Static76.anIntArray236[local559] - Static76.anIntArray235[local559] && Static76.anIntArray240[local559] - Static76.anIntArray238[local559] < local543) {
						local553 = true;
						local543 = Static76.anIntArray240[local559] - Static76.anIntArray238[local559];
					}
				}
			}
			Static123.anInt2916 = Static76.anIntArray236[local533];
			Static95.anInt2447 = Static76.anIntArray240[local533] = local543;
			@Pc(661) Class34 local661 = Static76.aClass34Array19[local533];
			if (Static50.anInt1475 == 0) {
				@Pc(668) int local668 = 16776960;
				if (Static76.anIntArray239[local533] < 6) {
					local668 = Static119.anIntArray352[Static76.anIntArray239[local533]];
				}
				if (Static76.anIntArray239[local533] == 6) {
					local668 = Static22.anInt778 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static76.anIntArray239[local533] == 7) {
					local668 = Static22.anInt778 % 20 < 10 ? 255 : 65535;
				}
				if (Static76.anIntArray239[local533] == 8) {
					local668 = Static22.anInt778 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(741) int local741;
				if (Static76.anIntArray239[local533] == 9) {
					local741 = 150 - Static76.anIntArray233[local533];
					if (local741 < 50) {
						local668 = local741 * 1280 + 16711680;
					} else if (local741 < 100) {
						local668 = 16776960 - (local741 - 50) * 327680;
					} else if (local741 < 150) {
						local668 = (local741 - 100) * 5 + 65280;
					}
				}
				if (Static76.anIntArray239[local533] == 10) {
					local741 = 150 - Static76.anIntArray233[local533];
					if (local741 < 50) {
						local668 = local741 * 5 + 16711680;
					} else if (local741 < 100) {
						local668 = 16711935 - (local741 - 50) * 327680;
					} else if (local741 < 150) {
						local668 = (local741 - 100) * 327680 + 255 - (local741 - 100) * 5;
					}
				}
				if (Static76.anIntArray239[local533] == 11) {
					local741 = 150 - Static76.anIntArray233[local533];
					if (local741 < 50) {
						local668 = 16777215 - local741 * 327685;
					} else if (local741 < 100) {
						local668 = local741 * 327685 + 65280 - 16384250;
					} else if (local741 < 150) {
						local668 = 16777215 - (local741 - 100) * 327680;
					}
				}
				if (Static76.anIntArray234[local533] == 0) {
					Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method848(local661, arg0 + Static123.anInt2916, Static95.anInt2447 + arg2, local668, 0);
				}
				if (Static76.anIntArray234[local533] == 1) {
					Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method855(local661, Static123.anInt2916 + arg0, Static95.anInt2447 + arg2, local668, Static22.anInt778);
				}
				if (Static76.anIntArray234[local533] == 2) {
					Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method864(local661, Static123.anInt2916 + arg0, Static95.anInt2447 + arg2, local668, Static22.anInt778);
				}
				if (Static76.anIntArray234[local533] == 3) {
					Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method844(local661, Static123.anInt2916 + arg0, arg2 - -Static95.anInt2447, local668, Static22.anInt778, 150 - Static76.anIntArray233[local533]);
				}
				if (Static76.anIntArray234[local533] == 4) {
					local741 = (150 - Static76.anIntArray233[local533]) * (Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method838(local661) + 100) / 150;
					Static111.method1762(arg0 + Static123.anInt2916 - 50, arg2, Static123.anInt2916 + arg0 + 50, arg2 - -arg3);
					Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method839(local661, arg0 + Static123.anInt2916 + 50 - local741, Static95.anInt2447 + arg2, local668, 0);
					Static111.method1753(arg0, arg2, arg0 + arg1, arg2 + arg3);
				}
				if (Static76.anIntArray234[local533] == 5) {
					local741 = 150 - Static76.anIntArray233[local533];
					@Pc(1048) int local1048 = 0;
					Static111.method1762(arg0, arg2 + Static95.anInt2447 - Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.anInt1315 - 1, arg0 - -arg1, arg2 + Static95.anInt2447 + 5);
					if (local741 < 25) {
						local1048 = local741 - 25;
					} else if (local741 > 125) {
						local1048 = local741 - 125;
					}
					Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method848(local661, Static123.anInt2916 + arg0, local1048 + (arg2 - -Static95.anInt2447), local668, 0);
					Static111.method1753(arg0, arg2, arg0 + arg1, arg3 + arg2);
				}
			} else {
				Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method848(local661, arg0 + Static123.anInt2916, Static95.anInt2447 + arg2, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
	public static void method212() {
		Static77.aByteArrayArray7 = null;
		Static87.anIntArray297 = null;
		Static91.anIntArray298 = null;
		Static78.anIntArray244 = null;
		Static32.anIntArray150 = null;
		Static116.anIntArray351 = null;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
	public static void method214() {
		anIntArray28 = null;
		aClass63_2 = null;
		aClass34_175 = null;
		aClass34_178 = null;
		aClass34_177 = null;
		aClass34_172 = null;
		aClass34_174 = null;
		aClass34_173 = null;
		aClass34_176 = null;
	}
}
