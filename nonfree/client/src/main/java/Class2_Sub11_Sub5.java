import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class2_Sub11_Sub5 extends Class2_Sub11 {

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!gg", name = "D", descriptor = "[I")
	private final int[] anIntArray264 = new int[257];

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
		if (this.anIntArrayArray26 == null) {
			this.method2885(1);
		}
		this.method2884();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(7) int local7 = arg1.method8581(-17416);
		if (local7 != 0) {
			this.method2885(local7);
			return;
		}
		this.anIntArrayArray26 = new int[arg1.method8581(-17416)][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray26.length; local21++) {
			this.anIntArrayArray26[local21][0] = arg1.method8575();
			this.anIntArrayArray26[local21][1] = arg1.method8581(-17416) << 4;
			this.anIntArrayArray26[local21][2] = arg1.method8581(-17416) << 4;
			this.anIntArrayArray26[local21][3] = arg1.method8581(-17416) << 4;
		}
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V")
	private void method2884() {
		@Pc(14) int local14 = this.anIntArrayArray26.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 257; local18++) {
			@Pc(22) int local22 = 0;
			@Pc(26) int local26 = local18 << 4;
			for (@Pc(28) int local28 = 0; local14 > local28 && this.anIntArrayArray26[local28][0] <= local26; local28++) {
				local22++;
			}
			@Pc(71) int local71;
			@Pc(75) int local75;
			@Pc(67) int local67;
			@Pc(63) int[] local63;
			if (local22 >= local14) {
				local63 = this.anIntArrayArray26[local14 - 1];
				local67 = local63[3];
				local71 = local63[1];
				local75 = local63[2];
			} else {
				local63 = this.anIntArrayArray26[local22];
				if (local22 > 0) {
					@Pc(91) int[] local91 = this.anIntArrayArray26[local22 - 1];
					@Pc(109) int local109 = (local26 - local91[0] << 12) / (local63[0] - local91[0]);
					@Pc(113) int local113 = 4096 - local109;
					local75 = local109 * local63[2] + local91[2] * local113 >> 12;
					local67 = local63[3] * local109 + local91[3] * local113 >> 12;
					local71 = local109 * local63[1] + local91[1] * local113 >> 12;
				} else {
					local75 = local63[2];
					local71 = local63[1];
					local67 = local63[3];
				}
			}
			local67 >>= 0x4;
			local75 >>= 0x4;
			local71 >>= 0x4;
			if (local67 < 0) {
				local67 = 0;
			} else if (local67 > 255) {
				local67 = 255;
			}
			if (local71 < 0) {
				local71 = 0;
			} else if (local71 > 255) {
				local71 = 255;
			}
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 > 255) {
				local75 = 255;
			}
			this.anIntArray264[local18] = local75 << 8 | local71 << 16 | local67;
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)V")
	private void method2885(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray26 = new int[2][4];
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][1] = 4096;
			this.anIntArrayArray26[1][3] = 4096;
			this.anIntArrayArray26[1][0] = 4096;
			this.anIntArrayArray26[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray26 = new int[8][4];
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[0][2] = 2602;
			this.anIntArrayArray26[0][1] = 2650;
			this.anIntArrayArray26[0][3] = 2361;
			this.anIntArrayArray26[1][1] = 2313;
			this.anIntArrayArray26[1][3] = 1558;
			this.anIntArrayArray26[1][0] = 2867;
			this.anIntArrayArray26[1][2] = 1799;
			this.anIntArrayArray26[2][2] = 1734;
			this.anIntArrayArray26[2][0] = 3072;
			this.anIntArrayArray26[2][3] = 1413;
			this.anIntArrayArray26[2][1] = 2618;
			this.anIntArrayArray26[3][3] = 947;
			this.anIntArrayArray26[3][0] = 3276;
			this.anIntArrayArray26[3][2] = 1220;
			this.anIntArrayArray26[3][1] = 2296;
			this.anIntArrayArray26[4][3] = 722;
			this.anIntArrayArray26[4][2] = 963;
			this.anIntArrayArray26[4][1] = 2072;
			this.anIntArrayArray26[4][0] = 3481;
			this.anIntArrayArray26[5][2] = 2152;
			this.anIntArrayArray26[5][1] = 2730;
			this.anIntArrayArray26[5][0] = 3686;
			this.anIntArrayArray26[5][3] = 1766;
			this.anIntArrayArray26[6][1] = 2232;
			this.anIntArrayArray26[6][0] = 3891;
			this.anIntArrayArray26[6][3] = 915;
			this.anIntArrayArray26[6][2] = 1060;
			this.anIntArrayArray26[7][3] = 1140;
			this.anIntArrayArray26[7][2] = 1413;
			this.anIntArrayArray26[7][0] = 4096;
			this.anIntArrayArray26[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray26 = new int[7][4];
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[0][3] = 4096;
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][3] = 4096;
			this.anIntArrayArray26[1][0] = 663;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[1][1] = 0;
			this.anIntArrayArray26[2][2] = 4096;
			this.anIntArrayArray26[2][0] = 1363;
			this.anIntArrayArray26[2][3] = 0;
			this.anIntArrayArray26[2][1] = 0;
			this.anIntArrayArray26[3][2] = 4096;
			this.anIntArrayArray26[3][0] = 2048;
			this.anIntArrayArray26[3][3] = 0;
			this.anIntArrayArray26[3][1] = 4096;
			this.anIntArrayArray26[4][0] = 2727;
			this.anIntArrayArray26[4][1] = 4096;
			this.anIntArrayArray26[4][3] = 0;
			this.anIntArrayArray26[4][2] = 0;
			this.anIntArrayArray26[5][0] = 3411;
			this.anIntArrayArray26[5][2] = 0;
			this.anIntArrayArray26[5][3] = 4096;
			this.anIntArrayArray26[5][1] = 4096;
			this.anIntArrayArray26[6][0] = 4096;
			this.anIntArrayArray26[6][1] = 0;
			this.anIntArrayArray26[6][2] = 0;
			this.anIntArrayArray26[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray26 = new int[6][4];
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][2] = 0;
			this.anIntArrayArray26[1][1] = 0;
			this.anIntArrayArray26[1][3] = 1493;
			this.anIntArrayArray26[1][0] = 1843;
			this.anIntArrayArray26[2][0] = 2457;
			this.anIntArrayArray26[2][3] = 2939;
			this.anIntArrayArray26[2][2] = 0;
			this.anIntArrayArray26[2][1] = 0;
			this.anIntArrayArray26[3][3] = 3565;
			this.anIntArrayArray26[3][0] = 2781;
			this.anIntArrayArray26[3][1] = 0;
			this.anIntArrayArray26[3][2] = 1124;
			this.anIntArrayArray26[4][0] = 3481;
			this.anIntArrayArray26[4][3] = 4031;
			this.anIntArrayArray26[4][1] = 546;
			this.anIntArrayArray26[4][2] = 3084;
			this.anIntArrayArray26[5][2] = 4096;
			this.anIntArrayArray26[5][1] = 4096;
			this.anIntArrayArray26[5][3] = 4096;
			this.anIntArrayArray26[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray26 = new int[16][4];
			this.anIntArrayArray26[0][1] = 80;
			this.anIntArrayArray26[0][3] = 321;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[0][2] = 192;
			this.anIntArrayArray26[1][1] = 321;
			this.anIntArrayArray26[1][0] = 155;
			this.anIntArrayArray26[1][2] = 449;
			this.anIntArrayArray26[1][3] = 562;
			this.anIntArrayArray26[2][1] = 578;
			this.anIntArrayArray26[2][0] = 389;
			this.anIntArrayArray26[2][2] = 690;
			this.anIntArrayArray26[2][3] = 803;
			this.anIntArrayArray26[3][1] = 947;
			this.anIntArrayArray26[3][3] = 1140;
			this.anIntArrayArray26[3][2] = 995;
			this.anIntArrayArray26[3][0] = 671;
			this.anIntArrayArray26[4][0] = 897;
			this.anIntArrayArray26[4][1] = 1285;
			this.anIntArrayArray26[4][3] = 1509;
			this.anIntArrayArray26[4][2] = 1397;
			this.anIntArrayArray26[5][1] = 1525;
			this.anIntArrayArray26[5][0] = 1175;
			this.anIntArrayArray26[5][2] = 1429;
			this.anIntArrayArray26[5][3] = 1413;
			this.anIntArrayArray26[6][2] = 1461;
			this.anIntArrayArray26[6][0] = 1368;
			this.anIntArrayArray26[6][1] = 1734;
			this.anIntArrayArray26[6][3] = 1333;
			this.anIntArrayArray26[7][0] = 1507;
			this.anIntArrayArray26[7][3] = 1702;
			this.anIntArrayArray26[7][1] = 1413;
			this.anIntArrayArray26[7][2] = 1525;
			this.anIntArrayArray26[8][2] = 1590;
			this.anIntArrayArray26[8][1] = 1108;
			this.anIntArrayArray26[8][0] = 1736;
			this.anIntArrayArray26[8][3] = 2056;
			this.anIntArrayArray26[9][0] = 2088;
			this.anIntArrayArray26[9][1] = 1766;
			this.anIntArrayArray26[9][3] = 2666;
			this.anIntArrayArray26[9][2] = 2056;
			this.anIntArrayArray26[10][2] = 2586;
			this.anIntArrayArray26[10][0] = 2355;
			this.anIntArrayArray26[10][1] = 2409;
			this.anIntArrayArray26[10][3] = 3276;
			this.anIntArrayArray26[11][3] = 3228;
			this.anIntArrayArray26[11][0] = 2691;
			this.anIntArrayArray26[11][2] = 3148;
			this.anIntArrayArray26[11][1] = 3116;
			this.anIntArrayArray26[12][3] = 3196;
			this.anIntArrayArray26[12][0] = 3031;
			this.anIntArrayArray26[12][1] = 3806;
			this.anIntArrayArray26[12][2] = 3710;
			this.anIntArrayArray26[13][3] = 3019;
			this.anIntArrayArray26[13][2] = 3421;
			this.anIntArrayArray26[13][1] = 3437;
			this.anIntArrayArray26[13][0] = 3522;
			this.anIntArrayArray26[14][2] = 3148;
			this.anIntArrayArray26[14][0] = 3727;
			this.anIntArrayArray26[14][1] = 3116;
			this.anIntArrayArray26[14][3] = 3228;
			this.anIntArrayArray26[15][2] = 2505;
			this.anIntArrayArray26[15][3] = 2746;
			this.anIntArrayArray26[15][1] = 2377;
			this.anIntArrayArray26[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray26 = new int[4][4];
			this.anIntArrayArray26[0][0] = 2048;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[0][2] = 4096;
			this.anIntArrayArray26[1][1] = 4096;
			this.anIntArrayArray26[1][3] = 0;
			this.anIntArrayArray26[1][0] = 2867;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[2][3] = 0;
			this.anIntArrayArray26[2][1] = 4096;
			this.anIntArrayArray26[2][0] = 3276;
			this.anIntArrayArray26[2][2] = 4096;
			this.anIntArrayArray26[3][1] = 4096;
			this.anIntArrayArray26[3][0] = 4096;
			this.anIntArrayArray26[3][2] = 0;
			this.anIntArrayArray26[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(30) int[] local30 = this.method9540(arg0, 0);
			@Pc(34) int[] local34 = local20[0];
			@Pc(38) int[] local38 = local20[1];
			@Pc(42) int[] local42 = local20[2];
			for (@Pc(44) int local44 = 0; local44 < Static301.anInt10214; local44++) {
				@Pc(52) int local52 = local30[local44] >> 4;
				if (local52 < 0) {
					local52 = 0;
				}
				if (local52 > 256) {
					local52 = 256;
				}
				local52 = this.anIntArray264[local52];
				local34[local44] = local52 >> 12 & 0xFF0;
				local38[local44] = local52 >> 4 & 0xFF0;
				local42[local44] = (local52 & 0xFF) << 4;
			}
		}
		return local20;
	}
}
