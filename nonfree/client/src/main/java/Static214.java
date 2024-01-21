import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!sd;II)Lclient!hj;")
	public static Class1_Sub11 method1340(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2340(arg2, arg1);
		return local5 == null ? null : new Class1_Sub11(new Class1_Sub14(local5));
	}
}
