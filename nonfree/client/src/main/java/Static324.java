import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "Lclient!gj;")
	public static final Class124 aClass124_28 = new Class124();

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZ)Z")
	public static boolean method4905(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 50 || arg0 == 1006 || arg0 == 10 || arg0 == 12;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)V")
	public static void method4906(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub7_Sub5 local10 = Static218.method3780(2, arg0);
		local10.method3062();
	}
}
