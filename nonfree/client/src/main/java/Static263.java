import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method3789(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local6 <= local20 - 2 || Static269.method3831(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local20 - 1 >= local6 || Static269.method3831(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(66) byte[] local66 = new byte[local26];
		Static284.method3953(arg0, local66, 0);
		return local66;
	}
}
