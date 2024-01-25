import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "Lclient!cha;")
	public static final Class55 aClass55_9 = new Class55(7, 5);

	@OriginalMember(owner = "client!ku", name = "s", descriptor = "J")
	public static long aLong140 = 0L;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II[I[I[B[[B[[BI)I")
	public static int method4798(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg1[arg0];
		@Pc(18) int local18 = arg2[arg0] + local12;
		@Pc(22) int local22 = arg1[arg6];
		@Pc(28) int local28 = arg2[arg6] + local22;
		@Pc(30) int local30 = local12;
		if (local22 > local12) {
			local30 = local22;
		}
		@Pc(41) int local41 = local18;
		if (local18 > local28) {
			local41 = local28;
		}
		@Pc(56) int local56 = arg3[arg0] & 0xFF;
		if (local56 > (arg3[arg6] & 0xFF)) {
			local56 = arg3[arg6] & 0xFF;
		}
		@Pc(77) byte[] local77 = arg4[arg0];
		@Pc(81) byte[] local81 = arg5[arg6];
		@Pc(86) int local86 = local30 - local12;
		@Pc(91) int local91 = local30 - local22;
		for (@Pc(93) int local93 = local30; local93 < local41; local93++) {
			@Pc(104) int local104 = local81[local91++] + local77[local86++];
			if (local104 < local56) {
				local56 = local104;
			}
		}
		return -local56;
	}
}
