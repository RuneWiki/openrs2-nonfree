import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1546 = Static161.method2452("wave2:");

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1547 = aClass20_1546;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1549 = Static161.method2452(" is already on your friend list)3");

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1548 = aClass20_1549;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1550 = aClass20_1546;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "Z")
	public static boolean aBoolean188 = true;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Z")
	public static boolean method3179(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIBIIII)V")
	public static void method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static27.anInt493 <= arg2 && arg1 <= Static72.anInt1572 && arg4 >= Static173.anInt3464 && Static174.anInt3493 >= arg3) {
			if (arg5 == 1) {
				Static126.method793(arg2, arg4, arg3, arg1, arg0);
			} else {
				Static100.method1689(arg3, arg5, arg1, arg2, arg0, arg4);
			}
		} else if (arg5 == 1) {
			Static184.method2784(arg0, arg3, arg4, arg2, arg1);
		} else {
			Static73.method1192(arg2, arg0, arg4, arg5, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!dc;Lclient!wa;BLclient!dc;)[Lclient!ng;")
	public static Class47_Sub1[] method3181(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(13) int local13 = arg1.method734(arg0);
		@Pc(19) int local19 = arg1.method737(arg2, local13);
		return Static136.method2112(local13, arg1, local19);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)J")
	public static long method3183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass73_1 == null ? 0L : local7.aClass73_1.aLong154;
	}
}
