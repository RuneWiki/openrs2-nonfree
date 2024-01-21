import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ga;II)Lclient!ag;")
	public static Class6 method175(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1301(arg1, arg2);
		return local5 == null ? null : new Class6(new Class1_Sub8(local5));
	}
}
