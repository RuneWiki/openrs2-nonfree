import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ab", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
	@Override
	public void method3131() {
		if (this.anIntArrayArray1 == null) {
			this.method67(1);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(24) int local24 = this.anIntArrayArray1.length;
			@Pc(30) int[] local30 = this.method3120(0, arg0);
			@Pc(34) int[] local34 = local16[2];
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int local46;
			if (local24 <= 0) {
				for (local46 = 0; local46 < Static129.anInt3285; local46++) {
					local38[local46] = 0;
					local42[local46] = 0;
					local34[local46] = 0;
				}
			} else {
				for (local46 = 0; local46 < Static129.anInt3285; local46++) {
					@Pc(74) int local74 = local30[local46];
					@Pc(76) int local76 = 0;
					for (@Pc(78) int local78 = 0; local78 < local24 && this.anIntArrayArray1[local78][0] <= local74; local78++) {
						local76++;
					}
					@Pc(105) int[] local105;
					if (local76 < local24) {
						local105 = this.anIntArrayArray1[local76];
						if (local76 > 0) {
							@Pc(114) int[] local114 = this.anIntArrayArray1[local76 - 1];
							@Pc(132) int local132 = (local74 - local114[0] << 12) / (local105[0] - local114[0]);
							@Pc(137) int local137 = 4096 - local132;
							local38[local46] = local132 * local105[1] + local114[1] * local137 >> 12;
							local42[local46] = local114[2] * local137 + local105[2] * local132 >> 12;
							local34[local46] = local114[3] * local137 + local132 * local105[3] >> 12;
						} else {
							local38[local46] = local105[1];
							local42[local46] = local105[2];
							local34[local46] = local105[3];
						}
					} else {
						local105 = this.anIntArrayArray1[local24 - 1];
						local38[local46] = local105[1];
						local42[local46] = local105[2];
						local34[local46] = local105[3];
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(7) int local7 = arg1.method1545();
		if (local7 != 0) {
			this.method67(local7);
			return;
		}
		this.anIntArrayArray1 = new int[arg1.method1545()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray1.length; local21++) {
			this.anIntArrayArray1[local21][0] = arg1.method1510();
			this.anIntArrayArray1[local21][1] = arg1.method1545() << 4;
			this.anIntArrayArray1[local21][2] = arg1.method1545() << 4;
			this.anIntArrayArray1[local21][3] = arg1.method1545() << 4;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	private void method67(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray1 = new int[2][4];
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[1][1] = 4096;
			this.anIntArrayArray1[0][3] = 0;
			this.anIntArrayArray1[1][3] = 4096;
			this.anIntArrayArray1[1][0] = 4096;
			this.anIntArrayArray1[0][2] = 0;
			this.anIntArrayArray1[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray1 = new int[8][4];
			this.anIntArrayArray1[0][3] = 2361;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[1][0] = 2867;
			this.anIntArrayArray1[0][2] = 2602;
			this.anIntArrayArray1[2][0] = 3072;
			this.anIntArrayArray1[1][2] = 1799;
			this.anIntArrayArray1[2][2] = 1734;
			this.anIntArrayArray1[3][0] = 3276;
			this.anIntArrayArray1[1][3] = 1558;
			this.anIntArrayArray1[4][0] = 3481;
			this.anIntArrayArray1[0][1] = 2650;
			this.anIntArrayArray1[5][0] = 3686;
			this.anIntArrayArray1[1][1] = 2313;
			this.anIntArrayArray1[6][0] = 3891;
			this.anIntArrayArray1[2][1] = 2618;
			this.anIntArrayArray1[2][3] = 1413;
			this.anIntArrayArray1[7][0] = 4096;
			this.anIntArrayArray1[3][3] = 947;
			this.anIntArrayArray1[3][1] = 2296;
			this.anIntArrayArray1[4][3] = 722;
			this.anIntArrayArray1[4][1] = 2072;
			this.anIntArrayArray1[5][3] = 1766;
			this.anIntArrayArray1[5][1] = 2730;
			this.anIntArrayArray1[6][1] = 2232;
			this.anIntArrayArray1[7][1] = 1686;
			this.anIntArrayArray1[6][3] = 915;
			this.anIntArrayArray1[3][2] = 1220;
			this.anIntArrayArray1[4][2] = 963;
			this.anIntArrayArray1[7][3] = 1140;
			this.anIntArrayArray1[5][2] = 2152;
			this.anIntArrayArray1[6][2] = 1060;
			this.anIntArrayArray1[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray1 = new int[7][4];
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[0][2] = 0;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[1][2] = 4096;
			this.anIntArrayArray1[1][0] = 663;
			this.anIntArrayArray1[0][3] = 4096;
			this.anIntArrayArray1[1][3] = 4096;
			this.anIntArrayArray1[2][2] = 4096;
			this.anIntArrayArray1[1][1] = 0;
			this.anIntArrayArray1[3][2] = 4096;
			this.anIntArrayArray1[4][2] = 0;
			this.anIntArrayArray1[2][1] = 0;
			this.anIntArrayArray1[3][1] = 4096;
			this.anIntArrayArray1[2][3] = 0;
			this.anIntArrayArray1[4][1] = 4096;
			this.anIntArrayArray1[5][2] = 0;
			this.anIntArrayArray1[2][0] = 1363;
			this.anIntArrayArray1[6][2] = 0;
			this.anIntArrayArray1[5][1] = 4096;
			this.anIntArrayArray1[3][3] = 0;
			this.anIntArrayArray1[4][3] = 0;
			this.anIntArrayArray1[6][1] = 0;
			this.anIntArrayArray1[3][0] = 2048;
			this.anIntArrayArray1[5][3] = 4096;
			this.anIntArrayArray1[6][3] = 4096;
			this.anIntArrayArray1[4][0] = 2727;
			this.anIntArrayArray1[5][0] = 3411;
			this.anIntArrayArray1[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray1 = new int[6][4];
			this.anIntArrayArray1[0][3] = 0;
			this.anIntArrayArray1[1][3] = 1493;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[2][3] = 2939;
			this.anIntArrayArray1[3][3] = 3565;
			this.anIntArrayArray1[4][3] = 4031;
			this.anIntArrayArray1[1][0] = 1843;
			this.anIntArrayArray1[5][3] = 4096;
			this.anIntArrayArray1[0][2] = 0;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[1][1] = 0;
			this.anIntArrayArray1[2][0] = 2457;
			this.anIntArrayArray1[1][2] = 0;
			this.anIntArrayArray1[2][1] = 0;
			this.anIntArrayArray1[3][0] = 2781;
			this.anIntArrayArray1[2][2] = 0;
			this.anIntArrayArray1[3][2] = 1124;
			this.anIntArrayArray1[3][1] = 0;
			this.anIntArrayArray1[4][1] = 546;
			this.anIntArrayArray1[4][0] = 3481;
			this.anIntArrayArray1[5][0] = 4096;
			this.anIntArrayArray1[5][1] = 4096;
			this.anIntArrayArray1[4][2] = 3084;
			this.anIntArrayArray1[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray1 = new int[16][4];
			this.anIntArrayArray1[0][3] = 321;
			this.anIntArrayArray1[0][1] = 80;
			this.anIntArrayArray1[1][3] = 562;
			this.anIntArrayArray1[1][1] = 321;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[0][2] = 192;
			this.anIntArrayArray1[2][1] = 578;
			this.anIntArrayArray1[1][2] = 449;
			this.anIntArrayArray1[2][2] = 690;
			this.anIntArrayArray1[1][0] = 155;
			this.anIntArrayArray1[3][1] = 947;
			this.anIntArrayArray1[3][2] = 995;
			this.anIntArrayArray1[4][2] = 1397;
			this.anIntArrayArray1[2][3] = 803;
			this.anIntArrayArray1[3][3] = 1140;
			this.anIntArrayArray1[4][3] = 1509;
			this.anIntArrayArray1[5][3] = 1413;
			this.anIntArrayArray1[6][3] = 1333;
			this.anIntArrayArray1[7][3] = 1702;
			this.anIntArrayArray1[2][0] = 389;
			this.anIntArrayArray1[4][1] = 1285;
			this.anIntArrayArray1[5][2] = 1429;
			this.anIntArrayArray1[5][1] = 1525;
			this.anIntArrayArray1[6][2] = 1461;
			this.anIntArrayArray1[7][2] = 1525;
			this.anIntArrayArray1[6][1] = 1734;
			this.anIntArrayArray1[8][2] = 1590;
			this.anIntArrayArray1[8][3] = 2056;
			this.anIntArrayArray1[9][2] = 2056;
			this.anIntArrayArray1[10][2] = 2586;
			this.anIntArrayArray1[7][1] = 1413;
			this.anIntArrayArray1[11][2] = 3148;
			this.anIntArrayArray1[3][0] = 671;
			this.anIntArrayArray1[8][1] = 1108;
			this.anIntArrayArray1[4][0] = 897;
			this.anIntArrayArray1[9][3] = 2666;
			this.anIntArrayArray1[10][3] = 3276;
			this.anIntArrayArray1[9][1] = 1766;
			this.anIntArrayArray1[12][2] = 3710;
			this.anIntArrayArray1[13][2] = 3421;
			this.anIntArrayArray1[5][0] = 1175;
			this.anIntArrayArray1[10][1] = 2409;
			this.anIntArrayArray1[11][1] = 3116;
			this.anIntArrayArray1[11][3] = 3228;
			this.anIntArrayArray1[12][3] = 3196;
			this.anIntArrayArray1[13][3] = 3019;
			this.anIntArrayArray1[6][0] = 1368;
			this.anIntArrayArray1[14][3] = 3228;
			this.anIntArrayArray1[12][1] = 3806;
			this.anIntArrayArray1[14][2] = 3148;
			this.anIntArrayArray1[15][3] = 2746;
			this.anIntArrayArray1[7][0] = 1507;
			this.anIntArrayArray1[15][2] = 2505;
			this.anIntArrayArray1[8][0] = 1736;
			this.anIntArrayArray1[9][0] = 2088;
			this.anIntArrayArray1[10][0] = 2355;
			this.anIntArrayArray1[13][1] = 3437;
			this.anIntArrayArray1[11][0] = 2691;
			this.anIntArrayArray1[12][0] = 3031;
			this.anIntArrayArray1[14][1] = 3116;
			this.anIntArrayArray1[13][0] = 3522;
			this.anIntArrayArray1[14][0] = 3727;
			this.anIntArrayArray1[15][1] = 2377;
			this.anIntArrayArray1[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray1 = new int[4][4];
			this.anIntArrayArray1[0][3] = 0;
			this.anIntArrayArray1[0][2] = 4096;
			this.anIntArrayArray1[0][0] = 2048;
			this.anIntArrayArray1[1][0] = 2867;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[1][1] = 4096;
			this.anIntArrayArray1[1][3] = 0;
			this.anIntArrayArray1[1][2] = 4096;
			this.anIntArrayArray1[2][0] = 3276;
			this.anIntArrayArray1[2][1] = 4096;
			this.anIntArrayArray1[3][1] = 4096;
			this.anIntArrayArray1[2][2] = 4096;
			this.anIntArrayArray1[2][3] = 0;
			this.anIntArrayArray1[3][2] = 0;
			this.anIntArrayArray1[3][3] = 0;
			this.anIntArrayArray1[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
