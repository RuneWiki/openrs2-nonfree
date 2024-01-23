import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
	public static int anInt398 = 0;

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
	public static int anInt402 = -1;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
	public static int anInt403 = 0;

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
	public static void method374() {
		Static48.aClass187_27.method4530();
		Static191.aClass187_100.method4530();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBIII)V")
	public static void method375(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static273.method4257(arg0 - arg1, Static183.anIntArrayArray26[arg3], arg2, arg1 + arg0);
		@Pc(16) int local16 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = -arg1;
		@Pc(27) int local27 = -1;
		while (local22 < local16) {
			local27 += 2;
			local25 += local27;
			local22++;
			if (local25 >= 0) {
				local16--;
				local25 -= local16 << 1;
				@Pc(57) int[] local57 = Static183.anIntArrayArray26[local16 + arg3];
				@Pc(64) int[] local64 = Static183.anIntArrayArray26[arg3 - local16];
				@Pc(68) int local68 = arg0 + local22;
				@Pc(73) int local73 = arg0 - local22;
				Static273.method4257(local73, local57, arg2, local68);
				Static273.method4257(local73, local64, arg2, local68);
			}
			@Pc(89) int local89 = arg0 + local16;
			@Pc(93) int local93 = arg0 - local16;
			@Pc(99) int[] local99 = Static183.anIntArrayArray26[local22 + arg3];
			@Pc(106) int[] local106 = Static183.anIntArrayArray26[arg3 - local22];
			Static273.method4257(local93, local99, arg2, local89);
			Static273.method4257(local93, local106, arg2, local89);
		}
	}
}
