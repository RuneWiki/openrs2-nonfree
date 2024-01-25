import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "Lclient!wk;")
	public static Class266 aClass266_1;

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
	public static int anInt3194 = 0;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
	public static void method2467() {
		if (Static413.aClass49_Sub1_1.method2488(Static341.anInt5549) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static129.anInt2333 - 4 & 0xFF);
		@Pc(23) int local23 = Static129.anInt2333 % Static337.anInt5497;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static282.anInt4644; local29++) {
				Static267.aByteArrayArrayArray14[local25][local23][local29] = local19;
			}
		}
		if (Static68.anInt1387 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static54.anIntArray93[local29] = -1000000;
			Static356.anIntArray466[local29] = 1000000;
			Static221.anIntArray278[local29] = 0;
			Static184.anIntArray259[local29] = 1000000;
			Static249.anIntArray573[local29] = 0;
		}
		@Pc(133) int local133;
		if (Static97.anInt1791 != 1) {
			local133 = Static94.method4425(Static393.anInt7135, Static68.anInt1387, Static235.anInt4004);
			if (local133 - Static222.anInt3814 >= 800 || (Static4.aByteArrayArrayArray1[Static68.anInt1387][Static235.anInt4004 >> 7][Static393.anInt7135 >> 7] & 0x4) == 0) {
				return;
			}
			Static384.method5092(Static432.aClass75ArrayArrayArray6, false, Static235.anInt4004 >> 7, Static393.anInt7135 >> 7, 1);
			return;
		}
		if ((Static4.aByteArrayArrayArray1[Static68.anInt1387][Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 >> 7][Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 >> 7] & 0x4) != 0) {
			Static384.method5092(Static432.aClass75ArrayArrayArray6, false, Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 >> 7, Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 >> 7, 0);
		}
		if (Static133.anInt2435 >= 2560) {
			return;
		}
		local133 = Static235.anInt4004 >> 7;
		@Pc(137) int local137 = Static393.anInt7135 >> 7;
		@Pc(142) int local142 = Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 >> 7;
		@Pc(147) int local147 = Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 >> 7;
		@Pc(159) int local159;
		if (local133 < local142) {
			local159 = local142 - local133;
		} else {
			local159 = local133 - local142;
		}
		@Pc(174) int local174;
		if (local147 <= local137) {
			local174 = local137 - local147;
		} else {
			local174 = local147 - local137;
		}
		if ((local159 != 0 || local174 != 0) && -Static337.anInt5497 < local159 && Static337.anInt5497 > local159 && -Static282.anInt4644 < local174 && local174 < Static282.anInt4644) {
			@Pc(245) int local245;
			@Pc(247) int local247;
			if (local174 < local159) {
				local245 = local174 * 65536 / local159;
				local247 = 32768;
				while (local142 != local133) {
					if (local142 > local133) {
						local133++;
					} else if (local142 < local133) {
						local133--;
					}
					if ((Static4.aByteArrayArrayArray1[Static68.anInt1387][local133][local137] & 0x4) != 0) {
						Static384.method5092(Static432.aClass75ArrayArrayArray6, false, local133, local137, 1);
						return;
					}
					local247 += local245;
					if (local247 >= 65536) {
						if (local147 > local137) {
							local137++;
						} else if (local147 < local137) {
							local137--;
						}
						local247 -= 65536;
						if ((Static4.aByteArrayArrayArray1[Static68.anInt1387][local133][local137] & 0x4) != 0) {
							Static384.method5092(Static432.aClass75ArrayArrayArray6, false, local133, local137, 1);
							return;
						}
					}
				}
				return;
			}
			local245 = local159 * 65536 / local174;
			local247 = 32768;
			while (local137 != local147) {
				if (local147 > local137) {
					local137++;
				} else if (local147 < local137) {
					local137--;
				}
				if ((Static4.aByteArrayArrayArray1[Static68.anInt1387][local133][local137] & 0x4) != 0) {
					Static384.method5092(Static432.aClass75ArrayArrayArray6, false, local133, local137, 1);
					return;
				}
				local247 += local245;
				if (local247 >= 65536) {
					if (local133 < local142) {
						local133++;
					} else if (local133 > local142) {
						local133--;
					}
					local247 -= 65536;
					if ((Static4.aByteArrayArrayArray1[Static68.anInt1387][local133][local137] & 0x4) != 0) {
						Static384.method5092(Static432.aClass75ArrayArrayArray6, false, local133, local137, 1);
						return;
					}
				}
			}
			return;
		}
		Static33.method448(null, "RC: " + local133 + "," + local137 + " " + local142 + "," + local147 + " " + Static365.anInt6047 + "," + Static366.anInt6052);
		return;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)Z")
	public static boolean method2473(@OriginalArg(1) int arg0) {
		if (arg0 == 51 || arg0 == 18 || arg0 == 57 || arg0 == 45 || arg0 == 9) {
			return true;
		} else {
			return arg0 == 48 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!ga;BLjava/awt/Canvas;ILclient!pc;I)Lclient!ya;")
	public static Class135 method2474(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class196 arg3, @OriginalArg(5) int arg4) {
		return new Class135_Sub2(arg4, arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIIIIZI)V")
	public static void method2475(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg0 < 128 || arg6 < 128 || (Static337.anInt5497 - 2) * 128 < arg0 || arg6 > Static282.anInt4644 * 128 - 256) {
			Static73.anIntArray111[0] = Static73.anIntArray111[1] = -1;
			return;
		}
		@Pc(50) int local50 = Static94.method4425(arg6, arg5, arg0) - arg2;
		Static423.aClass35_5.o(arg4, 0, 0);
		Static39.aClass135_1.ea(Static423.aClass35_5);
		Static39.aClass135_1.X(arg0, local50, arg6, Static73.anIntArray111);
		Static423.aClass35_5.o(-arg4, 0, 0);
		Static39.aClass135_1.ea(Static423.aClass35_5);
	}
}
