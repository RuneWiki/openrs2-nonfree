import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!qea", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray75 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!qea", name = "r", descriptor = "[I")
	public static final int[] anIntArray577 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!qea", name = "w", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_96 = new Class160(58, 12);

	@OriginalMember(owner = "client!qea", name = "y", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_160 = new Class40(0, -1);

	@OriginalMember(owner = "client!qea", name = "z", descriptor = "[I")
	public static final int[] anIntArray578 = new int[200];

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V")
	public static void method6058() {
		Static451.aClass327_5.method7406();
		Static261.aClass318_1.method7318();
		Static78.aClass344_1.method7790();
		Static260.aClass100_1.method2009();
		Static51.aClass202_1.method4899();
		Static295.aClass256_2.method5925();
		Static31.aClass345_1.method7797();
		Static448.aClass117_2.method2318();
		Static386.aClass91_1.method1858();
		Static333.aClass187_1.method4091();
		Static492.aClass189_1.method4112();
		Static474.aClass276_4.method6394();
		Static32.aClass245_1.method5770();
		Static112.aClass307_1.method6809();
		Static322.aClass180_1.method3990();
		Static316.aClass141_1.method3008();
		Static264.aClass124_1.method2624();
		Static266.aClass294_1.method6544();
		Static247.aClass33_2.method599();
		Static442.aClass337_1.method7585();
		Static461.method6476();
		Static146.method2179();
		Static462.method6487();
		Static348.method7095();
		Static574.aClass332_152.method7497(5);
		Static292.aClass332_123.method7497(5);
		Static306.aClass332_129.method7497(5);
		Static377.aClass332_157.method7497(5);
		Static100.aClass332_50.method7497(5);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIIIBIII)V")
	public static void method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg6;
		@Pc(21) int local21 = arg0 - arg6;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(61) int local61 = local33 << 1;
		@Pc(65) int local65 = arg0 << 1;
		@Pc(69) int local69 = local21 << 1;
		@Pc(78) int local78 = local41 + (1 - local65) * local25;
		@Pc(87) int local87 = local29 - (local65 - 1) * local45;
		@Pc(96) int local96 = local49 + local33 * (1 - local69);
		@Pc(105) int local105 = local37 - (local69 - 1) * local61;
		@Pc(109) int local109 = local25 << 2;
		@Pc(113) int local113 = local29 << 2;
		@Pc(117) int local117 = local33 << 2;
		@Pc(121) int local121 = local37 << 2;
		@Pc(125) int local125 = local41 * 3;
		@Pc(131) int local131 = local45 * (local65 - 3);
		@Pc(135) int local135 = local49 * 3;
		@Pc(141) int local141 = local61 * (local69 - 3);
		@Pc(143) int local143 = local113;
		@Pc(149) int local149 = (arg0 - 1) * local109;
		@Pc(151) int local151 = local121;
		@Pc(157) int local157 = local117 * (local21 - 1);
		@Pc(180) int local180;
		@Pc(189) int local189;
		@Pc(197) int local197;
		@Pc(206) int local206;
		if (Static134.anInt2364 <= arg5 && arg5 <= Static60.anInt971) {
			@Pc(171) int[] local171 = Static503.anIntArrayArray12[arg5];
			local180 = Static112.method1759(arg2 - arg4, Static235.anInt3970, Static151.anInt2683);
			local189 = Static112.method1759(arg2 + arg4, Static235.anInt3970, Static151.anInt2683);
			local197 = Static112.method1759(arg2 - local16, Static235.anInt3970, Static151.anInt2683);
			local206 = Static112.method1759(arg2 + local16, Static235.anInt3970, Static151.anInt2683);
			Static455.method6536(local197, local180, arg3, local171);
			Static455.method6536(local206, local197, arg1, local171);
			Static455.method6536(local189, local206, arg3, local171);
		}
		while (local9 > 0) {
			@Pc(233) boolean local233 = local9 <= local21;
			if (local233) {
				if (local96 < 0) {
					while (local96 < 0) {
						local105 += local151;
						local96 += local135;
						local151 += local121;
						local11++;
						local135 += local121;
					}
				}
				if (local105 < 0) {
					local96 += local135;
					local105 += local151;
					local151 += local121;
					local135 += local121;
					local11++;
				}
				local105 += -local141;
				local96 += -local157;
				local141 -= local117;
				local157 -= local117;
			}
			if (local78 < 0) {
				while (local78 < 0) {
					local78 += local125;
					local87 += local143;
					local7++;
					local125 += local113;
					local143 += local113;
				}
			}
			if (local87 < 0) {
				local87 += local143;
				local78 += local125;
				local125 += local113;
				local143 += local113;
				local7++;
			}
			local78 += -local149;
			local87 += -local131;
			local149 -= local109;
			local131 -= local109;
			local9--;
			local180 = arg5 - local9;
			local189 = arg5 + local9;
			if (local189 >= Static134.anInt2364 && Static60.anInt971 >= local180) {
				local197 = Static112.method1759(arg2 + local7, Static235.anInt3970, Static151.anInt2683);
				local206 = Static112.method1759(arg2 - local7, Static235.anInt3970, Static151.anInt2683);
				if (local233) {
					@Pc(444) int local444 = Static112.method1759(arg2 + local11, Static235.anInt3970, Static151.anInt2683);
					@Pc(453) int local453 = Static112.method1759(arg2 - local11, Static235.anInt3970, Static151.anInt2683);
					@Pc(460) int[] local460;
					if (Static134.anInt2364 <= local180) {
						local460 = Static503.anIntArrayArray12[local180];
						Static455.method6536(local453, local206, arg3, local460);
						Static455.method6536(local444, local453, arg1, local460);
						Static455.method6536(local197, local444, arg3, local460);
					}
					if (local189 <= Static60.anInt971) {
						local460 = Static503.anIntArrayArray12[local189];
						Static455.method6536(local453, local206, arg3, local460);
						Static455.method6536(local444, local453, arg1, local460);
						Static455.method6536(local197, local444, arg3, local460);
					}
				} else {
					if (local180 >= Static134.anInt2364) {
						Static455.method6536(local197, local206, arg3, Static503.anIntArrayArray12[local180]);
					}
					if (Static60.anInt971 >= local189) {
						Static455.method6536(local197, local206, arg3, Static503.anIntArrayArray12[local189]);
					}
				}
			}
		}
	}
}
