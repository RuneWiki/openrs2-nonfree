import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!nh", name = "bb", descriptor = "Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3 aClass2_Sub3_Sub2_Sub3_3;

	@OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
	public static int anInt2749 = 0;

	@OriginalMember(owner = "client!nh", name = "W", descriptor = "Lclient!ai;")
	public static Class6 aClass6_786 = Static38.method685(":duelfriend:");

	@OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
	public static int anInt2752 = 0;

	@OriginalMember(owner = "client!nh", name = "ab", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBI)I")
	public static int method1828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
	public static void method1829() {
		for (@Pc(7) int local7 = -1; local7 < Static167.anInt3925; local7++) {
			@Pc(17) int local17;
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static156.anIntArray358[local7];
			}
			@Pc(25) Class2_Sub3_Sub5_Sub1_Sub1 local25 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local17];
			if (local25 != null) {
				Static103.method1706(1, local25);
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	public static void method1830() {
		aClass2_Sub3_Sub2_Sub3_3 = null;
		aClass6_786 = null;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
	public static void method1831() {
		@Pc(5) Object local5 = Static135.anObject4;
		synchronized (Static135.anObject4) {
			if (Static121.anInt2816 == 0) {
				Static107.aClass36_4.method1109(5, new Class64());
			}
			Static121.anInt2816 = 600;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBILclient!c;)[Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3[] method1832(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class10 arg2) {
		return Static152.method2334(arg1, arg0, arg2) ? Static63.method1009() : null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method1833(@OriginalArg(0) Class10 arg0) {
		Static170.aClass10_138 = arg0;
	}
}
