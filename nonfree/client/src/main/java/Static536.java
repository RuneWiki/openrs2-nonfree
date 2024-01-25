import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Lclient!il;")
	public static Class146 aClass146_4;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_142 = new Class287(20, -1);

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
	public static int anInt9350 = 2;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
	public static int anInt9351 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZILjava/lang/String;)I")
	public static int method7339(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg1.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(43) char local43 = arg1.charAt(local37);
			if (local37 == 0) {
				if (local43 == '-') {
					local28 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(74) int local74;
			if (local43 >= '0' && local43 <= '9') {
				local74 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local74 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local74 = local43 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local74 >= arg0) {
				throw new NumberFormatException();
			}
			if (local28) {
				local74 = -local74;
			}
			@Pc(119) int local119 = local32 * arg0 + local74;
			if (local119 / arg0 != local32) {
				throw new NumberFormatException();
			}
			local30 = true;
			local32 = local119;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local32;
	}
}
