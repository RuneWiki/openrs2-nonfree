import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!kb;II)Lclient!si;")
	public static Class1_Sub31 method4181(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2306(arg1, arg2);
		return local5 == null ? null : new Class1_Sub31(new Class1_Sub16(local5));
	}
}
