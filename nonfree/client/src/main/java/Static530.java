import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
	public static int anInt9191 = -1;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIBII)V")
	public static void method7715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg3;
		@Pc(20) int local20 = -arg3;
		Static115.method2332(arg1 - arg3, arg3 + arg1, arg0, Static183.anIntArrayArray26[arg2]);
		@Pc(35) int local35 = -1;
		while (local15 < local17) {
			local35 += 2;
			local20 += local35;
			local15++;
			if (local20 >= 0) {
				local17--;
				local20 -= local17 << 1;
				@Pc(58) int[] local58 = Static183.anIntArrayArray26[local17 + arg2];
				@Pc(64) int[] local64 = Static183.anIntArrayArray26[arg2 - local17];
				@Pc(68) int local68 = local15 + arg1;
				@Pc(72) int local72 = arg1 - local15;
				Static115.method2332(local72, local68, arg0, local58);
				Static115.method2332(local72, local68, arg0, local64);
			}
			@Pc(88) int local88 = local17 + arg1;
			@Pc(93) int local93 = arg1 - local17;
			@Pc(99) int[] local99 = Static183.anIntArrayArray26[local15 + arg2];
			@Pc(106) int[] local106 = Static183.anIntArrayArray26[arg2 - local15];
			Static115.method2332(local93, local88, arg0, local99);
			Static115.method2332(local93, local88, arg0, local106);
		}
	}
}
