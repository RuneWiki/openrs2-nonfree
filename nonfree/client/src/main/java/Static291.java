import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IJ)V")
	public static void method4915(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static40.anInt1002;
		@Pc(9) int local9 = Static157.anInt3699;
		@Pc(17) int local17;
		@Pc(25) int local25;
		if (Static8.anInt583 != local7) {
			local17 = local7 - Static8.anInt583;
			local25 = (int) ((long) local17 * arg0 / 320L);
			if (local17 <= 0) {
				if (local25 == 0) {
					local25 = -1;
				} else if (local25 < local17) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = 1;
			} else if (local25 > local17) {
				local25 = local17;
			}
			Static8.anInt583 += local25;
		}
		if (!Static7.aClass3_Sub15_Sub1_1.aBoolean604) {
			Static487.aFloat258 += Static479.aFloat252 * (float) arg0 / 40.0F * 8.0F;
			Static343.aFloat198 += Static481.aFloat254 * (float) arg0 / 40.0F * 8.0F;
		}
		if (Static366.anInt6836 != local9) {
			local17 = local9 - Static366.anInt6836;
			local25 = (int) (arg0 * (long) local17 / 320L);
			if (local17 <= 0) {
				if (local25 == 0) {
					local25 = -1;
				} else if (local25 < local17) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = 1;
			} else if (local25 > local17) {
				local25 = local17;
			}
			Static366.anInt6836 += local25;
		}
		Static199.method3746();
	}
}
