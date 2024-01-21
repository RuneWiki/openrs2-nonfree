import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!wa;II)Lclient!df;")
	public static Class21 method619(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method738(arg2, arg1);
		return local5 == null ? null : new Class21(new Class5_Sub6(local5));
	}
}
