import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!qga", name = "m", descriptor = "I")
	public static int anInt8817 = -1;

	@OriginalMember(owner = "client!qga", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Ljava/lang/String;ZIZ)I")
	public static int method7385(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + arg1);
		}
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(48) char local48 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local48 == '-') {
					local31 = true;
					continue;
				}
				if (local48 == '+' && true) {
					continue;
				}
			}
			@Pc(99) int local99;
			if (local48 >= '0' && local48 <= '9') {
				local99 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local99 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local99 = local48 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local99) {
				throw new NumberFormatException();
			}
			if (local31) {
				local99 = -local99;
			}
			@Pc(144) int local144 = arg1 * local35 + local99;
			if (local144 / arg1 != local35) {
				throw new NumberFormatException();
			}
			local35 = local144;
			local33 = true;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local35;
	}
}
