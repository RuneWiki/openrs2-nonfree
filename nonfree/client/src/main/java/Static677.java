import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "F")
	public static float aFloat208;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "Lclient!mca;")
	public static Class230 aClass230_6;

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "B")
	public static byte aByte150;

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "Lclient!el;")
	public static final Class109 aClass109_226 = new Class109(80, 2);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZLclient!pda;)V")
	public static void method9299(@OriginalArg(1) Class5_Sub5_Sub18 arg0) {
		@Pc(7) boolean local7 = false;
		arg0.method9186();
		for (@Pc(20) Class5_Sub5_Sub18 local20 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2890(); local20 != null; local20 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2894()) {
			if (Static650.method2003(arg0.method6564(), local20.method6564())) {
				Static22.method320(local20, arg0);
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static86.aClass149_5.method2889(arg0);
		}
	}
}
