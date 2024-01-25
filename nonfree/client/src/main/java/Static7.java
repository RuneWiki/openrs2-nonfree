import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "[I")
	public static int[] anIntArray95;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "[Lclient!xa;")
	public static Class119[] aClass119Array1;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Lclient!ti;")
	public static Class3_Sub15_Sub1 aClass3_Sub15_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_7 = new Class67("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString6 = "";

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
	public static int anInt488 = -1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)I")
	public static int method548(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Lclient!gk;")
	public static Class108 method550(@OriginalArg(0) int arg0) {
		@Pc(12) Class108 local12 = (Class108) Static149.aClass125_26.method3512((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static351.aClass161_69.method4243(arg0, 0);
		local12 = new Class108();
		if (local22 != null) {
			local12.method3127(new Class3_Sub27(local22));
		}
		local12.method3124();
		Static149.aClass125_26.method3519((long) arg0, local12);
		return local12;
	}
}
