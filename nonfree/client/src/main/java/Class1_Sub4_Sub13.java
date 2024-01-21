import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class1_Sub4_Sub13 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ke", name = "jb", descriptor = "[[I")
	private int[][] anIntArrayArray73;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(24) int local24 = this.anIntArrayArray73.length;
			@Pc(30) int[] local30 = this.method3215(arg0, 0);
			@Pc(34) int[] local34 = local16[0];
			@Pc(38) int[] local38 = local16[1];
			@Pc(42) int[] local42 = local16[2];
			@Pc(46) int local46;
			if (local24 > 0) {
				for (local46 = 0; local46 < Static73.anInt1888; local46++) {
					@Pc(50) int local50 = 0;
					@Pc(54) int local54 = local30[local46];
					for (@Pc(56) int local56 = 0; local24 > local56 && this.anIntArrayArray73[local56][0] <= local54; local56++) {
						local50++;
					}
					@Pc(93) int[] local93;
					if (local50 >= local24) {
						local93 = this.anIntArrayArray73[local24 - 1];
						local34[local46] = local93[1];
						local38[local46] = local93[2];
						local42[local46] = local93[3];
					} else {
						local93 = this.anIntArrayArray73[local50];
						if (local50 > 0) {
							@Pc(130) int[] local130 = this.anIntArrayArray73[local50 - 1];
							@Pc(148) int local148 = (local54 - local130[0] << 12) / (local93[0] - local130[0]);
							@Pc(153) int local153 = 4096 - local148;
							local34[local46] = local153 * local130[1] + local148 * local93[1] >> 12;
							local38[local46] = local130[2] * local153 + local93[2] * local148 >> 12;
							local42[local46] = local148 * local93[3] + local153 * local130[3] >> 12;
						} else {
							local34[local46] = local93[1];
							local38[local46] = local93[2];
							local42[local46] = local93[3];
						}
					}
				}
			} else {
				for (local46 = 0; local46 < Static73.anInt1888; local46++) {
					local34[local46] = 0;
					local38[local46] = 0;
					local42[local46] = 0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(10) int local10 = arg0.method544();
		if (local10 != 0) {
			this.method1791(local10);
			return;
		}
		this.anIntArrayArray73 = new int[arg0.method544()][4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArrayArray73.length; local30++) {
			this.anIntArrayArray73[local30][0] = arg0.method546();
			this.anIntArrayArray73[local30][1] = arg0.method544() << 4;
			this.anIntArrayArray73[local30][2] = arg0.method544() << 4;
			this.anIntArrayArray73[local30][3] = arg0.method544() << 4;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
	private void method1791(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray73 = new int[2][4];
			this.anIntArrayArray73[0][0] = 0;
			this.anIntArrayArray73[1][0] = 4096;
			this.anIntArrayArray73[0][2] = 0;
			this.anIntArrayArray73[1][2] = 4096;
			this.anIntArrayArray73[0][1] = 0;
			this.anIntArrayArray73[0][3] = 0;
			this.anIntArrayArray73[1][3] = 4096;
			this.anIntArrayArray73[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray73 = new int[8][4];
			this.anIntArrayArray73[0][0] = 0;
			this.anIntArrayArray73[0][3] = 2361;
			this.anIntArrayArray73[0][2] = 2602;
			this.anIntArrayArray73[1][0] = 2867;
			this.anIntArrayArray73[1][2] = 1799;
			this.anIntArrayArray73[2][0] = 3072;
			this.anIntArrayArray73[2][2] = 1734;
			this.anIntArrayArray73[3][2] = 1220;
			this.anIntArrayArray73[3][0] = 3276;
			this.anIntArrayArray73[0][1] = 2650;
			this.anIntArrayArray73[1][1] = 2313;
			this.anIntArrayArray73[1][3] = 1558;
			this.anIntArrayArray73[4][2] = 963;
			this.anIntArrayArray73[4][0] = 3481;
			this.anIntArrayArray73[2][3] = 1413;
			this.anIntArrayArray73[3][3] = 947;
			this.anIntArrayArray73[5][2] = 2152;
			this.anIntArrayArray73[5][0] = 3686;
			this.anIntArrayArray73[6][0] = 3891;
			this.anIntArrayArray73[4][3] = 722;
			this.anIntArrayArray73[2][1] = 2618;
			this.anIntArrayArray73[3][1] = 2296;
			this.anIntArrayArray73[7][0] = 4096;
			this.anIntArrayArray73[5][3] = 1766;
			this.anIntArrayArray73[6][3] = 915;
			this.anIntArrayArray73[6][2] = 1060;
			this.anIntArrayArray73[7][2] = 1413;
			this.anIntArrayArray73[4][1] = 2072;
			this.anIntArrayArray73[7][3] = 1140;
			this.anIntArrayArray73[5][1] = 2730;
			this.anIntArrayArray73[6][1] = 2232;
			this.anIntArrayArray73[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray73 = new int[7][4];
			this.anIntArrayArray73[0][1] = 0;
			this.anIntArrayArray73[1][1] = 0;
			this.anIntArrayArray73[0][2] = 0;
			this.anIntArrayArray73[2][1] = 0;
			this.anIntArrayArray73[0][0] = 0;
			this.anIntArrayArray73[1][2] = 4096;
			this.anIntArrayArray73[3][1] = 4096;
			this.anIntArrayArray73[4][1] = 4096;
			this.anIntArrayArray73[1][0] = 663;
			this.anIntArrayArray73[2][2] = 4096;
			this.anIntArrayArray73[5][1] = 4096;
			this.anIntArrayArray73[3][2] = 4096;
			this.anIntArrayArray73[2][0] = 1363;
			this.anIntArrayArray73[3][0] = 2048;
			this.anIntArrayArray73[6][1] = 0;
			this.anIntArrayArray73[4][0] = 2727;
			this.anIntArrayArray73[4][2] = 0;
			this.anIntArrayArray73[0][3] = 4096;
			this.anIntArrayArray73[5][0] = 3411;
			this.anIntArrayArray73[1][3] = 4096;
			this.anIntArrayArray73[5][2] = 0;
			this.anIntArrayArray73[2][3] = 0;
			this.anIntArrayArray73[3][3] = 0;
			this.anIntArrayArray73[4][3] = 0;
			this.anIntArrayArray73[5][3] = 4096;
			this.anIntArrayArray73[6][0] = 4096;
			this.anIntArrayArray73[6][2] = 0;
			this.anIntArrayArray73[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray73 = new int[6][4];
			this.anIntArrayArray73[0][3] = 0;
			this.anIntArrayArray73[0][0] = 0;
			this.anIntArrayArray73[0][1] = 0;
			this.anIntArrayArray73[1][1] = 0;
			this.anIntArrayArray73[0][2] = 0;
			this.anIntArrayArray73[1][0] = 1843;
			this.anIntArrayArray73[1][3] = 1493;
			this.anIntArrayArray73[1][2] = 0;
			this.anIntArrayArray73[2][2] = 0;
			this.anIntArrayArray73[2][0] = 2457;
			this.anIntArrayArray73[2][1] = 0;
			this.anIntArrayArray73[3][2] = 1124;
			this.anIntArrayArray73[2][3] = 2939;
			this.anIntArrayArray73[3][1] = 0;
			this.anIntArrayArray73[4][1] = 546;
			this.anIntArrayArray73[3][0] = 2781;
			this.anIntArrayArray73[5][1] = 4096;
			this.anIntArrayArray73[3][3] = 3565;
			this.anIntArrayArray73[4][3] = 4031;
			this.anIntArrayArray73[4][2] = 3084;
			this.anIntArrayArray73[5][3] = 4096;
			this.anIntArrayArray73[4][0] = 3481;
			this.anIntArrayArray73[5][2] = 4096;
			this.anIntArrayArray73[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray73 = new int[16][4];
			this.anIntArrayArray73[0][3] = 321;
			this.anIntArrayArray73[1][3] = 562;
			this.anIntArrayArray73[0][0] = 0;
			this.anIntArrayArray73[0][2] = 192;
			this.anIntArrayArray73[0][1] = 80;
			this.anIntArrayArray73[1][1] = 321;
			this.anIntArrayArray73[2][1] = 578;
			this.anIntArrayArray73[1][0] = 155;
			this.anIntArrayArray73[3][1] = 947;
			this.anIntArrayArray73[2][3] = 803;
			this.anIntArrayArray73[1][2] = 449;
			this.anIntArrayArray73[2][2] = 690;
			this.anIntArrayArray73[3][3] = 1140;
			this.anIntArrayArray73[2][0] = 389;
			this.anIntArrayArray73[4][3] = 1509;
			this.anIntArrayArray73[5][3] = 1413;
			this.anIntArrayArray73[3][0] = 671;
			this.anIntArrayArray73[4][0] = 897;
			this.anIntArrayArray73[3][2] = 995;
			this.anIntArrayArray73[4][2] = 1397;
			this.anIntArrayArray73[6][3] = 1333;
			this.anIntArrayArray73[5][2] = 1429;
			this.anIntArrayArray73[5][0] = 1175;
			this.anIntArrayArray73[6][0] = 1368;
			this.anIntArrayArray73[7][0] = 1507;
			this.anIntArrayArray73[6][2] = 1461;
			this.anIntArrayArray73[7][2] = 1525;
			this.anIntArrayArray73[8][2] = 1590;
			this.anIntArrayArray73[4][1] = 1285;
			this.anIntArrayArray73[8][0] = 1736;
			this.anIntArrayArray73[9][2] = 2056;
			this.anIntArrayArray73[9][0] = 2088;
			this.anIntArrayArray73[10][0] = 2355;
			this.anIntArrayArray73[11][0] = 2691;
			this.anIntArrayArray73[7][3] = 1702;
			this.anIntArrayArray73[12][0] = 3031;
			this.anIntArrayArray73[10][2] = 2586;
			this.anIntArrayArray73[11][2] = 3148;
			this.anIntArrayArray73[8][3] = 2056;
			this.anIntArrayArray73[12][2] = 3710;
			this.anIntArrayArray73[13][2] = 3421;
			this.anIntArrayArray73[5][1] = 1525;
			this.anIntArrayArray73[14][2] = 3148;
			this.anIntArrayArray73[13][0] = 3522;
			this.anIntArrayArray73[15][2] = 2505;
			this.anIntArrayArray73[6][1] = 1734;
			this.anIntArrayArray73[9][3] = 2666;
			this.anIntArrayArray73[14][0] = 3727;
			this.anIntArrayArray73[7][1] = 1413;
			this.anIntArrayArray73[8][1] = 1108;
			this.anIntArrayArray73[15][0] = 4096;
			this.anIntArrayArray73[9][1] = 1766;
			this.anIntArrayArray73[10][1] = 2409;
			this.anIntArrayArray73[10][3] = 3276;
			this.anIntArrayArray73[11][3] = 3228;
			this.anIntArrayArray73[12][3] = 3196;
			this.anIntArrayArray73[11][1] = 3116;
			this.anIntArrayArray73[12][1] = 3806;
			this.anIntArrayArray73[13][3] = 3019;
			this.anIntArrayArray73[13][1] = 3437;
			this.anIntArrayArray73[14][3] = 3228;
			this.anIntArrayArray73[14][1] = 3116;
			this.anIntArrayArray73[15][1] = 2377;
			this.anIntArrayArray73[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray73 = new int[4][4];
			this.anIntArrayArray73[0][2] = 4096;
			this.anIntArrayArray73[1][2] = 4096;
			this.anIntArrayArray73[2][2] = 4096;
			this.anIntArrayArray73[0][3] = 0;
			this.anIntArrayArray73[0][0] = 2048;
			this.anIntArrayArray73[1][0] = 2867;
			this.anIntArrayArray73[0][1] = 0;
			this.anIntArrayArray73[1][3] = 0;
			this.anIntArrayArray73[3][2] = 0;
			this.anIntArrayArray73[2][3] = 0;
			this.anIntArrayArray73[1][1] = 4096;
			this.anIntArrayArray73[2][0] = 3276;
			this.anIntArrayArray73[2][1] = 4096;
			this.anIntArrayArray73[3][1] = 4096;
			this.anIntArrayArray73[3][3] = 0;
			this.anIntArrayArray73[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
	@Override
	public void method3207() {
		if (this.anIntArrayArray73 == null) {
			this.method1791(1);
		}
	}
}
