import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!df", name = "e", descriptor = "I")
	public static int anInt1120;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Z")
	public static boolean aBoolean66 = true;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!ul;")
	public static Class172 aClass172_9 = new Class172(2);

	@OriginalMember(owner = "client!df", name = "c", descriptor = "I")
	public static int anInt1118 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)V")
	public static void method985(@OriginalArg(0) long arg0) {
		if (!Static115.aBoolean148) {
			Static276.aFloat156 += Static12.aFloat9 * (float) arg0 / 40.0F;
			Static126.aFloat73 += Static111.aFloat68 * (float) arg0 / 40.0F;
		}
		@Pc(29) int local29 = Static280.anInt5488 + Static72.aClass13_Sub5_Sub1_1.anInt5334;
		@Pc(34) int local34 = Static72.aClass13_Sub5_Sub1_1.anInt5294 + Static127.anInt2549;
		if (Static81.anInt1698 - local29 < -500 || Static81.anInt1698 - local29 > 500 || Static153.anInt3107 - local34 < -500 || Static153.anInt3107 - local34 > 500) {
			Static81.anInt1698 = local29;
			Static153.anInt3107 = local34;
		}
		@Pc(74) int local74;
		@Pc(82) int local82;
		if (Static81.anInt1698 != local29) {
			local74 = local29 - Static81.anInt1698;
			local82 = (int) (arg0 * (long) local74 / 320L);
			if (local74 > 0) {
				if (local82 == 0) {
					local82 = 1;
				} else if (local74 < local82) {
					local82 = local74;
				}
			} else if (local82 == 0) {
				local82 = -1;
			} else if (local74 > local82) {
				local82 = local74;
			}
			Static81.anInt1698 += local82;
		}
		if (Static153.anInt3107 != local34) {
			local74 = local34 - Static153.anInt3107;
			local82 = (int) (arg0 * (long) local74 / 320L);
			if (local74 <= 0) {
				if (local82 == 0) {
					local82 = -1;
				} else if (local82 < local74) {
					local82 = local74;
				}
			} else if (local82 == 0) {
				local82 = 1;
			} else if (local82 > local74) {
				local82 = local74;
			}
			Static153.anInt3107 += local82;
		}
		Static123.method2037();
	}
}
