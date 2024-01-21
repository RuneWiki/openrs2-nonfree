import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!u", name = "qb", descriptor = "I")
	public static int anInt3577;

	@OriginalMember(owner = "client!u", name = "tb", descriptor = "[Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3[] aClass2_Sub4_Sub3_Sub3Array9;

	@OriginalMember(owner = "client!u", name = "vb", descriptor = "Lclient!bc;")
	public static Class5 aClass5_5;

	@OriginalMember(owner = "client!u", name = "hb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2112 = Static107.method1838("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!u", name = "nb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2113 = aClass28_2112;

	@OriginalMember(owner = "client!u", name = "rb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2114 = Static107.method1838("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!u", name = "sb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2115 = Static107.method1838("Login server offline)3");

	@OriginalMember(owner = "client!u", name = "ub", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2116 = aClass28_2115;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
	public static void method2497() {
		Static108.aClass14_138.method596();
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
	public static void method2498() {
		aClass28_2112 = null;
		Class2_Sub3_Sub28.anIntArray334 = null;
		aClass2_Sub4_Sub3_Sub3Array9 = null;
		aClass28_2116 = null;
		aClass5_5 = null;
		aClass28_2114 = null;
		aClass28_2115 = null;
		aClass28_2113 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)I")
	public static int method2499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class2_Sub4_Sub3_Sub1.anIntArray60[arg2 * 1024 / arg1] >> 1;
		return ((65536 - local16) * arg0 >> 16) + (local16 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(BI)Lclient!gg;")
	public static Class28 method2500(@OriginalArg(1) int arg0) {
		@Pc(17) Class28 local17 = Static158.method2411(arg0);
		for (@Pc(23) int local23 = local17.method1121() - 3; local23 > 0; local23 -= 3) {
			local17 = Static83.method1481(new Class28[] { local17.method1135(0, local23), Static160.aClass28_2058, local17.method1131(local23) });
		}
		if (local17.method1121() > 9) {
			return Static83.method1481(new Class28[] { Static63.aClass28_979, local17.method1135(0, local17.method1121() - 8), Static129.aClass28_1783, Static135.aClass28_1824, local17, Static138.aClass28_1858 });
		} else if (local17.method1121() > 6) {
			return Static83.method1481(new Class28[] { Static77.aClass28_1162, local17.method1135(0, local17.method1121() - 4), Static117.aClass28_1665, Static135.aClass28_1824, local17, Static138.aClass28_1858 });
		} else {
			return Static83.method1481(new Class28[] { Static23.aClass28_494, local17, Static17.aClass28_424 });
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static131.method2109(arg7)) {
			Static135.aClass24Array2 = null;
			Static167.method2620(arg2, Static23.aClass24ArrayArray1[arg7], -1, arg1, arg5, arg4, arg0, arg3, arg6);
			if (Static135.aClass24Array2 != null) {
				Static167.method2620(arg2, Static135.aClass24Array2, -1412584499, arg1, Static107.anInt2616, arg4, arg0, arg3, anInt3577);
				Static135.aClass24Array2 = null;
			}
		} else if (arg3 == -1) {
			for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
				Static123.aBooleanArray17[local17] = true;
			}
		} else {
			Static123.aBooleanArray17[arg3] = true;
		}
	}
}
