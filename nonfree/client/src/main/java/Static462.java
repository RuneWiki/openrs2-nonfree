import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
	public static int anInt7854;

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
	public static int anInt7858 = -1;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "Z")
	public static boolean aBoolean577 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IJ)V")
	public static void method6244(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static3.anInt1340;
		@Pc(15) int local15;
		@Pc(23) int local23;
		if (local7 != Static53.anInt4623) {
			local15 = local7 - Static53.anInt4623;
			local23 = (int) (arg0 * (long) local15 / 320L);
			if (local15 <= 0) {
				if (local23 == 0) {
					local23 = -1;
				} else if (local15 > local23) {
					local23 = local15;
				}
			} else if (local23 == 0) {
				local23 = 1;
			} else if (local23 > local15) {
				local23 = local15;
			}
			Static53.anInt4623 += local23;
		}
		@Pc(66) int local66 = Static373.anInt6559;
		if (Static233.anInt4616 != local66) {
			local15 = local66 - Static233.anInt4616;
			local23 = (int) (arg0 * (long) local15 / 320L);
			if (local15 > 0) {
				if (local23 == 0) {
					local23 = 1;
				} else if (local15 < local23) {
					local23 = local15;
				}
			} else if (local23 == 0) {
				local23 = -1;
			} else if (local15 > local23) {
				local23 = local15;
			}
			Static233.anInt4616 += local23;
		}
		if (!Static157.aClass185_Sub1_1.aBoolean393) {
			Static322.aFloat82 += Static249.aFloat69 * (float) arg0 / 40.0F * 8.0F;
			Static43.aFloat26 += (float) arg0 * Static275.aFloat76 / 40.0F * 8.0F;
		}
		Static117.method4155();
	}
}
