import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "Lclient!lf;")
	public static Class1_Sub2_Sub11_Sub1_Sub1 aClass1_Sub2_Sub11_Sub1_Sub1_2;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Lclient!ak;")
	public static Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
	public static int anInt3765 = -1;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1281 = Static64.method1101(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "[I")
	public static int[] anIntArray245 = new int[2];

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1284 = Static64.method1101("Examine");

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1282 = aClass51_1284;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1283 = Static64.method1101("(U0a )2 in: ");

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array27 = new Class51[500];

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "[Lclient!qe;")
	public static Class5_Sub1_Sub2[] aClass5_Sub1_Sub2Array1 = new Class5_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public static void method2869() {
		Static194.aClass102_20.method3090();
		Static144.aClass116_5.method3458();
		Static146.aClass116_3.method3458();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLclient!mb;Lclient!mb;)I")
	public static int method2870(@OriginalArg(1) Class70 arg0, @OriginalArg(2) Class70 arg1) {
		@Pc(6) int local6 = 0;
		if (arg0.method3519(Static38.anInt916)) {
			local6++;
		}
		if (arg0.method3519(Static146.anInt773)) {
			local6++;
		}
		if (arg0.method3519(Static207.anInt4438)) {
			local6++;
		}
		if (arg1.method3519(Static38.anInt916)) {
			local6++;
		}
		if (arg1.method3519(Static146.anInt773)) {
			local6++;
		}
		if (arg1.method3519(Static207.anInt4438)) {
			local6++;
		}
		return local6;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)Lclient!d;")
	public static Class27 method2871(@OriginalArg(1) int arg0) {
		@Pc(10) Class27 local10 = (Class27) Static217.aClass53_30.method1501((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static192.aClass70_40.method3509(Static52.method927(arg0), Static210.method3489(arg0));
		local10 = new Class27();
		local10.anInt799 = arg0;
		if (local24 != null) {
			local10.method600(new Class1_Sub16(local24));
		}
		local10.method596();
		Static217.aClass53_30.method1497(local10, (long) arg0);
		return local10;
	}
}
