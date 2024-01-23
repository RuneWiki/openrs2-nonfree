import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ph;II)Lclient!ma;")
	public static Class1_Sub16 method2761(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3346(arg1, arg2);
		return local5 == null ? null : new Class1_Sub16(new Class1_Sub14(local5));
	}
}
