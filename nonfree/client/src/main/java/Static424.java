import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static424 {

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "Lclient!oo;")
	public static Class266 aClass266_4;

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "[I")
	public static final int[] anIntArray378 = new int[13];

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "Z")
	public static boolean aBoolean578 = false;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static39.method9317(arg1)) {
			return;
		}
		if (Static604.aClass357ArrayArray2[arg1] == null) {
			Static85.method1475(Static111.aClass357ArrayArray1[arg1], -1, arg9, arg3, arg10, arg5, arg6, arg0, arg8, arg2, arg7, arg4);
		} else {
			Static85.method1475(Static604.aClass357ArrayArray2[arg1], -1, arg9, arg3, arg10, arg5, arg6, arg0, arg8, arg2, arg7, arg4);
		}
	}
}
