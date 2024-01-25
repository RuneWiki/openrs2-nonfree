import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
	public static int[] anIntArray563;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public static int anInt7309;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "S")
	public static short aShort94 = 1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLjava/lang/String;ZI)I")
	public static int method5834(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(86) int local86;
			if (local46 >= '0' && local46 <= '9') {
				local86 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local86 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local86 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local86) {
				throw new NumberFormatException();
			}
			if (local26) {
				local86 = -local86;
			}
			@Pc(125) int local125 = local30 * arg1 + local86;
			if (local30 != local125 / arg1) {
				throw new NumberFormatException();
			}
			local30 = local125;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}
}
