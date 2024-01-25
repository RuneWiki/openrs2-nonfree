import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static661 {

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "[[S")
	public static short[][] aShortArrayArray18;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III[IIBII)Z")
	public static boolean method8816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (Static218.anInt3743 < arg0) {
			arg0 = Static218.anInt3743;
		}
		if (arg0 <= arg4) {
			return true;
		}
		arg3 += arg4 - 1;
		arg1 += arg5 * arg4;
		@Pc(49) int local49 = arg0 - arg4 >> 2;
		@Pc(72) int local72;
		@Pc(63) int local63;
		if (Static499.anInt7885 == 1) {
			Static304.anInt5127 += local49;
			while (true) {
				local49--;
				if (local49 < 0) {
					local49 = arg0 - arg4 & 0x3;
					while (true) {
						local49--;
						if (local49 < 0) {
							return true;
						}
						arg3++;
						if (arg1 < arg2[arg3]) {
							arg2[arg3] = arg1;
						}
						arg1 += arg5;
					}
				}
				local63 = arg3 + 1;
				if (arg2[local63] > arg1) {
					arg2[local63] = arg1;
				}
				local72 = arg1 + arg5;
				local63++;
				if (local72 < arg2[local63]) {
					arg2[local63] = local72;
				}
				local72 += arg5;
				local63++;
				if (arg2[local63] > local72) {
					arg2[local63] = local72;
				}
				local72 += arg5;
				arg3 = local63 + 1;
				if (local72 < arg2[arg3]) {
					arg2[arg3] = local72;
				}
				arg1 = local72 + arg5;
			}
		} else {
			arg1 -= 38400;
			while (true) {
				local49--;
				if (local49 < 0) {
					local49 = arg0 - arg4 & 0x3;
					while (true) {
						local49--;
						if (local49 < 0) {
							return true;
						}
						@Pc(130) int local130 = ~arg1;
						arg3++;
						if (local130 > ~arg2[arg3]) {
							return false;
						}
						arg1 += arg5;
					}
				}
				local63 = arg3 + 1;
				if (arg1 < arg2[local63]) {
					return false;
				}
				local72 = arg1 + arg5;
				local63++;
				if (arg2[local63] > local72) {
					return false;
				}
				local72 += arg5;
				local63++;
				if (arg2[local63] > local72) {
					return false;
				}
				local72 += arg5;
				arg3 = local63 + 1;
				if (local72 < arg2[arg3]) {
					return false;
				}
				arg1 = local72 + arg5;
			}
		}
	}
}
