import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!vo;II)Lclient!ub;")
	public static Class323 method7397(@OriginalArg(0) Class348 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method7964(arg2, arg1);
		return local5 == null ? null : new Class323(new Class4_Sub13(local5));
	}
}
