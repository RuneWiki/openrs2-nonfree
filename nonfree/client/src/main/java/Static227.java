import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!op", name = "h", descriptor = "Lclient!wo;")
	public static Class216 aClass216_77;

	@OriginalMember(owner = "client!op", name = "v", descriptor = "I")
	public static int anInt4728;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_138 = new Class34("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!op", name = "i", descriptor = "I")
	public static int anInt4722 = 0;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "I")
	public static int anInt4727 = -1;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method4237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static279.method4856(arg5)) {
			Static44.method1016(Static348.aClass12ArrayArray1[arg5], -1, arg8, arg4, arg1, arg7, arg2, arg0, arg6, arg3);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!uo;Z)V")
	public static void method4238(@OriginalArg(0) Class32 arg0) {
		if (Static163.aClass16_16.method414() == 0) {
			return;
		}
		@Pc(32) Class1_Sub10 local32;
		if (Static306.anInt6046 == 0 || Static306.anInt6046 == 2) {
			for (local32 = (Class1_Sub10) Static163.aClass16_16.method410(); local32 != null; local32 = (Class1_Sub10) Static163.aClass16_16.method419()) {
				Static308.method2776(arg0, false, local32.anInt1546, local32.anInt1544, Static56.aClass9_2, local32.anInt1542, false, arg0, local32.anInt1539, local32.aBoolean151 ? Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1 : null, local32.anInt1545);
				local32.method5628();
			}
			Static45.method1050();
			return;
		}
		if (Static342.aClass32_8 == null) {
			@Pc(78) Canvas local78 = new Canvas();
			local78.setSize(36, 32);
			Static342.aClass32_8 = Static326.method2152(Static357.anInterface2_7, 0, local78, Static15.aClass143_1, 0);
			Static338.aClass9_4 = Static342.aClass32_8.method2199(Static7.method272(Static337.anInt6460, Static34.aClass216_8), Static366.method2659(Static193.aClass216_64, Static337.anInt6460));
		}
		for (local32 = (Class1_Sub10) Static163.aClass16_16.method410(); local32 != null; local32 = (Class1_Sub10) Static163.aClass16_16.method419()) {
			Static308.method2776(Static342.aClass32_8, false, local32.anInt1546, local32.anInt1544, Static338.aClass9_4, local32.anInt1542, false, arg0, local32.anInt1539, local32.aBoolean151 ? Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1 : null, local32.anInt1545);
			local32.method5628();
		}
	}
}
