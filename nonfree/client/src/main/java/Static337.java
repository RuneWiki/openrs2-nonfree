import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
	public static int[] anIntArray468;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "[I")
	public static int[] anIntArray470;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray60;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([II)I", line = 184)
	public static int method6060(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(14) int local14 = arg0[local9];
			if (local14 < local3 && local14 > local7) {
				local5 = local9;
				local7 = local14;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "([II)I", line = 209)
	public static int method6061(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(14) int local14 = arg0[local9];
			if (local14 > local3 && local14 < local7) {
				local5 = local9;
				local7 = local14;
			}
		}
		return local5;
	}
}
