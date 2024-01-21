import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!mb;")
	public static Class42 aClass42_52;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
	public static int anInt1942;

	@OriginalMember(owner = "client!ne", name = "A", descriptor = "Lclient!rc;")
	public static Class3_Sub1_Sub1_Sub3 aClass3_Sub1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!v;")
	private static Class62 aClass62_844 = Static45.method753("Walk here");

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!v;")
	public static Class62 aClass62_845 = Static45.method753("Absender:");

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public static int anInt1937 = 0;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Lclient!v;")
	private static Class62 aClass62_850 = Static45.method753("wishes to trade with you)3");

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!v;")
	public static Class62 aClass62_846 = aClass62_850;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!v;")
	public static Class62 aClass62_847 = Static45.method753("::fpson");

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
	public static int anInt1938 = 0;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!v;")
	private static Class62 aClass62_853 = Static45.method753("To create a new account you need to");

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!v;")
	public static Class62 aClass62_848 = aClass62_853;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!v;")
	public static Class62 aClass62_849 = aClass62_844;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!v;")
	public static Class62 aClass62_851 = Static45.method753("Ausw\u001c1hlen");

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Lclient!v;")
	public static Class62 aClass62_852 = Static45.method753("@or1@");

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "[I")
	public static int[] anIntArray202 = new int[128];

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "Lclient!v;")
	public static Class62 aClass62_854 = Static45.method753("mapdots");

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
	public static int anInt1943 = 0;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
	public static int anInt1944 = 0;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "Lclient!v;")
	public static Class62 aClass62_855 = Static45.method753("@gr1@");

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
	public static int anInt1947 = 128;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method1180() {
		Static8.aBoolean13 = true;
		Static7.method179();
		if (Static41.aBoolean69) {
			Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(Static41.aClass62_524, 239, 40, 0);
			Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(Static49.method782(new Class62[] { Static41.aClass62_516, Static26.aClass62_340 }), 239, 60, 128);
		} else if (anInt1943 == 1) {
			Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(Static106.aClass62_1278, 239, 40, 0);
			Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(Static49.method782(new Class62[] { Static41.aClass62_522, Static26.aClass62_340 }), 239, 60, 128);
		} else if (anInt1943 == 2) {
			Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(Static104.aClass62_1256, 239, 40, 0);
			Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(Static49.method782(new Class62[] { Static41.aClass62_522, Static26.aClass62_340 }), 239, 60, 128);
		} else {
			@Pc(57) Class3_Sub1_Sub1_Sub3 local57;
			@Pc(64) int local64;
			@Pc(76) int local76;
			if (anInt1943 == 3) {
				if (Static41.aClass62_522 != Static41.aClass62_519) {
					Static90.method1539(Static41.aClass62_522);
					Static41.aClass62_519 = Static41.aClass62_522;
				}
				local57 = Static50.aClass3_Sub1_Sub1_Sub3_12;
				Static97.method1728(0, 0, 463, 77);
				for (local64 = 0; local64 < Static4.anInt182; local64++) {
					local76 = local64 * 14 + 18 - Static22.anInt746;
					if (local76 > 0 && local76 < 110) {
						local57.method1486(Static93.aClass62Array12[local64], 239, local76, 0);
					}
				}
				Static97.method1729();
				if (Static4.anInt182 > 5) {
					Static21.method489(Static4.anInt182 * 14 + 7, 0, 77, 463, Static22.anInt746);
				}
				if (Static41.aClass62_522.method1688() == 0) {
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(Static93.aClass62_1137, 239, 40, 255);
				} else if (Static4.anInt182 == 0) {
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(Static27.aClass62_351, 239, 40, 0);
				}
				local57.method1486(Static49.method782(new Class62[] { Static41.aClass62_522, Static26.aClass62_340 }), 239, 90, 0);
				Static97.method1739(0, 77, 479, 0);
			} else if (Static63.aClass62_1076 == null) {
				@Pc(190) boolean local190;
				if (Static5.anInt200 != -1) {
					local190 = Static38.method676(0, 0, 0, Static5.anInt200, 479, -1, 2, 96);
					if (!local190) {
						Static86.aBoolean137 = true;
					}
				} else if (Static41.anInt1213 == -1) {
					local57 = Static50.aClass3_Sub1_Sub1_Sub3_12;
					Static97.method1728(0, 0, 463, 77);
					local64 = 0;
					for (local76 = 0; local76 < 100; local76++) {
						if (Static7.aClass62Array1[local76] != null) {
							@Pc(225) int local225 = Static26.anInt807 + 70 - local64 * 14;
							@Pc(229) int local229 = Static56.anIntArray123[local76];
							@Pc(233) Class62 local233 = Static7.aClass62Array2[local76];
							@Pc(235) byte local235 = 0;
							if (local233 != null && local233.method1690(Static32.aClass62_433)) {
								local233 = local233.method1702(5);
								local235 = 1;
							}
							if (local233 != null && local233.method1690(Static21.aClass62_305)) {
								local235 = 2;
								local233 = local233.method1702(5);
							}
							if (local229 == 0) {
								local64++;
								if (local225 > 0 && local225 < 110) {
									local57.method1475(Static7.aClass62Array1[local76], 4, local225, 0);
								}
							}
							@Pc(312) int local312;
							if ((local229 == 1 || local229 == 2) && (local229 == 1 || Static72.anInt1948 == 0 || Static72.anInt1948 == 1 && Static64.method1085(local233))) {
								if (local225 > 0 && local225 < 110) {
									local312 = 4;
									if (local235 == 1) {
										Static69.aClass3_Sub1_Sub1_Sub1Array3[0].method145(4, local225 - 12);
										local312 += 14;
									}
									if (local235 == 2) {
										Static69.aClass3_Sub1_Sub1_Sub1Array3[1].method145(local312, local225 - 12);
										local312 += 14;
									}
									local57.method1475(Static49.method782(new Class62[] { local233, Static41.aClass62_515 }), local312, local225, 0);
									local312 += local57.method1484(local233) + 8;
									local57.method1475(Static7.aClass62Array1[local76], local312, local225, 255);
								}
								local64++;
							}
							if ((local229 == 3 || local229 == 7) && Static26.anInt805 == 0 && (local229 == 7 || Static15.anInt574 == 0 || Static15.anInt574 == 1 && Static64.method1085(local233))) {
								if (local225 > 0 && local225 < 110) {
									local57.method1475(Static80.aClass62_951, 4, local225, 0);
									local312 = local57.method1484(Static80.aClass62_951) + 4;
									local312 += local57.method1478(32);
									if (local235 == 1) {
										Static69.aClass3_Sub1_Sub1_Sub1Array3[0].method145(local312, local225 - 12);
										local312 += 14;
									}
									if (local235 == 2) {
										Static69.aClass3_Sub1_Sub1_Sub1Array3[1].method145(local312, local225 - 12);
										local312 += 14;
									}
									local57.method1475(Static49.method782(new Class62[] { local233, Static41.aClass62_515 }), local312, local225, 0);
									local312 += local57.method1484(local233) + 8;
									local57.method1475(Static7.aClass62Array1[local76], local312, local225, 8388608);
								}
								local64++;
							}
							if (local229 == 4 && (Static28.anInt898 == 0 || Static28.anInt898 == 1 && Static64.method1085(local233))) {
								local64++;
								if (local225 > 0 && local225 < 110) {
									local57.method1475(Static49.method782(new Class62[] { local233, Static56.aClass62_682, Static7.aClass62Array1[local76] }), 4, local225, 8388736);
								}
							}
							if (local229 == 5 && Static26.anInt805 == 0 && Static15.anInt574 < 2) {
								local64++;
								if (local225 > 0 && local225 < 110) {
									local57.method1475(Static7.aClass62Array1[local76], 4, local225, 8388608);
								}
							}
							if (local229 == 6 && Static26.anInt805 == 0 && Static15.anInt574 < 2) {
								local64++;
								if (local225 > 0 && local225 < 110) {
									local57.method1475(Static49.method782(new Class62[] { Static74.aClass62_879, Static56.aClass62_682, local233, Static41.aClass62_515 }), 4, local225, 0);
									local57.method1475(Static7.aClass62Array1[local76], local57.method1484(Static49.method782(new Class62[] { Static74.aClass62_879, Static56.aClass62_682, local233 })) + 12, local225, 8388608);
								}
							}
							if (local229 == 8 && (Static28.anInt898 == 0 || Static28.anInt898 == 1 && Static64.method1085(local233))) {
								local64++;
								if (local225 > 0 && local225 < 110) {
									local57.method1475(Static49.method782(new Class62[] { local233, Static56.aClass62_682, Static7.aClass62Array1[local76] }), 4, local225, 8270336);
								}
							}
						}
					}
					Static97.method1729();
					Static23.anInt753 = local64 * 14 + 7;
					if (Static23.anInt753 < 78) {
						Static23.anInt753 = 78;
					}
					Static21.method489(Static23.anInt753, 0, 77, 463, Static23.anInt753 - Static26.anInt807 - 77);
					@Pc(719) Class62 local719;
					if (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1 == null || Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.aClass62_570 == null) {
						local719 = Static74.aClass62_875;
					} else {
						local719 = Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.aClass62_570;
					}
					local57.method1475(Static49.method782(new Class62[] { local719, Static41.aClass62_515 }), 4, 90, 0);
					local57.method1475(Static49.method782(new Class62[] { Static41.aClass62_523, Static26.aClass62_340 }), local57.method1484(Static49.method782(new Class62[] { local719, Static100.aClass62_1114 })) + 6, 90, 255);
					Static97.method1739(0, 77, 479, 0);
				} else {
					local190 = Static38.method676(0, 0, 0, Static41.anInt1213, 479, -1, 3, 96);
					if (!local190) {
						Static86.aBoolean137 = true;
					}
				}
			} else {
				Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(Static63.aClass62_1076, 239, 40, 0);
				Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(Static50.aClass62_1274, 239, 60, 128);
			}
		}
		if (Static40.aBoolean66 && Static6.anInt211 == 2) {
			Static49.method784();
		}
		Static38.method681();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
	public static void method1181() {
		aClass62_845 = null;
		anIntArray202 = null;
		aClass62_844 = null;
		aClass62_853 = null;
		aClass62_848 = null;
		aClass62_852 = null;
		aClass62_846 = null;
		aClass42_52 = null;
		aClass62_850 = null;
		aClass3_Sub1_Sub1_Sub3_8 = null;
		aClass62_849 = null;
		aClass62_854 = null;
		aClass62_851 = null;
		aClass62_855 = null;
		aClass62_847 = null;
	}
}
