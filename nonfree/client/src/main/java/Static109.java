import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "(I)V")
	public static void method8573() {
		Static240.aClass141_4.method3311();
		Static292.aClass152_4.method3418();
		Static239.aClass294_1.method6575();
		Static528.aClass243_3.method5554();
		Static378.aClass369_2.method8468();
		Static82.aClass134_1.method3187();
		Static315.aClass14_1.method223();
		Static463.aClass352_1.method8010();
		Static284.aClass305_1.method6904();
		Static628.aClass348_1.method7728();
		Static379.aClass39_1.method765();
		Static197.aClass9_1.method153();
		Static591.aClass148_2.method3405();
		Static201.aClass97_3.method1931();
		Static583.aClass327_4.method7412();
		Static234.aClass101_1.method2559();
		Static612.aClass380_2.method8835();
		Static635.aClass356_1.method8132();
		Static332.aClass161_1.method3635();
		Static433.aClass104_1.method2585();
		Static458.aClass233_1.method5213();
		Static280.aClass111_1.method2754();
		Static140.aClass312_1.method7052();
		Static263.method4282();
		Static252.method4108();
		Static246.method3952();
		Static47.method855();
		if (Static670.aClass242_7 != Static387.aClass242_8) {
			for (@Pc(94) int local94 = 0; local94 < Static123.aByteArrayArray6.length; local94++) {
				Static123.aByteArrayArray6[local94] = null;
			}
			Static126.anInt2113 = 0;
		}
		Static29.method496();
		Static149.method2753();
		Static355.method5209();
		Static78.method1289();
		Static647.method8907();
		Static247.aClass168_42.method3862();
		Static273.aClass100_6.method8630();
		Static106.method1601();
		Static326.method3786();
		Static137.aClass126_79.method3090();
		Static38.aClass126_26.method3090();
		Static455.aClass126_208.method3090();
		Static264.aClass126_126.method3090();
		Static543.aClass126_247.method3090();
		Static495.aClass126_12.method3090();
		Static336.aClass126_156.method3090();
		Static570.aClass126_258.method3090();
		Static27.aClass126_18.method3090();
		Static358.aClass126_165.method3090();
		Static673.aClass126_298.method3090();
		Static446.aClass126_207.method3090();
		Static230.aClass126_115.method3090();
		Static600.aClass126_275.method3090();
		Static612.aClass126_279.method3090();
		Static535.aClass126_240.method3090();
		Static92.aClass126_274.method3090();
		Static647.aClass126_291.method3090();
		Static623.aClass126_283.method3090();
		Static554.aClass126_253.method3090();
		Static279.aClass126_136.method3090();
		Static52.aClass126_40.method3090();
		Static176.aClass126_96.method3090();
		Static460.aClass126_211.method3090();
		Static116.aClass126_248.method3090();
		Static481.aClass126_223.method3090();
		Static305.aClass126_149.method3090();
		Static35.aClass126_20.method3090();
		Static583.aClass126_265.method3090();
		Static618.aClass126_284.method3090();
		Static471.aClass126_218.method3090();
		Static63.aClass126_44.method3090();
		Static609.aClass126_198.method3090();
		Static95.aClass168_17.method3862();
		Static250.aClass168_43.method3862();
		Static651.aClass168_95.method3862();
		Static199.aClass168_33.method3862();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIIII)V")
	public static void method8574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static655.method9011(arg4);
		@Pc(10) int local10 = 0;
		@Pc(23) int local23 = arg4 - arg5;
		if (local23 < 0) {
			local23 = 0;
		}
		@Pc(29) int local29 = arg4;
		@Pc(32) int local32 = -arg4;
		@Pc(34) int local34 = local23;
		@Pc(37) int local37 = -local23;
		@Pc(39) int local39 = -1;
		@Pc(41) int local41 = -1;
		@Pc(62) int local62;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (Static573.anInt8986 <= arg3 && arg3 <= Static319.anInt5445) {
			@Pc(53) int[] local53 = Static120.anIntArrayArray18[arg3];
			local62 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg0 - arg4);
			local70 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg4 + arg0);
			local79 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg0 - local23);
			local88 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg0 + local23);
			Static161.method2977(local62, arg2, local79, local53, -118);
			Static161.method2977(local79, arg1, local88, local53, -124);
			Static161.method2977(local88, arg2, local70, local53, -123);
		}
		while (local29 > local10) {
			local41 += 2;
			local39 += 2;
			local37 += local41;
			local32 += local39;
			if (local37 >= 0 && local34 >= 1) {
				local34--;
				local37 -= local34 << 1;
				Static352.anIntArray340[local34] = local10;
			}
			local10++;
			@Pc(245) int local245;
			@Pc(254) int local254;
			@Pc(261) int[] local261;
			@Pc(153) int local153;
			if (local32 >= 0) {
				local29--;
				local32 -= local29 << 1;
				local153 = arg3 - local29;
				local62 = arg3 + local29;
				if (local62 >= Static573.anInt8986 && Static319.anInt5445 >= local153) {
					if (local29 >= local23) {
						local70 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, local10 + arg0);
						local79 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg0 - local10);
						if (local62 <= Static319.anInt5445) {
							Static161.method2977(local79, arg2, local70, Static120.anIntArrayArray18[local62], -122);
						}
						if (Static573.anInt8986 <= local153) {
							Static161.method2977(local79, arg2, local70, Static120.anIntArrayArray18[local153], -110);
						}
					} else {
						local70 = Static352.anIntArray340[local29];
						local79 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, local10 + arg0);
						local88 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg0 - local10);
						local245 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, local70 + arg0);
						local254 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg0 - local70);
						if (local62 <= Static319.anInt5445) {
							local261 = Static120.anIntArrayArray18[local62];
							Static161.method2977(local88, arg2, local254, local261, -117);
							Static161.method2977(local254, arg1, local245, local261, -118);
							Static161.method2977(local245, arg2, local79, local261, -116);
						}
						if (local153 >= Static573.anInt8986) {
							local261 = Static120.anIntArrayArray18[local153];
							Static161.method2977(local88, arg2, local254, local261, -110);
							Static161.method2977(local254, arg1, local245, local261, -127);
							Static161.method2977(local245, arg2, local79, local261, -124);
						}
					}
				}
			}
			local153 = arg3 - local10;
			local62 = local10 + arg3;
			if (local62 >= Static573.anInt8986 && local153 <= Static319.anInt5445) {
				local70 = arg0 + local29;
				local79 = arg0 - local29;
				if (local70 >= Static230.anInt3962 && Static463.anInt7530 >= local79) {
					local70 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, local70);
					local79 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, local79);
					if (local10 < local23) {
						local88 = local34 >= local10 ? local34 : Static352.anIntArray340[local10];
						local245 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg0 + local88);
						local254 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg0 - local88);
						if (Static319.anInt5445 >= local62) {
							local261 = Static120.anIntArrayArray18[local62];
							Static161.method2977(local79, arg2, local254, local261, -122);
							Static161.method2977(local254, arg1, local245, local261, -126);
							Static161.method2977(local245, arg2, local70, local261, -108);
						}
						if (Static573.anInt8986 <= local153) {
							local261 = Static120.anIntArrayArray18[local153];
							Static161.method2977(local79, arg2, local254, local261, -116);
							Static161.method2977(local254, arg1, local245, local261, -109);
							Static161.method2977(local245, arg2, local70, local261, -117);
						}
					} else {
						if (local62 <= Static319.anInt5445) {
							Static161.method2977(local79, arg2, local70, Static120.anIntArrayArray18[local62], -121);
						}
						if (Static573.anInt8986 <= local153) {
							Static161.method2977(local79, arg2, local70, Static120.anIntArrayArray18[local153], -128);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)V")
	public static void method8575() {
		Static29.method496();
		Static437.aClass100_10 = null;
		Static611.aClass283ArrayArray1 = null;
		Static534.aClass185_4 = null;
		Static103.aClass185_1 = null;
		Static512.aClass185_3 = null;
	}

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "(I)V")
	public static void method8576() {
		Static645.aClass194Array1 = null;
	}
}
