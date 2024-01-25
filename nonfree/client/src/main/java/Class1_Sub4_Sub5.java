import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class1_Sub4_Sub5 extends Class1_Sub4 {

	@OriginalMember(owner = "client!br", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!br", name = "L", descriptor = "[I")
	private final int[] anIntArray62 = new int[257];

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!br", name = "i", descriptor = "(I)V")
	private void method714() {
		@Pc(13) int local13 = this.anIntArrayArray6.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local30 < local13 && this.anIntArrayArray6[local30][0] <= local28; local30++) {
				local24++;
			}
			@Pc(139) int local139;
			@Pc(124) int local124;
			@Pc(110) int local110;
			@Pc(61) int[] local61;
			if (local13 > local24) {
				local61 = this.anIntArrayArray6[local24];
				if (local24 > 0) {
					@Pc(73) int[] local73 = this.anIntArrayArray6[local24 - 1];
					@Pc(91) int local91 = (local28 - local73[0] << 12) / (local61[0] - local73[0]);
					@Pc(96) int local96 = 4096 - local91;
					local110 = local96 * local73[3] + local91 * local61[3] >> 12;
					local124 = local96 * local73[2] + local61[2] * local91 >> 12;
					local139 = local91 * local61[1] + local73[1] * local96 >> 12;
				} else {
					local139 = local61[1];
					local110 = local61[3];
					local124 = local61[2];
				}
			} else {
				local61 = this.anIntArrayArray6[local13 - 1];
				local139 = local61[1];
				local110 = local61[3];
				local124 = local61[2];
			}
			local124 >>= 0x4;
			local139 >>= 0x4;
			local110 >>= 0x4;
			if (local124 < 0) {
				local124 = 0;
			} else if (local124 > 255) {
				local124 = 255;
			}
			if (local110 < 0) {
				local110 = 0;
			} else if (local110 > 255) {
				local110 = 255;
			}
			if (local139 < 0) {
				local139 = 0;
			} else if (local139 > 255) {
				local139 = 255;
			}
			this.anIntArray62[local20] = local110 | local124 << 8 | local139 << 16;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(10) int local10 = arg1.method5366();
		if (local10 != 0) {
			this.method718(local10);
			return;
		}
		this.anIntArrayArray6 = new int[arg1.method5366()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray6.length; local21++) {
			this.anIntArrayArray6[local21][0] = arg1.method5362();
			this.anIntArrayArray6[local21][1] = arg1.method5366() << 4;
			this.anIntArrayArray6[local21][2] = arg1.method5366() << 4;
			this.anIntArrayArray6[local21][3] = arg1.method5366() << 4;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(21) int[] local21 = this.method5958(arg0, 0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static66.anInt1511; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray62[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(II)V")
	private void method718(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray6 = new int[2][4];
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[1][1] = 4096;
			this.anIntArrayArray6[1][3] = 4096;
			this.anIntArrayArray6[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray6 = new int[8][4];
			this.anIntArrayArray6[0][3] = 2361;
			this.anIntArrayArray6[0][1] = 2650;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][2] = 2602;
			this.anIntArrayArray6[1][3] = 1558;
			this.anIntArrayArray6[1][0] = 2867;
			this.anIntArrayArray6[1][2] = 1799;
			this.anIntArrayArray6[1][1] = 2313;
			this.anIntArrayArray6[2][0] = 3072;
			this.anIntArrayArray6[2][3] = 1413;
			this.anIntArrayArray6[2][2] = 1734;
			this.anIntArrayArray6[2][1] = 2618;
			this.anIntArrayArray6[3][1] = 2296;
			this.anIntArrayArray6[3][0] = 3276;
			this.anIntArrayArray6[3][3] = 947;
			this.anIntArrayArray6[3][2] = 1220;
			this.anIntArrayArray6[4][0] = 3481;
			this.anIntArrayArray6[4][2] = 963;
			this.anIntArrayArray6[4][1] = 2072;
			this.anIntArrayArray6[4][3] = 722;
			this.anIntArrayArray6[5][3] = 1766;
			this.anIntArrayArray6[5][0] = 3686;
			this.anIntArrayArray6[5][2] = 2152;
			this.anIntArrayArray6[5][1] = 2730;
			this.anIntArrayArray6[6][0] = 3891;
			this.anIntArrayArray6[6][1] = 2232;
			this.anIntArrayArray6[6][2] = 1060;
			this.anIntArrayArray6[6][3] = 915;
			this.anIntArrayArray6[7][0] = 4096;
			this.anIntArrayArray6[7][3] = 1140;
			this.anIntArrayArray6[7][2] = 1413;
			this.anIntArrayArray6[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray6 = new int[7][4];
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][3] = 4096;
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[1][1] = 0;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[1][0] = 663;
			this.anIntArrayArray6[1][3] = 4096;
			this.anIntArrayArray6[2][2] = 4096;
			this.anIntArrayArray6[2][3] = 0;
			this.anIntArrayArray6[2][1] = 0;
			this.anIntArrayArray6[2][0] = 1363;
			this.anIntArrayArray6[3][0] = 2048;
			this.anIntArrayArray6[3][1] = 4096;
			this.anIntArrayArray6[3][3] = 0;
			this.anIntArrayArray6[3][2] = 4096;
			this.anIntArrayArray6[4][2] = 0;
			this.anIntArrayArray6[4][3] = 0;
			this.anIntArrayArray6[4][0] = 2727;
			this.anIntArrayArray6[4][1] = 4096;
			this.anIntArrayArray6[5][1] = 4096;
			this.anIntArrayArray6[5][0] = 3411;
			this.anIntArrayArray6[5][2] = 0;
			this.anIntArrayArray6[5][3] = 4096;
			this.anIntArrayArray6[6][0] = 4096;
			this.anIntArrayArray6[6][3] = 4096;
			this.anIntArrayArray6[6][2] = 0;
			this.anIntArrayArray6[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray6 = new int[6][4];
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[1][1] = 0;
			this.anIntArrayArray6[1][0] = 1843;
			this.anIntArrayArray6[1][2] = 0;
			this.anIntArrayArray6[1][3] = 1493;
			this.anIntArrayArray6[2][0] = 2457;
			this.anIntArrayArray6[2][1] = 0;
			this.anIntArrayArray6[2][2] = 0;
			this.anIntArrayArray6[2][3] = 2939;
			this.anIntArrayArray6[3][0] = 2781;
			this.anIntArrayArray6[3][2] = 1124;
			this.anIntArrayArray6[3][3] = 3565;
			this.anIntArrayArray6[3][1] = 0;
			this.anIntArrayArray6[4][0] = 3481;
			this.anIntArrayArray6[4][1] = 546;
			this.anIntArrayArray6[4][3] = 4031;
			this.anIntArrayArray6[4][2] = 3084;
			this.anIntArrayArray6[5][0] = 4096;
			this.anIntArrayArray6[5][2] = 4096;
			this.anIntArrayArray6[5][3] = 4096;
			this.anIntArrayArray6[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray6 = new int[16][4];
			this.anIntArrayArray6[0][2] = 192;
			this.anIntArrayArray6[0][3] = 321;
			this.anIntArrayArray6[0][1] = 80;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[1][1] = 321;
			this.anIntArrayArray6[1][2] = 449;
			this.anIntArrayArray6[1][3] = 562;
			this.anIntArrayArray6[1][0] = 155;
			this.anIntArrayArray6[2][3] = 803;
			this.anIntArrayArray6[2][2] = 690;
			this.anIntArrayArray6[2][1] = 578;
			this.anIntArrayArray6[2][0] = 389;
			this.anIntArrayArray6[3][3] = 1140;
			this.anIntArrayArray6[3][1] = 947;
			this.anIntArrayArray6[3][0] = 671;
			this.anIntArrayArray6[3][2] = 995;
			this.anIntArrayArray6[4][0] = 897;
			this.anIntArrayArray6[4][2] = 1397;
			this.anIntArrayArray6[4][1] = 1285;
			this.anIntArrayArray6[4][3] = 1509;
			this.anIntArrayArray6[5][0] = 1175;
			this.anIntArrayArray6[5][2] = 1429;
			this.anIntArrayArray6[5][1] = 1525;
			this.anIntArrayArray6[5][3] = 1413;
			this.anIntArrayArray6[6][3] = 1333;
			this.anIntArrayArray6[6][2] = 1461;
			this.anIntArrayArray6[6][1] = 1734;
			this.anIntArrayArray6[6][0] = 1368;
			this.anIntArrayArray6[7][3] = 1702;
			this.anIntArrayArray6[7][0] = 1507;
			this.anIntArrayArray6[7][2] = 1525;
			this.anIntArrayArray6[7][1] = 1413;
			this.anIntArrayArray6[8][2] = 1590;
			this.anIntArrayArray6[8][0] = 1736;
			this.anIntArrayArray6[8][3] = 2056;
			this.anIntArrayArray6[8][1] = 1108;
			this.anIntArrayArray6[9][2] = 2056;
			this.anIntArrayArray6[9][3] = 2666;
			this.anIntArrayArray6[9][1] = 1766;
			this.anIntArrayArray6[9][0] = 2088;
			this.anIntArrayArray6[10][2] = 2586;
			this.anIntArrayArray6[10][0] = 2355;
			this.anIntArrayArray6[10][1] = 2409;
			this.anIntArrayArray6[10][3] = 3276;
			this.anIntArrayArray6[11][1] = 3116;
			this.anIntArrayArray6[11][2] = 3148;
			this.anIntArrayArray6[11][3] = 3228;
			this.anIntArrayArray6[11][0] = 2691;
			this.anIntArrayArray6[12][2] = 3710;
			this.anIntArrayArray6[12][3] = 3196;
			this.anIntArrayArray6[12][1] = 3806;
			this.anIntArrayArray6[12][0] = 3031;
			this.anIntArrayArray6[13][3] = 3019;
			this.anIntArrayArray6[13][1] = 3437;
			this.anIntArrayArray6[13][0] = 3522;
			this.anIntArrayArray6[13][2] = 3421;
			this.anIntArrayArray6[14][1] = 3116;
			this.anIntArrayArray6[14][0] = 3727;
			this.anIntArrayArray6[14][2] = 3148;
			this.anIntArrayArray6[14][3] = 3228;
			this.anIntArrayArray6[15][3] = 2746;
			this.anIntArrayArray6[15][1] = 2377;
			this.anIntArrayArray6[15][2] = 2505;
			this.anIntArrayArray6[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray6 = new int[4][4];
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][2] = 4096;
			this.anIntArrayArray6[0][0] = 2048;
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[1][1] = 4096;
			this.anIntArrayArray6[1][3] = 0;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[1][0] = 2867;
			this.anIntArrayArray6[2][0] = 3276;
			this.anIntArrayArray6[2][3] = 0;
			this.anIntArrayArray6[2][1] = 4096;
			this.anIntArrayArray6[2][2] = 4096;
			this.anIntArrayArray6[3][1] = 4096;
			this.anIntArrayArray6[3][0] = 4096;
			this.anIntArrayArray6[3][3] = 0;
			this.anIntArrayArray6[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
		if (this.anIntArrayArray6 == null) {
			this.method718(1);
		}
		this.method714();
	}
}
