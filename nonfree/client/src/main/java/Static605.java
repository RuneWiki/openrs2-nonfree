import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ga;II)Lclient!ub;")
	public static Class1_Sub49 method7137(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2441(arg2, arg1);
		return local5 == null ? null : new Class1_Sub49(new Class1_Sub20(local5));
	}
}
