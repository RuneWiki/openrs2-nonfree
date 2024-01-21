import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!ob;")
	public static Class47 aClass47_4;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Z")
	public static boolean aBoolean123;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Lclient!bf;")
	public static Class10 aClass10_4;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
	public static int anInt2694;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1307 = Static14.method2017(":duelreq:");

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!gd;")
	public static Class22 aClass22_33 = new Class22(10);

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1308 = Static14.method2017("@whi@ )4 ");

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1309 = Static14.method2017("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1310 = Static14.method2017("sideicons");

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1311 = Static14.method2017("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!gd;")
	public static Class22 aClass22_34 = new Class22(200);

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1312 = Static14.method2017("No response from server)3");

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1313 = aClass36_1312;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)Z")
	public static boolean method1907(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method1908() {
		Static91.anInt2363 = 0;
		@Pc(74) int local74;
		for (@Pc(9) int local9 = -1; local9 < Static108.anInt2775 + Static65.anInt1689; local9++) {
			@Pc(24) Class2_Sub1_Sub4_Sub2 local24;
			if (local9 == -1) {
				local24 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3;
			} else if (local9 < Static65.anInt1689) {
				local24 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[Static99.anIntArray243[local9]];
			} else {
				local24 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[Static51.anIntArray316[local9 - Static65.anInt1689]];
			}
			if (local24 != null && local24.method1554()) {
				@Pc(54) Class2_Sub1_Sub9 local54;
				if (local24 instanceof Class2_Sub1_Sub4_Sub2_Sub1) {
					local54 = ((Class2_Sub1_Sub4_Sub2_Sub1) local24).aClass2_Sub1_Sub9_1;
					if (local54.anIntArray192 != null) {
						local54 = local54.method1071();
					}
					if (local54 == null) {
						continue;
					}
				}
				if (Static65.anInt1689 <= local9) {
					local54 = ((Class2_Sub1_Sub4_Sub2_Sub1) local24).aClass2_Sub1_Sub9_1;
					if (local54.anInt1549 >= 0 && Static112.aClass2_Sub1_Sub1_Sub3Array39.length > local54.anInt1549) {
						Static19.method2028(local24, local24.anInt2166 + 15);
						if (Static35.anInt935 > -1) {
							Static112.aClass2_Sub1_Sub1_Sub3Array39[local54.anInt1549].method1234(Static35.anInt935 - 12, Static52.anInt1432 - 30);
						}
					}
					if (Static42.anInt1111 == 1 && Static51.anIntArray316[local9 - Static65.anInt1689] == Static114.anInt2982 && Static113.anInt2952 % 20 < 10) {
						Static19.method2028(local24, local24.anInt2166 + 15);
						if (Static35.anInt935 > -1) {
							Static18.aClass2_Sub1_Sub1_Sub3Array7[0].method1234(Static35.anInt935 - 12, Static52.anInt1432 + -28);
						}
					}
				} else {
					local74 = 30;
					@Pc(77) Class2_Sub1_Sub4_Sub2_Sub2 local77 = (Class2_Sub1_Sub4_Sub2_Sub2) local24;
					if (local77.anInt2221 != -1 || local77.anInt2225 != -1) {
						Static19.method2028(local24, local24.anInt2166 + 15);
						if (Static35.anInt935 > -1) {
							if (local77.anInt2221 != -1) {
								Static6.aClass2_Sub1_Sub1_Sub3Array4[local77.anInt2221].method1234(Static35.anInt935 - 12, Static52.anInt1432 + -30);
								local74 += 25;
							}
							if (local77.anInt2225 != -1) {
								Static112.aClass2_Sub1_Sub1_Sub3Array39[local77.anInt2225].method1234(Static35.anInt935 - 12, Static52.anInt1432 + -local74);
								local74 += 25;
							}
						}
					}
					if (local9 >= 0 && Static42.anInt1111 == 10 && Static104.anInt2706 == Static99.anIntArray243[local9]) {
						Static19.method2028(local24, local24.anInt2166 + 15);
						if (Static35.anInt935 > -1) {
							Static18.aClass2_Sub1_Sub1_Sub3Array7[1].method1234(Static35.anInt935 - 12, -local74 + Static52.anInt1432);
						}
					}
				}
				if (local24.aClass36_1023 != null && (Static65.anInt1689 <= local9 || Static15.anInt316 == 0 || Static15.anInt316 == 3 || Static15.anInt316 == 1 && Static26.method549(((Class2_Sub1_Sub4_Sub2_Sub2) local24).aClass36_1027))) {
					Static19.method2028(local24, local24.anInt2166);
					if (Static35.anInt935 > -1 && Static65.anInt1671 > Static91.anInt2363) {
						Static65.anIntArray213[Static91.anInt2363] = Static97.aClass2_Sub1_Sub1_Sub2_4.method458(local24.aClass36_1023) / 2;
						Static65.anIntArray214[Static91.anInt2363] = Static97.aClass2_Sub1_Sub1_Sub2_4.anInt561;
						Static65.anIntArray206[Static91.anInt2363] = Static35.anInt935;
						Static65.anIntArray211[Static91.anInt2363] = Static52.anInt1432;
						Static65.anIntArray210[Static91.anInt2363] = local24.anInt2201;
						Static65.anIntArray209[Static91.anInt2363] = local24.anInt2153;
						Static65.anIntArray208[Static91.anInt2363] = local24.anInt2197;
						Static65.aClass36Array31[Static91.anInt2363] = local24.aClass36_1023;
						Static91.anInt2363++;
					}
				}
				if (local24.anInt2159 > Static113.anInt2952) {
					Static19.method2028(local24, local24.anInt2166 + 15);
					if (Static35.anInt935 > -1) {
						local74 = local24.anInt2184 * 30 / local24.anInt2187;
						if (local74 > 30) {
							local74 = 30;
						}
						Static54.method1591(Static35.anInt935 - 15, Static52.anInt1432 - 3, local74, 5, 65280);
						Static54.method1591(local74 + Static35.anInt935 - 15, Static52.anInt1432 - 3, 30 - local74, 5, 16711680);
					}
				}
				for (local74 = 0; local74 < 4; local74++) {
					if (Static113.anInt2952 < local24.anIntArray257[local74]) {
						Static19.method2028(local24, local24.anInt2166 / 2);
						if (Static35.anInt935 > -1) {
							if (local74 == 1) {
								Static52.anInt1432 -= 20;
							}
							if (local74 == 2) {
								Static35.anInt935 -= 15;
								Static52.anInt1432 -= 10;
							}
							if (local74 == 3) {
								Static52.anInt1432 -= 10;
								Static35.anInt935 += 15;
							}
							Static111.aClass2_Sub1_Sub1_Sub3Array37[local24.anIntArray255[local74]].method1234(Static35.anInt935 - 12, Static52.anInt1432 + -12);
							Static25.aClass2_Sub1_Sub1_Sub2_3.method454(Static57.method1055(local24.anIntArray254[local74]), Static35.anInt935, Static52.anInt1432 + 4, 0);
							Static25.aClass2_Sub1_Sub1_Sub2_3.method454(Static57.method1055(local24.anIntArray254[local74]), Static35.anInt935 - 1, Static52.anInt1432 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(495) int local495 = 0; local495 < Static91.anInt2363; local495++) {
			@Pc(501) int local501 = Static65.anIntArray211[local495];
			local74 = Static65.anIntArray206[local495];
			@Pc(509) int local509 = Static65.anIntArray213[local495];
			@Pc(513) int local513 = Static65.anIntArray214[local495];
			@Pc(515) boolean local515 = true;
			while (local515) {
				local515 = false;
				for (@Pc(521) int local521 = 0; local521 < local495; local521++) {
					if (Static65.anIntArray211[local521] - Static65.anIntArray214[local521] < local501 - -2 && Static65.anIntArray211[local521] + 2 > -local513 + local501 && local74 - local509 < Static65.anIntArray213[local521] + Static65.anIntArray206[local521] && local509 + local74 > -Static65.anIntArray213[local521] + Static65.anIntArray206[local521] && local501 > Static65.anIntArray211[local521] - Static65.anIntArray214[local521]) {
						local515 = true;
						local501 = Static65.anIntArray211[local521] - Static65.anIntArray214[local521];
					}
				}
			}
			Static35.anInt935 = Static65.anIntArray206[local495];
			Static52.anInt1432 = Static65.anIntArray211[local495] = local501;
			@Pc(621) Class36 local621 = Static65.aClass36Array31[local495];
			if (Static82.anInt2067 == 0) {
				@Pc(644) int local644 = 16776960;
				if (Static65.anIntArray210[local495] < 6) {
					local644 = Static42.anIntArray157[Static65.anIntArray210[local495]];
				}
				if (Static65.anIntArray210[local495] == 6) {
					local644 = Static74.anInt1988 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static65.anIntArray210[local495] == 7) {
					local644 = Static74.anInt1988 % 20 >= 10 ? 65535 : 255;
				}
				if (Static65.anIntArray210[local495] == 8) {
					local644 = Static74.anInt1988 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(709) int local709;
				if (Static65.anIntArray210[local495] == 9) {
					local709 = 150 - Static65.anIntArray208[local495];
					if (local709 < 50) {
						local644 = local709 * 1280 + 16711680;
					} else if (local709 < 100) {
						local644 = 16776960 - (local709 - 50) * 327680;
					} else if (local709 < 150) {
						local644 = (local709 - 100) * 5 + 65280;
					}
				}
				if (Static65.anIntArray210[local495] == 10) {
					local709 = 150 - Static65.anIntArray208[local495];
					if (local709 < 50) {
						local644 = local709 * 5 + 16711680;
					} else if (local709 < 100) {
						local644 = 16711935 - (local709 - 50) * 327680;
					} else if (local709 < 150) {
						local644 = local709 * 327680 - (local709 - 100) * 5 - 32767745;
					}
				}
				if (Static65.anIntArray210[local495] == 11) {
					local709 = 150 - Static65.anIntArray208[local495];
					if (local709 < 50) {
						local644 = 16777215 - local709 * 327685;
					} else if (local709 < 100) {
						local644 = local709 * 327685 + 65280 - 16384250;
					} else if (local709 < 150) {
						local644 = 49545215 - local709 * 327680;
					}
				}
				if (Static65.anIntArray209[local495] == 0) {
					Static97.aClass2_Sub1_Sub1_Sub2_4.method454(local621, Static35.anInt935, Static52.anInt1432 + 1, 0);
					Static97.aClass2_Sub1_Sub1_Sub2_4.method454(local621, Static35.anInt935, Static52.anInt1432, local644);
				}
				if (Static65.anIntArray209[local495] == 1) {
					Static97.aClass2_Sub1_Sub1_Sub2_4.method467(local621, Static35.anInt935, Static52.anInt1432 + 1, 0, Static74.anInt1988);
					Static97.aClass2_Sub1_Sub1_Sub2_4.method467(local621, Static35.anInt935, Static52.anInt1432, local644, Static74.anInt1988);
				}
				if (Static65.anIntArray209[local495] == 2) {
					Static97.aClass2_Sub1_Sub1_Sub2_4.method464(local621, Static35.anInt935, Static52.anInt1432 + 1, 0, Static74.anInt1988);
					Static97.aClass2_Sub1_Sub1_Sub2_4.method464(local621, Static35.anInt935, Static52.anInt1432, local644, Static74.anInt1988);
				}
				if (Static65.anIntArray209[local495] == 3) {
					Static97.aClass2_Sub1_Sub1_Sub2_4.method463(local621, Static35.anInt935, Static52.anInt1432 + 1, 0, Static74.anInt1988, 150 - Static65.anIntArray208[local495]);
					Static97.aClass2_Sub1_Sub1_Sub2_4.method463(local621, Static35.anInt935, Static52.anInt1432, local644, Static74.anInt1988, 150 - Static65.anIntArray208[local495]);
				}
				@Pc(970) int local970;
				if (Static65.anIntArray209[local495] == 4) {
					local709 = Static97.aClass2_Sub1_Sub1_Sub2_4.method458(local621);
					local970 = (local709 + 100) * (150 - Static65.anIntArray208[local495]) / 150;
					Static54.method1577(Static35.anInt935 - 50, 0, Static35.anInt935 + 50, 334);
					Static97.aClass2_Sub1_Sub1_Sub2_4.method456(local621, Static35.anInt935 + 50 - local970, Static52.anInt1432 + 1, 0);
					Static97.aClass2_Sub1_Sub1_Sub2_4.method456(local621, Static35.anInt935 + 50 - local970, Static52.anInt1432, local644);
					Static54.method1589();
				}
				if (Static65.anIntArray209[local495] == 5) {
					local970 = 0;
					local709 = 150 - Static65.anIntArray208[local495];
					Static54.method1577(0, Static52.anInt1432 - Static97.aClass2_Sub1_Sub1_Sub2_4.anInt561 - 1, 512, Static52.anInt1432 + 5);
					if (local709 < 25) {
						local970 = local709 - 25;
					} else if (local709 > 125) {
						local970 = local709 - 125;
					}
					Static97.aClass2_Sub1_Sub1_Sub2_4.method454(local621, Static35.anInt935, Static52.anInt1432 + local970 + 1, 0);
					Static97.aClass2_Sub1_Sub1_Sub2_4.method454(local621, Static35.anInt935, Static52.anInt1432 + local970, local644);
					Static54.method1589();
				}
			} else {
				Static97.aClass2_Sub1_Sub1_Sub2_4.method454(local621, Static35.anInt935, Static52.anInt1432 + 1, 0);
				Static97.aClass2_Sub1_Sub1_Sub2_4.method454(local621, Static35.anInt935, Static52.anInt1432, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public static void method1909() {
		Static13.aClass22_5.method716();
		Static77.aClass22_26.method716();
		Static34.aClass22_9.method716();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method1910() {
		aClass36_1313 = null;
		aClass22_33 = null;
		aClass36_1308 = null;
		aClass36_1311 = null;
		aClass36_1312 = null;
		aClass22_34 = null;
		aClass36_1309 = null;
		aClass36_1307 = null;
		aClass10_4 = null;
		aClass36_1310 = null;
		aClass47_4 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method1911() {
		while (true) {
			if (Static92.aClass2_Sub12_Sub1_3.method1419(Static111.anInt2876) >= 11) {
				@Pc(23) int local23 = Static92.aClass2_Sub12_Sub1_3.method1418(11);
				if (local23 != 2047) {
					@Pc(30) boolean local30 = false;
					if (Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local23] == null) {
						Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local23] = new Class2_Sub1_Sub4_Sub2_Sub2();
						local30 = true;
						if (Static55.aClass2_Sub12Array3[local23] != null) {
							Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local23].method1555(Static55.aClass2_Sub12Array3[local23]);
						}
					}
					Static99.anIntArray243[Static65.anInt1689++] = local23;
					@Pc(66) Class2_Sub1_Sub4_Sub2_Sub2 local66 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local23];
					local66.anInt2169 = Static113.anInt2952;
					@Pc(74) int local74 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
					if (local74 == 1) {
						Static115.anIntArray225[Static55.anInt2714++] = local23;
					}
					@Pc(90) int local90 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
					@Pc(97) int local97 = Static33.anIntArray28[Static92.aClass2_Sub12_Sub1_3.method1418(3)];
					if (local30) {
						local66.anInt2156 = local97;
					}
					@Pc(107) int local107 = Static92.aClass2_Sub12_Sub1_3.method1418(5);
					if (local107 > 15) {
						local107 -= 32;
					}
					@Pc(118) int local118 = Static92.aClass2_Sub12_Sub1_3.method1418(5);
					if (local118 > 15) {
						local118 -= 32;
					}
					local66.method1549(local107 + Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], local118 + Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0], local90 == 1);
					continue;
				}
			}
			Static92.aClass2_Sub12_Sub1_3.method1425();
			return;
		}
	}
}
