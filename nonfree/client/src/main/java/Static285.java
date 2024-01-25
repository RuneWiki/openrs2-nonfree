import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "Lclient!tr;")
	public static Class110 aClass110_14;

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "[I")
	public static final int[] anIntArray557 = new int[256];

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
	public static int anInt4992 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
	public static void method4493() {
		@Pc(5) Class139 local5 = Static78.aClass139_13;
		synchronized (Static78.aClass139_13) {
			Static78.aClass139_13.method3075();
		}
		local5 = Static136.aClass139_31;
		synchronized (Static136.aClass139_31) {
			Static136.aClass139_31.method3075();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BZILjava/lang/String;)Z")
	public static boolean method4498(@OriginalArg(3) String arg0) {
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local33 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(98) int local98;
			if (local48 >= '0' && local48 <= '9') {
				local98 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local98 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local98 = local48 - 'W';
			} else {
				return false;
			}
			if (local98 >= 10) {
				return false;
			}
			if (local33) {
				local98 = -local98;
			}
			@Pc(124) int local124 = local37 * 10 + local98;
			if (local124 / 10 != local37) {
				return false;
			}
			local35 = true;
			local37 = local124;
		}
		return local35;
	}
}
