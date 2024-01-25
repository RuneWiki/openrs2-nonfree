import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static535 {

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Lclient!pr;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_228 = new Class150(56, 12);

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_152 = new Class40("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Z")
	public static boolean aBoolean654 = false;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "F")
	public static float aFloat364 = 1024.0F;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method7289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg1 + arg5 && arg0 + arg3 > arg5) {
			return arg2 + arg7 > arg6 && arg7 < arg4 + arg6;
		} else {
			return false;
		}
	}
}
