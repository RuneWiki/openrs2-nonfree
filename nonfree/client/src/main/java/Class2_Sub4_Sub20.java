import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class2_Sub4_Sub20 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ln", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "[I")
	private final int[] anIntArray732 = new int[257];

	static {
		new Class32("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(14) int local14 = arg0.method5350();
		if (local14 != 0) {
			this.method3358(local14);
			return;
		}
		this.anIntArrayArray29 = new int[arg0.method5350()][4];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray29.length; local28++) {
			this.anIntArrayArray29[local28][0] = arg0.method5312();
			this.anIntArrayArray29[local28][1] = arg0.method5350() << 4;
			this.anIntArrayArray29[local28][2] = arg0.method5350() << 4;
			this.anIntArrayArray29[local28][3] = arg0.method5350() << 4;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
	private void method3355() {
		@Pc(17) int local17 = this.anIntArrayArray29.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = local24 << 4;
			for (@Pc(34) int local34 = 0; local34 < local17 && this.anIntArrayArray29[local34][0] <= local32; local34++) {
				local28++;
			}
			@Pc(71) int local71;
			@Pc(79) int local79;
			@Pc(75) int local75;
			@Pc(67) int[] local67;
			if (local17 <= local28) {
				local67 = this.anIntArrayArray29[local17 - 1];
				local71 = local67[1];
				local75 = local67[3];
				local79 = local67[2];
			} else {
				local67 = this.anIntArrayArray29[local28];
				if (local28 <= 0) {
					local71 = local67[1];
					local79 = local67[2];
					local75 = local67[3];
				} else {
					@Pc(112) int[] local112 = this.anIntArrayArray29[local28 - 1];
					@Pc(130) int local130 = (local32 - local112[0] << 12) / (local67[0] - local112[0]);
					@Pc(135) int local135 = 4096 - local130;
					local79 = local130 * local67[2] + local112[2] * local135 >> 12;
					local71 = local67[1] * local130 + local135 * local112[1] >> 12;
					local75 = local130 * local67[3] + local135 * local112[3] >> 12;
				}
			}
			local79 >>= 0x4;
			local71 >>= 0x4;
			local75 >>= 0x4;
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 > 255) {
				local75 = 255;
			}
			if (local71 < 0) {
				local71 = 0;
			} else if (local71 > 255) {
				local71 = 255;
			}
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 > 255) {
				local79 = 255;
			}
			this.anIntArray732[local24] = local75 | local71 << 16 | local79 << 8;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)V")
	private void method3358(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray29 = new int[2][4];
			this.anIntArrayArray29[0][0] = 0;
			this.anIntArrayArray29[0][1] = 0;
			this.anIntArrayArray29[0][2] = 0;
			this.anIntArrayArray29[0][3] = 0;
			this.anIntArrayArray29[1][2] = 4096;
			this.anIntArrayArray29[1][0] = 4096;
			this.anIntArrayArray29[1][1] = 4096;
			this.anIntArrayArray29[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray29 = new int[8][4];
			this.anIntArrayArray29[0][3] = 2361;
			this.anIntArrayArray29[0][1] = 2650;
			this.anIntArrayArray29[0][0] = 0;
			this.anIntArrayArray29[0][2] = 2602;
			this.anIntArrayArray29[1][0] = 2867;
			this.anIntArrayArray29[1][1] = 2313;
			this.anIntArrayArray29[1][3] = 1558;
			this.anIntArrayArray29[1][2] = 1799;
			this.anIntArrayArray29[2][3] = 1413;
			this.anIntArrayArray29[2][0] = 3072;
			this.anIntArrayArray29[2][1] = 2618;
			this.anIntArrayArray29[2][2] = 1734;
			this.anIntArrayArray29[3][2] = 1220;
			this.anIntArrayArray29[3][3] = 947;
			this.anIntArrayArray29[3][1] = 2296;
			this.anIntArrayArray29[3][0] = 3276;
			this.anIntArrayArray29[4][3] = 722;
			this.anIntArrayArray29[4][0] = 3481;
			this.anIntArrayArray29[4][1] = 2072;
			this.anIntArrayArray29[4][2] = 963;
			this.anIntArrayArray29[5][2] = 2152;
			this.anIntArrayArray29[5][1] = 2730;
			this.anIntArrayArray29[5][0] = 3686;
			this.anIntArrayArray29[5][3] = 1766;
			this.anIntArrayArray29[6][3] = 915;
			this.anIntArrayArray29[6][1] = 2232;
			this.anIntArrayArray29[6][0] = 3891;
			this.anIntArrayArray29[6][2] = 1060;
			this.anIntArrayArray29[7][2] = 1413;
			this.anIntArrayArray29[7][0] = 4096;
			this.anIntArrayArray29[7][1] = 1686;
			this.anIntArrayArray29[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray29 = new int[7][4];
			this.anIntArrayArray29[0][1] = 0;
			this.anIntArrayArray29[0][0] = 0;
			this.anIntArrayArray29[0][3] = 4096;
			this.anIntArrayArray29[0][2] = 0;
			this.anIntArrayArray29[1][3] = 4096;
			this.anIntArrayArray29[1][1] = 0;
			this.anIntArrayArray29[1][2] = 4096;
			this.anIntArrayArray29[1][0] = 663;
			this.anIntArrayArray29[2][0] = 1363;
			this.anIntArrayArray29[2][3] = 0;
			this.anIntArrayArray29[2][2] = 4096;
			this.anIntArrayArray29[2][1] = 0;
			this.anIntArrayArray29[3][1] = 4096;
			this.anIntArrayArray29[3][3] = 0;
			this.anIntArrayArray29[3][0] = 2048;
			this.anIntArrayArray29[3][2] = 4096;
			this.anIntArrayArray29[4][1] = 4096;
			this.anIntArrayArray29[4][0] = 2727;
			this.anIntArrayArray29[4][3] = 0;
			this.anIntArrayArray29[4][2] = 0;
			this.anIntArrayArray29[5][1] = 4096;
			this.anIntArrayArray29[5][0] = 3411;
			this.anIntArrayArray29[5][2] = 0;
			this.anIntArrayArray29[5][3] = 4096;
			this.anIntArrayArray29[6][2] = 0;
			this.anIntArrayArray29[6][3] = 4096;
			this.anIntArrayArray29[6][1] = 0;
			this.anIntArrayArray29[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray29 = new int[6][4];
			this.anIntArrayArray29[0][1] = 0;
			this.anIntArrayArray29[0][2] = 0;
			this.anIntArrayArray29[0][3] = 0;
			this.anIntArrayArray29[0][0] = 0;
			this.anIntArrayArray29[1][3] = 1493;
			this.anIntArrayArray29[1][1] = 0;
			this.anIntArrayArray29[1][2] = 0;
			this.anIntArrayArray29[1][0] = 1843;
			this.anIntArrayArray29[2][0] = 2457;
			this.anIntArrayArray29[2][3] = 2939;
			this.anIntArrayArray29[2][1] = 0;
			this.anIntArrayArray29[2][2] = 0;
			this.anIntArrayArray29[3][3] = 3565;
			this.anIntArrayArray29[3][0] = 2781;
			this.anIntArrayArray29[3][1] = 0;
			this.anIntArrayArray29[3][2] = 1124;
			this.anIntArrayArray29[4][3] = 4031;
			this.anIntArrayArray29[4][1] = 546;
			this.anIntArrayArray29[4][0] = 3481;
			this.anIntArrayArray29[4][2] = 3084;
			this.anIntArrayArray29[5][1] = 4096;
			this.anIntArrayArray29[5][2] = 4096;
			this.anIntArrayArray29[5][3] = 4096;
			this.anIntArrayArray29[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray29 = new int[16][4];
			this.anIntArrayArray29[0][2] = 192;
			this.anIntArrayArray29[0][1] = 80;
			this.anIntArrayArray29[0][0] = 0;
			this.anIntArrayArray29[0][3] = 321;
			this.anIntArrayArray29[1][3] = 562;
			this.anIntArrayArray29[1][2] = 449;
			this.anIntArrayArray29[1][0] = 155;
			this.anIntArrayArray29[1][1] = 321;
			this.anIntArrayArray29[2][1] = 578;
			this.anIntArrayArray29[2][3] = 803;
			this.anIntArrayArray29[2][2] = 690;
			this.anIntArrayArray29[2][0] = 389;
			this.anIntArrayArray29[3][1] = 947;
			this.anIntArrayArray29[3][3] = 1140;
			this.anIntArrayArray29[3][0] = 671;
			this.anIntArrayArray29[3][2] = 995;
			this.anIntArrayArray29[4][3] = 1509;
			this.anIntArrayArray29[4][2] = 1397;
			this.anIntArrayArray29[4][1] = 1285;
			this.anIntArrayArray29[4][0] = 897;
			this.anIntArrayArray29[5][0] = 1175;
			this.anIntArrayArray29[5][1] = 1525;
			this.anIntArrayArray29[5][2] = 1429;
			this.anIntArrayArray29[5][3] = 1413;
			this.anIntArrayArray29[6][3] = 1333;
			this.anIntArrayArray29[6][2] = 1461;
			this.anIntArrayArray29[6][0] = 1368;
			this.anIntArrayArray29[6][1] = 1734;
			this.anIntArrayArray29[7][1] = 1413;
			this.anIntArrayArray29[7][3] = 1702;
			this.anIntArrayArray29[7][2] = 1525;
			this.anIntArrayArray29[7][0] = 1507;
			this.anIntArrayArray29[8][3] = 2056;
			this.anIntArrayArray29[8][0] = 1736;
			this.anIntArrayArray29[8][1] = 1108;
			this.anIntArrayArray29[8][2] = 1590;
			this.anIntArrayArray29[9][0] = 2088;
			this.anIntArrayArray29[9][1] = 1766;
			this.anIntArrayArray29[9][2] = 2056;
			this.anIntArrayArray29[9][3] = 2666;
			this.anIntArrayArray29[10][0] = 2355;
			this.anIntArrayArray29[10][2] = 2586;
			this.anIntArrayArray29[10][1] = 2409;
			this.anIntArrayArray29[10][3] = 3276;
			this.anIntArrayArray29[11][1] = 3116;
			this.anIntArrayArray29[11][0] = 2691;
			this.anIntArrayArray29[11][3] = 3228;
			this.anIntArrayArray29[11][2] = 3148;
			this.anIntArrayArray29[12][1] = 3806;
			this.anIntArrayArray29[12][3] = 3196;
			this.anIntArrayArray29[12][0] = 3031;
			this.anIntArrayArray29[12][2] = 3710;
			this.anIntArrayArray29[13][1] = 3437;
			this.anIntArrayArray29[13][0] = 3522;
			this.anIntArrayArray29[13][3] = 3019;
			this.anIntArrayArray29[13][2] = 3421;
			this.anIntArrayArray29[14][0] = 3727;
			this.anIntArrayArray29[14][3] = 3228;
			this.anIntArrayArray29[14][2] = 3148;
			this.anIntArrayArray29[14][1] = 3116;
			this.anIntArrayArray29[15][3] = 2746;
			this.anIntArrayArray29[15][0] = 4096;
			this.anIntArrayArray29[15][2] = 2505;
			this.anIntArrayArray29[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray29 = new int[4][4];
			this.anIntArrayArray29[0][2] = 4096;
			this.anIntArrayArray29[0][3] = 0;
			this.anIntArrayArray29[0][0] = 2048;
			this.anIntArrayArray29[0][1] = 0;
			this.anIntArrayArray29[1][2] = 4096;
			this.anIntArrayArray29[1][3] = 0;
			this.anIntArrayArray29[1][1] = 4096;
			this.anIntArrayArray29[1][0] = 2867;
			this.anIntArrayArray29[2][2] = 4096;
			this.anIntArrayArray29[2][1] = 4096;
			this.anIntArrayArray29[2][3] = 0;
			this.anIntArrayArray29[2][0] = 3276;
			this.anIntArrayArray29[3][3] = 0;
			this.anIntArrayArray29[3][1] = 4096;
			this.anIntArrayArray29[3][2] = 0;
			this.anIntArrayArray29[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V")
	@Override
	public void method5596() {
		if (this.anIntArrayArray29 == null) {
			this.method3358(1);
		}
		this.method3355();
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(21) int[] local21 = this.method5600(arg0, 0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static76.anInt1458; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray732[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
