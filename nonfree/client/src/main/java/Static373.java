import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_117 = new Class186(28, 11);

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_118 = new Class186(42, 3);

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "[I")
	public static final int[] anIntArray355 = new int[25];

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
	public static int anInt6383 = 0;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V")
	public static void method5411() {
		Static470.method6951();
		@Pc(12) int local12 = Static713.aClass3_Sub55_31.aClass15_Sub2_1.method857();
		if (local12 == 2) {
			Static691.method9072(Static488.aClass67_12, Static575.anInt9435, Static272.anInt5005);
		} else if (local12 == 3) {
			Static455.method6748(Static178.anInt3228, Static575.anInt9435, Static488.aClass67_12, Static272.anInt5005, Static634.anInt10262);
		}
		if (Static713.aClass3_Sub55_31.aClass15_Sub2_1.method851()) {
			Static491.method7117(Static67.aCanvas1);
		}
		if (Static488.aClass67_12 != null) {
			Static357.method5132();
		}
		Static568.aBoolean784 = Static713.aClass3_Sub55_31.aClass15_Sub2_1.method857() != 0;
		Static178.aBoolean264 = Static713.aClass3_Sub55_31.aClass15_Sub2_1.method851();
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)Lclient!cq;")
	public static Class19_Sub2 method5413() {
		@Pc(8) Class19_Sub2 local8 = (Class19_Sub2) Static641.aClass66_10.method1376();
		if (local8 == null) {
			return new Class19_Sub2();
		} else {
			Static55.anInt908--;
			return local8;
		}
	}
}
