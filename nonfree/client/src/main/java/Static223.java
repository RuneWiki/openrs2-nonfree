import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ai;II)Lclient!fc;")
	public static Class30 method1057(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3242(arg1, arg2);
		return local5 == null ? null : new Class30(new Class1_Sub9(local5));
	}
}
