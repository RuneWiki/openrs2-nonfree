import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!al", name = "v", descriptor = "I")
	public static int anInt7796;

	@OriginalMember(owner = "client!al", name = "C", descriptor = "Lclient!aj;")
	public static Class15 aClass15_119;

	@OriginalMember(owner = "client!al", name = "w", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_117 = new Class218(76, 6);

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)Z")
	public static boolean method6839() {
		@Pc(15) Class3_Sub21 local15 = (Class3_Sub21) Static274.aClass338_121.method8177();
		if (local15 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < local15.anInt2595; local21++) {
			if (local15.aClass81Array1[local21] != null && local15.aClass81Array1[local21].anInt2532 == 0) {
				return false;
			}
			if (local15.aClass81Array2[local21] != null && local15.aClass81Array2[local21].anInt2532 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V")
	public static void method6841() {
		Static496.method7120(Static24.aClass3_Sub22_4.aClass6_Sub18_1.method6575() == 1);
		Static98.aClass127_3 = Static403.method5707(Static126.aCanvas6, 0, Static247.aClass291_1, 22050);
		Static126.method2376(Static267.method4374((Class3_Sub1_Sub3) null));
		Static433.aClass127_9 = Static403.method5707(Static126.aCanvas6, 1, Static247.aClass291_1, 2048);
		Static313.aClass3_Sub1_Sub2_1 = new Class3_Sub1_Sub2();
		Static433.aClass127_9.method7565(Static313.aClass3_Sub1_Sub2_1);
		Static36.aClass225_1 = new Class225(22050, Static348.anInt5701);
		Static476.method6888();
	}
}
