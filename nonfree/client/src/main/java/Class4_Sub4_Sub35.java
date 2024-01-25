import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class4_Sub4_Sub35 extends Class4_Sub4 {

	@OriginalMember(owner = "client!vr", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!vr", name = "J", descriptor = "[I")
	private final int[] anIntArray543 = new int[257];

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB)V")
	private void method5765(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray60 = new int[2][4];
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[0][2] = 0;
			this.anIntArrayArray60[0][1] = 0;
			this.anIntArrayArray60[0][3] = 0;
			this.anIntArrayArray60[1][2] = 4096;
			this.anIntArrayArray60[1][3] = 4096;
			this.anIntArrayArray60[1][0] = 4096;
			this.anIntArrayArray60[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray60 = new int[8][4];
			this.anIntArrayArray60[0][3] = 2361;
			this.anIntArrayArray60[0][2] = 2602;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[0][1] = 2650;
			this.anIntArrayArray60[1][0] = 2867;
			this.anIntArrayArray60[1][1] = 2313;
			this.anIntArrayArray60[1][2] = 1799;
			this.anIntArrayArray60[1][3] = 1558;
			this.anIntArrayArray60[2][1] = 2618;
			this.anIntArrayArray60[2][3] = 1413;
			this.anIntArrayArray60[2][0] = 3072;
			this.anIntArrayArray60[2][2] = 1734;
			this.anIntArrayArray60[3][3] = 947;
			this.anIntArrayArray60[3][1] = 2296;
			this.anIntArrayArray60[3][2] = 1220;
			this.anIntArrayArray60[3][0] = 3276;
			this.anIntArrayArray60[4][2] = 963;
			this.anIntArrayArray60[4][0] = 3481;
			this.anIntArrayArray60[4][3] = 722;
			this.anIntArrayArray60[4][1] = 2072;
			this.anIntArrayArray60[5][0] = 3686;
			this.anIntArrayArray60[5][1] = 2730;
			this.anIntArrayArray60[5][2] = 2152;
			this.anIntArrayArray60[5][3] = 1766;
			this.anIntArrayArray60[6][3] = 915;
			this.anIntArrayArray60[6][2] = 1060;
			this.anIntArrayArray60[6][0] = 3891;
			this.anIntArrayArray60[6][1] = 2232;
			this.anIntArrayArray60[7][1] = 1686;
			this.anIntArrayArray60[7][0] = 4096;
			this.anIntArrayArray60[7][3] = 1140;
			this.anIntArrayArray60[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray60 = new int[7][4];
			this.anIntArrayArray60[0][1] = 0;
			this.anIntArrayArray60[0][2] = 0;
			this.anIntArrayArray60[0][3] = 4096;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[1][2] = 4096;
			this.anIntArrayArray60[1][0] = 663;
			this.anIntArrayArray60[1][1] = 0;
			this.anIntArrayArray60[1][3] = 4096;
			this.anIntArrayArray60[2][1] = 0;
			this.anIntArrayArray60[2][3] = 0;
			this.anIntArrayArray60[2][0] = 1363;
			this.anIntArrayArray60[2][2] = 4096;
			this.anIntArrayArray60[3][3] = 0;
			this.anIntArrayArray60[3][2] = 4096;
			this.anIntArrayArray60[3][1] = 4096;
			this.anIntArrayArray60[3][0] = 2048;
			this.anIntArrayArray60[4][1] = 4096;
			this.anIntArrayArray60[4][3] = 0;
			this.anIntArrayArray60[4][0] = 2727;
			this.anIntArrayArray60[4][2] = 0;
			this.anIntArrayArray60[5][3] = 4096;
			this.anIntArrayArray60[5][1] = 4096;
			this.anIntArrayArray60[5][0] = 3411;
			this.anIntArrayArray60[5][2] = 0;
			this.anIntArrayArray60[6][0] = 4096;
			this.anIntArrayArray60[6][1] = 0;
			this.anIntArrayArray60[6][2] = 0;
			this.anIntArrayArray60[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray60 = new int[6][4];
			this.anIntArrayArray60[0][2] = 0;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[0][1] = 0;
			this.anIntArrayArray60[0][3] = 0;
			this.anIntArrayArray60[1][0] = 1843;
			this.anIntArrayArray60[1][1] = 0;
			this.anIntArrayArray60[1][3] = 1493;
			this.anIntArrayArray60[1][2] = 0;
			this.anIntArrayArray60[2][1] = 0;
			this.anIntArrayArray60[2][3] = 2939;
			this.anIntArrayArray60[2][0] = 2457;
			this.anIntArrayArray60[2][2] = 0;
			this.anIntArrayArray60[3][0] = 2781;
			this.anIntArrayArray60[3][3] = 3565;
			this.anIntArrayArray60[3][1] = 0;
			this.anIntArrayArray60[3][2] = 1124;
			this.anIntArrayArray60[4][1] = 546;
			this.anIntArrayArray60[4][2] = 3084;
			this.anIntArrayArray60[4][0] = 3481;
			this.anIntArrayArray60[4][3] = 4031;
			this.anIntArrayArray60[5][2] = 4096;
			this.anIntArrayArray60[5][1] = 4096;
			this.anIntArrayArray60[5][3] = 4096;
			this.anIntArrayArray60[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray60 = new int[16][4];
			this.anIntArrayArray60[0][1] = 80;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[0][3] = 321;
			this.anIntArrayArray60[0][2] = 192;
			this.anIntArrayArray60[1][2] = 449;
			this.anIntArrayArray60[1][1] = 321;
			this.anIntArrayArray60[1][0] = 155;
			this.anIntArrayArray60[1][3] = 562;
			this.anIntArrayArray60[2][2] = 690;
			this.anIntArrayArray60[2][3] = 803;
			this.anIntArrayArray60[2][1] = 578;
			this.anIntArrayArray60[2][0] = 389;
			this.anIntArrayArray60[3][0] = 671;
			this.anIntArrayArray60[3][2] = 995;
			this.anIntArrayArray60[3][1] = 947;
			this.anIntArrayArray60[3][3] = 1140;
			this.anIntArrayArray60[4][3] = 1509;
			this.anIntArrayArray60[4][0] = 897;
			this.anIntArrayArray60[4][2] = 1397;
			this.anIntArrayArray60[4][1] = 1285;
			this.anIntArrayArray60[5][1] = 1525;
			this.anIntArrayArray60[5][3] = 1413;
			this.anIntArrayArray60[5][2] = 1429;
			this.anIntArrayArray60[5][0] = 1175;
			this.anIntArrayArray60[6][1] = 1734;
			this.anIntArrayArray60[6][0] = 1368;
			this.anIntArrayArray60[6][2] = 1461;
			this.anIntArrayArray60[6][3] = 1333;
			this.anIntArrayArray60[7][0] = 1507;
			this.anIntArrayArray60[7][2] = 1525;
			this.anIntArrayArray60[7][1] = 1413;
			this.anIntArrayArray60[7][3] = 1702;
			this.anIntArrayArray60[8][3] = 2056;
			this.anIntArrayArray60[8][2] = 1590;
			this.anIntArrayArray60[8][1] = 1108;
			this.anIntArrayArray60[8][0] = 1736;
			this.anIntArrayArray60[9][1] = 1766;
			this.anIntArrayArray60[9][3] = 2666;
			this.anIntArrayArray60[9][2] = 2056;
			this.anIntArrayArray60[9][0] = 2088;
			this.anIntArrayArray60[10][1] = 2409;
			this.anIntArrayArray60[10][0] = 2355;
			this.anIntArrayArray60[10][3] = 3276;
			this.anIntArrayArray60[10][2] = 2586;
			this.anIntArrayArray60[11][0] = 2691;
			this.anIntArrayArray60[11][1] = 3116;
			this.anIntArrayArray60[11][3] = 3228;
			this.anIntArrayArray60[11][2] = 3148;
			this.anIntArrayArray60[12][0] = 3031;
			this.anIntArrayArray60[12][2] = 3710;
			this.anIntArrayArray60[12][1] = 3806;
			this.anIntArrayArray60[12][3] = 3196;
			this.anIntArrayArray60[13][1] = 3437;
			this.anIntArrayArray60[13][0] = 3522;
			this.anIntArrayArray60[13][2] = 3421;
			this.anIntArrayArray60[13][3] = 3019;
			this.anIntArrayArray60[14][0] = 3727;
			this.anIntArrayArray60[14][3] = 3228;
			this.anIntArrayArray60[14][2] = 3148;
			this.anIntArrayArray60[14][1] = 3116;
			this.anIntArrayArray60[15][1] = 2377;
			this.anIntArrayArray60[15][3] = 2746;
			this.anIntArrayArray60[15][2] = 2505;
			this.anIntArrayArray60[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray60 = new int[4][4];
			this.anIntArrayArray60[0][1] = 0;
			this.anIntArrayArray60[0][2] = 4096;
			this.anIntArrayArray60[0][0] = 2048;
			this.anIntArrayArray60[0][3] = 0;
			this.anIntArrayArray60[1][2] = 4096;
			this.anIntArrayArray60[1][1] = 4096;
			this.anIntArrayArray60[1][0] = 2867;
			this.anIntArrayArray60[1][3] = 0;
			this.anIntArrayArray60[2][2] = 4096;
			this.anIntArrayArray60[2][3] = 0;
			this.anIntArrayArray60[2][1] = 4096;
			this.anIntArrayArray60[2][0] = 3276;
			this.anIntArrayArray60[3][2] = 0;
			this.anIntArrayArray60[3][3] = 0;
			this.anIntArrayArray60[3][1] = 4096;
			this.anIntArrayArray60[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(11) int local11 = arg1.method5007();
		if (local11 != 0) {
			this.method5765(local11);
			return;
		}
		this.anIntArrayArray60 = new int[arg1.method5007()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray60.length; local31++) {
			this.anIntArrayArray60[local31][0] = arg1.method5028();
			this.anIntArrayArray60[local31][1] = arg1.method5007() << 4;
			this.anIntArrayArray60[local31][2] = arg1.method5007() << 4;
			this.anIntArrayArray60[local31][3] = arg1.method5007() << 4;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
		if (this.anIntArrayArray60 == null) {
			this.method5765(1);
		}
		this.method5769();
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V")
	private void method5769() {
		@Pc(9) int local9 = this.anIntArrayArray60.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < 257; local21++) {
			@Pc(25) int local25 = 0;
			@Pc(29) int local29 = local21 << 4;
			for (@Pc(31) int local31 = 0; local31 < local9 && this.anIntArrayArray60[local31][0] <= local29; local31++) {
				local25++;
			}
			@Pc(64) int local64;
			@Pc(72) int local72;
			@Pc(68) int local68;
			@Pc(60) int[] local60;
			if (local25 >= local9) {
				local60 = this.anIntArrayArray60[local9 - 1];
				local64 = local60[1];
				local68 = local60[3];
				local72 = local60[2];
			} else {
				local60 = this.anIntArrayArray60[local25];
				if (local25 <= 0) {
					local64 = local60[1];
					local68 = local60[3];
					local72 = local60[2];
				} else {
					@Pc(102) int[] local102 = this.anIntArrayArray60[local25 - 1];
					@Pc(119) int local119 = (local29 - local102[0] << 12) / (local60[0] - local102[0]);
					@Pc(124) int local124 = 4096 - local119;
					local72 = local119 * local60[2] + local124 * local102[2] >> 12;
					local64 = local119 * local60[1] + local124 * local102[1] >> 12;
					local68 = local102[3] * local124 + local60[3] * local119 >> 12;
				}
			}
			local64 >>= 0x4;
			local72 >>= 0x4;
			local68 >>= 0x4;
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
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
			this.anIntArray543[local21] = local72 << 8 | local64 << 16 | local68;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(21) int[] local21 = this.method6040(arg0, 0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static419.anInt6404; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray543[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
