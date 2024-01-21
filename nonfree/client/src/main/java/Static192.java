import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!vb;II)Lclient!rd;")
	public static Class1_Sub21 method2423(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2942(arg2, arg1);
		return local5 == null ? null : new Class1_Sub21(new Class1_Sub8(local5));
	}
}
