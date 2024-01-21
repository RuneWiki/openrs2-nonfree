import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ge;II)Lclient!r;")
	public static Class62 method1730(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method110(arg1, 0);
		return local5 == null ? null : new Class62(new Class6_Sub4(local5));
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ge;I)Lclient!r;")
	public static Class62 method1731(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method117(arg1);
		return local4 == null ? null : new Class62(new Class6_Sub4(local4));
	}
}
