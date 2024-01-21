import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!ae;")
	private static Class5 aClass5_860 = Static56.method972("white:");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Lclient!ae;")
	public static Class5 aClass5_859 = aClass5_860;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "I")
	public static int anInt1857 = 0;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Lclient!ae;")
	private static Class5 aClass5_866 = Static56.method972("Login server offline)3");

	@OriginalMember(owner = "client!na", name = "f", descriptor = "Lclient!ae;")
	public static Class5 aClass5_861 = aClass5_866;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Lclient!ae;")
	public static Class5 aClass5_862 = Static56.method972("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!na", name = "i", descriptor = "Lclient!ae;")
	public static Class5 aClass5_863 = Static56.method972("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_864 = Static56.method972("Neuer Benutzer");

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!ae;")
	public static Class5 aClass5_865 = Static56.method972("Cabbage");

	@OriginalMember(owner = "client!na", name = "o", descriptor = "I")
	public static int anInt1862 = 0;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "I")
	public static int anInt1864 = 0;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method1210() {
		Static9.method279();
		if (Static5.anInt352 == 1) {
			Static79.aClass3_Sub1_Sub2_Sub3Array11[Static37.anInt1040 / 100].method1437(Static31.anInt1151 - 8 - 4, Static67.anInt1779 - 8 + -4);
		}
		if (Static5.anInt352 == 2) {
			Static79.aClass3_Sub1_Sub2_Sub3Array11[Static37.anInt1040 / 100 + 4].method1437(Static31.anInt1151 - 8 - 4, Static67.anInt1779 + -8 - 4);
		}
		if (Static37.anInt1024 != -1) {
			Static45.method853(Static37.anInt1024);
			Static82.method1302(334, 512, Static37.anInt1024, 4);
		}
		if (Static89.anInt2288 != -1) {
			Static45.method853(Static89.anInt2288);
			Static82.method1302(334, 512, Static89.anInt2288, 0);
		}
		Static36.method1790();
		if (!Static103.aBoolean142) {
			Static4.method169();
			Static47.method868();
		} else if (Static58.anInt1603 == 0) {
			Static1.method5();
		}
		if (Static61.anInt1655 == 1) {
			Static102.aClass3_Sub1_Sub2_Sub3_6.method1437(472, 296);
		}
		@Pc(133) int local133;
		if (Static30.aBoolean46) {
			@Pc(111) int local111 = 16776960;
			@Pc(113) byte local113 = 20;
			Static88.aClass3_Sub1_Sub2_Sub1_3.method260(Static75.method1261(new Class5[] { Static44.aClass5_587, Static96.method1319(Static112.anInt2927) }), 20, 16776960);
			local133 = local113 + 15;
			@Pc(135) Runtime local135 = Runtime.getRuntime();
			@Pc(145) int local145 = (int) ((local135.totalMemory() - local135.freeMemory()) / 1024L);
			if (local145 > 32768 && Static74.aBoolean91) {
				local111 = 16711680;
			}
			if (local145 > 65536 && !Static74.aBoolean91) {
				local111 = 16711680;
			}
			Static88.aClass3_Sub1_Sub2_Sub1_3.method260(Static75.method1261(new Class5[] { Static106.aClass5_1231, Static96.method1319(local145), Static105.aClass5_1211 }), 35, local111);
			local133 += 15;
			if (Static73.aBoolean87) {
				Static88.aClass3_Sub1_Sub2_Sub1_3.method260(Static31.aClass5_526, 50, 16711680);
				Static73.aBoolean87 = false;
				local133 += 15;
			}
			if (Static88.aBoolean110) {
				Static88.aClass3_Sub1_Sub2_Sub1_3.method260(Static18.aClass5_280, local133, 16711680);
				Static88.aBoolean110 = false;
				local133 += 15;
			}
			if (Static12.aBoolean20) {
				Static88.aClass3_Sub1_Sub2_Sub1_3.method260(Static50.aClass5_668, local133, 16711680);
				Static12.aBoolean20 = false;
				local133 += 15;
			}
		}
		if (Static69.anInt1818 == 0) {
			return;
		}
		@Pc(225) int local225 = Static69.anInt1818 / 50;
		local133 = local225 / 60;
		@Pc(233) int local233 = local225 % 60;
		if (local233 < 10) {
			Static88.aClass3_Sub1_Sub2_Sub1_3.method277(Static75.method1261(new Class5[] { Static45.aClass5_596, Static96.method1319(local133), Static60.aClass5_1362, Static96.method1319(local233) }), 4, 329, 16776960);
		} else {
			Static88.aClass3_Sub1_Sub2_Sub1_3.method277(Static75.method1261(new Class5[] { Static45.aClass5_596, Static96.method1319(local133), Static30.aClass5_400, Static96.method1319(local233) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)Lclient!r;")
	public static Class3_Sub1_Sub15 method1211(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub15 local10 = (Class3_Sub1_Sub15) Static12.aClass9_7.method282((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static82.aClass11_46.method1882(6, arg0);
		local10 = new Class3_Sub1_Sub15();
		local10.anInt2318 = arg0;
		if (local20 != null) {
			local10.method1530(new Class3_Sub6(local20));
		}
		local10.method1528();
		if (local10.aBoolean117) {
			local10.aBoolean114 = false;
			local10.aBoolean112 = false;
		}
		Static12.aClass9_7.method284(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
	public static void method1212() {
		for (@Pc(10) Class3_Sub10 local10 = (Class3_Sub10) Static5.aClass51_1.method1316(); local10 != null; local10 = (Class3_Sub10) Static5.aClass51_1.method1310()) {
			if (local10.aClass3_Sub1_Sub15_1 != null) {
				local10.method1366();
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method1213() {
		aClass5_865 = null;
		aClass5_861 = null;
		aClass5_866 = null;
		aClass5_862 = null;
		aClass5_859 = null;
		aClass5_860 = null;
		aClass5_863 = null;
		aClass5_864 = null;
	}
}
