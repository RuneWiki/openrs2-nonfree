import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
	public static int anInt5502;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!j;III[Z)V")
	public static void method4368(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static256.aClass70Array2 == Static315.aClass70Array3) {
			return;
		}
		@Pc(9) int local9 = Static60.aClass70Array1[arg1].va(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class70 local22 = Static60.aClass70Array1[local11];
				if (local22 != null) {
					local22.U(arg0, arg2, local9 - local22.va(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZ)Z")
	public static boolean method4369(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
