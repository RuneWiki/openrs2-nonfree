import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
	public static int anInt848;

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "[I")
	public static int[] anIntArray59;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString36 = "white:";

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)V")
	public static void method604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static66.aClass8_Sub2_Sub1_4.anInt2955 = 0;
		Static66.aClass8_Sub2_Sub1_4.method2340(20);
		Static66.aClass8_Sub2_Sub1_4.method2340(arg0);
		Static66.aClass8_Sub2_Sub1_4.method2340(arg3);
		Static66.aClass8_Sub2_Sub1_4.method2333(arg1);
		Static66.aClass8_Sub2_Sub1_4.method2333(arg2);
		Static230.anInt4668 = 1;
		Static90.anInt1918 = 0;
		Static214.anInt4413 = 0;
		Static242.anInt4854 = -3;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method605() {
		@Pc(7) int local7;
		@Pc(17) int local17;
		for (local7 = -1; local7 < Static61.anInt1336; local7++) {
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static85.anIntArray123[local7];
			}
			@Pc(25) Class36_Sub3_Sub1 local25 = Static230.aClass36_Sub3_Sub1Array1[local17];
			if (local25 != null && local25.anInt4115 > 0) {
				local25.anInt4115--;
				if (local25.anInt4115 == 0) {
					local25.aString146 = null;
				}
			}
		}
		for (local7 = 0; local7 < Static135.anInt2729; local7++) {
			local17 = Static191.anIntArray285[local7];
			@Pc(72) Class36_Sub3_Sub2 local72 = Static48.aClass36_Sub3_Sub2Array1[local17];
			if (local72 != null && local72.anInt4115 > 0) {
				local72.anInt4115--;
				if (local72.anInt4115 == 0) {
					local72.aString146 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
	public static void method607() {
		Static190.aClass61_33.method1378();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([SI)[S")
	public static short[] method608(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) short[] local17 = new short[arg0.length];
			Static301.method499(arg0, 0, local17, 0, arg0.length);
			return local17;
		}
	}
}
