import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[5][5000];

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_15 = Static193.method3027("Sorry invited players only)3");

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_16 = Static193.method3027("Cabbage");

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_17 = Static193.method3027("; Max)2Age=");

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "Lclient!oc;")
	public static Class70 aClass70_18 = aClass70_15;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIIIIII)V")
	public static void method22(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 - arg0 >= Static119.anInt2428 && arg1 + arg0 <= Static200.anInt4074 && Static26.anInt554 <= arg5 - arg0 && Static52.anInt1117 >= arg0 + arg5) {
			Static175.method2706(arg1, arg4, arg0, arg5, arg3, arg2);
		} else {
			Static7.method106(arg1, arg5, arg0, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public static void method24() {
		Static92.aClass85_20.method2557();
		Static148.aClass94_7.method3157();
		Static124.aClass85_36.method2557();
	}
}
