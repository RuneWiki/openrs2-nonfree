import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ka", name = "Fb", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!ka", name = "Tb", descriptor = "Lclient!d;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!ka", name = "Vb", descriptor = "Lclient!pb;")
	public static Class41 aClass41_33;

	@OriginalMember(owner = "client!ka", name = "Zb", descriptor = "Lclient!jd;")
	public static Class37 aClass37_18;

	@OriginalMember(owner = "client!ka", name = "dc", descriptor = "I")
	public static int anInt1299;

	@OriginalMember(owner = "client!ka", name = "sb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_815 = Static69.method1153("logo");

	@OriginalMember(owner = "client!ka", name = "Kb", descriptor = "I")
	public static int anInt1289 = 0;

	@OriginalMember(owner = "client!ka", name = "Rb", descriptor = "I")
	public static int anInt1293 = 0;

	@OriginalMember(owner = "client!ka", name = "cc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_816 = Static69.method1153("overlay_multiway");

	@OriginalMember(owner = "client!ka", name = "gc", descriptor = "Lclient!rd;")
	private static Class64 aClass64_818 = Static69.method1153("Please contact customer support)3");

	@OriginalMember(owner = "client!ka", name = "ec", descriptor = "Lclient!rd;")
	public static Class64 aClass64_817 = aClass64_818;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
	public static void method962() {
		aClass16_1 = null;
		aClass64_816 = null;
		aClass37_18 = null;
		Class1_Sub1_Sub2_Sub2.anIntArray186 = null;
		aClass64_815 = null;
		aClass41_33 = null;
		aClass64_817 = null;
		anIntArray185 = null;
		aClass64_818 = null;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)Z")
	public static boolean method964(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!mc;)V")
	public static void method965(@OriginalArg(1) Class1_Sub2 arg0) {
		arg0.aBoolean128 = false;
		if (arg0.aClass1_Sub4_3 != null) {
			arg0.aClass1_Sub4_3.anInt1628 = 0;
		}
		for (@Pc(26) Class1_Sub2 local26 = arg0.method1514(); local26 != null; local26 = arg0.method1518()) {
			method965(local26);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!nd;I)V")
	public static void method967(@OriginalArg(0) Class1_Sub1_Sub11 arg0) {
		@Pc(8) int local8 = arg0.anInt1709;
		@Pc(98) int local98;
		if (local8 >= 1 && local8 <= 100 || !(local8 < 701 || local8 > 800)) {
			if (Static61.anInt1422 == 0) {
				if (local8 == 1) {
					arg0.aClass64_1064 = Static39.aClass64_599;
					arg0.anInt1720 = 0;
					return;
				}
				if (local8 == 2) {
					arg0.anInt1720 = 0;
					arg0.aClass64_1064 = Static55.aClass64_1811;
					return;
				}
			}
			if (Static61.anInt1422 == 1) {
				if (local8 == 1) {
					arg0.anInt1720 = 0;
					arg0.aClass64_1064 = Static18.aClass64_347;
					return;
				}
				if (local8 == 2) {
					arg0.aClass64_1064 = Static55.aClass64_1810;
					arg0.anInt1720 = 0;
					return;
				}
				if (local8 == 3) {
					arg0.aClass64_1064 = Static83.aClass64_1203;
					arg0.anInt1720 = 0;
					return;
				}
			}
			if (local8 <= 700) {
				local8--;
			} else {
				local8 -= 601;
			}
			local98 = Static106.anInt2498;
			if (Static61.anInt1422 != 2) {
				local98 = 0;
			}
			if (local8 >= local98) {
				arg0.anInt1720 = 0;
				arg0.aClass64_1064 = Static60.aClass64_862;
			} else {
				arg0.aClass64_1064 = Static3.aClass64Array1[local8];
				arg0.anInt1720 = 1;
			}
		} else if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
			if (local8 > 800) {
				local8 -= 701;
			} else {
				local8 -= 101;
			}
			local98 = Static106.anInt2498;
			if (Static61.anInt1422 != 2) {
				local98 = 0;
			}
			if (local8 >= local98) {
				arg0.aClass64_1064 = Static60.aClass64_862;
				arg0.anInt1720 = 0;
			} else {
				if (Static27.anIntArray139[local8] == 0) {
					arg0.aClass64_1064 = Static82.method1383(new Class64[] { Static83.aClass64_1198, Static14.aClass64_309 });
				} else if (Static27.anIntArray139[local8] < 5000) {
					if (Static95.anInt2172 == Static27.anIntArray139[local8]) {
						arg0.aClass64_1064 = Static82.method1383(new Class64[] { Static70.aClass64_987, Static65.aClass64_924, Static12.method1395(Static27.anIntArray139[local8]) });
					} else {
						arg0.aClass64_1064 = Static82.method1383(new Class64[] { Static2.aClass64_80, Static65.aClass64_924, Static12.method1395(Static27.anIntArray139[local8]) });
					}
				} else if (Static27.anIntArray139[local8] == Static95.anInt2172) {
					arg0.aClass64_1064 = Static82.method1383(new Class64[] { Static70.aClass64_987, Static39.aClass64_601, Static12.method1395(Static27.anIntArray139[local8] - 5000) });
				} else {
					arg0.aClass64_1064 = Static82.method1383(new Class64[] { Static2.aClass64_80, Static39.aClass64_601, Static12.method1395(Static27.anIntArray139[local8] - 5000) });
				}
				arg0.anInt1720 = 1;
			}
		} else if (local8 == 203) {
			local98 = Static106.anInt2498;
			if (Static61.anInt1422 != 2) {
				local98 = 0;
			}
			arg0.anInt1692 = local98 * 15 + 20;
			if (arg0.anInt1707 >= arg0.anInt1692) {
				arg0.anInt1692 = arg0.anInt1707 + 1;
			}
		} else if (local8 >= 401 && local8 <= 500) {
			local8 -= 401;
			if (local8 == 0 && Static61.anInt1422 == 0) {
				arg0.aClass64_1064 = Static25.aClass64_1768;
				arg0.anInt1720 = 0;
			} else if (local8 == 1 && Static61.anInt1422 == 0) {
				arg0.aClass64_1064 = Static55.aClass64_1811;
				arg0.anInt1720 = 0;
			} else {
				local98 = Static73.anInt1656;
				if (Static61.anInt1422 == 0) {
					local98 = 0;
				}
				if (local98 <= local8) {
					arg0.anInt1720 = 0;
					arg0.aClass64_1064 = Static60.aClass64_862;
				} else {
					arg0.aClass64_1064 = Static34.method565(Static69.aLongArray5[local8]).method1478();
					arg0.anInt1720 = 1;
				}
			}
		} else if (local8 == 503) {
			arg0.anInt1692 = Static73.anInt1656 * 15 + 20;
			if (arg0.anInt1692 <= arg0.anInt1707) {
				arg0.anInt1692 = arg0.anInt1707 + 1;
			}
		} else if (local8 == 324) {
			if (Static26.anInt764 == -1) {
				Static61.anInt1432 = arg0.anInt1724;
				Static26.anInt764 = arg0.anInt1683;
			}
			if (Static94.aClass54_1.aBoolean107) {
				arg0.anInt1683 = Static26.anInt764;
			} else {
				arg0.anInt1683 = Static61.anInt1432;
			}
		} else if (local8 == 325) {
			if (Static26.anInt764 == -1) {
				Static61.anInt1432 = arg0.anInt1724;
				Static26.anInt764 = arg0.anInt1683;
			}
			if (Static94.aClass54_1.aBoolean107) {
				arg0.anInt1683 = Static61.anInt1432;
			} else {
				arg0.anInt1683 = Static26.anInt764;
			}
		} else if (local8 == 327) {
			arg0.anInt1747 = 150;
			arg0.anInt1752 = (int) (Math.sin((double) Static15.anInt471 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1749 = 5;
			arg0.anInt1721 = 0;
		} else if (local8 == 328) {
			arg0.anInt1747 = 150;
			arg0.anInt1752 = (int) (Math.sin((double) Static15.anInt471 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1749 = 5;
			arg0.anInt1721 = 1;
		} else if (local8 == 600) {
			arg0.aClass64_1064 = Static82.method1383(new Class64[] { Static60.aClass64_867, Static72.aClass64_1033 });
		} else if (local8 == 620) {
			if (Static46.anInt1085 < 1) {
				arg0.aClass64_1064 = Static60.aClass64_862;
			} else if (Static15.aBoolean34) {
				arg0.aClass64_1064 = Static50.aClass64_757;
				arg0.anInt1682 = 16711680;
			} else {
				arg0.anInt1682 = 16777215;
				arg0.aClass64_1064 = Static99.aClass64_1403;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V")
	public static void method968() {
		if (Static27.aBoolean59) {
			Static27.aBoolean59 = false;
			Static48.method1859();
			Static116.aBoolean166 = true;
			Static84.aBoolean118 = true;
			Static19.aBoolean42 = true;
			Static19.aBoolean41 = true;
		}
		Static95.method1558();
		if (Static94.aBoolean132 && Static12.anInt1938 == 1) {
			Static19.aBoolean41 = true;
		}
		@Pc(36) boolean local36;
		if (Static101.anInt2274 != -1) {
			local36 = Static17.method351(Static101.anInt2274);
			if (local36) {
				Static19.aBoolean41 = true;
			}
		}
		if (Static117.anInt2816 == 2) {
			Static19.aBoolean41 = true;
		}
		if (Static12.anInt1941 == 2) {
			Static19.aBoolean41 = true;
		}
		if (Static19.aBoolean41) {
			Static19.aBoolean41 = false;
			Static91.method1451();
		}
		@Pc(102) int local102;
		if (Static101.anInt2272 == -1) {
			Static118.aClass1_Sub1_Sub11_5.anInt1689 = Static70.anInt1573 - Static43.anInt986 - 77;
			if (Static81.anInt1404 > 17 && Static81.anInt1404 < 560 && Static63.anInt1474 > 332) {
				Static72.method1194(Static70.anInt1573, 77, 0, Static63.anInt1474 - 357, -1, Static81.anInt1404 - 17, Static118.aClass1_Sub1_Sub11_5, 463);
			}
			local102 = Static70.anInt1573 - Static118.aClass1_Sub1_Sub11_5.anInt1689 - 77;
			if (local102 < 0) {
				local102 = 0;
			}
			if (Static70.anInt1573 - 77 < local102) {
				local102 = Static70.anInt1573 - 77;
			}
			if (local102 != Static43.anInt986) {
				Static116.aBoolean166 = true;
				Static43.anInt986 = local102;
			}
		}
		if (Static101.anInt2272 == -1 && Static118.anInt2834 == 3) {
			Static118.aClass1_Sub1_Sub11_5.anInt1689 = Static77.anInt1845;
			local102 = Static21.anInt655 * 14 + 7;
			if (Static81.anInt1404 > 17 && Static81.anInt1404 < 560 && Static63.anInt1474 > 332) {
				Static72.method1194(local102, 77, 0, Static63.anInt1474 - 357, -1, -17 + Static81.anInt1404, Static118.aClass1_Sub1_Sub11_5, 463);
			}
			@Pc(172) int local172 = Static118.aClass1_Sub1_Sub11_5.anInt1689;
			if (local172 < 0) {
				local172 = 0;
			}
			if (local102 - 77 < local172) {
				local172 = local102 - 77;
			}
			if (local172 != Static77.anInt1845) {
				Static116.aBoolean166 = true;
				Static77.anInt1845 = local172;
			}
		}
		if (Static101.anInt2272 != -1) {
			local36 = Static17.method351(Static101.anInt2272);
			if (local36) {
				Static116.aBoolean166 = true;
			}
		}
		if (Static117.anInt2816 == 3) {
			Static116.aBoolean166 = true;
		}
		if (Static12.anInt1941 == 3) {
			Static116.aBoolean166 = true;
		}
		if (Static48.aClass64_1637 != null) {
			Static116.aBoolean166 = true;
		}
		if (Static94.aBoolean132 && Static12.anInt1938 == 2) {
			Static116.aBoolean166 = true;
		}
		if (Static116.aBoolean166) {
			Static116.aBoolean166 = false;
			Static90.method339();
		}
		Static83.method1388();
		if (Static31.anInt802 != -1) {
			Static84.aBoolean118 = true;
		}
		if (Static84.aBoolean118) {
			if (Static31.anInt802 != -1 && Static31.anInt802 == Static83.anInt1922) {
				Static31.anInt802 = -1;
				Static49.aClass1_Sub6_Sub1_1.method1877(148);
				Static49.aClass1_Sub6_Sub1_1.method1853(Static83.anInt1922);
			}
			Static49.aBoolean67 = true;
			Static84.aBoolean118 = false;
			Static19.method392(Static83.anInt1922, Static101.anIntArray334, Static15.anInt471 % 20 < 10 ? -1 : Static31.anInt802, Static101.anInt2274 == -1);
		}
		if (Static19.aBoolean42) {
			Static19.aBoolean42 = false;
			Static49.aBoolean67 = true;
			Static108.method1806(Static108.anInt2556, Static10.anInt406, Static3.aClass1_Sub1_Sub5_Sub1_1, Static80.anInt1901);
		}
		Static121.method2104(Static15.anInt463, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2375, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2412, Static113.anInt1815);
		Static113.anInt1815 = 0;
	}
}
