import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
	public static int anInt674;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILclient!ha;Lclient!bha;)V")
	public static void method594(@OriginalArg(1) int arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class38 arg2) {
		@Pc(13) int local13;
		if (Static53.anIntArray44 != null && arg0 <= arg2.aByte8) {
			for (local13 = 0; local13 < Static53.anIntArray44.length; local13++) {
				if (Static53.anIntArray44[local13] != -1000000 && (arg2.anIntArray31[0] <= Static53.anIntArray44[local13] || arg2.anIntArray31[1] <= Static53.anIntArray44[local13] || arg2.anIntArray31[2] <= Static53.anIntArray44[local13] || arg2.anIntArray31[3] <= Static53.anIntArray44[local13]) && (Static300.anIntArray564[local13] >= arg2.anIntArray32[0] || arg2.anIntArray32[1] <= Static300.anIntArray564[local13] || arg2.anIntArray32[2] <= Static300.anIntArray564[local13] || arg2.anIntArray32[3] <= Static300.anIntArray564[local13]) && (arg2.anIntArray32[0] >= Static308.anIntArray331[local13] || Static308.anIntArray331[local13] <= arg2.anIntArray32[1] || arg2.anIntArray32[2] >= Static308.anIntArray331[local13] || arg2.anIntArray32[3] >= Static308.anIntArray331[local13]) && (Static160.anIntArray137[local13] >= arg2.anIntArray33[0] || arg2.anIntArray33[1] <= Static160.anIntArray137[local13] || Static160.anIntArray137[local13] >= arg2.anIntArray33[2] || Static160.anIntArray137[local13] >= arg2.anIntArray33[3]) && (Static669.anIntArray609[local13] <= arg2.anIntArray33[0] || Static669.anIntArray609[local13] <= arg2.anIntArray33[1] || arg2.anIntArray33[2] >= Static669.anIntArray609[local13] || arg2.anIntArray33[3] >= Static669.anIntArray609[local13])) {
					return;
				}
			}
		}
		@Pc(262) int local262;
		@Pc(286) int local286;
		@Pc(308) boolean local308;
		@Pc(340) float local340;
		if (arg2.aByte9 == 1) {
			local13 = Static187.anInt6996 + arg2.aShort4 - Static57.anInt852;
			if (local13 >= 0 && local13 <= Static187.anInt6996 + Static187.anInt6996) {
				local262 = Static187.anInt6996 + arg2.aShort2 - Static481.anInt8080;
				if (local262 < 0) {
					local262 = 0;
				} else if (Static187.anInt6996 + Static187.anInt6996 < local262) {
					return;
				}
				local286 = arg2.aShort3 + Static187.anInt6996 - Static481.anInt8080;
				if (Static187.anInt6996 + Static187.anInt6996 < local286) {
					local286 = Static187.anInt6996 + Static187.anInt6996;
				} else if (local286 < 0) {
					return;
				}
				local308 = false;
				while (local286 >= local262) {
					if (Static453.aBooleanArrayArray4[local13][local262++]) {
						local308 = true;
						break;
					}
				}
				if (local308) {
					local340 = (float) (Static66.anInt6449 - arg2.anIntArray32[0]);
					if (local340 < 0.0F) {
						local340 *= -1.0F;
					}
					if (!local340 < (float) Static518.anInt8630 && (Static660.method8813(0, arg2) && (Static660.method8813(1, arg2) && (Static660.method8813(2, arg2) && Static660.method8813(3, arg2))))) {
						Static390.aClass38Array2[Static530.anInt8752++] = arg2;
					}
				}
			}
		} else if (arg2.aByte9 == 2) {
			local13 = Static187.anInt6996 + arg2.aShort2 - Static481.anInt8080;
			if (local13 >= 0 && Static187.anInt6996 + Static187.anInt6996 >= local13) {
				local262 = arg2.aShort4 + Static187.anInt6996 - Static57.anInt852;
				if (local262 < 0) {
					local262 = 0;
				} else if (local262 > Static187.anInt6996 + Static187.anInt6996) {
					return;
				}
				local286 = arg2.aShort5 + Static187.anInt6996 - Static57.anInt852;
				if (Static187.anInt6996 + Static187.anInt6996 < local286) {
					local286 = Static187.anInt6996 + Static187.anInt6996;
				} else if (local286 < 0) {
					return;
				}
				local308 = false;
				while (local262 <= local286) {
					if (Static453.aBooleanArrayArray4[local262++][local13]) {
						local308 = true;
						break;
					}
				}
				if (local308) {
					local340 = (float) (Static309.anInt5881 - arg2.anIntArray33[0]);
					if (local340 < 0.0F) {
						local340 *= -1.0F;
					}
					if (!(local340 < (float) Static518.anInt8630) && (Static660.method8813(0, arg2) && (Static660.method8813(1, arg2) && (Static660.method8813(2, arg2) && Static660.method8813(3, arg2))))) {
						Static390.aClass38Array2[Static530.anInt8752++] = arg2;
					}
				}
			}
		} else if (arg2.aByte9 == 16 || arg2.aByte9 == 8) {
			local13 = arg2.aShort4 + Static187.anInt6996 - Static57.anInt852;
			if (local13 >= 0 && local13 <= Static187.anInt6996 + Static187.anInt6996) {
				local262 = arg2.aShort2 + Static187.anInt6996 - Static481.anInt8080;
				if (local262 >= 0 && local262 <= Static187.anInt6996 + Static187.anInt6996 && Static453.aBooleanArrayArray4[local13][local262]) {
					@Pc(607) float local607 = (float) (Static66.anInt6449 - arg2.anIntArray32[0]);
					if (local607 < 0.0F) {
						local607 *= -1.0F;
					}
					@Pc(624) float local624 = (float) (Static309.anInt5881 - arg2.anIntArray33[0]);
					if (local624 < 0.0F) {
						local624 *= -1.0F;
					}
					if ((!((float) Static518.anInt8630 > local607) || !(local624 < (float) Static518.anInt8630)) && (Static660.method8813(0, arg2) && (Static660.method8813(1, arg2) && (Static660.method8813(2, arg2) && Static660.method8813(3, arg2))))) {
						Static390.aClass38Array2[Static530.anInt8752++] = arg2;
					}
				}
			}
		} else if (arg2.aByte9 == 4) {
			@Pc(693) float local693 = (float) (arg2.anIntArray31[0] - Static592.anInt9719);
			if (!((float) Static281.anInt5401 >= local693)) {
				local262 = Static187.anInt6996 + arg2.aShort2 - Static481.anInt8080;
				if (local262 < 0) {
					local262 = 0;
				} else if (local262 > Static187.anInt6996 + Static187.anInt6996) {
					return;
				}
				local286 = arg2.aShort3 + Static187.anInt6996 - Static481.anInt8080;
				if (Static187.anInt6996 + Static187.anInt6996 < local286) {
					local286 = Static187.anInt6996 + Static187.anInt6996;
				} else if (local286 < 0) {
					return;
				}
				@Pc(756) int local756 = Static187.anInt6996 + arg2.aShort4 - Static57.anInt852;
				if (local756 < 0) {
					local756 = 0;
				} else if (Static187.anInt6996 + Static187.anInt6996 < local756) {
					return;
				}
				@Pc(777) int local777 = arg2.aShort5 + Static187.anInt6996 - Static57.anInt852;
				if (Static187.anInt6996 + Static187.anInt6996 < local777) {
					local777 = Static187.anInt6996 + Static187.anInt6996;
				} else if (local777 < 0) {
					return;
				}
				@Pc(791) boolean local791 = false;
				label283: for (@Pc(793) int local793 = local756; local793 <= local777; local793++) {
					for (@Pc(797) int local797 = local262; local797 <= local286; local797++) {
						if (Static453.aBooleanArrayArray4[local793][local797]) {
							local791 = true;
							break label283;
						}
					}
				}
				if (local791 && (Static660.method8813(0, arg2) && (Static660.method8813(1, arg2) && (Static660.method8813(2, arg2) && Static660.method8813(3, arg2))))) {
					Static390.aClass38Array2[Static530.anInt8752++] = arg2;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([IB[Ljava/lang/String;)V")
	public static void method595(@OriginalArg(0) int[] arg0, @OriginalArg(2) String[] arg1) {
		Static645.method8708(arg0, arg1, 0, arg1.length - 1);
	}
}
