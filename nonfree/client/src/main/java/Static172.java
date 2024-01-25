import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "Lclient!gp;")
	public static Class75 aClass75_5;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	public static int anInt3527 = 0;

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
	public static final int anInt3528 = -11713997;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method3267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg0 && arg3 == arg4 && arg8 == arg6 && arg7 == arg5) {
			Static314.method5368(arg0, arg6, arg4, arg5, arg2);
			return;
		}
		@Pc(43) int local43 = arg0;
		@Pc(45) int local45 = arg4;
		@Pc(49) int local49 = arg0 * 3;
		@Pc(53) int local53 = arg4 * 3;
		@Pc(57) int local57 = arg1 * 3;
		@Pc(61) int local61 = arg3 * 3;
		@Pc(65) int local65 = arg8 * 3;
		@Pc(69) int local69 = arg7 * 3;
		@Pc(79) int local79 = arg6 + local57 - arg0 - local65;
		@Pc(89) int local89 = local61 + arg5 - local69 - arg4;
		@Pc(99) int local99 = local65 + local49 - local57 - local57;
		@Pc(109) int local109 = local53 + local69 - local61 - local61;
		@Pc(114) int local114 = local57 - local49;
		@Pc(119) int local119 = local61 - local53;
		for (@Pc(121) int local121 = 128; local121 <= 4096; local121 += 128) {
			@Pc(129) int local129 = local121 * local121 >> 12;
			@Pc(135) int local135 = local121 * local129 >> 12;
			@Pc(139) int local139 = local79 * local135;
			@Pc(143) int local143 = local89 * local135;
			@Pc(147) int local147 = local129 * local99;
			@Pc(151) int local151 = local109 * local129;
			@Pc(155) int local155 = local114 * local121;
			@Pc(159) int local159 = local121 * local119;
			@Pc(170) int local170 = (local155 + local139 + local147 >> 12) + arg0;
			@Pc(181) int local181 = arg4 + (local143 + local151 + local159 >> 12);
			Static314.method5368(local43, local170, local45, local181, arg2);
			local45 = local181;
			local43 = local170;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	public static void method3269() {
		if (Static341.aClass171_1 == null) {
			return;
		}
		while (true) {
			while (Static194.anInt3826 < Static63.aClass47_Sub1Array1.length) {
				@Pc(26) Class47_Sub1 local26 = Static63.aClass47_Sub1Array1[Static194.anInt3826];
				if (local26 != null && local26.anInt1366 == -1) {
					if (Static217.aClass5_Sub6_1 == null) {
						Static217.aClass5_Sub6_1 = Static341.aClass171_1.method4589(local26.aString78);
					}
					@Pc(50) int local50 = Static217.aClass5_Sub6_1.anInt925;
					if (local50 == -1) {
						return;
					}
					local26.anInt1366 = local50;
					Static217.aClass5_Sub6_1 = null;
					Static194.anInt3826++;
				} else {
					Static194.anInt3826++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V")
	public static void method3270(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static353.aByteArrayArray25;
		} else {
			local9 = Static210.aByteArrayArray21;
		}
		@Pc(16) int local16 = Static129.aByteArrayArray6.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = local9[local18];
			if (local24 != null) {
				@Pc(36) int local36 = (Static338.anIntArray283[local18] >> 8) * 64 - Static263.anInt5063;
				@Pc(47) int local47 = (Static338.anIntArray283[local18] & 0xFF) * 64 - Static28.anInt773;
				Static153.method2894();
				Static302.method5137(Static117.aClass49Array1, arg0, local47, Static15.aClass59_1, local36, local24);
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V")
	public static void method3271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static67.method1489(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg4;
		@Pc(27) int local27 = -arg4;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static332.anIntArrayArray56[arg0];
		@Pc(49) int local49 = arg2 - local15;
		@Pc(54) int local54 = arg2 + local15;
		Static247.method3552(arg1, arg2 - arg4, local40, local49);
		Static247.method3552(arg5, local49, local40, local54);
		Static247.method3552(arg1, local54, local40, arg2 + arg4);
		while (local10 < local24) {
			local34 += 2;
			local36 += 2;
			local32 += local36;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				Static152.anIntArray214[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(131) int[] local131;
			@Pc(137) int[] local137;
			@Pc(142) int local142;
			@Pc(147) int local147;
			@Pc(187) int local187;
			@Pc(191) int local191;
			@Pc(196) int local196;
			if (local27 >= 0) {
				local24--;
				if (local24 >= local15) {
					local131 = Static332.anIntArrayArray56[local24 + arg0];
					local137 = Static332.anIntArrayArray56[arg0 - local24];
					local142 = arg2 + local10;
					local147 = arg2 - local10;
					Static247.method3552(arg1, local147, local131, local142);
					Static247.method3552(arg1, local147, local137, local142);
				} else {
					local131 = Static332.anIntArrayArray56[local24 + arg0];
					local137 = Static332.anIntArrayArray56[arg0 - local24];
					local142 = Static152.anIntArray214[local24];
					local147 = arg2 + local10;
					local187 = arg2 - local10;
					local191 = local142 + arg2;
					local196 = arg2 - local142;
					Static247.method3552(arg1, local187, local131, local196);
					Static247.method3552(arg5, local196, local131, local191);
					Static247.method3552(arg1, local191, local131, local147);
					Static247.method3552(arg1, local187, local137, local196);
					Static247.method3552(arg5, local196, local137, local191);
					Static247.method3552(arg1, local191, local137, local147);
				}
				local27 -= local24 << 1;
			}
			local131 = Static332.anIntArrayArray56[arg0 + local10];
			local137 = Static332.anIntArrayArray56[arg0 - local10];
			local142 = local24 + arg2;
			local147 = arg2 - local24;
			if (local10 >= local15) {
				Static247.method3552(arg1, local147, local131, local142);
				Static247.method3552(arg1, local147, local137, local142);
			} else {
				local187 = local10 > local29 ? Static152.anIntArray214[local10] : local29;
				local191 = local187 + arg2;
				local196 = arg2 - local187;
				Static247.method3552(arg1, local147, local131, local196);
				Static247.method3552(arg5, local196, local131, local191);
				Static247.method3552(arg1, local191, local131, local142);
				Static247.method3552(arg1, local147, local137, local196);
				Static247.method3552(arg5, local196, local137, local191);
				Static247.method3552(arg1, local191, local137, local142);
			}
		}
	}
}
