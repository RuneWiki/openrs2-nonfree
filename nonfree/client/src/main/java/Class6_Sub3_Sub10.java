import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class6_Sub3_Sub10 extends Class6_Sub3 {

	@OriginalMember(owner = "client!gv", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!gv", name = "K", descriptor = "[I")
	private final int[] anIntArray345 = new int[257];

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(19) int local19 = arg1.method6041();
		if (local19 != 0) {
			this.method2674(local19);
			return;
		}
		this.anIntArrayArray39 = new int[arg1.method6041()][4];
		for (@Pc(38) int local38 = 0; local38 < this.anIntArrayArray39.length; local38++) {
			this.anIntArrayArray39[local38][0] = arg1.method6006();
			this.anIntArrayArray39[local38][1] = arg1.method6041() << 4;
			this.anIntArrayArray39[local38][2] = arg1.method6041() << 4;
			this.anIntArrayArray39[local38][3] = arg1.method6041() << 4;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)V")
	private void method2674(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray39 = new int[2][4];
			this.anIntArrayArray39[0][0] = 0;
			this.anIntArrayArray39[0][2] = 0;
			this.anIntArrayArray39[0][3] = 0;
			this.anIntArrayArray39[0][1] = 0;
			this.anIntArrayArray39[1][2] = 4096;
			this.anIntArrayArray39[1][1] = 4096;
			this.anIntArrayArray39[1][3] = 4096;
			this.anIntArrayArray39[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray39 = new int[8][4];
			this.anIntArrayArray39[0][1] = 2650;
			this.anIntArrayArray39[0][2] = 2602;
			this.anIntArrayArray39[0][0] = 0;
			this.anIntArrayArray39[0][3] = 2361;
			this.anIntArrayArray39[1][3] = 1558;
			this.anIntArrayArray39[1][1] = 2313;
			this.anIntArrayArray39[1][0] = 2867;
			this.anIntArrayArray39[1][2] = 1799;
			this.anIntArrayArray39[2][2] = 1734;
			this.anIntArrayArray39[2][1] = 2618;
			this.anIntArrayArray39[2][3] = 1413;
			this.anIntArrayArray39[2][0] = 3072;
			this.anIntArrayArray39[3][0] = 3276;
			this.anIntArrayArray39[3][3] = 947;
			this.anIntArrayArray39[3][2] = 1220;
			this.anIntArrayArray39[3][1] = 2296;
			this.anIntArrayArray39[4][2] = 963;
			this.anIntArrayArray39[4][0] = 3481;
			this.anIntArrayArray39[4][1] = 2072;
			this.anIntArrayArray39[4][3] = 722;
			this.anIntArrayArray39[5][1] = 2730;
			this.anIntArrayArray39[5][2] = 2152;
			this.anIntArrayArray39[5][3] = 1766;
			this.anIntArrayArray39[5][0] = 3686;
			this.anIntArrayArray39[6][1] = 2232;
			this.anIntArrayArray39[6][3] = 915;
			this.anIntArrayArray39[6][2] = 1060;
			this.anIntArrayArray39[6][0] = 3891;
			this.anIntArrayArray39[7][2] = 1413;
			this.anIntArrayArray39[7][3] = 1140;
			this.anIntArrayArray39[7][0] = 4096;
			this.anIntArrayArray39[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray39 = new int[7][4];
			this.anIntArrayArray39[0][3] = 4096;
			this.anIntArrayArray39[0][0] = 0;
			this.anIntArrayArray39[0][2] = 0;
			this.anIntArrayArray39[0][1] = 0;
			this.anIntArrayArray39[1][1] = 0;
			this.anIntArrayArray39[1][3] = 4096;
			this.anIntArrayArray39[1][0] = 663;
			this.anIntArrayArray39[1][2] = 4096;
			this.anIntArrayArray39[2][0] = 1363;
			this.anIntArrayArray39[2][1] = 0;
			this.anIntArrayArray39[2][3] = 0;
			this.anIntArrayArray39[2][2] = 4096;
			this.anIntArrayArray39[3][0] = 2048;
			this.anIntArrayArray39[3][2] = 4096;
			this.anIntArrayArray39[3][3] = 0;
			this.anIntArrayArray39[3][1] = 4096;
			this.anIntArrayArray39[4][2] = 0;
			this.anIntArrayArray39[4][1] = 4096;
			this.anIntArrayArray39[4][3] = 0;
			this.anIntArrayArray39[4][0] = 2727;
			this.anIntArrayArray39[5][3] = 4096;
			this.anIntArrayArray39[5][2] = 0;
			this.anIntArrayArray39[5][1] = 4096;
			this.anIntArrayArray39[5][0] = 3411;
			this.anIntArrayArray39[6][2] = 0;
			this.anIntArrayArray39[6][1] = 0;
			this.anIntArrayArray39[6][0] = 4096;
			this.anIntArrayArray39[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray39 = new int[6][4];
			this.anIntArrayArray39[0][2] = 0;
			this.anIntArrayArray39[0][0] = 0;
			this.anIntArrayArray39[0][3] = 0;
			this.anIntArrayArray39[0][1] = 0;
			this.anIntArrayArray39[1][1] = 0;
			this.anIntArrayArray39[1][0] = 1843;
			this.anIntArrayArray39[1][2] = 0;
			this.anIntArrayArray39[1][3] = 1493;
			this.anIntArrayArray39[2][0] = 2457;
			this.anIntArrayArray39[2][1] = 0;
			this.anIntArrayArray39[2][3] = 2939;
			this.anIntArrayArray39[2][2] = 0;
			this.anIntArrayArray39[3][3] = 3565;
			this.anIntArrayArray39[3][1] = 0;
			this.anIntArrayArray39[3][0] = 2781;
			this.anIntArrayArray39[3][2] = 1124;
			this.anIntArrayArray39[4][0] = 3481;
			this.anIntArrayArray39[4][3] = 4031;
			this.anIntArrayArray39[4][1] = 546;
			this.anIntArrayArray39[4][2] = 3084;
			this.anIntArrayArray39[5][0] = 4096;
			this.anIntArrayArray39[5][2] = 4096;
			this.anIntArrayArray39[5][1] = 4096;
			this.anIntArrayArray39[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray39 = new int[16][4];
			this.anIntArrayArray39[0][3] = 321;
			this.anIntArrayArray39[0][1] = 80;
			this.anIntArrayArray39[0][2] = 192;
			this.anIntArrayArray39[0][0] = 0;
			this.anIntArrayArray39[1][1] = 321;
			this.anIntArrayArray39[1][3] = 562;
			this.anIntArrayArray39[1][2] = 449;
			this.anIntArrayArray39[1][0] = 155;
			this.anIntArrayArray39[2][2] = 690;
			this.anIntArrayArray39[2][0] = 389;
			this.anIntArrayArray39[2][3] = 803;
			this.anIntArrayArray39[2][1] = 578;
			this.anIntArrayArray39[3][0] = 671;
			this.anIntArrayArray39[3][3] = 1140;
			this.anIntArrayArray39[3][2] = 995;
			this.anIntArrayArray39[3][1] = 947;
			this.anIntArrayArray39[4][3] = 1509;
			this.anIntArrayArray39[4][0] = 897;
			this.anIntArrayArray39[4][1] = 1285;
			this.anIntArrayArray39[4][2] = 1397;
			this.anIntArrayArray39[5][0] = 1175;
			this.anIntArrayArray39[5][3] = 1413;
			this.anIntArrayArray39[5][2] = 1429;
			this.anIntArrayArray39[5][1] = 1525;
			this.anIntArrayArray39[6][3] = 1333;
			this.anIntArrayArray39[6][1] = 1734;
			this.anIntArrayArray39[6][0] = 1368;
			this.anIntArrayArray39[6][2] = 1461;
			this.anIntArrayArray39[7][3] = 1702;
			this.anIntArrayArray39[7][0] = 1507;
			this.anIntArrayArray39[7][1] = 1413;
			this.anIntArrayArray39[7][2] = 1525;
			this.anIntArrayArray39[8][3] = 2056;
			this.anIntArrayArray39[8][1] = 1108;
			this.anIntArrayArray39[8][0] = 1736;
			this.anIntArrayArray39[8][2] = 1590;
			this.anIntArrayArray39[9][3] = 2666;
			this.anIntArrayArray39[9][0] = 2088;
			this.anIntArrayArray39[9][2] = 2056;
			this.anIntArrayArray39[9][1] = 1766;
			this.anIntArrayArray39[10][1] = 2409;
			this.anIntArrayArray39[10][2] = 2586;
			this.anIntArrayArray39[10][3] = 3276;
			this.anIntArrayArray39[10][0] = 2355;
			this.anIntArrayArray39[11][3] = 3228;
			this.anIntArrayArray39[11][0] = 2691;
			this.anIntArrayArray39[11][2] = 3148;
			this.anIntArrayArray39[11][1] = 3116;
			this.anIntArrayArray39[12][3] = 3196;
			this.anIntArrayArray39[12][1] = 3806;
			this.anIntArrayArray39[12][2] = 3710;
			this.anIntArrayArray39[12][0] = 3031;
			this.anIntArrayArray39[13][1] = 3437;
			this.anIntArrayArray39[13][0] = 3522;
			this.anIntArrayArray39[13][3] = 3019;
			this.anIntArrayArray39[13][2] = 3421;
			this.anIntArrayArray39[14][3] = 3228;
			this.anIntArrayArray39[14][2] = 3148;
			this.anIntArrayArray39[14][0] = 3727;
			this.anIntArrayArray39[14][1] = 3116;
			this.anIntArrayArray39[15][1] = 2377;
			this.anIntArrayArray39[15][0] = 4096;
			this.anIntArrayArray39[15][2] = 2505;
			this.anIntArrayArray39[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray39 = new int[4][4];
			this.anIntArrayArray39[0][3] = 0;
			this.anIntArrayArray39[0][0] = 2048;
			this.anIntArrayArray39[0][1] = 0;
			this.anIntArrayArray39[0][2] = 4096;
			this.anIntArrayArray39[1][3] = 0;
			this.anIntArrayArray39[1][1] = 4096;
			this.anIntArrayArray39[1][2] = 4096;
			this.anIntArrayArray39[1][0] = 2867;
			this.anIntArrayArray39[2][1] = 4096;
			this.anIntArrayArray39[2][2] = 4096;
			this.anIntArrayArray39[2][3] = 0;
			this.anIntArrayArray39[2][0] = 3276;
			this.anIntArrayArray39[3][1] = 4096;
			this.anIntArrayArray39[3][2] = 0;
			this.anIntArrayArray39[3][3] = 0;
			this.anIntArrayArray39[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(21) int[] local21 = this.method7824(0, arg0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static447.anInt8568; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray345[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "(B)V")
	private void method2675() {
		@Pc(17) int local17 = this.anIntArrayArray39.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = local24 << 4;
			for (@Pc(34) int local34 = 0; local17 > local34 && local32 >= this.anIntArrayArray39[local34][0]; local34++) {
				local28++;
			}
			@Pc(139) int local139;
			@Pc(110) int local110;
			@Pc(124) int local124;
			@Pc(61) int[] local61;
			if (local28 < local17) {
				local61 = this.anIntArrayArray39[local28];
				if (local28 > 0) {
					@Pc(73) int[] local73 = this.anIntArrayArray39[local28 - 1];
					@Pc(91) int local91 = (local32 - local73[0] << 12) / (local61[0] - local73[0]);
					@Pc(96) int local96 = 4096 - local91;
					local110 = local73[2] * local96 + local91 * local61[2] >> 12;
					local124 = local96 * local73[3] + local91 * local61[3] >> 12;
					local139 = local91 * local61[1] + local96 * local73[1] >> 12;
				} else {
					local124 = local61[3];
					local139 = local61[1];
					local110 = local61[2];
				}
			} else {
				local61 = this.anIntArrayArray39[local17 - 1];
				local124 = local61[3];
				local110 = local61[2];
				local139 = local61[1];
			}
			local110 >>= 0x4;
			local139 >>= 0x4;
			local124 >>= 0x4;
			if (local110 < 0) {
				local110 = 0;
			} else if (local110 > 255) {
				local110 = 255;
			}
			if (local139 < 0) {
				local139 = 0;
			} else if (local139 > 255) {
				local139 = 255;
			}
			if (local124 < 0) {
				local124 = 0;
			} else if (local124 > 255) {
				local124 = 255;
			}
			this.anIntArray345[local24] = local110 << 8 | local139 << 16 | local124;
		}
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
		if (this.anIntArrayArray39 == null) {
			this.method2674(1);
		}
		this.method2675();
	}
}
