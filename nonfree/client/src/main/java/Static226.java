import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	public static int anInt4491;

	@OriginalMember(owner = "client!re", name = "B", descriptor = "[I")
	public static int[] anIntArray399 = new int[2048];

	@OriginalMember(owner = "client!re", name = "C", descriptor = "I")
	public static int anInt4504 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method3550() {
		if (Static57.aClass94_1 != null) {
			@Pc(5) Class94 local5 = Static57.aClass94_1;
			synchronized (Static57.aClass94_1) {
				Static57.aClass94_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!km;III)[Lclient!tj;")
	public static Class12_Sub2[] method3553(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1) {
		return Static240.method3698(0, arg1, arg0) ? Static236.method3628() : null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!in;III)V")
	public static void method3554(@OriginalArg(0) Class71 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static134.anInt2945 < 2 && Static191.anInt3934 == 0 && !Static125.aBoolean209) {
			return;
		}
		@Pc(24) String local24 = Static141.method2344();
		if (arg0 == null) {
			@Pc(41) int local41 = Static134.aClass1_Sub2_Sub1_3.method462(local24, arg1 + 4, arg2 - -15, Static183.aRandom3, Static170.anInt3640);
			Static75.method1309(Static134.aClass1_Sub2_Sub1_3.method451(local24) + local41, 15, arg2, arg1 + 4);
			return;
		}
		@Pc(60) Class1_Sub2_Sub1 local60 = arg0.method2102(Static221.aClass12Array6);
		if (local60 == null) {
			local60 = Static134.aClass1_Sub2_Sub1_3;
		}
		local60.method463(local24, arg1, arg2, arg0.anInt2722, arg0.anInt2698, arg0.anInt2691, arg0.anInt2690, arg0.anInt2660, arg0.anInt2639, Static183.aRandom3, Static170.anInt3640, Static81.anIntArray163);
		Static75.method1309(Static81.anIntArray163[2], Static81.anIntArray163[3], Static81.anIntArray163[1], Static81.anIntArray163[0]);
	}
}
