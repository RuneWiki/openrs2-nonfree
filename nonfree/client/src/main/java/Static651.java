import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!eq;II)Lclient!rg;")
	public static Class2_Sub43 method6972(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2545(arg2, arg1);
		return local5 == null ? null : new Class2_Sub43(new Class2_Sub34(local5));
	}
}
