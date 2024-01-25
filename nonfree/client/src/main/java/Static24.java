import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!eu;")
	public static Class4_Sub14 aClass4_Sub14_1;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "I")
	public static int anInt435 = 0;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "[I")
	public static final int[] anIntArray26 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZIIII)V")
	public static void method364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static136.anInt2817 = arg0;
		Static67.anInt1637 = arg3;
		Static412.anInt7174 = arg4;
		Static242.anInt4727 = arg2;
		Static285.anInt5311 = arg1;
		if (Static67.anInt1637 >= 100) {
			@Pc(28) int local28 = Static242.anInt4727 * 128 + 64;
			@Pc(34) int local34 = Static285.anInt5311 * 128 + 64;
			@Pc(42) int local42 = Static21.method356(local28, local34, Static59.anInt1472) - Static136.anInt2817;
			@Pc(47) int local47 = local28 - Static235.anInt4645;
			@Pc(52) int local52 = local42 - Static405.anInt7103;
			@Pc(57) int local57 = local34 - Static108.anInt2350;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local47 * local47 + local57 * local57));
			Static439.anInt7477 = (int) (Math.atan2((double) local52, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static200.anInt3936 = (int) (-2607.5945876176133D * Math.atan2((double) local47, (double) local57)) & 0x3FFF;
			Static246.anInt4786 = 0;
			if (Static439.anInt7477 < 1024) {
				Static439.anInt7477 = 1024;
			}
			if (Static439.anInt7477 > 3072) {
				Static439.anInt7477 = 3072;
			}
		}
		Static275.anInt5173 = 2;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z")
	public static boolean method366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
