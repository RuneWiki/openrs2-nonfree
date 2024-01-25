import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public static void method5534() {
		Static544.anIntArray200 = Static212.method3448(0.4F);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I[II[Ljava/lang/Object;I)V")
	public static void method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg0) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) int local24 = arg1[local18];
		arg1[local18] = arg1[arg3];
		arg1[arg3] = local24;
		@Pc(38) Object local38 = arg2[local18];
		arg2[local18] = arg2[arg3];
		arg2[arg3] = local38;
		@Pc(57) int local57 = ~local24 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg0; local59 < arg3; local59++) {
			if (arg1[local59] < local24 + (local57 & local59)) {
				@Pc(74) int local74 = arg1[local59];
				arg1[local59] = arg1[local20];
				arg1[local20] = local74;
				@Pc(88) Object local88 = arg2[local59];
				arg2[local59] = arg2[local20];
				arg2[local20++] = local88;
			}
		}
		arg1[arg3] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg3] = arg2[local20];
		arg2[local20] = local38;
		method5535(arg0, arg1, arg2, local20 - 1);
		method5535(local20 + 1, arg1, arg2, arg3);
	}
}
