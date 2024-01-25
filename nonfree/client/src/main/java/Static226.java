import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!jba", name = "j", descriptor = "I")
	public static int anInt5120;

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "[I")
	public static final int[] anIntArray321 = new int[50];

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([BB[II[[BI[[B[I)I")
	public static int method4331(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg1[arg2];
		@Pc(15) int local15 = arg6[arg2] + local9;
		@Pc(19) int local19 = arg1[arg4];
		@Pc(25) int local25 = arg6[arg4] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(47) int local47 = local15;
		if (local25 < local15) {
			local47 = local25;
		}
		@Pc(62) int local62 = arg0[arg2] & 0xFF;
		if ((arg0[arg4] & 0xFF) < local62) {
			local62 = arg0[arg4] & 0xFF;
		}
		@Pc(83) byte[] local83 = arg5[arg2];
		@Pc(87) byte[] local87 = arg3[arg4];
		@Pc(91) int local91 = local27 - local9;
		@Pc(96) int local96 = local27 - local19;
		for (@Pc(98) int local98 = local27; local98 < local47; local98++) {
			@Pc(111) int local111 = local83[local91++] + local87[local96++];
			if (local111 < local62) {
				local62 = local111;
			}
		}
		return -local62;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method4332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg0 + 8 - 1) / 8);
		@Pc(53) int local53 = -((arg4 + 8 - 1) / 8);
		for (@Pc(55) int local55 = local32; local55 < 0; local55++) {
			for (@Pc(59) int local59 = local53; local59 < 0; local59++) {
				if (arg2[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local19;
			if (arg2[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg1;
		}
		return false;
	}
}
