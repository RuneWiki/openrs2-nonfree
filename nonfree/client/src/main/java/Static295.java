import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_87 = new Class45("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_88 = new Class45("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
	public static int anInt5594 = 0;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!g;)I")
	public static int method5137(@OriginalArg(1) Class110 arg0) {
		if (Static56.aClass110_3 == arg0) {
			return 6407;
		} else if (arg0 == Static171.aClass110_13) {
			return 6408;
		} else if (Static504.aClass110_22 == arg0) {
			return 6406;
		} else if (arg0 == Static281.aClass110_17) {
			return 6409;
		} else if (Static533.aClass110_25 == arg0) {
			return 6410;
		} else if (arg0 == Static264.aClass110_26) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!et;)V")
	public static void method5141(@OriginalArg(1) Class91 arg0) {
		if (!Static181.aBoolean310) {
			return;
		}
		if (arg0.anObjectArray14 != null) {
			@Pc(14) Class91 local14 = Static429.method6657(Static49.anInt1304, Static119.anInt2478);
			if (local14 != null) {
				@Pc(20) Class1_Sub10 local20 = new Class1_Sub10();
				local20.aClass91_3 = local14;
				local20.aClass91_2 = arg0;
				local20.anObjectArray4 = arg0.anObjectArray14;
				Static173.method3207(local20);
			}
		}
		Static216.method3997(Static304.aClass252_87);
		Static259.aClass1_Sub17_Sub2_1.method4489(arg0.anInt2368);
		Static259.aClass1_Sub17_Sub2_1.method4473(Static189.anInt3926);
		Static259.aClass1_Sub17_Sub2_1.method4473(Static119.anInt2478);
		Static259.aClass1_Sub17_Sub2_1.method4469(Static49.anInt1304);
		Static259.aClass1_Sub17_Sub2_1.method4459(arg0.anInt2391);
		Static259.aClass1_Sub17_Sub2_1.method4459(arg0.anInt2395);
	}
}
