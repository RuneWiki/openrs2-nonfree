import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "Lclient!pe;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "[B")
	public static final byte[] aByteArray67 = new byte[520];

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "Lclient!ef;")
	public static final Class61 aClass61_8 = new Class61(7, 0, 1, 1);

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
	public static int anInt5095 = -1;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjava/lang/String;ZI)Z")
	public static boolean method3909(@OriginalArg(1) String arg0) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(43) char local43 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local43 == '-') {
					local24 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local43 >= '0' && local43 <= '9') {
				local76 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local76 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local76 = local43 - 'W';
			} else {
				return false;
			}
			if (local76 >= 10) {
				return false;
			}
			if (local24) {
				local76 = -local76;
			}
			@Pc(111) int local111 = local28 * 10 + local76;
			if (local111 / 10 != local28) {
				return false;
			}
			local28 = local111;
			local26 = true;
		}
		return local26;
	}
}
