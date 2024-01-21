import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "Lclient!gf;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "Lclient!dc;")
	public static final Class19 aClass19_5 = new Class19();

	@OriginalMember(owner = "client!ha", name = "cb", descriptor = "[I")
	public static final int[] anIntArray146 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ha", name = "eb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_503 = Static181.method2795("Your account has been disabled)3");

	@OriginalMember(owner = "client!ha", name = "hb", descriptor = "Lclient!qe;")
	public static Class83 aClass83_504 = aClass83_503;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)Lclient!fi;")
	public static Class2_Sub2_Sub11 method1260(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub11 local10 = (Class2_Sub2_Sub11) Static194.aClass86_50.method2643((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static96.aClass28_97.method852(arg0, 1);
		local10 = new Class2_Sub2_Sub11();
		if (local20 != null) {
			local10.method1061(arg0, new Class2_Sub3(local20));
		}
		Static194.aClass86_50.method2647(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILclient!eh;)Z")
	public static boolean method1261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28 arg2) {
		@Pc(14) byte[] local14 = arg2.method852(arg0, arg1);
		if (local14 == null) {
			return false;
		} else {
			Static207.method3117(local14);
			return true;
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V")
	public static void method1263() {
		for (@Pc(11) Class2_Sub15 local11 = (Class2_Sub15) Static51.aClass19_4.method691(); local11 != null; local11 = (Class2_Sub15) Static51.aClass19_4.method686()) {
			if (local11.anInt2079 == -1) {
				local11.anInt2077 = 0;
				Static64.method1210(local11);
			} else {
				local11.method3254();
			}
		}
	}
}
