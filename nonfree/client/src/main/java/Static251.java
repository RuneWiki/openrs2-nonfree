import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static251 {

	@OriginalMember(owner = "client!on", name = "q", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_70 = new Class11(35, 8);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!vc;Lclient!nl;I)V")
	public static void method3966(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class171 arg1) {
		if (Static388.aBoolean471) {
			return;
		}
		arg0.method2020(0);
		Static290.aClass18_22 = arg0.method2000(Static397.method2333(arg1, Static5.anInt197));
		Static290.aClass18_22.method4558((Static253.anInt4467 - Static290.aClass18_22.method4564()) / 2, (Static362.anInt6102 - Static290.aClass18_22.method4560()) / 2);
		Static242.aClass18_20 = arg0.method2000(Static397.method2333(arg1, Static14.anInt358));
		Static242.aClass18_20.method4558((Static253.anInt4467 - Static242.aClass18_20.method4564()) / 2, 18);
		Static388.aBoolean471 = true;
	}
}
