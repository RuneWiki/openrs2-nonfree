import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_19 = new Class28(10, 2, 2, 0);

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
	public static int anInt7756 = 64;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "Z")
	public static boolean aBoolean612 = false;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IJ)V")
	public static void method6373(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static124.anInt2402 + Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761;
		@Pc(15) int local15 = Static295.anInt8557 + Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764;
		if (Static553.anInt9056 - local10 < -2000 || Static553.anInt9056 - local10 > 2000 || Static264.anInt4870 - local15 < -2000 || Static264.anInt4870 - local15 > 2000) {
			Static264.anInt4870 = local15;
			Static553.anInt9056 = local10;
		}
		@Pc(57) int local57;
		@Pc(65) int local65;
		if (local10 != Static553.anInt9056) {
			local57 = local10 - Static553.anInt9056;
			local65 = (int) ((long) local57 * arg0 / 320L);
			if (local57 <= 0) {
				if (local65 == 0) {
					local65 = -1;
				} else if (local65 < local57) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = 1;
			} else if (local65 > local57) {
				local65 = local57;
			}
			Static553.anInt9056 += local65;
		}
		if (!Static72.aClass2_Sub12_Sub1_1.aBoolean151) {
			Static447.aFloat233 += (float) arg0 * Static11.aFloat8 / 6.0F;
			Static412.aFloat13 += (float) arg0 * Static402.aFloat205 / 6.0F;
		}
		if (local15 != Static264.anInt4870) {
			local57 = local15 - Static264.anInt4870;
			local65 = (int) ((long) local57 * arg0 / 320L);
			if (local57 > 0) {
				if (local65 == 0) {
					local65 = 1;
				} else if (local65 > local57) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = -1;
			} else if (local65 < local57) {
				local65 = local57;
			}
			Static264.anInt4870 += local65;
		}
		Static274.method4150();
	}
}
