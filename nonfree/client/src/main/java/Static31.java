import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
	public static int anInt797;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString13 = "";

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_52 = new Class159("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[5];

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "[I")
	public static final int[] anIntArray41 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
	public static int anInt798 = 0;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V")
	public static void method552() {
		Static168.aClass198_247.method5213();
		Static334.aClass198_140.method5213();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZZ)Z")
	public static boolean method553(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static274.aClass47_9.method2757();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static274.aClass47_9.method2671();
		} else if (!Static274.aClass47_9.method2661()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static306.aBoolean438 = arg0;
			Static222.method4006(Static1.aClass134_7);
			return true;
		}
	}
}
