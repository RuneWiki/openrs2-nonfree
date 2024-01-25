import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
	public static int anInt3934;

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "J")
	public static long aLong120 = 0L;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "([IIIII)V")
	public static void method3280(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1--;
		@Pc(7) int local7 = arg3 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (local11 > arg1) {
			@Pc(23) int local23 = arg1 + 1;
			arg0[local23] = arg2;
			@Pc(28) int local28 = local23 + 1;
			arg0[local28] = arg2;
			@Pc(33) int local33 = local28 + 1;
			arg0[local33] = arg2;
			@Pc(38) int local38 = local33 + 1;
			arg0[local38] = arg2;
			@Pc(43) int local43 = local38 + 1;
			arg0[local43] = arg2;
			@Pc(48) int local48 = local43 + 1;
			arg0[local48] = arg2;
			@Pc(53) int local53 = local48 + 1;
			arg0[local53] = arg2;
			arg1 = local53 + 1;
			arg0[arg1] = arg2;
		}
		while (arg1 < local7) {
			arg1++;
			arg0[arg1] = arg2;
		}
	}
}
