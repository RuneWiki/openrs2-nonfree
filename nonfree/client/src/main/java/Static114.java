import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "[I")
	public static final int[] anIntArray155 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
	public static final int[] anIntArray156 = new int[1];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZI)V")
	public static void method1654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (Static314.anInt6320 != arg1) {
			Static68.anIntArray94 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static68.anIntArray94[local9] = (local9 << 12) / arg1;
			}
			Static550.anInt6610 = arg1 - 1;
			Static314.anInt6320 = arg1;
			Static574.anInt9473 = arg1 * 32;
		}
		if (arg0 == Static423.anInt7200) {
			return;
		}
		if (arg0 == Static314.anInt6320) {
			Static61.anIntArray80 = Static68.anIntArray94;
		} else {
			Static61.anIntArray80 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static61.anIntArray80[local9] = (local9 << 12) / arg0;
			}
		}
		Static423.anInt7200 = arg0;
		Static271.anInt4487 = arg0 - 1;
	}
}
