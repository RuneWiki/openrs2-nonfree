import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "Lclient!uea;")
	public static final Class326 aClass326_5 = new Class326("WTI", 5);

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)V")
	public static void method4582() {
		Static312.method4930(false);
		if (Static241.anInt5030 >= 0 && Static241.anInt5030 != 0) {
			Static146.method2531(Static241.anInt5030);
			Static241.anInt5030 = -1;
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/lang/String;IZ)Z")
	public static boolean method4584(@OriginalArg(1) String arg0) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) char local39 = arg0.charAt(local33);
			if (local33 == 0) {
				if (local39 == '-') {
					local24 = true;
					continue;
				}
				if (local39 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local39 >= '0' && local39 <= '9') {
				local76 = local39 - '0';
			} else if (local39 >= 'A' && local39 <= 'Z') {
				local76 = local39 - '7';
			} else if (local39 >= 'a' && local39 <= 'z') {
				local76 = local39 - 'W';
			} else {
				return false;
			}
			if (local76 >= 10) {
				return false;
			}
			if (local24) {
				local76 = -local76;
			}
			@Pc(112) int local112 = local28 * 10 + local76;
			if (local28 != local112 / 10) {
				return false;
			}
			local26 = true;
			local28 = local112;
		}
		return local26;
	}
}
