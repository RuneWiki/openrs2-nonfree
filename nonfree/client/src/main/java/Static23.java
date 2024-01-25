import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public static int anInt925 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)I")
	public static int method989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(JI)V")
	public static void method990(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 + Static409.anInt7484;
		@Pc(16) int local16 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911 + Static317.anInt5959;
		if (Static410.anInt7502 - local11 < -2000 || Static410.anInt7502 - local11 > 2000 || Static528.anInt9022 - local16 < -2000 || Static528.anInt9022 - local16 > 2000) {
			Static528.anInt9022 = local16;
			Static410.anInt7502 = local11;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (Static410.anInt7502 != local11) {
			local63 = local11 - Static410.anInt7502;
			local71 = (int) ((long) local63 * arg0 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local63 > local71) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local71 > local63) {
				local71 = local63;
			}
			Static410.anInt7502 += local71;
		}
		if (Static528.anInt9022 != local16) {
			local63 = local16 - Static528.anInt9022;
			local71 = (int) (arg0 * (long) local63 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local71 < local63) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local71 > local63) {
				local71 = local63;
			}
			Static528.anInt9022 += local71;
		}
		Static401.aFloat165 += (float) arg0 * Static620.aFloat208 / 6.0F;
		Static620.aFloat209 += Static83.aFloat69 * (float) arg0 / 6.0F;
		Static492.method6922();
	}
}
