import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!c;II)Lclient!ka;")
	public static Class4_Sub11 method953(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1774(arg1, arg2);
		return local5 == null ? null : new Class4_Sub11(new Class4_Sub9(local5));
	}
}
