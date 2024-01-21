import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!pb;II)Lclient!ef;")
	public static Class27 method712(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2130(arg1, arg2);
		return local5 == null ? null : new Class27(new Class2_Sub11(local5));
	}
}
