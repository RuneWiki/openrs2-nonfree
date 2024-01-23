import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!mb;II)Lclient!wf;")
	public static Class1_Sub28 method3715(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3509(arg2, arg1);
		return local5 == null ? null : new Class1_Sub28(new Class1_Sub16(local5));
	}
}
