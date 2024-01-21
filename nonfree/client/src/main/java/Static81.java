import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!nc", name = "ub", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!nc", name = "zb", descriptor = "Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3 aClass1_Sub3_Sub1_Sub3_4;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "Lclient!af;")
	public static Class5 aClass5_1005 = Static45.method1937("title)3jpg");

	@OriginalMember(owner = "client!nc", name = "db", descriptor = "Lclient!gd;")
	public static Class28 aClass28_56 = new Class28(64);

	@OriginalMember(owner = "client!nc", name = "vb", descriptor = "Lclient!af;")
	private static Class5 aClass5_1008 = Static45.method1937("Unable to connect)3");

	@OriginalMember(owner = "client!nc", name = "sb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1006 = aClass5_1008;

	@OriginalMember(owner = "client!nc", name = "tb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1007 = Static45.method1937("(Z");

	@OriginalMember(owner = "client!nc", name = "xb", descriptor = "Z")
	public static boolean aBoolean69 = true;

	@OriginalMember(owner = "client!nc", name = "yb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1009 = aClass5_1008;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)V")
	public static void method1431() {
		@Pc(5) Class18 local5 = Static93.aClass18_1;
		synchronized (Static93.aClass18_1) {
			Static85.anInt2157 = Static19.anInt648;
			Static98.anInt2407 = Static77.anInt1808;
			Static97.anInt2395 = Static46.anInt1123;
			Static12.anInt3243 = Static121.anInt3117;
			Static9.anInt280 = Static68.anInt1579;
			Static97.anInt2390 = Static75.anInt1751;
			Static1.aLong5 = Static23.aLong24;
			Static121.anInt3117 = 0;
		}
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)V")
	public static void method1432() {
		@Pc(9) int local9 = Static25.aClass1_Sub3_Sub1_Sub1_1.method154(Static23.aClass5_343);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static18.anInt3043; local11++) {
			local19 = Static25.aClass1_Sub3_Sub1_Sub1_1.method154(Static72.method1233(local11));
			if (local9 < local19) {
				local9 = local19;
			}
		}
		Static49.anInt1182 = Static18.anInt3043 * 15 + 22;
		local19 = Static18.anInt3043 * 15 + 21;
		local9 += 8;
		Static69.aBoolean48 = true;
		@Pc(57) int local57 = Static9.anInt280 - local9 / 2;
		Static27.anInt840 = local9;
		if (local57 + local9 > 765) {
			local57 = 765 - local9;
		}
		if (local57 < 0) {
			local57 = 0;
		}
		Static24.anInt761 = local57;
		@Pc(76) int local76 = Static97.anInt2390;
		if (local76 + local19 > 503) {
			local76 = 503 - local19;
		}
		if (local76 < 0) {
			local76 = 0;
		}
		Static17.anInt514 = local76;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Z")
	public static boolean method1433(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(21) int local21 = Static124.anIntArray455[arg0];
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		return local21 == 1004;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)Lclient!df;")
	public static Class1_Sub5 method1435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub5 local7 = new Class1_Sub5();
		local7.anInt862 = arg2;
		local7.anInt863 = arg0;
		Static66.aClass7_14.method291(local7, (long) arg1);
		Static27.method589(arg2);
		Static117.method2224(arg2);
		@Pc(36) Class1_Sub17 local36 = Static36.method680(arg1);
		if (local36 != null) {
			Static119.method2161(local36);
		}
		if (Static11.aClass1_Sub17_14 != null) {
			Static119.method2161(Static11.aClass1_Sub17_14);
			Static11.aClass1_Sub17_14 = null;
		}
		Static69.aBoolean48 = false;
		Static18.anInt3043 = 0;
		Static98.method1648(Static24.anInt761, Static17.anInt514, Static27.anInt840, Static49.anInt1182);
		return local7;
	}

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "(B)V")
	public static void method1436() {
		aClass5_1008 = null;
		aClass1_Sub3_Sub1_Sub3_4 = null;
		aClass5_1005 = null;
		aByteArrayArray8 = null;
		aClass5_1007 = null;
		aClass5_1009 = null;
		aClass5_1006 = null;
		aClass28_56 = null;
	}
}
