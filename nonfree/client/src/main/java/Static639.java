import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
	public static int anInt10403 = -1;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!cn;B)Lclient!cn;")
	public static Class73 method8925(@OriginalArg(0) Class73 arg0) {
		@Pc(15) Class73 local15 = Static81.method1254(arg0);
		if (local15 == null) {
			local15 = arg0.aClass73_4;
		}
		return local15;
	}
}
