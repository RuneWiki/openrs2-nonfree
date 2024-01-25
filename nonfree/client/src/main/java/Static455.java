import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!pc;II)Lclient!cc;")
	public static Class2_Sub9 method888(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4283(arg1, arg2);
		return local5 == null ? null : new Class2_Sub9(new Class2_Sub20(local5));
	}
}
