import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3 aClass1_Sub2_Sub8_Sub3_4;

	@OriginalMember(owner = "client!sf", name = "S", descriptor = "Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2 aClass1_Sub2_Sub8_Sub2_4;

	@OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
	public static int anInt3846;

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
	public static volatile int anInt3844 = 0;

	@OriginalMember(owner = "client!sf", name = "T", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1101 = Static81.method1507("New User");

	@OriginalMember(owner = "client!sf", name = "ab", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1102 = aClass24_1101;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)Z")
	public static boolean method2976(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(29) Class1_Sub2_Sub5 local29 = Static37.method702(arg1);
		return local29.method690(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "()V")
	public static void method2978() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static143.anInt3201; local1++) {
			for (local4 = 0; local4 < Static60.anInt3602; local4++) {
				for (local7 = 0; local7 < Static18.anInt3874; local7++) {
					Static29.aClass1_Sub8ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static19.anInt464; local4++) {
			for (local7 = 0; local7 < Static19.anIntArray40[local4]; local7++) {
				Static19.aClass61ArrayArray1[local4][local7] = null;
			}
			Static19.anIntArray40[local4] = 0;
		}
		for (local7 = 0; local7 < Static200.anInt4471; local7++) {
			Static89.aClass51Array2[local7] = null;
		}
		Static200.anInt4471 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static194.aClass51Array3.length; local69++) {
			Static194.aClass51Array3[local69] = null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ve;Lclient!ve;B)V")
	public static void method2979(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1) {
		Static60.aClass69_32 = arg0;
		Static48.aClass69_12 = arg1;
	}
}
