import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static141 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
	public static int anInt3291;

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
	public static int anInt3296;

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "Z")
	public static boolean aBoolean205;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "Lclient!h;")
	public static final Class114 aClass114_61 = new Class114("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)Z")
	public static boolean method2964(@OriginalArg(1) int arg0) {
		return arg0 == 16 || arg0 == 5 || arg0 == 1002 || arg0 == 2 || arg0 == 10;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZIILclient!te;[II)Lclient!rp;")
	public static Class20_Sub3_Sub1 method2965(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9_Sub3 arg2, @OriginalArg(4) int[] arg3) {
		if (arg2.aBoolean513 || Static183.method3500(arg0) && Static183.method3500(arg1)) {
			return new Class20_Sub3_Sub1(arg2, 3553, arg0, arg1, false, arg3);
		} else if (arg2.aBoolean515) {
			return new Class20_Sub3_Sub1(arg2, 34037, arg0, arg1, false, arg3);
		} else {
			return new Class20_Sub3_Sub1(arg2, arg0, arg1, Static117.method2662(arg0), Static117.method2662(arg1), arg3);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public static void method2966() {
		if (Static434.anInt7454 != -1) {
			Static314.method5171(-1, -1, Static434.anInt7454, false);
			Static434.anInt7454 = -1;
		}
	}
}
