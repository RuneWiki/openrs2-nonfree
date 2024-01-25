import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
	public static int anInt2429;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
	public static int anInt2426 = 0;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "[I")
	public static final int[] anIntArray221 = new int[14];

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
	public static int anInt2428 = 2;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BII)V")
	public static void method2350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21;
		if (Static294.anInt5657 != arg0) {
			Static346.anIntArray638 = new int[arg0];
			for (local21 = 0; local21 < arg0; local21++) {
				Static346.anIntArray638[local21] = (local21 << 12) / arg0;
			}
			Static233.anInt4558 = arg0 * 32;
			Static329.anInt6352 = arg0 - 1;
			Static294.anInt5657 = arg0;
		}
		if (arg1 == Static65.anInt5731) {
			return;
		}
		if (arg1 == Static294.anInt5657) {
			Static213.anIntArray381 = Static346.anIntArray638;
		} else {
			Static213.anIntArray381 = new int[arg1];
			for (local21 = 0; local21 < arg1; local21++) {
				Static213.anIntArray381[local21] = (local21 << 12) / arg1;
			}
		}
		Static65.anInt5731 = arg1;
		Static179.anInt3689 = arg1 - 1;
	}
}
