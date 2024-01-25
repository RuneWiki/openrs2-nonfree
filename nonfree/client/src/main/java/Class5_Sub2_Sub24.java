import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class5_Sub2_Sub24 extends Class5_Sub2 {

	@OriginalMember(owner = "client!o", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "[I")
	private final int[] anIntArray305 = new int[257];

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
		if (this.anIntArrayArray33 == null) {
			this.method3819(1);
		}
		this.method3821();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V")
	private void method3819(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray33 = new int[2][4];
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[0][2] = 0;
			this.anIntArrayArray33[0][3] = 0;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[1][2] = 4096;
			this.anIntArrayArray33[1][3] = 4096;
			this.anIntArrayArray33[1][0] = 4096;
			this.anIntArrayArray33[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray33 = new int[8][4];
			this.anIntArrayArray33[0][2] = 2602;
			this.anIntArrayArray33[0][3] = 2361;
			this.anIntArrayArray33[0][1] = 2650;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[1][2] = 1799;
			this.anIntArrayArray33[1][3] = 1558;
			this.anIntArrayArray33[1][1] = 2313;
			this.anIntArrayArray33[1][0] = 2867;
			this.anIntArrayArray33[2][3] = 1413;
			this.anIntArrayArray33[2][1] = 2618;
			this.anIntArrayArray33[2][2] = 1734;
			this.anIntArrayArray33[2][0] = 3072;
			this.anIntArrayArray33[3][0] = 3276;
			this.anIntArrayArray33[3][1] = 2296;
			this.anIntArrayArray33[3][2] = 1220;
			this.anIntArrayArray33[3][3] = 947;
			this.anIntArrayArray33[4][0] = 3481;
			this.anIntArrayArray33[4][1] = 2072;
			this.anIntArrayArray33[4][2] = 963;
			this.anIntArrayArray33[4][3] = 722;
			this.anIntArrayArray33[5][0] = 3686;
			this.anIntArrayArray33[5][1] = 2730;
			this.anIntArrayArray33[5][3] = 1766;
			this.anIntArrayArray33[5][2] = 2152;
			this.anIntArrayArray33[6][3] = 915;
			this.anIntArrayArray33[6][1] = 2232;
			this.anIntArrayArray33[6][0] = 3891;
			this.anIntArrayArray33[6][2] = 1060;
			this.anIntArrayArray33[7][1] = 1686;
			this.anIntArrayArray33[7][2] = 1413;
			this.anIntArrayArray33[7][3] = 1140;
			this.anIntArrayArray33[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray33 = new int[7][4];
			this.anIntArrayArray33[0][3] = 4096;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[0][2] = 0;
			this.anIntArrayArray33[1][0] = 663;
			this.anIntArrayArray33[1][2] = 4096;
			this.anIntArrayArray33[1][1] = 0;
			this.anIntArrayArray33[1][3] = 4096;
			this.anIntArrayArray33[2][0] = 1363;
			this.anIntArrayArray33[2][2] = 4096;
			this.anIntArrayArray33[2][3] = 0;
			this.anIntArrayArray33[2][1] = 0;
			this.anIntArrayArray33[3][2] = 4096;
			this.anIntArrayArray33[3][0] = 2048;
			this.anIntArrayArray33[3][3] = 0;
			this.anIntArrayArray33[3][1] = 4096;
			this.anIntArrayArray33[4][3] = 0;
			this.anIntArrayArray33[4][1] = 4096;
			this.anIntArrayArray33[4][0] = 2727;
			this.anIntArrayArray33[4][2] = 0;
			this.anIntArrayArray33[5][2] = 0;
			this.anIntArrayArray33[5][0] = 3411;
			this.anIntArrayArray33[5][3] = 4096;
			this.anIntArrayArray33[5][1] = 4096;
			this.anIntArrayArray33[6][2] = 0;
			this.anIntArrayArray33[6][1] = 0;
			this.anIntArrayArray33[6][0] = 4096;
			this.anIntArrayArray33[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray33 = new int[6][4];
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][3] = 0;
			this.anIntArrayArray33[0][2] = 0;
			this.anIntArrayArray33[1][2] = 0;
			this.anIntArrayArray33[1][0] = 1843;
			this.anIntArrayArray33[1][3] = 1493;
			this.anIntArrayArray33[1][1] = 0;
			this.anIntArrayArray33[2][3] = 2939;
			this.anIntArrayArray33[2][2] = 0;
			this.anIntArrayArray33[2][1] = 0;
			this.anIntArrayArray33[2][0] = 2457;
			this.anIntArrayArray33[3][0] = 2781;
			this.anIntArrayArray33[3][2] = 1124;
			this.anIntArrayArray33[3][1] = 0;
			this.anIntArrayArray33[3][3] = 3565;
			this.anIntArrayArray33[4][3] = 4031;
			this.anIntArrayArray33[4][1] = 546;
			this.anIntArrayArray33[4][2] = 3084;
			this.anIntArrayArray33[4][0] = 3481;
			this.anIntArrayArray33[5][0] = 4096;
			this.anIntArrayArray33[5][2] = 4096;
			this.anIntArrayArray33[5][3] = 4096;
			this.anIntArrayArray33[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray33 = new int[16][4];
			this.anIntArrayArray33[0][1] = 80;
			this.anIntArrayArray33[0][2] = 192;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][3] = 321;
			this.anIntArrayArray33[1][0] = 155;
			this.anIntArrayArray33[1][3] = 562;
			this.anIntArrayArray33[1][1] = 321;
			this.anIntArrayArray33[1][2] = 449;
			this.anIntArrayArray33[2][1] = 578;
			this.anIntArrayArray33[2][3] = 803;
			this.anIntArrayArray33[2][0] = 389;
			this.anIntArrayArray33[2][2] = 690;
			this.anIntArrayArray33[3][0] = 671;
			this.anIntArrayArray33[3][3] = 1140;
			this.anIntArrayArray33[3][1] = 947;
			this.anIntArrayArray33[3][2] = 995;
			this.anIntArrayArray33[4][3] = 1509;
			this.anIntArrayArray33[4][0] = 897;
			this.anIntArrayArray33[4][2] = 1397;
			this.anIntArrayArray33[4][1] = 1285;
			this.anIntArrayArray33[5][0] = 1175;
			this.anIntArrayArray33[5][1] = 1525;
			this.anIntArrayArray33[5][3] = 1413;
			this.anIntArrayArray33[5][2] = 1429;
			this.anIntArrayArray33[6][0] = 1368;
			this.anIntArrayArray33[6][1] = 1734;
			this.anIntArrayArray33[6][3] = 1333;
			this.anIntArrayArray33[6][2] = 1461;
			this.anIntArrayArray33[7][2] = 1525;
			this.anIntArrayArray33[7][1] = 1413;
			this.anIntArrayArray33[7][3] = 1702;
			this.anIntArrayArray33[7][0] = 1507;
			this.anIntArrayArray33[8][3] = 2056;
			this.anIntArrayArray33[8][1] = 1108;
			this.anIntArrayArray33[8][0] = 1736;
			this.anIntArrayArray33[8][2] = 1590;
			this.anIntArrayArray33[9][3] = 2666;
			this.anIntArrayArray33[9][1] = 1766;
			this.anIntArrayArray33[9][0] = 2088;
			this.anIntArrayArray33[9][2] = 2056;
			this.anIntArrayArray33[10][3] = 3276;
			this.anIntArrayArray33[10][0] = 2355;
			this.anIntArrayArray33[10][2] = 2586;
			this.anIntArrayArray33[10][1] = 2409;
			this.anIntArrayArray33[11][1] = 3116;
			this.anIntArrayArray33[11][2] = 3148;
			this.anIntArrayArray33[11][3] = 3228;
			this.anIntArrayArray33[11][0] = 2691;
			this.anIntArrayArray33[12][0] = 3031;
			this.anIntArrayArray33[12][1] = 3806;
			this.anIntArrayArray33[12][2] = 3710;
			this.anIntArrayArray33[12][3] = 3196;
			this.anIntArrayArray33[13][0] = 3522;
			this.anIntArrayArray33[13][2] = 3421;
			this.anIntArrayArray33[13][3] = 3019;
			this.anIntArrayArray33[13][1] = 3437;
			this.anIntArrayArray33[14][0] = 3727;
			this.anIntArrayArray33[14][2] = 3148;
			this.anIntArrayArray33[14][1] = 3116;
			this.anIntArrayArray33[14][3] = 3228;
			this.anIntArrayArray33[15][0] = 4096;
			this.anIntArrayArray33[15][1] = 2377;
			this.anIntArrayArray33[15][2] = 2505;
			this.anIntArrayArray33[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray33 = new int[4][4];
			this.anIntArrayArray33[0][0] = 2048;
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[0][3] = 0;
			this.anIntArrayArray33[0][2] = 4096;
			this.anIntArrayArray33[1][0] = 2867;
			this.anIntArrayArray33[1][3] = 0;
			this.anIntArrayArray33[1][2] = 4096;
			this.anIntArrayArray33[1][1] = 4096;
			this.anIntArrayArray33[2][2] = 4096;
			this.anIntArrayArray33[2][1] = 4096;
			this.anIntArrayArray33[2][0] = 3276;
			this.anIntArrayArray33[2][3] = 0;
			this.anIntArrayArray33[3][3] = 0;
			this.anIntArrayArray33[3][0] = 4096;
			this.anIntArrayArray33[3][2] = 0;
			this.anIntArrayArray33[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(29) int[] local29 = this.method5808(0, arg0);
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[2];
			for (@Pc(43) int local43 = 0; local43 < Static15.anInt493; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray305[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V")
	private void method3821() {
		@Pc(13) int local13 = this.anIntArrayArray33.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local13 > local30 && local28 >= this.anIntArrayArray33[local30][0]; local30++) {
				local24++;
			}
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(59) int local59;
			@Pc(55) int[] local55;
			if (local24 >= local13) {
				local55 = this.anIntArrayArray33[local13 - 1];
				local59 = local55[3];
				local63 = local55[1];
				local67 = local55[2];
			} else {
				local55 = this.anIntArrayArray33[local24];
				if (local24 > 0) {
					@Pc(83) int[] local83 = this.anIntArrayArray33[local24 - 1];
					@Pc(101) int local101 = (local28 - local83[0] << 12) / (local55[0] - local83[0]);
					@Pc(105) int local105 = 4096 - local101;
					local63 = local101 * local55[1] + local83[1] * local105 >> 12;
					local67 = local105 * local83[2] + local55[2] * local101 >> 12;
					local59 = local83[3] * local105 + local55[3] * local101 >> 12;
				} else {
					local67 = local55[2];
					local59 = local55[3];
					local63 = local55[1];
				}
			}
			local63 >>= 0x4;
			local59 >>= 0x4;
			local67 >>= 0x4;
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			if (local63 < 0) {
				local63 = 0;
			} else if (local63 > 255) {
				local63 = 255;
			}
			if (local67 < 0) {
				local67 = 0;
			} else if (local67 > 255) {
				local67 = 255;
			}
			this.anIntArray305[local20] = local67 << 8 | local63 << 16 | local59;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(10) int local10 = arg0.method1832();
		if (local10 != 0) {
			this.method3819(local10);
			return;
		}
		this.anIntArrayArray33 = new int[arg0.method1832()][4];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray33.length; local27++) {
			this.anIntArrayArray33[local27][0] = arg0.method1845();
			this.anIntArrayArray33[local27][1] = arg0.method1832() << 4;
			this.anIntArrayArray33[local27][2] = arg0.method1832() << 4;
			this.anIntArrayArray33[local27][3] = arg0.method1832() << 4;
		}
	}
}
