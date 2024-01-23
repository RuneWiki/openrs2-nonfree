import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "[I")
	public static int[] anIntArray146;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "[I")
	public static int[] anIntArray147;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Lclient!qe;")
	private static Class78 aClass78_178 = Static199.method3560("Attack");

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_179 = aClass78_178;

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "Lclient!qe;")
	public static Class78 aClass78_180 = Static199.method3560("mapdots");

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "Lclient!qe;")
	public static Class78 aClass78_181 = Static199.method3560("leuchten1:");

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lclient!oa;")
	public static Class2_Sub3_Sub21 method669(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub3_Sub21 local10 = (Class2_Sub3_Sub21) Static210.aClass110_23.method3891((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static210.aClass72_271.method3197(arg0, 4);
		local10 = new Class2_Sub3_Sub21();
		if (local20 != null) {
			local10.method2553(arg0, new Class2_Sub23(local20));
		}
		Static210.aClass110_23.method3894(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)V")
	public static void method670(@OriginalArg(0) int arg0) {
		Static58.anInt1023 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public static void method671() {
		Static97.aClass110_10.method3889();
		Static140.aClass110_12.method3889();
	}
}
