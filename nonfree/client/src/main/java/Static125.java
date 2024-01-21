import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ge;II)Lclient!b;")
	public static Class6_Sub2 method137(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method110(arg1, arg2);
		return local5 == null ? null : new Class6_Sub2(new Class6_Sub4(local5));
	}
}
