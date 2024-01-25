import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
	public static int anInt4348 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II[Ljava/lang/Object;[II)V")
	public static void method3524(@OriginalArg(0) int arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg0) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) int local24 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local24;
		@Pc(38) Object local38 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local38;
		@Pc(55) int local55 = local24 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg3; local57 < arg0; local57++) {
			if (local24 + (local55 & local57) > arg2[local57]) {
				@Pc(73) int local73 = arg2[local57];
				arg2[local57] = arg2[local20];
				arg2[local20] = local73;
				@Pc(87) Object local87 = arg1[local57];
				arg1[local57] = arg1[local20];
				arg1[local20++] = local87;
			}
		}
		arg2[arg0] = arg2[local20];
		arg2[local20] = local24;
		arg1[arg0] = arg1[local20];
		arg1[local20] = local38;
		method3524(local20 - 1, arg1, arg2, arg3);
		method3524(arg0, arg1, arg2, local20 + 1);
	}
}
