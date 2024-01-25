import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!jw;")
	public static final Class183 aClass183_31 = new Class183(512);

	@OriginalMember(owner = "client!r", name = "s", descriptor = "I")
	public static int anInt7601 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(CB)C")
	public static char method6283(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method6284(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local27++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static98.aCharArray4[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Z")
	public static boolean method6287() {
		try {
			if (Static445.anInt7588 == 2) {
				if (Static25.aClass4_Sub43_1 == null) {
					Static25.aClass4_Sub43_1 = Static610.method6600(Static347.aClass31_74, Static481.anInt8134, Static211.anInt4328);
					if (Static25.aClass4_Sub43_1 == null) {
						return false;
					}
				}
				if (Static141.aClass246_1 == null) {
					Static141.aClass246_1 = new Class246(Static85.aClass31_22, Static454.aClass31_98);
				}
				if (Static228.aClass4_Sub13_Sub3_2.method5117(Static25.aClass4_Sub43_1, Static156.aClass31_35, Static141.aClass246_1)) {
					Static228.aClass4_Sub13_Sub3_2.method5127();
					Static228.aClass4_Sub13_Sub3_2.method5125(Static554.anInt9318);
					Static228.aClass4_Sub13_Sub3_2.method5143(Static25.aClass4_Sub43_1, Static189.aBoolean300);
					Static445.anInt7588 = 0;
					Static25.aClass4_Sub43_1 = null;
					Static141.aClass246_1 = null;
					Static347.aClass31_74 = null;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static228.aClass4_Sub13_Sub3_2.method5145();
			Static347.aClass31_74 = null;
			Static141.aClass246_1 = null;
			Static445.anInt7588 = 0;
			Static25.aClass4_Sub43_1 = null;
		}
		return false;
	}
}
