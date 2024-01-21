import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class3_Sub1_Sub35 extends Class3_Sub1 {

	@OriginalMember(owner = "client!v", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(21) int local21 = arg1.method191();
		if (local21 != 0) {
			this.method2709(local21);
			return;
		}
		this.anIntArrayArray38 = new int[arg1.method191()][4];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray38.length; local32++) {
			this.anIntArrayArray38[local32][0] = arg1.method208();
			this.anIntArrayArray38[local32][1] = arg1.method191() << 4;
			this.anIntArrayArray38[local32][2] = arg1.method191() << 4;
			this.anIntArrayArray38[local32][3] = arg1.method191() << 4;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V")
	private void method2709(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray38 = new int[2][4];
			this.anIntArrayArray38[0][0] = 0;
			this.anIntArrayArray38[1][0] = 4096;
			this.anIntArrayArray38[0][2] = 0;
			this.anIntArrayArray38[0][3] = 0;
			this.anIntArrayArray38[1][3] = 4096;
			this.anIntArrayArray38[1][2] = 4096;
			this.anIntArrayArray38[0][1] = 0;
			this.anIntArrayArray38[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray38 = new int[8][4];
			this.anIntArrayArray38[0][2] = 2602;
			this.anIntArrayArray38[0][0] = 0;
			this.anIntArrayArray38[1][2] = 1799;
			this.anIntArrayArray38[0][1] = 2650;
			this.anIntArrayArray38[0][3] = 2361;
			this.anIntArrayArray38[1][3] = 1558;
			this.anIntArrayArray38[1][1] = 2313;
			this.anIntArrayArray38[2][2] = 1734;
			this.anIntArrayArray38[2][1] = 2618;
			this.anIntArrayArray38[1][0] = 2867;
			this.anIntArrayArray38[3][2] = 1220;
			this.anIntArrayArray38[2][0] = 3072;
			this.anIntArrayArray38[4][2] = 963;
			this.anIntArrayArray38[3][1] = 2296;
			this.anIntArrayArray38[5][2] = 2152;
			this.anIntArrayArray38[3][0] = 3276;
			this.anIntArrayArray38[4][0] = 3481;
			this.anIntArrayArray38[2][3] = 1413;
			this.anIntArrayArray38[3][3] = 947;
			this.anIntArrayArray38[5][0] = 3686;
			this.anIntArrayArray38[6][0] = 3891;
			this.anIntArrayArray38[4][3] = 722;
			this.anIntArrayArray38[6][2] = 1060;
			this.anIntArrayArray38[4][1] = 2072;
			this.anIntArrayArray38[7][0] = 4096;
			this.anIntArrayArray38[5][1] = 2730;
			this.anIntArrayArray38[6][1] = 2232;
			this.anIntArrayArray38[7][1] = 1686;
			this.anIntArrayArray38[5][3] = 1766;
			this.anIntArrayArray38[6][3] = 915;
			this.anIntArrayArray38[7][2] = 1413;
			this.anIntArrayArray38[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray38 = new int[7][4];
			this.anIntArrayArray38[0][0] = 0;
			this.anIntArrayArray38[0][3] = 4096;
			this.anIntArrayArray38[1][0] = 663;
			this.anIntArrayArray38[0][1] = 0;
			this.anIntArrayArray38[1][3] = 4096;
			this.anIntArrayArray38[2][3] = 0;
			this.anIntArrayArray38[0][2] = 0;
			this.anIntArrayArray38[1][2] = 4096;
			this.anIntArrayArray38[2][2] = 4096;
			this.anIntArrayArray38[1][1] = 0;
			this.anIntArrayArray38[2][1] = 0;
			this.anIntArrayArray38[2][0] = 1363;
			this.anIntArrayArray38[3][0] = 2048;
			this.anIntArrayArray38[4][0] = 2727;
			this.anIntArrayArray38[3][3] = 0;
			this.anIntArrayArray38[3][1] = 4096;
			this.anIntArrayArray38[4][1] = 4096;
			this.anIntArrayArray38[5][0] = 3411;
			this.anIntArrayArray38[4][3] = 0;
			this.anIntArrayArray38[3][2] = 4096;
			this.anIntArrayArray38[5][1] = 4096;
			this.anIntArrayArray38[4][2] = 0;
			this.anIntArrayArray38[5][2] = 0;
			this.anIntArrayArray38[6][2] = 0;
			this.anIntArrayArray38[6][1] = 0;
			this.anIntArrayArray38[5][3] = 4096;
			this.anIntArrayArray38[6][3] = 4096;
			this.anIntArrayArray38[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray38 = new int[6][4];
			this.anIntArrayArray38[0][3] = 0;
			this.anIntArrayArray38[1][3] = 1493;
			this.anIntArrayArray38[0][2] = 0;
			this.anIntArrayArray38[0][0] = 0;
			this.anIntArrayArray38[1][2] = 0;
			this.anIntArrayArray38[2][2] = 0;
			this.anIntArrayArray38[2][3] = 2939;
			this.anIntArrayArray38[3][2] = 1124;
			this.anIntArrayArray38[4][2] = 3084;
			this.anIntArrayArray38[5][2] = 4096;
			this.anIntArrayArray38[1][0] = 1843;
			this.anIntArrayArray38[2][0] = 2457;
			this.anIntArrayArray38[3][0] = 2781;
			this.anIntArrayArray38[0][1] = 0;
			this.anIntArrayArray38[3][3] = 3565;
			this.anIntArrayArray38[1][1] = 0;
			this.anIntArrayArray38[4][0] = 3481;
			this.anIntArrayArray38[5][0] = 4096;
			this.anIntArrayArray38[2][1] = 0;
			this.anIntArrayArray38[4][3] = 4031;
			this.anIntArrayArray38[3][1] = 0;
			this.anIntArrayArray38[4][1] = 546;
			this.anIntArrayArray38[5][1] = 4096;
			this.anIntArrayArray38[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray38 = new int[16][4];
			this.anIntArrayArray38[0][2] = 192;
			this.anIntArrayArray38[0][1] = 80;
			this.anIntArrayArray38[1][1] = 321;
			this.anIntArrayArray38[2][1] = 578;
			this.anIntArrayArray38[0][0] = 0;
			this.anIntArrayArray38[1][2] = 449;
			this.anIntArrayArray38[3][1] = 947;
			this.anIntArrayArray38[0][3] = 321;
			this.anIntArrayArray38[2][2] = 690;
			this.anIntArrayArray38[3][2] = 995;
			this.anIntArrayArray38[1][0] = 155;
			this.anIntArrayArray38[4][2] = 1397;
			this.anIntArrayArray38[5][2] = 1429;
			this.anIntArrayArray38[2][0] = 389;
			this.anIntArrayArray38[6][2] = 1461;
			this.anIntArrayArray38[7][2] = 1525;
			this.anIntArrayArray38[4][1] = 1285;
			this.anIntArrayArray38[1][3] = 562;
			this.anIntArrayArray38[8][2] = 1590;
			this.anIntArrayArray38[2][3] = 803;
			this.anIntArrayArray38[5][1] = 1525;
			this.anIntArrayArray38[3][0] = 671;
			this.anIntArrayArray38[9][2] = 2056;
			this.anIntArrayArray38[6][1] = 1734;
			this.anIntArrayArray38[10][2] = 2586;
			this.anIntArrayArray38[7][1] = 1413;
			this.anIntArrayArray38[4][0] = 897;
			this.anIntArrayArray38[11][2] = 3148;
			this.anIntArrayArray38[8][1] = 1108;
			this.anIntArrayArray38[12][2] = 3710;
			this.anIntArrayArray38[13][2] = 3421;
			this.anIntArrayArray38[9][1] = 1766;
			this.anIntArrayArray38[3][3] = 1140;
			this.anIntArrayArray38[5][0] = 1175;
			this.anIntArrayArray38[10][1] = 2409;
			this.anIntArrayArray38[14][2] = 3148;
			this.anIntArrayArray38[15][2] = 2505;
			this.anIntArrayArray38[4][3] = 1509;
			this.anIntArrayArray38[6][0] = 1368;
			this.anIntArrayArray38[11][1] = 3116;
			this.anIntArrayArray38[5][3] = 1413;
			this.anIntArrayArray38[7][0] = 1507;
			this.anIntArrayArray38[6][3] = 1333;
			this.anIntArrayArray38[8][0] = 1736;
			this.anIntArrayArray38[7][3] = 1702;
			this.anIntArrayArray38[9][0] = 2088;
			this.anIntArrayArray38[12][1] = 3806;
			this.anIntArrayArray38[8][3] = 2056;
			this.anIntArrayArray38[10][0] = 2355;
			this.anIntArrayArray38[11][0] = 2691;
			this.anIntArrayArray38[9][3] = 2666;
			this.anIntArrayArray38[13][1] = 3437;
			this.anIntArrayArray38[14][1] = 3116;
			this.anIntArrayArray38[12][0] = 3031;
			this.anIntArrayArray38[13][0] = 3522;
			this.anIntArrayArray38[14][0] = 3727;
			this.anIntArrayArray38[10][3] = 3276;
			this.anIntArrayArray38[11][3] = 3228;
			this.anIntArrayArray38[15][0] = 4096;
			this.anIntArrayArray38[15][1] = 2377;
			this.anIntArrayArray38[12][3] = 3196;
			this.anIntArrayArray38[13][3] = 3019;
			this.anIntArrayArray38[14][3] = 3228;
			this.anIntArrayArray38[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray38 = new int[4][4];
			this.anIntArrayArray38[0][2] = 4096;
			this.anIntArrayArray38[0][0] = 2048;
			this.anIntArrayArray38[0][3] = 0;
			this.anIntArrayArray38[1][3] = 0;
			this.anIntArrayArray38[2][3] = 0;
			this.anIntArrayArray38[1][0] = 2867;
			this.anIntArrayArray38[2][0] = 3276;
			this.anIntArrayArray38[0][1] = 0;
			this.anIntArrayArray38[3][3] = 0;
			this.anIntArrayArray38[1][1] = 4096;
			this.anIntArrayArray38[3][0] = 4096;
			this.anIntArrayArray38[2][1] = 4096;
			this.anIntArrayArray38[1][2] = 4096;
			this.anIntArrayArray38[3][1] = 4096;
			this.anIntArrayArray38[2][2] = 4096;
			this.anIntArrayArray38[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	@Override
	public void method2916() {
		if (this.anIntArrayArray38 == null) {
			this.method2709(1);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(27) int local27 = this.anIntArrayArray38.length;
			@Pc(33) int[] local33 = this.method2904(0, arg0);
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[0];
			@Pc(45) int[] local45 = local19[2];
			@Pc(52) int local52;
			if (local27 > 0) {
				for (local52 = 0; local52 < Static141.anInt3261; local52++) {
					@Pc(56) int local56 = 0;
					@Pc(60) int local60 = local33[local52];
					for (@Pc(62) int local62 = 0; local27 > local62 && this.anIntArrayArray38[local62][0] <= local60; local62++) {
						local56++;
					}
					@Pc(87) int[] local87;
					if (local27 <= local56) {
						local87 = this.anIntArrayArray38[local27 - 1];
						local41[local52] = local87[1];
						local37[local52] = local87[2];
						local45[local52] = local87[3];
					} else {
						local87 = this.anIntArrayArray38[local56];
						if (local56 <= 0) {
							local41[local52] = local87[1];
							local37[local52] = local87[2];
							local45[local52] = local87[3];
						} else {
							@Pc(141) int[] local141 = this.anIntArrayArray38[local56 - 1];
							@Pc(158) int local158 = (local60 - local141[0] << 12) / (local87[0] - local141[0]);
							@Pc(163) int local163 = 4096 - local158;
							local41[local52] = local87[1] * local158 + local163 * local141[1] >> 12;
							local37[local52] = local141[2] * local163 + local87[2] * local158 >> 12;
							local45[local52] = local158 * local87[3] + local163 * local141[3] >> 12;
						}
					}
				}
			} else {
				for (local52 = 0; local52 < Static141.anInt3261; local52++) {
					local41[local52] = 0;
					local37[local52] = 0;
					local45[local52] = 0;
				}
			}
		}
		return local19;
	}
}
