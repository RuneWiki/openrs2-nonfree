import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
	public static int anInt5549;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
	public static int anInt5550;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_214 = new Class67(58, -1);

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_92 = new Class242(79, 4);

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_93 = new Class242(55, 4);

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_84 = new Class142("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(B)V")
	public static void method4460() {
		if (!Static112.aBoolean186) {
			return;
		}
		while (true) {
			while (Static13.aClass239_Sub1Array1.length > Static89.anInt1205) {
				@Pc(22) Class239_Sub1 local22 = Static13.aClass239_Sub1Array1[Static89.anInt1205];
				if (local22 != null && local22.anInt6359 == -1) {
					if (Static18.aClass1_Sub17_4 == null) {
						Static18.aClass1_Sub17_4 = Static93.aClass217_1.method4582(local22.aString65);
					}
					@Pc(45) int local45 = Static18.aClass1_Sub17_4.anInt2301;
					if (local45 == -1) {
						return;
					}
					Static89.anInt1205++;
					Static18.aClass1_Sub17_4 = null;
					local22.anInt6359 = local45;
				} else {
					Static89.anInt1205++;
				}
			}
			return;
		}
	}
}
