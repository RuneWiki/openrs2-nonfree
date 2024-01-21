import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ja;II)Lclient!ac;")
	public static Class3 method89(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1305(0, arg1);
		return local5 == null ? null : new Class3(new Class1_Sub8(local5));
	}
}
