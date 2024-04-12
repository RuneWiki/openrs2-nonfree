import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([I[B[IIIIIII)V", line = 185)
	public static void method1323(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				@Pc(21) byte local21 = arg1[arg3++];
				if (local21 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local21 & 0xFF];
				}
				local21 = arg1[arg3++];
				if (local21 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local21 & 0xFF];
				}
				local21 = arg1[arg3++];
				if (local21 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local21 & 0xFF];
				}
				local21 = arg1[arg3++];
				if (local21 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local21 & 0xFF];
				}
			}
			for (@Pc(93) int local93 = local9; local93 < 0; local93++) {
				@Pc(99) byte local99 = arg1[arg3++];
				if (local99 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local99 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}
}
