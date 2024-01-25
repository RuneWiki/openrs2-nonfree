import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static401 {

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
	public static int anInt7056 = 0;

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "[B")
	public static final byte[] aByteArray86 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIBI)V")
	public static void method5877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static136.method2051(Static130.aClass160_36);
		}
		if (arg1 == 1) {
			Static136.method2051(Static438.aClass160_101);
		}
		Static218.aClass6_Sub14_Sub2_1.method5999(arg2 + Static167.anInt3048);
		Static218.aClass6_Sub14_Sub2_1.method5992(Static539.aClass88_1.method6348(82) ? 1 : 0);
		Static218.aClass6_Sub14_Sub2_1.method5999(arg0 + Static218.anInt3718);
		Static334.anInt5975 = arg0;
		Static16.anInt311 = arg2;
		Static190.aBoolean258 = false;
		Static201.method5196();
	}
}
