import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!we;II)Lclient!ea;")
	public static Class3_Sub6 method489(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1512(arg1, arg2);
		return local5 == null ? null : new Class3_Sub6(new Class3_Sub7(local5));
	}
}
