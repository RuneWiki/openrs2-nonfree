import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Lclient!ha;")
	public static Class126 aClass126_12;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "Z")
	public static boolean aBoolean307 = false;

	@OriginalMember(owner = "client!r", name = "B", descriptor = "I")
	public static int anInt3807 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI[IIIIII)Z")
	public static boolean method3408(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (Static536.anInt8903 < arg0) {
			arg0 = Static536.anInt8903;
		}
		if (arg0 <= arg3) {
			return true;
		}
		@Pc(41) int local41 = arg0 - arg3 >> 2;
		arg5 += arg3 - 1;
		arg2 += arg4 * arg3;
		@Pc(79) int local79;
		@Pc(76) int local76;
		@Pc(67) int local67;
		if (Static303.anInt4820 == 1) {
			Static525.anInt8753 += local41;
			while (true) {
				local41--;
				if (local41 < 0) {
					local41 = arg0 - arg3 & 0x3;
					while (true) {
						local41--;
						if (local41 < 0) {
							return true;
						}
						arg5++;
						if (arg1[arg5] > arg2) {
							arg1[arg5] = arg2;
						}
						arg2 += arg4;
					}
				}
				local79 = ~arg2;
				local67 = arg5 + 1;
				if (local79 > ~arg1[local67]) {
					arg1[local67] = arg2;
				}
				local76 = arg2 + arg4;
				local79 = ~local76;
				local67++;
				if (local79 > ~arg1[local67]) {
					arg1[local67] = local76;
				}
				local76 += arg4;
				local67++;
				if (arg1[local67] > local76) {
					arg1[local67] = local76;
				}
				local76 += arg4;
				arg5 = local67 + 1;
				if (local76 < arg1[arg5]) {
					arg1[arg5] = local76;
				}
				arg2 = local76 + arg4;
			}
		} else {
			arg2 -= 38400;
			while (true) {
				local41--;
				if (local41 < 0) {
					local41 = arg0 - arg3 & 0x3;
					while (true) {
						local41--;
						if (local41 < 0) {
							return true;
						}
						arg5++;
						if (arg1[arg5] > arg2) {
							return false;
						}
						arg2 += arg4;
					}
				}
				local67 = arg5 + 1;
				if (arg2 < arg1[local67]) {
					return false;
				}
				local76 = arg2 + arg4;
				local79 = ~local76;
				local67++;
				if (local79 > ~arg1[local67]) {
					return false;
				}
				local76 += arg4;
				local67++;
				if (local76 < arg1[local67]) {
					return false;
				}
				local76 += arg4;
				arg5 = local67 + 1;
				if (arg1[arg5] > local76) {
					return false;
				}
				arg2 = local76 + arg4;
			}
		}
	}
}
