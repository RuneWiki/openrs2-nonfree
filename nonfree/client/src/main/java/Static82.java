import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
	public static int anInt1670;

	@OriginalMember(owner = "client!hf", name = "bb", descriptor = "[Lclient!rh;")
	public static Class78_Sub1[] aClass78_Sub1Array2;

	@OriginalMember(owner = "client!hf", name = "cb", descriptor = "[Lclient!ne;")
	public static Class78[] aClass78Array2;

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "Lclient!mi;")
	public static Class75 aClass75_10 = new Class75();

	@OriginalMember(owner = "client!hf", name = "ab", descriptor = "[I")
	public static int[] anIntArray134 = new int[64];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BIIIIII)V")
	public static void method1204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static92.method1433(Static49.anInt1030, arg0, Static177.anInt3701);
		@Pc(17) int local17 = Static92.method1433(Static49.anInt1030, arg1, Static177.anInt3701);
		@Pc(23) int local23 = Static92.method1433(Static131.anInt2713, arg2, Static135.anInt2790);
		@Pc(29) int local29 = Static92.method1433(Static131.anInt2713, arg4, Static135.anInt2790);
		@Pc(37) int local37 = Static92.method1433(Static49.anInt1030, arg5 + arg0, Static177.anInt3701);
		@Pc(46) int local46 = Static92.method1433(Static49.anInt1030, arg1 - arg5, Static177.anInt3701);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static107.method1641(local23, arg3, Static139.anIntArrayArray21[local48], local29);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static107.method1641(local23, arg3, Static139.anIntArrayArray21[local64], local29);
		}
		@Pc(86) int local86 = Static92.method1433(Static131.anInt2713, arg5 + arg2, Static135.anInt2790);
		@Pc(95) int local95 = Static92.method1433(Static131.anInt2713, arg4 - arg5, Static135.anInt2790);
		for (@Pc(97) int local97 = local37; local97 <= local46; local97++) {
			@Pc(111) int[] local111 = Static139.anIntArrayArray21[local97];
			Static107.method1641(local23, arg3, local111, local86);
			Static107.method1641(local95, arg3, local111, local29);
		}
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
	public static void method1205() {
		Static13.anInt249 = 0;
		Static80.anInt1584 = 0;
		Static220.method3393();
		Static140.method2329();
		Static83.method1866();
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static13.anInt249; local20++) {
			local26 = Static101.anIntArray190[local20];
			if (Static107.anInt2132 != Static78.aClass20_Sub3_Sub2Array1[local26].anInt3018) {
				if (Static78.aClass20_Sub3_Sub2Array1[local26].aClass105_1.method3121()) {
					Static121.method1932(Static78.aClass20_Sub3_Sub2Array1[local26]);
				}
				Static78.aClass20_Sub3_Sub2Array1[local26].aClass105_1 = null;
				Static78.aClass20_Sub3_Sub2Array1[local26] = null;
			}
		}
		if (Static217.anInt4289 != Static97.aClass1_Sub17_Sub1_2.anInt2656) {
			throw new RuntimeException("gnp1 pos:" + Static97.aClass1_Sub17_Sub1_2.anInt2656 + " psize:" + Static217.anInt4289);
		}
		for (local26 = 0; local26 < Static103.anInt2065; local26++) {
			if (Static78.aClass20_Sub3_Sub2Array1[Static21.anIntArray44[local26]] == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static103.anInt2065);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V")
	public static void method1206() {
		@Pc(9) byte[][] local9 = Static64.aByteArrayArray3;
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static192.method3138();
			for (@Pc(22) int local22 = 0; local22 < 13; local22++) {
				for (@Pc(26) int local26 = 0; local26 < 13; local26++) {
					@Pc(36) int local36 = Static7.anIntArrayArrayArray3[local16][local22][local26];
					if (local36 != -1) {
						@Pc(45) int local45 = local36 >> 24 & 0x3;
						@Pc(58) int local58 = local36 >> 1 & 0x3;
						@Pc(64) int local64 = local36 >> 14 & 0x3FF;
						@Pc(70) int local70 = local36 >> 3 & 0x7FF;
						@Pc(80) int local80 = (local64 / 8 << 8) + local70 / 8;
						for (@Pc(82) int local82 = 0; local82 < Static103.anIntArray197.length; local82++) {
							if (Static103.anIntArray197[local82] == local80 && local9[local82] != null) {
								Static141.method3016(local45, (local64 & 0x7) * 8, local22 * 8, local9[local82], local58, Static22.aClass16Array1, local16, (local70 & 0x7) * 8, local26 * 8);
								break;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public static void method1207() {
		Static119.anIntArrayArrayArray10 = Static224.anIntArrayArrayArray2;
		Static56.aClass1_Sub11ArrayArrayArray3 = Static19.aClass1_Sub11ArrayArrayArray2;
		Static179.anInt3725 = Static56.aClass1_Sub11ArrayArrayArray3.length;
	}
}
