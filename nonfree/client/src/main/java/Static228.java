import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!ai;II)Lclient!qh;")
	public static Class1_Sub23 method2704(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3242(arg1, arg2);
		return local5 == null ? null : new Class1_Sub23(new Class1_Sub9(local5));
	}
}
