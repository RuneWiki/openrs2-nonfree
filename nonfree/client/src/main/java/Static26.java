import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
	public static int anInt501 = 0;

	@OriginalMember(owner = "client!bi", name = "tb", descriptor = "I")
	public static int anInt521 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIZI)Ljava/lang/String;")
	public static String method430(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(44) int local44 = 2;
		@Pc(48) int local48 = arg0 / 10;
		while (local48 != 0) {
			local48 /= 10;
			local44++;
		}
		@Pc(59) char[] local59 = new char[local44];
		local59[0] = '+';
		for (@Pc(67) int local67 = local44 - 1; local67 > 0; local67--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(81) int local81 = local70 - arg0 * 10;
			if (local81 >= 10) {
				local59[local67] = (char) (local81 + 87);
			} else {
				local59[local67] = (char) (local81 + 48);
			}
		}
		return new String(local59);
	}
}
