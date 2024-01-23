import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!hc;II)Lclient!kj;")
	public static Class76 method2416(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1874(arg1, arg2);
		return local5 == null ? null : new Class76(new Class1_Sub13(local5));
	}
}
