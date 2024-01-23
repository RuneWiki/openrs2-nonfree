import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!kb;II)Lclient!p;")
	public static Class118 method3527(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2306(arg1, arg2);
		return local5 == null ? null : new Class118(new Class1_Sub16(local5));
	}
}
