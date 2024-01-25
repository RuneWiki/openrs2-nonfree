import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[B")
	public static byte[] aByteArray97;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIB)I")
	public static int method7617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == arg0) {
			return arg0;
		}
		@Pc(17) int local17 = 128 - arg2;
		@Pc(41) int local41 = local17 * (arg0 & 0x7F) + arg2 * (arg1 & 0x7F) >> 7;
		@Pc(55) int local55 = (arg0 & 0x380) * local17 + (arg1 & 0x380) * arg2 >> 7;
		@Pc(69) int local69 = arg2 * (arg1 & 0xFC00) + (arg0 & 0xFC00) * local17 >> 7;
		return local41 & 0x7F | local69 & 0xFC00 | local55 & 0x380;
	}
}
