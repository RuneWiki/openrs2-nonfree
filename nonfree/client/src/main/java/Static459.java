import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!dn;II)Lclient!mf;")
	public static Class3_Sub29 method3798(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1384(arg1, arg2);
		return local5 == null ? null : new Class3_Sub29(new Class3_Sub2(local5));
	}
}
