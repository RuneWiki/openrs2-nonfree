import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray42;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray67 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IJ)V")
	public static void method6113(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static347.anInt6403;
		@Pc(18) int local18;
		@Pc(26) int local26;
		if (local7 != Static126.anInt3030) {
			local18 = local7 - Static126.anInt3030;
			local26 = (int) (arg0 * (long) local18 / 320L);
			if (local18 <= 0) {
				if (local26 == 0) {
					local26 = -1;
				} else if (local26 < local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = 1;
			} else if (local26 > local18) {
				local26 = local18;
			}
			Static126.anInt3030 += local26;
		}
		@Pc(58) int local58 = Static67.anInt1925;
		if (!Static89.aClass1_Sub28_Sub1_1.aBoolean324) {
			Static362.aFloat128 += (float) arg0 * Static404.aFloat203 / 40.0F * 8.0F;
			Static443.aFloat151 += (float) arg0 * Static28.aFloat50 / 40.0F * 8.0F;
		}
		if (local58 != Static180.anInt3880) {
			local18 = local58 - Static180.anInt3880;
			local26 = (int) ((long) local18 * arg0 / 320L);
			if (local18 <= 0) {
				if (local26 == 0) {
					local26 = -1;
				} else if (local26 < local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = 1;
			} else if (local18 < local26) {
				local26 = local18;
			}
			Static180.anInt3880 += local26;
		}
		Static15.method801();
	}
}
