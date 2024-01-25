import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_81 = new Class96("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_123 = new Class151(8);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILclient!ti;)V")
	public static void method3993(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (Static272.aClass124_4 == null) {
			return;
		}
		try {
			Static272.aClass124_4.method2949(0L);
			Static272.aClass124_4.method2945(arg0, 24, arg1.aByteArray65);
		} catch (@Pc(18) Exception local18) {
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3994(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static131.method2034("%0a", arg0, "\n"));
	}
}
