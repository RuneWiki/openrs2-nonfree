import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!taa", name = "G", descriptor = "I")
	public static int anInt9000 = -1;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(19) int local19 = arg0 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(41) int local41 = local19 * (Static115.aShort43 - Static332.aShort78) / 100 + Static332.aShort78;
		@Pc(47) int local47 = arg5 * local41 >> 8;
		@Pc(54) int local54 = 16384 - arg2 & 0x3FFF;
		@Pc(61) int local61 = 16384 - arg4 & 0x3FFF;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = local47;
		if (local54 != 0) {
			local65 = Class4_Sub27.anIntArray296[local54] * -local47 >> 14;
			local67 = local47 * Class4_Sub27.anIntArray297[local54] >> 14;
		}
		if (local61 != 0) {
			local63 = Class4_Sub27.anIntArray296[local61] * local67 >> 14;
			local67 = Class4_Sub27.anIntArray297[local61] * local67 >> 14;
		}
		Static209.anInt3913 = arg6 - local65;
		Static110.anInt2624 = arg1 - local67;
		Static232.anInt4203 = arg2;
		Static458.anInt8547 = 0;
		Static261.anInt5009 = arg4;
		Static24.anInt387 = arg3 - local63;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIIIII[I)V")
	public static void method7350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg1 > 0 && !Static100.method2181(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static100.method2181(arg4)) {
			@Pc(43) int local43 = 0;
			@Pc(50) int local50 = arg1 >= arg4 ? arg4 : arg1;
			@Pc(54) int local54 = arg1 >> 1;
			@Pc(58) int local58 = arg4 >> 1;
			@Pc(60) int[] local60 = arg5;
			@Pc(65) int[] local65 = new int[local58 * local54];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local43, arg3, arg1, arg4, 0, 32993, arg2, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(83) int local83 = 0;
				@Pc(85) int local85 = 0;
				@Pc(89) int local89 = arg1;
				@Pc(91) int[] local91 = local65;
				for (@Pc(93) int local93 = 0; local93 < local58; local93++) {
					for (@Pc(97) int local97 = 0; local97 < local54; local97++) {
						@Pc(104) int local104 = local60[local85++];
						@Pc(109) int local109 = local60[local85++];
						@Pc(114) int local114 = local60[local89++];
						@Pc(120) int local120 = local104 >> 16 & 0xFF;
						@Pc(124) int local124 = local104 & 0xFF;
						@Pc(129) int local129 = local60[local89++];
						@Pc(135) int local135 = local104 >> 24 & 0xFF;
						@Pc(141) int local141 = local104 >> 8 & 0xFF;
						@Pc(149) int local149 = local120 + (local109 >> 16 & 0xFF);
						@Pc(155) int local155 = local124 + (local109 & 0xFF);
						@Pc(163) int local163 = local141 + (local109 >> 8 & 0xFF);
						@Pc(171) int local171 = local135 + (local109 >> 24 & 0xFF);
						@Pc(179) int local179 = local171 + (local114 >> 24 & 0xFF);
						@Pc(187) int local187 = local149 + (local114 >> 16 & 0xFF);
						@Pc(195) int local195 = local163 + (local114 >> 8 & 0xFF);
						@Pc(201) int local201 = local155 + (local114 & 0xFF);
						@Pc(207) int local207 = local201 + (local129 & 0xFF);
						@Pc(215) int local215 = local187 + (local129 >> 16 & 0xFF);
						@Pc(223) int local223 = local179 + (local129 >> 24 & 0xFF);
						@Pc(231) int local231 = local195 + (local129 >> 8 & 0xFF);
						local65[local83++] = local207 >> 2 & 0xFF | (local231 & 0x3FC) << 6 | (local223 & 0x3FC) << 22 | (local215 & 0x3FC) << 14;
					}
					local85 += arg1;
					local89 += arg1;
				}
				local65 = local60;
				arg4 = local58;
				arg1 = local54;
				local60 = local91;
				local50 >>= 0x1;
				local54 >>= 0x1;
				local43++;
				local58 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(IIIIIIII)V")
	public static void method7351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg2;
		@Pc(26) int local26 = arg3 - arg2;
		@Pc(30) int local30 = arg6 * arg6;
		@Pc(34) int local34 = arg3 * arg3;
		@Pc(38) int local38 = local16 * local16;
		@Pc(42) int local42 = local26 * local26;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg3 << 1;
		@Pc(66) int local66 = local26 << 1;
		@Pc(75) int local75 = local46 + (1 - local62) * local30;
		@Pc(84) int local84 = local34 - local50 * (local62 - 1);
		@Pc(94) int local94 = local38 * (1 - local66) + local54;
		@Pc(103) int local103 = local42 - local58 * (local66 - 1);
		@Pc(107) int local107 = local30 << 2;
		@Pc(111) int local111 = local34 << 2;
		@Pc(115) int local115 = local38 << 2;
		@Pc(119) int local119 = local42 << 2;
		@Pc(123) int local123 = local46 * 3;
		@Pc(129) int local129 = local50 * (local62 - 3);
		@Pc(133) int local133 = local54 * 3;
		@Pc(139) int local139 = (local66 - 3) * local58;
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = (arg3 - 1) * local107;
		@Pc(149) int local149 = local119;
		@Pc(155) int local155 = (local26 - 1) * local115;
		@Pc(174) int local174;
		@Pc(182) int local182;
		@Pc(193) int local193;
		@Pc(202) int local202;
		if (Static290.anInt5903 <= arg5 && arg5 <= Static530.anInt9437) {
			@Pc(165) int[] local165 = Static46.anIntArrayArray4[arg5];
			local174 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg4 - arg6);
			local182 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg6 + arg4);
			local193 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg4 - local16);
			local202 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg4 + local16);
			Static306.method5239(local165, local193, arg0, local174);
			Static306.method5239(local165, local202, arg1, local193);
			Static306.method5239(local165, local182, arg0, local202);
		}
		while (local9 > 0) {
			@Pc(233) boolean local233 = local26 >= local9;
			if (local233) {
				if (local94 < 0) {
					while (local94 < 0) {
						local103 += local149;
						local94 += local133;
						local149 += local119;
						local133 += local119;
						local11++;
					}
				}
				if (local103 < 0) {
					local103 += local149;
					local94 += local133;
					local133 += local119;
					local11++;
					local149 += local119;
				}
				local103 += -local139;
				local94 += -local155;
				local139 -= local115;
				local155 -= local115;
			}
			if (local75 < 0) {
				while (local75 < 0) {
					local75 += local123;
					local84 += local141;
					local123 += local111;
					local7++;
					local141 += local111;
				}
			}
			if (local84 < 0) {
				local84 += local141;
				local75 += local123;
				local123 += local111;
				local7++;
				local141 += local111;
			}
			local84 += -local129;
			local75 += -local147;
			local9--;
			local147 -= local107;
			local129 -= local107;
			local174 = arg5 - local9;
			local182 = arg5 + local9;
			if (local182 >= Static290.anInt5903 && Static530.anInt9437 >= local174) {
				local193 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg4 + local7);
				local202 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg4 - local7);
				if (local233) {
					@Pc(410) int local410 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg4 + local11);
					@Pc(421) int local421 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg4 - local11);
					@Pc(428) int[] local428;
					if (local174 >= Static290.anInt5903) {
						local428 = Static46.anIntArrayArray4[local174];
						Static306.method5239(local428, local421, arg0, local202);
						Static306.method5239(local428, local410, arg1, local421);
						Static306.method5239(local428, local193, arg0, local410);
					}
					if (local182 <= Static530.anInt9437) {
						local428 = Static46.anIntArrayArray4[local182];
						Static306.method5239(local428, local421, arg0, local202);
						Static306.method5239(local428, local410, arg1, local421);
						Static306.method5239(local428, local193, arg0, local410);
					}
				} else {
					if (local174 >= Static290.anInt5903) {
						Static306.method5239(Static46.anIntArrayArray4[local174], local193, arg0, local202);
					}
					if (local182 <= Static530.anInt9437) {
						Static306.method5239(Static46.anIntArrayArray4[local182], local193, arg0, local202);
					}
				}
			}
		}
	}
}
