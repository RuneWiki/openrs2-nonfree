import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!aq", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!aq", name = "L", descriptor = "[I")
	private final int[] anIntArray20 = new int[257];

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)V")
	private void method222() {
		@Pc(15) int local15 = this.anIntArrayArray1.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local22 << 4;
			for (@Pc(32) int local32 = 0; local15 > local32 && this.anIntArrayArray1[local32][0] <= local30; local32++) {
				local26++;
			}
			@Pc(102) int local102;
			@Pc(116) int local116;
			@Pc(131) int local131;
			@Pc(55) int[] local55;
			if (local26 < local15) {
				local55 = this.anIntArrayArray1[local26];
				if (local26 > 0) {
					@Pc(67) int[] local67 = this.anIntArrayArray1[local26 - 1];
					@Pc(83) int local83 = (local30 - local67[0] << 12) / (local55[0] - local67[0]);
					@Pc(88) int local88 = 4096 - local83;
					local102 = local55[1] * local83 + local67[1] * local88 >> 12;
					local116 = local88 * local67[2] + local55[2] * local83 >> 12;
					local131 = local83 * local55[3] + local88 * local67[3] >> 12;
				} else {
					local116 = local55[2];
					local102 = local55[1];
					local131 = local55[3];
				}
			} else {
				local55 = this.anIntArrayArray1[local15 - 1];
				local131 = local55[3];
				local116 = local55[2];
				local102 = local55[1];
			}
			local131 >>= 0x4;
			local102 >>= 0x4;
			local116 >>= 0x4;
			if (local102 < 0) {
				local102 = 0;
			} else if (local102 > 255) {
				local102 = 255;
			}
			if (local131 < 0) {
				local131 = 0;
			} else if (local131 > 255) {
				local131 = 255;
			}
			if (local116 < 0) {
				local116 = 0;
			} else if (local116 > 255) {
				local116 = 255;
			}
			this.anIntArray20[local22] = local131 | local102 << 16 | local116 << 8;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(16) int local16 = arg0.method3580();
		if (local16 != 0) {
			this.method223(local16);
			return;
		}
		this.anIntArrayArray1 = new int[arg0.method3580()][4];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray1.length; local32++) {
			this.anIntArrayArray1[local32][0] = arg0.method3555();
			this.anIntArrayArray1[local32][1] = arg0.method3580() << 4;
			this.anIntArrayArray1[local32][2] = arg0.method3580() << 4;
			this.anIntArrayArray1[local32][3] = arg0.method3580() << 4;
		}
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
		if (this.anIntArrayArray1 == null) {
			this.method223(1);
		}
		this.method222();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	private void method223(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray1 = new int[2][4];
			this.anIntArrayArray1[0][3] = 0;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[0][2] = 0;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[1][2] = 4096;
			this.anIntArrayArray1[1][1] = 4096;
			this.anIntArrayArray1[1][3] = 4096;
			this.anIntArrayArray1[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray1 = new int[8][4];
			this.anIntArrayArray1[0][2] = 2602;
			this.anIntArrayArray1[0][3] = 2361;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[0][1] = 2650;
			this.anIntArrayArray1[1][3] = 1558;
			this.anIntArrayArray1[1][1] = 2313;
			this.anIntArrayArray1[1][0] = 2867;
			this.anIntArrayArray1[1][2] = 1799;
			this.anIntArrayArray1[2][1] = 2618;
			this.anIntArrayArray1[2][3] = 1413;
			this.anIntArrayArray1[2][0] = 3072;
			this.anIntArrayArray1[2][2] = 1734;
			this.anIntArrayArray1[3][2] = 1220;
			this.anIntArrayArray1[3][3] = 947;
			this.anIntArrayArray1[3][1] = 2296;
			this.anIntArrayArray1[3][0] = 3276;
			this.anIntArrayArray1[4][0] = 3481;
			this.anIntArrayArray1[4][1] = 2072;
			this.anIntArrayArray1[4][3] = 722;
			this.anIntArrayArray1[4][2] = 963;
			this.anIntArrayArray1[5][2] = 2152;
			this.anIntArrayArray1[5][3] = 1766;
			this.anIntArrayArray1[5][0] = 3686;
			this.anIntArrayArray1[5][1] = 2730;
			this.anIntArrayArray1[6][3] = 915;
			this.anIntArrayArray1[6][2] = 1060;
			this.anIntArrayArray1[6][0] = 3891;
			this.anIntArrayArray1[6][1] = 2232;
			this.anIntArrayArray1[7][0] = 4096;
			this.anIntArrayArray1[7][2] = 1413;
			this.anIntArrayArray1[7][1] = 1686;
			this.anIntArrayArray1[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray1 = new int[7][4];
			this.anIntArrayArray1[0][2] = 0;
			this.anIntArrayArray1[0][3] = 4096;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[1][1] = 0;
			this.anIntArrayArray1[1][0] = 663;
			this.anIntArrayArray1[1][2] = 4096;
			this.anIntArrayArray1[1][3] = 4096;
			this.anIntArrayArray1[2][1] = 0;
			this.anIntArrayArray1[2][2] = 4096;
			this.anIntArrayArray1[2][3] = 0;
			this.anIntArrayArray1[2][0] = 1363;
			this.anIntArrayArray1[3][0] = 2048;
			this.anIntArrayArray1[3][3] = 0;
			this.anIntArrayArray1[3][1] = 4096;
			this.anIntArrayArray1[3][2] = 4096;
			this.anIntArrayArray1[4][3] = 0;
			this.anIntArrayArray1[4][0] = 2727;
			this.anIntArrayArray1[4][1] = 4096;
			this.anIntArrayArray1[4][2] = 0;
			this.anIntArrayArray1[5][0] = 3411;
			this.anIntArrayArray1[5][1] = 4096;
			this.anIntArrayArray1[5][3] = 4096;
			this.anIntArrayArray1[5][2] = 0;
			this.anIntArrayArray1[6][2] = 0;
			this.anIntArrayArray1[6][0] = 4096;
			this.anIntArrayArray1[6][3] = 4096;
			this.anIntArrayArray1[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray1 = new int[6][4];
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[0][3] = 0;
			this.anIntArrayArray1[0][2] = 0;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[1][1] = 0;
			this.anIntArrayArray1[1][0] = 1843;
			this.anIntArrayArray1[1][3] = 1493;
			this.anIntArrayArray1[1][2] = 0;
			this.anIntArrayArray1[2][0] = 2457;
			this.anIntArrayArray1[2][3] = 2939;
			this.anIntArrayArray1[2][2] = 0;
			this.anIntArrayArray1[2][1] = 0;
			this.anIntArrayArray1[3][0] = 2781;
			this.anIntArrayArray1[3][1] = 0;
			this.anIntArrayArray1[3][2] = 1124;
			this.anIntArrayArray1[3][3] = 3565;
			this.anIntArrayArray1[4][1] = 546;
			this.anIntArrayArray1[4][2] = 3084;
			this.anIntArrayArray1[4][0] = 3481;
			this.anIntArrayArray1[4][3] = 4031;
			this.anIntArrayArray1[5][2] = 4096;
			this.anIntArrayArray1[5][3] = 4096;
			this.anIntArrayArray1[5][0] = 4096;
			this.anIntArrayArray1[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray1 = new int[16][4];
			this.anIntArrayArray1[0][3] = 321;
			this.anIntArrayArray1[0][1] = 80;
			this.anIntArrayArray1[0][2] = 192;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[1][0] = 155;
			this.anIntArrayArray1[1][3] = 562;
			this.anIntArrayArray1[1][1] = 321;
			this.anIntArrayArray1[1][2] = 449;
			this.anIntArrayArray1[2][3] = 803;
			this.anIntArrayArray1[2][0] = 389;
			this.anIntArrayArray1[2][1] = 578;
			this.anIntArrayArray1[2][2] = 690;
			this.anIntArrayArray1[3][1] = 947;
			this.anIntArrayArray1[3][2] = 995;
			this.anIntArrayArray1[3][3] = 1140;
			this.anIntArrayArray1[3][0] = 671;
			this.anIntArrayArray1[4][1] = 1285;
			this.anIntArrayArray1[4][0] = 897;
			this.anIntArrayArray1[4][3] = 1509;
			this.anIntArrayArray1[4][2] = 1397;
			this.anIntArrayArray1[5][1] = 1525;
			this.anIntArrayArray1[5][0] = 1175;
			this.anIntArrayArray1[5][3] = 1413;
			this.anIntArrayArray1[5][2] = 1429;
			this.anIntArrayArray1[6][3] = 1333;
			this.anIntArrayArray1[6][2] = 1461;
			this.anIntArrayArray1[6][0] = 1368;
			this.anIntArrayArray1[6][1] = 1734;
			this.anIntArrayArray1[7][0] = 1507;
			this.anIntArrayArray1[7][1] = 1413;
			this.anIntArrayArray1[7][3] = 1702;
			this.anIntArrayArray1[7][2] = 1525;
			this.anIntArrayArray1[8][1] = 1108;
			this.anIntArrayArray1[8][2] = 1590;
			this.anIntArrayArray1[8][0] = 1736;
			this.anIntArrayArray1[8][3] = 2056;
			this.anIntArrayArray1[9][3] = 2666;
			this.anIntArrayArray1[9][0] = 2088;
			this.anIntArrayArray1[9][1] = 1766;
			this.anIntArrayArray1[9][2] = 2056;
			this.anIntArrayArray1[10][2] = 2586;
			this.anIntArrayArray1[10][1] = 2409;
			this.anIntArrayArray1[10][3] = 3276;
			this.anIntArrayArray1[10][0] = 2355;
			this.anIntArrayArray1[11][0] = 2691;
			this.anIntArrayArray1[11][3] = 3228;
			this.anIntArrayArray1[11][1] = 3116;
			this.anIntArrayArray1[11][2] = 3148;
			this.anIntArrayArray1[12][2] = 3710;
			this.anIntArrayArray1[12][1] = 3806;
			this.anIntArrayArray1[12][0] = 3031;
			this.anIntArrayArray1[12][3] = 3196;
			this.anIntArrayArray1[13][1] = 3437;
			this.anIntArrayArray1[13][2] = 3421;
			this.anIntArrayArray1[13][3] = 3019;
			this.anIntArrayArray1[13][0] = 3522;
			this.anIntArrayArray1[14][3] = 3228;
			this.anIntArrayArray1[14][0] = 3727;
			this.anIntArrayArray1[14][1] = 3116;
			this.anIntArrayArray1[14][2] = 3148;
			this.anIntArrayArray1[15][3] = 2746;
			this.anIntArrayArray1[15][1] = 2377;
			this.anIntArrayArray1[15][0] = 4096;
			this.anIntArrayArray1[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray1 = new int[4][4];
			this.anIntArrayArray1[0][2] = 4096;
			this.anIntArrayArray1[0][3] = 0;
			this.anIntArrayArray1[0][0] = 2048;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[1][0] = 2867;
			this.anIntArrayArray1[1][1] = 4096;
			this.anIntArrayArray1[1][3] = 0;
			this.anIntArrayArray1[1][2] = 4096;
			this.anIntArrayArray1[2][3] = 0;
			this.anIntArrayArray1[2][1] = 4096;
			this.anIntArrayArray1[2][2] = 4096;
			this.anIntArrayArray1[2][0] = 3276;
			this.anIntArrayArray1[3][0] = 4096;
			this.anIntArrayArray1[3][3] = 0;
			this.anIntArrayArray1[3][1] = 4096;
			this.anIntArrayArray1[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(29) int[] local29 = this.method5472(arg0, 0);
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			for (@Pc(43) int local43 = 0; local43 < Static217.anInt3574; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray20[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
