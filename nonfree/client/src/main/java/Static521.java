import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "Lclient!so;")
	public static final Class314 aClass314_12 = new Class314(0, 5);

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!ha;Lclient!tp;)V")
	public static void method7423(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class331 arg1) {
		@Pc(36) boolean local36 = Static497.aClass258_21.method6645(arg1.anInt9546, arg1.anInt9520, arg1.anInt9516, arg0, arg1.anInt9570, arg1.aBoolean685 ? Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1 : null, arg1.anInt9508 | 0xFF000000) == null;
		if (local36) {
			Static123.aClass43_20.method1424(new Class8_Sub21(arg1.anInt9570, arg1.anInt9516, arg1.anInt9546, arg1.anInt9508 | 0xFF000000, arg1.anInt9520, arg1.aBoolean685));
			Static86.method2113(arg1);
		}
	}
}
