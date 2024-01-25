import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!og;")
	public static Class2_Sub45 aClass2_Sub45_1;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_138 = new Class349(86, 1);

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "[I")
	public static final int[] anIntArray684 = new int[] { 1, 4, 1, 2, 1 };

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "[I")
	public static final int[] anIntArray685 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Z")
	public static boolean method8252() {
		return Static548.method7659("jaclib") ? Static548.method7659("hw3d") : false;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBZ)V")
	public static void method8254(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			@Pc(7) Class2_Sub33 local7 = Static592.method8154(Static296.aClass349_73, Static487.aClass221_2.aClass48_1);
			local7.aClass2_Sub20_Sub2_1.method8551(arg0);
			Static487.aClass221_2.method5173(local7);
		} else {
			Static484.method6918(Static198.aClass286_5, arg0, -1);
		}
	}
}
