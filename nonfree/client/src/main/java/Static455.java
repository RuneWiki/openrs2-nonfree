import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static455 {

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "Lclient!la;")
	public static Class196 aClass196_97;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
	public static int anInt8040 = 0;

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
	public static int anInt8041 = 0;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "[I")
	public static final int[] anIntArray500 = new int[] { 3500, 200 };

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIZIIIII)V")
	public static void method6990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static219.method3673(arg5)) {
			return;
		}
		if (Static158.aClass279ArrayArray2[arg5] == null) {
			Static76.method1823(Static92.aClass279ArrayArray1[arg5], -1, arg9, arg8, arg10, arg1, arg7, arg6, arg4, arg0, arg3, arg2);
		} else {
			Static76.method1823(Static158.aClass279ArrayArray2[arg5], -1, arg9, arg8, arg10, arg1, arg7, arg6, arg4, arg0, arg3, arg2);
		}
	}
}
