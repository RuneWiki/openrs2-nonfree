import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!jb;II)Lclient!gf;")
	public static Class43 method1256(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method819(arg2, arg1);
		return local5 == null ? null : new Class43(new Class1_Sub26(local5));
	}
}
