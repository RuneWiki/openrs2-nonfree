import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!dda;II)Lclient!eg;")
	public static Class70 method2068(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1616(arg2, arg1);
		return local5 == null ? null : new Class70(new Class2_Sub29(local5));
	}
}
