import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!la;II)Lclient!f;")
	public static Class4_Sub9 method433(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method290(arg1, arg2);
		return local5 == null ? null : new Class4_Sub9(new Class4_Sub10(local5));
	}
}
