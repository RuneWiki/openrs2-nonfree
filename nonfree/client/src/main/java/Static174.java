import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[Ljava/lang/Object;[JII)V")
	public static void method2470(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg0) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) long local21 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local21;
		@Pc(35) Object local35 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local35;
		@Pc(53) int local53 = local21 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg3; local55 < arg0; local55++) {
			if (local21 + (long) (local55 & local53) > arg2[local55]) {
				@Pc(73) long local73 = arg2[local55];
				arg2[local55] = arg2[local17];
				arg2[local17] = local73;
				@Pc(87) Object local87 = arg1[local55];
				arg1[local55] = arg1[local17];
				arg1[local17++] = local87;
			}
		}
		arg2[arg0] = arg2[local17];
		arg2[local17] = local21;
		arg1[arg0] = arg1[local17];
		arg1[local17] = local35;
		method2470(local17 - 1, arg1, arg2, arg3);
		method2470(arg0, arg1, arg2, local17 + 1);
	}
}
