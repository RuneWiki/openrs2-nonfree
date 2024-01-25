import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!mq;")
	public static Class71 aClass71_17;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!uf;I)Lclient!uf;")
	public static Class357 method6900(@OriginalArg(0) Class357 arg0) {
		@Pc(6) Class357 local6 = Static85.method1470(arg0);
		if (local6 == null) {
			local6 = arg0.aClass357_155;
		}
		return local6;
	}
}
