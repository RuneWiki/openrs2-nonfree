import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ak;II)Lclient!wk;")
	public static Class1_Sub33 method4539(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method253(arg2, arg1);
		return local5 == null ? null : new Class1_Sub33(new Class1_Sub18(local5));
	}
}
