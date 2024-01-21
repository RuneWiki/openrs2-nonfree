import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!s", name = "L", descriptor = "Lclient!we;")
	public static Class62 aClass62_22;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "I")
	public static int anInt2381;

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "Lclient!we;")
	public static Class62 aClass62_23;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_22;

	@OriginalMember(owner = "client!s", name = "J", descriptor = "I")
	public static int anInt2376 = 0;

	@OriginalMember(owner = "client!s", name = "K", descriptor = "Lclient!na;")
	public static Class53 aClass53_1158 = Static109.method1737("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!s", name = "N", descriptor = "Lclient!na;")
	public static Class53 aClass53_1159 = Static109.method1737("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!s", name = "O", descriptor = "I")
	public static int anInt2377 = 1;

	@OriginalMember(owner = "client!s", name = "P", descriptor = "Lclient!na;")
	public static Class53 aClass53_1160 = Static109.method1737("*6n");

	@OriginalMember(owner = "client!s", name = "T", descriptor = "Lclient!na;")
	public static Class53 aClass53_1161 = Static109.method1737("redstone3");

	@OriginalMember(owner = "client!s", name = "X", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "J")
	public static long aLong75 = 0L;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(II)Lclient!ad;")
	public static Class3_Sub1_Sub1 method1666(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub1 local6 = (Class3_Sub1_Sub1) Static119.aClass75_12.method1728((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static30.aClass62_7.method1512(9, arg0);
		local6 = new Class3_Sub1_Sub1();
		local6.anInt118 = arg0;
		if (local25 != null) {
			local6.method80(new Class3_Sub7(local25));
		}
		local6.method86();
		Static119.aClass75_12.method1730(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V")
	public static void method1667() {
		aClass53_1161 = null;
		aClass3_Sub1_Sub5_Sub3_22 = null;
		aClass53_1159 = null;
		aClass53_1158 = null;
		aClass62_22 = null;
		aClass62_23 = null;
		aClass53_1160 = null;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	public static void method1668() {
		if (Static91.anInt2195 == 0) {
			return;
		}
		@Pc(21) Class3_Sub1_Sub5_Sub2 local21 = Static89.aClass3_Sub1_Sub5_Sub2_3;
		@Pc(23) int local23 = 0;
		if (Static120.anInt2807 != 0) {
			local23 = 1;
		}
		for (@Pc(29) int local29 = 0; local29 < 100; local29++) {
			if (Static94.aClass53Array16[local29] != null) {
				@Pc(39) Class53 local39 = Static15.aClass53Array4[local29];
				@Pc(43) int local43 = Static82.anIntArray110[local29];
				@Pc(45) byte local45 = 0;
				if (local39 != null && local39.method1291(Static40.aClass53_516)) {
					local39 = local39.method1289(5);
					local45 = 1;
				}
				if (local39 != null && local39.method1291(Static126.aClass53_1045)) {
					local39 = local39.method1289(5);
					local45 = 2;
				}
				@Pc(100) int local100;
				if ((local43 == 3 || local43 == 7) && (local43 == 7 || Static9.anInt237 == 0 || Static9.anInt237 == 1 && Static125.method1973(local39))) {
					local100 = 329 - local23 * 13;
					local23++;
					local21.method746(Static65.aClass53_741, 4, local100, 0);
					local21.method746(Static65.aClass53_741, 4, local100 - 1, 65535);
					@Pc(123) int local123 = local21.method745(Static65.aClass53_741) + 4;
					local123 += local21.method755(32);
					if (local45 == 1) {
						Static53.aClass3_Sub1_Sub5_Sub3Array7[0].method813(local123, local100 - 12);
						local123 += 14;
					}
					if (local45 == 2) {
						Static53.aClass3_Sub1_Sub5_Sub3Array7[1].method813(local123, local100 - 12);
						local123 += 14;
					}
					local21.method746(Static103.method1689(new Class53[] { local39, Static61.aClass53_708, Static94.aClass53Array16[local29] }), local123, local100, 0);
					local21.method746(Static103.method1689(new Class53[] { local39, Static61.aClass53_708, Static94.aClass53Array16[local29] }), local123, local100 - 1, 65535);
					if (local23 >= 5) {
						return;
					}
				}
				if (local43 == 5 && Static9.anInt237 < 2) {
					local100 = 329 - local23 * 13;
					local21.method746(Static94.aClass53Array16[local29], 4, local100, 0);
					local21.method746(Static94.aClass53Array16[local29], 4, local100 - 1, 65535);
					local23++;
					if (local23 >= 5) {
						return;
					}
				}
				if (local43 == 6 && Static9.anInt237 < 2) {
					local100 = 329 - local23 * 13;
					local21.method746(Static103.method1689(new Class53[] { Static107.aClass53_1237, Static104.aClass53_1278, local39, Static61.aClass53_708, Static94.aClass53Array16[local29] }), 4, local100, 0);
					local21.method746(Static103.method1689(new Class53[] { Static107.aClass53_1237, Static104.aClass53_1278, local39, Static61.aClass53_708, Static94.aClass53Array16[local29] }), 4, local100 - 1, 65535);
					local23++;
					if (local23 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(Z)V")
	public static void method1669() {
		Static43.anInt1233++;
		Static107.method1721(true);
		Static107.method1719(true);
		Static107.method1721(false);
		Static107.method1719(false);
		Static79.method1384();
		Static10.method174();
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (!Static70.aBoolean65) {
			local29 = Static99.anInt2344;
			if (Static9.anInt231 / 256 > local29) {
				local29 = Static9.anInt231 / 256;
			}
			local45 = Static87.anInt2099 + Static124.anInt2880 & 0x7FF;
			if (Static115.aBooleanArray17[4] && Static79.anIntArray262[4] + 128 > local29) {
				local29 = Static79.anIntArray262[4] + 128;
			}
			Static121.method1938(Static96.anInt1443, local45, Static49.anInt1321, local29, Static77.method1355(Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427, Static72.anInt1813, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424) - 50, local29 * 3 + 600);
		}
		if (Static70.aBoolean65) {
			local29 = Static82.method613();
		} else {
			local29 = Static13.method207();
		}
		@Pc(94) int local94 = Static115.anInt2618;
		local45 = Static39.anInt1177;
		@Pc(98) int local98 = Static95.anInt2273;
		@Pc(100) int local100 = Static48.anInt1302;
		@Pc(102) int local102 = Static72.anInt1807;
		for (@Pc(104) int local104 = 0; local104 < 5; local104++) {
			if (Static115.aBooleanArray17[local104]) {
				@Pc(146) int local146 = (int) ((double) -Static4.anIntArray13[local104] + Math.random() * (double) (Static4.anIntArray13[local104] * 2 + 1) + Math.sin((double) Static8.anIntArray20[local104] * ((double) Static59.anIntArray191[local104] / 100.0D)) * (double) Static79.anIntArray262[local104]);
				if (local104 == 3) {
					Static72.anInt1807 = local146 + Static72.anInt1807 & 0x7FF;
				}
				if (local104 == 2) {
					Static115.anInt2618 += local146;
				}
				if (local104 == 4) {
					Static48.anInt1302 += local146;
					if (Static48.anInt1302 < 128) {
						Static48.anInt1302 = 128;
					}
					if (Static48.anInt1302 > 383) {
						Static48.anInt1302 = 383;
					}
				}
				if (local104 == 0) {
					Static39.anInt1177 += local146;
				}
				if (local104 == 1) {
					Static95.anInt2273 += local146;
				}
			}
		}
		Static106.method1711();
		Static110.aBoolean107 = true;
		Static110.anInt2544 = 0;
		Static110.anInt2548 = Static99.anInt2348 - 4;
		Static110.anInt2546 = Static105.anInt2433 - 4;
		Static40.method820();
		Static84.method1313();
		Static40.method820();
		Static120.aClass39_1.method965(Static39.anInt1177, Static95.anInt2273, Static115.anInt2618, Static48.anInt1302, Static72.anInt1807, local29);
		Static40.method820();
		Static120.aClass39_1.method976();
		Static56.method1039();
		Static58.method1064();
		((Class19) Static24.anInterface2_1).method496(Static37.anInt2215);
		Static66.method1138();
		if (Static97.aBoolean96 && Static116.method1837() == 0) {
			Static97.aBoolean96 = false;
		}
		if (Static97.aBoolean96) {
			Static106.method1711();
			Static84.method1313();
			Static18.method295(Static42.aClass53_538, null, false);
		}
		Static40.method820();
		Static70.method1204();
		Static39.anInt1177 = local45;
		Static72.anInt1807 = local102;
		Static115.anInt2618 = local94;
		Static95.anInt2273 = local98;
		Static48.anInt1302 = local100;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!we;B)V")
	public static void method1670(@OriginalArg(0) Class62 arg0) {
		Static78.aClass62_15 = arg0;
	}
}
