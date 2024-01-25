import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!qu;")
	public static Class293 aClass293_1;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "[I")
	public static final int[] anIntArray175 = new int[4];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method1965(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1 || arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(39) int local39 = 2;
		@Pc(43) int local43 = arg0 / 10;
		while (local43 != 0) {
			local43 /= 10;
			local39++;
		}
		@Pc(54) char[] local54 = new char[local39];
		local54[0] = '+';
		for (@Pc(62) int local62 = local39 - 1; local62 > 0; local62--) {
			@Pc(65) int local65 = arg0;
			arg0 /= 10;
			@Pc(76) int local76 = local65 - arg0 * 10;
			if (local76 >= 10) {
				local54[local62] = (char) (local76 + 87);
			} else {
				local54[local62] = (char) (local76 + 48);
			}
		}
		return new String(local54);
	}
}
