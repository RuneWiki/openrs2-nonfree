import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
	public static int anInt7946;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	public static int anInt7947;

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
	public static int anInt7958;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "[I")
	public static final int[] anIntArray598 = new int[13];

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)I")
	public static int method6588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 - arg2;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}
}
