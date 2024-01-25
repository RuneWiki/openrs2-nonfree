import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_111 = new Class240(19, 3);

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZ)Z")
	public static boolean method8679(@OriginalArg(1) boolean arg0) {
		@Pc(13) boolean local13 = Static119.aClass95_4.method8011();
		if (local13 == arg0) {
			return true;
		}
		if (!arg0) {
			Static119.aClass95_4.method8039();
		} else if (!Static119.aClass95_4.method8038()) {
			arg0 = false;
		}
		if (arg0 == local13) {
			return false;
		} else {
			Static336.aClass3_Sub41_18.method6705(arg0 ? 1 : 0, Static336.aClass3_Sub41_18.aClass14_Sub24_1);
			Static219.method3247();
			return true;
		}
	}
}
