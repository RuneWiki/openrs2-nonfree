import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
	public static int[] anIntArray374;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "Lclient!su;")
	public static final Class298 aClass298_97 = new Class298();

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_27 = new Class330(20);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method3886(@OriginalArg(0) Class90 arg0) {
		if (Static212.aClass298_207.method6815() == 0) {
			return;
		}
		@Pc(59) Class6_Sub9 local59;
		if (Static79.anInt2700 == 0) {
			for (local59 = (Class6_Sub9) Static212.aClass298_207.method6809(); local59 != null; local59 = (Class6_Sub9) Static212.aClass298_207.method6821()) {
				Static119.aClass244_4.method5718(Static266.aClass82_4, local59.anInt1079, local59.anInt1082, local59.anInt1081, local59.anInt1080, local59.aBoolean74 ? Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1 : null, arg0, local59.anInt1084, arg0, false, false);
				local59.method7948();
			}
			Static39.method645();
			return;
		}
		if (Static184.aClass90_6 == null) {
			@Pc(29) Canvas local29 = new Canvas();
			local29.setSize(36, 32);
			Static184.aClass90_6 = Static359.method7473(0, local29, 0, Static347.aClass248_58, Static214.anInterface2_13);
			Static437.aClass82_5 = Static184.aClass90_6.method7523(Static129.method1978(Static550.aClass248_107, Static297.anInt5459), Static593.method4140(Static114.aClass248_20, Static297.anInt5459));
		}
		for (local59 = (Class6_Sub9) Static212.aClass298_207.method6809(); local59 != null; local59 = (Class6_Sub9) Static212.aClass298_207.method6821()) {
			Static119.aClass244_4.method5718(Static437.aClass82_5, local59.anInt1079, local59.anInt1082, local59.anInt1081, local59.anInt1080, local59.aBoolean74 ? Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1 : null, arg0, local59.anInt1084, Static184.aClass90_6, false, false);
			local59.method7948();
		}
	}
}
