import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
	public static int anInt7447;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_169 = new Class265(7, 12);

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_170 = new Class265(44, 6);

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_167 = new Class209("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "[I")
	public static final int[] anIntArray636 = new int[1000];

	@OriginalMember(owner = "client!wv", name = "t", descriptor = "[I")
	public static final int[] anIntArray637 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!ya;Lclient!mg;B)V")
	public static void method5860(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class160 arg1) {
		if (Static327.aBoolean400) {
			return;
		}
		arg0.p(0);
		Static346.aClass17_45 = arg0.method4435(Static459.method2066(arg1, Static353.anInt5979));
		Static346.aClass17_45.method5767((Static86.anInt4394 - Static346.aClass17_45.j()) / 2, (Static395.anInt6582 - Static346.aClass17_45.T()) / 2);
		Static163.aClass17_48 = arg0.method4435(Static459.method2066(arg1, Static367.anInt6303));
		Static163.aClass17_48.method5767((Static86.anInt4394 - Static163.aClass17_48.j()) / 2, 18);
		Static327.aBoolean400 = true;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!em;III)V")
	public static void method5861(@OriginalArg(0) Class68 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray4 != null) {
			@Pc(13) Class2_Sub30 local13 = new Class2_Sub30();
			local13.aClass68_12 = arg0;
			local13.anObjectArray35 = arg0.anObjectArray4;
			Static168.method2731(local13);
		}
		Static323.anInt5618 = arg0.anInt2201;
		Static54.anInt1162 = arg0.anInt2196;
		Static385.aBoolean441 = true;
		Static423.anInt7418 = arg0.anInt2208;
		Static142.anInt3047 = arg0.anInt2229;
		Static154.anInt3161 = arg0.anInt2215;
		Static404.anInt6738 = arg2;
		Static201.anInt3539 = arg1;
		Static78.method1460(arg0);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIZBZ)V")
	public static void method5862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static290.method4177(Static397.aClass219_Sub1Array3.length - 1, arg1, 0, arg3, arg0, arg2);
		Static11.anInt286 = 0;
		Static353.aClass2_Sub36_2 = null;
	}
}
