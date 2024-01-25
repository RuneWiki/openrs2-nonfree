import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static400 {

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	public static int anInt5902;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	public static int anInt5906;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "I")
	public static int anInt5905 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BII)Z")
	public static boolean method4733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static381.method4854(arg1, arg0) || Static342.method4434(arg1, arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIII)V")
	public static void method4734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static293.anInt4886 <= arg2 - arg3 && arg3 + arg2 <= Static137.anInt2576 && arg0 - arg3 >= Static316.anInt5188 && Static82.anInt1667 >= arg0 + arg3) {
			Static203.method2905(arg4, arg2, arg3, arg5, arg0, arg1);
		} else {
			Static435.method5605(arg0, arg1, arg4, arg3, arg5, arg2);
		}
	}
}
