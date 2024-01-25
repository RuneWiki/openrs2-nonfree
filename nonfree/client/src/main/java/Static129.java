import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
	public static int anInt2573 = 0;

	@OriginalMember(owner = "client!eh", name = "U", descriptor = "Lclient!fs;")
	public static Class121 aClass121_1 = null;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLjava/lang/String;II)Z")
	public static boolean method2528(@OriginalArg(1) String arg0) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		}
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(49) int local49 = 0; local49 < local40; local49++) {
			@Pc(57) char local57 = arg0.charAt(local49);
			if (local49 == 0) {
				if (local57 == '-') {
					local33 = true;
					continue;
				}
				if (local57 == '+' && true) {
					continue;
				}
			}
			@Pc(99) int local99;
			if (local57 >= '0' && local57 <= '9') {
				local99 = local57 - '0';
			} else if (local57 >= 'A' && local57 <= 'Z') {
				local99 = local57 - '7';
			} else if (local57 >= 'a' && local57 <= 'z') {
				local99 = local57 - 'W';
			} else {
				return false;
			}
			if (local99 >= 10) {
				return false;
			}
			if (local33) {
				local99 = -local99;
			}
			@Pc(156) int local156 = local37 * 10 + local99;
			if (local156 / 10 != local37) {
				return false;
			}
			local35 = true;
			local37 = local156;
		}
		return local35;
	}
}
