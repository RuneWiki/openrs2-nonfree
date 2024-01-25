import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "Lclient!oja;")
	public static Class256 aClass256_6;

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_86 = new Class218(52, 15);

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "Lclient!sw;")
	public static final Class327 aClass327_14 = new Class327(3);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I[IIIIIII)Z")
	public static boolean method5253(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (Static39.anInt907 < arg5) {
			arg5 = Static39.anInt907;
		}
		if (arg5 <= arg4) {
			return true;
		}
		arg2 += arg4 - 1;
		@Pc(45) int local45 = arg5 - arg4 >> 2;
		arg3 += arg4 * arg0;
		@Pc(77) int local77;
		@Pc(64) int local64;
		@Pc(74) int local74;
		if (Static15.anInt8490 == 1) {
			Static293.anInt4968 += local45;
			while (true) {
				local45--;
				if (local45 < 0) {
					local45 = arg5 - arg4 & 0x3;
					while (true) {
						local45--;
						if (local45 < 0) {
							return true;
						}
						arg2++;
						if (arg1[arg2] > arg3) {
							arg1[arg2] = arg3;
						}
						arg3 += arg0;
					}
				}
				local64 = arg2 + 1;
				if (arg1[local64] > arg3) {
					arg1[local64] = arg3;
				}
				local74 = arg3 + arg0;
				local64++;
				if (arg1[local64] > local74) {
					arg1[local64] = local74;
				}
				local74 += arg0;
				local77 = ~local74;
				local64++;
				if (local77 > ~arg1[local64]) {
					arg1[local64] = local74;
				}
				local74 += arg0;
				arg2 = local64 + 1;
				if (arg1[arg2] > local74) {
					arg1[arg2] = local74;
				}
				arg3 = local74 + arg0;
			}
		} else {
			arg3 -= 38400;
			while (true) {
				local45--;
				if (local45 < 0) {
					local45 = arg5 - arg4 & 0x3;
					while (true) {
						local45--;
						if (local45 < 0) {
							return true;
						}
						arg2++;
						if (arg1[arg2] > arg3) {
							return false;
						}
						arg3 += arg0;
					}
				}
				local64 = arg2 + 1;
				if (arg1[local64] > arg3) {
					return false;
				}
				local74 = arg3 + arg0;
				local77 = ~local74;
				local64++;
				if (local77 > ~arg1[local64]) {
					return false;
				}
				local74 += arg0;
				local64++;
				if (arg1[local64] > local74) {
					return false;
				}
				local74 += arg0;
				arg2 = local64 + 1;
				if (arg1[arg2] > local74) {
					return false;
				}
				arg3 = local74 + arg0;
			}
		}
	}
}
