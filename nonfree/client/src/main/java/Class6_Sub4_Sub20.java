import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class6_Sub4_Sub20 extends Class6_Sub4 {

	@OriginalMember(owner = "client!jq", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!jq", name = "H", descriptor = "[I")
	private final int[] anIntArray318 = new int[257];

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	private void method4781() {
		@Pc(9) int local9 = this.anIntArrayArray19.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < 257; local13++) {
			@Pc(17) int local17 = 0;
			@Pc(21) int local21 = local13 << 4;
			for (@Pc(23) int local23 = 0; local9 > local23 && local21 >= this.anIntArrayArray19[local23][0]; local23++) {
				local17++;
			}
			@Pc(64) int local64;
			@Pc(56) int local56;
			@Pc(60) int local60;
			@Pc(52) int[] local52;
			if (local9 <= local17) {
				local52 = this.anIntArrayArray19[local9 - 1];
				local56 = local52[2];
				local60 = local52[3];
				local64 = local52[1];
			} else {
				local52 = this.anIntArrayArray19[local17];
				if (local17 > 0) {
					@Pc(83) int[] local83 = this.anIntArrayArray19[local17 - 1];
					@Pc(101) int local101 = (local21 - local83[0] << 12) / (local52[0] - local83[0]);
					@Pc(105) int local105 = 4096 - local101;
					local56 = local105 * local83[2] + local52[2] * local101 >> 12;
					local64 = local52[1] * local101 + local105 * local83[1] >> 12;
					local60 = local83[3] * local105 + local52[3] * local101 >> 12;
				} else {
					local56 = local52[2];
					local64 = local52[1];
					local60 = local52[3];
				}
			}
			local64 >>= 0x4;
			local56 >>= 0x4;
			local60 >>= 0x4;
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			if (local56 < 0) {
				local56 = 0;
			} else if (local56 > 255) {
				local56 = 255;
			}
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			this.anIntArray318[local13] = local64 << 16 | local56 << 8 | local60;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
		if (this.anIntArrayArray19 == null) {
			this.method4783(1);
		}
		this.method4781();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)V")
	private void method4783(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray19 = new int[2][4];
			this.anIntArrayArray19[0][0] = 0;
			this.anIntArrayArray19[0][3] = 0;
			this.anIntArrayArray19[0][2] = 0;
			this.anIntArrayArray19[0][1] = 0;
			this.anIntArrayArray19[1][3] = 4096;
			this.anIntArrayArray19[1][2] = 4096;
			this.anIntArrayArray19[1][0] = 4096;
			this.anIntArrayArray19[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray19 = new int[8][4];
			this.anIntArrayArray19[0][3] = 2361;
			this.anIntArrayArray19[0][1] = 2650;
			this.anIntArrayArray19[0][2] = 2602;
			this.anIntArrayArray19[0][0] = 0;
			this.anIntArrayArray19[1][3] = 1558;
			this.anIntArrayArray19[1][2] = 1799;
			this.anIntArrayArray19[1][1] = 2313;
			this.anIntArrayArray19[1][0] = 2867;
			this.anIntArrayArray19[2][0] = 3072;
			this.anIntArrayArray19[2][2] = 1734;
			this.anIntArrayArray19[2][3] = 1413;
			this.anIntArrayArray19[2][1] = 2618;
			this.anIntArrayArray19[3][3] = 947;
			this.anIntArrayArray19[3][2] = 1220;
			this.anIntArrayArray19[3][1] = 2296;
			this.anIntArrayArray19[3][0] = 3276;
			this.anIntArrayArray19[4][2] = 963;
			this.anIntArrayArray19[4][0] = 3481;
			this.anIntArrayArray19[4][3] = 722;
			this.anIntArrayArray19[4][1] = 2072;
			this.anIntArrayArray19[5][1] = 2730;
			this.anIntArrayArray19[5][3] = 1766;
			this.anIntArrayArray19[5][0] = 3686;
			this.anIntArrayArray19[5][2] = 2152;
			this.anIntArrayArray19[6][3] = 915;
			this.anIntArrayArray19[6][0] = 3891;
			this.anIntArrayArray19[6][1] = 2232;
			this.anIntArrayArray19[6][2] = 1060;
			this.anIntArrayArray19[7][2] = 1413;
			this.anIntArrayArray19[7][1] = 1686;
			this.anIntArrayArray19[7][3] = 1140;
			this.anIntArrayArray19[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray19 = new int[7][4];
			this.anIntArrayArray19[0][2] = 0;
			this.anIntArrayArray19[0][1] = 0;
			this.anIntArrayArray19[0][3] = 4096;
			this.anIntArrayArray19[0][0] = 0;
			this.anIntArrayArray19[1][0] = 663;
			this.anIntArrayArray19[1][2] = 4096;
			this.anIntArrayArray19[1][1] = 0;
			this.anIntArrayArray19[1][3] = 4096;
			this.anIntArrayArray19[2][2] = 4096;
			this.anIntArrayArray19[2][0] = 1363;
			this.anIntArrayArray19[2][1] = 0;
			this.anIntArrayArray19[2][3] = 0;
			this.anIntArrayArray19[3][2] = 4096;
			this.anIntArrayArray19[3][0] = 2048;
			this.anIntArrayArray19[3][1] = 4096;
			this.anIntArrayArray19[3][3] = 0;
			this.anIntArrayArray19[4][0] = 2727;
			this.anIntArrayArray19[4][2] = 0;
			this.anIntArrayArray19[4][1] = 4096;
			this.anIntArrayArray19[4][3] = 0;
			this.anIntArrayArray19[5][3] = 4096;
			this.anIntArrayArray19[5][1] = 4096;
			this.anIntArrayArray19[5][0] = 3411;
			this.anIntArrayArray19[5][2] = 0;
			this.anIntArrayArray19[6][2] = 0;
			this.anIntArrayArray19[6][3] = 4096;
			this.anIntArrayArray19[6][0] = 4096;
			this.anIntArrayArray19[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray19 = new int[6][4];
			this.anIntArrayArray19[0][3] = 0;
			this.anIntArrayArray19[0][2] = 0;
			this.anIntArrayArray19[0][0] = 0;
			this.anIntArrayArray19[0][1] = 0;
			this.anIntArrayArray19[1][3] = 1493;
			this.anIntArrayArray19[1][1] = 0;
			this.anIntArrayArray19[1][2] = 0;
			this.anIntArrayArray19[1][0] = 1843;
			this.anIntArrayArray19[2][2] = 0;
			this.anIntArrayArray19[2][1] = 0;
			this.anIntArrayArray19[2][0] = 2457;
			this.anIntArrayArray19[2][3] = 2939;
			this.anIntArrayArray19[3][2] = 1124;
			this.anIntArrayArray19[3][1] = 0;
			this.anIntArrayArray19[3][0] = 2781;
			this.anIntArrayArray19[3][3] = 3565;
			this.anIntArrayArray19[4][3] = 4031;
			this.anIntArrayArray19[4][0] = 3481;
			this.anIntArrayArray19[4][2] = 3084;
			this.anIntArrayArray19[4][1] = 546;
			this.anIntArrayArray19[5][3] = 4096;
			this.anIntArrayArray19[5][2] = 4096;
			this.anIntArrayArray19[5][1] = 4096;
			this.anIntArrayArray19[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray19 = new int[16][4];
			this.anIntArrayArray19[0][3] = 321;
			this.anIntArrayArray19[0][2] = 192;
			this.anIntArrayArray19[0][1] = 80;
			this.anIntArrayArray19[0][0] = 0;
			this.anIntArrayArray19[1][3] = 562;
			this.anIntArrayArray19[1][2] = 449;
			this.anIntArrayArray19[1][1] = 321;
			this.anIntArrayArray19[1][0] = 155;
			this.anIntArrayArray19[2][0] = 389;
			this.anIntArrayArray19[2][1] = 578;
			this.anIntArrayArray19[2][3] = 803;
			this.anIntArrayArray19[2][2] = 690;
			this.anIntArrayArray19[3][3] = 1140;
			this.anIntArrayArray19[3][2] = 995;
			this.anIntArrayArray19[3][0] = 671;
			this.anIntArrayArray19[3][1] = 947;
			this.anIntArrayArray19[4][3] = 1509;
			this.anIntArrayArray19[4][0] = 897;
			this.anIntArrayArray19[4][1] = 1285;
			this.anIntArrayArray19[4][2] = 1397;
			this.anIntArrayArray19[5][0] = 1175;
			this.anIntArrayArray19[5][1] = 1525;
			this.anIntArrayArray19[5][2] = 1429;
			this.anIntArrayArray19[5][3] = 1413;
			this.anIntArrayArray19[6][2] = 1461;
			this.anIntArrayArray19[6][1] = 1734;
			this.anIntArrayArray19[6][3] = 1333;
			this.anIntArrayArray19[6][0] = 1368;
			this.anIntArrayArray19[7][2] = 1525;
			this.anIntArrayArray19[7][3] = 1702;
			this.anIntArrayArray19[7][1] = 1413;
			this.anIntArrayArray19[7][0] = 1507;
			this.anIntArrayArray19[8][0] = 1736;
			this.anIntArrayArray19[8][2] = 1590;
			this.anIntArrayArray19[8][3] = 2056;
			this.anIntArrayArray19[8][1] = 1108;
			this.anIntArrayArray19[9][0] = 2088;
			this.anIntArrayArray19[9][1] = 1766;
			this.anIntArrayArray19[9][3] = 2666;
			this.anIntArrayArray19[9][2] = 2056;
			this.anIntArrayArray19[10][2] = 2586;
			this.anIntArrayArray19[10][1] = 2409;
			this.anIntArrayArray19[10][3] = 3276;
			this.anIntArrayArray19[10][0] = 2355;
			this.anIntArrayArray19[11][3] = 3228;
			this.anIntArrayArray19[11][2] = 3148;
			this.anIntArrayArray19[11][1] = 3116;
			this.anIntArrayArray19[11][0] = 2691;
			this.anIntArrayArray19[12][1] = 3806;
			this.anIntArrayArray19[12][0] = 3031;
			this.anIntArrayArray19[12][3] = 3196;
			this.anIntArrayArray19[12][2] = 3710;
			this.anIntArrayArray19[13][0] = 3522;
			this.anIntArrayArray19[13][1] = 3437;
			this.anIntArrayArray19[13][3] = 3019;
			this.anIntArrayArray19[13][2] = 3421;
			this.anIntArrayArray19[14][2] = 3148;
			this.anIntArrayArray19[14][1] = 3116;
			this.anIntArrayArray19[14][3] = 3228;
			this.anIntArrayArray19[14][0] = 3727;
			this.anIntArrayArray19[15][3] = 2746;
			this.anIntArrayArray19[15][1] = 2377;
			this.anIntArrayArray19[15][0] = 4096;
			this.anIntArrayArray19[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray19 = new int[4][4];
			this.anIntArrayArray19[0][2] = 4096;
			this.anIntArrayArray19[0][0] = 2048;
			this.anIntArrayArray19[0][1] = 0;
			this.anIntArrayArray19[0][3] = 0;
			this.anIntArrayArray19[1][0] = 2867;
			this.anIntArrayArray19[1][2] = 4096;
			this.anIntArrayArray19[1][1] = 4096;
			this.anIntArrayArray19[1][3] = 0;
			this.anIntArrayArray19[2][2] = 4096;
			this.anIntArrayArray19[2][0] = 3276;
			this.anIntArrayArray19[2][3] = 0;
			this.anIntArrayArray19[2][1] = 4096;
			this.anIntArrayArray19[3][3] = 0;
			this.anIntArrayArray19[3][1] = 4096;
			this.anIntArrayArray19[3][2] = 0;
			this.anIntArrayArray19[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(27) int[] local27 = this.method8313(arg0, 0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static6.anInt111; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray318[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(17) int local17 = arg1.method8604();
		if (local17 != 0) {
			this.method4783(local17);
			return;
		}
		this.anIntArrayArray19 = new int[arg1.method8604()][4];
		for (@Pc(36) int local36 = 0; local36 < this.anIntArrayArray19.length; local36++) {
			this.anIntArrayArray19[local36][0] = arg1.method8571();
			this.anIntArrayArray19[local36][1] = arg1.method8604() << 4;
			this.anIntArrayArray19[local36][2] = arg1.method8604() << 4;
			this.anIntArrayArray19[local36][3] = arg1.method8604() << 4;
		}
	}
}
