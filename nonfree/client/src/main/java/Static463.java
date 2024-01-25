import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!qs;II)Lclient!ht;")
	public static Class112 method2688(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4758(arg2, arg1);
		return local5 == null ? null : new Class112(new Class1_Sub3(local5));
	}
}
