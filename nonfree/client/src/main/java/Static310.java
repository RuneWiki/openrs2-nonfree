import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "Lclient!fh;")
	public static Class5_Sub15 aClass5_Sub15_6;

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
	public static int anInt4822;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
	public static int anInt4816 = 0;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_131 = new Class129(103, 8);

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_132 = new Class129(7, 2);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLjava/lang/String;ZI)I")
	public static int method3820(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(43) char local43 = arg0.charAt(local37);
			if (local37 == 0) {
				if (local43 == '-') {
					local28 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(87) int local87;
			if (local43 >= '0' && local43 <= '9') {
				local87 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local87 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local87 = local43 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local87) {
				throw new NumberFormatException();
			}
			if (local28) {
				local87 = -local87;
			}
			@Pc(115) int local115 = local32 * arg1 + local87;
			if (local32 != local115 / arg1) {
				throw new NumberFormatException();
			}
			local30 = true;
			local32 = local115;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local32;
	}
}
