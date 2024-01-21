import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!te", name = "o", descriptor = "Lclient!of;")
	public static Class1_Sub17 aClass1_Sub17_74;

	@OriginalMember(owner = "client!te", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray87;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "I")
	public static int anInt3219;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!gd;")
	public static Class28 aClass28_86 = new Class28(64);

	@OriginalMember(owner = "client!te", name = "q", descriptor = "Lclient!af;")
	private static Class5 aClass5_1426 = Static45.method1937("Please try again)3");

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_1424 = aClass5_1426;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "Lclient!af;")
	private static Class5 aClass5_1425 = Static45.method1937("Malformed login packet)3");

	@OriginalMember(owner = "client!te", name = "p", descriptor = "[I")
	public static int[] anIntArray458 = new int[200];

	@OriginalMember(owner = "client!te", name = "r", descriptor = "Lclient!af;")
	public static Class5 aClass5_1427 = aClass5_1425;

	@OriginalMember(owner = "client!te", name = "s", descriptor = "[I")
	public static int[] anIntArray459 = new int[25];

	@OriginalMember(owner = "client!te", name = "t", descriptor = "Lclient!af;")
	public static Class5 aClass5_1428 = Static45.method1937("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!te", name = "v", descriptor = "Lclient!af;")
	private static Class5 aClass5_1429 = Static45.method1937("Username: ");

	@OriginalMember(owner = "client!te", name = "x", descriptor = "I")
	public static volatile int anInt3220 = 0;

	@OriginalMember(owner = "client!te", name = "y", descriptor = "Lclient!af;")
	public static Class5 aClass5_1430 = aClass5_1429;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZIIIII)V")
	public static void method2221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static8.method244(arg3)) {
			Static68.method1205(arg2, arg5, -1, Static49.aClass1_Sub17ArrayArray1[arg3], arg1, arg4, arg0, arg6);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLclient!kb;IILclient!af;Lclient!af;)V")
	public static void method2222(@OriginalArg(1) Class41 arg0, @OriginalArg(4) Class5 arg1, @OriginalArg(5) Class5 arg2) {
		@Pc(16) int local16 = arg0.method1724(arg1);
		@Pc(22) int local22 = arg0.method1698(arg2, local16);
		Static21.method528(255, local22, local16, arg0);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z")
	public static boolean method2223(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)V")
	public static void method2224(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static8.method244(arg0)) {
			return;
		}
		@Pc(26) Class1_Sub17[] local26 = Static49.aClass1_Sub17ArrayArray1[arg0];
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Class1_Sub17 local34 = local26[local28];
			if (local34.anObjectArray12 != null) {
				@Pc(41) Class1_Sub6 local41 = new Class1_Sub6();
				local41.anObjectArray1 = local34.anObjectArray12;
				local41.aClass1_Sub17_26 = local34;
				Static71.method1228(local41);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
	public static void method2225() {
		anIntArray458 = null;
		aClass5_1426 = null;
		aClass5_1428 = null;
		aClass5_1427 = null;
		aClass5_1425 = null;
		aClass28_86 = null;
		aClass5_1429 = null;
		aClass1_Sub17_74 = null;
		anIntArray459 = null;
		aClass5_1424 = null;
		anIntArrayArray87 = null;
		aClass5_1430 = null;
	}
}
