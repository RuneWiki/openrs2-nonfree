import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!hp", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!hp", name = "Q", descriptor = "[I")
	private final int[] anIntArray286 = new int[257];

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
		if (this.anIntArrayArray24 == null) {
			this.method2246(1);
		}
		this.method2247();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)V")
	private void method2246(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray24 = new int[2][4];
			this.anIntArrayArray24[0][1] = 0;
			this.anIntArrayArray24[0][3] = 0;
			this.anIntArrayArray24[0][2] = 0;
			this.anIntArrayArray24[0][0] = 0;
			this.anIntArrayArray24[1][2] = 4096;
			this.anIntArrayArray24[1][3] = 4096;
			this.anIntArrayArray24[1][1] = 4096;
			this.anIntArrayArray24[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray24 = new int[8][4];
			this.anIntArrayArray24[0][1] = 2650;
			this.anIntArrayArray24[0][0] = 0;
			this.anIntArrayArray24[0][3] = 2361;
			this.anIntArrayArray24[0][2] = 2602;
			this.anIntArrayArray24[1][3] = 1558;
			this.anIntArrayArray24[1][1] = 2313;
			this.anIntArrayArray24[1][0] = 2867;
			this.anIntArrayArray24[1][2] = 1799;
			this.anIntArrayArray24[2][0] = 3072;
			this.anIntArrayArray24[2][2] = 1734;
			this.anIntArrayArray24[2][1] = 2618;
			this.anIntArrayArray24[2][3] = 1413;
			this.anIntArrayArray24[3][1] = 2296;
			this.anIntArrayArray24[3][3] = 947;
			this.anIntArrayArray24[3][2] = 1220;
			this.anIntArrayArray24[3][0] = 3276;
			this.anIntArrayArray24[4][3] = 722;
			this.anIntArrayArray24[4][0] = 3481;
			this.anIntArrayArray24[4][2] = 963;
			this.anIntArrayArray24[4][1] = 2072;
			this.anIntArrayArray24[5][2] = 2152;
			this.anIntArrayArray24[5][1] = 2730;
			this.anIntArrayArray24[5][0] = 3686;
			this.anIntArrayArray24[5][3] = 1766;
			this.anIntArrayArray24[6][1] = 2232;
			this.anIntArrayArray24[6][0] = 3891;
			this.anIntArrayArray24[6][3] = 915;
			this.anIntArrayArray24[6][2] = 1060;
			this.anIntArrayArray24[7][1] = 1686;
			this.anIntArrayArray24[7][3] = 1140;
			this.anIntArrayArray24[7][2] = 1413;
			this.anIntArrayArray24[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray24 = new int[7][4];
			this.anIntArrayArray24[0][2] = 0;
			this.anIntArrayArray24[0][1] = 0;
			this.anIntArrayArray24[0][3] = 4096;
			this.anIntArrayArray24[0][0] = 0;
			this.anIntArrayArray24[1][2] = 4096;
			this.anIntArrayArray24[1][0] = 663;
			this.anIntArrayArray24[1][1] = 0;
			this.anIntArrayArray24[1][3] = 4096;
			this.anIntArrayArray24[2][0] = 1363;
			this.anIntArrayArray24[2][3] = 0;
			this.anIntArrayArray24[2][2] = 4096;
			this.anIntArrayArray24[2][1] = 0;
			this.anIntArrayArray24[3][0] = 2048;
			this.anIntArrayArray24[3][2] = 4096;
			this.anIntArrayArray24[3][1] = 4096;
			this.anIntArrayArray24[3][3] = 0;
			this.anIntArrayArray24[4][1] = 4096;
			this.anIntArrayArray24[4][3] = 0;
			this.anIntArrayArray24[4][2] = 0;
			this.anIntArrayArray24[4][0] = 2727;
			this.anIntArrayArray24[5][2] = 0;
			this.anIntArrayArray24[5][3] = 4096;
			this.anIntArrayArray24[5][0] = 3411;
			this.anIntArrayArray24[5][1] = 4096;
			this.anIntArrayArray24[6][1] = 0;
			this.anIntArrayArray24[6][2] = 0;
			this.anIntArrayArray24[6][3] = 4096;
			this.anIntArrayArray24[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray24 = new int[6][4];
			this.anIntArrayArray24[0][2] = 0;
			this.anIntArrayArray24[0][3] = 0;
			this.anIntArrayArray24[0][1] = 0;
			this.anIntArrayArray24[0][0] = 0;
			this.anIntArrayArray24[1][1] = 0;
			this.anIntArrayArray24[1][3] = 1493;
			this.anIntArrayArray24[1][0] = 1843;
			this.anIntArrayArray24[1][2] = 0;
			this.anIntArrayArray24[2][0] = 2457;
			this.anIntArrayArray24[2][2] = 0;
			this.anIntArrayArray24[2][1] = 0;
			this.anIntArrayArray24[2][3] = 2939;
			this.anIntArrayArray24[3][0] = 2781;
			this.anIntArrayArray24[3][2] = 1124;
			this.anIntArrayArray24[3][1] = 0;
			this.anIntArrayArray24[3][3] = 3565;
			this.anIntArrayArray24[4][0] = 3481;
			this.anIntArrayArray24[4][1] = 546;
			this.anIntArrayArray24[4][3] = 4031;
			this.anIntArrayArray24[4][2] = 3084;
			this.anIntArrayArray24[5][0] = 4096;
			this.anIntArrayArray24[5][2] = 4096;
			this.anIntArrayArray24[5][1] = 4096;
			this.anIntArrayArray24[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray24 = new int[16][4];
			this.anIntArrayArray24[0][1] = 80;
			this.anIntArrayArray24[0][2] = 192;
			this.anIntArrayArray24[0][0] = 0;
			this.anIntArrayArray24[0][3] = 321;
			this.anIntArrayArray24[1][3] = 562;
			this.anIntArrayArray24[1][2] = 449;
			this.anIntArrayArray24[1][0] = 155;
			this.anIntArrayArray24[1][1] = 321;
			this.anIntArrayArray24[2][0] = 389;
			this.anIntArrayArray24[2][2] = 690;
			this.anIntArrayArray24[2][1] = 578;
			this.anIntArrayArray24[2][3] = 803;
			this.anIntArrayArray24[3][1] = 947;
			this.anIntArrayArray24[3][2] = 995;
			this.anIntArrayArray24[3][0] = 671;
			this.anIntArrayArray24[3][3] = 1140;
			this.anIntArrayArray24[4][3] = 1509;
			this.anIntArrayArray24[4][0] = 897;
			this.anIntArrayArray24[4][2] = 1397;
			this.anIntArrayArray24[4][1] = 1285;
			this.anIntArrayArray24[5][0] = 1175;
			this.anIntArrayArray24[5][1] = 1525;
			this.anIntArrayArray24[5][2] = 1429;
			this.anIntArrayArray24[5][3] = 1413;
			this.anIntArrayArray24[6][1] = 1734;
			this.anIntArrayArray24[6][2] = 1461;
			this.anIntArrayArray24[6][0] = 1368;
			this.anIntArrayArray24[6][3] = 1333;
			this.anIntArrayArray24[7][0] = 1507;
			this.anIntArrayArray24[7][2] = 1525;
			this.anIntArrayArray24[7][3] = 1702;
			this.anIntArrayArray24[7][1] = 1413;
			this.anIntArrayArray24[8][3] = 2056;
			this.anIntArrayArray24[8][0] = 1736;
			this.anIntArrayArray24[8][2] = 1590;
			this.anIntArrayArray24[8][1] = 1108;
			this.anIntArrayArray24[9][1] = 1766;
			this.anIntArrayArray24[9][2] = 2056;
			this.anIntArrayArray24[9][0] = 2088;
			this.anIntArrayArray24[9][3] = 2666;
			this.anIntArrayArray24[10][1] = 2409;
			this.anIntArrayArray24[10][2] = 2586;
			this.anIntArrayArray24[10][0] = 2355;
			this.anIntArrayArray24[10][3] = 3276;
			this.anIntArrayArray24[11][1] = 3116;
			this.anIntArrayArray24[11][2] = 3148;
			this.anIntArrayArray24[11][3] = 3228;
			this.anIntArrayArray24[11][0] = 2691;
			this.anIntArrayArray24[12][1] = 3806;
			this.anIntArrayArray24[12][0] = 3031;
			this.anIntArrayArray24[12][2] = 3710;
			this.anIntArrayArray24[12][3] = 3196;
			this.anIntArrayArray24[13][3] = 3019;
			this.anIntArrayArray24[13][2] = 3421;
			this.anIntArrayArray24[13][1] = 3437;
			this.anIntArrayArray24[13][0] = 3522;
			this.anIntArrayArray24[14][3] = 3228;
			this.anIntArrayArray24[14][1] = 3116;
			this.anIntArrayArray24[14][2] = 3148;
			this.anIntArrayArray24[14][0] = 3727;
			this.anIntArrayArray24[15][3] = 2746;
			this.anIntArrayArray24[15][1] = 2377;
			this.anIntArrayArray24[15][0] = 4096;
			this.anIntArrayArray24[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray24 = new int[4][4];
			this.anIntArrayArray24[0][2] = 4096;
			this.anIntArrayArray24[0][0] = 2048;
			this.anIntArrayArray24[0][1] = 0;
			this.anIntArrayArray24[0][3] = 0;
			this.anIntArrayArray24[1][2] = 4096;
			this.anIntArrayArray24[1][0] = 2867;
			this.anIntArrayArray24[1][3] = 0;
			this.anIntArrayArray24[1][1] = 4096;
			this.anIntArrayArray24[2][3] = 0;
			this.anIntArrayArray24[2][2] = 4096;
			this.anIntArrayArray24[2][1] = 4096;
			this.anIntArrayArray24[2][0] = 3276;
			this.anIntArrayArray24[3][1] = 4096;
			this.anIntArrayArray24[3][2] = 0;
			this.anIntArrayArray24[3][3] = 0;
			this.anIntArrayArray24[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(12) int local12 = arg0.method2739();
		if (local12 != 0) {
			this.method2246(local12);
			return;
		}
		this.anIntArrayArray24 = new int[arg0.method2739()][4];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray24.length; local29++) {
			this.anIntArrayArray24[local29][0] = arg0.method2767();
			this.anIntArrayArray24[local29][1] = arg0.method2739() << 4;
			this.anIntArrayArray24[local29][2] = arg0.method2739() << 4;
			this.anIntArrayArray24[local29][3] = arg0.method2739() << 4;
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V")
	private void method2247() {
		@Pc(13) int local13 = this.anIntArrayArray24.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local13 > local27 && local25 >= this.anIntArrayArray24[local27][0]; local27++) {
				local21++;
			}
			@Pc(64) int local64;
			@Pc(72) int local72;
			@Pc(68) int local68;
			@Pc(60) int[] local60;
			if (local13 <= local21) {
				local60 = this.anIntArrayArray24[local13 - 1];
				local64 = local60[1];
				local68 = local60[3];
				local72 = local60[2];
			} else {
				local60 = this.anIntArrayArray24[local21];
				if (local21 <= 0) {
					local68 = local60[3];
					local72 = local60[2];
					local64 = local60[1];
				} else {
					@Pc(105) int[] local105 = this.anIntArrayArray24[local21 - 1];
					@Pc(123) int local123 = (local25 - local105[0] << 12) / (local60[0] - local105[0]);
					@Pc(128) int local128 = 4096 - local123;
					local64 = local128 * local105[1] + local123 * local60[1] >> 12;
					local68 = local60[3] * local123 + local128 * local105[3] >> 12;
					local72 = local105[2] * local128 + local123 * local60[2] >> 12;
				}
			}
			local64 >>= 0x4;
			local68 >>= 0x4;
			local72 >>= 0x4;
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			if (local72 < 0) {
				local72 = 0;
			} else if (local72 > 255) {
				local72 = 255;
			}
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			this.anIntArray286[local17] = local68 | local72 << 8 | local64 << 16;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(26) int[] local26 = this.method5547(arg0, 0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static238.anInt4221; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray286[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}
}
