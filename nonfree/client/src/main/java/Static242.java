import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!pa;II)Lclient!qg;")
	public static Class1_Sub24 method2890(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3325(arg1, arg2);
		return local5 == null ? null : new Class1_Sub24(new Class1_Sub17(local5));
	}
}
