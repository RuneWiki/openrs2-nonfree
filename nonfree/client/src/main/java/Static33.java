import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)I")
	public static int method562(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBII)V")
	public static void method563(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1012) {
			Static108.method1905(10, arg0, arg2);
		} else if (arg1 == 1007) {
			Static108.method1905(11, arg0, arg2);
		} else if (arg1 == 1010) {
			Static108.method1905(12, arg0, arg2);
		} else if (arg1 == 1003) {
			Static108.method1905(13, arg0, arg2);
		} else if (arg1 == 1002) {
			Static108.method1905(14, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZI)V")
	public static void method564(@OriginalArg(0) boolean arg0) {
		Static339.aBoolean571 = arg0;
		@Pc(26) int local26;
		@Pc(34) int local34;
		@Pc(44) int local44;
		@Pc(72) int local72;
		@Pc(76) int local76;
		@Pc(80) int local80;
		@Pc(95) int local95;
		@Pc(173) int local173;
		@Pc(184) int local184;
		@Pc(192) int local192;
		if (!Static339.aBoolean571) {
			local26 = Static187.aClass5_Sub12_Sub2_4.method5075();
			local34 = (Static54.anInt1000 - Static187.aClass5_Sub12_Sub2_4.anInt5731) / 16;
			Static182.anIntArrayArray67 = new int[local34][4];
			for (@Pc(40) int local40 = 0; local40 < local34; local40++) {
				for (local44 = 0; local44 < 4; local44++) {
					Static182.anIntArrayArray67[local40][local44] = Static187.aClass5_Sub12_Sub2_4.method5067();
				}
			}
			local44 = Static187.aClass5_Sub12_Sub2_4.method5100();
			local72 = Static187.aClass5_Sub12_Sub2_4.method5113();
			local76 = Static187.aClass5_Sub12_Sub2_4.method5075();
			local80 = Static187.aClass5_Sub12_Sub2_4.method5086();
			@Pc(91) boolean local91 = Static187.aClass5_Sub12_Sub2_4.method5101() == 1;
			local95 = Static187.aClass5_Sub12_Sub2_4.method5115();
			Static354.method6024(local95);
			Static252.aByteArrayArray16 = new byte[local34][];
			Static318.aByteArrayArray20 = new byte[local34][];
			Static150.aByteArrayArray12 = null;
			Static75.aByteArrayArray6 = new byte[local34][];
			Static78.anIntArray121 = null;
			Static245.aByteArrayArray15 = new byte[local34][];
			Static270.anIntArray508 = new int[local34];
			Static198.anIntArray387 = new int[local34];
			Static209.anIntArray397 = new int[local34];
			Static315.anIntArray593 = new int[local34];
			Static251.anIntArray485 = new int[local34];
			@Pc(131) boolean local131 = false;
			if ((local72 / 8 == 48 || local72 / 8 == 49) && local76 / 8 == 48) {
				local131 = true;
			}
			if (local72 / 8 == 48 && local76 / 8 == 148) {
				local131 = true;
			}
			local34 = 0;
			for (local173 = (local72 - (Static22.anInt481 >> 4)) / 8; local173 <= (local72 + (Static22.anInt481 >> 4)) / 8; local173++) {
				for (local184 = (local76 - (Static269.anInt5281 >> 4)) / 8; local184 <= (local76 + (Static269.anInt5281 >> 4)) / 8; local184++) {
					local192 = local184 + (local173 << 8);
					if (local131 && (local184 == 49 || local184 == 149 || local184 == 147 || local173 == 50 || local173 == 49 && local184 == 47)) {
						Static198.anIntArray387[local34] = local192;
						Static270.anIntArray508[local34] = -1;
						Static209.anIntArray397[local34] = -1;
						Static315.anIntArray593[local34] = -1;
						Static251.anIntArray485[local34] = -1;
					} else {
						Static198.anIntArray387[local34] = local192;
						Static270.anIntArray508[local34] = Static351.aClass93_134.method2393("m" + local173 + "_" + local184);
						Static209.anIntArray397[local34] = Static351.aClass93_134.method2393("l" + local173 + "_" + local184);
						Static315.anIntArray593[local34] = Static351.aClass93_134.method2393("um" + local173 + "_" + local184);
						Static251.anIntArray485[local34] = Static351.aClass93_134.method2393("ul" + local173 + "_" + local184);
					}
					local34++;
				}
			}
			Static144.method2634(local80, local44, local91, false, local76, local72, local26);
			return;
		}
		local26 = Static187.aClass5_Sub12_Sub2_4.method5068();
		local34 = Static187.aClass5_Sub12_Sub2_4.method5106();
		@Pc(365) boolean local365 = Static187.aClass5_Sub12_Sub2_4.method5086() == 1;
		local44 = Static187.aClass5_Sub12_Sub2_4.method5075();
		local72 = Static187.aClass5_Sub12_Sub2_4.method5113();
		local76 = Static187.aClass5_Sub12_Sub2_4.method5101();
		local80 = Static187.aClass5_Sub12_Sub2_4.method5113();
		Static354.method6024(local26);
		Static187.aClass5_Sub12_Sub2_4.method5124();
		@Pc(399) int local399;
		for (@Pc(391) int local391 = 0; local391 < 4; local391++) {
			for (local95 = 0; local95 < Static22.anInt481 >> 3; local95++) {
				for (local399 = 0; local399 < Static269.anInt5281 >> 3; local399++) {
					local173 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
					if (local173 == 1) {
						Static342.anIntArrayArrayArray13[local391][local95][local399] = Static187.aClass5_Sub12_Sub2_4.method5120(26);
					} else {
						Static342.anIntArrayArrayArray13[local391][local95][local399] = -1;
					}
				}
			}
		}
		Static187.aClass5_Sub12_Sub2_4.method5121();
		local95 = (Static54.anInt1000 - Static187.aClass5_Sub12_Sub2_4.anInt5731) / 16;
		Static182.anIntArrayArray67 = new int[local95][4];
		for (local399 = 0; local399 < local95; local399++) {
			for (local173 = 0; local173 < 4; local173++) {
				Static182.anIntArrayArray67[local399][local173] = Static187.aClass5_Sub12_Sub2_4.method5067();
			}
		}
		Static150.aByteArrayArray12 = null;
		Static209.anIntArray397 = new int[local95];
		Static251.anIntArray485 = new int[local95];
		Static252.aByteArrayArray16 = new byte[local95][];
		Static198.anIntArray387 = new int[local95];
		Static315.anIntArray593 = new int[local95];
		Static245.aByteArrayArray15 = new byte[local95][];
		Static75.aByteArrayArray6 = new byte[local95][];
		Static318.aByteArrayArray20 = new byte[local95][];
		Static270.anIntArray508 = new int[local95];
		Static78.anIntArray121 = null;
		local95 = 0;
		for (local173 = 0; local173 < 4; local173++) {
			for (local184 = 0; local184 < Static22.anInt481 >> 3; local184++) {
				for (local192 = 0; local192 < Static269.anInt5281 >> 3; local192++) {
					@Pc(537) int local537 = Static342.anIntArrayArrayArray13[local173][local184][local192];
					if (local537 != -1) {
						@Pc(546) int local546 = local537 >> 14 & 0x3FF;
						@Pc(552) int local552 = local537 >> 3 & 0x7FF;
						@Pc(562) int local562 = local552 / 8 + (local546 / 8 << 8);
						for (@Pc(564) int local564 = 0; local564 < local95; local564++) {
							if (Static198.anIntArray387[local564] == local562) {
								local562 = -1;
								break;
							}
						}
						if (local562 != -1) {
							Static198.anIntArray387[local95] = local562;
							@Pc(596) int local596 = local562 >> 8 & 0xFF;
							@Pc(600) int local600 = local562 & 0xFF;
							Static270.anIntArray508[local95] = Static351.aClass93_134.method2393("m" + local596 + "_" + local600);
							Static209.anIntArray397[local95] = Static351.aClass93_134.method2393("l" + local596 + "_" + local600);
							Static315.anIntArray593[local95] = Static351.aClass93_134.method2393("um" + local596 + "_" + local600);
							Static251.anIntArray485[local95] = Static351.aClass93_134.method2393("ul" + local596 + "_" + local600);
							local95++;
						}
					}
				}
			}
		}
		Static144.method2634(local76, local80, local365, false, local72, local34, local44);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIB)V")
	public static void method565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 >= Static163.anInt3234 && arg1 <= Static353.anInt6760 && Static75.anInt1447 <= arg0 && arg4 <= Static346.anInt6668) {
			if (arg2 == 1) {
				Static124.method2196(arg5, arg1, arg4, arg3, arg0);
			} else {
				Static14.method279(arg1, arg3, arg2, arg0, arg4, arg5);
			}
		} else if (arg2 == 1) {
			Static156.method2787(arg3, arg1, arg0, arg4, arg5);
		} else {
			Static200.method3525(arg1, arg4, arg2, arg3, arg0, arg5);
		}
	}
}
