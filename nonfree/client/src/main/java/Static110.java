import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "Lclient!m;")
	public static Class91 aClass91_4;

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "[S")
	public static final short[] aShortArray39 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[5];

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method2276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (!Static291.method4732(arg1)) {
			return;
		}
		if (Static473.aClass198ArrayArray2[arg1] == null) {
			Static67.method1539(Static71.aClass198ArrayArray1[arg1], -1, arg2, arg0, arg7, arg4, arg8, arg5, arg6, arg3);
		} else {
			Static67.method1539(Static473.aClass198ArrayArray2[arg1], -1, arg2, arg0, arg7, arg4, arg8, arg5, arg6, arg3);
		}
	}
}
