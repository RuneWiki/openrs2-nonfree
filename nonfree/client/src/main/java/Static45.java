import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static45 {

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array3;

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method610(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		Static435.method4778(arg4, arg1, arg2, arg0, arg3, arg5, 0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (!Static111.method1740(arg2)) {
			return;
		}
		if (Static423.aClass229ArrayArray2[arg2] == null) {
			Static51.method749(Static276.aClass229ArrayArray1[arg2], -1, arg7, arg0, arg4, arg5, arg8, arg1, arg6, arg3);
		} else {
			Static51.method749(Static423.aClass229ArrayArray2[arg2], -1, arg7, arg0, arg4, arg5, arg8, arg1, arg6, arg3);
		}
	}
}
