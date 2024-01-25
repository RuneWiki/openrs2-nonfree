import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "F")
	public static float aFloat140;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZILjava/lang/String;)I")
	public static int method7743(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1) {
		if (arg0 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + arg0);
		}
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = arg1.length();
		for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
			@Pc(52) char local52 = arg1.charAt(local44);
			if (local44 == 0) {
				if (local52 == '-') {
					local35 = true;
					continue;
				}
				if (local52 == '+' && true) {
					continue;
				}
			}
			@Pc(94) int local94;
			if (local52 >= '0' && local52 <= '9') {
				local94 = local52 - '0';
			} else if (local52 >= 'A' && local52 <= 'Z') {
				local94 = local52 - '7';
			} else if (local52 >= 'a' && local52 <= 'z') {
				local94 = local52 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local94 >= arg0) {
				throw new NumberFormatException();
			}
			if (local35) {
				local94 = -local94;
			}
			@Pc(152) int local152 = local94 + local39 * arg0;
			if (local152 / arg0 != local39) {
				throw new NumberFormatException();
			}
			local37 = true;
			local39 = local152;
		}
		if (!local37) {
			throw new NumberFormatException();
		}
		return local39;
	}
}
