import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ak;II)Lclient!ec;")
	public static Class44 method1045(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method253(arg2, arg1);
		return local5 == null ? null : new Class44(new Class1_Sub18(local5));
	}
}
