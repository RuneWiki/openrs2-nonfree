import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
	public static int anInt3016;

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "S")
	public static short aShort22 = 32767;

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
	public static int anInt3007 = 500;

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "S")
	public static short aShort23 = 256;

	@OriginalMember(owner = "client!ke", name = "W", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!cg;Z)Lclient!lf;")
	public static Class1_Sub3 method2330(@OriginalArg(0) Class1_Sub11 arg0) {
		arg0.method2690();
		@Pc(13) int local13 = arg0.method2690();
		@Pc(23) Class1_Sub3 local23 = Static289.method4353(local13);
		local23.anInt5596 = arg0.method2690();
		@Pc(32) int local32 = arg0.method2690();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(41) int local41 = arg0.method2690();
			local23.method4449(arg0, local41);
		}
		local23.method4447();
		return local23;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIB)V")
	public static void method2332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class1_Sub2_Sub18 local12 = Static130.method2227(arg1, 9);
		local12.method3905();
		local12.anInt5005 = arg2;
		local12.anInt5000 = arg0;
	}
}
