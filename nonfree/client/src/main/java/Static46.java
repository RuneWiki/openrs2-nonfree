import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
	public static int anInt765 = 0;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
	public static int anInt767 = 0;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "[I")
	public static final int[] anIntArray49 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(JZ)V")
	public static void method783(@OriginalArg(0) long arg0) {
		@Pc(17) int local17 = Static342.anInt5820 + Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184;
		@Pc(23) int local23 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 + Static159.anInt2418;
		if (Static173.anInt2835 - local17 < -2000 || Static173.anInt2835 - local17 > 2000 || Static660.anInt6758 - local23 < -2000 || Static660.anInt6758 - local23 > 2000) {
			Static173.anInt2835 = local17;
			Static660.anInt6758 = local23;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (local17 != Static173.anInt2835) {
			local66 = local17 - Static173.anInt2835;
			local74 = (int) ((long) local66 * arg0 / 320L);
			if (local66 <= 0) {
				if (local74 == 0) {
					local74 = -1;
				} else if (local74 < local66) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = 1;
			} else if (local66 < local74) {
				local74 = local66;
			}
			Static173.anInt2835 += local74;
		}
		Static680.aFloat210 += (float) arg0 * Static193.aFloat190 / 6.0F;
		if (Static660.anInt6758 != local23) {
			local66 = local23 - Static660.anInt6758;
			local74 = (int) ((long) local66 * arg0 / 320L);
			if (local66 > 0) {
				if (local74 == 0) {
					local74 = 1;
				} else if (local74 > local66) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = -1;
			} else if (local74 < local66) {
				local74 = local66;
			}
			Static660.anInt6758 += local74;
		}
		Static139.aFloat16 += Static173.aFloat21 * (float) arg0 / 6.0F;
		Static54.method988();
	}
}
