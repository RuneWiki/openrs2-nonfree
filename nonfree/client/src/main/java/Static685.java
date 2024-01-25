import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static685 {

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!la;II)Lclient!ku;")
	public static Class206 method4947(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4991(arg1, arg2, -120);
		return local5 == null ? null : new Class206(new Class5_Sub23(local5));
	}
}
