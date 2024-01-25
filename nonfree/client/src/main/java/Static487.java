import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Z")
	public static boolean aBoolean691;

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
	public static int anInt8173;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "D")
	public static double aDouble20;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[II[J)V")
	public static void method6994(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg0) / 2;
		@Pc(24) int local24 = arg0;
		@Pc(28) long local28 = arg3[local22];
		arg3[local22] = arg3[arg2];
		arg3[arg2] = local28;
		@Pc(42) int local42 = arg1[local22];
		arg1[local22] = arg1[arg2];
		arg1[arg2] = local42;
		@Pc(62) int local62 = ~local28 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(64) int local64 = arg0; local64 < arg2; local64++) {
			if (local28 + (long) (local62 & local64) > arg3[local64]) {
				@Pc(85) long local85 = arg3[local64];
				arg3[local64] = arg3[local24];
				arg3[local24] = local85;
				@Pc(99) int local99 = arg1[local64];
				arg1[local64] = arg1[local24];
				arg1[local24++] = local99;
			}
		}
		arg3[arg2] = arg3[local24];
		arg3[local24] = local28;
		arg1[arg2] = arg1[local24];
		arg1[local24] = local42;
		method6994(arg0, arg1, local24 - 1, arg3);
		method6994(local24 + 1, arg1, arg2, arg3);
	}
}
