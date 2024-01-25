import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fu", name = "O", descriptor = "[I")
	public static int[] anIntArray118;

	@OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
	public static int anInt2253;

	@OriginalMember(owner = "client!fu", name = "R", descriptor = "[I")
	public static final int[] anIntArray119 = new int[32];

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(IB)V")
	public static void method1833(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub1 local12 = Static190.method3007(arg0, 8);
		local12.method28();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IJ)V")
	public static void method1836(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static370.anInt7662;
		@Pc(14) int local14 = Static263.anInt4468;
		@Pc(22) int local22;
		@Pc(30) int local30;
		if (Static34.anInt572 != local7) {
			local22 = local7 - Static34.anInt572;
			local30 = (int) ((long) local22 * arg0 / 320L);
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
			Static34.anInt572 += local30;
		}
		if (Static241.anInt4245 != local14) {
			local22 = local14 - Static241.anInt4245;
			local30 = (int) ((long) local22 * arg0 / 320L);
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
			Static241.anInt4245 += local30;
		}
		if (!Static327.aClass230_Sub1_1.aBoolean621) {
			Static90.aFloat25 += (float) arg0 * Static1.aFloat2 / 40.0F * 8.0F;
			Static147.aFloat59 += Static285.aFloat4 * (float) arg0 / 40.0F * 8.0F;
		}
		Static412.method5593();
	}
}
