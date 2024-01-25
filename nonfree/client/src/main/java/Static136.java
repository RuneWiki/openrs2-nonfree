import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Lclient!ok;")
	public static Class18 aClass18_2;

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "[I")
	public static int[] anIntArray264;

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "Lclient!op;")
	public static Class91 aClass91_1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
	public static int anInt2582 = 1;

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "Lclient!le;")
	public static final Class122 aClass122_6 = new Class122(64);

	@OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
	public static int anInt2608 = -1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(JI)V")
	public static void method2397(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 + Static86.anInt1611;
		@Pc(16) int local16 = Static349.anInt6701 + Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632;
		if (Static8.anInt184 - local11 < -500 || Static8.anInt184 - local11 > 500 || Static311.anInt3611 - local16 < -500 || Static311.anInt3611 - local16 > 500) {
			Static8.anInt184 = local11;
			Static311.anInt3611 = local16;
		}
		@Pc(55) int local55;
		@Pc(63) int local63;
		if (Static8.anInt184 != local11) {
			local55 = local11 - Static8.anInt184;
			local63 = (int) ((long) local55 * arg0 / 320L);
			if (local55 <= 0) {
				if (local63 == 0) {
					local63 = -1;
				} else if (local63 < local55) {
					local63 = local55;
				}
			} else if (local63 == 0) {
				local63 = 1;
			} else if (local63 > local55) {
				local63 = local55;
			}
			Static8.anInt184 += local63;
		}
		if (local16 != Static311.anInt3611) {
			local55 = local16 - Static311.anInt3611;
			local63 = (int) ((long) local55 * arg0 / 320L);
			if (local55 <= 0) {
				if (local63 == 0) {
					local63 = -1;
				} else if (local63 < local55) {
					local63 = local55;
				}
			} else if (local63 == 0) {
				local63 = 1;
			} else if (local63 > local55) {
				local63 = local55;
			}
			Static311.anInt3611 += local63;
		}
		if (!Static131.aBoolean194) {
			Static164.aFloat24 += Static192.aFloat34 * (float) arg0 / 6.0F;
			Static29.aFloat7 += Static215.aFloat55 * (float) arg0 / 6.0F;
		}
		Static275.method4842();
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
	public static void method2408() {
		@Pc(9) Class109 local9 = Static28.aClass109_13;
		synchronized (Static28.aClass109_13) {
			Static28.aClass109_13.method2858();
		}
	}
}
