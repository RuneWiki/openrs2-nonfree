import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "F")
	public static float aFloat22 = 1.0F;

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_33 = new Class267("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
	public static int anInt2442 = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method2011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class239 local8 = Static251.method5357(arg0, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray32 != null) {
			@Pc(18) Class6_Sub42 local18 = new Class6_Sub42();
			local18.anObjectArray36 = local8.anObjectArray32;
			local18.aString67 = arg2;
			local18.aClass239_13 = local8;
			local18.anInt7472 = arg3;
			Static166.method2744(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt6911 != 0) {
			local35 = Static264.method4047(local8);
		}
		if (!local35 || !Static50.method1150(local8).method1218(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static403.method5961(Static363.aClass92_130);
			Static440.method6356(local8.anInt6903, arg1, arg0);
		}
		if (arg3 == 2) {
			Static403.method5961(Static347.aClass92_122);
			Static440.method6356(local8.anInt6903, arg1, arg0);
		}
		if (arg3 == 3) {
			Static403.method5961(Static445.aClass92_154);
			Static440.method6356(local8.anInt6903, arg1, arg0);
		}
		if (arg3 == 4) {
			Static403.method5961(Static134.aClass92_50);
			Static440.method6356(local8.anInt6903, arg1, arg0);
		}
		if (arg3 == 5) {
			Static403.method5961(Static55.aClass92_25);
			Static440.method6356(local8.anInt6903, arg1, arg0);
		}
		if (arg3 == 6) {
			Static403.method5961(Static114.aClass92_113);
			Static440.method6356(local8.anInt6903, arg1, arg0);
		}
		if (arg3 == 7) {
			Static403.method5961(Static414.aClass92_141);
			Static440.method6356(local8.anInt6903, arg1, arg0);
		}
		if (arg3 == 8) {
			Static403.method5961(Static358.aClass92_127);
			Static440.method6356(local8.anInt6903, arg1, arg0);
		}
		if (arg3 == 9) {
			Static403.method5961(Static198.aClass92_68);
			Static440.method6356(local8.anInt6903, arg1, arg0);
		}
		if (arg3 == 10) {
			Static403.method5961(Static318.aClass92_111);
			Static440.method6356(local8.anInt6903, arg1, arg0);
		}
	}
}
