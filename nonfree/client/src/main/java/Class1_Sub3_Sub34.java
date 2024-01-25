import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class1_Sub3_Sub34 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vaa", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray83;

	@OriginalMember(owner = "client!vaa", name = "G", descriptor = "[I")
	private final int[] anIntArray696 = new int[257];

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vaa", name = "h", descriptor = "(I)V")
	private void method7218() {
		@Pc(9) int local9 = this.anIntArrayArray83.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 257; local19++) {
			@Pc(23) int local23 = 0;
			@Pc(27) int local27 = local19 << 4;
			for (@Pc(29) int local29 = 0; local9 > local29 && local27 >= this.anIntArrayArray83[local29][0]; local29++) {
				local23++;
			}
			@Pc(66) int local66;
			@Pc(70) int local70;
			@Pc(62) int local62;
			@Pc(56) int[] local56;
			if (local23 < local9) {
				local56 = this.anIntArrayArray83[local23];
				if (local23 <= 0) {
					local62 = local56[3];
					local66 = local56[1];
					local70 = local56[2];
				} else {
					@Pc(79) int[] local79 = this.anIntArrayArray83[local23 - 1];
					@Pc(97) int local97 = (local27 - local79[0] << 12) / (local56[0] - local79[0]);
					@Pc(102) int local102 = 4096 - local97;
					local66 = local97 * local56[1] + local102 * local79[1] >> 12;
					local62 = local97 * local56[3] + local79[3] * local102 >> 12;
					local70 = local56[2] * local97 + local102 * local79[2] >> 12;
				}
			} else {
				local56 = this.anIntArrayArray83[local9 - 1];
				local70 = local56[2];
				local66 = local56[1];
				local62 = local56[3];
			}
			local62 >>= 0x4;
			local70 >>= 0x4;
			local66 >>= 0x4;
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 255) {
				local70 = 255;
			}
			if (local62 < 0) {
				local62 = 0;
			} else if (local62 > 255) {
				local62 = 255;
			}
			if (local66 < 0) {
				local66 = 0;
			} else if (local66 > 255) {
				local66 = 255;
			}
			this.anIntArray696[local19] = local62 | local70 << 8 | local66 << 16;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
		if (this.anIntArrayArray83 == null) {
			this.method7219(1);
		}
		this.method7218();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(7) int local7 = arg0.method3043();
		if (local7 != 0) {
			this.method7219(local7);
			return;
		}
		this.anIntArrayArray83 = new int[arg0.method3043()][4];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray83.length; local27++) {
			this.anIntArrayArray83[local27][0] = arg0.method3056();
			this.anIntArrayArray83[local27][1] = arg0.method3043() << 4;
			this.anIntArrayArray83[local27][2] = arg0.method3043() << 4;
			this.anIntArrayArray83[local27][3] = arg0.method3043() << 4;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(27) int[] local27 = this.method7911(arg0, 0);
			@Pc(31) int[] local31 = local17[0];
			@Pc(35) int[] local35 = local17[1];
			@Pc(39) int[] local39 = local17[2];
			for (@Pc(41) int local41 = 0; local41 < Static236.anInt4609; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray696[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZ)V")
	private void method7219(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray83 = new int[2][4];
			this.anIntArrayArray83[0][0] = 0;
			this.anIntArrayArray83[0][3] = 0;
			this.anIntArrayArray83[0][2] = 0;
			this.anIntArrayArray83[0][1] = 0;
			this.anIntArrayArray83[1][0] = 4096;
			this.anIntArrayArray83[1][3] = 4096;
			this.anIntArrayArray83[1][2] = 4096;
			this.anIntArrayArray83[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray83 = new int[8][4];
			this.anIntArrayArray83[0][0] = 0;
			this.anIntArrayArray83[0][2] = 2602;
			this.anIntArrayArray83[0][1] = 2650;
			this.anIntArrayArray83[0][3] = 2361;
			this.anIntArrayArray83[1][3] = 1558;
			this.anIntArrayArray83[1][1] = 2313;
			this.anIntArrayArray83[1][0] = 2867;
			this.anIntArrayArray83[1][2] = 1799;
			this.anIntArrayArray83[2][3] = 1413;
			this.anIntArrayArray83[2][1] = 2618;
			this.anIntArrayArray83[2][0] = 3072;
			this.anIntArrayArray83[2][2] = 1734;
			this.anIntArrayArray83[3][2] = 1220;
			this.anIntArrayArray83[3][3] = 947;
			this.anIntArrayArray83[3][0] = 3276;
			this.anIntArrayArray83[3][1] = 2296;
			this.anIntArrayArray83[4][3] = 722;
			this.anIntArrayArray83[4][2] = 963;
			this.anIntArrayArray83[4][0] = 3481;
			this.anIntArrayArray83[4][1] = 2072;
			this.anIntArrayArray83[5][1] = 2730;
			this.anIntArrayArray83[5][0] = 3686;
			this.anIntArrayArray83[5][3] = 1766;
			this.anIntArrayArray83[5][2] = 2152;
			this.anIntArrayArray83[6][3] = 915;
			this.anIntArrayArray83[6][2] = 1060;
			this.anIntArrayArray83[6][0] = 3891;
			this.anIntArrayArray83[6][1] = 2232;
			this.anIntArrayArray83[7][1] = 1686;
			this.anIntArrayArray83[7][2] = 1413;
			this.anIntArrayArray83[7][3] = 1140;
			this.anIntArrayArray83[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray83 = new int[7][4];
			this.anIntArrayArray83[0][2] = 0;
			this.anIntArrayArray83[0][3] = 4096;
			this.anIntArrayArray83[0][0] = 0;
			this.anIntArrayArray83[0][1] = 0;
			this.anIntArrayArray83[1][0] = 663;
			this.anIntArrayArray83[1][2] = 4096;
			this.anIntArrayArray83[1][3] = 4096;
			this.anIntArrayArray83[1][1] = 0;
			this.anIntArrayArray83[2][2] = 4096;
			this.anIntArrayArray83[2][0] = 1363;
			this.anIntArrayArray83[2][1] = 0;
			this.anIntArrayArray83[2][3] = 0;
			this.anIntArrayArray83[3][1] = 4096;
			this.anIntArrayArray83[3][0] = 2048;
			this.anIntArrayArray83[3][2] = 4096;
			this.anIntArrayArray83[3][3] = 0;
			this.anIntArrayArray83[4][1] = 4096;
			this.anIntArrayArray83[4][3] = 0;
			this.anIntArrayArray83[4][2] = 0;
			this.anIntArrayArray83[4][0] = 2727;
			this.anIntArrayArray83[5][2] = 0;
			this.anIntArrayArray83[5][3] = 4096;
			this.anIntArrayArray83[5][1] = 4096;
			this.anIntArrayArray83[5][0] = 3411;
			this.anIntArrayArray83[6][1] = 0;
			this.anIntArrayArray83[6][3] = 4096;
			this.anIntArrayArray83[6][0] = 4096;
			this.anIntArrayArray83[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray83 = new int[6][4];
			this.anIntArrayArray83[0][0] = 0;
			this.anIntArrayArray83[0][3] = 0;
			this.anIntArrayArray83[0][2] = 0;
			this.anIntArrayArray83[0][1] = 0;
			this.anIntArrayArray83[1][1] = 0;
			this.anIntArrayArray83[1][3] = 1493;
			this.anIntArrayArray83[1][0] = 1843;
			this.anIntArrayArray83[1][2] = 0;
			this.anIntArrayArray83[2][2] = 0;
			this.anIntArrayArray83[2][0] = 2457;
			this.anIntArrayArray83[2][3] = 2939;
			this.anIntArrayArray83[2][1] = 0;
			this.anIntArrayArray83[3][3] = 3565;
			this.anIntArrayArray83[3][1] = 0;
			this.anIntArrayArray83[3][0] = 2781;
			this.anIntArrayArray83[3][2] = 1124;
			this.anIntArrayArray83[4][2] = 3084;
			this.anIntArrayArray83[4][3] = 4031;
			this.anIntArrayArray83[4][0] = 3481;
			this.anIntArrayArray83[4][1] = 546;
			this.anIntArrayArray83[5][2] = 4096;
			this.anIntArrayArray83[5][3] = 4096;
			this.anIntArrayArray83[5][1] = 4096;
			this.anIntArrayArray83[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray83 = new int[16][4];
			this.anIntArrayArray83[0][3] = 321;
			this.anIntArrayArray83[0][2] = 192;
			this.anIntArrayArray83[0][1] = 80;
			this.anIntArrayArray83[0][0] = 0;
			this.anIntArrayArray83[1][3] = 562;
			this.anIntArrayArray83[1][0] = 155;
			this.anIntArrayArray83[1][2] = 449;
			this.anIntArrayArray83[1][1] = 321;
			this.anIntArrayArray83[2][1] = 578;
			this.anIntArrayArray83[2][2] = 690;
			this.anIntArrayArray83[2][3] = 803;
			this.anIntArrayArray83[2][0] = 389;
			this.anIntArrayArray83[3][1] = 947;
			this.anIntArrayArray83[3][2] = 995;
			this.anIntArrayArray83[3][0] = 671;
			this.anIntArrayArray83[3][3] = 1140;
			this.anIntArrayArray83[4][0] = 897;
			this.anIntArrayArray83[4][1] = 1285;
			this.anIntArrayArray83[4][2] = 1397;
			this.anIntArrayArray83[4][3] = 1509;
			this.anIntArrayArray83[5][1] = 1525;
			this.anIntArrayArray83[5][2] = 1429;
			this.anIntArrayArray83[5][3] = 1413;
			this.anIntArrayArray83[5][0] = 1175;
			this.anIntArrayArray83[6][0] = 1368;
			this.anIntArrayArray83[6][1] = 1734;
			this.anIntArrayArray83[6][3] = 1333;
			this.anIntArrayArray83[6][2] = 1461;
			this.anIntArrayArray83[7][1] = 1413;
			this.anIntArrayArray83[7][2] = 1525;
			this.anIntArrayArray83[7][0] = 1507;
			this.anIntArrayArray83[7][3] = 1702;
			this.anIntArrayArray83[8][2] = 1590;
			this.anIntArrayArray83[8][0] = 1736;
			this.anIntArrayArray83[8][1] = 1108;
			this.anIntArrayArray83[8][3] = 2056;
			this.anIntArrayArray83[9][2] = 2056;
			this.anIntArrayArray83[9][3] = 2666;
			this.anIntArrayArray83[9][0] = 2088;
			this.anIntArrayArray83[9][1] = 1766;
			this.anIntArrayArray83[10][3] = 3276;
			this.anIntArrayArray83[10][0] = 2355;
			this.anIntArrayArray83[10][2] = 2586;
			this.anIntArrayArray83[10][1] = 2409;
			this.anIntArrayArray83[11][3] = 3228;
			this.anIntArrayArray83[11][0] = 2691;
			this.anIntArrayArray83[11][2] = 3148;
			this.anIntArrayArray83[11][1] = 3116;
			this.anIntArrayArray83[12][1] = 3806;
			this.anIntArrayArray83[12][0] = 3031;
			this.anIntArrayArray83[12][2] = 3710;
			this.anIntArrayArray83[12][3] = 3196;
			this.anIntArrayArray83[13][1] = 3437;
			this.anIntArrayArray83[13][0] = 3522;
			this.anIntArrayArray83[13][2] = 3421;
			this.anIntArrayArray83[13][3] = 3019;
			this.anIntArrayArray83[14][1] = 3116;
			this.anIntArrayArray83[14][3] = 3228;
			this.anIntArrayArray83[14][2] = 3148;
			this.anIntArrayArray83[14][0] = 3727;
			this.anIntArrayArray83[15][0] = 4096;
			this.anIntArrayArray83[15][2] = 2505;
			this.anIntArrayArray83[15][3] = 2746;
			this.anIntArrayArray83[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray83 = new int[4][4];
			this.anIntArrayArray83[0][2] = 4096;
			this.anIntArrayArray83[0][1] = 0;
			this.anIntArrayArray83[0][0] = 2048;
			this.anIntArrayArray83[0][3] = 0;
			this.anIntArrayArray83[1][3] = 0;
			this.anIntArrayArray83[1][2] = 4096;
			this.anIntArrayArray83[1][0] = 2867;
			this.anIntArrayArray83[1][1] = 4096;
			this.anIntArrayArray83[2][0] = 3276;
			this.anIntArrayArray83[2][3] = 0;
			this.anIntArrayArray83[2][2] = 4096;
			this.anIntArrayArray83[2][1] = 4096;
			this.anIntArrayArray83[3][3] = 0;
			this.anIntArrayArray83[3][0] = 4096;
			this.anIntArrayArray83[3][1] = 4096;
			this.anIntArrayArray83[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
