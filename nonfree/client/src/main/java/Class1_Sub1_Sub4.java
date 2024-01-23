import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dh", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!dh", name = "R", descriptor = "[I")
	private int[] anIntArray142 = new int[257];

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(7) int local7 = arg0.method2199();
		if (local7 != 0) {
			this.method952(local7);
			return;
		}
		this.anIntArrayArray21 = new int[arg0.method2199()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray21.length; local21++) {
			this.anIntArrayArray21[local21][0] = arg0.method2244();
			this.anIntArrayArray21[local21][1] = arg0.method2199() << 4;
			this.anIntArrayArray21[local21][2] = arg0.method2199() << 4;
			this.anIntArrayArray21[local21][3] = arg0.method2199() << 4;
		}
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
		if (this.anIntArrayArray21 == null) {
			this.method952(1);
		}
		this.method950();
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)V")
	private void method950() {
		@Pc(15) int local15 = this.anIntArrayArray21.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = local22 << 4;
			for (@Pc(33) int local33 = 0; local15 > local33 && local31 >= this.anIntArrayArray21[local33][0]; local33++) {
				local27++;
			}
			@Pc(143) int local143;
			@Pc(115) int local115;
			@Pc(129) int local129;
			@Pc(66) int[] local66;
			if (local15 > local27) {
				local66 = this.anIntArrayArray21[local27];
				if (local27 > 0) {
					@Pc(78) int[] local78 = this.anIntArrayArray21[local27 - 1];
					@Pc(96) int local96 = (local31 - local78[0] << 12) / (local66[0] - local78[0]);
					@Pc(101) int local101 = 4096 - local96;
					local115 = local96 * local66[2] + local101 * local78[2] >> 12;
					local129 = local101 * local78[3] + local66[3] * local96 >> 12;
					local143 = local78[1] * local101 + local66[1] * local96 >> 12;
				} else {
					local143 = local66[1];
					local115 = local66[2];
					local129 = local66[3];
				}
			} else {
				local66 = this.anIntArrayArray21[local15 - 1];
				local115 = local66[2];
				local129 = local66[3];
				local143 = local66[1];
			}
			local129 >>= 0x4;
			if (local129 < 0) {
				local129 = 0;
			} else if (local129 > 255) {
				local129 = 255;
			}
			local143 >>= 0x4;
			local115 >>= 0x4;
			if (local143 < 0) {
				local143 = 0;
			} else if (local143 > 255) {
				local143 = 255;
			}
			if (local115 < 0) {
				local115 = 0;
			} else if (local115 > 255) {
				local115 = 255;
			}
			this.anIntArray142[local22] = local143 << 16 | local115 << 8 | local129;
		}
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(II)V")
	private void method952(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray21 = new int[2][4];
			this.anIntArrayArray21[0][3] = 0;
			this.anIntArrayArray21[0][2] = 0;
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[0][1] = 0;
			this.anIntArrayArray21[1][3] = 4096;
			this.anIntArrayArray21[1][2] = 4096;
			this.anIntArrayArray21[1][0] = 4096;
			this.anIntArrayArray21[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray21 = new int[8][4];
			this.anIntArrayArray21[0][1] = 2650;
			this.anIntArrayArray21[0][3] = 2361;
			this.anIntArrayArray21[1][3] = 1558;
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[2][3] = 1413;
			this.anIntArrayArray21[1][0] = 2867;
			this.anIntArrayArray21[1][1] = 2313;
			this.anIntArrayArray21[2][0] = 3072;
			this.anIntArrayArray21[3][0] = 3276;
			this.anIntArrayArray21[0][2] = 2602;
			this.anIntArrayArray21[4][0] = 3481;
			this.anIntArrayArray21[2][1] = 2618;
			this.anIntArrayArray21[3][1] = 2296;
			this.anIntArrayArray21[5][0] = 3686;
			this.anIntArrayArray21[4][1] = 2072;
			this.anIntArrayArray21[1][2] = 1799;
			this.anIntArrayArray21[3][3] = 947;
			this.anIntArrayArray21[6][0] = 3891;
			this.anIntArrayArray21[5][1] = 2730;
			this.anIntArrayArray21[2][2] = 1734;
			this.anIntArrayArray21[4][3] = 722;
			this.anIntArrayArray21[6][1] = 2232;
			this.anIntArrayArray21[3][2] = 1220;
			this.anIntArrayArray21[5][3] = 1766;
			this.anIntArrayArray21[6][3] = 915;
			this.anIntArrayArray21[7][0] = 4096;
			this.anIntArrayArray21[7][1] = 1686;
			this.anIntArrayArray21[7][3] = 1140;
			this.anIntArrayArray21[4][2] = 963;
			this.anIntArrayArray21[5][2] = 2152;
			this.anIntArrayArray21[6][2] = 1060;
			this.anIntArrayArray21[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray21 = new int[7][4];
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[0][2] = 0;
			this.anIntArrayArray21[0][3] = 4096;
			this.anIntArrayArray21[1][2] = 4096;
			this.anIntArrayArray21[1][3] = 4096;
			this.anIntArrayArray21[0][1] = 0;
			this.anIntArrayArray21[2][3] = 0;
			this.anIntArrayArray21[2][2] = 4096;
			this.anIntArrayArray21[3][3] = 0;
			this.anIntArrayArray21[3][2] = 4096;
			this.anIntArrayArray21[1][0] = 663;
			this.anIntArrayArray21[4][2] = 0;
			this.anIntArrayArray21[2][0] = 1363;
			this.anIntArrayArray21[3][0] = 2048;
			this.anIntArrayArray21[4][0] = 2727;
			this.anIntArrayArray21[5][0] = 3411;
			this.anIntArrayArray21[5][2] = 0;
			this.anIntArrayArray21[1][1] = 0;
			this.anIntArrayArray21[6][0] = 4096;
			this.anIntArrayArray21[6][2] = 0;
			this.anIntArrayArray21[2][1] = 0;
			this.anIntArrayArray21[4][3] = 0;
			this.anIntArrayArray21[5][3] = 4096;
			this.anIntArrayArray21[3][1] = 4096;
			this.anIntArrayArray21[4][1] = 4096;
			this.anIntArrayArray21[5][1] = 4096;
			this.anIntArrayArray21[6][1] = 0;
			this.anIntArrayArray21[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray21 = new int[6][4];
			this.anIntArrayArray21[0][1] = 0;
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[0][2] = 0;
			this.anIntArrayArray21[1][1] = 0;
			this.anIntArrayArray21[2][1] = 0;
			this.anIntArrayArray21[1][0] = 1843;
			this.anIntArrayArray21[1][2] = 0;
			this.anIntArrayArray21[3][1] = 0;
			this.anIntArrayArray21[4][1] = 546;
			this.anIntArrayArray21[5][1] = 4096;
			this.anIntArrayArray21[2][2] = 0;
			this.anIntArrayArray21[0][3] = 0;
			this.anIntArrayArray21[3][2] = 1124;
			this.anIntArrayArray21[2][0] = 2457;
			this.anIntArrayArray21[3][0] = 2781;
			this.anIntArrayArray21[1][3] = 1493;
			this.anIntArrayArray21[2][3] = 2939;
			this.anIntArrayArray21[4][0] = 3481;
			this.anIntArrayArray21[3][3] = 3565;
			this.anIntArrayArray21[4][2] = 3084;
			this.anIntArrayArray21[4][3] = 4031;
			this.anIntArrayArray21[5][0] = 4096;
			this.anIntArrayArray21[5][3] = 4096;
			this.anIntArrayArray21[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray21 = new int[16][4];
			this.anIntArrayArray21[0][0] = 0;
			this.anIntArrayArray21[0][3] = 321;
			this.anIntArrayArray21[1][0] = 155;
			this.anIntArrayArray21[2][0] = 389;
			this.anIntArrayArray21[1][3] = 562;
			this.anIntArrayArray21[3][0] = 671;
			this.anIntArrayArray21[0][1] = 80;
			this.anIntArrayArray21[2][3] = 803;
			this.anIntArrayArray21[4][0] = 897;
			this.anIntArrayArray21[0][2] = 192;
			this.anIntArrayArray21[3][3] = 1140;
			this.anIntArrayArray21[1][1] = 321;
			this.anIntArrayArray21[2][1] = 578;
			this.anIntArrayArray21[3][1] = 947;
			this.anIntArrayArray21[1][2] = 449;
			this.anIntArrayArray21[4][1] = 1285;
			this.anIntArrayArray21[5][1] = 1525;
			this.anIntArrayArray21[4][3] = 1509;
			this.anIntArrayArray21[6][1] = 1734;
			this.anIntArrayArray21[5][3] = 1413;
			this.anIntArrayArray21[2][2] = 690;
			this.anIntArrayArray21[3][2] = 995;
			this.anIntArrayArray21[7][1] = 1413;
			this.anIntArrayArray21[4][2] = 1397;
			this.anIntArrayArray21[5][0] = 1175;
			this.anIntArrayArray21[6][3] = 1333;
			this.anIntArrayArray21[6][0] = 1368;
			this.anIntArrayArray21[7][0] = 1507;
			this.anIntArrayArray21[8][1] = 1108;
			this.anIntArrayArray21[5][2] = 1429;
			this.anIntArrayArray21[8][0] = 1736;
			this.anIntArrayArray21[6][2] = 1461;
			this.anIntArrayArray21[9][0] = 2088;
			this.anIntArrayArray21[9][1] = 1766;
			this.anIntArrayArray21[10][1] = 2409;
			this.anIntArrayArray21[11][1] = 3116;
			this.anIntArrayArray21[10][0] = 2355;
			this.anIntArrayArray21[7][3] = 1702;
			this.anIntArrayArray21[12][1] = 3806;
			this.anIntArrayArray21[8][3] = 2056;
			this.anIntArrayArray21[13][1] = 3437;
			this.anIntArrayArray21[9][3] = 2666;
			this.anIntArrayArray21[7][2] = 1525;
			this.anIntArrayArray21[10][3] = 3276;
			this.anIntArrayArray21[11][3] = 3228;
			this.anIntArrayArray21[8][2] = 1590;
			this.anIntArrayArray21[12][3] = 3196;
			this.anIntArrayArray21[11][0] = 2691;
			this.anIntArrayArray21[14][1] = 3116;
			this.anIntArrayArray21[13][3] = 3019;
			this.anIntArrayArray21[9][2] = 2056;
			this.anIntArrayArray21[12][0] = 3031;
			this.anIntArrayArray21[13][0] = 3522;
			this.anIntArrayArray21[14][3] = 3228;
			this.anIntArrayArray21[14][0] = 3727;
			this.anIntArrayArray21[15][0] = 4096;
			this.anIntArrayArray21[15][3] = 2746;
			this.anIntArrayArray21[10][2] = 2586;
			this.anIntArrayArray21[11][2] = 3148;
			this.anIntArrayArray21[15][1] = 2377;
			this.anIntArrayArray21[12][2] = 3710;
			this.anIntArrayArray21[13][2] = 3421;
			this.anIntArrayArray21[14][2] = 3148;
			this.anIntArrayArray21[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray21 = new int[4][4];
			this.anIntArrayArray21[0][0] = 2048;
			this.anIntArrayArray21[0][1] = 0;
			this.anIntArrayArray21[0][2] = 4096;
			this.anIntArrayArray21[0][3] = 0;
			this.anIntArrayArray21[1][2] = 4096;
			this.anIntArrayArray21[2][2] = 4096;
			this.anIntArrayArray21[1][1] = 4096;
			this.anIntArrayArray21[1][0] = 2867;
			this.anIntArrayArray21[2][1] = 4096;
			this.anIntArrayArray21[3][1] = 4096;
			this.anIntArrayArray21[1][3] = 0;
			this.anIntArrayArray21[2][3] = 0;
			this.anIntArrayArray21[3][2] = 0;
			this.anIntArrayArray21[2][0] = 3276;
			this.anIntArrayArray21[3][0] = 4096;
			this.anIntArrayArray21[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(28) int[] local28 = this.method4716(0, arg0);
			@Pc(32) int[] local32 = local18[1];
			@Pc(36) int[] local36 = local18[0];
			@Pc(40) int[] local40 = local18[2];
			for (@Pc(42) int local42 = 0; local42 < Static62.anInt1350; local42++) {
				@Pc(55) int local55 = local28[local42] >> 4;
				if (local55 < 0) {
					local55 = 0;
				}
				if (local55 > 256) {
					local55 = 256;
				}
				local55 = this.anIntArray142[local55];
				local36[local42] = local55 >> 12 & 0xFF0;
				local32[local42] = local55 >> 4 & 0xFF0;
				local40[local42] = (local55 & 0xFF) << 4;
			}
		}
		return local18;
	}
}
