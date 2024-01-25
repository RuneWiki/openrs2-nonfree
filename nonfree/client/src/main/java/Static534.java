import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "[I")
	public static final int[] anIntArray507 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIIIBI)V")
	public static void method7516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg1 + 1;
		Static36.method1264(Static632.anIntArrayArray65[arg1], arg2, arg4, arg0);
		@Pc(17) int local17 = arg3 - 1;
		Static36.method1264(Static632.anIntArrayArray65[arg3], arg2, arg4, arg0);
		for (@Pc(25) int local25 = local4; local25 <= local17; local25++) {
			@Pc(31) int[] local31 = Static632.anIntArrayArray65[local25];
			local31[arg2] = local31[arg0] = arg4;
		}
	}
}
