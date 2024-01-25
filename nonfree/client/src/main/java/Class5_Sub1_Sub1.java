import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "[I")
	private final int[] anIntArray7 = new int[257];

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	private void method78() {
		@Pc(9) int local9 = this.anIntArrayArray1.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < 257; local14++) {
			@Pc(18) int local18 = 0;
			@Pc(22) int local22 = local14 << 4;
			for (@Pc(24) int local24 = 0; local24 < local9 && local22 >= this.anIntArrayArray1[local24][0]; local24++) {
				local18++;
			}
			@Pc(127) int local127;
			@Pc(113) int local113;
			@Pc(99) int local99;
			@Pc(53) int[] local53;
			if (local18 < local9) {
				local53 = this.anIntArrayArray1[local18];
				if (local18 > 0) {
					@Pc(62) int[] local62 = this.anIntArrayArray1[local18 - 1];
					@Pc(80) int local80 = (local22 - local62[0] << 12) / (local53[0] - local62[0]);
					@Pc(84) int local84 = 4096 - local80;
					local99 = local80 * local53[3] + local62[3] * local84 >> 12;
					local113 = local62[2] * local84 + local80 * local53[2] >> 12;
					local127 = local84 * local62[1] + local53[1] * local80 >> 12;
				} else {
					local99 = local53[3];
					local113 = local53[2];
					local127 = local53[1];
				}
			} else {
				local53 = this.anIntArrayArray1[local9 - 1];
				local99 = local53[3];
				local113 = local53[2];
				local127 = local53[1];
			}
			local127 >>= 0x4;
			local99 >>= 0x4;
			local113 >>= 0x4;
			if (local113 < 0) {
				local113 = 0;
			} else if (local113 > 255) {
				local113 = 255;
			}
			if (local127 < 0) {
				local127 = 0;
			} else if (local127 > 255) {
				local127 = 255;
			}
			if (local99 < 0) {
				local99 = 0;
			} else if (local99 > 255) {
				local99 = 255;
			}
			this.anIntArray7[local14] = local99 | local127 << 16 | local113 << 8;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(10) int local10 = arg1.method8529();
		if (local10 != 0) {
			this.method80(local10);
			return;
		}
		this.anIntArrayArray1 = new int[arg1.method8529()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray1.length; local21++) {
			this.anIntArrayArray1[local21][0] = arg1.method8519();
			this.anIntArrayArray1[local21][1] = arg1.method8529() << 4;
			this.anIntArrayArray1[local21][2] = arg1.method8529() << 4;
			this.anIntArrayArray1[local21][3] = arg1.method8529() << 4;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
		if (this.anIntArrayArray1 == null) {
			this.method80(1);
		}
		this.method78();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(28) int[] local28 = this.method9210(0, arg0);
			@Pc(32) int[] local32 = local18[0];
			@Pc(36) int[] local36 = local18[1];
			@Pc(40) int[] local40 = local18[2];
			for (@Pc(42) int local42 = 0; local42 < Static648.anInt9588; local42++) {
				@Pc(50) int local50 = local28[local42] >> 4;
				if (local50 < 0) {
					local50 = 0;
				}
				if (local50 > 256) {
					local50 = 256;
				}
				local50 = this.anIntArray7[local50];
				local32[local42] = local50 >> 12 & 0xFF0;
				local36[local42] = local50 >> 4 & 0xFF0;
				local40[local42] = (local50 & 0xFF) << 4;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)V")
	private void method80(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray1 = new int[2][4];
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[0][3] = 0;
			this.anIntArrayArray1[0][2] = 0;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[1][3] = 4096;
			this.anIntArrayArray1[1][1] = 4096;
			this.anIntArrayArray1[1][0] = 4096;
			this.anIntArrayArray1[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray1 = new int[8][4];
			this.anIntArrayArray1[0][2] = 2602;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[0][3] = 2361;
			this.anIntArrayArray1[0][1] = 2650;
			this.anIntArrayArray1[1][0] = 2867;
			this.anIntArrayArray1[1][2] = 1799;
			this.anIntArrayArray1[1][3] = 1558;
			this.anIntArrayArray1[1][1] = 2313;
			this.anIntArrayArray1[2][0] = 3072;
			this.anIntArrayArray1[2][1] = 2618;
			this.anIntArrayArray1[2][3] = 1413;
			this.anIntArrayArray1[2][2] = 1734;
			this.anIntArrayArray1[3][1] = 2296;
			this.anIntArrayArray1[3][2] = 1220;
			this.anIntArrayArray1[3][3] = 947;
			this.anIntArrayArray1[3][0] = 3276;
			this.anIntArrayArray1[4][2] = 963;
			this.anIntArrayArray1[4][1] = 2072;
			this.anIntArrayArray1[4][0] = 3481;
			this.anIntArrayArray1[4][3] = 722;
			this.anIntArrayArray1[5][3] = 1766;
			this.anIntArrayArray1[5][0] = 3686;
			this.anIntArrayArray1[5][1] = 2730;
			this.anIntArrayArray1[5][2] = 2152;
			this.anIntArrayArray1[6][2] = 1060;
			this.anIntArrayArray1[6][0] = 3891;
			this.anIntArrayArray1[6][3] = 915;
			this.anIntArrayArray1[6][1] = 2232;
			this.anIntArrayArray1[7][3] = 1140;
			this.anIntArrayArray1[7][2] = 1413;
			this.anIntArrayArray1[7][1] = 1686;
			this.anIntArrayArray1[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray1 = new int[7][4];
			this.anIntArrayArray1[0][3] = 4096;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[0][2] = 0;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[1][2] = 4096;
			this.anIntArrayArray1[1][0] = 663;
			this.anIntArrayArray1[1][3] = 4096;
			this.anIntArrayArray1[1][1] = 0;
			this.anIntArrayArray1[2][0] = 1363;
			this.anIntArrayArray1[2][1] = 0;
			this.anIntArrayArray1[2][2] = 4096;
			this.anIntArrayArray1[2][3] = 0;
			this.anIntArrayArray1[3][1] = 4096;
			this.anIntArrayArray1[3][0] = 2048;
			this.anIntArrayArray1[3][3] = 0;
			this.anIntArrayArray1[3][2] = 4096;
			this.anIntArrayArray1[4][0] = 2727;
			this.anIntArrayArray1[4][3] = 0;
			this.anIntArrayArray1[4][1] = 4096;
			this.anIntArrayArray1[4][2] = 0;
			this.anIntArrayArray1[5][2] = 0;
			this.anIntArrayArray1[5][0] = 3411;
			this.anIntArrayArray1[5][1] = 4096;
			this.anIntArrayArray1[5][3] = 4096;
			this.anIntArrayArray1[6][0] = 4096;
			this.anIntArrayArray1[6][2] = 0;
			this.anIntArrayArray1[6][1] = 0;
			this.anIntArrayArray1[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray1 = new int[6][4];
			this.anIntArrayArray1[0][3] = 0;
			this.anIntArrayArray1[0][2] = 0;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[1][3] = 1493;
			this.anIntArrayArray1[1][0] = 1843;
			this.anIntArrayArray1[1][2] = 0;
			this.anIntArrayArray1[1][1] = 0;
			this.anIntArrayArray1[2][1] = 0;
			this.anIntArrayArray1[2][2] = 0;
			this.anIntArrayArray1[2][3] = 2939;
			this.anIntArrayArray1[2][0] = 2457;
			this.anIntArrayArray1[3][1] = 0;
			this.anIntArrayArray1[3][0] = 2781;
			this.anIntArrayArray1[3][3] = 3565;
			this.anIntArrayArray1[3][2] = 1124;
			this.anIntArrayArray1[4][3] = 4031;
			this.anIntArrayArray1[4][1] = 546;
			this.anIntArrayArray1[4][2] = 3084;
			this.anIntArrayArray1[4][0] = 3481;
			this.anIntArrayArray1[5][0] = 4096;
			this.anIntArrayArray1[5][1] = 4096;
			this.anIntArrayArray1[5][2] = 4096;
			this.anIntArrayArray1[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray1 = new int[16][4];
			this.anIntArrayArray1[0][3] = 321;
			this.anIntArrayArray1[0][1] = 80;
			this.anIntArrayArray1[0][2] = 192;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[1][2] = 449;
			this.anIntArrayArray1[1][1] = 321;
			this.anIntArrayArray1[1][3] = 562;
			this.anIntArrayArray1[1][0] = 155;
			this.anIntArrayArray1[2][0] = 389;
			this.anIntArrayArray1[2][3] = 803;
			this.anIntArrayArray1[2][2] = 690;
			this.anIntArrayArray1[2][1] = 578;
			this.anIntArrayArray1[3][1] = 947;
			this.anIntArrayArray1[3][0] = 671;
			this.anIntArrayArray1[3][2] = 995;
			this.anIntArrayArray1[3][3] = 1140;
			this.anIntArrayArray1[4][1] = 1285;
			this.anIntArrayArray1[4][2] = 1397;
			this.anIntArrayArray1[4][3] = 1509;
			this.anIntArrayArray1[4][0] = 897;
			this.anIntArrayArray1[5][2] = 1429;
			this.anIntArrayArray1[5][1] = 1525;
			this.anIntArrayArray1[5][0] = 1175;
			this.anIntArrayArray1[5][3] = 1413;
			this.anIntArrayArray1[6][0] = 1368;
			this.anIntArrayArray1[6][1] = 1734;
			this.anIntArrayArray1[6][2] = 1461;
			this.anIntArrayArray1[6][3] = 1333;
			this.anIntArrayArray1[7][0] = 1507;
			this.anIntArrayArray1[7][1] = 1413;
			this.anIntArrayArray1[7][3] = 1702;
			this.anIntArrayArray1[7][2] = 1525;
			this.anIntArrayArray1[8][0] = 1736;
			this.anIntArrayArray1[8][1] = 1108;
			this.anIntArrayArray1[8][3] = 2056;
			this.anIntArrayArray1[8][2] = 1590;
			this.anIntArrayArray1[9][1] = 1766;
			this.anIntArrayArray1[9][2] = 2056;
			this.anIntArrayArray1[9][0] = 2088;
			this.anIntArrayArray1[9][3] = 2666;
			this.anIntArrayArray1[10][1] = 2409;
			this.anIntArrayArray1[10][3] = 3276;
			this.anIntArrayArray1[10][2] = 2586;
			this.anIntArrayArray1[10][0] = 2355;
			this.anIntArrayArray1[11][0] = 2691;
			this.anIntArrayArray1[11][3] = 3228;
			this.anIntArrayArray1[11][2] = 3148;
			this.anIntArrayArray1[11][1] = 3116;
			this.anIntArrayArray1[12][3] = 3196;
			this.anIntArrayArray1[12][0] = 3031;
			this.anIntArrayArray1[12][2] = 3710;
			this.anIntArrayArray1[12][1] = 3806;
			this.anIntArrayArray1[13][0] = 3522;
			this.anIntArrayArray1[13][1] = 3437;
			this.anIntArrayArray1[13][3] = 3019;
			this.anIntArrayArray1[13][2] = 3421;
			this.anIntArrayArray1[14][2] = 3148;
			this.anIntArrayArray1[14][1] = 3116;
			this.anIntArrayArray1[14][3] = 3228;
			this.anIntArrayArray1[14][0] = 3727;
			this.anIntArrayArray1[15][0] = 4096;
			this.anIntArrayArray1[15][3] = 2746;
			this.anIntArrayArray1[15][1] = 2377;
			this.anIntArrayArray1[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray1 = new int[4][4];
			this.anIntArrayArray1[0][3] = 0;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[0][2] = 4096;
			this.anIntArrayArray1[0][0] = 2048;
			this.anIntArrayArray1[1][1] = 4096;
			this.anIntArrayArray1[1][3] = 0;
			this.anIntArrayArray1[1][0] = 2867;
			this.anIntArrayArray1[1][2] = 4096;
			this.anIntArrayArray1[2][0] = 3276;
			this.anIntArrayArray1[2][3] = 0;
			this.anIntArrayArray1[2][2] = 4096;
			this.anIntArrayArray1[2][1] = 4096;
			this.anIntArrayArray1[3][0] = 4096;
			this.anIntArrayArray1[3][3] = 0;
			this.anIntArrayArray1[3][1] = 4096;
			this.anIntArrayArray1[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
