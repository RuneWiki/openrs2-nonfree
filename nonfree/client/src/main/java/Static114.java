import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!rd;II)Lclient!bd;")
	public static Class9 method212(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1625(arg1, 0);
		return local5 == null ? null : new Class9(new Class3_Sub4(local5));
	}
}
