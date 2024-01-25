import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static384 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!dn;")
	public static Class56 aClass56_77;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_219 = new Class175("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "[I")
	public static final int[] anIntArray480 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "[I")
	public static final int[] anIntArray481 = new int[8];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Z")
	public static boolean method5257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static192.method3183(arg1, arg0) & Static85.method5961(arg1, arg0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLclient!eo;II)V")
	public static void method5258(@OriginalArg(1) Class68 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static435.aClass68_14 != null || Static378.aBoolean462 || (arg0 == null || Static175.method3706(arg0) == null)) {
			return;
		}
		Static435.aClass68_14 = arg0;
		Static71.aClass68_1 = Static175.method3706(arg0);
		Static9.aBoolean14 = false;
		Static51.anInt1242 = 0;
		Static273.anInt5049 = arg1;
		Static418.anInt7210 = arg2;
	}
}
