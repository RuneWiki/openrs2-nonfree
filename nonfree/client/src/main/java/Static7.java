import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!b", name = "p", descriptor = "J")
	public static long aLong11;

	@OriginalMember(owner = "client!b", name = "z", descriptor = "I")
	public static int anInt192;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "[B")
	private static byte[] aByteArray1 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
	public static int[] anIntArray16 = new int[25];

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Lclient!wd;")
	public static Class80 aClass80_95 = Static2.method59(" ");

	@OriginalMember(owner = "client!b", name = "E", descriptor = "Lclient!wd;")
	private static Class80 aClass80_100 = Static2.method59("flash3:");

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Lclient!wd;")
	public static Class80 aClass80_96 = aClass80_100;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "I")
	public static int anInt185 = 0;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Lclient!wd;")
	public static Class80 aClass80_97 = Static2.method59("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!b", name = "s", descriptor = "Lclient!wd;")
	public static Class80 aClass80_98 = Static2.method59("Privater Chat");

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Lclient!wd;")
	public static Class80 aClass80_99 = aClass80_100;

	@OriginalMember(owner = "client!b", name = "H", descriptor = "Lclient!wd;")
	public static Class80 aClass80_101 = Static2.method59(" loggt sich ein)3");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)Lclient!ef;")
	public static Class2_Sub1_Sub6 method108(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub6 local10 = (Class2_Sub1_Sub6) Static37.aClass32_22.method887((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static90.aClass11_35.method383(arg0, 5);
		local10 = new Class2_Sub1_Sub6();
		if (local20 != null) {
			local10.method605(new Class2_Sub17(local20));
		}
		Static37.aClass32_22.method880(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!wd;ILclient!wd;Lclient!ff;ZB)V")
	public static void method109(@OriginalArg(0) Class80 arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) Class11 arg2) {
		@Pc(12) int local12 = arg2.method378(arg0);
		@Pc(18) int local18 = arg2.method391(local12, arg1);
		Static55.method712(255, local18, arg2, local12);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public static void method113() {
		aClass80_95 = null;
		aByteArray1 = null;
		aClass80_97 = null;
		aClass80_101 = null;
		aClass80_99 = null;
		aClass80_100 = null;
		anIntArray16 = null;
		aClass80_98 = null;
		aClass80_96 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public static void method115() {
		Static90.method1349();
		if (Static76.anInt1968 == 1) {
			Static105.aClass2_Sub1_Sub9_Sub1Array11[Static65.anInt1848 / 100].method825(Static3.anInt123 - 4 - 8, Static55.anInt1316 - 8 - 4);
		}
		if (Static76.anInt1968 == 2) {
			Static105.aClass2_Sub1_Sub9_Sub1Array11[Static65.anInt1848 / 100 + 4].method825(Static3.anInt123 - 8 - 4, Static55.anInt1316 + -4 + -8);
		}
		if (Static67.anInt1865 != -1) {
			Static51.method892(Static67.anInt1865);
			Static125.method1778(Static67.anInt1865, 512, 4, 334);
		}
		if (Static90.anInt2214 != -1) {
			Static51.method892(Static90.anInt2214);
			Static125.method1778(Static90.anInt2214, 512, 0, 334);
		}
		Static68.method1117();
		if (!Static122.aBoolean241) {
			Static39.method379();
			Static85.method1257();
		} else if (Static11.anInt315 == 0) {
			Static112.method1848();
		}
		if (Static112.anInt2919 == 1) {
			Static8.aClass2_Sub1_Sub9_Sub1_1.method825(472, 296);
		}
		@Pc(140) int local140;
		if (Static2.aBoolean11) {
			@Pc(118) byte local118 = 20;
			Static21.aClass2_Sub1_Sub9_Sub4_12.method1906(Static93.method1444(new Class80[] { Static57.aClass80_618, Static28.method1422(Static57.anInt1741) }), 20, 16776960);
			@Pc(139) Runtime local139 = Runtime.getRuntime();
			local140 = local118 + 15;
			@Pc(142) int local142 = 16776960;
			@Pc(152) int local152 = (int) ((local139.totalMemory() - local139.freeMemory()) / 1024L);
			if (local152 > 32768 && Static18.aBoolean51) {
				local142 = 16711680;
			}
			if (local152 > 65536 && !Static18.aBoolean51) {
				local142 = 16711680;
			}
			Static21.aClass2_Sub1_Sub9_Sub4_12.method1906(Static93.method1444(new Class80[] { Static10.aClass80_137, Static28.method1422(local152), Static90.aClass80_870 }), 35, local142);
			local140 += 15;
			if (Static77.aBoolean145) {
				Static21.aClass2_Sub1_Sub9_Sub4_12.method1906(Static49.aClass80_538, 50, 16711680);
				local140 += 15;
				Static77.aBoolean145 = false;
			}
			if (Static112.aBoolean216) {
				Static21.aClass2_Sub1_Sub9_Sub4_12.method1906(Static35.aClass80_392, local140, 16711680);
				local140 += 15;
				Static112.aBoolean216 = false;
			}
			if (Static17.aBoolean44) {
				Static21.aClass2_Sub1_Sub9_Sub4_12.method1906(Static84.aClass80_809, local140, 16711680);
				Static17.aBoolean44 = false;
				local140 += 15;
			}
		}
		if (Static56.anInt1718 == 0) {
			return;
		}
		@Pc(233) int local233 = Static56.anInt1718 / 50;
		local140 = local233 / 60;
		@Pc(241) int local241 = local233 % 60;
		if (local241 < 10) {
			Static21.aClass2_Sub1_Sub9_Sub4_12.method1925(Static93.method1444(new Class80[] { Static15.aClass80_165, Static28.method1422(local140), Static85.aClass80_825, Static28.method1422(local241) }), 4, 329, 16776960);
		} else {
			Static21.aClass2_Sub1_Sub9_Sub4_12.method1925(Static93.method1444(new Class80[] { Static15.aClass80_165, Static28.method1422(local140), Static40.aClass80_458, Static28.method1422(local241) }), 4, 329, 16776960);
		}
	}
}
