import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	public static int anInt4959 = 0;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1343 = Static231.method3737("Cabbage");

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1344 = Static231.method3737("Untersuchen");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!sc;I)Lclient!d;")
	public static Class1_Sub2_Sub6 method3723(@OriginalArg(0) Class107 arg0) {
		for (@Pc(15) Class1_Sub2_Sub6 local15 = (Class1_Sub2_Sub6) Static230.aClass120_22.method3564(); local15 != null; local15 = (Class1_Sub2_Sub6) Static230.aClass120_22.method3561()) {
			if (local15.aClass107_252.method3071(arg0)) {
				return local15;
			}
		}
		return null;
	}
}
