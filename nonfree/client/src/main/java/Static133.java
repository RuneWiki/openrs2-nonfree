import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!we;II)Lclient!t;")
	public static Class72 method1705(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1512(arg1, 0);
		return local5 == null ? null : new Class72(new Class3_Sub7(local5));
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!we;I)Lclient!t;")
	public static Class72 method1707(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method1509(arg1);
		return local4 == null ? null : new Class72(new Class3_Sub7(local4));
	}
}
