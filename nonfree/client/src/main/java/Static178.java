import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static178 {

	@OriginalMember(owner = "client!fw", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!fw", name = "t", descriptor = "I")
	public static int anInt2910;

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "Z")
	public static boolean aBoolean203 = false;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IB)Z")
	public static boolean method2625(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method2631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg0) {
			Static108.method1770(arg4, arg1, arg6, arg0, arg5, arg2);
		} else if (Static468.anInt7895 <= arg1 - arg0 && Static382.anInt6719 >= arg0 + arg1 && arg6 - arg3 >= Static410.anInt7068 && arg6 + arg3 <= Static281.anInt5188) {
			Static641.method8993(arg2, arg5, arg0, arg6, arg4, arg3, arg1);
		} else {
			Static187.method2755(arg6, arg0, arg5, arg2, arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(JI)I")
	public static int method2632(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}
}
