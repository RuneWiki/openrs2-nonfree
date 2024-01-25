import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!iq;II)Lclient!vf;")
	public static Class2_Sub42 method5556(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2756(arg1, arg2);
		return local5 == null ? null : new Class2_Sub42(new Class2_Sub12(local5));
	}
}
