import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
	public static int anInt7485;

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "Z")
	public static boolean aBoolean507 = true;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ga;Lclient!ok;Z)V")
	public static void method5767(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class178 arg1) {
		Static204.anInterface4_6 = arg0;
		Static124.aClass178_40 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([IIIIZ)V")
	public static void method5769(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1--;
		@Pc(13) int local13 = arg2 - 1;
		@Pc(16) int local16 = local13 - 7;
		while (local16 > arg1) {
			@Pc(20) int local20 = arg1 + 1;
			arg0[local20] = arg3;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg3;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg3;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg3;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg3;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg3;
			@Pc(50) int local50 = local45 + 1;
			arg0[local50] = arg3;
			arg1 = local50 + 1;
			arg0[arg1] = arg3;
		}
		while (arg1 < local13) {
			arg1++;
			arg0[arg1] = arg3;
		}
	}
}
