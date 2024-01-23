import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class2_Sub1_Sub37 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ub", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!ub", name = "eb", descriptor = "[I")
	private int[] anIntArray460 = new int[257];

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(16) int local16 = arg0.method209();
		if (local16 != 0) {
			this.method3063(local16);
			return;
		}
		this.anIntArrayArray38 = new int[arg0.method209()][4];
		for (@Pc(35) int local35 = 0; local35 < this.anIntArrayArray38.length; local35++) {
			this.anIntArrayArray38[local35][0] = arg0.method163();
			this.anIntArrayArray38[local35][1] = arg0.method209() << 4;
			this.anIntArrayArray38[local35][2] = arg0.method209() << 4;
			this.anIntArrayArray38[local35][3] = arg0.method209() << 4;
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
	private void method3061() {
		@Pc(13) int local13 = this.anIntArrayArray38.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local13 > local27 && this.anIntArrayArray38[local27][0] <= local25; local27++) {
				local21++;
			}
			@Pc(117) int local117;
			@Pc(131) int local131;
			@Pc(103) int local103;
			@Pc(54) int[] local54;
			if (local13 > local21) {
				local54 = this.anIntArrayArray38[local21];
				if (local21 > 0) {
					@Pc(66) int[] local66 = this.anIntArrayArray38[local21 - 1];
					@Pc(83) int local83 = (local25 - local66[0] << 12) / (local54[0] - local66[0]);
					@Pc(88) int local88 = 4096 - local83;
					local103 = local83 * local54[3] + local66[3] * local88 >> 12;
					local117 = local83 * local54[1] + local88 * local66[1] >> 12;
					local131 = local83 * local54[2] + local88 * local66[2] >> 12;
				} else {
					local131 = local54[2];
					local117 = local54[1];
					local103 = local54[3];
				}
			} else {
				local54 = this.anIntArrayArray38[local13 - 1];
				local131 = local54[2];
				local117 = local54[1];
				local103 = local54[3];
			}
			local117 >>= 0x4;
			local103 >>= 0x4;
			local131 >>= 0x4;
			if (local117 < 0) {
				local117 = 0;
			} else if (local117 > 255) {
				local117 = 255;
			}
			if (local131 < 0) {
				local131 = 0;
			} else if (local131 > 255) {
				local131 = 255;
			}
			if (local103 < 0) {
				local103 = 0;
			} else if (local103 > 255) {
				local103 = 255;
			}
			this.anIntArray460[local17] = local103 | local131 << 8 | local117 << 16;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V")
	private void method3063(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray38 = new int[2][4];
			this.anIntArrayArray38[0][2] = 0;
			this.anIntArrayArray38[0][0] = 0;
			this.anIntArrayArray38[0][3] = 0;
			this.anIntArrayArray38[1][3] = 4096;
			this.anIntArrayArray38[0][1] = 0;
			this.anIntArrayArray38[1][0] = 4096;
			this.anIntArrayArray38[1][1] = 4096;
			this.anIntArrayArray38[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray38 = new int[8][4];
			this.anIntArrayArray38[0][3] = 2361;
			this.anIntArrayArray38[0][0] = 0;
			this.anIntArrayArray38[0][1] = 2650;
			this.anIntArrayArray38[1][0] = 2867;
			this.anIntArrayArray38[1][3] = 1558;
			this.anIntArrayArray38[1][1] = 2313;
			this.anIntArrayArray38[2][1] = 2618;
			this.anIntArrayArray38[3][1] = 2296;
			this.anIntArrayArray38[4][1] = 2072;
			this.anIntArrayArray38[0][2] = 2602;
			this.anIntArrayArray38[2][3] = 1413;
			this.anIntArrayArray38[2][0] = 3072;
			this.anIntArrayArray38[3][0] = 3276;
			this.anIntArrayArray38[5][1] = 2730;
			this.anIntArrayArray38[6][1] = 2232;
			this.anIntArrayArray38[7][1] = 1686;
			this.anIntArrayArray38[3][3] = 947;
			this.anIntArrayArray38[1][2] = 1799;
			this.anIntArrayArray38[4][3] = 722;
			this.anIntArrayArray38[2][2] = 1734;
			this.anIntArrayArray38[5][3] = 1766;
			this.anIntArrayArray38[4][0] = 3481;
			this.anIntArrayArray38[3][2] = 1220;
			this.anIntArrayArray38[6][3] = 915;
			this.anIntArrayArray38[4][2] = 963;
			this.anIntArrayArray38[5][2] = 2152;
			this.anIntArrayArray38[7][3] = 1140;
			this.anIntArrayArray38[6][2] = 1060;
			this.anIntArrayArray38[7][2] = 1413;
			this.anIntArrayArray38[5][0] = 3686;
			this.anIntArrayArray38[6][0] = 3891;
			this.anIntArrayArray38[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray38 = new int[7][4];
			this.anIntArrayArray38[0][3] = 4096;
			this.anIntArrayArray38[0][0] = 0;
			this.anIntArrayArray38[0][2] = 0;
			this.anIntArrayArray38[0][1] = 0;
			this.anIntArrayArray38[1][2] = 4096;
			this.anIntArrayArray38[1][0] = 663;
			this.anIntArrayArray38[1][1] = 0;
			this.anIntArrayArray38[2][2] = 4096;
			this.anIntArrayArray38[1][3] = 4096;
			this.anIntArrayArray38[2][1] = 0;
			this.anIntArrayArray38[3][2] = 4096;
			this.anIntArrayArray38[2][3] = 0;
			this.anIntArrayArray38[4][2] = 0;
			this.anIntArrayArray38[3][1] = 4096;
			this.anIntArrayArray38[4][1] = 4096;
			this.anIntArrayArray38[2][0] = 1363;
			this.anIntArrayArray38[5][1] = 4096;
			this.anIntArrayArray38[6][1] = 0;
			this.anIntArrayArray38[3][0] = 2048;
			this.anIntArrayArray38[3][3] = 0;
			this.anIntArrayArray38[5][2] = 0;
			this.anIntArrayArray38[6][2] = 0;
			this.anIntArrayArray38[4][0] = 2727;
			this.anIntArrayArray38[4][3] = 0;
			this.anIntArrayArray38[5][3] = 4096;
			this.anIntArrayArray38[5][0] = 3411;
			this.anIntArrayArray38[6][0] = 4096;
			this.anIntArrayArray38[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray38 = new int[6][4];
			this.anIntArrayArray38[0][0] = 0;
			this.anIntArrayArray38[1][0] = 1843;
			this.anIntArrayArray38[0][3] = 0;
			this.anIntArrayArray38[1][3] = 1493;
			this.anIntArrayArray38[0][2] = 0;
			this.anIntArrayArray38[2][0] = 2457;
			this.anIntArrayArray38[0][1] = 0;
			this.anIntArrayArray38[3][0] = 2781;
			this.anIntArrayArray38[1][2] = 0;
			this.anIntArrayArray38[2][3] = 2939;
			this.anIntArrayArray38[3][3] = 3565;
			this.anIntArrayArray38[2][2] = 0;
			this.anIntArrayArray38[4][3] = 4031;
			this.anIntArrayArray38[4][0] = 3481;
			this.anIntArrayArray38[1][1] = 0;
			this.anIntArrayArray38[5][0] = 4096;
			this.anIntArrayArray38[2][1] = 0;
			this.anIntArrayArray38[3][2] = 1124;
			this.anIntArrayArray38[3][1] = 0;
			this.anIntArrayArray38[4][2] = 3084;
			this.anIntArrayArray38[4][1] = 546;
			this.anIntArrayArray38[5][3] = 4096;
			this.anIntArrayArray38[5][1] = 4096;
			this.anIntArrayArray38[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray38 = new int[16][4];
			this.anIntArrayArray38[0][3] = 321;
			this.anIntArrayArray38[1][3] = 562;
			this.anIntArrayArray38[2][3] = 803;
			this.anIntArrayArray38[3][3] = 1140;
			this.anIntArrayArray38[0][1] = 80;
			this.anIntArrayArray38[4][3] = 1509;
			this.anIntArrayArray38[1][1] = 321;
			this.anIntArrayArray38[0][0] = 0;
			this.anIntArrayArray38[5][3] = 1413;
			this.anIntArrayArray38[0][2] = 192;
			this.anIntArrayArray38[6][3] = 1333;
			this.anIntArrayArray38[1][2] = 449;
			this.anIntArrayArray38[2][2] = 690;
			this.anIntArrayArray38[2][1] = 578;
			this.anIntArrayArray38[7][3] = 1702;
			this.anIntArrayArray38[8][3] = 2056;
			this.anIntArrayArray38[1][0] = 155;
			this.anIntArrayArray38[9][3] = 2666;
			this.anIntArrayArray38[3][2] = 995;
			this.anIntArrayArray38[10][3] = 3276;
			this.anIntArrayArray38[2][0] = 389;
			this.anIntArrayArray38[3][1] = 947;
			this.anIntArrayArray38[4][1] = 1285;
			this.anIntArrayArray38[11][3] = 3228;
			this.anIntArrayArray38[3][0] = 671;
			this.anIntArrayArray38[12][3] = 3196;
			this.anIntArrayArray38[5][1] = 1525;
			this.anIntArrayArray38[4][0] = 897;
			this.anIntArrayArray38[13][3] = 3019;
			this.anIntArrayArray38[6][1] = 1734;
			this.anIntArrayArray38[7][1] = 1413;
			this.anIntArrayArray38[14][3] = 3228;
			this.anIntArrayArray38[4][2] = 1397;
			this.anIntArrayArray38[5][0] = 1175;
			this.anIntArrayArray38[8][1] = 1108;
			this.anIntArrayArray38[5][2] = 1429;
			this.anIntArrayArray38[15][3] = 2746;
			this.anIntArrayArray38[6][2] = 1461;
			this.anIntArrayArray38[6][0] = 1368;
			this.anIntArrayArray38[7][0] = 1507;
			this.anIntArrayArray38[7][2] = 1525;
			this.anIntArrayArray38[8][2] = 1590;
			this.anIntArrayArray38[9][1] = 1766;
			this.anIntArrayArray38[8][0] = 1736;
			this.anIntArrayArray38[9][0] = 2088;
			this.anIntArrayArray38[10][0] = 2355;
			this.anIntArrayArray38[11][0] = 2691;
			this.anIntArrayArray38[12][0] = 3031;
			this.anIntArrayArray38[10][1] = 2409;
			this.anIntArrayArray38[9][2] = 2056;
			this.anIntArrayArray38[11][1] = 3116;
			this.anIntArrayArray38[13][0] = 3522;
			this.anIntArrayArray38[12][1] = 3806;
			this.anIntArrayArray38[13][1] = 3437;
			this.anIntArrayArray38[14][1] = 3116;
			this.anIntArrayArray38[14][0] = 3727;
			this.anIntArrayArray38[15][1] = 2377;
			this.anIntArrayArray38[10][2] = 2586;
			this.anIntArrayArray38[15][0] = 4096;
			this.anIntArrayArray38[11][2] = 3148;
			this.anIntArrayArray38[12][2] = 3710;
			this.anIntArrayArray38[13][2] = 3421;
			this.anIntArrayArray38[14][2] = 3148;
			this.anIntArrayArray38[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray38 = new int[4][4];
			this.anIntArrayArray38[0][1] = 0;
			this.anIntArrayArray38[1][1] = 4096;
			this.anIntArrayArray38[2][1] = 4096;
			this.anIntArrayArray38[0][0] = 2048;
			this.anIntArrayArray38[3][1] = 4096;
			this.anIntArrayArray38[0][3] = 0;
			this.anIntArrayArray38[1][3] = 0;
			this.anIntArrayArray38[0][2] = 4096;
			this.anIntArrayArray38[1][2] = 4096;
			this.anIntArrayArray38[2][3] = 0;
			this.anIntArrayArray38[3][3] = 0;
			this.anIntArrayArray38[2][2] = 4096;
			this.anIntArrayArray38[3][2] = 0;
			this.anIntArrayArray38[1][0] = 2867;
			this.anIntArrayArray38[2][0] = 3276;
			this.anIntArrayArray38[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
		if (this.anIntArrayArray38 == null) {
			this.method3063(1);
		}
		this.method3061();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(26) int[] local26 = this.method3203(arg0, 0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static62.anInt1675; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray460[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}
}
