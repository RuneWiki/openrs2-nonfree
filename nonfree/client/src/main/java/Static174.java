import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray45;

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray46;

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "[I")
	public static final int[] anIntArray318 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!ks", name = "u", descriptor = "Z")
	public static final boolean aBoolean293 = false;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)I")
	public static int method3345() {
		if (Static203.aBoolean326) {
			return 0;
		} else if (Static76.method1750()) {
			return Static158.aBoolean271 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)I")
	public static int method3346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static345.method5676(arg0 + 45365, arg1 + 91923, 4) + (Static345.method5676(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Static345.method5676(arg0, arg1, 1) - 128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!sg;Lclient!vq;IIIIILclient!br;)V")
	public static void method3348(@OriginalArg(0) int arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class21 arg7) {
		@Pc(17) Class136 local17 = Static11.method223(arg5);
		if (local17 == null || !local17.aBoolean327 || !local17.method3851()) {
			return;
		}
		@Pc(36) int local36;
		if (local17.anIntArray363 != null) {
			@Pc(34) int[] local34 = new int[local17.anIntArray363.length];
			@Pc(48) int local48;
			for (local36 = 0; local36 < local34.length / 2; local36++) {
				if (Static353.anInt2640 == 4) {
					local48 = (int) Static106.aFloat31 & 0x3FFF;
				} else {
					local48 = (int) Static106.aFloat31 + Static75.anInt1928 & 0x3FFF;
				}
				@Pc(62) int local62 = Class118_Sub1.anIntArray314[local48];
				@Pc(66) int local66 = Class118_Sub1.anIntArray317[local48];
				if (Static353.anInt2640 != 4) {
					local62 = local62 * 256 / (Static255.anInt5169 + 256);
					local66 = local66 * 256 / (Static255.anInt5169 + 256);
				}
				local34[local36 * 2] = arg7.anInt740 / 2 + arg0 + (local66 * (arg3 - -(local17.anIntArray363[local36 * 2] * 4)) + (local17.anIntArray363[local36 * 2 + 1] * 4 + arg6) * local62 >> 15);
				local34[local36 * 2 + 1] = arg7.anInt758 / 2 + arg4 - (local66 * (arg6 + local17.anIntArray363[local36 * 2 + 1] * 4) - local62 * (local17.anIntArray363[local36 * 2] * 4 + arg3) >> 15);
			}
			Static126.method2602(arg2, local34, local17.anInt4254, arg7.anIntArray34, arg7.anIntArray32);
			for (local48 = 0; local48 < local34.length / 2 - 1; local48++) {
				arg2.method2715(local34[local48 * 2], local34[local48 * 2 + 1], local34[(local48 + 1) * 2], local34[(local48 + 1) * 2 + 1], local17.anInt4276, arg1, arg0, arg4);
			}
			arg2.method2715(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local17.anInt4276, arg1, arg0, arg4);
		}
		@Pc(268) Class58 local268 = null;
		if (local17.anInt4264 != -1) {
			local268 = local17.method3848(arg2, false);
			if (local268 != null) {
				Static221.method2479(arg3, arg4, arg0, arg1, arg7, local268, arg6);
			}
		}
		if (local17.aString44 == null) {
			return;
		}
		local36 = 0;
		if (local268 != null) {
			local36 = local268.method4274();
		}
		@Pc(304) Class51 local304 = Static63.aClass51_1;
		@Pc(306) Class16 local306 = Static139.aClass16_3;
		if (local17.anInt4257 == 1) {
			local306 = Static330.aClass16_7;
			local304 = Static238.aClass51_6;
		}
		if (local17.anInt4257 == 2) {
			local304 = Static282.aClass51_4;
			local306 = Static348.aClass16_8;
		}
		Static220.method5509(local17.anInt4270, arg3, arg6, local306, arg7, arg1, arg0, local17.aString44, local36, arg4, local304);
		return;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIIIBI)Z")
	public static boolean method3349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 + arg4 > arg7 && arg2 < arg3 + arg7) {
			return arg6 < arg0 + arg5 && arg6 + arg1 > arg5;
		} else {
			return false;
		}
	}
}
