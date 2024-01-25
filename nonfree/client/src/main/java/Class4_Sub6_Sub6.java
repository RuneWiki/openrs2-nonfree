import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class4_Sub6_Sub6 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ed", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ed", name = "E", descriptor = "[I")
	private final int[] anIntArray142 = new int[257];

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	@Override
	public void method5509() {
		if (this.anIntArrayArray19 == null) {
			this.method1542(1);
		}
		this.method1540();
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V")
	private void method1540() {
		@Pc(13) int local13 = this.anIntArrayArray19.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local13 > local30 && this.anIntArrayArray19[local30][0] <= local28; local30++) {
				local24++;
			}
			@Pc(75) int local75;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(63) int[] local63;
			if (local13 <= local24) {
				local63 = this.anIntArrayArray19[local13 - 1];
				local67 = local63[2];
				local71 = local63[3];
				local75 = local63[1];
			} else {
				local63 = this.anIntArrayArray19[local24];
				if (local24 <= 0) {
					local67 = local63[2];
					local71 = local63[3];
					local75 = local63[1];
				} else {
					@Pc(105) int[] local105 = this.anIntArrayArray19[local24 - 1];
					@Pc(123) int local123 = (local28 - local105[0] << 12) / (local63[0] - local105[0]);
					@Pc(127) int local127 = 4096 - local123;
					local75 = local123 * local63[1] + local127 * local105[1] >> 12;
					local67 = local123 * local63[2] + local105[2] * local127 >> 12;
					local71 = local127 * local105[3] + local123 * local63[3] >> 12;
				}
			}
			local71 >>= 0x4;
			local75 >>= 0x4;
			local67 >>= 0x4;
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
			this.anIntArray142[local20] = local71 | local67 << 8 | local75 << 16;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(9) int local9 = arg1.method2490();
		if (local9 != 0) {
			this.method1542(local9);
			return;
		}
		this.anIntArrayArray19 = new int[arg1.method2490()][4];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArrayArray19.length; local23++) {
			this.anIntArrayArray19[local23][0] = arg1.method2536();
			this.anIntArrayArray19[local23][1] = arg1.method2490() << 4;
			this.anIntArrayArray19[local23][2] = arg1.method2490() << 4;
			this.anIntArrayArray19[local23][3] = arg1.method2490() << 4;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)V")
	private void method1542(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray19 = new int[2][4];
			this.anIntArrayArray19[0][3] = 0;
			this.anIntArrayArray19[0][1] = 0;
			this.anIntArrayArray19[0][0] = 0;
			this.anIntArrayArray19[0][2] = 0;
			this.anIntArrayArray19[1][1] = 4096;
			this.anIntArrayArray19[1][3] = 4096;
			this.anIntArrayArray19[1][2] = 4096;
			this.anIntArrayArray19[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray19 = new int[8][4];
			this.anIntArrayArray19[0][3] = 2361;
			this.anIntArrayArray19[0][0] = 0;
			this.anIntArrayArray19[0][1] = 2650;
			this.anIntArrayArray19[0][2] = 2602;
			this.anIntArrayArray19[1][3] = 1558;
			this.anIntArrayArray19[1][1] = 2313;
			this.anIntArrayArray19[1][2] = 1799;
			this.anIntArrayArray19[1][0] = 2867;
			this.anIntArrayArray19[2][3] = 1413;
			this.anIntArrayArray19[2][1] = 2618;
			this.anIntArrayArray19[2][0] = 3072;
			this.anIntArrayArray19[2][2] = 1734;
			this.anIntArrayArray19[3][0] = 3276;
			this.anIntArrayArray19[3][3] = 947;
			this.anIntArrayArray19[3][1] = 2296;
			this.anIntArrayArray19[3][2] = 1220;
			this.anIntArrayArray19[4][3] = 722;
			this.anIntArrayArray19[4][2] = 963;
			this.anIntArrayArray19[4][0] = 3481;
			this.anIntArrayArray19[4][1] = 2072;
			this.anIntArrayArray19[5][3] = 1766;
			this.anIntArrayArray19[5][0] = 3686;
			this.anIntArrayArray19[5][1] = 2730;
			this.anIntArrayArray19[5][2] = 2152;
			this.anIntArrayArray19[6][1] = 2232;
			this.anIntArrayArray19[6][0] = 3891;
			this.anIntArrayArray19[6][3] = 915;
			this.anIntArrayArray19[6][2] = 1060;
			this.anIntArrayArray19[7][0] = 4096;
			this.anIntArrayArray19[7][1] = 1686;
			this.anIntArrayArray19[7][2] = 1413;
			this.anIntArrayArray19[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray19 = new int[7][4];
			this.anIntArrayArray19[0][0] = 0;
			this.anIntArrayArray19[0][1] = 0;
			this.anIntArrayArray19[0][3] = 4096;
			this.anIntArrayArray19[0][2] = 0;
			this.anIntArrayArray19[1][1] = 0;
			this.anIntArrayArray19[1][2] = 4096;
			this.anIntArrayArray19[1][0] = 663;
			this.anIntArrayArray19[1][3] = 4096;
			this.anIntArrayArray19[2][2] = 4096;
			this.anIntArrayArray19[2][1] = 0;
			this.anIntArrayArray19[2][3] = 0;
			this.anIntArrayArray19[2][0] = 1363;
			this.anIntArrayArray19[3][2] = 4096;
			this.anIntArrayArray19[3][0] = 2048;
			this.anIntArrayArray19[3][3] = 0;
			this.anIntArrayArray19[3][1] = 4096;
			this.anIntArrayArray19[4][2] = 0;
			this.anIntArrayArray19[4][1] = 4096;
			this.anIntArrayArray19[4][0] = 2727;
			this.anIntArrayArray19[4][3] = 0;
			this.anIntArrayArray19[5][3] = 4096;
			this.anIntArrayArray19[5][1] = 4096;
			this.anIntArrayArray19[5][2] = 0;
			this.anIntArrayArray19[5][0] = 3411;
			this.anIntArrayArray19[6][0] = 4096;
			this.anIntArrayArray19[6][3] = 4096;
			this.anIntArrayArray19[6][1] = 0;
			this.anIntArrayArray19[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray19 = new int[6][4];
			this.anIntArrayArray19[0][0] = 0;
			this.anIntArrayArray19[0][1] = 0;
			this.anIntArrayArray19[0][3] = 0;
			this.anIntArrayArray19[0][2] = 0;
			this.anIntArrayArray19[1][0] = 1843;
			this.anIntArrayArray19[1][2] = 0;
			this.anIntArrayArray19[1][1] = 0;
			this.anIntArrayArray19[1][3] = 1493;
			this.anIntArrayArray19[2][1] = 0;
			this.anIntArrayArray19[2][2] = 0;
			this.anIntArrayArray19[2][0] = 2457;
			this.anIntArrayArray19[2][3] = 2939;
			this.anIntArrayArray19[3][1] = 0;
			this.anIntArrayArray19[3][3] = 3565;
			this.anIntArrayArray19[3][0] = 2781;
			this.anIntArrayArray19[3][2] = 1124;
			this.anIntArrayArray19[4][0] = 3481;
			this.anIntArrayArray19[4][3] = 4031;
			this.anIntArrayArray19[4][2] = 3084;
			this.anIntArrayArray19[4][1] = 546;
			this.anIntArrayArray19[5][0] = 4096;
			this.anIntArrayArray19[5][3] = 4096;
			this.anIntArrayArray19[5][1] = 4096;
			this.anIntArrayArray19[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray19 = new int[16][4];
			this.anIntArrayArray19[0][0] = 0;
			this.anIntArrayArray19[0][2] = 192;
			this.anIntArrayArray19[0][1] = 80;
			this.anIntArrayArray19[0][3] = 321;
			this.anIntArrayArray19[1][2] = 449;
			this.anIntArrayArray19[1][3] = 562;
			this.anIntArrayArray19[1][1] = 321;
			this.anIntArrayArray19[1][0] = 155;
			this.anIntArrayArray19[2][3] = 803;
			this.anIntArrayArray19[2][1] = 578;
			this.anIntArrayArray19[2][2] = 690;
			this.anIntArrayArray19[2][0] = 389;
			this.anIntArrayArray19[3][2] = 995;
			this.anIntArrayArray19[3][1] = 947;
			this.anIntArrayArray19[3][3] = 1140;
			this.anIntArrayArray19[3][0] = 671;
			this.anIntArrayArray19[4][2] = 1397;
			this.anIntArrayArray19[4][1] = 1285;
			this.anIntArrayArray19[4][3] = 1509;
			this.anIntArrayArray19[4][0] = 897;
			this.anIntArrayArray19[5][0] = 1175;
			this.anIntArrayArray19[5][3] = 1413;
			this.anIntArrayArray19[5][1] = 1525;
			this.anIntArrayArray19[5][2] = 1429;
			this.anIntArrayArray19[6][1] = 1734;
			this.anIntArrayArray19[6][0] = 1368;
			this.anIntArrayArray19[6][2] = 1461;
			this.anIntArrayArray19[6][3] = 1333;
			this.anIntArrayArray19[7][2] = 1525;
			this.anIntArrayArray19[7][3] = 1702;
			this.anIntArrayArray19[7][1] = 1413;
			this.anIntArrayArray19[7][0] = 1507;
			this.anIntArrayArray19[8][3] = 2056;
			this.anIntArrayArray19[8][1] = 1108;
			this.anIntArrayArray19[8][2] = 1590;
			this.anIntArrayArray19[8][0] = 1736;
			this.anIntArrayArray19[9][3] = 2666;
			this.anIntArrayArray19[9][2] = 2056;
			this.anIntArrayArray19[9][1] = 1766;
			this.anIntArrayArray19[9][0] = 2088;
			this.anIntArrayArray19[10][2] = 2586;
			this.anIntArrayArray19[10][1] = 2409;
			this.anIntArrayArray19[10][0] = 2355;
			this.anIntArrayArray19[10][3] = 3276;
			this.anIntArrayArray19[11][2] = 3148;
			this.anIntArrayArray19[11][0] = 2691;
			this.anIntArrayArray19[11][1] = 3116;
			this.anIntArrayArray19[11][3] = 3228;
			this.anIntArrayArray19[12][0] = 3031;
			this.anIntArrayArray19[12][3] = 3196;
			this.anIntArrayArray19[12][1] = 3806;
			this.anIntArrayArray19[12][2] = 3710;
			this.anIntArrayArray19[13][2] = 3421;
			this.anIntArrayArray19[13][3] = 3019;
			this.anIntArrayArray19[13][0] = 3522;
			this.anIntArrayArray19[13][1] = 3437;
			this.anIntArrayArray19[14][2] = 3148;
			this.anIntArrayArray19[14][0] = 3727;
			this.anIntArrayArray19[14][3] = 3228;
			this.anIntArrayArray19[14][1] = 3116;
			this.anIntArrayArray19[15][2] = 2505;
			this.anIntArrayArray19[15][0] = 4096;
			this.anIntArrayArray19[15][3] = 2746;
			this.anIntArrayArray19[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray19 = new int[4][4];
			this.anIntArrayArray19[0][3] = 0;
			this.anIntArrayArray19[0][1] = 0;
			this.anIntArrayArray19[0][2] = 4096;
			this.anIntArrayArray19[0][0] = 2048;
			this.anIntArrayArray19[1][0] = 2867;
			this.anIntArrayArray19[1][1] = 4096;
			this.anIntArrayArray19[1][2] = 4096;
			this.anIntArrayArray19[1][3] = 0;
			this.anIntArrayArray19[2][0] = 3276;
			this.anIntArrayArray19[2][1] = 4096;
			this.anIntArrayArray19[2][2] = 4096;
			this.anIntArrayArray19[2][3] = 0;
			this.anIntArrayArray19[3][2] = 0;
			this.anIntArrayArray19[3][3] = 0;
			this.anIntArrayArray19[3][0] = 4096;
			this.anIntArrayArray19[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(28) int[] local28 = this.method5508(arg0, 0);
			@Pc(32) int[] local32 = local11[0];
			@Pc(36) int[] local36 = local11[1];
			@Pc(40) int[] local40 = local11[2];
			for (@Pc(42) int local42 = 0; local42 < Static80.anInt1616; local42++) {
				@Pc(50) int local50 = local28[local42] >> 4;
				if (local50 < 0) {
					local50 = 0;
				}
				if (local50 > 256) {
					local50 = 256;
				}
				local50 = this.anIntArray142[local50];
				local32[local42] = local50 >> 12 & 0xFF0;
				local36[local42] = local50 >> 4 & 0xFF0;
				local40[local42] = (local50 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
