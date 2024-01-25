import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "S")
	public static short aShort28 = 32767;

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "Lclient!hj;")
	public static final Class158 aClass158_3 = new Class158(14, 0, 4, 1);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZIBLjava/lang/String;)I")
	public static int method2067(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		if (arg0 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + arg0);
		}
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(44) int local44 = arg1.length();
		for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
			@Pc(54) char local54 = arg1.charAt(local46);
			if (local46 == 0) {
				if (local54 == '-') {
					local31 = true;
					continue;
				}
				if (local54 == '+' && true) {
					continue;
				}
			}
			@Pc(92) int local92;
			if (local54 >= '0' && local54 <= '9') {
				local92 = local54 - '0';
			} else if (local54 >= 'A' && local54 <= 'Z') {
				local92 = local54 - '7';
			} else if (local54 >= 'a' && local54 <= 'z') {
				local92 = local54 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local92) {
				throw new NumberFormatException();
			}
			if (local31) {
				local92 = -local92;
			}
			@Pc(150) int local150 = arg0 * local35 + local92;
			if (local35 != local150 / arg0) {
				throw new NumberFormatException();
			}
			local33 = true;
			local35 = local150;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local35;
	}
}
