import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "[I")
	public static final int[] anIntArray696 = new int[4096];

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "Lclient!vv;")
	public static final Class306 aClass306_4 = new Class306("LIVE", 0);

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
	public static int method7571(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
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
			@Pc(122) int local122 = local30 * arg1 + local71;
			if (local30 != local122 / arg1) {
				throw new NumberFormatException();
			}
			local30 = local122;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)I")
	public static int method7573() {
		return Static485.anInt8595;
	}
}
