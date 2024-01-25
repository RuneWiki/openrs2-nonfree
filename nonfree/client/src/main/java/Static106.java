import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZB)Ljava/lang/String;")
	public static String method1791(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static331.method5402(arg1, arg0) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[FI[II[III[FIB)V")
	public static void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) int arg11) {
		@Pc(15) int local15 = arg0 + arg1 * arg6;
		@Pc(21) int local21 = arg8 * arg2 + arg4;
		@Pc(25) int local25 = arg1 - arg11;
		@Pc(29) int local29 = arg8 - arg11;
		@Pc(33) int local33;
		@Pc(39) int local39;
		if (arg7 == null) {
			for (local33 = 0; local33 < arg9; local33++) {
				local39 = arg11 + local15;
				while (local15 < local39) {
					arg3[local21++] = arg10[local15++];
				}
				local15 += local25;
				local21 += local29;
			}
		} else if (arg10 == null) {
			for (local33 = 0; local33 < arg9; local33++) {
				local39 = arg11 + local15;
				while (local15 < local39) {
					arg5[local21++] = arg7[local15++];
				}
				local21 += local29;
				local15 += local25;
			}
		} else {
			for (local33 = 0; local33 < arg9; local33++) {
				local39 = arg11 + local15;
				while (local39 > local15) {
					arg5[local21] = arg7[local15];
					arg3[local21++] = arg10[local15++];
				}
				local21 += local29;
				local15 += local25;
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Lclient!dc;I)Lclient!uh;")
	public static Class335 method1796(@OriginalArg(0) Class3_Sub9 arg0) {
		@Pc(12) int local12 = arg0.method5585();
		return new Class335(local12);
	}
}
