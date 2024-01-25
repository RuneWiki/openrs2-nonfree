import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static255 {

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
	public static int anInt4965 = 0;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "Lclient!ba;")
	public static final Class17 aClass17_20 = new Class17(64);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public static void method4299() {
		if (Static314.aClass183_2 != null) {
			Static314.aClass183_2.method7422();
		}
		if (Static203.aClass183_1 != null) {
			Static203.aClass183_1.method7422();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
	public static void method4304() {
		Static149.aClass66_1.method1580();
		Static498.aClass5_1.method7047();
		Static230.aClient2.method1218();
		Static105.aCanvas3.setBackground(Color.black);
		Static433.anInt7523 = -1;
		Static149.aClass66_1 = Static105.method1786(Static105.aCanvas3);
		Static498.aClass5_1 = Static364.method5423(Static105.aCanvas3);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Z")
	public static boolean method4305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static500.method5192(arg0, arg1) & Static108.method1860(arg1, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IFFF)F")
	public static float method4306(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 + arg0 * (arg2 - arg1);
	}
}
