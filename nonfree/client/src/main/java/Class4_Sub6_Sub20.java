import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class4_Sub6_Sub20 extends Class4_Sub6 {

	@OriginalMember(owner = "client!mf", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray104;

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "[I")
	private final int[] anIntArray341 = new int[257];

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(IB)V")
	private void method3690(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray104 = new int[2][4];
			this.anIntArrayArray104[0][1] = 0;
			this.anIntArrayArray104[0][3] = 0;
			this.anIntArrayArray104[0][2] = 0;
			this.anIntArrayArray104[0][0] = 0;
			this.anIntArrayArray104[1][3] = 4096;
			this.anIntArrayArray104[1][1] = 4096;
			this.anIntArrayArray104[1][2] = 4096;
			this.anIntArrayArray104[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray104 = new int[8][4];
			this.anIntArrayArray104[0][2] = 2602;
			this.anIntArrayArray104[0][0] = 0;
			this.anIntArrayArray104[0][3] = 2361;
			this.anIntArrayArray104[0][1] = 2650;
			this.anIntArrayArray104[1][1] = 2313;
			this.anIntArrayArray104[1][2] = 1799;
			this.anIntArrayArray104[1][3] = 1558;
			this.anIntArrayArray104[1][0] = 2867;
			this.anIntArrayArray104[2][2] = 1734;
			this.anIntArrayArray104[2][3] = 1413;
			this.anIntArrayArray104[2][0] = 3072;
			this.anIntArrayArray104[2][1] = 2618;
			this.anIntArrayArray104[3][1] = 2296;
			this.anIntArrayArray104[3][0] = 3276;
			this.anIntArrayArray104[3][2] = 1220;
			this.anIntArrayArray104[3][3] = 947;
			this.anIntArrayArray104[4][1] = 2072;
			this.anIntArrayArray104[4][2] = 963;
			this.anIntArrayArray104[4][3] = 722;
			this.anIntArrayArray104[4][0] = 3481;
			this.anIntArrayArray104[5][0] = 3686;
			this.anIntArrayArray104[5][3] = 1766;
			this.anIntArrayArray104[5][1] = 2730;
			this.anIntArrayArray104[5][2] = 2152;
			this.anIntArrayArray104[6][2] = 1060;
			this.anIntArrayArray104[6][3] = 915;
			this.anIntArrayArray104[6][1] = 2232;
			this.anIntArrayArray104[6][0] = 3891;
			this.anIntArrayArray104[7][3] = 1140;
			this.anIntArrayArray104[7][0] = 4096;
			this.anIntArrayArray104[7][2] = 1413;
			this.anIntArrayArray104[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray104 = new int[7][4];
			this.anIntArrayArray104[0][1] = 0;
			this.anIntArrayArray104[0][2] = 0;
			this.anIntArrayArray104[0][0] = 0;
			this.anIntArrayArray104[0][3] = 4096;
			this.anIntArrayArray104[1][3] = 4096;
			this.anIntArrayArray104[1][1] = 0;
			this.anIntArrayArray104[1][2] = 4096;
			this.anIntArrayArray104[1][0] = 663;
			this.anIntArrayArray104[2][0] = 1363;
			this.anIntArrayArray104[2][2] = 4096;
			this.anIntArrayArray104[2][3] = 0;
			this.anIntArrayArray104[2][1] = 0;
			this.anIntArrayArray104[3][2] = 4096;
			this.anIntArrayArray104[3][0] = 2048;
			this.anIntArrayArray104[3][1] = 4096;
			this.anIntArrayArray104[3][3] = 0;
			this.anIntArrayArray104[4][2] = 0;
			this.anIntArrayArray104[4][0] = 2727;
			this.anIntArrayArray104[4][1] = 4096;
			this.anIntArrayArray104[4][3] = 0;
			this.anIntArrayArray104[5][1] = 4096;
			this.anIntArrayArray104[5][3] = 4096;
			this.anIntArrayArray104[5][2] = 0;
			this.anIntArrayArray104[5][0] = 3411;
			this.anIntArrayArray104[6][1] = 0;
			this.anIntArrayArray104[6][3] = 4096;
			this.anIntArrayArray104[6][0] = 4096;
			this.anIntArrayArray104[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray104 = new int[6][4];
			this.anIntArrayArray104[0][3] = 0;
			this.anIntArrayArray104[0][0] = 0;
			this.anIntArrayArray104[0][2] = 0;
			this.anIntArrayArray104[0][1] = 0;
			this.anIntArrayArray104[1][1] = 0;
			this.anIntArrayArray104[1][2] = 0;
			this.anIntArrayArray104[1][3] = 1493;
			this.anIntArrayArray104[1][0] = 1843;
			this.anIntArrayArray104[2][1] = 0;
			this.anIntArrayArray104[2][3] = 2939;
			this.anIntArrayArray104[2][2] = 0;
			this.anIntArrayArray104[2][0] = 2457;
			this.anIntArrayArray104[3][2] = 1124;
			this.anIntArrayArray104[3][3] = 3565;
			this.anIntArrayArray104[3][1] = 0;
			this.anIntArrayArray104[3][0] = 2781;
			this.anIntArrayArray104[4][0] = 3481;
			this.anIntArrayArray104[4][2] = 3084;
			this.anIntArrayArray104[4][3] = 4031;
			this.anIntArrayArray104[4][1] = 546;
			this.anIntArrayArray104[5][2] = 4096;
			this.anIntArrayArray104[5][1] = 4096;
			this.anIntArrayArray104[5][3] = 4096;
			this.anIntArrayArray104[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray104 = new int[16][4];
			this.anIntArrayArray104[0][3] = 321;
			this.anIntArrayArray104[0][2] = 192;
			this.anIntArrayArray104[0][1] = 80;
			this.anIntArrayArray104[0][0] = 0;
			this.anIntArrayArray104[1][1] = 321;
			this.anIntArrayArray104[1][3] = 562;
			this.anIntArrayArray104[1][2] = 449;
			this.anIntArrayArray104[1][0] = 155;
			this.anIntArrayArray104[2][3] = 803;
			this.anIntArrayArray104[2][1] = 578;
			this.anIntArrayArray104[2][2] = 690;
			this.anIntArrayArray104[2][0] = 389;
			this.anIntArrayArray104[3][3] = 1140;
			this.anIntArrayArray104[3][2] = 995;
			this.anIntArrayArray104[3][0] = 671;
			this.anIntArrayArray104[3][1] = 947;
			this.anIntArrayArray104[4][1] = 1285;
			this.anIntArrayArray104[4][0] = 897;
			this.anIntArrayArray104[4][2] = 1397;
			this.anIntArrayArray104[4][3] = 1509;
			this.anIntArrayArray104[5][0] = 1175;
			this.anIntArrayArray104[5][2] = 1429;
			this.anIntArrayArray104[5][1] = 1525;
			this.anIntArrayArray104[5][3] = 1413;
			this.anIntArrayArray104[6][0] = 1368;
			this.anIntArrayArray104[6][2] = 1461;
			this.anIntArrayArray104[6][1] = 1734;
			this.anIntArrayArray104[6][3] = 1333;
			this.anIntArrayArray104[7][1] = 1413;
			this.anIntArrayArray104[7][2] = 1525;
			this.anIntArrayArray104[7][0] = 1507;
			this.anIntArrayArray104[7][3] = 1702;
			this.anIntArrayArray104[8][2] = 1590;
			this.anIntArrayArray104[8][1] = 1108;
			this.anIntArrayArray104[8][3] = 2056;
			this.anIntArrayArray104[8][0] = 1736;
			this.anIntArrayArray104[9][3] = 2666;
			this.anIntArrayArray104[9][0] = 2088;
			this.anIntArrayArray104[9][1] = 1766;
			this.anIntArrayArray104[9][2] = 2056;
			this.anIntArrayArray104[10][1] = 2409;
			this.anIntArrayArray104[10][3] = 3276;
			this.anIntArrayArray104[10][2] = 2586;
			this.anIntArrayArray104[10][0] = 2355;
			this.anIntArrayArray104[11][1] = 3116;
			this.anIntArrayArray104[11][2] = 3148;
			this.anIntArrayArray104[11][3] = 3228;
			this.anIntArrayArray104[11][0] = 2691;
			this.anIntArrayArray104[12][2] = 3710;
			this.anIntArrayArray104[12][0] = 3031;
			this.anIntArrayArray104[12][1] = 3806;
			this.anIntArrayArray104[12][3] = 3196;
			this.anIntArrayArray104[13][2] = 3421;
			this.anIntArrayArray104[13][3] = 3019;
			this.anIntArrayArray104[13][0] = 3522;
			this.anIntArrayArray104[13][1] = 3437;
			this.anIntArrayArray104[14][3] = 3228;
			this.anIntArrayArray104[14][1] = 3116;
			this.anIntArrayArray104[14][0] = 3727;
			this.anIntArrayArray104[14][2] = 3148;
			this.anIntArrayArray104[15][0] = 4096;
			this.anIntArrayArray104[15][3] = 2746;
			this.anIntArrayArray104[15][1] = 2377;
			this.anIntArrayArray104[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray104 = new int[4][4];
			this.anIntArrayArray104[0][3] = 0;
			this.anIntArrayArray104[0][0] = 2048;
			this.anIntArrayArray104[0][1] = 0;
			this.anIntArrayArray104[0][2] = 4096;
			this.anIntArrayArray104[1][1] = 4096;
			this.anIntArrayArray104[1][0] = 2867;
			this.anIntArrayArray104[1][3] = 0;
			this.anIntArrayArray104[1][2] = 4096;
			this.anIntArrayArray104[2][0] = 3276;
			this.anIntArrayArray104[2][1] = 4096;
			this.anIntArrayArray104[2][3] = 0;
			this.anIntArrayArray104[2][2] = 4096;
			this.anIntArrayArray104[3][0] = 4096;
			this.anIntArrayArray104[3][3] = 0;
			this.anIntArrayArray104[3][2] = 0;
			this.anIntArrayArray104[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "(B)V")
	private void method3691() {
		@Pc(13) int local13 = this.anIntArrayArray104.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local27 < local13 && local25 >= this.anIntArrayArray104[local27][0]; local27++) {
				local21++;
			}
			@Pc(99) int local99;
			@Pc(128) int local128;
			@Pc(114) int local114;
			@Pc(54) int[] local54;
			if (local13 > local21) {
				local54 = this.anIntArrayArray104[local21];
				if (local21 > 0) {
					@Pc(63) int[] local63 = this.anIntArrayArray104[local21 - 1];
					@Pc(81) int local81 = (local25 - local63[0] << 12) / (local54[0] - local63[0]);
					@Pc(85) int local85 = 4096 - local81;
					local99 = local54[1] * local81 + local63[1] * local85 >> 12;
					local114 = local81 * local54[3] + local63[3] * local85 >> 12;
					local128 = local81 * local54[2] + local85 * local63[2] >> 12;
				} else {
					local128 = local54[2];
					local99 = local54[1];
					local114 = local54[3];
				}
			} else {
				local54 = this.anIntArrayArray104[local13 - 1];
				local114 = local54[3];
				local128 = local54[2];
				local99 = local54[1];
			}
			local114 >>= 0x4;
			local99 >>= 0x4;
			local128 >>= 0x4;
			if (local114 < 0) {
				local114 = 0;
			} else if (local114 > 255) {
				local114 = 255;
			}
			if (local99 < 0) {
				local99 = 0;
			} else if (local99 > 255) {
				local99 = 255;
			}
			if (local128 < 0) {
				local128 = 0;
			} else if (local128 > 255) {
				local128 = 255;
			}
			this.anIntArray341[local17] = local114 | local99 << 16 | local128 << 8;
		}
	}

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
		if (this.anIntArrayArray104 == null) {
			this.method3690(1);
		}
		this.method3691();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(21) int[] local21 = this.method5702(arg0, 0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static31.anInt797; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray341[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(18) int local18 = arg1.method3440();
		if (local18 != 0) {
			this.method3690(local18);
			return;
		}
		this.anIntArrayArray104 = new int[arg1.method3440()][4];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray104.length; local32++) {
			this.anIntArrayArray104[local32][0] = arg1.method3401();
			this.anIntArrayArray104[local32][1] = arg1.method3440() << 4;
			this.anIntArrayArray104[local32][2] = arg1.method3440() << 4;
			this.anIntArrayArray104[local32][3] = arg1.method3440() << 4;
		}
	}
}
