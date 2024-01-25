import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class5_Sub3_Sub28 extends Class5_Sub3 {

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray84;

	@OriginalMember(owner = "client!pj", name = "N", descriptor = "[I")
	private final int[] anIntArray481 = new int[257];

	static {
		new Class85("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(IB)V")
	private void method4417(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray84 = new int[2][4];
			this.anIntArrayArray84[0][1] = 0;
			this.anIntArrayArray84[0][0] = 0;
			this.anIntArrayArray84[0][3] = 0;
			this.anIntArrayArray84[0][2] = 0;
			this.anIntArrayArray84[1][0] = 4096;
			this.anIntArrayArray84[1][2] = 4096;
			this.anIntArrayArray84[1][3] = 4096;
			this.anIntArrayArray84[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray84 = new int[8][4];
			this.anIntArrayArray84[0][0] = 0;
			this.anIntArrayArray84[0][1] = 2650;
			this.anIntArrayArray84[0][3] = 2361;
			this.anIntArrayArray84[0][2] = 2602;
			this.anIntArrayArray84[1][3] = 1558;
			this.anIntArrayArray84[1][0] = 2867;
			this.anIntArrayArray84[1][2] = 1799;
			this.anIntArrayArray84[1][1] = 2313;
			this.anIntArrayArray84[2][2] = 1734;
			this.anIntArrayArray84[2][1] = 2618;
			this.anIntArrayArray84[2][3] = 1413;
			this.anIntArrayArray84[2][0] = 3072;
			this.anIntArrayArray84[3][3] = 947;
			this.anIntArrayArray84[3][0] = 3276;
			this.anIntArrayArray84[3][1] = 2296;
			this.anIntArrayArray84[3][2] = 1220;
			this.anIntArrayArray84[4][0] = 3481;
			this.anIntArrayArray84[4][1] = 2072;
			this.anIntArrayArray84[4][2] = 963;
			this.anIntArrayArray84[4][3] = 722;
			this.anIntArrayArray84[5][0] = 3686;
			this.anIntArrayArray84[5][2] = 2152;
			this.anIntArrayArray84[5][3] = 1766;
			this.anIntArrayArray84[5][1] = 2730;
			this.anIntArrayArray84[6][3] = 915;
			this.anIntArrayArray84[6][2] = 1060;
			this.anIntArrayArray84[6][1] = 2232;
			this.anIntArrayArray84[6][0] = 3891;
			this.anIntArrayArray84[7][3] = 1140;
			this.anIntArrayArray84[7][1] = 1686;
			this.anIntArrayArray84[7][0] = 4096;
			this.anIntArrayArray84[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray84 = new int[7][4];
			this.anIntArrayArray84[0][1] = 0;
			this.anIntArrayArray84[0][0] = 0;
			this.anIntArrayArray84[0][3] = 4096;
			this.anIntArrayArray84[0][2] = 0;
			this.anIntArrayArray84[1][3] = 4096;
			this.anIntArrayArray84[1][1] = 0;
			this.anIntArrayArray84[1][2] = 4096;
			this.anIntArrayArray84[1][0] = 663;
			this.anIntArrayArray84[2][2] = 4096;
			this.anIntArrayArray84[2][3] = 0;
			this.anIntArrayArray84[2][1] = 0;
			this.anIntArrayArray84[2][0] = 1363;
			this.anIntArrayArray84[3][3] = 0;
			this.anIntArrayArray84[3][0] = 2048;
			this.anIntArrayArray84[3][2] = 4096;
			this.anIntArrayArray84[3][1] = 4096;
			this.anIntArrayArray84[4][0] = 2727;
			this.anIntArrayArray84[4][2] = 0;
			this.anIntArrayArray84[4][1] = 4096;
			this.anIntArrayArray84[4][3] = 0;
			this.anIntArrayArray84[5][0] = 3411;
			this.anIntArrayArray84[5][2] = 0;
			this.anIntArrayArray84[5][3] = 4096;
			this.anIntArrayArray84[5][1] = 4096;
			this.anIntArrayArray84[6][1] = 0;
			this.anIntArrayArray84[6][2] = 0;
			this.anIntArrayArray84[6][3] = 4096;
			this.anIntArrayArray84[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray84 = new int[6][4];
			this.anIntArrayArray84[0][1] = 0;
			this.anIntArrayArray84[0][3] = 0;
			this.anIntArrayArray84[0][0] = 0;
			this.anIntArrayArray84[0][2] = 0;
			this.anIntArrayArray84[1][1] = 0;
			this.anIntArrayArray84[1][3] = 1493;
			this.anIntArrayArray84[1][0] = 1843;
			this.anIntArrayArray84[1][2] = 0;
			this.anIntArrayArray84[2][1] = 0;
			this.anIntArrayArray84[2][2] = 0;
			this.anIntArrayArray84[2][0] = 2457;
			this.anIntArrayArray84[2][3] = 2939;
			this.anIntArrayArray84[3][3] = 3565;
			this.anIntArrayArray84[3][2] = 1124;
			this.anIntArrayArray84[3][1] = 0;
			this.anIntArrayArray84[3][0] = 2781;
			this.anIntArrayArray84[4][3] = 4031;
			this.anIntArrayArray84[4][1] = 546;
			this.anIntArrayArray84[4][2] = 3084;
			this.anIntArrayArray84[4][0] = 3481;
			this.anIntArrayArray84[5][0] = 4096;
			this.anIntArrayArray84[5][2] = 4096;
			this.anIntArrayArray84[5][1] = 4096;
			this.anIntArrayArray84[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray84 = new int[16][4];
			this.anIntArrayArray84[0][3] = 321;
			this.anIntArrayArray84[0][1] = 80;
			this.anIntArrayArray84[0][2] = 192;
			this.anIntArrayArray84[0][0] = 0;
			this.anIntArrayArray84[1][3] = 562;
			this.anIntArrayArray84[1][2] = 449;
			this.anIntArrayArray84[1][0] = 155;
			this.anIntArrayArray84[1][1] = 321;
			this.anIntArrayArray84[2][1] = 578;
			this.anIntArrayArray84[2][2] = 690;
			this.anIntArrayArray84[2][3] = 803;
			this.anIntArrayArray84[2][0] = 389;
			this.anIntArrayArray84[3][3] = 1140;
			this.anIntArrayArray84[3][2] = 995;
			this.anIntArrayArray84[3][1] = 947;
			this.anIntArrayArray84[3][0] = 671;
			this.anIntArrayArray84[4][2] = 1397;
			this.anIntArrayArray84[4][3] = 1509;
			this.anIntArrayArray84[4][0] = 897;
			this.anIntArrayArray84[4][1] = 1285;
			this.anIntArrayArray84[5][0] = 1175;
			this.anIntArrayArray84[5][1] = 1525;
			this.anIntArrayArray84[5][2] = 1429;
			this.anIntArrayArray84[5][3] = 1413;
			this.anIntArrayArray84[6][2] = 1461;
			this.anIntArrayArray84[6][3] = 1333;
			this.anIntArrayArray84[6][0] = 1368;
			this.anIntArrayArray84[6][1] = 1734;
			this.anIntArrayArray84[7][0] = 1507;
			this.anIntArrayArray84[7][3] = 1702;
			this.anIntArrayArray84[7][1] = 1413;
			this.anIntArrayArray84[7][2] = 1525;
			this.anIntArrayArray84[8][0] = 1736;
			this.anIntArrayArray84[8][1] = 1108;
			this.anIntArrayArray84[8][2] = 1590;
			this.anIntArrayArray84[8][3] = 2056;
			this.anIntArrayArray84[9][3] = 2666;
			this.anIntArrayArray84[9][2] = 2056;
			this.anIntArrayArray84[9][1] = 1766;
			this.anIntArrayArray84[9][0] = 2088;
			this.anIntArrayArray84[10][3] = 3276;
			this.anIntArrayArray84[10][0] = 2355;
			this.anIntArrayArray84[10][2] = 2586;
			this.anIntArrayArray84[10][1] = 2409;
			this.anIntArrayArray84[11][3] = 3228;
			this.anIntArrayArray84[11][1] = 3116;
			this.anIntArrayArray84[11][0] = 2691;
			this.anIntArrayArray84[11][2] = 3148;
			this.anIntArrayArray84[12][3] = 3196;
			this.anIntArrayArray84[12][2] = 3710;
			this.anIntArrayArray84[12][1] = 3806;
			this.anIntArrayArray84[12][0] = 3031;
			this.anIntArrayArray84[13][2] = 3421;
			this.anIntArrayArray84[13][0] = 3522;
			this.anIntArrayArray84[13][3] = 3019;
			this.anIntArrayArray84[13][1] = 3437;
			this.anIntArrayArray84[14][0] = 3727;
			this.anIntArrayArray84[14][1] = 3116;
			this.anIntArrayArray84[14][2] = 3148;
			this.anIntArrayArray84[14][3] = 3228;
			this.anIntArrayArray84[15][1] = 2377;
			this.anIntArrayArray84[15][2] = 2505;
			this.anIntArrayArray84[15][0] = 4096;
			this.anIntArrayArray84[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray84 = new int[4][4];
			this.anIntArrayArray84[0][1] = 0;
			this.anIntArrayArray84[0][0] = 2048;
			this.anIntArrayArray84[0][2] = 4096;
			this.anIntArrayArray84[0][3] = 0;
			this.anIntArrayArray84[1][2] = 4096;
			this.anIntArrayArray84[1][0] = 2867;
			this.anIntArrayArray84[1][3] = 0;
			this.anIntArrayArray84[1][1] = 4096;
			this.anIntArrayArray84[2][1] = 4096;
			this.anIntArrayArray84[2][0] = 3276;
			this.anIntArrayArray84[2][3] = 0;
			this.anIntArrayArray84[2][2] = 4096;
			this.anIntArrayArray84[3][0] = 4096;
			this.anIntArrayArray84[3][1] = 4096;
			this.anIntArrayArray84[3][2] = 0;
			this.anIntArrayArray84[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(16) int local16 = arg0.method5115();
		if (local16 != 0) {
			this.method4417(local16);
			return;
		}
		this.anIntArrayArray84 = new int[arg0.method5115()][4];
		for (@Pc(35) int local35 = 0; local35 < this.anIntArrayArray84.length; local35++) {
			this.anIntArrayArray84[local35][0] = arg0.method5106();
			this.anIntArrayArray84[local35][1] = arg0.method5115() << 4;
			this.anIntArrayArray84[local35][2] = arg0.method5115() << 4;
			this.anIntArrayArray84[local35][3] = arg0.method5115() << 4;
		}
	}

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V")
	private void method4420() {
		@Pc(17) int local17 = this.anIntArrayArray84.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < 257; local21++) {
			@Pc(25) int local25 = 0;
			@Pc(29) int local29 = local21 << 4;
			for (@Pc(31) int local31 = 0; local31 < local17 && local29 >= this.anIntArrayArray84[local31][0]; local31++) {
				local25++;
			}
			@Pc(76) int local76;
			@Pc(72) int local72;
			@Pc(68) int local68;
			@Pc(62) int[] local62;
			if (local25 < local17) {
				local62 = this.anIntArrayArray84[local25];
				if (local25 <= 0) {
					local68 = local62[3];
					local72 = local62[2];
					local76 = local62[1];
				} else {
					@Pc(85) int[] local85 = this.anIntArrayArray84[local25 - 1];
					@Pc(103) int local103 = (local29 - local85[0] << 12) / (local62[0] - local85[0]);
					@Pc(108) int local108 = 4096 - local103;
					local68 = local62[3] * local103 + local85[3] * local108 >> 12;
					local72 = local103 * local62[2] + local85[2] * local108 >> 12;
					local76 = local103 * local62[1] + local85[1] * local108 >> 12;
				}
			} else {
				local62 = this.anIntArrayArray84[local17 - 1];
				local72 = local62[2];
				local76 = local62[1];
				local68 = local62[3];
			}
			local68 >>= 0x4;
			local76 >>= 0x4;
			local72 >>= 0x4;
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			if (local72 < 0) {
				local72 = 0;
			} else if (local72 > 255) {
				local72 = 255;
			}
			if (local76 < 0) {
				local76 = 0;
			} else if (local76 > 255) {
				local76 = 255;
			}
			this.anIntArray481[local21] = local68 | local76 << 16 | local72 << 8;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(21) int[] local21 = this.method6020(0, arg0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static7.anInt129; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray481[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
		if (this.anIntArrayArray84 == null) {
			this.method4417(1);
		}
		this.method4420();
	}
}
