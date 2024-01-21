import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!h;")
	public static Class33 aClass33_14;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "[Lclient!ig;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1302 = Static65.method1172(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lclient!kb;")
	public static Class46 method2589(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static57.method1068(arg0) : Static24.aClass46_152;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ob;BIIII)V")
	public static void method2590(@OriginalArg(0) Class3_Sub2_Sub3_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		@Pc(19) int local19 = Static81.anInt2039 + Static29.anInt697 & 0x7FF;
		@Pc(28) int local28 = arg1 * arg1 + arg4 * arg4;
		if (local28 > 6400) {
			return;
		}
		@Pc(38) int local38 = Class3_Sub2_Sub3_Sub4.anIntArray346[local19];
		@Pc(42) int local42 = Class3_Sub2_Sub3_Sub4.anIntArray347[local19];
		@Pc(50) int local50 = local38 * 256 / (Static172.anInt3773 + 256);
		@Pc(58) int local58 = local42 * 256 / (Static172.anInt3773 + 256);
		@Pc(69) int local69 = arg4 * local50 - arg1 * local58 >> 16;
		@Pc(80) int local80 = arg4 * local58 + arg1 * local50 >> 16;
		if (local28 <= 2500) {
			arg0.method1880(local80 + arg3 + 4 + 94 - arg0.anInt2696 / 2, -(arg0.anInt2695 / 2) + -4 + -local69 + arg2 + 83);
		} else {
			arg0.method1876(Static54.aClass3_Sub2_Sub3_Sub2_2, local80 + arg3 + 98 - arg0.anInt2696 / 2, -(arg0.anInt2695 / 2) + -4 + -local69 + arg2 - -83);
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
	public static void method2591() {
		aLongArray6 = null;
		aClass38Array1 = null;
		aClass46_1302 = null;
		aClass33_14 = null;
	}
}
