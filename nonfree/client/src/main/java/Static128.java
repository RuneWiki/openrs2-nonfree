import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ff;II)Lclient!ga;")
	public static Class25 method675(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method383(0, arg1);
		return local5 == null ? null : new Class25(new Class2_Sub17(local5));
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ff;I)Lclient!ga;")
	public static Class25 method678(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method372(arg1);
		return local4 == null ? null : new Class25(new Class2_Sub17(local4));
	}
}
