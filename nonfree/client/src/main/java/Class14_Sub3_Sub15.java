import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class14_Sub3_Sub15 extends Class14_Sub3 {

	@OriginalMember(owner = "client!hg", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!hg", name = "S", descriptor = "[I")
	private final int[] anIntArray231 = new int[257];

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(21) int[] local21 = this.method6004(0, arg0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static294.anInt5657; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray231[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
	private void method2478() {
		@Pc(15) int local15 = this.anIntArrayArray40.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local22 << 4;
			for (@Pc(32) int local32 = 0; local15 > local32 && local30 >= this.anIntArrayArray40[local32][0]; local32++) {
				local26++;
			}
			@Pc(69) int local69;
			@Pc(73) int local73;
			@Pc(77) int local77;
			@Pc(65) int[] local65;
			if (local26 >= local15) {
				local65 = this.anIntArrayArray40[local15 - 1];
				local69 = local65[1];
				local73 = local65[2];
				local77 = local65[3];
			} else {
				local65 = this.anIntArrayArray40[local26];
				if (local26 > 0) {
					@Pc(93) int[] local93 = this.anIntArrayArray40[local26 - 1];
					@Pc(111) int local111 = (local30 - local93[0] << 12) / (local65[0] - local93[0]);
					@Pc(116) int local116 = 4096 - local111;
					local77 = local93[3] * local116 + local65[3] * local111 >> 12;
					local69 = local65[1] * local111 + local93[1] * local116 >> 12;
					local73 = local65[2] * local111 + local116 * local93[2] >> 12;
				} else {
					local73 = local65[2];
					local69 = local65[1];
					local77 = local65[3];
				}
			}
			local73 >>= 0x4;
			local77 >>= 0x4;
			local69 >>= 0x4;
			if (local77 < 0) {
				local77 = 0;
			} else if (local77 > 255) {
				local77 = 255;
			}
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			if (local73 < 0) {
				local73 = 0;
			} else if (local73 > 255) {
				local73 = 255;
			}
			this.anIntArray231[local22] = local77 | local69 << 16 | local73 << 8;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(22) int local22 = arg0.method2548();
		if (local22 != 0) {
			this.method2479(local22);
			return;
		}
		this.anIntArrayArray40 = new int[arg0.method2548()][4];
		for (@Pc(40) int local40 = 0; local40 < this.anIntArrayArray40.length; local40++) {
			this.anIntArrayArray40[local40][0] = arg0.method2498();
			this.anIntArrayArray40[local40][1] = arg0.method2548() << 4;
			this.anIntArrayArray40[local40][2] = arg0.method2548() << 4;
			this.anIntArrayArray40[local40][3] = arg0.method2548() << 4;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	private void method2479(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray40 = new int[2][4];
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[0][1] = 0;
			this.anIntArrayArray40[0][3] = 0;
			this.anIntArrayArray40[0][2] = 0;
			this.anIntArrayArray40[1][2] = 4096;
			this.anIntArrayArray40[1][0] = 4096;
			this.anIntArrayArray40[1][1] = 4096;
			this.anIntArrayArray40[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray40 = new int[8][4];
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[0][2] = 2602;
			this.anIntArrayArray40[0][1] = 2650;
			this.anIntArrayArray40[0][3] = 2361;
			this.anIntArrayArray40[1][2] = 1799;
			this.anIntArrayArray40[1][1] = 2313;
			this.anIntArrayArray40[1][0] = 2867;
			this.anIntArrayArray40[1][3] = 1558;
			this.anIntArrayArray40[2][2] = 1734;
			this.anIntArrayArray40[2][3] = 1413;
			this.anIntArrayArray40[2][0] = 3072;
			this.anIntArrayArray40[2][1] = 2618;
			this.anIntArrayArray40[3][3] = 947;
			this.anIntArrayArray40[3][0] = 3276;
			this.anIntArrayArray40[3][1] = 2296;
			this.anIntArrayArray40[3][2] = 1220;
			this.anIntArrayArray40[4][3] = 722;
			this.anIntArrayArray40[4][0] = 3481;
			this.anIntArrayArray40[4][1] = 2072;
			this.anIntArrayArray40[4][2] = 963;
			this.anIntArrayArray40[5][0] = 3686;
			this.anIntArrayArray40[5][3] = 1766;
			this.anIntArrayArray40[5][2] = 2152;
			this.anIntArrayArray40[5][1] = 2730;
			this.anIntArrayArray40[6][2] = 1060;
			this.anIntArrayArray40[6][0] = 3891;
			this.anIntArrayArray40[6][3] = 915;
			this.anIntArrayArray40[6][1] = 2232;
			this.anIntArrayArray40[7][3] = 1140;
			this.anIntArrayArray40[7][0] = 4096;
			this.anIntArrayArray40[7][2] = 1413;
			this.anIntArrayArray40[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray40 = new int[7][4];
			this.anIntArrayArray40[0][1] = 0;
			this.anIntArrayArray40[0][2] = 0;
			this.anIntArrayArray40[0][3] = 4096;
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[1][2] = 4096;
			this.anIntArrayArray40[1][3] = 4096;
			this.anIntArrayArray40[1][1] = 0;
			this.anIntArrayArray40[1][0] = 663;
			this.anIntArrayArray40[2][0] = 1363;
			this.anIntArrayArray40[2][2] = 4096;
			this.anIntArrayArray40[2][1] = 0;
			this.anIntArrayArray40[2][3] = 0;
			this.anIntArrayArray40[3][3] = 0;
			this.anIntArrayArray40[3][0] = 2048;
			this.anIntArrayArray40[3][2] = 4096;
			this.anIntArrayArray40[3][1] = 4096;
			this.anIntArrayArray40[4][0] = 2727;
			this.anIntArrayArray40[4][2] = 0;
			this.anIntArrayArray40[4][1] = 4096;
			this.anIntArrayArray40[4][3] = 0;
			this.anIntArrayArray40[5][2] = 0;
			this.anIntArrayArray40[5][0] = 3411;
			this.anIntArrayArray40[5][1] = 4096;
			this.anIntArrayArray40[5][3] = 4096;
			this.anIntArrayArray40[6][3] = 4096;
			this.anIntArrayArray40[6][0] = 4096;
			this.anIntArrayArray40[6][1] = 0;
			this.anIntArrayArray40[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray40 = new int[6][4];
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[0][3] = 0;
			this.anIntArrayArray40[0][2] = 0;
			this.anIntArrayArray40[0][1] = 0;
			this.anIntArrayArray40[1][2] = 0;
			this.anIntArrayArray40[1][3] = 1493;
			this.anIntArrayArray40[1][1] = 0;
			this.anIntArrayArray40[1][0] = 1843;
			this.anIntArrayArray40[2][3] = 2939;
			this.anIntArrayArray40[2][1] = 0;
			this.anIntArrayArray40[2][0] = 2457;
			this.anIntArrayArray40[2][2] = 0;
			this.anIntArrayArray40[3][3] = 3565;
			this.anIntArrayArray40[3][1] = 0;
			this.anIntArrayArray40[3][2] = 1124;
			this.anIntArrayArray40[3][0] = 2781;
			this.anIntArrayArray40[4][1] = 546;
			this.anIntArrayArray40[4][2] = 3084;
			this.anIntArrayArray40[4][3] = 4031;
			this.anIntArrayArray40[4][0] = 3481;
			this.anIntArrayArray40[5][1] = 4096;
			this.anIntArrayArray40[5][3] = 4096;
			this.anIntArrayArray40[5][2] = 4096;
			this.anIntArrayArray40[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray40 = new int[16][4];
			this.anIntArrayArray40[0][1] = 80;
			this.anIntArrayArray40[0][3] = 321;
			this.anIntArrayArray40[0][2] = 192;
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[1][2] = 449;
			this.anIntArrayArray40[1][0] = 155;
			this.anIntArrayArray40[1][3] = 562;
			this.anIntArrayArray40[1][1] = 321;
			this.anIntArrayArray40[2][2] = 690;
			this.anIntArrayArray40[2][1] = 578;
			this.anIntArrayArray40[2][0] = 389;
			this.anIntArrayArray40[2][3] = 803;
			this.anIntArrayArray40[3][2] = 995;
			this.anIntArrayArray40[3][0] = 671;
			this.anIntArrayArray40[3][1] = 947;
			this.anIntArrayArray40[3][3] = 1140;
			this.anIntArrayArray40[4][1] = 1285;
			this.anIntArrayArray40[4][0] = 897;
			this.anIntArrayArray40[4][2] = 1397;
			this.anIntArrayArray40[4][3] = 1509;
			this.anIntArrayArray40[5][3] = 1413;
			this.anIntArrayArray40[5][0] = 1175;
			this.anIntArrayArray40[5][1] = 1525;
			this.anIntArrayArray40[5][2] = 1429;
			this.anIntArrayArray40[6][1] = 1734;
			this.anIntArrayArray40[6][2] = 1461;
			this.anIntArrayArray40[6][0] = 1368;
			this.anIntArrayArray40[6][3] = 1333;
			this.anIntArrayArray40[7][3] = 1702;
			this.anIntArrayArray40[7][0] = 1507;
			this.anIntArrayArray40[7][2] = 1525;
			this.anIntArrayArray40[7][1] = 1413;
			this.anIntArrayArray40[8][0] = 1736;
			this.anIntArrayArray40[8][2] = 1590;
			this.anIntArrayArray40[8][1] = 1108;
			this.anIntArrayArray40[8][3] = 2056;
			this.anIntArrayArray40[9][0] = 2088;
			this.anIntArrayArray40[9][3] = 2666;
			this.anIntArrayArray40[9][1] = 1766;
			this.anIntArrayArray40[9][2] = 2056;
			this.anIntArrayArray40[10][1] = 2409;
			this.anIntArrayArray40[10][3] = 3276;
			this.anIntArrayArray40[10][2] = 2586;
			this.anIntArrayArray40[10][0] = 2355;
			this.anIntArrayArray40[11][2] = 3148;
			this.anIntArrayArray40[11][3] = 3228;
			this.anIntArrayArray40[11][1] = 3116;
			this.anIntArrayArray40[11][0] = 2691;
			this.anIntArrayArray40[12][3] = 3196;
			this.anIntArrayArray40[12][1] = 3806;
			this.anIntArrayArray40[12][2] = 3710;
			this.anIntArrayArray40[12][0] = 3031;
			this.anIntArrayArray40[13][2] = 3421;
			this.anIntArrayArray40[13][3] = 3019;
			this.anIntArrayArray40[13][0] = 3522;
			this.anIntArrayArray40[13][1] = 3437;
			this.anIntArrayArray40[14][0] = 3727;
			this.anIntArrayArray40[14][3] = 3228;
			this.anIntArrayArray40[14][1] = 3116;
			this.anIntArrayArray40[14][2] = 3148;
			this.anIntArrayArray40[15][1] = 2377;
			this.anIntArrayArray40[15][3] = 2746;
			this.anIntArrayArray40[15][2] = 2505;
			this.anIntArrayArray40[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray40 = new int[4][4];
			this.anIntArrayArray40[0][0] = 2048;
			this.anIntArrayArray40[0][2] = 4096;
			this.anIntArrayArray40[0][1] = 0;
			this.anIntArrayArray40[0][3] = 0;
			this.anIntArrayArray40[1][0] = 2867;
			this.anIntArrayArray40[1][2] = 4096;
			this.anIntArrayArray40[1][1] = 4096;
			this.anIntArrayArray40[1][3] = 0;
			this.anIntArrayArray40[2][0] = 3276;
			this.anIntArrayArray40[2][1] = 4096;
			this.anIntArrayArray40[2][2] = 4096;
			this.anIntArrayArray40[2][3] = 0;
			this.anIntArrayArray40[3][1] = 4096;
			this.anIntArrayArray40[3][3] = 0;
			this.anIntArrayArray40[3][2] = 0;
			this.anIntArrayArray40[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
		if (this.anIntArrayArray40 == null) {
			this.method2479(1);
		}
		this.method2478();
	}
}
