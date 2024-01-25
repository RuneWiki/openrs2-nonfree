import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!fda;")
	public static Class116 aClass116_2;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	public static int anInt7752;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)V")
	public static void method6504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static30.anInt908 != arg1) {
			Static26.anIntArray20 = new int[arg1];
			for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
				Static26.anIntArray20[local17] = (local17 << 12) / arg1;
			}
			Static30.anInt908 = arg1;
			Static396.anInt6822 = arg1 * 32;
			Static241.anInt4556 = arg1 - 1;
		}
		if (Static157.anInt2964 == arg0) {
			return;
		}
		if (Static30.anInt908 == arg0) {
			Static201.anIntArray251 = Static26.anIntArray20;
		} else {
			Static201.anIntArray251 = new int[arg0];
			for (@Pc(64) int local64 = 0; local64 < arg0; local64++) {
				Static201.anIntArray251[local64] = (local64 << 12) / arg0;
			}
		}
		Static157.anInt2964 = arg0;
		Static622.anInt9680 = arg0 - 1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)I")
	public static int method6505(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
