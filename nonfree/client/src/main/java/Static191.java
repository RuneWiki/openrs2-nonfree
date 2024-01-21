import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!nh;II)Lclient!cb;")
	public static Class13 method352(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2878(arg1, arg2);
		return local5 == null ? null : new Class13(new Class4_Sub11(local5));
	}
}
