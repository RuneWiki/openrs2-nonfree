import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!qp", name = "bb", descriptor = "Lclient!gl;")
	public static Class66 aClass66_2;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method4815(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(32) int local32 = 2;
		@Pc(36) int local36 = arg0 / 10;
		while (local36 != 0) {
			local36 /= 10;
			local32++;
		}
		@Pc(51) char[] local51 = new char[local32];
		local51[0] = '+';
		for (@Pc(59) int local59 = local32 - 1; local59 > 0; local59--) {
			@Pc(63) int local63 = arg0;
			arg0 /= 10;
			@Pc(73) int local73 = local63 - arg0 * 10;
			if (local73 >= 10) {
				local51[local59] = (char) (local73 + 87);
			} else {
				local51[local59] = (char) (local73 + 48);
			}
		}
		return new String(local51);
	}
}
