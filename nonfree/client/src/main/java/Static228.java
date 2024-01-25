import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!iba", name = "P", descriptor = "[I")
	public static int[] anIntArray253;

	@OriginalMember(owner = "client!iba", name = "S", descriptor = "I")
	public static int anInt4471;

	@OriginalMember(owner = "client!iba", name = "U", descriptor = "[Lclient!s;")
	public static Class199[] aClass199Array2;

	@OriginalMember(owner = "client!iba", name = "ab", descriptor = "I")
	public static int anInt4473;

	@OriginalMember(owner = "client!iba", name = "Y", descriptor = "Lclient!sca;")
	public static Class302 aClass302_30 = null;

	@OriginalMember(owner = "client!iba", name = "Z", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_75 = new Class268(38, 0);

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(JI)V")
	public static void method3905(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 + Static107.anInt2107;
		@Pc(16) int local16 = Static526.anInt9147 + Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729;
		if (Static96.anInt1900 - local11 < -2000 || Static96.anInt1900 - local11 > 2000 || Static359.anInt6657 - local16 < -2000 || Static359.anInt6657 - local16 > 2000) {
			Static96.anInt1900 = local11;
			Static359.anInt6657 = local16;
		}
		@Pc(54) int local54;
		@Pc(62) int local62;
		if (Static96.anInt1900 != local11) {
			local54 = local11 - Static96.anInt1900;
			local62 = (int) ((long) local54 * arg0 / 320L);
			if (local54 <= 0) {
				if (local62 == 0) {
					local62 = -1;
				} else if (local62 < local54) {
					local62 = local54;
				}
			} else if (local62 == 0) {
				local62 = 1;
			} else if (local62 > local54) {
				local62 = local54;
			}
			Static96.anInt1900 += local62;
		}
		Static284.aFloat164 += Static48.aFloat15 * (float) arg0 / 6.0F;
		if (Static359.anInt6657 != local16) {
			local54 = local16 - Static359.anInt6657;
			local62 = (int) ((long) local54 * arg0 / 320L);
			if (local54 <= 0) {
				if (local62 == 0) {
					local62 = -1;
				} else if (local62 < local54) {
					local62 = local54;
				}
			} else if (local62 == 0) {
				local62 = 1;
			} else if (local62 > local54) {
				local62 = local54;
			}
			Static359.anInt6657 += local62;
		}
		Static591.aFloat197 += Static495.aFloat180 * (float) arg0 / 6.0F;
		Static27.method482();
	}
}
