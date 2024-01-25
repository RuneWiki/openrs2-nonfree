import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
	public static int anInt8256;

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "[I")
	public static int[] anIntArray518;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!d;IILjava/awt/Canvas;)Lclient!ha;")
	public static Class100 method7110(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Canvas arg3) {
		return new oa(arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!sca;II)Ljava/lang/String;")
	public static String method7111(@OriginalArg(0) Class302 arg0, @OriginalArg(1) int arg1) {
		if (!Static78.method1364(arg0).method8148(arg1) && arg0.anObjectArray15 == null) {
			return null;
		} else if (arg0.aStringArray64 == null || arg0.aStringArray64.length <= arg1 || arg0.aStringArray64[arg1] == null || arg0.aStringArray64[arg1].trim().length() == 0) {
			return Static321.aBoolean412 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray64[arg1];
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIII)V")
	private static void method7112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg4 - arg2;
		@Pc(20) int local20 = arg3 - arg2;
		@Pc(24) int local24 = arg4 * arg4;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local24 * (1 - local56) + local40;
		@Pc(77) int local77 = local28 - local44 * (local56 - 1);
		@Pc(86) int local86 = (1 - local60) * local32 + local48;
		@Pc(95) int local95 = local36 - (local60 - 1) * local52;
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(121) int local121 = (local56 - 3) * local44;
		@Pc(125) int local125 = local48 * 3;
		@Pc(131) int local131 = local52 * (local60 - 3);
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = (arg3 - 1) * local99;
		@Pc(141) int local141 = local111;
		@Pc(166) int local166;
		@Pc(176) int local176;
		@Pc(185) int local185;
		@Pc(193) int local193;
		if (arg6 >= Static100.anInt10042 && arg6 <= Static567.anInt9578) {
			@Pc(155) int[] local155 = Static484.anIntArrayArray41[arg6];
			local166 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg1 - arg4);
			local176 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4 + arg1);
			local185 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg1 - local15);
			local193 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, local15 + arg1);
			Static312.method5228(arg0, local155, local185, local166);
			Static312.method5228(arg5, local155, local193, local185);
			Static312.method5228(arg0, local155, local176, local193);
		}
		@Pc(217) int local217 = (local20 - 1) * local107;
		while (local9 > 0) {
			@Pc(226) boolean local226 = local9 <= local20;
			if (local226) {
				if (local86 < 0) {
					while (local86 < 0) {
						local95 += local141;
						local86 += local125;
						local125 += local111;
						local141 += local111;
						local11++;
					}
				}
				if (local95 < 0) {
					local95 += local141;
					local86 += local125;
					local141 += local111;
					local11++;
					local125 += local111;
				}
				local86 += -local217;
				local95 += -local131;
				local217 -= local107;
				local131 -= local107;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local77 += local133;
					local69 += local115;
					local115 += local103;
					local133 += local103;
					local7++;
				}
			}
			if (local77 < 0) {
				local69 += local115;
				local77 += local133;
				local7++;
				local115 += local103;
				local133 += local103;
			}
			local69 += -local139;
			local77 += -local121;
			local9--;
			local121 -= local99;
			local139 -= local99;
			local166 = arg6 - local9;
			local176 = arg6 + local9;
			if (Static100.anInt10042 <= local176 && local166 <= Static567.anInt9578) {
				local185 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, local7 + arg1);
				local193 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg1 - local7);
				if (local226) {
					@Pc(441) int local441 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg1 + local11);
					@Pc(450) int local450 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg1 - local11);
					@Pc(461) int[] local461;
					if (local166 >= Static100.anInt10042) {
						local461 = Static484.anIntArrayArray41[local166];
						Static312.method5228(arg0, local461, local450, local193);
						Static312.method5228(arg5, local461, local441, local450);
						Static312.method5228(arg0, local461, local185, local441);
					}
					if (local176 <= Static567.anInt9578) {
						local461 = Static484.anIntArrayArray41[local176];
						Static312.method5228(arg0, local461, local450, local193);
						Static312.method5228(arg5, local461, local441, local450);
						Static312.method5228(arg0, local461, local185, local441);
					}
				} else {
					if (Static100.anInt10042 <= local166) {
						Static312.method5228(arg0, Static484.anIntArrayArray41[local166], local185, local193);
					}
					if (local176 <= Static567.anInt9578) {
						Static312.method5228(arg0, Static484.anIntArrayArray41[local176], local185, local193);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIBIIIII)V")
	public static void method7113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg2) {
			Static304.method5161(arg0, arg3, arg5, arg6, arg1, arg4);
		} else if (Static347.anInt6542 <= arg1 - arg5 && arg1 + arg5 <= Static553.anInt9425 && Static100.anInt10042 <= arg0 - arg2 && Static567.anInt9578 >= arg2 + arg0) {
			Static39.method756(arg5, arg4, arg1, arg0, arg2, arg3, arg6);
		} else {
			method7112(arg6, arg1, arg4, arg2, arg5, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BII)V")
	public static void method7115(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static602.anInt10026 != 0) {
			if (arg1 < 0) {
				for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
					Static236.anIntArray269[local10] = arg0;
				}
			} else {
				Static236.anIntArray269[arg1] = arg0;
			}
		}
		Static224.aClass6_Sub3_Sub4_1.method4712(arg1, arg0);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)V")
	public static void method7116(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub9 local8 = Static144.method2332(12, arg0);
		local8.method3722();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIB)I")
	public static int method7117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
