import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class4_Sub4_Sub13 extends Class4_Sub4 {

	@OriginalMember(owner = "client!je", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!je", name = "L", descriptor = "[I")
	private final int[] anIntArray283 = new int[257];

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
	private void method2775() {
		@Pc(13) int local13 = this.anIntArrayArray34.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local27 < local13 && this.anIntArrayArray34[local27][0] <= local25; local27++) {
				local21++;
			}
			@Pc(72) int local72;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(60) int[] local60;
			if (local21 >= local13) {
				local60 = this.anIntArrayArray34[local13 - 1];
				local64 = local60[2];
				local68 = local60[3];
				local72 = local60[1];
			} else {
				local60 = this.anIntArrayArray34[local21];
				if (local21 > 0) {
					@Pc(88) int[] local88 = this.anIntArrayArray34[local21 - 1];
					@Pc(106) int local106 = (local25 - local88[0] << 12) / (local60[0] - local88[0]);
					@Pc(111) int local111 = 4096 - local106;
					local68 = local106 * local60[3] + local88[3] * local111 >> 12;
					local72 = local88[1] * local111 + local106 * local60[1] >> 12;
					local64 = local111 * local88[2] + local60[2] * local106 >> 12;
				} else {
					local68 = local60[3];
					local72 = local60[1];
					local64 = local60[2];
				}
			}
			local68 >>= 0x4;
			local64 >>= 0x4;
			local72 >>= 0x4;
			if (local72 < 0) {
				local72 = 0;
			} else if (local72 > 255) {
				local72 = 255;
			}
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			this.anIntArray283[local17] = local68 | local72 << 16 | local64 << 8;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
		if (this.anIntArrayArray34 == null) {
			this.method2777(1);
		}
		this.method2775();
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(II)V")
	private void method2777(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray34 = new int[2][4];
			this.anIntArrayArray34[0][0] = 0;
			this.anIntArrayArray34[0][3] = 0;
			this.anIntArrayArray34[0][1] = 0;
			this.anIntArrayArray34[0][2] = 0;
			this.anIntArrayArray34[1][2] = 4096;
			this.anIntArrayArray34[1][0] = 4096;
			this.anIntArrayArray34[1][3] = 4096;
			this.anIntArrayArray34[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray34 = new int[8][4];
			this.anIntArrayArray34[0][3] = 2361;
			this.anIntArrayArray34[0][0] = 0;
			this.anIntArrayArray34[0][2] = 2602;
			this.anIntArrayArray34[0][1] = 2650;
			this.anIntArrayArray34[1][0] = 2867;
			this.anIntArrayArray34[1][2] = 1799;
			this.anIntArrayArray34[1][3] = 1558;
			this.anIntArrayArray34[1][1] = 2313;
			this.anIntArrayArray34[2][1] = 2618;
			this.anIntArrayArray34[2][0] = 3072;
			this.anIntArrayArray34[2][2] = 1734;
			this.anIntArrayArray34[2][3] = 1413;
			this.anIntArrayArray34[3][3] = 947;
			this.anIntArrayArray34[3][1] = 2296;
			this.anIntArrayArray34[3][0] = 3276;
			this.anIntArrayArray34[3][2] = 1220;
			this.anIntArrayArray34[4][3] = 722;
			this.anIntArrayArray34[4][0] = 3481;
			this.anIntArrayArray34[4][1] = 2072;
			this.anIntArrayArray34[4][2] = 963;
			this.anIntArrayArray34[5][3] = 1766;
			this.anIntArrayArray34[5][1] = 2730;
			this.anIntArrayArray34[5][0] = 3686;
			this.anIntArrayArray34[5][2] = 2152;
			this.anIntArrayArray34[6][1] = 2232;
			this.anIntArrayArray34[6][3] = 915;
			this.anIntArrayArray34[6][0] = 3891;
			this.anIntArrayArray34[6][2] = 1060;
			this.anIntArrayArray34[7][3] = 1140;
			this.anIntArrayArray34[7][1] = 1686;
			this.anIntArrayArray34[7][2] = 1413;
			this.anIntArrayArray34[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray34 = new int[7][4];
			this.anIntArrayArray34[0][0] = 0;
			this.anIntArrayArray34[0][1] = 0;
			this.anIntArrayArray34[0][2] = 0;
			this.anIntArrayArray34[0][3] = 4096;
			this.anIntArrayArray34[1][0] = 663;
			this.anIntArrayArray34[1][2] = 4096;
			this.anIntArrayArray34[1][3] = 4096;
			this.anIntArrayArray34[1][1] = 0;
			this.anIntArrayArray34[2][0] = 1363;
			this.anIntArrayArray34[2][3] = 0;
			this.anIntArrayArray34[2][1] = 0;
			this.anIntArrayArray34[2][2] = 4096;
			this.anIntArrayArray34[3][0] = 2048;
			this.anIntArrayArray34[3][1] = 4096;
			this.anIntArrayArray34[3][2] = 4096;
			this.anIntArrayArray34[3][3] = 0;
			this.anIntArrayArray34[4][3] = 0;
			this.anIntArrayArray34[4][2] = 0;
			this.anIntArrayArray34[4][0] = 2727;
			this.anIntArrayArray34[4][1] = 4096;
			this.anIntArrayArray34[5][3] = 4096;
			this.anIntArrayArray34[5][2] = 0;
			this.anIntArrayArray34[5][0] = 3411;
			this.anIntArrayArray34[5][1] = 4096;
			this.anIntArrayArray34[6][0] = 4096;
			this.anIntArrayArray34[6][1] = 0;
			this.anIntArrayArray34[6][3] = 4096;
			this.anIntArrayArray34[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray34 = new int[6][4];
			this.anIntArrayArray34[0][3] = 0;
			this.anIntArrayArray34[0][2] = 0;
			this.anIntArrayArray34[0][1] = 0;
			this.anIntArrayArray34[0][0] = 0;
			this.anIntArrayArray34[1][2] = 0;
			this.anIntArrayArray34[1][0] = 1843;
			this.anIntArrayArray34[1][1] = 0;
			this.anIntArrayArray34[1][3] = 1493;
			this.anIntArrayArray34[2][2] = 0;
			this.anIntArrayArray34[2][3] = 2939;
			this.anIntArrayArray34[2][0] = 2457;
			this.anIntArrayArray34[2][1] = 0;
			this.anIntArrayArray34[3][2] = 1124;
			this.anIntArrayArray34[3][3] = 3565;
			this.anIntArrayArray34[3][0] = 2781;
			this.anIntArrayArray34[3][1] = 0;
			this.anIntArrayArray34[4][1] = 546;
			this.anIntArrayArray34[4][3] = 4031;
			this.anIntArrayArray34[4][2] = 3084;
			this.anIntArrayArray34[4][0] = 3481;
			this.anIntArrayArray34[5][1] = 4096;
			this.anIntArrayArray34[5][0] = 4096;
			this.anIntArrayArray34[5][3] = 4096;
			this.anIntArrayArray34[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray34 = new int[16][4];
			this.anIntArrayArray34[0][2] = 192;
			this.anIntArrayArray34[0][3] = 321;
			this.anIntArrayArray34[0][1] = 80;
			this.anIntArrayArray34[0][0] = 0;
			this.anIntArrayArray34[1][1] = 321;
			this.anIntArrayArray34[1][2] = 449;
			this.anIntArrayArray34[1][3] = 562;
			this.anIntArrayArray34[1][0] = 155;
			this.anIntArrayArray34[2][1] = 578;
			this.anIntArrayArray34[2][0] = 389;
			this.anIntArrayArray34[2][2] = 690;
			this.anIntArrayArray34[2][3] = 803;
			this.anIntArrayArray34[3][3] = 1140;
			this.anIntArrayArray34[3][2] = 995;
			this.anIntArrayArray34[3][1] = 947;
			this.anIntArrayArray34[3][0] = 671;
			this.anIntArrayArray34[4][2] = 1397;
			this.anIntArrayArray34[4][3] = 1509;
			this.anIntArrayArray34[4][1] = 1285;
			this.anIntArrayArray34[4][0] = 897;
			this.anIntArrayArray34[5][3] = 1413;
			this.anIntArrayArray34[5][1] = 1525;
			this.anIntArrayArray34[5][0] = 1175;
			this.anIntArrayArray34[5][2] = 1429;
			this.anIntArrayArray34[6][3] = 1333;
			this.anIntArrayArray34[6][2] = 1461;
			this.anIntArrayArray34[6][1] = 1734;
			this.anIntArrayArray34[6][0] = 1368;
			this.anIntArrayArray34[7][1] = 1413;
			this.anIntArrayArray34[7][3] = 1702;
			this.anIntArrayArray34[7][0] = 1507;
			this.anIntArrayArray34[7][2] = 1525;
			this.anIntArrayArray34[8][0] = 1736;
			this.anIntArrayArray34[8][1] = 1108;
			this.anIntArrayArray34[8][2] = 1590;
			this.anIntArrayArray34[8][3] = 2056;
			this.anIntArrayArray34[9][2] = 2056;
			this.anIntArrayArray34[9][3] = 2666;
			this.anIntArrayArray34[9][1] = 1766;
			this.anIntArrayArray34[9][0] = 2088;
			this.anIntArrayArray34[10][2] = 2586;
			this.anIntArrayArray34[10][1] = 2409;
			this.anIntArrayArray34[10][0] = 2355;
			this.anIntArrayArray34[10][3] = 3276;
			this.anIntArrayArray34[11][0] = 2691;
			this.anIntArrayArray34[11][1] = 3116;
			this.anIntArrayArray34[11][3] = 3228;
			this.anIntArrayArray34[11][2] = 3148;
			this.anIntArrayArray34[12][0] = 3031;
			this.anIntArrayArray34[12][1] = 3806;
			this.anIntArrayArray34[12][2] = 3710;
			this.anIntArrayArray34[12][3] = 3196;
			this.anIntArrayArray34[13][2] = 3421;
			this.anIntArrayArray34[13][3] = 3019;
			this.anIntArrayArray34[13][0] = 3522;
			this.anIntArrayArray34[13][1] = 3437;
			this.anIntArrayArray34[14][1] = 3116;
			this.anIntArrayArray34[14][3] = 3228;
			this.anIntArrayArray34[14][2] = 3148;
			this.anIntArrayArray34[14][0] = 3727;
			this.anIntArrayArray34[15][0] = 4096;
			this.anIntArrayArray34[15][3] = 2746;
			this.anIntArrayArray34[15][1] = 2377;
			this.anIntArrayArray34[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray34 = new int[4][4];
			this.anIntArrayArray34[0][0] = 2048;
			this.anIntArrayArray34[0][2] = 4096;
			this.anIntArrayArray34[0][1] = 0;
			this.anIntArrayArray34[0][3] = 0;
			this.anIntArrayArray34[1][0] = 2867;
			this.anIntArrayArray34[1][2] = 4096;
			this.anIntArrayArray34[1][1] = 4096;
			this.anIntArrayArray34[1][3] = 0;
			this.anIntArrayArray34[2][1] = 4096;
			this.anIntArrayArray34[2][3] = 0;
			this.anIntArrayArray34[2][2] = 4096;
			this.anIntArrayArray34[2][0] = 3276;
			this.anIntArrayArray34[3][3] = 0;
			this.anIntArrayArray34[3][0] = 4096;
			this.anIntArrayArray34[3][2] = 0;
			this.anIntArrayArray34[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(10) int local10 = arg1.method2380();
		if (local10 != 0) {
			this.method2777(local10);
			return;
		}
		this.anIntArrayArray34 = new int[arg1.method2380()][4];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray34.length; local27++) {
			this.anIntArrayArray34[local27][0] = arg1.method2404();
			this.anIntArrayArray34[local27][1] = arg1.method2380() << 4;
			this.anIntArrayArray34[local27][2] = arg1.method2380() << 4;
			this.anIntArrayArray34[local27][3] = arg1.method2380() << 4;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(28) int[] local28 = this.method5386(0, arg0);
			@Pc(32) int[] local32 = local18[0];
			@Pc(36) int[] local36 = local18[1];
			@Pc(40) int[] local40 = local18[2];
			for (@Pc(42) int local42 = 0; local42 < Static124.anInt3576; local42++) {
				@Pc(50) int local50 = local28[local42] >> 4;
				if (local50 < 0) {
					local50 = 0;
				}
				if (local50 > 256) {
					local50 = 256;
				}
				local50 = this.anIntArray283[local50];
				local32[local42] = local50 >> 12 & 0xFF0;
				local36[local42] = local50 >> 4 & 0xFF0;
				local40[local42] = (local50 & 0xFF) << 4;
			}
		}
		return local18;
	}
}
