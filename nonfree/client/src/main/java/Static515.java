import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!saa", name = "N", descriptor = "I")
	public static int anInt8310;

	@OriginalMember(owner = "client!saa", name = "E", descriptor = "Lclient!qk;")
	public static final Class290 aClass290_7 = new Class290();

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "(B)V")
	public static void method7137() {
		if (Static168.aClass13_32 != null) {
			Static168.aClass13_32.method8117();
			Static168.aClass13_32 = null;
			Static479.aClass37_7 = null;
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZJ)V")
	public static void method7138(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static595.anInt9886;
		@Pc(9) int local9 = Static33.anInt661;
		@Pc(22) int local22;
		@Pc(30) int local30;
		if (Static145.anInt3035 != local7) {
			local22 = local7 - Static145.anInt3035;
			local30 = (int) (arg0 * (long) local22 / 320L);
			if (local22 <= 0) {
				if (local30 == 0) {
					local30 = -1;
				} else if (local22 > local30) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = 1;
			} else if (local30 > local22) {
				local30 = local22;
			}
			Static145.anInt3035 += local30;
		}
		Static225.aFloat85 += (float) arg0 * Static383.aFloat185 / 40.0F * 8.0F;
		if (local9 != Static553.anInt9177) {
			local22 = local9 - Static553.anInt9177;
			local30 = (int) ((long) local22 * arg0 / 320L);
			if (local22 <= 0) {
				if (local30 == 0) {
					local30 = -1;
				} else if (local30 < local22) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = 1;
			} else if (local30 > local22) {
				local30 = local22;
			}
			Static553.anInt9177 += local30;
		}
		Static464.aFloat130 += (float) arg0 * Static431.aFloat131 / 40.0F * 8.0F;
		Static209.method3510();
	}
}
