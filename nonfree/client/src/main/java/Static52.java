import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!na;")
	public static Class53 aClass53_625 = Static109.method1737("gleiten:");

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!na;")
	private static Class53 aClass53_626 = Static109.method1737("Players");

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Lclient!na;")
	private static Class53 aClass53_627 = Static109.method1737("Create a free account");

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	public static int anInt1342 = 0;

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_628 = Static109.method1737("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "Lclient!na;")
	public static Class53 aClass53_629 = Static109.method1737(" loggt sich aus)3");

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_630 = Static109.method1737("backbase1");

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
	public static boolean aBoolean50 = false;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Lclient!na;")
	private static Class53 aClass53_631 = Static109.method1737("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Lclient!na;")
	public static Class53 aClass53_632 = aClass53_631;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[104][104];

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public static int anInt1346 = 78;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "Lclient!na;")
	public static Class53 aClass53_633 = Static109.method1737("Sprites geladen)3");

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "[Lclient!na;")
	public static Class53[] aClass53Array11 = new Class53[200];

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	public static volatile int anInt1347 = 0;

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
	public static int anInt1349 = 0;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "Lclient!na;")
	public static Class53 aClass53_634 = aClass53_626;

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "Lclient!na;")
	public static Class53 aClass53_635 = aClass53_627;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!we;)V")
	public static void method950(@OriginalArg(1) Class62 arg0) {
		Static93.aClass62_18 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public static void method951() {
		aClass53_634 = null;
		aClass53_631 = null;
		aClass53_635 = null;
		aClass53_629 = null;
		aClass53_630 = null;
		aClass53_632 = null;
		aClass53_628 = null;
		aClass53_626 = null;
		aClass53_625 = null;
		aClass53_633 = null;
		aClass53_627 = null;
		aClass53Array11 = null;
		anIntArrayArray7 = null;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public static void method952() {
		if (Static66.anInt1675 != 0 || Static75.aClass3_Sub1_Sub15_4 != null) {
			return;
		}
		@Pc(18) int local18 = Static73.anInt1832;
		if (Static117.aBoolean119 && Static56.anInt1504 >= 516 && Static54.anInt2854 >= 160 && Static56.anInt1504 <= 765 && Static54.anInt2854 <= 205) {
			local18 = 0;
		}
		@Pc(49) int local49;
		@Pc(111) int local111;
		@Pc(105) int local105;
		if (!Static94.aBoolean93) {
			if (local18 == 1 && Static36.anInt1122 > 0) {
				local49 = Static18.anIntArray48[Static36.anInt1122 - 1];
				if (local49 == 42 || local49 == 38 || local49 == 19 || local49 == 4 || local49 == 13 || local49 == 10 || local49 == 36 || local49 == 48 || local49 == 12 || local49 == 22 || local49 == 15 || local49 == 1001) {
					local105 = Static59.anIntArray192[Static36.anInt1122 - 1];
					local111 = Static53.anIntArray274[Static36.anInt1122 - 1];
					@Pc(117) Class3_Sub1_Sub15 local117 = Static30.method666(local105);
					if (Static102.method1676(Static50.method1914(local117)) || Static23.method400(Static50.method1914(local117))) {
						Static93.anInt2220 = local105;
						Static66.anInt1675 = 2;
						Static99.anInt2349 = local111;
						Static62.anInt1637 = Static56.anInt1504;
						if (Static111.anInt2556 == local105 >> 16) {
							Static66.anInt1675 = 1;
						}
						if (Static123.anInt2865 == local105 >> 16) {
							Static66.anInt1675 = 3;
						}
						Static35.anInt1109 = 0;
						Static96.anInt1429 = Static54.anInt2854;
						Static89.aBoolean83 = false;
						return;
					}
				}
			}
			if (local18 == 1 && (Static126.anInt2183 == 1 || Static77.method1358(Static36.anInt1122 - 1)) && Static36.anInt1122 > 2) {
				local18 = 2;
			}
			if (local18 == 1 && Static36.anInt1122 > 0) {
				Static71.method1206(Static36.anInt1122 - 1);
			}
			if (local18 == 2 && Static36.anInt1122 > 0) {
				Static13.method208();
			}
			return;
		}
		if (local18 != 1) {
			local49 = Static99.anInt2348;
			local111 = Static105.anInt2433;
			if (Static35.anInt1112 == 0) {
				local111 -= 4;
				local49 -= 4;
			}
			if (Static35.anInt1112 == 1) {
				local49 -= 553;
				local111 -= 205;
			}
			if (Static35.anInt1112 == 2) {
				local49 -= 17;
				local111 -= 357;
			}
			if (Static37.anInt2216 - 10 > local49 || local49 > Static37.anInt2216 + Static19.anInt2422 + 10 || Static116.anInt2638 - 10 > local111 || Static116.anInt2638 + Static87.anInt2096 + 10 < local111) {
				if (Static35.anInt1112 == 1) {
					Static36.aBoolean40 = true;
				}
				Static94.aBoolean93 = false;
				if (Static35.anInt1112 == 2) {
					aBoolean50 = true;
				}
			}
		}
		if (local18 != 1) {
			return;
		}
		local49 = Static37.anInt2216;
		local111 = Static116.anInt2638;
		local105 = Static19.anInt2422;
		@Pc(292) int local292 = Static56.anInt1504;
		@Pc(294) int local294 = Static54.anInt2854;
		@Pc(296) int local296 = -1;
		if (Static35.anInt1112 == 0) {
			local294 -= 4;
			local292 -= 4;
		}
		if (Static35.anInt1112 == 1) {
			local294 -= 205;
			local292 -= 553;
		}
		if (Static35.anInt1112 == 2) {
			local292 -= 17;
			local294 -= 357;
		}
		for (@Pc(316) int local316 = 0; local316 < Static36.anInt1122; local316++) {
			@Pc(331) int local331 = local111 + (Static36.anInt1122 - local316 - 1) * 15 + 31;
			if (local292 > local49 && local292 < local49 + local105 && local331 - 13 < local294 && local294 < local331 + 3) {
				local296 = local316;
			}
		}
		if (local296 != -1) {
			Static71.method1206(local296);
		}
		Static94.aBoolean93 = false;
		if (Static35.anInt1112 == 2) {
			aBoolean50 = true;
		}
		if (Static35.anInt1112 == 1) {
			Static36.aBoolean40 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIBLclient!jf;)V")
	public static void method954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub4_Sub1_Sub2 arg2) {
		@Pc(16) int local16;
		if ((arg1 & 0x20) != 0) {
			local16 = Static62.aClass3_Sub7_Sub1_2.method652();
			@Pc(19) byte[] local19 = new byte[local16];
			@Pc(24) Class3_Sub7 local24 = new Class3_Sub7(local19);
			Static62.aClass3_Sub7_Sub1_2.method643(local19, local16);
			Static16.aClass3_Sub7Array1[arg0] = local24;
			arg2.method1044(local24);
		}
		if ((arg1 & 0x10) != 0) {
			arg2.aClass53_662 = Static62.aClass3_Sub7_Sub1_2.method605();
			if (arg2.aClass53_662.method1258(0) == 126) {
				arg2.aClass53_662 = arg2.aClass53_662.method1289(1);
				Static73.method1234(2, arg2.aClass53_668, arg2.aClass53_662);
			} else if (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1 == arg2) {
				Static73.method1234(2, arg2.aClass53_668, arg2.aClass53_662);
			}
			arg2.anInt1450 = 150;
			arg2.anInt1470 = 0;
			arg2.anInt1444 = 0;
		}
		if ((arg1 & 0x8) != 0) {
			arg2.anInt1417 = Static62.aClass3_Sub7_Sub1_2.method617();
			if (arg2.anInt1417 == 65535) {
				arg2.anInt1417 = -1;
			}
		}
		@Pc(130) int local130;
		if ((arg1 & 0x200) != 0) {
			local16 = Static62.aClass3_Sub7_Sub1_2.method612();
			local130 = Static62.aClass3_Sub7_Sub1_2.method647();
			arg2.method1035(Static27.anInt843, local130, local16);
			arg2.anInt1432 = Static27.anInt843 + 300;
			arg2.anInt1458 = Static62.aClass3_Sub7_Sub1_2.method612();
			arg2.anInt1457 = Static62.aClass3_Sub7_Sub1_2.method647();
		}
		if ((arg1 & 0x1) != 0) {
			arg2.anInt1451 = Static62.aClass3_Sub7_Sub1_2.method602();
			arg2.anInt1423 = Static62.aClass3_Sub7_Sub1_2.method611();
		}
		if ((arg1 & 0x400) != 0) {
			arg2.anInt1454 = Static62.aClass3_Sub7_Sub1_2.method604();
			arg2.anInt1475 = Static62.aClass3_Sub7_Sub1_2.method647();
			arg2.anInt1461 = Static62.aClass3_Sub7_Sub1_2.method612();
			arg2.anInt1478 = Static62.aClass3_Sub7_Sub1_2.method604();
			arg2.anInt1462 = Static62.aClass3_Sub7_Sub1_2.method651() + Static27.anInt843;
			arg2.anInt1416 = Static62.aClass3_Sub7_Sub1_2.method651() + Static27.anInt843;
			arg2.anInt1479 = Static62.aClass3_Sub7_Sub1_2.method604();
			arg2.anInt1418 = 1;
			arg2.anInt1420 = 0;
		}
		if ((arg1 & 0x4) != 0) {
			local16 = Static62.aClass3_Sub7_Sub1_2.method647();
			local130 = Static62.aClass3_Sub7_Sub1_2.method612();
			arg2.method1035(Static27.anInt843, local130, local16);
			arg2.anInt1432 = Static27.anInt843 + 300;
			arg2.anInt1458 = Static62.aClass3_Sub7_Sub1_2.method652();
			arg2.anInt1457 = Static62.aClass3_Sub7_Sub1_2.method652();
		}
		@Pc(271) int local271;
		if ((arg1 & 0x80) != 0) {
			local130 = Static62.aClass3_Sub7_Sub1_2.method617();
			local271 = Static62.aClass3_Sub7_Sub1_2.method612();
			@Pc(275) int local275 = Static62.aClass3_Sub7_Sub1_2.method612();
			@Pc(278) int local278 = Static62.aClass3_Sub7_Sub1_2.anInt964;
			if (arg2.aClass53_668 != null && arg2.aClass34_1 != null) {
				@Pc(286) boolean local286 = false;
				@Pc(291) long local291 = arg2.aClass53_668.method1286();
				if (local271 <= 1) {
					for (@Pc(296) int local296 = 0; local296 < Static23.anInt737; local296++) {
						if (local291 == Static39.aLongArray4[local296]) {
							local286 = true;
							break;
						}
					}
				}
				if (!local286 && Static48.anInt1301 == 0) {
					Static103.aClass3_Sub7_6.anInt964 = 0;
					Static62.aClass3_Sub7_Sub1_2.method641(Static103.aClass3_Sub7_6.aByteArray15, local275);
					Static103.aClass3_Sub7_6.anInt964 = 0;
					@Pc(342) Class53 local342 = Static50.method1918(Static103.aClass3_Sub7_6).method1284();
					arg2.aClass53_662 = local342.method1256();
					arg2.anInt1470 = local130 >> 8;
					arg2.anInt1444 = local130 & 0xFF;
					arg2.anInt1450 = 150;
					if (local271 == 2 || local271 == 3) {
						Static73.method1234(1, Static103.method1689(new Class53[] { Static126.aClass53_1045, arg2.aClass53_668 }), local342);
					} else if (local271 == 1) {
						Static73.method1234(1, Static103.method1689(new Class53[] { Static40.aClass53_516, arg2.aClass53_668 }), local342);
					} else {
						Static73.method1234(2, arg2.aClass53_668, local342);
					}
				}
			}
			Static62.aClass3_Sub7_Sub1_2.anInt964 = local275 + local278;
		}
		if ((arg1 & 0x40) != 0) {
			local130 = Static62.aClass3_Sub7_Sub1_2.method651();
			if (local130 == 65535) {
				local130 = -1;
			}
			local271 = Static62.aClass3_Sub7_Sub1_2.method647();
			Static35.method758(local130, arg2, local271);
		}
		if ((arg1 & 0x100) == 0) {
			return;
		}
		arg2.anInt1439 = Static62.aClass3_Sub7_Sub1_2.method617();
		local130 = Static62.aClass3_Sub7_Sub1_2.method606();
		arg2.anInt1431 = 0;
		arg2.anInt1459 = 0;
		arg2.anInt1469 = (local130 & 0xFFFF) + Static27.anInt843;
		if (arg2.anInt1439 == 65535) {
			arg2.anInt1439 = -1;
		}
		if (arg2.anInt1469 > Static27.anInt843) {
			arg2.anInt1431 = -1;
		}
		arg2.anInt1425 = local130 >> 16;
	}
}
