import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!ru", name = "H", descriptor = "I")
	public static int anInt8805;

	@OriginalMember(owner = "client!ru", name = "J", descriptor = "I")
	public static int anInt8807;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIII)V")
	public static void method7262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == Static64.anInt2000 && arg0 == Static354.anInt6830 && arg2 == Static153.anInt3786) {
			return;
		}
		Static147.aBoolean271 = true;
		Static354.anInt6830 = arg0;
		Static153.anInt3786 = arg2;
		Static64.anInt2000 = arg1;
		@Pc(43) double local43 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(53) double local53 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(56) double local56 = Math.cos(local53);
		@Pc(59) double local59 = Math.sin(local53);
		@Pc(62) double local62 = Math.cos(local43);
		@Pc(65) double local65 = Math.sin(local43);
		Static592.aDouble28 = local65;
		Static67.aDouble2 = local56 * local62;
		Static256.aDouble8 = -local59 * local62;
		Static328.aDouble25 = local59 * local65;
		Static180.aDouble9 = local59;
		Static17.aDouble1 = local62;
		Static399.aDouble14 = local65 * -local56;
		Static618.aDouble29 = local56;
		Static583.aDouble27 = 0.0D;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIB)V")
	public static void method7263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static444.anInt8258 <= arg0 && arg0 <= Static188.anInt4410) {
			@Pc(11) int local11 = Static132.method2911(Static251.anInt9634, arg3, Static366.anInt6946);
			@Pc(17) int local17 = Static132.method2911(Static251.anInt9634, arg1, Static366.anInt6946);
			Static258.method4552(local11, arg2, local17, arg0);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I[II[[B[[BI[B[I)I")
	public static int method7265(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg2];
		@Pc(15) int local15 = local9 + arg1[arg2];
		@Pc(19) int local19 = arg6[arg0];
		@Pc(25) int local25 = arg1[arg0] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local15 > local25) {
			local38 = local25;
		}
		@Pc(49) int local49 = arg5[arg2] & 0xFF;
		if (local49 > (arg5[arg0] & 0xFF)) {
			local49 = arg5[arg0] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg3[arg2];
		@Pc(74) byte[] local74 = arg4[arg0];
		@Pc(79) int local79 = local27 - local9;
		@Pc(84) int local84 = local27 - local19;
		for (@Pc(91) int local91 = local27; local91 < local38; local91++) {
			@Pc(103) int local103 = local74[local84++] + local70[local79++];
			if (local103 < local49) {
				local49 = local103;
			}
		}
		return -local49;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IFFFIIFLclient!rp;IIF)[B")
	public static byte[] method7266(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) Class58 arg4, @OriginalArg(10) float arg5) {
		@Pc(18) byte[] local18 = new byte[262144];
		Static424.method6605(arg4, 0, arg5, arg3, arg0, arg1, arg2, local18);
		return local18;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!da;ZILclient!ha;Ljava/lang/String;Lclient!ur;)V")
	public static void method7268(@OriginalArg(0) Class27 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Class345 arg4) {
		@Pc(12) boolean local12 = !Static559.aBoolean618 || Static8.method90();
		if (!local12) {
			return;
		}
		@Pc(34) int local34;
		@Pc(43) int local43;
		if (Static559.aBoolean618 && local12) {
			@Pc(21) Class345 local21 = Static70.aClass345_6;
			@Pc(27) Class27 local27 = arg2.method6088(local21, Static249.aClass111Array1);
			local34 = local21.method8116(null, arg3, 250);
			local43 = local21.method8118(250, local21.anInt10004, arg3, null);
			@Pc(46) int local46 = Static614.aClass111_3.anInt4054;
			@Pc(50) int local50 = local46 + 4;
			local43 += local50 * 2;
			local34 += local50 * 2;
			if (Class15_Sub1_Sub2_Sub1.lb > local43) {
				local43 = Class15_Sub1_Sub2_Sub1.lb;
			}
			if (Static615.anInt10352 > local34) {
				local34 = Static615.anInt10352;
			}
			@Pc(85) int local85 = Static8.aClass173_3.method4706(Static328.anInt9768, local34) + Static317.anInt9286;
			@Pc(94) int local94 = Static180.aClass60_3.method2078(Static594.anInt10159, local43) + Static304.anInt6063;
			if (Static513.aBoolean642) {
				local85 += Static550.method8313();
				local94 += Static530.method7484();
			}
			arg2.method6135(Static365.aClass111_4, false).method5782(local85 + Static169.aClass111_1.anInt4054, local94 - -Static169.aClass111_1.anInt4053, local34 - Static169.aClass111_1.anInt4054 * 2, local43 - Static169.aClass111_1.anInt4053 * 2, 1, 0, 0);
			arg2.method6135(Static169.aClass111_1, true).method5796(local85, local94);
			Static169.aClass111_1.method3286();
			arg2.method6135(Static169.aClass111_1, true).method5796(local85 + local34 - local46, local94);
			Static169.aClass111_1.method3294();
			arg2.method6135(Static169.aClass111_1, true).method5796(local85 + local34 - local46, -local46 + local94 + local43);
			Static169.aClass111_1.method3286();
			arg2.method6135(Static169.aClass111_1, true).method5796(local85, local94 + local43 - local46);
			Static169.aClass111_1.method3294();
			arg2.method6135(Static614.aClass111_3, true).method5789(local85, local94 + Static169.aClass111_1.anInt4053, local46, local43 - Static169.aClass111_1.anInt4053 * 2);
			Static614.aClass111_3.method3288();
			arg2.method6135(Static614.aClass111_3, true).method5789(local85 + Static169.aClass111_1.anInt4054, local94, local34 - Static169.aClass111_1.anInt4054 * 2, local46);
			Static614.aClass111_3.method3288();
			arg2.method6135(Static614.aClass111_3, true).method5789(local34 + local85 - local46, Static169.aClass111_1.anInt4053 + local94, local46, local43 - Static169.aClass111_1.anInt4053 * 2);
			Static614.aClass111_3.method3288();
			arg2.method6135(Static614.aClass111_3, true).method5789(local85 + Static169.aClass111_1.anInt4054, local43 + local94 + -local46, local34 - Static169.aClass111_1.anInt4054 * 2, local46);
			Static614.aClass111_3.method3288();
			local27.method7011(-1, 1, null, null, local34 - local50 * 2, null, 1, 0, Static346.anInt6722 | 0xFF000000, local85 + local50, 0, 0, arg3, local43 - local50 * 2, local94 - -local50);
			Static76.method1967(local43, local34, local85, local94);
		} else {
			local34 = arg4.method8116(null, arg3, 250);
			local43 = arg4.method8111(null, arg3, 250) * 13;
			arg2.aa(6, 6, local34 + 4 + 4, local43 - -4 + 4, -16777216, 0);
			arg2.method6106(6, 6, local34 + 8, local43 - -4 + 4, -1, 0);
			arg0.method7011(-1, 1, null, null, local34, null, 1, 0, -1, 10, 0, 0, arg3, local43, 10);
			Static76.method1967(local43 + 8, local34 + 4 - -4, 6, 6);
		}
		if (!arg1) {
			return;
		}
		try {
			if (Static513.aBoolean642) {
				Static525.method7463();
			} else {
				arg2.method6098();
			}
		} catch (@Pc(458) Exception_Sub1 local458) {
		}
	}
}
