import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "Lclient!bo;")
	public static Class26 aClass26_5;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "[[I")
	public static int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_54 = new Class134(4);

	@OriginalMember(owner = "client!ul", name = "K", descriptor = "Z")
	public static boolean aBoolean449 = false;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
	public static String[] method5475(@OriginalArg(0) String[] arg0) {
		@Pc(6) String[] local6 = new String[5];
		for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
			local6[local13] = local13 + ": ";
			if (arg0 != null && arg0[local13] != null) {
				local6[local13] = local6[local13] + arg0[local13];
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)Z")
	public static boolean method5485(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}
}
