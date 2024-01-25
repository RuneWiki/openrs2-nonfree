import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static682 {

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ae;II)Lclient!haa;")
	public static Class133 method3029(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method262(arg2, arg1);
		return local5 == null ? null : new Class133(new Class6_Sub23(local5));
	}
}
