import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class8_Sub2_Sub1 extends Class8_Sub2 {

	@OriginalMember(owner = "client!aj", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!aj", name = "N", descriptor = "[I")
	private final int[] anIntArray21 = new int[257];

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)V")
	private void method803() {
		@Pc(14) int local14 = this.anIntArrayArray2.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < 257; local21++) {
			@Pc(25) int local25 = 0;
			@Pc(29) int local29 = local21 << 4;
			for (@Pc(31) int local31 = 0; local14 > local31 && this.anIntArrayArray2[local31][0] <= local29; local31++) {
				local25++;
			}
			@Pc(68) int local68;
			@Pc(72) int local72;
			@Pc(76) int local76;
			@Pc(64) int[] local64;
			if (local14 <= local25) {
				local64 = this.anIntArrayArray2[local14 - 1];
				local68 = local64[1];
				local72 = local64[2];
				local76 = local64[3];
			} else {
				local64 = this.anIntArrayArray2[local25];
				if (local25 <= 0) {
					local72 = local64[2];
					local68 = local64[1];
					local76 = local64[3];
				} else {
					@Pc(109) int[] local109 = this.anIntArrayArray2[local25 - 1];
					@Pc(126) int local126 = (local29 - local109[0] << 12) / (local64[0] - local109[0]);
					@Pc(131) int local131 = 4096 - local126;
					local76 = local109[3] * local131 + local64[3] * local126 >> 12;
					local72 = local131 * local109[2] + local64[2] * local126 >> 12;
					local68 = local131 * local109[1] + local126 * local64[1] >> 12;
				}
			}
			local76 >>= 0x4;
			local72 >>= 0x4;
			local68 >>= 0x4;
			if (local76 < 0) {
				local76 = 0;
			} else if (local76 > 255) {
				local76 = 255;
			}
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
			this.anIntArray21[local21] = local72 << 8 | local68 << 16 | local76;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(10) int local10 = arg1.method8525();
		if (local10 != 0) {
			this.method807(local10);
			return;
		}
		this.anIntArrayArray2 = new int[arg1.method8525()][4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArrayArray2.length; local30++) {
			this.anIntArrayArray2[local30][0] = arg1.method8578();
			this.anIntArrayArray2[local30][1] = arg1.method8525() << 4;
			this.anIntArrayArray2[local30][2] = arg1.method8525() << 4;
			this.anIntArrayArray2[local30][3] = arg1.method8525() << 4;
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
		if (this.anIntArrayArray2 == null) {
			this.method807(1);
		}
		this.method803();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	private void method807(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray2 = new int[2][4];
			this.anIntArrayArray2[0][2] = 0;
			this.anIntArrayArray2[0][1] = 0;
			this.anIntArrayArray2[0][0] = 0;
			this.anIntArrayArray2[0][3] = 0;
			this.anIntArrayArray2[1][0] = 4096;
			this.anIntArrayArray2[1][3] = 4096;
			this.anIntArrayArray2[1][1] = 4096;
			this.anIntArrayArray2[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray2 = new int[8][4];
			this.anIntArrayArray2[0][1] = 2650;
			this.anIntArrayArray2[0][3] = 2361;
			this.anIntArrayArray2[0][2] = 2602;
			this.anIntArrayArray2[0][0] = 0;
			this.anIntArrayArray2[1][3] = 1558;
			this.anIntArrayArray2[1][0] = 2867;
			this.anIntArrayArray2[1][2] = 1799;
			this.anIntArrayArray2[1][1] = 2313;
			this.anIntArrayArray2[2][3] = 1413;
			this.anIntArrayArray2[2][2] = 1734;
			this.anIntArrayArray2[2][1] = 2618;
			this.anIntArrayArray2[2][0] = 3072;
			this.anIntArrayArray2[3][2] = 1220;
			this.anIntArrayArray2[3][1] = 2296;
			this.anIntArrayArray2[3][3] = 947;
			this.anIntArrayArray2[3][0] = 3276;
			this.anIntArrayArray2[4][0] = 3481;
			this.anIntArrayArray2[4][2] = 963;
			this.anIntArrayArray2[4][3] = 722;
			this.anIntArrayArray2[4][1] = 2072;
			this.anIntArrayArray2[5][2] = 2152;
			this.anIntArrayArray2[5][1] = 2730;
			this.anIntArrayArray2[5][0] = 3686;
			this.anIntArrayArray2[5][3] = 1766;
			this.anIntArrayArray2[6][2] = 1060;
			this.anIntArrayArray2[6][3] = 915;
			this.anIntArrayArray2[6][0] = 3891;
			this.anIntArrayArray2[6][1] = 2232;
			this.anIntArrayArray2[7][2] = 1413;
			this.anIntArrayArray2[7][1] = 1686;
			this.anIntArrayArray2[7][3] = 1140;
			this.anIntArrayArray2[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray2 = new int[7][4];
			this.anIntArrayArray2[0][1] = 0;
			this.anIntArrayArray2[0][3] = 4096;
			this.anIntArrayArray2[0][0] = 0;
			this.anIntArrayArray2[0][2] = 0;
			this.anIntArrayArray2[1][0] = 663;
			this.anIntArrayArray2[1][2] = 4096;
			this.anIntArrayArray2[1][1] = 0;
			this.anIntArrayArray2[1][3] = 4096;
			this.anIntArrayArray2[2][1] = 0;
			this.anIntArrayArray2[2][3] = 0;
			this.anIntArrayArray2[2][2] = 4096;
			this.anIntArrayArray2[2][0] = 1363;
			this.anIntArrayArray2[3][1] = 4096;
			this.anIntArrayArray2[3][0] = 2048;
			this.anIntArrayArray2[3][2] = 4096;
			this.anIntArrayArray2[3][3] = 0;
			this.anIntArrayArray2[4][2] = 0;
			this.anIntArrayArray2[4][1] = 4096;
			this.anIntArrayArray2[4][3] = 0;
			this.anIntArrayArray2[4][0] = 2727;
			this.anIntArrayArray2[5][0] = 3411;
			this.anIntArrayArray2[5][1] = 4096;
			this.anIntArrayArray2[5][3] = 4096;
			this.anIntArrayArray2[5][2] = 0;
			this.anIntArrayArray2[6][0] = 4096;
			this.anIntArrayArray2[6][2] = 0;
			this.anIntArrayArray2[6][1] = 0;
			this.anIntArrayArray2[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray2 = new int[6][4];
			this.anIntArrayArray2[0][1] = 0;
			this.anIntArrayArray2[0][2] = 0;
			this.anIntArrayArray2[0][3] = 0;
			this.anIntArrayArray2[0][0] = 0;
			this.anIntArrayArray2[1][2] = 0;
			this.anIntArrayArray2[1][1] = 0;
			this.anIntArrayArray2[1][3] = 1493;
			this.anIntArrayArray2[1][0] = 1843;
			this.anIntArrayArray2[2][0] = 2457;
			this.anIntArrayArray2[2][1] = 0;
			this.anIntArrayArray2[2][2] = 0;
			this.anIntArrayArray2[2][3] = 2939;
			this.anIntArrayArray2[3][1] = 0;
			this.anIntArrayArray2[3][2] = 1124;
			this.anIntArrayArray2[3][0] = 2781;
			this.anIntArrayArray2[3][3] = 3565;
			this.anIntArrayArray2[4][2] = 3084;
			this.anIntArrayArray2[4][0] = 3481;
			this.anIntArrayArray2[4][3] = 4031;
			this.anIntArrayArray2[4][1] = 546;
			this.anIntArrayArray2[5][2] = 4096;
			this.anIntArrayArray2[5][3] = 4096;
			this.anIntArrayArray2[5][0] = 4096;
			this.anIntArrayArray2[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray2 = new int[16][4];
			this.anIntArrayArray2[0][0] = 0;
			this.anIntArrayArray2[0][2] = 192;
			this.anIntArrayArray2[0][1] = 80;
			this.anIntArrayArray2[0][3] = 321;
			this.anIntArrayArray2[1][3] = 562;
			this.anIntArrayArray2[1][0] = 155;
			this.anIntArrayArray2[1][1] = 321;
			this.anIntArrayArray2[1][2] = 449;
			this.anIntArrayArray2[2][1] = 578;
			this.anIntArrayArray2[2][0] = 389;
			this.anIntArrayArray2[2][3] = 803;
			this.anIntArrayArray2[2][2] = 690;
			this.anIntArrayArray2[3][2] = 995;
			this.anIntArrayArray2[3][0] = 671;
			this.anIntArrayArray2[3][3] = 1140;
			this.anIntArrayArray2[3][1] = 947;
			this.anIntArrayArray2[4][0] = 897;
			this.anIntArrayArray2[4][2] = 1397;
			this.anIntArrayArray2[4][1] = 1285;
			this.anIntArrayArray2[4][3] = 1509;
			this.anIntArrayArray2[5][0] = 1175;
			this.anIntArrayArray2[5][1] = 1525;
			this.anIntArrayArray2[5][3] = 1413;
			this.anIntArrayArray2[5][2] = 1429;
			this.anIntArrayArray2[6][1] = 1734;
			this.anIntArrayArray2[6][3] = 1333;
			this.anIntArrayArray2[6][2] = 1461;
			this.anIntArrayArray2[6][0] = 1368;
			this.anIntArrayArray2[7][1] = 1413;
			this.anIntArrayArray2[7][3] = 1702;
			this.anIntArrayArray2[7][0] = 1507;
			this.anIntArrayArray2[7][2] = 1525;
			this.anIntArrayArray2[8][3] = 2056;
			this.anIntArrayArray2[8][2] = 1590;
			this.anIntArrayArray2[8][0] = 1736;
			this.anIntArrayArray2[8][1] = 1108;
			this.anIntArrayArray2[9][0] = 2088;
			this.anIntArrayArray2[9][3] = 2666;
			this.anIntArrayArray2[9][1] = 1766;
			this.anIntArrayArray2[9][2] = 2056;
			this.anIntArrayArray2[10][2] = 2586;
			this.anIntArrayArray2[10][1] = 2409;
			this.anIntArrayArray2[10][0] = 2355;
			this.anIntArrayArray2[10][3] = 3276;
			this.anIntArrayArray2[11][3] = 3228;
			this.anIntArrayArray2[11][0] = 2691;
			this.anIntArrayArray2[11][2] = 3148;
			this.anIntArrayArray2[11][1] = 3116;
			this.anIntArrayArray2[12][1] = 3806;
			this.anIntArrayArray2[12][3] = 3196;
			this.anIntArrayArray2[12][0] = 3031;
			this.anIntArrayArray2[12][2] = 3710;
			this.anIntArrayArray2[13][3] = 3019;
			this.anIntArrayArray2[13][2] = 3421;
			this.anIntArrayArray2[13][0] = 3522;
			this.anIntArrayArray2[13][1] = 3437;
			this.anIntArrayArray2[14][0] = 3727;
			this.anIntArrayArray2[14][1] = 3116;
			this.anIntArrayArray2[14][3] = 3228;
			this.anIntArrayArray2[14][2] = 3148;
			this.anIntArrayArray2[15][0] = 4096;
			this.anIntArrayArray2[15][1] = 2377;
			this.anIntArrayArray2[15][2] = 2505;
			this.anIntArrayArray2[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray2 = new int[4][4];
			this.anIntArrayArray2[0][3] = 0;
			this.anIntArrayArray2[0][1] = 0;
			this.anIntArrayArray2[0][0] = 2048;
			this.anIntArrayArray2[0][2] = 4096;
			this.anIntArrayArray2[1][0] = 2867;
			this.anIntArrayArray2[1][1] = 4096;
			this.anIntArrayArray2[1][3] = 0;
			this.anIntArrayArray2[1][2] = 4096;
			this.anIntArrayArray2[2][1] = 4096;
			this.anIntArrayArray2[2][2] = 4096;
			this.anIntArrayArray2[2][3] = 0;
			this.anIntArrayArray2[2][0] = 3276;
			this.anIntArrayArray2[3][0] = 4096;
			this.anIntArrayArray2[3][1] = 4096;
			this.anIntArrayArray2[3][3] = 0;
			this.anIntArrayArray2[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(21) int[] local21 = this.method8505(arg0, 0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static538.anInt9297; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray21[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
