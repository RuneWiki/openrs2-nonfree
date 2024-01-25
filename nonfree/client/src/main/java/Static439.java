import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "F")
	public static float aFloat123;

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "Z")
	public static boolean aBoolean606 = false;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!qea;I)V")
	public static void method6369(@OriginalArg(1) Class307 arg0, @OriginalArg(2) int arg1) {
		if (Static66.anInt1152 >= 50 || (arg0 == null || arg0.anIntArrayArray51 == null || arg0.anIntArrayArray51.length <= arg1 || arg0.anIntArrayArray51[arg1] == null)) {
			return;
		}
		@Pc(38) int local38 = arg0.anIntArrayArray51[arg1][0];
		@Pc(42) int local42 = local38 >> 8;
		@Pc(59) int local59;
		if (arg0.anIntArrayArray51[arg1].length > 1) {
			local59 = (int) ((double) arg0.anIntArrayArray51[arg1].length * Math.random());
			if (local59 > 0) {
				local42 = arg0.anIntArrayArray51[arg1][local59];
			}
		}
		@Pc(77) int local77 = local38 >> 5 & 0x7;
		local59 = 256;
		if (arg0.anIntArray585 != null && arg0.anIntArray583 != null) {
			local59 = Static231.method3315(arg0.anIntArray585[arg1], arg0.anIntArray583[arg1]);
		}
		if (arg0.aBoolean702) {
			Static43.method587(local42, 255, false, local77, local59, 0);
		} else {
			Static485.method6932(local59, local77, 255, 0, local42);
		}
	}
}
