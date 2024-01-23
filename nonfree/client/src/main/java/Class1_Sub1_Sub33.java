import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ri", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ri", name = "db", descriptor = "[I")
	private int[] anIntArray568 = new int[257];

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)V")
	private void method3688() {
		@Pc(17) int local17 = this.anIntArrayArray37.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < 257; local25++) {
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = local25 << 4;
			for (@Pc(38) int local38 = 0; local38 < local17 && local36 >= this.anIntArrayArray37[local38][0]; local38++) {
				local32++;
			}
			@Pc(69) int local69;
			@Pc(77) int local77;
			@Pc(73) int local73;
			@Pc(65) int[] local65;
			if (local32 >= local17) {
				local65 = this.anIntArrayArray37[local17 - 1];
				local69 = local65[1];
				local73 = local65[3];
				local77 = local65[2];
			} else {
				local65 = this.anIntArrayArray37[local32];
				if (local32 <= 0) {
					local77 = local65[2];
					local69 = local65[1];
					local73 = local65[3];
				} else {
					@Pc(109) int[] local109 = this.anIntArrayArray37[local32 - 1];
					@Pc(126) int local126 = (local36 - local109[0] << 12) / (local65[0] - local109[0]);
					@Pc(130) int local130 = 4096 - local126;
					local73 = local109[3] * local130 + local126 * local65[3] >> 12;
					local69 = local126 * local65[1] + local130 * local109[1] >> 12;
					local77 = local109[2] * local130 + local65[2] * local126 >> 12;
				}
			}
			local77 >>= 0x4;
			local73 >>= 0x4;
			if (local77 < 0) {
				local77 = 0;
			} else if (local77 > 255) {
				local77 = 255;
			}
			if (local73 < 0) {
				local73 = 0;
			} else if (local73 > 255) {
				local73 = 255;
			}
			local69 >>= 0x4;
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			this.anIntArray568[local25] = local73 | local77 << 8 | local69 << 16;
		}
	}

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
		if (this.anIntArrayArray37 == null) {
			this.method3692(1);
		}
		this.method3688();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(26) int[] local26 = this.method4450(0, arg0);
			@Pc(30) int[] local30 = local16[1];
			@Pc(34) int[] local34 = local16[2];
			@Pc(38) int[] local38 = local16[0];
			for (@Pc(40) int local40 = 0; local40 < Static131.anInt2513; local40++) {
				@Pc(49) int local49 = local26[local40] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray568[local49];
				local38[local40] = local49 >> 12 & 0xFF0;
				local30[local40] = local49 >> 4 & 0xFF0;
				local34[local40] = (local49 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(12) int local12 = arg0.method3122();
		if (local12 != 0) {
			this.method3692(local12);
			return;
		}
		this.anIntArrayArray37 = new int[arg0.method3122()][4];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray37.length; local32++) {
			this.anIntArrayArray37[local32][0] = arg0.method3107();
			this.anIntArrayArray37[local32][1] = arg0.method3122() << 4;
			this.anIntArrayArray37[local32][2] = arg0.method3122() << 4;
			this.anIntArrayArray37[local32][3] = arg0.method3122() << 4;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V")
	private void method3692(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray37 = new int[2][4];
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[1][0] = 4096;
			this.anIntArrayArray37[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray37 = new int[8][4];
			this.anIntArrayArray37[0][1] = 2650;
			this.anIntArrayArray37[1][1] = 2313;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[0][3] = 2361;
			this.anIntArrayArray37[2][0] = 3072;
			this.anIntArrayArray37[2][1] = 2618;
			this.anIntArrayArray37[3][0] = 3276;
			this.anIntArrayArray37[1][3] = 1558;
			this.anIntArrayArray37[2][3] = 1413;
			this.anIntArrayArray37[3][3] = 947;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[0][2] = 2602;
			this.anIntArrayArray37[4][3] = 722;
			this.anIntArrayArray37[5][0] = 3686;
			this.anIntArrayArray37[3][1] = 2296;
			this.anIntArrayArray37[5][3] = 1766;
			this.anIntArrayArray37[6][3] = 915;
			this.anIntArrayArray37[4][1] = 2072;
			this.anIntArrayArray37[6][0] = 3891;
			this.anIntArrayArray37[7][3] = 1140;
			this.anIntArrayArray37[1][2] = 1799;
			this.anIntArrayArray37[2][2] = 1734;
			this.anIntArrayArray37[3][2] = 1220;
			this.anIntArrayArray37[7][0] = 4096;
			this.anIntArrayArray37[4][2] = 963;
			this.anIntArrayArray37[5][2] = 2152;
			this.anIntArrayArray37[6][2] = 1060;
			this.anIntArrayArray37[5][1] = 2730;
			this.anIntArrayArray37[6][1] = 2232;
			this.anIntArrayArray37[7][2] = 1413;
			this.anIntArrayArray37[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray37 = new int[7][4];
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[0][3] = 4096;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[1][3] = 4096;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[3][2] = 4096;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[3][3] = 0;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[4][1] = 4096;
			this.anIntArrayArray37[1][0] = 663;
			this.anIntArrayArray37[4][3] = 0;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[2][0] = 1363;
			this.anIntArrayArray37[5][3] = 4096;
			this.anIntArrayArray37[6][1] = 0;
			this.anIntArrayArray37[4][2] = 0;
			this.anIntArrayArray37[5][2] = 0;
			this.anIntArrayArray37[3][0] = 2048;
			this.anIntArrayArray37[6][3] = 4096;
			this.anIntArrayArray37[4][0] = 2727;
			this.anIntArrayArray37[5][0] = 3411;
			this.anIntArrayArray37[6][0] = 4096;
			this.anIntArrayArray37[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray37 = new int[6][4];
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[1][2] = 0;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][0] = 1843;
			this.anIntArrayArray37[1][3] = 1493;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[2][2] = 0;
			this.anIntArrayArray37[3][2] = 1124;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[3][1] = 0;
			this.anIntArrayArray37[2][0] = 2457;
			this.anIntArrayArray37[3][0] = 2781;
			this.anIntArrayArray37[2][3] = 2939;
			this.anIntArrayArray37[4][2] = 3084;
			this.anIntArrayArray37[4][1] = 546;
			this.anIntArrayArray37[5][2] = 4096;
			this.anIntArrayArray37[3][3] = 3565;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[4][3] = 4031;
			this.anIntArrayArray37[5][3] = 4096;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray37 = new int[16][4];
			this.anIntArrayArray37[0][1] = 80;
			this.anIntArrayArray37[0][3] = 321;
			this.anIntArrayArray37[1][3] = 562;
			this.anIntArrayArray37[1][1] = 321;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[2][1] = 578;
			this.anIntArrayArray37[1][0] = 155;
			this.anIntArrayArray37[0][2] = 192;
			this.anIntArrayArray37[1][2] = 449;
			this.anIntArrayArray37[3][1] = 947;
			this.anIntArrayArray37[4][1] = 1285;
			this.anIntArrayArray37[2][3] = 803;
			this.anIntArrayArray37[2][0] = 389;
			this.anIntArrayArray37[3][3] = 1140;
			this.anIntArrayArray37[3][0] = 671;
			this.anIntArrayArray37[4][3] = 1509;
			this.anIntArrayArray37[2][2] = 690;
			this.anIntArrayArray37[3][2] = 995;
			this.anIntArrayArray37[5][3] = 1413;
			this.anIntArrayArray37[4][0] = 897;
			this.anIntArrayArray37[4][2] = 1397;
			this.anIntArrayArray37[5][1] = 1525;
			this.anIntArrayArray37[6][1] = 1734;
			this.anIntArrayArray37[5][0] = 1175;
			this.anIntArrayArray37[6][3] = 1333;
			this.anIntArrayArray37[7][1] = 1413;
			this.anIntArrayArray37[5][2] = 1429;
			this.anIntArrayArray37[6][0] = 1368;
			this.anIntArrayArray37[8][1] = 1108;
			this.anIntArrayArray37[9][1] = 1766;
			this.anIntArrayArray37[7][0] = 1507;
			this.anIntArrayArray37[10][1] = 2409;
			this.anIntArrayArray37[6][2] = 1461;
			this.anIntArrayArray37[11][1] = 3116;
			this.anIntArrayArray37[7][3] = 1702;
			this.anIntArrayArray37[8][0] = 1736;
			this.anIntArrayArray37[8][3] = 2056;
			this.anIntArrayArray37[9][0] = 2088;
			this.anIntArrayArray37[9][3] = 2666;
			this.anIntArrayArray37[12][1] = 3806;
			this.anIntArrayArray37[7][2] = 1525;
			this.anIntArrayArray37[10][0] = 2355;
			this.anIntArrayArray37[10][3] = 3276;
			this.anIntArrayArray37[13][1] = 3437;
			this.anIntArrayArray37[11][0] = 2691;
			this.anIntArrayArray37[12][0] = 3031;
			this.anIntArrayArray37[8][2] = 1590;
			this.anIntArrayArray37[11][3] = 3228;
			this.anIntArrayArray37[14][1] = 3116;
			this.anIntArrayArray37[12][3] = 3196;
			this.anIntArrayArray37[15][1] = 2377;
			this.anIntArrayArray37[13][3] = 3019;
			this.anIntArrayArray37[13][0] = 3522;
			this.anIntArrayArray37[9][2] = 2056;
			this.anIntArrayArray37[14][0] = 3727;
			this.anIntArrayArray37[14][3] = 3228;
			this.anIntArrayArray37[15][3] = 2746;
			this.anIntArrayArray37[10][2] = 2586;
			this.anIntArrayArray37[11][2] = 3148;
			this.anIntArrayArray37[15][0] = 4096;
			this.anIntArrayArray37[12][2] = 3710;
			this.anIntArrayArray37[13][2] = 3421;
			this.anIntArrayArray37[14][2] = 3148;
			this.anIntArrayArray37[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray37 = new int[4][4];
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[0][0] = 2048;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][2] = 4096;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[2][0] = 3276;
			this.anIntArrayArray37[1][3] = 0;
			this.anIntArrayArray37[3][0] = 4096;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[3][2] = 0;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[3][3] = 0;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[2][1] = 4096;
			this.anIntArrayArray37[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
