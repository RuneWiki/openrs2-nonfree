import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	public static int anInt7379;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!uq;")
	public static Class1_Sub3_Sub16 aClass1_Sub3_Sub16_4;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	public static int anInt7382 = 0;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_100 = new Class167(200);

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	public static int anInt7384 = 100;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!se;I)V")
	public static void method5575(@OriginalArg(0) int arg0, @OriginalArg(2) Class20_Sub3_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt6051 && arg2 != -1) {
			@Pc(16) Class171 local16 = Static152.aClass213_1.method4410(arg2);
			@Pc(19) int local19 = local16.anInt4256;
			if (local19 == 1) {
				arg1.anInt6053 = 0;
				arg1.anInt6044 = 0;
				arg1.anInt6040 = arg0;
				arg1.anInt6039 = 0;
				arg1.anInt6022 = 1;
				Static7.method4909(arg1.anInt6616, arg1.anInt6613, arg1.aByte89, false, local16, arg1.anInt6044);
			}
			if (local19 == 2) {
				arg1.anInt6053 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt6051 == -1 || Static152.aClass213_1.method4410(arg2).anInt4262 >= Static152.aClass213_1.method4410(arg1.anInt6051).anInt4262) {
			arg1.anInt6039 = 0;
			arg1.anInt6022 = 1;
			arg1.anInt6040 = arg0;
			arg1.anInt6053 = 0;
			arg1.anInt6051 = arg2;
			arg1.anInt6087 = arg1.anInt6088;
			arg1.anInt6044 = 0;
			if (arg1.anInt6051 != -1) {
				Static7.method4909(arg1.anInt6616, arg1.anInt6613, arg1.aByte89, false, Static152.aClass213_1.method4410(arg1.anInt6051), arg1.anInt6044);
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)I")
	public static int method5576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class1_Sub1_Sub25.anIntArray248[arg3 * 8192 / arg2] >> 1;
		return (local16 * arg0 >> 16) + ((65536 - local16) * arg1 >> 16);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!me;IZ)V")
	public static void method5577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20_Sub3_Sub3 arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class51 local12 = arg2.method4676();
		@Pc(22) int local22 = arg2.anInt6010 - arg2.aClass145_7.anInt3594 & 0x3FFF;
		if (arg0 == -1) {
			if (local22 != 0 || arg2.anInt6079 > 25) {
				arg2.aBoolean502 = false;
				if (arg3 < 0 && local12.anInt1304 != -1) {
					arg2.anInt6037 = local12.anInt1304;
				} else if (arg3 <= 0 || local12.anInt1320 == -1) {
					arg2.anInt6037 = local12.anInt1290;
				} else {
					arg2.anInt6037 = local12.anInt1320;
				}
			} else if (!arg2.aBoolean502 || !local12.method1124(arg2.anInt6037)) {
				arg2.anInt6037 = local12.method1120();
				arg2.aBoolean502 = arg2.anInt6037 != -1;
			}
		} else if (arg2.anInt6012 != -1 && (local22 >= 10240 || local22 <= 2048)) {
			@Pc(213) int local213 = Static304.anIntArray297[arg1] - arg2.aClass145_7.anInt3594 & 0x3FFF;
			arg2.aBoolean502 = false;
			if (arg0 == 2 && local12.anInt1321 != -1) {
				if (local213 > 2048 && local213 <= 6144 && local12.anInt1310 != -1) {
					arg2.anInt6037 = local12.anInt1310;
				} else if (local213 >= 10240 && local213 < 14336 && local12.anInt1294 != -1) {
					arg2.anInt6037 = local12.anInt1294;
				} else if (local213 <= 6144 || local213 >= 10240 || local12.anInt1322 == -1) {
					arg2.anInt6037 = local12.anInt1321;
				} else {
					arg2.anInt6037 = local12.anInt1322;
				}
			} else if (arg0 == 0 && local12.anInt1317 != -1) {
				if (local213 > 2048 && local213 <= 6144 && local12.anInt1291 != -1) {
					arg2.anInt6037 = local12.anInt1291;
				} else if (local213 >= 10240 && local213 < 14336 && local12.anInt1300 != -1) {
					arg2.anInt6037 = local12.anInt1300;
				} else if (local213 <= 6144 || local213 >= 10240 || local12.anInt1303 == -1) {
					arg2.anInt6037 = local12.anInt1317;
				} else {
					arg2.anInt6037 = local12.anInt1303;
				}
			} else if (local213 > 2048 && local213 <= 6144 && local12.anInt1292 != -1) {
				arg2.anInt6037 = local12.anInt1292;
			} else if (local213 >= 10240 && local213 < 14336 && local12.anInt1315 != -1) {
				arg2.anInt6037 = local12.anInt1315;
			} else if (local213 <= 6144 || local213 >= 10240 || local12.anInt1307 == -1) {
				arg2.anInt6037 = local12.anInt1290;
			} else {
				arg2.anInt6037 = local12.anInt1307;
			}
		} else if (local22 == 0 && arg2.anInt6079 <= 25) {
			arg2.aBoolean502 = false;
			if (arg0 == 2 && local12.anInt1321 != -1) {
				arg2.anInt6037 = local12.anInt1321;
			} else if (arg0 == 0 && local12.anInt1317 != -1) {
				arg2.anInt6037 = local12.anInt1317;
			} else {
				arg2.anInt6037 = local12.anInt1290;
			}
		} else {
			arg2.aBoolean502 = false;
			if (arg0 == 2 && local12.anInt1321 != -1) {
				if (arg3 < 0 && local12.anInt1327 != -1) {
					arg2.anInt6037 = local12.anInt1327;
				} else if (arg3 <= 0 || local12.anInt1326 == -1) {
					arg2.anInt6037 = local12.anInt1321;
				} else {
					arg2.anInt6037 = local12.anInt1326;
				}
			} else if (arg0 == 0 && local12.anInt1317 != -1) {
				if (arg3 < 0 && local12.anInt1306 != -1) {
					arg2.anInt6037 = local12.anInt1306;
				} else if (arg3 <= 0 || local12.anInt1286 == -1) {
					arg2.anInt6037 = local12.anInt1317;
				} else {
					arg2.anInt6037 = local12.anInt1286;
				}
			} else if (arg3 < 0 && local12.anInt1285 != -1) {
				arg2.anInt6037 = local12.anInt1285;
			} else if (arg3 <= 0 || local12.anInt1324 == -1) {
				arg2.anInt6037 = local12.anInt1290;
			} else {
				arg2.anInt6037 = local12.anInt1324;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIFI[FI)V")
	public static void method5578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg2 - arg1;
		@Pc(13) int local13 = arg4 - arg8;
		@Pc(17) int local17 = arg6 - arg3;
		@Pc(38) float local38 = arg7[1] * (float) local9 + (float) local13 * arg7[0] + arg7[2] * (float) local17;
		@Pc(59) float local59 = (float) local13 * arg7[3] + arg7[4] * (float) local9 + arg7[5] * (float) local17;
		@Pc(80) float local80 = arg7[8] * (float) local17 + arg7[6] * (float) local13 + arg7[7] * (float) local9;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg5 + 0.5F;
		@Pc(131) float local131;
		if (arg0 == 1) {
			local131 = local106;
			local106 = -local124;
			local124 = local131;
		} else if (arg0 == 2) {
			local124 = -local124;
			local106 = -local106;
		} else if (arg0 == 3) {
			local131 = local106;
			local106 = local124;
			local124 = -local131;
		}
		Static433.aFloat96 = local106;
		Static344.aFloat86 = local124;
	}
}
