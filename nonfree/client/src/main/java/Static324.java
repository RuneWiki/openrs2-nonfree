import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!fh;II)Lclient!tg;")
	public static Class4_Sub31 method4202(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1372(arg1, arg2);
		return local5 == null ? null : new Class4_Sub31(new Class4_Sub10(local5));
	}
}
