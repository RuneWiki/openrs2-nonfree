import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "Lclient!ae;")
	public static Class5 aClass5_3;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Lclient!cq;")
	public static final Class63 aClass63_10 = new Class63(14, 0, 4, 1);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)Z")
	public static boolean method1762(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class2_Sub27 local10 = (Class2_Sub27) Static411.aClass70_43.method1264(); local10 != null; local10 = (Class2_Sub27) Static411.aClass70_43.method1261()) {
			if (Static577.method7485(local10.anInt4323) && local10.aLong113 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
