import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	public static int anInt2827 = 0;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	public static int anInt2828 = 0;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "[I")
	public static final int[] anIntArray130 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLclient!hw;)I")
	public static int method2269(@OriginalArg(1) Class21_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt4298;
		@Pc(12) Class252 local12 = arg0.method3322();
		if (arg0.anInt4254 == -1 || arg0.aBoolean294) {
			local8 = arg0.anInt4311;
		} else if (local12.anInt7486 == arg0.anInt4254 || arg0.anInt4254 == local12.anInt7504 || arg0.anInt4254 == local12.anInt7518 || arg0.anInt4254 == local12.anInt7511) {
			local8 = arg0.anInt4303;
		} else if (arg0.anInt4254 == local12.anInt7478 || local12.anInt7484 == arg0.anInt4254 || arg0.anInt4254 == local12.anInt7516 || arg0.anInt4254 == local12.anInt7492) {
			local8 = arg0.anInt4322;
		}
		return local8;
	}
}
