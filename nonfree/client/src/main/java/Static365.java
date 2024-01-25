import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ir;II)Lclient!nh;")
	public static Class143 method3605(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2319(arg1, arg2);
		return local5 == null ? null : new Class143(new Class3_Sub4(local5));
	}
}
