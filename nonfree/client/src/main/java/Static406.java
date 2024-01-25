import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
	public static int anInt7123;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([Ljava/lang/Object;[IIII)V")
	public static void method5928(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg3) / 2;
		@Pc(24) int local24 = arg3;
		@Pc(28) int local28 = arg1[local22];
		arg1[local22] = arg1[arg2];
		arg1[arg2] = local28;
		@Pc(42) Object local42 = arg0[local22];
		arg0[local22] = arg0[arg2];
		arg0[arg2] = local42;
		@Pc(59) int local59 = local28 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg3; local61 < arg2; local61++) {
			if (arg1[local61] < local28 + (local61 & local59)) {
				@Pc(76) int local76 = arg1[local61];
				arg1[local61] = arg1[local24];
				arg1[local24] = local76;
				@Pc(90) Object local90 = arg0[local61];
				arg0[local61] = arg0[local24];
				arg0[local24++] = local90;
			}
		}
		arg1[arg2] = arg1[local24];
		arg1[local24] = local28;
		arg0[arg2] = arg0[local24];
		arg0[local24] = local42;
		method5928(arg0, arg1, local24 - 1, arg3);
		method5928(arg0, arg1, arg2, local24 + 1);
	}
}
