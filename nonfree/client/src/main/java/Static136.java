import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ie;II)Lclient!jf;")
	public static Class1_Sub13 method1057(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1573(arg1, arg2);
		return local5 == null ? null : new Class1_Sub13(new Class1_Sub19(local5));
	}
}
