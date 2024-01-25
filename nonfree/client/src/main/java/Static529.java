import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!uaa", name = "q", descriptor = "I")
	public static int anInt9241;

	@OriginalMember(owner = "client!uaa", name = "s", descriptor = "I")
	public static int anInt9243;

	@OriginalMember(owner = "client!uaa", name = "u", descriptor = "Lclient!naa;")
	public static final Class218 aClass218_9 = new Class218();

	@OriginalMember(owner = "client!uaa", name = "w", descriptor = "[I")
	public static final int[] anIntArray535 = new int[1024];

	@OriginalMember(owner = "client!uaa", name = "x", descriptor = "I")
	public static int anInt9246 = -1;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BILjava/lang/String;Z)Z")
	public static boolean method7268(@OriginalArg(2) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local41 >= '0' && local41 <= '9') {
				local73 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local73 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local73 = local41 - 'W';
			} else {
				return false;
			}
			if (local73 >= 10) {
				return false;
			}
			if (local26) {
				local73 = -local73;
			}
			@Pc(116) int local116 = local30 * 10 + local73;
			if (local116 / 10 != local30) {
				return false;
			}
			local28 = true;
			local30 = local116;
		}
		return local28;
	}
}
