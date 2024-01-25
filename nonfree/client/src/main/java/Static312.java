import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "Lclient!bo;")
	public static Class26 aClass26_4;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
	public static int anInt5398;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "Lclient!ul;")
	public static Class246 aClass246_168;

	@OriginalMember(owner = "client!pr", name = "y", descriptor = "Lclient!la;")
	public static Class71 aClass71_7;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_121 = new Class7("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "Lclient!uq;")
	public static Class251 aClass251_8 = null;

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "Lclient!kl;")
	public static final Class137 aClass137_9 = new Class137("WTWIP", 3);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)I")
	public static int method4440(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(6) int local6 = arg2.length();
		@Pc(9) int local9 = arg1.length();
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) char local15 = 0;
		@Pc(17) char local17 = 0;
		while (local11 - local15 < local6 || local13 - local17 < local9) {
			if (local6 <= local11 - local15) {
				return -1;
			}
			if (local13 - local17 >= local9) {
				return 1;
			}
			@Pc(63) char local63;
			if (local15 == '\u0000') {
				local63 = arg2.charAt(local11++);
			} else {
				local63 = local15;
			}
			@Pc(75) char local75;
			if (local17 == '\u0000') {
				local75 = arg1.charAt(local13++);
			} else {
				local75 = local17;
			}
			local15 = Static260.method3873(local63);
			local17 = Static260.method3873(local75);
			local63 = Static163.method2638(local63, arg0);
			local75 = Static163.method2638(local75, arg0);
			if (local75 != local63 && Character.toUpperCase(local63) != Character.toUpperCase(local75)) {
				local63 = Character.toLowerCase(local63);
				local75 = Character.toLowerCase(local75);
				if (local63 != local75) {
					return Static192.method2974(local63, arg0) - Static192.method2974(local75, arg0);
				}
			}
		}
		@Pc(137) int local137 = Math.min(local6, local9);
		for (@Pc(139) int local139 = 0; local139 < local137; local139++) {
			if (arg0 == 2) {
				local11 = local6 - local139 - 1;
				local13 = local9 - local139 - 1;
			} else {
				local13 = local139;
				local11 = local139;
			}
			@Pc(166) char local166 = arg2.charAt(local11);
			@Pc(170) char local170 = arg1.charAt(local13);
			if (local166 != local170 && Character.toUpperCase(local166) != Character.toUpperCase(local170)) {
				local166 = Character.toLowerCase(local166);
				local170 = Character.toLowerCase(local170);
				if (local166 != local170) {
					return Static192.method2974(local166, arg0) - Static192.method2974(local170, arg0);
				}
			}
		}
		@Pc(214) int local214 = local6 - local9;
		if (local214 != 0) {
			return local214;
		}
		for (@Pc(220) int local220 = 0; local220 < local137; local220++) {
			@Pc(225) char local225 = arg2.charAt(local220);
			@Pc(229) char local229 = arg1.charAt(local220);
			if (local229 != local225) {
				return Static192.method2974(local225, arg0) - Static192.method2974(local229, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
	public static void method4442() {
		@Pc(1) Class134 local1 = Static384.aClass134_49;
		synchronized (Static384.aClass134_49) {
			Static384.aClass134_49.method3267();
		}
		local1 = Static321.aClass134_43;
		synchronized (Static321.aClass134_43) {
			Static321.aClass134_43.method3267();
		}
	}
}
