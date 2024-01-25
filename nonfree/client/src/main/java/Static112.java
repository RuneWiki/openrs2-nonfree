import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Z")
	public static boolean method2196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static381.anIntArrayArrayArray11[arg0][arg1][arg2];
		if (local7 == -Static290.anInt5373) {
			return false;
		} else if (local7 == Static290.anInt5373) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static391.anInt6797;
			@Pc(26) int local26 = arg2 << Static391.anInt6797;
			if (Static254.method4160(local22 + 1, Static389.aClass14Array3[arg0].oa(arg1, arg2), local26 + 1) && Static254.method4160(local22 + Static223.anInt4452 - 1, Static389.aClass14Array3[arg0].oa(arg1 + 1, arg2), local26 + 1) && Static254.method4160(local22 + Static223.anInt4452 - 1, Static389.aClass14Array3[arg0].oa(arg1 + 1, arg2 + 1), local26 + Static223.anInt4452 - 1) && Static254.method4160(local22 + 1, Static389.aClass14Array3[arg0].oa(arg1, arg2 + 1), local26 + Static223.anInt4452 - 1) && Static254.method4160(local22 + Static423.anInt7318, Static389.aClass14Array3[arg0].oa(arg1, arg2), local26 + 1) && Static254.method4160(local22 + Static223.anInt4452 - 1, Static389.aClass14Array3[arg0].oa(arg1 + 1, arg2), local26 + Static423.anInt7318) && Static254.method4160(local22 + Static423.anInt7318, Static389.aClass14Array3[arg0].oa(arg1, arg2 + 1), local26 + Static223.anInt4452 - 1) && Static254.method4160(local22 + Static223.anInt4452 - 1, Static389.aClass14Array3[arg0].oa(arg1, arg2), local26 + Static423.anInt7318) && Static254.method4160(local22 + Static423.anInt7318, Static389.aClass14Array3[arg0].oa(arg1, arg2), local26 + Static423.anInt7318)) {
				Static381.anIntArrayArrayArray11[arg0][arg1][arg2] = Static290.anInt5373;
				return true;
			} else {
				Static381.anIntArrayArrayArray11[arg0][arg1][arg2] = -Static290.anInt5373;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)Z")
	public static boolean method2197(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 3 || arg0 == 1008 || arg0 == 51 || arg0 == 11;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!m;)V")
	public static void method2199(@OriginalArg(0) Class153 arg0) {
		if (Static398.anInt7036 >= 65535) {
			return;
		}
		@Pc(6) Class4_Sub17 local6 = arg0.aClass4_Sub17_2;
		client.lb[Static398.anInt7036] = arg0;
		Static141.aBooleanArray158[Static398.anInt7036] = false;
		Static398.anInt7036++;
		@Pc(21) int local21 = arg0.anInt4679;
		if (arg0.aBoolean307) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt4679;
		if (arg0.aBoolean306) {
			local29 = Static227.anInt4511 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method6161() + Static423.anInt7318 - local6.method6160() >> Static391.anInt6797;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method6161() + local6.method6160() - Static423.anInt7318 >> Static391.anInt6797;
			if (local73 >= Static268.anInt5106) {
				local73 = Static268.anInt5106 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray74[local41++];
				@Pc(105) int local105 = (local6.method6165() + Static423.anInt7318 - local6.method6160() >> Static391.anInt6797) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static230.anInt4581) {
					local113 = Static230.anInt4581 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static170.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static170.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static398.anInt7036;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static170.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static398.anInt7036 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static170.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static398.anInt7036 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static170.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static398.anInt7036 << 48;
					}
				}
			}
		}
	}
}
