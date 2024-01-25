import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
	public static int anInt3380;

	@OriginalMember(owner = "client!tj", name = "w", descriptor = "Lclient!od;")
	public static Applet_Sub1 anApplet_Sub1_3 = null;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBI)Z")
	public static boolean method2753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static392.method4989(arg1, arg0) | (arg0 & 0x40000) != 0 || Static141.method2175(arg0, arg1);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2754(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg1;
		@Pc(21) int local21 = arg2 - arg1;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg2 * arg2;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(61) int local61 = local33 << 1;
		@Pc(65) int local65 = arg2 << 1;
		@Pc(69) int local69 = local21 << 1;
		@Pc(78) int local78 = local41 + (1 - local65) * local25;
		@Pc(87) int local87 = local29 - local45 * (local65 - 1);
		@Pc(96) int local96 = local49 + (1 - local69) * local33;
		@Pc(105) int local105 = local37 - (local69 - 1) * local61;
		@Pc(109) int local109 = local25 << 2;
		@Pc(113) int local113 = local29 << 2;
		@Pc(117) int local117 = local33 << 2;
		@Pc(121) int local121 = local37 << 2;
		@Pc(125) int local125 = local41 * 3;
		@Pc(131) int local131 = (local65 - 3) * local45;
		@Pc(135) int local135 = local49 * 3;
		@Pc(141) int local141 = local61 * (local69 - 3);
		@Pc(143) int local143 = local113;
		@Pc(149) int local149 = local109 * (arg2 - 1);
		@Pc(151) int local151 = local121;
		@Pc(157) int local157 = (local21 - 1) * local117;
		@Pc(161) int[] local161 = Static353.anIntArrayArray48[arg4];
		Static404.method5769(local161, arg5 - arg6, arg5 + -local16, arg3);
		Static404.method5769(local161, arg5 - local16, local16 + arg5, arg0);
		Static404.method5769(local161, arg5 + local16, arg6 + arg5, arg3);
		while (local9 > 0) {
			@Pc(202) boolean local202 = local21 >= local9;
			if (local78 < 0) {
				while (local78 < 0) {
					local87 += local143;
					local78 += local125;
					local125 += local113;
					local7++;
					local143 += local113;
				}
			}
			if (local202) {
				if (local96 < 0) {
					while (local96 < 0) {
						local105 += local151;
						local96 += local135;
						local135 += local121;
						local11++;
						local151 += local121;
					}
				}
				if (local105 < 0) {
					local96 += local135;
					local105 += local151;
					local151 += local121;
					local135 += local121;
					local11++;
				}
				local96 += -local157;
				local105 += -local141;
				local141 -= local117;
				local157 -= local117;
			}
			if (local87 < 0) {
				local78 += local125;
				local87 += local143;
				local143 += local113;
				local125 += local113;
				local7++;
			}
			local87 += -local131;
			local78 += -local149;
			local9--;
			local149 -= local109;
			local131 -= local109;
			@Pc(342) int local342 = arg4 - local9;
			@Pc(346) int local346 = arg4 + local9;
			@Pc(350) int local350 = local7 + arg5;
			@Pc(355) int local355 = arg5 - local7;
			if (local202) {
				@Pc(361) int local361 = local11 + arg5;
				@Pc(366) int local366 = arg5 - local11;
				Static404.method5769(Static353.anIntArrayArray48[local342], local355, local366, arg3);
				Static404.method5769(Static353.anIntArrayArray48[local342], local366, local361, arg0);
				Static404.method5769(Static353.anIntArrayArray48[local342], local361, local350, arg3);
				Static404.method5769(Static353.anIntArrayArray48[local346], local355, local366, arg3);
				Static404.method5769(Static353.anIntArrayArray48[local346], local366, local361, arg0);
				Static404.method5769(Static353.anIntArrayArray48[local346], local361, local350, arg3);
			} else {
				Static404.method5769(Static353.anIntArrayArray48[local342], local355, local350, arg3);
				Static404.method5769(Static353.anIntArrayArray48[local346], local355, local350, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!ec;Lclient!gk;I)V")
	public static void method2756(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class7_Sub14 arg2) {
		@Pc(9) Class7_Sub9 local9 = new Class7_Sub9();
		local9.anInt679 = arg2.method3981();
		local9.anInt680 = arg2.method3938();
		local9.aByteArrayArrayArray1 = new byte[local9.anInt679][][];
		local9.aClass236Array1 = new Class236[local9.anInt679];
		local9.aClass236Array2 = new Class236[local9.anInt679];
		local9.anIntArray62 = new int[local9.anInt679];
		local9.anIntArray63 = new int[local9.anInt679];
		local9.anIntArray64 = new int[local9.anInt679];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt679; local55++) {
			try {
				@Pc(63) int local63 = arg2.method3981();
				@Pc(85) String local85;
				@Pc(91) String local91;
				@Pc(95) int local95;
				if (local63 == 0 || local63 == 1 || local63 == 2) {
					local85 = arg2.method3986();
					local91 = arg2.method3986();
					local95 = 0;
					if (local63 == 1) {
						local95 = arg2.method3938();
					}
					local9.anIntArray64[local55] = local63;
					local9.anIntArray62[local55] = local95;
					local9.aClass236Array2[local55] = arg1.method1446(local91, Static18.method201(local85));
				} else if (local63 == 3 || local63 == 4) {
					local85 = arg2.method3986();
					local91 = arg2.method3986();
					local95 = arg2.method3981();
					@Pc(98) String[] local98 = new String[local95];
					for (@Pc(100) int local100 = 0; local100 < local95; local100++) {
						local98[local100] = arg2.method3986();
					}
					@Pc(119) byte[][] local119 = new byte[local95][];
					@Pc(132) int local132;
					if (local63 == 3) {
						for (@Pc(126) int local126 = 0; local126 < local95; local126++) {
							local132 = arg2.method3938();
							local119[local126] = new byte[local132];
							arg2.method3932(local119[local126], local132);
						}
					}
					local9.anIntArray64[local55] = local63;
					@Pc(161) Class[] local161 = new Class[local95];
					for (local132 = 0; local132 < local95; local132++) {
						local161[local132] = Static18.method201(local98[local132]);
					}
					local9.aClass236Array1[local55] = arg1.method1448(local161, local91, Static18.method201(local85));
					local9.aByteArrayArrayArray1[local55] = local119;
				}
			} catch (@Pc(242) ClassNotFoundException local242) {
				local9.anIntArray63[local55] = -1;
			} catch (@Pc(249) SecurityException local249) {
				local9.anIntArray63[local55] = -2;
			} catch (@Pc(256) NullPointerException local256) {
				local9.anIntArray63[local55] = -3;
			} catch (@Pc(263) Exception local263) {
				local9.anIntArray63[local55] = -4;
			} catch (@Pc(270) Throwable local270) {
				local9.anIntArray63[local55] = -5;
			}
		}
		Static1.aClass85_1.method2011(local9);
	}
}
