import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class3_Sub2_Sub26 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rea", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!rea", name = "G", descriptor = "[I")
	private final int[] anIntArray526 = new int[257];

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BI)V")
	private void method7289(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray54 = new int[2][4];
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][1] = 0;
			this.anIntArrayArray54[0][3] = 0;
			this.anIntArrayArray54[0][2] = 0;
			this.anIntArrayArray54[1][3] = 4096;
			this.anIntArrayArray54[1][2] = 4096;
			this.anIntArrayArray54[1][1] = 4096;
			this.anIntArrayArray54[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray54 = new int[8][4];
			this.anIntArrayArray54[0][2] = 2602;
			this.anIntArrayArray54[0][1] = 2650;
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][3] = 2361;
			this.anIntArrayArray54[1][3] = 1558;
			this.anIntArrayArray54[1][2] = 1799;
			this.anIntArrayArray54[1][0] = 2867;
			this.anIntArrayArray54[1][1] = 2313;
			this.anIntArrayArray54[2][2] = 1734;
			this.anIntArrayArray54[2][0] = 3072;
			this.anIntArrayArray54[2][1] = 2618;
			this.anIntArrayArray54[2][3] = 1413;
			this.anIntArrayArray54[3][2] = 1220;
			this.anIntArrayArray54[3][0] = 3276;
			this.anIntArrayArray54[3][3] = 947;
			this.anIntArrayArray54[3][1] = 2296;
			this.anIntArrayArray54[4][3] = 722;
			this.anIntArrayArray54[4][1] = 2072;
			this.anIntArrayArray54[4][0] = 3481;
			this.anIntArrayArray54[4][2] = 963;
			this.anIntArrayArray54[5][1] = 2730;
			this.anIntArrayArray54[5][3] = 1766;
			this.anIntArrayArray54[5][0] = 3686;
			this.anIntArrayArray54[5][2] = 2152;
			this.anIntArrayArray54[6][0] = 3891;
			this.anIntArrayArray54[6][1] = 2232;
			this.anIntArrayArray54[6][3] = 915;
			this.anIntArrayArray54[6][2] = 1060;
			this.anIntArrayArray54[7][1] = 1686;
			this.anIntArrayArray54[7][2] = 1413;
			this.anIntArrayArray54[7][0] = 4096;
			this.anIntArrayArray54[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray54 = new int[7][4];
			this.anIntArrayArray54[0][3] = 4096;
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][2] = 0;
			this.anIntArrayArray54[0][1] = 0;
			this.anIntArrayArray54[1][3] = 4096;
			this.anIntArrayArray54[1][0] = 663;
			this.anIntArrayArray54[1][1] = 0;
			this.anIntArrayArray54[1][2] = 4096;
			this.anIntArrayArray54[2][3] = 0;
			this.anIntArrayArray54[2][1] = 0;
			this.anIntArrayArray54[2][0] = 1363;
			this.anIntArrayArray54[2][2] = 4096;
			this.anIntArrayArray54[3][2] = 4096;
			this.anIntArrayArray54[3][3] = 0;
			this.anIntArrayArray54[3][0] = 2048;
			this.anIntArrayArray54[3][1] = 4096;
			this.anIntArrayArray54[4][1] = 4096;
			this.anIntArrayArray54[4][0] = 2727;
			this.anIntArrayArray54[4][3] = 0;
			this.anIntArrayArray54[4][2] = 0;
			this.anIntArrayArray54[5][1] = 4096;
			this.anIntArrayArray54[5][2] = 0;
			this.anIntArrayArray54[5][3] = 4096;
			this.anIntArrayArray54[5][0] = 3411;
			this.anIntArrayArray54[6][0] = 4096;
			this.anIntArrayArray54[6][1] = 0;
			this.anIntArrayArray54[6][2] = 0;
			this.anIntArrayArray54[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray54 = new int[6][4];
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][3] = 0;
			this.anIntArrayArray54[0][1] = 0;
			this.anIntArrayArray54[0][2] = 0;
			this.anIntArrayArray54[1][1] = 0;
			this.anIntArrayArray54[1][2] = 0;
			this.anIntArrayArray54[1][0] = 1843;
			this.anIntArrayArray54[1][3] = 1493;
			this.anIntArrayArray54[2][2] = 0;
			this.anIntArrayArray54[2][0] = 2457;
			this.anIntArrayArray54[2][3] = 2939;
			this.anIntArrayArray54[2][1] = 0;
			this.anIntArrayArray54[3][2] = 1124;
			this.anIntArrayArray54[3][1] = 0;
			this.anIntArrayArray54[3][3] = 3565;
			this.anIntArrayArray54[3][0] = 2781;
			this.anIntArrayArray54[4][3] = 4031;
			this.anIntArrayArray54[4][1] = 546;
			this.anIntArrayArray54[4][2] = 3084;
			this.anIntArrayArray54[4][0] = 3481;
			this.anIntArrayArray54[5][3] = 4096;
			this.anIntArrayArray54[5][2] = 4096;
			this.anIntArrayArray54[5][1] = 4096;
			this.anIntArrayArray54[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray54 = new int[16][4];
			this.anIntArrayArray54[0][1] = 80;
			this.anIntArrayArray54[0][2] = 192;
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][3] = 321;
			this.anIntArrayArray54[1][1] = 321;
			this.anIntArrayArray54[1][3] = 562;
			this.anIntArrayArray54[1][2] = 449;
			this.anIntArrayArray54[1][0] = 155;
			this.anIntArrayArray54[2][1] = 578;
			this.anIntArrayArray54[2][3] = 803;
			this.anIntArrayArray54[2][2] = 690;
			this.anIntArrayArray54[2][0] = 389;
			this.anIntArrayArray54[3][1] = 947;
			this.anIntArrayArray54[3][2] = 995;
			this.anIntArrayArray54[3][3] = 1140;
			this.anIntArrayArray54[3][0] = 671;
			this.anIntArrayArray54[4][3] = 1509;
			this.anIntArrayArray54[4][1] = 1285;
			this.anIntArrayArray54[4][2] = 1397;
			this.anIntArrayArray54[4][0] = 897;
			this.anIntArrayArray54[5][3] = 1413;
			this.anIntArrayArray54[5][2] = 1429;
			this.anIntArrayArray54[5][1] = 1525;
			this.anIntArrayArray54[5][0] = 1175;
			this.anIntArrayArray54[6][1] = 1734;
			this.anIntArrayArray54[6][3] = 1333;
			this.anIntArrayArray54[6][2] = 1461;
			this.anIntArrayArray54[6][0] = 1368;
			this.anIntArrayArray54[7][3] = 1702;
			this.anIntArrayArray54[7][1] = 1413;
			this.anIntArrayArray54[7][2] = 1525;
			this.anIntArrayArray54[7][0] = 1507;
			this.anIntArrayArray54[8][2] = 1590;
			this.anIntArrayArray54[8][1] = 1108;
			this.anIntArrayArray54[8][3] = 2056;
			this.anIntArrayArray54[8][0] = 1736;
			this.anIntArrayArray54[9][0] = 2088;
			this.anIntArrayArray54[9][3] = 2666;
			this.anIntArrayArray54[9][1] = 1766;
			this.anIntArrayArray54[9][2] = 2056;
			this.anIntArrayArray54[10][1] = 2409;
			this.anIntArrayArray54[10][3] = 3276;
			this.anIntArrayArray54[10][2] = 2586;
			this.anIntArrayArray54[10][0] = 2355;
			this.anIntArrayArray54[11][2] = 3148;
			this.anIntArrayArray54[11][0] = 2691;
			this.anIntArrayArray54[11][3] = 3228;
			this.anIntArrayArray54[11][1] = 3116;
			this.anIntArrayArray54[12][1] = 3806;
			this.anIntArrayArray54[12][2] = 3710;
			this.anIntArrayArray54[12][3] = 3196;
			this.anIntArrayArray54[12][0] = 3031;
			this.anIntArrayArray54[13][0] = 3522;
			this.anIntArrayArray54[13][1] = 3437;
			this.anIntArrayArray54[13][2] = 3421;
			this.anIntArrayArray54[13][3] = 3019;
			this.anIntArrayArray54[14][1] = 3116;
			this.anIntArrayArray54[14][2] = 3148;
			this.anIntArrayArray54[14][3] = 3228;
			this.anIntArrayArray54[14][0] = 3727;
			this.anIntArrayArray54[15][0] = 4096;
			this.anIntArrayArray54[15][3] = 2746;
			this.anIntArrayArray54[15][1] = 2377;
			this.anIntArrayArray54[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray54 = new int[4][4];
			this.anIntArrayArray54[0][3] = 0;
			this.anIntArrayArray54[0][1] = 0;
			this.anIntArrayArray54[0][0] = 2048;
			this.anIntArrayArray54[0][2] = 4096;
			this.anIntArrayArray54[1][3] = 0;
			this.anIntArrayArray54[1][0] = 2867;
			this.anIntArrayArray54[1][2] = 4096;
			this.anIntArrayArray54[1][1] = 4096;
			this.anIntArrayArray54[2][2] = 4096;
			this.anIntArrayArray54[2][1] = 4096;
			this.anIntArrayArray54[2][3] = 0;
			this.anIntArrayArray54[2][0] = 3276;
			this.anIntArrayArray54[3][3] = 0;
			this.anIntArrayArray54[3][2] = 0;
			this.anIntArrayArray54[3][1] = 4096;
			this.anIntArrayArray54[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(21) int[] local21 = this.method8603(arg0, 0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static491.anInt8519; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray526[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "(I)V")
	private void method7290() {
		@Pc(17) int local17 = this.anIntArrayArray54.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < 257; local21++) {
			@Pc(25) int local25 = 0;
			@Pc(29) int local29 = local21 << 4;
			for (@Pc(31) int local31 = 0; local17 > local31 && local29 >= this.anIntArrayArray54[local31][0]; local31++) {
				local25++;
			}
			@Pc(75) int local75;
			@Pc(83) int local83;
			@Pc(79) int local79;
			@Pc(66) int[] local66;
			if (local17 > local25) {
				local66 = this.anIntArrayArray54[local25];
				if (local25 <= 0) {
					local75 = local66[1];
					local79 = local66[3];
					local83 = local66[2];
				} else {
					@Pc(92) int[] local92 = this.anIntArrayArray54[local25 - 1];
					@Pc(109) int local109 = (local29 - local92[0] << 12) / (local66[0] - local92[0]);
					@Pc(114) int local114 = 4096 - local109;
					local79 = local92[3] * local114 + local66[3] * local109 >> 12;
					local75 = local92[1] * local114 + local109 * local66[1] >> 12;
					local83 = local92[2] * local114 + local109 * local66[2] >> 12;
				}
			} else {
				local66 = this.anIntArrayArray54[local17 - 1];
				local79 = local66[3];
				local83 = local66[2];
				local75 = local66[1];
			}
			local79 >>= 0x4;
			local83 >>= 0x4;
			local75 >>= 0x4;
			if (local83 < 0) {
				local83 = 0;
			} else if (local83 > 255) {
				local83 = 255;
			}
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 > 255) {
				local75 = 255;
			}
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 > 255) {
				local79 = 255;
			}
			this.anIntArray526[local21] = local79 | local83 << 8 | local75 << 16;
		}
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
		if (this.anIntArrayArray54 == null) {
			this.method7289(1);
		}
		this.method7290();
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(7) int local7 = arg0.method4225();
		if (local7 != 0) {
			this.method7289(local7);
			return;
		}
		this.anIntArrayArray54 = new int[arg0.method4225()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray54.length; local21++) {
			this.anIntArrayArray54[local21][0] = arg0.method4221();
			this.anIntArrayArray54[local21][1] = arg0.method4225() << 4;
			this.anIntArrayArray54[local21][2] = arg0.method4225() << 4;
			this.anIntArrayArray54[local21][3] = arg0.method4225() << 4;
		}
	}
}
