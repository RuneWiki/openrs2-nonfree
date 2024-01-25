import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!il", name = "c", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array26;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "Lclient!jk;")
	public static Class122 aClass122_2;

	@OriginalMember(owner = "client!il", name = "j", descriptor = "[I")
	public static final int[] anIntArray273 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!il", name = "n", descriptor = "[I")
	public static int[] anIntArray274 = new int[2];

	@OriginalMember(owner = "client!il", name = "o", descriptor = "I")
	public static int anInt3372 = 0;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public static void method3011() {
		@Pc(1) Class83 local1 = Static199.aClass83_5;
		synchronized (Static199.aClass83_5) {
			Static199.aClass83_5.method2336();
		}
		local1 = Static164.aClass83_24;
		synchronized (Static164.aClass83_24) {
			Static164.aClass83_24.method2336();
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V")
	public static void method3013() {
		Static227.anInt4510 = 0;
		@Pc(11) int local11 = Static196.aClass4_Sub20_Sub1_4.method4618();
		@Pc(15) int local15 = Static196.aClass4_Sub20_Sub1_4.method4606();
		@Pc(21) int local21 = Static196.aClass4_Sub20_Sub1_4.method4606();
		@Pc(32) boolean local32 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
		Static441.method6053();
		Static90.method5069(local11);
		@Pc(45) int local45 = (Static136.anInt2819 - Static196.aClass4_Sub20_Sub1_4.anInt5526) / 16;
		Static423.anIntArrayArray57 = new int[local45][4];
		@Pc(55) int local55;
		for (@Pc(51) int local51 = 0; local51 < local45; local51++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static423.anIntArrayArray57[local51][local55] = Static196.aClass4_Sub20_Sub1_4.method4595();
			}
		}
		Static256.aByteArrayArray15 = new byte[local45][];
		Static431.anIntArray600 = new int[local45];
		Static8.aByteArrayArray2 = new byte[local45][];
		Static4.anIntArray6 = null;
		Static353.aByteArrayArray18 = new byte[local45][];
		Static109.anIntArray203 = new int[local45];
		Static125.aByteArrayArray9 = null;
		Static55.anIntArray82 = new int[local45];
		Static164.aByteArrayArray14 = new byte[local45][];
		Static129.anIntArray233 = new int[local45];
		Static402.anIntArray574 = new int[local45];
		local45 = 0;
		for (local55 = (local15 - (Static193.anInt3853 >> 4)) / 8; local55 <= ((Static193.anInt3853 >> 4) + local15) / 8; local55++) {
			for (@Pc(135) int local135 = (local21 - (Static301.anInt5585 >> 4)) / 8; local135 <= ((Static301.anInt5585 >> 4) + local21) / 8; local135++) {
				Static109.anIntArray203[local45] = local135 + (local55 << 8);
				Static431.anIntArray600[local45] = Static30.aClass38_8.method1045("m" + local55 + "_" + local135);
				Static55.anIntArray82[local45] = Static30.aClass38_8.method1045("l" + local55 + "_" + local135);
				Static129.anIntArray233[local45] = Static30.aClass38_8.method1045("um" + local55 + "_" + local135);
				Static402.anIntArray574[local45] = Static30.aClass38_8.method1045("ul" + local55 + "_" + local135);
				local45++;
			}
		}
		Static181.method3319(local15, local21, 10, local32);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static381.anIntArrayArrayArray11[arg0][local16][local20] == -Static290.anInt5373) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static391.anInt6797) + 1;
			@Pc(142) int local142 = (arg3 << Static391.anInt6797) + 2;
			@Pc(151) int local151 = Static389.aClass14Array3[arg0].oa(arg1, arg3) + arg5;
			if (!Static254.method4160(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static391.anInt6797) - 1;
			if (!Static254.method4160(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static391.anInt6797) - 1;
			if (!Static254.method4160(local20, local151, local177)) {
				return false;
			} else if (Static254.method4160(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static112.method2196(arg0, arg1, arg3)) {
			local16 = arg1 << Static391.anInt6797;
			local20 = arg3 << Static391.anInt6797;
			return Static254.method4160(local16 + 1, Static389.aClass14Array3[arg0].oa(arg1, arg3) + arg5, local20 + 1) && Static254.method4160(local16 + Static223.anInt4452 - 1, Static389.aClass14Array3[arg0].oa(arg1 + 1, arg3) + arg5, local20 + 1) && Static254.method4160(local16 + Static223.anInt4452 - 1, Static389.aClass14Array3[arg0].oa(arg1 + 1, arg3 + 1) + arg5, local20 + Static223.anInt4452 - 1) && Static254.method4160(local16 + 1, Static389.aClass14Array3[arg0].oa(arg1, arg3 + 1) + arg5, local20 + Static223.anInt4452 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(FFIF)I")
	public static int method3017(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 < local26 && local35 < local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local26 < local35) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BIII)V")
	public static void method3019(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static322.aFloat82 = local15;
		if (Static275.anInt5173 == 2) {
			Static246.anInt4786 = 0;
			Static200.anInt3936 = local15;
			Static439.anInt7477 = local3;
		}
		Static43.aFloat26 = local3;
		Static117.method4155();
		Static110.aBoolean165 = true;
	}
}
