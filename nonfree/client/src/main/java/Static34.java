import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bfa", name = "r", descriptor = "I")
	public static int anInt967;

	@OriginalMember(owner = "client!bfa", name = "x", descriptor = "Lclient!bm;")
	public static final Class32 aClass32_3 = new Class32();

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(JI)V")
	public static void method1073(@OriginalArg(0) long arg0) {
		@Pc(13) int local13 = Static531.anInt9619;
		@Pc(24) int local24;
		@Pc(32) int local32;
		if (local13 != Static189.anInt3761) {
			local24 = local13 - Static189.anInt3761;
			local32 = (int) (arg0 * (long) local24 / 320L);
			if (local24 <= 0) {
				if (local32 == 0) {
					local32 = -1;
				} else if (local24 > local32) {
					local32 = local24;
				}
			} else if (local32 == 0) {
				local32 = 1;
			} else if (local24 < local32) {
				local32 = local24;
			}
			Static189.anInt3761 += local32;
		}
		@Pc(77) int local77 = Static166.anInt3526;
		if (local77 != Static65.anInt1699) {
			local24 = local77 - Static65.anInt1699;
			local32 = (int) (arg0 * (long) local24 / 320L);
			if (local24 <= 0) {
				if (local32 == 0) {
					local32 = -1;
				} else if (local24 > local32) {
					local32 = local24;
				}
			} else if (local32 == 0) {
				local32 = 1;
			} else if (local32 > local24) {
				local32 = local24;
			}
			Static65.anInt1699 += local32;
		}
		if (!Static455.aClass3_Sub27_Sub1_1.aBoolean390) {
			Static533.aFloat188 += (float) arg0 * Static297.aFloat119 / 40.0F * 8.0F;
			Static170.aFloat181 += Static149.aFloat31 * (float) arg0 / 40.0F * 8.0F;
		}
		Static109.method2281();
	}
}
