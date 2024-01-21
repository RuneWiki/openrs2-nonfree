import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class2_Sub4_Sub28 extends Class2_Sub4 {

	@OriginalMember(owner = "client!pj", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!pj", name = "hb", descriptor = "[I")
	private final int[] anIntArray289 = new int[257];

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
		if (this.anIntArrayArray26 == null) {
			this.method2347(1);
		}
		this.method2342();
	}

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
	private void method2342() {
		@Pc(13) int local13 = this.anIntArrayArray26.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local13 > local30 && local28 >= this.anIntArrayArray26[local30][0]; local30++) {
				local24++;
			}
			@Pc(67) int local67;
			@Pc(63) int local63;
			@Pc(59) int local59;
			@Pc(53) int[] local53;
			if (local13 > local24) {
				local53 = this.anIntArrayArray26[local24];
				if (local24 <= 0) {
					local59 = local53[3];
					local63 = local53[2];
					local67 = local53[1];
				} else {
					@Pc(76) int[] local76 = this.anIntArrayArray26[local24 - 1];
					@Pc(93) int local93 = (local28 - local76[0] << 12) / (local53[0] - local76[0]);
					@Pc(97) int local97 = 4096 - local93;
					local63 = local97 * local76[2] + local53[2] * local93 >> 12;
					local59 = local97 * local76[3] + local93 * local53[3] >> 12;
					local67 = local76[1] * local97 + local53[1] * local93 >> 12;
				}
			} else {
				local53 = this.anIntArrayArray26[local13 - 1];
				local59 = local53[3];
				local63 = local53[2];
				local67 = local53[1];
			}
			local67 >>= 0x4;
			local63 >>= 0x4;
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
			local59 >>= 0x4;
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			this.anIntArray289[local20] = local63 << 8 | local67 << 16 | local59;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(15) int local15 = arg1.method1534();
		if (local15 != 0) {
			this.method2347(local15);
			return;
		}
		this.anIntArrayArray26 = new int[arg1.method1534()][4];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray26.length; local32++) {
			this.anIntArrayArray26[local32][0] = arg1.method1557();
			this.anIntArrayArray26[local32][1] = arg1.method1534() << 4;
			this.anIntArrayArray26[local32][2] = arg1.method1534() << 4;
			this.anIntArrayArray26[local32][3] = arg1.method1534() << 4;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(26) int[] local26 = this.method3129(0, arg0);
			@Pc(30) int[] local30 = local12[0];
			@Pc(34) int[] local34 = local12[1];
			@Pc(38) int[] local38 = local12[2];
			for (@Pc(40) int local40 = 0; local40 < Static118.anInt2608; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray289[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)V")
	private void method2347(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray26 = new int[2][4];
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][1] = 4096;
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][0] = 4096;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray26 = new int[8][4];
			this.anIntArrayArray26[0][3] = 2361;
			this.anIntArrayArray26[0][1] = 2650;
			this.anIntArrayArray26[1][1] = 2313;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][0] = 2867;
			this.anIntArrayArray26[2][0] = 3072;
			this.anIntArrayArray26[2][1] = 2618;
			this.anIntArrayArray26[0][2] = 2602;
			this.anIntArrayArray26[3][0] = 3276;
			this.anIntArrayArray26[1][3] = 1558;
			this.anIntArrayArray26[1][2] = 1799;
			this.anIntArrayArray26[4][0] = 3481;
			this.anIntArrayArray26[2][3] = 1413;
			this.anIntArrayArray26[5][0] = 3686;
			this.anIntArrayArray26[6][0] = 3891;
			this.anIntArrayArray26[2][2] = 1734;
			this.anIntArrayArray26[3][3] = 947;
			this.anIntArrayArray26[7][0] = 4096;
			this.anIntArrayArray26[3][2] = 1220;
			this.anIntArrayArray26[3][1] = 2296;
			this.anIntArrayArray26[4][3] = 722;
			this.anIntArrayArray26[4][1] = 2072;
			this.anIntArrayArray26[4][2] = 963;
			this.anIntArrayArray26[5][2] = 2152;
			this.anIntArrayArray26[5][1] = 2730;
			this.anIntArrayArray26[6][2] = 1060;
			this.anIntArrayArray26[7][2] = 1413;
			this.anIntArrayArray26[5][3] = 1766;
			this.anIntArrayArray26[6][3] = 915;
			this.anIntArrayArray26[6][1] = 2232;
			this.anIntArrayArray26[7][1] = 1686;
			this.anIntArrayArray26[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray26 = new int[7][4];
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[0][3] = 4096;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[2][2] = 4096;
			this.anIntArrayArray26[1][3] = 4096;
			this.anIntArrayArray26[3][2] = 4096;
			this.anIntArrayArray26[4][2] = 0;
			this.anIntArrayArray26[5][2] = 0;
			this.anIntArrayArray26[2][3] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][0] = 663;
			this.anIntArrayArray26[3][3] = 0;
			this.anIntArrayArray26[6][2] = 0;
			this.anIntArrayArray26[1][1] = 0;
			this.anIntArrayArray26[2][0] = 1363;
			this.anIntArrayArray26[3][0] = 2048;
			this.anIntArrayArray26[4][3] = 0;
			this.anIntArrayArray26[5][3] = 4096;
			this.anIntArrayArray26[6][3] = 4096;
			this.anIntArrayArray26[4][0] = 2727;
			this.anIntArrayArray26[2][1] = 0;
			this.anIntArrayArray26[3][1] = 4096;
			this.anIntArrayArray26[5][0] = 3411;
			this.anIntArrayArray26[4][1] = 4096;
			this.anIntArrayArray26[6][0] = 4096;
			this.anIntArrayArray26[5][1] = 4096;
			this.anIntArrayArray26[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray26 = new int[6][4];
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[1][0] = 1843;
			this.anIntArrayArray26[2][0] = 2457;
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[1][3] = 1493;
			this.anIntArrayArray26[1][2] = 0;
			this.anIntArrayArray26[2][3] = 2939;
			this.anIntArrayArray26[3][3] = 3565;
			this.anIntArrayArray26[3][0] = 2781;
			this.anIntArrayArray26[2][2] = 0;
			this.anIntArrayArray26[3][2] = 1124;
			this.anIntArrayArray26[4][3] = 4031;
			this.anIntArrayArray26[4][0] = 3481;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[5][0] = 4096;
			this.anIntArrayArray26[5][3] = 4096;
			this.anIntArrayArray26[4][2] = 3084;
			this.anIntArrayArray26[5][2] = 4096;
			this.anIntArrayArray26[1][1] = 0;
			this.anIntArrayArray26[2][1] = 0;
			this.anIntArrayArray26[3][1] = 0;
			this.anIntArrayArray26[4][1] = 546;
			this.anIntArrayArray26[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray26 = new int[16][4];
			this.anIntArrayArray26[0][1] = 80;
			this.anIntArrayArray26[0][2] = 192;
			this.anIntArrayArray26[1][2] = 449;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][0] = 155;
			this.anIntArrayArray26[2][2] = 690;
			this.anIntArrayArray26[1][1] = 321;
			this.anIntArrayArray26[3][2] = 995;
			this.anIntArrayArray26[2][1] = 578;
			this.anIntArrayArray26[3][1] = 947;
			this.anIntArrayArray26[4][1] = 1285;
			this.anIntArrayArray26[5][1] = 1525;
			this.anIntArrayArray26[0][3] = 321;
			this.anIntArrayArray26[1][3] = 562;
			this.anIntArrayArray26[6][1] = 1734;
			this.anIntArrayArray26[2][3] = 803;
			this.anIntArrayArray26[4][2] = 1397;
			this.anIntArrayArray26[3][3] = 1140;
			this.anIntArrayArray26[5][2] = 1429;
			this.anIntArrayArray26[6][2] = 1461;
			this.anIntArrayArray26[2][0] = 389;
			this.anIntArrayArray26[4][3] = 1509;
			this.anIntArrayArray26[7][1] = 1413;
			this.anIntArrayArray26[7][2] = 1525;
			this.anIntArrayArray26[8][2] = 1590;
			this.anIntArrayArray26[5][3] = 1413;
			this.anIntArrayArray26[8][1] = 1108;
			this.anIntArrayArray26[9][1] = 1766;
			this.anIntArrayArray26[3][0] = 671;
			this.anIntArrayArray26[4][0] = 897;
			this.anIntArrayArray26[5][0] = 1175;
			this.anIntArrayArray26[9][2] = 2056;
			this.anIntArrayArray26[6][0] = 1368;
			this.anIntArrayArray26[10][1] = 2409;
			this.anIntArrayArray26[10][2] = 2586;
			this.anIntArrayArray26[11][2] = 3148;
			this.anIntArrayArray26[11][1] = 3116;
			this.anIntArrayArray26[12][2] = 3710;
			this.anIntArrayArray26[13][2] = 3421;
			this.anIntArrayArray26[14][2] = 3148;
			this.anIntArrayArray26[7][0] = 1507;
			this.anIntArrayArray26[6][3] = 1333;
			this.anIntArrayArray26[7][3] = 1702;
			this.anIntArrayArray26[12][1] = 3806;
			this.anIntArrayArray26[8][0] = 1736;
			this.anIntArrayArray26[8][3] = 2056;
			this.anIntArrayArray26[15][2] = 2505;
			this.anIntArrayArray26[9][3] = 2666;
			this.anIntArrayArray26[9][0] = 2088;
			this.anIntArrayArray26[10][0] = 2355;
			this.anIntArrayArray26[13][1] = 3437;
			this.anIntArrayArray26[14][1] = 3116;
			this.anIntArrayArray26[15][1] = 2377;
			this.anIntArrayArray26[11][0] = 2691;
			this.anIntArrayArray26[10][3] = 3276;
			this.anIntArrayArray26[11][3] = 3228;
			this.anIntArrayArray26[12][3] = 3196;
			this.anIntArrayArray26[12][0] = 3031;
			this.anIntArrayArray26[13][0] = 3522;
			this.anIntArrayArray26[14][0] = 3727;
			this.anIntArrayArray26[13][3] = 3019;
			this.anIntArrayArray26[14][3] = 3228;
			this.anIntArrayArray26[15][3] = 2746;
			this.anIntArrayArray26[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray26 = new int[4][4];
			this.anIntArrayArray26[0][0] = 2048;
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[1][3] = 0;
			this.anIntArrayArray26[0][2] = 4096;
			this.anIntArrayArray26[1][0] = 2867;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[2][3] = 0;
			this.anIntArrayArray26[2][0] = 3276;
			this.anIntArrayArray26[3][0] = 4096;
			this.anIntArrayArray26[2][2] = 4096;
			this.anIntArrayArray26[3][2] = 0;
			this.anIntArrayArray26[3][3] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][1] = 4096;
			this.anIntArrayArray26[2][1] = 4096;
			this.anIntArrayArray26[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
