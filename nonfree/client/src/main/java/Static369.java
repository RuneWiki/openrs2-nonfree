import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!qj;II)Lclient!ve;")
	public static Class1_Sub40 method5489(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4508(arg2, arg1);
		return local5 == null ? null : new Class1_Sub40(new Class1_Sub7(local5));
	}
}
