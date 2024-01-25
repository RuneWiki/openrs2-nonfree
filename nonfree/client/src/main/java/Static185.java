import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!j", name = "c", descriptor = "Lclient!os;")
	public static final Class182 aClass182_197 = new Class182("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Lclient!og;")
	public static final Class178 aClass178_14 = new Class178("LIVE", 0);

	@OriginalMember(owner = "client!j", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
	public static boolean method4363(@OriginalArg(2) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(44) int local44 = 0; local44 < local33; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local44 == 0) {
				if (local50 == '-') {
					local26 = true;
					continue;
				}
				if (local50 == '+') {
					continue;
				}
			}
			@Pc(79) int local79;
			if (local50 >= '0' && local50 <= '9') {
				local79 = local50 - '0';
			} else if (local50 >= 'A' && local50 <= 'Z') {
				local79 = local50 - '7';
			} else if (local50 >= 'a' && local50 <= 'z') {
				local79 = local50 - 'W';
			} else {
				return false;
			}
			if (local79 >= 10) {
				return false;
			}
			if (local26) {
				local79 = -local79;
			}
			@Pc(122) int local122 = local30 * 10 + local79;
			if (local122 / 10 != local30) {
				return false;
			}
			local28 = true;
			local30 = local122;
		}
		return local28;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)Lclient!gl;")
	public static Class93 method4366() {
		try {
			return (Class93) Class.forName("Class93_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
