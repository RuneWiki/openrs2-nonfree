import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BI[BII)V")
	public static void method956(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15;
		if (arg0 == arg2) {
			if (arg1 == arg3) {
				return;
			}
			if (arg3 > arg1 && arg3 < arg1 + arg4) {
				local15 = arg4 - 1;
				@Pc(19) int local19 = arg1 + local15;
				@Pc(23) int local23 = arg3 + local15;
				local15 = local19 - local15;
				local15 += 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
				}
				local15 -= 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
				}
				return;
			}
		}
		local15 = arg4 + arg1;
		@Pc(115) int local115 = local15 - 7;
		while (arg1 < local115) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		local15 = local115 + 7;
		while (arg1 < local15) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([III)V")
	public static void method957(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg2 - 7;
		while (arg1 < local5) {
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
		}
		local5 += 7;
		while (arg1 < local5) {
			arg0[arg1++] = 0;
		}
	}
}
