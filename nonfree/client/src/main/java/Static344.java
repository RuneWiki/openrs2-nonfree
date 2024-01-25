import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "[Lclient!daa;")
	public static Class81[] aClass81Array1 = null;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([B[[B[III[I[[BI)I")
	public static int method5205(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2[arg6];
		@Pc(15) int local15 = local9 + arg4[arg6];
		@Pc(19) int local19 = arg2[arg3];
		@Pc(25) int local25 = arg4[arg3] + local19;
		@Pc(33) int local33 = local9;
		if (local9 < local19) {
			local33 = local19;
		}
		@Pc(44) int local44 = local15;
		if (local25 < local15) {
			local44 = local25;
		}
		@Pc(55) int local55 = arg0[arg6] & 0xFF;
		if ((arg0[arg3] & 0xFF) < local55) {
			local55 = arg0[arg3] & 0xFF;
		}
		@Pc(72) byte[] local72 = arg5[arg6];
		@Pc(76) byte[] local76 = arg1[arg3];
		@Pc(81) int local81 = local33 - local9;
		@Pc(86) int local86 = local33 - local19;
		for (@Pc(88) int local88 = local33; local88 < local44; local88++) {
			@Pc(103) int local103 = local72[local81++] + local76[local86++];
			if (local55 > local103) {
				local55 = local103;
			}
		}
		return -local55;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)I")
	public static int method5208() {
		@Pc(24) byte local24;
		if (Static329.anInt5875 >= 96) {
			@Pc(19) int local19 = Static80.method1205();
			if (local19 <= 100) {
				local24 = 4;
				Static206.method2965();
			} else if (local19 <= 500) {
				Static233.method3391();
				local24 = 3;
			} else if (local19 <= 1000) {
				Static356.method5330();
				local24 = 2;
			} else {
				Static601.method8651();
				local24 = 1;
			}
		} else {
			Static601.method8651();
			local24 = 1;
		}
		if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() != 0) {
			Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub10_2);
			Static565.method8890(0, false);
		}
		Static52.method792();
		return local24;
	}
}
