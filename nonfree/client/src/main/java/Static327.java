import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
	public static int anInt5282;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "Lclient!qn;")
	public static Class211 aClass211_78;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_200 = new Class56(61, -2);

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
	public static int anInt5289 = 0;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Z")
	public static boolean aBoolean376 = false;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZZ)Ljava/lang/String;")
	public static String method4301(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(32) int local32 = 2;
		@Pc(36) int local36 = arg0 / 10;
		while (local36 != 0) {
			local36 /= 10;
			local32++;
		}
		@Pc(56) char[] local56 = new char[local32];
		local56[0] = '+';
		for (@Pc(64) int local64 = local32 - 1; local64 > 0; local64--) {
			@Pc(68) int local68 = arg0;
			arg0 /= 10;
			@Pc(79) int local79 = local68 - arg0 * 10;
			if (local79 < 10) {
				local56[local64] = (char) (local79 + 48);
			} else {
				local56[local64] = (char) (local79 + 87);
			}
		}
		return new String(local56);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method4304(@OriginalArg(1) Class135 arg0) {
		if (Static265.aBoolean325) {
			Static355.method4691(arg0);
		} else {
			Static160.method3986(arg0);
		}
	}
}
