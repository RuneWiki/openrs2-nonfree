import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "D", descriptor = "Lclient!mv;")
	public static Class213 aClass213_9;

	@OriginalMember(owner = "client!aaa", name = "G", descriptor = "I")
	public static int anInt5126;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IILclient!ha;IIIII)V")
	public static void method4203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		arg2.method6123(arg3, arg0, arg1, -10660793, arg4);
		arg2.method6123(arg3 - 2, 16, arg1 + 1, -16777216, arg4 + 1);
		arg2.method6144(arg0 - 19, arg3 - 2, -16777216, arg4 + 1, arg1 + 18);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static314.method5260(arg5, arg1, arg4, 0, arg3, arg0, arg2);
	}
}
