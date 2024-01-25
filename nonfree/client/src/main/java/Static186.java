import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
	public static int anInt3684;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	public static int anInt3690 = 0;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ[I[II)V")
	public static void method3007(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local20;
		@Pc(34) int local34 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local34;
		@Pc(51) int local51 = local20 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg0; local53 < arg3; local53++) {
			if (arg2[local53] < (local51 & local53) + local20) {
				@Pc(72) int local72 = arg2[local53];
				arg2[local53] = arg2[local16];
				arg2[local16] = local72;
				@Pc(86) int local86 = arg1[local53];
				arg1[local53] = arg1[local16];
				arg1[local16++] = local86;
			}
		}
		arg2[arg3] = arg2[local16];
		arg2[local16] = local20;
		arg1[arg3] = arg1[local16];
		arg1[local16] = local34;
		method3007(arg0, arg1, arg2, local16 - 1);
		method3007(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Z")
	public static boolean method3008(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII[B[BIII)V")
	public static void method3012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg2; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg6++;
				arg5[local26] = (byte) (arg5[local26] - arg4[arg0++]);
				@Pc(39) int local39 = arg6++;
				arg5[local39] = (byte) (arg5[local39] - arg4[arg0++]);
				@Pc(52) int local52 = arg6++;
				arg5[local52] = (byte) (arg5[local52] - arg4[arg0++]);
				@Pc(65) int local65 = arg6++;
				arg5[local65] = (byte) (arg5[local65] - arg4[arg0++]);
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local26 = arg6++;
				arg5[local26] = (byte) (arg5[local26] - arg4[arg0++]);
			}
			arg0 += arg3;
			arg6 += arg1;
		}
	}
}
