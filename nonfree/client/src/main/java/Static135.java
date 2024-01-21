import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!kb;II)Lclient!j;")
	public static Class1_Sub8 method1017(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1710(arg1, arg2);
		return local5 == null ? null : new Class1_Sub8(new Class1_Sub20(local5));
	}
}
