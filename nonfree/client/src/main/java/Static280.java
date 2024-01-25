import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!lda", name = "L", descriptor = "F")
	public static float aFloat132;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!fca;Lclient!ki;IBILclient!oa;)Z")
	public static boolean method4613(@OriginalArg(0) Class6_Sub17 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(5) Class14 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray385 != null) {
			local13 = Static217.anInt3838 - (arg1.anInt5071 + arg0.anInt2968 - Static217.anInt3840) * (-Static217.anInt3834 + Static217.anInt3838) / (Static217.anInt3831 - Static217.anInt3840);
			local11 = Static217.anInt3838 - (Static217.anInt3838 - Static217.anInt3834) * (arg0.anInt2968 + arg1.anInt5086 - Static217.anInt3840) / (Static217.anInt3831 - Static217.anInt3840);
			local7 = (arg0.anInt2963 + arg1.anInt5069 - Static217.anInt3832) * (Static217.anInt3837 - Static217.anInt3836) / (Static217.anInt3830 - Static217.anInt3832) + Static217.anInt3836;
			local9 = Static217.anInt3836 + (arg1.anInt5070 + arg0.anInt2963 - Static217.anInt3832) * (Static217.anInt3837 - Static217.anInt3836) / (Static217.anInt3830 - Static217.anInt3832);
		}
		@Pc(101) Class58 local101 = null;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		if (arg1.anInt5058 != -1) {
			if (arg0.aBoolean212 && arg1.anInt5079 != -1) {
				local101 = arg1.method4380(true, arg2);
			} else {
				local101 = arg1.method4380(false, arg2);
			}
			if (local101 != null) {
				local108 = arg0.anInt2969 - (local101.AA() + 1 >> 1);
				if (local108 < local7) {
					local7 = local108;
				}
				local110 = arg0.anInt2969 + (local101.AA() + 1 >> 1);
				if (local9 < local110) {
					local9 = local110;
				}
				local112 = arg0.anInt2964 - (local101.a() + 1 >> 1);
				if (local112 < local11) {
					local11 = local112;
				}
				local114 = arg0.anInt2964 + (local101.a() + 1 >> 1);
				if (local13 < local114) {
					local13 = local114;
				}
			}
		}
		@Pc(215) Class168 local215 = null;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(279) int local279;
		@Pc(302) int local302;
		if (arg1.aString38 != null) {
			local215 = Static82.method1636(arg1.anInt5060);
			if (local215 != null) {
				local217 = Static435.aClass327_10.method7191(null, arg1.aString38, null, Static192.aStringArray9);
				local219 = arg0.anInt2964;
				if (local101 == null) {
					local219 -= local217 * local215.method4253() / 2;
				} else {
					local219 -= (local101.a() >> 1) + (local217 * local215.method4250());
				}
				for (local279 = 0; local279 < local217; local279++) {
					@Pc(285) String local285 = Static192.aStringArray9[local279];
					if (local217 - 1 > local279) {
						local285 = local285.substring(0, local285.length() - 4);
					}
					local302 = local215.method4254(local285);
					if (local221 < local302) {
						local221 = local302;
					}
				}
				local223 = arg0.anInt2969 - local221 / 2;
				local225 = arg0.anInt2969 + local221 / 2;
				if (local7 > local223) {
					local7 = local223;
				}
				local227 = local219;
				if (local9 < local225) {
					local9 = local225;
				}
				local229 = local219 + local217 * local215.method4250();
				if (local11 > local227) {
					local11 = local227;
				}
				if (local13 < local229) {
					local13 = local229;
				}
			}
		}
		if (local9 < Static217.anInt3836 || Static217.anInt3837 < local7 || local13 < Static217.anInt3834 || local11 > Static217.anInt3838) {
			return true;
		}
		@Pc(415) int local415;
		if (arg1.anIntArray385 != null) {
			@Pc(413) int[] local413 = new int[arg1.anIntArray385.length];
			for (local415 = 0; local415 < local413.length / 2; local415++) {
				local302 = arg0.anInt2963 + arg1.anIntArray385[local415 * 2];
				@Pc(439) int local439 = arg0.anInt2968 + arg1.anIntArray385[local415 * 2 + 1];
				local413[local415 * 2] = Static217.anInt3836 + (Static217.anInt3837 - Static217.anInt3836) * (local302 + -Static217.anInt3832) / (Static217.anInt3830 - Static217.anInt3832);
				local413[local415 * 2 + 1] = Static217.anInt3838 - (local439 - Static217.anInt3840) * (Static217.anInt3838 - Static217.anInt3834) / (Static217.anInt3831 - Static217.anInt3840);
			}
			Static469.method6545(arg2, local413, arg1.anInt5062);
			for (local302 = 0; local302 < local413.length / 2 - 1; local302++) {
				arg2.method6866(local413[local302 * 2], local413[local302 * 2 + 1], local413[(local302 + 1) * 2], arg1.anInt5078, local413[(local302 + 1) * 2 + 1]);
			}
			arg2.method6866(local413[local413.length - 2], local413[local413.length - 1], local413[0], arg1.anInt5078, local413[1]);
		}
		if (local101 != null) {
			if (Static186.anInt3869 > 0 && (Static29.anInt860 != -1 && arg0.anInt2970 == Static29.anInt860 || Static538.anInt8920 != -1 && arg1.anInt5064 == Static538.anInt8920)) {
				if (Static230.anInt4710 > 50) {
					local279 = (100 - Static230.anInt4710) * 2;
				} else {
					local279 = Static230.anInt4710 * 2;
				}
				local415 = local279 << 24 | 0xFFFF00;
				arg2.method6867(local101.QA() / 2 + 7, arg0.anInt2964, local415, arg0.anInt2969);
				arg2.method6867(local101.QA() / 2 + 5, arg0.anInt2964, local415, arg0.anInt2969);
				arg2.method6867(local101.QA() / 2 + 3, arg0.anInt2964, local415, arg0.anInt2969);
				arg2.method6867(local101.QA() / 2 + 1, arg0.anInt2964, local415, arg0.anInt2969);
				arg2.method6867(local101.QA() / 2, arg0.anInt2964, local415, arg0.anInt2969);
			}
			local101.method7666(arg0.anInt2969 - (local101.AA() >> 1), arg0.anInt2964 + -(local101.a() >> 1));
		}
		if (arg1.aString38 != null && local215 != null) {
			Static167.method3164(local215, local217, arg2, arg0, local219, local221, arg1);
		}
		if (arg1.anInt5058 != -1 || arg1.aString38 != null) {
			@Pc(732) Class6_Sub30 local732 = new Class6_Sub30(arg0);
			local732.anInt5419 = local110;
			local732.anInt5420 = local227;
			local732.anInt5417 = local114;
			local732.anInt5412 = local112;
			local732.anInt5416 = local229;
			local732.anInt5415 = local225;
			local732.anInt5421 = local108;
			local732.anInt5422 = local223;
			Static243.aClass361_38.method7833(local732);
		}
		return false;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BI)Z")
	public static boolean method4614(@OriginalArg(1) int arg0) {
		if (arg0 == 51 || arg0 == 2 || arg0 == 13 || arg0 == 30 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 58 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIB)Z")
	public static boolean method4617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static599.method7859(arg0, arg1) & (Static294.method4725(arg1, arg0) | (arg1 & 0x2000) != 0 | Static534.method7247(arg0, arg1));
	}
}
