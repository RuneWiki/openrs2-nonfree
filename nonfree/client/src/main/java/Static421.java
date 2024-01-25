import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Lclient!dc;")
	public static Class64 method6218(@OriginalArg(0) int arg0) {
		@Pc(10) Class64 local10 = (Class64) Static646.aClass338_59.method8049((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(23) byte[] local23 = Static172.aClass221_45.method5089(arg0, 0);
		local10 = new Class64();
		if (local23 != null) {
			local10.method1359(new Class3_Sub28(local23), arg0);
		}
		Static646.aClass338_59.method8044((long) arg0, local10);
		return local10;
	}
}
