import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_140 = new Class45(68, 0);

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_87 = new Class77(32, -1);

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_264 = new Class88("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)I")
	public static int method7392() {
		if (Static389.aBoolean533) {
			return 6;
		} else if (Static294.aClass12_Sub20_2 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static294.aClass12_Sub20_2.anInt4329;
			if (Static526.method7802(local14)) {
				return 1;
			} else if (Static179.method3558(local14)) {
				return 2;
			} else if (Static350.method5484(local14)) {
				return 3;
			} else if (Static197.method3743(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
