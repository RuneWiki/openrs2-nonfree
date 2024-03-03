import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!om", name = "ob", descriptor = "I")
	public static int anInt4735;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IJ)V", line = 227)
	public static void method4396(@OriginalArg(1) long arg0) {
		@Pc(12) int local12 = Class2_Sub3_Sub39.anInt7251;
		@Pc(20) int local20;
		@Pc(28) int local28;
		if (local12 != Static265.anInt5451) {
			local20 = local12 - Static265.anInt5451;
			local28 = (int) (arg0 * (long) local20 / 320L);
			if (local20 > 0) {
				if (local28 == 0) {
					local28 = 1;
				} else if (local28 > local20) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = -1;
			} else if (local28 < local20) {
				local28 = local20;
			}
			Static265.anInt5451 += local28;
		}
		@Pc(66) int local66 = Class229.anInt6436;
		if (!Static203.aClass177_Sub1_2.aBoolean351) {
			Class187.aFloat66 += Class128.aFloat38 * (float) arg0 / 40.0F * 8.0F;
			Class28.aFloat27 += (float) arg0 * Class198.aFloat67 / 40.0F * 8.0F;
		}
		if (local66 != Static58.anInt2392) {
			local20 = local66 - Static58.anInt2392;
			local28 = (int) (arg0 * (long) local20 / 320L);
			if (local20 > 0) {
				if (local28 == 0) {
					local28 = 1;
				} else if (local20 < local28) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = -1;
			} else if (local20 > local28) {
				local28 = local20;
			}
			Static58.anInt2392 += local28;
		}
		Static315.method6142();
	}
}
