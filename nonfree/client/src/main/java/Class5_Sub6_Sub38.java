import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class5_Sub6_Sub38 extends Class5_Sub6 {

	@OriginalMember(owner = "client!tv", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!tv", name = "H", descriptor = "[I")
	private final int[] anIntArray529 = new int[257];

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(II)V")
	private void method7972(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray78 = new int[2][4];
			this.anIntArrayArray78[0][2] = 0;
			this.anIntArrayArray78[0][0] = 0;
			this.anIntArrayArray78[0][3] = 0;
			this.anIntArrayArray78[0][1] = 0;
			this.anIntArrayArray78[1][0] = 4096;
			this.anIntArrayArray78[1][1] = 4096;
			this.anIntArrayArray78[1][2] = 4096;
			this.anIntArrayArray78[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray78 = new int[8][4];
			this.anIntArrayArray78[0][1] = 2650;
			this.anIntArrayArray78[0][3] = 2361;
			this.anIntArrayArray78[0][0] = 0;
			this.anIntArrayArray78[0][2] = 2602;
			this.anIntArrayArray78[1][1] = 2313;
			this.anIntArrayArray78[1][2] = 1799;
			this.anIntArrayArray78[1][3] = 1558;
			this.anIntArrayArray78[1][0] = 2867;
			this.anIntArrayArray78[2][3] = 1413;
			this.anIntArrayArray78[2][1] = 2618;
			this.anIntArrayArray78[2][0] = 3072;
			this.anIntArrayArray78[2][2] = 1734;
			this.anIntArrayArray78[3][2] = 1220;
			this.anIntArrayArray78[3][0] = 3276;
			this.anIntArrayArray78[3][1] = 2296;
			this.anIntArrayArray78[3][3] = 947;
			this.anIntArrayArray78[4][0] = 3481;
			this.anIntArrayArray78[4][3] = 722;
			this.anIntArrayArray78[4][1] = 2072;
			this.anIntArrayArray78[4][2] = 963;
			this.anIntArrayArray78[5][0] = 3686;
			this.anIntArrayArray78[5][2] = 2152;
			this.anIntArrayArray78[5][1] = 2730;
			this.anIntArrayArray78[5][3] = 1766;
			this.anIntArrayArray78[6][0] = 3891;
			this.anIntArrayArray78[6][1] = 2232;
			this.anIntArrayArray78[6][2] = 1060;
			this.anIntArrayArray78[6][3] = 915;
			this.anIntArrayArray78[7][3] = 1140;
			this.anIntArrayArray78[7][0] = 4096;
			this.anIntArrayArray78[7][2] = 1413;
			this.anIntArrayArray78[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray78 = new int[7][4];
			this.anIntArrayArray78[0][3] = 4096;
			this.anIntArrayArray78[0][1] = 0;
			this.anIntArrayArray78[0][0] = 0;
			this.anIntArrayArray78[0][2] = 0;
			this.anIntArrayArray78[1][2] = 4096;
			this.anIntArrayArray78[1][1] = 0;
			this.anIntArrayArray78[1][0] = 663;
			this.anIntArrayArray78[1][3] = 4096;
			this.anIntArrayArray78[2][3] = 0;
			this.anIntArrayArray78[2][1] = 0;
			this.anIntArrayArray78[2][0] = 1363;
			this.anIntArrayArray78[2][2] = 4096;
			this.anIntArrayArray78[3][1] = 4096;
			this.anIntArrayArray78[3][2] = 4096;
			this.anIntArrayArray78[3][3] = 0;
			this.anIntArrayArray78[3][0] = 2048;
			this.anIntArrayArray78[4][3] = 0;
			this.anIntArrayArray78[4][0] = 2727;
			this.anIntArrayArray78[4][2] = 0;
			this.anIntArrayArray78[4][1] = 4096;
			this.anIntArrayArray78[5][1] = 4096;
			this.anIntArrayArray78[5][0] = 3411;
			this.anIntArrayArray78[5][3] = 4096;
			this.anIntArrayArray78[5][2] = 0;
			this.anIntArrayArray78[6][2] = 0;
			this.anIntArrayArray78[6][0] = 4096;
			this.anIntArrayArray78[6][3] = 4096;
			this.anIntArrayArray78[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray78 = new int[6][4];
			this.anIntArrayArray78[0][3] = 0;
			this.anIntArrayArray78[0][1] = 0;
			this.anIntArrayArray78[0][2] = 0;
			this.anIntArrayArray78[0][0] = 0;
			this.anIntArrayArray78[1][1] = 0;
			this.anIntArrayArray78[1][0] = 1843;
			this.anIntArrayArray78[1][2] = 0;
			this.anIntArrayArray78[1][3] = 1493;
			this.anIntArrayArray78[2][2] = 0;
			this.anIntArrayArray78[2][0] = 2457;
			this.anIntArrayArray78[2][3] = 2939;
			this.anIntArrayArray78[2][1] = 0;
			this.anIntArrayArray78[3][0] = 2781;
			this.anIntArrayArray78[3][1] = 0;
			this.anIntArrayArray78[3][2] = 1124;
			this.anIntArrayArray78[3][3] = 3565;
			this.anIntArrayArray78[4][1] = 546;
			this.anIntArrayArray78[4][3] = 4031;
			this.anIntArrayArray78[4][2] = 3084;
			this.anIntArrayArray78[4][0] = 3481;
			this.anIntArrayArray78[5][2] = 4096;
			this.anIntArrayArray78[5][0] = 4096;
			this.anIntArrayArray78[5][3] = 4096;
			this.anIntArrayArray78[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray78 = new int[16][4];
			this.anIntArrayArray78[0][2] = 192;
			this.anIntArrayArray78[0][0] = 0;
			this.anIntArrayArray78[0][3] = 321;
			this.anIntArrayArray78[0][1] = 80;
			this.anIntArrayArray78[1][3] = 562;
			this.anIntArrayArray78[1][1] = 321;
			this.anIntArrayArray78[1][2] = 449;
			this.anIntArrayArray78[1][0] = 155;
			this.anIntArrayArray78[2][3] = 803;
			this.anIntArrayArray78[2][2] = 690;
			this.anIntArrayArray78[2][1] = 578;
			this.anIntArrayArray78[2][0] = 389;
			this.anIntArrayArray78[3][2] = 995;
			this.anIntArrayArray78[3][3] = 1140;
			this.anIntArrayArray78[3][1] = 947;
			this.anIntArrayArray78[3][0] = 671;
			this.anIntArrayArray78[4][1] = 1285;
			this.anIntArrayArray78[4][2] = 1397;
			this.anIntArrayArray78[4][0] = 897;
			this.anIntArrayArray78[4][3] = 1509;
			this.anIntArrayArray78[5][1] = 1525;
			this.anIntArrayArray78[5][3] = 1413;
			this.anIntArrayArray78[5][0] = 1175;
			this.anIntArrayArray78[5][2] = 1429;
			this.anIntArrayArray78[6][3] = 1333;
			this.anIntArrayArray78[6][0] = 1368;
			this.anIntArrayArray78[6][1] = 1734;
			this.anIntArrayArray78[6][2] = 1461;
			this.anIntArrayArray78[7][3] = 1702;
			this.anIntArrayArray78[7][1] = 1413;
			this.anIntArrayArray78[7][2] = 1525;
			this.anIntArrayArray78[7][0] = 1507;
			this.anIntArrayArray78[8][1] = 1108;
			this.anIntArrayArray78[8][3] = 2056;
			this.anIntArrayArray78[8][0] = 1736;
			this.anIntArrayArray78[8][2] = 1590;
			this.anIntArrayArray78[9][3] = 2666;
			this.anIntArrayArray78[9][0] = 2088;
			this.anIntArrayArray78[9][1] = 1766;
			this.anIntArrayArray78[9][2] = 2056;
			this.anIntArrayArray78[10][3] = 3276;
			this.anIntArrayArray78[10][0] = 2355;
			this.anIntArrayArray78[10][1] = 2409;
			this.anIntArrayArray78[10][2] = 2586;
			this.anIntArrayArray78[11][2] = 3148;
			this.anIntArrayArray78[11][3] = 3228;
			this.anIntArrayArray78[11][1] = 3116;
			this.anIntArrayArray78[11][0] = 2691;
			this.anIntArrayArray78[12][1] = 3806;
			this.anIntArrayArray78[12][3] = 3196;
			this.anIntArrayArray78[12][0] = 3031;
			this.anIntArrayArray78[12][2] = 3710;
			this.anIntArrayArray78[13][3] = 3019;
			this.anIntArrayArray78[13][2] = 3421;
			this.anIntArrayArray78[13][0] = 3522;
			this.anIntArrayArray78[13][1] = 3437;
			this.anIntArrayArray78[14][1] = 3116;
			this.anIntArrayArray78[14][2] = 3148;
			this.anIntArrayArray78[14][0] = 3727;
			this.anIntArrayArray78[14][3] = 3228;
			this.anIntArrayArray78[15][2] = 2505;
			this.anIntArrayArray78[15][1] = 2377;
			this.anIntArrayArray78[15][0] = 4096;
			this.anIntArrayArray78[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray78 = new int[4][4];
			this.anIntArrayArray78[0][2] = 4096;
			this.anIntArrayArray78[0][1] = 0;
			this.anIntArrayArray78[0][3] = 0;
			this.anIntArrayArray78[0][0] = 2048;
			this.anIntArrayArray78[1][2] = 4096;
			this.anIntArrayArray78[1][1] = 4096;
			this.anIntArrayArray78[1][3] = 0;
			this.anIntArrayArray78[1][0] = 2867;
			this.anIntArrayArray78[2][3] = 0;
			this.anIntArrayArray78[2][1] = 4096;
			this.anIntArrayArray78[2][2] = 4096;
			this.anIntArrayArray78[2][0] = 3276;
			this.anIntArrayArray78[3][0] = 4096;
			this.anIntArrayArray78[3][2] = 0;
			this.anIntArrayArray78[3][3] = 0;
			this.anIntArrayArray78[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
		if (this.anIntArrayArray78 == null) {
			this.method7972(1);
		}
		this.method7974();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(22) int local22 = arg0.method3642();
		if (local22 != 0) {
			this.method7972(local22);
			return;
		}
		this.anIntArrayArray78 = new int[arg0.method3642()][4];
		for (@Pc(36) int local36 = 0; local36 < this.anIntArrayArray78.length; local36++) {
			this.anIntArrayArray78[local36][0] = arg0.method3698();
			this.anIntArrayArray78[local36][1] = arg0.method3642() << 4;
			this.anIntArrayArray78[local36][2] = arg0.method3642() << 4;
			this.anIntArrayArray78[local36][3] = arg0.method3642() << 4;
		}
	}

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "(I)V")
	private void method7974() {
		@Pc(13) int local13 = this.anIntArrayArray78.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local13 > local30 && this.anIntArrayArray78[local30][0] <= local28; local30++) {
				local24++;
			}
			@Pc(79) int local79;
			@Pc(71) int local71;
			@Pc(75) int local75;
			@Pc(67) int[] local67;
			if (local13 <= local24) {
				local67 = this.anIntArrayArray78[local13 - 1];
				local71 = local67[2];
				local75 = local67[3];
				local79 = local67[1];
			} else {
				local67 = this.anIntArrayArray78[local24];
				if (local24 > 0) {
					@Pc(98) int[] local98 = this.anIntArrayArray78[local24 - 1];
					@Pc(115) int local115 = (local28 - local98[0] << 12) / (local67[0] - local98[0]);
					@Pc(119) int local119 = 4096 - local115;
					local71 = local98[2] * local119 + local67[2] * local115 >> 12;
					local75 = local115 * local67[3] + local119 * local98[3] >> 12;
					local79 = local115 * local67[1] + local119 * local98[1] >> 12;
				} else {
					local75 = local67[3];
					local71 = local67[2];
					local79 = local67[1];
				}
			}
			local75 >>= 0x4;
			local79 >>= 0x4;
			local71 >>= 0x4;
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 > 255) {
				local79 = 255;
			}
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
			this.anIntArray529[local20] = local75 | local79 << 16 | local71 << 8;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(29) int[] local29 = this.method8117(arg0, 0);
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[2];
			for (@Pc(43) int local43 = 0; local43 < Static421.anInt7443; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray529[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local19;
	}
}
