import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!c;II)Lclient!w;")
	public static Class86 method2754(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1605(arg2, arg1);
		return local5 == null ? null : new Class86(new Class2_Sub13(local5));
	}
}
