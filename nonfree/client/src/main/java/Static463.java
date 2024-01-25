import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!wt", name = "N", descriptor = "I")
	public static int anInt7797 = 0;

	@OriginalMember(owner = "client!wt", name = "W", descriptor = "Z")
	public static boolean aBoolean519 = false;

	@OriginalMember(owner = "client!wt", name = "db", descriptor = "Lclient!of;")
	public static final Class174 aClass174_218 = new Class174("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!ga;)V")
	public static void method6297(@OriginalArg(1) Class82 arg0) {
		if (arg0.anInt2204 == Static185.anInt3401) {
			Static391.aBooleanArray22[arg0.anInt2224] = true;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BII)V")
	public static void method6303(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static307.method4633(Static164.aClass163_172);
		Static243.aClass3_Sub25_Sub1_7.method4082(arg1);
		Static243.aClass3_Sub25_Sub1_7.method4093(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZZILjava/lang/String;)Z")
	public static boolean method6324(@OriginalArg(3) String arg0) {
		@Pc(30) boolean local30 = false;
		@Pc(32) boolean local32 = false;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = arg0.length();
		for (@Pc(39) int local39 = 0; local39 < local37; local39++) {
			@Pc(45) char local45 = arg0.charAt(local39);
			if (local39 == 0) {
				if (local45 == '-') {
					local30 = true;
					continue;
				}
				if (local45 == '+') {
					continue;
				}
			}
			@Pc(80) int local80;
			if (local45 >= '0' && local45 <= '9') {
				local80 = local45 - '0';
			} else if (local45 >= 'A' && local45 <= 'Z') {
				local80 = local45 - '7';
			} else if (local45 >= 'a' && local45 <= 'z') {
				local80 = local45 - 'W';
			} else {
				return false;
			}
			if (local80 >= 10) {
				return false;
			}
			if (local30) {
				local80 = -local80;
			}
			@Pc(111) int local111 = local34 * 10 + local80;
			if (local34 != local111 / 10) {
				return false;
			}
			local34 = local111;
			local32 = true;
		}
		return local32;
	}
}
