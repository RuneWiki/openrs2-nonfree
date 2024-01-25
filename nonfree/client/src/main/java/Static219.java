import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!jaa", name = "k", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_67 = new Class6(71, -1);

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZILjava/lang/String;B)I")
	public static int method3917(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg1.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(41) char local41 = arg1.charAt(local36);
			if (local36 == 0) {
				if (local41 == '-') {
					local27 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(66) int local66;
			if (local41 >= '0' && local41 <= '9') {
				local66 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local66 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local66 = local41 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local66) {
				throw new NumberFormatException();
			}
			if (local27) {
				local66 = -local66;
			}
			@Pc(108) int local108 = local66 + arg0 * local31;
			if (local108 / arg0 != local31) {
				throw new NumberFormatException();
			}
			local31 = local108;
			local29 = true;
		}
		if (!local29) {
			throw new NumberFormatException();
		}
		return local31;
	}
}
