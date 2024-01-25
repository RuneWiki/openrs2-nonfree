import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class3_Sub4_Sub11 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gj", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!gj", name = "S", descriptor = "[I")
	private final int[] anIntArray236 = new int[257];

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(21) int[] local21 = this.method5960(0, arg0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static106.anInt2356; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray236[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
		if (this.anIntArrayArray28 == null) {
			this.method2320(1);
		}
		this.method2324();
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V")
	private void method2320(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray28 = new int[2][4];
			this.anIntArrayArray28[0][1] = 0;
			this.anIntArrayArray28[0][3] = 0;
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[0][2] = 0;
			this.anIntArrayArray28[1][3] = 4096;
			this.anIntArrayArray28[1][2] = 4096;
			this.anIntArrayArray28[1][1] = 4096;
			this.anIntArrayArray28[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray28 = new int[8][4];
			this.anIntArrayArray28[0][3] = 2361;
			this.anIntArrayArray28[0][2] = 2602;
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[0][1] = 2650;
			this.anIntArrayArray28[1][0] = 2867;
			this.anIntArrayArray28[1][3] = 1558;
			this.anIntArrayArray28[1][2] = 1799;
			this.anIntArrayArray28[1][1] = 2313;
			this.anIntArrayArray28[2][0] = 3072;
			this.anIntArrayArray28[2][1] = 2618;
			this.anIntArrayArray28[2][3] = 1413;
			this.anIntArrayArray28[2][2] = 1734;
			this.anIntArrayArray28[3][3] = 947;
			this.anIntArrayArray28[3][2] = 1220;
			this.anIntArrayArray28[3][0] = 3276;
			this.anIntArrayArray28[3][1] = 2296;
			this.anIntArrayArray28[4][0] = 3481;
			this.anIntArrayArray28[4][3] = 722;
			this.anIntArrayArray28[4][2] = 963;
			this.anIntArrayArray28[4][1] = 2072;
			this.anIntArrayArray28[5][2] = 2152;
			this.anIntArrayArray28[5][1] = 2730;
			this.anIntArrayArray28[5][3] = 1766;
			this.anIntArrayArray28[5][0] = 3686;
			this.anIntArrayArray28[6][2] = 1060;
			this.anIntArrayArray28[6][0] = 3891;
			this.anIntArrayArray28[6][1] = 2232;
			this.anIntArrayArray28[6][3] = 915;
			this.anIntArrayArray28[7][2] = 1413;
			this.anIntArrayArray28[7][1] = 1686;
			this.anIntArrayArray28[7][0] = 4096;
			this.anIntArrayArray28[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray28 = new int[7][4];
			this.anIntArrayArray28[0][2] = 0;
			this.anIntArrayArray28[0][3] = 4096;
			this.anIntArrayArray28[0][1] = 0;
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[1][1] = 0;
			this.anIntArrayArray28[1][0] = 663;
			this.anIntArrayArray28[1][3] = 4096;
			this.anIntArrayArray28[1][2] = 4096;
			this.anIntArrayArray28[2][1] = 0;
			this.anIntArrayArray28[2][3] = 0;
			this.anIntArrayArray28[2][2] = 4096;
			this.anIntArrayArray28[2][0] = 1363;
			this.anIntArrayArray28[3][3] = 0;
			this.anIntArrayArray28[3][0] = 2048;
			this.anIntArrayArray28[3][2] = 4096;
			this.anIntArrayArray28[3][1] = 4096;
			this.anIntArrayArray28[4][1] = 4096;
			this.anIntArrayArray28[4][3] = 0;
			this.anIntArrayArray28[4][2] = 0;
			this.anIntArrayArray28[4][0] = 2727;
			this.anIntArrayArray28[5][3] = 4096;
			this.anIntArrayArray28[5][1] = 4096;
			this.anIntArrayArray28[5][2] = 0;
			this.anIntArrayArray28[5][0] = 3411;
			this.anIntArrayArray28[6][0] = 4096;
			this.anIntArrayArray28[6][1] = 0;
			this.anIntArrayArray28[6][2] = 0;
			this.anIntArrayArray28[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray28 = new int[6][4];
			this.anIntArrayArray28[0][3] = 0;
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[0][1] = 0;
			this.anIntArrayArray28[0][2] = 0;
			this.anIntArrayArray28[1][1] = 0;
			this.anIntArrayArray28[1][0] = 1843;
			this.anIntArrayArray28[1][2] = 0;
			this.anIntArrayArray28[1][3] = 1493;
			this.anIntArrayArray28[2][2] = 0;
			this.anIntArrayArray28[2][1] = 0;
			this.anIntArrayArray28[2][0] = 2457;
			this.anIntArrayArray28[2][3] = 2939;
			this.anIntArrayArray28[3][3] = 3565;
			this.anIntArrayArray28[3][0] = 2781;
			this.anIntArrayArray28[3][1] = 0;
			this.anIntArrayArray28[3][2] = 1124;
			this.anIntArrayArray28[4][1] = 546;
			this.anIntArrayArray28[4][2] = 3084;
			this.anIntArrayArray28[4][0] = 3481;
			this.anIntArrayArray28[4][3] = 4031;
			this.anIntArrayArray28[5][0] = 4096;
			this.anIntArrayArray28[5][1] = 4096;
			this.anIntArrayArray28[5][2] = 4096;
			this.anIntArrayArray28[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray28 = new int[16][4];
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[0][1] = 80;
			this.anIntArrayArray28[0][2] = 192;
			this.anIntArrayArray28[0][3] = 321;
			this.anIntArrayArray28[1][3] = 562;
			this.anIntArrayArray28[1][2] = 449;
			this.anIntArrayArray28[1][1] = 321;
			this.anIntArrayArray28[1][0] = 155;
			this.anIntArrayArray28[2][0] = 389;
			this.anIntArrayArray28[2][1] = 578;
			this.anIntArrayArray28[2][3] = 803;
			this.anIntArrayArray28[2][2] = 690;
			this.anIntArrayArray28[3][2] = 995;
			this.anIntArrayArray28[3][3] = 1140;
			this.anIntArrayArray28[3][0] = 671;
			this.anIntArrayArray28[3][1] = 947;
			this.anIntArrayArray28[4][2] = 1397;
			this.anIntArrayArray28[4][1] = 1285;
			this.anIntArrayArray28[4][3] = 1509;
			this.anIntArrayArray28[4][0] = 897;
			this.anIntArrayArray28[5][1] = 1525;
			this.anIntArrayArray28[5][2] = 1429;
			this.anIntArrayArray28[5][3] = 1413;
			this.anIntArrayArray28[5][0] = 1175;
			this.anIntArrayArray28[6][1] = 1734;
			this.anIntArrayArray28[6][2] = 1461;
			this.anIntArrayArray28[6][3] = 1333;
			this.anIntArrayArray28[6][0] = 1368;
			this.anIntArrayArray28[7][0] = 1507;
			this.anIntArrayArray28[7][3] = 1702;
			this.anIntArrayArray28[7][1] = 1413;
			this.anIntArrayArray28[7][2] = 1525;
			this.anIntArrayArray28[8][1] = 1108;
			this.anIntArrayArray28[8][2] = 1590;
			this.anIntArrayArray28[8][0] = 1736;
			this.anIntArrayArray28[8][3] = 2056;
			this.anIntArrayArray28[9][0] = 2088;
			this.anIntArrayArray28[9][1] = 1766;
			this.anIntArrayArray28[9][3] = 2666;
			this.anIntArrayArray28[9][2] = 2056;
			this.anIntArrayArray28[10][0] = 2355;
			this.anIntArrayArray28[10][1] = 2409;
			this.anIntArrayArray28[10][2] = 2586;
			this.anIntArrayArray28[10][3] = 3276;
			this.anIntArrayArray28[11][2] = 3148;
			this.anIntArrayArray28[11][3] = 3228;
			this.anIntArrayArray28[11][1] = 3116;
			this.anIntArrayArray28[11][0] = 2691;
			this.anIntArrayArray28[12][3] = 3196;
			this.anIntArrayArray28[12][0] = 3031;
			this.anIntArrayArray28[12][1] = 3806;
			this.anIntArrayArray28[12][2] = 3710;
			this.anIntArrayArray28[13][3] = 3019;
			this.anIntArrayArray28[13][2] = 3421;
			this.anIntArrayArray28[13][1] = 3437;
			this.anIntArrayArray28[13][0] = 3522;
			this.anIntArrayArray28[14][0] = 3727;
			this.anIntArrayArray28[14][2] = 3148;
			this.anIntArrayArray28[14][3] = 3228;
			this.anIntArrayArray28[14][1] = 3116;
			this.anIntArrayArray28[15][0] = 4096;
			this.anIntArrayArray28[15][3] = 2746;
			this.anIntArrayArray28[15][1] = 2377;
			this.anIntArrayArray28[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray28 = new int[4][4];
			this.anIntArrayArray28[0][2] = 4096;
			this.anIntArrayArray28[0][0] = 2048;
			this.anIntArrayArray28[0][1] = 0;
			this.anIntArrayArray28[0][3] = 0;
			this.anIntArrayArray28[1][1] = 4096;
			this.anIntArrayArray28[1][3] = 0;
			this.anIntArrayArray28[1][0] = 2867;
			this.anIntArrayArray28[1][2] = 4096;
			this.anIntArrayArray28[2][3] = 0;
			this.anIntArrayArray28[2][0] = 3276;
			this.anIntArrayArray28[2][2] = 4096;
			this.anIntArrayArray28[2][1] = 4096;
			this.anIntArrayArray28[3][0] = 4096;
			this.anIntArrayArray28[3][2] = 0;
			this.anIntArrayArray28[3][3] = 0;
			this.anIntArrayArray28[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(17) int local17 = arg1.method6053();
		if (local17 != 0) {
			this.method2320(local17);
			return;
		}
		this.anIntArrayArray28 = new int[arg1.method6053()][4];
		for (@Pc(38) int local38 = 0; local38 < this.anIntArrayArray28.length; local38++) {
			this.anIntArrayArray28[local38][0] = arg1.method6004();
			this.anIntArrayArray28[local38][1] = arg1.method6053() << 4;
			this.anIntArrayArray28[local38][2] = arg1.method6053() << 4;
			this.anIntArrayArray28[local38][3] = arg1.method6053() << 4;
		}
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(B)V")
	private void method2324() {
		@Pc(13) int local13 = this.anIntArrayArray28.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local13 > local27 && local25 >= this.anIntArrayArray28[local27][0]; local27++) {
				local21++;
			}
			@Pc(98) int local98;
			@Pc(127) int local127;
			@Pc(113) int local113;
			@Pc(54) int[] local54;
			if (local21 < local13) {
				local54 = this.anIntArrayArray28[local21];
				if (local21 > 0) {
					@Pc(63) int[] local63 = this.anIntArrayArray28[local21 - 1];
					@Pc(79) int local79 = (local25 - local63[0] << 12) / (local54[0] - local63[0]);
					@Pc(84) int local84 = 4096 - local79;
					local98 = local54[1] * local79 + local84 * local63[1] >> 12;
					local113 = local79 * local54[3] + local63[3] * local84 >> 12;
					local127 = local63[2] * local84 + local79 * local54[2] >> 12;
				} else {
					local98 = local54[1];
					local127 = local54[2];
					local113 = local54[3];
				}
			} else {
				local54 = this.anIntArrayArray28[local13 - 1];
				local98 = local54[1];
				local113 = local54[3];
				local127 = local54[2];
			}
			local98 >>= 0x4;
			local127 >>= 0x4;
			local113 >>= 0x4;
			if (local113 < 0) {
				local113 = 0;
			} else if (local113 > 255) {
				local113 = 255;
			}
			if (local98 < 0) {
				local98 = 0;
			} else if (local98 > 255) {
				local98 = 255;
			}
			if (local127 < 0) {
				local127 = 0;
			} else if (local127 > 255) {
				local127 = 255;
			}
			this.anIntArray236[local17] = local98 << 16 | local127 << 8 | local113;
		}
	}
}
