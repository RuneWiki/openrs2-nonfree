import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!fo;II)Lclient!rk;")
	public static Class211 method4741(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1817(arg1, arg2);
		return local5 == null ? null : new Class211(new Class1_Sub28(local5));
	}
}
