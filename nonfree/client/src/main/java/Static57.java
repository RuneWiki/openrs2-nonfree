import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!me;")
	public static Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_2;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Lclient!vc;")
	public static Class65 aClass65_3;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "Lclient!va;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "[I")
	public static int[] anIntArray165;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "Z")
	public static boolean aBoolean78;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "[Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array29;

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
	public static int anInt1734;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Lclient!cd;")
	public static Class11 aClass11_2 = new Class11();

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!rc;")
	private static Class55 aClass55_672 = Static34.method846("World");

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_671 = aClass55_672;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	public static int anInt1730 = 0;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "Lclient!rc;")
	public static Class55 aClass55_673 = Static34.method846("mapmarker");

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "Lclient!rc;")
	public static Class55 aClass55_674 = Static34.method846("mapdots");

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Z")
	public static volatile boolean aBoolean77 = true;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	public static int anInt1733 = 0;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Lclient!rc;")
	private static Class55 aClass55_675 = Static34.method846("Loading fonts )2 ");

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "Lclient!rc;")
	public static Class55 aClass55_676 = aClass55_675;

	@OriginalMember(owner = "client!mb", name = "J", descriptor = "[I")
	public static int[] anIntArray166 = new int[128];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!me;Lclient!me;)V")
	public static void method1178(@OriginalArg(1) Class6_Sub2_Sub2_Sub4 arg0, @OriginalArg(2) Class6_Sub2_Sub2_Sub4 arg1) {
		Static45.aClass21_12.method1445();
		if (Static61.anInt1879 == 0 || Static61.anInt1879 == 5) {
			arg0.method1307(Static78.aClass55_898, 180, 54, 16777215);
			Static53.method1284(28, 62, 304, 34, 9179409);
			Static53.method1284(29, 63, 302, 32, 0);
			Static53.method1276(30, 64, Static102.anInt3022 * 3, 30, 9179409);
			Static53.method1276(Static102.anInt3022 * 3 + 30, 64, 300 - Static102.anInt3022 * 3, 30, 0);
			arg0.method1307(Static29.aClass55_434, 180, 85, 16777215);
		}
		@Pc(91) byte local91;
		@Pc(99) int local99;
		if (Static61.anInt1879 == 20) {
			Static4.aClass6_Sub2_Sub2_Sub1_20.method318(0, 0);
			local91 = 40;
			arg0.method1312(Static29.aClass55_424, 180, 40, 16776960, true);
			local99 = local91 + 15;
			arg0.method1312(Static29.aClass55_430, 180, 55, 16776960, true);
			@Pc(107) int local107 = local99 + 15;
			arg0.method1312(Static29.aClass55_433, 180, 70, 16776960, true);
			@Pc(115) int local115 = local107 + 15;
			@Pc(116) int local116 = local115 + 10;
			arg0.method1297(Static89.method1698(new Class55[] { Static55.aClass55_662, Static29.aClass55_429 }), 90, 95, 16777215, true);
			@Pc(135) int local135 = local116 + 15;
			arg0.method1297(Static89.method1698(new Class55[] { Static52.aClass55_636, Static29.aClass55_425.method1649() }), 92, 110, 16777215, true);
			@Pc(156) int local156 = local135 + 15;
		}
		if (Static61.anInt1879 == 10) {
			Static4.aClass6_Sub2_Sub2_Sub1_20.method318(0, 0);
			if (Static6.anInt267 == 0) {
				local91 = 80;
				arg0.method1312(Static79.aClass55_921, 180, 80, 16776960, true);
				local99 = local91 + 30;
				Static15.aClass6_Sub2_Sub2_Sub1_5.method318(27, 100);
				arg0.method1308(Static103.aClass55_1275, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				Static15.aClass6_Sub2_Sub2_Sub1_5.method318(187, 100);
				arg0.method1308(Static85.aClass55_998, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static6.anInt267 == 2) {
				local91 = 40;
				arg0.method1312(Static29.aClass55_424, 180, 40, 16776960, true);
				local99 = local91 + 15;
				arg0.method1312(Static29.aClass55_430, 180, 55, 16776960, true);
				local99 += 15;
				arg0.method1312(Static29.aClass55_433, 180, 70, 16776960, true);
				local99 += 15;
				local99 += 10;
				arg0.method1297(Static89.method1698(new Class55[] { Static55.aClass55_662, Static29.aClass55_429, Static85.anInt2389 % 40 < 20 & Static106.anInt2349 == 0 ? Static22.aClass55_371 : Static29.aClass55_431 }), 90, 95, 16777215, true);
				local99 += 15;
				arg0.method1297(Static89.method1698(new Class55[] { Static52.aClass55_636, Static29.aClass55_425.method1649(), Static85.anInt2389 % 40 < 20 & Static106.anInt2349 == 1 ? Static22.aClass55_371 : Static29.aClass55_431 }), 92, 110, 16777215, true);
				local99 += 15;
				Static15.aClass6_Sub2_Sub2_Sub1_5.method318(27, 130);
				arg0.method1312(Static51.aClass55_612, 100, 155, 16777215, true);
				Static15.aClass6_Sub2_Sub2_Sub1_5.method318(187, 130);
				arg0.method1312(Static34.aClass55_512, 260, 155, 16777215, true);
			} else if (Static6.anInt267 == 3) {
				local91 = 65;
				arg0.method1312(Static15.aClass55_282, 180, 40, 16776960, true);
				arg0.method1312(Static32.aClass55_460, 180, 65, 16777215, true);
				local99 = local91 + 15;
				arg0.method1312(Static85.aClass55_997, 180, 80, 16777215, true);
				local99 += 15;
				arg0.method1312(Static101.aClass55_1261, 180, 95, 16777215, true);
				local99 += 15;
				arg0.method1312(Static74.aClass55_696, 180, 110, 16777215, true);
				Static15.aClass6_Sub2_Sub2_Sub1_5.method318(107, 130);
				local99 += 15;
				arg0.method1312(Static34.aClass55_512, 180, 155, 16777215, true);
			}
		}
		Static4.method1612();
		try {
			@Pc(463) Graphics local463 = Static32.aCanvas1.getGraphics();
			Static45.aClass21_12.method1442(202, local463, 171);
			Static35.aClass21_10.method1442(0, local463, 0);
			Static111.aClass21_27.method1442(637, local463, 0);
			if (Static52.aBoolean74) {
				Static52.aBoolean74 = false;
				Static29.aClass21_8.method1442(128, local463, 0);
				Static103.aClass21_22.method1442(202, local463, 371);
				Static107.aClass21_25.method1442(0, local463, 265);
				Static29.aClass21_7.method1442(562, local463, 265);
				Static77.aClass21_18.method1442(128, local463, 171);
				Static7.aClass21_3.method1442(562, local463, 171);
			}
		} catch (@Pc(527) Exception local527) {
			Static32.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public static void method1181() {
		Static99.aClass21_20.method1445();
		Static26.aClass6_Sub2_Sub2_Sub1_17.method318(0, 0);
		Static76.anIntArray214 = Static30.method790(Static76.anIntArray214);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	public static void method1185(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static107.anIntArray290[arg0];
		@Pc(16) int local16 = Static77.anIntArray216[arg0];
		@Pc(20) int local20 = Static10.anIntArray43[arg0];
		if (local20 >= 2000) {
			local20 -= 2000;
		}
		@Pc(28) int local28 = Static52.anIntArray160[arg0];
		if (Static79.anInt2289 != 0 && local20 != 1005) {
			Static72.aBoolean99 = true;
			Static79.anInt2289 = 0;
		}
		if (local20 == 23) {
			Static31.anInt1210 = local16;
			Static93.anInt2608 = local12;
			Static43.anInt1463 = 1;
			Static34.anInt1317 = local28;
			Static22.aClass55_370 = Static89.method1698(new Class55[] { Static112.aClass55_1353, Static58.method1195(local28).aClass55_392, Static72.aClass55_862 });
			if (Static22.aClass55_370 == null) {
				Static22.aClass55_370 = Static67.aClass55_789;
			}
			Static63.aBoolean89 = true;
			Static102.anInt3029 = 0;
			return;
		}
		if (local20 == 49) {
			Static110.method2037(local16, local28, local12);
			Static51.aClass6_Sub1_Sub1_3.method1515(47);
			Static51.aClass6_Sub1_Sub1_3.method1467(Static88.anInt3276 + local16);
			Static51.aClass6_Sub1_Sub1_3.method1510(local12 + Static18.anInt938);
			Static51.aClass6_Sub1_Sub1_3.method1512(local28 >> 14 & 0x7FFF);
		}
		@Pc(123) Class6_Sub2_Sub14 local123;
		if (local20 == 15) {
			@Pc(119) boolean local119 = true;
			local123 = Static99.method1897(local16);
			if (local123.anInt2909 > 0) {
				local119 = Static11.method453(local123);
			}
			if (local119) {
				Static51.aClass6_Sub1_Sub1_3.method1515(36);
				Static51.aClass6_Sub1_Sub1_3.method1499(local16);
			}
		}
		if (local20 == 10) {
			Static51.aClass6_Sub1_Sub1_3.method1515(20);
			Static51.aClass6_Sub1_Sub1_3.method1475(local28);
			Static51.aClass6_Sub1_Sub1_3.method1509(local16);
			Static51.aClass6_Sub1_Sub1_3.method1510(local12);
			Static97.anInt2829 = 2;
			Static47.anInt1512 = local12;
			Static94.anInt2644 = local16;
			Static51.anInt1585 = 0;
			if (Static13.anInt800 == local16 >> 16) {
				Static97.anInt2829 = 1;
			}
			if (local16 >> 16 == Static1.anInt3) {
				Static97.anInt2829 = 3;
			}
		}
		@Pc(202) Class55 local202;
		@Pc(207) int local207;
		if (local20 == 17) {
			local202 = Static76.aClass55Array20[arg0];
			local207 = local202.method1645(Static72.aClass55_862);
			if (local207 != -1) {
				if (Static13.anInt800 == -1) {
					Static11.method451();
					if (Static22.anInt1017 != -1) {
						Static34.aClass55_514 = local202.method1673(local207 + 5).method1654();
						Static90.aBoolean118 = false;
						Static31.anInt1202 = Static13.anInt800 = Static22.anInt1017;
					}
				} else {
					Static14.method510(Static34.aClass55_502, 0, Static74.aClass55_695);
				}
			}
		}
		@Pc(251) Class6_Sub2_Sub3_Sub1_Sub2 local251;
		if (local20 == 38) {
			local251 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local28];
			if (local251 != null) {
				Static75.method1436(local251.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local251.anIntArray256[0]);
				Static11.anInt696 = Static68.anInt2013;
				Static19.anInt946 = 2;
				Static111.anInt3172 = 0;
				Static64.anInt1921 = Static23.anInt1030;
				Static51.aClass6_Sub1_Sub1_3.method1515(154);
				Static51.aClass6_Sub1_Sub1_3.method1512(local28);
			}
		}
		@Pc(322) boolean local322;
		if (local20 == 47) {
			local322 = Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 0, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 0, local12);
			if (!local322) {
				Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local12);
			}
			Static11.anInt696 = Static68.anInt2013;
			Static111.anInt3172 = 0;
			Static19.anInt946 = 2;
			Static64.anInt1921 = Static23.anInt1030;
			Static51.aClass6_Sub1_Sub1_3.method1515(249);
			Static51.aClass6_Sub1_Sub1_3.method1475(local28);
			Static51.aClass6_Sub1_Sub1_3.method1475(Static18.anInt938 + local12);
			Static51.aClass6_Sub1_Sub1_3.method1467(local16 + Static88.anInt3276);
		}
		@Pc(404) long local404;
		@Pc(406) int local406;
		if (local20 == 12) {
			local202 = Static76.aClass55Array20[arg0];
			local207 = local202.method1645(Static72.aClass55_862);
			if (local207 != -1) {
				local404 = local202.method1673(local207 + 5).method1654().method1639();
				local406 = -1;
				for (@Pc(408) int local408 = 0; local408 < Static64.anInt1912; local408++) {
					if (Static8.aLongArray1[local408] == local404) {
						local406 = local408;
						break;
					}
				}
				if (local406 != -1 && Static102.anIntArray286[local406] > 0) {
					Static72.aBoolean99 = true;
					Static79.anInt2289 = 0;
					Static34.aClass55_511 = Static34.aClass55_502;
					Static98.anInt2831 = 3;
					Static67.aBoolean90 = true;
					Static75.aLong75 = Static8.aLongArray1[local406];
					Static34.aClass55_506 = Static89.method1698(new Class55[] { Static20.aClass55_348, Static68.aClass55Array18[local406] });
				}
			}
		}
		if (local20 == 40) {
			local322 = Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 0, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 0, local12);
			if (!local322) {
				Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local12);
			}
			Static19.anInt946 = 2;
			Static64.anInt1921 = Static23.anInt1030;
			Static111.anInt3172 = 0;
			Static11.anInt696 = Static68.anInt2013;
			Static51.aClass6_Sub1_Sub1_3.method1515(228);
			Static51.aClass6_Sub1_Sub1_3.method1510(Static88.anInt3276 + local16);
			Static51.aClass6_Sub1_Sub1_3.method1512(Static18.anInt938 + local12);
			Static51.aClass6_Sub1_Sub1_3.method1467(local28);
		}
		if (local20 == 1) {
			local251 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local28];
			if (local251 != null) {
				Static75.method1436(local251.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local251.anIntArray256[0]);
				Static11.anInt696 = Static68.anInt2013;
				Static64.anInt1921 = Static23.anInt1030;
				Static19.anInt946 = 2;
				Static111.anInt3172 = 0;
				Static51.aClass6_Sub1_Sub1_3.method1515(98);
				Static51.aClass6_Sub1_Sub1_3.method1475(local28);
			}
		}
		if (local20 == 24) {
			Static51.aClass6_Sub1_Sub1_3.method1515(149);
			Static51.aClass6_Sub1_Sub1_3.method1480(local16);
			Static51.aClass6_Sub1_Sub1_3.method1510(local28);
			Static51.aClass6_Sub1_Sub1_3.method1512(local12);
			Static47.anInt1512 = local12;
			Static94.anInt2644 = local16;
			Static51.anInt1585 = 0;
			Static97.anInt2829 = 2;
			if (Static13.anInt800 == local16 >> 16) {
				Static97.anInt2829 = 1;
			}
			if (local16 >> 16 == Static1.anInt3) {
				Static97.anInt2829 = 3;
			}
		}
		if (local20 == 13) {
			Static51.aClass6_Sub1_Sub1_3.method1515(76);
			Static51.aClass6_Sub1_Sub1_3.method1509(local16);
			Static51.aClass6_Sub1_Sub1_3.method1475(local12);
			Static51.aClass6_Sub1_Sub1_3.method1512(local28);
			Static51.anInt1585 = 0;
			Static47.anInt1512 = local12;
			Static97.anInt2829 = 2;
			Static94.anInt2644 = local16;
			if (local16 >> 16 == Static13.anInt800) {
				Static97.anInt2829 = 1;
			}
			if (local16 >> 16 == Static1.anInt3) {
				Static97.anInt2829 = 3;
			}
		}
		if (local20 == 46) {
			Static91.method1731(local16, local12, local28);
		}
		if (local20 == 16) {
			Static51.aClass6_Sub1_Sub1_3.method1515(36);
			Static51.aClass6_Sub1_Sub1_3.method1499(local16);
			local123 = Static99.method1897(local16);
			if (local123.anIntArrayArray22 != null && local123.anIntArrayArray22[0][0] == 5) {
				local207 = local123.anIntArrayArray22[0][1];
				Static11.anIntArray44[local207] = 1 - Static11.anIntArray44[local207];
				Static47.method1018(local207);
				Static63.aBoolean89 = true;
			}
		}
		if (local20 == 56) {
			Static51.aClass6_Sub1_Sub1_3.method1515(136);
			Static51.aClass6_Sub1_Sub1_3.method1512(local12);
			Static51.aClass6_Sub1_Sub1_3.method1510(local28);
			Static51.aClass6_Sub1_Sub1_3.method1473(local16);
			Static97.anInt2829 = 2;
			Static47.anInt1512 = local12;
			if (local16 >> 16 == Static13.anInt800) {
				Static97.anInt2829 = 1;
			}
			Static51.anInt1585 = 0;
			Static94.anInt2644 = local16;
			if (local16 >> 16 == Static1.anInt3) {
				Static97.anInt2829 = 3;
			}
		}
		if (local20 == 7) {
			Static110.method2037(local16, local28, local12);
			Static51.aClass6_Sub1_Sub1_3.method1515(104);
			Static51.aClass6_Sub1_Sub1_3.method1512(Static88.anInt3276 + local16);
			Static51.aClass6_Sub1_Sub1_3.method1510(local28 >> 14 & 0x7FFF);
			Static51.aClass6_Sub1_Sub1_3.method1510(Static18.anInt938 + local12);
		}
		if (local20 == 1002) {
			Static111.anInt3172 = 0;
			Static11.anInt696 = Static68.anInt2013;
			Static64.anInt1921 = Static23.anInt1030;
			Static19.anInt946 = 2;
			Static51.aClass6_Sub1_Sub1_3.method1515(40);
			Static51.aClass6_Sub1_Sub1_3.method1467(local28 >> 14 & 0x7FFF);
		}
		if (local20 == 22) {
			local251 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local28];
			if (local251 != null) {
				Static75.method1436(local251.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local251.anIntArray256[0]);
				Static11.anInt696 = Static68.anInt2013;
				Static111.anInt3172 = 0;
				Static64.anInt1921 = Static23.anInt1030;
				Static19.anInt946 = 2;
				Static51.aClass6_Sub1_Sub1_3.method1515(113);
				Static51.aClass6_Sub1_Sub1_3.method1512(local28);
			}
		}
		if (local20 == 50 || local20 == 41 || local20 == 27 || local20 == 57) {
			local202 = Static76.aClass55Array20[arg0];
			local207 = local202.method1645(Static72.aClass55_862);
			if (local207 != -1) {
				local404 = local202.method1673(local207 + 5).method1654().method1639();
				if (local20 == 50) {
					Static105.method1987(local404);
				}
				if (local20 == 41) {
					Static44.method1827(local404);
				}
				if (local20 == 27) {
					Static59.method1255(local404);
				}
				if (local20 == 57) {
					Static105.method1986(local404);
				}
			}
		}
		if (local20 == 19) {
			Static110.method2037(local16, local28, local12);
			Static51.aClass6_Sub1_Sub1_3.method1515(114);
			Static51.aClass6_Sub1_Sub1_3.method1510(local12 + Static18.anInt938);
			Static51.aClass6_Sub1_Sub1_3.method1467(Static88.anInt3276 + local16);
			Static51.aClass6_Sub1_Sub1_3.method1467(local28 >> 14 & 0x7FFF);
		}
		if (local20 == 8) {
			local322 = Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 0, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 0, local12);
			if (!local322) {
				Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local12);
			}
			Static64.anInt1921 = Static23.anInt1030;
			Static19.anInt946 = 2;
			Static111.anInt3172 = 0;
			Static11.anInt696 = Static68.anInt2013;
			Static51.aClass6_Sub1_Sub1_3.method1515(251);
			Static51.aClass6_Sub1_Sub1_3.method1467(Static88.anInt3276 + local16);
			Static51.aClass6_Sub1_Sub1_3.method1475(local28);
			Static51.aClass6_Sub1_Sub1_3.method1510(local12 + Static18.anInt938);
		}
		if (local20 == 51) {
			local322 = Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 0, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 0, local12);
			if (!local322) {
				Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local12);
			}
			Static11.anInt696 = Static68.anInt2013;
			Static111.anInt3172 = 0;
			Static64.anInt1921 = Static23.anInt1030;
			Static19.anInt946 = 2;
			Static51.aClass6_Sub1_Sub1_3.method1515(94);
			Static51.aClass6_Sub1_Sub1_3.method1475(local12 + Static18.anInt938);
			Static51.aClass6_Sub1_Sub1_3.method1467(Static88.anInt3276 + local16);
			Static51.aClass6_Sub1_Sub1_3.method1510(local28);
		}
		if (local20 == 2) {
			Static51.aClass6_Sub1_Sub1_3.method1515(191);
			Static51.aClass6_Sub1_Sub1_3.method1473(local16);
			Static51.aClass6_Sub1_Sub1_3.method1510(local28);
			Static51.aClass6_Sub1_Sub1_3.method1475(local12);
			Static97.anInt2829 = 2;
			Static47.anInt1512 = local12;
			if (Static13.anInt800 == local16 >> 16) {
				Static97.anInt2829 = 1;
			}
			if (Static1.anInt3 == local16 >> 16) {
				Static97.anInt2829 = 3;
			}
			Static51.anInt1585 = 0;
			Static94.anInt2644 = local16;
		}
		if (local20 == 9) {
			local251 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local28];
			if (local251 != null) {
				Static75.method1436(local251.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local251.anIntArray256[0]);
				Static111.anInt3172 = 0;
				Static11.anInt696 = Static68.anInt2013;
				Static64.anInt1921 = Static23.anInt1030;
				Static19.anInt946 = 2;
				Static51.aClass6_Sub1_Sub1_3.method1515(174);
				Static51.aClass6_Sub1_Sub1_3.method1509(Static31.anInt1210);
				Static51.aClass6_Sub1_Sub1_3.method1467(Static34.anInt1317);
				Static51.aClass6_Sub1_Sub1_3.method1512(Static93.anInt2608);
				Static51.aClass6_Sub1_Sub1_3.method1510(local28);
			}
		}
		if (local20 == 1003) {
			local123 = Static99.method1897(local16);
			if (local123 == null || local123.anIntArray268[local12] < 100000) {
				Static51.aClass6_Sub1_Sub1_3.method1515(29);
				Static51.aClass6_Sub1_Sub1_3.method1475(local28);
			} else {
				Static14.method510(Static34.aClass55_502, 0, Static89.method1698(new Class55[] { Static58.method1196(local123.anIntArray268[local12]), Static32.aClass55_458, Static58.method1195(local28).aClass55_392 }));
			}
			Static97.anInt2829 = 2;
			Static94.anInt2644 = local16;
			Static47.anInt1512 = local12;
			Static51.anInt1585 = 0;
			if (local16 >> 16 == Static13.anInt800) {
				Static97.anInt2829 = 1;
			}
			if (local16 >> 16 == Static1.anInt3) {
				Static97.anInt2829 = 3;
			}
		}
		if (local20 == 54) {
			local322 = Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 0, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 0, local12);
			if (!local322) {
				Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local12);
			}
			Static64.anInt1921 = Static23.anInt1030;
			Static19.anInt946 = 2;
			Static11.anInt696 = Static68.anInt2013;
			Static111.anInt3172 = 0;
			Static51.aClass6_Sub1_Sub1_3.method1515(223);
			Static51.aClass6_Sub1_Sub1_3.method1510(local28);
			Static51.aClass6_Sub1_Sub1_3.method1512(local12 + Static18.anInt938);
			Static51.aClass6_Sub1_Sub1_3.method1512(local16 + Static88.anInt3276);
			Static51.aClass6_Sub1_Sub1_3.method1473(Static85.anInt2401);
		}
		if (local20 == 53) {
			local251 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local28];
			if (local251 != null) {
				Static75.method1436(local251.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local251.anIntArray256[0]);
				Static111.anInt3172 = 0;
				Static64.anInt1921 = Static23.anInt1030;
				Static11.anInt696 = Static68.anInt2013;
				Static19.anInt946 = 2;
				Static51.aClass6_Sub1_Sub1_3.method1515(182);
				Static51.aClass6_Sub1_Sub1_3.method1510(local28);
			}
		}
		if (local20 == 18 && Static110.method2037(local16, local28, local12)) {
			Static51.aClass6_Sub1_Sub1_3.method1515(177);
			Static51.aClass6_Sub1_Sub1_3.method1499(Static31.anInt1210);
			Static51.aClass6_Sub1_Sub1_3.method1512(Static18.anInt938 + local12);
			Static51.aClass6_Sub1_Sub1_3.method1475(Static93.anInt2608);
			Static51.aClass6_Sub1_Sub1_3.method1510(local28 >> 14 & 0x7FFF);
			Static51.aClass6_Sub1_Sub1_3.method1467(Static34.anInt1317);
			Static51.aClass6_Sub1_Sub1_3.method1467(local16 + Static88.anInt3276);
		}
		if (local20 == 37) {
			local322 = Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 0, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 0, local12);
			if (!local322) {
				Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local12);
			}
			Static11.anInt696 = Static68.anInt2013;
			Static19.anInt946 = 2;
			Static64.anInt1921 = Static23.anInt1030;
			Static111.anInt3172 = 0;
			Static51.aClass6_Sub1_Sub1_3.method1515(7);
			Static51.aClass6_Sub1_Sub1_3.method1510(Static34.anInt1317);
			Static51.aClass6_Sub1_Sub1_3.method1512(Static88.anInt3276 + local16);
			Static51.aClass6_Sub1_Sub1_3.method1499(Static31.anInt1210);
			Static51.aClass6_Sub1_Sub1_3.method1467(Static18.anInt938 + local12);
			Static51.aClass6_Sub1_Sub1_3.method1510(local28);
			Static51.aClass6_Sub1_Sub1_3.method1467(Static93.anInt2608);
		}
		if (local20 == 34) {
			local251 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local28];
			if (local251 != null) {
				Static75.method1436(local251.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local251.anIntArray256[0]);
				Static11.anInt696 = Static68.anInt2013;
				Static111.anInt3172 = 0;
				Static19.anInt946 = 2;
				Static64.anInt1921 = Static23.anInt1030;
				Static51.aClass6_Sub1_Sub1_3.method1515(12);
				Static51.aClass6_Sub1_Sub1_3.method1480(Static85.anInt2401);
				Static51.aClass6_Sub1_Sub1_3.method1512(local28);
			}
		}
		if (local20 == 1007) {
			local123 = Static99.method1897(local16);
			if (local123 != null && local123.aClass6_Sub2_Sub14Array1 != null && local12 != -1) {
				local123 = local123.aClass6_Sub2_Sub14Array1[local12];
			}
			if (local123 == null || local123.anInt2929 < 100000) {
				Static51.aClass6_Sub1_Sub1_3.method1515(29);
				Static51.aClass6_Sub1_Sub1_3.method1475(local28);
			} else {
				Static14.method510(Static34.aClass55_502, 0, Static89.method1698(new Class55[] { Static58.method1196(local123.anInt2929), Static32.aClass55_458, Static58.method1195(local28).aClass55_392 }));
			}
		}
		if (local20 == 25) {
			Static51.aClass6_Sub1_Sub1_3.method1515(152);
			Static51.aClass6_Sub1_Sub1_3.method1475(local12);
			Static51.aClass6_Sub1_Sub1_3.method1467(local28);
			Static51.aClass6_Sub1_Sub1_3.method1499(local16);
			Static47.anInt1512 = local12;
			Static94.anInt2644 = local16;
			Static51.anInt1585 = 0;
			Static97.anInt2829 = 2;
			if (Static13.anInt800 == local16 >> 16) {
				Static97.anInt2829 = 1;
			}
			if (Static1.anInt3 == local16 >> 16) {
				Static97.anInt2829 = 3;
			}
		}
		if (local20 == 1004) {
			Static110.method2037(local16, local28, local12);
			Static51.aClass6_Sub1_Sub1_3.method1515(164);
			Static51.aClass6_Sub1_Sub1_3.method1467(local28 >> 14 & 0x7FFF);
			Static51.aClass6_Sub1_Sub1_3.method1467(local12 + Static18.anInt938);
			Static51.aClass6_Sub1_Sub1_3.method1467(Static88.anInt3276 + local16);
		}
		if (local20 == 55) {
			Static51.aClass6_Sub1_Sub1_3.method1515(238);
			Static51.aClass6_Sub1_Sub1_3.method1475(local12);
			Static51.aClass6_Sub1_Sub1_3.method1512(local28);
			Static51.aClass6_Sub1_Sub1_3.method1480(Static85.anInt2401);
			Static51.aClass6_Sub1_Sub1_3.method1480(local16);
			Static94.anInt2644 = local16;
			Static51.anInt1585 = 0;
			Static97.anInt2829 = 2;
			if (Static13.anInt800 == local16 >> 16) {
				Static97.anInt2829 = 1;
			}
			if (Static1.anInt3 == local16 >> 16) {
				Static97.anInt2829 = 3;
			}
			Static47.anInt1512 = local12;
		}
		if (local20 == 48) {
			Static51.aClass6_Sub1_Sub1_3.method1515(243);
			Static51.aClass6_Sub1_Sub1_3.method1512(Static34.anInt1317);
			Static51.aClass6_Sub1_Sub1_3.method1467(local12);
			Static51.aClass6_Sub1_Sub1_3.method1467(Static93.anInt2608);
			Static51.aClass6_Sub1_Sub1_3.method1467(local28);
			Static51.aClass6_Sub1_Sub1_3.method1509(Static31.anInt1210);
			Static51.aClass6_Sub1_Sub1_3.method1480(local16);
			Static51.anInt1585 = 0;
			Static47.anInt1512 = local12;
			Static97.anInt2829 = 2;
			Static94.anInt2644 = local16;
			if (Static13.anInt800 == local16 >> 16) {
				Static97.anInt2829 = 1;
			}
			if (Static1.anInt3 == local16 >> 16) {
				Static97.anInt2829 = 3;
			}
		}
		if (local20 == 14) {
			local123 = Static99.method1897(local16);
			Static66.aClass55_780 = local123.aClass55_1222;
			Static85.anInt2401 = local16;
			Static102.anInt3029 = 1;
			Static63.aBoolean89 = true;
			Static43.anInt1463 = 0;
			Static66.anInt1971 = local123.anInt2902;
			Static86.aClass55_1000 = Static89.method1698(new Class55[] { Static44.aClass55_1153, local123.aClass55_1226, Static72.aClass55_862 });
			if (Static66.anInt1971 == 16) {
				Static63.aBoolean89 = true;
				Static112.anInt3228 = 3;
				Static79.aBoolean106 = true;
			}
			return;
		}
		@Pc(2081) Class6_Sub2_Sub3_Sub1_Sub1 local2081;
		if (local20 == 39) {
			local2081 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local28];
			if (local2081 != null) {
				Static75.method1436(local2081.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local2081.anIntArray256[0]);
				Static64.anInt1921 = Static23.anInt1030;
				Static111.anInt3172 = 0;
				Static11.anInt696 = Static68.anInt2013;
				Static19.anInt946 = 2;
				Static51.aClass6_Sub1_Sub1_3.method1515(252);
				Static51.aClass6_Sub1_Sub1_3.method1510(local28);
				Static51.aClass6_Sub1_Sub1_3.method1473(Static85.anInt2401);
			}
		}
		if (local20 == 1001) {
			Static64.anInt1921 = Static23.anInt1030;
			Static19.anInt946 = 2;
			Static111.anInt3172 = 0;
			Static11.anInt696 = Static68.anInt2013;
			local251 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local28];
			if (local251 != null) {
				@Pc(2153) Class6_Sub2_Sub4 local2153 = local251.aClass6_Sub2_Sub4_1;
				if (local2153.anIntArray48 != null) {
					local2153 = local2153.method542();
				}
				if (local2153 != null) {
					Static51.aClass6_Sub1_Sub1_3.method1515(81);
					Static51.aClass6_Sub1_Sub1_3.method1512(local2153.anInt858);
				}
			}
		}
		if (local20 == 26) {
			local322 = Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 0, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 0, local12);
			if (!local322) {
				Static75.method1436(local16, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local12);
			}
			Static19.anInt946 = 2;
			Static111.anInt3172 = 0;
			Static64.anInt1921 = Static23.anInt1030;
			Static11.anInt696 = Static68.anInt2013;
			Static51.aClass6_Sub1_Sub1_3.method1515(148);
			Static51.aClass6_Sub1_Sub1_3.method1512(local28);
			Static51.aClass6_Sub1_Sub1_3.method1512(Static88.anInt3276 + local16);
			Static51.aClass6_Sub1_Sub1_3.method1475(local12 + Static18.anInt938);
		}
		if (local20 == 3) {
			local251 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local28];
			if (local251 != null) {
				Static75.method1436(local251.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local251.anIntArray256[0]);
				Static19.anInt946 = 2;
				Static111.anInt3172 = 0;
				Static11.anInt696 = Static68.anInt2013;
				Static64.anInt1921 = Static23.anInt1030;
				Static51.aClass6_Sub1_Sub1_3.method1515(161);
				Static51.aClass6_Sub1_Sub1_3.method1512(local28);
			}
		}
		if (local20 == 4) {
			if (Static109.aBoolean163) {
				Static109.aClass34_1.method1020(local12 - 4, local16 + -4);
			} else {
				Static109.aClass34_1.method1020(Static68.anInt2013 - 4, Static23.anInt1030 - 4);
			}
		}
		if (local20 == 44 && Static67.anInt1986 == -1) {
			Static17.method583(0, local16);
			Static67.anInt1986 = local16;
		}
		if (local20 == 42 || local20 == 11) {
			local202 = Static76.aClass55Array20[arg0];
			local207 = local202.method1645(Static72.aClass55_862);
			if (local207 != -1) {
				@Pc(2370) boolean local2370 = false;
				local202 = local202.method1673(local207 + 5).method1654();
				@Pc(2387) Class55 local2387 = local202.method1637().method1655();
				for (local406 = 0; local406 < Static78.anInt2246; local406++) {
					@Pc(2397) Class6_Sub2_Sub3_Sub1_Sub1 local2397 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[Static101.anIntArray283[local406]];
					if (local2397 != null && local2397.aClass55_245 != null && local2397.aClass55_245.method1642(local2387)) {
						local2370 = true;
						Static75.method1436(local2397.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local2397.anIntArray256[0]);
						if (local20 == 42) {
							Static51.aClass6_Sub1_Sub1_3.method1515(85);
							Static51.aClass6_Sub1_Sub1_3.method1512(Static101.anIntArray283[local406]);
						}
						if (local20 == 11) {
							Static51.aClass6_Sub1_Sub1_3.method1515(23);
							Static51.aClass6_Sub1_Sub1_3.method1467(Static101.anIntArray283[local406]);
						}
						break;
					}
				}
				if (!local2370) {
					Static14.method510(Static34.aClass55_502, 0, Static89.method1698(new Class55[] { Static31.aClass55_456, local2387 }));
				}
			}
		}
		if (local20 == 28) {
			Static51.aClass6_Sub1_Sub1_3.method1515(117);
			Static51.aClass6_Sub1_Sub1_3.method1467(local28);
			Static51.aClass6_Sub1_Sub1_3.method1467(local12);
			Static51.aClass6_Sub1_Sub1_3.method1509(local16);
			Static94.anInt2644 = local16;
			Static51.anInt1585 = 0;
			Static97.anInt2829 = 2;
			if (Static13.anInt800 == local16 >> 16) {
				Static97.anInt2829 = 1;
			}
			if (local16 >> 16 == Static1.anInt3) {
				Static97.anInt2829 = 3;
			}
			Static47.anInt1512 = local12;
		}
		if (local20 == 6) {
			local2081 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local28];
			if (local2081 != null) {
				Static75.method1436(local2081.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local2081.anIntArray256[0]);
				Static64.anInt1921 = Static23.anInt1030;
				Static111.anInt3172 = 0;
				Static19.anInt946 = 2;
				Static11.anInt696 = Static68.anInt2013;
				Static51.aClass6_Sub1_Sub1_3.method1515(101);
				Static51.aClass6_Sub1_Sub1_3.method1475(local28);
			}
		}
		if (local20 == 30) {
			Static98.method1872(Static39.anInt1691);
			Static39.anInt1691 = -1;
			Static72.aBoolean99 = true;
		}
		if (local20 == 5) {
			Static51.aClass6_Sub1_Sub1_3.method1515(189);
			Static51.aClass6_Sub1_Sub1_3.method1510(local28);
			Static51.aClass6_Sub1_Sub1_3.method1467(local12);
			Static51.aClass6_Sub1_Sub1_3.method1480(local16);
			Static47.anInt1512 = local12;
			Static94.anInt2644 = local16;
			Static51.anInt1585 = 0;
			Static97.anInt2829 = 2;
			if (Static13.anInt800 == local16 >> 16) {
				Static97.anInt2829 = 1;
			}
			if (local16 >> 16 == Static1.anInt3) {
				Static97.anInt2829 = 3;
			}
		}
		if (local20 == 20) {
			local2081 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local28];
			if (local2081 != null) {
				Static75.method1436(local2081.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local2081.anIntArray256[0]);
				Static11.anInt696 = Static68.anInt2013;
				Static111.anInt3172 = 0;
				Static19.anInt946 = 2;
				Static64.anInt1921 = Static23.anInt1030;
				Static51.aClass6_Sub1_Sub1_3.method1515(23);
				Static51.aClass6_Sub1_Sub1_3.method1467(local28);
			}
		}
		if (local20 == 31) {
			local2081 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local28];
			if (local2081 != null) {
				Static75.method1436(local2081.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local2081.anIntArray256[0]);
				Static64.anInt1921 = Static23.anInt1030;
				Static111.anInt3172 = 0;
				Static19.anInt946 = 2;
				Static11.anInt696 = Static68.anInt2013;
				Static51.aClass6_Sub1_Sub1_3.method1515(121);
				Static51.aClass6_Sub1_Sub1_3.method1510(local28);
			}
		}
		if (local20 == 52) {
			Static110.method2037(local16, local28, local12);
			Static51.aClass6_Sub1_Sub1_3.method1515(44);
			Static51.aClass6_Sub1_Sub1_3.method1475(local28 >> 14 & 0x7FFF);
			Static51.aClass6_Sub1_Sub1_3.method1510(local12 + Static18.anInt938);
			Static51.aClass6_Sub1_Sub1_3.method1475(local16 + Static88.anInt3276);
		}
		if (local20 == 29) {
			Static51.aClass6_Sub1_Sub1_3.method1515(150);
			Static51.aClass6_Sub1_Sub1_3.method1473(local16);
			Static51.aClass6_Sub1_Sub1_3.method1512(local12);
			Static51.aClass6_Sub1_Sub1_3.method1467(local28);
			Static97.anInt2829 = 2;
			Static51.anInt1585 = 0;
			Static94.anInt2644 = local16;
			Static47.anInt1512 = local12;
			if (local16 >> 16 == Static13.anInt800) {
				Static97.anInt2829 = 1;
			}
			if (Static1.anInt3 == local16 >> 16) {
				Static97.anInt2829 = 3;
			}
		}
		if (local20 == 35) {
			Static51.aClass6_Sub1_Sub1_3.method1515(36);
			Static51.aClass6_Sub1_Sub1_3.method1499(local16);
			local123 = Static99.method1897(local16);
			if (local123.anIntArrayArray22 != null && local123.anIntArrayArray22[0][0] == 5) {
				local207 = local123.anIntArrayArray22[0][1];
				if (local123.anIntArray270[0] != Static11.anIntArray44[local207]) {
					Static11.anIntArray44[local207] = local123.anIntArray270[0];
					Static47.method1018(local207);
					Static63.aBoolean89 = true;
				}
			}
		}
		if (local20 == 36) {
			Static11.method451();
		}
		if (local20 == 43) {
			local2081 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local28];
			if (local2081 != null) {
				Static75.method1436(local2081.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local2081.anIntArray256[0]);
				Static64.anInt1921 = Static23.anInt1030;
				Static11.anInt696 = Static68.anInt2013;
				Static111.anInt3172 = 0;
				Static19.anInt946 = 2;
				Static51.aClass6_Sub1_Sub1_3.method1515(45);
				Static51.aClass6_Sub1_Sub1_3.method1475(Static93.anInt2608);
				Static51.aClass6_Sub1_Sub1_3.method1512(local28);
				Static51.aClass6_Sub1_Sub1_3.method1499(Static31.anInt1210);
				Static51.aClass6_Sub1_Sub1_3.method1512(Static34.anInt1317);
			}
		}
		if (local20 == 21) {
			local2081 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local28];
			if (local2081 != null) {
				Static75.method1436(local2081.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local2081.anIntArray256[0]);
				Static111.anInt3172 = 0;
				Static19.anInt946 = 2;
				Static64.anInt1921 = Static23.anInt1030;
				Static11.anInt696 = Static68.anInt2013;
				Static51.aClass6_Sub1_Sub1_3.method1515(118);
				Static51.aClass6_Sub1_Sub1_3.method1512(local28);
			}
		}
		if (local20 == 32) {
			Static51.aClass6_Sub1_Sub1_3.method1515(142);
			Static51.aClass6_Sub1_Sub1_3.method1475(local28);
			Static51.aClass6_Sub1_Sub1_3.method1509(local16);
			Static51.aClass6_Sub1_Sub1_3.method1510(local12);
			Static47.anInt1512 = local12;
			Static97.anInt2829 = 2;
			Static94.anInt2644 = local16;
			Static51.anInt1585 = 0;
			if (local16 >> 16 == Static13.anInt800) {
				Static97.anInt2829 = 1;
			}
			if (local16 >> 16 == Static1.anInt3) {
				Static97.anInt2829 = 3;
			}
		}
		if (local20 == 1006) {
			Static111.anInt3172 = 0;
			Static19.anInt946 = 2;
			Static64.anInt1921 = Static23.anInt1030;
			Static11.anInt696 = Static68.anInt2013;
			Static51.aClass6_Sub1_Sub1_3.method1515(29);
			Static51.aClass6_Sub1_Sub1_3.method1475(local28);
		}
		if (local20 == 33) {
			local2081 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local28];
			if (local2081 != null) {
				Static75.method1436(local2081.anIntArray255[0], 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], false, 0, 0, 1, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 1, local2081.anIntArray256[0]);
				Static64.anInt1921 = Static23.anInt1030;
				Static11.anInt696 = Static68.anInt2013;
				Static19.anInt946 = 2;
				Static111.anInt3172 = 0;
				Static51.aClass6_Sub1_Sub1_3.method1515(85);
				Static51.aClass6_Sub1_Sub1_3.method1512(local28);
			}
		}
		if (local20 == 45 && Static110.method2037(local16, local28, local12)) {
			Static51.aClass6_Sub1_Sub1_3.method1515(102);
			Static51.aClass6_Sub1_Sub1_3.method1475(local12 + Static18.anInt938);
			Static51.aClass6_Sub1_Sub1_3.method1480(Static85.anInt2401);
			Static51.aClass6_Sub1_Sub1_3.method1475(local28 >> 14 & 0x7FFF);
			Static51.aClass6_Sub1_Sub1_3.method1510(local16 + Static88.anInt3276);
		}
		if (Static43.anInt1463 != 0) {
			Static43.anInt1463 = 0;
			Static63.aBoolean89 = true;
		}
		if (Static102.anInt3029 != 0) {
			Static63.aBoolean89 = true;
			Static102.anInt3029 = 0;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!rc;I)Z")
	public static boolean method1186(@OriginalArg(0) Class55 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static64.anInt1912; local19++) {
			if (arg0.method1642(Static68.aClass55Array18[local19])) {
				return true;
			}
		}
		return arg0.method1642(Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.aClass55_245);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
	public static void method1187() {
		aClass5_1 = null;
		anIntArray165 = null;
		anIntArray166 = null;
		aClass55_674 = null;
		aClass11_2 = null;
		aClass6_Sub2_Sub2_Sub4_2 = null;
		aClass65_3 = null;
		aClass55_672 = null;
		aClass55_673 = null;
		aClass6_Sub2_Sub2_Sub1Array29 = null;
		aClass55_671 = null;
		aClass55_676 = null;
		aClass55_675 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII)V")
	public static void method1188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = arg2; local15 <= arg2 + arg1; local15++) {
			for (@Pc(19) int local19 = arg0; local19 <= arg0 + arg3; local19++) {
				if (local19 >= 0 && local19 < 104 && local15 >= 0 && local15 < 104) {
					Static106.aByteArrayArrayArray14[0][local19][local15] = 127;
					if (arg0 == local19 && local19 > 0) {
						Static6.anIntArrayArrayArray1[0][local19][local15] = Static6.anIntArrayArrayArray1[0][local19 - 1][local15];
					}
					if (local19 == arg3 + arg0 && local19 < 103) {
						Static6.anIntArrayArrayArray1[0][local19][local15] = Static6.anIntArrayArrayArray1[0][local19 + 1][local15];
					}
					if (local15 == arg2 && local15 > 0) {
						Static6.anIntArrayArrayArray1[0][local19][local15] = Static6.anIntArrayArrayArray1[0][local19][local15 - 1];
					}
					if (local15 == arg1 + arg2 && local15 < 103) {
						Static6.anIntArrayArrayArray1[0][local19][local15] = Static6.anIntArrayArrayArray1[0][local19][local15 + 1];
					}
				}
			}
		}
	}
}
