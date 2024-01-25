import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIBIIIII)Z")
	public static boolean method5000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static381.method5312(arg2, arg6, arg8)) {
			return false;
		}
		@Pc(20) int local20 = Static552.anIntArray558[2];
		@Pc(24) int local24 = Static552.anIntArray558[1];
		@Pc(28) int local28 = Static552.anIntArray558[0];
		if (!Static381.method5312(arg7, arg5, arg0)) {
			return false;
		}
		@Pc(40) int local40 = Static552.anIntArray558[0];
		@Pc(44) int local44 = Static552.anIntArray558[2];
		@Pc(48) int local48 = Static552.anIntArray558[1];
		if (Static381.method5312(arg4, arg3, arg1)) {
			@Pc(60) int local60 = Static552.anIntArray558[0];
			@Pc(64) int local64 = Static552.anIntArray558[1];
			@Pc(68) int local68 = Static552.anIntArray558[2];
			return Static585.method7964(local40, local68, local44, local20, local24, local48, local64, local28, local60);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)Z")
	public static boolean method5003(@OriginalArg(1) int arg0) {
		if (arg0 == 10 || arg0 == 48 || arg0 == 17 || arg0 == 20 || arg0 == 1007) {
			return true;
		} else {
			return arg0 == 50 || arg0 == 1002;
		}
	}
}
