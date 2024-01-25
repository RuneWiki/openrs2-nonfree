import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
	public static int anInt6297;

	@OriginalMember(owner = "client!nj", name = "S", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
	public static int anInt6289 = 0;

	@OriginalMember(owner = "client!nj", name = "G", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_101 = new Class67("Your friends list is full, max of 200 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (200 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 200 para usuários não pagantes, e 200 para membros.");

	@OriginalMember(owner = "client!nj", name = "O", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(FB)F")
	public static float method5264(@OriginalArg(0) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5266(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static455.method6839(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static455.method6839(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(44) int local44 = local14 - local11;
		if (local44 < 1 || local44 > 12) {
			return null;
		}
		@Pc(57) StringBuffer local57 = new StringBuffer(local44);
		for (@Pc(59) int local59 = local11; local59 < local14; local59++) {
			@Pc(65) char local65 = arg0.charAt(local59);
			if (Static376.method7307(local65)) {
				@Pc(75) char local75 = Static340.method5408(local65);
				if (local75 != '\u0000') {
					local57.append(local75);
				}
			}
		}
		if (local57.length() == 0) {
			return null;
		} else {
			return local57.toString();
		}
	}
}
