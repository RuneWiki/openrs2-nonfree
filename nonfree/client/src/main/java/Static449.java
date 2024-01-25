import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
	public static int anInt7316;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "Z")
	public static boolean aBoolean688 = false;

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "Z")
	public static boolean aBoolean689 = false;

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "[I")
	public static final int[] anIntArray557 = new int[3];

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(FIIIIBFF)[F")
	public static float[] method5652(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[8] = local17;
		local6[3] = 0.0F;
		local6[0] = local17;
		local6[5] = 0.0F;
		local6[1] = 0.0F;
		local6[4] = 1.0F;
		local6[6] = -local25;
		local6[2] = local25;
		local6[7] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(73) float local73 = 0.0F;
		@Pc(78) float local78 = (float) arg2 / 32767.0F;
		@Pc(82) float local82 = 1.0F - local78;
		@Pc(98) float local98 = -((float) Math.sqrt((double) (1.0F - local78 * local78)));
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg4 * arg4 + arg3 * arg3));
		if (local110 == 0.0F && local78 == 0.0F) {
			local9 = local6;
		} else {
			if (local110 != 0.0F) {
				local73 = (float) arg4 / local110;
				local71 = (float) -arg3 / local110;
			}
			local69[2] = local82 * local71 * local73;
			local69[4] = local78;
			local69[7] = -local71 * local98;
			local69[5] = local71 * local98;
			local69[8] = local78 + local82 * local73 * local73;
			local69[0] = local71 * local71 * local82 + local78;
			local69[3] = -local73 * local98;
			local69[1] = local98 * local73;
			local69[6] = local82 * local73 * local71;
			local9[0] = local6[2] * local69[6] + local69[3] * local6[1] + local69[0] * local6[0];
			local9[1] = local6[2] * local69[7] + local69[1] * local6[0] + local69[4] * local6[1];
			local9[2] = local69[8] * local6[2] + local69[2] * local6[0] + local69[5] * local6[1];
			local9[3] = local69[6] * local6[5] + local6[3] * local69[0] + local69[3] * local6[4];
			local9[4] = local6[5] * local69[7] + local6[3] * local69[1] + local6[4] * local69[4];
			local9[6] = local69[3] * local6[7] + local69[0] * local6[6] + local6[8] * local69[6];
			local9[5] = local6[5] * local69[8] + local69[5] * local6[4] + local69[2] * local6[3];
			local9[7] = local6[6] * local69[1] + local69[4] * local6[7] + local6[8] * local69[7];
			local9[8] = local69[5] * local6[7] + local6[6] * local69[2] + local69[8] * local6[8];
		}
		local9[5] *= arg5;
		local9[6] *= arg6;
		local9[0] *= arg0;
		local9[1] *= arg0;
		local9[7] *= arg6;
		local9[8] *= arg6;
		local9[3] *= arg5;
		local9[4] *= arg5;
		local9[2] *= arg0;
		return local9;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)V")
	public static void method5653() {
		Static429.method5476(Static50.aClass215_11);
		for (@Pc(22) Class4_Sub43 local22 = (Class4_Sub43) Static325.aClass102_29.method2705(); local22 != null; local22 = (Class4_Sub43) Static325.aClass102_29.method2704()) {
			if (!local22.method5683()) {
				local22 = (Class4_Sub43) Static325.aClass102_29.method2705();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt6981 == 0) {
				Static90.method1606(true, local22, true);
			}
		}
		if (Static304.aClass247_16 != null) {
			Static63.method1142(Static304.aClass247_16);
			Static304.aClass247_16 = null;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	public static void method5654() {
		for (@Pc(16) Class4_Sub1_Sub10 local16 = (Class4_Sub1_Sub10) Static292.aClass183_36.method4140(); local16 != null; local16 = (Class4_Sub1_Sub10) Static292.aClass183_36.method4144()) {
			@Pc(21) Class16_Sub1_Sub2 local21 = local16.aClass16_Sub1_Sub2_1;
			if (local21.aBoolean113) {
				local16.method5684();
				local21.method1244();
			} else if (local21.anInt1346 <= Static24.anInt5323) {
				local21.method1243(Static176.anInt3414);
				if (local21.aBoolean113) {
					local16.method5684();
				} else {
					Static324.method4385(local21, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method5655(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local26 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(113) int local113;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local113 = 0; local113 < arg0; local113++) {
				if (local69 <= local113) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(160) int local160;
		for (local113 = arg0 - 1; local113 >= 0; local113--) {
			for (local160 = 0; local160 < arg0; local160++) {
				if (local113 <= local160) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(205) int local205;
		for (local160 = arg0 - 1; local160 >= 0; local160--) {
			for (local205 = 0; local205 < arg0; local205++) {
				if (local205 <= local160 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(243) int local243;
		for (local205 = 0; local205 < arg0; local205++) {
			for (local243 = 0; local243 < arg0; local243++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local243 >= local205 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(297) int local297;
		for (local243 = 0; local243 < arg0; local243++) {
			for (local297 = arg0 - 1; local297 >= 0; local297--) {
				if (local243 >> 1 >= local297) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(350) int local350;
		for (local297 = arg0 - 1; local297 >= 0; local297--) {
			for (local350 = arg0 - 1; local350 >= 0; local350--) {
				if (local350 >= local297 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(401) int local401;
		for (local350 = arg0 - 1; local350 >= 0; local350--) {
			for (local401 = arg0 - 1; local401 >= 0; local401--) {
				if (local350 >> 1 >= local401) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(450) int local450;
		for (local401 = arg0 - 1; local401 >= 0; local401--) {
			for (local450 = 0; local450 < arg0; local450++) {
				if (local450 >= local401 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(496) int local496;
		for (local450 = 0; local450 < arg0; local450++) {
			for (local496 = 0; local496 < arg0; local496++) {
				if (local496 <= local450 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(545) int local545;
		for (local496 = 0; local496 < arg0; local496++) {
			for (local545 = arg0 - 1; local545 >= 0; local545--) {
				if (local496 << 1 <= local545) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(589) int local589;
		for (local545 = arg0 - 1; local545 >= 0; local545--) {
			for (local589 = 0; local589 < arg0; local589++) {
				if (local545 >> 1 <= local589) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(638) int local638;
		for (local589 = 0; local589 < arg0; local589++) {
			for (local638 = 0; local638 < arg0; local638++) {
				if (local638 <= local589 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(679) int local679;
		for (local638 = 0; local638 < arg0; local638++) {
			for (local679 = arg0 - 1; local679 >= 0; local679--) {
				if (local638 >> 1 <= local679) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(729) int local729;
		for (local679 = arg0 - 1; local679 >= 0; local679--) {
			for (local729 = arg0 - 1; local729 >= 0; local729--) {
				if (local729 <= local679 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(777) int local777;
		for (local729 = arg0 - 1; local729 >= 0; local729--) {
			for (local777 = arg0 - 1; local777 >= 0; local777--) {
				if (local777 >= local729 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(820) int local820;
		for (local777 = arg0 - 1; local777 >= 0; local777--) {
			for (local820 = 0; local820 < arg0; local820++) {
				if (local820 <= local777 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(869) int local869;
		for (local820 = 0; local820 < arg0; local820++) {
			for (local869 = 0; local869 < arg0; local869++) {
				if (local869 >= local820 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(918) int local918;
		for (local869 = 0; local869 < arg0; local869++) {
			for (local918 = arg0 - 1; local918 >= 0; local918--) {
				if (local869 << 1 >= local918) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(960) int local960;
		for (local918 = 0; local918 < arg0; local918++) {
			for (local960 = 0; local960 < arg0; local960++) {
				if (local960 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1011) int local1011;
		for (local960 = 0; local960 < arg0; local960++) {
			for (local1011 = 0; local1011 < arg0; local1011++) {
				if (arg0 / 2 >= local960) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1058) int local1058;
		for (local1011 = 0; local1011 < arg0; local1011++) {
			for (local1058 = 0; local1058 < arg0; local1058++) {
				if (arg0 / 2 <= local1058) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1105) int local1105;
		for (local1058 = 0; local1058 < arg0; local1058++) {
			for (local1105 = 0; local1105 < arg0; local1105++) {
				if (local1058 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1152) int local1152;
		for (local1105 = 0; local1105 < arg0; local1105++) {
			for (local1152 = 0; local1152 < arg0; local1152++) {
				if (local1105 - arg0 / 2 >= local1152) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1208) int local1208;
		for (local1152 = arg0 - 1; local1152 >= 0; local1152--) {
			for (local1208 = 0; local1208 < arg0; local1208++) {
				if (local1208 <= local1152 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1256) int local1256;
		for (local1208 = arg0 - 1; local1208 >= 0; local1208--) {
			for (local1256 = arg0 - 1; local1256 >= 0; local1256--) {
				if (local1256 <= local1208 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1302) int local1302;
		for (local1256 = 0; local1256 < arg0; local1256++) {
			for (local1302 = arg0 - 1; local1302 >= 0; local1302--) {
				if (local1256 - arg0 / 2 >= local1302) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1354) int local1354;
		for (local1302 = 0; local1302 < arg0; local1302++) {
			for (local1354 = 0; local1354 < arg0; local1354++) {
				if (local1302 - arg0 / 2 <= local1354) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1410) int local1410;
		for (local1354 = arg0 - 1; local1354 >= 0; local1354--) {
			for (local1410 = 0; local1410 < arg0; local1410++) {
				if (local1354 - arg0 / 2 <= local1410) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1461) int local1461;
		for (local1410 = arg0 - 1; local1410 >= 0; local1410--) {
			for (local1461 = arg0 - 1; local1461 >= 0; local1461--) {
				if (local1410 - arg0 / 2 <= local1461) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1461 = 0; local1461 < arg0; local1461++) {
			for (@Pc(1506) int local1506 = arg0 - 1; local1506 >= 0; local1506--) {
				if (local1461 - arg0 / 2 <= local1506) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
