import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class2_Sub1_Sub33 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vc", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "[I")
	private final int[] anIntArray393 = new int[257];

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
		if (this.anIntArrayArray37 == null) {
			this.method3055(1);
		}
		this.method3056();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(26) int[] local26 = this.method3265(arg0, 0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static135.anInt2897; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray393[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
	private void method3055(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray37 = new int[2][4];
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[1][0] = 4096;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray37 = new int[8][4];
			this.anIntArrayArray37[0][3] = 2361;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][3] = 1558;
			this.anIntArrayArray37[0][2] = 2602;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[2][0] = 3072;
			this.anIntArrayArray37[2][3] = 1413;
			this.anIntArrayArray37[3][3] = 947;
			this.anIntArrayArray37[4][3] = 722;
			this.anIntArrayArray37[1][2] = 1799;
			this.anIntArrayArray37[5][3] = 1766;
			this.anIntArrayArray37[0][1] = 2650;
			this.anIntArrayArray37[1][1] = 2313;
			this.anIntArrayArray37[2][1] = 2618;
			this.anIntArrayArray37[3][1] = 2296;
			this.anIntArrayArray37[3][0] = 3276;
			this.anIntArrayArray37[2][2] = 1734;
			this.anIntArrayArray37[3][2] = 1220;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[4][1] = 2072;
			this.anIntArrayArray37[4][2] = 963;
			this.anIntArrayArray37[5][0] = 3686;
			this.anIntArrayArray37[5][2] = 2152;
			this.anIntArrayArray37[6][3] = 915;
			this.anIntArrayArray37[6][0] = 3891;
			this.anIntArrayArray37[5][1] = 2730;
			this.anIntArrayArray37[7][0] = 4096;
			this.anIntArrayArray37[7][3] = 1140;
			this.anIntArrayArray37[6][1] = 2232;
			this.anIntArrayArray37[7][1] = 1686;
			this.anIntArrayArray37[6][2] = 1060;
			this.anIntArrayArray37[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray37 = new int[7][4];
			this.anIntArrayArray37[0][3] = 4096;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[4][1] = 4096;
			this.anIntArrayArray37[1][0] = 663;
			this.anIntArrayArray37[2][0] = 1363;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[6][1] = 0;
			this.anIntArrayArray37[1][3] = 4096;
			this.anIntArrayArray37[3][0] = 2048;
			this.anIntArrayArray37[4][0] = 2727;
			this.anIntArrayArray37[5][0] = 3411;
			this.anIntArrayArray37[6][0] = 4096;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[3][3] = 0;
			this.anIntArrayArray37[4][3] = 0;
			this.anIntArrayArray37[5][3] = 4096;
			this.anIntArrayArray37[6][3] = 4096;
			this.anIntArrayArray37[3][2] = 4096;
			this.anIntArrayArray37[4][2] = 0;
			this.anIntArrayArray37[5][2] = 0;
			this.anIntArrayArray37[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray37 = new int[6][4];
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][3] = 1493;
			this.anIntArrayArray37[1][0] = 1843;
			this.anIntArrayArray37[2][0] = 2457;
			this.anIntArrayArray37[3][1] = 0;
			this.anIntArrayArray37[4][1] = 546;
			this.anIntArrayArray37[3][0] = 2781;
			this.anIntArrayArray37[2][3] = 2939;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[5][0] = 4096;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[1][2] = 0;
			this.anIntArrayArray37[2][2] = 0;
			this.anIntArrayArray37[3][2] = 1124;
			this.anIntArrayArray37[3][3] = 3565;
			this.anIntArrayArray37[4][2] = 3084;
			this.anIntArrayArray37[4][3] = 4031;
			this.anIntArrayArray37[5][2] = 4096;
			this.anIntArrayArray37[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray37 = new int[16][4];
			this.anIntArrayArray37[0][3] = 321;
			this.anIntArrayArray37[0][1] = 80;
			this.anIntArrayArray37[1][3] = 562;
			this.anIntArrayArray37[1][1] = 321;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][0] = 155;
			this.anIntArrayArray37[2][3] = 803;
			this.anIntArrayArray37[2][0] = 389;
			this.anIntArrayArray37[3][3] = 1140;
			this.anIntArrayArray37[2][1] = 578;
			this.anIntArrayArray37[3][0] = 671;
			this.anIntArrayArray37[3][1] = 947;
			this.anIntArrayArray37[4][0] = 897;
			this.anIntArrayArray37[5][0] = 1175;
			this.anIntArrayArray37[4][1] = 1285;
			this.anIntArrayArray37[5][1] = 1525;
			this.anIntArrayArray37[4][3] = 1509;
			this.anIntArrayArray37[6][0] = 1368;
			this.anIntArrayArray37[6][1] = 1734;
			this.anIntArrayArray37[0][2] = 192;
			this.anIntArrayArray37[5][3] = 1413;
			this.anIntArrayArray37[6][3] = 1333;
			this.anIntArrayArray37[7][1] = 1413;
			this.anIntArrayArray37[1][2] = 449;
			this.anIntArrayArray37[8][1] = 1108;
			this.anIntArrayArray37[9][1] = 1766;
			this.anIntArrayArray37[10][1] = 2409;
			this.anIntArrayArray37[7][3] = 1702;
			this.anIntArrayArray37[8][3] = 2056;
			this.anIntArrayArray37[2][2] = 690;
			this.anIntArrayArray37[3][2] = 995;
			this.anIntArrayArray37[7][0] = 1507;
			this.anIntArrayArray37[11][1] = 3116;
			this.anIntArrayArray37[8][0] = 1736;
			this.anIntArrayArray37[9][0] = 2088;
			this.anIntArrayArray37[12][1] = 3806;
			this.anIntArrayArray37[10][0] = 2355;
			this.anIntArrayArray37[11][0] = 2691;
			this.anIntArrayArray37[13][1] = 3437;
			this.anIntArrayArray37[12][0] = 3031;
			this.anIntArrayArray37[13][0] = 3522;
			this.anIntArrayArray37[9][3] = 2666;
			this.anIntArrayArray37[4][2] = 1397;
			this.anIntArrayArray37[14][0] = 3727;
			this.anIntArrayArray37[14][1] = 3116;
			this.anIntArrayArray37[5][2] = 1429;
			this.anIntArrayArray37[6][2] = 1461;
			this.anIntArrayArray37[15][1] = 2377;
			this.anIntArrayArray37[10][3] = 3276;
			this.anIntArrayArray37[7][2] = 1525;
			this.anIntArrayArray37[15][0] = 4096;
			this.anIntArrayArray37[11][3] = 3228;
			this.anIntArrayArray37[12][3] = 3196;
			this.anIntArrayArray37[13][3] = 3019;
			this.anIntArrayArray37[8][2] = 1590;
			this.anIntArrayArray37[14][3] = 3228;
			this.anIntArrayArray37[15][3] = 2746;
			this.anIntArrayArray37[9][2] = 2056;
			this.anIntArrayArray37[10][2] = 2586;
			this.anIntArrayArray37[11][2] = 3148;
			this.anIntArrayArray37[12][2] = 3710;
			this.anIntArrayArray37[13][2] = 3421;
			this.anIntArrayArray37[14][2] = 3148;
			this.anIntArrayArray37[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray37 = new int[4][4];
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[0][2] = 4096;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[0][0] = 2048;
			this.anIntArrayArray37[1][3] = 0;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[3][3] = 0;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[3][2] = 0;
			this.anIntArrayArray37[2][1] = 4096;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[2][0] = 3276;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(19) int local19 = arg0.method260();
		if (local19 != 0) {
			this.method3055(local19);
			return;
		}
		this.anIntArrayArray37 = new int[arg0.method260()][4];
		for (@Pc(35) int local35 = 0; local35 < this.anIntArrayArray37.length; local35++) {
			this.anIntArrayArray37[local35][0] = arg0.method269();
			this.anIntArrayArray37[local35][1] = arg0.method260() << 4;
			this.anIntArrayArray37[local35][2] = arg0.method260() << 4;
			this.anIntArrayArray37[local35][3] = arg0.method260() << 4;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
	private void method3056() {
		@Pc(13) int local13 = this.anIntArrayArray37.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(23) int local23 = local17 << 4;
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local13 > local27 && local23 >= this.anIntArrayArray37[local27][0]; local27++) {
				local25++;
			}
			@Pc(68) int local68;
			@Pc(60) int local60;
			@Pc(64) int local64;
			@Pc(56) int[] local56;
			if (local25 >= local13) {
				local56 = this.anIntArrayArray37[local13 - 1];
				local60 = local56[2];
				local64 = local56[3];
				local68 = local56[1];
			} else {
				local56 = this.anIntArrayArray37[local25];
				if (local25 <= 0) {
					local64 = local56[3];
					local68 = local56[1];
					local60 = local56[2];
				} else {
					@Pc(98) int[] local98 = this.anIntArrayArray37[local25 - 1];
					@Pc(116) int local116 = (local23 - local98[0] << 12) / (local56[0] - local98[0]);
					@Pc(121) int local121 = 4096 - local116;
					local60 = local116 * local56[2] + local98[2] * local121 >> 12;
					local64 = local121 * local98[3] + local116 * local56[3] >> 12;
					local68 = local121 * local98[1] + local56[1] * local116 >> 12;
				}
			}
			local68 >>= 0x4;
			local60 >>= 0x4;
			local64 >>= 0x4;
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			this.anIntArray393[local17] = local64 | local60 << 8 | local68 << 16;
		}
	}
}
