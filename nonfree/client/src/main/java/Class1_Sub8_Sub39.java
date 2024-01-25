import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class1_Sub8_Sub39 extends Class1_Sub8 {

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "[I")
	private final int[] anIntArray741 = new int[257];

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
		if (this.anIntArrayArray61 == null) {
			this.method6044(1);
		}
		this.method6041();
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
	private void method6041() {
		@Pc(9) int local9 = this.anIntArrayArray61.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < 257; local14++) {
			@Pc(18) int local18 = 0;
			@Pc(22) int local22 = local14 << 4;
			for (@Pc(24) int local24 = 0; local24 < local9 && this.anIntArrayArray61[local24][0] <= local22; local24++) {
				local18++;
			}
			@Pc(117) int local117;
			@Pc(103) int local103;
			@Pc(131) int local131;
			@Pc(55) int[] local55;
			if (local9 > local18) {
				local55 = this.anIntArrayArray61[local18];
				if (local18 > 0) {
					@Pc(67) int[] local67 = this.anIntArrayArray61[local18 - 1];
					@Pc(85) int local85 = (local22 - local67[0] << 12) / (local55[0] - local67[0]);
					@Pc(89) int local89 = 4096 - local85;
					local103 = local85 * local55[2] + local89 * local67[2] >> 12;
					local117 = local85 * local55[1] + local89 * local67[1] >> 12;
					local131 = local89 * local67[3] + local55[3] * local85 >> 12;
				} else {
					local131 = local55[3];
					local117 = local55[1];
					local103 = local55[2];
				}
			} else {
				local55 = this.anIntArrayArray61[local9 - 1];
				local131 = local55[3];
				local117 = local55[1];
				local103 = local55[2];
			}
			local103 >>= 0x4;
			local131 >>= 0x4;
			local117 >>= 0x4;
			if (local131 < 0) {
				local131 = 0;
			} else if (local131 > 255) {
				local131 = 255;
			}
			if (local117 < 0) {
				local117 = 0;
			} else if (local117 > 255) {
				local117 = 255;
			}
			if (local103 < 0) {
				local103 = 0;
			} else if (local103 > 255) {
				local103 = 255;
			}
			this.anIntArray741[local14] = local131 | local117 << 16 | local103 << 8;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(29) int[] local29 = this.method6037(0, arg0);
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[2];
			for (@Pc(43) int local43 = 0; local43 < Static18.anInt439; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray741[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(II)V")
	private void method6044(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray61 = new int[2][4];
			this.anIntArrayArray61[0][0] = 0;
			this.anIntArrayArray61[0][1] = 0;
			this.anIntArrayArray61[0][2] = 0;
			this.anIntArrayArray61[0][3] = 0;
			this.anIntArrayArray61[1][0] = 4096;
			this.anIntArrayArray61[1][1] = 4096;
			this.anIntArrayArray61[1][3] = 4096;
			this.anIntArrayArray61[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray61 = new int[8][4];
			this.anIntArrayArray61[0][0] = 0;
			this.anIntArrayArray61[0][2] = 2602;
			this.anIntArrayArray61[0][1] = 2650;
			this.anIntArrayArray61[0][3] = 2361;
			this.anIntArrayArray61[1][3] = 1558;
			this.anIntArrayArray61[1][0] = 2867;
			this.anIntArrayArray61[1][2] = 1799;
			this.anIntArrayArray61[1][1] = 2313;
			this.anIntArrayArray61[2][3] = 1413;
			this.anIntArrayArray61[2][1] = 2618;
			this.anIntArrayArray61[2][2] = 1734;
			this.anIntArrayArray61[2][0] = 3072;
			this.anIntArrayArray61[3][1] = 2296;
			this.anIntArrayArray61[3][0] = 3276;
			this.anIntArrayArray61[3][2] = 1220;
			this.anIntArrayArray61[3][3] = 947;
			this.anIntArrayArray61[4][2] = 963;
			this.anIntArrayArray61[4][0] = 3481;
			this.anIntArrayArray61[4][3] = 722;
			this.anIntArrayArray61[4][1] = 2072;
			this.anIntArrayArray61[5][3] = 1766;
			this.anIntArrayArray61[5][2] = 2152;
			this.anIntArrayArray61[5][0] = 3686;
			this.anIntArrayArray61[5][1] = 2730;
			this.anIntArrayArray61[6][0] = 3891;
			this.anIntArrayArray61[6][1] = 2232;
			this.anIntArrayArray61[6][2] = 1060;
			this.anIntArrayArray61[6][3] = 915;
			this.anIntArrayArray61[7][3] = 1140;
			this.anIntArrayArray61[7][2] = 1413;
			this.anIntArrayArray61[7][1] = 1686;
			this.anIntArrayArray61[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray61 = new int[7][4];
			this.anIntArrayArray61[0][0] = 0;
			this.anIntArrayArray61[0][2] = 0;
			this.anIntArrayArray61[0][1] = 0;
			this.anIntArrayArray61[0][3] = 4096;
			this.anIntArrayArray61[1][3] = 4096;
			this.anIntArrayArray61[1][0] = 663;
			this.anIntArrayArray61[1][1] = 0;
			this.anIntArrayArray61[1][2] = 4096;
			this.anIntArrayArray61[2][2] = 4096;
			this.anIntArrayArray61[2][3] = 0;
			this.anIntArrayArray61[2][1] = 0;
			this.anIntArrayArray61[2][0] = 1363;
			this.anIntArrayArray61[3][3] = 0;
			this.anIntArrayArray61[3][0] = 2048;
			this.anIntArrayArray61[3][1] = 4096;
			this.anIntArrayArray61[3][2] = 4096;
			this.anIntArrayArray61[4][1] = 4096;
			this.anIntArrayArray61[4][3] = 0;
			this.anIntArrayArray61[4][0] = 2727;
			this.anIntArrayArray61[4][2] = 0;
			this.anIntArrayArray61[5][1] = 4096;
			this.anIntArrayArray61[5][2] = 0;
			this.anIntArrayArray61[5][3] = 4096;
			this.anIntArrayArray61[5][0] = 3411;
			this.anIntArrayArray61[6][1] = 0;
			this.anIntArrayArray61[6][3] = 4096;
			this.anIntArrayArray61[6][0] = 4096;
			this.anIntArrayArray61[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray61 = new int[6][4];
			this.anIntArrayArray61[0][1] = 0;
			this.anIntArrayArray61[0][3] = 0;
			this.anIntArrayArray61[0][0] = 0;
			this.anIntArrayArray61[0][2] = 0;
			this.anIntArrayArray61[1][3] = 1493;
			this.anIntArrayArray61[1][0] = 1843;
			this.anIntArrayArray61[1][1] = 0;
			this.anIntArrayArray61[1][2] = 0;
			this.anIntArrayArray61[2][1] = 0;
			this.anIntArrayArray61[2][3] = 2939;
			this.anIntArrayArray61[2][2] = 0;
			this.anIntArrayArray61[2][0] = 2457;
			this.anIntArrayArray61[3][2] = 1124;
			this.anIntArrayArray61[3][1] = 0;
			this.anIntArrayArray61[3][3] = 3565;
			this.anIntArrayArray61[3][0] = 2781;
			this.anIntArrayArray61[4][3] = 4031;
			this.anIntArrayArray61[4][0] = 3481;
			this.anIntArrayArray61[4][1] = 546;
			this.anIntArrayArray61[4][2] = 3084;
			this.anIntArrayArray61[5][0] = 4096;
			this.anIntArrayArray61[5][3] = 4096;
			this.anIntArrayArray61[5][2] = 4096;
			this.anIntArrayArray61[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray61 = new int[16][4];
			this.anIntArrayArray61[0][0] = 0;
			this.anIntArrayArray61[0][1] = 80;
			this.anIntArrayArray61[0][2] = 192;
			this.anIntArrayArray61[0][3] = 321;
			this.anIntArrayArray61[1][2] = 449;
			this.anIntArrayArray61[1][1] = 321;
			this.anIntArrayArray61[1][0] = 155;
			this.anIntArrayArray61[1][3] = 562;
			this.anIntArrayArray61[2][1] = 578;
			this.anIntArrayArray61[2][0] = 389;
			this.anIntArrayArray61[2][3] = 803;
			this.anIntArrayArray61[2][2] = 690;
			this.anIntArrayArray61[3][1] = 947;
			this.anIntArrayArray61[3][0] = 671;
			this.anIntArrayArray61[3][3] = 1140;
			this.anIntArrayArray61[3][2] = 995;
			this.anIntArrayArray61[4][0] = 897;
			this.anIntArrayArray61[4][3] = 1509;
			this.anIntArrayArray61[4][1] = 1285;
			this.anIntArrayArray61[4][2] = 1397;
			this.anIntArrayArray61[5][1] = 1525;
			this.anIntArrayArray61[5][0] = 1175;
			this.anIntArrayArray61[5][3] = 1413;
			this.anIntArrayArray61[5][2] = 1429;
			this.anIntArrayArray61[6][0] = 1368;
			this.anIntArrayArray61[6][1] = 1734;
			this.anIntArrayArray61[6][2] = 1461;
			this.anIntArrayArray61[6][3] = 1333;
			this.anIntArrayArray61[7][0] = 1507;
			this.anIntArrayArray61[7][2] = 1525;
			this.anIntArrayArray61[7][1] = 1413;
			this.anIntArrayArray61[7][3] = 1702;
			this.anIntArrayArray61[8][2] = 1590;
			this.anIntArrayArray61[8][3] = 2056;
			this.anIntArrayArray61[8][0] = 1736;
			this.anIntArrayArray61[8][1] = 1108;
			this.anIntArrayArray61[9][0] = 2088;
			this.anIntArrayArray61[9][1] = 1766;
			this.anIntArrayArray61[9][3] = 2666;
			this.anIntArrayArray61[9][2] = 2056;
			this.anIntArrayArray61[10][2] = 2586;
			this.anIntArrayArray61[10][1] = 2409;
			this.anIntArrayArray61[10][3] = 3276;
			this.anIntArrayArray61[10][0] = 2355;
			this.anIntArrayArray61[11][1] = 3116;
			this.anIntArrayArray61[11][2] = 3148;
			this.anIntArrayArray61[11][0] = 2691;
			this.anIntArrayArray61[11][3] = 3228;
			this.anIntArrayArray61[12][0] = 3031;
			this.anIntArrayArray61[12][1] = 3806;
			this.anIntArrayArray61[12][2] = 3710;
			this.anIntArrayArray61[12][3] = 3196;
			this.anIntArrayArray61[13][0] = 3522;
			this.anIntArrayArray61[13][3] = 3019;
			this.anIntArrayArray61[13][2] = 3421;
			this.anIntArrayArray61[13][1] = 3437;
			this.anIntArrayArray61[14][0] = 3727;
			this.anIntArrayArray61[14][1] = 3116;
			this.anIntArrayArray61[14][3] = 3228;
			this.anIntArrayArray61[14][2] = 3148;
			this.anIntArrayArray61[15][1] = 2377;
			this.anIntArrayArray61[15][3] = 2746;
			this.anIntArrayArray61[15][0] = 4096;
			this.anIntArrayArray61[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray61 = new int[4][4];
			this.anIntArrayArray61[0][3] = 0;
			this.anIntArrayArray61[0][0] = 2048;
			this.anIntArrayArray61[0][1] = 0;
			this.anIntArrayArray61[0][2] = 4096;
			this.anIntArrayArray61[1][3] = 0;
			this.anIntArrayArray61[1][2] = 4096;
			this.anIntArrayArray61[1][0] = 2867;
			this.anIntArrayArray61[1][1] = 4096;
			this.anIntArrayArray61[2][2] = 4096;
			this.anIntArrayArray61[2][0] = 3276;
			this.anIntArrayArray61[2][3] = 0;
			this.anIntArrayArray61[2][1] = 4096;
			this.anIntArrayArray61[3][3] = 0;
			this.anIntArrayArray61[3][2] = 0;
			this.anIntArrayArray61[3][0] = 4096;
			this.anIntArrayArray61[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(15) int local15 = arg1.method1171();
		if (local15 != 0) {
			this.method6044(local15);
			return;
		}
		this.anIntArrayArray61 = new int[arg1.method1171()][4];
		for (@Pc(34) int local34 = 0; local34 < this.anIntArrayArray61.length; local34++) {
			this.anIntArrayArray61[local34][0] = arg1.method1177();
			this.anIntArrayArray61[local34][1] = arg1.method1171() << 4;
			this.anIntArrayArray61[local34][2] = arg1.method1171() << 4;
			this.anIntArrayArray61[local34][3] = arg1.method1171() << 4;
		}
	}
}
