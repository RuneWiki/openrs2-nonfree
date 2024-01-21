import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "[I")
	public static int[] anIntArray13 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "Lclient!cd;")
	private static Class10 aClass10_96 = Static51.method932("Create a free account");

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "Lclient!cd;")
	public static Class10 aClass10_97 = aClass10_96;

	@OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
	public static int anInt173 = -1;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
	public static void method118() {
		aClass10_97 = null;
		anIntArray13 = null;
		aClass10_96 = null;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIB)I")
	public static int method119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(35) int local35 = local16 * (local16 * 15731 * local16 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
	public static void method120() {
		if (!Static119.aBoolean119) {
			Static80.aClass10Array14[0] = Static135.aClass10_1305;
			Static75.aClass10Array12[0] = Static63.aClass10_687;
			Static46.anInt1135 = 1;
			Static93.anIntArray229[0] = 1003;
		}
		if (Static107.anInt2446 != -1) {
			Static70.method1184(Static107.anInt2446);
		}
		for (@Pc(34) int local34 = 0; local34 < Static5.anInt119; local34++) {
			if (Static152.aBooleanArray14[local34]) {
				Static170.aBooleanArray18[local34] = true;
			}
			Static179.aBooleanArray20[local34] = Static152.aBooleanArray14[local34];
			Static152.aBooleanArray14[local34] = false;
		}
		Static142.anInt3158 = Static14.anInt386;
		Static154.anInt3326 = -1;
		Static89.anInt2095 = -1;
		Static29.aClass23_2 = null;
		if (Static107.anInt2446 != -1) {
			Static5.anInt119 = 0;
			Static101.method1660(0, 0, 0, 765, -1, 0, 503, Static107.anInt2446);
		}
		Static172.method2022();
		Static24.method389();
		if (Static119.aBoolean119) {
			Static143.method2253();
		} else if (Static89.anInt2095 != -1) {
			Static70.method1187(Static154.anInt3326, Static89.anInt2095);
		}
		if (Static24.anInt566 == 3) {
			for (@Pc(103) int local103 = 0; local103 < Static5.anInt119; local103++) {
				if (Static179.aBooleanArray20[local103]) {
					Static172.method2016(Static72.anIntArray187[local103], Static109.anIntArray255[local103], Static101.anIntArray244[local103], Static159.anIntArray360[local103], 16711935, 128);
				} else if (Static170.aBooleanArray18[local103]) {
					Static172.method2016(Static72.anIntArray187[local103], Static109.anIntArray255[local103], Static101.anIntArray244[local103], Static159.anIntArray360[local103], 16711680, 128);
				}
			}
		}
		Static119.method1925(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454, Static123.anInt2778, Static56.anInt1432);
		Static123.anInt2778 = 0;
	}
}
