import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
	public static int anInt3637;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "Lclient!o;")
	public static final Class169 aClass169_184 = new Class169("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_92 = new Class211(19, 0);

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "Lclient!o;")
	public static final Class169 aClass169_185 = new Class169("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "Lclient!fa;")
	public static final Class77 aClass77_26 = new Class77(32);

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "Lclient!vg;")
	public static final Class1_Sub33_Sub2 aClass1_Sub33_Sub2_2 = new Class1_Sub33_Sub2(5000);

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	public static int anInt3638 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIII)V")
	public static void method2956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 >= Static372.anInt1561 && arg3 <= Static98.anInt1774 && arg0 >= Static194.anInt3448 && Static264.anInt4589 >= arg5) {
			if (arg2 == 1) {
				Static56.method902(arg1, arg3, arg0, arg5, arg4);
			} else {
				Static48.method745(arg4, arg2, arg1, arg5, arg3, arg0);
			}
		} else if (arg2 == 1) {
			Static350.method4908(arg5, arg4, arg3, arg0, arg1);
		} else {
			Static32.method501(arg2, arg0, arg5, arg3, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)I")
	public static int method2959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(25) int local25 = (local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		@Pc(30) int local30 = 255 - local7;
		return local25 + ((local30 * (arg1 & 0xFF00) & 0xFF0000 | local30 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}
}
