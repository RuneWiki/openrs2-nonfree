import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	public static final int anInt1965 = 1;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "[I")
	public static int[] anIntArray159 = new int[1];

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!hd;")
	public static final Class128 aClass128_6 = new Class128(8);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
	public static boolean method1850(@OriginalArg(2) String arg0) {
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
			@Pc(75) int local75;
			if (local48 >= '0' && local48 <= '9') {
				local75 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local75 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local75 = local48 - 'W';
			} else {
				return false;
			}
			if (local75 >= 10) {
				return false;
			}
			if (local33) {
				local75 = -local75;
			}
			@Pc(120) int local120 = local37 * 10 + local75;
			if (local120 / 10 != local37) {
				return false;
			}
			local35 = true;
			local37 = local120;
		}
		return local35;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
	public static void method1852() {
		Static359.method5427(Static107.anInt2060);
	}
}
