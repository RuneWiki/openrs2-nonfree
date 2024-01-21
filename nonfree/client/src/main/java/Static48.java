import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Lclient!ad;")
	public static Class1_Sub3_Sub1_Sub1 aClass1_Sub3_Sub1_Sub1_2;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
	public static int[] anIntArray196;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "J")
	public static long aLong35 = 0L;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray38 = new int[5][5000];

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	public static int anInt1137 = 1;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!af;")
	private static Class5 aClass5_579 = Static45.method1937("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "Lclient!af;")
	private static Class5 aClass5_582 = Static45.method1937("Connection timed out)3");

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "Lclient!af;")
	public static Class5 aClass5_580 = aClass5_582;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "Lclient!bd;")
	public static Class7 aClass7_4 = new Class7(512);

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "Z")
	public static final boolean aBoolean36 = false;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "Lclient!af;")
	public static Class5 aClass5_581 = aClass5_579;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "Lclient!af;")
	public static Class5 aClass5_583 = Static45.method1937("<col=ffff00>");

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "[I")
	public static int[] anIntArray195 = new int[5];

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "Lclient!gd;")
	public static Class28 aClass28_30 = new Class28(64);

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "Lclient!rd;")
	public static Class1_Sub20 aClass1_Sub20_2 = new Class1_Sub20(new byte[5000]);

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "Lclient!af;")
	private static Class5 aClass5_586 = Static45.method1937("Please remove ");

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "Lclient!af;")
	public static Class5 aClass5_584 = aClass5_586;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "Lclient!af;")
	private static Class5 aClass5_585 = Static45.method1937("Login server offline)3");

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "Lclient!af;")
	public static Class5 aClass5_587 = aClass5_586;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "Lclient!af;")
	public static Class5 aClass5_588 = aClass5_585;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZI)V")
	public static void method837(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static82.anInt2065 != 0 && arg1 != -1) {
			Static21.method528(Static82.anInt2065, 0, arg1, Static120.aClass41_Sub1_14);
			Static18.aBoolean117 = true;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Lclient!af;")
	public static Class5 method838(@OriginalArg(1) int arg0) {
		return Static20.method486(arg0, false);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ac;)V")
	public static void method839(@OriginalArg(1) Class3 arg0) {
		Static9.aClass3_1 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method840() {
		aClass28_30 = null;
		aClass5_581 = null;
		anIntArray195 = null;
		aClass5_580 = null;
		aClass5_586 = null;
		aClass5_582 = null;
		aClass5_584 = null;
		aClass5_583 = null;
		anIntArray196 = null;
		aClass5_585 = null;
		aClass1_Sub3_Sub1_Sub1_2 = null;
		aClass1_Sub20_2 = null;
		aClass5_587 = null;
		anIntArrayArray38 = null;
		aClass5_588 = null;
		aClass7_4 = null;
		aClass5_579 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) Class1_Sub22 local15 = (Class1_Sub22) Static66.aClass53_17.method1442();
		@Pc(17) Class1_Sub22 local17 = null;
		while (local15 != null) {
			if (local15.anInt2730 == arg2 && arg6 == local15.anInt2743 && local15.anInt2722 == arg3 && local15.anInt2725 == arg4) {
				local17 = local15;
				break;
			}
			local15 = (Class1_Sub22) Static66.aClass53_17.method1450();
		}
		if (local17 == null) {
			local17 = new Class1_Sub22();
			local17.anInt2722 = arg3;
			local17.anInt2730 = arg2;
			local17.anInt2725 = arg4;
			local17.anInt2743 = arg6;
			Static100.method1695(local17);
			Static66.aClass53_17.method1449(local17);
		}
		local17.anInt2737 = arg7;
		local17.anInt2742 = arg5;
		local17.anInt2738 = arg0;
		local17.anInt2744 = arg1;
		local17.anInt2727 = arg8;
	}
}
