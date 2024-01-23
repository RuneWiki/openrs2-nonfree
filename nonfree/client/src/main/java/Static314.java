import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!cg;II)Lclient!gb;")
	public static Class4_Sub14 method1440(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method665(arg1, arg2);
		return local5 == null ? null : new Class4_Sub14(new Class4_Sub24(local5));
	}
}
