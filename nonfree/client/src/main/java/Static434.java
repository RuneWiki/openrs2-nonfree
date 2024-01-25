import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "[I")
	public static final int[] anIntArray466 = new int[14];

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III[IIIBI)Z")
	public static boolean method6469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg5 > Static161.anInt3354) {
			arg5 = Static161.anInt3354;
		}
		if (arg5 <= arg0) {
			return true;
		}
		arg1 += arg3 * arg0;
		arg4 += arg0 - 1;
		@Pc(57) int local57 = arg5 - arg0 >> 2;
		@Pc(152) int local152;
		@Pc(84) int local84;
		@Pc(68) int local68;
		if (Static54.anInt1441 == 1) {
			Static350.anInt7294 += local57;
			while (true) {
				local57--;
				if (local57 < 0) {
					local57 = arg5 - arg0 & 0x3;
					while (true) {
						local57--;
						if (local57 < 0) {
							return true;
						}
						local152 = ~arg1;
						arg4++;
						if (local152 > ~arg2[arg4]) {
							arg2[arg4] = arg1;
						}
						arg1 += arg3;
					}
				}
				local68 = arg4 + 1;
				if (arg2[local68] > arg1) {
					arg2[local68] = arg1;
				}
				local84 = arg1 + arg3;
				local68++;
				if (local84 < arg2[local68]) {
					arg2[local68] = local84;
				}
				local84 += arg3;
				local68++;
				if (arg2[local68] > local84) {
					arg2[local68] = local84;
				}
				local84 += arg3;
				arg4 = local68 + 1;
				if (arg2[arg4] > local84) {
					arg2[arg4] = local84;
				}
				arg1 = local84 + arg3;
			}
		} else {
			arg1 -= 38400;
			while (true) {
				local57--;
				if (local57 < 0) {
					local57 = arg5 - arg0 & 0x3;
					while (true) {
						local57--;
						if (local57 < 0) {
							return true;
						}
						arg4++;
						if (arg2[arg4] > arg1) {
							return false;
						}
						arg1 += arg3;
					}
				}
				local152 = ~arg1;
				local68 = arg4 + 1;
				if (local152 > ~arg2[local68]) {
					return false;
				}
				local84 = arg1 + arg3;
				local152 = ~local84;
				local68++;
				if (local152 > ~arg2[local68]) {
					return false;
				}
				local84 += arg3;
				local68++;
				if (arg2[local68] > local84) {
					return false;
				}
				local84 += arg3;
				local152 = ~local84;
				arg4 = local68 + 1;
				if (local152 > ~arg2[arg4]) {
					return false;
				}
				arg1 = local84 + arg3;
			}
		}
	}
}
