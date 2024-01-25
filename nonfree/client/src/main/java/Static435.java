import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!po", name = "t", descriptor = "Lclient!in;")
	public static Class157 aClass157_222;

	@OriginalMember(owner = "client!po", name = "w", descriptor = "Lclient!mi;")
	public static Class46 aClass46_25;

	@OriginalMember(owner = "client!po", name = "s", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_176 = new Class215(57, 10);

	@OriginalMember(owner = "client!po", name = "u", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_7 = new Class6(7, 2);

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZZILjava/lang/String;)Z")
	public static boolean method6896(@OriginalArg(3) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local28 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(93) int local93;
			if (local48 >= '0' && local48 <= '9') {
				local93 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local93 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local93 = local48 - 'W';
			} else {
				return false;
			}
			if (local93 >= 10) {
				return false;
			}
			if (local28) {
				local93 = -local93;
			}
			@Pc(118) int local118 = local32 * 10 + local93;
			if (local32 != local118 / 10) {
				return false;
			}
			local30 = true;
			local32 = local118;
		}
		return local30;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
	public static void method6897(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static279.method6677(arg1.length - 1, arg1, arg0, 0);
	}
}
