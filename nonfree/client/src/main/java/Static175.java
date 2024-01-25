import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!is", name = "h", descriptor = "I")
	public static int anInt3442;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!ia;III[Z)V")
	public static void method3073(@OriginalArg(0) Class4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static389.aClass14Array3 == Static77.aClass14Array1) {
			return;
		}
		@Pc(9) int local9 = Static267.aClass14Array2[arg1].R(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class14 local22 = Static267.aClass14Array2[local11];
				if (local22 != null) {
					local22.ia(arg0, arg2, local9 - local22.R(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
