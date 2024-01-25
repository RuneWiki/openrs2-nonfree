import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "[Lclient!hg;")
	public static Class141[] aClass141Array1;

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
	public static int anInt6286;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
	public static int anInt6283 = 0;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IJ)V")
	public static void method5246(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static504.anInt8012;
		@Pc(18) int local18;
		@Pc(26) int local26;
		if (Static14.anInt328 != local7) {
			local18 = local7 - Static14.anInt328;
			local26 = (int) (arg0 * (long) local18 / 320L);
			if (local18 <= 0) {
				if (local26 == 0) {
					local26 = -1;
				} else if (local18 > local26) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = 1;
			} else if (local26 > local18) {
				local26 = local18;
			}
			Static14.anInt328 += local26;
		}
		@Pc(69) int local69 = Static520.anInt8309;
		if (Static47.anInt873 != local69) {
			local18 = local69 - Static47.anInt873;
			local26 = (int) (arg0 * (long) local18 / 320L);
			if (local18 > 0) {
				if (local26 == 0) {
					local26 = 1;
				} else if (local18 < local26) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = -1;
			} else if (local26 < local18) {
				local26 = local18;
			}
			Static47.anInt873 += local26;
		}
		if (!Static257.aClass2_Sub35_Sub1_1.aBoolean638) {
			Static313.aFloat157 += Static216.aFloat246 * (float) arg0 / 40.0F * 8.0F;
			Static541.aFloat128 += Static452.aFloat192 * (float) arg0 / 40.0F * 8.0F;
		}
		Static89.method1342();
	}
}
