import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static624 {

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "Lclient!ae;")
	public static Class8 aClass8_139;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Z")
	public static boolean aBoolean712 = true;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(III)V")
	public static void method8608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static548.anInt9237 == 1) {
			Static347.method9040(arg0, Static391.aClass6_Sub4_Sub12_3, arg1);
		} else if (Static548.anInt9237 == 2) {
			if (Static594.aBoolean693) {
				Static441.method6455(Static314.method4504() + arg0, Static234.method3562() + arg1);
			} else {
				Static441.method6455(arg0, arg1);
			}
		}
		Static548.anInt9237 = 0;
		Static391.aClass6_Sub4_Sub12_3 = null;
	}
}
