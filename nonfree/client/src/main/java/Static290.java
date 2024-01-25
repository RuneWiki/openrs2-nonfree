import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_177 = new Class56(68, 5);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public static void method7787() {
		Static108.aClass6_59.method102();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BILjava/lang/String;Z)Z")
	public static boolean method7792(@OriginalArg(2) String arg0) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(44) char local44 = arg0.charAt(local33);
			if (local33 == 0) {
				if (local44 == '-') {
					local24 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(74) int local74;
			if (local44 >= '0' && local44 <= '9') {
				local74 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local74 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local74 = local44 - 'W';
			} else {
				return false;
			}
			if (local74 >= 10) {
				return false;
			}
			if (local24) {
				local74 = -local74;
			}
			@Pc(117) int local117 = local28 * 10 + local74;
			if (local28 != local117 / 10) {
				return false;
			}
			local28 = local117;
			local26 = true;
		}
		return local26;
	}
}
