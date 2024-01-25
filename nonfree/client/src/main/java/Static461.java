import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!hh;II)Lclient!qj;")
	public static Class1_Sub33 method4741(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2349(arg1, arg2);
		return local5 == null ? null : new Class1_Sub33(new Class1_Sub14(local5));
	}
}
