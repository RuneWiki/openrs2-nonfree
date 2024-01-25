import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static682 {

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!cb;II)Lclient!oia;")
	public static Class259 method6432(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method916(arg2, arg1);
		return local5 == null ? null : new Class259(new Class5_Sub15(local5));
	}
}
