import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class6_Sub4_Sub23 extends Class6_Sub4 {

	@OriginalMember(owner = "client!nf", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!nf", name = "D", descriptor = "[I")
	private final int[] anIntArray446 = new int[257];

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(29) int[] local29 = this.method7748(0, arg0);
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			for (@Pc(43) int local43 = 0; local43 < Static408.anInt7209; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray446[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
		if (this.anIntArrayArray57 == null) {
			this.method5242(1);
		}
		this.method5244();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(7) int local7 = arg1.method6069();
		if (local7 != 0) {
			this.method5242(local7);
			return;
		}
		this.anIntArrayArray57 = new int[arg1.method6069()][4];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray57.length; local27++) {
			this.anIntArrayArray57[local27][0] = arg1.method6003();
			this.anIntArrayArray57[local27][1] = arg1.method6069() << 4;
			this.anIntArrayArray57[local27][2] = arg1.method6069() << 4;
			this.anIntArrayArray57[local27][3] = arg1.method6069() << 4;
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)V")
	private void method5242(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray57 = new int[2][4];
			this.anIntArrayArray57[0][3] = 0;
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][2] = 0;
			this.anIntArrayArray57[0][1] = 0;
			this.anIntArrayArray57[1][3] = 4096;
			this.anIntArrayArray57[1][1] = 4096;
			this.anIntArrayArray57[1][2] = 4096;
			this.anIntArrayArray57[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray57 = new int[8][4];
			this.anIntArrayArray57[0][2] = 2602;
			this.anIntArrayArray57[0][3] = 2361;
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][1] = 2650;
			this.anIntArrayArray57[1][2] = 1799;
			this.anIntArrayArray57[1][0] = 2867;
			this.anIntArrayArray57[1][3] = 1558;
			this.anIntArrayArray57[1][1] = 2313;
			this.anIntArrayArray57[2][1] = 2618;
			this.anIntArrayArray57[2][2] = 1734;
			this.anIntArrayArray57[2][0] = 3072;
			this.anIntArrayArray57[2][3] = 1413;
			this.anIntArrayArray57[3][3] = 947;
			this.anIntArrayArray57[3][2] = 1220;
			this.anIntArrayArray57[3][1] = 2296;
			this.anIntArrayArray57[3][0] = 3276;
			this.anIntArrayArray57[4][2] = 963;
			this.anIntArrayArray57[4][3] = 722;
			this.anIntArrayArray57[4][0] = 3481;
			this.anIntArrayArray57[4][1] = 2072;
			this.anIntArrayArray57[5][0] = 3686;
			this.anIntArrayArray57[5][3] = 1766;
			this.anIntArrayArray57[5][1] = 2730;
			this.anIntArrayArray57[5][2] = 2152;
			this.anIntArrayArray57[6][0] = 3891;
			this.anIntArrayArray57[6][3] = 915;
			this.anIntArrayArray57[6][2] = 1060;
			this.anIntArrayArray57[6][1] = 2232;
			this.anIntArrayArray57[7][0] = 4096;
			this.anIntArrayArray57[7][3] = 1140;
			this.anIntArrayArray57[7][2] = 1413;
			this.anIntArrayArray57[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray57 = new int[7][4];
			this.anIntArrayArray57[0][3] = 4096;
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][1] = 0;
			this.anIntArrayArray57[0][2] = 0;
			this.anIntArrayArray57[1][0] = 663;
			this.anIntArrayArray57[1][1] = 0;
			this.anIntArrayArray57[1][3] = 4096;
			this.anIntArrayArray57[1][2] = 4096;
			this.anIntArrayArray57[2][0] = 1363;
			this.anIntArrayArray57[2][3] = 0;
			this.anIntArrayArray57[2][2] = 4096;
			this.anIntArrayArray57[2][1] = 0;
			this.anIntArrayArray57[3][1] = 4096;
			this.anIntArrayArray57[3][3] = 0;
			this.anIntArrayArray57[3][0] = 2048;
			this.anIntArrayArray57[3][2] = 4096;
			this.anIntArrayArray57[4][3] = 0;
			this.anIntArrayArray57[4][0] = 2727;
			this.anIntArrayArray57[4][1] = 4096;
			this.anIntArrayArray57[4][2] = 0;
			this.anIntArrayArray57[5][1] = 4096;
			this.anIntArrayArray57[5][3] = 4096;
			this.anIntArrayArray57[5][2] = 0;
			this.anIntArrayArray57[5][0] = 3411;
			this.anIntArrayArray57[6][2] = 0;
			this.anIntArrayArray57[6][1] = 0;
			this.anIntArrayArray57[6][3] = 4096;
			this.anIntArrayArray57[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray57 = new int[6][4];
			this.anIntArrayArray57[0][1] = 0;
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][3] = 0;
			this.anIntArrayArray57[0][2] = 0;
			this.anIntArrayArray57[1][2] = 0;
			this.anIntArrayArray57[1][1] = 0;
			this.anIntArrayArray57[1][0] = 1843;
			this.anIntArrayArray57[1][3] = 1493;
			this.anIntArrayArray57[2][1] = 0;
			this.anIntArrayArray57[2][3] = 2939;
			this.anIntArrayArray57[2][2] = 0;
			this.anIntArrayArray57[2][0] = 2457;
			this.anIntArrayArray57[3][0] = 2781;
			this.anIntArrayArray57[3][3] = 3565;
			this.anIntArrayArray57[3][2] = 1124;
			this.anIntArrayArray57[3][1] = 0;
			this.anIntArrayArray57[4][3] = 4031;
			this.anIntArrayArray57[4][1] = 546;
			this.anIntArrayArray57[4][2] = 3084;
			this.anIntArrayArray57[4][0] = 3481;
			this.anIntArrayArray57[5][2] = 4096;
			this.anIntArrayArray57[5][3] = 4096;
			this.anIntArrayArray57[5][1] = 4096;
			this.anIntArrayArray57[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray57 = new int[16][4];
			this.anIntArrayArray57[0][3] = 321;
			this.anIntArrayArray57[0][1] = 80;
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][2] = 192;
			this.anIntArrayArray57[1][3] = 562;
			this.anIntArrayArray57[1][0] = 155;
			this.anIntArrayArray57[1][1] = 321;
			this.anIntArrayArray57[1][2] = 449;
			this.anIntArrayArray57[2][3] = 803;
			this.anIntArrayArray57[2][1] = 578;
			this.anIntArrayArray57[2][2] = 690;
			this.anIntArrayArray57[2][0] = 389;
			this.anIntArrayArray57[3][1] = 947;
			this.anIntArrayArray57[3][0] = 671;
			this.anIntArrayArray57[3][3] = 1140;
			this.anIntArrayArray57[3][2] = 995;
			this.anIntArrayArray57[4][1] = 1285;
			this.anIntArrayArray57[4][3] = 1509;
			this.anIntArrayArray57[4][2] = 1397;
			this.anIntArrayArray57[4][0] = 897;
			this.anIntArrayArray57[5][2] = 1429;
			this.anIntArrayArray57[5][0] = 1175;
			this.anIntArrayArray57[5][3] = 1413;
			this.anIntArrayArray57[5][1] = 1525;
			this.anIntArrayArray57[6][1] = 1734;
			this.anIntArrayArray57[6][2] = 1461;
			this.anIntArrayArray57[6][3] = 1333;
			this.anIntArrayArray57[6][0] = 1368;
			this.anIntArrayArray57[7][3] = 1702;
			this.anIntArrayArray57[7][1] = 1413;
			this.anIntArrayArray57[7][2] = 1525;
			this.anIntArrayArray57[7][0] = 1507;
			this.anIntArrayArray57[8][3] = 2056;
			this.anIntArrayArray57[8][2] = 1590;
			this.anIntArrayArray57[8][1] = 1108;
			this.anIntArrayArray57[8][0] = 1736;
			this.anIntArrayArray57[9][1] = 1766;
			this.anIntArrayArray57[9][2] = 2056;
			this.anIntArrayArray57[9][0] = 2088;
			this.anIntArrayArray57[9][3] = 2666;
			this.anIntArrayArray57[10][0] = 2355;
			this.anIntArrayArray57[10][2] = 2586;
			this.anIntArrayArray57[10][1] = 2409;
			this.anIntArrayArray57[10][3] = 3276;
			this.anIntArrayArray57[11][0] = 2691;
			this.anIntArrayArray57[11][3] = 3228;
			this.anIntArrayArray57[11][1] = 3116;
			this.anIntArrayArray57[11][2] = 3148;
			this.anIntArrayArray57[12][2] = 3710;
			this.anIntArrayArray57[12][1] = 3806;
			this.anIntArrayArray57[12][3] = 3196;
			this.anIntArrayArray57[12][0] = 3031;
			this.anIntArrayArray57[13][0] = 3522;
			this.anIntArrayArray57[13][1] = 3437;
			this.anIntArrayArray57[13][3] = 3019;
			this.anIntArrayArray57[13][2] = 3421;
			this.anIntArrayArray57[14][3] = 3228;
			this.anIntArrayArray57[14][2] = 3148;
			this.anIntArrayArray57[14][1] = 3116;
			this.anIntArrayArray57[14][0] = 3727;
			this.anIntArrayArray57[15][0] = 4096;
			this.anIntArrayArray57[15][2] = 2505;
			this.anIntArrayArray57[15][3] = 2746;
			this.anIntArrayArray57[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray57 = new int[4][4];
			this.anIntArrayArray57[0][0] = 2048;
			this.anIntArrayArray57[0][3] = 0;
			this.anIntArrayArray57[0][1] = 0;
			this.anIntArrayArray57[0][2] = 4096;
			this.anIntArrayArray57[1][3] = 0;
			this.anIntArrayArray57[1][1] = 4096;
			this.anIntArrayArray57[1][2] = 4096;
			this.anIntArrayArray57[1][0] = 2867;
			this.anIntArrayArray57[2][2] = 4096;
			this.anIntArrayArray57[2][3] = 0;
			this.anIntArrayArray57[2][0] = 3276;
			this.anIntArrayArray57[2][1] = 4096;
			this.anIntArrayArray57[3][1] = 4096;
			this.anIntArrayArray57[3][0] = 4096;
			this.anIntArrayArray57[3][3] = 0;
			this.anIntArrayArray57[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
	private void method5244() {
		@Pc(14) int local14 = this.anIntArrayArray57.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 257; local18++) {
			@Pc(22) int local22 = 0;
			@Pc(26) int local26 = local18 << 4;
			for (@Pc(28) int local28 = 0; local14 > local28 && local26 >= this.anIntArrayArray57[local28][0]; local28++) {
				local22++;
			}
			@Pc(65) int local65;
			@Pc(61) int local61;
			@Pc(69) int local69;
			@Pc(57) int[] local57;
			if (local14 <= local22) {
				local57 = this.anIntArrayArray57[local14 - 1];
				local61 = local57[2];
				local65 = local57[1];
				local69 = local57[3];
			} else {
				local57 = this.anIntArrayArray57[local22];
				if (local22 > 0) {
					@Pc(88) int[] local88 = this.anIntArrayArray57[local22 - 1];
					@Pc(106) int local106 = (local26 - local88[0] << 12) / (local57[0] - local88[0]);
					@Pc(110) int local110 = 4096 - local106;
					local69 = local110 * local88[3] + local106 * local57[3] >> 12;
					local65 = local106 * local57[1] + local110 * local88[1] >> 12;
					local61 = local106 * local57[2] + local88[2] * local110 >> 12;
				} else {
					local61 = local57[2];
					local69 = local57[3];
					local65 = local57[1];
				}
			}
			local61 >>= 0x4;
			local69 >>= 0x4;
			local65 >>= 0x4;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			if (local65 < 0) {
				local65 = 0;
			} else if (local65 > 255) {
				local65 = 255;
			}
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			this.anIntArray446[local18] = local69 | local61 << 8 | local65 << 16;
		}
	}
}
