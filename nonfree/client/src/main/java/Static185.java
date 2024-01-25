import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "F")
	public static float aFloat123;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "F")
	public static float aFloat124;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!hu;")
	public static final Class147 aClass147_5 = new Class147("", 14);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!mi;)V")
	public static void method3284(@OriginalArg(1) Class4_Sub7 arg0) {
		if (arg0.aClass4_Sub16_5 != null) {
			arg0.aClass4_Sub16_5.anInt2743 = 0;
		}
		arg0.aBoolean532 = false;
		for (@Pc(22) Class4_Sub7 local22 = arg0.method6401(); local22 != null; local22 = arg0.method6404()) {
			method3284(local22);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BJ)V")
	public static void method3293(@OriginalArg(1) long arg0) {
		@Pc(11) int local11 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934 + Static424.anInt7961;
		@Pc(16) int local16 = Static288.anInt10006 + Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935;
		if (Static60.anInt983 - local11 < -2000 || Static60.anInt983 - local11 > 2000 || Static557.anInt1156 - local16 < -2000 || Static557.anInt1156 - local16 > 2000) {
			Static557.anInt1156 = local16;
			Static60.anInt983 = local11;
		}
		@Pc(57) int local57;
		@Pc(65) int local65;
		if (local11 != Static60.anInt983) {
			local57 = local11 - Static60.anInt983;
			local65 = (int) (arg0 * (long) local57 / 320L);
			if (local57 > 0) {
				if (local65 == 0) {
					local65 = 1;
				} else if (local57 < local65) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = -1;
			} else if (local57 > local65) {
				local65 = local57;
			}
			Static60.anInt983 += local65;
		}
		if (Static557.anInt1156 != local16) {
			local57 = local16 - Static557.anInt1156;
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
			Static557.anInt1156 += local65;
		}
		if (!Static214.aClass4_Sub19_Sub1_1.aBoolean255) {
			Static213.aFloat141 += Static436.aFloat210 * (float) arg0 / 6.0F;
			Static201.aFloat128 += (float) arg0 * Static429.aFloat208 / 6.0F;
		}
		Static355.method5751();
	}
}
