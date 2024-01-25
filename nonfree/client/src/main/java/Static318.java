import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
	public static int anInt5262;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_82 = new Class142("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_83 = new Class142("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "[Lclient!eb;")
	public static final Class64[] aClass64Array2 = new Class64[14];

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "Z")
	public static boolean aBoolean473 = false;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BIIII)V")
	public static void method4199(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static126.aClass19_Sub1_1.anInt4226 != 0 && arg2 != 0 && Static249.anInt4440 < 50 && arg1 != -1) {
			Static234.aClass43Array1[Static249.anInt4440++] = new Class43((byte) 1, arg1, arg2, arg0, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Lclient!hr;")
	public static Class11_Sub5 method4202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class216 local7 = Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class11_Sub5 local14 = local7.aClass11_Sub5_1;
			local7.aClass11_Sub5_1 = null;
			return local14;
		}
	}
}
