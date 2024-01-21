import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uf", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!uf", name = "hb", descriptor = "[I")
	private final int[] anIntArray330 = new int[257];

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(28) int[] local28 = this.method3393(arg0, 0);
			@Pc(32) int[] local32 = local18[0];
			@Pc(36) int[] local36 = local18[1];
			@Pc(40) int[] local40 = local18[2];
			for (@Pc(42) int local42 = 0; local42 < Static107.anInt2321; local42++) {
				@Pc(50) int local50 = local28[local42] >> 4;
				if (local50 < 0) {
					local50 = 0;
				}
				if (local50 > 256) {
					local50 = 256;
				}
				local50 = this.anIntArray330[local50];
				local32[local42] = local50 >> 12 & 0xFF0;
				local36[local42] = local50 >> 4 & 0xFF0;
				local40[local42] = (local50 & 0xFF) << 4;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(19) int local19 = arg0.method3010();
		if (local19 != 0) {
			this.method3112(local19);
			return;
		}
		this.anIntArrayArray28 = new int[arg0.method3010()][4];
		for (@Pc(35) int local35 = 0; local35 < this.anIntArrayArray28.length; local35++) {
			this.anIntArrayArray28[local35][0] = arg0.method3023();
			this.anIntArrayArray28[local35][1] = arg0.method3010() << 4;
			this.anIntArrayArray28[local35][2] = arg0.method3010() << 4;
			this.anIntArrayArray28[local35][3] = arg0.method3010() << 4;
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V")
	private void method3111() {
		@Pc(9) int local9 = this.anIntArrayArray28.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 257; local16++) {
			@Pc(22) int local22 = local16 << 4;
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local9 > local26 && this.anIntArrayArray28[local26][0] <= local22; local26++) {
				local24++;
			}
			@Pc(67) int local67;
			@Pc(59) int local59;
			@Pc(63) int local63;
			@Pc(55) int[] local55;
			if (local9 <= local24) {
				local55 = this.anIntArrayArray28[local9 - 1];
				local59 = local55[2];
				local63 = local55[3];
				local67 = local55[1];
			} else {
				local55 = this.anIntArrayArray28[local24];
				if (local24 > 0) {
					@Pc(83) int[] local83 = this.anIntArrayArray28[local24 - 1];
					@Pc(100) int local100 = (local22 - local83[0] << 12) / (local55[0] - local83[0]);
					@Pc(105) int local105 = 4096 - local100;
					local67 = local55[1] * local100 + local105 * local83[1] >> 12;
					local63 = local83[3] * local105 + local100 * local55[3] >> 12;
					local59 = local100 * local55[2] + local83[2] * local105 >> 12;
				} else {
					local67 = local55[1];
					local63 = local55[3];
					local59 = local55[2];
				}
			}
			local59 >>= 0x4;
			local63 >>= 0x4;
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			local67 >>= 0x4;
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
			this.anIntArray330[local16] = local59 << 8 | local67 << 16 | local63;
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V")
	private void method3112(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray28 = new int[2][4];
			this.anIntArrayArray28[0][3] = 0;
			this.anIntArrayArray28[0][2] = 0;
			this.anIntArrayArray28[0][1] = 0;
			this.anIntArrayArray28[1][3] = 4096;
			this.anIntArrayArray28[1][2] = 4096;
			this.anIntArrayArray28[1][1] = 4096;
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray28 = new int[8][4];
			this.anIntArrayArray28[0][3] = 2361;
			this.anIntArrayArray28[0][1] = 2650;
			this.anIntArrayArray28[0][2] = 2602;
			this.anIntArrayArray28[1][3] = 1558;
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[1][0] = 2867;
			this.anIntArrayArray28[2][0] = 3072;
			this.anIntArrayArray28[3][0] = 3276;
			this.anIntArrayArray28[1][1] = 2313;
			this.anIntArrayArray28[2][3] = 1413;
			this.anIntArrayArray28[3][3] = 947;
			this.anIntArrayArray28[2][1] = 2618;
			this.anIntArrayArray28[1][2] = 1799;
			this.anIntArrayArray28[2][2] = 1734;
			this.anIntArrayArray28[4][3] = 722;
			this.anIntArrayArray28[3][1] = 2296;
			this.anIntArrayArray28[4][1] = 2072;
			this.anIntArrayArray28[5][3] = 1766;
			this.anIntArrayArray28[5][1] = 2730;
			this.anIntArrayArray28[6][1] = 2232;
			this.anIntArrayArray28[4][0] = 3481;
			this.anIntArrayArray28[3][2] = 1220;
			this.anIntArrayArray28[5][0] = 3686;
			this.anIntArrayArray28[4][2] = 963;
			this.anIntArrayArray28[5][2] = 2152;
			this.anIntArrayArray28[6][3] = 915;
			this.anIntArrayArray28[7][1] = 1686;
			this.anIntArrayArray28[7][3] = 1140;
			this.anIntArrayArray28[6][2] = 1060;
			this.anIntArrayArray28[7][2] = 1413;
			this.anIntArrayArray28[6][0] = 3891;
			this.anIntArrayArray28[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray28 = new int[7][4];
			this.anIntArrayArray28[0][3] = 4096;
			this.anIntArrayArray28[0][1] = 0;
			this.anIntArrayArray28[1][1] = 0;
			this.anIntArrayArray28[1][3] = 4096;
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[0][2] = 0;
			this.anIntArrayArray28[2][3] = 0;
			this.anIntArrayArray28[1][2] = 4096;
			this.anIntArrayArray28[1][0] = 663;
			this.anIntArrayArray28[2][2] = 4096;
			this.anIntArrayArray28[2][1] = 0;
			this.anIntArrayArray28[3][1] = 4096;
			this.anIntArrayArray28[3][3] = 0;
			this.anIntArrayArray28[4][1] = 4096;
			this.anIntArrayArray28[3][2] = 4096;
			this.anIntArrayArray28[4][2] = 0;
			this.anIntArrayArray28[2][0] = 1363;
			this.anIntArrayArray28[5][1] = 4096;
			this.anIntArrayArray28[6][1] = 0;
			this.anIntArrayArray28[4][3] = 0;
			this.anIntArrayArray28[5][2] = 0;
			this.anIntArrayArray28[5][3] = 4096;
			this.anIntArrayArray28[6][3] = 4096;
			this.anIntArrayArray28[6][2] = 0;
			this.anIntArrayArray28[3][0] = 2048;
			this.anIntArrayArray28[4][0] = 2727;
			this.anIntArrayArray28[5][0] = 3411;
			this.anIntArrayArray28[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray28 = new int[6][4];
			this.anIntArrayArray28[0][3] = 0;
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[0][1] = 0;
			this.anIntArrayArray28[1][3] = 1493;
			this.anIntArrayArray28[0][2] = 0;
			this.anIntArrayArray28[1][0] = 1843;
			this.anIntArrayArray28[2][0] = 2457;
			this.anIntArrayArray28[1][1] = 0;
			this.anIntArrayArray28[2][1] = 0;
			this.anIntArrayArray28[3][0] = 2781;
			this.anIntArrayArray28[3][1] = 0;
			this.anIntArrayArray28[2][3] = 2939;
			this.anIntArrayArray28[4][1] = 546;
			this.anIntArrayArray28[3][3] = 3565;
			this.anIntArrayArray28[4][0] = 3481;
			this.anIntArrayArray28[4][3] = 4031;
			this.anIntArrayArray28[5][3] = 4096;
			this.anIntArrayArray28[5][0] = 4096;
			this.anIntArrayArray28[1][2] = 0;
			this.anIntArrayArray28[5][1] = 4096;
			this.anIntArrayArray28[2][2] = 0;
			this.anIntArrayArray28[3][2] = 1124;
			this.anIntArrayArray28[4][2] = 3084;
			this.anIntArrayArray28[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray28 = new int[16][4];
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[0][2] = 192;
			this.anIntArrayArray28[1][2] = 449;
			this.anIntArrayArray28[0][3] = 321;
			this.anIntArrayArray28[1][3] = 562;
			this.anIntArrayArray28[0][1] = 80;
			this.anIntArrayArray28[1][1] = 321;
			this.anIntArrayArray28[1][0] = 155;
			this.anIntArrayArray28[2][0] = 389;
			this.anIntArrayArray28[3][0] = 671;
			this.anIntArrayArray28[2][3] = 803;
			this.anIntArrayArray28[3][3] = 1140;
			this.anIntArrayArray28[2][2] = 690;
			this.anIntArrayArray28[3][2] = 995;
			this.anIntArrayArray28[2][1] = 578;
			this.anIntArrayArray28[4][3] = 1509;
			this.anIntArrayArray28[5][3] = 1413;
			this.anIntArrayArray28[4][0] = 897;
			this.anIntArrayArray28[3][1] = 947;
			this.anIntArrayArray28[4][1] = 1285;
			this.anIntArrayArray28[5][0] = 1175;
			this.anIntArrayArray28[5][1] = 1525;
			this.anIntArrayArray28[4][2] = 1397;
			this.anIntArrayArray28[6][1] = 1734;
			this.anIntArrayArray28[5][2] = 1429;
			this.anIntArrayArray28[7][1] = 1413;
			this.anIntArrayArray28[6][2] = 1461;
			this.anIntArrayArray28[6][3] = 1333;
			this.anIntArrayArray28[8][1] = 1108;
			this.anIntArrayArray28[7][2] = 1525;
			this.anIntArrayArray28[8][2] = 1590;
			this.anIntArrayArray28[9][1] = 1766;
			this.anIntArrayArray28[9][2] = 2056;
			this.anIntArrayArray28[10][1] = 2409;
			this.anIntArrayArray28[7][3] = 1702;
			this.anIntArrayArray28[11][1] = 3116;
			this.anIntArrayArray28[12][1] = 3806;
			this.anIntArrayArray28[6][0] = 1368;
			this.anIntArrayArray28[8][3] = 2056;
			this.anIntArrayArray28[7][0] = 1507;
			this.anIntArrayArray28[13][1] = 3437;
			this.anIntArrayArray28[14][1] = 3116;
			this.anIntArrayArray28[15][1] = 2377;
			this.anIntArrayArray28[9][3] = 2666;
			this.anIntArrayArray28[8][0] = 1736;
			this.anIntArrayArray28[9][0] = 2088;
			this.anIntArrayArray28[10][2] = 2586;
			this.anIntArrayArray28[11][2] = 3148;
			this.anIntArrayArray28[10][0] = 2355;
			this.anIntArrayArray28[12][2] = 3710;
			this.anIntArrayArray28[10][3] = 3276;
			this.anIntArrayArray28[11][3] = 3228;
			this.anIntArrayArray28[11][0] = 2691;
			this.anIntArrayArray28[13][2] = 3421;
			this.anIntArrayArray28[12][0] = 3031;
			this.anIntArrayArray28[13][0] = 3522;
			this.anIntArrayArray28[14][2] = 3148;
			this.anIntArrayArray28[15][2] = 2505;
			this.anIntArrayArray28[14][0] = 3727;
			this.anIntArrayArray28[12][3] = 3196;
			this.anIntArrayArray28[15][0] = 4096;
			this.anIntArrayArray28[13][3] = 3019;
			this.anIntArrayArray28[14][3] = 3228;
			this.anIntArrayArray28[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray28 = new int[4][4];
			this.anIntArrayArray28[0][0] = 2048;
			this.anIntArrayArray28[0][1] = 0;
			this.anIntArrayArray28[1][1] = 4096;
			this.anIntArrayArray28[1][0] = 2867;
			this.anIntArrayArray28[2][0] = 3276;
			this.anIntArrayArray28[0][2] = 4096;
			this.anIntArrayArray28[1][2] = 4096;
			this.anIntArrayArray28[0][3] = 0;
			this.anIntArrayArray28[1][3] = 0;
			this.anIntArrayArray28[2][3] = 0;
			this.anIntArrayArray28[2][1] = 4096;
			this.anIntArrayArray28[3][3] = 0;
			this.anIntArrayArray28[3][1] = 4096;
			this.anIntArrayArray28[3][0] = 4096;
			this.anIntArrayArray28[2][2] = 4096;
			this.anIntArrayArray28[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
		if (this.anIntArrayArray28 == null) {
			this.method3112(1);
		}
		this.method3111();
	}
}
