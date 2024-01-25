import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_283 = new Class123(8, 6);

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_140 = new Class287(43, 3);

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "J")
	public static long aLong233 = -1L;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public static void method6936() {
		if (Static133.anIntArray113 != null) {
			return;
		}
		Static133.anIntArray113 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(41) float local41 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(50) float local50 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
				@Pc(59) float local59 = (float) local52 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local41 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(82) float local82 = (float) -local72 + local69;
				@Pc(89) float local89 = (1.0F - local50) * local59;
				@Pc(98) float local98 = (1.0F - local50 * local82) * local59;
				@Pc(110) float local110 = local59 * (1.0F - local50 * (1.0F - local82));
				if (local76 == 0) {
					local65 = local89;
					local61 = local59;
					local63 = local110;
				} else if (local76 == 1) {
					local61 = local98;
					local65 = local89;
					local63 = local59;
				} else if (local76 == 2) {
					local61 = local89;
					local65 = local110;
					local63 = local59;
				} else if (local76 == 3) {
					local61 = local89;
					local65 = local59;
					local63 = local98;
				} else if (local76 == 4) {
					local65 = local59;
					local63 = local89;
					local61 = local110;
				} else if (local76 == 5) {
					local61 = local59;
					local65 = local98;
					local63 = local89;
				}
				local61 = (float) Math.pow((double) local61, local19);
				local63 = (float) Math.pow((double) local63, local19);
				local65 = (float) Math.pow((double) local65, local19);
				@Pc(202) int local202 = (int) (local61 * 256.0F);
				@Pc(207) int local207 = (int) (local63 * 256.0F);
				@Pc(212) int local212 = (int) (local65 * 256.0F);
				@Pc(226) int local226 = (local207 << 8) + ((local202 << 16) + local212 - 16777216);
				Static133.anIntArray113[local21++] = local226;
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!r;Z)V")
	public static void method6938(@OriginalArg(0) Class31 arg0) {
		@Pc(7) int local7 = Static89.anInt2311;
		@Pc(9) int local9 = Static111.anInt2680;
		@Pc(11) int local11 = Static240.anInt4751;
		@Pc(13) int local13 = Static126.anInt2888;
		arg0.method8094(local9, local7, local13, local11, -10660793);
		arg0.method8094(local9 + 1, local7 + 1, 16, local11 - 2, -16777216);
		arg0.method8084(-16777216, local13 - 19, local11 + -2, local7 + 1, local9 + 18);
		Static465.aClass63_10.method6881(Static573.aClass350_28.method7730(Static201.anInt4321), -1, local7 + 3, -10660793, local9 + 14);
		@Pc(72) int local72 = Static234.aClass54_4.method7306();
		@Pc(76) int local76 = Static234.aClass54_4.method7315();
		@Pc(78) int local78 = 0;
		for (@Pc(83) Class3_Sub13 local83 = (Class3_Sub13) Static260.aClass244_40.method5572(); local83 != null; local83 = (Class3_Sub13) Static260.aClass244_40.method5576()) {
			@Pc(98) int local98 = (Static161.anInt3613 - local78 - 1) * 16 + local9 + 31;
			@Pc(100) short local100 = -1;
			if (local72 > local7 && local72 < local11 + local7 && local98 - 13 < local76 && local76 < local98 + 3 && local83.aBoolean173) {
				local100 = -256;
			}
			@Pc(133) int[] local133 = null;
			if (Static549.method7512(local83.anInt2364)) {
				local133 = Static272.aClass121_2.method3327((int) local83.aLong42).anIntArray199;
			} else if (local83.anInt2365 != -1) {
				local133 = Static272.aClass121_2.method3327(local83.anInt2365).anIntArray199;
			} else if (Static55.method6551(local83.anInt2364)) {
				@Pc(220) Class3_Sub39 local220 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local83.aLong42);
				if (local220 != null) {
					@Pc(225) Class25_Sub2_Sub2_Sub5_Sub2 local225 = local220.aClass25_Sub2_Sub2_Sub5_Sub2_2;
					@Pc(228) Class213 local228 = local225.aClass213_1;
					if (local228.anIntArray345 != null) {
						local228 = local228.method4998(Static206.aClass143_3);
					}
					if (local228 != null) {
						local133 = local228.anIntArray347;
					}
				}
			} else if (Static343.method5003(local83.anInt2364)) {
				@Pc(189) Class194 local189;
				if (local83.anInt2364 == 1002) {
					local189 = Static536.aClass146_4.method3721((int) local83.aLong42);
				} else {
					local189 = Static536.aClass146_4.method3721((int) (local83.aLong42 >>> 32 & 0x7FFFFFFFL));
				}
				if (local189.anIntArray286 != null) {
					local189 = local189.method4696(Static206.aClass143_3);
				}
				if (local189 != null) {
					local133 = local189.anIntArray284;
				}
			}
			@Pc(245) String local245 = Static585.method7963(local83);
			if (local133 != null) {
				local245 = local245 + Static291.method4365(local133);
			}
			Static465.aClass63_10.method6877(local245, local100, local98, Static147.aClass73Array5, local7 + 3, Static93.anIntArray79);
			local78++;
			if (local83.aBoolean172) {
				Static34.aClass73_9.method7957(Static35.aClass328_1.method7371(local245) + local7 + 5, local98 + -12);
			}
		}
		Static303.method4583(Static111.anInt2680, Static240.anInt4751, Static126.anInt2888, Static89.anInt2311);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)I")
	public static int method6939(@OriginalArg(0) boolean arg0) {
		if (Static294.anIntArray262 == null) {
			return 0;
		} else if (arg0 || Static298.aClass346Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static294.anIntArray262.length; local22++) {
				@Pc(28) int local28 = Static294.anIntArray262[local22];
				if (Static537.aClass284_152.method6347(local28)) {
					local20++;
				}
				if (Static451.aClass284_127.method6347(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static294.anIntArray262.length * 2;
		}
	}
}
