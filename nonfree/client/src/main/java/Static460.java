import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!bu;II)Lclient!oe;")
	public static Class175 method4047(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method785(arg2, arg1);
		return local5 == null ? null : new Class175(new Class3_Sub7(local5));
	}
}
