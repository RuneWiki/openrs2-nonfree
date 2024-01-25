import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "Lclient!gt;")
	public static final Class101 aClass101_1 = new Class101();

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "[I")
	public static final int[] anIntArray474 = new int[2048];

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
	public static int anInt5618 = 0;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "[I")
	public static final int[] anIntArray475 = new int[4096];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZZLjava/lang/String;)Z")
	public static boolean method4465(@OriginalArg(3) String arg0) {
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
			@Pc(80) int local80;
			if (local39 >= '0' && local39 <= '9') {
				local80 = local39 - '0';
			} else if (local39 >= 'A' && local39 <= 'Z') {
				local80 = local39 - '7';
			} else if (local39 >= 'a' && local39 <= 'z') {
				local80 = local39 - 'W';
			} else {
				return false;
			}
			if (local80 >= 10) {
				return false;
			}
			if (local24) {
				local80 = -local80;
			}
			@Pc(106) int local106 = local80 + local28 * 10;
			if (local28 != local106 / 10) {
				return false;
			}
			local26 = true;
			local28 = local106;
		}
		return local26;
	}
}
