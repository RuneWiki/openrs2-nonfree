import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([III[Ljava/lang/Object;I)V")
	public static void method3813(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg1 + arg2) / 2;
		@Pc(20) int local20 = arg2;
		@Pc(24) int local24 = arg0[local18];
		arg0[local18] = arg0[arg1];
		arg0[arg1] = local24;
		@Pc(38) Object local38 = arg3[local18];
		arg3[local18] = arg3[arg1];
		arg3[arg1] = local38;
		@Pc(57) int local57 = ~local24 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg2; local59 < arg1; local59++) {
			if ((local59 & local57) + local24 > arg0[local59]) {
				@Pc(78) int local78 = arg0[local59];
				arg0[local59] = arg0[local20];
				arg0[local20] = local78;
				@Pc(92) Object local92 = arg3[local59];
				arg3[local59] = arg3[local20];
				arg3[local20++] = local92;
			}
		}
		arg0[arg1] = arg0[local20];
		arg0[local20] = local24;
		arg3[arg1] = arg3[local20];
		arg3[local20] = local38;
		method3813(arg0, local20 - 1, arg2, arg3);
		method3813(arg0, arg1, local20 + 1, arg3);
	}
}
