import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Lclient!aa;")
	public static Class2 aClass2_10;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!wt;")
	public static Class3_Sub1_Sub4 aClass3_Sub1_Sub4_2;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "I")
	public static int anInt5087;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Lclient!tr;")
	public static Class241 aClass241_4;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_120 = new Class163(29, 7);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static28.anIntArrayArrayArray1[arg0][local16][local20] == -Static460.anInt7719) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static437.anInt7308) + 1;
			@Pc(142) int local142 = (arg3 << Static437.anInt7308) + 2;
			@Pc(151) int local151 = Static178.aClass55Array1[arg0].oa(arg1, arg3) + arg5;
			if (!Static303.method4310(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static437.anInt7308) - 1;
			if (!Static303.method4310(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static437.anInt7308) - 1;
			if (!Static303.method4310(local20, local151, local177)) {
				return false;
			} else if (Static303.method4310(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static456.method6229(arg0, arg1, arg3)) {
			local16 = arg1 << Static437.anInt7308;
			local20 = arg3 << Static437.anInt7308;
			return Static303.method4310(local16 + 1, Static178.aClass55Array1[arg0].oa(arg1, arg3) + arg5, local20 + 1) && Static303.method4310(local16 + Static99.anInt1803 - 1, Static178.aClass55Array1[arg0].oa(arg1 + 1, arg3) + arg5, local20 + 1) && Static303.method4310(local16 + Static99.anInt1803 - 1, Static178.aClass55Array1[arg0].oa(arg1 + 1, arg3 + 1) + arg5, local20 + Static99.anInt1803 - 1) && Static303.method4310(local16 + 1, Static178.aClass55Array1[arg0].oa(arg1, arg3 + 1) + arg5, local20 + Static99.anInt1803 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!av;Lclient!qa;)I")
	public static int method4195(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class167 arg1) {
		if (arg0.anInt304 != -1) {
			return arg0.anInt304;
		}
		if (arg0.anInt299 != -1) {
			@Pc(40) Class105 local40 = arg1.anInterface7_8.method4417(arg1.method6024() ? arg0.anInt299 : arg0.anInt297);
			if (!local40.aBoolean231) {
				return local40.aShort40;
			}
		}
		return arg0.anInt293;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIILclient!uu;IZ)V")
	public static void method4197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class250 arg2) {
		Static134.aBoolean185 = false;
		Static111.anInt1973 = 2;
		Static107.anInt1917 = 0;
		Static88.anInt1592 = arg1;
		Static28.anInt494 = arg0;
		Static395.aClass250_95 = arg2;
		Static63.anInt7101 = 1;
	}
}
