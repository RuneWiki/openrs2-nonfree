import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "Lclient!nn;")
	public static Class119 aClass119_4;

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "Lclient!jg;")
	public static Class4_Sub2_Sub11 aClass4_Sub2_Sub11_7;

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
	public static int anInt2141;

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
	public static int anInt2136 = 0;

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "Lclient!lm;")
	public static Class4_Sub22 aClass4_Sub22_3 = new Class4_Sub22(0, -1);

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
	public static int anInt2140 = 1;

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "S")
	public static short aShort15 = 320;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	public static void method1813() {
		Static284.method4439(false);
		System.gc();
		Static123.method2035(25);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method1814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static48.method951(arg7)) {
			Static123.method2032(arg1, arg5, Static217.aClass97ArrayArray1[arg7], -1, arg3, arg0, arg2, arg6, arg4);
		} else if (arg2 == -1) {
			for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
				Static48.aBooleanArray14[local17] = true;
			}
		} else {
			Static48.aBooleanArray14[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILclient!lg;)Ljava/lang/String;")
	public static String method1816(@OriginalArg(0) int arg0, @OriginalArg(2) Class97 arg1) {
		if (!Static41.method791(arg1).method2563(arg0) && arg1.anObjectArray6 == null) {
			return null;
		} else if (arg1.aStringArray19 == null || arg1.aStringArray19.length <= arg0 || arg1.aStringArray19[arg0] == null || arg1.aStringArray19[arg0].trim().length() == 0) {
			return Static14.aBoolean26 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray19[arg0];
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!lg;II)I")
	public static int method1818(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray18 == null || arg0.anIntArrayArray18.length <= arg1) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray18[arg1];
			@Pc(39) int local39 = 0;
			@Pc(41) byte local41 = 0;
			@Pc(43) int local43 = 0;
			while (true) {
				@Pc(45) byte local45 = 0;
				@Pc(50) int local50 = local24[local43++];
				@Pc(52) int local52 = 0;
				if (local50 == 0) {
					return local39;
				}
				if (local50 == 15) {
					local45 = 1;
				}
				if (local50 == 1) {
					local52 = Static214.anIntArray446[local24[local43++]];
				}
				if (local50 == 2) {
					local52 = Static80.anIntArray145[local24[local43++]];
				}
				if (local50 == 3) {
					local52 = Static179.anIntArray302[local24[local43++]];
				}
				@Pc(109) int local109;
				@Pc(120) Class97 local120;
				@Pc(125) int local125;
				@Pc(139) int local139;
				if (local50 == 4) {
					local109 = local24[local43++] << 16;
					@Pc(116) int local116 = local109 + local24[local43++];
					local120 = Static148.method2340(local116);
					local125 = local24[local43++];
					if (local125 != -1 && (!Static187.method3128(local125).aBoolean62 || Static84.aBoolean101)) {
						for (local139 = 0; local139 < local120.anIntArray249.length; local139++) {
							if (local125 + 1 == local120.anIntArray249[local139]) {
								local52 += local120.anIntArray256[local139];
							}
						}
					}
				}
				if (local50 == 5) {
					local52 = Static298.anIntArray414[local24[local43++]];
				}
				if (local50 == 6) {
					local52 = Class111.anIntArray297[Static80.anIntArray145[local24[local43++]] - 1];
				}
				if (local50 == 7) {
					local52 = Static298.anIntArray414[local24[local43++]] * 100 / 46875;
				}
				if (local50 == 8) {
					local52 = Static72.aClass13_Sub5_Sub1_1.anInt4452;
				}
				if (local50 == 9) {
					for (local109 = 0; local109 < 25; local109++) {
						if (Static54.aBooleanArray15[local109]) {
							local52 += Static80.anIntArray145[local109];
						}
					}
				}
				if (local50 == 16) {
					local45 = 2;
				}
				if (local50 == 17) {
					local45 = 3;
				}
				if (local50 == 10) {
					local109 = local24[local43++] << 16;
					local109 += local24[local43++];
					local120 = Static148.method2340(local109);
					local125 = local24[local43++];
					if (local125 != -1 && (!Static187.method3128(local125).aBoolean62 || Static84.aBoolean101)) {
						for (local139 = 0; local139 < local120.anIntArray249.length; local139++) {
							if (local120.anIntArray249[local139] == local125 + 1) {
								local52 = 999999999;
								break;
							}
						}
					}
				}
				if (local50 == 11) {
					local52 = Static199.anInt2994;
				}
				if (local50 == 12) {
					local52 = Static57.anInt1270;
				}
				if (local50 == 13) {
					local109 = Static298.anIntArray414[local24[local43++]];
					@Pc(353) int local353 = local24[local43++];
					local52 = (0x1 << local353 & local109) == 0 ? 0 : 1;
				}
				if (local50 == 14) {
					local109 = local24[local43++];
					local52 = Static274.method4329(local109);
				}
				if (local50 == 18) {
					local52 = (Static72.aClass13_Sub5_Sub1_1.anInt5334 >> 7) + Static269.anInt5357;
				}
				if (local50 == 19) {
					local52 = (Static72.aClass13_Sub5_Sub1_1.anInt5294 >> 7) + Static105.anInt2105;
				}
				if (local50 == 20) {
					local52 = local24[local43++];
				}
				if (local45 == 0) {
					if (local41 == 0) {
						local39 += local52;
					}
					if (local41 == 1) {
						local39 -= local52;
					}
					if (local41 == 2 && local52 != 0) {
						local39 /= local52;
					}
					if (local41 == 3) {
						local39 *= local52;
					}
					local41 = 0;
				} else {
					local41 = local45;
				}
			}
		} catch (@Pc(462) Exception local462) {
			return -1;
		}
	}
}
