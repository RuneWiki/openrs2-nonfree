import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "[I")
	public static int[] anIntArray113;

	@OriginalMember(owner = "client!ef", name = "fb", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "Lclient!ic;")
	private static Class34 aClass34_478 = Static56.method816("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ef", name = "X", descriptor = "Lclient!ic;")
	private static Class34 aClass34_479 = Static56.method816(" seconds)3");

	@OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lclient!ic;")
	private static Class34 aClass34_480 = Static56.method816("Loaded update list");

	@OriginalMember(owner = "client!ef", name = "Z", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
	public static int anInt896 = 0;

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "[I")
	public static int[] anIntArray114 = new int[128];

	@OriginalMember(owner = "client!ef", name = "db", descriptor = "Lclient!ic;")
	public static Class34 aClass34_481 = aClass34_480;

	@OriginalMember(owner = "client!ef", name = "hb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_482 = aClass34_479;

	@OriginalMember(owner = "client!ef", name = "jb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_483 = aClass34_478;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
	public static void method548() {
		if (Static112.aClass13_3 != null) {
			Static112.aClass13_3.method1601();
		}
		if (Static96.aClass13_2 != null) {
			Static96.aClass13_2.method1601();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!dd;BLclient!id;Lclient!dd;Lclient!dd;)Z")
	public static boolean method549(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class8_Sub11_Sub1 arg1, @OriginalArg(3) Class14 arg2, @OriginalArg(4) Class14 arg3) {
		Static83.aClass14_21 = arg2;
		Static23.aClass14_6 = arg0;
		Static47.aClass8_Sub11_Sub1_1 = arg1;
		Static17.aClass14_4 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static100.method1458(arg6)) {
			Static78.aClass8_Sub24Array1 = null;
			Static113.method1613(arg7, arg3, -1, arg4, arg5, arg0, arg2, arg1, Static44.aClass8_Sub24ArrayArray1[arg6]);
			if (Static78.aClass8_Sub24Array1 != null) {
				Static113.method1613(arg7, Static105.anInt2400, -1412584499, arg4, arg5, arg0, arg2, Static93.anInt2210, Static78.aClass8_Sub24Array1);
				Static78.aClass8_Sub24Array1 = null;
			}
		} else if (arg2 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static23.aBooleanArray2[local15] = true;
			}
		} else {
			Static23.aBooleanArray2[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
	public static void method551() {
		aClass34_478 = null;
		aClass34_479 = null;
		aClass34_483 = null;
		anIntArray113 = null;
		aClass34_482 = null;
		aClass34_481 = null;
		aClass34_480 = null;
		anIntArray115 = null;
		anIntArray114 = null;
	}
}
