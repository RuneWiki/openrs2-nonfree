import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
	public static int anInt4807 = 0;

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_163 = new Class106(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "[I")
	public static final int[] anIntArray382 = new int[2048];

	@OriginalMember(owner = "client!pd", name = "cb", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_164 = new Class106("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
	public static void method4401() {
		Static51.aClass63_2.method4650(((float) Static140.anInt3021 * 0.1F + 0.7F) * 1.1523438F);
		Static51.aClass63_2.method4622(Static339.anInt6002, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static51.aClass63_2.method4629(Static28.anInt665, -1);
		Static51.aClass63_2.method4607(Static345.aClass13_4);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V")
	public static void method4402(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(arg0, 14);
		local8.method3481();
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(BI)V")
	public static void method4404() {
		Static162.aBoolean224 = false;
		Static310.anInt5974 = 1;
		Class11_Sub2_Sub3.lb = null;
		Static149.anInt3140 = -1;
		Static61.anInt1495 = 2;
		Static192.anInt3868 = 0;
		Static286.anInt5851 = -1;
	}
}
