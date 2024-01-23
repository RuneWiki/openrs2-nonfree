import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array16;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!jb;")
	public static Class28 aClass28_55;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Z")
	public static boolean aBoolean266 = true;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_848 = Static231.method3737("Eingabeprozedur geladen)3");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII)Z")
	public static boolean method2363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class101 local3 = Static170.method2725(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local3.method2841(arg1);
	}
}
