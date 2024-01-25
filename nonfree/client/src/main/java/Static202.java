import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
	public static String method3548(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (!arg0 || arg1 < 0) {
			return Integer.toString(arg1, 10);
		}
		@Pc(36) int local36 = 2;
		@Pc(40) int local40 = arg1 / 10;
		while (local40 != 0) {
			local40 /= 10;
			local36++;
		}
		@Pc(55) char[] local55 = new char[local36];
		local55[0] = '+';
		for (@Pc(63) int local63 = local36 - 1; local63 > 0; local63--) {
			@Pc(67) int local67 = arg1;
			arg1 /= 10;
			@Pc(77) int local77 = local67 - arg1 * 10;
			if (local77 >= 10) {
				local55[local63] = (char) (local77 + 87);
			} else {
				local55[local63] = (char) (local77 + 48);
			}
		}
		return new String(local55);
	}
}
