import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ke;II)Lclient!ba;")
	public static Class7 method241(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1581(arg1, arg2);
		return local5 == null ? null : new Class7(new Class3_Sub4(local5));
	}
}
