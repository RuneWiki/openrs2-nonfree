import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!tf;II)Lclient!hc;")
	public static Class3_Sub24 method3228(@OriginalArg(0) Class322 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method6802(arg1, arg2);
		return local5 == null ? null : new Class3_Sub24(new Class3_Sub11(local5));
	}
}
