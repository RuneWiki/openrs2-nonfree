import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!su", name = "M", descriptor = "I")
	public static int anInt6185 = 0;

	@OriginalMember(owner = "client!su", name = "W", descriptor = "[Lclient!mk;")
	public static final Class158[] aClass158Array1 = new Class158[4];

	@OriginalMember(owner = "client!su", name = "bb", descriptor = "[I")
	public static final int[] anIntArray459 = new int[4];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	public static void method4958() {
		Static178.anInt3199 = 0;
		Static248.anInt4432 = 0;
		Static275.anInt4732 = 0;
		Static227.anInt4114 = 0;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BZIIII)V")
	public static void method4961(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static259.aClass216ArrayArrayArray3 == null) {
			Static186.aClass117_3.method5664(arg3, arg1, -16777216, arg4, arg2);
		} else if (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 >= 0 && Static147.anInt2300 * 128 > Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 && Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 >= 0 && Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 < Static293.anInt4886 * 128) {
			Static330.anInt5429++;
			if (Static94.aClass11_Sub1_Sub3_Sub2_1 != null && Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 + 64 - Static94.aClass11_Sub1_Sub3_Sub2_1.method2635() * 64 >> 7 == Static460.anInt7364 && Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 - (Static94.aClass11_Sub1_Sub3_Sub2_1.method2635() - 1) * 64 >> 7 == Static288.anInt4834) {
				Static288.anInt4834 = -1;
				Static460.anInt7364 = -1;
				Static413.method5275();
			}
			Static18.method3402();
			if (!arg0) {
				Static38.method499();
			}
			Static278.method4443();
			Static223.method4564(arg4, arg3, true, arg2, arg1);
			@Pc(108) int local108 = Static286.anInt4797;
			@Pc(110) int local110 = Static440.anInt3187;
			@Pc(112) int local112 = Static294.anInt4901;
			@Pc(114) int local114 = Static425.anInt6825;
			@Pc(133) int local133;
			@Pc(168) int local168;
			if (Static139.anInt2147 == 1) {
				local133 = (int) Static336.aFloat72;
				if (Static77.anInt1084 >> 8 > local133) {
					local133 = Static77.anInt1084 >> 8;
				}
				if (Static269.aBooleanArray106[4] && local133 < Static301.anIntArray379[4] + 128) {
					local133 = Static301.anIntArray379[4] + 128;
				}
				local168 = Static232.anInt4194 + (int) Static99.aFloat9 & 0x3FFF;
				Static164.method5258(Static446.anInt7039, Static135.method1732(Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428, Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430, Static390.anInt6272) - 50, (local133 >> 3) * 3 + 600 << 0, Static23.anInt350, local133, local108, local168);
			} else if (Static139.anInt2147 == 4) {
				local133 = (int) Static336.aFloat72;
				if (local133 < Static77.anInt1084 >> 8) {
					local133 = Static77.anInt1084 >> 8;
				}
				if (Static269.aBooleanArray106[4] && Static301.anIntArray379[4] + 128 > local133) {
					local133 = Static301.anIntArray379[4] + 128;
				}
				local168 = (int) Static99.aFloat9 & 0x3FFF;
				Static164.method5258(Static446.anInt7039, Static135.method1732(Static75.anInt1065, Static4.anInt58, Static390.anInt6272) - 50, (local133 >> 3) * 3 + 600 << 0, Static23.anInt350, local133, local108, local168);
			} else if (Static139.anInt2147 == 5) {
				Static278.method4441(local108);
			}
			local133 = Static386.anInt7155;
			local168 = Static375.anInt6055;
			@Pc(260) int local260 = Static80.anInt1106;
			@Pc(262) int local262 = Static129.anInt1972;
			@Pc(264) int local264 = Static398.anInt6386;
			@Pc(307) int local307;
			for (@Pc(266) int local266 = 0; local266 < 5; local266++) {
				if (Static269.aBooleanArray106[local266]) {
					local307 = (int) (Math.random() * (double) (Static364.anIntArray446[local266] * 2 + 1) - (double) Static364.anIntArray446[local266] + Math.sin((double) Static215.anIntArray71[local266] * ((double) Static250.anIntArray330[local266] / 100.0D)) * (double) Static301.anIntArray379[local266]);
					if (local266 == 2) {
						Static80.anInt1106 += local307;
					}
					if (local266 == 4) {
						Static129.anInt1972 += local307;
						if (Static129.anInt1972 < 1024) {
							Static129.anInt1972 = 1024;
						} else if (Static129.anInt1972 > 3072) {
							Static129.anInt1972 = 3072;
						}
					}
					if (local266 == 1) {
						Static375.anInt6055 += local307;
					}
					if (local266 == 3) {
						Static398.anInt6386 = Static398.anInt6386 + local307 & 0x3FFF;
					}
					if (local266 == 0) {
						Static386.anInt7155 += local307;
					}
				}
			}
			if (Static386.anInt7155 < 0) {
				Static386.anInt7155 = 0;
			}
			if (Static386.anInt7155 > (Static174.anInt2873 << 7) - 1) {
				Static386.anInt7155 = (Static174.anInt2873 << 7) - 1;
			}
			if (Static80.anInt1106 < 0) {
				Static80.anInt1106 = 0;
			}
			if ((Static325.anInt5351 << 7) - 1 < Static80.anInt1106) {
				Static80.anInt1106 = (Static325.anInt5351 << 7) - 1;
			}
			Static448.method5773();
			Static436.method5492();
			Static186.aClass117_3.ba(local110, local112, local110 + local114, local108 + local112);
			Static186.aClass117_3.method5665();
			local307 = Static106.anInt7395;
			if (Static203.aClass197_1 == null) {
				Static186.aClass117_3.t(local307);
			} else {
				Static203.aClass197_1.method4171(local307, Static186.aClass117_3, local108, Static331.anInt5431 << 3, local112, Static398.anInt6386, local110, local114, Static129.anInt1972);
			}
			Static459.method5910();
			Static329.aClass34_5.YA(Static386.anInt7155, Static375.anInt6055, Static80.anInt1106, -Static129.anInt1972 & 0x3FFF, -Static398.anInt6386 & 0x3FFF, -Static39.anInt573 & 0x3FFF);
			Static186.aClass117_3.SA(Static329.aClass34_5);
			Static186.aClass117_3.GA(local110 + local114 / 2, local108 / 2 + local112, Static112.anInt1712 << 1, Static112.anInt1712 << 1);
			Static267.method3684(Static112.anInt1712 << 1, local112 + local108 / 2, Static112.anInt1712 << 1, local114 / 2 + local110);
			Static74.method3129(Static375.anInt6055, Static386.anInt7155, -Static39.anInt573 & 0x3FFF, -Static129.anInt1972 & 0x3FFF, Static80.anInt1106, -Static398.anInt6386 & 0x3FFF);
			@Pc(540) byte local540 = Static126.aClass19_Sub1_1.method3348(Static214.anInt3968) == 2 ? (byte) Static330.anInt5429 : 1;
			Static17.method3335(Static186.aClass117_3, Static98.anInt1304, Static452.anInt7194, Static329.aClass34_5, Static386.anInt7155, Static375.anInt6055, Static80.anInt1106, Static380.aByteArrayArrayArray17, Static214.anIntArray283, Static340.anIntArray401, Static290.anIntArray368, Static263.anIntArray345, Static372.anIntArray452, Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 + 1, local540, Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 >> 7, Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 >> 7, !Static126.aClass19_Sub1_1.aBoolean389);
			Static459.method5910();
			if (Static135.anInt2114 == 9) {
				Static67.method5767(local108, local112, local114, local110);
				Static398.method5159(local112, local110, local114, local108);
				Static304.method730(local114, local110, local112, local108);
				Static383.method4929(local110, local114, local108, local112);
			}
			Static152.method1913();
			Static386.anInt7155 = local133;
			Static375.anInt6055 = local168;
			Static80.anInt1106 = local260;
			Static129.anInt1972 = local262;
			Static398.anInt6386 = local264;
			if (Static373.aBoolean643 && Static270.aClass269_3.method5763() == 0) {
				Static373.aBoolean643 = false;
			}
			if (Static373.aBoolean643) {
				Static186.aClass117_3.method5664(local114, local112, -16777216, local108, local110);
				Static63.method859(false, Static464.aClass137_8, Static19.aClass142_4.method3118(Static63.anInt981));
			}
		} else {
			Static186.aClass117_3.method5664(arg3, arg1, -16777216, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(III)V")
	public static void method4964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(0, 15);
		local8.method384();
		local8.anInt381 = arg0;
		local8.anInt387 = arg1;
	}
}
