import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gl", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!gl", name = "Q", descriptor = "[I")
	private final int[] anIntArray263 = new int[257];

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(II)V")
	private void method2005(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray21 = new int[2][4];
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[0][1] = 0;
			this.anIntArrayArray21[0][2] = 0;
			this.anIntArrayArray21[0][3] = 0;
			this.anIntArrayArray21[1][0] = 4096;
			this.anIntArrayArray21[1][1] = 4096;
			this.anIntArrayArray21[1][3] = 4096;
			this.anIntArrayArray21[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray21 = new int[8][4];
			this.anIntArrayArray21[0][2] = 2602;
			this.anIntArrayArray21[0][1] = 2650;
			this.anIntArrayArray21[0][3] = 2361;
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[1][3] = 1558;
			this.anIntArrayArray21[1][2] = 1799;
			this.anIntArrayArray21[1][1] = 2313;
			this.anIntArrayArray21[1][0] = 2867;
			this.anIntArrayArray21[2][2] = 1734;
			this.anIntArrayArray21[2][0] = 3072;
			this.anIntArrayArray21[2][3] = 1413;
			this.anIntArrayArray21[2][1] = 2618;
			this.anIntArrayArray21[3][0] = 3276;
			this.anIntArrayArray21[3][1] = 2296;
			this.anIntArrayArray21[3][2] = 1220;
			this.anIntArrayArray21[3][3] = 947;
			this.anIntArrayArray21[4][2] = 963;
			this.anIntArrayArray21[4][0] = 3481;
			this.anIntArrayArray21[4][1] = 2072;
			this.anIntArrayArray21[4][3] = 722;
			this.anIntArrayArray21[5][0] = 3686;
			this.anIntArrayArray21[5][2] = 2152;
			this.anIntArrayArray21[5][1] = 2730;
			this.anIntArrayArray21[5][3] = 1766;
			this.anIntArrayArray21[6][0] = 3891;
			this.anIntArrayArray21[6][1] = 2232;
			this.anIntArrayArray21[6][3] = 915;
			this.anIntArrayArray21[6][2] = 1060;
			this.anIntArrayArray21[7][3] = 1140;
			this.anIntArrayArray21[7][0] = 4096;
			this.anIntArrayArray21[7][1] = 1686;
			this.anIntArrayArray21[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray21 = new int[7][4];
			this.anIntArrayArray21[0][3] = 4096;
			this.anIntArrayArray21[0][2] = 0;
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[0][1] = 0;
			this.anIntArrayArray21[1][3] = 4096;
			this.anIntArrayArray21[1][2] = 4096;
			this.anIntArrayArray21[1][1] = 0;
			this.anIntArrayArray21[1][0] = 663;
			this.anIntArrayArray21[2][1] = 0;
			this.anIntArrayArray21[2][2] = 4096;
			this.anIntArrayArray21[2][3] = 0;
			this.anIntArrayArray21[2][0] = 1363;
			this.anIntArrayArray21[3][0] = 2048;
			this.anIntArrayArray21[3][2] = 4096;
			this.anIntArrayArray21[3][1] = 4096;
			this.anIntArrayArray21[3][3] = 0;
			this.anIntArrayArray21[4][2] = 0;
			this.anIntArrayArray21[4][0] = 2727;
			this.anIntArrayArray21[4][1] = 4096;
			this.anIntArrayArray21[4][3] = 0;
			this.anIntArrayArray21[5][1] = 4096;
			this.anIntArrayArray21[5][3] = 4096;
			this.anIntArrayArray21[5][0] = 3411;
			this.anIntArrayArray21[5][2] = 0;
			this.anIntArrayArray21[6][1] = 0;
			this.anIntArrayArray21[6][0] = 4096;
			this.anIntArrayArray21[6][3] = 4096;
			this.anIntArrayArray21[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray21 = new int[6][4];
			this.anIntArrayArray21[0][1] = 0;
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[0][2] = 0;
			this.anIntArrayArray21[0][3] = 0;
			this.anIntArrayArray21[1][2] = 0;
			this.anIntArrayArray21[1][3] = 1493;
			this.anIntArrayArray21[1][1] = 0;
			this.anIntArrayArray21[1][0] = 1843;
			this.anIntArrayArray21[2][0] = 2457;
			this.anIntArrayArray21[2][1] = 0;
			this.anIntArrayArray21[2][3] = 2939;
			this.anIntArrayArray21[2][2] = 0;
			this.anIntArrayArray21[3][2] = 1124;
			this.anIntArrayArray21[3][3] = 3565;
			this.anIntArrayArray21[3][1] = 0;
			this.anIntArrayArray21[3][0] = 2781;
			this.anIntArrayArray21[4][1] = 546;
			this.anIntArrayArray21[4][3] = 4031;
			this.anIntArrayArray21[4][2] = 3084;
			this.anIntArrayArray21[4][0] = 3481;
			this.anIntArrayArray21[5][3] = 4096;
			this.anIntArrayArray21[5][2] = 4096;
			this.anIntArrayArray21[5][0] = 4096;
			this.anIntArrayArray21[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray21 = new int[16][4];
			this.anIntArrayArray21[0][3] = 321;
			this.anIntArrayArray21[0][2] = 192;
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[0][1] = 80;
			this.anIntArrayArray21[1][3] = 562;
			this.anIntArrayArray21[1][1] = 321;
			this.anIntArrayArray21[1][2] = 449;
			this.anIntArrayArray21[1][0] = 155;
			this.anIntArrayArray21[2][2] = 690;
			this.anIntArrayArray21[2][0] = 389;
			this.anIntArrayArray21[2][1] = 578;
			this.anIntArrayArray21[2][3] = 803;
			this.anIntArrayArray21[3][3] = 1140;
			this.anIntArrayArray21[3][2] = 995;
			this.anIntArrayArray21[3][0] = 671;
			this.anIntArrayArray21[3][1] = 947;
			this.anIntArrayArray21[4][1] = 1285;
			this.anIntArrayArray21[4][3] = 1509;
			this.anIntArrayArray21[4][2] = 1397;
			this.anIntArrayArray21[4][0] = 897;
			this.anIntArrayArray21[5][2] = 1429;
			this.anIntArrayArray21[5][0] = 1175;
			this.anIntArrayArray21[5][3] = 1413;
			this.anIntArrayArray21[5][1] = 1525;
			this.anIntArrayArray21[6][1] = 1734;
			this.anIntArrayArray21[6][3] = 1333;
			this.anIntArrayArray21[6][0] = 1368;
			this.anIntArrayArray21[6][2] = 1461;
			this.anIntArrayArray21[7][3] = 1702;
			this.anIntArrayArray21[7][2] = 1525;
			this.anIntArrayArray21[7][1] = 1413;
			this.anIntArrayArray21[7][0] = 1507;
			this.anIntArrayArray21[8][1] = 1108;
			this.anIntArrayArray21[8][2] = 1590;
			this.anIntArrayArray21[8][3] = 2056;
			this.anIntArrayArray21[8][0] = 1736;
			this.anIntArrayArray21[9][1] = 1766;
			this.anIntArrayArray21[9][2] = 2056;
			this.anIntArrayArray21[9][3] = 2666;
			this.anIntArrayArray21[9][0] = 2088;
			this.anIntArrayArray21[10][3] = 3276;
			this.anIntArrayArray21[10][2] = 2586;
			this.anIntArrayArray21[10][1] = 2409;
			this.anIntArrayArray21[10][0] = 2355;
			this.anIntArrayArray21[11][0] = 2691;
			this.anIntArrayArray21[11][1] = 3116;
			this.anIntArrayArray21[11][2] = 3148;
			this.anIntArrayArray21[11][3] = 3228;
			this.anIntArrayArray21[12][0] = 3031;
			this.anIntArrayArray21[12][1] = 3806;
			this.anIntArrayArray21[12][3] = 3196;
			this.anIntArrayArray21[12][2] = 3710;
			this.anIntArrayArray21[13][1] = 3437;
			this.anIntArrayArray21[13][3] = 3019;
			this.anIntArrayArray21[13][2] = 3421;
			this.anIntArrayArray21[13][0] = 3522;
			this.anIntArrayArray21[14][1] = 3116;
			this.anIntArrayArray21[14][0] = 3727;
			this.anIntArrayArray21[14][2] = 3148;
			this.anIntArrayArray21[14][3] = 3228;
			this.anIntArrayArray21[15][3] = 2746;
			this.anIntArrayArray21[15][1] = 2377;
			this.anIntArrayArray21[15][2] = 2505;
			this.anIntArrayArray21[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray21 = new int[4][4];
			this.anIntArrayArray21[0][3] = 0;
			this.anIntArrayArray21[0][2] = 4096;
			this.anIntArrayArray21[0][0] = 2048;
			this.anIntArrayArray21[0][1] = 0;
			this.anIntArrayArray21[1][0] = 2867;
			this.anIntArrayArray21[1][1] = 4096;
			this.anIntArrayArray21[1][3] = 0;
			this.anIntArrayArray21[1][2] = 4096;
			this.anIntArrayArray21[2][1] = 4096;
			this.anIntArrayArray21[2][2] = 4096;
			this.anIntArrayArray21[2][3] = 0;
			this.anIntArrayArray21[2][0] = 3276;
			this.anIntArrayArray21[3][3] = 0;
			this.anIntArrayArray21[3][0] = 4096;
			this.anIntArrayArray21[3][1] = 4096;
			this.anIntArrayArray21[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(20) int local20 = arg1.method3141();
		if (local20 != 0) {
			this.method2005(local20);
			return;
		}
		this.anIntArrayArray21 = new int[arg1.method3141()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray21.length; local31++) {
			this.anIntArrayArray21[local31][0] = arg1.method3115();
			this.anIntArrayArray21[local31][1] = arg1.method3141() << 4;
			this.anIntArrayArray21[local31][2] = arg1.method3141() << 4;
			this.anIntArrayArray21[local31][3] = arg1.method3141() << 4;
		}
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
		if (this.anIntArrayArray21 == null) {
			this.method2005(1);
		}
		this.method2009();
	}

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V")
	private void method2009() {
		@Pc(13) int local13 = this.anIntArrayArray21.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local13 > local27 && local25 >= this.anIntArrayArray21[local27][0]; local27++) {
				local21++;
			}
			@Pc(60) int local60;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(56) int[] local56;
			if (local21 >= local13) {
				local56 = this.anIntArrayArray21[local13 - 1];
				local60 = local56[1];
				local64 = local56[2];
				local68 = local56[3];
			} else {
				local56 = this.anIntArrayArray21[local21];
				if (local21 <= 0) {
					local60 = local56[1];
					local68 = local56[3];
					local64 = local56[2];
				} else {
					@Pc(98) int[] local98 = this.anIntArrayArray21[local21 - 1];
					@Pc(116) int local116 = (local25 - local98[0] << 12) / (local56[0] - local98[0]);
					@Pc(121) int local121 = 4096 - local116;
					local68 = local56[3] * local116 + local121 * local98[3] >> 12;
					local64 = local56[2] * local116 + local98[2] * local121 >> 12;
					local60 = local116 * local56[1] + local121 * local98[1] >> 12;
				}
			}
			local64 >>= 0x4;
			local60 >>= 0x4;
			local68 >>= 0x4;
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			this.anIntArray263[local17] = local68 | local64 << 8 | local60 << 16;
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(21) int[] local21 = this.method5654(0, arg0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static251.anInt6509; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray263[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
