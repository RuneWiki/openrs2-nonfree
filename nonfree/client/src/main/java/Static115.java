import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!eda", name = "r", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!eda", name = "u", descriptor = "Lclient!f;")
	public static Class73 aClass73_5;

	@OriginalMember(owner = "client!eda", name = "n", descriptor = "Z")
	public static boolean aBoolean189 = false;

	@OriginalMember(owner = "client!eda", name = "q", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_42 = new Class287(52, 8);

	@OriginalMember(owner = "client!eda", name = "w", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_43 = new Class287(54, 3);

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IC)Z")
	public static boolean method2283(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(24) char[] local24 = Static349.aCharArray7;
			for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
				@Pc(32) char local32 = local24[local26];
				if (local32 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
	public static void method2284() {
		Static145.method2769(-1, 255);
	}
}
