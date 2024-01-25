import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	public static int anInt8005;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
	public static int anInt8007;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!kg;I)V")
	public static void method6972(@OriginalArg(0) Class3_Sub1_Sub2_Sub2 arg0) {
		if (arg0 instanceof Class3_Sub1_Sub2_Sub2_Sub2) {
			@Pc(24) Class3_Sub1_Sub2_Sub2_Sub2 local24 = (Class3_Sub1_Sub2_Sub2_Sub2) arg0;
			if (local24.aClass345_1 != null) {
				Static152.method2629(local24, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 != local24.aByte141);
			}
		} else if (arg0 instanceof Class3_Sub1_Sub2_Sub2_Sub1) {
			@Pc(8) Class3_Sub1_Sub2_Sub2_Sub1 local8 = (Class3_Sub1_Sub2_Sub2_Sub1) arg0;
			Static76.method1619(local8, local8.aByte141 != Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141);
		}
	}
}
