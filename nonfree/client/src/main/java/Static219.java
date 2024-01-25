import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hp", name = "u", descriptor = "Lclient!eba;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "Lclient!ue;")
	public static final Class6_Sub47 aClass6_Sub47_1 = new Class6_Sub47(0, -1);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZBI)V")
	public static void method3738(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub16 local8 = Static148.method2357(arg0, arg1);
		if (local8 != null) {
			local8.method9043();
		}
	}
}
