import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ct;II)Lclient!oa;")
	public static Class1_Sub31 method4127(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1161(arg2, arg1);
		return local5 == null ? null : new Class1_Sub31(new Class1_Sub7(local5));
	}
}
