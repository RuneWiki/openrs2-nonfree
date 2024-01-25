import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_39 = new Class216(33, 2);

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_49 = new Class151(45, 4);

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "[I")
	public static final int[] anIntArray141 = new int[13];

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
	public static final int anInt2127 = -1;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLjava/lang/String;IZ)Z")
	public static boolean method2062(@OriginalArg(1) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local35; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local28 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local48 >= '0' && local48 <= '9') {
				local76 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local76 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local76 = local48 - 'W';
			} else {
				return false;
			}
			if (local76 >= 10) {
				return false;
			}
			if (local28) {
				local76 = -local76;
			}
			@Pc(118) int local118 = local76 + local32 * 10;
			if (local118 / 10 != local32) {
				return false;
			}
			local32 = local118;
			local30 = true;
		}
		return local30;
	}
}
