import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_22;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
	public static int anInt2849;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1298 = Static24.method441("(U1");

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Z")
	public static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1299 = Static24.method441("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt2852 = 0;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
	public static int anInt2853 = -1;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method1751() {
		aClass65_1299 = null;
		aClass2_Sub1_Sub4_Sub3_22 = null;
		aClass65_1298 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[BZZ)V")
	public static void method1753(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		if (Static78.aClass14_2 == null) {
			return;
		}
		if (Static27.anInt785 >= 0) {
			Static78.aClass14_2.method1554();
			Static74.aByteArray44 = null;
			Static39.anInt1240 = 20;
			Static110.anInt2937 = 0;
			Static27.anInt785 = -1;
		}
		if (arg1 == null) {
			return;
		}
		if (Static39.anInt1240 > 0) {
			Static78.aClass14_2.method1557(arg0);
			Static39.anInt1240 = 0;
		}
		Static27.anInt785 = arg0;
		Static78.aClass14_2.method1555(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
	public static void method1754() {
		Static80.method1360();
		if (Static85.anInt2457 == 1) {
			Static6.aClass2_Sub1_Sub4_Sub2Array3[Static83.anInt2381 / 100].method486(Static71.anInt2166 - 12, Static19.anInt1890 + -12);
		}
		if (Static85.anInt2457 == 2) {
			Static6.aClass2_Sub1_Sub4_Sub2Array3[Static83.anInt2381 / 100 + 4].method486(Static71.anInt2166 - 12, Static19.anInt1890 + -8 - 4);
		}
		if (Static3.anInt199 != -1) {
			Static61.method1080(Static3.anInt199);
			Static76.method1305(0, 0, -1, 4, Static3.anInt199, 0, 512, 334);
		}
		if (Static98.anInt2770 != -1) {
			Static61.method1080(Static98.anInt2770);
			Static76.method1305(0, 0, -1, 0, Static98.anInt2770, 0, 512, 334);
		}
		Static75.method1297();
		if (!Static51.aBoolean83) {
			Static67.method1209();
			Static95.method1176();
		} else if (Static99.anInt2540 == 0) {
			Static7.method153();
		}
		if (Static1.anInt1 == 1) {
			Static20.aClass2_Sub1_Sub4_Sub2_3.method486(472, 296);
		}
		@Pc(151) int local151;
		if (Static45.aBoolean80) {
			@Pc(109) byte local109 = 20;
			@Pc(113) int local113 = 16776960;
			if (Static76.anInt2213 < 30 && Static4.aBoolean16) {
				local113 = 16711680;
			}
			if (Static76.anInt2213 < 20 && !Static4.aBoolean16) {
				local113 = 16711680;
			}
			Static110.aClass2_Sub1_Sub4_Sub4_3.method1823(Static13.method282(new Class65[] { Static15.aClass65_242, Static93.method1617(Static76.anInt2213) }), 20, local113);
			local113 = 16776960;
			local151 = local109 + 15;
			@Pc(153) Runtime local153 = Runtime.getRuntime();
			@Pc(163) int local163 = (int) ((local153.totalMemory() - local153.freeMemory()) / 1024L);
			if (local163 > 32768 && Static4.aBoolean16) {
				local113 = 16711680;
			}
			if (local163 > 65536 && !Static4.aBoolean16) {
				local113 = 16711680;
			}
			Static110.aClass2_Sub1_Sub4_Sub4_3.method1823(Static13.method282(new Class65[] { Static32.aClass65_463, Static93.method1617(local163), Static46.aClass65_609 }), 35, local113);
			local151 += 15;
			if (Static79.aBoolean119) {
				Static110.aClass2_Sub1_Sub4_Sub4_3.method1823(Static40.aClass65_559, 50, 16711680);
				Static79.aBoolean119 = false;
				local151 += 15;
			}
			if (Static92.aBoolean135) {
				Static110.aClass2_Sub1_Sub4_Sub4_3.method1823(Static96.aClass65_1201, local151, 16711680);
				Static92.aBoolean135 = false;
				local151 += 15;
			}
			if (Static24.aBoolean49) {
				Static110.aClass2_Sub1_Sub4_Sub4_3.method1823(Static46.aClass65_608, local151, 16711680);
				local151 += 15;
				Static24.aBoolean49 = false;
			}
		}
		if (Static33.anInt2359 == 0) {
			return;
		}
		@Pc(243) int local243 = Static33.anInt2359 / 50;
		local151 = local243 / 60;
		@Pc(251) int local251 = local243 % 60;
		if (local251 < 10) {
			Static110.aClass2_Sub1_Sub4_Sub4_3.method1828(Static13.method282(new Class65[] { Static50.aClass65_634, Static93.method1617(local151), Static79.aClass65_1028, Static93.method1617(local251) }), 4, 329, 16776960);
		} else {
			Static110.aClass2_Sub1_Sub4_Sub4_3.method1828(Static13.method282(new Class65[] { Static50.aClass65_634, Static93.method1617(local151), Static13.aClass65_239, Static93.method1617(local251) }), 4, 329, 16776960);
		}
	}
}
