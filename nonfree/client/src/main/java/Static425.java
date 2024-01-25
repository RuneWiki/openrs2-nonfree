import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "[I")
	public static int[] anIntArray616;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
	public static int anInt6874 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method5647(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(6) String local6 = arg1.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = arg0 ? 32768 : 0;
		@Pc(28) int local28 = local17 + (arg0 ? Static189.aClass156_1.anInt4337 : Static189.aClass156_1.anInt4335);
		for (@Pc(30) int local30 = local17; local30 < local28; local30++) {
			@Pc(36) Class1_Sub2_Sub17 local36 = Static189.aClass156_1.method3582(local30);
			if (local36.aBoolean431 && local36.method5151().toLowerCase().indexOf(local6) != -1) {
				if (local11 >= 50) {
					Static296.aShortArray85 = null;
					Static54.anInt1016 = -1;
					return;
				}
				if (local9.length <= local11) {
					@Pc(65) short[] local65 = new short[local9.length * 2];
					for (@Pc(67) int local67 = 0; local67 < local11; local67++) {
						local65[local67] = local9[local67];
					}
					local9 = local65;
				}
				local9[local11++] = (short) local30;
			}
		}
		Static296.aShortArray85 = local9;
		Static330.anInt5656 = 0;
		Static54.anInt1016 = local11;
		@Pc(103) String[] local103 = new String[Static54.anInt1016];
		for (@Pc(105) int local105 = 0; local105 < Static54.anInt1016; local105++) {
			local103[local105] = Static189.aClass156_1.method3582(local9[local105]).method5151();
		}
		Static35.method5796(local103, Static296.aShortArray85);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Lclient!wg;")
	public static Class266 method5648(@OriginalArg(1) int arg0) {
		@Pc(10) Class266 local10 = (Class266) Static59.aClass134_9.method3266((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static133.aClass246_84.method5477(0, arg0);
		local10 = new Class266();
		if (local20 != null) {
			local10.method5860(arg0, new Class1_Sub5(local20));
		}
		Static59.aClass134_9.method3263((long) arg0, local10);
		return local10;
	}
}
