import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
	public static int anInt3325;

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "Lclient!saa;")
	public static final Class287 aClass287_3 = new Class287("LIVE", 0);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IFFFIIIIFLclient!ue;F[BI)V")
	public static void method2858(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(7) int arg3, @OriginalArg(8) float arg4, @OriginalArg(9) Class310 arg5, @OriginalArg(10) float arg6, @OriginalArg(11) byte[] arg7) {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			Static217.method3194(local12, arg3, arg0, arg2, arg4, arg5, arg6, arg1, arg7);
			arg3 += 16384;
		}
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)I")
	public static int method2860() {
		return Static45.anInt742;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIILclient!ha;)V")
	public static void method2862(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub22 arg4) {
		if (arg4.anInt3144 == -1 && arg4.anIntArray346 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(28) int local28 = arg4.anInt3148 * Static480.aClass6_Sub37_Sub1_1.anInt6058 >> 8;
		if (arg2 > arg4.anInt3156) {
			local15 = arg2 - arg4.anInt3156;
		} else if (arg4.anInt3147 > arg2) {
			local15 = arg4.anInt3147 - arg2;
		}
		if (arg1 > arg4.anInt3150) {
			local15 += arg1 - arg4.anInt3150;
		} else if (arg4.anInt3157 > arg1) {
			local15 += arg4.anInt3157 - arg1;
		}
		if (arg4.anInt3145 == 0 || local15 - 256 > arg4.anInt3145 || Static480.aClass6_Sub37_Sub1_1.anInt6058 == 0 || arg0 != arg4.anInt3159) {
			if (arg4.aClass6_Sub19_Sub2_2 != null) {
				Static144.aClass6_Sub19_Sub3_2.method6424(arg4.aClass6_Sub19_Sub2_2);
				arg4.aClass6_Sub12_Sub1_2 = null;
				arg4.aClass6_Sub19_Sub2_2 = null;
				arg4.aClass6_Sub50_2 = null;
			}
			if (arg4.aClass6_Sub19_Sub2_1 != null) {
				Static144.aClass6_Sub19_Sub3_2.method6424(arg4.aClass6_Sub19_Sub2_1);
				arg4.aClass6_Sub19_Sub2_1 = null;
				arg4.aClass6_Sub12_Sub1_1 = null;
				arg4.aClass6_Sub50_1 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(156) int local156 = (arg4.anInt3145 - local15) * local28 / arg4.anInt3145;
		@Pc(200) Class6_Sub19_Sub2 local200;
		if (arg4.aClass6_Sub19_Sub2_2 != null) {
			arg4.aClass6_Sub19_Sub2_2.method2811(local156);
		} else if (arg4.anInt3144 >= 0) {
			if (arg4.aBoolean213) {
				if (arg4.aClass6_Sub50_2 == null) {
					arg4.aClass6_Sub50_2 = Static531.method7391(Static509.aClass251_142, arg4.anInt3144);
				}
				if (arg4.aClass6_Sub50_2 != null) {
					if (arg4.aClass6_Sub12_Sub1_2 == null) {
						arg4.aClass6_Sub12_Sub1_2 = arg4.aClass6_Sub50_2.method7394(new int[] { 22050 });
					}
					if (arg4.aClass6_Sub12_Sub1_2 != null) {
						local200 = Static583.method2815(arg4.aClass6_Sub12_Sub1_2, local156);
						local200.method2845(-1);
						Static144.aClass6_Sub19_Sub3_2.method6425(local200);
						arg4.aClass6_Sub19_Sub2_2 = local200;
					}
				}
			} else {
				@Pc(217) Class309 local217 = Static590.method6852(Static527.aClass251_147, arg4.anInt3144, 0);
				if (local217 != null) {
					@Pc(224) Class6_Sub12_Sub1 local224 = local217.method6851().method4741(Static246.aClass21_1);
					@Pc(229) Class6_Sub19_Sub2 local229 = Static583.method2815(local224, local156);
					local229.method2845(-1);
					Static144.aClass6_Sub19_Sub3_2.method6425(local229);
					arg4.aClass6_Sub19_Sub2_2 = local229;
				}
			}
		}
		if (arg4.aClass6_Sub19_Sub2_1 != null) {
			arg4.aClass6_Sub19_Sub2_1.method2811(local156);
			if (!arg4.aClass6_Sub19_Sub2_1.method7848()) {
				arg4.aClass6_Sub50_1 = null;
				arg4.aClass6_Sub12_Sub1_1 = null;
				arg4.aClass6_Sub19_Sub2_1 = null;
			}
		} else if (arg4.anIntArray346 != null && (arg4.anInt3152 -= arg3) <= 0) {
			@Pc(288) int local288;
			if (!arg4.aBoolean211) {
				local288 = (int) (Math.random() * (double) arg4.anIntArray346.length);
				@Pc(296) Class309 local296 = Static590.method6852(Static527.aClass251_147, arg4.anIntArray346[local288], 0);
				if (local296 != null) {
					@Pc(303) Class6_Sub12_Sub1 local303 = local296.method6851().method4741(Static246.aClass21_1);
					@Pc(308) Class6_Sub19_Sub2 local308 = Static583.method2815(local303, local156);
					local308.method2845(0);
					Static144.aClass6_Sub19_Sub3_2.method6425(local308);
					arg4.aClass6_Sub19_Sub2_1 = local308;
					arg4.anInt3152 = (int) (Math.random() * (double) (arg4.anInt3149 - arg4.anInt3155)) + arg4.anInt3155;
					return;
				}
				return;
			}
			if (arg4.aClass6_Sub50_1 == null) {
				local288 = (int) ((double) arg4.anIntArray346.length * Math.random());
				arg4.aClass6_Sub50_1 = Static531.method7391(Static509.aClass251_142, arg4.anIntArray346[local288]);
			}
			if (arg4.aClass6_Sub50_1 != null) {
				if (arg4.aClass6_Sub12_Sub1_1 == null) {
					arg4.aClass6_Sub12_Sub1_1 = arg4.aClass6_Sub50_1.method7394(new int[] { 22050 });
				}
				if (arg4.aClass6_Sub12_Sub1_1 != null) {
					local200 = Static583.method2815(arg4.aClass6_Sub12_Sub1_1, local156);
					local200.method2845(0);
					Static144.aClass6_Sub19_Sub3_2.method6425(local200);
					arg4.anInt3152 = (int) ((double) (arg4.anInt3149 - arg4.anInt3155) * Math.random()) + arg4.anInt3155;
					arg4.aClass6_Sub19_Sub2_1 = local200;
					return;
				}
			}
		}
	}
}
