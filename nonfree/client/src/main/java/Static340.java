import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!qn", name = "M", descriptor = "J")
	public static long aLong195 = -1L;

	@OriginalMember(owner = "client!qn", name = "Q", descriptor = "[I")
	public static final int[] anIntArray352 = new int[13];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZ)Z")
	public static boolean method4761(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static413.aClass167_11.method6019();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static413.aClass167_11.method5957();
		} else if (!Static413.aClass167_11.method5971()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static39.aClass79_Sub1_1.aBoolean148 = arg0;
			Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
			return true;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIZB)V")
	public static void method4763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(14) long local14 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg3);
		@Pc(20) Class3_Sub32 local20 = (Class3_Sub32) Static96.aClass140_16.method3490(local14);
		if (local20 == null) {
			local20 = new Class3_Sub32();
			Static96.aClass140_16.method3494(local14, local20);
		}
		if (local20.anIntArray274.length <= arg2) {
			@Pc(49) int[] local49 = new int[arg2 + 1];
			@Pc(54) int[] local54 = new int[arg2 + 1];
			for (@Pc(56) int local56 = 0; local56 < local20.anIntArray274.length; local56++) {
				local49[local56] = local20.anIntArray274[local56];
				local54[local56] = local20.anIntArray275[local56];
			}
			for (@Pc(82) int local82 = local20.anIntArray274.length; local82 < arg2; local82++) {
				local49[local82] = -1;
				local54[local82] = 0;
			}
			local20.anIntArray274 = local49;
			local20.anIntArray275 = local54;
		}
		local20.anIntArray274[arg2] = arg0;
		local20.anIntArray275[arg2] = arg1;
	}
}
