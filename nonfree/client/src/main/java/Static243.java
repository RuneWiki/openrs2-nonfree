import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!jb;II)Lclient!s;")
	public static Class1_Sub27 method3055(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method819(arg2, arg1);
		return local5 == null ? null : new Class1_Sub27(new Class1_Sub26(local5));
	}
}
