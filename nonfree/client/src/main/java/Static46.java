import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
	public static int anInt1577;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
	public static int anInt1571 = -1;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIILclient!ha;II)V")
	public static void method1365(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class16 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if ((Static517.aClass21_30 == null || Static619.aClass21_33 == null || Static310.aClass21_11 == null) && Static630.aClass237_149.method6296(Static376.anInt7101) && Static630.aClass237_149.method6296(Static480.anInt8592) && Static630.aClass237_149.method6296(Static464.anInt8444)) {
			@Pc(27) Class111 local27 = Static647.method3292(Static630.aClass237_149, Static480.anInt8592, 0);
			Static619.aClass21_33 = arg2.method6135(local27, true);
			local27.method3286();
			Static212.aClass21_8 = arg2.method6135(local27, true);
			Static517.aClass21_30 = arg2.method6135(Static647.method3292(Static630.aClass237_149, Static376.anInt7101, 0), true);
			@Pc(52) Class111 local52 = Static647.method3292(Static630.aClass237_149, Static464.anInt8444, 0);
			Static310.aClass21_11 = arg2.method6135(local52, true);
			local52.method3286();
			Static464.aClass21_28 = arg2.method6135(local52, true);
		}
		if (Static517.aClass21_30 == null || Static619.aClass21_33 == null || Static310.aClass21_11 == null) {
			return;
		}
		@Pc(93) int local93 = (arg1 - Static310.aClass21_11.method5790() * 2) / Static517.aClass21_30.method5790();
		for (@Pc(95) int local95 = 0; local95 < local93; local95++) {
			Static517.aClass21_30.method5796(arg0 + Static310.aClass21_11.method5790() + local95 * Static517.aClass21_30.method5790(), -Static517.aClass21_30.method5783() + arg4 + arg3);
		}
		@Pc(135) int local135 = (arg4 - Static310.aClass21_11.method5783() - 20) / Static619.aClass21_33.method5783();
		for (@Pc(137) int local137 = 0; local137 < local135; local137++) {
			Static619.aClass21_33.method5796(arg0, local137 * Static619.aClass21_33.method5783() + arg3 + 20);
			Static212.aClass21_8.method5796(arg0 + arg1 - Static212.aClass21_8.method5790(), Static619.aClass21_33.method5783() * local137 + 20 + arg3);
		}
		Static310.aClass21_11.method5796(arg0, arg3 + arg4 - Static310.aClass21_11.method5783());
		Static464.aClass21_28.method5796(arg0 + arg1 - Static310.aClass21_11.method5790(), -Static310.aClass21_11.method5783() + arg3 + arg4);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!oaa;Lclient!ha;I)I")
	public static int method1366(@OriginalArg(0) Class232 arg0, @OriginalArg(1) Class16 arg1) {
		if (arg0.anInt7449 != -1) {
			return arg0.anInt7449;
		}
		if (arg0.anInt7443 != -1) {
			@Pc(24) Class218 local24 = arg1.anInterface2_12.method4027(arg0.anInt7443);
			if (!local24.aBoolean471) {
				return local24.aShort73;
			}
		}
		return arg0.anInt7442;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIIIIIIIB)Z")
	public static boolean method1367(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) int local8 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray435[0];
		@Pc(13) int local13 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray436[0];
		if (local8 < 0 || local8 >= Static372.anInt7082 || local13 < 0 || local13 >= Static218.anInt5023) {
			return false;
		} else if (arg7 >= 0 && Static372.anInt7082 > arg7 && arg3 >= 0 && arg3 < Static218.anInt5023) {
			@Pc(80) int local80 = Static553.method7769(Static21.anIntArray25, arg3, local8, arg7, local13, Static204.aClass48Array1[Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124], arg5, arg6, arg0, arg4, arg2, Static581.anIntArray582, arg1, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method6692());
			if (local80 < 1) {
				return false;
			}
			Static370.anInt7031 = Static21.anIntArray25[local80 - 1];
			Static29.anInt1137 = Static581.anIntArray582[local80 - 1];
			Static447.aBoolean310 = false;
			Static21.method901();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Z")
	public static boolean method1368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
