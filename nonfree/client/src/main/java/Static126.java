import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!em", name = "U", descriptor = "F")
	public static float aFloat84 = 1024.0F;

	@OriginalMember(owner = "client!em", name = "X", descriptor = "[[I")
	public static final int[][] anIntArrayArray53 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!em", name = "fb", descriptor = "I")
	public static int anInt2887 = 0;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "(I)I")
	public static int method2596() {
		@Pc(7) int local7 = Static215.aClass151_1.method3631();
		if (local7 < Static140.aClass151Array1.length - 1) {
			Static215.aClass151_1 = Static140.aClass151Array1[local7 + 1];
		}
		return 100;
	}
}
