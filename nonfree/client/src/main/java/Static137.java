import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!sf;II)Lclient!cb;")
	public static Class11 method389(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method107(arg2, arg1);
		return local5 == null ? null : new Class11(new Class1_Sub12(local5));
	}
}
