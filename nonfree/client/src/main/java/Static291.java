import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!la;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "[I")
	public static final int[] anIntArray449 = new int[1000];

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_85 = new Class45("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	public static int anInt5559 = 0;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Lclient!il;")
	public static final Class139 aClass139_3 = new Class139("WTWIP", 3);

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "J")
	public static long aLong145 = 0L;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
	public static int anInt5561 = 1;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Z")
	public static boolean method5104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)I")
	public static int method5106(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local19) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(59) char local59;
			if (local17 == '\u0000') {
				local59 = arg0.charAt(local13++);
			} else {
				local59 = local17;
			}
			@Pc(75) char local75;
			if (local19 == '\u0000') {
				local75 = arg1.charAt(local15++);
			} else {
				local75 = local19;
			}
			local17 = Static322.method5565(local59);
			local19 = Static322.method5565(local75);
			local59 = Static67.method1680(local59, arg2);
			local75 = Static67.method1680(local75, arg2);
			if (local75 != local59 && Character.toUpperCase(local59) != Character.toUpperCase(local75)) {
				local59 = Character.toLowerCase(local59);
				local75 = Character.toLowerCase(local75);
				if (local75 != local59) {
					return Static410.method6766(arg2, local59) - Static410.method6766(arg2, local75);
				}
			}
		}
		@Pc(138) int local138 = Math.min(local8, local11);
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			if (arg2 == 2) {
				local13 = local8 - local140 - 1;
				local15 = local11 - local140 - 1;
			} else {
				local15 = local140;
				local13 = local140;
			}
			@Pc(169) char local169 = arg0.charAt(local13);
			@Pc(173) char local173 = arg1.charAt(local15);
			if (local173 != local169 && Character.toUpperCase(local169) != Character.toUpperCase(local173)) {
				local169 = Character.toLowerCase(local169);
				local173 = Character.toLowerCase(local173);
				if (local169 != local173) {
					return Static410.method6766(arg2, local169) - Static410.method6766(arg2, local173);
				}
			}
		}
		@Pc(214) int local214 = local8 - local11;
		if (local214 != 0) {
			return local214;
		}
		for (@Pc(225) int local225 = 0; local225 < local138; local225++) {
			@Pc(231) char local231 = arg0.charAt(local225);
			@Pc(235) char local235 = arg1.charAt(local225);
			if (local231 != local235) {
				return Static410.method6766(arg2, local231) - Static410.method6766(arg2, local235);
			}
		}
		return 0;
	}
}
