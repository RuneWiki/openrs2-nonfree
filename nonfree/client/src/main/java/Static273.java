import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "Lclient!um;")
	public static Class244 aClass244_24 = new Class244();

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
	public static int anInt4889 = 0;

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_65 = new Class267("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!nq", name = "E", descriptor = "[I")
	public static final int[] anIntArray327 = new int[64];

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)Z")
	public static boolean method4126(@OriginalArg(0) int arg0) {
		return arg0 == 60 || arg0 == 57 || arg0 == 1011 || arg0 == 18 || arg0 == 46;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(III)Lclient!ab;")
	public static Class3_Sub1 method4127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class101 local7 = Static409.aClass101ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub1_2;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(BI)I")
	public static int method4131(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(III)V")
	public static void method4132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static403.method5961(Static212.aClass92_73);
		Static109.aClass6_Sub1_Sub1_5.method6461(arg0);
		Static109.aClass6_Sub1_Sub1_5.method6464(arg1);
	}
}
