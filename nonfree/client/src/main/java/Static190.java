import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static190 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static348.method5412(arg5)) {
			return;
		}
		if (Static424.aClass220ArrayArray2[arg5] == null) {
			Static68.method1290(Static139.aClass220ArrayArray1[arg5], -1, arg4, arg8, arg6, arg1, arg3, arg0, arg7, arg2);
		} else {
			Static68.method1290(Static424.aClass220ArrayArray2[arg5], -1, arg4, arg8, arg6, arg1, arg3, arg0, arg7, arg2);
		}
	}
}
