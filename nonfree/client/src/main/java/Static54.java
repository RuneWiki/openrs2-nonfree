import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method1340() {
		@Pc(9) int[] local9 = new int[Static272.aClass121_2.anInt4085];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static272.aClass121_2.anInt4085; local13++) {
			@Pc(22) Class133 local22 = Static272.aClass121_2.method3327(local13);
			if (local22.anInt4444 >= 0 || local22.anInt4408 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static132.anIntArray112 = new int[local11];
		for (@Pc(50) int local50 = 0; local50 < local11; local50++) {
			Static132.anIntArray112[local50] = local9[local50];
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)I")
	public static int method1341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(6) int local6 = arg2;
			arg2 = arg0;
			arg0 = local6;
		}
		@Pc(14) int local14 = arg1 & 0x3;
		if (local14 == 0) {
			return arg3;
		} else if (local14 == 1) {
			return 7 + 1 - arg5 - arg2;
		} else if (local14 == 2) {
			return 7 + 1 - arg3 - arg0;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(FIIIIF[FIIFZII)V")
	public static void method1342(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg7 - arg2;
		@Pc(9) int local9 = arg4 - arg10;
		@Pc(13) int local13 = arg11 - arg3;
		@Pc(38) float local38 = (float) local13 * arg6[0] + arg6[1] * (float) local9 + (float) local5 * arg6[2];
		@Pc(59) float local59 = (float) local9 * arg6[4] + arg6[3] * (float) local13 + arg6[5] * (float) local5;
		@Pc(80) float local80 = (float) local5 * arg6[8] + (float) local9 * arg6[7] + arg6[6] * (float) local13;
		@Pc(99) float local99;
		@Pc(93) float local93;
		if (arg1 == 0) {
			local93 = arg9 + 0.5F - local80;
			local99 = arg5 + local38 + 0.5F;
		} else if (arg1 == 1) {
			local93 = local80 + arg9 + 0.5F;
			local99 = local38 + arg5 + 0.5F;
		} else if (arg1 == 2) {
			local93 = arg0 + 0.5F - local59;
			local99 = arg5 + 0.5F - local38;
		} else if (arg1 == 3) {
			local99 = arg5 + local38 + 0.5F;
			local93 = arg0 + 0.5F - local59;
		} else if (arg1 == 4) {
			local93 = arg0 + 0.5F - local59;
			local99 = local80 + arg9 + 0.5F;
		} else {
			local99 = arg9 + 0.5F - local80;
			local93 = arg0 + 0.5F - local59;
		}
		@Pc(202) float local202;
		if (arg8 == 1) {
			local202 = local99;
			local99 = -local93;
			local93 = local202;
		} else if (arg8 == 2) {
			local99 = -local99;
			local93 = -local93;
		} else if (arg8 == 3) {
			local202 = local99;
			local99 = local93;
			local93 = -local202;
		}
		Static304.aFloat131 = local99;
		Static206.aFloat113 = local93;
	}
}
