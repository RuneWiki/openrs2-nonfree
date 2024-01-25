import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ns", name = "L", descriptor = "Lclient!cn;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!ns", name = "R", descriptor = "I")
	public static int anInt4882;

	@OriginalMember(owner = "client!ns", name = "H", descriptor = "Lclient!os;")
	public static final Class182 aClass182_171 = new Class182("K", "T", "K", "K");

	@OriginalMember(owner = "client!ns", name = "Z", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_78 = new Class27(7, 8);

	@OriginalMember(owner = "client!ns", name = "cb", descriptor = "Lclient!os;")
	public static final Class182 aClass182_172 = new Class182("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!ns", name = "db", descriptor = "Lclient!s;")
	public static final Class217 aClass217_111 = new Class217(86, -2);

	@OriginalMember(owner = "client!ns", name = "eb", descriptor = "I")
	public static int anInt4889 = -1;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method3940(@OriginalArg(0) Class50 arg0) {
		arg0.ba(0, 0, Static90.anInt1891, 350);
		arg0.P(0, 0, Static90.anInt1891, 350, Static187.anInt3754 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static280.anInt4920;
		@Pc(49) int local49;
		if (Static250.anInt4507 > 0) {
			@Pc(39) int local39 = 346 - Static280.anInt4920 - 4;
			local49 = local27 * local39 / (local27 + Static250.anInt4507 - 1);
			@Pc(51) int local51 = 4;
			if (Static250.anInt4507 > 1) {
				local51 = (Static250.anInt4507 - Static302.anInt5234 - 1) * (local39 - local49) / (Static250.anInt4507 - 1) + 4;
			}
			arg0.P(Static90.anInt1891 - 16, local51, 12, local49, Static187.anInt3754 << 24 | 0x332277, 2);
			for (@Pc(88) int local88 = Static302.anInt5234; local88 < local27 + Static302.anInt5234 && Static250.anInt4507 > local88; local88++) {
				@Pc(97) String[] local97 = Static253.method3686('\b', Static80.aStringArray13[local88]);
				@Pc(106) int local106 = (Static90.anInt1891 - 8 - 16) / local97.length;
				for (@Pc(108) int local108 = 0; local108 < local97.length; local108++) {
					@Pc(117) int local117 = local108 * local106 + 8;
					arg0.ba(local117, 0, local106 + local117 - 8, 350);
					Static114.aClass57_4.method5960(local117, -1, -16777216, 350 - (local88 - Static302.anInt5234) * Static280.anInt4920 - Static320.aClass79_5.anInt2284 - Static32.anInt533 - 2, local97[local108]);
				}
			}
		}
		arg0.ba(0, 0, Static90.anInt1891, 350);
		arg0.method5870(Static90.anInt1891, -1, 350 - Static32.anInt533, 0);
		Static330.aClass57_3.method5960(10, -1, -16777216, 350 - Static450.aClass79_10.anInt2284 - 1, "--> " + Static168.aString26);
		local49 = -1;
		if (Static400.anInt6752 % 30 > 15) {
			local49 = 16777215;
		}
		arg0.method5831(12, Static450.aClass79_10.method1977("--> " + Static168.aString26.substring(0, Static360.anInt6139)) + 10, 350 - Static450.aClass79_10.anInt2284 + -11, local49);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BII)Z")
	public static boolean method3941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
