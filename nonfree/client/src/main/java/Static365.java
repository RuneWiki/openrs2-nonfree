import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!s", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)I")
	public static int method4720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static35.anInt4183 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(18) int local18 = arg2 - Static98.anInt3332;
		@Pc(23) int local23 = arg1 - Static98.anInt3328;
		for (@Pc(28) Class5_Sub8 local28 = (Class5_Sub8) Static98.aClass177_19.method3618(); local28 != null; local28 = (Class5_Sub8) Static98.aClass177_19.method3619()) {
			if (local28.anInt953 == arg0) {
				@Pc(42) int local42 = local28.anInt948;
				@Pc(45) int local45 = local28.anInt943;
				@Pc(56) int local56 = local45 + Static98.anInt3328 | local42 - -Static98.anInt3332 << 14;
				@Pc(75) int local75 = (local18 - local42) * (-local42 + local18) + (local23 - local45) * (local23 - local45);
				if (local12 < 0 || local75 < local14) {
					local14 = local75;
					local12 = local56;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[II[IB)V")
	public static void method4723(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg2) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local20;
		@Pc(34) int local34 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg0; local55 < arg2; local55++) {
			if (arg3[local55] < (local53 & local55) + local20) {
				@Pc(74) int local74 = arg3[local55];
				arg3[local55] = arg3[local16];
				arg3[local16] = local74;
				@Pc(88) int local88 = arg1[local55];
				arg1[local55] = arg1[local16];
				arg1[local16++] = local88;
			}
		}
		arg3[arg2] = arg3[local16];
		arg3[local16] = local20;
		arg1[arg2] = arg1[local16];
		arg1[local16] = local34;
		method4723(arg0, arg1, local16 - 1, arg3);
		method4723(local16 + 1, arg1, arg2, arg3);
	}
}
