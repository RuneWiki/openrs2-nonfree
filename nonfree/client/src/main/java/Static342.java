import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "I")
	public static int anInt5771 = 0;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_171 = new Class107(42, 3);

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_172 = new Class107(86, 10);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZLjava/lang/String;)I")
	public static int method4812(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		for (@Pc(44) int local44 = 0; local44 < local33; local44++) {
			@Pc(49) char local49 = arg1.charAt(local44);
			if (local44 == 0) {
				if (local49 == '-') {
					local26 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local49 >= '0' && local49 <= '9') {
				local76 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local76 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local76 = local49 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local76 >= arg0) {
				throw new NumberFormatException();
			}
			if (local26) {
				local76 = -local76;
			}
			@Pc(118) int local118 = local76 + arg0 * local30;
			if (local30 != local118 / arg0) {
				throw new NumberFormatException();
			}
			local30 = local118;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}
}
