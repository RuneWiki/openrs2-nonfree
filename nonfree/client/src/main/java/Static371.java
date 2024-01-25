import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!ct;II)Lclient!fs;")
	public static Class65 method2048(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1161(arg2, arg1);
		return local5 == null ? null : new Class65(new Class1_Sub7(local5));
	}
}
