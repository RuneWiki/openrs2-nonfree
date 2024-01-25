import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!lfa", name = "j", descriptor = "Lclient!efa;")
	public static Class89 aClass89_5;

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
	public static int anInt8788 = 0;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILclient!mfa;)V")
	public static void method7565(@OriginalArg(1) Class3_Sub9_Sub2 arg0) {
		arg0.method5645();
		@Pc(10) int local10 = Static54.anInt1032;
		@Pc(20) Class9_Sub2_Sub1_Sub2_Sub1 local20 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local10] = new Class9_Sub2_Sub1_Sub2_Sub1();
		local20.anInt10204 = local10;
		@Pc(28) int local28 = arg0.method5642(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray675[0] = local39 - Static427.anInt7462;
		@Pc(50) int local50 = local28 & 0x3FFF;
		local20.anInt10152 = (local20.anIntArray675[0] << 9) + (local20.method8619() << 8);
		local20.anIntArray676[0] = local50 - Static22.anInt329;
		local20.anInt10158 = (local20.anIntArray676[0] << 9) + (local20.method8619() << 8);
		Static65.anInt1298 = local20.aByte127 = local20.aByte128 = local33;
		if (Static97.method1657(local20.anIntArray676[0], local20.anIntArray675[0])) {
			local20.aByte128++;
		}
		if (Static583.aClass3_Sub9Array20[local10] != null) {
			local20.method1158(Static583.aClass3_Sub9Array20[local10]);
		}
		Static174.anInt3362 = 0;
		Static495.anIntArray529[Static174.anInt3362++] = local10;
		Static118.aByteArray23[local10] = 0;
		Static216.anInt7753 = 0;
		for (@Pc(142) int local142 = 1; local142 < 2048; local142++) {
			if (local10 != local142) {
				@Pc(158) int local158 = arg0.method5642(18);
				@Pc(162) int local162 = local158 >> 16;
				@Pc(168) int local168 = local158 >> 8 & 0xFF;
				@Pc(172) int local172 = local158 & 0xFF;
				@Pc(180) Class328 local180 = Static370.aClass328Array1[local142] = new Class328();
				local180.anInt9150 = (local162 << 28) + (local168 << 14) + local172;
				local180.aBoolean677 = false;
				local180.anInt9156 = 0;
				local180.anInt9155 = -1;
				Static38.anIntArray46[Static216.anInt7753++] = local142;
				Static118.aByteArray23[local142] = 0;
			}
		}
		arg0.method5649();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg6;
		@Pc(21) int local21 = arg2 - arg6;
		@Pc(25) int local25 = arg5 * arg5;
		@Pc(29) int local29 = arg2 * arg2;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg2 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local25 * (1 - local57) + local41;
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = (1 - local61) * local33 + local49;
		@Pc(96) int local96 = local37 - (local61 - 1) * local53;
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 * 3;
		@Pc(122) int local122 = (local57 - 3) * local45;
		@Pc(126) int local126 = local49 * 3;
		@Pc(132) int local132 = local53 * (local61 - 3);
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = local100 * (arg2 - 1);
		@Pc(142) int local142 = local112;
		@Pc(166) int local166;
		@Pc(174) int local174;
		@Pc(182) int local182;
		@Pc(190) int local190;
		if (arg4 >= Static298.anInt5919 && Static596.anInt9703 >= arg4) {
			@Pc(157) int[] local157 = Static71.anIntArrayArray5[arg4];
			local166 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg0 - arg5);
			local174 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg5 + arg0);
			local182 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg0 - local16);
			local190 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, local16 + arg0);
			Static82.method1400(arg3, local166, local182, local157);
			Static82.method1400(arg1, local182, local190, local157);
			Static82.method1400(arg3, local190, local174, local157);
		}
		@Pc(214) int local214 = (local21 - 1) * local108;
		while (local9 > 0) {
			@Pc(227) boolean local227 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local116;
					local79 += local134;
					local7++;
					local134 += local104;
					local116 += local104;
				}
			}
			if (local227) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local126;
						local96 += local142;
						local126 += local112;
						local11++;
						local142 += local112;
					}
				}
				if (local96 < 0) {
					local96 += local142;
					local88 += local126;
					local142 += local112;
					local126 += local112;
					local11++;
				}
				local88 += -local214;
				local96 += -local132;
				local214 -= local108;
				local132 -= local108;
			}
			if (local79 < 0) {
				local70 += local116;
				local79 += local134;
				local7++;
				local116 += local104;
				local134 += local104;
			}
			local79 += -local122;
			local70 += -local140;
			local140 -= local100;
			local122 -= local100;
			local9--;
			local166 = arg4 - local9;
			local174 = arg4 + local9;
			if (Static298.anInt5919 <= local174 && local166 <= Static596.anInt9703) {
				local182 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg0 + local7);
				local190 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg0 - local7);
				if (local227) {
					@Pc(429) int local429 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, local11 + arg0);
					@Pc(438) int local438 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg0 - local11);
					@Pc(449) int[] local449;
					if (local166 >= Static298.anInt5919) {
						local449 = Static71.anIntArrayArray5[local166];
						Static82.method1400(arg3, local190, local438, local449);
						Static82.method1400(arg1, local438, local429, local449);
						Static82.method1400(arg3, local429, local182, local449);
					}
					if (local174 <= Static596.anInt9703) {
						local449 = Static71.anIntArrayArray5[local174];
						Static82.method1400(arg3, local190, local438, local449);
						Static82.method1400(arg1, local438, local429, local449);
						Static82.method1400(arg3, local429, local182, local449);
					}
				} else {
					if (local166 >= Static298.anInt5919) {
						Static82.method1400(arg3, local190, local182, Static71.anIntArrayArray5[local166]);
					}
					if (local174 <= Static596.anInt9703) {
						Static82.method1400(arg3, local190, local182, Static71.anIntArrayArray5[local174]);
					}
				}
			}
		}
	}
}
