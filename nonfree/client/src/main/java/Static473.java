import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "[I")
	public static final int[] anIntArray460 = new int[1000];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBII)V")
	public static void method7034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg1;
		@Pc(20) int local20 = -arg1;
		@Pc(22) int local22 = -1;
		Static36.method1264(Static632.anIntArrayArray65[arg0], arg3 - arg1, arg2, arg3 + arg1);
		while (local17 > local15) {
			local22 += 2;
			local15++;
			local20 += local22;
			if (local20 >= 0) {
				local17--;
				local20 -= local17 << 1;
				@Pc(58) int[] local58 = Static632.anIntArrayArray65[local17 + arg0];
				@Pc(65) int[] local65 = Static632.anIntArrayArray65[arg0 - local17];
				@Pc(69) int local69 = arg3 + local15;
				@Pc(74) int local74 = arg3 - local15;
				Static36.method1264(local58, local74, arg2, local69);
				Static36.method1264(local65, local74, arg2, local69);
			}
			@Pc(90) int local90 = local17 + arg3;
			@Pc(94) int local94 = arg3 - local17;
			@Pc(100) int[] local100 = Static632.anIntArrayArray65[local15 + arg0];
			@Pc(107) int[] local107 = Static632.anIntArrayArray65[arg0 - local15];
			Static36.method1264(local100, local94, arg2, local90);
			Static36.method1264(local107, local94, arg2, local90);
		}
	}
}
