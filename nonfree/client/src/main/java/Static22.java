import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "Lclient!gd;")
	public static Class2_Sub3_Sub8 aClass2_Sub3_Sub8_2;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
	public static int anInt406 = 0;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array4 = new Class78[1000];

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "Lclient!qe;")
	private static Class78 aClass78_82 = Static199.method3560("glow2:");

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "Lclient!qe;")
	public static Class78 aClass78_80 = aClass78_82;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "Lclient!qe;")
	public static Class78 aClass78_81 = aClass78_82;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "[I")
	public static int[] anIntArray53 = new int[128];

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
	public static int anInt416 = -1;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)Lclient!we;")
	public static Class2_Sub3_Sub29 method297(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub3_Sub29 local15 = (Class2_Sub3_Sub29) Static45.aClass110_7.method3891((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static104.aClass72_143.method3197(arg0, 3);
		local15 = new Class2_Sub3_Sub29();
		if (local25 != null) {
			local15.method3919(new Class2_Sub23(local25));
		}
		Static45.aClass110_7.method3894(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)V")
	public static void method298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static89.anInt1999 != 0 && arg0 != -1) {
			Static93.method1622(arg0, Static223.aClass72_Sub1_34, Static89.anInt1999);
			Static2.aBoolean2 = true;
		}
	}
}
