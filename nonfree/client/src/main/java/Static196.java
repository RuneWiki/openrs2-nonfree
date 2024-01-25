import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
	public static int anInt3872;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "Lclient!bw;")
	public static Class30 aClass30_2;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Z")
	public static boolean aBoolean301 = true;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II[BIII)V")
	public static void method3201(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg2) {
			return;
		}
		arg3 += arg2;
		@Pc(20) int local20 = arg0 - arg2 >> 2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg0 - arg2 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg1[arg3++] = 1;
				}
			}
			@Pc(25) int local25 = arg3 + 1;
			arg1[arg3] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg1[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg1[local30] = 1;
			arg3 = local35 + 1;
			arg1[local35] = 1;
		}
	}
}
