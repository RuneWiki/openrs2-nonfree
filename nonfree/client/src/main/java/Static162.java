import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!gn", name = "F", descriptor = "[I")
	public static final int[] anIntArray373 = new int[5];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[J[Ljava/lang/Object;II)V")
	public static void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) long local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) Object local34 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local34;
		@Pc(52) int local52 = local20 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg0; local54 < arg3; local54++) {
			if (local20 + (long) (local52 & local54) > arg1[local54]) {
				@Pc(75) long local75 = arg1[local54];
				arg1[local54] = arg1[local16];
				arg1[local16] = local75;
				@Pc(89) Object local89 = arg2[local54];
				arg2[local54] = arg2[local16];
				arg2[local16++] = local89;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg3] = arg2[local16];
		arg2[local16] = local34;
		method3157(arg0, arg1, arg2, local16 - 1);
		method3157(local16 + 1, arg1, arg2, arg3);
	}
}
