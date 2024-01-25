import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ui;II)Lclient!hj;")
	public static Class1_Sub15 method2062(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4985(arg2, arg1);
		return local5 == null ? null : new Class1_Sub15(new Class1_Sub33(local5));
	}
}
