import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ic;II)Lclient!cj;")
	public static Class39 method736(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2274(arg1, arg2);
		return local5 == null ? null : new Class39(new Class1_Sub11(local5));
	}
}
