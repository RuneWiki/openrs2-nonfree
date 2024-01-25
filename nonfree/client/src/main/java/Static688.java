import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static688 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!wm;II)Lclient!pc;")
	public static Class272 method6403(@OriginalArg(0) Class390 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method8914(arg1, arg2);
		return local5 == null ? null : new Class272(new Class5_Sub41(local5));
	}
}
