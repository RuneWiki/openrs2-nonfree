import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
	public static int anInt1760;

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "Lclient!f;")
	public static Class39 aClass39_5;

	@OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
	public static int anInt1767;

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
	public static int anInt1761 = 0;

	@OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
	public static int anInt1768 = 0;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(JI)V")
	public static void method1273(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static156.anInt8481;
		@Pc(9) int local9 = Static433.anInt7318;
		@Pc(22) int local22;
		@Pc(30) int local30;
		if (Static553.anInt9056 != local7) {
			local22 = local7 - Static553.anInt9056;
			local30 = (int) (arg0 * (long) local22 / 320L);
			if (local22 > 0) {
				if (local30 == 0) {
					local30 = 1;
				} else if (local30 > local22) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = -1;
			} else if (local22 > local30) {
				local30 = local22;
			}
			Static553.anInt9056 += local30;
		}
		if (local9 != Static264.anInt4870) {
			local22 = local9 - Static264.anInt4870;
			local30 = (int) ((long) local22 * arg0 / 320L);
			if (local22 > 0) {
				if (local30 == 0) {
					local30 = 1;
				} else if (local22 < local30) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = -1;
			} else if (local30 < local22) {
				local30 = local22;
			}
			Static264.anInt4870 += local30;
		}
		if (!Static72.aClass2_Sub12_Sub1_1.aBoolean151) {
			Static412.aFloat13 += (float) arg0 * Static402.aFloat205 / 40.0F * 8.0F;
			Static447.aFloat233 += Static11.aFloat8 * (float) arg0 / 40.0F * 8.0F;
		}
		Static274.method4150();
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)Z")
	public static boolean method1275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static91.method1445(arg0, arg1) || Static222.method3494(arg0, arg1);
	}
}
