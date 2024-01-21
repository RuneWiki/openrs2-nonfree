import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "[I")
	public static int[] anIntArray6;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "[I")
	public static int[] anIntArray5 = new int[500];

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "Lclient!mb;")
	private static Class45 aClass45_9 = Static63.method1251("Choose Option");

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Lclient!mb;")
	public static Class45 aClass45_8 = aClass45_9;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "Z")
	public static boolean aBoolean2 = false;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "Lclient!mb;")
	private static Class45 aClass45_10 = Static63.method1251("green:");

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "Lclient!mb;")
	public static Class45 aClass45_11 = Static63.method1251("leuchten1:");

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "Lclient!mb;")
	public static Class45 aClass45_12 = Static63.method1251(":chalreq:");

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "Lclient!mb;")
	public static Class45 aClass45_13 = aClass45_10;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public static void method11() {
		if (Static98.anInt2653 == 0) {
			return;
		}
		@Pc(13) Class5_Sub2_Sub6_Sub1 local13 = Static78.aClass5_Sub2_Sub6_Sub1_5;
		@Pc(15) int local15 = 0;
		if (Static53.anInt2368 != 0) {
			local15 = 1;
		}
		for (@Pc(28) int local28 = 0; local28 < 100; local28++) {
			if (Static59.aClass45Array16[local28] != null) {
				@Pc(38) Class45 local38 = Static37.aClass45Array11[local28];
				@Pc(42) int local42 = Static12.anIntArray486[local28];
				@Pc(44) byte local44 = 0;
				if (local38 != null && local38.method1302(Static60.aClass45_720)) {
					local38 = local38.method1296(5);
					local44 = 1;
				}
				if (local38 != null && local38.method1302(Static19.aClass45_285)) {
					local44 = 2;
					local38 = local38.method1296(5);
				}
				@Pc(106) int local106;
				if ((local42 == 3 || local42 == 7) && (local42 == 7 || Static36.anInt1058 == 0 || Static36.anInt1058 == 1 && Static71.method1383(local38))) {
					local106 = 329 - local15 * 13;
					local15++;
					local13.method506(Static73.aClass45_900, 4, local106, 0);
					local13.method506(Static73.aClass45_900, 4, local106 - 1, 65535);
					@Pc(127) int local127 = local13.method520(Static73.aClass45_900) + 4;
					local127 += local13.method509(32);
					if (local44 == 1) {
						Static14.aClass5_Sub2_Sub6_Sub4Array1[0].method1874(local127, local106 - 12);
						local127 += 14;
					}
					if (local44 == 2) {
						Static14.aClass5_Sub2_Sub6_Sub4Array1[1].method1874(local127, local106 - 12);
						local127 += 14;
					}
					local13.method506(Static39.method1443(new Class45[] { local38, Static52.aClass45_1367, Static59.aClass45Array16[local28] }), local127, local106, 0);
					local13.method506(Static39.method1443(new Class45[] { local38, Static52.aClass45_1367, Static59.aClass45Array16[local28] }), local127, local106 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local42 == 5 && Static36.anInt1058 < 2) {
					local106 = 329 - local15 * 13;
					local15++;
					local13.method506(Static59.aClass45Array16[local28], 4, local106, 0);
					local13.method506(Static59.aClass45Array16[local28], 4, local106 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local42 == 6 && Static36.anInt1058 < 2) {
					local106 = 329 - local15 * 13;
					local13.method506(Static39.method1443(new Class45[] { Static112.aClass45_1289, Static11.aClass45_172, local38, Static52.aClass45_1367, Static59.aClass45Array16[local28] }), 4, local106, 0);
					local15++;
					local13.method506(Static39.method1443(new Class45[] { Static112.aClass45_1289, Static11.aClass45_172, local38, Static52.aClass45_1367, Static59.aClass45Array16[local28] }), 4, local106 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ia;I)Z")
	public static boolean method15(@OriginalArg(0) Class5_Sub2_Sub8 arg0) {
		@Pc(2) int local2 = arg0.anInt1267;
		if (local2 >= 1 && local2 <= 200 || !(local2 < 701 || local2 > 900)) {
			if (local2 >= 801) {
				local2 -= 701;
			} else if (local2 >= 701) {
				local2 -= 601;
			} else if (local2 >= 101) {
				local2 -= 101;
			} else {
				local2--;
			}
			Static108.method1945(0, 6, Static39.method1443(new Class45[] { Static39.aClass45_886, Static21.aClass45Array7[local2] }), 0, 0, Static54.aClass45_655);
			Static108.method1945(0, 39, Static39.method1443(new Class45[] { Static39.aClass45_886, Static21.aClass45Array7[local2] }), 0, 0, Static122.aClass45_1388);
			return true;
		} else if (local2 >= 401 && local2 <= 500) {
			Static108.method1945(0, 54, Static39.method1443(new Class45[] { Static39.aClass45_886, arg0.aClass45_544 }), 0, 0, Static54.aClass45_655);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public static void method16() {
		try {
			if (Static45.anInt1317 == 1) {
				@Pc(12) int local12 = Static54.aClass5_Sub7_Sub4_3.method2038();
				if (local12 > 0 && Static54.aClass5_Sub7_Sub4_3.method2049()) {
					local12 -= Static68.anInt1958;
					if (local12 < 0) {
						local12 = 0;
					}
					Static54.aClass5_Sub7_Sub4_3.method2032(local12);
					return;
				}
				Static54.aClass5_Sub7_Sub4_3.method2052();
				Static54.aClass5_Sub7_Sub4_3.method2056();
				Static21.aClass23_1 = null;
				Static21.aClass5_Sub8_1 = null;
				if (Static47.aClass29_31 == null) {
					Static45.anInt1317 = 0;
				} else {
					Static45.anInt1317 = 2;
				}
			}
		} catch (@Pc(59) Exception local59) {
			local59.printStackTrace();
			Static54.aClass5_Sub7_Sub4_3.method2052();
			Static21.aClass5_Sub8_1 = null;
			Static45.anInt1317 = 0;
			Static47.aClass29_31 = null;
			Static21.aClass23_1 = null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	public static void method18() {
		aClass45_10 = null;
		anIntArray6 = null;
		anIntArray5 = null;
		aClass45_12 = null;
		aClass45_13 = null;
		aClass45_11 = null;
		aClass45_8 = null;
		aClass45_9 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public static void method19(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub6 local10 = (Class5_Sub6) Static87.aClass66_8.method1812((long) arg0);
		if (local10 != null) {
			local10.method2144();
		}
	}
}
