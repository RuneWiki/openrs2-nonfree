import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ph;II)Lclient!vb;")
	public static Class184 method4369(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3346(arg1, arg2);
		return local5 == null ? null : new Class184(new Class1_Sub14(local5));
	}
}
