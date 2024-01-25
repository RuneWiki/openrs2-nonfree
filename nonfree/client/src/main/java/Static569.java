import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "Lclient!la;")
	public static Class54 aClass54_9;

	@OriginalMember(owner = "client!vv", name = "l", descriptor = "Lclient!rn;")
	public static Class3_Sub43 aClass3_Sub43_2;

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
	public static int anInt3538 = 0;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I[[BB[B[I[[BI[I)I")
	public static int method3160(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(14) int local14 = arg3[arg5];
		@Pc(20) int local20 = arg6[arg5] + local14;
		@Pc(24) int local24 = arg3[arg0];
		@Pc(31) int local31 = local24 + arg6[arg0];
		@Pc(33) int local33 = local14;
		if (local14 < local24) {
			local33 = local24;
		}
		@Pc(40) int local40 = local20;
		if (local20 > local31) {
			local40 = local31;
		}
		@Pc(55) int local55 = arg2[arg5] & 0xFF;
		if (local55 > (arg2[arg0] & 0xFF)) {
			local55 = arg2[arg0] & 0xFF;
		}
		@Pc(76) byte[] local76 = arg4[arg5];
		@Pc(80) byte[] local80 = arg1[arg0];
		@Pc(85) int local85 = local33 - local14;
		@Pc(90) int local90 = local33 - local24;
		for (@Pc(92) int local92 = local33; local92 < local40; local92++) {
			@Pc(104) int local104 = local80[local90++] + local76[local85++];
			if (local104 < local55) {
				local55 = local104;
			}
		}
		return -local55;
	}
}
