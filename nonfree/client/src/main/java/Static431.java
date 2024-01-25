import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
	public static int anInt7394;

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
	public static int anInt7395 = 0;

	@OriginalMember(owner = "client!qfa", name = "m", descriptor = "Lclient!hi;")
	public static final Class141 aClass141_11 = new Class141(3);

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/lang/String;ZIZ)I")
	public static int method6133(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
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
			@Pc(71) int local71;
			if (local41 >= '0' && local41 <= '9') {
				local71 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local71 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local71 = local41 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local71) {
				throw new NumberFormatException();
			}
			if (local26) {
				local71 = -local71;
			}
			@Pc(119) int local119 = local71 + local30 * arg1;
			if (local119 / arg1 != local30) {
				throw new NumberFormatException();
			}
			local28 = true;
			local30 = local119;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}
}
