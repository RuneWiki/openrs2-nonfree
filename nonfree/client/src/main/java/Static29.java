import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!b", name = "y", descriptor = "I")
	public static int anInt572;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_9 = new Class181(53, 4);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(JJ)J")
	public static long method573(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B[IBI[[B[[B[I)I")
	public static int method575(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg2[arg3];
		@Pc(15) int local15 = arg6[arg3] + local9;
		@Pc(19) int local19 = arg2[arg0];
		@Pc(25) int local25 = local19 + arg6[arg0];
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local25 < local15) {
			local38 = local25;
		}
		@Pc(53) int local53 = arg1[arg3] & 0xFF;
		if ((arg1[arg0] & 0xFF) < local53) {
			local53 = arg1[arg0] & 0xFF;
		}
		@Pc(82) byte[] local82 = arg5[arg3];
		@Pc(86) byte[] local86 = arg4[arg0];
		@Pc(91) int local91 = local27 - local9;
		@Pc(96) int local96 = local27 - local19;
		for (@Pc(98) int local98 = local27; local98 < local38; local98++) {
			@Pc(111) int local111 = local82[local91++] + local86[local96++];
			if (local111 < local53) {
				local53 = local111;
			}
		}
		return -local53;
	}
}
