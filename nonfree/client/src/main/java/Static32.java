import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Lclient!pk;")
	public static Class130 aClass130_8;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([IIIIII)V")
	public static void method3622(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class110 local13 = local7.aClass110_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt3721;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class172 local58 = local7.aClass172_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt5386;
		@Pc(67) int local67 = local58.anInt5383;
		@Pc(70) int local70 = local58.anInt5384;
		@Pc(73) int local73 = local58.anInt5385;
		@Pc(77) int[] local77 = Static223.anIntArrayArray27[local23];
		@Pc(81) int[] local81 = Static215.anIntArrayArray22[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!pn;IILclient!in;IZI)V")
	public static void method3625(@OriginalArg(0) Class1_Sub2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class71 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(14) int local14 = (int) Static298.aFloat58 + Static245.anInt4881 & 0x7FF;
		@Pc(26) int local26 = Math.max(arg3.anInt2722 / 2, arg3.anInt2698 / 2) + 10;
		@Pc(34) int local34 = arg4 * arg4 + arg5 * arg5;
		if (local26 * local26 < local34) {
			return;
		}
		@Pc(54) int local54 = Class68.anIntArray229[local14];
		@Pc(62) int local62 = local54 * 256 / (Static1.anInt4245 + 256);
		@Pc(66) int local66 = Class68.anIntArray226[local14];
		@Pc(74) int local74 = local66 * 256 / (Static1.anInt4245 + 256);
		@Pc(84) int local84 = local74 * arg4 - arg5 * local62 >> 16;
		@Pc(95) int local95 = arg4 * local62 + arg5 * local74 >> 16;
		if (Static277.aBoolean412) {
			((Class1_Sub2_Sub11_Sub1) arg0).method3127(arg3.anInt2722 / 2 + arg1 + local95 - arg0.anInt4871 / 2, -(arg0.anInt4875 / 2) + arg3.anInt2698 / 2 + arg2 + -local84, (Class1_Sub2_Sub11_Sub1) arg3.method2100(false));
		} else {
			((Class1_Sub2_Sub11_Sub2) arg0).method3796(arg1 + arg3.anInt2722 / 2 + local95 - arg0.anInt4871 / 2, -local84 + arg3.anInt2698 / 2 + arg2 - arg0.anInt4875 / 2, arg3.anIntArray244, arg3.anIntArray233);
		}
	}
}
