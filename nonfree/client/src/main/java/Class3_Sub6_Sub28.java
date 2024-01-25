import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class3_Sub6_Sub28 extends Class3_Sub6 {

	@OriginalMember(owner = "client!qv", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray166;

	@OriginalMember(owner = "client!qv", name = "K", descriptor = "[I")
	private final int[] anIntArray471 = new int[257];

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(26) int[] local26 = this.method7769(arg0, 0);
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local11[2];
			for (@Pc(40) int local40 = 0; local40 < Static521.anInt8383; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray471[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
		if (this.anIntArrayArray166 == null) {
			this.method6235(1);
		}
		this.method6234();
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)V")
	private void method6234() {
		@Pc(13) int local13 = this.anIntArrayArray166.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local13 > local27 && local25 >= this.anIntArrayArray166[local27][0]; local27++) {
				local21++;
			}
			@Pc(68) int local68;
			@Pc(72) int local72;
			@Pc(64) int local64;
			@Pc(60) int[] local60;
			if (local21 >= local13) {
				local60 = this.anIntArrayArray166[local13 - 1];
				local64 = local60[3];
				local68 = local60[1];
				local72 = local60[2];
			} else {
				local60 = this.anIntArrayArray166[local21];
				if (local21 <= 0) {
					local68 = local60[1];
					local64 = local60[3];
					local72 = local60[2];
				} else {
					@Pc(105) int[] local105 = this.anIntArrayArray166[local21 - 1];
					@Pc(122) int local122 = (local25 - local105[0] << 12) / (local60[0] - local105[0]);
					@Pc(126) int local126 = 4096 - local122;
					local64 = local122 * local60[3] + local126 * local105[3] >> 12;
					local72 = local105[2] * local126 + local60[2] * local122 >> 12;
					local68 = local126 * local105[1] + local60[1] * local122 >> 12;
				}
			}
			local72 >>= 0x4;
			local68 >>= 0x4;
			local64 >>= 0x4;
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			if (local72 < 0) {
				local72 = 0;
			} else if (local72 > 255) {
				local72 = 255;
			}
			this.anIntArray471[local17] = local72 << 8 | local68 << 16 | local64;
		}
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(ZI)V")
	private void method6235(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray166 = new int[2][4];
			this.anIntArrayArray166[0][3] = 0;
			this.anIntArrayArray166[0][1] = 0;
			this.anIntArrayArray166[0][0] = 0;
			this.anIntArrayArray166[0][2] = 0;
			this.anIntArrayArray166[1][1] = 4096;
			this.anIntArrayArray166[1][2] = 4096;
			this.anIntArrayArray166[1][0] = 4096;
			this.anIntArrayArray166[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray166 = new int[8][4];
			this.anIntArrayArray166[0][0] = 0;
			this.anIntArrayArray166[0][1] = 2650;
			this.anIntArrayArray166[0][2] = 2602;
			this.anIntArrayArray166[0][3] = 2361;
			this.anIntArrayArray166[1][0] = 2867;
			this.anIntArrayArray166[1][3] = 1558;
			this.anIntArrayArray166[1][1] = 2313;
			this.anIntArrayArray166[1][2] = 1799;
			this.anIntArrayArray166[2][2] = 1734;
			this.anIntArrayArray166[2][1] = 2618;
			this.anIntArrayArray166[2][3] = 1413;
			this.anIntArrayArray166[2][0] = 3072;
			this.anIntArrayArray166[3][0] = 3276;
			this.anIntArrayArray166[3][3] = 947;
			this.anIntArrayArray166[3][2] = 1220;
			this.anIntArrayArray166[3][1] = 2296;
			this.anIntArrayArray166[4][0] = 3481;
			this.anIntArrayArray166[4][2] = 963;
			this.anIntArrayArray166[4][1] = 2072;
			this.anIntArrayArray166[4][3] = 722;
			this.anIntArrayArray166[5][0] = 3686;
			this.anIntArrayArray166[5][2] = 2152;
			this.anIntArrayArray166[5][3] = 1766;
			this.anIntArrayArray166[5][1] = 2730;
			this.anIntArrayArray166[6][1] = 2232;
			this.anIntArrayArray166[6][0] = 3891;
			this.anIntArrayArray166[6][2] = 1060;
			this.anIntArrayArray166[6][3] = 915;
			this.anIntArrayArray166[7][1] = 1686;
			this.anIntArrayArray166[7][2] = 1413;
			this.anIntArrayArray166[7][3] = 1140;
			this.anIntArrayArray166[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray166 = new int[7][4];
			this.anIntArrayArray166[0][2] = 0;
			this.anIntArrayArray166[0][0] = 0;
			this.anIntArrayArray166[0][1] = 0;
			this.anIntArrayArray166[0][3] = 4096;
			this.anIntArrayArray166[1][2] = 4096;
			this.anIntArrayArray166[1][1] = 0;
			this.anIntArrayArray166[1][0] = 663;
			this.anIntArrayArray166[1][3] = 4096;
			this.anIntArrayArray166[2][3] = 0;
			this.anIntArrayArray166[2][0] = 1363;
			this.anIntArrayArray166[2][2] = 4096;
			this.anIntArrayArray166[2][1] = 0;
			this.anIntArrayArray166[3][0] = 2048;
			this.anIntArrayArray166[3][2] = 4096;
			this.anIntArrayArray166[3][1] = 4096;
			this.anIntArrayArray166[3][3] = 0;
			this.anIntArrayArray166[4][2] = 0;
			this.anIntArrayArray166[4][1] = 4096;
			this.anIntArrayArray166[4][0] = 2727;
			this.anIntArrayArray166[4][3] = 0;
			this.anIntArrayArray166[5][0] = 3411;
			this.anIntArrayArray166[5][3] = 4096;
			this.anIntArrayArray166[5][2] = 0;
			this.anIntArrayArray166[5][1] = 4096;
			this.anIntArrayArray166[6][1] = 0;
			this.anIntArrayArray166[6][2] = 0;
			this.anIntArrayArray166[6][3] = 4096;
			this.anIntArrayArray166[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray166 = new int[6][4];
			this.anIntArrayArray166[0][0] = 0;
			this.anIntArrayArray166[0][3] = 0;
			this.anIntArrayArray166[0][2] = 0;
			this.anIntArrayArray166[0][1] = 0;
			this.anIntArrayArray166[1][1] = 0;
			this.anIntArrayArray166[1][3] = 1493;
			this.anIntArrayArray166[1][2] = 0;
			this.anIntArrayArray166[1][0] = 1843;
			this.anIntArrayArray166[2][1] = 0;
			this.anIntArrayArray166[2][0] = 2457;
			this.anIntArrayArray166[2][3] = 2939;
			this.anIntArrayArray166[2][2] = 0;
			this.anIntArrayArray166[3][2] = 1124;
			this.anIntArrayArray166[3][0] = 2781;
			this.anIntArrayArray166[3][1] = 0;
			this.anIntArrayArray166[3][3] = 3565;
			this.anIntArrayArray166[4][2] = 3084;
			this.anIntArrayArray166[4][3] = 4031;
			this.anIntArrayArray166[4][1] = 546;
			this.anIntArrayArray166[4][0] = 3481;
			this.anIntArrayArray166[5][2] = 4096;
			this.anIntArrayArray166[5][1] = 4096;
			this.anIntArrayArray166[5][3] = 4096;
			this.anIntArrayArray166[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray166 = new int[16][4];
			this.anIntArrayArray166[0][1] = 80;
			this.anIntArrayArray166[0][2] = 192;
			this.anIntArrayArray166[0][0] = 0;
			this.anIntArrayArray166[0][3] = 321;
			this.anIntArrayArray166[1][3] = 562;
			this.anIntArrayArray166[1][1] = 321;
			this.anIntArrayArray166[1][0] = 155;
			this.anIntArrayArray166[1][2] = 449;
			this.anIntArrayArray166[2][0] = 389;
			this.anIntArrayArray166[2][3] = 803;
			this.anIntArrayArray166[2][2] = 690;
			this.anIntArrayArray166[2][1] = 578;
			this.anIntArrayArray166[3][2] = 995;
			this.anIntArrayArray166[3][3] = 1140;
			this.anIntArrayArray166[3][1] = 947;
			this.anIntArrayArray166[3][0] = 671;
			this.anIntArrayArray166[4][0] = 897;
			this.anIntArrayArray166[4][1] = 1285;
			this.anIntArrayArray166[4][2] = 1397;
			this.anIntArrayArray166[4][3] = 1509;
			this.anIntArrayArray166[5][0] = 1175;
			this.anIntArrayArray166[5][2] = 1429;
			this.anIntArrayArray166[5][1] = 1525;
			this.anIntArrayArray166[5][3] = 1413;
			this.anIntArrayArray166[6][3] = 1333;
			this.anIntArrayArray166[6][0] = 1368;
			this.anIntArrayArray166[6][2] = 1461;
			this.anIntArrayArray166[6][1] = 1734;
			this.anIntArrayArray166[7][3] = 1702;
			this.anIntArrayArray166[7][1] = 1413;
			this.anIntArrayArray166[7][2] = 1525;
			this.anIntArrayArray166[7][0] = 1507;
			this.anIntArrayArray166[8][1] = 1108;
			this.anIntArrayArray166[8][2] = 1590;
			this.anIntArrayArray166[8][0] = 1736;
			this.anIntArrayArray166[8][3] = 2056;
			this.anIntArrayArray166[9][1] = 1766;
			this.anIntArrayArray166[9][2] = 2056;
			this.anIntArrayArray166[9][3] = 2666;
			this.anIntArrayArray166[9][0] = 2088;
			this.anIntArrayArray166[10][0] = 2355;
			this.anIntArrayArray166[10][1] = 2409;
			this.anIntArrayArray166[10][3] = 3276;
			this.anIntArrayArray166[10][2] = 2586;
			this.anIntArrayArray166[11][0] = 2691;
			this.anIntArrayArray166[11][3] = 3228;
			this.anIntArrayArray166[11][1] = 3116;
			this.anIntArrayArray166[11][2] = 3148;
			this.anIntArrayArray166[12][2] = 3710;
			this.anIntArrayArray166[12][1] = 3806;
			this.anIntArrayArray166[12][0] = 3031;
			this.anIntArrayArray166[12][3] = 3196;
			this.anIntArrayArray166[13][2] = 3421;
			this.anIntArrayArray166[13][1] = 3437;
			this.anIntArrayArray166[13][3] = 3019;
			this.anIntArrayArray166[13][0] = 3522;
			this.anIntArrayArray166[14][3] = 3228;
			this.anIntArrayArray166[14][1] = 3116;
			this.anIntArrayArray166[14][2] = 3148;
			this.anIntArrayArray166[14][0] = 3727;
			this.anIntArrayArray166[15][0] = 4096;
			this.anIntArrayArray166[15][1] = 2377;
			this.anIntArrayArray166[15][2] = 2505;
			this.anIntArrayArray166[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray166 = new int[4][4];
			this.anIntArrayArray166[0][2] = 4096;
			this.anIntArrayArray166[0][1] = 0;
			this.anIntArrayArray166[0][0] = 2048;
			this.anIntArrayArray166[0][3] = 0;
			this.anIntArrayArray166[1][3] = 0;
			this.anIntArrayArray166[1][0] = 2867;
			this.anIntArrayArray166[1][1] = 4096;
			this.anIntArrayArray166[1][2] = 4096;
			this.anIntArrayArray166[2][2] = 4096;
			this.anIntArrayArray166[2][3] = 0;
			this.anIntArrayArray166[2][1] = 4096;
			this.anIntArrayArray166[2][0] = 3276;
			this.anIntArrayArray166[3][1] = 4096;
			this.anIntArrayArray166[3][2] = 0;
			this.anIntArrayArray166[3][0] = 4096;
			this.anIntArrayArray166[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(21) int local21 = arg0.method5175();
		if (local21 != 0) {
			this.method6235(local21);
			return;
		}
		this.anIntArrayArray166 = new int[arg0.method5175()][4];
		for (@Pc(40) int local40 = 0; local40 < this.anIntArrayArray166.length; local40++) {
			this.anIntArrayArray166[local40][0] = arg0.method5198();
			this.anIntArrayArray166[local40][1] = arg0.method5175() << 4;
			this.anIntArrayArray166[local40][2] = arg0.method5175() << 4;
			this.anIntArrayArray166[local40][3] = arg0.method5175() << 4;
		}
	}
}
