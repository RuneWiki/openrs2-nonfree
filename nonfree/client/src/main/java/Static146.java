import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
	public static int anInt11237;

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "J")
	public static long aLong304 = 0L;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "()V")
	public static void method9612() {
		Static373.method6358(Static60.anInt1169);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([I[FIIIIIIII[FI[I)V")
	public static void method9617(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11) {
		@Pc(11) int local11 = arg8 * arg2 + arg10;
		@Pc(18) int local18 = arg5 * arg6 + arg7;
		@Pc(23) int local23 = arg8 - arg4;
		@Pc(28) int local28 = arg6 - arg4;
		@Pc(35) int local35;
		@Pc(42) int local42;
		if (arg0 == null) {
			for (local35 = 0; local35 < arg3; local35++) {
				local42 = local11 + arg4;
				while (local11 < local42) {
					arg1[local18++] = arg9[local11++];
				}
				local18 += local28;
				local11 += local23;
			}
		} else if (arg9 == null) {
			for (local35 = 0; local35 < arg3; local35++) {
				local42 = local11 + arg4;
				while (local42 > local11) {
					arg11[local18++] = arg0[local11++];
				}
				local18 += local28;
				local11 += local23;
			}
		} else {
			for (local35 = 0; local35 < arg3; local35++) {
				local42 = arg4 + local11;
				while (local11 < local42) {
					arg11[local18] = arg0[local11];
					arg1[local18++] = arg9[local11++];
				}
				local18 += local28;
				local11 += local23;
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)I")
	public static int method9618(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
