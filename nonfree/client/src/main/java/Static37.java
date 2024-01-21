import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_10;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
	public static int anInt1224;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Lclient!ge;")
	public static Class7 aClass7_21;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "[I")
	public static int[] anIntArray140;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "[Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2[] aClass6_Sub3_Sub3_Sub2Array5;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public static int anInt1218 = 0;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_654 = Static80.method1463(":: (X");

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
	public static int[] anIntArray139 = new int[128];

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!rd;")
	public static Class63 aClass63_655 = Static80.method1463("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
	public static int anInt1226 = 0;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "[I")
	public static int[] anIntArray141 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "Lclient!rd;")
	private static Class63 aClass63_658 = Static80.method1463("yellow:");

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Lclient!rd;")
	public static Class63 aClass63_656 = aClass63_658;

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Lclient!rd;")
	public static Class63 aClass63_657 = Static80.method1463("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "Lclient!rd;")
	public static Class63 aClass63_659 = aClass63_658;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "Lclient!rd;")
	public static Class63 aClass63_660 = Static80.method1463("mapfunction");

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "Lclient!mb;")
	public static Class49 aClass49_11 = new Class49(200);

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
	public static int anInt1232 = 0;

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "Lclient!rd;")
	public static Class63 aClass63_661 = Static80.method1463("Mitteilung");

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "Lclient!rd;")
	public static Class63 aClass63_662 = Static80.method1463("(U(Y");

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "Lclient!rd;")
	public static Class63 aClass63_663 = Static80.method1463("Mem:");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method871() {
		Static123.anInt3313 = 0;
		@Pc(74) int local74;
		for (@Pc(14) int local14 = -1; local14 < Static81.anInt2219 + Static22.anInt689; local14++) {
			@Pc(28) Class6_Sub3_Sub1_Sub2 local28;
			if (local14 == -1) {
				local28 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1;
			} else if (Static81.anInt2219 > local14) {
				local28 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[Static114.anIntArray356[local14]];
			} else {
				local28 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[Static80.anIntArray247[local14 - Static81.anInt2219]];
			}
			if (local28 != null && local28.method1545()) {
				@Pc(58) Class6_Sub3_Sub2 local58;
				if (local28 instanceof Class6_Sub3_Sub1_Sub2_Sub1) {
					local58 = ((Class6_Sub3_Sub1_Sub2_Sub1) local28).aClass6_Sub3_Sub2_1;
					if (local58.anIntArray54 != null) {
						local58 = local58.method369();
					}
					if (local58 == null) {
						continue;
					}
				}
				if (Static81.anInt2219 <= local14) {
					local58 = ((Class6_Sub3_Sub1_Sub2_Sub1) local28).aClass6_Sub3_Sub2_1;
					if (local58.anIntArray54 != null) {
						local58 = local58.method369();
					}
					if (local58.anInt487 >= 0 && local58.anInt487 < Static17.aClass6_Sub3_Sub3_Sub2Array9.length) {
						Static123.method2170(local28, local28.anInt2349 + 15);
						if (Static99.anInt2785 > -1) {
							Static17.aClass6_Sub3_Sub3_Sub2Array9[local58.anInt487].method1252(Static99.anInt2785 - 12, Static120.anInt3217 - 30);
						}
					}
					if (Static117.anInt3000 == 1 && Static40.anInt2114 == Static80.anIntArray247[local14 - Static81.anInt2219] && Static73.anInt2064 % 20 < 10) {
						Static123.method2170(local28, local28.anInt2349 + 15);
						if (Static99.anInt2785 > -1) {
							Static2.aClass6_Sub3_Sub3_Sub2Array1[0].method1252(Static99.anInt2785 - 12, Static120.anInt3217 + -28);
						}
					}
				} else {
					local74 = 30;
					@Pc(77) Class6_Sub3_Sub1_Sub2_Sub2 local77 = (Class6_Sub3_Sub1_Sub2_Sub2) local28;
					if (local77.anInt2361 != -1 || local77.anInt2372 != -1) {
						Static123.method2170(local28, local28.anInt2349 + 15);
						if (Static99.anInt2785 > -1) {
							if (local77.anInt2361 != -1) {
								Static21.aClass6_Sub3_Sub3_Sub2Array4[local77.anInt2361].method1252(Static99.anInt2785 - 12, Static120.anInt3217 - 30);
								local74 += 25;
							}
							if (local77.anInt2372 != -1) {
								Static17.aClass6_Sub3_Sub3_Sub2Array9[local77.anInt2372].method1252(Static99.anInt2785 - 12, Static120.anInt3217 - local74);
								local74 += 25;
							}
						}
					}
					if (local14 >= 0 && Static117.anInt3000 == 10 && Static2.anInt32 == Static114.anIntArray356[local14]) {
						Static123.method2170(local28, local28.anInt2349 + 15);
						if (Static99.anInt2785 > -1) {
							Static2.aClass6_Sub3_Sub3_Sub2Array1[1].method1252(Static99.anInt2785 - 12, Static120.anInt3217 + -local74);
						}
					}
				}
				if (local28.aClass63_1232 != null && (local14 >= Static81.anInt2219 || Static15.anInt494 == 0 || Static15.anInt494 == 3 || Static15.anInt494 == 1 && Static52.method1073(((Class6_Sub3_Sub1_Sub2_Sub2) local28).aClass63_1237))) {
					Static123.method2170(local28, local28.anInt2349);
					if (Static99.anInt2785 > -1 && Static85.anInt2837 > Static123.anInt3313) {
						Static85.anIntArray301[Static123.anInt3313] = Static114.aClass6_Sub3_Sub3_Sub1_4.method450(local28.aClass63_1232) / 2;
						Static85.anIntArray302[Static123.anInt3313] = Static114.aClass6_Sub3_Sub3_Sub1_4.anInt555;
						Static85.anIntArray298[Static123.anInt3313] = Static99.anInt2785;
						Static85.anIntArray300[Static123.anInt3313] = Static120.anInt3217;
						Static85.anIntArray304[Static123.anInt3313] = local28.anInt2322;
						Static85.anIntArray303[Static123.anInt3313] = local28.anInt2343;
						Static85.anIntArray299[Static123.anInt3313] = local28.anInt2291;
						Static85.aClass63Array19[Static123.anInt3313] = local28.aClass63_1232;
						Static123.anInt3313++;
					}
				}
				if (local28.anInt2306 > Static73.anInt2064) {
					Static123.method2170(local28, local28.anInt2349 + 15);
					if (Static99.anInt2785 > -1) {
						local74 = local28.anInt2315 * 30 / local28.anInt2336;
						if (local74 > 30) {
							local74 = 30;
						}
						Static121.method1976(Static99.anInt2785 - 15, Static120.anInt3217 + -3, local74, 5, 65280);
						Static121.method1976(local74 + Static99.anInt2785 - 15, Static120.anInt3217 - 3, 30 - local74, 5, 16711680);
					}
				}
				for (local74 = 0; local74 < 4; local74++) {
					if (Static73.anInt2064 < local28.anIntArray274[local74]) {
						Static123.method2170(local28, local28.anInt2349 / 2);
						if (Static99.anInt2785 > -1) {
							if (local74 == 1) {
								Static120.anInt3217 -= 20;
							}
							if (local74 == 2) {
								Static99.anInt2785 -= 15;
								Static120.anInt3217 -= 10;
							}
							if (local74 == 3) {
								Static120.anInt3217 -= 10;
								Static99.anInt2785 += 15;
							}
							Static72.aClass6_Sub3_Sub3_Sub2Array6[local28.anIntArray269[local74]].method1252(Static99.anInt2785 - 12, Static120.anInt3217 - 12);
							Static92.aClass6_Sub3_Sub3_Sub1_3.method457(Static118.method2114(local28.anIntArray270[local74]), Static99.anInt2785, Static120.anInt3217 + 4, 0);
							Static92.aClass6_Sub3_Sub3_Sub1_3.method457(Static118.method2114(local28.anIntArray270[local74]), Static99.anInt2785 - 1, Static120.anInt3217 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(504) int local504 = 0; local504 < Static123.anInt3313; local504++) {
			local74 = Static85.anIntArray298[local504];
			@Pc(514) int local514 = Static85.anIntArray300[local504];
			@Pc(518) int local518 = Static85.anIntArray301[local504];
			@Pc(520) boolean local520 = true;
			@Pc(524) int local524 = Static85.anIntArray302[local504];
			while (local520) {
				local520 = false;
				for (@Pc(530) int local530 = 0; local530 < local504; local530++) {
					if (Static85.anIntArray300[local530] - Static85.anIntArray302[local530] < local514 + 2 && local514 - local524 < Static85.anIntArray300[local530] - -2 && Static85.anIntArray301[local530] + Static85.anIntArray298[local530] > -local518 + local74 && local74 + local518 > Static85.anIntArray298[local530] + -Static85.anIntArray301[local530] && Static85.anIntArray300[local530] - Static85.anIntArray302[local530] < local514) {
						local514 = Static85.anIntArray300[local530] - Static85.anIntArray302[local530];
						local520 = true;
					}
				}
			}
			Static99.anInt2785 = Static85.anIntArray298[local504];
			Static120.anInt3217 = Static85.anIntArray300[local504] = local514;
			@Pc(630) Class63 local630 = Static85.aClass63Array19[local504];
			if (Static51.anInt1579 == 0) {
				@Pc(637) int local637 = 16776960;
				if (Static85.anIntArray304[local504] < 6) {
					local637 = Static110.anIntArray351[Static85.anIntArray304[local504]];
				}
				if (Static85.anIntArray304[local504] == 6) {
					local637 = Static106.anInt2958 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static85.anIntArray304[local504] == 7) {
					local637 = Static106.anInt2958 % 20 < 10 ? 255 : 65535;
				}
				if (Static85.anIntArray304[local504] == 8) {
					local637 = Static106.anInt2958 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(710) int local710;
				if (Static85.anIntArray304[local504] == 9) {
					local710 = 150 - Static85.anIntArray299[local504];
					if (local710 < 50) {
						local637 = local710 * 1280 + 16711680;
					} else if (local710 < 100) {
						local637 = 16776960 + 16384000 - local710 * 327680;
					} else if (local710 < 150) {
						local637 = (local710 - 100) * 5 + 65280;
					}
				}
				if (Static85.anIntArray304[local504] == 10) {
					local710 = 150 - Static85.anIntArray299[local504];
					if (local710 < 50) {
						local637 = local710 * 5 + 16711680;
					} else if (local710 < 100) {
						local637 = 16711935 - (local710 - 50) * 327680;
					} else if (local710 < 150) {
						local637 = (local710 - 100) * 327680 + 500 + 255 - local710 * 5;
					}
				}
				if (Static85.anIntArray304[local504] == 11) {
					local710 = 150 - Static85.anIntArray299[local504];
					if (local710 < 50) {
						local637 = 16777215 - local710 * 327685;
					} else if (local710 < 100) {
						local637 = local710 * 327685 + 65280 - 16384250;
					} else if (local710 < 150) {
						local637 = 16777215 - (local710 - 100) * 327680;
					}
				}
				if (Static85.anIntArray303[local504] == 0) {
					Static114.aClass6_Sub3_Sub3_Sub1_4.method457(local630, Static99.anInt2785, Static120.anInt3217 + 1, 0);
					Static114.aClass6_Sub3_Sub3_Sub1_4.method457(local630, Static99.anInt2785, Static120.anInt3217, local637);
				}
				if (Static85.anIntArray303[local504] == 1) {
					Static114.aClass6_Sub3_Sub3_Sub1_4.method452(local630, Static99.anInt2785, Static120.anInt3217 + 1, 0, Static106.anInt2958);
					Static114.aClass6_Sub3_Sub3_Sub1_4.method452(local630, Static99.anInt2785, Static120.anInt3217, local637, Static106.anInt2958);
				}
				if (Static85.anIntArray303[local504] == 2) {
					Static114.aClass6_Sub3_Sub3_Sub1_4.method454(local630, Static99.anInt2785, Static120.anInt3217 + 1, 0, Static106.anInt2958);
					Static114.aClass6_Sub3_Sub3_Sub1_4.method454(local630, Static99.anInt2785, Static120.anInt3217, local637, Static106.anInt2958);
				}
				if (Static85.anIntArray303[local504] == 3) {
					Static114.aClass6_Sub3_Sub3_Sub1_4.method439(local630, Static99.anInt2785, Static120.anInt3217 + 1, 0, Static106.anInt2958, 150 - Static85.anIntArray299[local504]);
					Static114.aClass6_Sub3_Sub3_Sub1_4.method439(local630, Static99.anInt2785, Static120.anInt3217, local637, Static106.anInt2958, 150 - Static85.anIntArray299[local504]);
				}
				@Pc(980) int local980;
				if (Static85.anIntArray303[local504] == 4) {
					local710 = Static114.aClass6_Sub3_Sub3_Sub1_4.method450(local630);
					local980 = (150 - Static85.anIntArray299[local504]) * (local710 + 100) / 150;
					Static121.method1969(Static99.anInt2785 - 50, 0, Static99.anInt2785 + 50, 334);
					Static114.aClass6_Sub3_Sub3_Sub1_4.method456(local630, Static99.anInt2785 + 50 - local980, Static120.anInt3217 + 1, 0);
					Static114.aClass6_Sub3_Sub3_Sub1_4.method456(local630, Static99.anInt2785 + 50 - local980, Static120.anInt3217, local637);
					Static121.method1978();
				}
				if (Static85.anIntArray303[local504] == 5) {
					local710 = 150 - Static85.anIntArray299[local504];
					Static121.method1969(0, Static120.anInt3217 - Static114.aClass6_Sub3_Sub3_Sub1_4.anInt555 - 1, 512, Static120.anInt3217 + 5);
					local980 = 0;
					if (local710 < 25) {
						local980 = local710 - 25;
					} else if (local710 > 125) {
						local980 = local710 - 125;
					}
					Static114.aClass6_Sub3_Sub3_Sub1_4.method457(local630, Static99.anInt2785, Static120.anInt3217 + local980 + 1, 0);
					Static114.aClass6_Sub3_Sub3_Sub1_4.method457(local630, Static99.anInt2785, Static120.anInt3217 + local980, local637);
					Static121.method1978();
				}
			} else {
				Static114.aClass6_Sub3_Sub3_Sub1_4.method457(local630, Static99.anInt2785, Static120.anInt3217 + 1, 0);
				Static114.aClass6_Sub3_Sub3_Sub1_4.method457(local630, Static99.anInt2785, Static120.anInt3217, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method872() {
		Static44.method959();
		Static52.aBoolean79 = true;
		Static13.method349();
		if (Static32.aBoolean57) {
			Static114.aClass6_Sub3_Sub3_Sub1_4.method457(Static111.aClass63_1659, 239, 40, 0);
			Static114.aClass6_Sub3_Sub3_Sub1_4.method457(Static15.method374(new Class63[] { Static111.aClass63_1662, Static51.aClass63_836 }), 239, 60, 128);
		} else if (Static70.anInt2011 == 1) {
			Static114.aClass6_Sub3_Sub3_Sub1_4.method457(Static11.aClass63_1026, 239, 40, 0);
			Static114.aClass6_Sub3_Sub3_Sub1_4.method457(Static15.method374(new Class63[] { Static111.aClass63_1657, Static51.aClass63_836 }), 239, 60, 128);
		} else if (Static70.anInt2011 == 2) {
			Static114.aClass6_Sub3_Sub3_Sub1_4.method457(Static116.aClass63_1728, 239, 40, 0);
			Static114.aClass6_Sub3_Sub3_Sub1_4.method457(Static15.method374(new Class63[] { Static111.aClass63_1657, Static51.aClass63_836 }), 239, 60, 128);
		} else {
			@Pc(148) int local148;
			@Pc(155) int local155;
			@Pc(146) Class6_Sub3_Sub3_Sub1 local146;
			if (Static70.anInt2011 == 3) {
				if (Static111.aClass63_1653 != Static111.aClass63_1657) {
					Static38.method880(Static111.aClass63_1657);
					Static111.aClass63_1653 = Static111.aClass63_1657;
				}
				local146 = Static48.aClass6_Sub3_Sub3_Sub1_2;
				Static121.method1969(0, 0, 463, 77);
				for (local148 = 0; local148 < Static94.anInt2625; local148++) {
					local155 = local148 * 14 + 18 - Static112.anInt3092;
					if (local155 > 0 && local155 < 110) {
						local146.method457(Static34.aClass63Array8[local148], 239, local155, 0);
					}
				}
				Static121.method1978();
				if (Static94.anInt2625 > 5) {
					Static18.method464(77, Static94.anInt2625 * 14 + 7, 0, Static112.anInt3092, 463);
				}
				if (Static111.aClass63_1657.method1811() == 0) {
					Static114.aClass6_Sub3_Sub3_Sub1_4.method457(Static105.aClass63_1581, 239, 40, 255);
				} else if (Static94.anInt2625 == 0) {
					Static114.aClass6_Sub3_Sub3_Sub1_4.method457(Static19.aClass63_410, 239, 40, 0);
				}
				local146.method457(Static15.method374(new Class63[] { Static111.aClass63_1657, Static51.aClass63_836 }), 239, 90, 0);
				Static121.method1975(0, 77, 479, 0);
			} else if (Static70.anInt2011 == 4) {
				Static114.aClass6_Sub3_Sub3_Sub1_4.method457(Static111.aClass63_1664, 239, 40, 0);
				Static114.aClass6_Sub3_Sub3_Sub1_4.method457(Static15.method374(new Class63[] { Static111.aClass63_1657, Static51.aClass63_836 }), 239, 60, 128);
			} else if (Static2.aClass63_14 == null) {
				@Pc(119) boolean local119;
				if (Static49.anInt1513 != -1) {
					local119 = Static72.method1385(2, 479, 96, Static49.anInt1513);
					if (!local119) {
						Static15.aBoolean29 = true;
					}
				} else if (Static79.anInt2158 == -1) {
					local146 = Static48.aClass6_Sub3_Sub3_Sub1_2;
					local148 = 0;
					Static121.method1969(0, 0, 463, 77);
					for (local155 = 0; local155 < 100; local155++) {
						if (Static106.aClass63Array20[local155] != null) {
							@Pc(165) int local165 = Static100.anIntArray296[local155];
							@Pc(175) int local175 = Static111.anInt3048 + 70 - local148 * 14;
							@Pc(179) Class63 local179 = Static39.aClass63Array9[local155];
							@Pc(181) byte local181 = 0;
							if (local179 != null && local179.method1803(Static54.aClass63_861)) {
								local179 = local179.method1806(5);
								local181 = 1;
							}
							if (local179 != null && local179.method1803(Static35.aClass63_627)) {
								local181 = 2;
								local179 = local179.method1806(5);
							}
							if (local165 == 0) {
								local148++;
								if (local175 > 0 && local175 < 110) {
									local146.method456(Static106.aClass63Array20[local155], 4, local175, 0);
								}
							}
							@Pc(268) int local268;
							if ((local165 == 1 || local165 == 2) && (local165 == 1 || Static15.anInt494 == 0 || Static15.anInt494 == 1 && Static52.method1073(local179))) {
								local148++;
								if (local175 > 0 && local175 < 110) {
									local268 = 4;
									if (local181 == 1) {
										Static6.aClass6_Sub3_Sub3_Sub3Array1[0].method1768(4, local175 - 12);
										local268 += 14;
									}
									if (local181 == 2) {
										Static6.aClass6_Sub3_Sub3_Sub3Array1[1].method1768(local268, local175 - 12);
										local268 += 14;
									}
									local146.method456(Static15.method374(new Class63[] { local179, Static120.aClass63_1774 }), local268, local175, 0);
									local268 += local146.method450(local179) + 8;
									local146.method456(Static106.aClass63Array20[local155], local268, local175, 255);
								}
							}
							if ((local165 == 3 || local165 == 7) && Static79.anInt2162 == 0 && (local165 == 7 || Static38.anInt1233 == 0 || Static38.anInt1233 == 1 && Static52.method1073(local179))) {
								if (local175 > 0 && local175 < 110) {
									local146.method456(Static33.aClass63_614, 4, local175, 0);
									local268 = local146.method450(Static33.aClass63_614) + 4;
									local268 += local146.method442(32);
									if (local181 == 1) {
										Static6.aClass6_Sub3_Sub3_Sub3Array1[0].method1768(local268, local175 - 12);
										local268 += 14;
									}
									if (local181 == 2) {
										Static6.aClass6_Sub3_Sub3_Sub3Array1[1].method1768(local268, local175 - 12);
										local268 += 14;
									}
									local146.method456(Static15.method374(new Class63[] { local179, Static120.aClass63_1774 }), local268, local175, 0);
									local268 += local146.method450(local179) + 8;
									local146.method456(Static106.aClass63Array20[local155], local268, local175, 8388608);
								}
								local148++;
							}
							if (local165 == 4 && (Static68.anInt1974 == 0 || Static68.anInt1974 == 1 && Static52.method1073(local179))) {
								local148++;
								if (local175 > 0 && local175 < 110) {
									local146.method456(Static15.method374(new Class63[] { local179, Static41.aClass63_700, Static106.aClass63Array20[local155] }), 4, local175, 8388736);
								}
							}
							if (local165 == 5 && Static79.anInt2162 == 0 && Static38.anInt1233 < 2) {
								if (local175 > 0 && local175 < 110) {
									local146.method456(Static106.aClass63Array20[local155], 4, local175, 8388608);
								}
								local148++;
							}
							if (local165 == 6 && Static79.anInt2162 == 0 && Static38.anInt1233 < 2) {
								if (local175 > 0 && local175 < 110) {
									local146.method456(Static15.method374(new Class63[] { Static15.aClass63_330, Static41.aClass63_700, local179, Static120.aClass63_1774 }), 4, local175, 0);
									local146.method456(Static106.aClass63Array20[local155], local146.method450(Static15.method374(new Class63[] { Static15.aClass63_330, Static41.aClass63_700, local179 })) + 12, local175, 8388608);
								}
								local148++;
							}
							if (local165 == 8 && (Static68.anInt1974 == 0 || Static68.anInt1974 == 1 && Static52.method1073(local179))) {
								local148++;
								if (local175 > 0 && local175 < 110) {
									local146.method456(Static15.method374(new Class63[] { local179, Static41.aClass63_700, Static106.aClass63Array20[local155] }), 4, local175, 8270336);
								}
							}
						}
					}
					Static121.method1978();
					Static20.anInt652 = local148 * 14 + 7;
					if (Static20.anInt652 < 78) {
						Static20.anInt652 = 78;
					}
					Static18.method464(77, Static20.anInt652, 0, Static20.anInt652 - Static111.anInt3048 - 77, 463);
					@Pc(675) Class63 local675;
					if (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1 == null || Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.aClass63_1237 == null) {
						local675 = Static49.aClass63_805;
					} else {
						local675 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.aClass63_1237;
					}
					local146.method456(Static15.method374(new Class63[] { local675, Static120.aClass63_1774 }), 4, 90, 0);
					local146.method456(Static15.method374(new Class63[] { Static111.aClass63_1651, Static51.aClass63_836 }), local146.method450(Static15.method374(new Class63[] { local675, Static101.aClass63_1528 })) + 6, 90, 255);
					Static121.method1975(0, 77, 479, 0);
				} else {
					local119 = Static72.method1385(3, 479, 96, Static79.anInt2158);
					if (!local119) {
						Static15.aBoolean29 = true;
					}
				}
			} else {
				Static114.aClass6_Sub3_Sub3_Sub1_4.method445(Static2.aClass63_14, 10, 20, 459, 40, 0, false, 1, 1, 0);
				Static114.aClass6_Sub3_Sub3_Sub1_4.method457(Static51.aClass63_834, 239, 80, 128);
			}
		}
		if (Static12.aBoolean23 && Static19.anInt634 == 2) {
			Static49.method1037();
		}
		Static123.method2166();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lclient!hc;Lclient!ea;B)V")
	public static void method873(@OriginalArg(0) Class30[] arg0, @OriginalArg(1) Class19 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(30) int local30;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static103.aByteArrayArrayArray92[local7][local11][local15] & 0x1) == 1) {
						local30 = local7;
						if ((Static103.aByteArrayArrayArray92[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg0[local30].method998(local15, local11);
						}
					}
				}
			}
		}
		Static97.anInt2732 += (int) (Math.random() * 5.0D) - 2;
		Static51.anInt1576 += (int) (Math.random() * 5.0D) - 2;
		if (Static97.anInt2732 < -16) {
			Static97.anInt2732 = -16;
		}
		if (Static51.anInt1576 < -8) {
			Static51.anInt1576 = -8;
		}
		if (Static97.anInt2732 > 16) {
			Static97.anInt2732 = 16;
		}
		if (Static51.anInt1576 > 8) {
			Static51.anInt1576 = 8;
		}
		@Pc(127) int local127;
		@Pc(133) int local133;
		@Pc(156) int local156;
		@Pc(177) int local177;
		@Pc(191) int local191;
		@Pc(251) int local251;
		@Pc(255) int local255;
		@Pc(245) int local245;
		@Pc(272) int local272;
		@Pc(239) int local239;
		@Pc(503) int local503;
		@Pc(545) int local545;
		@Pc(645) int local645;
		@Pc(655) int local655;
		@Pc(670) int local670;
		@Pc(710) int local710;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(117) byte[][] local117 = Static31.aByteArrayArrayArray28[local11];
			local30 = (int) Math.sqrt(5100.0D);
			local127 = local30 * 768 >> 8;
			for (@Pc(129) int local129 = 1; local129 < 103; local129++) {
				for (local133 = 1; local133 < 103; local133++) {
					local156 = Static11.anIntArrayArrayArray6[local11][local133 + 1][local129] - Static11.anIntArrayArrayArray6[local11][local133 - 1][local129];
					local177 = Static11.anIntArrayArrayArray6[local11][local133][local129 + 1] - Static11.anIntArrayArrayArray6[local11][local133][local129 - 1];
					local191 = (int) Math.sqrt((double) (local156 * local156 + local177 * local177 + 65536));
					local239 = (local117[local133][local129 + 1] >> 3) + (local117[local133][local129 - 1] >> 2) + (local117[local133 + 1][local129] >> 3) + (local117[local133 - 1][local129] >> 2) + (local117[local133][local129] >> 1);
					local245 = (local177 << 8) / local191;
					local251 = (local156 << 8) / local191;
					local255 = 65536 / local191;
					local272 = (local251 * -50 + local255 * -10 + local245 * -50) / local127 + 96;
					Static53.anIntArrayArray36[local133][local129] = local272 - local239;
				}
			}
			for (local133 = 0; local133 < 104; local133++) {
				Static105.anIntArray321[local133] = 0;
				Static32.anIntArray136[local133] = 0;
				Static18.anIntArray62[local133] = 0;
				Static92.anIntArray286[local133] = 0;
				Static54.anIntArray178[local133] = 0;
			}
			for (local156 = -5; local156 < 109; local156++) {
				for (local177 = 0; local177 < 104; local177++) {
					local191 = local156 + 5;
					@Pc(397) int local397;
					if (local191 >= 0 && local191 < 104) {
						local251 = Static44.aByteArrayArrayArray38[local11][local191][local177] & 0xFF;
						if (local251 > 0) {
							@Pc(361) Class6_Sub3_Sub5 local361 = Static57.method1134(local251 - 1);
							Static105.anIntArray321[local177] += local361.anInt814;
							Static32.anIntArray136[local177] += local361.anInt830;
							Static18.anIntArray62[local177] += local361.anInt815;
							Static92.anIntArray286[local177] += local361.anInt813;
							local397 = Static54.anIntArray178[local177]++;
						}
					}
					local251 = local156 - 5;
					if (local251 >= 0 && local251 < 104) {
						local255 = Static44.aByteArrayArrayArray38[local11][local251][local177] & 0xFF;
						if (local255 > 0) {
							@Pc(432) Class6_Sub3_Sub5 local432 = Static57.method1134(local255 - 1);
							Static105.anIntArray321[local177] -= local432.anInt814;
							Static32.anIntArray136[local177] -= local432.anInt830;
							Static18.anIntArray62[local177] -= local432.anInt815;
							Static92.anIntArray286[local177] -= local432.anInt813;
							local397 = Static54.anIntArray178[local177]--;
						}
					}
				}
				if (local156 >= 1 && local156 < 103) {
					local191 = 0;
					local251 = 0;
					local255 = 0;
					local245 = 0;
					local272 = 0;
					for (local239 = -5; local239 < 109; local239++) {
						local503 = local239 + 5;
						if (local503 >= 0 && local503 < 104) {
							local255 += Static18.anIntArray62[local503];
							local191 += Static105.anIntArray321[local503];
							local272 += Static54.anIntArray178[local503];
							local245 += Static92.anIntArray286[local503];
							local251 += Static32.anIntArray136[local503];
						}
						local545 = local239 - 5;
						if (local545 >= 0 && local545 < 104) {
							local191 -= Static105.anIntArray321[local545];
							local272 -= Static54.anIntArray178[local545];
							local245 -= Static92.anIntArray286[local545];
							local251 -= Static32.anIntArray136[local545];
							local255 -= Static18.anIntArray62[local545];
						}
						if (local239 >= 1 && local239 < 103 && (!Static61.aBoolean98 || (Static103.aByteArrayArrayArray92[0][local156][local239] & 0x2) != 0 || (Static103.aByteArrayArrayArray92[local11][local156][local239] & 0x10) == 0 && Static118.method2116(local239, local11, local156) == Static47.anInt1479)) {
							if (Static31.anInt1021 > local11) {
								Static31.anInt1021 = local11;
							}
							local645 = Static44.aByteArrayArrayArray38[local11][local156][local239] & 0xFF;
							local655 = Static66.aByteArrayArrayArray91[local11][local156][local239] & 0xFF;
							if (local645 > 0 || local655 > 0) {
								local670 = Static11.anIntArrayArrayArray6[local11][local156][local239];
								@Pc(680) int local680 = Static11.anIntArrayArrayArray6[local11][local156][local239 + 1];
								@Pc(688) int local688 = Static53.anIntArrayArray36[local156 + 1][local239];
								@Pc(700) int local700 = Static11.anIntArrayArrayArray6[local11][local156 + 1][local239 + 1];
								local710 = Static11.anIntArrayArrayArray6[local11][local156 + 1][local239];
								@Pc(718) int local718 = Static53.anIntArrayArray36[local156][local239 + 1];
								@Pc(724) int local724 = Static53.anIntArrayArray36[local156][local239];
								@Pc(726) int local726 = -1;
								@Pc(736) int local736 = Static53.anIntArrayArray36[local156 + 1][local239 + 1];
								@Pc(738) int local738 = -1;
								@Pc(746) int local746;
								@Pc(750) int local750;
								if (local645 > 0) {
									local746 = local191 * 256 / local245;
									local750 = local251 / local272;
									@Pc(754) int local754 = local255 / local272;
									local726 = Static15.method375(local750, local754, local746);
									@Pc(766) int local766 = Static51.anInt1576 + local746 & 0xFF;
									local754 += Static97.anInt2732;
									if (local754 < 0) {
										local754 = 0;
									} else if (local754 > 255) {
										local754 = 255;
									}
									local738 = Static15.method375(local750, local754, local766);
								}
								if (local11 > 0) {
									@Pc(794) boolean local794 = true;
									if (local645 == 0 && Static60.aByteArrayArrayArray51[local11][local156][local239] != 0) {
										local794 = false;
									}
									if (local655 > 0 && !Static50.method1040(local655 - 1).aBoolean125) {
										local794 = false;
									}
									if (local794 && local670 == local710 && local700 == local670 && local670 == local680) {
										Static89.anIntArrayArrayArray9[local11][local156][local239] |= 0x924;
									}
								}
								local746 = 0;
								if (local738 != -1) {
									local746 = Static107.anIntArray344[Static91.method1667(96, local738)];
								}
								if (local655 == 0) {
									arg1.method695(local11, local156, local239, 0, 0, -1, local670, local710, local700, local680, Static91.method1667(local724, local726), Static91.method1667(local688, local726), Static91.method1667(local736, local726), Static91.method1667(local718, local726), 0, 0, 0, 0, local746, 0);
								} else {
									local750 = Static60.aByteArrayArrayArray51[local11][local156][local239] + 1;
									@Pc(888) byte local888 = Static79.aByteArrayArrayArray59[local11][local156][local239];
									@Pc(894) Class6_Sub3_Sub14 local894 = Static50.method1040(local655 - 1);
									@Pc(897) int local897 = local894.anInt2464;
									@Pc(912) int local912;
									@Pc(914) int local914;
									@Pc(932) int local932;
									@Pc(938) int local938;
									if (local897 >= 0) {
										local912 = -1;
										local914 = Static107.anInterface1_1.method2072(local897);
									} else if (local894.anInt2462 == 16711935) {
										local897 = -1;
										local912 = -2;
										local914 = -2;
									} else {
										local912 = Static15.method375(local894.anInt2452, local894.anInt2467, local894.anInt2458);
										local932 = local894.anInt2458 + Static51.anInt1576 & 0xFF;
										local938 = local894.anInt2467 + Static97.anInt2732;
										if (local938 < 0) {
											local938 = 0;
										} else if (local938 > 255) {
											local938 = 255;
										}
										local914 = Static15.method375(local894.anInt2452, local938, local932);
									}
									local932 = 0;
									if (local914 != -2) {
										local932 = Static107.anIntArray344[Static10.method263(local914, 96)];
									}
									if (local894.anInt2459 != -1) {
										local938 = Static51.anInt1576 + local894.anInt2460 & 0xFF;
										@Pc(996) int local996 = Static97.anInt2732 + local894.anInt2455;
										if (local996 < 0) {
											local996 = 0;
										} else if (local996 > 255) {
											local996 = 255;
										}
										local914 = Static15.method375(local894.anInt2457, local996, local938);
										local932 = Static107.anIntArray344[Static10.method263(local914, 96)];
									}
									arg1.method695(local11, local156, local239, local750, local888, local897, local670, local710, local700, local680, Static91.method1667(local724, local726), Static91.method1667(local688, local726), Static91.method1667(local736, local726), Static91.method1667(local718, local726), Static10.method263(local912, local724), Static10.method263(local912, local688), Static10.method263(local912, local736), Static10.method263(local912, local718), local746, local932);
								}
							}
						}
					}
				}
			}
			for (local177 = 1; local177 < 103; local177++) {
				for (local191 = 1; local191 < 103; local191++) {
					arg1.method655(local11, local191, local177, Static118.method2116(local177, local11, local191));
				}
			}
			Static44.aByteArrayArrayArray38[local11] = null;
			Static66.aByteArrayArrayArray91[local11] = null;
			Static60.aByteArrayArrayArray51[local11] = null;
			Static79.aByteArrayArrayArray59[local11] = null;
			Static31.aByteArrayArrayArray28[local11] = null;
		}
		arg1.method669();
		for (local15 = 0; local15 < 104; local15++) {
			for (local30 = 0; local30 < 104; local30++) {
				if ((Static103.aByteArrayArrayArray92[1][local15][local30] & 0x2) == 2) {
					arg1.method681(local15, local30);
				}
			}
		}
		local30 = 1;
		local127 = 2;
		local133 = 4;
		for (local156 = 0; local156 < 4; local156++) {
			if (local156 > 0) {
				local30 <<= 0x3;
				local127 <<= 0x3;
				local133 <<= 0x3;
			}
			for (local177 = 0; local177 <= local156; local177++) {
				for (local191 = 0; local191 <= 104; local191++) {
					for (local251 = 0; local251 <= 104; local251++) {
						if ((Static89.anIntArrayArrayArray9[local177][local251][local191] & local30) != 0) {
							local255 = local191;
							local245 = local191;
							local272 = local177;
							while (local255 > 0 && (Static89.anIntArrayArrayArray9[local177][local251][local255 - 1] & local30) != 0) {
								local255--;
							}
							local239 = local177;
							while (local245 < 104 && (local30 & Static89.anIntArrayArrayArray9[local177][local251][local245 + 1]) != 0) {
								local245++;
							}
							label347: while (local272 > 0) {
								for (local503 = local255; local503 <= local245; local503++) {
									if ((local30 & Static89.anIntArrayArrayArray9[local272 - 1][local251][local503]) == 0) {
										break label347;
									}
								}
								local272--;
							}
							label336: while (local239 < local156) {
								for (local503 = local255; local503 <= local245; local503++) {
									if ((Static89.anIntArrayArrayArray9[local239 + 1][local251][local503] & local30) == 0) {
										break label336;
									}
								}
								local239++;
							}
							local503 = (local239 + 1 - local272) * (local245 + 1 - local255);
							if (local503 >= 8) {
								local645 = Static11.anIntArrayArrayArray6[local239][local251][local255] - 240;
								local655 = Static11.anIntArrayArrayArray6[local272][local251][local255];
								Static28.method652(local156, 1, local251 * 128, local251 * 128, local255 * 128, local245 * 128 + 128, local645, local655);
								for (local670 = local272; local670 <= local239; local670++) {
									for (local710 = local255; local710 <= local245; local710++) {
										Static89.anIntArrayArrayArray9[local670][local251][local710] &= ~local30;
									}
								}
							}
						}
						if ((Static89.anIntArrayArrayArray9[local177][local251][local191] & local127) != 0) {
							for (local255 = local251; local255 > 0 && (Static89.anIntArrayArrayArray9[local177][local255 - 1][local191] & local127) != 0; local255--) {
							}
							local245 = local251;
							local239 = local177;
							local272 = local177;
							while (local245 < 104 && (Static89.anIntArrayArrayArray9[local177][local245 + 1][local191] & local127) != 0) {
								local245++;
							}
							label401: while (local272 > 0) {
								for (local503 = local255; local503 <= local245; local503++) {
									if ((Static89.anIntArrayArrayArray9[local272 - 1][local503][local191] & local127) == 0) {
										break label401;
									}
								}
								local272--;
							}
							label390: while (local239 < local156) {
								for (local503 = local255; local503 <= local245; local503++) {
									if ((Static89.anIntArrayArrayArray9[local239 + 1][local503][local191] & local127) == 0) {
										break label390;
									}
								}
								local239++;
							}
							local503 = (local239 + 1 - local272) * (local245 + 1 - local255);
							if (local503 >= 8) {
								local655 = Static11.anIntArrayArrayArray6[local272][local255][local191];
								local645 = Static11.anIntArrayArrayArray6[local239][local255][local191] - 240;
								Static28.method652(local156, 2, local255 * 128, local245 * 128 + 128, local191 * 128, local191 * 128, local645, local655);
								for (local670 = local272; local670 <= local239; local670++) {
									for (local710 = local255; local710 <= local245; local710++) {
										Static89.anIntArrayArrayArray9[local670][local710][local191] &= ~local127;
									}
								}
							}
						}
						if ((Static89.anIntArrayArrayArray9[local177][local251][local191] & local133) != 0) {
							local245 = local251;
							local255 = local251;
							for (local272 = local191; local272 > 0 && (Static89.anIntArrayArrayArray9[local177][local251][local272 - 1] & local133) != 0; local272--) {
							}
							for (local239 = local191; local239 < 104 && (local133 & Static89.anIntArrayArrayArray9[local177][local251][local239 + 1]) != 0; local239++) {
							}
							label455: while (local255 > 0) {
								for (local503 = local272; local503 <= local239; local503++) {
									if ((local133 & Static89.anIntArrayArrayArray9[local177][local255 - 1][local503]) == 0) {
										break label455;
									}
								}
								local255--;
							}
							label444: while (local245 < 104) {
								for (local503 = local272; local503 <= local239; local503++) {
									if ((Static89.anIntArrayArrayArray9[local177][local245 + 1][local503] & local133) == 0) {
										break label444;
									}
								}
								local245++;
							}
							if ((local245 + 1 - local255) * (-local272 + local239 + 1) >= 4) {
								local503 = Static11.anIntArrayArrayArray6[local177][local255][local272];
								Static28.method652(local156, 4, local255 * 128, local245 * 128 + 128, local272 * 128, local239 * 128 + 128, local503, local503);
								for (local545 = local255; local545 <= local245; local545++) {
									for (local645 = local272; local645 <= local239; local645++) {
										Static89.anIntArrayArrayArray9[local177][local545][local645] &= ~local133;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)V")
	public static void method874(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static69.anIntArray225[arg0];
		@Pc(16) int local16 = Static61.anIntArray193[arg0];
		@Pc(20) int local20 = Static124.anIntArray372[arg0];
		@Pc(24) int local24 = Static79.anIntArray243[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		if (Static70.anInt2011 != 0 && local12 != 1001) {
			Static15.aBoolean29 = true;
			Static70.anInt2011 = 0;
		}
		@Pc(47) Class6_Sub3_Sub1_Sub2_Sub2 local47;
		if (local12 == 7) {
			local47 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local24];
			if (local47 != null) {
				Static113.method488(0, local47.anIntArray273[0], 2, false, local47.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static112.anInt3088 = 2;
				Static34.anInt1151 = 0;
				Static84.anInt2419 = Static59.anInt1765;
				Static76.anInt2138 = Static61.anInt1804;
				Static23.aClass6_Sub4_Sub1_4.method1347(63);
				Static23.aClass6_Sub4_Sub1_4.method1326(Static13.anInt432);
				Static23.aClass6_Sub4_Sub1_4.method1332(Static2.anInt28);
				Static23.aClass6_Sub4_Sub1_4.method1317(Static64.anInt1831);
				Static23.aClass6_Sub4_Sub1_4.method1332(local24);
			}
		}
		if (local12 == 33) {
			Static23.aClass6_Sub4_Sub1_4.method1347(42);
			Static23.aClass6_Sub4_Sub1_4.method1322(local20);
			Static23.aClass6_Sub4_Sub1_4.method1326(local24);
			Static23.aClass6_Sub4_Sub1_4.method1332(local16);
			Static106.anInt2947 = 0;
			Static112.anInt3090 = 2;
			Static90.anInt2545 = local16;
			Static89.anInt2473 = local20;
			if (Static102.anInt2833 == local20 >> 16) {
				Static112.anInt3090 = 1;
			}
			if (local20 >> 16 == Static49.anInt1513) {
				Static112.anInt3090 = 3;
			}
		}
		@Pc(165) Class6_Sub3_Sub1_Sub2_Sub1 local165;
		if (local12 == 11) {
			local165 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local24];
			if (local165 != null) {
				Static113.method488(0, local165.anIntArray273[0], 2, false, local165.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static76.anInt2138 = Static61.anInt1804;
				Static34.anInt1151 = 0;
				Static112.anInt3088 = 2;
				Static84.anInt2419 = Static59.anInt1765;
				Static23.aClass6_Sub4_Sub1_4.method1347(121);
				Static23.aClass6_Sub4_Sub1_4.method1326(local24);
			}
		}
		@Pc(225) int local225;
		@Pc(220) Class63 local220;
		if (local12 == 39) {
			local220 = Static31.aClass63Array7[arg0];
			local225 = local220.method1805(Static102.aClass63_1535);
			if (local225 != -1) {
				if (Static102.anInt2833 == -1) {
					Static17.method1723();
					if (Static40.anInt2120 != -1) {
						Static111.aClass63_1652 = local220.method1806(local225 + 5).method1833();
						Static93.aBoolean138 = false;
						Static112.anInt3084 = Static102.anInt2833 = Static40.anInt2120;
					}
				} else {
					Static46.method996(Static111.aClass63_1661, 0, Static39.aClass63_675);
					if (Static20.aClass63_417 != null) {
						Static46.method996(Static111.aClass63_1661, 0, Static20.aClass63_417);
					}
				}
			}
		}
		@Pc(289) boolean local289;
		if (local12 == 3) {
			local289 = Static113.method488(0, local16, 2, false, local20, 0, 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 0);
			if (!local289) {
				Static113.method488(0, local16, 2, false, local20, 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
			}
			Static84.anInt2419 = Static59.anInt1765;
			Static34.anInt1151 = 0;
			Static76.anInt2138 = Static61.anInt1804;
			Static112.anInt3088 = 2;
			Static23.aClass6_Sub4_Sub1_4.method1347(10);
			Static23.aClass6_Sub4_Sub1_4.method1314(local16 + Static80.anInt2169);
			Static23.aClass6_Sub4_Sub1_4.method1332(local24);
			Static23.aClass6_Sub4_Sub1_4.method1332(Static91.anInt2560 + local20);
		}
		if (local12 == 54) {
			Static23.aClass6_Sub4_Sub1_4.method1347(192);
			Static23.aClass6_Sub4_Sub1_4.method1298(local16);
			Static23.aClass6_Sub4_Sub1_4.method1326(local24);
			Static23.aClass6_Sub4_Sub1_4.method1281(local20);
			Static90.anInt2545 = local16;
			Static112.anInt3090 = 2;
			if (local20 >> 16 == Static102.anInt2833) {
				Static112.anInt3090 = 1;
			}
			Static106.anInt2947 = 0;
			if (local20 >> 16 == Static49.anInt1513) {
				Static112.anInt3090 = 3;
			}
			Static89.anInt2473 = local20;
		}
		@Pc(414) Class6_Sub3_Sub17 local414;
		if (local12 == 15) {
			Static23.aClass6_Sub4_Sub1_4.method1347(81);
			Static23.aClass6_Sub4_Sub1_4.method1292(local20);
			local414 = Static12.method339(local20);
			if (local414.anIntArrayArray38 != null && local414.anIntArrayArray38[0][0] == 5) {
				local225 = local414.anIntArrayArray38[0][1];
				if (Static89.anIntArray283[local225] != local414.anIntArray366[0]) {
					Static89.anIntArray283[local225] = local414.anIntArray366[0];
					Static66.method2129(local225);
					Static10.aBoolean20 = true;
				}
			}
		}
		if (local12 == 28) {
			Static23.aClass6_Sub4_Sub1_4.method1347(104);
			Static23.aClass6_Sub4_Sub1_4.method1292(local20);
			Static23.aClass6_Sub4_Sub1_4.method1314(local16);
			Static23.aClass6_Sub4_Sub1_4.method1326(local24);
			Static89.anInt2473 = local20;
			Static106.anInt2947 = 0;
			Static90.anInt2545 = local16;
			Static112.anInt3090 = 2;
			if (Static102.anInt2833 == local20 >> 16) {
				Static112.anInt3090 = 1;
			}
			if (local20 >> 16 == Static49.anInt1513) {
				Static112.anInt3090 = 3;
			}
		}
		if (local12 == 29) {
			local47 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local24];
			if (local47 != null) {
				Static113.method488(0, local47.anIntArray273[0], 2, false, local47.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static84.anInt2419 = Static59.anInt1765;
				Static112.anInt3088 = 2;
				Static76.anInt2138 = Static61.anInt1804;
				Static34.anInt1151 = 0;
				Static23.aClass6_Sub4_Sub1_4.method1347(91);
				Static23.aClass6_Sub4_Sub1_4.method1298(local24);
			}
		}
		if (local12 == 16) {
			local165 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local24];
			if (local165 != null) {
				Static113.method488(0, local165.anIntArray273[0], 2, false, local165.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static112.anInt3088 = 2;
				Static34.anInt1151 = 0;
				Static76.anInt2138 = Static61.anInt1804;
				Static84.anInt2419 = Static59.anInt1765;
				Static23.aClass6_Sub4_Sub1_4.method1347(109);
				Static23.aClass6_Sub4_Sub1_4.method1326(local24);
			}
		}
		if (local12 == 46) {
			Static75.method1419(Static79.anInt2158);
			Static79.anInt2158 = -1;
			Static15.aBoolean29 = true;
		}
		if (local12 == 52) {
			Static92.method1675(local20, local24, local16);
			Static23.aClass6_Sub4_Sub1_4.method1347(159);
			Static23.aClass6_Sub4_Sub1_4.method1326(Static91.anInt2560 + local20);
			Static23.aClass6_Sub4_Sub1_4.method1314(local16 + Static80.anInt2169);
			Static23.aClass6_Sub4_Sub1_4.method1326(local24 >> 14 & 0x7FFF);
		}
		if (local12 == 47) {
			local289 = Static113.method488(0, local16, 2, false, local20, 0, 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 0);
			if (!local289) {
				Static113.method488(0, local16, 2, false, local20, 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
			}
			Static112.anInt3088 = 2;
			Static84.anInt2419 = Static59.anInt1765;
			Static76.anInt2138 = Static61.anInt1804;
			Static34.anInt1151 = 0;
			Static23.aClass6_Sub4_Sub1_4.method1347(29);
			Static23.aClass6_Sub4_Sub1_4.method1292(Static64.anInt1831);
			Static23.aClass6_Sub4_Sub1_4.method1314(Static80.anInt2169 + local16);
			Static23.aClass6_Sub4_Sub1_4.method1298(local20 + Static91.anInt2560);
			Static23.aClass6_Sub4_Sub1_4.method1332(Static2.anInt28);
			Static23.aClass6_Sub4_Sub1_4.method1298(Static13.anInt432);
			Static23.aClass6_Sub4_Sub1_4.method1332(local24);
		}
		if (local12 == 1004) {
			Static84.anInt2419 = Static59.anInt1765;
			Static76.anInt2138 = Static61.anInt1804;
			Static34.anInt1151 = 0;
			Static112.anInt3088 = 2;
			local165 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local24];
			if (local165 != null) {
				@Pc(778) Class6_Sub3_Sub2 local778 = local165.aClass6_Sub3_Sub2_1;
				if (local778.anIntArray54 != null) {
					local778 = local778.method369();
				}
				if (local778 != null) {
					Static23.aClass6_Sub4_Sub1_4.method1347(207);
					Static23.aClass6_Sub4_Sub1_4.method1326(local778.anInt478);
				}
			}
		}
		if (local12 == 38) {
			local47 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local24];
			if (local47 != null) {
				Static113.method488(0, local47.anIntArray273[0], 2, false, local47.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static76.anInt2138 = Static61.anInt1804;
				Static84.anInt2419 = Static59.anInt1765;
				Static34.anInt1151 = 0;
				Static112.anInt3088 = 2;
				Static23.aClass6_Sub4_Sub1_4.method1347(41);
				Static23.aClass6_Sub4_Sub1_4.method1292(Static89.anInt2478);
				Static23.aClass6_Sub4_Sub1_4.method1314(Static42.anInt1321);
				Static23.aClass6_Sub4_Sub1_4.method1314(local24);
			}
		}
		if (local12 == 48 && Static92.method1675(local20, local24, local16)) {
			Static23.aClass6_Sub4_Sub1_4.method1347(39);
			Static23.aClass6_Sub4_Sub1_4.method1332(local24 >> 14 & 0x7FFF);
			Static23.aClass6_Sub4_Sub1_4.method1322(Static89.anInt2478);
			Static23.aClass6_Sub4_Sub1_4.method1314(Static91.anInt2560 + local20);
			Static23.aClass6_Sub4_Sub1_4.method1326(local16 + Static80.anInt2169);
			Static23.aClass6_Sub4_Sub1_4.method1298(Static42.anInt1321);
		}
		if (local12 == 1006) {
			Static76.anInt2138 = Static61.anInt1804;
			Static112.anInt3088 = 2;
			Static34.anInt1151 = 0;
			Static84.anInt2419 = Static59.anInt1765;
			Static23.aClass6_Sub4_Sub1_4.method1347(1);
			Static23.aClass6_Sub4_Sub1_4.method1332(local24 >> 14 & 0x7FFF);
		}
		if (local12 == 6) {
			Static23.aClass6_Sub4_Sub1_4.method1347(81);
			Static23.aClass6_Sub4_Sub1_4.method1292(local20);
			local414 = Static12.method339(local20);
			if (local414.anIntArrayArray38 != null && local414.anIntArrayArray38[0][0] == 5) {
				local225 = local414.anIntArrayArray38[0][1];
				Static89.anIntArray283[local225] = 1 - Static89.anIntArray283[local225];
				Static66.method2129(local225);
				Static10.aBoolean20 = true;
			}
		}
		if (local12 == 50) {
			local47 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local24];
			if (local47 != null) {
				Static113.method488(0, local47.anIntArray273[0], 2, false, local47.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static84.anInt2419 = Static59.anInt1765;
				Static34.anInt1151 = 0;
				Static76.anInt2138 = Static61.anInt1804;
				Static112.anInt3088 = 2;
				Static23.aClass6_Sub4_Sub1_4.method1347(185);
				Static23.aClass6_Sub4_Sub1_4.method1298(local24);
			}
		}
		if (local12 == 26) {
			Static92.method1675(local20, local24, local16);
			Static23.aClass6_Sub4_Sub1_4.method1347(175);
			Static23.aClass6_Sub4_Sub1_4.method1326(local16 + Static80.anInt2169);
			Static23.aClass6_Sub4_Sub1_4.method1298(Static91.anInt2560 + local20);
			Static23.aClass6_Sub4_Sub1_4.method1332(local24 >> 14 & 0x7FFF);
		}
		if (local12 == 41) {
			Static23.aClass6_Sub4_Sub1_4.method1347(181);
			Static23.aClass6_Sub4_Sub1_4.method1317(Static64.anInt1831);
			Static23.aClass6_Sub4_Sub1_4.method1314(Static13.anInt432);
			Static23.aClass6_Sub4_Sub1_4.method1314(local24);
			Static23.aClass6_Sub4_Sub1_4.method1317(local20);
			Static23.aClass6_Sub4_Sub1_4.method1298(Static2.anInt28);
			Static23.aClass6_Sub4_Sub1_4.method1332(local16);
			Static112.anInt3090 = 2;
			Static106.anInt2947 = 0;
			Static90.anInt2545 = local16;
			if (local20 >> 16 == Static102.anInt2833) {
				Static112.anInt3090 = 1;
			}
			Static89.anInt2473 = local20;
			if (Static49.anInt1513 == local20 >> 16) {
				Static112.anInt3090 = 3;
			}
		}
		if (local12 == 25) {
			Static23.aClass6_Sub4_Sub1_4.method1347(77);
			Static23.aClass6_Sub4_Sub1_4.method1314(local24);
			Static23.aClass6_Sub4_Sub1_4.method1322(local20);
			Static23.aClass6_Sub4_Sub1_4.method1326(local16);
			Static89.anInt2473 = local20;
			Static112.anInt3090 = 2;
			Static90.anInt2545 = local16;
			if (Static102.anInt2833 == local20 >> 16) {
				Static112.anInt3090 = 1;
			}
			if (Static49.anInt1513 == local20 >> 16) {
				Static112.anInt3090 = 3;
			}
			Static106.anInt2947 = 0;
		}
		if (local12 == 51) {
			if (Static12.aBoolean23) {
				Static76.aClass19_1.method674(Static101.anInt2810, local16 - 4, local20 + -4);
			} else {
				Static76.aClass19_1.method674(Static101.anInt2810, Static59.anInt1765 - 4, Static61.anInt1804 + -4);
			}
		}
		if (local12 == 10) {
			local289 = Static113.method488(0, local16, 2, false, local20, 0, 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 0);
			if (!local289) {
				Static113.method488(0, local16, 2, false, local20, 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
			}
			Static76.anInt2138 = Static61.anInt1804;
			Static84.anInt2419 = Static59.anInt1765;
			Static112.anInt3088 = 2;
			Static34.anInt1151 = 0;
			Static23.aClass6_Sub4_Sub1_4.method1347(69);
			Static23.aClass6_Sub4_Sub1_4.method1326(local24);
			Static23.aClass6_Sub4_Sub1_4.method1314(local20 + Static91.anInt2560);
			Static23.aClass6_Sub4_Sub1_4.method1314(local16 + Static80.anInt2169);
		}
		if (local12 == 45) {
			Static23.aClass6_Sub4_Sub1_4.method1347(216);
			Static23.aClass6_Sub4_Sub1_4.method1292(local20);
			Static23.aClass6_Sub4_Sub1_4.method1298(local16);
			Static23.aClass6_Sub4_Sub1_4.method1298(local24);
			Static90.anInt2545 = local16;
			Static89.anInt2473 = local20;
			Static112.anInt3090 = 2;
			Static106.anInt2947 = 0;
			if (Static102.anInt2833 == local20 >> 16) {
				Static112.anInt3090 = 1;
			}
			if (local20 >> 16 == Static49.anInt1513) {
				Static112.anInt3090 = 3;
			}
		}
		if (local12 == 58) {
			Static92.method1675(local20, local24, local16);
			Static23.aClass6_Sub4_Sub1_4.method1347(224);
			Static23.aClass6_Sub4_Sub1_4.method1298(local24 >> 14 & 0x7FFF);
			Static23.aClass6_Sub4_Sub1_4.method1314(local20 + Static91.anInt2560);
			Static23.aClass6_Sub4_Sub1_4.method1326(Static80.anInt2169 + local16);
		}
		if (local12 == 12) {
			local289 = Static113.method488(0, local16, 2, false, local20, 0, 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 0);
			if (!local289) {
				Static113.method488(0, local16, 2, false, local20, 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
			}
			Static84.anInt2419 = Static59.anInt1765;
			Static112.anInt3088 = 2;
			Static76.anInt2138 = Static61.anInt1804;
			Static34.anInt1151 = 0;
			Static23.aClass6_Sub4_Sub1_4.method1347(248);
			Static23.aClass6_Sub4_Sub1_4.method1332(Static80.anInt2169 + local16);
			Static23.aClass6_Sub4_Sub1_4.method1314(Static91.anInt2560 + local20);
			Static23.aClass6_Sub4_Sub1_4.method1332(local24);
		}
		if (local12 == 9) {
			Static23.aClass6_Sub4_Sub1_4.method1347(199);
			Static23.aClass6_Sub4_Sub1_4.method1281(local20);
			Static23.aClass6_Sub4_Sub1_4.method1326(local16);
			Static23.aClass6_Sub4_Sub1_4.method1332(local24);
			Static90.anInt2545 = local16;
			Static106.anInt2947 = 0;
			Static112.anInt3090 = 2;
			if (Static102.anInt2833 == local20 >> 16) {
				Static112.anInt3090 = 1;
			}
			if (local20 >> 16 == Static49.anInt1513) {
				Static112.anInt3090 = 3;
			}
			Static89.anInt2473 = local20;
		}
		if (local12 == 34) {
			local165 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local24];
			if (local165 != null) {
				Static113.method488(0, local165.anIntArray273[0], 2, false, local165.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static112.anInt3088 = 2;
				Static84.anInt2419 = Static59.anInt1765;
				Static34.anInt1151 = 0;
				Static76.anInt2138 = Static61.anInt1804;
				Static23.aClass6_Sub4_Sub1_4.method1347(96);
				Static23.aClass6_Sub4_Sub1_4.method1326(Static42.anInt1321);
				Static23.aClass6_Sub4_Sub1_4.method1317(Static89.anInt2478);
				Static23.aClass6_Sub4_Sub1_4.method1326(local24);
			}
		}
		if (local12 == 43) {
			local414 = Static12.method339(local20);
			@Pc(1589) boolean local1589 = true;
			if (local414.anInt3248 > 0) {
				local1589 = Static31.method799(local414);
			}
			if (local1589) {
				Static23.aClass6_Sub4_Sub1_4.method1347(81);
				Static23.aClass6_Sub4_Sub1_4.method1292(local20);
			}
		}
		if (local12 == 49 && Static73.anInt2061 == -1) {
			Static70.method1363(local20, local16);
			Static73.anInt2061 = local20;
			Static53.anInt3077 = local16;
		}
		if (local12 == 1005) {
			local414 = Static12.method339(local20);
			if (local414 == null || local414.anIntArray363[local16] < 100000) {
				Static23.aClass6_Sub4_Sub1_4.method1347(108);
				Static23.aClass6_Sub4_Sub1_4.method1326(local24);
			} else {
				Static46.method996(Static111.aClass63_1661, 0, Static15.method374(new Class63[] { Static118.method2114(local414.anIntArray363[local16]), Static75.aClass63_1102, Static91.method1664(local24).aClass63_742 }));
			}
			Static106.anInt2947 = 0;
			Static90.anInt2545 = local16;
			Static89.anInt2473 = local20;
			Static112.anInt3090 = 2;
			if (Static102.anInt2833 == local20 >> 16) {
				Static112.anInt3090 = 1;
			}
			if (local20 >> 16 == Static49.anInt1513) {
				Static112.anInt3090 = 3;
			}
		}
		if (local12 == 1 && Static92.method1675(local20, local24, local16)) {
			Static23.aClass6_Sub4_Sub1_4.method1347(8);
			Static23.aClass6_Sub4_Sub1_4.method1332(Static13.anInt432);
			Static23.aClass6_Sub4_Sub1_4.method1322(Static64.anInt1831);
			Static23.aClass6_Sub4_Sub1_4.method1314(Static80.anInt2169 + local16);
			Static23.aClass6_Sub4_Sub1_4.method1332(Static2.anInt28);
			Static23.aClass6_Sub4_Sub1_4.method1314(Static91.anInt2560 + local20);
			Static23.aClass6_Sub4_Sub1_4.method1314(local24 >> 14 & 0x7FFF);
		}
		if (local12 == 40) {
			local289 = Static113.method488(0, local16, 2, false, local20, 0, 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 0);
			if (!local289) {
				Static113.method488(0, local16, 2, false, local20, 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
			}
			Static34.anInt1151 = 0;
			Static76.anInt2138 = Static61.anInt1804;
			Static112.anInt3088 = 2;
			Static84.anInt2419 = Static59.anInt1765;
			Static23.aClass6_Sub4_Sub1_4.method1347(26);
			Static23.aClass6_Sub4_Sub1_4.method1326(local24);
			Static23.aClass6_Sub4_Sub1_4.method1298(local20 + Static91.anInt2560);
			Static23.aClass6_Sub4_Sub1_4.method1298(local16 + Static80.anInt2169);
		}
		if (local12 == 1002) {
			Static92.method1675(local20, local24, local16);
			Static23.aClass6_Sub4_Sub1_4.method1347(112);
			Static23.aClass6_Sub4_Sub1_4.method1332(local24 >> 14 & 0x7FFF);
			Static23.aClass6_Sub4_Sub1_4.method1314(local20 + Static91.anInt2560);
			Static23.aClass6_Sub4_Sub1_4.method1298(Static80.anInt2169 + local16);
		}
		if (local12 == 4) {
			Static23.aClass6_Sub4_Sub1_4.method1347(125);
			Static23.aClass6_Sub4_Sub1_4.method1332(local24);
			Static23.aClass6_Sub4_Sub1_4.method1326(local16);
			Static23.aClass6_Sub4_Sub1_4.method1281(local20);
			Static89.anInt2473 = local20;
			Static112.anInt3090 = 2;
			Static106.anInt2947 = 0;
			Static90.anInt2545 = local16;
			if (local20 >> 16 == Static102.anInt2833) {
				Static112.anInt3090 = 1;
			}
			if (Static49.anInt1513 == local20 >> 16) {
				Static112.anInt3090 = 3;
			}
		}
		if (local12 == 31) {
			local165 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local24];
			if (local165 != null) {
				Static113.method488(0, local165.anIntArray273[0], 2, false, local165.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static34.anInt1151 = 0;
				Static84.anInt2419 = Static59.anInt1765;
				Static112.anInt3088 = 2;
				Static76.anInt2138 = Static61.anInt1804;
				Static23.aClass6_Sub4_Sub1_4.method1347(241);
				Static23.aClass6_Sub4_Sub1_4.method1326(local24);
				Static23.aClass6_Sub4_Sub1_4.method1298(Static2.anInt28);
				Static23.aClass6_Sub4_Sub1_4.method1326(Static13.anInt432);
				Static23.aClass6_Sub4_Sub1_4.method1292(Static64.anInt1831);
			}
		}
		if (local12 == 37) {
			Static23.aClass6_Sub4_Sub1_4.method1347(38);
			Static23.aClass6_Sub4_Sub1_4.method1314(local16);
			Static23.aClass6_Sub4_Sub1_4.method1292(local20);
			Static23.aClass6_Sub4_Sub1_4.method1332(local24);
			Static106.anInt2947 = 0;
			Static90.anInt2545 = local16;
			Static112.anInt3090 = 2;
			Static89.anInt2473 = local20;
			if (local20 >> 16 == Static102.anInt2833) {
				Static112.anInt3090 = 1;
			}
			if (local20 >> 16 == Static49.anInt1513) {
				Static112.anInt3090 = 3;
			}
		}
		if (local12 == 44) {
			local47 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local24];
			if (local47 != null) {
				Static113.method488(0, local47.anIntArray273[0], 2, false, local47.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static76.anInt2138 = Static61.anInt1804;
				Static112.anInt3088 = 2;
				Static84.anInt2419 = Static59.anInt1765;
				Static34.anInt1151 = 0;
				Static23.aClass6_Sub4_Sub1_4.method1347(122);
				Static23.aClass6_Sub4_Sub1_4.method1298(local24);
			}
		}
		if (local12 == 21) {
			local165 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local24];
			if (local165 != null) {
				Static113.method488(0, local165.anIntArray273[0], 2, false, local165.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static34.anInt1151 = 0;
				Static84.anInt2419 = Static59.anInt1765;
				Static112.anInt3088 = 2;
				Static76.anInt2138 = Static61.anInt1804;
				Static23.aClass6_Sub4_Sub1_4.method1347(236);
				Static23.aClass6_Sub4_Sub1_4.method1332(local24);
			}
		}
		if (local12 == 55) {
			Static124.method2175();
			Static2.anInt28 = local24;
			Static29.anInt939 = 1;
			Static13.anInt432 = local16;
			Static10.aBoolean20 = true;
			Static64.anInt1831 = local20;
			Static1.aClass63_8 = Static15.method374(new Class63[] { Static36.aClass63_646, Static91.method1664(local24).aClass63_742, Static102.aClass63_1535 });
			if (Static1.aClass63_8 == null) {
				Static1.aClass63_8 = Static54.aClass63_862;
			}
			return;
		}
		if (local12 == 13) {
			Static23.aClass6_Sub4_Sub1_4.method1347(101);
			Static23.aClass6_Sub4_Sub1_4.method1322(local20);
			Static23.aClass6_Sub4_Sub1_4.method1314(local16);
			Static23.aClass6_Sub4_Sub1_4.method1332(local24);
			Static112.anInt3090 = 2;
			Static106.anInt2947 = 0;
			if (local20 >> 16 == Static102.anInt2833) {
				Static112.anInt3090 = 1;
			}
			Static89.anInt2473 = local20;
			Static90.anInt2545 = local16;
			if (Static49.anInt1513 == local20 >> 16) {
				Static112.anInt3090 = 3;
			}
		}
		if (local12 == 20) {
			Static23.aClass6_Sub4_Sub1_4.method1347(79);
			Static23.aClass6_Sub4_Sub1_4.method1298(local24);
			Static23.aClass6_Sub4_Sub1_4.method1326(local16);
			Static23.aClass6_Sub4_Sub1_4.method1317(local20);
			Static89.anInt2473 = local20;
			Static106.anInt2947 = 0;
			Static90.anInt2545 = local16;
			Static112.anInt3090 = 2;
			if (Static102.anInt2833 == local20 >> 16) {
				Static112.anInt3090 = 1;
			}
			if (local20 >> 16 == Static49.anInt1513) {
				Static112.anInt3090 = 3;
			}
		}
		if (local12 == 42) {
			local414 = Static72.method1384(local16, local20);
			if (local414 != null) {
				Static124.method2175();
				Static20.method506(local20, local16, Static47.method1027(Static82.method1498(local414)));
				Static29.anInt939 = 0;
				Static10.aBoolean20 = true;
				Static33.aClass63_613 = Static97.method1791(local414);
				if (Static33.aClass63_613 == null) {
					Static33.aClass63_613 = Static114.aClass63_1689;
				}
				if (local414.aBoolean179) {
					Static50.aClass63_807 = Static15.method374(new Class63[] { local414.aClass63_1772, Static102.aClass63_1535 });
				} else {
					Static50.aClass63_807 = Static15.method374(new Class63[] { Static111.aClass63_1658, local414.aClass63_1770, Static102.aClass63_1535 });
				}
				if (Static72.anInt2049 == 16 && !local414.aBoolean179) {
					Static86.anInt2366 = 3;
					Static10.aBoolean20 = true;
					Static12.aBoolean22 = true;
				}
			}
			return;
		}
		if (local12 == 8) {
			local47 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local24];
			if (local47 != null) {
				Static113.method488(0, local47.anIntArray273[0], 2, false, local47.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static112.anInt3088 = 2;
				Static76.anInt2138 = Static61.anInt1804;
				Static34.anInt1151 = 0;
				Static84.anInt2419 = Static59.anInt1765;
				Static23.aClass6_Sub4_Sub1_4.method1347(244);
				Static23.aClass6_Sub4_Sub1_4.method1326(local24);
			}
		}
		@Pc(2487) int local2487;
		if (local12 == 2 || local12 == 30) {
			local220 = Static31.aClass63Array7[arg0];
			local225 = local220.method1805(Static102.aClass63_1535);
			if (local225 != -1) {
				local220 = local220.method1806(local225 + 5).method1833();
				@Pc(2483) Class63 local2483 = local220.method1802().method1814();
				@Pc(2485) boolean local2485 = false;
				for (local2487 = 0; local2487 < Static81.anInt2219; local2487++) {
					@Pc(2495) Class6_Sub3_Sub1_Sub2_Sub2 local2495 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[Static114.anIntArray356[local2487]];
					if (local2495 != null && local2495.aClass63_1237 != null && local2495.aClass63_1237.method1822(local2483)) {
						local2485 = true;
						Static113.method488(0, local2495.anIntArray273[0], 2, false, local2495.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
						if (local12 == 2) {
							Static23.aClass6_Sub4_Sub1_4.method1347(115);
							Static23.aClass6_Sub4_Sub1_4.method1326(Static114.anIntArray356[local2487]);
						}
						if (local12 == 30) {
							Static23.aClass6_Sub4_Sub1_4.method1347(244);
							Static23.aClass6_Sub4_Sub1_4.method1326(Static114.anIntArray356[local2487]);
						}
						break;
					}
				}
				if (!local2485) {
					Static46.method996(Static111.aClass63_1661, 0, Static15.method374(new Class63[] { Static65.aClass63_991, local2483 }));
				}
			}
		}
		if (local12 == 5) {
			Static17.method1723();
		}
		@Pc(2644) long local2644;
		if (local12 == 32 || local12 == 19 || local12 == 17 || local12 == 22) {
			local220 = Static31.aClass63Array7[arg0];
			local225 = local220.method1805(Static102.aClass63_1535);
			if (local225 != -1) {
				local2644 = local220.method1806(local225 + 5).method1833().method1823();
				if (local12 == 32) {
					Static91.method1666(local2644);
				}
				if (local12 == 19) {
					Static44.method957(local2644);
				}
				if (local12 == 17) {
					Static39.method883(local2644);
				}
				if (local12 == 22) {
					Static47.method1025(local2644);
				}
			}
		}
		if (local12 == 35) {
			local165 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local24];
			if (local165 != null) {
				Static113.method488(0, local165.anIntArray273[0], 2, false, local165.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static76.anInt2138 = Static61.anInt1804;
				Static34.anInt1151 = 0;
				Static112.anInt3088 = 2;
				Static84.anInt2419 = Static59.anInt1765;
				Static23.aClass6_Sub4_Sub1_4.method1347(85);
				Static23.aClass6_Sub4_Sub1_4.method1332(local24);
			}
		}
		if (local12 == 27) {
			local165 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local24];
			if (local165 != null) {
				Static113.method488(0, local165.anIntArray273[0], 2, false, local165.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static84.anInt2419 = Static59.anInt1765;
				Static34.anInt1151 = 0;
				Static112.anInt3088 = 2;
				Static76.anInt2138 = Static61.anInt1804;
				Static23.aClass6_Sub4_Sub1_4.method1347(174);
				Static23.aClass6_Sub4_Sub1_4.method1298(local24);
			}
		}
		if (local12 == 24) {
			local220 = Static31.aClass63Array7[arg0];
			local225 = local220.method1805(Static102.aClass63_1535);
			if (local225 != -1) {
				local2487 = -1;
				local2644 = local220.method1806(local225 + 5).method1833().method1823();
				for (@Pc(2815) int local2815 = 0; local2815 < Static5.anInt52; local2815++) {
					if (local2644 == Static49.aLongArray2[local2815]) {
						local2487 = local2815;
						break;
					}
				}
				if (local2487 != -1 && Static31.anIntArray127[local2487] > 0) {
					Static15.aBoolean29 = true;
					Static70.anInt2011 = 0;
					Static111.aClass63_1662 = Static111.aClass63_1661;
					Static32.aBoolean57 = true;
					Static50.anInt1523 = 3;
					Static13.aLong18 = Static49.aLongArray2[local2487];
					Static111.aClass63_1659 = Static15.method374(new Class63[] { Static64.aClass63_987, Static65.aClass63Array16[local2487] });
				}
			}
		}
		if (local12 == 56) {
			Static90.method1652(local16, local20, local24);
		}
		if (local12 == 14) {
			Static23.aClass6_Sub4_Sub1_4.method1347(84);
			Static23.aClass6_Sub4_Sub1_4.method1332(Static42.anInt1321);
			Static23.aClass6_Sub4_Sub1_4.method1298(local16);
			Static23.aClass6_Sub4_Sub1_4.method1314(local24);
			Static23.aClass6_Sub4_Sub1_4.method1317(local20);
			Static23.aClass6_Sub4_Sub1_4.method1322(Static89.anInt2478);
			Static89.anInt2473 = local20;
			Static112.anInt3090 = 2;
			Static90.anInt2545 = local16;
			Static106.anInt2947 = 0;
			if (Static102.anInt2833 == local20 >> 16) {
				Static112.anInt3090 = 1;
			}
			if (local20 >> 16 == Static49.anInt1513) {
				Static112.anInt3090 = 3;
			}
		}
		if (local12 == 57) {
			local47 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local24];
			if (local47 != null) {
				Static113.method488(0, local47.anIntArray273[0], 2, false, local47.anIntArray271[0], 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
				Static112.anInt3088 = 2;
				Static84.anInt2419 = Static59.anInt1765;
				Static76.anInt2138 = Static61.anInt1804;
				Static34.anInt1151 = 0;
				Static23.aClass6_Sub4_Sub1_4.method1347(115);
				Static23.aClass6_Sub4_Sub1_4.method1326(local24);
			}
		}
		if (local12 == 23) {
			Static92.method1675(local20, local24, local16);
			Static23.aClass6_Sub4_Sub1_4.method1347(78);
			Static23.aClass6_Sub4_Sub1_4.method1332(local24 >> 14 & 0x7FFF);
			Static23.aClass6_Sub4_Sub1_4.method1326(local20 + Static91.anInt2560);
			Static23.aClass6_Sub4_Sub1_4.method1298(Static80.anInt2169 + local16);
		}
		if (local12 == 36) {
			Static23.aClass6_Sub4_Sub1_4.method1347(161);
			Static23.aClass6_Sub4_Sub1_4.method1322(Static89.anInt2478);
			Static23.aClass6_Sub4_Sub1_4.method1314(Static42.anInt1321);
			Static23.aClass6_Sub4_Sub1_4.method1292(local20);
			Static23.aClass6_Sub4_Sub1_4.method1332(local16);
		}
		if (local12 == 1003) {
			Static34.anInt1151 = 0;
			Static84.anInt2419 = Static59.anInt1765;
			Static112.anInt3088 = 2;
			Static76.anInt2138 = Static61.anInt1804;
			Static23.aClass6_Sub4_Sub1_4.method1347(108);
			Static23.aClass6_Sub4_Sub1_4.method1326(local24);
		}
		if (local12 == 18) {
			local289 = Static113.method488(0, local16, 2, false, local20, 0, 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 0);
			if (!local289) {
				Static113.method488(0, local16, 2, false, local20, 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
			}
			Static84.anInt2419 = Static59.anInt1765;
			Static34.anInt1151 = 0;
			Static112.anInt3088 = 2;
			Static76.anInt2138 = Static61.anInt1804;
			Static23.aClass6_Sub4_Sub1_4.method1347(212);
			Static23.aClass6_Sub4_Sub1_4.method1332(Static42.anInt1321);
			Static23.aClass6_Sub4_Sub1_4.method1326(local16 + Static80.anInt2169);
			Static23.aClass6_Sub4_Sub1_4.method1326(local24);
			Static23.aClass6_Sub4_Sub1_4.method1326(local20 + Static91.anInt2560);
			Static23.aClass6_Sub4_Sub1_4.method1317(Static89.anInt2478);
		}
		if (local12 == 53) {
			local289 = Static113.method488(0, local16, 2, false, local20, 0, 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 0);
			if (!local289) {
				Static113.method488(0, local16, 2, false, local20, 0, 1, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 1);
			}
			Static34.anInt1151 = 0;
			Static112.anInt3088 = 2;
			Static76.anInt2138 = Static61.anInt1804;
			Static84.anInt2419 = Static59.anInt1765;
			Static23.aClass6_Sub4_Sub1_4.method1347(82);
			Static23.aClass6_Sub4_Sub1_4.method1314(Static80.anInt2169 + local16);
			Static23.aClass6_Sub4_Sub1_4.method1298(Static91.anInt2560 + local20);
			Static23.aClass6_Sub4_Sub1_4.method1314(local24);
		}
		if (Static29.anInt939 != 0) {
			Static10.aBoolean20 = true;
			Static29.anInt939 = 0;
		}
		if (Static42.aBoolean63) {
			Static124.method2175();
			Static10.aBoolean20 = true;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIILclient!ea;IILclient!hc;II)V")
	public static void method875(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class30 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static61.aBoolean98 && (Static103.aByteArrayArrayArray92[0][arg4][arg7] & 0x2) == 0) {
			if ((Static103.aByteArrayArrayArray92[arg0][arg4][arg7] & 0x10) != 0) {
				return;
			}
			if (Static118.method2116(arg7, arg0, arg4) != Static47.anInt1479) {
				return;
			}
		}
		if (Static31.anInt1021 > arg0) {
			Static31.anInt1021 = arg0;
		}
		@Pc(52) int local52 = Static11.anIntArrayArrayArray6[arg0][arg4][arg7];
		@Pc(70) int local70 = Static11.anIntArrayArrayArray6[arg0][arg4 + 1][arg7];
		@Pc(82) int local82 = Static11.anIntArrayArrayArray6[arg0][arg4 + 1][arg7 + 1];
		@Pc(92) int local92 = Static11.anIntArrayArrayArray6[arg0][arg4][arg7 + 1];
		@Pc(96) Class6_Sub3_Sub10 local96 = Static123.method2172(arg3);
		@Pc(106) int local106 = local92 + local82 + local70 + local52 >> 2;
		@Pc(118) int local118 = (arg7 << 7) + arg4 + (arg3 << 14) + 1073741824;
		if (local96.anInt1682 == 0) {
			local118 += Integer.MIN_VALUE;
		}
		@Pc(131) int local131 = arg6 + (arg1 << 6);
		if (local96.anInt1696 == 1) {
			local131 += 256;
		}
		if (local96.method1116()) {
			Static67.method1212(arg7, arg1, arg4, local96, arg0);
		}
		@Pc(189) Class6_Sub3_Sub1 local189;
		if (arg6 != 22) {
			@Pc(285) int local285;
			if (arg6 == 10 || arg6 == 11) {
				if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
					local189 = local96.method1117(arg1, local70, local92, 10, local52, local82);
				} else {
					local189 = new Class6_Sub3_Sub1_Sub5(arg3, 10, arg1, local52, local70, local82, local92, local96.anInt1681, true, null);
				}
				if (local189 != null) {
					@Pc(273) int local273 = 0;
					@Pc(282) int local282;
					if (arg1 == 1 || arg1 == 3) {
						local285 = local96.anInt1683;
						local282 = local96.anInt1672;
					} else {
						local282 = local96.anInt1683;
						local285 = local96.anInt1672;
					}
					if (arg6 == 11) {
						local273 += 256;
					}
					if (arg2.method702(arg0, arg4, arg7, local106, local285, local282, local189, local273, local118, local131) && local96.aBoolean84) {
						@Pc(315) int local315 = 15;
						if (local189 instanceof Class6_Sub3_Sub1_Sub3) {
							local315 = ((Class6_Sub3_Sub1_Sub3) local189).method642() / 4;
							if (local315 > 30) {
								local315 = 30;
							}
						}
						for (@Pc(331) int local331 = 0; local331 <= local285; local331++) {
							for (@Pc(335) int local335 = 0; local335 <= local282; local335++) {
								if (Static31.aByteArrayArrayArray28[arg0][local331 + arg4][arg7 + local335] < local315) {
									Static31.aByteArrayArrayArray28[arg0][arg4 + local331][local335 + arg7] = (byte) local315;
								}
							}
						}
					}
				}
				if (local96.aBoolean83 && arg5 != null) {
					arg5.method989(arg4, local96.anInt1672, arg1, local96.anInt1683, arg7, local96.aBoolean88);
				}
			} else if (arg6 >= 12) {
				if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
					local189 = local96.method1117(arg1, local70, local92, arg6, local52, local82);
				} else {
					local189 = new Class6_Sub3_Sub1_Sub5(arg3, arg6, arg1, local52, local70, local82, local92, local96.anInt1681, true, null);
				}
				arg2.method702(arg0, arg4, arg7, local106, 1, 1, local189, 0, local118, local131);
				if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg0 > 0) {
					Static89.anIntArrayArrayArray9[arg0][arg4][arg7] |= 0x924;
				}
				if (local96.aBoolean83 && arg5 != null) {
					arg5.method989(arg4, local96.anInt1672, arg1, local96.anInt1683, arg7, local96.aBoolean88);
				}
			} else if (arg6 == 0) {
				if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
					local189 = local96.method1117(arg1, local70, local92, 0, local52, local82);
				} else {
					local189 = new Class6_Sub3_Sub1_Sub5(arg3, 0, arg1, local52, local70, local82, local92, local96.anInt1681, true, null);
				}
				arg2.method668(arg0, arg4, arg7, local106, local189, null, Static109.anIntArray350[arg1], 0, local118, local131);
				if (arg1 == 0) {
					if (local96.aBoolean84) {
						Static31.aByteArrayArrayArray28[arg0][arg4][arg7] = 50;
						Static31.aByteArrayArrayArray28[arg0][arg4][arg7 + 1] = 50;
					}
					if (local96.aBoolean82) {
						Static89.anIntArrayArrayArray9[arg0][arg4][arg7] |= 0x249;
					}
				} else if (arg1 == 1) {
					if (local96.aBoolean84) {
						Static31.aByteArrayArrayArray28[arg0][arg4][arg7 + 1] = 50;
						Static31.aByteArrayArrayArray28[arg0][arg4 + 1][arg7 + 1] = 50;
					}
					if (local96.aBoolean82) {
						Static89.anIntArrayArrayArray9[arg0][arg4][arg7 + 1] |= 0x492;
					}
				} else if (arg1 == 2) {
					if (local96.aBoolean84) {
						Static31.aByteArrayArrayArray28[arg0][arg4 + 1][arg7] = 50;
						Static31.aByteArrayArrayArray28[arg0][arg4 + 1][arg7 + 1] = 50;
					}
					if (local96.aBoolean82) {
						Static89.anIntArrayArrayArray9[arg0][arg4 + 1][arg7] |= 0x249;
					}
				} else if (arg1 == 3) {
					if (local96.aBoolean84) {
						Static31.aByteArrayArrayArray28[arg0][arg4][arg7] = 50;
						Static31.aByteArrayArrayArray28[arg0][arg4 + 1][arg7] = 50;
					}
					if (local96.aBoolean82) {
						Static89.anIntArrayArrayArray9[arg0][arg4][arg7] |= 0x492;
					}
				}
				if (local96.aBoolean83 && arg5 != null) {
					arg5.method993(arg7, arg4, arg6, local96.aBoolean88, arg1);
				}
				if (local96.anInt1669 != 16) {
					arg2.method653(arg0, arg4, arg7, local96.anInt1669);
				}
			} else if (arg6 == 1) {
				if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
					local189 = local96.method1117(arg1, local70, local92, 1, local52, local82);
				} else {
					local189 = new Class6_Sub3_Sub1_Sub5(arg3, 1, arg1, local52, local70, local82, local92, local96.anInt1681, true, null);
				}
				arg2.method668(arg0, arg4, arg7, local106, local189, null, Static19.anIntArray63[arg1], 0, local118, local131);
				if (local96.aBoolean84) {
					if (arg1 == 0) {
						Static31.aByteArrayArrayArray28[arg0][arg4][arg7 + 1] = 50;
					} else if (arg1 == 1) {
						Static31.aByteArrayArrayArray28[arg0][arg4 + 1][arg7 + 1] = 50;
					} else if (arg1 == 2) {
						Static31.aByteArrayArrayArray28[arg0][arg4 + 1][arg7] = 50;
					} else if (arg1 == 3) {
						Static31.aByteArrayArrayArray28[arg0][arg4][arg7] = 50;
					}
				}
				if (local96.aBoolean83 && arg5 != null) {
					arg5.method993(arg7, arg4, arg6, local96.aBoolean88, arg1);
				}
			} else {
				@Pc(920) int local920;
				@Pc(950) Class6_Sub3_Sub1 local950;
				if (arg6 == 2) {
					local920 = arg1 + 1 & 0x3;
					@Pc(940) Class6_Sub3_Sub1 local940;
					if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
						local940 = local96.method1117(arg1 + 4, local70, local92, 2, local52, local82);
						local950 = local96.method1117(local920, local70, local92, 2, local52, local82);
					} else {
						local940 = new Class6_Sub3_Sub1_Sub5(arg3, 2, arg1 + 4, local52, local70, local82, local92, local96.anInt1681, true, null);
						local950 = new Class6_Sub3_Sub1_Sub5(arg3, 2, local920, local52, local70, local82, local92, local96.anInt1681, true, null);
					}
					arg2.method668(arg0, arg4, arg7, local106, local940, local950, Static109.anIntArray350[arg1], Static109.anIntArray350[local920], local118, local131);
					if (local96.aBoolean82) {
						if (arg1 == 0) {
							Static89.anIntArrayArrayArray9[arg0][arg4][arg7] |= 0x249;
							Static89.anIntArrayArrayArray9[arg0][arg4][arg7 + 1] |= 0x492;
						} else if (arg1 == 1) {
							Static89.anIntArrayArrayArray9[arg0][arg4][arg7 + 1] |= 0x492;
							Static89.anIntArrayArrayArray9[arg0][arg4 + 1][arg7] |= 0x249;
						} else if (arg1 == 2) {
							Static89.anIntArrayArrayArray9[arg0][arg4 + 1][arg7] |= 0x249;
							Static89.anIntArrayArrayArray9[arg0][arg4][arg7] |= 0x492;
						} else if (arg1 == 3) {
							Static89.anIntArrayArrayArray9[arg0][arg4][arg7] |= 0x492;
							Static89.anIntArrayArrayArray9[arg0][arg4][arg7] |= 0x249;
						}
					}
					if (local96.aBoolean83 && arg5 != null) {
						arg5.method993(arg7, arg4, arg6, local96.aBoolean88, arg1);
					}
					if (local96.anInt1669 != 16) {
						arg2.method653(arg0, arg4, arg7, local96.anInt1669);
					}
				} else if (arg6 == 3) {
					if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
						local189 = local96.method1117(arg1, local70, local92, 3, local52, local82);
					} else {
						local189 = new Class6_Sub3_Sub1_Sub5(arg3, 3, arg1, local52, local70, local82, local92, local96.anInt1681, true, null);
					}
					arg2.method668(arg0, arg4, arg7, local106, local189, null, Static19.anIntArray63[arg1], 0, local118, local131);
					if (local96.aBoolean84) {
						if (arg1 == 0) {
							Static31.aByteArrayArrayArray28[arg0][arg4][arg7 + 1] = 50;
						} else if (arg1 == 1) {
							Static31.aByteArrayArrayArray28[arg0][arg4 + 1][arg7 + 1] = 50;
						} else if (arg1 == 2) {
							Static31.aByteArrayArrayArray28[arg0][arg4 + 1][arg7] = 50;
						} else if (arg1 == 3) {
							Static31.aByteArrayArrayArray28[arg0][arg4][arg7] = 50;
						}
					}
					if (local96.aBoolean83 && arg5 != null) {
						arg5.method993(arg7, arg4, arg6, local96.aBoolean88, arg1);
					}
				} else if (arg6 == 9) {
					if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
						local189 = local96.method1117(arg1, local70, local92, arg6, local52, local82);
					} else {
						local189 = new Class6_Sub3_Sub1_Sub5(arg3, arg6, arg1, local52, local70, local82, local92, local96.anInt1681, true, null);
					}
					arg2.method702(arg0, arg4, arg7, local106, 1, 1, local189, 0, local118, local131);
					if (local96.aBoolean83 && arg5 != null) {
						arg5.method989(arg4, local96.anInt1672, arg1, local96.anInt1683, arg7, local96.aBoolean88);
					}
				} else {
					if (local96.aBoolean91) {
						if (arg1 == 1) {
							local920 = local92;
							local92 = local82;
							local82 = local70;
							local70 = local52;
							local52 = local920;
						} else if (arg1 == 2) {
							local920 = local92;
							local92 = local70;
							local70 = local920;
							local920 = local82;
							local82 = local52;
							local52 = local920;
						} else if (arg1 == 3) {
							local920 = local92;
							local92 = local52;
							local52 = local70;
							local70 = local82;
							local82 = local920;
						}
					}
					if (arg6 == 4) {
						if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
							local189 = local96.method1117(0, local70, local92, 4, local52, local82);
						} else {
							local189 = new Class6_Sub3_Sub1_Sub5(arg3, 4, 0, local52, local70, local82, local92, local96.anInt1681, true, null);
						}
						arg2.method666(arg0, arg4, arg7, local106, local189, Static109.anIntArray350[arg1], arg1 * 512, 0, 0, local118, local131);
					} else if (arg6 == 5) {
						local920 = 16;
						local285 = arg2.method689(arg0, arg4, arg7);
						if (local285 != 0) {
							local920 = Static123.method2172(local285 >> 14 & 0x7FFF).anInt1669;
						}
						if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
							local950 = local96.method1117(0, local70, local92, 4, local52, local82);
						} else {
							local950 = new Class6_Sub3_Sub1_Sub5(arg3, 4, 0, local52, local70, local82, local92, local96.anInt1681, true, null);
						}
						arg2.method666(arg0, arg4, arg7, local106, local950, Static109.anIntArray350[arg1], arg1 * 512, local920 * Static72.anIntArray233[arg1], local920 * Static97.anIntArray293[arg1], local118, local131);
					} else if (arg6 == 6) {
						if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
							local189 = local96.method1117(0, local70, local92, 4, local52, local82);
						} else {
							local189 = new Class6_Sub3_Sub1_Sub5(arg3, 4, 0, local52, local70, local82, local92, local96.anInt1681, true, null);
						}
						arg2.method666(arg0, arg4, arg7, local106, local189, 256, arg1, 0, 0, local118, local131);
					} else if (arg6 == 7) {
						if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
							local189 = local96.method1117(0, local70, local92, 4, local52, local82);
						} else {
							local189 = new Class6_Sub3_Sub1_Sub5(arg3, 4, 0, local52, local70, local82, local92, local96.anInt1681, true, null);
						}
						arg2.method666(arg0, arg4, arg7, local106, local189, 512, arg1, 0, 0, local118, local131);
					} else if (arg6 == 8) {
						if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
							local189 = local96.method1117(0, local70, local92, 4, local52, local82);
						} else {
							local189 = new Class6_Sub3_Sub1_Sub5(arg3, 4, 0, local52, local70, local82, local92, local96.anInt1681, true, null);
						}
						arg2.method666(arg0, arg4, arg7, local106, local189, 768, arg1, 0, 0, local118, local131);
					}
				}
			}
		} else if (!Static61.aBoolean98 || local96.anInt1682 != 0 || local96.aBoolean86) {
			if (local96.anInt1681 == -1 && local96.anIntArray185 == null) {
				local189 = local96.method1117(arg1, local70, local92, 22, local52, local82);
			} else {
				local189 = new Class6_Sub3_Sub1_Sub5(arg3, 22, arg1, local52, local70, local82, local92, local96.anInt1681, true, null);
			}
			arg2.method658(arg0, arg4, arg7, local106, local189, local118, local131);
			if (local96.aBoolean83 && local96.anInt1682 == 1 && arg5 != null) {
				arg5.method998(arg7, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZ[B)Z")
	public static boolean method876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class6_Sub4 local12 = new Class6_Sub4(arg2);
		@Pc(14) int local14 = -1;
		label67: while (true) {
			@Pc(18) int local18 = local12.method1337();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(61) int local61;
				@Pc(89) Class6_Sub3_Sub10 local89;
				do {
					@Pc(65) int local65;
					@Pc(69) int local69;
					do {
						do {
							do {
								do {
									@Pc(34) int local34;
									while (local28) {
										local34 = local12.method1337();
										if (local34 == 0) {
											continue label67;
										}
										local12.method1321();
									}
									local34 = local12.method1337();
									if (local34 == 0) {
										continue label67;
									}
									local26 += local34 - 1;
									@Pc(51) int local51 = local26 >> 6 & 0x3F;
									@Pc(55) int local55 = local26 & 0x3F;
									local61 = local12.method1321() >> 2;
									local65 = arg1 + local51;
									local69 = arg0 + local55;
								} while (local65 <= 0);
							} while (local69 <= 0);
						} while (local65 >= 103);
					} while (local69 >= 103);
					local89 = Static123.method2172(local14);
				} while (local61 == 22 && Static61.aBoolean98 && local89.anInt1682 == 0 && !local89.aBoolean86);
				if (!local89.method1122()) {
					Static52.anInt1583++;
					local7 = false;
				}
				local28 = true;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method877() {
		aClass63_656 = null;
		aClass63_658 = null;
		aClass63_659 = null;
		aClass63_660 = null;
		aClass63_654 = null;
		anIntArray140 = null;
		aClass63_663 = null;
		aClass63_655 = null;
		anIntArray141 = null;
		aClass49_11 = null;
		aClass63_662 = null;
		aClass6_Sub3_Sub3_Sub3_10 = null;
		aClass6_Sub3_Sub3_Sub2Array5 = null;
		aClass63_657 = null;
		aClass63_661 = null;
		aClass7_21 = null;
		anIntArray139 = null;
	}
}
