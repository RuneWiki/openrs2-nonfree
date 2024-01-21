import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!eh;II)Lclient!jf;")
	public static Class2_Sub14 method1574(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method852(arg2, arg1);
		return local5 == null ? null : new Class2_Sub14(new Class2_Sub3(local5));
	}
}
