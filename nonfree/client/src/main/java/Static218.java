import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ve;II)Lclient!nh;")
	public static Class1_Sub19 method2256(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2208(arg1, arg2);
		return local5 == null ? null : new Class1_Sub19(new Class1_Sub7(local5));
	}
}
