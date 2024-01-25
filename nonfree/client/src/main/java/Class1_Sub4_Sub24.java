import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class1_Sub4_Sub24 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!ln", name = "I", descriptor = "[I")
	private final int[] anIntArray277 = new int[257];

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
		if (this.anIntArrayArray36 == null) {
			this.method3393(1);
		}
		this.method3390();
	}

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "(I)V")
	private void method3390() {
		@Pc(13) int local13 = this.anIntArrayArray36.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local13 > local27 && local25 >= this.anIntArrayArray36[local27][0]; local27++) {
				local21++;
			}
			@Pc(60) int local60;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(56) int[] local56;
			if (local21 >= local13) {
				local56 = this.anIntArrayArray36[local13 - 1];
				local60 = local56[1];
				local64 = local56[2];
				local68 = local56[3];
			} else {
				local56 = this.anIntArrayArray36[local21];
				if (local21 > 0) {
					@Pc(84) int[] local84 = this.anIntArrayArray36[local21 - 1];
					@Pc(101) int local101 = (local25 - local84[0] << 12) / (local56[0] - local84[0]);
					@Pc(106) int local106 = 4096 - local101;
					local64 = local101 * local56[2] + local84[2] * local106 >> 12;
					local60 = local101 * local56[1] + local106 * local84[1] >> 12;
					local68 = local101 * local56[3] + local106 * local84[3] >> 12;
				} else {
					local64 = local56[2];
					local60 = local56[1];
					local68 = local56[3];
				}
			}
			local64 >>= 0x4;
			local68 >>= 0x4;
			local60 >>= 0x4;
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
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			this.anIntArray277[local17] = local64 << 8 | local60 << 16 | local68;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(21) int[] local21 = this.method5695(arg0, 0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static395.anInt6592; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray277[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(7) int local7 = arg0.method5337();
		if (local7 != 0) {
			this.method3393(local7);
			return;
		}
		this.anIntArrayArray36 = new int[arg0.method5337()][4];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray36.length; local24++) {
			this.anIntArrayArray36[local24][0] = arg0.method5335();
			this.anIntArrayArray36[local24][1] = arg0.method5337() << 4;
			this.anIntArrayArray36[local24][2] = arg0.method5337() << 4;
			this.anIntArrayArray36[local24][3] = arg0.method5337() << 4;
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(II)V")
	private void method3393(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray36 = new int[2][4];
			this.anIntArrayArray36[0][1] = 0;
			this.anIntArrayArray36[0][3] = 0;
			this.anIntArrayArray36[0][2] = 0;
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[1][0] = 4096;
			this.anIntArrayArray36[1][2] = 4096;
			this.anIntArrayArray36[1][1] = 4096;
			this.anIntArrayArray36[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray36 = new int[8][4];
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[0][1] = 2650;
			this.anIntArrayArray36[0][2] = 2602;
			this.anIntArrayArray36[0][3] = 2361;
			this.anIntArrayArray36[1][2] = 1799;
			this.anIntArrayArray36[1][1] = 2313;
			this.anIntArrayArray36[1][0] = 2867;
			this.anIntArrayArray36[1][3] = 1558;
			this.anIntArrayArray36[2][3] = 1413;
			this.anIntArrayArray36[2][2] = 1734;
			this.anIntArrayArray36[2][0] = 3072;
			this.anIntArrayArray36[2][1] = 2618;
			this.anIntArrayArray36[3][2] = 1220;
			this.anIntArrayArray36[3][3] = 947;
			this.anIntArrayArray36[3][1] = 2296;
			this.anIntArrayArray36[3][0] = 3276;
			this.anIntArrayArray36[4][3] = 722;
			this.anIntArrayArray36[4][2] = 963;
			this.anIntArrayArray36[4][1] = 2072;
			this.anIntArrayArray36[4][0] = 3481;
			this.anIntArrayArray36[5][2] = 2152;
			this.anIntArrayArray36[5][1] = 2730;
			this.anIntArrayArray36[5][3] = 1766;
			this.anIntArrayArray36[5][0] = 3686;
			this.anIntArrayArray36[6][2] = 1060;
			this.anIntArrayArray36[6][1] = 2232;
			this.anIntArrayArray36[6][3] = 915;
			this.anIntArrayArray36[6][0] = 3891;
			this.anIntArrayArray36[7][3] = 1140;
			this.anIntArrayArray36[7][0] = 4096;
			this.anIntArrayArray36[7][2] = 1413;
			this.anIntArrayArray36[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray36 = new int[7][4];
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[0][2] = 0;
			this.anIntArrayArray36[0][3] = 4096;
			this.anIntArrayArray36[0][1] = 0;
			this.anIntArrayArray36[1][3] = 4096;
			this.anIntArrayArray36[1][1] = 0;
			this.anIntArrayArray36[1][2] = 4096;
			this.anIntArrayArray36[1][0] = 663;
			this.anIntArrayArray36[2][3] = 0;
			this.anIntArrayArray36[2][1] = 0;
			this.anIntArrayArray36[2][2] = 4096;
			this.anIntArrayArray36[2][0] = 1363;
			this.anIntArrayArray36[3][0] = 2048;
			this.anIntArrayArray36[3][3] = 0;
			this.anIntArrayArray36[3][1] = 4096;
			this.anIntArrayArray36[3][2] = 4096;
			this.anIntArrayArray36[4][0] = 2727;
			this.anIntArrayArray36[4][2] = 0;
			this.anIntArrayArray36[4][3] = 0;
			this.anIntArrayArray36[4][1] = 4096;
			this.anIntArrayArray36[5][0] = 3411;
			this.anIntArrayArray36[5][1] = 4096;
			this.anIntArrayArray36[5][3] = 4096;
			this.anIntArrayArray36[5][2] = 0;
			this.anIntArrayArray36[6][3] = 4096;
			this.anIntArrayArray36[6][0] = 4096;
			this.anIntArrayArray36[6][1] = 0;
			this.anIntArrayArray36[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray36 = new int[6][4];
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[0][2] = 0;
			this.anIntArrayArray36[0][1] = 0;
			this.anIntArrayArray36[0][3] = 0;
			this.anIntArrayArray36[1][2] = 0;
			this.anIntArrayArray36[1][1] = 0;
			this.anIntArrayArray36[1][0] = 1843;
			this.anIntArrayArray36[1][3] = 1493;
			this.anIntArrayArray36[2][0] = 2457;
			this.anIntArrayArray36[2][1] = 0;
			this.anIntArrayArray36[2][3] = 2939;
			this.anIntArrayArray36[2][2] = 0;
			this.anIntArrayArray36[3][1] = 0;
			this.anIntArrayArray36[3][3] = 3565;
			this.anIntArrayArray36[3][0] = 2781;
			this.anIntArrayArray36[3][2] = 1124;
			this.anIntArrayArray36[4][3] = 4031;
			this.anIntArrayArray36[4][0] = 3481;
			this.anIntArrayArray36[4][2] = 3084;
			this.anIntArrayArray36[4][1] = 546;
			this.anIntArrayArray36[5][0] = 4096;
			this.anIntArrayArray36[5][1] = 4096;
			this.anIntArrayArray36[5][2] = 4096;
			this.anIntArrayArray36[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray36 = new int[16][4];
			this.anIntArrayArray36[0][3] = 321;
			this.anIntArrayArray36[0][1] = 80;
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[0][2] = 192;
			this.anIntArrayArray36[1][3] = 562;
			this.anIntArrayArray36[1][0] = 155;
			this.anIntArrayArray36[1][1] = 321;
			this.anIntArrayArray36[1][2] = 449;
			this.anIntArrayArray36[2][3] = 803;
			this.anIntArrayArray36[2][1] = 578;
			this.anIntArrayArray36[2][0] = 389;
			this.anIntArrayArray36[2][2] = 690;
			this.anIntArrayArray36[3][1] = 947;
			this.anIntArrayArray36[3][3] = 1140;
			this.anIntArrayArray36[3][0] = 671;
			this.anIntArrayArray36[3][2] = 995;
			this.anIntArrayArray36[4][1] = 1285;
			this.anIntArrayArray36[4][0] = 897;
			this.anIntArrayArray36[4][2] = 1397;
			this.anIntArrayArray36[4][3] = 1509;
			this.anIntArrayArray36[5][0] = 1175;
			this.anIntArrayArray36[5][1] = 1525;
			this.anIntArrayArray36[5][3] = 1413;
			this.anIntArrayArray36[5][2] = 1429;
			this.anIntArrayArray36[6][3] = 1333;
			this.anIntArrayArray36[6][2] = 1461;
			this.anIntArrayArray36[6][0] = 1368;
			this.anIntArrayArray36[6][1] = 1734;
			this.anIntArrayArray36[7][0] = 1507;
			this.anIntArrayArray36[7][3] = 1702;
			this.anIntArrayArray36[7][2] = 1525;
			this.anIntArrayArray36[7][1] = 1413;
			this.anIntArrayArray36[8][1] = 1108;
			this.anIntArrayArray36[8][3] = 2056;
			this.anIntArrayArray36[8][0] = 1736;
			this.anIntArrayArray36[8][2] = 1590;
			this.anIntArrayArray36[9][3] = 2666;
			this.anIntArrayArray36[9][0] = 2088;
			this.anIntArrayArray36[9][1] = 1766;
			this.anIntArrayArray36[9][2] = 2056;
			this.anIntArrayArray36[10][2] = 2586;
			this.anIntArrayArray36[10][0] = 2355;
			this.anIntArrayArray36[10][3] = 3276;
			this.anIntArrayArray36[10][1] = 2409;
			this.anIntArrayArray36[11][1] = 3116;
			this.anIntArrayArray36[11][2] = 3148;
			this.anIntArrayArray36[11][3] = 3228;
			this.anIntArrayArray36[11][0] = 2691;
			this.anIntArrayArray36[12][2] = 3710;
			this.anIntArrayArray36[12][1] = 3806;
			this.anIntArrayArray36[12][3] = 3196;
			this.anIntArrayArray36[12][0] = 3031;
			this.anIntArrayArray36[13][0] = 3522;
			this.anIntArrayArray36[13][2] = 3421;
			this.anIntArrayArray36[13][3] = 3019;
			this.anIntArrayArray36[13][1] = 3437;
			this.anIntArrayArray36[14][3] = 3228;
			this.anIntArrayArray36[14][2] = 3148;
			this.anIntArrayArray36[14][0] = 3727;
			this.anIntArrayArray36[14][1] = 3116;
			this.anIntArrayArray36[15][3] = 2746;
			this.anIntArrayArray36[15][2] = 2505;
			this.anIntArrayArray36[15][0] = 4096;
			this.anIntArrayArray36[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray36 = new int[4][4];
			this.anIntArrayArray36[0][0] = 2048;
			this.anIntArrayArray36[0][2] = 4096;
			this.anIntArrayArray36[0][1] = 0;
			this.anIntArrayArray36[0][3] = 0;
			this.anIntArrayArray36[1][0] = 2867;
			this.anIntArrayArray36[1][2] = 4096;
			this.anIntArrayArray36[1][1] = 4096;
			this.anIntArrayArray36[1][3] = 0;
			this.anIntArrayArray36[2][2] = 4096;
			this.anIntArrayArray36[2][0] = 3276;
			this.anIntArrayArray36[2][3] = 0;
			this.anIntArrayArray36[2][1] = 4096;
			this.anIntArrayArray36[3][0] = 4096;
			this.anIntArrayArray36[3][1] = 4096;
			this.anIntArrayArray36[3][2] = 0;
			this.anIntArrayArray36[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
