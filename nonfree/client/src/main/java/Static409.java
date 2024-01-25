import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!on", name = "c", descriptor = "I")
	public static int anInt6025;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "I")
	public static int anInt6024 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIB[Ljava/lang/Object;[I)V")
	public static void method5113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(22) int local22 = (arg1 + arg0) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg3[local22];
		arg3[local22] = arg3[arg0];
		arg3[arg0] = local28;
		@Pc(42) Object local42 = arg2[local22];
		arg2[local22] = arg2[arg0];
		arg2[arg0] = local42;
		@Pc(59) int local59 = local28 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg1; local61 < arg0; local61++) {
			if ((local59 & local61) + local28 > arg3[local61]) {
				@Pc(76) int local76 = arg3[local61];
				arg3[local61] = arg3[local24];
				arg3[local24] = local76;
				@Pc(90) Object local90 = arg2[local61];
				arg2[local61] = arg2[local24];
				arg2[local24++] = local90;
			}
		}
		arg3[arg0] = arg3[local24];
		arg3[local24] = local28;
		arg2[arg0] = arg2[local24];
		arg2[local24] = local42;
		method5113(local24 - 1, arg1, arg2, arg3);
		method5113(arg0, local24 + 1, arg2, arg3);
	}
}
