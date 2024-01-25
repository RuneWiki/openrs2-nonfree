import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "[I")
	public static final int[] anIntArray413 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)V")
	public static void method4189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static367.method5802(arg1)) {
			Static64.method1226(Static129.aClass239ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(III)I")
	public static int method4191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}
}
