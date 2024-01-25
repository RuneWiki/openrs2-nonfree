import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_45 = new Class55("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_46 = new Class55("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
	public static int anInt2084 = 10;

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "[Lclient!gk;")
	public static final Class7_Sub14[] aClass7_Sub14Array1 = new Class7_Sub14[2048];

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
	public static int anInt2085 = 0;

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
	public static int anInt2086 = 104;

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)V")
	public static void method1777() {
		Static221.anInt3902 = 0;
		@Pc(17) int local17 = Static359.anInt5713 + (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 >> 7);
		@Pc(24) int local24 = (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 >> 7) + Static314.anInt5181;
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static221.anInt3902 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static221.anInt3902 = 1;
		}
		if (Static221.anInt3902 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static221.anInt3902 = 0;
		}
	}
}
