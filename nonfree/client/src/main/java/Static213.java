import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static213 {

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "Lclient!ij;")
	public static Class93 aClass93_81;

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_99 = new Class85("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
	public static int anInt4128 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[B)I")
	public static int method3822(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static103.method4835(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
	public static void method3823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg1) {
			Static199.method3520(arg4, arg0, arg3, arg1);
		} else if (Static163.anInt3234 <= arg3 - arg1 && arg1 + arg3 <= Static353.anInt6760 && arg0 - arg2 >= Static75.anInt1447 && arg2 + arg0 <= Static346.anInt6668) {
			Static320.method5554(arg0, arg3, arg2, arg4, arg1);
		} else {
			Static134.method1922(arg1, arg2, arg3, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static92.method1683(arg0)) {
			Static45.method719(Static304.aClass201ArrayArray1[arg0], -1, arg2, arg6, arg3, arg8, arg1, arg7, arg4, arg5);
		}
	}
}
