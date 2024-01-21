import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!bd;II)Lclient!me;")
	public static Class39 method1337(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1684(0, arg1);
		return local5 == null ? null : new Class39(new Class2_Sub3(local5));
	}
}
