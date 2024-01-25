import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
	public static int anInt9275;

	@OriginalMember(owner = "client!taa", name = "d", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_10;

	@OriginalMember(owner = "client!taa", name = "g", descriptor = "[I")
	public static int[] anIntArray567;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)I")
	public static int method7895(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static167.anInt3476 - 1; local3++) {
			if (arg0 < Static83.anIntArray115[local3] + Static332.anIntArray561[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static167.anInt3476 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIB)V")
	public static void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13;
		if (Static6.anInt111 != arg1) {
			Static284.anIntArray482 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static284.anIntArray482[local13] = (local13 << 12) / arg1;
			}
			Static325.anInt6209 = arg1 - 1;
			Static6.anInt111 = arg1;
			Static569.anInt9580 = arg1 * 32;
		}
		if (arg0 == Static429.anInt7811) {
			return;
		}
		if (arg0 == Static6.anInt111) {
			Static629.anIntArray635 = Static284.anIntArray482;
		} else {
			Static629.anIntArray635 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static629.anIntArray635[local13] = (local13 << 12) / arg0;
			}
		}
		Static2.anInt12 = arg0 - 1;
		Static429.anInt7811 = arg0;
	}
}
