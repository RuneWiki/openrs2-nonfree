import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
	public static int anInt3403;

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "[I")
	public static int[] anIntArray223 = new int[4];

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BII)Z")
	public static boolean method2851(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IBIII[III)Z")
	public static boolean method2852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg5 < 0) {
			arg5 = 0;
		}
		if (arg1 > Static278.anInt4447) {
			arg1 = Static278.anInt4447;
		}
		if (arg1 <= arg5) {
			return true;
		}
		arg3 += arg0 * arg5;
		arg2 += arg5 - 1;
		@Pc(46) int local46 = arg1 - arg5 >> 2;
		@Pc(62) int local62;
		@Pc(75) int local75;
		if (Static176.anInt3095 == 1) {
			Static29.anInt690 += local46;
			while (true) {
				local46--;
				@Pc(60) int local60;
				if (local46 < 0) {
					local46 = arg1 - arg5 & 0x3;
					while (true) {
						local46--;
						if (local46 < 0) {
							return true;
						}
						local60 = ~arg3;
						arg2++;
						if (local60 > ~arg4[arg2]) {
							arg4[arg2] = arg3;
						}
						arg3 += arg0;
					}
				}
				local60 = ~arg3;
				local62 = arg2 + 1;
				if (local60 > ~arg4[local62]) {
					arg4[local62] = arg3;
				}
				local75 = arg3 + arg0;
				local62++;
				if (arg4[local62] > local75) {
					arg4[local62] = local75;
				}
				local75 += arg0;
				local62++;
				if (local75 < arg4[local62]) {
					arg4[local62] = local75;
				}
				local75 += arg0;
				arg2 = local62 + 1;
				if (arg4[arg2] > local75) {
					arg4[arg2] = local75;
				}
				arg3 = local75 + arg0;
			}
		} else {
			arg3 -= 38400;
			while (true) {
				local46--;
				if (local46 < 0) {
					local46 = arg1 - arg5 & 0x3;
					while (true) {
						local46--;
						if (local46 < 0) {
							return true;
						}
						arg2++;
						if (arg4[arg2] > arg3) {
							return false;
						}
						arg3 += arg0;
					}
				}
				local62 = arg2 + 1;
				if (arg4[local62] > arg3) {
					return false;
				}
				local75 = arg3 + arg0;
				local62++;
				if (arg4[local62] > local75) {
					return false;
				}
				local75 += arg0;
				local62++;
				if (arg4[local62] > local75) {
					return false;
				}
				local75 += arg0;
				arg2 = local62 + 1;
				if (local75 < arg4[arg2]) {
					return false;
				}
				arg3 = local75 + arg0;
			}
		}
	}
}
