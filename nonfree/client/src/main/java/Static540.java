import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLclient!vg;)Lclient!vg;")
	public static Class341 method7390(@OriginalArg(1) Class341 arg0) {
		@Pc(6) Class341 local6 = Static63.method1146(arg0);
		if (local6 == null) {
			local6 = arg0.aClass341_22;
		}
		return local6;
	}
}
