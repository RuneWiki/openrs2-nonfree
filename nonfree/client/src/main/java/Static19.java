import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!e", name = "Pb", descriptor = "Z")
	public static boolean aBoolean56;

	@OriginalMember(owner = "client!e", name = "Ub", descriptor = "Lclient!oa;")
	public static Class9 aClass9_8;

	@OriginalMember(owner = "client!e", name = "nb", descriptor = "I")
	public static int anInt841 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!e", name = "xb", descriptor = "Lclient!fe;")
	public static Class17 aClass17_34 = new Class17(64);

	@OriginalMember(owner = "client!e", name = "Bb", descriptor = "Lclient!lc;")
	private static Class31 aClass31_283 = Static56.method1206("Hidden");

	@OriginalMember(owner = "client!e", name = "Db", descriptor = "Lclient!lc;")
	public static Class31 aClass31_284 = aClass31_283;

	@OriginalMember(owner = "client!e", name = "Ib", descriptor = "I")
	public static int anInt851 = 0;

	@OriginalMember(owner = "client!e", name = "Ob", descriptor = "Lclient!lc;")
	public static Class31 aClass31_285 = Static56.method1206("Message @whi@");

	@OriginalMember(owner = "client!e", name = "Tb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_286 = Static56.method1206(" with @lre@");

	@OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
	public static void method554() {
		aClass9_8 = null;
		aClass31_284 = null;
		aClass31_285 = null;
		aClass17_34 = null;
		aClass31_283 = null;
		aClass31_286 = null;
	}

	@OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V")
	public static void method555() {
		@Pc(9) int local9 = Static90.anInt2413 * 128 + 64;
		@Pc(15) int local15 = Static105.anInt2782 * 128 + 64;
		@Pc(24) int local24 = Static42.method1057(local15, local9, Static58.anInt1945) - Static53.anInt1795;
		if (local15 > Static44.anInt1595) {
			Static44.anInt1595 += Static69.anInt2221 + Static3.anInt124 * (local15 - Static44.anInt1595) / 1000;
			if (Static44.anInt1595 > local15) {
				Static44.anInt1595 = local15;
			}
		}
		if (Static57.anInt2682 < local24) {
			Static57.anInt2682 += Static3.anInt124 * (local24 - Static57.anInt2682) / 1000 + Static69.anInt2221;
			if (Static57.anInt2682 > local24) {
				Static57.anInt2682 = local24;
			}
		}
		if (Static91.anInt2484 < local9) {
			Static91.anInt2484 += Static3.anInt124 * (local9 - Static91.anInt2484) / 1000 + Static69.anInt2221;
			if (Static91.anInt2484 > local9) {
				Static91.anInt2484 = local9;
			}
		}
		if (Static44.anInt1595 > local15) {
			Static44.anInt1595 -= Static69.anInt2221 + (Static44.anInt1595 - local15) * Static3.anInt124 / 1000;
			if (Static44.anInt1595 < local15) {
				Static44.anInt1595 = local15;
			}
		}
		local15 = Static25.anInt1097 * 128 + 64;
		if (local24 < Static57.anInt2682) {
			Static57.anInt2682 -= Static3.anInt124 * (Static57.anInt2682 - local24) / 1000 + Static69.anInt2221;
			if (Static57.anInt2682 < local24) {
				Static57.anInt2682 = local24;
			}
		}
		if (Static91.anInt2484 > local9) {
			Static91.anInt2484 -= Static69.anInt2221 + (Static91.anInt2484 - local9) * Static3.anInt124 / 1000;
			if (Static91.anInt2484 < local9) {
				Static91.anInt2484 = local9;
			}
		}
		local9 = Static58.anInt1941 * 128 + 64;
		local24 = Static42.method1057(local15, local9, Static58.anInt1945) - Static48.anInt1746;
		@Pc(198) int local198 = local24 - Static57.anInt2682;
		@Pc(203) int local203 = local9 - Static91.anInt2484;
		@Pc(208) int local208 = local15 - Static44.anInt1595;
		@Pc(220) int local220 = (int) Math.sqrt((double) (local208 * local208 + local203 * local203));
		@Pc(231) int local231 = (int) (Math.atan2((double) local198, (double) local220) * 325.949D) & 0x7FF;
		if (local231 < 128) {
			local231 = 128;
		}
		if (local231 > 383) {
			local231 = 383;
		}
		@Pc(254) int local254 = (int) (Math.atan2((double) local208, (double) local203) * -325.949D) & 0x7FF;
		if (local231 > Static72.anInt1289) {
			Static72.anInt1289 += Static30.anInt1258 + (local231 - Static72.anInt1289) * Static8.anInt298 / 1000;
			if (local231 < Static72.anInt1289) {
				Static72.anInt1289 = local231;
			}
		}
		if (local231 < Static72.anInt1289) {
			Static72.anInt1289 -= Static30.anInt1258 + (Static72.anInt1289 - local231) * Static8.anInt298 / 1000;
			if (local231 > Static72.anInt1289) {
				Static72.anInt1289 = local231;
			}
		}
		@Pc(308) int local308 = local254 - Static18.anInt805;
		if (local308 > 1024) {
			local308 -= 2048;
		}
		if (local308 < -1024) {
			local308 += 2048;
		}
		if (local308 > 0) {
			Static18.anInt805 += local308 * Static8.anInt298 / 1000 + Static30.anInt1258;
			Static18.anInt805 &= 0x7FF;
		}
		if (local308 < 0) {
			Static18.anInt805 -= Static30.anInt1258 + -local308 * Static8.anInt298 / 1000;
			Static18.anInt805 &= 0x7FF;
		}
		@Pc(363) int local363 = local254 - Static18.anInt805;
		if (local363 > 1024) {
			local363 -= 2048;
		}
		if (local363 < -1024) {
			local363 += 2048;
		}
		if (local363 < 0 && local308 > 0 || local363 > 0 && local308 < 0) {
			Static18.anInt805 = local254;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method556() {
		if (Static49.aBoolean143) {
			Static49.aBoolean143 = false;
			Static13.method378(Static18.aGraphics1);
			Static92.aBoolean81 = true;
			Static27.aBoolean65 = true;
			Static58.aBoolean100 = true;
			Static74.aBoolean115 = true;
		}
		Static55.method1187();
		if (Static105.aBoolean154 && Static64.anInt601 == 1) {
			Static92.aBoolean81 = true;
		}
		@Pc(39) boolean local39;
		if (Static54.anInt1802 != -1) {
			local39 = Static18.method533(Static54.anInt1802);
			if (local39) {
				Static92.aBoolean81 = true;
			}
		}
		if (Static79.anInt2299 == 2) {
			Static92.aBoolean81 = true;
		}
		if (Static46.anInt1615 == 2) {
			Static92.aBoolean81 = true;
		}
		if (Static92.aBoolean81) {
			Static92.aBoolean81 = false;
			Static37.method978();
		}
		@Pc(108) int local108;
		if (Static47.anInt1736 == -1) {
			Static47.aClass2_Sub1_Sub2_1.anInt256 = Static75.anInt2249 - Static38.anInt1428 - 77;
			if (Static85.anInt2508 > 448 && Static85.anInt2508 < 560 && Static61.anInt2102 > 332) {
				Static18.method532(Static85.anInt2508 - 17, 0, -1, Static61.anInt2102 - 357, Static47.aClass2_Sub1_Sub2_1, Static75.anInt2249, 463, 77);
			}
			local108 = Static75.anInt2249 - Static47.aClass2_Sub1_Sub2_1.anInt256 - 77;
			if (local108 < 0) {
				local108 = 0;
			}
			if (local108 > Static75.anInt2249 - 77) {
				local108 = Static75.anInt2249 - 77;
			}
			if (Static38.anInt1428 != local108) {
				Static38.anInt1428 = local108;
				Static27.aBoolean65 = true;
			}
		}
		if (Static47.anInt1736 == -1 && Static49.anInt2692 == 3) {
			Static47.aClass2_Sub1_Sub2_1.anInt256 = Static66.anInt2181;
			local108 = Static96.anInt2602 * 14 + 7;
			if (Static85.anInt2508 > 448 && Static85.anInt2508 < 560 && Static61.anInt2102 > 332) {
				Static18.method532(Static85.anInt2508 - 17, 0, -1, Static61.anInt2102 - 357, Static47.aClass2_Sub1_Sub2_1, local108, 463, 77);
			}
			@Pc(179) int local179 = Static47.aClass2_Sub1_Sub2_1.anInt256;
			if (local179 < 0) {
				local179 = 0;
			}
			if (local108 - 77 < local179) {
				local179 = local108 - 77;
			}
			if (local179 != Static66.anInt2181) {
				Static66.anInt2181 = local179;
				Static27.aBoolean65 = true;
			}
		}
		if (Static47.anInt1736 != -1) {
			local39 = Static18.method533(Static47.anInt1736);
			if (local39) {
				Static27.aBoolean65 = true;
			}
		}
		if (Static79.anInt2299 == 3) {
			Static27.aBoolean65 = true;
		}
		if (Static46.anInt1615 == 3) {
			Static27.aBoolean65 = true;
		}
		if (Static5.aClass31_72 != null) {
			Static27.aBoolean65 = true;
		}
		if (Static105.aBoolean154 && Static64.anInt601 == 2) {
			Static27.aBoolean65 = true;
		}
		if (Static27.aBoolean65) {
			Static27.aBoolean65 = false;
			Static79.method1441();
		}
		Static51.method1132();
		if (Static60.anInt2058 != -1) {
			Static58.aBoolean100 = true;
		}
		if (Static58.aBoolean100) {
			if (Static60.anInt2058 != -1 && Static60.anInt2058 == Static31.anInt1279) {
				Static60.anInt2058 = -1;
				Static20.aClass2_Sub6_Sub1_11.method684(145);
				Static20.aClass2_Sub6_Sub1_11.method637(Static31.anInt1279);
			}
			Static89.aBoolean122 = true;
			Static58.aBoolean100 = false;
			Static99.method1686(Static41.anIntArray245, Static49.anInt2694 % 20 < 10 ? -1 : Static60.anInt2058, Static31.anInt1279, Static54.anInt1802 == -1, Static18.aGraphics1);
		}
		if (Static74.aBoolean115) {
			Static74.aBoolean115 = false;
			Static89.aBoolean122 = true;
			Static87.method1486(Static12.anInt527, Static92.anInt1560, Static18.aGraphics1, Static98.aClass2_Sub1_Sub3_Sub3_4, Static78.anInt2283);
		}
		Static56.anInt1911 = 0;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Lclient!lc;")
	public static Class31 method557(@OriginalArg(1) int arg0) {
		return Static37.method974(new Class31[] { Static89.method1499(arg0 >> 24 & 0xFF), Static60.aClass31_720, Static89.method1499(arg0 >> 16 & 0xFF), Static60.aClass31_720, Static89.method1499(arg0 >> 8 & 0xFF), Static60.aClass31_720, Static89.method1499(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!e", name = "i", descriptor = "(I)V")
	public static void method559() {
		Static49.aByteArrayArrayArray37 = null;
		Static63.aByteArrayArrayArray28 = null;
		Static21.aByteArrayArrayArray12 = null;
		Static39.anIntArrayArray49 = null;
		Static37.anIntArray223 = null;
		Static95.aByteArrayArrayArray34 = null;
		Static103.anIntArray389 = null;
		Static77.aByteArrayArrayArray30 = null;
		Static23.anIntArray113 = null;
		Static76.anIntArrayArrayArray3 = null;
		Static54.anIntArray266 = null;
		Static18.anIntArray97 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I")
	public static int method560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg2 /= 2;
		}
		if (arg1 > 192) {
			arg2 /= 2;
		}
		if (arg1 > 217) {
			arg2 /= 2;
		}
		if (arg1 > 243) {
			arg2 /= 2;
		}
		return arg1 / 2 + (arg2 / 32 << 7) + (arg0 / 4 << 10);
	}
}
