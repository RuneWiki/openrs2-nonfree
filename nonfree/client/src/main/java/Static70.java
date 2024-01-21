import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	public static int anInt2008;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Lclient!sd;")
	public static Class29 aClass29_46;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "[I")
	public static int[] anIntArray297 = new int[32768];

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!na;")
	public static Class5_Sub9_Sub1 aClass5_Sub9_Sub1_3 = new Class5_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!me", name = "s", descriptor = "Lclient!mb;")
	private static Class45 aClass45_849 = Static63.method1251("Please reload this page)3");

	@OriginalMember(owner = "client!me", name = "t", descriptor = "Lclient!mb;")
	public static Class45 aClass45_850 = Static63.method1251("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Lclient!mb;")
	public static Class45 aClass45_851 = aClass45_849;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "I")
	public static int anInt2022 = 0;

	@OriginalMember(owner = "client!me", name = "D", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array1 = new Class2[16];

	@OriginalMember(owner = "client!me", name = "E", descriptor = "I")
	public static int anInt2023 = 0;

	@OriginalMember(owner = "client!me", name = "J", descriptor = "I")
	public static int anInt2028 = 2;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)V")
	public static void method1356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class5_Sub2_Sub16 local12 = Static101.method752(arg1);
		@Pc(15) int local15 = local12.anInt3009;
		@Pc(18) int local18 = local12.anInt3006;
		@Pc(21) int local21 = local12.anInt3012;
		@Pc(28) int local28 = Class40.anIntArray276[local18 - local21];
		if (arg0 < 0 || arg0 > local28) {
			arg0 = 0;
		}
		local28 <<= local21;
		Static117.anIntArray483[local15] = ~local28 & Static117.anIntArray483[local15] | arg0 << local21 & local28;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public static void method1357() {
		Static81.method1517();
		Static69.method1349();
		Static28.method624();
		Static119.method2134();
		Static38.method796();
		Static47.method980();
		Static64.method1258();
		Static40.method866();
		Static68.method1300();
		Static80.method1510();
		Static12.method2137();
		Static121.method1618();
		((Class57) Static86.anInterface2_1).method1679();
		Static16.aClass67_4.method1819();
		Static63.aClass29_Sub1_27.method744();
		Static105.aClass29_Sub1_45.method744();
		Static48.aClass29_Sub1_22.method744();
		Static100.aClass29_Sub1_43.method744();
		Static46.aClass29_Sub1_17.method744();
		Static21.aClass29_Sub1_11.method744();
		Static1.aClass29_Sub1_1.method744();
		Static112.aClass29_Sub1_48.method744();
		Static6.aClass29_Sub1_4.method744();
		Static36.aClass29_Sub1_15.method744();
		Static77.aClass29_Sub1_33.method744();
		Static71.aClass29_Sub1_32.method744();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method1358() {
		aClass45_851 = null;
		aClass29_46 = null;
		aClass45_850 = null;
		aClass2Array1 = null;
		aClass45_849 = null;
		anIntArray297 = null;
		aClass5_Sub9_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)Lclient!mb;")
	public static Class45 method1359(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static60.aClass45_715;
		} else if (local8 < -6) {
			return Static59.aClass45_713;
		} else if (local8 < -3) {
			return Static99.aClass45_1145;
		} else if (local8 < 0) {
			return Static106.aClass45_1219;
		} else if (local8 > 9) {
			return Static90.aClass45_1055;
		} else if (local8 > 6) {
			return Static120.aClass45_1362;
		} else if (local8 > 3) {
			return Static23.aClass45_376;
		} else if (local8 > 0) {
			return Static42.aClass45_397;
		} else {
			return Static79.aClass45_946;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZIZIZ)Lclient!ge;")
	public static Class29_Sub1 method1360(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) Class68 local1 = null;
		if (Static59.aClass2_2 != null) {
			local1 = new Class68(arg1, Static59.aClass2_2, aClass2Array1[arg1], 1000000);
		}
		return new Class29_Sub1(local1, Static76.aClass68_4, arg1, arg2, arg0, arg3);
	}
}
