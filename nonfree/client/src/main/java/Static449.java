import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "Lclient!qga;")
	public static Class282 aClass282_3;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	public static final int anInt7908 = 1405;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "[I")
	public static final int[] anIntArray470 = new int[6];

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V")
	public static void method6299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 + 1;
		Static329.method4871(arg2, arg4, Static280.anIntArrayArray25[arg0], arg1);
		@Pc(19) int local19 = arg3 - 1;
		Static329.method4871(arg2, arg4, Static280.anIntArrayArray25[arg3], arg1);
		for (@Pc(28) int local28 = local10; local28 <= local19; local28++) {
			@Pc(34) int[] local34 = Static280.anIntArrayArray25[local28];
			local34[arg2] = local34[arg4] = arg1;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)I")
	public static int method6301(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ui;IZLclient!r;)V")
	public static void method6302(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(13) int local13;
		if (Static101.anIntArray79 != null && arg0.aByte115 >= arg1) {
			for (local13 = 0; local13 < Static101.anIntArray79.length; local13++) {
				if (Static101.anIntArray79[local13] != -1000000 && (arg0.anIntArray561[0] <= Static101.anIntArray79[local13] || Static101.anIntArray79[local13] >= arg0.anIntArray561[1] || arg0.anIntArray561[2] <= Static101.anIntArray79[local13] || Static101.anIntArray79[local13] >= arg0.anIntArray561[3]) && (arg0.anIntArray560[0] <= Static427.anIntArray460[local13] || arg0.anIntArray560[1] <= Static427.anIntArray460[local13] || Static427.anIntArray460[local13] >= arg0.anIntArray560[2] || Static427.anIntArray460[local13] >= arg0.anIntArray560[3]) && (arg0.anIntArray560[0] >= Static387.anIntArray407[local13] || Static387.anIntArray407[local13] <= arg0.anIntArray560[1] || Static387.anIntArray407[local13] <= arg0.anIntArray560[2] || arg0.anIntArray560[3] >= Static387.anIntArray407[local13]) && (Static534.anIntArray563[local13] >= arg0.anIntArray559[0] || arg0.anIntArray559[1] <= Static534.anIntArray563[local13] || arg0.anIntArray559[2] <= Static534.anIntArray563[local13] || arg0.anIntArray559[3] <= Static534.anIntArray563[local13]) && (arg0.anIntArray559[0] >= Static240.anIntArray242[local13] || arg0.anIntArray559[1] >= Static240.anIntArray242[local13] || Static240.anIntArray242[local13] <= arg0.anIntArray559[2] || Static240.anIntArray242[local13] <= arg0.anIntArray559[3])) {
					return;
				}
			}
		}
		@Pc(264) int local264;
		@Pc(289) int local289;
		@Pc(303) boolean local303;
		@Pc(331) float local331;
		if (arg0.aByte114 == 1) {
			local13 = Static548.anInt9156 + arg0.aShort110 - Static115.anInt1985;
			if (local13 >= 0 && Static548.anInt9156 + Static548.anInt9156 >= local13) {
				local264 = arg0.aShort113 + Static548.anInt9156 - Static326.anInt4975;
				if (local264 < 0) {
					local264 = 0;
				} else if (local264 > Static548.anInt9156 + Static548.anInt9156) {
					return;
				}
				local289 = arg0.aShort112 + Static548.anInt9156 - Static326.anInt4975;
				if (Static548.anInt9156 + Static548.anInt9156 < local289) {
					local289 = Static548.anInt9156 + Static548.anInt9156;
				} else if (local289 < 0) {
					return;
				}
				local303 = false;
				while (local264 <= local289) {
					if (Static496.aBooleanArrayArray7[local13][local264++]) {
						local303 = true;
						break;
					}
				}
				if (local303) {
					local331 = Static465.anInt8057 - arg0.anIntArray560[0];
					if (local331 < 0.0F) {
						local331 *= -1.0F;
					}
					if (!local331 < (float) Static246.anInt4537 && (Static325.method4832(0, arg0) && (Static325.method4832(1, arg0) && (Static325.method4832(2, arg0) && Static325.method4832(3, arg0))))) {
						Static412.aClass333Array6[Static385.anInt6903++] = arg0;
					}
				}
			}
		} else if (arg0.aByte114 == 2) {
			local13 = Static548.anInt9156 + arg0.aShort113 - Static326.anInt4975;
			if (local13 >= 0 && local13 <= Static548.anInt9156 + Static548.anInt9156) {
				local264 = Static548.anInt9156 + arg0.aShort110 - Static115.anInt1985;
				if (local264 < 0) {
					local264 = 0;
				} else if (local264 > Static548.anInt9156 + Static548.anInt9156) {
					return;
				}
				local289 = arg0.aShort111 + Static548.anInt9156 - Static115.anInt1985;
				if (local289 > Static548.anInt9156 + Static548.anInt9156) {
					local289 = Static548.anInt9156 + Static548.anInt9156;
				} else if (local289 < 0) {
					return;
				}
				local303 = false;
				while (local264 <= local289) {
					if (Static496.aBooleanArrayArray7[local264++][local13]) {
						local303 = true;
						break;
					}
				}
				if (local303) {
					local331 = Static525.anInt8938 - arg0.anIntArray559[0];
					if (local331 < 0.0F) {
						local331 *= -1.0F;
					}
					if (!((float) Static246.anInt4537 > local331) && (Static325.method4832(0, arg0) && (Static325.method4832(1, arg0) && (Static325.method4832(2, arg0) && Static325.method4832(3, arg0))))) {
						Static412.aClass333Array6[Static385.anInt6903++] = arg0;
					}
				}
			}
		} else if (arg0.aByte114 == 16 || arg0.aByte114 == 8) {
			local13 = arg0.aShort110 + Static548.anInt9156 - Static115.anInt1985;
			if (local13 >= 0 && Static548.anInt9156 + Static548.anInt9156 >= local13) {
				local264 = arg0.aShort113 + Static548.anInt9156 - Static326.anInt4975;
				if (local264 >= 0 && Static548.anInt9156 + Static548.anInt9156 >= local264 && Static496.aBooleanArrayArray7[local13][local264]) {
					@Pc(590) float local590 = (float) (Static465.anInt8057 - arg0.anIntArray560[0]);
					if (local590 < 0.0F) {
						local590 *= -1.0F;
					}
					@Pc(607) float local607 = (float) (Static525.anInt8938 - arg0.anIntArray559[0]);
					if (local607 < 0.0F) {
						local607 *= -1.0F;
					}
					if ((!(local590 < (float) Static246.anInt4537) || !((float) Static246.anInt4537 > local607)) && (Static325.method4832(0, arg0) && (Static325.method4832(1, arg0) && (Static325.method4832(2, arg0) && Static325.method4832(3, arg0))))) {
						Static412.aClass333Array6[Static385.anInt6903++] = arg0;
					}
				}
			}
		} else if (arg0.aByte114 == 4) {
			@Pc(673) float local673 = (float) (arg0.anIntArray561[0] - Static230.anInt4290);
			if (!(local673 <= (float) Static569.anInt9390)) {
				local264 = arg0.aShort113 + Static548.anInt9156 - Static326.anInt4975;
				if (local264 < 0) {
					local264 = 0;
				} else if (Static548.anInt9156 + Static548.anInt9156 < local264) {
					return;
				}
				local289 = arg0.aShort112 + Static548.anInt9156 - Static326.anInt4975;
				if (local289 > Static548.anInt9156 + Static548.anInt9156) {
					local289 = Static548.anInt9156 + Static548.anInt9156;
				} else if (local289 < 0) {
					return;
				}
				@Pc(735) int local735 = Static548.anInt9156 + arg0.aShort110 - Static115.anInt1985;
				if (local735 < 0) {
					local735 = 0;
				} else if (local735 > Static548.anInt9156 + Static548.anInt9156) {
					return;
				}
				@Pc(760) int local760 = arg0.aShort111 + Static548.anInt9156 - Static115.anInt1985;
				if (Static548.anInt9156 + Static548.anInt9156 < local760) {
					local760 = Static548.anInt9156 + Static548.anInt9156;
				} else if (local760 < 0) {
					return;
				}
				@Pc(784) boolean local784 = false;
				label283: for (@Pc(786) int local786 = local735; local786 <= local760; local786++) {
					for (@Pc(790) int local790 = local264; local790 <= local289; local790++) {
						if (Static496.aBooleanArrayArray7[local786][local790]) {
							local784 = true;
							break label283;
						}
					}
				}
				if (local784 && (Static325.method4832(0, arg0) && (Static325.method4832(1, arg0) && (Static325.method4832(2, arg0) && Static325.method4832(3, arg0))))) {
					Static412.aClass333Array6[Static385.anInt6903++] = arg0;
				}
			}
		}
	}
}
