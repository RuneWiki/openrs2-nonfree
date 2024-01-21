import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!i", name = "b", descriptor = "Lclient!kc;")
	public static Class22 aClass22_11;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3[] aClass2_Sub1_Sub9_Sub3Array4;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "I")
	public static int anInt1524;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!wd;")
	private static Class80 aClass80_550 = Static2.method59("Please contact customer support)3");

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_545 = aClass80_550;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!wd;")
	public static Class80 aClass80_546 = Static2.method59("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Lclient!wd;")
	public static Class80 aClass80_547 = Static2.method59("(Y ");

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_548 = Static2.method59("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Lclient!wd;")
	public static Class80 aClass80_549 = Static2.method59("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_551 = Static2.method59("@lre@");

	@OriginalMember(owner = "client!i", name = "u", descriptor = "Lclient!wd;")
	public static Class80 aClass80_552 = Static2.method59("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Z")
	public static boolean method879(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!va;)V")
	public static void method881(@OriginalArg(1) Class2_Sub1_Sub17 arg0) {
		@Pc(4) int local4 = arg0.anInt3030;
		@Pc(94) int local94;
		if (local4 >= 1 && local4 <= 100 || !(local4 < 701 || local4 > 800)) {
			if (Static89.anInt2165 == 0) {
				if (local4 == 1) {
					arg0.anInt3061 = 0;
					arg0.aClass80_1160 = Static127.aClass80_1205;
					return;
				}
				if (local4 == 2) {
					arg0.anInt3061 = 0;
					arg0.aClass80_1160 = Static121.aClass80_1177;
					return;
				}
			}
			if (Static89.anInt2165 == 1) {
				if (local4 == 1) {
					arg0.anInt3061 = 0;
					arg0.aClass80_1160 = Static18.aClass80_257;
					return;
				}
				if (local4 == 2) {
					arg0.anInt3061 = 0;
					arg0.aClass80_1160 = Static121.aClass80_1181;
					return;
				}
				if (local4 == 3) {
					arg0.anInt3061 = 0;
					arg0.aClass80_1160 = Static5.aClass80_59;
					return;
				}
			}
			if (local4 <= 700) {
				local4--;
			} else {
				local4 -= 601;
			}
			local94 = Static45.anInt2090;
			if (Static89.anInt2165 != 2) {
				local94 = 0;
			}
			if (local94 <= local4) {
				arg0.aClass80_1160 = Static40.aClass80_446;
				arg0.anInt3061 = 0;
			} else {
				arg0.aClass80_1160 = Static123.aClass80Array20[local4];
				arg0.anInt3061 = 1;
			}
		} else if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
			if (local4 > 800) {
				local4 -= 701;
			} else {
				local4 -= 101;
			}
			local94 = Static45.anInt2090;
			if (Static89.anInt2165 != 2) {
				local94 = 0;
			}
			if (local94 <= local4) {
				arg0.aClass80_1160 = Static40.aClass80_446;
				arg0.anInt3061 = 0;
			} else {
				if (Static29.anIntArray125[local4] == 0) {
					arg0.aClass80_1160 = Static93.method1444(new Class80[] { Static110.aClass80_1099, Static92.aClass80_885 });
				} else if (Static29.anIntArray125[local4] >= 5000) {
					if (Static29.anIntArray125[local4] == Static106.anInt2839) {
						arg0.aClass80_1160 = Static93.method1444(new Class80[] { Static84.aClass80_824, Static115.aClass80_1119, Static28.method1422(Static29.anIntArray125[local4] - 5000) });
					} else {
						arg0.aClass80_1160 = Static93.method1444(new Class80[] { Static115.aClass80_1124, Static115.aClass80_1119, Static28.method1422(Static29.anIntArray125[local4] - 5000) });
					}
				} else if (Static106.anInt2839 == Static29.anIntArray125[local4]) {
					arg0.aClass80_1160 = Static93.method1444(new Class80[] { Static84.aClass80_824, Static16.aClass80_175, Static28.method1422(Static29.anIntArray125[local4]) });
				} else {
					arg0.aClass80_1160 = Static93.method1444(new Class80[] { Static115.aClass80_1124, Static16.aClass80_175, Static28.method1422(Static29.anIntArray125[local4]) });
				}
				arg0.anInt3061 = 1;
			}
		} else if (local4 == 203) {
			local94 = Static45.anInt2090;
			if (Static89.anInt2165 != 2) {
				local94 = 0;
			}
			arg0.anInt3050 = local94 * 15 + 20;
			if (arg0.anInt3024 >= arg0.anInt3050) {
				arg0.anInt3050 = arg0.anInt3024 + 1;
			}
		} else if (local4 >= 401 && local4 <= 500) {
			local4 -= 401;
			if (local4 == 0 && Static89.anInt2165 == 0) {
				arg0.anInt3061 = 0;
				arg0.aClass80_1160 = Static17.aClass80_224;
			} else if (local4 == 1 && Static89.anInt2165 == 0) {
				arg0.anInt3061 = 0;
				arg0.aClass80_1160 = Static121.aClass80_1177;
			} else {
				local94 = Static64.anInt1824;
				if (Static89.anInt2165 == 0) {
					local94 = 0;
				}
				if (local4 >= local94) {
					arg0.aClass80_1160 = Static40.aClass80_446;
					arg0.anInt3061 = 0;
				} else {
					arg0.aClass80_1160 = Static102.method1658(Static64.aLongArray5[local4]).method2000();
					arg0.anInt3061 = 1;
				}
			}
		} else if (local4 == 503) {
			arg0.anInt3050 = Static64.anInt1824 * 15 + 20;
			if (arg0.anInt3024 >= arg0.anInt3050) {
				arg0.anInt3050 = arg0.anInt3024 + 1;
			}
		} else if (local4 == 324) {
			if (Static13.anInt368 == -1) {
				Static13.anInt368 = arg0.anInt3032;
				Static115.anInt2950 = arg0.anInt3059;
			}
			if (Static33.aClass79_1.aBoolean243) {
				arg0.anInt3032 = Static13.anInt368;
			} else {
				arg0.anInt3032 = Static115.anInt2950;
			}
		} else if (local4 == 325) {
			if (Static13.anInt368 == -1) {
				Static13.anInt368 = arg0.anInt3032;
				Static115.anInt2950 = arg0.anInt3059;
			}
			if (Static33.aClass79_1.aBoolean243) {
				arg0.anInt3032 = Static115.anInt2950;
			} else {
				arg0.anInt3032 = Static13.anInt368;
			}
		} else if (local4 == 327) {
			arg0.anInt3046 = 150;
			arg0.anInt3062 = (int) (Math.sin((double) Static10.anInt300 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3019 = 0;
			arg0.anInt3018 = 5;
		} else if (local4 == 328) {
			arg0.anInt3046 = 150;
			arg0.anInt3062 = (int) (Math.sin((double) Static10.anInt300 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3018 = 5;
			arg0.anInt3019 = 1;
		} else if (local4 == 600) {
			arg0.aClass80_1160 = Static93.method1444(new Class80[] { Static40.aClass80_456, Static104.aClass80_1037 });
		} else if (local4 == 620) {
			if (Static57.anInt1738 < 1) {
				arg0.aClass80_1160 = Static40.aClass80_446;
			} else if (Static18.aBoolean49) {
				arg0.anInt3069 = 16711680;
				arg0.aClass80_1160 = Static106.aClass80_1064;
			} else {
				arg0.aClass80_1160 = Static113.aClass80_1110;
				arg0.anInt3069 = 16777215;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	public static void method882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub1_Sub17 local8 = Static61.method1057(arg0, arg2);
		if (local8 != null && local8.anObjectArray14 != null) {
			Static40.method667(local8.anObjectArray14, null, 0, 0, 0, local8);
		}
		Static76.aBoolean141 = true;
		Static43.anInt1292 = arg2;
		anInt1524 = arg1;
		Static74.anInt1950 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method883() {
		Static111.aClass32_54.method878();
		Static25.aClass32_17.method878();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
	public static void method884() {
		aClass80_546 = null;
		aClass80_550 = null;
		aClass80_549 = null;
		aClass80_548 = null;
		aClass80_545 = null;
		aClass22_11 = null;
		aClass2_Sub1_Sub9_Sub3Array4 = null;
		aClass80_552 = null;
		aClass80_551 = null;
		aClass80_547 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!va;I)Z")
	public static boolean method886(@OriginalArg(0) Class2_Sub1_Sub17 arg0) {
		@Pc(6) int local6 = arg0.anInt3030;
		if (Static89.anInt2165 == 2) {
			if (local6 == 201) {
				Static40.aClass80_450 = Static57.aClass80_621;
				Static53.aBoolean109 = true;
				Static42.anInt1258 = 0;
				Static40.aClass80_454 = Static40.aClass80_446;
				Static37.aBoolean77 = true;
				Static61.anInt1794 = 1;
			}
			if (local6 == 202) {
				Static42.anInt1258 = 0;
				Static40.aClass80_450 = Static61.aClass80_639;
				Static40.aClass80_454 = Static40.aClass80_446;
				Static37.aBoolean77 = true;
				Static61.anInt1794 = 2;
				Static53.aBoolean109 = true;
			}
		}
		if (local6 == 205) {
			Static55.anInt1305 = 250;
			return true;
		}
		if (local6 == 501) {
			Static42.anInt1258 = 0;
			Static40.aClass80_450 = Static29.aClass80_357;
			Static37.aBoolean77 = true;
			Static40.aClass80_454 = Static40.aClass80_446;
			Static61.anInt1794 = 4;
			Static53.aBoolean109 = true;
		}
		if (local6 == 502) {
			Static40.aClass80_454 = Static40.aClass80_446;
			Static40.aClass80_450 = Static23.aClass80_283;
			Static42.anInt1258 = 0;
			Static61.anInt1794 = 5;
			Static37.aBoolean77 = true;
			Static53.aBoolean109 = true;
		}
		@Pc(112) int local112;
		@Pc(106) int local106;
		if (local6 >= 300 && local6 <= 313) {
			local106 = local6 & 0x1;
			local112 = (local6 - 300) / 2;
			Static33.aClass79_1.method1985(local106 == 1, local112);
		}
		if (local6 >= 314 && local6 <= 323) {
			local106 = local6 & 0x1;
			local112 = (local6 - 314) / 2;
			Static33.aClass79_1.method1982(local106 == 1, local112);
		}
		if (local6 == 324) {
			Static33.aClass79_1.method1984(false);
		}
		if (local6 == 325) {
			Static33.aClass79_1.method1984(true);
		}
		if (local6 == 326) {
			Static120.aClass2_Sub17_Sub1_3.method1799(96);
			Static33.aClass79_1.method1994(Static120.aClass2_Sub17_Sub1_3);
			return true;
		}
		if (local6 == 620) {
			Static18.aBoolean49 = !Static18.aBoolean49;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static61.method1062();
			if (Static40.aClass80_456.method1999() > 0) {
				Static120.aClass2_Sub17_Sub1_3.method1799(162);
				Static120.aClass2_Sub17_Sub1_3.method1772(Static40.aClass80_456.method2023());
				Static120.aClass2_Sub17_Sub1_3.method1769(local6 - 601);
				Static120.aClass2_Sub17_Sub1_3.method1769(Static18.aBoolean49 ? 1 : 0);
			}
		}
		return false;
	}
}
