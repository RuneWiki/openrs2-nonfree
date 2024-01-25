import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static470 {

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "Z")
	public static boolean aBoolean53;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
	public static void method897() {
		Static210.anInt4254 = -1;
		Static113.anInt2183 = 0;
		Static530.anInt8828 = -1;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!Static508.method7071(arg5)) {
			return;
		}
		if (Static131.aClass292ArrayArray2[arg5] == null) {
			Static67.method1355(Static14.aClass292ArrayArray1[arg5], -1, arg2, arg1, arg7, arg3, arg0, arg4, arg8, arg6);
		} else {
			Static67.method1355(Static131.aClass292ArrayArray2[arg5], -1, arg2, arg1, arg7, arg3, arg0, arg4, arg8, arg6);
		}
	}
}
