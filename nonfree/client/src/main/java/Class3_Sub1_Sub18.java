import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class3_Sub1_Sub18 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ki", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ki", name = "K", descriptor = "[I")
	private final int[] anIntArray382 = new int[257];

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V")
	private void method4432(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray37 = new int[2][4];
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[1][0] = 4096;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray37 = new int[8][4];
			this.anIntArrayArray37[0][2] = 2602;
			this.anIntArrayArray37[0][3] = 2361;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][1] = 2650;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[1][3] = 1558;
			this.anIntArrayArray37[1][2] = 1799;
			this.anIntArrayArray37[1][1] = 2313;
			this.anIntArrayArray37[2][2] = 1734;
			this.anIntArrayArray37[2][1] = 2618;
			this.anIntArrayArray37[2][0] = 3072;
			this.anIntArrayArray37[2][3] = 1413;
			this.anIntArrayArray37[3][1] = 2296;
			this.anIntArrayArray37[3][3] = 947;
			this.anIntArrayArray37[3][0] = 3276;
			this.anIntArrayArray37[3][2] = 1220;
			this.anIntArrayArray37[4][1] = 2072;
			this.anIntArrayArray37[4][2] = 963;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[4][3] = 722;
			this.anIntArrayArray37[5][3] = 1766;
			this.anIntArrayArray37[5][2] = 2152;
			this.anIntArrayArray37[5][0] = 3686;
			this.anIntArrayArray37[5][1] = 2730;
			this.anIntArrayArray37[6][1] = 2232;
			this.anIntArrayArray37[6][2] = 1060;
			this.anIntArrayArray37[6][3] = 915;
			this.anIntArrayArray37[6][0] = 3891;
			this.anIntArrayArray37[7][0] = 4096;
			this.anIntArrayArray37[7][3] = 1140;
			this.anIntArrayArray37[7][2] = 1413;
			this.anIntArrayArray37[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray37 = new int[7][4];
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][3] = 4096;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[1][0] = 663;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[1][3] = 4096;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[2][0] = 1363;
			this.anIntArrayArray37[3][3] = 0;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[3][0] = 2048;
			this.anIntArrayArray37[3][2] = 4096;
			this.anIntArrayArray37[4][3] = 0;
			this.anIntArrayArray37[4][0] = 2727;
			this.anIntArrayArray37[4][2] = 0;
			this.anIntArrayArray37[4][1] = 4096;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[5][3] = 4096;
			this.anIntArrayArray37[5][2] = 0;
			this.anIntArrayArray37[5][0] = 3411;
			this.anIntArrayArray37[6][3] = 4096;
			this.anIntArrayArray37[6][2] = 0;
			this.anIntArrayArray37[6][0] = 4096;
			this.anIntArrayArray37[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray37 = new int[6][4];
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][3] = 1493;
			this.anIntArrayArray37[1][0] = 1843;
			this.anIntArrayArray37[1][2] = 0;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[2][3] = 2939;
			this.anIntArrayArray37[2][2] = 0;
			this.anIntArrayArray37[2][0] = 2457;
			this.anIntArrayArray37[3][2] = 1124;
			this.anIntArrayArray37[3][0] = 2781;
			this.anIntArrayArray37[3][3] = 3565;
			this.anIntArrayArray37[3][1] = 0;
			this.anIntArrayArray37[4][3] = 4031;
			this.anIntArrayArray37[4][1] = 546;
			this.anIntArrayArray37[4][2] = 3084;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[5][2] = 4096;
			this.anIntArrayArray37[5][0] = 4096;
			this.anIntArrayArray37[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray37 = new int[16][4];
			this.anIntArrayArray37[0][2] = 192;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][1] = 80;
			this.anIntArrayArray37[0][3] = 321;
			this.anIntArrayArray37[1][3] = 562;
			this.anIntArrayArray37[1][1] = 321;
			this.anIntArrayArray37[1][2] = 449;
			this.anIntArrayArray37[1][0] = 155;
			this.anIntArrayArray37[2][0] = 389;
			this.anIntArrayArray37[2][2] = 690;
			this.anIntArrayArray37[2][1] = 578;
			this.anIntArrayArray37[2][3] = 803;
			this.anIntArrayArray37[3][0] = 671;
			this.anIntArrayArray37[3][2] = 995;
			this.anIntArrayArray37[3][1] = 947;
			this.anIntArrayArray37[3][3] = 1140;
			this.anIntArrayArray37[4][0] = 897;
			this.anIntArrayArray37[4][3] = 1509;
			this.anIntArrayArray37[4][1] = 1285;
			this.anIntArrayArray37[4][2] = 1397;
			this.anIntArrayArray37[5][3] = 1413;
			this.anIntArrayArray37[5][0] = 1175;
			this.anIntArrayArray37[5][1] = 1525;
			this.anIntArrayArray37[5][2] = 1429;
			this.anIntArrayArray37[6][1] = 1734;
			this.anIntArrayArray37[6][2] = 1461;
			this.anIntArrayArray37[6][0] = 1368;
			this.anIntArrayArray37[6][3] = 1333;
			this.anIntArrayArray37[7][0] = 1507;
			this.anIntArrayArray37[7][3] = 1702;
			this.anIntArrayArray37[7][2] = 1525;
			this.anIntArrayArray37[7][1] = 1413;
			this.anIntArrayArray37[8][2] = 1590;
			this.anIntArrayArray37[8][1] = 1108;
			this.anIntArrayArray37[8][0] = 1736;
			this.anIntArrayArray37[8][3] = 2056;
			this.anIntArrayArray37[9][0] = 2088;
			this.anIntArrayArray37[9][2] = 2056;
			this.anIntArrayArray37[9][1] = 1766;
			this.anIntArrayArray37[9][3] = 2666;
			this.anIntArrayArray37[10][1] = 2409;
			this.anIntArrayArray37[10][2] = 2586;
			this.anIntArrayArray37[10][0] = 2355;
			this.anIntArrayArray37[10][3] = 3276;
			this.anIntArrayArray37[11][2] = 3148;
			this.anIntArrayArray37[11][1] = 3116;
			this.anIntArrayArray37[11][3] = 3228;
			this.anIntArrayArray37[11][0] = 2691;
			this.anIntArrayArray37[12][0] = 3031;
			this.anIntArrayArray37[12][3] = 3196;
			this.anIntArrayArray37[12][1] = 3806;
			this.anIntArrayArray37[12][2] = 3710;
			this.anIntArrayArray37[13][1] = 3437;
			this.anIntArrayArray37[13][3] = 3019;
			this.anIntArrayArray37[13][2] = 3421;
			this.anIntArrayArray37[13][0] = 3522;
			this.anIntArrayArray37[14][0] = 3727;
			this.anIntArrayArray37[14][1] = 3116;
			this.anIntArrayArray37[14][3] = 3228;
			this.anIntArrayArray37[14][2] = 3148;
			this.anIntArrayArray37[15][0] = 4096;
			this.anIntArrayArray37[15][3] = 2746;
			this.anIntArrayArray37[15][1] = 2377;
			this.anIntArrayArray37[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray37 = new int[4][4];
			this.anIntArrayArray37[0][0] = 2048;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[0][2] = 4096;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[1][3] = 0;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[2][1] = 4096;
			this.anIntArrayArray37[2][0] = 3276;
			this.anIntArrayArray37[3][3] = 0;
			this.anIntArrayArray37[3][0] = 4096;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(28) int[] local28 = this.method7765(0, arg0);
			@Pc(32) int[] local32 = local11[0];
			@Pc(36) int[] local36 = local11[1];
			@Pc(40) int[] local40 = local11[2];
			for (@Pc(42) int local42 = 0; local42 < Static206.anInt4182; local42++) {
				@Pc(50) int local50 = local28[local42] >> 4;
				if (local50 < 0) {
					local50 = 0;
				}
				if (local50 > 256) {
					local50 = 256;
				}
				local50 = this.anIntArray382[local50];
				local32[local42] = local50 >> 12 & 0xFF0;
				local36[local42] = local50 >> 4 & 0xFF0;
				local40[local42] = (local50 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(7) int local7 = arg0.method3118();
		if (local7 != 0) {
			this.method4432(local7);
			return;
		}
		this.anIntArrayArray37 = new int[arg0.method3118()][4];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray37.length; local27++) {
			this.anIntArrayArray37[local27][0] = arg0.method3109();
			this.anIntArrayArray37[local27][1] = arg0.method3118() << 4;
			this.anIntArrayArray37[local27][2] = arg0.method3118() << 4;
			this.anIntArrayArray37[local27][3] = arg0.method3118() << 4;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
		if (this.anIntArrayArray37 == null) {
			this.method4432(1);
		}
		this.method4437();
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
	private void method4437() {
		@Pc(17) int local17 = this.anIntArrayArray37.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < 257; local21++) {
			@Pc(25) int local25 = 0;
			@Pc(29) int local29 = local21 << 4;
			for (@Pc(31) int local31 = 0; local17 > local31 && this.anIntArrayArray37[local31][0] <= local29; local31++) {
				local25++;
			}
			@Pc(111) int local111;
			@Pc(139) int local139;
			@Pc(125) int local125;
			@Pc(62) int[] local62;
			if (local25 < local17) {
				local62 = this.anIntArrayArray37[local25];
				if (local25 > 0) {
					@Pc(74) int[] local74 = this.anIntArrayArray37[local25 - 1];
					@Pc(92) int local92 = (local29 - local74[0] << 12) / (local62[0] - local74[0]);
					@Pc(97) int local97 = 4096 - local92;
					local111 = local92 * local62[1] + local74[1] * local97 >> 12;
					local125 = local92 * local62[3] + local97 * local74[3] >> 12;
					local139 = local97 * local74[2] + local92 * local62[2] >> 12;
				} else {
					local125 = local62[3];
					local139 = local62[2];
					local111 = local62[1];
				}
			} else {
				local62 = this.anIntArrayArray37[local17 - 1];
				local125 = local62[3];
				local111 = local62[1];
				local139 = local62[2];
			}
			local111 >>= 0x4;
			local139 >>= 0x4;
			local125 >>= 0x4;
			if (local139 < 0) {
				local139 = 0;
			} else if (local139 > 255) {
				local139 = 255;
			}
			if (local125 < 0) {
				local125 = 0;
			} else if (local125 > 255) {
				local125 = 255;
			}
			if (local111 < 0) {
				local111 = 0;
			} else if (local111 > 255) {
				local111 = 255;
			}
			this.anIntArray382[local21] = local125 | local139 << 8 | local111 << 16;
		}
	}
}
