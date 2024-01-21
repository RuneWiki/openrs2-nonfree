import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!da", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(21) int local21 = arg1.method1234();
		if (local21 != 0) {
			this.method820(local21);
			return;
		}
		this.anIntArrayArray10 = new int[arg1.method1234()][4];
		for (@Pc(40) int local40 = 0; local40 < this.anIntArrayArray10.length; local40++) {
			this.anIntArrayArray10[local40][0] = arg1.method1280();
			this.anIntArrayArray10[local40][1] = arg1.method1234() << 4;
			this.anIntArrayArray10[local40][2] = arg1.method1234() << 4;
			this.anIntArrayArray10[local40][3] = arg1.method1234() << 4;
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
		if (this.anIntArrayArray10 == null) {
			this.method820(1);
		}
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(II)V")
	private void method820(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray10 = new int[2][4];
			this.anIntArrayArray10[0][3] = 0;
			this.anIntArrayArray10[0][1] = 0;
			this.anIntArrayArray10[0][0] = 0;
			this.anIntArrayArray10[0][2] = 0;
			this.anIntArrayArray10[1][0] = 4096;
			this.anIntArrayArray10[1][2] = 4096;
			this.anIntArrayArray10[1][3] = 4096;
			this.anIntArrayArray10[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray10 = new int[8][4];
			this.anIntArrayArray10[0][1] = 2650;
			this.anIntArrayArray10[0][3] = 2361;
			this.anIntArrayArray10[1][3] = 1558;
			this.anIntArrayArray10[0][0] = 0;
			this.anIntArrayArray10[2][3] = 1413;
			this.anIntArrayArray10[1][1] = 2313;
			this.anIntArrayArray10[1][0] = 2867;
			this.anIntArrayArray10[2][0] = 3072;
			this.anIntArrayArray10[3][0] = 3276;
			this.anIntArrayArray10[2][1] = 2618;
			this.anIntArrayArray10[3][1] = 2296;
			this.anIntArrayArray10[0][2] = 2602;
			this.anIntArrayArray10[1][2] = 1799;
			this.anIntArrayArray10[4][1] = 2072;
			this.anIntArrayArray10[4][0] = 3481;
			this.anIntArrayArray10[3][3] = 947;
			this.anIntArrayArray10[2][2] = 1734;
			this.anIntArrayArray10[3][2] = 1220;
			this.anIntArrayArray10[5][0] = 3686;
			this.anIntArrayArray10[6][0] = 3891;
			this.anIntArrayArray10[5][1] = 2730;
			this.anIntArrayArray10[4][3] = 722;
			this.anIntArrayArray10[7][0] = 4096;
			this.anIntArrayArray10[4][2] = 963;
			this.anIntArrayArray10[5][3] = 1766;
			this.anIntArrayArray10[6][1] = 2232;
			this.anIntArrayArray10[6][3] = 915;
			this.anIntArrayArray10[5][2] = 2152;
			this.anIntArrayArray10[7][1] = 1686;
			this.anIntArrayArray10[7][3] = 1140;
			this.anIntArrayArray10[6][2] = 1060;
			this.anIntArrayArray10[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray10 = new int[7][4];
			this.anIntArrayArray10[0][2] = 0;
			this.anIntArrayArray10[1][2] = 4096;
			this.anIntArrayArray10[2][2] = 4096;
			this.anIntArrayArray10[0][1] = 0;
			this.anIntArrayArray10[3][2] = 4096;
			this.anIntArrayArray10[4][2] = 0;
			this.anIntArrayArray10[0][0] = 0;
			this.anIntArrayArray10[0][3] = 4096;
			this.anIntArrayArray10[5][2] = 0;
			this.anIntArrayArray10[6][2] = 0;
			this.anIntArrayArray10[1][0] = 663;
			this.anIntArrayArray10[1][3] = 4096;
			this.anIntArrayArray10[2][3] = 0;
			this.anIntArrayArray10[1][1] = 0;
			this.anIntArrayArray10[3][3] = 0;
			this.anIntArrayArray10[2][1] = 0;
			this.anIntArrayArray10[4][3] = 0;
			this.anIntArrayArray10[3][1] = 4096;
			this.anIntArrayArray10[4][1] = 4096;
			this.anIntArrayArray10[5][3] = 4096;
			this.anIntArrayArray10[6][3] = 4096;
			this.anIntArrayArray10[5][1] = 4096;
			this.anIntArrayArray10[6][1] = 0;
			this.anIntArrayArray10[2][0] = 1363;
			this.anIntArrayArray10[3][0] = 2048;
			this.anIntArrayArray10[4][0] = 2727;
			this.anIntArrayArray10[5][0] = 3411;
			this.anIntArrayArray10[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray10 = new int[6][4];
			this.anIntArrayArray10[0][1] = 0;
			this.anIntArrayArray10[1][1] = 0;
			this.anIntArrayArray10[0][0] = 0;
			this.anIntArrayArray10[0][2] = 0;
			this.anIntArrayArray10[1][2] = 0;
			this.anIntArrayArray10[2][1] = 0;
			this.anIntArrayArray10[3][1] = 0;
			this.anIntArrayArray10[1][0] = 1843;
			this.anIntArrayArray10[4][1] = 546;
			this.anIntArrayArray10[2][0] = 2457;
			this.anIntArrayArray10[2][2] = 0;
			this.anIntArrayArray10[3][2] = 1124;
			this.anIntArrayArray10[4][2] = 3084;
			this.anIntArrayArray10[0][3] = 0;
			this.anIntArrayArray10[5][2] = 4096;
			this.anIntArrayArray10[5][1] = 4096;
			this.anIntArrayArray10[3][0] = 2781;
			this.anIntArrayArray10[4][0] = 3481;
			this.anIntArrayArray10[5][0] = 4096;
			this.anIntArrayArray10[1][3] = 1493;
			this.anIntArrayArray10[2][3] = 2939;
			this.anIntArrayArray10[3][3] = 3565;
			this.anIntArrayArray10[4][3] = 4031;
			this.anIntArrayArray10[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray10 = new int[16][4];
			this.anIntArrayArray10[0][3] = 321;
			this.anIntArrayArray10[0][2] = 192;
			this.anIntArrayArray10[1][3] = 562;
			this.anIntArrayArray10[1][2] = 449;
			this.anIntArrayArray10[0][0] = 0;
			this.anIntArrayArray10[2][3] = 803;
			this.anIntArrayArray10[2][2] = 690;
			this.anIntArrayArray10[3][2] = 995;
			this.anIntArrayArray10[3][3] = 1140;
			this.anIntArrayArray10[0][1] = 80;
			this.anIntArrayArray10[1][0] = 155;
			this.anIntArrayArray10[4][3] = 1509;
			this.anIntArrayArray10[1][1] = 321;
			this.anIntArrayArray10[5][3] = 1413;
			this.anIntArrayArray10[6][3] = 1333;
			this.anIntArrayArray10[2][1] = 578;
			this.anIntArrayArray10[4][2] = 1397;
			this.anIntArrayArray10[3][1] = 947;
			this.anIntArrayArray10[7][3] = 1702;
			this.anIntArrayArray10[2][0] = 389;
			this.anIntArrayArray10[3][0] = 671;
			this.anIntArrayArray10[8][3] = 2056;
			this.anIntArrayArray10[4][0] = 897;
			this.anIntArrayArray10[5][0] = 1175;
			this.anIntArrayArray10[9][3] = 2666;
			this.anIntArrayArray10[6][0] = 1368;
			this.anIntArrayArray10[5][2] = 1429;
			this.anIntArrayArray10[10][3] = 3276;
			this.anIntArrayArray10[6][2] = 1461;
			this.anIntArrayArray10[7][2] = 1525;
			this.anIntArrayArray10[8][2] = 1590;
			this.anIntArrayArray10[9][2] = 2056;
			this.anIntArrayArray10[4][1] = 1285;
			this.anIntArrayArray10[11][3] = 3228;
			this.anIntArrayArray10[5][1] = 1525;
			this.anIntArrayArray10[6][1] = 1734;
			this.anIntArrayArray10[7][1] = 1413;
			this.anIntArrayArray10[8][1] = 1108;
			this.anIntArrayArray10[9][1] = 1766;
			this.anIntArrayArray10[10][1] = 2409;
			this.anIntArrayArray10[12][3] = 3196;
			this.anIntArrayArray10[10][2] = 2586;
			this.anIntArrayArray10[13][3] = 3019;
			this.anIntArrayArray10[11][2] = 3148;
			this.anIntArrayArray10[11][1] = 3116;
			this.anIntArrayArray10[14][3] = 3228;
			this.anIntArrayArray10[12][2] = 3710;
			this.anIntArrayArray10[7][0] = 1507;
			this.anIntArrayArray10[12][1] = 3806;
			this.anIntArrayArray10[8][0] = 1736;
			this.anIntArrayArray10[15][3] = 2746;
			this.anIntArrayArray10[9][0] = 2088;
			this.anIntArrayArray10[13][1] = 3437;
			this.anIntArrayArray10[10][0] = 2355;
			this.anIntArrayArray10[11][0] = 2691;
			this.anIntArrayArray10[14][1] = 3116;
			this.anIntArrayArray10[12][0] = 3031;
			this.anIntArrayArray10[13][0] = 3522;
			this.anIntArrayArray10[14][0] = 3727;
			this.anIntArrayArray10[15][1] = 2377;
			this.anIntArrayArray10[13][2] = 3421;
			this.anIntArrayArray10[15][0] = 4096;
			this.anIntArrayArray10[14][2] = 3148;
			this.anIntArrayArray10[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray10 = new int[4][4];
			this.anIntArrayArray10[0][3] = 0;
			this.anIntArrayArray10[0][1] = 0;
			this.anIntArrayArray10[0][0] = 2048;
			this.anIntArrayArray10[1][0] = 2867;
			this.anIntArrayArray10[0][2] = 4096;
			this.anIntArrayArray10[1][3] = 0;
			this.anIntArrayArray10[1][1] = 4096;
			this.anIntArrayArray10[1][2] = 4096;
			this.anIntArrayArray10[2][3] = 0;
			this.anIntArrayArray10[2][2] = 4096;
			this.anIntArrayArray10[2][0] = 3276;
			this.anIntArrayArray10[3][3] = 0;
			this.anIntArrayArray10[3][2] = 0;
			this.anIntArrayArray10[3][0] = 4096;
			this.anIntArrayArray10[2][1] = 4096;
			this.anIntArrayArray10[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(19) int local19 = this.anIntArrayArray10.length;
			@Pc(25) int[] local25 = this.method3401(arg0, 0);
			@Pc(29) int[] local29 = local11[2];
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int local41;
			if (local19 <= 0) {
				for (local41 = 0; local41 < Static22.anInt596; local41++) {
					local33[local41] = 0;
					local37[local41] = 0;
					local29[local41] = 0;
				}
			} else {
				for (local41 = 0; local41 < Static22.anInt596; local41++) {
					@Pc(71) int local71 = 0;
					@Pc(75) int local75 = local25[local41];
					for (@Pc(77) int local77 = 0; local77 < local19 && this.anIntArrayArray10[local77][0] <= local75; local77++) {
						local71++;
					}
					@Pc(106) int[] local106;
					if (local71 >= local19) {
						local106 = this.anIntArrayArray10[local19 - 1];
						local33[local41] = local106[1];
						local37[local41] = local106[2];
						local29[local41] = local106[3];
					} else {
						local106 = this.anIntArrayArray10[local71];
						if (local71 <= 0) {
							local33[local41] = local106[1];
							local37[local41] = local106[2];
							local29[local41] = local106[3];
						} else {
							@Pc(160) int[] local160 = this.anIntArrayArray10[local71 - 1];
							@Pc(178) int local178 = (local75 - local160[0] << 12) / (local106[0] - local160[0]);
							@Pc(183) int local183 = 4096 - local178;
							local33[local41] = local106[1] * local178 + local183 * local160[1] >> 12;
							local37[local41] = local183 * local160[2] + local106[2] * local178 >> 12;
							local29[local41] = local183 * local160[3] + local106[3] * local178 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
