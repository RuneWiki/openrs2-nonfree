import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "Lclient!kw;")
	public static final Class203 aClass203_11 = new Class203("game3", 2);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(FBFF)F")
	public static float method7983(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return (arg2 - arg0) * arg1 + arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(JI)V")
	public static void method7984(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static388.anInt6480 + Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614;
		@Pc(20) int local20 = Static212.anInt3684 + Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619;
		if (Static365.anInt6231 - local10 < -2000 || Static365.anInt6231 - local10 > 2000 || Static434.anInt7081 - local20 < -2000 || Static434.anInt7081 - local20 > 2000) {
			Static434.anInt7081 = local20;
			Static365.anInt6231 = local10;
		}
		@Pc(58) int local58;
		@Pc(66) int local66;
		if (Static365.anInt6231 != local10) {
			local58 = local10 - Static365.anInt6231;
			local66 = (int) (arg0 * (long) local58 / 320L);
			if (local58 > 0) {
				if (local66 == 0) {
					local66 = 1;
				} else if (local66 > local58) {
					local66 = local58;
				}
			} else if (local66 == 0) {
				local66 = -1;
			} else if (local66 < local58) {
				local66 = local58;
			}
			Static365.anInt6231 += local66;
		}
		if (local20 != Static434.anInt7081) {
			local58 = local20 - Static434.anInt7081;
			local66 = (int) ((long) local58 * arg0 / 320L);
			if (local58 <= 0) {
				if (local66 == 0) {
					local66 = -1;
				} else if (local66 < local58) {
					local66 = local58;
				}
			} else if (local66 == 0) {
				local66 = 1;
			} else if (local58 < local66) {
				local66 = local58;
			}
			Static434.anInt7081 += local66;
		}
		Static376.aFloat104 += Static209.aFloat66 * (float) arg0 / 6.0F;
		Static318.aFloat81 += (float) arg0 * Static560.aFloat177 / 6.0F;
		Static563.method7420();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7986(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < Static345.anInt5912; local17++) {
			if (arg0.equalsIgnoreCase(Static651.aStringArray66[local17])) {
				return local17;
			}
		}
		return -1;
	}
}
