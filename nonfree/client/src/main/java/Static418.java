import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;BI)I")
	public static int method5678(@OriginalArg(0) String arg0) {
		return Static163.method2663(arg0, 16);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)V")
	public static void method5684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static81.anInt1574 = 0;
		Static85.anInt1636 = arg0;
		Static99.anInt1808 = arg1;
		Static97.anInt1796 = 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIZ)I")
	public static int method5685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class6_Sub17 local12 = Static85.method1523(arg0, arg2);
		if (local12 == null) {
			return 0;
		} else if (arg1 >= 0 && local12.anIntArray287.length > arg1) {
			return local12.anIntArray287[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method5687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static179.aByteArrayArrayArray3[0][arg0][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static179.aByteArrayArrayArray3[arg2][arg0][arg1] & 0x10) == 0) {
			return arg3 == Static414.method5612(arg2, arg0, arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5688(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static30.anInt498++;
		Static96.anInt1790 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static71.anInt1486; local7 < Static268.anInt4600; local7++) {
			@Pc(12) Class189[][] local12 = Static30.aClass189ArrayArrayArray2[local7];
			for (local14 = Static167.anInt2998; local14 < Static117.anInt2049; local14++) {
				for (@Pc(17) int local17 = Static57.anInt1201; local17 < Static329.anInt5591; local17++) {
					@Pc(24) Class189 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static27.aBooleanArrayArray2[local14 + Static99.anInt1813 - Static165.anInt2942][local17 + Static99.anInt1813 - Static97.anInt1799] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean342 = true;
							local24.aBoolean344 = true;
							if (local24.aClass242_2 == null) {
								local24.aBoolean343 = false;
							} else {
								local24.aBoolean343 = true;
							}
							Static96.anInt1790++;
						} else {
							local24.aBoolean342 = false;
							local24.aBoolean344 = false;
							local24.aByte54 = 0;
							if (local14 >= Static165.anInt2942 - 16 && local14 <= Static165.anInt2942 + 16 && local17 >= Static97.anInt1799 - 16 && local17 <= Static97.anInt1799 + 16 && (local24.aClass3_Sub1_1 != null || local24.aClass3_Sub1_2 != null || local24.aClass3_Sub4_3 != null || local24.aClass3_Sub4_2 != null || local24.aClass3_Sub5_1 != null || local24.aClass242_2 != null)) {
								Static19.aClass10_1.method5382(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static365.aClass84Array3 == Static420.aClass84Array4;
		for (local14 = Static71.anInt1486; local14 < Static268.anInt4600; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static291.aClass28_132.method3481() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static27.aBooleanArrayArray2.length;
				if (Static167.anInt2998 + Static27.aBooleanArrayArray2.length > Static401.anInt6621) {
					local172 -= Static167.anInt2998 + Static27.aBooleanArrayArray2.length - Static401.anInt6621;
				}
				@Pc(192) int local192 = Static27.aBooleanArrayArray2[0].length;
				if (Static57.anInt1201 + Static27.aBooleanArrayArray2[0].length > Static364.anInt6134) {
					local192 -= Static57.anInt1201 + Static27.aBooleanArrayArray2[0].length - Static364.anInt6134;
				}
				@Pc(213) int local213 = Static62.anInt1307;
				while (true) {
					if (local213 >= local172) {
						Static19.aClass10_1.method5384(local14, local161, Static420.aClass84Array4[local14], true);
						break;
					}
					@Pc(220) int local220 = local213 + Static167.anInt2998 - Static62.anInt1307;
					for (@Pc(222) int local222 = Static58.anInt1222; local222 < local192; local222++) {
						Static87.aBooleanArrayArray3[local213][local222] = false;
						if (Static27.aBooleanArrayArray2[local213][local222]) {
							@Pc(241) int local241 = local222 + Static57.anInt1201 - Static58.anInt1222;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static30.aClass189ArrayArrayArray2[local243][local220][local241] != null && Static30.aClass189ArrayArrayArray2[local243][local220][local241].aByte58 == local14) {
									Static87.aBooleanArrayArray3[local213][local222] = Static30.aClass189ArrayArrayArray2[local243][local220][local241].aBoolean342;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static19.aClass10_1.method5384(local14, local161, Static420.aClass84Array4[local14], false);
			}
			Static19.aClass10_1.method5381();
		}
		if (!Static299.method4385(true)) {
			Static299.method4385(false);
		}
	}
}
