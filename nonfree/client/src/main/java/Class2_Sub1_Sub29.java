import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class2_Sub1_Sub29 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(19) int local19 = arg0.method1402();
		if (local19 != 0) {
			this.method2092(local19);
			return;
		}
		this.anIntArrayArray51 = new int[arg0.method1402()][4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArrayArray51.length; local30++) {
			this.anIntArrayArray51[local30][0] = arg0.method1397();
			this.anIntArrayArray51[local30][1] = arg0.method1402() << 4;
			this.anIntArrayArray51[local30][2] = arg0.method1402() << 4;
			this.anIntArrayArray51[local30][3] = arg0.method1402() << 4;
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	@Override
	public void method2789() {
		if (this.anIntArrayArray51 == null) {
			this.method2092(1);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V")
	private void method2092(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray51 = new int[2][4];
			this.anIntArrayArray51[0][0] = 0;
			this.anIntArrayArray51[1][0] = 4096;
			this.anIntArrayArray51[0][2] = 0;
			this.anIntArrayArray51[0][3] = 0;
			this.anIntArrayArray51[1][3] = 4096;
			this.anIntArrayArray51[1][2] = 4096;
			this.anIntArrayArray51[0][1] = 0;
			this.anIntArrayArray51[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray51 = new int[8][4];
			this.anIntArrayArray51[0][2] = 2602;
			this.anIntArrayArray51[0][3] = 2361;
			this.anIntArrayArray51[0][1] = 2650;
			this.anIntArrayArray51[0][0] = 0;
			this.anIntArrayArray51[1][1] = 2313;
			this.anIntArrayArray51[1][2] = 1799;
			this.anIntArrayArray51[2][1] = 2618;
			this.anIntArrayArray51[1][0] = 2867;
			this.anIntArrayArray51[1][3] = 1558;
			this.anIntArrayArray51[2][0] = 3072;
			this.anIntArrayArray51[2][2] = 1734;
			this.anIntArrayArray51[2][3] = 1413;
			this.anIntArrayArray51[3][1] = 2296;
			this.anIntArrayArray51[4][1] = 2072;
			this.anIntArrayArray51[5][1] = 2730;
			this.anIntArrayArray51[6][1] = 2232;
			this.anIntArrayArray51[3][3] = 947;
			this.anIntArrayArray51[7][1] = 1686;
			this.anIntArrayArray51[3][2] = 1220;
			this.anIntArrayArray51[3][0] = 3276;
			this.anIntArrayArray51[4][0] = 3481;
			this.anIntArrayArray51[4][3] = 722;
			this.anIntArrayArray51[4][2] = 963;
			this.anIntArrayArray51[5][3] = 1766;
			this.anIntArrayArray51[5][0] = 3686;
			this.anIntArrayArray51[6][0] = 3891;
			this.anIntArrayArray51[7][0] = 4096;
			this.anIntArrayArray51[6][3] = 915;
			this.anIntArrayArray51[7][3] = 1140;
			this.anIntArrayArray51[5][2] = 2152;
			this.anIntArrayArray51[6][2] = 1060;
			this.anIntArrayArray51[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray51 = new int[7][4];
			this.anIntArrayArray51[0][1] = 0;
			this.anIntArrayArray51[0][3] = 4096;
			this.anIntArrayArray51[0][0] = 0;
			this.anIntArrayArray51[1][3] = 4096;
			this.anIntArrayArray51[1][0] = 663;
			this.anIntArrayArray51[2][0] = 1363;
			this.anIntArrayArray51[2][3] = 0;
			this.anIntArrayArray51[3][3] = 0;
			this.anIntArrayArray51[4][3] = 0;
			this.anIntArrayArray51[3][0] = 2048;
			this.anIntArrayArray51[4][0] = 2727;
			this.anIntArrayArray51[0][2] = 0;
			this.anIntArrayArray51[5][0] = 3411;
			this.anIntArrayArray51[1][2] = 4096;
			this.anIntArrayArray51[6][0] = 4096;
			this.anIntArrayArray51[1][1] = 0;
			this.anIntArrayArray51[2][1] = 0;
			this.anIntArrayArray51[5][3] = 4096;
			this.anIntArrayArray51[3][1] = 4096;
			this.anIntArrayArray51[4][1] = 4096;
			this.anIntArrayArray51[2][2] = 4096;
			this.anIntArrayArray51[5][1] = 4096;
			this.anIntArrayArray51[6][1] = 0;
			this.anIntArrayArray51[3][2] = 4096;
			this.anIntArrayArray51[4][2] = 0;
			this.anIntArrayArray51[5][2] = 0;
			this.anIntArrayArray51[6][2] = 0;
			this.anIntArrayArray51[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray51 = new int[6][4];
			this.anIntArrayArray51[0][0] = 0;
			this.anIntArrayArray51[1][0] = 1843;
			this.anIntArrayArray51[2][0] = 2457;
			this.anIntArrayArray51[0][3] = 0;
			this.anIntArrayArray51[1][3] = 1493;
			this.anIntArrayArray51[2][3] = 2939;
			this.anIntArrayArray51[0][1] = 0;
			this.anIntArrayArray51[3][3] = 3565;
			this.anIntArrayArray51[4][3] = 4031;
			this.anIntArrayArray51[0][2] = 0;
			this.anIntArrayArray51[1][2] = 0;
			this.anIntArrayArray51[3][0] = 2781;
			this.anIntArrayArray51[1][1] = 0;
			this.anIntArrayArray51[2][2] = 0;
			this.anIntArrayArray51[2][1] = 0;
			this.anIntArrayArray51[5][3] = 4096;
			this.anIntArrayArray51[3][1] = 0;
			this.anIntArrayArray51[4][0] = 3481;
			this.anIntArrayArray51[3][2] = 1124;
			this.anIntArrayArray51[5][0] = 4096;
			this.anIntArrayArray51[4][1] = 546;
			this.anIntArrayArray51[4][2] = 3084;
			this.anIntArrayArray51[5][1] = 4096;
			this.anIntArrayArray51[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray51 = new int[16][4];
			this.anIntArrayArray51[0][2] = 192;
			this.anIntArrayArray51[0][0] = 0;
			this.anIntArrayArray51[0][1] = 80;
			this.anIntArrayArray51[1][1] = 321;
			this.anIntArrayArray51[0][3] = 321;
			this.anIntArrayArray51[1][3] = 562;
			this.anIntArrayArray51[1][0] = 155;
			this.anIntArrayArray51[2][0] = 389;
			this.anIntArrayArray51[3][0] = 671;
			this.anIntArrayArray51[2][1] = 578;
			this.anIntArrayArray51[3][1] = 947;
			this.anIntArrayArray51[4][1] = 1285;
			this.anIntArrayArray51[5][1] = 1525;
			this.anIntArrayArray51[2][3] = 803;
			this.anIntArrayArray51[6][1] = 1734;
			this.anIntArrayArray51[7][1] = 1413;
			this.anIntArrayArray51[4][0] = 897;
			this.anIntArrayArray51[3][3] = 1140;
			this.anIntArrayArray51[4][3] = 1509;
			this.anIntArrayArray51[5][0] = 1175;
			this.anIntArrayArray51[1][2] = 449;
			this.anIntArrayArray51[6][0] = 1368;
			this.anIntArrayArray51[2][2] = 690;
			this.anIntArrayArray51[5][3] = 1413;
			this.anIntArrayArray51[8][1] = 1108;
			this.anIntArrayArray51[9][1] = 1766;
			this.anIntArrayArray51[10][1] = 2409;
			this.anIntArrayArray51[3][2] = 995;
			this.anIntArrayArray51[11][1] = 3116;
			this.anIntArrayArray51[12][1] = 3806;
			this.anIntArrayArray51[7][0] = 1507;
			this.anIntArrayArray51[4][2] = 1397;
			this.anIntArrayArray51[6][3] = 1333;
			this.anIntArrayArray51[13][1] = 3437;
			this.anIntArrayArray51[7][3] = 1702;
			this.anIntArrayArray51[14][1] = 3116;
			this.anIntArrayArray51[5][2] = 1429;
			this.anIntArrayArray51[8][3] = 2056;
			this.anIntArrayArray51[8][0] = 1736;
			this.anIntArrayArray51[6][2] = 1461;
			this.anIntArrayArray51[9][3] = 2666;
			this.anIntArrayArray51[7][2] = 1525;
			this.anIntArrayArray51[15][1] = 2377;
			this.anIntArrayArray51[9][0] = 2088;
			this.anIntArrayArray51[10][0] = 2355;
			this.anIntArrayArray51[10][3] = 3276;
			this.anIntArrayArray51[11][0] = 2691;
			this.anIntArrayArray51[12][0] = 3031;
			this.anIntArrayArray51[11][3] = 3228;
			this.anIntArrayArray51[12][3] = 3196;
			this.anIntArrayArray51[13][0] = 3522;
			this.anIntArrayArray51[8][2] = 1590;
			this.anIntArrayArray51[13][3] = 3019;
			this.anIntArrayArray51[14][0] = 3727;
			this.anIntArrayArray51[15][0] = 4096;
			this.anIntArrayArray51[9][2] = 2056;
			this.anIntArrayArray51[10][2] = 2586;
			this.anIntArrayArray51[14][3] = 3228;
			this.anIntArrayArray51[11][2] = 3148;
			this.anIntArrayArray51[15][3] = 2746;
			this.anIntArrayArray51[12][2] = 3710;
			this.anIntArrayArray51[13][2] = 3421;
			this.anIntArrayArray51[14][2] = 3148;
			this.anIntArrayArray51[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray51 = new int[4][4];
			this.anIntArrayArray51[0][1] = 0;
			this.anIntArrayArray51[0][2] = 4096;
			this.anIntArrayArray51[0][3] = 0;
			this.anIntArrayArray51[1][3] = 0;
			this.anIntArrayArray51[2][3] = 0;
			this.anIntArrayArray51[1][1] = 4096;
			this.anIntArrayArray51[3][3] = 0;
			this.anIntArrayArray51[1][2] = 4096;
			this.anIntArrayArray51[0][0] = 2048;
			this.anIntArrayArray51[1][0] = 2867;
			this.anIntArrayArray51[2][1] = 4096;
			this.anIntArrayArray51[3][1] = 4096;
			this.anIntArrayArray51[2][0] = 3276;
			this.anIntArrayArray51[2][2] = 4096;
			this.anIntArrayArray51[3][2] = 0;
			this.anIntArrayArray51[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(25) int local25 = this.anIntArrayArray51.length;
			@Pc(31) int[] local31 = this.method2796(0, arg0);
			@Pc(35) int[] local35 = local17[0];
			@Pc(39) int[] local39 = local17[1];
			@Pc(43) int[] local43 = local17[2];
			@Pc(50) int local50;
			if (local25 <= 0) {
				for (local50 = 0; local50 < Static120.anInt2812; local50++) {
					local35[local50] = 0;
					local39[local50] = 0;
					local43[local50] = 0;
				}
			} else {
				for (local50 = 0; local50 < Static120.anInt2812; local50++) {
					@Pc(82) int local82 = local31[local50];
					@Pc(84) int local84 = 0;
					for (@Pc(86) int local86 = 0; local25 > local86 && this.anIntArrayArray51[local86][0] <= local82; local86++) {
						local84++;
					}
					@Pc(119) int[] local119;
					if (local84 >= local25) {
						local119 = this.anIntArrayArray51[local25 - 1];
						local35[local50] = local119[1];
						local39[local50] = local119[2];
						local43[local50] = local119[3];
					} else {
						local119 = this.anIntArrayArray51[local84];
						if (local84 > 0) {
							@Pc(153) int[] local153 = this.anIntArrayArray51[local84 - 1];
							@Pc(170) int local170 = (local82 - local153[0] << 12) / (local119[0] - local153[0]);
							@Pc(175) int local175 = 4096 - local170;
							local35[local50] = local119[1] * local170 + local175 * local153[1] >> 12;
							local39[local50] = local153[2] * local175 + local170 * local119[2] >> 12;
							local43[local50] = local119[3] * local170 + local175 * local153[3] >> 12;
						} else {
							local35[local50] = local119[1];
							local39[local50] = local119[2];
							local43[local50] = local119[3];
						}
					}
				}
			}
		}
		return local17;
	}
}
