import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_106 = new Class349(27, 7);

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(Lclient!oh;B)V")
	public static void method6624(@OriginalArg(0) Class273 arg0) {
		if (Static54.anInt876 != arg0.anInt7401) {
			return;
		}
		if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString4 == null) {
			arg0.anInt7420 = 0;
			arg0.anInt7391 = 0;
			return;
		}
		arg0.anInt7335 = 150;
		arg0.anInt7390 = (int) (Math.sin((double) Static528.anInt8386 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt7354 = 5;
		arg0.anInt7420 = Class4_Sub2_Sub1_Sub2.lb;
		arg0.anInt7391 = Static673.method9170(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString4);
		@Pc(54) Class53 local54 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass53_6;
		if (local54 == null) {
			arg0.aClass53_8 = null;
			return;
		}
		if (arg0.aClass53_8 == null) {
			arg0.aClass53_8 = new Class53_Sub2();
		}
		arg0.anInt7337 = local54.method4088();
		arg0.aClass53_8.method4084(local54);
	}
}
