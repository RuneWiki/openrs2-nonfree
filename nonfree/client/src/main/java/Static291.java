import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Lclient!um;")
	public static Class243 aClass243_159;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method3605(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static370.anInt6047 > 0) {
			local21 = Static333.aByteArrayArray14[--Static370.anInt6047];
			Static333.aByteArrayArray14[Static370.anInt6047] = null;
			return local21;
		} else if (arg0 == 5000 && Static430.anInt7171 > 0) {
			local21 = Static403.aByteArrayArray17[--Static430.anInt7171];
			Static403.aByteArrayArray17[Static430.anInt7171] = null;
			return local21;
		} else if (arg0 == 30000 && Static393.anInt4185 > 0) {
			local21 = Static423.aByteArrayArray21[--Static393.anInt4185];
			Static423.aByteArrayArray21[Static393.anInt4185] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[IBII)V")
	public static void method3606(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(11) int local11 = arg0 - 1;
		@Pc(15) int local15 = local11 - 7;
		while (local15 > arg3) {
			@Pc(19) int local19 = arg3 + 1;
			arg1[local19] = arg2;
			@Pc(24) int local24 = local19 + 1;
			arg1[local24] = arg2;
			@Pc(29) int local29 = local24 + 1;
			arg1[local29] = arg2;
			@Pc(34) int local34 = local29 + 1;
			arg1[local34] = arg2;
			@Pc(39) int local39 = local34 + 1;
			arg1[local39] = arg2;
			@Pc(44) int local44 = local39 + 1;
			arg1[local44] = arg2;
			@Pc(49) int local49 = local44 + 1;
			arg1[local49] = arg2;
			arg3 = local49 + 1;
			arg1[arg3] = arg2;
		}
		while (local11 > arg3) {
			arg3++;
			arg1[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[I[II[[BI[[B[B)I")
	public static int method3607(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(9) int local9 = arg1[arg2];
		@Pc(15) int local15 = arg0[arg2] + local9;
		@Pc(19) int local19 = arg1[arg4];
		@Pc(25) int local25 = arg0[arg4] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local15 > local25) {
			local34 = local25;
		}
		@Pc(45) int local45 = arg6[arg2] & 0xFF;
		if ((arg6[arg4] & 0xFF) < local45) {
			local45 = arg6[arg4] & 0xFF;
		}
		@Pc(62) byte[] local62 = arg5[arg2];
		@Pc(66) byte[] local66 = arg3[arg4];
		@Pc(70) int local70 = local27 - local9;
		@Pc(75) int local75 = local27 - local19;
		for (@Pc(77) int local77 = local27; local77 < local34; local77++) {
			@Pc(89) int local89 = local66[local75++] + local62[local70++];
			if (local45 > local89) {
				local45 = local89;
			}
		}
		return -local45;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
	public static boolean method3608(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static171.method2361(arg0, arg1) | Static322.method3971(arg0, arg1)) & Static75.method1131(arg0, arg1);
	}
}
