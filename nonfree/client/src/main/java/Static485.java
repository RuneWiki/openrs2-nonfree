import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "Lclient!th;")
	public static Class318 aClass318_1;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_84 = new Class70(21, 7);

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
	public static int anInt8173 = -1;

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray180 = new int[128][128];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)I")
	public static int method6556(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIII)V")
	public static void method6557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static273.anInt4793 = arg4;
		Static336.anInt5683 = arg1;
		Static319.anInt5419 = arg3;
		Static581.anInt6126 = arg0;
		Static432.anInt7579 = arg2;
		if (Static581.anInt6126 >= 100) {
			@Pc(28) int local28 = Static319.anInt5419 * 512 + 256;
			@Pc(34) int local34 = Static273.anInt4793 * 512 + 256;
			@Pc(42) int local42 = Static66.method1191(local28, Static433.anInt7592, local34) - Static432.anInt7579;
			@Pc(46) int local46 = local28 - Static405.anInt7085;
			@Pc(51) int local51 = local42 - Static295.anInt5077;
			@Pc(55) int local55 = local34 - Static59.anInt1132;
			@Pc(67) int local67 = (int) Math.sqrt((double) (local46 * local46 + local55 * local55));
			Static103.anInt2093 = (int) (Math.atan2((double) local51, (double) local67) * 2607.5945876176133D) & 0x3FFF;
			Static561.anInt9344 = (int) (-2607.5945876176133D * Math.atan2((double) local46, (double) local55)) & 0x3FFF;
			Static395.anInt6894 = 0;
			if (Static103.anInt2093 < 1024) {
				Static103.anInt2093 = 1024;
			}
			if (Static103.anInt2093 > 3072) {
				Static103.anInt2093 = 3072;
			}
		}
		Static340.anInt5707 = 2;
		Static243.anInt4483 = -1;
		Static442.anInt7679 = -1;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!vh;B)Z")
	public static boolean method6559(@OriginalArg(0) int arg0, @OriginalArg(1) Class342 arg1) {
		Static301.aClass113_5.method6107(arg1.anIntArray706[arg0], arg1.anIntArray704[arg0], arg1.anIntArray705[arg0], Static247.anIntArray356);
		@Pc(22) int local22 = Static247.anIntArray356[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray144[arg0] = (short) (Static526.anInt8861 * Static247.anIntArray356[0] / local22 + Static18.anInt222);
			arg1.aShortArray143[arg0] = (short) (Static187.anInt8345 * Static247.anIntArray356[1] / local22 + Static299.anInt5149);
			arg1.aShortArray145[arg0] = (short) local22;
			return true;
		}
	}
}
