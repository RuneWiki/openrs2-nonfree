import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class4_Sub2_Sub10 extends Class4_Sub2 {

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "[I")
	private final int[] anIntArray180 = new int[257];

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)V")
	private void method3031(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray20 = new int[2][4];
			this.anIntArrayArray20[0][0] = 0;
			this.anIntArrayArray20[0][2] = 0;
			this.anIntArrayArray20[0][3] = 0;
			this.anIntArrayArray20[0][1] = 0;
			this.anIntArrayArray20[1][1] = 4096;
			this.anIntArrayArray20[1][0] = 4096;
			this.anIntArrayArray20[1][3] = 4096;
			this.anIntArrayArray20[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray20 = new int[8][4];
			this.anIntArrayArray20[0][0] = 0;
			this.anIntArrayArray20[0][1] = 2650;
			this.anIntArrayArray20[0][2] = 2602;
			this.anIntArrayArray20[0][3] = 2361;
			this.anIntArrayArray20[1][2] = 1799;
			this.anIntArrayArray20[1][3] = 1558;
			this.anIntArrayArray20[1][1] = 2313;
			this.anIntArrayArray20[1][0] = 2867;
			this.anIntArrayArray20[2][0] = 3072;
			this.anIntArrayArray20[2][2] = 1734;
			this.anIntArrayArray20[2][3] = 1413;
			this.anIntArrayArray20[2][1] = 2618;
			this.anIntArrayArray20[3][2] = 1220;
			this.anIntArrayArray20[3][0] = 3276;
			this.anIntArrayArray20[3][3] = 947;
			this.anIntArrayArray20[3][1] = 2296;
			this.anIntArrayArray20[4][3] = 722;
			this.anIntArrayArray20[4][2] = 963;
			this.anIntArrayArray20[4][1] = 2072;
			this.anIntArrayArray20[4][0] = 3481;
			this.anIntArrayArray20[5][2] = 2152;
			this.anIntArrayArray20[5][3] = 1766;
			this.anIntArrayArray20[5][0] = 3686;
			this.anIntArrayArray20[5][1] = 2730;
			this.anIntArrayArray20[6][3] = 915;
			this.anIntArrayArray20[6][0] = 3891;
			this.anIntArrayArray20[6][1] = 2232;
			this.anIntArrayArray20[6][2] = 1060;
			this.anIntArrayArray20[7][3] = 1140;
			this.anIntArrayArray20[7][2] = 1413;
			this.anIntArrayArray20[7][0] = 4096;
			this.anIntArrayArray20[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray20 = new int[7][4];
			this.anIntArrayArray20[0][0] = 0;
			this.anIntArrayArray20[0][1] = 0;
			this.anIntArrayArray20[0][2] = 0;
			this.anIntArrayArray20[0][3] = 4096;
			this.anIntArrayArray20[1][1] = 0;
			this.anIntArrayArray20[1][2] = 4096;
			this.anIntArrayArray20[1][0] = 663;
			this.anIntArrayArray20[1][3] = 4096;
			this.anIntArrayArray20[2][0] = 1363;
			this.anIntArrayArray20[2][3] = 0;
			this.anIntArrayArray20[2][2] = 4096;
			this.anIntArrayArray20[2][1] = 0;
			this.anIntArrayArray20[3][2] = 4096;
			this.anIntArrayArray20[3][1] = 4096;
			this.anIntArrayArray20[3][3] = 0;
			this.anIntArrayArray20[3][0] = 2048;
			this.anIntArrayArray20[4][1] = 4096;
			this.anIntArrayArray20[4][3] = 0;
			this.anIntArrayArray20[4][0] = 2727;
			this.anIntArrayArray20[4][2] = 0;
			this.anIntArrayArray20[5][1] = 4096;
			this.anIntArrayArray20[5][3] = 4096;
			this.anIntArrayArray20[5][0] = 3411;
			this.anIntArrayArray20[5][2] = 0;
			this.anIntArrayArray20[6][3] = 4096;
			this.anIntArrayArray20[6][0] = 4096;
			this.anIntArrayArray20[6][2] = 0;
			this.anIntArrayArray20[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray20 = new int[6][4];
			this.anIntArrayArray20[0][0] = 0;
			this.anIntArrayArray20[0][2] = 0;
			this.anIntArrayArray20[0][3] = 0;
			this.anIntArrayArray20[0][1] = 0;
			this.anIntArrayArray20[1][1] = 0;
			this.anIntArrayArray20[1][2] = 0;
			this.anIntArrayArray20[1][0] = 1843;
			this.anIntArrayArray20[1][3] = 1493;
			this.anIntArrayArray20[2][3] = 2939;
			this.anIntArrayArray20[2][1] = 0;
			this.anIntArrayArray20[2][2] = 0;
			this.anIntArrayArray20[2][0] = 2457;
			this.anIntArrayArray20[3][1] = 0;
			this.anIntArrayArray20[3][3] = 3565;
			this.anIntArrayArray20[3][0] = 2781;
			this.anIntArrayArray20[3][2] = 1124;
			this.anIntArrayArray20[4][2] = 3084;
			this.anIntArrayArray20[4][3] = 4031;
			this.anIntArrayArray20[4][1] = 546;
			this.anIntArrayArray20[4][0] = 3481;
			this.anIntArrayArray20[5][2] = 4096;
			this.anIntArrayArray20[5][0] = 4096;
			this.anIntArrayArray20[5][3] = 4096;
			this.anIntArrayArray20[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray20 = new int[16][4];
			this.anIntArrayArray20[0][2] = 192;
			this.anIntArrayArray20[0][0] = 0;
			this.anIntArrayArray20[0][1] = 80;
			this.anIntArrayArray20[0][3] = 321;
			this.anIntArrayArray20[1][0] = 155;
			this.anIntArrayArray20[1][1] = 321;
			this.anIntArrayArray20[1][3] = 562;
			this.anIntArrayArray20[1][2] = 449;
			this.anIntArrayArray20[2][3] = 803;
			this.anIntArrayArray20[2][1] = 578;
			this.anIntArrayArray20[2][2] = 690;
			this.anIntArrayArray20[2][0] = 389;
			this.anIntArrayArray20[3][1] = 947;
			this.anIntArrayArray20[3][0] = 671;
			this.anIntArrayArray20[3][2] = 995;
			this.anIntArrayArray20[3][3] = 1140;
			this.anIntArrayArray20[4][0] = 897;
			this.anIntArrayArray20[4][1] = 1285;
			this.anIntArrayArray20[4][3] = 1509;
			this.anIntArrayArray20[4][2] = 1397;
			this.anIntArrayArray20[5][2] = 1429;
			this.anIntArrayArray20[5][0] = 1175;
			this.anIntArrayArray20[5][3] = 1413;
			this.anIntArrayArray20[5][1] = 1525;
			this.anIntArrayArray20[6][3] = 1333;
			this.anIntArrayArray20[6][2] = 1461;
			this.anIntArrayArray20[6][0] = 1368;
			this.anIntArrayArray20[6][1] = 1734;
			this.anIntArrayArray20[7][0] = 1507;
			this.anIntArrayArray20[7][3] = 1702;
			this.anIntArrayArray20[7][2] = 1525;
			this.anIntArrayArray20[7][1] = 1413;
			this.anIntArrayArray20[8][1] = 1108;
			this.anIntArrayArray20[8][2] = 1590;
			this.anIntArrayArray20[8][3] = 2056;
			this.anIntArrayArray20[8][0] = 1736;
			this.anIntArrayArray20[9][0] = 2088;
			this.anIntArrayArray20[9][1] = 1766;
			this.anIntArrayArray20[9][2] = 2056;
			this.anIntArrayArray20[9][3] = 2666;
			this.anIntArrayArray20[10][0] = 2355;
			this.anIntArrayArray20[10][3] = 3276;
			this.anIntArrayArray20[10][2] = 2586;
			this.anIntArrayArray20[10][1] = 2409;
			this.anIntArrayArray20[11][3] = 3228;
			this.anIntArrayArray20[11][2] = 3148;
			this.anIntArrayArray20[11][1] = 3116;
			this.anIntArrayArray20[11][0] = 2691;
			this.anIntArrayArray20[12][1] = 3806;
			this.anIntArrayArray20[12][3] = 3196;
			this.anIntArrayArray20[12][2] = 3710;
			this.anIntArrayArray20[12][0] = 3031;
			this.anIntArrayArray20[13][2] = 3421;
			this.anIntArrayArray20[13][3] = 3019;
			this.anIntArrayArray20[13][0] = 3522;
			this.anIntArrayArray20[13][1] = 3437;
			this.anIntArrayArray20[14][3] = 3228;
			this.anIntArrayArray20[14][2] = 3148;
			this.anIntArrayArray20[14][0] = 3727;
			this.anIntArrayArray20[14][1] = 3116;
			this.anIntArrayArray20[15][2] = 2505;
			this.anIntArrayArray20[15][0] = 4096;
			this.anIntArrayArray20[15][3] = 2746;
			this.anIntArrayArray20[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray20 = new int[4][4];
			this.anIntArrayArray20[0][2] = 4096;
			this.anIntArrayArray20[0][0] = 2048;
			this.anIntArrayArray20[0][1] = 0;
			this.anIntArrayArray20[0][3] = 0;
			this.anIntArrayArray20[1][3] = 0;
			this.anIntArrayArray20[1][1] = 4096;
			this.anIntArrayArray20[1][0] = 2867;
			this.anIntArrayArray20[1][2] = 4096;
			this.anIntArrayArray20[2][3] = 0;
			this.anIntArrayArray20[2][1] = 4096;
			this.anIntArrayArray20[2][0] = 3276;
			this.anIntArrayArray20[2][2] = 4096;
			this.anIntArrayArray20[3][2] = 0;
			this.anIntArrayArray20[3][3] = 0;
			this.anIntArrayArray20[3][1] = 4096;
			this.anIntArrayArray20[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	private void method3034() {
		@Pc(13) int local13 = this.anIntArrayArray20.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local27 < local13 && this.anIntArrayArray20[local27][0] <= local25; local27++) {
				local21++;
			}
			@Pc(102) int local102;
			@Pc(117) int local117;
			@Pc(131) int local131;
			@Pc(54) int[] local54;
			if (local13 > local21) {
				local54 = this.anIntArrayArray20[local21];
				if (local21 > 0) {
					@Pc(66) int[] local66 = this.anIntArrayArray20[local21 - 1];
					@Pc(83) int local83 = (local25 - local66[0] << 12) / (local54[0] - local66[0]);
					@Pc(88) int local88 = 4096 - local83;
					local102 = local88 * local66[1] + local54[1] * local83 >> 12;
					local117 = local83 * local54[2] + local88 * local66[2] >> 12;
					local131 = local54[3] * local83 + local88 * local66[3] >> 12;
				} else {
					local117 = local54[2];
					local102 = local54[1];
					local131 = local54[3];
				}
			} else {
				local54 = this.anIntArrayArray20[local13 - 1];
				local117 = local54[2];
				local102 = local54[1];
				local131 = local54[3];
			}
			local131 >>= 0x4;
			local102 >>= 0x4;
			local117 >>= 0x4;
			if (local117 < 0) {
				local117 = 0;
			} else if (local117 > 255) {
				local117 = 255;
			}
			if (local131 < 0) {
				local131 = 0;
			} else if (local131 > 255) {
				local131 = 255;
			}
			if (local102 < 0) {
				local102 = 0;
			} else if (local102 > 255) {
				local102 = 255;
			}
			this.anIntArray180[local17] = local131 | local117 << 8 | local102 << 16;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(26) int[] local26 = this.method8208(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static417.anInt5248; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray180[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(17) int local17 = arg0.method7004();
		if (local17 != 0) {
			this.method3031(local17);
			return;
		}
		this.anIntArrayArray20 = new int[arg0.method7004()][4];
		for (@Pc(36) int local36 = 0; local36 < this.anIntArrayArray20.length; local36++) {
			this.anIntArrayArray20[local36][0] = arg0.method7054();
			this.anIntArrayArray20[local36][1] = arg0.method7004() << 4;
			this.anIntArrayArray20[local36][2] = arg0.method7004() << 4;
			this.anIntArrayArray20[local36][3] = arg0.method7004() << 4;
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
		if (this.anIntArrayArray20 == null) {
			this.method3031(1);
		}
		this.method3034();
	}
}
