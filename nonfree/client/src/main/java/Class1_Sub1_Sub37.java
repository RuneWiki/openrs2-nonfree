import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vg", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!vg", name = "S", descriptor = "[I")
	private final int[] anIntArray397 = new int[257];

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V")
	private void method3401() {
		@Pc(15) int local15 = this.anIntArrayArray35.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 257; local19++) {
			@Pc(25) int local25 = local19 << 4;
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local15 && this.anIntArrayArray35[local29][0] <= local25; local29++) {
				local27++;
			}
			@Pc(66) int local66;
			@Pc(70) int local70;
			@Pc(74) int local74;
			@Pc(60) int[] local60;
			if (local27 < local15) {
				local60 = this.anIntArrayArray35[local27];
				if (local27 <= 0) {
					local66 = local60[1];
					local70 = local60[2];
					local74 = local60[3];
				} else {
					@Pc(83) int[] local83 = this.anIntArrayArray35[local27 - 1];
					@Pc(101) int local101 = (local25 - local83[0] << 12) / (local60[0] - local83[0]);
					@Pc(105) int local105 = 4096 - local101;
					local66 = local60[1] * local101 + local83[1] * local105 >> 12;
					local70 = local60[2] * local101 + local83[2] * local105 >> 12;
					local74 = local101 * local60[3] + local83[3] * local105 >> 12;
				}
			} else {
				local60 = this.anIntArrayArray35[local15 - 1];
				local74 = local60[3];
				local66 = local60[1];
				local70 = local60[2];
			}
			local74 >>= 0x4;
			local70 >>= 0x4;
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 255) {
				local70 = 255;
			}
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 > 255) {
				local74 = 255;
			}
			local66 >>= 0x4;
			if (local66 < 0) {
				local66 = 0;
			} else if (local66 > 255) {
				local66 = 255;
			}
			this.anIntArray397[local19] = local70 << 8 | local66 << 16 | local74;
		}
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(II)V")
	private void method3403(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray35 = new int[2][4];
			this.anIntArrayArray35[0][3] = 0;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[1][3] = 4096;
			this.anIntArrayArray35[1][1] = 4096;
			this.anIntArrayArray35[1][0] = 4096;
			this.anIntArrayArray35[0][2] = 0;
			this.anIntArrayArray35[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray35 = new int[8][4];
			this.anIntArrayArray35[0][1] = 2650;
			this.anIntArrayArray35[0][3] = 2361;
			this.anIntArrayArray35[1][1] = 2313;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[1][0] = 2867;
			this.anIntArrayArray35[2][0] = 3072;
			this.anIntArrayArray35[0][2] = 2602;
			this.anIntArrayArray35[3][0] = 3276;
			this.anIntArrayArray35[1][2] = 1799;
			this.anIntArrayArray35[4][0] = 3481;
			this.anIntArrayArray35[2][2] = 1734;
			this.anIntArrayArray35[2][1] = 2618;
			this.anIntArrayArray35[5][0] = 3686;
			this.anIntArrayArray35[6][0] = 3891;
			this.anIntArrayArray35[7][0] = 4096;
			this.anIntArrayArray35[1][3] = 1558;
			this.anIntArrayArray35[2][3] = 1413;
			this.anIntArrayArray35[3][2] = 1220;
			this.anIntArrayArray35[3][1] = 2296;
			this.anIntArrayArray35[4][2] = 963;
			this.anIntArrayArray35[4][1] = 2072;
			this.anIntArrayArray35[3][3] = 947;
			this.anIntArrayArray35[5][1] = 2730;
			this.anIntArrayArray35[4][3] = 722;
			this.anIntArrayArray35[5][2] = 2152;
			this.anIntArrayArray35[5][3] = 1766;
			this.anIntArrayArray35[6][3] = 915;
			this.anIntArrayArray35[6][1] = 2232;
			this.anIntArrayArray35[7][3] = 1140;
			this.anIntArrayArray35[7][1] = 1686;
			this.anIntArrayArray35[6][2] = 1060;
			this.anIntArrayArray35[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray35 = new int[7][4];
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[0][3] = 4096;
			this.anIntArrayArray35[0][2] = 0;
			this.anIntArrayArray35[1][2] = 4096;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[1][1] = 0;
			this.anIntArrayArray35[1][3] = 4096;
			this.anIntArrayArray35[2][1] = 0;
			this.anIntArrayArray35[1][0] = 663;
			this.anIntArrayArray35[2][3] = 0;
			this.anIntArrayArray35[3][3] = 0;
			this.anIntArrayArray35[2][0] = 1363;
			this.anIntArrayArray35[3][0] = 2048;
			this.anIntArrayArray35[4][3] = 0;
			this.anIntArrayArray35[5][3] = 4096;
			this.anIntArrayArray35[4][0] = 2727;
			this.anIntArrayArray35[5][0] = 3411;
			this.anIntArrayArray35[2][2] = 4096;
			this.anIntArrayArray35[6][3] = 4096;
			this.anIntArrayArray35[3][2] = 4096;
			this.anIntArrayArray35[4][2] = 0;
			this.anIntArrayArray35[3][1] = 4096;
			this.anIntArrayArray35[4][1] = 4096;
			this.anIntArrayArray35[5][2] = 0;
			this.anIntArrayArray35[6][2] = 0;
			this.anIntArrayArray35[5][1] = 4096;
			this.anIntArrayArray35[6][1] = 0;
			this.anIntArrayArray35[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray35 = new int[6][4];
			this.anIntArrayArray35[0][3] = 0;
			this.anIntArrayArray35[0][2] = 0;
			this.anIntArrayArray35[1][3] = 1493;
			this.anIntArrayArray35[2][3] = 2939;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[1][0] = 1843;
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[1][2] = 0;
			this.anIntArrayArray35[3][3] = 3565;
			this.anIntArrayArray35[2][0] = 2457;
			this.anIntArrayArray35[3][0] = 2781;
			this.anIntArrayArray35[2][2] = 0;
			this.anIntArrayArray35[1][1] = 0;
			this.anIntArrayArray35[3][2] = 1124;
			this.anIntArrayArray35[4][3] = 4031;
			this.anIntArrayArray35[4][0] = 3481;
			this.anIntArrayArray35[5][3] = 4096;
			this.anIntArrayArray35[2][1] = 0;
			this.anIntArrayArray35[4][2] = 3084;
			this.anIntArrayArray35[3][1] = 0;
			this.anIntArrayArray35[5][2] = 4096;
			this.anIntArrayArray35[5][0] = 4096;
			this.anIntArrayArray35[4][1] = 546;
			this.anIntArrayArray35[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray35 = new int[16][4];
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][2] = 192;
			this.anIntArrayArray35[1][2] = 449;
			this.anIntArrayArray35[0][1] = 80;
			this.anIntArrayArray35[1][0] = 155;
			this.anIntArrayArray35[1][1] = 321;
			this.anIntArrayArray35[2][1] = 578;
			this.anIntArrayArray35[2][2] = 690;
			this.anIntArrayArray35[3][2] = 995;
			this.anIntArrayArray35[3][1] = 947;
			this.anIntArrayArray35[4][2] = 1397;
			this.anIntArrayArray35[4][1] = 1285;
			this.anIntArrayArray35[5][2] = 1429;
			this.anIntArrayArray35[0][3] = 321;
			this.anIntArrayArray35[5][1] = 1525;
			this.anIntArrayArray35[2][0] = 389;
			this.anIntArrayArray35[6][1] = 1734;
			this.anIntArrayArray35[3][0] = 671;
			this.anIntArrayArray35[4][0] = 897;
			this.anIntArrayArray35[7][1] = 1413;
			this.anIntArrayArray35[8][1] = 1108;
			this.anIntArrayArray35[6][2] = 1461;
			this.anIntArrayArray35[7][2] = 1525;
			this.anIntArrayArray35[5][0] = 1175;
			this.anIntArrayArray35[8][2] = 1590;
			this.anIntArrayArray35[6][0] = 1368;
			this.anIntArrayArray35[9][2] = 2056;
			this.anIntArrayArray35[7][0] = 1507;
			this.anIntArrayArray35[10][2] = 2586;
			this.anIntArrayArray35[1][3] = 562;
			this.anIntArrayArray35[2][3] = 803;
			this.anIntArrayArray35[3][3] = 1140;
			this.anIntArrayArray35[11][2] = 3148;
			this.anIntArrayArray35[9][1] = 1766;
			this.anIntArrayArray35[10][1] = 2409;
			this.anIntArrayArray35[8][0] = 1736;
			this.anIntArrayArray35[4][3] = 1509;
			this.anIntArrayArray35[9][0] = 2088;
			this.anIntArrayArray35[11][1] = 3116;
			this.anIntArrayArray35[10][0] = 2355;
			this.anIntArrayArray35[12][1] = 3806;
			this.anIntArrayArray35[11][0] = 2691;
			this.anIntArrayArray35[13][1] = 3437;
			this.anIntArrayArray35[14][1] = 3116;
			this.anIntArrayArray35[15][1] = 2377;
			this.anIntArrayArray35[12][2] = 3710;
			this.anIntArrayArray35[12][0] = 3031;
			this.anIntArrayArray35[13][2] = 3421;
			this.anIntArrayArray35[13][0] = 3522;
			this.anIntArrayArray35[14][2] = 3148;
			this.anIntArrayArray35[15][2] = 2505;
			this.anIntArrayArray35[14][0] = 3727;
			this.anIntArrayArray35[5][3] = 1413;
			this.anIntArrayArray35[15][0] = 4096;
			this.anIntArrayArray35[6][3] = 1333;
			this.anIntArrayArray35[7][3] = 1702;
			this.anIntArrayArray35[8][3] = 2056;
			this.anIntArrayArray35[9][3] = 2666;
			this.anIntArrayArray35[10][3] = 3276;
			this.anIntArrayArray35[11][3] = 3228;
			this.anIntArrayArray35[12][3] = 3196;
			this.anIntArrayArray35[13][3] = 3019;
			this.anIntArrayArray35[14][3] = 3228;
			this.anIntArrayArray35[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray35 = new int[4][4];
			this.anIntArrayArray35[0][3] = 0;
			this.anIntArrayArray35[0][0] = 2048;
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[1][3] = 0;
			this.anIntArrayArray35[1][0] = 2867;
			this.anIntArrayArray35[2][0] = 3276;
			this.anIntArrayArray35[0][2] = 4096;
			this.anIntArrayArray35[2][3] = 0;
			this.anIntArrayArray35[1][1] = 4096;
			this.anIntArrayArray35[1][2] = 4096;
			this.anIntArrayArray35[2][2] = 4096;
			this.anIntArrayArray35[3][2] = 0;
			this.anIntArrayArray35[3][3] = 0;
			this.anIntArrayArray35[3][0] = 4096;
			this.anIntArrayArray35[2][1] = 4096;
			this.anIntArrayArray35[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(21) int local21 = arg0.method2771();
		if (local21 != 0) {
			this.method3403(local21);
			return;
		}
		this.anIntArrayArray35 = new int[arg0.method2771()][4];
		for (@Pc(42) int local42 = 0; local42 < this.anIntArrayArray35.length; local42++) {
			this.anIntArrayArray35[local42][0] = arg0.method2765();
			this.anIntArrayArray35[local42][1] = arg0.method2771() << 4;
			this.anIntArrayArray35[local42][2] = arg0.method2771() << 4;
			this.anIntArrayArray35[local42][3] = arg0.method2771() << 4;
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
		if (this.anIntArrayArray35 == null) {
			this.method3403(1);
		}
		this.method3401();
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(29) int[] local29 = this.method3580(arg0, 0);
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[2];
			@Pc(41) int[] local41 = local19[1];
			for (@Pc(43) int local43 = 0; local43 < Static115.anInt2578; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray397[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local41[local43] = local51 >> 4 & 0xFF0;
				local37[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local19;
	}
}
