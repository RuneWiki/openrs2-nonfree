import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class6_Sub8_Sub10 extends Class6_Sub8 {

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!hp", name = "H", descriptor = "[I")
	private final int[] anIntArray231 = new int[257];

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
		if (this.anIntArrayArray22 == null) {
			this.method4148(1);
		}
		this.method4149();
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(II)V")
	private void method4148(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray22 = new int[2][4];
			this.anIntArrayArray22[0][1] = 0;
			this.anIntArrayArray22[0][0] = 0;
			this.anIntArrayArray22[0][2] = 0;
			this.anIntArrayArray22[0][3] = 0;
			this.anIntArrayArray22[1][3] = 4096;
			this.anIntArrayArray22[1][2] = 4096;
			this.anIntArrayArray22[1][0] = 4096;
			this.anIntArrayArray22[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray22 = new int[8][4];
			this.anIntArrayArray22[0][3] = 2361;
			this.anIntArrayArray22[0][0] = 0;
			this.anIntArrayArray22[0][1] = 2650;
			this.anIntArrayArray22[0][2] = 2602;
			this.anIntArrayArray22[1][2] = 1799;
			this.anIntArrayArray22[1][0] = 2867;
			this.anIntArrayArray22[1][3] = 1558;
			this.anIntArrayArray22[1][1] = 2313;
			this.anIntArrayArray22[2][1] = 2618;
			this.anIntArrayArray22[2][2] = 1734;
			this.anIntArrayArray22[2][0] = 3072;
			this.anIntArrayArray22[2][3] = 1413;
			this.anIntArrayArray22[3][2] = 1220;
			this.anIntArrayArray22[3][0] = 3276;
			this.anIntArrayArray22[3][3] = 947;
			this.anIntArrayArray22[3][1] = 2296;
			this.anIntArrayArray22[4][0] = 3481;
			this.anIntArrayArray22[4][3] = 722;
			this.anIntArrayArray22[4][2] = 963;
			this.anIntArrayArray22[4][1] = 2072;
			this.anIntArrayArray22[5][2] = 2152;
			this.anIntArrayArray22[5][1] = 2730;
			this.anIntArrayArray22[5][3] = 1766;
			this.anIntArrayArray22[5][0] = 3686;
			this.anIntArrayArray22[6][2] = 1060;
			this.anIntArrayArray22[6][1] = 2232;
			this.anIntArrayArray22[6][3] = 915;
			this.anIntArrayArray22[6][0] = 3891;
			this.anIntArrayArray22[7][0] = 4096;
			this.anIntArrayArray22[7][3] = 1140;
			this.anIntArrayArray22[7][2] = 1413;
			this.anIntArrayArray22[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray22 = new int[7][4];
			this.anIntArrayArray22[0][1] = 0;
			this.anIntArrayArray22[0][3] = 4096;
			this.anIntArrayArray22[0][0] = 0;
			this.anIntArrayArray22[0][2] = 0;
			this.anIntArrayArray22[1][1] = 0;
			this.anIntArrayArray22[1][0] = 663;
			this.anIntArrayArray22[1][3] = 4096;
			this.anIntArrayArray22[1][2] = 4096;
			this.anIntArrayArray22[2][3] = 0;
			this.anIntArrayArray22[2][1] = 0;
			this.anIntArrayArray22[2][2] = 4096;
			this.anIntArrayArray22[2][0] = 1363;
			this.anIntArrayArray22[3][0] = 2048;
			this.anIntArrayArray22[3][2] = 4096;
			this.anIntArrayArray22[3][3] = 0;
			this.anIntArrayArray22[3][1] = 4096;
			this.anIntArrayArray22[4][2] = 0;
			this.anIntArrayArray22[4][0] = 2727;
			this.anIntArrayArray22[4][1] = 4096;
			this.anIntArrayArray22[4][3] = 0;
			this.anIntArrayArray22[5][0] = 3411;
			this.anIntArrayArray22[5][1] = 4096;
			this.anIntArrayArray22[5][3] = 4096;
			this.anIntArrayArray22[5][2] = 0;
			this.anIntArrayArray22[6][2] = 0;
			this.anIntArrayArray22[6][1] = 0;
			this.anIntArrayArray22[6][3] = 4096;
			this.anIntArrayArray22[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray22 = new int[6][4];
			this.anIntArrayArray22[0][1] = 0;
			this.anIntArrayArray22[0][3] = 0;
			this.anIntArrayArray22[0][0] = 0;
			this.anIntArrayArray22[0][2] = 0;
			this.anIntArrayArray22[1][2] = 0;
			this.anIntArrayArray22[1][3] = 1493;
			this.anIntArrayArray22[1][0] = 1843;
			this.anIntArrayArray22[1][1] = 0;
			this.anIntArrayArray22[2][3] = 2939;
			this.anIntArrayArray22[2][0] = 2457;
			this.anIntArrayArray22[2][1] = 0;
			this.anIntArrayArray22[2][2] = 0;
			this.anIntArrayArray22[3][0] = 2781;
			this.anIntArrayArray22[3][1] = 0;
			this.anIntArrayArray22[3][2] = 1124;
			this.anIntArrayArray22[3][3] = 3565;
			this.anIntArrayArray22[4][3] = 4031;
			this.anIntArrayArray22[4][2] = 3084;
			this.anIntArrayArray22[4][1] = 546;
			this.anIntArrayArray22[4][0] = 3481;
			this.anIntArrayArray22[5][2] = 4096;
			this.anIntArrayArray22[5][0] = 4096;
			this.anIntArrayArray22[5][1] = 4096;
			this.anIntArrayArray22[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray22 = new int[16][4];
			this.anIntArrayArray22[0][3] = 321;
			this.anIntArrayArray22[0][0] = 0;
			this.anIntArrayArray22[0][1] = 80;
			this.anIntArrayArray22[0][2] = 192;
			this.anIntArrayArray22[1][2] = 449;
			this.anIntArrayArray22[1][1] = 321;
			this.anIntArrayArray22[1][0] = 155;
			this.anIntArrayArray22[1][3] = 562;
			this.anIntArrayArray22[2][1] = 578;
			this.anIntArrayArray22[2][3] = 803;
			this.anIntArrayArray22[2][2] = 690;
			this.anIntArrayArray22[2][0] = 389;
			this.anIntArrayArray22[3][0] = 671;
			this.anIntArrayArray22[3][2] = 995;
			this.anIntArrayArray22[3][3] = 1140;
			this.anIntArrayArray22[3][1] = 947;
			this.anIntArrayArray22[4][3] = 1509;
			this.anIntArrayArray22[4][0] = 897;
			this.anIntArrayArray22[4][2] = 1397;
			this.anIntArrayArray22[4][1] = 1285;
			this.anIntArrayArray22[5][0] = 1175;
			this.anIntArrayArray22[5][3] = 1413;
			this.anIntArrayArray22[5][1] = 1525;
			this.anIntArrayArray22[5][2] = 1429;
			this.anIntArrayArray22[6][2] = 1461;
			this.anIntArrayArray22[6][3] = 1333;
			this.anIntArrayArray22[6][1] = 1734;
			this.anIntArrayArray22[6][0] = 1368;
			this.anIntArrayArray22[7][2] = 1525;
			this.anIntArrayArray22[7][0] = 1507;
			this.anIntArrayArray22[7][3] = 1702;
			this.anIntArrayArray22[7][1] = 1413;
			this.anIntArrayArray22[8][2] = 1590;
			this.anIntArrayArray22[8][0] = 1736;
			this.anIntArrayArray22[8][1] = 1108;
			this.anIntArrayArray22[8][3] = 2056;
			this.anIntArrayArray22[9][2] = 2056;
			this.anIntArrayArray22[9][0] = 2088;
			this.anIntArrayArray22[9][3] = 2666;
			this.anIntArrayArray22[9][1] = 1766;
			this.anIntArrayArray22[10][1] = 2409;
			this.anIntArrayArray22[10][2] = 2586;
			this.anIntArrayArray22[10][3] = 3276;
			this.anIntArrayArray22[10][0] = 2355;
			this.anIntArrayArray22[11][3] = 3228;
			this.anIntArrayArray22[11][1] = 3116;
			this.anIntArrayArray22[11][0] = 2691;
			this.anIntArrayArray22[11][2] = 3148;
			this.anIntArrayArray22[12][1] = 3806;
			this.anIntArrayArray22[12][3] = 3196;
			this.anIntArrayArray22[12][2] = 3710;
			this.anIntArrayArray22[12][0] = 3031;
			this.anIntArrayArray22[13][2] = 3421;
			this.anIntArrayArray22[13][0] = 3522;
			this.anIntArrayArray22[13][1] = 3437;
			this.anIntArrayArray22[13][3] = 3019;
			this.anIntArrayArray22[14][2] = 3148;
			this.anIntArrayArray22[14][1] = 3116;
			this.anIntArrayArray22[14][3] = 3228;
			this.anIntArrayArray22[14][0] = 3727;
			this.anIntArrayArray22[15][2] = 2505;
			this.anIntArrayArray22[15][1] = 2377;
			this.anIntArrayArray22[15][3] = 2746;
			this.anIntArrayArray22[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray22 = new int[4][4];
			this.anIntArrayArray22[0][0] = 2048;
			this.anIntArrayArray22[0][3] = 0;
			this.anIntArrayArray22[0][2] = 4096;
			this.anIntArrayArray22[0][1] = 0;
			this.anIntArrayArray22[1][0] = 2867;
			this.anIntArrayArray22[1][2] = 4096;
			this.anIntArrayArray22[1][1] = 4096;
			this.anIntArrayArray22[1][3] = 0;
			this.anIntArrayArray22[2][1] = 4096;
			this.anIntArrayArray22[2][0] = 3276;
			this.anIntArrayArray22[2][2] = 4096;
			this.anIntArrayArray22[2][3] = 0;
			this.anIntArrayArray22[3][2] = 0;
			this.anIntArrayArray22[3][0] = 4096;
			this.anIntArrayArray22[3][1] = 4096;
			this.anIntArrayArray22[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)V")
	private void method4149() {
		@Pc(14) int local14 = this.anIntArrayArray22.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < 257; local21++) {
			@Pc(25) int local25 = 0;
			@Pc(29) int local29 = local21 << 4;
			for (@Pc(31) int local31 = 0; local14 > local31 && this.anIntArrayArray22[local31][0] <= local29; local31++) {
				local25++;
			}
			@Pc(127) int local127;
			@Pc(141) int local141;
			@Pc(113) int local113;
			@Pc(64) int[] local64;
			if (local14 > local25) {
				local64 = this.anIntArrayArray22[local25];
				if (local25 > 0) {
					@Pc(76) int[] local76 = this.anIntArrayArray22[local25 - 1];
					@Pc(94) int local94 = (local29 - local76[0] << 12) / (local64[0] - local76[0]);
					@Pc(99) int local99 = 4096 - local94;
					local113 = local76[3] * local99 + local94 * local64[3] >> 12;
					local127 = local99 * local76[1] + local64[1] * local94 >> 12;
					local141 = local99 * local76[2] + local94 * local64[2] >> 12;
				} else {
					local141 = local64[2];
					local127 = local64[1];
					local113 = local64[3];
				}
			} else {
				local64 = this.anIntArrayArray22[local14 - 1];
				local113 = local64[3];
				local127 = local64[1];
				local141 = local64[2];
			}
			local113 >>= 0x4;
			local127 >>= 0x4;
			local141 >>= 0x4;
			if (local141 < 0) {
				local141 = 0;
			} else if (local141 > 255) {
				local141 = 255;
			}
			if (local127 < 0) {
				local127 = 0;
			} else if (local127 > 255) {
				local127 = 255;
			}
			if (local113 < 0) {
				local113 = 0;
			} else if (local113 > 255) {
				local113 = 255;
			}
			this.anIntArray231[local21] = local141 << 8 | local127 << 16 | local113;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(20) int local20 = arg1.method3030();
		if (local20 != 0) {
			this.method4148(local20);
			return;
		}
		this.anIntArrayArray22 = new int[arg1.method3030()][4];
		for (@Pc(41) int local41 = 0; local41 < this.anIntArrayArray22.length; local41++) {
			this.anIntArrayArray22[local41][0] = arg1.method3018();
			this.anIntArrayArray22[local41][1] = arg1.method3030() << 4;
			this.anIntArrayArray22[local41][2] = arg1.method3030() << 4;
			this.anIntArrayArray22[local41][3] = arg1.method3030() << 4;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(22) int[][] local22 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(32) int[] local32 = this.method8930(arg0, 0);
			@Pc(36) int[] local36 = local22[0];
			@Pc(40) int[] local40 = local22[1];
			@Pc(44) int[] local44 = local22[2];
			for (@Pc(46) int local46 = 0; local46 < Static83.anInt1268; local46++) {
				@Pc(54) int local54 = local32[local46] >> 4;
				if (local54 < 0) {
					local54 = 0;
				}
				if (local54 > 256) {
					local54 = 256;
				}
				local54 = this.anIntArray231[local54];
				local36[local46] = local54 >> 12 & 0xFF0;
				local40[local46] = local54 >> 4 & 0xFF0;
				local44[local46] = (local54 & 0xFF) << 4;
			}
		}
		return local22;
	}
}
