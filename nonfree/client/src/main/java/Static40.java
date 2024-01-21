import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	public static int anInt844 = 1;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_291 = Static161.method2452("Sprites geladen)3");

	@OriginalMember(owner = "client!di", name = "g", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_293 = Static161.method2452("Location");

	@OriginalMember(owner = "client!di", name = "c", descriptor = "Lclient!dc;")
	public static Class20 aClass20_292 = aClass20_293;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	public static volatile int anInt846 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([BI)V")
	public static void method690(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = Static68.anInt1481 >> 2 << 10;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = Static123.anInt2610 >> 1;
		@Pc(26) byte[][] local26 = new byte[Static131.anInt2727][Static165.anInt2257];
		while (true) {
			@Pc(40) int local40;
			@Pc(52) int local52;
			while (local18 < arg0.length) {
				local40 = (arg0[local18++] & 0xFF) * 64 - Static207.anInt4070;
				local52 = (arg0[local18++] & 0xFF) * 64 - Static59.anInt1331;
				if (local40 > 0 && local52 > 0 && local40 + 64 < Static131.anInt2727 && Static165.anInt2257 > local52 + 64) {
					for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
						@Pc(77) int local77 = Static165.anInt2257 - local52 - 1;
						@Pc(83) byte[] local83 = local26[local40 + local68];
						for (@Pc(85) int local85 = -64; local85 < 0; local85++) {
							local83[local77--] = arg0[local18++];
						}
					}
				} else {
					local18 += 4096;
				}
			}
			local40 = Static131.anInt2727;
			local52 = Static165.anInt2257;
			@Pc(119) int[] local119 = new int[local52];
			@Pc(122) int[] local122 = new int[local52];
			@Pc(125) int[] local125 = new int[local52];
			@Pc(128) int[] local128 = new int[local52];
			@Pc(131) int[] local131 = new int[local52];
			for (@Pc(133) int local133 = -5; local133 < local40; local133++) {
				@Pc(158) int local158;
				@Pc(225) int local225;
				for (@Pc(137) int local137 = 0; local137 < local52; local137++) {
					@Pc(143) int local143 = local133 + 5;
					@Pc(205) int local205;
					if (local143 < local40) {
						local158 = local26[local143][local137] & 0xFF;
						if (local158 > 0) {
							@Pc(169) Class5_Sub2_Sub24 local169 = Static52.method914(local158 - 1);
							local119[local137] += local169.anInt3823;
							local122[local137] += local169.anInt3829;
							local125[local137] += local169.anInt3824;
							local128[local137] += local169.anInt3827;
							local205 = local131[local137]++;
						}
					}
					local158 = local133 - 5;
					if (local158 >= 0) {
						local225 = local26[local158][local137] & 0xFF;
						if (local225 > 0) {
							@Pc(233) Class5_Sub2_Sub24 local233 = Static52.method914(local225 - 1);
							local119[local137] -= local233.anInt3823;
							local122[local137] -= local233.anInt3829;
							local125[local137] -= local233.anInt3824;
							local128[local137] -= local233.anInt3827;
							local205 = local131[local137]--;
						}
					}
				}
				if (local133 >= 0) {
					@Pc(287) int[][] local287 = Static207.anIntArrayArrayArray13[local133 >> 6];
					local158 = 0;
					@Pc(291) int local291 = 0;
					local225 = 0;
					@Pc(295) int local295 = 0;
					@Pc(297) int local297 = 0;
					for (@Pc(299) int local299 = -5; local299 < local52; local299++) {
						@Pc(305) int local305 = local299 + 5;
						if (local305 < local52) {
							local295 += local128[local305];
							local158 += local119[local305];
							local225 += local122[local305];
							local297 += local131[local305];
							local291 += local125[local305];
						}
						@Pc(342) int local342 = local299 - 5;
						if (local342 >= 0) {
							local158 -= local119[local342];
							local225 -= local122[local342];
							local291 -= local125[local342];
							local295 -= local128[local342];
							local297 -= local131[local342];
						}
						if (local299 >= 0 && local297 > 0) {
							@Pc(388) int local388 = local299 >> 6;
							@Pc(409) int local409 = local295 == 0 ? 0 : Static125.method1967(local291 / local297, local158 * 256 / local295, local225 / local297);
							if (local26[local133][local299] != 0) {
								if (local287[local388] == null) {
									local287[local388] = Static207.anIntArrayArrayArray13[local133 >> 6][local388] = new int[4096];
								}
								@Pc(462) int local462 = local22 + (local409 & 0x7F);
								if (local462 < 0) {
									local462 = 0;
								} else if (local462 > 127) {
									local462 = 127;
								}
								@Pc(491) int local491 = (local409 & 0x380) + (local409 + local11 & 0xFC00) + local462;
								local287[local388][((local299 & 0x3F) << 6) + (local133 & 0x3F)] = Static149.anIntArray328[Static33.method546(96, local491)];
							} else if (local287[local388] != null) {
								local287[local388][((local299 & 0x3F) << 6) + (local133 & 0x3F)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)Z")
	public static boolean method691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static186.anIntArrayArrayArray10[arg0][arg1][arg2];
		if (local7 == -Static144.anInt2996) {
			return false;
		} else if (local7 == Static144.anInt2996) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static191.method2853(local22 + 1, Static37.anIntArrayArrayArray5[arg0][arg1][arg2], local26 + 1) && Static191.method2853(local22 + 128 - 1, Static37.anIntArrayArrayArray5[arg0][arg1 + 1][arg2], local26 + 1) && Static191.method2853(local22 + 128 - 1, Static37.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static191.method2853(local22 + 1, Static37.anIntArrayArrayArray5[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static186.anIntArrayArrayArray10[arg0][arg1][arg2] = Static144.anInt2996;
				return true;
			} else {
				Static186.anIntArrayArrayArray10[arg0][arg1][arg2] = -Static144.anInt2996;
				return false;
			}
		}
	}
}
