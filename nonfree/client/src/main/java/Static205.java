import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "Lclient!qu;")
	public static final Class204 aClass204_13 = new Class204(1, 2, 2, 0);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!ba;III[Z)V")
	public static void method3297(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static105.aClass149Array1 == Static277.aClass149Array3) {
			return;
		}
		@Pc(9) int local9 = Static269.aClass149Array2[arg1].a(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class149 local22 = Static269.aClass149Array2[local11];
				if (local22 != null) {
					local22.p(arg0, arg2, local9 - local22.a(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method3298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 + arg6 > arg3 && arg6 < arg3 + arg1) {
			return arg0 < arg7 + arg5 && arg0 + arg4 > arg7;
		} else {
			return false;
		}
	}
}
