import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!lc;II)Lclient!n;")
	public static Class4_Sub15 method1402(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1110(arg2, arg1);
		return local5 == null ? null : new Class4_Sub15(new Class4_Sub13(local5));
	}
}
