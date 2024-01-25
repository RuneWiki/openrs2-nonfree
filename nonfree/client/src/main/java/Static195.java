import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "Lclient!mt;")
	public static final Class165 aClass165_7 = new Class165(12, 0, 1, 0);

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_124 = new Class67(16, -2);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!ir;Z)V")
	public static void method2806(@OriginalArg(0) Class11_Sub1_Sub3_Sub2 arg0) {
		@Pc(17) Class1_Sub35 local17 = (Class1_Sub35) Static263.aClass208_28.method4405((long) arg0.anInt3279);
		if (local17 == null) {
			Static123.method1515(0, arg0.anIntArray246[0], null, arg0.anIntArray247[0], arg0.aByte90, arg0, null);
		} else {
			local17.method4222();
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	public static void method2810() {
		if (Static80.anInt1103 != -1) {
			method2811(Static80.anInt1103, false, -1, -1);
			Static80.anInt1103 = -1;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZBII)V")
	public static void method2811(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static214.anInt3968 == 0) {
			Static327.method4302(false);
		} else {
			Static154.anInt2385 = Static214.anInt3968;
			Static422.method5393(0);
		}
		Static380.aBoolean539 = arg1;
		Static72.anInt1049 = arg2;
		Static270.anInt1981 = arg3;
		Static430.method3274(arg0);
	}
}
