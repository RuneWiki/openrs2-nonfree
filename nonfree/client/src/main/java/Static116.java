import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ek", name = "S", descriptor = "F")
	public static float aFloat134 = 1.0F;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[I[II)V")
	public static void method2262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(22) int local22 = (arg0 + arg1) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg2[local22];
		arg2[local22] = arg2[arg0];
		arg2[arg0] = local28;
		@Pc(42) int local42 = arg3[local22];
		arg3[local22] = arg3[arg0];
		arg3[arg0] = local42;
		@Pc(59) int local59 = local28 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg1; local61 < arg0; local61++) {
			if (local28 + (local59 & local61) > arg2[local61]) {
				@Pc(80) int local80 = arg2[local61];
				arg2[local61] = arg2[local24];
				arg2[local24] = local80;
				@Pc(94) int local94 = arg3[local61];
				arg3[local61] = arg3[local24];
				arg3[local24++] = local94;
			}
		}
		arg2[arg0] = arg2[local24];
		arg2[local24] = local28;
		arg3[arg0] = arg3[local24];
		arg3[local24] = local42;
		method2262(local24 - 1, arg1, arg2, arg3);
		method2262(arg0, local24 + 1, arg2, arg3);
	}
}
