import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "[I")
	private int[] anIntArray183 = new int[257];

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(14) int local14 = arg0.method895();
		if (local14 != 0) {
			this.method1151(local14);
			return;
		}
		this.anIntArrayArray22 = new int[arg0.method895()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray22.length; local31++) {
			this.anIntArrayArray22[local31][0] = arg0.method946();
			this.anIntArrayArray22[local31][1] = arg0.method895() << 4;
			this.anIntArrayArray22[local31][2] = arg0.method895() << 4;
			this.anIntArrayArray22[local31][3] = arg0.method895() << 4;
		}
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(B)V")
	private void method1150() {
		@Pc(17) int local17 = this.anIntArrayArray22.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = local24 << 4;
			for (@Pc(34) int local34 = 0; local17 > local34 && this.anIntArrayArray22[local34][0] <= local32; local34++) {
				local28++;
			}
			@Pc(79) int local79;
			@Pc(71) int local71;
			@Pc(75) int local75;
			@Pc(67) int[] local67;
			if (local28 >= local17) {
				local67 = this.anIntArrayArray22[local17 - 1];
				local71 = local67[2];
				local75 = local67[3];
				local79 = local67[1];
			} else {
				local67 = this.anIntArrayArray22[local28];
				if (local28 <= 0) {
					local71 = local67[2];
					local79 = local67[1];
					local75 = local67[3];
				} else {
					@Pc(109) int[] local109 = this.anIntArrayArray22[local28 - 1];
					@Pc(126) int local126 = (local32 - local109[0] << 12) / (local67[0] - local109[0]);
					@Pc(130) int local130 = 4096 - local126;
					local79 = local130 * local109[1] + local67[1] * local126 >> 12;
					local75 = local67[3] * local126 + local130 * local109[3] >> 12;
					local71 = local109[2] * local130 + local126 * local67[2] >> 12;
				}
			}
			local75 >>= 0x4;
			local71 >>= 0x4;
			local79 >>= 0x4;
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 > 255) {
				local79 = 255;
			}
			if (local71 < 0) {
				local71 = 0;
			} else if (local71 > 255) {
				local71 = 255;
			}
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 > 255) {
				local75 = 255;
			}
			this.anIntArray183[local24] = local75 | local71 << 8 | local79 << 16;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V")
	private void method1151(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray22 = new int[2][4];
			this.anIntArrayArray22[0][1] = 0;
			this.anIntArrayArray22[0][3] = 0;
			this.anIntArrayArray22[1][1] = 4096;
			this.anIntArrayArray22[0][0] = 0;
			this.anIntArrayArray22[1][0] = 4096;
			this.anIntArrayArray22[1][3] = 4096;
			this.anIntArrayArray22[0][2] = 0;
			this.anIntArrayArray22[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray22 = new int[8][4];
			this.anIntArrayArray22[0][2] = 2602;
			this.anIntArrayArray22[0][0] = 0;
			this.anIntArrayArray22[1][2] = 1799;
			this.anIntArrayArray22[2][2] = 1734;
			this.anIntArrayArray22[0][3] = 2361;
			this.anIntArrayArray22[3][2] = 1220;
			this.anIntArrayArray22[4][2] = 963;
			this.anIntArrayArray22[0][1] = 2650;
			this.anIntArrayArray22[1][0] = 2867;
			this.anIntArrayArray22[5][2] = 2152;
			this.anIntArrayArray22[1][1] = 2313;
			this.anIntArrayArray22[1][3] = 1558;
			this.anIntArrayArray22[2][0] = 3072;
			this.anIntArrayArray22[6][2] = 1060;
			this.anIntArrayArray22[2][1] = 2618;
			this.anIntArrayArray22[3][0] = 3276;
			this.anIntArrayArray22[3][1] = 2296;
			this.anIntArrayArray22[7][2] = 1413;
			this.anIntArrayArray22[4][0] = 3481;
			this.anIntArrayArray22[4][1] = 2072;
			this.anIntArrayArray22[5][0] = 3686;
			this.anIntArrayArray22[6][0] = 3891;
			this.anIntArrayArray22[5][1] = 2730;
			this.anIntArrayArray22[2][3] = 1413;
			this.anIntArrayArray22[6][1] = 2232;
			this.anIntArrayArray22[3][3] = 947;
			this.anIntArrayArray22[7][0] = 4096;
			this.anIntArrayArray22[7][1] = 1686;
			this.anIntArrayArray22[4][3] = 722;
			this.anIntArrayArray22[5][3] = 1766;
			this.anIntArrayArray22[6][3] = 915;
			this.anIntArrayArray22[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray22 = new int[7][4];
			this.anIntArrayArray22[0][2] = 0;
			this.anIntArrayArray22[1][2] = 4096;
			this.anIntArrayArray22[2][2] = 4096;
			this.anIntArrayArray22[0][3] = 4096;
			this.anIntArrayArray22[3][2] = 4096;
			this.anIntArrayArray22[0][1] = 0;
			this.anIntArrayArray22[4][2] = 0;
			this.anIntArrayArray22[5][2] = 0;
			this.anIntArrayArray22[1][1] = 0;
			this.anIntArrayArray22[2][1] = 0;
			this.anIntArrayArray22[6][2] = 0;
			this.anIntArrayArray22[0][0] = 0;
			this.anIntArrayArray22[3][1] = 4096;
			this.anIntArrayArray22[1][3] = 4096;
			this.anIntArrayArray22[4][1] = 4096;
			this.anIntArrayArray22[5][1] = 4096;
			this.anIntArrayArray22[2][3] = 0;
			this.anIntArrayArray22[6][1] = 0;
			this.anIntArrayArray22[1][0] = 663;
			this.anIntArrayArray22[2][0] = 1363;
			this.anIntArrayArray22[3][0] = 2048;
			this.anIntArrayArray22[4][0] = 2727;
			this.anIntArrayArray22[3][3] = 0;
			this.anIntArrayArray22[4][3] = 0;
			this.anIntArrayArray22[5][0] = 3411;
			this.anIntArrayArray22[6][0] = 4096;
			this.anIntArrayArray22[5][3] = 4096;
			this.anIntArrayArray22[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray22 = new int[6][4];
			this.anIntArrayArray22[0][3] = 0;
			this.anIntArrayArray22[0][0] = 0;
			this.anIntArrayArray22[0][2] = 0;
			this.anIntArrayArray22[0][1] = 0;
			this.anIntArrayArray22[1][0] = 1843;
			this.anIntArrayArray22[1][2] = 0;
			this.anIntArrayArray22[1][3] = 1493;
			this.anIntArrayArray22[2][3] = 2939;
			this.anIntArrayArray22[2][2] = 0;
			this.anIntArrayArray22[3][2] = 1124;
			this.anIntArrayArray22[4][2] = 3084;
			this.anIntArrayArray22[3][3] = 3565;
			this.anIntArrayArray22[5][2] = 4096;
			this.anIntArrayArray22[1][1] = 0;
			this.anIntArrayArray22[4][3] = 4031;
			this.anIntArrayArray22[2][0] = 2457;
			this.anIntArrayArray22[5][3] = 4096;
			this.anIntArrayArray22[3][0] = 2781;
			this.anIntArrayArray22[4][0] = 3481;
			this.anIntArrayArray22[5][0] = 4096;
			this.anIntArrayArray22[2][1] = 0;
			this.anIntArrayArray22[3][1] = 0;
			this.anIntArrayArray22[4][1] = 546;
			this.anIntArrayArray22[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray22 = new int[16][4];
			this.anIntArrayArray22[0][2] = 192;
			this.anIntArrayArray22[0][3] = 321;
			this.anIntArrayArray22[0][0] = 0;
			this.anIntArrayArray22[1][3] = 562;
			this.anIntArrayArray22[2][3] = 803;
			this.anIntArrayArray22[1][0] = 155;
			this.anIntArrayArray22[0][1] = 80;
			this.anIntArrayArray22[3][3] = 1140;
			this.anIntArrayArray22[1][1] = 321;
			this.anIntArrayArray22[2][0] = 389;
			this.anIntArrayArray22[3][0] = 671;
			this.anIntArrayArray22[4][0] = 897;
			this.anIntArrayArray22[2][1] = 578;
			this.anIntArrayArray22[3][1] = 947;
			this.anIntArrayArray22[4][1] = 1285;
			this.anIntArrayArray22[5][0] = 1175;
			this.anIntArrayArray22[4][3] = 1509;
			this.anIntArrayArray22[5][3] = 1413;
			this.anIntArrayArray22[6][3] = 1333;
			this.anIntArrayArray22[5][1] = 1525;
			this.anIntArrayArray22[6][0] = 1368;
			this.anIntArrayArray22[7][3] = 1702;
			this.anIntArrayArray22[6][1] = 1734;
			this.anIntArrayArray22[7][1] = 1413;
			this.anIntArrayArray22[1][2] = 449;
			this.anIntArrayArray22[2][2] = 690;
			this.anIntArrayArray22[8][1] = 1108;
			this.anIntArrayArray22[7][0] = 1507;
			this.anIntArrayArray22[8][0] = 1736;
			this.anIntArrayArray22[8][3] = 2056;
			this.anIntArrayArray22[9][0] = 2088;
			this.anIntArrayArray22[9][1] = 1766;
			this.anIntArrayArray22[10][1] = 2409;
			this.anIntArrayArray22[11][1] = 3116;
			this.anIntArrayArray22[9][3] = 2666;
			this.anIntArrayArray22[3][2] = 995;
			this.anIntArrayArray22[10][0] = 2355;
			this.anIntArrayArray22[4][2] = 1397;
			this.anIntArrayArray22[12][1] = 3806;
			this.anIntArrayArray22[13][1] = 3437;
			this.anIntArrayArray22[11][0] = 2691;
			this.anIntArrayArray22[5][2] = 1429;
			this.anIntArrayArray22[12][0] = 3031;
			this.anIntArrayArray22[10][3] = 3276;
			this.anIntArrayArray22[13][0] = 3522;
			this.anIntArrayArray22[14][1] = 3116;
			this.anIntArrayArray22[11][3] = 3228;
			this.anIntArrayArray22[14][0] = 3727;
			this.anIntArrayArray22[6][2] = 1461;
			this.anIntArrayArray22[15][1] = 2377;
			this.anIntArrayArray22[12][3] = 3196;
			this.anIntArrayArray22[7][2] = 1525;
			this.anIntArrayArray22[15][0] = 4096;
			this.anIntArrayArray22[8][2] = 1590;
			this.anIntArrayArray22[9][2] = 2056;
			this.anIntArrayArray22[13][3] = 3019;
			this.anIntArrayArray22[10][2] = 2586;
			this.anIntArrayArray22[11][2] = 3148;
			this.anIntArrayArray22[12][2] = 3710;
			this.anIntArrayArray22[13][2] = 3421;
			this.anIntArrayArray22[14][2] = 3148;
			this.anIntArrayArray22[15][2] = 2505;
			this.anIntArrayArray22[14][3] = 3228;
			this.anIntArrayArray22[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray22 = new int[4][4];
			this.anIntArrayArray22[0][0] = 2048;
			this.anIntArrayArray22[0][2] = 4096;
			this.anIntArrayArray22[1][0] = 2867;
			this.anIntArrayArray22[0][1] = 0;
			this.anIntArrayArray22[1][1] = 4096;
			this.anIntArrayArray22[0][3] = 0;
			this.anIntArrayArray22[2][0] = 3276;
			this.anIntArrayArray22[3][0] = 4096;
			this.anIntArrayArray22[1][3] = 0;
			this.anIntArrayArray22[2][1] = 4096;
			this.anIntArrayArray22[3][1] = 4096;
			this.anIntArrayArray22[2][3] = 0;
			this.anIntArrayArray22[1][2] = 4096;
			this.anIntArrayArray22[2][2] = 4096;
			this.anIntArrayArray22[3][3] = 0;
			this.anIntArrayArray22[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
		if (this.anIntArrayArray22 == null) {
			this.method1151(1);
		}
		this.method1150();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(21) int[] local21 = this.method3514(arg0, 0);
			@Pc(25) int[] local25 = local11[2];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[0];
			for (@Pc(35) int local35 = 0; local35 < Static105.anInt2391; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray183[local43];
				local33[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local25[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
