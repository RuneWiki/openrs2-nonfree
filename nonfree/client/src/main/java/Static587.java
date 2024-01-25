import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[IBI[I)V")
	public static void method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(23) int local23 = (arg0 + arg2) / 2;
		@Pc(25) int local25 = arg0;
		@Pc(29) int local29 = arg3[local23];
		arg3[local23] = arg3[arg2];
		arg3[arg2] = local29;
		@Pc(43) int local43 = arg1[local23];
		arg1[local23] = arg1[arg2];
		arg1[arg2] = local43;
		@Pc(60) int local60 = local29 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg0; local62 < arg2; local62++) {
			if ((local62 & local60) + local29 > arg3[local62]) {
				@Pc(81) int local81 = arg3[local62];
				arg3[local62] = arg3[local25];
				arg3[local25] = local81;
				@Pc(95) int local95 = arg1[local62];
				arg1[local62] = arg1[local25];
				arg1[local25++] = local95;
			}
		}
		arg3[arg2] = arg3[local25];
		arg3[local25] = local29;
		arg1[arg2] = arg1[local25];
		arg1[local25] = local43;
		method7952(arg0, arg1, local25 - 1, arg3);
		method7952(local25 + 1, arg1, arg2, arg3);
	}
}
