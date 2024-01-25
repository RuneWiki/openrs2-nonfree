import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!qs;II)Lclient!fp;")
	public static Class1_Sub18 method1950(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4758(arg2, arg1);
		return local5 == null ? null : new Class1_Sub18(new Class1_Sub3(local5));
	}
}
