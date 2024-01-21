import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ga;II)Lclient!md;")
	public static Class1_Sub12 method1732(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1301(arg1, arg2);
		return local5 == null ? null : new Class1_Sub12(new Class1_Sub8(local5));
	}
}
