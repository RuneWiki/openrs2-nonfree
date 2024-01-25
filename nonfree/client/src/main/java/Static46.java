import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bt", name = "H", descriptor = "Lclient!dn;")
	public static Class69 aClass69_14;

	@OriginalMember(owner = "client!bt", name = "K", descriptor = "[I")
	public static int[] anIntArray85;

	@OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
	public static int anInt1256;

	@OriginalMember(owner = "client!bt", name = "G", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_49 = new Class305(30, 7);

	@OriginalMember(owner = "client!bt", name = "I", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_50 = new Class305(72, 6);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;BZI)Z")
	public static boolean method1319(@OriginalArg(0) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(36) boolean local36 = false;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = arg0.length();
		for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local43 == 0) {
				if (local49 == '-') {
					local26 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(77) int local77;
			if (local49 >= '0' && local49 <= '9') {
				local77 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local77 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local77 = local49 - 'W';
			} else {
				return false;
			}
			if (local77 >= 10) {
				return false;
			}
			if (local26) {
				local77 = -local77;
			}
			@Pc(117) int local117 = local38 * 10 + local77;
			if (local117 / 10 != local38) {
				return false;
			}
			local38 = local117;
			local36 = true;
		}
		return local36;
	}
}
