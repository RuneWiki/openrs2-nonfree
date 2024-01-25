import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
	public static int anInt265;

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
	public static int anInt269;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
	public static int anInt267 = 1;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III[IIIIZ)Z")
	public static boolean method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 < 0) {
			arg5 = 0;
		}
		if (arg1 > Static626.anInt10033) {
			arg1 = Static626.anInt10033;
		}
		if (arg1 <= arg5) {
			return true;
		}
		arg2 += arg4 * arg5;
		@Pc(38) int local38 = arg1 - arg5 >> 2;
		arg0 += arg5 - 1;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(72) int local72;
		if (Static188.anInt3093 == 1) {
			Static309.anInt5508 += local38;
			while (true) {
				local38--;
				if (local38 < 0) {
					local38 = arg1 - arg5 & 0x3;
					while (true) {
						local38--;
						if (local38 < 0) {
							return true;
						}
						arg0++;
						if (arg2 < arg3[arg0]) {
							arg3[arg0] = arg2;
						}
						arg2 += arg4;
					}
				}
				local57 = ~arg2;
				local59 = arg0 + 1;
				if (local57 > ~arg3[local59]) {
					arg3[local59] = arg2;
				}
				local72 = arg2 + arg4;
				local59++;
				if (arg3[local59] > local72) {
					arg3[local59] = local72;
				}
				local72 += arg4;
				local57 = ~local72;
				local59++;
				if (local57 > ~arg3[local59]) {
					arg3[local59] = local72;
				}
				local72 += arg4;
				arg0 = local59 + 1;
				if (arg3[arg0] > local72) {
					arg3[arg0] = local72;
				}
				arg2 = local72 + arg4;
			}
		} else {
			arg2 -= 38400;
			while (true) {
				local38--;
				if (local38 < 0) {
					local38 = arg1 - arg5 & 0x3;
					while (true) {
						local38--;
						if (local38 < 0) {
							return true;
						}
						arg0++;
						if (arg3[arg0] > arg2) {
							return false;
						}
						arg2 += arg4;
					}
				}
				local57 = ~arg2;
				local59 = arg0 + 1;
				if (local57 > ~arg3[local59]) {
					return false;
				}
				local72 = arg2 + arg4;
				local59++;
				if (arg3[local59] > local72) {
					return false;
				}
				local72 += arg4;
				local59++;
				if (arg3[local59] > local72) {
					return false;
				}
				local72 += arg4;
				arg0 = local59 + 1;
				if (arg3[arg0] > local72) {
					return false;
				}
				arg2 = local72 + arg4;
			}
		}
	}
}
