import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!dn;II)Lclient!kl;")
	public static Class136 method3436(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1384(arg1, arg2);
		return local5 == null ? null : new Class136(new Class3_Sub2(local5));
	}
}
