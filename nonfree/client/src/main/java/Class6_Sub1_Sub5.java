import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cja")
public final class Class6_Sub1_Sub5 extends Class6_Sub1 {

	@OriginalMember(owner = "client!cja", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cja", name = "I", descriptor = "[I")
	private final int[] anIntArray85 = new int[257];

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "(II)V")
	private void method1380(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray8 = new int[2][4];
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[0][2] = 0;
			this.anIntArrayArray8[0][3] = 0;
			this.anIntArrayArray8[0][1] = 0;
			this.anIntArrayArray8[1][3] = 4096;
			this.anIntArrayArray8[1][2] = 4096;
			this.anIntArrayArray8[1][0] = 4096;
			this.anIntArrayArray8[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray8 = new int[8][4];
			this.anIntArrayArray8[0][1] = 2650;
			this.anIntArrayArray8[0][3] = 2361;
			this.anIntArrayArray8[0][2] = 2602;
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[1][2] = 1799;
			this.anIntArrayArray8[1][3] = 1558;
			this.anIntArrayArray8[1][0] = 2867;
			this.anIntArrayArray8[1][1] = 2313;
			this.anIntArrayArray8[2][3] = 1413;
			this.anIntArrayArray8[2][2] = 1734;
			this.anIntArrayArray8[2][0] = 3072;
			this.anIntArrayArray8[2][1] = 2618;
			this.anIntArrayArray8[3][2] = 1220;
			this.anIntArrayArray8[3][0] = 3276;
			this.anIntArrayArray8[3][3] = 947;
			this.anIntArrayArray8[3][1] = 2296;
			this.anIntArrayArray8[4][2] = 963;
			this.anIntArrayArray8[4][3] = 722;
			this.anIntArrayArray8[4][1] = 2072;
			this.anIntArrayArray8[4][0] = 3481;
			this.anIntArrayArray8[5][0] = 3686;
			this.anIntArrayArray8[5][3] = 1766;
			this.anIntArrayArray8[5][2] = 2152;
			this.anIntArrayArray8[5][1] = 2730;
			this.anIntArrayArray8[6][3] = 915;
			this.anIntArrayArray8[6][1] = 2232;
			this.anIntArrayArray8[6][0] = 3891;
			this.anIntArrayArray8[6][2] = 1060;
			this.anIntArrayArray8[7][0] = 4096;
			this.anIntArrayArray8[7][1] = 1686;
			this.anIntArrayArray8[7][3] = 1140;
			this.anIntArrayArray8[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray8 = new int[7][4];
			this.anIntArrayArray8[0][2] = 0;
			this.anIntArrayArray8[0][1] = 0;
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[0][3] = 4096;
			this.anIntArrayArray8[1][3] = 4096;
			this.anIntArrayArray8[1][1] = 0;
			this.anIntArrayArray8[1][2] = 4096;
			this.anIntArrayArray8[1][0] = 663;
			this.anIntArrayArray8[2][2] = 4096;
			this.anIntArrayArray8[2][3] = 0;
			this.anIntArrayArray8[2][1] = 0;
			this.anIntArrayArray8[2][0] = 1363;
			this.anIntArrayArray8[3][1] = 4096;
			this.anIntArrayArray8[3][3] = 0;
			this.anIntArrayArray8[3][0] = 2048;
			this.anIntArrayArray8[3][2] = 4096;
			this.anIntArrayArray8[4][3] = 0;
			this.anIntArrayArray8[4][0] = 2727;
			this.anIntArrayArray8[4][1] = 4096;
			this.anIntArrayArray8[4][2] = 0;
			this.anIntArrayArray8[5][2] = 0;
			this.anIntArrayArray8[5][0] = 3411;
			this.anIntArrayArray8[5][1] = 4096;
			this.anIntArrayArray8[5][3] = 4096;
			this.anIntArrayArray8[6][0] = 4096;
			this.anIntArrayArray8[6][1] = 0;
			this.anIntArrayArray8[6][3] = 4096;
			this.anIntArrayArray8[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray8 = new int[6][4];
			this.anIntArrayArray8[0][2] = 0;
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[0][3] = 0;
			this.anIntArrayArray8[0][1] = 0;
			this.anIntArrayArray8[1][3] = 1493;
			this.anIntArrayArray8[1][2] = 0;
			this.anIntArrayArray8[1][1] = 0;
			this.anIntArrayArray8[1][0] = 1843;
			this.anIntArrayArray8[2][2] = 0;
			this.anIntArrayArray8[2][0] = 2457;
			this.anIntArrayArray8[2][1] = 0;
			this.anIntArrayArray8[2][3] = 2939;
			this.anIntArrayArray8[3][1] = 0;
			this.anIntArrayArray8[3][2] = 1124;
			this.anIntArrayArray8[3][0] = 2781;
			this.anIntArrayArray8[3][3] = 3565;
			this.anIntArrayArray8[4][3] = 4031;
			this.anIntArrayArray8[4][0] = 3481;
			this.anIntArrayArray8[4][1] = 546;
			this.anIntArrayArray8[4][2] = 3084;
			this.anIntArrayArray8[5][0] = 4096;
			this.anIntArrayArray8[5][1] = 4096;
			this.anIntArrayArray8[5][3] = 4096;
			this.anIntArrayArray8[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray8 = new int[16][4];
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[0][1] = 80;
			this.anIntArrayArray8[0][3] = 321;
			this.anIntArrayArray8[0][2] = 192;
			this.anIntArrayArray8[1][0] = 155;
			this.anIntArrayArray8[1][3] = 562;
			this.anIntArrayArray8[1][2] = 449;
			this.anIntArrayArray8[1][1] = 321;
			this.anIntArrayArray8[2][3] = 803;
			this.anIntArrayArray8[2][1] = 578;
			this.anIntArrayArray8[2][0] = 389;
			this.anIntArrayArray8[2][2] = 690;
			this.anIntArrayArray8[3][1] = 947;
			this.anIntArrayArray8[3][3] = 1140;
			this.anIntArrayArray8[3][0] = 671;
			this.anIntArrayArray8[3][2] = 995;
			this.anIntArrayArray8[4][0] = 897;
			this.anIntArrayArray8[4][2] = 1397;
			this.anIntArrayArray8[4][1] = 1285;
			this.anIntArrayArray8[4][3] = 1509;
			this.anIntArrayArray8[5][0] = 1175;
			this.anIntArrayArray8[5][1] = 1525;
			this.anIntArrayArray8[5][2] = 1429;
			this.anIntArrayArray8[5][3] = 1413;
			this.anIntArrayArray8[6][3] = 1333;
			this.anIntArrayArray8[6][0] = 1368;
			this.anIntArrayArray8[6][1] = 1734;
			this.anIntArrayArray8[6][2] = 1461;
			this.anIntArrayArray8[7][0] = 1507;
			this.anIntArrayArray8[7][3] = 1702;
			this.anIntArrayArray8[7][1] = 1413;
			this.anIntArrayArray8[7][2] = 1525;
			this.anIntArrayArray8[8][1] = 1108;
			this.anIntArrayArray8[8][2] = 1590;
			this.anIntArrayArray8[8][0] = 1736;
			this.anIntArrayArray8[8][3] = 2056;
			this.anIntArrayArray8[9][1] = 1766;
			this.anIntArrayArray8[9][3] = 2666;
			this.anIntArrayArray8[9][2] = 2056;
			this.anIntArrayArray8[9][0] = 2088;
			this.anIntArrayArray8[10][0] = 2355;
			this.anIntArrayArray8[10][1] = 2409;
			this.anIntArrayArray8[10][2] = 2586;
			this.anIntArrayArray8[10][3] = 3276;
			this.anIntArrayArray8[11][1] = 3116;
			this.anIntArrayArray8[11][0] = 2691;
			this.anIntArrayArray8[11][3] = 3228;
			this.anIntArrayArray8[11][2] = 3148;
			this.anIntArrayArray8[12][0] = 3031;
			this.anIntArrayArray8[12][1] = 3806;
			this.anIntArrayArray8[12][2] = 3710;
			this.anIntArrayArray8[12][3] = 3196;
			this.anIntArrayArray8[13][0] = 3522;
			this.anIntArrayArray8[13][1] = 3437;
			this.anIntArrayArray8[13][3] = 3019;
			this.anIntArrayArray8[13][2] = 3421;
			this.anIntArrayArray8[14][2] = 3148;
			this.anIntArrayArray8[14][3] = 3228;
			this.anIntArrayArray8[14][0] = 3727;
			this.anIntArrayArray8[14][1] = 3116;
			this.anIntArrayArray8[15][2] = 2505;
			this.anIntArrayArray8[15][3] = 2746;
			this.anIntArrayArray8[15][1] = 2377;
			this.anIntArrayArray8[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray8 = new int[4][4];
			this.anIntArrayArray8[0][3] = 0;
			this.anIntArrayArray8[0][1] = 0;
			this.anIntArrayArray8[0][2] = 4096;
			this.anIntArrayArray8[0][0] = 2048;
			this.anIntArrayArray8[1][0] = 2867;
			this.anIntArrayArray8[1][2] = 4096;
			this.anIntArrayArray8[1][3] = 0;
			this.anIntArrayArray8[1][1] = 4096;
			this.anIntArrayArray8[2][0] = 3276;
			this.anIntArrayArray8[2][3] = 0;
			this.anIntArrayArray8[2][2] = 4096;
			this.anIntArrayArray8[2][1] = 4096;
			this.anIntArrayArray8[3][2] = 0;
			this.anIntArrayArray8[3][3] = 0;
			this.anIntArrayArray8[3][0] = 4096;
			this.anIntArrayArray8[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!cja", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
		if (this.anIntArrayArray8 == null) {
			this.method1380(1);
		}
		this.method1382();
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(26) int[] local26 = this.method8963(0, arg0);
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local11[2];
			for (@Pc(40) int local40 = 0; local40 < Static479.anInt8231; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray85[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cja", name = "e", descriptor = "(B)V")
	private void method1382() {
		@Pc(13) int local13 = this.anIntArrayArray8.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local13 > local27 && local25 >= this.anIntArrayArray8[local27][0]; local27++) {
				local21++;
			}
			@Pc(60) int local60;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(56) int[] local56;
			if (local13 <= local21) {
				local56 = this.anIntArrayArray8[local13 - 1];
				local60 = local56[1];
				local64 = local56[2];
				local68 = local56[3];
			} else {
				local56 = this.anIntArrayArray8[local21];
				if (local21 > 0) {
					@Pc(87) int[] local87 = this.anIntArrayArray8[local21 - 1];
					@Pc(104) int local104 = (local25 - local87[0] << 12) / (local56[0] - local87[0]);
					@Pc(109) int local109 = 4096 - local104;
					local60 = local87[1] * local109 + local56[1] * local104 >> 12;
					local64 = local56[2] * local104 + local109 * local87[2] >> 12;
					local68 = local56[3] * local104 + local87[3] * local109 >> 12;
				} else {
					local68 = local56[3];
					local64 = local56[2];
					local60 = local56[1];
				}
			}
			local64 >>= 0x4;
			local60 >>= 0x4;
			local68 >>= 0x4;
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			this.anIntArray85[local17] = local68 | local60 << 16 | local64 << 8;
		}
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(10) int local10 = arg0.method8374();
		if (local10 != 0) {
			this.method1380(local10);
			return;
		}
		this.anIntArrayArray8 = new int[arg0.method8374()][4];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray8.length; local24++) {
			this.anIntArrayArray8[local24][0] = arg0.method8363();
			this.anIntArrayArray8[local24][1] = arg0.method8374() << 4;
			this.anIntArrayArray8[local24][2] = arg0.method8374() << 4;
			this.anIntArrayArray8[local24][3] = arg0.method8374() << 4;
		}
	}
}
