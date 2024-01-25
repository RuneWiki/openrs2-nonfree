import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!tj", name = "sb", descriptor = "Lclient!nq;")
	public static Class144 aClass144_97;

	@OriginalMember(owner = "client!tj", name = "ub", descriptor = "Lclient!bo;")
	public static Class30 aClass30_8;

	@OriginalMember(owner = "client!tj", name = "wb", descriptor = "I")
	public static int anInt6039;

	@OriginalMember(owner = "client!tj", name = "xb", descriptor = "Lclient!nq;")
	public static Class144 aClass144_98;

	@OriginalMember(owner = "client!tj", name = "Ab", descriptor = "[I")
	public static int[] anIntArray496;

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_102 = new Class117("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!tj", name = "tb", descriptor = "I")
	public static int anInt6038 = 0;

	@OriginalMember(owner = "client!tj", name = "vb", descriptor = "[B")
	public static final byte[] aByteArray91 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!tj", name = "yb", descriptor = "[I")
	public static final int[] anIntArray495 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!tj", name = "zb", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_103 = new Class117("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!tj", name = "Bb", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_104 = new Class117("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)Lclient!jm;")
	public static Class111 method5143(@OriginalArg(1) int arg0) {
		@Pc(5) Class26 local5 = Static188.aClass26_36;
		@Pc(14) Class111 local14;
		synchronized (Static188.aClass26_36) {
			local14 = (Class111) Static188.aClass26_36.method332((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(36) byte[] local36 = Static27.aClass144_7.method3896(Static102.method1555(arg0), Static319.method5309(arg0));
		local14 = new Class111();
		local14.anInt2721 = arg0;
		if (local36 != null) {
			local14.method2267(new Class11_Sub25(local36));
		}
		local14.method2273();
		@Pc(64) Class26 local64 = Static188.aClass26_36;
		synchronized (Static188.aClass26_36) {
			Static188.aClass26_36.method330((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZIIII)V")
	public static void method5146(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static257.method4460(arg2)) {
			Static2.method6(arg3, -1, arg1, Static188.aClass137ArrayArray1[arg2], arg0);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIIZII)V")
	public static void method5149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static257.method4460(arg2)) {
			Static42.method641(Static188.aClass137ArrayArray1[arg2], -1, arg4, arg1, arg8, arg0, arg7, arg5, arg6, arg3);
		}
	}
}
