import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!tb;I)Lclient!ub;")
	public static Class73 method1878(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method1155(arg1);
		return local4 == null ? null : new Class73(new Class3_Sub2(local4));
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!tb;II)Lclient!ub;")
	public static Class73 method1882(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1146(arg1, 0);
		return local5 == null ? null : new Class73(new Class3_Sub2(local5));
	}
}
