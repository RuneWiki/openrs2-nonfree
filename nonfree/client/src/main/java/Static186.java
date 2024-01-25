import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	public static int anInt3223;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZ)V")
	public static void method2671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(17) int local17 = -arg2;
		@Pc(19) int local19 = -1;
		Static2.method38(arg1 + arg2, arg3, Static67.anIntArrayArray13[arg0], arg1 - arg2);
		while (local7 < local9) {
			local19 += 2;
			local17 += local19;
			local7++;
			if (local17 >= 0) {
				local9--;
				local17 -= local9 << 1;
				@Pc(58) int[] local58 = Static67.anIntArrayArray13[arg0 + local9];
				@Pc(65) int[] local65 = Static67.anIntArrayArray13[arg0 - local9];
				@Pc(69) int local69 = arg1 + local7;
				@Pc(74) int local74 = arg1 - local7;
				Static2.method38(local69, arg3, local58, local74);
				Static2.method38(local69, arg3, local65, local74);
			}
			@Pc(90) int local90 = local9 + arg1;
			@Pc(95) int local95 = arg1 - local9;
			@Pc(101) int[] local101 = Static67.anIntArrayArray13[arg0 + local7];
			@Pc(107) int[] local107 = Static67.anIntArrayArray13[arg0 - local7];
			Static2.method38(local90, arg3, local101, local95);
			Static2.method38(local90, arg3, local107, local95);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method2672() {
		if (Static289.aClass34_9 != null) {
			Static289.aClass34_9.method5782();
			Static289.aClass34_9 = null;
			Static287.aClass76_3 = null;
		}
	}
}
