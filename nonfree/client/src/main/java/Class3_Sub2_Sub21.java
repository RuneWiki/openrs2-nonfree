import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class3_Sub2_Sub21 extends Class3_Sub2 {

	@OriginalMember(owner = "client!kn", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!kn", name = "L", descriptor = "[I")
	private int[] anIntArray328 = new int[257];

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
		if (this.anIntArrayArray44 == null) {
			this.method2549(1);
		}
		this.method2555();
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(II)V")
	private void method2549(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray44 = new int[2][4];
			this.anIntArrayArray44[0][2] = 0;
			this.anIntArrayArray44[1][2] = 4096;
			this.anIntArrayArray44[0][1] = 0;
			this.anIntArrayArray44[0][0] = 0;
			this.anIntArrayArray44[1][1] = 4096;
			this.anIntArrayArray44[0][3] = 0;
			this.anIntArrayArray44[1][3] = 4096;
			this.anIntArrayArray44[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray44 = new int[8][4];
			this.anIntArrayArray44[0][0] = 0;
			this.anIntArrayArray44[0][2] = 2602;
			this.anIntArrayArray44[0][3] = 2361;
			this.anIntArrayArray44[0][1] = 2650;
			this.anIntArrayArray44[1][0] = 2867;
			this.anIntArrayArray44[2][0] = 3072;
			this.anIntArrayArray44[1][3] = 1558;
			this.anIntArrayArray44[3][0] = 3276;
			this.anIntArrayArray44[1][1] = 2313;
			this.anIntArrayArray44[2][1] = 2618;
			this.anIntArrayArray44[4][0] = 3481;
			this.anIntArrayArray44[5][0] = 3686;
			this.anIntArrayArray44[6][0] = 3891;
			this.anIntArrayArray44[1][2] = 1799;
			this.anIntArrayArray44[2][3] = 1413;
			this.anIntArrayArray44[2][2] = 1734;
			this.anIntArrayArray44[3][2] = 1220;
			this.anIntArrayArray44[3][1] = 2296;
			this.anIntArrayArray44[4][1] = 2072;
			this.anIntArrayArray44[4][2] = 963;
			this.anIntArrayArray44[7][0] = 4096;
			this.anIntArrayArray44[5][1] = 2730;
			this.anIntArrayArray44[3][3] = 947;
			this.anIntArrayArray44[4][3] = 722;
			this.anIntArrayArray44[5][2] = 2152;
			this.anIntArrayArray44[5][3] = 1766;
			this.anIntArrayArray44[6][1] = 2232;
			this.anIntArrayArray44[6][3] = 915;
			this.anIntArrayArray44[7][3] = 1140;
			this.anIntArrayArray44[6][2] = 1060;
			this.anIntArrayArray44[7][2] = 1413;
			this.anIntArrayArray44[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray44 = new int[7][4];
			this.anIntArrayArray44[0][3] = 4096;
			this.anIntArrayArray44[0][0] = 0;
			this.anIntArrayArray44[0][2] = 0;
			this.anIntArrayArray44[1][0] = 663;
			this.anIntArrayArray44[1][2] = 4096;
			this.anIntArrayArray44[2][0] = 1363;
			this.anIntArrayArray44[0][1] = 0;
			this.anIntArrayArray44[1][1] = 0;
			this.anIntArrayArray44[3][0] = 2048;
			this.anIntArrayArray44[4][0] = 2727;
			this.anIntArrayArray44[1][3] = 4096;
			this.anIntArrayArray44[2][2] = 4096;
			this.anIntArrayArray44[5][0] = 3411;
			this.anIntArrayArray44[6][0] = 4096;
			this.anIntArrayArray44[3][2] = 4096;
			this.anIntArrayArray44[4][2] = 0;
			this.anIntArrayArray44[2][3] = 0;
			this.anIntArrayArray44[2][1] = 0;
			this.anIntArrayArray44[3][3] = 0;
			this.anIntArrayArray44[4][3] = 0;
			this.anIntArrayArray44[5][2] = 0;
			this.anIntArrayArray44[5][3] = 4096;
			this.anIntArrayArray44[6][2] = 0;
			this.anIntArrayArray44[6][3] = 4096;
			this.anIntArrayArray44[3][1] = 4096;
			this.anIntArrayArray44[4][1] = 4096;
			this.anIntArrayArray44[5][1] = 4096;
			this.anIntArrayArray44[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray44 = new int[6][4];
			this.anIntArrayArray44[0][1] = 0;
			this.anIntArrayArray44[0][0] = 0;
			this.anIntArrayArray44[0][3] = 0;
			this.anIntArrayArray44[1][1] = 0;
			this.anIntArrayArray44[1][0] = 1843;
			this.anIntArrayArray44[2][1] = 0;
			this.anIntArrayArray44[3][1] = 0;
			this.anIntArrayArray44[2][0] = 2457;
			this.anIntArrayArray44[3][0] = 2781;
			this.anIntArrayArray44[4][0] = 3481;
			this.anIntArrayArray44[1][3] = 1493;
			this.anIntArrayArray44[4][1] = 546;
			this.anIntArrayArray44[2][3] = 2939;
			this.anIntArrayArray44[5][1] = 4096;
			this.anIntArrayArray44[0][2] = 0;
			this.anIntArrayArray44[1][2] = 0;
			this.anIntArrayArray44[5][0] = 4096;
			this.anIntArrayArray44[3][3] = 3565;
			this.anIntArrayArray44[4][3] = 4031;
			this.anIntArrayArray44[5][3] = 4096;
			this.anIntArrayArray44[2][2] = 0;
			this.anIntArrayArray44[3][2] = 1124;
			this.anIntArrayArray44[4][2] = 3084;
			this.anIntArrayArray44[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray44 = new int[16][4];
			this.anIntArrayArray44[0][2] = 192;
			this.anIntArrayArray44[0][1] = 80;
			this.anIntArrayArray44[1][2] = 449;
			this.anIntArrayArray44[1][1] = 321;
			this.anIntArrayArray44[0][3] = 321;
			this.anIntArrayArray44[1][3] = 562;
			this.anIntArrayArray44[2][1] = 578;
			this.anIntArrayArray44[2][2] = 690;
			this.anIntArrayArray44[3][2] = 995;
			this.anIntArrayArray44[4][2] = 1397;
			this.anIntArrayArray44[2][3] = 803;
			this.anIntArrayArray44[0][0] = 0;
			this.anIntArrayArray44[5][2] = 1429;
			this.anIntArrayArray44[6][2] = 1461;
			this.anIntArrayArray44[1][0] = 155;
			this.anIntArrayArray44[3][1] = 947;
			this.anIntArrayArray44[7][2] = 1525;
			this.anIntArrayArray44[3][3] = 1140;
			this.anIntArrayArray44[8][2] = 1590;
			this.anIntArrayArray44[2][0] = 389;
			this.anIntArrayArray44[3][0] = 671;
			this.anIntArrayArray44[4][1] = 1285;
			this.anIntArrayArray44[4][0] = 897;
			this.anIntArrayArray44[9][2] = 2056;
			this.anIntArrayArray44[10][2] = 2586;
			this.anIntArrayArray44[11][2] = 3148;
			this.anIntArrayArray44[4][3] = 1509;
			this.anIntArrayArray44[5][1] = 1525;
			this.anIntArrayArray44[6][1] = 1734;
			this.anIntArrayArray44[5][3] = 1413;
			this.anIntArrayArray44[5][0] = 1175;
			this.anIntArrayArray44[6][0] = 1368;
			this.anIntArrayArray44[12][2] = 3710;
			this.anIntArrayArray44[6][3] = 1333;
			this.anIntArrayArray44[7][0] = 1507;
			this.anIntArrayArray44[7][1] = 1413;
			this.anIntArrayArray44[7][3] = 1702;
			this.anIntArrayArray44[8][1] = 1108;
			this.anIntArrayArray44[8][0] = 1736;
			this.anIntArrayArray44[13][2] = 3421;
			this.anIntArrayArray44[9][1] = 1766;
			this.anIntArrayArray44[8][3] = 2056;
			this.anIntArrayArray44[9][3] = 2666;
			this.anIntArrayArray44[10][1] = 2409;
			this.anIntArrayArray44[10][3] = 3276;
			this.anIntArrayArray44[9][0] = 2088;
			this.anIntArrayArray44[10][0] = 2355;
			this.anIntArrayArray44[11][0] = 2691;
			this.anIntArrayArray44[11][3] = 3228;
			this.anIntArrayArray44[11][1] = 3116;
			this.anIntArrayArray44[12][1] = 3806;
			this.anIntArrayArray44[14][2] = 3148;
			this.anIntArrayArray44[12][0] = 3031;
			this.anIntArrayArray44[13][1] = 3437;
			this.anIntArrayArray44[14][1] = 3116;
			this.anIntArrayArray44[12][3] = 3196;
			this.anIntArrayArray44[15][2] = 2505;
			this.anIntArrayArray44[13][3] = 3019;
			this.anIntArrayArray44[15][1] = 2377;
			this.anIntArrayArray44[14][3] = 3228;
			this.anIntArrayArray44[13][0] = 3522;
			this.anIntArrayArray44[14][0] = 3727;
			this.anIntArrayArray44[15][0] = 4096;
			this.anIntArrayArray44[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray44 = new int[4][4];
			this.anIntArrayArray44[0][2] = 4096;
			this.anIntArrayArray44[0][0] = 2048;
			this.anIntArrayArray44[0][1] = 0;
			this.anIntArrayArray44[1][0] = 2867;
			this.anIntArrayArray44[1][1] = 4096;
			this.anIntArrayArray44[1][2] = 4096;
			this.anIntArrayArray44[0][3] = 0;
			this.anIntArrayArray44[2][0] = 3276;
			this.anIntArrayArray44[2][1] = 4096;
			this.anIntArrayArray44[1][3] = 0;
			this.anIntArrayArray44[3][1] = 4096;
			this.anIntArrayArray44[2][3] = 0;
			this.anIntArrayArray44[3][0] = 4096;
			this.anIntArrayArray44[2][2] = 4096;
			this.anIntArrayArray44[3][3] = 0;
			this.anIntArrayArray44[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(29) int[] local29 = this.method4954(arg0, 0);
			@Pc(33) int[] local33 = local19[1];
			@Pc(37) int[] local37 = local19[0];
			@Pc(41) int[] local41 = local19[2];
			for (@Pc(43) int local43 = 0; local43 < Static22.anInt421; local43++) {
				@Pc(52) int local52 = local29[local43] >> 4;
				if (local52 < 0) {
					local52 = 0;
				}
				if (local52 > 256) {
					local52 = 256;
				}
				local52 = this.anIntArray328[local52];
				local37[local43] = local52 >> 12 & 0xFF0;
				local33[local43] = local52 >> 4 & 0xFF0;
				local41[local43] = (local52 & 0xFF) << 4;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "(I)V")
	private void method2555() {
		@Pc(9) int local9 = this.anIntArrayArray44.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(25) int local25 = 0;
			@Pc(29) int local29 = local20 << 4;
			for (@Pc(31) int local31 = 0; local9 > local31 && this.anIntArrayArray44[local31][0] <= local29; local31++) {
				local25++;
			}
			@Pc(71) int local71;
			@Pc(79) int local79;
			@Pc(75) int local75;
			@Pc(62) int[] local62;
			if (local9 > local25) {
				local62 = this.anIntArrayArray44[local25];
				if (local25 <= 0) {
					local71 = local62[1];
					local75 = local62[3];
					local79 = local62[2];
				} else {
					@Pc(88) int[] local88 = this.anIntArrayArray44[local25 - 1];
					@Pc(106) int local106 = (local29 - local88[0] << 12) / (local62[0] - local88[0]);
					@Pc(111) int local111 = 4096 - local106;
					local75 = local106 * local62[3] + local111 * local88[3] >> 12;
					local71 = local62[1] * local106 + local88[1] * local111 >> 12;
					local79 = local62[2] * local106 + local111 * local88[2] >> 12;
				}
			} else {
				local62 = this.anIntArrayArray44[local9 - 1];
				local79 = local62[2];
				local75 = local62[3];
				local71 = local62[1];
			}
			local71 >>= 0x4;
			local75 >>= 0x4;
			local79 >>= 0x4;
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
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 > 255) {
				local79 = 255;
			}
			this.anIntArray328[local20] = local79 << 8 | local71 << 16 | local75;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(17) int local17 = arg1.method3915();
		if (local17 != 0) {
			this.method2549(local17);
			return;
		}
		this.anIntArrayArray44 = new int[arg1.method3915()][4];
		for (@Pc(37) int local37 = 0; local37 < this.anIntArrayArray44.length; local37++) {
			this.anIntArrayArray44[local37][0] = arg1.method3948();
			this.anIntArrayArray44[local37][1] = arg1.method3915() << 4;
			this.anIntArrayArray44[local37][2] = arg1.method3915() << 4;
			this.anIntArrayArray44[local37][3] = arg1.method3915() << 4;
		}
	}
}
