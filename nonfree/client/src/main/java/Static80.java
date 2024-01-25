import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "[I")
	public static int[] anIntArray184;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "I")
	public static int anInt1599 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(JB)V")
	public static void method1555(@OriginalArg(0) long arg0) {
		@Pc(16) int local16 = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 + Static352.anInt6534;
		@Pc(21) int local21 = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 + Static233.anInt4571;
		if (Static140.anInt2779 - local16 < -500 || Static140.anInt2779 - local16 > 500 || Static81.anInt1607 - local21 < -500 || Static81.anInt1607 - local21 > 500) {
			Static140.anInt2779 = local16;
			Static81.anInt1607 = local21;
		}
		@Pc(64) int local64;
		@Pc(72) int local72;
		if (local16 != Static140.anInt2779) {
			local64 = local16 - Static140.anInt2779;
			local72 = (int) ((long) local64 * arg0 / 320L);
			if (local64 > 0) {
				if (local72 == 0) {
					local72 = 1;
				} else if (local72 > local64) {
					local72 = local64;
				}
			} else if (local72 == 0) {
				local72 = -1;
			} else if (local72 < local64) {
				local72 = local64;
			}
			Static140.anInt2779 += local72;
		}
		if (!Static102.aBoolean179) {
			Static233.aFloat86 += Static71.aFloat29 * (float) arg0 / 6.0F;
			Static304.aFloat110 += (float) arg0 * Static302.aFloat90 / 6.0F;
		}
		if (local21 != Static81.anInt1607) {
			local64 = local21 - Static81.anInt1607;
			local72 = (int) ((long) local64 * arg0 / 320L);
			if (local64 <= 0) {
				if (local72 == 0) {
					local72 = -1;
				} else if (local72 < local64) {
					local72 = local64;
				}
			} else if (local72 == 0) {
				local72 = 1;
			} else if (local64 < local72) {
				local72 = local64;
			}
			Static81.anInt1607 += local72;
		}
		Static59.method1258();
	}
}
