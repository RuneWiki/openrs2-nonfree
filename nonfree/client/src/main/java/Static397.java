import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!b;II)Lclient!en;")
	public static Class71 method1481(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method253(arg2, arg1);
		return local5 == null ? null : new Class71(new Class3_Sub5(local5));
	}
}
