import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "[[Lclient!sha;")
	public static Class321[][] aClass321ArrayArray1;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_84 = new Class179(71, 12);

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
	public static int anInt1989 = 1;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_85 = new Class179(92, 2);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIB)V")
	public static void method1750(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class6_Sub6 local16 = Static249.method3626(arg0, arg1);
		if (local16 != null) {
			local16.method9174();
		}
	}
}
