import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ah;II)Lclient!md;")
	public static Class51 method2099(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1021(arg1, arg2);
		return local5 == null ? null : new Class51(new Class3_Sub8(local5));
	}
}
