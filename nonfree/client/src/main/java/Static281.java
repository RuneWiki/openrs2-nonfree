import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "Lclient!ifa;")
	public static Class163 aClass163_25 = new Class163();

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
	public static final int[] anIntArray345 = new int[3];

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIFZI)[I")
	public static int[] method4067(@OriginalArg(5) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class4_Sub2_Sub35 local10 = new Class4_Sub2_Sub35();
		local10.anInt9818 = 8;
		local10.aBoolean766 = true;
		local10.anInt9827 = 35;
		local10.anInt9820 = 4;
		local10.anInt9825 = (int) (arg0 * 4096.0F);
		local10.anInt9828 = 8;
		local10.method8769();
		Static592.method7785(1, 2048);
		local10.method8411(0, local6);
		return local6;
	}
}
