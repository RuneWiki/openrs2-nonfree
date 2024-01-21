import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!c", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(18) int local18 = arg0.method861();
		if (local18 != 0) {
			this.method329(local18);
			return;
		}
		this.anIntArrayArray6 = new int[arg0.method861()][4];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray6.length; local29++) {
			this.anIntArrayArray6[local29][0] = arg0.method878();
			this.anIntArrayArray6[local29][1] = arg0.method861() << 4;
			this.anIntArrayArray6[local29][2] = arg0.method861() << 4;
			this.anIntArrayArray6[local29][3] = arg0.method861() << 4;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)V")
	private void method329(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray6 = new int[2][4];
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[1][1] = 4096;
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[1][0] = 4096;
			this.anIntArrayArray6[1][3] = 4096;
			this.anIntArrayArray6[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray6 = new int[8][4];
			this.anIntArrayArray6[0][1] = 2650;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][2] = 2602;
			this.anIntArrayArray6[1][2] = 1799;
			this.anIntArrayArray6[2][2] = 1734;
			this.anIntArrayArray6[3][2] = 1220;
			this.anIntArrayArray6[1][0] = 2867;
			this.anIntArrayArray6[0][3] = 2361;
			this.anIntArrayArray6[1][3] = 1558;
			this.anIntArrayArray6[1][1] = 2313;
			this.anIntArrayArray6[2][0] = 3072;
			this.anIntArrayArray6[4][2] = 963;
			this.anIntArrayArray6[5][2] = 2152;
			this.anIntArrayArray6[3][0] = 3276;
			this.anIntArrayArray6[2][3] = 1413;
			this.anIntArrayArray6[2][1] = 2618;
			this.anIntArrayArray6[4][0] = 3481;
			this.anIntArrayArray6[5][0] = 3686;
			this.anIntArrayArray6[3][3] = 947;
			this.anIntArrayArray6[4][3] = 722;
			this.anIntArrayArray6[6][2] = 1060;
			this.anIntArrayArray6[3][1] = 2296;
			this.anIntArrayArray6[7][2] = 1413;
			this.anIntArrayArray6[5][3] = 1766;
			this.anIntArrayArray6[4][1] = 2072;
			this.anIntArrayArray6[6][0] = 3891;
			this.anIntArrayArray6[5][1] = 2730;
			this.anIntArrayArray6[6][3] = 915;
			this.anIntArrayArray6[7][0] = 4096;
			this.anIntArrayArray6[6][1] = 2232;
			this.anIntArrayArray6[7][1] = 1686;
			this.anIntArrayArray6[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray6 = new int[7][4];
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[0][3] = 4096;
			this.anIntArrayArray6[1][0] = 663;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[2][0] = 1363;
			this.anIntArrayArray6[1][1] = 0;
			this.anIntArrayArray6[2][2] = 4096;
			this.anIntArrayArray6[2][1] = 0;
			this.anIntArrayArray6[1][3] = 4096;
			this.anIntArrayArray6[3][2] = 4096;
			this.anIntArrayArray6[3][0] = 2048;
			this.anIntArrayArray6[2][3] = 0;
			this.anIntArrayArray6[3][3] = 0;
			this.anIntArrayArray6[4][0] = 2727;
			this.anIntArrayArray6[4][3] = 0;
			this.anIntArrayArray6[5][0] = 3411;
			this.anIntArrayArray6[4][2] = 0;
			this.anIntArrayArray6[6][0] = 4096;
			this.anIntArrayArray6[5][2] = 0;
			this.anIntArrayArray6[6][2] = 0;
			this.anIntArrayArray6[3][1] = 4096;
			this.anIntArrayArray6[5][3] = 4096;
			this.anIntArrayArray6[4][1] = 4096;
			this.anIntArrayArray6[6][3] = 4096;
			this.anIntArrayArray6[5][1] = 4096;
			this.anIntArrayArray6[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray6 = new int[6][4];
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[1][0] = 1843;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[2][0] = 2457;
			this.anIntArrayArray6[1][1] = 0;
			this.anIntArrayArray6[3][0] = 2781;
			this.anIntArrayArray6[1][2] = 0;
			this.anIntArrayArray6[2][1] = 0;
			this.anIntArrayArray6[4][0] = 3481;
			this.anIntArrayArray6[2][2] = 0;
			this.anIntArrayArray6[3][1] = 0;
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[3][2] = 1124;
			this.anIntArrayArray6[4][1] = 546;
			this.anIntArrayArray6[5][0] = 4096;
			this.anIntArrayArray6[4][2] = 3084;
			this.anIntArrayArray6[5][1] = 4096;
			this.anIntArrayArray6[5][2] = 4096;
			this.anIntArrayArray6[1][3] = 1493;
			this.anIntArrayArray6[2][3] = 2939;
			this.anIntArrayArray6[3][3] = 3565;
			this.anIntArrayArray6[4][3] = 4031;
			this.anIntArrayArray6[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray6 = new int[16][4];
			this.anIntArrayArray6[0][3] = 321;
			this.anIntArrayArray6[0][1] = 80;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[1][1] = 321;
			this.anIntArrayArray6[0][2] = 192;
			this.anIntArrayArray6[2][1] = 578;
			this.anIntArrayArray6[1][3] = 562;
			this.anIntArrayArray6[2][3] = 803;
			this.anIntArrayArray6[1][0] = 155;
			this.anIntArrayArray6[3][1] = 947;
			this.anIntArrayArray6[1][2] = 449;
			this.anIntArrayArray6[4][1] = 1285;
			this.anIntArrayArray6[5][1] = 1525;
			this.anIntArrayArray6[6][1] = 1734;
			this.anIntArrayArray6[3][3] = 1140;
			this.anIntArrayArray6[2][2] = 690;
			this.anIntArrayArray6[7][1] = 1413;
			this.anIntArrayArray6[3][2] = 995;
			this.anIntArrayArray6[2][0] = 389;
			this.anIntArrayArray6[4][2] = 1397;
			this.anIntArrayArray6[4][3] = 1509;
			this.anIntArrayArray6[5][2] = 1429;
			this.anIntArrayArray6[3][0] = 671;
			this.anIntArrayArray6[4][0] = 897;
			this.anIntArrayArray6[8][1] = 1108;
			this.anIntArrayArray6[5][3] = 1413;
			this.anIntArrayArray6[6][3] = 1333;
			this.anIntArrayArray6[6][2] = 1461;
			this.anIntArrayArray6[5][0] = 1175;
			this.anIntArrayArray6[9][1] = 1766;
			this.anIntArrayArray6[7][2] = 1525;
			this.anIntArrayArray6[6][0] = 1368;
			this.anIntArrayArray6[7][3] = 1702;
			this.anIntArrayArray6[8][2] = 1590;
			this.anIntArrayArray6[8][3] = 2056;
			this.anIntArrayArray6[10][1] = 2409;
			this.anIntArrayArray6[9][2] = 2056;
			this.anIntArrayArray6[11][1] = 3116;
			this.anIntArrayArray6[10][2] = 2586;
			this.anIntArrayArray6[11][2] = 3148;
			this.anIntArrayArray6[9][3] = 2666;
			this.anIntArrayArray6[12][2] = 3710;
			this.anIntArrayArray6[13][2] = 3421;
			this.anIntArrayArray6[14][2] = 3148;
			this.anIntArrayArray6[10][3] = 3276;
			this.anIntArrayArray6[11][3] = 3228;
			this.anIntArrayArray6[12][3] = 3196;
			this.anIntArrayArray6[13][3] = 3019;
			this.anIntArrayArray6[7][0] = 1507;
			this.anIntArrayArray6[14][3] = 3228;
			this.anIntArrayArray6[15][2] = 2505;
			this.anIntArrayArray6[12][1] = 3806;
			this.anIntArrayArray6[8][0] = 1736;
			this.anIntArrayArray6[9][0] = 2088;
			this.anIntArrayArray6[15][3] = 2746;
			this.anIntArrayArray6[10][0] = 2355;
			this.anIntArrayArray6[13][1] = 3437;
			this.anIntArrayArray6[11][0] = 2691;
			this.anIntArrayArray6[14][1] = 3116;
			this.anIntArrayArray6[12][0] = 3031;
			this.anIntArrayArray6[15][1] = 2377;
			this.anIntArrayArray6[13][0] = 3522;
			this.anIntArrayArray6[14][0] = 3727;
			this.anIntArrayArray6[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray6 = new int[4][4];
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[1][3] = 0;
			this.anIntArrayArray6[1][1] = 4096;
			this.anIntArrayArray6[0][0] = 2048;
			this.anIntArrayArray6[2][3] = 0;
			this.anIntArrayArray6[1][0] = 2867;
			this.anIntArrayArray6[3][3] = 0;
			this.anIntArrayArray6[0][2] = 4096;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[2][2] = 4096;
			this.anIntArrayArray6[2][0] = 3276;
			this.anIntArrayArray6[3][0] = 4096;
			this.anIntArrayArray6[3][2] = 0;
			this.anIntArrayArray6[2][1] = 4096;
			this.anIntArrayArray6[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
	@Override
	public void method3125() {
		if (this.anIntArrayArray6 == null) {
			this.method329(1);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(27) int local27 = this.anIntArrayArray6.length;
			@Pc(33) int[] local33 = this.method3130(0, arg0);
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[0];
			@Pc(45) int[] local45 = local19[2];
			@Pc(52) int local52;
			if (local27 > 0) {
				for (local52 = 0; local52 < Static110.anInt2825; local52++) {
					@Pc(56) int local56 = 0;
					@Pc(60) int local60 = local33[local52];
					for (@Pc(62) int local62 = 0; local62 < local27 && this.anIntArrayArray6[local62][0] <= local60; local62++) {
						local56++;
					}
					@Pc(89) int[] local89;
					if (local56 < local27) {
						local89 = this.anIntArrayArray6[local56];
						if (local56 > 0) {
							@Pc(101) int[] local101 = this.anIntArrayArray6[local56 - 1];
							@Pc(119) int local119 = (local60 - local101[0] << 12) / (local89[0] - local101[0]);
							@Pc(124) int local124 = 4096 - local119;
							local41[local52] = local89[1] * local119 + local124 * local101[1] >> 12;
							local37[local52] = local124 * local101[2] + local119 * local89[2] >> 12;
							local45[local52] = local119 * local89[3] + local101[3] * local124 >> 12;
						} else {
							local41[local52] = local89[1];
							local37[local52] = local89[2];
							local45[local52] = local89[3];
						}
					} else {
						local89 = this.anIntArrayArray6[local27 - 1];
						local41[local52] = local89[1];
						local37[local52] = local89[2];
						local45[local52] = local89[3];
					}
				}
			} else {
				for (local52 = 0; local52 < Static110.anInt2825; local52++) {
					local41[local52] = 0;
					local37[local52] = 0;
					local45[local52] = 0;
				}
			}
		}
		return local19;
	}
}
