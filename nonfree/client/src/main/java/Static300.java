import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!pk;II)Lclient!ao;")
	public static Class8_Sub4 method278(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3194(arg1, arg2);
		return local5 == null ? null : new Class8_Sub4(new Class8_Sub2(local5));
	}
}
