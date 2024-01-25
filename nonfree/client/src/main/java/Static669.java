import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static669 {

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "J")
	public static long aLong366 = 0L;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIII[B)V")
	public static void method8877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(16) int local16 = arg2 - arg0 >> 2;
		arg1 += arg0;
		while (true) {
			local16--;
			if (local16 < 0) {
				if (arg3 != 12379) {
					method8877(123, -9, 15, 34, (byte[]) null);
				}
				local16 = arg2 - arg0 & 0x3;
				while (true) {
					local16--;
					if (local16 < 0) {
						return;
					}
					arg4[arg1++] = 1;
				}
			}
			@Pc(25) int local25 = arg1 + 1;
			arg4[arg1] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg4[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg4[local30] = 1;
			arg1 = local35 + 1;
			arg4[local35] = 1;
		}
	}
}
