import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "J")
	public static long aLong238;

	@OriginalMember(owner = "client!rj", name = "E", descriptor = "Lclient!jea;")
	public static final Class177 aClass177_27 = new Class177(7, -1);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIII)V")
	public static void method6822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class34_Sub10 local10 = (Class34_Sub10) Static111.aClass317_1.method6891(); local10 != null; local10 = (Class34_Sub10) Static111.aClass317_1.method6894()) {
			if (local10.anInt10688 <= Static122.anInt2190) {
				local10.method8764();
			} else {
				Static312.method4499((local10.anInt10690 << 9) + 256, local10.anInt10691 * 2, arg3 >> 1, local10.anInt10689, arg1 >> 1, (local10.anInt10687 << 9) + 256);
				Static293.aClass67_14.method7676(local10.anInt10692 | 0xFF000000, local10.aString114, 0, arg0 + Static33.anIntArray465[1], arg2 - -Static33.anIntArray465[0]);
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!eq;IIIIIIIIIB)Z")
	public static boolean method6823(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg8;
		@Pc(26) int local26 = arg3 - 64;
		Static624.anIntArrayArray56[64][64] = 99;
		@Pc(37) int local37 = arg8 - 64;
		Static107.anIntArrayArray9[64][64] = 0;
		@Pc(45) byte local45 = 0;
		@Pc(47) int local47 = 0;
		Static114.anIntArray117[0] = arg3;
		@Pc(54) int local54 = local45 + 1;
		Static459.anIntArray400[0] = arg8;
		@Pc(59) int[][] local59 = arg0.anIntArrayArray14;
		while (local47 != local54) {
			local9 = Static459.anIntArray400[local47];
			local7 = Static114.anIntArray117[local47];
			@Pc(74) int local74 = local9 - local37;
			@Pc(78) int local78 = local7 - local26;
			@Pc(83) int local83 = local9 - arg0.anInt2726;
			@Pc(89) int local89 = local7 - arg0.anInt2712;
			local47 = local47 + 1 & 0xFFF;
			if (arg2 == -4) {
				if (arg4 == local7 && arg5 == local9) {
					Static168.anInt3083 = local9;
					Static246.anInt4348 = local7;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static364.method5247(arg4, local7, 1, arg5, arg6, 1, arg9, local9)) {
					Static246.anInt4348 = local7;
					Static168.anInt3083 = local9;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg0.method2375(arg6, arg9, 1, arg1, 1, arg5, arg4, local9, local7)) {
					Static246.anInt4348 = local7;
					Static168.anInt3083 = local9;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg0.method2374(arg6, 1, arg4, arg9, arg1, arg5, local9, local7)) {
					Static168.anInt3083 = local9;
					Static246.anInt4348 = local7;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg0.method2370(arg2, arg4, 1, arg5, arg7, local7, local9)) {
					Static168.anInt3083 = local9;
					Static246.anInt4348 = local7;
					return true;
				}
			} else if (arg0.method2363(local9, local7, 1, arg4, arg5, arg2, arg7)) {
				Static168.anInt3083 = local9;
				Static246.anInt4348 = local7;
				return true;
			}
			@Pc(241) int local241 = Static107.anIntArrayArray9[local78][local74] + 1;
			if (local78 > 0 && Static624.anIntArrayArray56[local78 - 1][local74] == 0 && (local59[local89 - 1][local83] & 0x42240000) == 0) {
				Static114.anIntArray117[local54] = local7 - 1;
				Static459.anIntArray400[local54] = local9;
				local54 = local54 + 1 & 0xFFF;
				Static624.anIntArrayArray56[local78 - 1][local74] = 2;
				Static107.anIntArrayArray9[local78 - 1][local74] = local241;
			}
			if (local78 < 127 && Static624.anIntArrayArray56[local78 + 1][local74] == 0 && (local59[local89 + 1][local83] & 0x60240000) == 0) {
				Static114.anIntArray117[local54] = local7 + 1;
				Static459.anIntArray400[local54] = local9;
				local54 = local54 + 1 & 0xFFF;
				Static624.anIntArrayArray56[local78 + 1][local74] = 8;
				Static107.anIntArrayArray9[local78 + 1][local74] = local241;
			}
			if (local74 > 0 && Static624.anIntArrayArray56[local78][local74 - 1] == 0 && (local59[local89][local83 - 1] & 0x40A40000) == 0) {
				Static114.anIntArray117[local54] = local7;
				Static459.anIntArray400[local54] = local9 - 1;
				Static624.anIntArrayArray56[local78][local74 - 1] = 1;
				local54 = local54 + 1 & 0xFFF;
				Static107.anIntArrayArray9[local78][local74 - 1] = local241;
			}
			if (local74 < 127 && Static624.anIntArrayArray56[local78][local74 + 1] == 0 && (local59[local89][local83 + 1] & 0x48240000) == 0) {
				Static114.anIntArray117[local54] = local7;
				Static459.anIntArray400[local54] = local9 + 1;
				local54 = local54 + 1 & 0xFFF;
				Static624.anIntArrayArray56[local78][local74 + 1] = 4;
				Static107.anIntArrayArray9[local78][local74 + 1] = local241;
			}
			if (local78 > 0 && local74 > 0 && Static624.anIntArrayArray56[local78 - 1][local74 - 1] == 0 && (local59[local89 - 1][local83 - 1] & 0x43A40000) == 0 && (local59[local89 - 1][local83] & 0x42240000) == 0 && (local59[local89][local83 - 1] & 0x40A40000) == 0) {
				Static114.anIntArray117[local54] = local7 - 1;
				Static459.anIntArray400[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static624.anIntArrayArray56[local78 - 1][local74 - 1] = 3;
				Static107.anIntArrayArray9[local78 - 1][local74 - 1] = local241;
			}
			if (local78 < 127 && local74 > 0 && Static624.anIntArrayArray56[local78 + 1][local74 - 1] == 0 && (local59[local89 + 1][local83 - 1] & 0x60E40000) == 0 && (local59[local89 + 1][local83] & 0x60240000) == 0 && (local59[local89][local83 - 1] & 0x40A40000) == 0) {
				Static114.anIntArray117[local54] = local7 + 1;
				Static459.anIntArray400[local54] = local9 - 1;
				Static624.anIntArrayArray56[local78 + 1][local74 - 1] = 9;
				local54 = local54 + 1 & 0xFFF;
				Static107.anIntArrayArray9[local78 + 1][local74 - 1] = local241;
			}
			if (local78 > 0 && local74 < 127 && Static624.anIntArrayArray56[local78 - 1][local74 + 1] == 0 && (local59[local89 - 1][local83 + 1] & 0x4E240000) == 0 && (local59[local89 - 1][local83] & 0x42240000) == 0 && (local59[local89][local83 + 1] & 0x48240000) == 0) {
				Static114.anIntArray117[local54] = local7 - 1;
				Static459.anIntArray400[local54] = local9 + 1;
				Static624.anIntArrayArray56[local78 - 1][local74 + 1] = 6;
				local54 = local54 + 1 & 0xFFF;
				Static107.anIntArrayArray9[local78 - 1][local74 + 1] = local241;
			}
			if (local78 < 127 && local74 < 127 && Static624.anIntArrayArray56[local78 + 1][local74 + 1] == 0 && (local59[local89 + 1][local83 + 1] & 0x78240000) == 0 && (local59[local89 + 1][local83] & 0x60240000) == 0 && (local59[local89][local83 + 1] & 0x48240000) == 0) {
				Static114.anIntArray117[local54] = local7 + 1;
				Static459.anIntArray400[local54] = local9 + 1;
				Static624.anIntArrayArray56[local78 + 1][local74 + 1] = 12;
				local54 = local54 + 1 & 0xFFF;
				Static107.anIntArrayArray9[local78 + 1][local74 + 1] = local241;
			}
		}
		Static168.anInt3083 = local9;
		Static246.anInt4348 = local7;
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IFIBFFII)[F")
	public static float[] method6825(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local6[4] = 1.0F;
		local6[0] = local17;
		local6[2] = local25;
		local6[1] = 0.0F;
		local6[3] = 0.0F;
		local6[8] = local17;
		local6[6] = -local25;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		@Pc(75) float[] local75 = new float[9];
		@Pc(77) float local77 = 1.0F;
		@Pc(82) float local82 = (float) arg0 / 32767.0F;
		@Pc(84) float local84 = 0.0F;
		@Pc(88) float local88 = 1.0F - local82;
		@Pc(98) float local98 = -((float) Math.sqrt((double) (1.0F - local82 * local82)));
		@Pc(109) float local109 = (float) Math.sqrt((double) (arg2 * arg2 + arg6 * arg6));
		if (local109 == 0.0F && local82 == 0.0F) {
			local9 = local6;
		} else {
			if (local109 != 0.0F) {
				local77 = (float) -arg6 / local109;
				local84 = (float) arg2 / local109;
			}
			local75[2] = local88 * local84 * local77;
			local75[4] = local82;
			local75[5] = local77 * local98;
			local75[6] = local77 * local84 * local88;
			local75[0] = local82 + local88 * local77 * local77;
			local75[1] = local84 * local98;
			local75[7] = -local77 * local98;
			local75[8] = local88 * local84 * local84 + local82;
			local75[3] = -local84 * local98;
			local9[0] = local75[3] * local6[1] + local6[0] * local75[0] + local6[2] * local75[6];
			local9[1] = local75[1] * local6[0] + local75[4] * local6[1] + local75[7] * local6[2];
			local9[3] = local75[6] * local6[5] + local6[3] * local75[0] + local75[3] * local6[4];
			local9[2] = local6[1] * local75[5] + local6[0] * local75[2] + local6[2] * local75[8];
			local9[4] = local6[4] * local75[4] + local6[3] * local75[1] + local6[5] * local75[7];
			local9[5] = local6[5] * local75[8] + local75[5] * local6[4] + local75[2] * local6[3];
			local9[6] = local6[7] * local75[3] + local6[6] * local75[0] + local75[6] * local6[8];
			local9[7] = local6[6] * local75[1] + local75[4] * local6[7] + local6[8] * local75[7];
			local9[8] = local6[7] * local75[5] + local75[2] * local6[6] + local6[8] * local75[8];
		}
		local9[5] *= arg4;
		local9[8] *= arg1;
		local9[6] *= arg1;
		local9[1] *= arg3;
		local9[4] *= arg4;
		local9[2] *= arg3;
		local9[0] *= arg3;
		local9[7] *= arg1;
		local9[3] *= arg4;
		return local9;
	}
}
