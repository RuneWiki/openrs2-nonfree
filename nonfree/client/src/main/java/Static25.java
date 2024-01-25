import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
	public static int anInt766;

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_6 = new Class144(79, -1);

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
	public static void method710() {
		for (@Pc(10) Class3_Sub50 local10 = (Class3_Sub50) Static55.aClass313_7.method7103(); local10 != null; local10 = (Class3_Sub50) Static55.aClass313_7.method7110()) {
			if (local10.aClass253_Sub1_1.method7288()) {
				Static56.method1314(local10.anInt8252);
			} else {
				local10.aClass253_Sub1_1.method7303();
				try {
					local10.aClass253_Sub1_1.method7285();
				} catch (@Pc(36) Exception local36) {
					Static275.method4893("TV: " + local10.anInt8252, local36);
					Static56.method1314(local10.anInt8252);
				}
				if (!local10.aBoolean552 && !local10.aBoolean555) {
					@Pc(68) Class3_Sub32_Sub2 local68 = local10.aClass253_Sub1_1.method7293();
					if (local68 != null) {
						@Pc(76) Class3_Sub33_Sub1 local76 = local68.method5620();
						if (local76 != null) {
							local76.method4820(local10.anInt8250);
							Static391.aClass3_Sub33_Sub4_1.method8545(local76);
							local10.aBoolean552 = true;
						}
					}
				}
			}
		}
	}
}
