import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_188 = new Class175("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
	public static int anInt5710 = 13156520;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZI)V")
	public static void method4580(@OriginalArg(1) int arg0) {
		if (Static246.anIntArray202 == null || arg0 > Static246.anIntArray202.length) {
			Static246.anIntArray202 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZBLjava/lang/String;)I")
	public static int method4581(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg1.length();
		for (@Pc(38) int local38 = 0; local38 < local31; local38++) {
			@Pc(43) char local43 = arg1.charAt(local38);
			if (local38 == 0) {
				if (local43 == '-') {
					local24 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(66) int local66;
			if (local43 >= '0' && local43 <= '9') {
				local66 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local66 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local66 = local43 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local66) {
				throw new NumberFormatException();
			}
			if (local24) {
				local66 = -local66;
			}
			@Pc(108) int local108 = local66 + arg0 * local28;
			if (local28 != local108 / arg0) {
				throw new NumberFormatException();
			}
			local28 = local108;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}
}
