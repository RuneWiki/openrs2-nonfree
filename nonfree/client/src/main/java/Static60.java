import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "[Lclient!mm;")
	public static Class231[] aClass231Array3;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public static int anInt3115 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IJ)V")
	public static void method2656(@OriginalArg(1) long arg0) {
		@Pc(11) int local11 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 + Static541.anInt8999;
		@Pc(16) int local16 = Static314.anInt6318 + Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315;
		if (Static134.anInt2212 - local11 < -2000 || Static134.anInt2212 - local11 > 2000 || Static319.anInt5539 - local16 < -2000 || Static319.anInt5539 - local16 > 2000) {
			Static134.anInt2212 = local11;
			Static319.anInt5539 = local16;
		}
		@Pc(56) int local56;
		@Pc(64) int local64;
		if (local11 != Static134.anInt2212) {
			local56 = local11 - Static134.anInt2212;
			local64 = (int) (arg0 * (long) local56 / 320L);
			if (local56 > 0) {
				if (local64 == 0) {
					local64 = 1;
				} else if (local56 < local64) {
					local64 = local56;
				}
			} else if (local64 == 0) {
				local64 = -1;
			} else if (local64 < local56) {
				local64 = local56;
			}
			Static134.anInt2212 += local64;
		}
		if (local16 != Static319.anInt5539) {
			local56 = local16 - Static319.anInt5539;
			local64 = (int) (arg0 * (long) local56 / 320L);
			if (local56 > 0) {
				if (local64 == 0) {
					local64 = 1;
				} else if (local64 > local56) {
					local64 = local56;
				}
			} else if (local64 == 0) {
				local64 = -1;
			} else if (local56 > local64) {
				local64 = local56;
			}
			Static319.anInt5539 += local64;
		}
		Static371.aFloat65 += Static554.aFloat192 * (float) arg0 / 6.0F;
		Static112.aFloat22 += (float) arg0 * Static322.aFloat112 / 6.0F;
		Static542.method7723();
	}
}
