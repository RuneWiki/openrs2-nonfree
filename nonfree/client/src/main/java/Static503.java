import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "[I")
	public static int[] anIntArray446;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "Lclient!gm;")
	public static final Class122 aClass122_10 = new Class122("", 18);

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "Lclient!il;")
	public static final Class144 aClass144_4 = new Class144();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIBI[I)Z")
	public static boolean method7262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg4 > Static35.anInt884) {
			arg4 = Static35.anInt884;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg4 <= arg0) {
			return true;
		}
		arg3 += arg0 * arg1;
		@Pc(40) int local40 = arg4 - arg0 >> 2;
		arg2 += arg0 - 1;
		@Pc(60) int local60;
		@Pc(71) int local71;
		if (Static502.anInt7204 == 1) {
			Static8.anInt519 += local40;
			while (true) {
				local40--;
				@Pc(92) int local92;
				if (local40 < 0) {
					local40 = arg4 - arg0 & 0x3;
					while (true) {
						local40--;
						if (local40 < 0) {
							return true;
						}
						local92 = ~arg3;
						arg2++;
						if (local92 > ~arg5[arg2]) {
							arg5[arg2] = arg3;
						}
						arg3 += arg1;
					}
				}
				local60 = arg2 + 1;
				if (arg3 < arg5[local60]) {
					arg5[local60] = arg3;
				}
				local71 = arg3 + arg1;
				local60++;
				if (arg5[local60] > local71) {
					arg5[local60] = local71;
				}
				local71 += arg1;
				local92 = ~local71;
				local60++;
				if (local92 > ~arg5[local60]) {
					arg5[local60] = local71;
				}
				local71 += arg1;
				local92 = ~local71;
				arg2 = local60 + 1;
				if (local92 > ~arg5[arg2]) {
					arg5[arg2] = local71;
				}
				arg3 = local71 + arg1;
			}
		} else {
			arg3 -= 38400;
			while (true) {
				local40--;
				if (local40 < 0) {
					local40 = arg4 - arg0 & 0x3;
					while (true) {
						local40--;
						if (local40 < 0) {
							return true;
						}
						arg2++;
						if (arg5[arg2] > arg3) {
							return false;
						}
						arg3 += arg1;
					}
				}
				local60 = arg2 + 1;
				if (arg5[local60] > arg3) {
					return false;
				}
				local71 = arg3 + arg1;
				local60++;
				if (arg5[local60] > local71) {
					return false;
				}
				local71 += arg1;
				local60++;
				if (arg5[local60] > local71) {
					return false;
				}
				local71 += arg1;
				arg2 = local60 + 1;
				if (arg5[arg2] > local71) {
					return false;
				}
				arg3 = local71 + arg1;
			}
		}
	}
}
