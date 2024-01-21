import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!jg;II)Lclient!f;")
	public static Class24 method846(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1624(arg1, arg2);
		return local5 == null ? null : new Class24(new Class3_Sub4(local5));
	}
}
