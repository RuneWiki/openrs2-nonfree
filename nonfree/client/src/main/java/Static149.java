import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static149 {

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "[I")
	public static int[] anIntArray431 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!pe", name = "nb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1154 = Static200.method3116("Loading title screen )2 ");

	@OriginalMember(owner = "client!pe", name = "qb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1155 = Static200.method3116("");

	@OriginalMember(owner = "client!pe", name = "tb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1156 = aClass60_1154;

	@OriginalMember(owner = "client!pe", name = "vb", descriptor = "I")
	public static int anInt3339 = 0;

	@OriginalMember(owner = "client!pe", name = "xb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1157 = Static200.method3116("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIZIBIIIIII)Z")
	public static boolean method2551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (Static84.aClass9_Sub4_Sub1_2.anInt3937 == 2) {
			return Static34.method608(arg3, arg8, arg2, arg1, arg0, arg4, arg5, arg7, arg6, arg10, arg9);
		} else if (Static84.aClass9_Sub4_Sub1_2.anInt3937 > 2) {
			return Static70.method1282(arg8, arg5, arg3, arg9, arg2, arg6, arg7, arg4, arg0, arg10, arg1, Static84.aClass9_Sub4_Sub1_2.anInt3937);
		} else {
			return Static35.method622(arg0, arg7, arg6, arg9, arg1, arg5, arg4, arg10, arg3, arg2, arg8);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!ah;)Lclient!kh;")
	public static Class60 method2552(@OriginalArg(1) Class6 arg0) {
		if (Static161.method2696(Static166.method2717(arg0)) == 0) {
			return null;
		} else if (arg0.aClass60_76 == null || arg0.aClass60_76.method1814().method1835() == 0) {
			return Static94.aBoolean118 ? Static196.aClass60_1423 : null;
		} else {
			return arg0.aClass60_76;
		}
	}

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "(I)V")
	public static void method2553() {
		if (Static119.aString2.toLowerCase().indexOf("microsoft") != -1) {
			Static55.anIntArray168[220] = 74;
			Static55.anIntArray168[187] = 27;
			Static55.anIntArray168[186] = 57;
			Static55.anIntArray168[191] = 73;
			Static55.anIntArray168[190] = 72;
			Static55.anIntArray168[219] = 42;
			Static55.anIntArray168[222] = 59;
			Static55.anIntArray168[223] = 28;
			Static55.anIntArray168[188] = 71;
			Static55.anIntArray168[221] = 43;
			Static55.anIntArray168[189] = 26;
			Static55.anIntArray168[192] = 58;
			return;
		}
		Static55.anIntArray168[93] = 43;
		Static55.anIntArray168[92] = 74;
		Static55.anIntArray168[91] = 42;
		Static55.anIntArray168[47] = 73;
		Static55.anIntArray168[45] = 26;
		if (Static119.aMethod1 == null) {
			Static55.anIntArray168[192] = 58;
			Static55.anIntArray168[222] = 59;
		} else {
			Static55.anIntArray168[520] = 59;
			Static55.anIntArray168[192] = 28;
			Static55.anIntArray168[222] = 58;
		}
		Static55.anIntArray168[44] = 71;
		Static55.anIntArray168[46] = 72;
		Static55.anIntArray168[59] = 57;
		Static55.anIntArray168[61] = 27;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)V")
	public static void method2554(@OriginalArg(1) int arg0) {
		if (Static56.anIntArray170 == null || Static56.anIntArray170.length < arg0) {
			Static56.anIntArray170 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!ai;B)[Lclient!r;")
	public static Class73[] method2556(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1) {
		return Static64.method1157(arg1, arg0) ? Static91.method1590() : null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!ai;)V")
	public static void method2557(@OriginalArg(1) Class7 arg0) {
		Static97.aClass7_19 = arg0;
		Static158.anInt3543 = Static97.aClass7_19.method3246(16);
	}
}
