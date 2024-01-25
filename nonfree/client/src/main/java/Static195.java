import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "J")
	public static long aLong115;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "[I")
	public static final int[] anIntArray221 = new int[13];

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
	public static int anInt3458 = 0;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "[I")
	public static final int[] anIntArray222 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!i;III[Z)V")
	public static void method2810(@OriginalArg(0) Class1_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static94.aClass157Array1 == Static343.aClass157Array3) {
			return;
		}
		@Pc(9) int local9 = Static330.aClass157Array2[arg1].ca(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class157 local22 = Static330.aClass157Array2[local11];
				if (local22 != null) {
					local22.ba(arg0, arg2, local9 - local22.ca(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
