import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "Z")
	public static boolean aBoolean29 = true;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "Z")
	public static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
	public static int anInt458 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(JI)V")
	public static void method551(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static332.anInt5822;
		@Pc(15) int local15 = Static290.anInt5133;
		@Pc(22) int local22;
		@Pc(30) int local30;
		if (Static243.anInt4394 != local7) {
			local22 = local7 - Static243.anInt4394;
			local30 = (int) (arg0 * (long) local22 / 320L);
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
			Static243.anInt4394 += local30;
		}
		if (!Static223.aBoolean308) {
			Static295.aFloat73 += Static85.aFloat18 * (float) arg0 / 40.0F * 8.0F;
			Static18.aFloat8 += (float) arg0 * Static375.aFloat45 / 40.0F * 8.0F;
		}
		if (Static301.anInt5428 != local15) {
			local22 = local15 - Static301.anInt5428;
			local30 = (int) (arg0 * (long) local22 / 320L);
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
			Static301.anInt5428 += local30;
		}
		Static203.method3381();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!cs;I)V")
	public static void method552(@OriginalArg(0) Class41 arg0) {
		Static39.aClass2_Sub13_Sub2_4.method4253(arg0.method919());
	}
}
