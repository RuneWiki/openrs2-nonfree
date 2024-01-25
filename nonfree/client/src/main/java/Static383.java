import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static383 {

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
	public static int anInt6838;

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
	public static int anInt6834 = 0;

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "[I")
	public static final int[] anIntArray469 = new int[5];

	@OriginalMember(owner = "client!tk", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString57 = "";

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg2) {
			Static346.method5187(arg6, arg1, arg3, arg0, arg5, arg4);
		} else if (arg0 - arg6 >= Static165.anInt3313 && arg0 + arg6 <= Static152.anInt3132 && arg5 - arg2 >= Static172.anInt3442 && arg5 + arg2 <= Static324.anInt5590) {
			Static281.method4259(arg1, arg0, arg3, arg4, arg6, arg5, arg2);
		} else {
			Static150.method2598(arg0, arg1, arg6, arg5, arg2, arg4, arg3);
		}
	}
}
