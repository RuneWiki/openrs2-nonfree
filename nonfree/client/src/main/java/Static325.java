import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!th;II)Lclient!tn;")
	public static Class172 method4139(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4058(arg2, arg1);
		return local5 == null ? null : new Class172(new Class1_Sub14(local5));
	}
}
