import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
	public static int anInt28;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_1 = new Class32("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[8];

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_1 = new Class205(61, 3);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!nl;Lclient!nl;I)V")
	public static void method30(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class171 arg1) {
		Static4.aClass171_2 = arg0;
		Static240.aClass171_59 = arg1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method31() {
		Static334.anImage3 = null;
		Static72.aFont2 = null;
	}
}
