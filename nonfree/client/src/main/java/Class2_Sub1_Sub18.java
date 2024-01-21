import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!l", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(10) int local10 = arg0.method2387();
		if (local10 != 0) {
			this.method1612(local10);
			return;
		}
		this.anIntArrayArray17 = new int[arg0.method2387()][4];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray17.length; local27++) {
			this.anIntArrayArray17[local27][0] = arg0.method2353();
			this.anIntArrayArray17[local27][1] = arg0.method2387() << 4;
			this.anIntArrayArray17[local27][2] = arg0.method2387() << 4;
			this.anIntArrayArray17[local27][3] = arg0.method2387() << 4;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(26) int local26 = this.anIntArrayArray17.length;
			@Pc(34) int[] local34 = this.method2980(0, arg0);
			@Pc(38) int[] local38 = local18[0];
			@Pc(42) int[] local42 = local18[1];
			@Pc(46) int[] local46 = local18[2];
			@Pc(53) int local53;
			if (local26 <= 0) {
				for (local53 = 0; local53 < Static129.anInt3118; local53++) {
					local38[local53] = 0;
					local42[local53] = 0;
					local46[local53] = 0;
				}
			} else {
				for (local53 = 0; local53 < Static129.anInt3118; local53++) {
					@Pc(79) int local79 = 0;
					@Pc(83) int local83 = local34[local53];
					for (@Pc(85) int local85 = 0; local85 < local26 && local83 >= this.anIntArrayArray17[local85][0]; local85++) {
						local79++;
					}
					@Pc(108) int[] local108;
					if (local26 > local79) {
						local108 = this.anIntArrayArray17[local79];
						if (local79 <= 0) {
							local38[local53] = local108[1];
							local42[local53] = local108[2];
							local46[local53] = local108[3];
						} else {
							@Pc(140) int[] local140 = this.anIntArrayArray17[local79 - 1];
							@Pc(157) int local157 = (local83 - local140[0] << 12) / (local108[0] - local140[0]);
							@Pc(162) int local162 = 4096 - local157;
							local38[local53] = local140[1] * local162 + local108[1] * local157 >> 12;
							local42[local53] = local140[2] * local162 + local108[2] * local157 >> 12;
							local46[local53] = local162 * local140[3] + local108[3] * local157 >> 12;
						}
					} else {
						local108 = this.anIntArrayArray17[local26 - 1];
						local38[local53] = local108[1];
						local42[local53] = local108[2];
						local46[local53] = local108[3];
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	private void method1612(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray17 = new int[2][4];
			this.anIntArrayArray17[0][1] = 0;
			this.anIntArrayArray17[0][2] = 0;
			this.anIntArrayArray17[1][1] = 4096;
			this.anIntArrayArray17[0][0] = 0;
			this.anIntArrayArray17[1][2] = 4096;
			this.anIntArrayArray17[0][3] = 0;
			this.anIntArrayArray17[1][0] = 4096;
			this.anIntArrayArray17[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray17 = new int[8][4];
			this.anIntArrayArray17[0][0] = 0;
			this.anIntArrayArray17[0][3] = 2361;
			this.anIntArrayArray17[1][3] = 1558;
			this.anIntArrayArray17[0][2] = 2602;
			this.anIntArrayArray17[0][1] = 2650;
			this.anIntArrayArray17[1][2] = 1799;
			this.anIntArrayArray17[1][0] = 2867;
			this.anIntArrayArray17[1][1] = 2313;
			this.anIntArrayArray17[2][0] = 3072;
			this.anIntArrayArray17[2][3] = 1413;
			this.anIntArrayArray17[3][0] = 3276;
			this.anIntArrayArray17[4][0] = 3481;
			this.anIntArrayArray17[5][0] = 3686;
			this.anIntArrayArray17[2][2] = 1734;
			this.anIntArrayArray17[3][2] = 1220;
			this.anIntArrayArray17[4][2] = 963;
			this.anIntArrayArray17[3][3] = 947;
			this.anIntArrayArray17[6][0] = 3891;
			this.anIntArrayArray17[7][0] = 4096;
			this.anIntArrayArray17[5][2] = 2152;
			this.anIntArrayArray17[2][1] = 2618;
			this.anIntArrayArray17[4][3] = 722;
			this.anIntArrayArray17[3][1] = 2296;
			this.anIntArrayArray17[5][3] = 1766;
			this.anIntArrayArray17[4][1] = 2072;
			this.anIntArrayArray17[5][1] = 2730;
			this.anIntArrayArray17[6][2] = 1060;
			this.anIntArrayArray17[6][3] = 915;
			this.anIntArrayArray17[7][3] = 1140;
			this.anIntArrayArray17[6][1] = 2232;
			this.anIntArrayArray17[7][2] = 1413;
			this.anIntArrayArray17[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray17 = new int[7][4];
			this.anIntArrayArray17[0][2] = 0;
			this.anIntArrayArray17[0][0] = 0;
			this.anIntArrayArray17[1][2] = 4096;
			this.anIntArrayArray17[2][2] = 4096;
			this.anIntArrayArray17[0][1] = 0;
			this.anIntArrayArray17[0][3] = 4096;
			this.anIntArrayArray17[3][2] = 4096;
			this.anIntArrayArray17[1][3] = 4096;
			this.anIntArrayArray17[1][1] = 0;
			this.anIntArrayArray17[4][2] = 0;
			this.anIntArrayArray17[5][2] = 0;
			this.anIntArrayArray17[1][0] = 663;
			this.anIntArrayArray17[6][2] = 0;
			this.anIntArrayArray17[2][0] = 1363;
			this.anIntArrayArray17[2][3] = 0;
			this.anIntArrayArray17[3][3] = 0;
			this.anIntArrayArray17[3][0] = 2048;
			this.anIntArrayArray17[4][0] = 2727;
			this.anIntArrayArray17[5][0] = 3411;
			this.anIntArrayArray17[6][0] = 4096;
			this.anIntArrayArray17[4][3] = 0;
			this.anIntArrayArray17[5][3] = 4096;
			this.anIntArrayArray17[2][1] = 0;
			this.anIntArrayArray17[3][1] = 4096;
			this.anIntArrayArray17[4][1] = 4096;
			this.anIntArrayArray17[5][1] = 4096;
			this.anIntArrayArray17[6][3] = 4096;
			this.anIntArrayArray17[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray17 = new int[6][4];
			this.anIntArrayArray17[0][2] = 0;
			this.anIntArrayArray17[0][3] = 0;
			this.anIntArrayArray17[1][3] = 1493;
			this.anIntArrayArray17[0][1] = 0;
			this.anIntArrayArray17[1][1] = 0;
			this.anIntArrayArray17[2][1] = 0;
			this.anIntArrayArray17[2][3] = 2939;
			this.anIntArrayArray17[3][3] = 3565;
			this.anIntArrayArray17[0][0] = 0;
			this.anIntArrayArray17[1][2] = 0;
			this.anIntArrayArray17[1][0] = 1843;
			this.anIntArrayArray17[4][3] = 4031;
			this.anIntArrayArray17[2][2] = 0;
			this.anIntArrayArray17[3][2] = 1124;
			this.anIntArrayArray17[5][3] = 4096;
			this.anIntArrayArray17[2][0] = 2457;
			this.anIntArrayArray17[4][2] = 3084;
			this.anIntArrayArray17[5][2] = 4096;
			this.anIntArrayArray17[3][0] = 2781;
			this.anIntArrayArray17[3][1] = 0;
			this.anIntArrayArray17[4][0] = 3481;
			this.anIntArrayArray17[4][1] = 546;
			this.anIntArrayArray17[5][0] = 4096;
			this.anIntArrayArray17[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray17 = new int[16][4];
			this.anIntArrayArray17[0][0] = 0;
			this.anIntArrayArray17[0][2] = 192;
			this.anIntArrayArray17[1][0] = 155;
			this.anIntArrayArray17[0][3] = 321;
			this.anIntArrayArray17[0][1] = 80;
			this.anIntArrayArray17[1][3] = 562;
			this.anIntArrayArray17[1][2] = 449;
			this.anIntArrayArray17[2][0] = 389;
			this.anIntArrayArray17[2][2] = 690;
			this.anIntArrayArray17[3][2] = 995;
			this.anIntArrayArray17[3][0] = 671;
			this.anIntArrayArray17[4][0] = 897;
			this.anIntArrayArray17[5][0] = 1175;
			this.anIntArrayArray17[2][3] = 803;
			this.anIntArrayArray17[6][0] = 1368;
			this.anIntArrayArray17[3][3] = 1140;
			this.anIntArrayArray17[1][1] = 321;
			this.anIntArrayArray17[7][0] = 1507;
			this.anIntArrayArray17[2][1] = 578;
			this.anIntArrayArray17[4][3] = 1509;
			this.anIntArrayArray17[3][1] = 947;
			this.anIntArrayArray17[5][3] = 1413;
			this.anIntArrayArray17[4][2] = 1397;
			this.anIntArrayArray17[8][0] = 1736;
			this.anIntArrayArray17[6][3] = 1333;
			this.anIntArrayArray17[5][2] = 1429;
			this.anIntArrayArray17[9][0] = 2088;
			this.anIntArrayArray17[4][1] = 1285;
			this.anIntArrayArray17[5][1] = 1525;
			this.anIntArrayArray17[6][2] = 1461;
			this.anIntArrayArray17[6][1] = 1734;
			this.anIntArrayArray17[10][0] = 2355;
			this.anIntArrayArray17[7][3] = 1702;
			this.anIntArrayArray17[7][1] = 1413;
			this.anIntArrayArray17[11][0] = 2691;
			this.anIntArrayArray17[7][2] = 1525;
			this.anIntArrayArray17[12][0] = 3031;
			this.anIntArrayArray17[13][0] = 3522;
			this.anIntArrayArray17[8][2] = 1590;
			this.anIntArrayArray17[14][0] = 3727;
			this.anIntArrayArray17[15][0] = 4096;
			this.anIntArrayArray17[8][3] = 2056;
			this.anIntArrayArray17[8][1] = 1108;
			this.anIntArrayArray17[9][3] = 2666;
			this.anIntArrayArray17[9][1] = 1766;
			this.anIntArrayArray17[10][1] = 2409;
			this.anIntArrayArray17[11][1] = 3116;
			this.anIntArrayArray17[12][1] = 3806;
			this.anIntArrayArray17[10][3] = 3276;
			this.anIntArrayArray17[9][2] = 2056;
			this.anIntArrayArray17[13][1] = 3437;
			this.anIntArrayArray17[10][2] = 2586;
			this.anIntArrayArray17[14][1] = 3116;
			this.anIntArrayArray17[11][3] = 3228;
			this.anIntArrayArray17[15][1] = 2377;
			this.anIntArrayArray17[11][2] = 3148;
			this.anIntArrayArray17[12][2] = 3710;
			this.anIntArrayArray17[12][3] = 3196;
			this.anIntArrayArray17[13][3] = 3019;
			this.anIntArrayArray17[14][3] = 3228;
			this.anIntArrayArray17[13][2] = 3421;
			this.anIntArrayArray17[15][3] = 2746;
			this.anIntArrayArray17[14][2] = 3148;
			this.anIntArrayArray17[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray17 = new int[4][4];
			this.anIntArrayArray17[0][3] = 0;
			this.anIntArrayArray17[0][0] = 2048;
			this.anIntArrayArray17[1][0] = 2867;
			this.anIntArrayArray17[0][1] = 0;
			this.anIntArrayArray17[0][2] = 4096;
			this.anIntArrayArray17[1][1] = 4096;
			this.anIntArrayArray17[2][0] = 3276;
			this.anIntArrayArray17[1][3] = 0;
			this.anIntArrayArray17[2][1] = 4096;
			this.anIntArrayArray17[1][2] = 4096;
			this.anIntArrayArray17[3][1] = 4096;
			this.anIntArrayArray17[3][0] = 4096;
			this.anIntArrayArray17[2][3] = 0;
			this.anIntArrayArray17[3][3] = 0;
			this.anIntArrayArray17[2][2] = 4096;
			this.anIntArrayArray17[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	@Override
	public void method2992() {
		if (this.anIntArrayArray17 == null) {
			this.method1612(1);
		}
	}
}
