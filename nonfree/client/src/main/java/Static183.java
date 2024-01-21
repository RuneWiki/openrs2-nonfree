import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!c;II)Lclient!ag;")
	public static Class2_Sub4 method91(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1605(arg2, arg1);
		return local5 == null ? null : new Class2_Sub4(new Class2_Sub13(local5));
	}
}
