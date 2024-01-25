import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "[S")
	public static short[] aShortArray54;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Lclient!st;")
	public static final Class314 aClass314_95 = new Class314(2, 3);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZIBI)Ljava/lang/String;")
	public static String method5402(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		if (!arg0 || arg1 < 0) {
			return Integer.toString(arg1, 10);
		}
		@Pc(35) int local35 = 2;
		for (@Pc(47) int local47 = arg1 / 10; local47 != 0; local47 /= 10) {
			local35++;
		}
		@Pc(62) char[] local62 = new char[local35];
		local62[0] = '+';
		for (@Pc(70) int local70 = local35 - 1; local70 > 0; local70--) {
			@Pc(74) int local74 = arg1;
			arg1 /= 10;
			@Pc(84) int local84 = local74 - arg1 * 10;
			if (local84 >= 10) {
				local62[local70] = (char) (local84 + 87);
			} else {
				local62[local70] = (char) (local84 + 48);
			}
		}
		return new String(local62);
	}
}
