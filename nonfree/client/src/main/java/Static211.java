import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ab;II)Lclient!ac;")
	public static Class4 method91(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3265(arg1, arg2);
		return local5 == null ? null : new Class4(new Class1_Sub14(local5));
	}
}
