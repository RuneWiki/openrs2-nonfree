import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static348.method5412(arg5)) {
			if (Static424.aClass220ArrayArray2[arg5] == null) {
				Static317.method5109(arg7, arg1, arg3, arg6, -1, arg4, arg0, arg2, Static139.aClass220ArrayArray1[arg5]);
			} else {
				Static317.method5109(arg7, arg1, arg3, arg6, -1, arg4, arg0, arg2, Static424.aClass220ArrayArray2[arg5]);
			}
		} else if (arg0 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				Static345.aBooleanArray24[local14] = true;
			}
		} else {
			Static345.aBooleanArray24[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)I")
	public static int method3013(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)Z")
	public static boolean method3014(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
