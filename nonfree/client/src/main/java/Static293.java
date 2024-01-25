import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!md", name = "T", descriptor = "I")
	public static int anInt8972 = 1;

	@OriginalMember(owner = "client!md", name = "cc", descriptor = "I")
	public static final int anInt9020 = 328;

	@OriginalMember(owner = "client!md", name = "mc", descriptor = "Z")
	public static boolean aBoolean679 = false;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(JJ)J")
	public static long method7804(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIBIII)V")
	public static void method7806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 + arg4;
		@Pc(14) int local14 = arg5 - arg4;
		for (@Pc(16) int local16 = arg2; local16 < local9; local16++) {
			Static313.method5430(arg3, arg1, Static143.anIntArrayArray33[local16], arg0);
		}
		@Pc(35) int local35 = arg0 + arg4;
		for (@Pc(37) int local37 = arg5; local37 > local14; local37--) {
			Static313.method5430(arg3, arg1, Static143.anIntArrayArray33[local37], arg0);
		}
		@Pc(61) int local61 = arg3 - arg4;
		for (@Pc(63) int local63 = local9; local63 <= local14; local63++) {
			@Pc(69) int[] local69 = Static143.anIntArrayArray33[local63];
			Static313.method5430(local35, arg1, local69, arg0);
			Static313.method5430(arg3, arg1, local69, local61);
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
	public static void method7812() {
		Static47.aClass104_20 = null;
		Static14.anInt321 = -1;
	}
}
