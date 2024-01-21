import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public static int anInt3734 = -1;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	public static int anInt3741 = 0;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!nh", name = "U", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)I")
	public static int method2857(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local9 << 13 ^ local9;
		@Pc(37) int local37 = Integer.MAX_VALUE & local23 * (local23 * local23 * 15731 + 789221) + 1376312589;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public static void method2861() {
		Static182.anInt4082 = 0;
		Static82.anInt2114 = 0;
		Static176.method3046();
		Static137.method2395();
		Static102.method1953();
		Static84.method3154();
		@Pc(30) int local30;
		for (@Pc(19) int local19 = 0; local19 < Static82.anInt2114; local19++) {
			local30 = Static130.anIntArray291[local19];
			if (Static142.anInt3325 != Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local30].anInt2830) {
				Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local30] = null;
			}
		}
		if (Static162.aClass4_Sub11_Sub1_3.anInt1597 != Static132.anInt3166) {
			throw new RuntimeException("gpp1 pos:" + Static162.aClass4_Sub11_Sub1_3.anInt1597 + " psize:" + Static132.anInt3166);
		}
		for (local30 = 0; local30 < Static126.anInt3006; local30++) {
			if (Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[Static167.anIntArray369[local30]] == null) {
				throw new RuntimeException("gpp2 pos:" + local30 + " size:" + Static126.anInt3006);
			}
		}
	}
}
