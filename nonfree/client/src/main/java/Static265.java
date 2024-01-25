import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!laa", name = "p", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_140 = new Class239(77, -1);

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_141 = new Class239(57, 6);

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
	public static int anInt6990 = 0;

	@OriginalMember(owner = "client!laa", name = "m", descriptor = "I")
	public static int anInt6991 = 0;

	@OriginalMember(owner = "client!laa", name = "o", descriptor = "F")
	public static float aFloat182 = 1024.0F;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)Z")
	public static boolean method5932(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(Z)V")
	public static void method5934() {
		@Pc(16) boolean local16 = Static70.aClass2_Sub29_Sub2_1.method5224() == 1;
		Static425.anInt6885 = Static70.aClass2_Sub29_Sub2_1.method5209();
		@Pc(24) int local24 = Static70.aClass2_Sub29_Sub2_1.method5230();
		@Pc(28) int local28 = Static70.aClass2_Sub29_Sub2_1.method5196();
		@Pc(32) int local32 = Static70.aClass2_Sub29_Sub2_1.method5183();
		Static352.method5538();
		Static291.method4614(local32);
		Static70.aClass2_Sub29_Sub2_1.method5244();
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local46 = 0; local46 < Static363.anInt1158 >> 3; local46++) {
				for (local50 = 0; local50 < Static511.anInt8889 >> 3; local50++) {
					local57 = Static70.aClass2_Sub29_Sub2_1.method5248(1);
					if (local57 == 1) {
						Static535.anIntArrayArrayArray21[local42][local46][local50] = Static70.aClass2_Sub29_Sub2_1.method5248(26);
					} else {
						Static535.anIntArrayArrayArray21[local42][local46][local50] = -1;
					}
				}
			}
		}
		Static70.aClass2_Sub29_Sub2_1.method5241();
		local46 = (Static472.anInt8247 - Static70.aClass2_Sub29_Sub2_1.anInt6132) / 16;
		Static403.anIntArrayArray67 = new int[local46][4];
		for (local50 = 0; local50 < local46; local50++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static403.anIntArrayArray67[local50][local57] = Static70.aClass2_Sub29_Sub2_1.method5198();
			}
		}
		Static444.anIntArray613 = new int[local46];
		Static357.aByteArrayArray22 = new byte[local46][];
		Static475.anIntArray649 = new int[local46];
		Static390.anIntArray573 = new int[local46];
		Static511.anIntArray679 = new int[local46];
		Static215.anIntArray621 = new int[local46];
		Static46.aByteArrayArray3 = null;
		Static331.aByteArrayArray21 = new byte[local46][];
		Static263.aByteArrayArray16 = new byte[local46][];
		Static138.aByteArrayArray13 = new byte[local46][];
		Static475.anIntArray650 = null;
		local46 = 0;
		for (local57 = 0; local57 < 4; local57++) {
			for (@Pc(190) int local190 = 0; local190 < Static363.anInt1158 >> 3; local190++) {
				for (@Pc(194) int local194 = 0; local194 < Static511.anInt8889 >> 3; local194++) {
					@Pc(204) int local204 = Static535.anIntArrayArrayArray21[local57][local190][local194];
					if (local204 != -1) {
						@Pc(214) int local214 = local204 >> 14 & 0x3FF;
						@Pc(220) int local220 = local204 >> 3 & 0x7FF;
						@Pc(230) int local230 = local220 / 8 + (local214 / 8 << 8);
						for (@Pc(232) int local232 = 0; local232 < local46; local232++) {
							if (local230 == Static444.anIntArray613[local232]) {
								local230 = -1;
								break;
							}
						}
						if (local230 != -1) {
							Static444.anIntArray613[local46] = local230;
							@Pc(265) int local265 = local230 >> 8 & 0xFF;
							@Pc(269) int local269 = local230 & 0xFF;
							Static390.anIntArray573[local46] = Static360.aClass53_151.method1608("m" + local265 + "_" + local269);
							Static215.anIntArray621[local46] = Static360.aClass53_151.method1608("l" + local265 + "_" + local269);
							Static511.anIntArray679[local46] = Static360.aClass53_151.method1608("um" + local265 + "_" + local269);
							Static475.anIntArray649[local46] = Static360.aClass53_151.method1608("ul" + local265 + "_" + local269);
							local46++;
						}
					}
				}
			}
		}
		Static447.method6827(local16, local24, 10, local28);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIIIII)V")
	public static void method5935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 >= Static7.anInt8119 && arg4 <= Static34.anInt603 && Static328.anInt6154 <= arg0 && arg5 <= Static394.anInt7462) {
			if (arg2 == 1) {
				Static236.method3660(arg5, arg0, arg1, arg4, arg3);
			} else {
				Static475.method7098(arg3, arg2, arg1, arg5, arg0, arg4);
			}
		} else if (arg2 == 1) {
			Static100.method1924(arg4, arg1, arg5, arg3, arg0);
		} else {
			Static100.method1923(arg3, arg5, arg1, arg4, arg2, arg0);
		}
	}
}
