import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static75 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
	public static int anInt1524;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
	public static int anInt1527 = 0;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
	public static int anInt1529 = 0;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "[J")
	public static long[] aLongArray4 = new long[1000];

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Lclient!hh;")
	public static Class50 aClass50_496 = Static186.method3527("Konfig geladen)3");

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "[I")
	public static int[] anIntArray124 = new int[100];

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)V")
	public static void method1096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= Static131.anInt2713 && arg3 <= Static135.anInt2790 && arg0 >= Static49.anInt1030 && Static177.anInt3701 >= arg2) {
			if (arg5 == 1) {
				Static155.method2574(arg3, arg0, arg1, arg4, arg2);
			} else {
				Static175.method2904(arg3, arg5, arg1, arg4, arg0, arg2);
			}
		} else if (arg5 == 1) {
			Static214.method3345(arg4, arg0, arg1, arg2, arg3);
		} else {
			Static82.method1204(arg0, arg2, arg1, arg4, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public static void method1097() {
		if (Static161.aString6.toLowerCase().indexOf("microsoft") != -1) {
			Static182.anIntArray427[221] = 43;
			Static182.anIntArray427[220] = 74;
			Static182.anIntArray427[219] = 42;
			Static182.anIntArray427[187] = 27;
			Static182.anIntArray427[191] = 73;
			Static182.anIntArray427[190] = 72;
			Static182.anIntArray427[223] = 28;
			Static182.anIntArray427[186] = 57;
			Static182.anIntArray427[188] = 71;
			Static182.anIntArray427[189] = 26;
			Static182.anIntArray427[192] = 58;
			Static182.anIntArray427[222] = 59;
			return;
		}
		Static182.anIntArray427[93] = 43;
		Static182.anIntArray427[92] = 74;
		Static182.anIntArray427[47] = 73;
		Static182.anIntArray427[44] = 71;
		Static182.anIntArray427[61] = 27;
		if (Static161.aMethod2 == null) {
			Static182.anIntArray427[192] = 58;
			Static182.anIntArray427[222] = 59;
		} else {
			Static182.anIntArray427[192] = 28;
			Static182.anIntArray427[520] = 59;
			Static182.anIntArray427[222] = 58;
		}
		Static182.anIntArray427[46] = 72;
		Static182.anIntArray427[45] = 26;
		Static182.anIntArray427[91] = 42;
		Static182.anIntArray427[59] = 57;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
	public static void method1098() {
		Static129.method2047();
		System.gc();
		Static229.method3481(25);
	}
}
