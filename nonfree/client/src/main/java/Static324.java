import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II[II[I)V")
	public static void method4645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg0) {
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
			if (local28 + (local61 & local59) > arg2[local61]) {
				@Pc(76) int local76 = arg2[local61];
				arg2[local61] = arg2[local24];
				arg2[local24] = local76;
				@Pc(90) int local90 = arg3[local61];
				arg3[local61] = arg3[local24];
				arg3[local24++] = local90;
			}
		}
		arg2[arg0] = arg2[local24];
		arg2[local24] = local28;
		arg3[arg0] = arg3[local24];
		arg3[local24] = local42;
		method4645(local24 - 1, arg1, arg2, arg3);
		method4645(arg0, local24 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IB)I")
	public static int method4646(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(22) int local22 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local22 == 0) {
				return 1;
			}
			if (local22 == 1) {
				return 2;
			}
			if (local22 == 2) {
				return 4;
			}
			if (local22 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local22 == 0) {
				return 16;
			}
			if (local22 == 1) {
				return 32;
			}
			if (local22 == 2) {
				return 64;
			}
			if (local22 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
