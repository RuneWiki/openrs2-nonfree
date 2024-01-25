import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static209 {

	@OriginalMember(owner = "client!nj", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString157 = "Loaded world list data";

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public static void method3651() {
		Static321.anInt6340 = -1;
		Static27.anInt450 = 0;
		Static219.anInt4563 = -1;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg3 == arg2) {
			Static161.method3102(arg3, arg4, arg0, arg1, arg6, arg5);
		} else if (Static338.anInt5369 <= arg0 - arg3 && Static295.anInt5964 >= arg0 + arg3 && arg5 - arg2 >= Static229.anInt4777 && Static165.anInt3366 >= arg5 + arg2) {
			Static72.method1365(arg6, arg0, arg1, arg2, arg4, arg5, arg3);
		} else {
			Static119.method2121(arg1, arg3, arg4, arg6, arg5, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static338.anInt5369 <= arg2 && arg5 <= Static295.anInt5964 && arg4 >= Static229.anInt4777 && arg0 <= Static165.anInt3366) {
			Static83.method1461(arg6, arg0, arg2, arg5, arg3, arg4, arg1);
		} else {
			Static291.method4971(arg5, arg6, arg0, arg4, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)I")
	public static int method3661(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static339.method5545(arg0);
	}
}
