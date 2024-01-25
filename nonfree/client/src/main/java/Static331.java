import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
	public static int anInt5801;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_128 = new Class200(52, -1);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZII)V")
	public static void method5042(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static31.method728(arg0)) {
			Static77.method1657(arg1, arg3, -1, Static261.aClass303ArrayArray1[arg0], arg2);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([IZIIIIII)Z")
	public static boolean method5044(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 < 0) {
			arg5 = 0;
		}
		if (arg4 > Static317.anInt5596) {
			arg4 = Static317.anInt5596;
		}
		if (arg5 >= arg4) {
			return true;
		}
		@Pc(40) int local40 = arg4 - arg5 >> 2;
		arg1 += arg5 - 1;
		arg2 += arg3 * arg5;
		@Pc(64) int local64;
		@Pc(76) int local76;
		if (Static138.anInt2931 == 1) {
			Static111.anInt2390 += local40;
			while (true) {
				local40--;
				if (local40 < 0) {
					local40 = arg4 - arg5 & 0x3;
					while (true) {
						local40--;
						if (local40 < 0) {
							return true;
						}
						arg1++;
						if (arg0[arg1] > arg2) {
							arg0[arg1] = arg2;
						}
						arg2 += arg3;
					}
				}
				local64 = arg1 + 1;
				if (arg0[local64] > arg2) {
					arg0[local64] = arg2;
				}
				local76 = arg2 + arg3;
				local64++;
				if (arg0[local64] > local76) {
					arg0[local64] = local76;
				}
				local76 += arg3;
				local64++;
				if (local76 < arg0[local64]) {
					arg0[local64] = local76;
				}
				local76 += arg3;
				arg1 = local64 + 1;
				if (arg0[arg1] > local76) {
					arg0[arg1] = local76;
				}
				arg2 = local76 + arg3;
			}
		} else {
			arg2 -= 38400;
			while (true) {
				local40--;
				if (local40 < 0) {
					local40 = arg4 - arg5 & 0x3;
					while (true) {
						local40--;
						if (local40 < 0) {
							return true;
						}
						arg1++;
						if (arg2 < arg0[arg1]) {
							return false;
						}
						arg2 += arg3;
					}
				}
				local64 = arg1 + 1;
				if (arg0[local64] > arg2) {
					return false;
				}
				local76 = arg2 + arg3;
				local64++;
				if (arg0[local64] > local76) {
					return false;
				}
				local76 += arg3;
				local64++;
				if (arg0[local64] > local76) {
					return false;
				}
				local76 += arg3;
				arg1 = local64 + 1;
				if (arg0[arg1] > local76) {
					return false;
				}
				arg2 = local76 + arg3;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)Z")
	public static boolean method5045() {
		return Static352.aBoolean439;
	}
}
