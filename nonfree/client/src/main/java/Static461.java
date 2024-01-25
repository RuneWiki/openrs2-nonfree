import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!vh;II)Lclient!tv;")
	public static Class1_Sub41 method5384(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5667(arg2, arg1);
		return local5 == null ? null : new Class1_Sub41(new Class1_Sub1(local5));
	}
}
