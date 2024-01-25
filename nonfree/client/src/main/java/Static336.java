import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III[II)V")
	public static void method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(7) int local7 = arg1 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (local11 > arg3) {
			@Pc(15) int local15 = arg3 + 1;
			arg2[local15] = arg0;
			@Pc(20) int local20 = local15 + 1;
			arg2[local20] = arg0;
			@Pc(25) int local25 = local20 + 1;
			arg2[local25] = arg0;
			@Pc(30) int local30 = local25 + 1;
			arg2[local30] = arg0;
			@Pc(35) int local35 = local30 + 1;
			arg2[local35] = arg0;
			@Pc(40) int local40 = local35 + 1;
			arg2[local40] = arg0;
			@Pc(45) int local45 = local40 + 1;
			arg2[local45] = arg0;
			arg3 = local45 + 1;
			arg2[arg3] = arg0;
		}
		while (local7 > arg3) {
			arg3++;
			arg2[arg3] = arg0;
		}
	}
}
