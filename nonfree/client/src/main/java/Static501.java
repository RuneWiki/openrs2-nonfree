import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "Lclient!wu;")
	public static Class380 aClass380_113;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "[I")
	public static int[] anIntArray574;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_279 = new Class288(51, -1);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method6909(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static605.method8155(Static325.method4373(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method6911(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static324.method4331(arg1, -1, arg0, -1);
	}
}
