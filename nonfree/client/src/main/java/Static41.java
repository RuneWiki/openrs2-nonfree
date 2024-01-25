import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "I")
	public static int anInt656 = -1;

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "I")
	public static int anInt659 = 0;

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V")
	public static void method673() {
		for (@Pc(5) int local5 = 0; local5 < Static264.anInt4916; local5++) {
			Static600.aClass393Array2[local5] = null;
		}
		Static264.anInt4916 = 0;
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(31) int local31 = 0; local31 < Static59.anInt987; local31++) {
			for (local34 = 0; local34 < Static654.anInt10715; local34++) {
				for (local37 = 0; local37 < Static180.anInt2928; local37++) {
					@Pc(46) Class89 local46 = Static63.aClass89ArrayArrayArray1[local31][local37][local34];
					if (local46 != null) {
						if (local46.aShort6 > 0) {
							local46.aShort6 = (short) (local46.aShort6 * -1);
						}
						if (local46.aShort7 > 0) {
							local46.aShort7 = (short) (local46.aShort7 * -1);
						}
					}
				}
			}
		}
		for (local34 = 0; local34 < Static59.anInt987; local34++) {
			for (local37 = 0; local37 < Static654.anInt10715; local37++) {
				for (@Pc(101) int local101 = 0; local101 < Static180.anInt2928; local101++) {
					@Pc(110) Class89 local110 = Static63.aClass89ArrayArrayArray1[local34][local101][local37];
					if (local110 != null) {
						@Pc(138) boolean local138 = Static63.aClass89ArrayArrayArray1[0][local101][local37] != null && Static63.aClass89ArrayArrayArray1[0][local101][local37].aClass89_1 != null;
						@Pc(146) int local146;
						@Pc(148) int local148;
						@Pc(162) Class89 local162;
						@Pc(172) int local172;
						@Pc(348) int local348;
						@Pc(363) int local363;
						@Pc(370) int local370;
						@Pc(387) int local387;
						@Pc(394) int local394;
						@Pc(398) int local398;
						@Pc(402) int local402;
						@Pc(408) int local408;
						@Pc(449) int local449;
						@Pc(452) int local452;
						if (local110.aShort6 < 0) {
							local146 = local37;
							local148 = local37;
							local162 = Static63.aClass89ArrayArrayArray1[local34][local101][local37 - 1];
							local172 = Static445.aClass159Array3[local34].method8207(local37, local101);
							while (local146 > 0 && local162 != null && local162.aShort6 < 0 && local110.aShort6 == local162.aShort6 && local162.aShort9 == local110.aShort9 && Static445.aClass159Array3[local34].method8207(local146 - 1, local101) == local172 && (local146 - 1 <= 0 || local172 == Static445.aClass159Array3[local34].method8207(local146 - 2, local101))) {
								local146--;
								local162 = Static63.aClass89ArrayArrayArray1[local34][local101][local146 - 1];
							}
							for (local162 = Static63.aClass89ArrayArrayArray1[local34][local101][local37 + 1]; Static180.anInt2928 > local148 && local162 != null && local162.aShort6 < 0 && local110.aShort6 == local162.aShort6 && local162.aShort9 == local110.aShort9 && Static445.aClass159Array3[local34].method8207(local148 + 1, local101) == local172 && (local148 + 1 >= Static180.anInt2928 || local172 == Static445.aClass159Array3[local34].method8207(local148 + 2, local101)); local162 = Static63.aClass89ArrayArrayArray1[local34][local101][local148 + 1]) {
								local148++;
							}
							local348 = local34 + 1 - local34;
							local363 = Static445.aClass159Array3[local138 ? local34 + 1 : local34].method8207(local146, local101);
							local370 = local110.aShort6 * local348 + local363;
							local387 = Static445.aClass159Array3[local138 ? local34 + 1 : local34].method8207(local148 + 1, local101);
							local394 = local110.aShort6 * local348 + local387;
							local398 = local101 << Static110.anInt1858;
							local402 = local146 << Static110.anInt1858;
							local408 = Static391.anInt6813 + (local148 << Static110.anInt1858);
							Static600.aClass393Array2[Static264.anInt4916++] = new Class393(1, local34, local398 + local110.aShort9, local110.aShort9 + local398, local398 + local110.aShort9, local398 - -local110.aShort9, local363, local387, local394, local370, local402, local408, local408, local402);
							for (local449 = local34; local449 <= local34; local449++) {
								for (local452 = local146; local452 <= local148; local452++) {
									Static63.aClass89ArrayArrayArray1[local449][local101][local452].aShort6 = (short) (Static63.aClass89ArrayArrayArray1[local449][local101][local452].aShort6 * -1);
								}
							}
						}
						if (local110.aShort7 < 0) {
							local146 = local101;
							local148 = local101;
							local162 = Static63.aClass89ArrayArrayArray1[local34][local101 - 1][local37];
							local172 = Static445.aClass159Array3[local34].method8207(local37, local101);
							while (local146 > 0 && local162 != null && local162.aShort7 < 0 && local110.aShort7 == local162.aShort7 && local110.aShort8 == local162.aShort8 && Static445.aClass159Array3[local34].method8207(local37, local146 - 1) == local172 && (local146 - 1 <= 0 || Static445.aClass159Array3[local34].method8207(local37, local146 - 2) == local172)) {
								local146--;
								local162 = Static63.aClass89ArrayArrayArray1[local34][local146 - 1][local37];
							}
							for (local162 = Static63.aClass89ArrayArrayArray1[local34][local101 + 1][local37]; Static654.anInt10715 > local148 && local162 != null && local162.aShort7 < 0 && local110.aShort7 == local162.aShort7 && local162.aShort8 == local110.aShort8 && local172 == Static445.aClass159Array3[local34].method8207(local37, local148 + 1) && (Static654.anInt10715 <= local148 + 1 || local172 == Static445.aClass159Array3[local34].method8207(local37, local148 + 2)); local162 = Static63.aClass89ArrayArrayArray1[local34][local148 + 1][local37]) {
								local148++;
							}
							local348 = local34 + 1 - local34;
							local363 = Static445.aClass159Array3[local138 ? local34 + 1 : local34].method8207(local37, local146);
							local370 = local110.aShort7 * local348 + local363;
							local387 = Static445.aClass159Array3[local138 ? local34 + 1 : local34].method8207(local37, local148 + 1);
							local394 = local387 + local110.aShort7 * local348;
							local398 = local146 << Static110.anInt1858;
							local402 = Static391.anInt6813 + (local148 << Static110.anInt1858);
							local408 = local37 << Static110.anInt1858;
							Static600.aClass393Array2[Static264.anInt4916++] = new Class393(2, local34, local398, local402, local402, local398, local363, local387, local394, local370, local408 + local110.aShort8, local110.aShort8 + local408, local408 + local110.aShort8, local110.aShort8 + local408);
							for (local449 = local34; local449 <= local34; local449++) {
								for (local452 = local146; local452 <= local148; local452++) {
									Static63.aClass89ArrayArrayArray1[local449][local452][local37].aShort7 = (short) (Static63.aClass89ArrayArrayArray1[local449][local452][local37].aShort7 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static508.aBoolean622 = true;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
	public static void method674() {
		if (Static302.anIntArray299 != null) {
			return;
		}
		Static302.anIntArray299 = new int[65536];
		@Pc(18) double local18 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(20) int local20 = 0; local20 < 65536; local20++) {
			@Pc(32) double local32 = (double) (local20 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(43) double local43 = (double) (local20 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(50) double local50 = (double) (local20 & 0x7F) / 128.0D;
			@Pc(52) double local52 = local50;
			@Pc(54) double local54 = local50;
			@Pc(56) double local56 = local50;
			if (local43 != 0.0D) {
				@Pc(72) double local72;
				if (local50 < 0.5D) {
					local72 = local50 * (local43 + 1.0D);
				} else {
					local72 = local50 + local43 - local43 * local50;
				}
				@Pc(89) double local89 = local50 * 2.0D - local72;
				@Pc(93) double local93 = local32 + 0.3333333333333333D;
				if (local93 > 1.0D) {
					local93--;
				}
				@Pc(107) double local107 = local32 - 0.3333333333333333D;
				if (local32 * 6.0D < 1.0D) {
					local54 = local89 + (local72 - local89) * 6.0D * local32;
				} else if (local32 * 2.0D < 1.0D) {
					local54 = local72;
				} else if (local32 * 3.0D < 2.0D) {
					local54 = (0.6666666666666666D - local32) * 6.0D * (local72 - local89) + local89;
				} else {
					local54 = local89;
				}
				if (local107 < 0.0D) {
					local107++;
				}
				if (local93 * 6.0D < 1.0D) {
					local52 = local89 + (local72 - local89) * 6.0D * local93;
				} else if (local93 * 2.0D < 1.0D) {
					local52 = local72;
				} else if (local93 * 3.0D < 2.0D) {
					local52 = local89 + (local72 - local89) * 6.0D * (0.6666666666666666D - local93);
				} else {
					local52 = local89;
				}
				if (local107 * 6.0D < 1.0D) {
					local56 = local89 + local107 * (local72 - local89) * 6.0D;
				} else if (local107 * 2.0D < 1.0D) {
					local56 = local72;
				} else if (local107 * 3.0D < 2.0D) {
					local56 = (0.6666666666666666D - local107) * 6.0D * (local72 - local89) + local89;
				} else {
					local56 = local89;
				}
			}
			local52 = Math.pow(local52, local18);
			local54 = Math.pow(local54, local18);
			local56 = Math.pow(local56, local18);
			@Pc(282) int local282 = (int) (local52 * 256.0D);
			@Pc(287) int local287 = (int) (local54 * 256.0D);
			@Pc(292) int local292 = (int) (local56 * 256.0D);
			@Pc(302) int local302 = local292 + (local287 << 8) + (local282 << 16);
			Static302.anIntArray299[local20] = local302;
		}
	}
}
