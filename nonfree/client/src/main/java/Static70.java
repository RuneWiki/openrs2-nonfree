import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "[I")
	public static final int[] anIntArray59 = new int[3];

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!wca;[[BI)V")
	public static void method1166(@OriginalArg(0) Class234_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0.anInt9510; local8++) {
			Static275.method4012();
			for (@Pc(16) int local16 = 0; local16 < Static458.anInt9736 >> 3; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static378.anInt6747 >> 3; local20++) {
					@Pc(30) int local30 = Static593.anIntArrayArrayArray20[local8][local16][local20];
					if (local30 != -1) {
						@Pc(40) int local40 = local30 >> 24 & 0x3;
						if (!arg0.aBoolean709 || local40 == 0) {
							@Pc(54) int local54 = local30 >> 1 & 0x3;
							@Pc(60) int local60 = local30 >> 14 & 0x3FF;
							@Pc(66) int local66 = local30 >> 3 & 0x7FF;
							@Pc(76) int local76 = local66 / 8 + (local60 / 8 << 8);
							for (@Pc(78) int local78 = 0; local78 < Static91.anIntArray519.length; local78++) {
								if (Static91.anIntArray519[local78] == local76 && arg1[local78] != null) {
									arg0.method7755(Static590.aClass240Array1, local54, (local66 & 0x7) * 8, local8, arg1[local78], (local60 & 0x7) * 8, Static31.aClass78_18, local20 * 8, local40, local16 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZII)I")
	public static int method1168(@OriginalArg(2) int arg0) {
		@Pc(16) Class1_Sub45 local16 = Static365.method5366(arg0, false);
		if (local16 == null) {
			return Static168.aClass366_1.method7985(arg0).anInt7757;
		}
		@Pc(26) int local26 = 0;
		for (@Pc(33) int local33 = 0; local33 < local16.anIntArray521.length; local33++) {
			if (local16.anIntArray521[local33] == -1) {
				local26++;
			}
		}
		return local26 + Static168.aClass366_1.method7985(arg0).anInt7757 - local16.anIntArray521.length;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
	public static void method1170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		Static478.aBoolean368 = Static458.aClass78_153.method6777() > 0;
		Static364.aBoolean618 = true;
		Static115.anInt1985 = arg1 >> Static166.anInt7796;
		Static326.anInt4975 = arg3 >> Static166.anInt7796;
		Static465.anInt8057 = arg1;
		Static525.anInt8938 = arg3;
		Static230.anInt4290 = arg2;
		Static189.anInt3742 = Static115.anInt1985 - Static548.anInt9156;
		if (Static189.anInt3742 < 0) {
			Static277.anInt5051 = -Static189.anInt3742;
			Static189.anInt3742 = 0;
		} else {
			Static277.anInt5051 = 0;
		}
		Static179.anInt3330 = Static326.anInt4975 - Static548.anInt9156;
		if (Static179.anInt3330 < 0) {
			Static79.anInt1537 = -Static179.anInt3330;
			Static179.anInt3330 = 0;
		} else {
			Static79.anInt1537 = 0;
		}
		Static373.anInt6718 = Static115.anInt1985 + Static548.anInt9156;
		if (Static373.anInt6718 > Static327.anInt5993) {
			Static373.anInt6718 = Static327.anInt5993;
		}
		Static9.anInt277 = Static326.anInt4975 + Static548.anInt9156;
		if (Static9.anInt277 > Static191.anInt3757) {
			Static9.anInt277 = Static191.anInt3757;
		}
		@Pc(70) boolean[][] local70 = Static496.aBooleanArrayArray7;
		@Pc(72) boolean[][] local72 = Static321.aBooleanArrayArray5;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(92) int local92;
		if (Static364.aBoolean618) {
			for (local76 = 0; local76 < Static548.anInt9156 + Static548.anInt9156 + 2; local76++) {
				for (local79 = 0; local79 < Static548.anInt9156 + Static548.anInt9156 + 2; local79++) {
					local86 = Static115.anInt1985 + local76 - Static548.anInt9156;
					local92 = Static326.anInt4975 + local79 - Static548.anInt9156;
					if (local86 >= 0 && local92 >= 0 && local86 < Static327.anInt5993 && local92 < Static191.anInt3757) {
						@Pc(106) int local106 = local86 << Static166.anInt7796;
						@Pc(110) int local110 = local92 << Static166.anInt7796;
						@Pc(127) int local127 = Static36.aClass129Array7[Static36.aClass129Array7.length - 1].method6481(local92, local86) - (0x3E8 << Static166.anInt7796 - 7);
						@Pc(149) int local149 = Static150.aClass129Array4 == null ? Static36.aClass129Array7[0].method6481(local92, local86) + Static165.anInt3157 : Static150.aClass129Array4[0].method6481(local92, local86) + Static165.anInt3157;
						Static321.aBooleanArrayArray5[local76][local79] = Static458.aClass78_153.O(local106, local127, local110, local106, local149, local110);
					} else {
						Static321.aBooleanArrayArray5[local76][local79] = false;
					}
				}
			}
			for (local79 = 0; local79 < Static548.anInt9156 + Static548.anInt9156 + 1; local79++) {
				for (local86 = 0; local86 < Static548.anInt9156 + Static548.anInt9156 + 1; local86++) {
					Static496.aBooleanArrayArray7[local79][local86] = Static321.aBooleanArrayArray5[local79][local86] || Static321.aBooleanArrayArray5[local79 + 1][local86] || Static321.aBooleanArrayArray5[local79][local86 + 1] || Static321.aBooleanArrayArray5[local79 + 1][local86 + 1];
				}
			}
			Static101.anIntArray79 = arg5;
			Static387.anIntArray407 = arg6;
			Static427.anIntArray460 = arg7;
			Static534.anIntArray563 = arg8;
			Static240.anIntArray242 = arg9;
			Static311.method4640(Static458.aClass78_153, arg10);
		} else {
			if (Static162.aBooleanArrayArray4 == null) {
				Static162.aBooleanArrayArray4 = new boolean[Static327.anInt5993 + Static327.anInt5993 + 1][Static191.anInt3757 + Static327.anInt5993 + 1];
				for (local76 = 0; local76 < Static162.aBooleanArrayArray4.length; local76++) {
					for (local79 = 0; local79 < Static162.aBooleanArrayArray4[0].length; local79++) {
						Static162.aBooleanArrayArray4[local76][local79] = true;
					}
				}
			}
			Static321.aBooleanArrayArray5 = Static162.aBooleanArrayArray4;
			Static496.aBooleanArrayArray7 = Static162.aBooleanArrayArray4;
			Static189.anInt3742 = 0;
			Static179.anInt3330 = 0;
			Static373.anInt6718 = Static327.anInt5993;
			Static9.anInt277 = Static191.anInt3757;
			Static385.anInt6903 = 0;
		}
		Static305.method4621(Static458.aClass78_153);
		for (@Pc(322) Class11_Sub2 local322 = (Class11_Sub2) Static572.aClass196_9.method4024(); local322 != null; local322 = (Class11_Sub2) Static572.aClass196_9.method4028()) {
			local322.method7200();
			Static284.method7247(local322);
		}
		if (Static478.aBoolean368) {
			for (local79 = 0; local79 < Static356.anInt6520; local79++) {
				Static31.aClass49Array1[local79].method1227(arg14, arg0);
			}
		}
		if (Static336.aBoolean470) {
			Static337.anIntArray362 = Static458.aClass78_153.v();
			Static458.aClass78_153.oa(Static195.anIntArray388);
			local79 = (Static195.anIntArray388[2] - Static195.anIntArray388[0]) / Static19.anInt533;
			for (local86 = 0; local86 < Static19.anInt533 - 1; local86++) {
				Static64.anIntArray57[local86] = local79 * (local86 + 1) + Static145.anIntArray125[local86];
			}
			for (local92 = 0; local92 < Static511.aClass80Array1.length; local92++) {
				Static511.aClass80Array1[local92].method2144();
			}
		}
		if (Static156.aClass360ArrayArrayArray8 != null) {
			if (Static336.aBoolean470) {
				Static595.method7988(0);
			}
			Static286.method4305(true);
			Static458.aClass78_153.CA(-1, 1583160, 40, 127);
			Static235.method3460(true, arg4, arg10, arg11);
			if (Static336.aBoolean470) {
				Static95.method1446();
			}
			Static458.aClass78_153.L();
			Static286.method4305(false);
		}
		Static235.method3460(false, arg4, arg10, arg11);
		if (Static336.aBoolean470) {
			for (local79 = 0; local79 < Static119.anInt2474; local79++) {
				Static36.aBooleanArrayArrayArray6[local79] = Static288.aBooleanArrayArrayArray4[local79];
			}
			Static595.method7988(0);
			for (local86 = 0; local86 < Static511.aClass80Array1.length; local86++) {
				Static511.aClass80Array1[local86].method2144();
			}
		}
		if (Static336.aBoolean470) {
			Static95.method1446();
			for (local79 = 0; local79 < Static119.anInt2474; local79++) {
				Static288.aBooleanArrayArrayArray4[local79] = Static36.aBooleanArrayArrayArray6[local79];
			}
			if (Static59.anInt1129 == 2) {
				@Pc(505) int local505;
				if (Static82.aLongArray2[0] < Static82.aLongArray2[1]) {
					if (Static64.anIntArray57[0] + Static145.anIntArray125[0] > Static195.anIntArray388[0]) {
						local505 = Static145.anIntArray125[0]++;
					}
				} else if (Static82.aLongArray2[0] > Static82.aLongArray2[1] && Static64.anIntArray57[0] + Static145.anIntArray125[0] < Static195.anIntArray388[2]) {
					local505 = Static145.anIntArray125[0]--;
				}
			}
		}
		if (!Static364.aBoolean618) {
			Static496.aBooleanArrayArray7 = local70;
			Static321.aBooleanArrayArray5 = local72;
		}
		Static34.method638();
	}
}
