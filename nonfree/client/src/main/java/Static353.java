import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
	public static int anInt6778 = -1;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "([Ljava/lang/Object;III[I)V")
	public static void method5833(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg1) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) int local21 = arg3[local15];
		arg3[local15] = arg3[arg1];
		arg3[arg1] = local21;
		@Pc(35) Object local35 = arg0[local15];
		arg0[local15] = arg0[arg1];
		arg0[arg1] = local35;
		@Pc(54) int local54 = ~local21 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg2; local56 < arg1; local56++) {
			if (arg3[local56] < (local56 & local54) + local21) {
				@Pc(75) int local75 = arg3[local56];
				arg3[local56] = arg3[local17];
				arg3[local17] = local75;
				@Pc(89) Object local89 = arg0[local56];
				arg0[local56] = arg0[local17];
				arg0[local17++] = local89;
			}
		}
		arg3[arg1] = arg3[local17];
		arg3[local17] = local21;
		arg0[arg1] = arg0[local17];
		arg0[local17] = local35;
		method5833(arg0, local17 - 1, arg2, arg3);
		method5833(arg0, arg1, local17 + 1, arg3);
	}
}
