import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
	public static int anInt3322;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "Lclient!md;")
	public static Class112 aClass112_1 = new Class112();

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString114 = "Examine";

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/String;ZI)Z")
	public static boolean method2689(@OriginalArg(1) String arg0) {
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(43) int local43 = arg0.length();
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local43; local47++) {
			@Pc(54) char local54 = arg0.charAt(local47);
			if (local47 == 0) {
				if (local54 == '-') {
					local40 = true;
					continue;
				}
				if (local54 == '+') {
					continue;
				}
			}
			@Pc(84) int local84;
			if (local54 >= '0' && local54 <= '9') {
				local84 = local54 - '0';
			} else if (local54 >= 'A' && local54 <= 'Z') {
				local84 = local54 - '7';
			} else if (local54 >= 'a' && local54 <= 'z') {
				local84 = local54 - 'W';
			} else {
				return false;
			}
			if (local84 >= 10) {
				return false;
			}
			if (local40) {
				local84 = -local84;
			}
			@Pc(130) int local130 = local45 * 10 + local84;
			if (local130 / 10 != local45) {
				return false;
			}
			local45 = local130;
			local38 = true;
		}
		return local38;
	}
}
