import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class6_Sub1_Sub35 extends Class6_Sub1 {

	@OriginalMember(owner = "client!uv", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray79;

	@OriginalMember(owner = "client!uv", name = "Q", descriptor = "[I")
	private final int[] anIntArray803 = new int[257];

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(28) int[] local28 = this.method8165(0, arg0);
			@Pc(32) int[] local32 = local11[0];
			@Pc(36) int[] local36 = local11[1];
			@Pc(40) int[] local40 = local11[2];
			for (@Pc(42) int local42 = 0; local42 < Static289.anInt5549; local42++) {
				@Pc(50) int local50 = local28[local42] >> 4;
				if (local50 < 0) {
					local50 = 0;
				}
				if (local50 > 256) {
					local50 = 256;
				}
				local50 = this.anIntArray803[local50];
				local32[local42] = local50 >> 12 & 0xFF0;
				local36[local42] = local50 >> 4 & 0xFF0;
				local40[local42] = (local50 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)V")
	private void method7710(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray79 = new int[2][4];
			this.anIntArrayArray79[0][1] = 0;
			this.anIntArrayArray79[0][0] = 0;
			this.anIntArrayArray79[0][2] = 0;
			this.anIntArrayArray79[0][3] = 0;
			this.anIntArrayArray79[1][2] = 4096;
			this.anIntArrayArray79[1][3] = 4096;
			this.anIntArrayArray79[1][0] = 4096;
			this.anIntArrayArray79[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray79 = new int[8][4];
			this.anIntArrayArray79[0][1] = 2650;
			this.anIntArrayArray79[0][0] = 0;
			this.anIntArrayArray79[0][3] = 2361;
			this.anIntArrayArray79[0][2] = 2602;
			this.anIntArrayArray79[1][2] = 1799;
			this.anIntArrayArray79[1][1] = 2313;
			this.anIntArrayArray79[1][0] = 2867;
			this.anIntArrayArray79[1][3] = 1558;
			this.anIntArrayArray79[2][3] = 1413;
			this.anIntArrayArray79[2][2] = 1734;
			this.anIntArrayArray79[2][1] = 2618;
			this.anIntArrayArray79[2][0] = 3072;
			this.anIntArrayArray79[3][1] = 2296;
			this.anIntArrayArray79[3][0] = 3276;
			this.anIntArrayArray79[3][2] = 1220;
			this.anIntArrayArray79[3][3] = 947;
			this.anIntArrayArray79[4][1] = 2072;
			this.anIntArrayArray79[4][3] = 722;
			this.anIntArrayArray79[4][0] = 3481;
			this.anIntArrayArray79[4][2] = 963;
			this.anIntArrayArray79[5][2] = 2152;
			this.anIntArrayArray79[5][3] = 1766;
			this.anIntArrayArray79[5][0] = 3686;
			this.anIntArrayArray79[5][1] = 2730;
			this.anIntArrayArray79[6][0] = 3891;
			this.anIntArrayArray79[6][3] = 915;
			this.anIntArrayArray79[6][1] = 2232;
			this.anIntArrayArray79[6][2] = 1060;
			this.anIntArrayArray79[7][1] = 1686;
			this.anIntArrayArray79[7][0] = 4096;
			this.anIntArrayArray79[7][2] = 1413;
			this.anIntArrayArray79[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray79 = new int[7][4];
			this.anIntArrayArray79[0][1] = 0;
			this.anIntArrayArray79[0][3] = 4096;
			this.anIntArrayArray79[0][0] = 0;
			this.anIntArrayArray79[0][2] = 0;
			this.anIntArrayArray79[1][3] = 4096;
			this.anIntArrayArray79[1][2] = 4096;
			this.anIntArrayArray79[1][0] = 663;
			this.anIntArrayArray79[1][1] = 0;
			this.anIntArrayArray79[2][0] = 1363;
			this.anIntArrayArray79[2][1] = 0;
			this.anIntArrayArray79[2][3] = 0;
			this.anIntArrayArray79[2][2] = 4096;
			this.anIntArrayArray79[3][1] = 4096;
			this.anIntArrayArray79[3][3] = 0;
			this.anIntArrayArray79[3][0] = 2048;
			this.anIntArrayArray79[3][2] = 4096;
			this.anIntArrayArray79[4][1] = 4096;
			this.anIntArrayArray79[4][2] = 0;
			this.anIntArrayArray79[4][0] = 2727;
			this.anIntArrayArray79[4][3] = 0;
			this.anIntArrayArray79[5][2] = 0;
			this.anIntArrayArray79[5][3] = 4096;
			this.anIntArrayArray79[5][1] = 4096;
			this.anIntArrayArray79[5][0] = 3411;
			this.anIntArrayArray79[6][2] = 0;
			this.anIntArrayArray79[6][0] = 4096;
			this.anIntArrayArray79[6][3] = 4096;
			this.anIntArrayArray79[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray79 = new int[6][4];
			this.anIntArrayArray79[0][2] = 0;
			this.anIntArrayArray79[0][3] = 0;
			this.anIntArrayArray79[0][0] = 0;
			this.anIntArrayArray79[0][1] = 0;
			this.anIntArrayArray79[1][3] = 1493;
			this.anIntArrayArray79[1][0] = 1843;
			this.anIntArrayArray79[1][2] = 0;
			this.anIntArrayArray79[1][1] = 0;
			this.anIntArrayArray79[2][3] = 2939;
			this.anIntArrayArray79[2][0] = 2457;
			this.anIntArrayArray79[2][1] = 0;
			this.anIntArrayArray79[2][2] = 0;
			this.anIntArrayArray79[3][2] = 1124;
			this.anIntArrayArray79[3][0] = 2781;
			this.anIntArrayArray79[3][1] = 0;
			this.anIntArrayArray79[3][3] = 3565;
			this.anIntArrayArray79[4][0] = 3481;
			this.anIntArrayArray79[4][3] = 4031;
			this.anIntArrayArray79[4][1] = 546;
			this.anIntArrayArray79[4][2] = 3084;
			this.anIntArrayArray79[5][3] = 4096;
			this.anIntArrayArray79[5][2] = 4096;
			this.anIntArrayArray79[5][1] = 4096;
			this.anIntArrayArray79[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray79 = new int[16][4];
			this.anIntArrayArray79[0][3] = 321;
			this.anIntArrayArray79[0][0] = 0;
			this.anIntArrayArray79[0][1] = 80;
			this.anIntArrayArray79[0][2] = 192;
			this.anIntArrayArray79[1][1] = 321;
			this.anIntArrayArray79[1][0] = 155;
			this.anIntArrayArray79[1][2] = 449;
			this.anIntArrayArray79[1][3] = 562;
			this.anIntArrayArray79[2][2] = 690;
			this.anIntArrayArray79[2][1] = 578;
			this.anIntArrayArray79[2][0] = 389;
			this.anIntArrayArray79[2][3] = 803;
			this.anIntArrayArray79[3][3] = 1140;
			this.anIntArrayArray79[3][2] = 995;
			this.anIntArrayArray79[3][0] = 671;
			this.anIntArrayArray79[3][1] = 947;
			this.anIntArrayArray79[4][0] = 897;
			this.anIntArrayArray79[4][2] = 1397;
			this.anIntArrayArray79[4][1] = 1285;
			this.anIntArrayArray79[4][3] = 1509;
			this.anIntArrayArray79[5][3] = 1413;
			this.anIntArrayArray79[5][2] = 1429;
			this.anIntArrayArray79[5][1] = 1525;
			this.anIntArrayArray79[5][0] = 1175;
			this.anIntArrayArray79[6][2] = 1461;
			this.anIntArrayArray79[6][3] = 1333;
			this.anIntArrayArray79[6][1] = 1734;
			this.anIntArrayArray79[6][0] = 1368;
			this.anIntArrayArray79[7][0] = 1507;
			this.anIntArrayArray79[7][2] = 1525;
			this.anIntArrayArray79[7][3] = 1702;
			this.anIntArrayArray79[7][1] = 1413;
			this.anIntArrayArray79[8][0] = 1736;
			this.anIntArrayArray79[8][1] = 1108;
			this.anIntArrayArray79[8][2] = 1590;
			this.anIntArrayArray79[8][3] = 2056;
			this.anIntArrayArray79[9][2] = 2056;
			this.anIntArrayArray79[9][3] = 2666;
			this.anIntArrayArray79[9][0] = 2088;
			this.anIntArrayArray79[9][1] = 1766;
			this.anIntArrayArray79[10][0] = 2355;
			this.anIntArrayArray79[10][2] = 2586;
			this.anIntArrayArray79[10][1] = 2409;
			this.anIntArrayArray79[10][3] = 3276;
			this.anIntArrayArray79[11][0] = 2691;
			this.anIntArrayArray79[11][3] = 3228;
			this.anIntArrayArray79[11][2] = 3148;
			this.anIntArrayArray79[11][1] = 3116;
			this.anIntArrayArray79[12][2] = 3710;
			this.anIntArrayArray79[12][3] = 3196;
			this.anIntArrayArray79[12][1] = 3806;
			this.anIntArrayArray79[12][0] = 3031;
			this.anIntArrayArray79[13][2] = 3421;
			this.anIntArrayArray79[13][1] = 3437;
			this.anIntArrayArray79[13][3] = 3019;
			this.anIntArrayArray79[13][0] = 3522;
			this.anIntArrayArray79[14][3] = 3228;
			this.anIntArrayArray79[14][0] = 3727;
			this.anIntArrayArray79[14][1] = 3116;
			this.anIntArrayArray79[14][2] = 3148;
			this.anIntArrayArray79[15][3] = 2746;
			this.anIntArrayArray79[15][1] = 2377;
			this.anIntArrayArray79[15][0] = 4096;
			this.anIntArrayArray79[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray79 = new int[4][4];
			this.anIntArrayArray79[0][2] = 4096;
			this.anIntArrayArray79[0][3] = 0;
			this.anIntArrayArray79[0][0] = 2048;
			this.anIntArrayArray79[0][1] = 0;
			this.anIntArrayArray79[1][3] = 0;
			this.anIntArrayArray79[1][1] = 4096;
			this.anIntArrayArray79[1][2] = 4096;
			this.anIntArrayArray79[1][0] = 2867;
			this.anIntArrayArray79[2][2] = 4096;
			this.anIntArrayArray79[2][0] = 3276;
			this.anIntArrayArray79[2][3] = 0;
			this.anIntArrayArray79[2][1] = 4096;
			this.anIntArrayArray79[3][0] = 4096;
			this.anIntArrayArray79[3][1] = 4096;
			this.anIntArrayArray79[3][3] = 0;
			this.anIntArrayArray79[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(7) int local7 = arg1.method4966();
		if (local7 != 0) {
			this.method7710(local7);
			return;
		}
		this.anIntArrayArray79 = new int[arg1.method4966()][4];
		for (@Pc(18) int local18 = 0; local18 < this.anIntArrayArray79.length; local18++) {
			this.anIntArrayArray79[local18][0] = arg1.method4999();
			this.anIntArrayArray79[local18][1] = arg1.method4966() << 4;
			this.anIntArrayArray79[local18][2] = arg1.method4966() << 4;
			this.anIntArrayArray79[local18][3] = arg1.method4966() << 4;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	private void method7711() {
		@Pc(13) int local13 = this.anIntArrayArray79.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local30 < local13 && this.anIntArrayArray79[local30][0] <= local28; local30++) {
				local24++;
			}
			@Pc(75) int local75;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(63) int[] local63;
			if (local13 <= local24) {
				local63 = this.anIntArrayArray79[local13 - 1];
				local67 = local63[2];
				local71 = local63[3];
				local75 = local63[1];
			} else {
				local63 = this.anIntArrayArray79[local24];
				if (local24 <= 0) {
					local67 = local63[2];
					local71 = local63[3];
					local75 = local63[1];
				} else {
					@Pc(105) int[] local105 = this.anIntArrayArray79[local24 - 1];
					@Pc(123) int local123 = (local28 - local105[0] << 12) / (local63[0] - local105[0]);
					@Pc(127) int local127 = 4096 - local123;
					local67 = local105[2] * local127 + local63[2] * local123 >> 12;
					local75 = local63[1] * local123 + local127 * local105[1] >> 12;
					local71 = local123 * local63[3] + local127 * local105[3] >> 12;
				}
			}
			local67 >>= 0x4;
			local71 >>= 0x4;
			local75 >>= 0x4;
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
			if (local67 < 0) {
				local67 = 0;
			} else if (local67 > 255) {
				local67 = 255;
			}
			this.anIntArray803[local20] = local71 | local75 << 16 | local67 << 8;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
		if (this.anIntArrayArray79 == null) {
			this.method7710(1);
		}
		this.method7711();
	}
}
