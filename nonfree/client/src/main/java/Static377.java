import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	public static int anInt6585 = 0;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
	public static int anInt6587 = -1;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIF[FIIFIIFIIB)V")
	public static void method5240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(5) int local5 = arg10 - arg0;
		@Pc(13) int local13 = arg1 - arg4;
		@Pc(17) int local17 = arg11 - arg8;
		@Pc(38) float local38 = (float) local5 * arg3[1] + arg3[0] * (float) local17 + (float) local13 * arg3[2];
		@Pc(59) float local59 = arg3[5] * (float) local13 + (float) local5 * arg3[4] + (float) local17 * arg3[3];
		@Pc(80) float local80 = (float) local13 * arg3[8] + (float) local5 * arg3[7] + (float) local17 * arg3[6];
		@Pc(98) float local98;
		@Pc(92) float local92;
		if (arg7 == 0) {
			local92 = arg6 + 0.5F - local80;
			local98 = local38 + arg2 + 0.5F;
		} else if (arg7 == 1) {
			local92 = arg6 + local80 + 0.5F;
			local98 = local38 + arg2 + 0.5F;
		} else if (arg7 == 2) {
			local92 = arg9 + 0.5F - local59;
			local98 = arg2 + 0.5F - local38;
		} else if (arg7 == 3) {
			local92 = arg9 + 0.5F - local59;
			local98 = local38 + arg2 + 0.5F;
		} else if (arg7 == 4) {
			local98 = arg6 + local80 + 0.5F;
			local92 = arg9 + 0.5F - local59;
		} else {
			local98 = arg6 + 0.5F - local80;
			local92 = arg9 + 0.5F - local59;
		}
		@Pc(222) float local222;
		if (arg5 == 1) {
			local222 = local98;
			local98 = -local92;
			local92 = local222;
		} else if (arg5 == 2) {
			local92 = -local92;
			local98 = -local98;
		} else if (arg5 == 3) {
			local222 = local98;
			local98 = local92;
			local92 = -local222;
		}
		Static213.aFloat28 = local98;
		Static236.aFloat31 = local92;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(JB)V")
	public static void method5241(@OriginalArg(0) long arg0) {
		if (Static175.aClass36ArrayArrayArray1 != null) {
			if (Static25.anInt7273 == 1 || Static25.anInt7273 == 5) {
				Static438.method5920(arg0);
			} else if (Static25.anInt7273 == 4) {
				Static50.method779(arg0);
			}
		}
		Static373.method5193((long) Static277.anInt5022, Static257.aClass75_8);
		if (Static103.anInt5365 != -1) {
			Static13.method314(Static103.anInt5365);
		}
		for (@Pc(47) int local47 = 0; local47 < Static153.anInt2793; local47++) {
			if (Static186.aBooleanArray12[local47]) {
				Static120.aBooleanArray3[local47] = true;
			}
			Static316.aBooleanArray20[local47] = Static186.aBooleanArray12[local47];
			Static186.aBooleanArray12[local47] = false;
		}
		Static456.anInt7597 = Static277.anInt5022;
		if (Static257.aClass75_8.method6002()) {
			Static142.aBoolean166 = true;
		}
		if (Static103.anInt5365 != -1) {
			Static153.anInt2793 = 0;
			Static111.method1812();
		}
		Static257.aClass75_8.va();
		Static408.method1353(Static257.aClass75_8);
		@Pc(98) int local98 = Static250.method3456();
		if (local98 == -1) {
			local98 = Static236.anInt3995;
		}
		if (local98 == -1) {
			local98 = Static447.anInt7439;
		}
		Static176.method2576(local98);
		Static65.method1055(Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626, Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101, Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622, Static417.anInt7158);
		Static417.anInt7158 = 0;
	}
}
