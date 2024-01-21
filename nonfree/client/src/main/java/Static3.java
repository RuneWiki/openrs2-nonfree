import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "Lclient!jb;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Lclient!na;")
	public static Class53 aClass53_18 = Static109.method1737(":duelreq:");

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!na;")
	private static Class53 aClass53_19 = Static109.method1737("Loaded interfaces");

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!na;")
	public static Class53 aClass53_20 = aClass53_19;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	public static int anInt72 = 0;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "[I")
	public static int[] anIntArray4 = new int[5];

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!na;")
	public static Class53 aClass53_21 = Static109.method1737("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_22 = Static109.method1737("An:");

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
	public static int anInt79 = 1;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_23 = Static109.method1737("redstone1");

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
	public static int anInt80 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method47() {
		aClass53_21 = null;
		aClass53_19 = null;
		aClass37_1 = null;
		anIntArray4 = null;
		aClass53_23 = null;
		aClass53_20 = null;
		aClass53_22 = null;
		aClass53_18 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!vb;I)V")
	public static void method48(@OriginalArg(0) Class3_Sub1_Sub15 arg0) {
		@Pc(13) int local13 = arg0.anInt2686 >> 16;
		if (local13 == Static123.anInt2865 || Static30.anInt1019 == local13) {
			Static52.aBoolean50 = true;
		}
		if (local13 == Static111.anInt2574 || local13 == Static60.anIntArray194[Static22.anInt713]) {
			Static36.aBoolean40 = true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public static void method49() {
		Static62.aClass3_Sub7_Sub1_2.method658();
		@Pc(11) int local11 = Static62.aClass3_Sub7_Sub1_2.method661(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static62.aClass3_Sub7_Sub1_2.method661(2);
		if (local19 == 0) {
			Static5.anIntArray19[Static107.anInt2462++] = 2047;
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (local19 == 1) {
			local43 = Static62.aClass3_Sub7_Sub1_2.method661(3);
			Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.method1031(false, local43);
			local53 = Static62.aClass3_Sub7_Sub1_2.method661(1);
			if (local53 == 1) {
				Static5.anIntArray19[Static107.anInt2462++] = 2047;
			}
			return;
		}
		@Pc(97) int local97;
		if (local19 == 2) {
			local43 = Static62.aClass3_Sub7_Sub1_2.method661(3);
			Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.method1031(true, local43);
			local53 = Static62.aClass3_Sub7_Sub1_2.method661(3);
			Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.method1031(true, local53);
			local97 = Static62.aClass3_Sub7_Sub1_2.method661(1);
			if (local97 == 1) {
				Static5.anIntArray19[Static107.anInt2462++] = 2047;
			}
		} else if (local19 == 3) {
			Static72.anInt1813 = Static62.aClass3_Sub7_Sub1_2.method661(2);
			local43 = Static62.aClass3_Sub7_Sub1_2.method661(1);
			local53 = Static62.aClass3_Sub7_Sub1_2.method661(1);
			if (local53 == 1) {
				Static5.anIntArray19[Static107.anInt2462++] = 2047;
			}
			local97 = Static62.aClass3_Sub7_Sub1_2.method661(7);
			@Pc(150) int local150 = Static62.aClass3_Sub7_Sub1_2.method661(7);
			Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.method1032(local150, local43 == 1, local97);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public static void method51() {
		if (Static123.aBoolean128) {
			Static40.method820();
			Static123.aBoolean128 = false;
			Static99.method1642();
			Static52.aBoolean50 = true;
			Static119.aBoolean25 = true;
			Static12.aBoolean18 = true;
			Static36.aBoolean40 = true;
		}
		Static101.method1669();
		if (Static94.aBoolean93 && Static35.anInt1112 == 1) {
			Static36.aBoolean40 = true;
		}
		@Pc(37) boolean local37;
		if (Static111.anInt2574 != -1) {
			local37 = Static42.method842(Static111.anInt2574);
			if (local37) {
				Static36.aBoolean40 = true;
			}
		}
		if (Static40.anInt1186 == 2) {
			Static36.aBoolean40 = true;
		}
		if (Static66.anInt1675 == 2) {
			Static36.aBoolean40 = true;
		}
		if (Static36.aBoolean40) {
			Static36.aBoolean40 = false;
			Static117.method1852();
		}
		@Pc(106) int local106;
		if (Static123.anInt2865 == -1) {
			Static7.aClass3_Sub1_Sub15_2.anInt2724 = Static52.anInt1346 - anInt80 - 77;
			if (Static99.anInt2348 > 17 && Static99.anInt2348 < 560 && Static105.anInt2433 > 332) {
				Static76.method1279(Static52.anInt1346, -1, 0, 463, Static99.anInt2348 - 17, Static7.aClass3_Sub1_Sub15_2, 77, Static105.anInt2433 - 357);
			}
			local106 = Static52.anInt1346 - Static7.aClass3_Sub1_Sub15_2.anInt2724 - 77;
			if (local106 < 0) {
				local106 = 0;
			}
			if (local106 > Static52.anInt1346 - 77) {
				local106 = Static52.anInt1346 - 77;
			}
			if (local106 != anInt80) {
				anInt80 = local106;
				Static52.aBoolean50 = true;
			}
		}
		if (Static123.anInt2865 == -1 && Static105.anInt2427 == 3) {
			Static7.aClass3_Sub1_Sub15_2.anInt2724 = Static8.anInt208;
			local106 = Static49.anInt1322 * 14 + 7;
			if (Static99.anInt2348 > 17 && Static99.anInt2348 < 560 && Static105.anInt2433 > 332) {
				Static76.method1279(local106, -1, 0, 463, Static99.anInt2348 - 17, Static7.aClass3_Sub1_Sub15_2, 77, Static105.anInt2433 - 357);
			}
			@Pc(171) int local171 = Static7.aClass3_Sub1_Sub15_2.anInt2724;
			if (local171 < 0) {
				local171 = 0;
			}
			if (local106 - 77 < local171) {
				local171 = local106 - 77;
			}
			if (Static8.anInt208 != local171) {
				Static52.aBoolean50 = true;
				Static8.anInt208 = local171;
			}
		}
		if (Static123.anInt2865 != -1) {
			local37 = Static42.method842(Static123.anInt2865);
			if (local37) {
				Static52.aBoolean50 = true;
			}
		}
		if (Static40.anInt1186 == 3) {
			Static52.aBoolean50 = true;
		}
		if (Static66.anInt1675 == 3) {
			Static52.aBoolean50 = true;
		}
		if (Static114.aClass53_1307 != null) {
			Static52.aBoolean50 = true;
		}
		if (Static94.aBoolean93 && Static35.anInt1112 == 2) {
			Static52.aBoolean50 = true;
		}
		if (Static52.aBoolean50) {
			Static52.aBoolean50 = false;
			Static80.method1413();
		}
		Static43.method869();
		if (Static81.anInt2046 != -1) {
			Static12.aBoolean18 = true;
		}
		if (Static12.aBoolean18) {
			if (Static81.anInt2046 != -1 && Static81.anInt2046 == Static22.anInt713) {
				Static81.anInt2046 = -1;
				Static115.aClass3_Sub7_Sub1_3.method662(66);
				Static115.aClass3_Sub7_Sub1_3.method625(Static22.anInt713);
			}
			Static12.aBoolean18 = false;
			Static66.aBoolean58 = true;
			Static27.method523(Static22.anInt713, Static27.anInt843 % 20 >= 10 ? Static81.anInt2046 : -1, Static60.anIntArray194, Static111.anInt2574 == -1);
		}
		if (Static119.aBoolean25) {
			Static66.aBoolean58 = true;
			Static119.aBoolean25 = false;
			Static85.method1430(Static9.anInt237, Static88.anInt2106, Static89.aClass3_Sub1_Sub5_Sub2_3, Static68.anInt1720);
		}
		Static88.method1455(Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424, Static37.anInt2215, Static72.anInt1813);
		Static37.anInt2215 = 0;
	}
}
