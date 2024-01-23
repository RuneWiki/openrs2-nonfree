import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class8_Sub3_Sub28 extends Class8_Sub3 {

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "[I")
	private int[] anIntArray273 = new int[257];

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
		if (this.anIntArrayArray21 == null) {
			this.method2872(1);
		}
		this.method2869();
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	private void method2869() {
		@Pc(9) int local9 = this.anIntArrayArray21.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < 257; local13++) {
			@Pc(18) int local18 = 0;
			@Pc(22) int local22 = local13 << 4;
			for (@Pc(24) int local24 = 0; local9 > local24 && this.anIntArrayArray21[local24][0] <= local22; local24++) {
				local18++;
			}
			@Pc(103) int local103;
			@Pc(131) int local131;
			@Pc(117) int local117;
			@Pc(57) int[] local57;
			if (local18 < local9) {
				local57 = this.anIntArrayArray21[local18];
				if (local18 > 0) {
					@Pc(66) int[] local66 = this.anIntArrayArray21[local18 - 1];
					@Pc(84) int local84 = (local22 - local66[0] << 12) / (local57[0] - local66[0]);
					@Pc(89) int local89 = 4096 - local84;
					local103 = local89 * local66[1] + local84 * local57[1] >> 12;
					local117 = local57[3] * local84 + local89 * local66[3] >> 12;
					local131 = local66[2] * local89 + local84 * local57[2] >> 12;
				} else {
					local117 = local57[3];
					local103 = local57[1];
					local131 = local57[2];
				}
			} else {
				local57 = this.anIntArrayArray21[local9 - 1];
				local117 = local57[3];
				local103 = local57[1];
				local131 = local57[2];
			}
			local103 >>= 0x4;
			if (local103 < 0) {
				local103 = 0;
			} else if (local103 > 255) {
				local103 = 255;
			}
			local117 >>= 0x4;
			local131 >>= 0x4;
			if (local117 < 0) {
				local117 = 0;
			} else if (local117 > 255) {
				local117 = 255;
			}
			if (local131 < 0) {
				local131 = 0;
			} else if (local131 > 255) {
				local131 = 255;
			}
			this.anIntArray273[local13] = local117 | local103 << 16 | local131 << 8;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(IB)V")
	private void method2872(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray21 = new int[2][4];
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[0][1] = 0;
			this.anIntArrayArray21[0][3] = 0;
			this.anIntArrayArray21[1][0] = 4096;
			this.anIntArrayArray21[1][1] = 4096;
			this.anIntArrayArray21[1][3] = 4096;
			this.anIntArrayArray21[0][2] = 0;
			this.anIntArrayArray21[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray21 = new int[8][4];
			this.anIntArrayArray21[0][1] = 2650;
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[1][0] = 2867;
			this.anIntArrayArray21[1][1] = 2313;
			this.anIntArrayArray21[0][2] = 2602;
			this.anIntArrayArray21[2][1] = 2618;
			this.anIntArrayArray21[1][2] = 1799;
			this.anIntArrayArray21[3][1] = 2296;
			this.anIntArrayArray21[4][1] = 2072;
			this.anIntArrayArray21[0][3] = 2361;
			this.anIntArrayArray21[5][1] = 2730;
			this.anIntArrayArray21[1][3] = 1558;
			this.anIntArrayArray21[2][3] = 1413;
			this.anIntArrayArray21[6][1] = 2232;
			this.anIntArrayArray21[2][2] = 1734;
			this.anIntArrayArray21[2][0] = 3072;
			this.anIntArrayArray21[3][3] = 947;
			this.anIntArrayArray21[7][1] = 1686;
			this.anIntArrayArray21[3][2] = 1220;
			this.anIntArrayArray21[4][2] = 963;
			this.anIntArrayArray21[3][0] = 3276;
			this.anIntArrayArray21[4][3] = 722;
			this.anIntArrayArray21[5][2] = 2152;
			this.anIntArrayArray21[6][2] = 1060;
			this.anIntArrayArray21[4][0] = 3481;
			this.anIntArrayArray21[5][3] = 1766;
			this.anIntArrayArray21[6][3] = 915;
			this.anIntArrayArray21[5][0] = 3686;
			this.anIntArrayArray21[7][3] = 1140;
			this.anIntArrayArray21[7][2] = 1413;
			this.anIntArrayArray21[6][0] = 3891;
			this.anIntArrayArray21[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray21 = new int[7][4];
			this.anIntArrayArray21[0][3] = 4096;
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[0][2] = 0;
			this.anIntArrayArray21[1][0] = 663;
			this.anIntArrayArray21[2][0] = 1363;
			this.anIntArrayArray21[0][1] = 0;
			this.anIntArrayArray21[1][3] = 4096;
			this.anIntArrayArray21[3][0] = 2048;
			this.anIntArrayArray21[1][2] = 4096;
			this.anIntArrayArray21[4][0] = 2727;
			this.anIntArrayArray21[5][0] = 3411;
			this.anIntArrayArray21[6][0] = 4096;
			this.anIntArrayArray21[2][2] = 4096;
			this.anIntArrayArray21[2][3] = 0;
			this.anIntArrayArray21[1][1] = 0;
			this.anIntArrayArray21[3][2] = 4096;
			this.anIntArrayArray21[4][2] = 0;
			this.anIntArrayArray21[2][1] = 0;
			this.anIntArrayArray21[5][2] = 0;
			this.anIntArrayArray21[3][3] = 0;
			this.anIntArrayArray21[6][2] = 0;
			this.anIntArrayArray21[4][3] = 0;
			this.anIntArrayArray21[5][3] = 4096;
			this.anIntArrayArray21[6][3] = 4096;
			this.anIntArrayArray21[3][1] = 4096;
			this.anIntArrayArray21[4][1] = 4096;
			this.anIntArrayArray21[5][1] = 4096;
			this.anIntArrayArray21[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray21 = new int[6][4];
			this.anIntArrayArray21[0][2] = 0;
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[0][3] = 0;
			this.anIntArrayArray21[1][2] = 0;
			this.anIntArrayArray21[0][1] = 0;
			this.anIntArrayArray21[1][0] = 1843;
			this.anIntArrayArray21[2][0] = 2457;
			this.anIntArrayArray21[1][1] = 0;
			this.anIntArrayArray21[2][2] = 0;
			this.anIntArrayArray21[1][3] = 1493;
			this.anIntArrayArray21[3][2] = 1124;
			this.anIntArrayArray21[2][1] = 0;
			this.anIntArrayArray21[3][1] = 0;
			this.anIntArrayArray21[3][0] = 2781;
			this.anIntArrayArray21[2][3] = 2939;
			this.anIntArrayArray21[4][1] = 546;
			this.anIntArrayArray21[5][1] = 4096;
			this.anIntArrayArray21[4][0] = 3481;
			this.anIntArrayArray21[4][2] = 3084;
			this.anIntArrayArray21[5][2] = 4096;
			this.anIntArrayArray21[3][3] = 3565;
			this.anIntArrayArray21[5][0] = 4096;
			this.anIntArrayArray21[4][3] = 4031;
			this.anIntArrayArray21[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray21 = new int[16][4];
			this.anIntArrayArray21[0][3] = 321;
			this.anIntArrayArray21[1][3] = 562;
			this.anIntArrayArray21[0][2] = 192;
			this.anIntArrayArray21[0][1] = 80;
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[1][2] = 449;
			this.anIntArrayArray21[1][1] = 321;
			this.anIntArrayArray21[2][1] = 578;
			this.anIntArrayArray21[2][3] = 803;
			this.anIntArrayArray21[3][3] = 1140;
			this.anIntArrayArray21[1][0] = 155;
			this.anIntArrayArray21[2][0] = 389;
			this.anIntArrayArray21[3][0] = 671;
			this.anIntArrayArray21[3][1] = 947;
			this.anIntArrayArray21[4][3] = 1509;
			this.anIntArrayArray21[4][1] = 1285;
			this.anIntArrayArray21[5][1] = 1525;
			this.anIntArrayArray21[2][2] = 690;
			this.anIntArrayArray21[5][3] = 1413;
			this.anIntArrayArray21[3][2] = 995;
			this.anIntArrayArray21[4][0] = 897;
			this.anIntArrayArray21[6][3] = 1333;
			this.anIntArrayArray21[5][0] = 1175;
			this.anIntArrayArray21[6][1] = 1734;
			this.anIntArrayArray21[6][0] = 1368;
			this.anIntArrayArray21[7][3] = 1702;
			this.anIntArrayArray21[8][3] = 2056;
			this.anIntArrayArray21[9][3] = 2666;
			this.anIntArrayArray21[4][2] = 1397;
			this.anIntArrayArray21[5][2] = 1429;
			this.anIntArrayArray21[7][1] = 1413;
			this.anIntArrayArray21[10][3] = 3276;
			this.anIntArrayArray21[6][2] = 1461;
			this.anIntArrayArray21[8][1] = 1108;
			this.anIntArrayArray21[7][2] = 1525;
			this.anIntArrayArray21[11][3] = 3228;
			this.anIntArrayArray21[8][2] = 1590;
			this.anIntArrayArray21[12][3] = 3196;
			this.anIntArrayArray21[9][1] = 1766;
			this.anIntArrayArray21[7][0] = 1507;
			this.anIntArrayArray21[13][3] = 3019;
			this.anIntArrayArray21[14][3] = 3228;
			this.anIntArrayArray21[10][1] = 2409;
			this.anIntArrayArray21[9][2] = 2056;
			this.anIntArrayArray21[11][1] = 3116;
			this.anIntArrayArray21[12][1] = 3806;
			this.anIntArrayArray21[13][1] = 3437;
			this.anIntArrayArray21[8][0] = 1736;
			this.anIntArrayArray21[9][0] = 2088;
			this.anIntArrayArray21[15][3] = 2746;
			this.anIntArrayArray21[10][2] = 2586;
			this.anIntArrayArray21[14][1] = 3116;
			this.anIntArrayArray21[10][0] = 2355;
			this.anIntArrayArray21[11][2] = 3148;
			this.anIntArrayArray21[15][1] = 2377;
			this.anIntArrayArray21[12][2] = 3710;
			this.anIntArrayArray21[11][0] = 2691;
			this.anIntArrayArray21[12][0] = 3031;
			this.anIntArrayArray21[13][2] = 3421;
			this.anIntArrayArray21[13][0] = 3522;
			this.anIntArrayArray21[14][0] = 3727;
			this.anIntArrayArray21[14][2] = 3148;
			this.anIntArrayArray21[15][0] = 4096;
			this.anIntArrayArray21[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray21 = new int[4][4];
			this.anIntArrayArray21[0][3] = 0;
			this.anIntArrayArray21[0][1] = 0;
			this.anIntArrayArray21[1][1] = 4096;
			this.anIntArrayArray21[0][2] = 4096;
			this.anIntArrayArray21[2][1] = 4096;
			this.anIntArrayArray21[3][1] = 4096;
			this.anIntArrayArray21[1][2] = 4096;
			this.anIntArrayArray21[2][2] = 4096;
			this.anIntArrayArray21[3][2] = 0;
			this.anIntArrayArray21[1][3] = 0;
			this.anIntArrayArray21[2][3] = 0;
			this.anIntArrayArray21[0][0] = 2048;
			this.anIntArrayArray21[1][0] = 2867;
			this.anIntArrayArray21[2][0] = 3276;
			this.anIntArrayArray21[3][0] = 4096;
			this.anIntArrayArray21[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(29) int[] local29 = this.method4230(arg0, 0);
			@Pc(33) int[] local33 = local18[1];
			@Pc(37) int[] local37 = local18[0];
			@Pc(41) int[] local41 = local18[2];
			for (@Pc(43) int local43 = 0; local43 < Static239.anInt4789; local43++) {
				@Pc(56) int local56 = local29[local43] >> 4;
				if (local56 < 0) {
					local56 = 0;
				}
				if (local56 > 256) {
					local56 = 256;
				}
				local56 = this.anIntArray273[local56];
				local37[local43] = local56 >> 12 & 0xFF0;
				local33[local43] = local56 >> 4 & 0xFF0;
				local41[local43] = (local56 & 0xFF) << 4;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(16) int local16 = arg1.method2334();
		if (local16 != 0) {
			this.method2872(local16);
			return;
		}
		this.anIntArrayArray21 = new int[arg1.method2334()][4];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray21.length; local27++) {
			this.anIntArrayArray21[local27][0] = arg1.method2375();
			this.anIntArrayArray21[local27][1] = arg1.method2334() << 4;
			this.anIntArrayArray21[local27][2] = arg1.method2334() << 4;
			this.anIntArrayArray21[local27][3] = arg1.method2334() << 4;
		}
	}
}
