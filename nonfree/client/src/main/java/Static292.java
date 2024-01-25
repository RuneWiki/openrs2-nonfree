import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!nw", name = "i", descriptor = "Lclient!o;")
	public static Class85 aClass85_12;

	@OriginalMember(owner = "client!nw", name = "l", descriptor = "Lclient!qc;")
	public static Class205 aClass205_1;

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_74 = new Class142("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
	public static int anInt4883 = 0;

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_178 = new Class67(61, 8);

	@OriginalMember(owner = "client!nw", name = "k", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)Z")
	public static boolean method3894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static148.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == -Static248.anInt4433) {
			return false;
		} else if (local7 == Static248.anInt4433) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static41.anInt612;
			@Pc(26) int local26 = arg2 << Static41.anInt612;
			if (Static207.method3007(local22 + 1, Static452.aClass139Array3[arg0].ua(arg1, arg2), local26 + 1) && Static207.method3007(local22 + Static383.anInt6136 - 1, Static452.aClass139Array3[arg0].ua(arg1 + 1, arg2), local26 + 1) && Static207.method3007(local22 + Static383.anInt6136 - 1, Static452.aClass139Array3[arg0].ua(arg1 + 1, arg2 + 1), local26 + Static383.anInt6136 - 1) && Static207.method3007(local22 + 1, Static452.aClass139Array3[arg0].ua(arg1, arg2 + 1), local26 + Static383.anInt6136 - 1) && Static207.method3007(local22 + Static324.anInt5325, Static452.aClass139Array3[arg0].ua(arg1, arg2), local26 + 1) && Static207.method3007(local22 + Static383.anInt6136 - 1, Static452.aClass139Array3[arg0].ua(arg1 + 1, arg2), local26 + Static324.anInt5325) && Static207.method3007(local22 + Static324.anInt5325, Static452.aClass139Array3[arg0].ua(arg1, arg2 + 1), local26 + Static383.anInt6136 - 1) && Static207.method3007(local22 + Static383.anInt6136 - 1, Static452.aClass139Array3[arg0].ua(arg1, arg2), local26 + Static324.anInt5325) && Static207.method3007(local22 + Static324.anInt5325, Static452.aClass139Array3[arg0].ua(arg1, arg2), local26 + Static324.anInt5325)) {
				Static148.anIntArrayArrayArray2[arg0][arg1][arg2] = Static248.anInt4433;
				return true;
			} else {
				Static148.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static248.anInt4433;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3896(@OriginalArg(0) String arg0) {
		Static448.aString68 = arg0;
		if (Static259.aClass177_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static259.aClass177_2.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static259.aClass177_2.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static324.method4243(Static183.method2674() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static466.method40(Static259.aClass177_2.anApplet1, "document.cookie=\"" + local39 + "\"");
		} catch (@Pc(91) Throwable local91) {
		}
	}
}
