import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
	public static int anInt5055 = -1;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "Lclient!gr;")
	public static final Class95 aClass95_10 = new Class95(5, 3);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II[I[I[B[[BI[[B)I")
	public static int method3874(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(7) int local7 = arg1[arg0];
		@Pc(13) int local13 = local7 + arg2[arg0];
		@Pc(17) int local17 = arg1[arg5];
		@Pc(23) int local23 = arg2[arg5] + local17;
		@Pc(25) int local25 = local7;
		if (local17 > local7) {
			local25 = local17;
		}
		@Pc(36) int local36 = local13;
		if (local13 > local23) {
			local36 = local23;
		}
		@Pc(47) int local47 = arg3[arg0] & 0xFF;
		if ((arg3[arg5] & 0xFF) < local47) {
			local47 = arg3[arg5] & 0xFF;
		}
		@Pc(73) byte[] local73 = arg4[arg0];
		@Pc(77) byte[] local77 = arg6[arg5];
		@Pc(82) int local82 = local25 - local7;
		@Pc(86) int local86 = local25 - local17;
		for (@Pc(88) int local88 = local25; local88 < local36; local88++) {
			@Pc(100) int local100 = local73[local82++] + local77[local86++];
			if (local47 > local100) {
				local47 = local100;
			}
		}
		return -local47;
	}
}
