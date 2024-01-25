import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!dk;II)Lclient!nd;")
	public static Class2_Sub32 method3528(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1126(arg1, arg2);
		return local5 == null ? null : new Class2_Sub32(new Class2_Sub13(local5));
	}
}
