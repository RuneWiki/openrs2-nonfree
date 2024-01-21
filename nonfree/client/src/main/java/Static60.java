import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!vb;")
	public static Class11_Sub1 aClass11_Sub1_112;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "I")
	public static int anInt2984;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "Lclient!vb;")
	public static Class11_Sub1 aClass11_Sub1_113;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "Lclient!bf;")
	public static Class11 aClass11_72;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "I")
	public static int anInt2989;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1358 = Static56.method972(" from your ignore list first");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1357 = aClass5_1358;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public static int anInt2979 = 3;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1359 = Static56.method972("welle2:");

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1360 = Static56.method972("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!la", name = "o", descriptor = "I")
	public static int anInt2985 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1361 = Static56.method972("Titelbild geladen)3");

	@OriginalMember(owner = "client!la", name = "s", descriptor = "I")
	public static int anInt2986 = 0;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1362 = Static56.method972(":0");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method1960() {
		@Pc(7) Class5 local7 = null;
		for (@Pc(9) int local9 = 0; local9 < Static75.anInt1934; local9++) {
			if (Static49.aClass5Array9[local9].method154(Static95.aClass5_1120) != -1) {
				local7 = Static49.aClass5Array9[local9].method159(Static49.aClass5Array9[local9].method154(Static95.aClass5_1120));
				break;
			}
		}
		if (local7 == null) {
			Static1.method5();
			return;
		}
		@Pc(44) int local44 = Static102.anInt2635;
		if (local44 < 0) {
			local44 = 0;
		}
		@Pc(53) int local53 = Static53.anInt1408;
		@Pc(55) int local55 = Static61.anInt1656;
		@Pc(57) int local57 = Static15.anInt520;
		if (local57 > 190) {
			local57 = 190;
		}
		Static66.method1839(local44, local53, local57, local55, 6116423);
		Static66.method1839(local44 + 1, local53 + 1, local57 - 2, 16, 0);
		Static66.method1842(local44 + 1, local53 + 18, local57 - 2, local55 + -19, 0);
		Static48.aClass3_Sub1_Sub2_Sub1_2.method265(local7, local44 + 3, local53 - -14, 6116423, false);
		@Pc(109) int local109 = Static49.anInt1325;
		@Pc(111) int local111 = Static100.anInt2512;
		if (Static58.anInt1603 == 0) {
			local111 -= 4;
			local109 -= 4;
		}
		if (Static58.anInt1603 == 1) {
			local109 -= 205;
			local111 -= 553;
		}
		if (Static58.anInt1603 == 2) {
			local109 -= 357;
			local111 -= 17;
		}
		for (@Pc(132) int local132 = 0; local132 < Static75.anInt1934; local132++) {
			@Pc(148) int local148 = local53 + (Static75.anInt1934 - local132 - 1) * 15 + 31;
			@Pc(150) int local150 = 16777215;
			@Pc(154) Class5 local154 = Static49.aClass5Array9[local132];
			if (local154.method158(local7)) {
				local154 = local154.method133(0, local154.method144() - local7.method144());
				if (local154.method158(Static91.aClass5_1066)) {
					local154 = local154.method133(0, local154.method144() - Static91.aClass5_1066.method144());
				}
			}
			if (local44 < local111 && local44 + local57 > local111 && local148 - 13 < local109 && local148 + 3 > local109) {
				local150 = 16776960;
			}
			Static48.aClass3_Sub1_Sub2_Sub1_2.method265(local154, local44 + 3, local148, local150, true);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	public static void method1961(@OriginalArg(0) int arg0) {
		Static72.method1212();
		@Pc(14) int local14 = Static104.method1159(arg0).anInt2547;
		if (local14 == 0) {
			return;
		}
		@Pc(24) int local24 = Static110.anIntArray373[arg0];
		if (local14 == 1) {
			if (local24 == 1) {
				Static25.method500(0.9D);
				((Class57) Static25.anInterface3_1).method1561(0.9D);
			}
			if (local24 == 2) {
				Static25.method500(0.8D);
				((Class57) Static25.anInterface3_1).method1561(0.8D);
			}
			if (local24 == 3) {
				Static25.method500(0.7D);
				((Class57) Static25.anInterface3_1).method1561(0.7D);
			}
			if (local24 == 4) {
				Static25.method500(0.6D);
				((Class57) Static25.anInterface3_1).method1561(0.6D);
			}
			Static110.method1912();
			Static27.aBoolean42 = true;
		}
		if (local14 == 3) {
			@Pc(84) short local84 = 0;
			if (local24 == 0) {
				local84 = 255;
			}
			if (local24 == 1) {
				local84 = 192;
			}
			if (local24 == 2) {
				local84 = 128;
			}
			if (local24 == 3) {
				local84 = 64;
			}
			if (local24 == 4) {
				local84 = 0;
			}
			if (local84 != Static68.anInt1575) {
				if (Static68.anInt1575 == 0 && Static115.anInt2976 != -1) {
					Static62.method1073(0, Static34.aClass11_Sub1_34, local84, Static115.anInt2976);
					Static18.anInt633 = 0;
				} else if (local84 == 0) {
					Static62.method1074();
					Static18.anInt633 = 0;
				} else {
					Static76.method1692(local84);
				}
				Static68.anInt1575 = local84;
			}
		}
		if (local14 == 6) {
			Static113.anInt2946 = local24;
		}
		if (local14 == 5) {
			Static74.anInt1895 = local24;
		}
		if (local14 == 10) {
			if (local24 == 0) {
				Static10.anInt2842 = 127;
			}
			if (local24 == 1) {
				Static10.anInt2842 = 96;
			}
			if (local24 == 2) {
				Static10.anInt2842 = 64;
			}
			if (local24 == 3) {
				Static10.anInt2842 = 32;
			}
			if (local24 == 4) {
				Static10.anInt2842 = 0;
			}
		}
		if (local14 == 9) {
			Static16.anInt604 = local24;
		}
		if (local14 == 8) {
			Static3.anInt292 = local24;
			Static15.aBoolean22 = true;
		}
		if (local14 != 4) {
			return;
		}
		if (local24 == 0) {
			Static56.anInt1483 = 127;
		}
		if (local24 == 1) {
			Static56.anInt1483 = 96;
		}
		if (local24 == 2) {
			Static56.anInt1483 = 64;
		}
		if (local24 == 3) {
			Static56.anInt1483 = 32;
		}
		if (local24 == 4) {
			Static56.anInt1483 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V")
	public static void method1962() {
		aClass5_1361 = null;
		aClass11_72 = null;
		aClass11_Sub1_112 = null;
		aClass5_1359 = null;
		aClass5_1362 = null;
		aClass11_Sub1_113 = null;
		aClass5_1360 = null;
		aClass5_1357 = null;
		aClass5_1358 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V")
	public static void method1963(@OriginalArg(0) int arg0) {
		Static106.method1772(arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1964() {
		if (Static46.anInt1278 != 0 || Static87.aClass3_Sub1_Sub17_3 != null) {
			return;
		}
		@Pc(13) int local13 = Static76.anInt2563;
		if (Static100.aBoolean124 && Static45.anInt1269 >= 516 && Static99.anInt2491 >= 160 && Static45.anInt1269 <= 765 && Static99.anInt2491 <= 205) {
			local13 = 0;
		}
		@Pc(49) int local49;
		@Pc(101) int local101;
		@Pc(107) int local107;
		if (!Static103.aBoolean142) {
			if (local13 == 1 && Static75.anInt1934 > 0) {
				local49 = Static52.anIntArray162[Static75.anInt1934 - 1];
				if (local49 == 35 || local49 == 30 || local49 == 26 || local49 == 25 || local49 == 49 || local49 == 28 || local49 == 16 || local49 == 54 || local49 == 32 || local49 == 19 || local49 == 23 || local49 == 1004) {
					local101 = Static13.anIntArray61[Static75.anInt1934 - 1];
					local107 = Static70.anIntArray207[Static75.anInt1934 - 1];
					@Pc(111) Class3_Sub1_Sub17 local111 = Static58.method1009(local107);
					if (local111.method1712() || local111.method1732()) {
						Static9.aBoolean17 = false;
						Static102.anInt2610 = 0;
						Static115.anInt2975 = local107;
						Static30.anInt880 = Static99.anInt2491;
						Static46.anInt1278 = 2;
						if (local107 >> 16 == Static89.anInt2288) {
							Static46.anInt1278 = 1;
						}
						if (Static88.anInt2255 == local107 >> 16) {
							Static46.anInt1278 = 3;
						}
						Static78.anInt1952 = local101;
						Static27.anInt817 = Static45.anInt1269;
						return;
					}
				}
			}
			if (local13 == 1 && (Static74.anInt1895 == 1 || Static49.method875(Static75.anInt1934 - 1)) && Static75.anInt1934 > 2) {
				local13 = 2;
			}
			if (local13 == 1 && Static75.anInt1934 > 0) {
				Static33.method651(Static75.anInt1934 - 1);
			}
			if (local13 == 2 && Static75.anInt1934 > 0) {
				Static56.method973();
			}
			return;
		}
		if (local13 != 1) {
			local101 = Static49.anInt1325;
			local49 = Static100.anInt2512;
			if (Static58.anInt1603 == 0) {
				local101 -= 4;
				local49 -= 4;
			}
			if (Static58.anInt1603 == 1) {
				local101 -= 205;
				local49 -= 553;
			}
			if (Static58.anInt1603 == 2) {
				local49 -= 17;
				local101 -= 357;
			}
			if (Static102.anInt2635 - 10 > local49 || Static15.anInt520 + Static102.anInt2635 + 10 < local49 || local101 < Static53.anInt1408 - 10 || Static61.anInt1656 + Static53.anInt1408 + 10 < local101) {
				Static103.aBoolean142 = false;
				if (Static58.anInt1603 == 1) {
					Static116.aBoolean157 = true;
				}
				if (Static58.anInt1603 == 2) {
					Static15.aBoolean22 = true;
				}
			}
		}
		if (local13 != 1) {
			return;
		}
		local101 = Static53.anInt1408;
		local49 = Static102.anInt2635;
		local107 = Static15.anInt520;
		@Pc(283) int local283 = Static45.anInt1269;
		@Pc(285) int local285 = Static99.anInt2491;
		@Pc(287) int local287 = -1;
		if (Static58.anInt1603 == 0) {
			local285 -= 4;
			local283 -= 4;
		}
		if (Static58.anInt1603 == 1) {
			local283 -= 553;
			local285 -= 205;
		}
		if (Static58.anInt1603 == 2) {
			local285 -= 357;
			local283 -= 17;
		}
		for (@Pc(310) int local310 = 0; local310 < Static75.anInt1934; local310++) {
			@Pc(325) int local325 = local101 + (-local310 + (Static75.anInt1934 - 1)) * 15 + 31;
			if (local283 > local49 && local283 < local107 + local49 && local325 - 13 < local285 && local325 + 3 > local285) {
				local287 = local310;
			}
		}
		if (local287 != -1) {
			Static33.method651(local287);
		}
		if (Static58.anInt1603 == 2) {
			Static15.aBoolean22 = true;
		}
		Static103.aBoolean142 = false;
		if (Static58.anInt1603 == 1) {
			Static116.aBoolean157 = true;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)I")
	public static int method1965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
