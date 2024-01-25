import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static363 {

	@OriginalMember(owner = "client!rt", name = "E", descriptor = "I")
	public static int anInt5901;

	@OriginalMember(owner = "client!rt", name = "G", descriptor = "[I")
	public static final int[] anIntArray420 = new int[4];

	@OriginalMember(owner = "client!rt", name = "N", descriptor = "[I")
	public static final int[] anIntArray422 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IB)V")
	public static void method4695(@OriginalArg(0) int arg0) {
		if (Static226.anInt3761 == 1) {
			Static233.anInt3854 = arg0;
		} else if (Static226.anInt3761 == 2 || Static226.anInt3761 == 3) {
			Static80.anInt1417 = arg0;
		}
	}
}
