import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ID)V")
	public static void method7484(@OriginalArg(1) double arg0) {
		Static46.aClass92_1.method3865(Static665.aClass92_9);
		Static46.aClass92_1.method3851(0, 0, (int) arg0);
		Static340.aClass33_9.method8133(Static46.aClass92_1);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI)V")
	public static void method7485(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static77.anInt1630 != -1) {
				Static342.method7464(Static77.anInt1630);
			}
			for (@Pc(26) Class4_Sub28 local26 = (Class4_Sub28) Static242.aClass66_17.method1992(); local26 != null; local26 = (Class4_Sub28) Static242.aClass66_17.method1984()) {
				if (!local26.method9002()) {
					local26 = (Class4_Sub28) Static242.aClass66_17.method1992();
					if (local26 == null) {
						break;
					}
				}
				Static601.method7899(true, false, local26);
			}
			Static77.anInt1630 = -1;
			Static242.aClass66_17 = new Class66(8);
			Static260.method7100();
			Static77.anInt1630 = Static624.anInt9781;
			Static470.method6503(false);
			Static34.method8332();
			Static237.method3391(Static77.anInt1630);
		}
		Static106.aBoolean137 = true;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < 1 || arg3 < 1 || Static224.anInt3557 - 2 < arg2 || Static267.anInt4309 - 2 < arg3) {
			return;
		}
		@Pc(33) int local33 = arg7;
		if (arg7 < 3 && Static547.method7286(arg2, arg3)) {
			local33 = arg7 + 1;
		}
		if (Static124.aClass4_Sub20_4.aClass8_Sub3_1.method2884() == 0 && !Static260.method7101(arg3, local33, Static431.anInt6799, arg2)) {
			return;
		}
		if (Static267.aClass73ArrayArrayArray2 == null) {
			return;
		}
		Static378.aClass100_Sub1_2.method2470(arg2, Static582.aClass33_13, arg3, arg7, Static263.aClass389Array1[arg7], arg5);
		if (arg1 < 0) {
			return;
		}
		@Pc(80) int local80 = Static124.aClass4_Sub20_4.aClass8_Sub24_1.method7743();
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub24_1, 1);
		Static378.aClass100_Sub1_2.method2471(arg0, Static263.aClass389Array1[arg7], arg7, arg1, arg6, arg2, arg4, arg3, local33, Static582.aClass33_13);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub24_1, local80);
		return;
	}
}
