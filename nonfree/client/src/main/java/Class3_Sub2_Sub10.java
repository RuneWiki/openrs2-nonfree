import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class3_Sub2_Sub10 extends Class3_Sub2 {

	@OriginalMember(owner = "client!gb", name = "jb", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!gb", name = "lb", descriptor = "[I")
	private final int[] anIntArray76 = new int[257];

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(20) int local20 = arg0.method1278();
		if (local20 != 0) {
			this.method987(local20);
			return;
		}
		this.anIntArrayArray6 = new int[arg0.method1278()][4];
		for (@Pc(36) int local36 = 0; local36 < this.anIntArrayArray6.length; local36++) {
			this.anIntArrayArray6[local36][0] = arg0.method1270();
			this.anIntArrayArray6[local36][1] = arg0.method1278() << 4;
			this.anIntArrayArray6[local36][2] = arg0.method1278() << 4;
			this.anIntArrayArray6[local36][3] = arg0.method1278() << 4;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(26) int[] local26 = this.method3328(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[2];
			@Pc(38) int[] local38 = local16[1];
			for (@Pc(40) int local40 = 0; local40 < Static190.anInt3865; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray76[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local38[local40] = local48 >> 4 & 0xFF0;
				local34[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	private void method983() {
		@Pc(9) int local9 = this.anIntArrayArray6.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < 257; local21++) {
			@Pc(27) int local27 = local21 << 4;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local9 > local31 && local27 >= this.anIntArrayArray6[local31][0]; local31++) {
				local29++;
			}
			@Pc(113) int local113;
			@Pc(141) int local141;
			@Pc(127) int local127;
			@Pc(66) int[] local66;
			if (local9 > local29) {
				local66 = this.anIntArrayArray6[local29];
				if (local29 > 0) {
					@Pc(78) int[] local78 = this.anIntArrayArray6[local29 - 1];
					@Pc(94) int local94 = (local27 - local78[0] << 12) / (local66[0] - local78[0]);
					@Pc(99) int local99 = 4096 - local94;
					local113 = local99 * local78[1] + local94 * local66[1] >> 12;
					local127 = local94 * local66[3] + local99 * local78[3] >> 12;
					local141 = local94 * local66[2] + local99 * local78[2] >> 12;
				} else {
					local127 = local66[3];
					local141 = local66[2];
					local113 = local66[1];
				}
			} else {
				local66 = this.anIntArrayArray6[local9 - 1];
				local141 = local66[2];
				local127 = local66[3];
				local113 = local66[1];
			}
			local113 >>= 0x4;
			local127 >>= 0x4;
			local141 >>= 0x4;
			if (local141 < 0) {
				local141 = 0;
			} else if (local141 > 255) {
				local141 = 255;
			}
			if (local127 < 0) {
				local127 = 0;
			} else if (local127 > 255) {
				local127 = 255;
			}
			if (local113 < 0) {
				local113 = 0;
			} else if (local113 > 255) {
				local113 = 255;
			}
			this.anIntArray76[local21] = local141 << 8 | local113 << 16 | local127;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
		if (this.anIntArrayArray6 == null) {
			this.method987(1);
		}
		this.method983();
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)V")
	private void method987(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray6 = new int[2][4];
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[1][0] = 4096;
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[1][1] = 4096;
			this.anIntArrayArray6[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray6 = new int[8][4];
			this.anIntArrayArray6[0][3] = 2361;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[1][0] = 2867;
			this.anIntArrayArray6[0][1] = 2650;
			this.anIntArrayArray6[1][3] = 1558;
			this.anIntArrayArray6[2][3] = 1413;
			this.anIntArrayArray6[2][0] = 3072;
			this.anIntArrayArray6[0][2] = 2602;
			this.anIntArrayArray6[3][0] = 3276;
			this.anIntArrayArray6[4][0] = 3481;
			this.anIntArrayArray6[5][0] = 3686;
			this.anIntArrayArray6[1][1] = 2313;
			this.anIntArrayArray6[1][2] = 1799;
			this.anIntArrayArray6[2][1] = 2618;
			this.anIntArrayArray6[6][0] = 3891;
			this.anIntArrayArray6[3][1] = 2296;
			this.anIntArrayArray6[3][3] = 947;
			this.anIntArrayArray6[4][1] = 2072;
			this.anIntArrayArray6[7][0] = 4096;
			this.anIntArrayArray6[4][3] = 722;
			this.anIntArrayArray6[5][1] = 2730;
			this.anIntArrayArray6[2][2] = 1734;
			this.anIntArrayArray6[6][1] = 2232;
			this.anIntArrayArray6[7][1] = 1686;
			this.anIntArrayArray6[5][3] = 1766;
			this.anIntArrayArray6[3][2] = 1220;
			this.anIntArrayArray6[6][3] = 915;
			this.anIntArrayArray6[7][3] = 1140;
			this.anIntArrayArray6[4][2] = 963;
			this.anIntArrayArray6[5][2] = 2152;
			this.anIntArrayArray6[6][2] = 1060;
			this.anIntArrayArray6[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray6 = new int[7][4];
			this.anIntArrayArray6[0][3] = 4096;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[1][0] = 663;
			this.anIntArrayArray6[2][0] = 1363;
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[1][3] = 4096;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[3][0] = 2048;
			this.anIntArrayArray6[2][2] = 4096;
			this.anIntArrayArray6[2][3] = 0;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[3][3] = 0;
			this.anIntArrayArray6[3][2] = 4096;
			this.anIntArrayArray6[4][3] = 0;
			this.anIntArrayArray6[4][0] = 2727;
			this.anIntArrayArray6[1][1] = 0;
			this.anIntArrayArray6[5][0] = 3411;
			this.anIntArrayArray6[5][3] = 4096;
			this.anIntArrayArray6[6][0] = 4096;
			this.anIntArrayArray6[6][3] = 4096;
			this.anIntArrayArray6[2][1] = 0;
			this.anIntArrayArray6[3][1] = 4096;
			this.anIntArrayArray6[4][2] = 0;
			this.anIntArrayArray6[4][1] = 4096;
			this.anIntArrayArray6[5][2] = 0;
			this.anIntArrayArray6[6][2] = 0;
			this.anIntArrayArray6[5][1] = 4096;
			this.anIntArrayArray6[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray6 = new int[6][4];
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[1][2] = 0;
			this.anIntArrayArray6[2][2] = 0;
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[1][0] = 1843;
			this.anIntArrayArray6[3][2] = 1124;
			this.anIntArrayArray6[4][2] = 3084;
			this.anIntArrayArray6[5][2] = 4096;
			this.anIntArrayArray6[2][0] = 2457;
			this.anIntArrayArray6[1][1] = 0;
			this.anIntArrayArray6[1][3] = 1493;
			this.anIntArrayArray6[2][1] = 0;
			this.anIntArrayArray6[3][0] = 2781;
			this.anIntArrayArray6[4][0] = 3481;
			this.anIntArrayArray6[5][0] = 4096;
			this.anIntArrayArray6[2][3] = 2939;
			this.anIntArrayArray6[3][3] = 3565;
			this.anIntArrayArray6[4][3] = 4031;
			this.anIntArrayArray6[3][1] = 0;
			this.anIntArrayArray6[4][1] = 546;
			this.anIntArrayArray6[5][1] = 4096;
			this.anIntArrayArray6[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray6 = new int[16][4];
			this.anIntArrayArray6[0][1] = 80;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[1][0] = 155;
			this.anIntArrayArray6[1][1] = 321;
			this.anIntArrayArray6[2][1] = 578;
			this.anIntArrayArray6[3][1] = 947;
			this.anIntArrayArray6[4][1] = 1285;
			this.anIntArrayArray6[0][3] = 321;
			this.anIntArrayArray6[1][3] = 562;
			this.anIntArrayArray6[2][0] = 389;
			this.anIntArrayArray6[0][2] = 192;
			this.anIntArrayArray6[2][3] = 803;
			this.anIntArrayArray6[3][3] = 1140;
			this.anIntArrayArray6[1][2] = 449;
			this.anIntArrayArray6[4][3] = 1509;
			this.anIntArrayArray6[2][2] = 690;
			this.anIntArrayArray6[5][1] = 1525;
			this.anIntArrayArray6[6][1] = 1734;
			this.anIntArrayArray6[5][3] = 1413;
			this.anIntArrayArray6[6][3] = 1333;
			this.anIntArrayArray6[3][0] = 671;
			this.anIntArrayArray6[4][0] = 897;
			this.anIntArrayArray6[5][0] = 1175;
			this.anIntArrayArray6[7][3] = 1702;
			this.anIntArrayArray6[6][0] = 1368;
			this.anIntArrayArray6[3][2] = 995;
			this.anIntArrayArray6[4][2] = 1397;
			this.anIntArrayArray6[5][2] = 1429;
			this.anIntArrayArray6[8][3] = 2056;
			this.anIntArrayArray6[7][0] = 1507;
			this.anIntArrayArray6[8][0] = 1736;
			this.anIntArrayArray6[6][2] = 1461;
			this.anIntArrayArray6[9][0] = 2088;
			this.anIntArrayArray6[7][1] = 1413;
			this.anIntArrayArray6[8][1] = 1108;
			this.anIntArrayArray6[9][3] = 2666;
			this.anIntArrayArray6[10][0] = 2355;
			this.anIntArrayArray6[7][2] = 1525;
			this.anIntArrayArray6[9][1] = 1766;
			this.anIntArrayArray6[11][0] = 2691;
			this.anIntArrayArray6[8][2] = 1590;
			this.anIntArrayArray6[9][2] = 2056;
			this.anIntArrayArray6[10][2] = 2586;
			this.anIntArrayArray6[10][3] = 3276;
			this.anIntArrayArray6[10][1] = 2409;
			this.anIntArrayArray6[11][2] = 3148;
			this.anIntArrayArray6[12][0] = 3031;
			this.anIntArrayArray6[13][0] = 3522;
			this.anIntArrayArray6[12][2] = 3710;
			this.anIntArrayArray6[14][0] = 3727;
			this.anIntArrayArray6[13][2] = 3421;
			this.anIntArrayArray6[11][3] = 3228;
			this.anIntArrayArray6[11][1] = 3116;
			this.anIntArrayArray6[12][1] = 3806;
			this.anIntArrayArray6[14][2] = 3148;
			this.anIntArrayArray6[13][1] = 3437;
			this.anIntArrayArray6[15][0] = 4096;
			this.anIntArrayArray6[12][3] = 3196;
			this.anIntArrayArray6[13][3] = 3019;
			this.anIntArrayArray6[14][3] = 3228;
			this.anIntArrayArray6[15][2] = 2505;
			this.anIntArrayArray6[15][3] = 2746;
			this.anIntArrayArray6[14][1] = 3116;
			this.anIntArrayArray6[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray6 = new int[4][4];
			this.anIntArrayArray6[0][2] = 4096;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][0] = 2048;
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[1][3] = 0;
			this.anIntArrayArray6[1][0] = 2867;
			this.anIntArrayArray6[2][2] = 4096;
			this.anIntArrayArray6[1][1] = 4096;
			this.anIntArrayArray6[2][0] = 3276;
			this.anIntArrayArray6[2][1] = 4096;
			this.anIntArrayArray6[3][0] = 4096;
			this.anIntArrayArray6[3][1] = 4096;
			this.anIntArrayArray6[2][3] = 0;
			this.anIntArrayArray6[3][2] = 0;
			this.anIntArrayArray6[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
