import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!fh", name = "D", descriptor = "Lclient!jg;")
	public static Class4_Sub2_Sub11 aClass4_Sub2_Sub11_1;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "Z")
	public static boolean aBoolean93 = false;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method1339(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		for (@Pc(41) int local41 = arg0 / 10; local41 != 0; local41 /= 10) {
			local37++;
		}
		@Pc(56) char[] local56 = new char[local37];
		local56[0] = '+';
		for (@Pc(73) int local73 = local37 - 1; local73 > 0; local73--) {
			@Pc(80) int local80 = arg0;
			arg0 /= 10;
			@Pc(90) int local90 = local80 - arg0 * 10;
			if (local90 < 10) {
				local56[local73] = (char) (local90 + 48);
			} else {
				local56[local73] = (char) (local90 + 87);
			}
		}
		return new String(local56);
	}
}
