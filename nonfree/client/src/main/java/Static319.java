import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!kl", name = "I", descriptor = "Lclient!m;")
	public static Class2_Sub1_Sub13 aClass2_Sub1_Sub13_2;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([IIZIIIII)Z")
	public static boolean method5280(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg5 > Static171.anInt3607) {
			arg5 = Static171.anInt3607;
		}
		if (arg5 <= arg1) {
			return true;
		}
		@Pc(38) int local38 = arg5 - arg1 >> 2;
		arg2 += arg4 * arg1;
		arg3 += arg1 - 1;
		@Pc(77) int local77;
		@Pc(63) int local63;
		if (Static507.anInt9029 == 1) {
			Static22.anInt390 += local38;
			while (true) {
				local38--;
				if (local38 < 0) {
					local38 = arg5 - arg1 & 0x3;
					while (true) {
						local38--;
						if (local38 < 0) {
							return true;
						}
						arg3++;
						if (arg2 < arg0[arg3]) {
							arg0[arg3] = arg2;
						}
						arg2 += arg4;
					}
				}
				local63 = arg3 + 1;
				if (arg0[local63] > arg2) {
					arg0[local63] = arg2;
				}
				local77 = arg2 + arg4;
				local63++;
				if (local77 < arg0[local63]) {
					arg0[local63] = local77;
				}
				local77 += arg4;
				local63++;
				if (arg0[local63] > local77) {
					arg0[local63] = local77;
				}
				local77 += arg4;
				arg3 = local63 + 1;
				if (local77 < arg0[arg3]) {
					arg0[arg3] = local77;
				}
				arg2 = local77 + arg4;
			}
		} else {
			arg2 -= 38400;
			while (true) {
				local38--;
				if (local38 < 0) {
					local38 = arg5 - arg1 & 0x3;
					while (true) {
						local38--;
						if (local38 < 0) {
							return true;
						}
						@Pc(135) int local135 = ~arg2;
						arg3++;
						if (local135 > ~arg0[arg3]) {
							return false;
						}
						arg2 += arg4;
					}
				}
				local63 = arg3 + 1;
				if (arg0[local63] > arg2) {
					return false;
				}
				local77 = arg2 + arg4;
				local63++;
				if (local77 < arg0[local63]) {
					return false;
				}
				local77 += arg4;
				local63++;
				if (arg0[local63] > local77) {
					return false;
				}
				local77 += arg4;
				arg3 = local63 + 1;
				if (local77 < arg0[arg3]) {
					return false;
				}
				arg2 = local77 + arg4;
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V")
	public static void method5282(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub1_Sub5 local13 = Static653.method9595(11, (long) arg0);
		local13.method2489();
	}
}
