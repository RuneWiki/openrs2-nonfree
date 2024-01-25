import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!og", name = "n", descriptor = "Lclient!uda;")
	public static Class286 aClass286_1;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "Lclient!h;")
	public static final Class114 aClass114_125 = new Class114("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!og", name = "m", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_103 = new Class6(7, 2);

	@OriginalMember(owner = "client!og", name = "o", descriptor = "I")
	public static int anInt6398 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ee;Z)I")
	public static int method5542(@OriginalArg(0) Class74 arg0) {
		if (Static193.aClass74_2 == arg0) {
			return 9216;
		} else if (Static200.aClass74_3 == arg0) {
			return 34065;
		} else if (arg0 == Static49.aClass74_1) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Lclient!cu;")
	public static Class50_Sub1 method5543() {
		Static382.anInt6690 = 0;
		return Static389.method5871();
	}
}
