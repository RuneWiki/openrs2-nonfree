import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class1_Sub3_Sub25 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "[I")
	private int[] anIntArray333 = new int[257];

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
	private void method2978() {
		@Pc(17) int local17 = this.anIntArrayArray17.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(29) int local29 = 0;
			@Pc(33) int local33 = local24 << 4;
			for (@Pc(35) int local35 = 0; local35 < local17 && local33 >= this.anIntArrayArray17[local35][0]; local35++) {
				local29++;
			}
			@Pc(80) int local80;
			@Pc(72) int local72;
			@Pc(76) int local76;
			@Pc(68) int[] local68;
			if (local29 >= local17) {
				local68 = this.anIntArrayArray17[local17 - 1];
				local72 = local68[2];
				local76 = local68[3];
				local80 = local68[1];
			} else {
				local68 = this.anIntArrayArray17[local29];
				if (local29 > 0) {
					@Pc(95) int[] local95 = this.anIntArrayArray17[local29 - 1];
					@Pc(112) int local112 = (local33 - local95[0] << 12) / (local68[0] - local95[0]);
					@Pc(117) int local117 = 4096 - local112;
					local76 = local68[3] * local112 + local95[3] * local117 >> 12;
					local72 = local117 * local95[2] + local112 * local68[2] >> 12;
					local80 = local112 * local68[1] + local117 * local95[1] >> 12;
				} else {
					local80 = local68[1];
					local76 = local68[3];
					local72 = local68[2];
				}
			}
			local72 >>= 0x4;
			local80 >>= 0x4;
			if (local72 < 0) {
				local72 = 0;
			} else if (local72 > 255) {
				local72 = 255;
			}
			if (local80 < 0) {
				local80 = 0;
			} else if (local80 > 255) {
				local80 = 255;
			}
			local76 >>= 0x4;
			if (local76 < 0) {
				local76 = 0;
			} else if (local76 > 255) {
				local76 = 255;
			}
			this.anIntArray333[local24] = local80 << 16 | local72 << 8 | local76;
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
		if (this.anIntArrayArray17 == null) {
			this.method2985(1);
		}
		this.method2978();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(30) int[] local30 = this.method4450(0, arg0);
			@Pc(34) int[] local34 = local15[0];
			@Pc(38) int[] local38 = local15[2];
			@Pc(42) int[] local42 = local15[1];
			for (@Pc(44) int local44 = 0; local44 < Static227.anInt4511; local44++) {
				@Pc(57) int local57 = local30[local44] >> 4;
				if (local57 < 0) {
					local57 = 0;
				}
				if (local57 > 256) {
					local57 = 256;
				}
				local57 = this.anIntArray333[local57];
				local34[local44] = local57 >> 12 & 0xFF0;
				local42[local44] = local57 >> 4 & 0xFF0;
				local38[local44] = (local57 & 0xFF) << 4;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(14) int local14 = arg0.method2690();
		if (local14 != 0) {
			this.method2985(local14);
			return;
		}
		this.anIntArrayArray17 = new int[arg0.method2690()][4];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray17.length; local26++) {
			this.anIntArrayArray17[local26][0] = arg0.method2691();
			this.anIntArrayArray17[local26][1] = arg0.method2690() << 4;
			this.anIntArrayArray17[local26][2] = arg0.method2690() << 4;
			this.anIntArrayArray17[local26][3] = arg0.method2690() << 4;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
	private void method2985(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray17 = new int[2][4];
			this.anIntArrayArray17[0][3] = 0;
			this.anIntArrayArray17[0][1] = 0;
			this.anIntArrayArray17[1][1] = 4096;
			this.anIntArrayArray17[0][0] = 0;
			this.anIntArrayArray17[1][0] = 4096;
			this.anIntArrayArray17[1][3] = 4096;
			this.anIntArrayArray17[0][2] = 0;
			this.anIntArrayArray17[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray17 = new int[8][4];
			this.anIntArrayArray17[0][3] = 2361;
			this.anIntArrayArray17[1][3] = 1558;
			this.anIntArrayArray17[0][1] = 2650;
			this.anIntArrayArray17[0][2] = 2602;
			this.anIntArrayArray17[1][1] = 2313;
			this.anIntArrayArray17[2][1] = 2618;
			this.anIntArrayArray17[2][3] = 1413;
			this.anIntArrayArray17[3][1] = 2296;
			this.anIntArrayArray17[4][1] = 2072;
			this.anIntArrayArray17[0][0] = 0;
			this.anIntArrayArray17[1][0] = 2867;
			this.anIntArrayArray17[5][1] = 2730;
			this.anIntArrayArray17[1][2] = 1799;
			this.anIntArrayArray17[6][1] = 2232;
			this.anIntArrayArray17[2][2] = 1734;
			this.anIntArrayArray17[2][0] = 3072;
			this.anIntArrayArray17[3][0] = 3276;
			this.anIntArrayArray17[4][0] = 3481;
			this.anIntArrayArray17[3][3] = 947;
			this.anIntArrayArray17[3][2] = 1220;
			this.anIntArrayArray17[4][3] = 722;
			this.anIntArrayArray17[5][0] = 3686;
			this.anIntArrayArray17[7][1] = 1686;
			this.anIntArrayArray17[6][0] = 3891;
			this.anIntArrayArray17[7][0] = 4096;
			this.anIntArrayArray17[4][2] = 963;
			this.anIntArrayArray17[5][2] = 2152;
			this.anIntArrayArray17[6][2] = 1060;
			this.anIntArrayArray17[7][2] = 1413;
			this.anIntArrayArray17[5][3] = 1766;
			this.anIntArrayArray17[6][3] = 915;
			this.anIntArrayArray17[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray17 = new int[7][4];
			this.anIntArrayArray17[0][2] = 0;
			this.anIntArrayArray17[0][3] = 4096;
			this.anIntArrayArray17[0][1] = 0;
			this.anIntArrayArray17[1][1] = 0;
			this.anIntArrayArray17[1][2] = 4096;
			this.anIntArrayArray17[2][2] = 4096;
			this.anIntArrayArray17[3][2] = 4096;
			this.anIntArrayArray17[2][1] = 0;
			this.anIntArrayArray17[1][3] = 4096;
			this.anIntArrayArray17[3][1] = 4096;
			this.anIntArrayArray17[0][0] = 0;
			this.anIntArrayArray17[2][3] = 0;
			this.anIntArrayArray17[1][0] = 663;
			this.anIntArrayArray17[3][3] = 0;
			this.anIntArrayArray17[2][0] = 1363;
			this.anIntArrayArray17[4][1] = 4096;
			this.anIntArrayArray17[4][3] = 0;
			this.anIntArrayArray17[5][1] = 4096;
			this.anIntArrayArray17[3][0] = 2048;
			this.anIntArrayArray17[4][0] = 2727;
			this.anIntArrayArray17[5][3] = 4096;
			this.anIntArrayArray17[6][1] = 0;
			this.anIntArrayArray17[6][3] = 4096;
			this.anIntArrayArray17[5][0] = 3411;
			this.anIntArrayArray17[6][0] = 4096;
			this.anIntArrayArray17[4][2] = 0;
			this.anIntArrayArray17[5][2] = 0;
			this.anIntArrayArray17[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray17 = new int[6][4];
			this.anIntArrayArray17[0][3] = 0;
			this.anIntArrayArray17[0][0] = 0;
			this.anIntArrayArray17[0][2] = 0;
			this.anIntArrayArray17[1][2] = 0;
			this.anIntArrayArray17[1][3] = 1493;
			this.anIntArrayArray17[2][2] = 0;
			this.anIntArrayArray17[3][2] = 1124;
			this.anIntArrayArray17[0][1] = 0;
			this.anIntArrayArray17[4][2] = 3084;
			this.anIntArrayArray17[5][2] = 4096;
			this.anIntArrayArray17[1][1] = 0;
			this.anIntArrayArray17[1][0] = 1843;
			this.anIntArrayArray17[2][1] = 0;
			this.anIntArrayArray17[3][1] = 0;
			this.anIntArrayArray17[2][0] = 2457;
			this.anIntArrayArray17[2][3] = 2939;
			this.anIntArrayArray17[3][3] = 3565;
			this.anIntArrayArray17[4][3] = 4031;
			this.anIntArrayArray17[3][0] = 2781;
			this.anIntArrayArray17[5][3] = 4096;
			this.anIntArrayArray17[4][1] = 546;
			this.anIntArrayArray17[5][1] = 4096;
			this.anIntArrayArray17[4][0] = 3481;
			this.anIntArrayArray17[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray17 = new int[16][4];
			this.anIntArrayArray17[0][3] = 321;
			this.anIntArrayArray17[0][1] = 80;
			this.anIntArrayArray17[1][3] = 562;
			this.anIntArrayArray17[0][0] = 0;
			this.anIntArrayArray17[0][2] = 192;
			this.anIntArrayArray17[2][3] = 803;
			this.anIntArrayArray17[3][3] = 1140;
			this.anIntArrayArray17[4][3] = 1509;
			this.anIntArrayArray17[5][3] = 1413;
			this.anIntArrayArray17[1][2] = 449;
			this.anIntArrayArray17[2][2] = 690;
			this.anIntArrayArray17[1][1] = 321;
			this.anIntArrayArray17[3][2] = 995;
			this.anIntArrayArray17[2][1] = 578;
			this.anIntArrayArray17[4][2] = 1397;
			this.anIntArrayArray17[3][1] = 947;
			this.anIntArrayArray17[5][2] = 1429;
			this.anIntArrayArray17[6][2] = 1461;
			this.anIntArrayArray17[4][1] = 1285;
			this.anIntArrayArray17[1][0] = 155;
			this.anIntArrayArray17[2][0] = 389;
			this.anIntArrayArray17[7][2] = 1525;
			this.anIntArrayArray17[5][1] = 1525;
			this.anIntArrayArray17[6][1] = 1734;
			this.anIntArrayArray17[3][0] = 671;
			this.anIntArrayArray17[6][3] = 1333;
			this.anIntArrayArray17[4][0] = 897;
			this.anIntArrayArray17[7][1] = 1413;
			this.anIntArrayArray17[5][0] = 1175;
			this.anIntArrayArray17[6][0] = 1368;
			this.anIntArrayArray17[7][0] = 1507;
			this.anIntArrayArray17[8][0] = 1736;
			this.anIntArrayArray17[8][1] = 1108;
			this.anIntArrayArray17[8][2] = 1590;
			this.anIntArrayArray17[9][2] = 2056;
			this.anIntArrayArray17[10][2] = 2586;
			this.anIntArrayArray17[7][3] = 1702;
			this.anIntArrayArray17[11][2] = 3148;
			this.anIntArrayArray17[9][1] = 1766;
			this.anIntArrayArray17[10][1] = 2409;
			this.anIntArrayArray17[8][3] = 2056;
			this.anIntArrayArray17[9][3] = 2666;
			this.anIntArrayArray17[11][1] = 3116;
			this.anIntArrayArray17[9][0] = 2088;
			this.anIntArrayArray17[12][2] = 3710;
			this.anIntArrayArray17[12][1] = 3806;
			this.anIntArrayArray17[13][2] = 3421;
			this.anIntArrayArray17[10][3] = 3276;
			this.anIntArrayArray17[10][0] = 2355;
			this.anIntArrayArray17[11][0] = 2691;
			this.anIntArrayArray17[12][0] = 3031;
			this.anIntArrayArray17[13][0] = 3522;
			this.anIntArrayArray17[14][2] = 3148;
			this.anIntArrayArray17[14][0] = 3727;
			this.anIntArrayArray17[11][3] = 3228;
			this.anIntArrayArray17[15][2] = 2505;
			this.anIntArrayArray17[12][3] = 3196;
			this.anIntArrayArray17[13][1] = 3437;
			this.anIntArrayArray17[13][3] = 3019;
			this.anIntArrayArray17[15][0] = 4096;
			this.anIntArrayArray17[14][3] = 3228;
			this.anIntArrayArray17[14][1] = 3116;
			this.anIntArrayArray17[15][3] = 2746;
			this.anIntArrayArray17[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray17 = new int[4][4];
			this.anIntArrayArray17[0][0] = 2048;
			this.anIntArrayArray17[0][1] = 0;
			this.anIntArrayArray17[0][3] = 0;
			this.anIntArrayArray17[0][2] = 4096;
			this.anIntArrayArray17[1][2] = 4096;
			this.anIntArrayArray17[1][0] = 2867;
			this.anIntArrayArray17[1][3] = 0;
			this.anIntArrayArray17[2][3] = 0;
			this.anIntArrayArray17[2][2] = 4096;
			this.anIntArrayArray17[3][2] = 0;
			this.anIntArrayArray17[2][0] = 3276;
			this.anIntArrayArray17[3][3] = 0;
			this.anIntArrayArray17[1][1] = 4096;
			this.anIntArrayArray17[2][1] = 4096;
			this.anIntArrayArray17[3][1] = 4096;
			this.anIntArrayArray17[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
