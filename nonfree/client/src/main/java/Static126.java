import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "Lclient!nb;")
	public static Class15 aClass15_24;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "[I")
	public static int[] anIntArray315;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "Lclient!ca;")
	public static Class16 aClass16_7 = new Class16(5);

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
	public static int anInt2959 = 0;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray5 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!i;")
	private static Class41 aClass41_830 = Static184.method2923(")3");

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZILclient!rf;)V")
	public static void method2065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12_Sub3_Sub2 arg2) {
		if (arg0 == arg2.anInt3910 && arg0 != -1) {
			@Pc(11) Class2_Sub2_Sub9 local11 = Static14.method299(arg0);
			@Pc(14) int local14 = local11.anInt2338;
			if (local14 == 1) {
				arg2.anInt3958 = 0;
				arg2.anInt3927 = 0;
				arg2.anInt3965 = arg1;
				arg2.anInt3930 = 0;
				Static55.method1083(false, arg2.anInt3949, arg2.anInt3930, arg2.anInt3961, local11);
			}
			if (local14 == 2) {
				arg2.anInt3958 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt3910 == -1 || Static14.method299(arg0).anInt2360 >= Static14.method299(arg2.anInt3910).anInt2360) {
			arg2.anInt3927 = 0;
			arg2.anInt3965 = arg1;
			arg2.anInt3962 = arg2.anInt3960;
			arg2.anInt3930 = 0;
			arg2.anInt3958 = 0;
			arg2.anInt3910 = arg0;
			if (arg2.anInt3910 != -1) {
				Static55.method1083(false, arg2.anInt3949, arg2.anInt3930, arg2.anInt3961, Static14.method299(arg2.anInt3910));
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lclient!i;")
	public static Class41 method2066(@OriginalArg(1) int arg0) {
		return Static149.method2324(new Class41[] { Static152.method2471(arg0 >> 24 & 0xFF), aClass41_830, Static152.method2471(arg0 >> 16 & 0xFF), aClass41_830, Static152.method2471(arg0 >> 8 & 0xFF), aClass41_830, Static152.method2471(arg0 & 0xFF) });
	}
}
