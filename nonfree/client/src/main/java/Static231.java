import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray52;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public static int anInt6548;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method5182(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(39) int local39 = 2;
		for (@Pc(43) int local43 = arg0 / 10; local43 != 0; local43 /= 10) {
			local39++;
		}
		@Pc(55) char[] local55 = new char[local39];
		local55[0] = '+';
		for (@Pc(63) int local63 = local39 - 1; local63 > 0; local63--) {
			@Pc(67) int local67 = arg0;
			arg0 /= 10;
			@Pc(78) int local78 = local67 - arg0 * 10;
			if (local78 < 10) {
				local55[local63] = (char) (local78 + 48);
			} else {
				local55[local63] = (char) (local78 + 87);
			}
		}
		return new String(local55);
	}
}
