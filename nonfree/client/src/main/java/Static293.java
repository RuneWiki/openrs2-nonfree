import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!so", name = "x", descriptor = "[[[Lclient!jd;")
	public static Class106[][][] aClass106ArrayArrayArray3;

	@OriginalMember(owner = "client!so", name = "A", descriptor = "[I")
	public static int[] anIntArray451;

	@OriginalMember(owner = "client!so", name = "y", descriptor = "I")
	public static int anInt5807 = 0;

	@OriginalMember(owner = "client!so", name = "z", descriptor = "[I")
	public static final int[] anIntArray450 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLclient!oo;)V")
	public static void method4877(@OriginalArg(1) Class67_Sub3_Sub3 arg0) {
		if (arg0 instanceof Class67_Sub3_Sub3_Sub1) {
			@Pc(14) Class67_Sub3_Sub3_Sub1 local14 = (Class67_Sub3_Sub3_Sub1) arg0;
			if (local14.aClass82_1 != null) {
				Static344.method5606(local14);
				return;
			}
		} else if (arg0 instanceof Class67_Sub3_Sub3_Sub2) {
			Static128.method1985((Class67_Sub3_Sub3_Sub2) arg0);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(I)V")
	public static void method4878() {
		if (Static126.aClass78_4 != null) {
			Static126.aClass78_4.method5505();
		}
		if (Static143.aClass78_3 != null) {
			Static143.aClass78_3.method5505();
		}
		Static310.method5247(Static210.aBoolean289);
		Static126.aClass78_4 = Static186.method3220(22050, Static34.aCanvas1, Static77.aClass118_7, 0);
		Static126.aClass78_4.method5507(Static267.aClass11_Sub10_Sub4_2);
		Static143.aClass78_3 = Static186.method3220(2048, Static34.aCanvas1, Static77.aClass118_7, 1);
		Static143.aClass78_3.method5507(Static341.aClass11_Sub10_Sub3_2);
	}
}
