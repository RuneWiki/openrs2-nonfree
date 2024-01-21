import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class2_Sub2_Sub28 extends Class2_Sub2 {

	@OriginalMember(owner = "client!od", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!od", name = "db", descriptor = "[I")
	private final int[] anIntArray404 = new int[257];

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(22) int local22 = arg1.method218();
		if (local22 != 0) {
			this.method2734(local22);
			return;
		}
		this.anIntArrayArray23 = new int[arg1.method218()][4];
		for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray23.length; local33++) {
			this.anIntArrayArray23[local33][0] = arg1.method234();
			this.anIntArrayArray23[local33][1] = arg1.method218() << 4;
			this.anIntArrayArray23[local33][2] = arg1.method218() << 4;
			this.anIntArrayArray23[local33][3] = arg1.method218() << 4;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(21) int[] local21 = this.method3569(arg0, 0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static106.anInt3045; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray404[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
		if (this.anIntArrayArray23 == null) {
			this.method2734(1);
		}
		this.method2733();
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
	private void method2733() {
		@Pc(14) int local14 = this.anIntArrayArray23.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < 257; local21++) {
			@Pc(25) int local25 = 0;
			@Pc(29) int local29 = local21 << 4;
			for (@Pc(31) int local31 = 0; local14 > local31 && local29 >= this.anIntArrayArray23[local31][0]; local31++) {
				local25++;
			}
			@Pc(72) int local72;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(62) int[] local62;
			if (local25 < local14) {
				local62 = this.anIntArrayArray23[local25];
				if (local25 <= 0) {
					local68 = local62[2];
					local72 = local62[1];
					local76 = local62[3];
				} else {
					@Pc(85) int[] local85 = this.anIntArrayArray23[local25 - 1];
					@Pc(102) int local102 = (local29 - local85[0] << 12) / (local62[0] - local85[0]);
					@Pc(106) int local106 = 4096 - local102;
					local68 = local106 * local85[2] + local102 * local62[2] >> 12;
					local76 = local62[3] * local102 + local85[3] * local106 >> 12;
					local72 = local106 * local85[1] + local62[1] * local102 >> 12;
				}
			} else {
				local62 = this.anIntArrayArray23[local14 - 1];
				local68 = local62[2];
				local76 = local62[3];
				local72 = local62[1];
			}
			local76 >>= 0x4;
			local72 >>= 0x4;
			local68 >>= 0x4;
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
			this.anIntArray404[local21] = local76 | local72 << 16 | local68 << 8;
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(II)V")
	private void method2734(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray23 = new int[2][4];
			this.anIntArrayArray23[0][2] = 0;
			this.anIntArrayArray23[0][3] = 0;
			this.anIntArrayArray23[0][1] = 0;
			this.anIntArrayArray23[0][0] = 0;
			this.anIntArrayArray23[1][2] = 4096;
			this.anIntArrayArray23[1][1] = 4096;
			this.anIntArrayArray23[1][0] = 4096;
			this.anIntArrayArray23[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray23 = new int[8][4];
			this.anIntArrayArray23[0][2] = 2602;
			this.anIntArrayArray23[0][3] = 2361;
			this.anIntArrayArray23[0][0] = 0;
			this.anIntArrayArray23[1][3] = 1558;
			this.anIntArrayArray23[2][3] = 1413;
			this.anIntArrayArray23[1][0] = 2867;
			this.anIntArrayArray23[0][1] = 2650;
			this.anIntArrayArray23[1][1] = 2313;
			this.anIntArrayArray23[2][1] = 2618;
			this.anIntArrayArray23[2][0] = 3072;
			this.anIntArrayArray23[3][3] = 947;
			this.anIntArrayArray23[3][0] = 3276;
			this.anIntArrayArray23[4][0] = 3481;
			this.anIntArrayArray23[1][2] = 1799;
			this.anIntArrayArray23[2][2] = 1734;
			this.anIntArrayArray23[4][3] = 722;
			this.anIntArrayArray23[5][0] = 3686;
			this.anIntArrayArray23[3][1] = 2296;
			this.anIntArrayArray23[3][2] = 1220;
			this.anIntArrayArray23[6][0] = 3891;
			this.anIntArrayArray23[5][3] = 1766;
			this.anIntArrayArray23[7][0] = 4096;
			this.anIntArrayArray23[6][3] = 915;
			this.anIntArrayArray23[4][1] = 2072;
			this.anIntArrayArray23[4][2] = 963;
			this.anIntArrayArray23[5][1] = 2730;
			this.anIntArrayArray23[5][2] = 2152;
			this.anIntArrayArray23[6][2] = 1060;
			this.anIntArrayArray23[7][2] = 1413;
			this.anIntArrayArray23[7][3] = 1140;
			this.anIntArrayArray23[6][1] = 2232;
			this.anIntArrayArray23[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray23 = new int[7][4];
			this.anIntArrayArray23[0][3] = 4096;
			this.anIntArrayArray23[0][0] = 0;
			this.anIntArrayArray23[0][2] = 0;
			this.anIntArrayArray23[1][3] = 4096;
			this.anIntArrayArray23[1][0] = 663;
			this.anIntArrayArray23[2][3] = 0;
			this.anIntArrayArray23[1][2] = 4096;
			this.anIntArrayArray23[2][0] = 1363;
			this.anIntArrayArray23[3][0] = 2048;
			this.anIntArrayArray23[4][0] = 2727;
			this.anIntArrayArray23[3][3] = 0;
			this.anIntArrayArray23[0][1] = 0;
			this.anIntArrayArray23[1][1] = 0;
			this.anIntArrayArray23[5][0] = 3411;
			this.anIntArrayArray23[2][2] = 4096;
			this.anIntArrayArray23[3][2] = 4096;
			this.anIntArrayArray23[6][0] = 4096;
			this.anIntArrayArray23[4][2] = 0;
			this.anIntArrayArray23[2][1] = 0;
			this.anIntArrayArray23[4][3] = 0;
			this.anIntArrayArray23[3][1] = 4096;
			this.anIntArrayArray23[5][3] = 4096;
			this.anIntArrayArray23[6][3] = 4096;
			this.anIntArrayArray23[5][2] = 0;
			this.anIntArrayArray23[6][2] = 0;
			this.anIntArrayArray23[4][1] = 4096;
			this.anIntArrayArray23[5][1] = 4096;
			this.anIntArrayArray23[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray23 = new int[6][4];
			this.anIntArrayArray23[0][2] = 0;
			this.anIntArrayArray23[1][2] = 0;
			this.anIntArrayArray23[0][0] = 0;
			this.anIntArrayArray23[1][0] = 1843;
			this.anIntArrayArray23[2][0] = 2457;
			this.anIntArrayArray23[3][0] = 2781;
			this.anIntArrayArray23[0][3] = 0;
			this.anIntArrayArray23[4][0] = 3481;
			this.anIntArrayArray23[0][1] = 0;
			this.anIntArrayArray23[1][1] = 0;
			this.anIntArrayArray23[1][3] = 1493;
			this.anIntArrayArray23[2][1] = 0;
			this.anIntArrayArray23[2][2] = 0;
			this.anIntArrayArray23[3][1] = 0;
			this.anIntArrayArray23[4][1] = 546;
			this.anIntArrayArray23[5][1] = 4096;
			this.anIntArrayArray23[5][0] = 4096;
			this.anIntArrayArray23[3][2] = 1124;
			this.anIntArrayArray23[4][2] = 3084;
			this.anIntArrayArray23[5][2] = 4096;
			this.anIntArrayArray23[2][3] = 2939;
			this.anIntArrayArray23[3][3] = 3565;
			this.anIntArrayArray23[4][3] = 4031;
			this.anIntArrayArray23[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray23 = new int[16][4];
			this.anIntArrayArray23[0][0] = 0;
			this.anIntArrayArray23[0][2] = 192;
			this.anIntArrayArray23[1][2] = 449;
			this.anIntArrayArray23[0][3] = 321;
			this.anIntArrayArray23[0][1] = 80;
			this.anIntArrayArray23[1][0] = 155;
			this.anIntArrayArray23[1][1] = 321;
			this.anIntArrayArray23[2][0] = 389;
			this.anIntArrayArray23[2][2] = 690;
			this.anIntArrayArray23[1][3] = 562;
			this.anIntArrayArray23[2][3] = 803;
			this.anIntArrayArray23[3][0] = 671;
			this.anIntArrayArray23[2][1] = 578;
			this.anIntArrayArray23[3][1] = 947;
			this.anIntArrayArray23[4][1] = 1285;
			this.anIntArrayArray23[3][2] = 995;
			this.anIntArrayArray23[3][3] = 1140;
			this.anIntArrayArray23[4][2] = 1397;
			this.anIntArrayArray23[4][3] = 1509;
			this.anIntArrayArray23[5][3] = 1413;
			this.anIntArrayArray23[5][1] = 1525;
			this.anIntArrayArray23[5][2] = 1429;
			this.anIntArrayArray23[4][0] = 897;
			this.anIntArrayArray23[6][2] = 1461;
			this.anIntArrayArray23[6][1] = 1734;
			this.anIntArrayArray23[6][3] = 1333;
			this.anIntArrayArray23[7][2] = 1525;
			this.anIntArrayArray23[7][1] = 1413;
			this.anIntArrayArray23[7][3] = 1702;
			this.anIntArrayArray23[8][3] = 2056;
			this.anIntArrayArray23[9][3] = 2666;
			this.anIntArrayArray23[10][3] = 3276;
			this.anIntArrayArray23[8][1] = 1108;
			this.anIntArrayArray23[8][2] = 1590;
			this.anIntArrayArray23[9][2] = 2056;
			this.anIntArrayArray23[5][0] = 1175;
			this.anIntArrayArray23[11][3] = 3228;
			this.anIntArrayArray23[12][3] = 3196;
			this.anIntArrayArray23[6][0] = 1368;
			this.anIntArrayArray23[7][0] = 1507;
			this.anIntArrayArray23[8][0] = 1736;
			this.anIntArrayArray23[9][1] = 1766;
			this.anIntArrayArray23[10][2] = 2586;
			this.anIntArrayArray23[13][3] = 3019;
			this.anIntArrayArray23[9][0] = 2088;
			this.anIntArrayArray23[10][1] = 2409;
			this.anIntArrayArray23[10][0] = 2355;
			this.anIntArrayArray23[11][1] = 3116;
			this.anIntArrayArray23[11][0] = 2691;
			this.anIntArrayArray23[12][1] = 3806;
			this.anIntArrayArray23[11][2] = 3148;
			this.anIntArrayArray23[12][2] = 3710;
			this.anIntArrayArray23[14][3] = 3228;
			this.anIntArrayArray23[15][3] = 2746;
			this.anIntArrayArray23[13][1] = 3437;
			this.anIntArrayArray23[14][1] = 3116;
			this.anIntArrayArray23[12][0] = 3031;
			this.anIntArrayArray23[15][1] = 2377;
			this.anIntArrayArray23[13][0] = 3522;
			this.anIntArrayArray23[14][0] = 3727;
			this.anIntArrayArray23[13][2] = 3421;
			this.anIntArrayArray23[14][2] = 3148;
			this.anIntArrayArray23[15][2] = 2505;
			this.anIntArrayArray23[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray23 = new int[4][4];
			this.anIntArrayArray23[0][1] = 0;
			this.anIntArrayArray23[0][3] = 0;
			this.anIntArrayArray23[1][1] = 4096;
			this.anIntArrayArray23[0][2] = 4096;
			this.anIntArrayArray23[1][3] = 0;
			this.anIntArrayArray23[1][2] = 4096;
			this.anIntArrayArray23[2][2] = 4096;
			this.anIntArrayArray23[2][3] = 0;
			this.anIntArrayArray23[2][1] = 4096;
			this.anIntArrayArray23[3][2] = 0;
			this.anIntArrayArray23[3][3] = 0;
			this.anIntArrayArray23[3][1] = 4096;
			this.anIntArrayArray23[0][0] = 2048;
			this.anIntArrayArray23[1][0] = 2867;
			this.anIntArrayArray23[2][0] = 3276;
			this.anIntArrayArray23[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
