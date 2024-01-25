import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
	public static int anInt6898;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_116 = new Class242(69, 0);

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
	public static int anInt6900 = 0;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_113 = new Class142("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
	public static void method5492() {
		if (Static356.method4681(Static135.anInt2114) || Static309.method4100(Static135.anInt2114)) {
			Static337.method2721(5000, Static80.anInt1106 >> 10, Static386.anInt7155 >> 10);
		} else {
			@Pc(31) int local31 = Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray246[0] >> 3;
			@Pc(38) int local38 = Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray247[0] >> 3;
			if (local31 >= 0 && local31 < Static147.anInt2300 >> 3 && local38 >= 0 && local38 < Static293.anInt4886 >> 3) {
				Static337.method2721(5000, local38, local31);
			} else {
				Static337.method2721(0, Static293.anInt4886 >> 4, Static147.anInt2300 >> 4);
			}
		}
		Static296.method3925();
		Static380.method4903();
		Static35.method492();
		Static454.method5850();
	}
}
