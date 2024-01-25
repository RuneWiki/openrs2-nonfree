import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "F")
	public static float aFloat139;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Z")
	public static boolean aBoolean533 = false;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II[BI[[B[I[[B[I)I")
	public static int method6711(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg6[arg0];
		@Pc(13) int local13 = arg4[arg0] + local7;
		@Pc(17) int local17 = arg6[arg2];
		@Pc(24) int local24 = local17 + arg4[arg2];
		@Pc(26) int local26 = local7;
		if (local7 < local17) {
			local26 = local17;
		}
		@Pc(33) int local33 = local13;
		if (local13 > local24) {
			local33 = local24;
		}
		@Pc(48) int local48 = arg1[arg0] & 0xFF;
		if (local48 > (arg1[arg2] & 0xFF)) {
			local48 = arg1[arg2] & 0xFF;
		}
		@Pc(69) byte[] local69 = arg5[arg0];
		@Pc(73) byte[] local73 = arg3[arg2];
		@Pc(77) int local77 = local26 - local7;
		@Pc(82) int local82 = local26 - local17;
		for (@Pc(84) int local84 = local26; local84 < local33; local84++) {
			@Pc(95) int local95 = local73[local82++] + local69[local77++];
			if (local95 < local48) {
				local48 = local95;
			}
		}
		return -local48;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)I")
	public static int method6712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static478.method7168(arg1 - 1, arg0 - 1) + Static478.method7168(arg1 - 1, arg0 - -1) + Static478.method7168(arg1 + 1, arg0 + -1) + Static478.method7168(arg1 + 1, arg0 + 1);
		@Pc(76) int local76 = Static478.method7168(arg1, arg0 - 1) + Static478.method7168(arg1, arg0 + 1) + Static478.method7168(arg1 + -1, arg0) + Static478.method7168(arg1 + 1, arg0);
		@Pc(81) int local81 = Static478.method7168(arg1, arg0);
		return local81 / 4 + local47 / 16 + local76 / 8;
	}
}
