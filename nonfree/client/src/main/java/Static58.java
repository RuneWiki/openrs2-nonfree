import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cda", name = "i", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
	public static int anInt1424 = 0;

	@OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
	public static int anInt1425 = 0;

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "[I")
	public static final int[] anIntArray137 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIII)I")
	public static int method1432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(31) int local31 = local17 * (arg2 & 0x7F) + arg0 * (arg1 & 0x7F) >> 7;
		@Pc(46) int local46 = (arg2 & 0x380) * local17 + (arg1 & 0x380) * arg0 >> 7;
		@Pc(60) int local60 = (arg2 & 0xFC00) * local17 + (arg1 & 0xFC00) * arg0 >> 7;
		return local31 & 0x7F | local60 & 0xFC00 | local46 & 0x380;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(II)V")
	public static void method1433(@OriginalArg(1) int arg0) {
		Static174.anInt3956 = arg0;
		@Pc(7) Class125 local7 = Static218.aClass125_30;
		synchronized (Static218.aClass125_30) {
			Static218.aClass125_30.method3440();
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z")
	public static boolean method1436(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static267.method4551(arg0, arg1)) {
			return Static208.method3862(arg0, arg1) | (arg1 & 0x9000) != 0 | Static273.method4587(arg0, arg1) ? true : ((arg1 & 0x2000) != 0 | Static353.method5526(arg1, arg0) | Static103.method2114(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
