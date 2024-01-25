import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class5_Sub2_Sub11 extends Class5_Sub2 {

	@OriginalMember(owner = "client!efa", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!efa", name = "E", descriptor = "[I")
	private final int[] anIntArray139 = new int[257];

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(19) int local19 = arg0.method5966();
		if (local19 != 0) {
			this.method1871(local19);
			return;
		}
		this.anIntArrayArray12 = new int[arg0.method5966()][4];
		for (@Pc(38) int local38 = 0; local38 < this.anIntArrayArray12.length; local38++) {
			this.anIntArrayArray12[local38][0] = arg0.method5968();
			this.anIntArrayArray12[local38][1] = arg0.method5966() << 4;
			this.anIntArrayArray12[local38][2] = arg0.method5966() << 4;
			this.anIntArrayArray12[local38][3] = arg0.method5966() << 4;
		}
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(Z)V")
	private void method1870() {
		@Pc(13) int local13 = this.anIntArrayArray12.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local13 > local27 && this.anIntArrayArray12[local27][0] <= local25; local27++) {
				local21++;
			}
			@Pc(103) int local103;
			@Pc(118) int local118;
			@Pc(132) int local132;
			@Pc(54) int[] local54;
			if (local13 > local21) {
				local54 = this.anIntArrayArray12[local21];
				if (local21 > 0) {
					@Pc(66) int[] local66 = this.anIntArrayArray12[local21 - 1];
					@Pc(84) int local84 = (local25 - local66[0] << 12) / (local54[0] - local66[0]);
					@Pc(89) int local89 = 4096 - local84;
					local103 = local89 * local66[1] + local54[1] * local84 >> 12;
					local118 = local54[2] * local84 + local89 * local66[2] >> 12;
					local132 = local89 * local66[3] + local84 * local54[3] >> 12;
				} else {
					local118 = local54[2];
					local132 = local54[3];
					local103 = local54[1];
				}
			} else {
				local54 = this.anIntArrayArray12[local13 - 1];
				local118 = local54[2];
				local103 = local54[1];
				local132 = local54[3];
			}
			local103 >>= 0x4;
			local132 >>= 0x4;
			local118 >>= 0x4;
			if (local103 < 0) {
				local103 = 0;
			} else if (local103 > 255) {
				local103 = 255;
			}
			if (local132 < 0) {
				local132 = 0;
			} else if (local132 > 255) {
				local132 = 255;
			}
			if (local118 < 0) {
				local118 = 0;
			} else if (local118 > 255) {
				local118 = 255;
			}
			this.anIntArray139[local17] = local132 | local118 << 8 | local103 << 16;
		}
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
		if (this.anIntArrayArray12 == null) {
			this.method1871(1);
		}
		this.method1870();
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(26) int[] local26 = this.method9042(arg0, 0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static597.anInt10025; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray139[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "(II)V")
	private void method1871(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray12 = new int[2][4];
			this.anIntArrayArray12[0][3] = 0;
			this.anIntArrayArray12[0][2] = 0;
			this.anIntArrayArray12[0][0] = 0;
			this.anIntArrayArray12[0][1] = 0;
			this.anIntArrayArray12[1][1] = 4096;
			this.anIntArrayArray12[1][2] = 4096;
			this.anIntArrayArray12[1][0] = 4096;
			this.anIntArrayArray12[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray12 = new int[8][4];
			this.anIntArrayArray12[0][1] = 2650;
			this.anIntArrayArray12[0][0] = 0;
			this.anIntArrayArray12[0][3] = 2361;
			this.anIntArrayArray12[0][2] = 2602;
			this.anIntArrayArray12[1][1] = 2313;
			this.anIntArrayArray12[1][2] = 1799;
			this.anIntArrayArray12[1][0] = 2867;
			this.anIntArrayArray12[1][3] = 1558;
			this.anIntArrayArray12[2][1] = 2618;
			this.anIntArrayArray12[2][2] = 1734;
			this.anIntArrayArray12[2][0] = 3072;
			this.anIntArrayArray12[2][3] = 1413;
			this.anIntArrayArray12[3][0] = 3276;
			this.anIntArrayArray12[3][1] = 2296;
			this.anIntArrayArray12[3][2] = 1220;
			this.anIntArrayArray12[3][3] = 947;
			this.anIntArrayArray12[4][3] = 722;
			this.anIntArrayArray12[4][0] = 3481;
			this.anIntArrayArray12[4][2] = 963;
			this.anIntArrayArray12[4][1] = 2072;
			this.anIntArrayArray12[5][1] = 2730;
			this.anIntArrayArray12[5][2] = 2152;
			this.anIntArrayArray12[5][0] = 3686;
			this.anIntArrayArray12[5][3] = 1766;
			this.anIntArrayArray12[6][1] = 2232;
			this.anIntArrayArray12[6][2] = 1060;
			this.anIntArrayArray12[6][0] = 3891;
			this.anIntArrayArray12[6][3] = 915;
			this.anIntArrayArray12[7][0] = 4096;
			this.anIntArrayArray12[7][3] = 1140;
			this.anIntArrayArray12[7][2] = 1413;
			this.anIntArrayArray12[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray12 = new int[7][4];
			this.anIntArrayArray12[0][0] = 0;
			this.anIntArrayArray12[0][3] = 4096;
			this.anIntArrayArray12[0][1] = 0;
			this.anIntArrayArray12[0][2] = 0;
			this.anIntArrayArray12[1][2] = 4096;
			this.anIntArrayArray12[1][1] = 0;
			this.anIntArrayArray12[1][0] = 663;
			this.anIntArrayArray12[1][3] = 4096;
			this.anIntArrayArray12[2][3] = 0;
			this.anIntArrayArray12[2][2] = 4096;
			this.anIntArrayArray12[2][1] = 0;
			this.anIntArrayArray12[2][0] = 1363;
			this.anIntArrayArray12[3][0] = 2048;
			this.anIntArrayArray12[3][2] = 4096;
			this.anIntArrayArray12[3][3] = 0;
			this.anIntArrayArray12[3][1] = 4096;
			this.anIntArrayArray12[4][3] = 0;
			this.anIntArrayArray12[4][1] = 4096;
			this.anIntArrayArray12[4][0] = 2727;
			this.anIntArrayArray12[4][2] = 0;
			this.anIntArrayArray12[5][3] = 4096;
			this.anIntArrayArray12[5][0] = 3411;
			this.anIntArrayArray12[5][2] = 0;
			this.anIntArrayArray12[5][1] = 4096;
			this.anIntArrayArray12[6][2] = 0;
			this.anIntArrayArray12[6][1] = 0;
			this.anIntArrayArray12[6][3] = 4096;
			this.anIntArrayArray12[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray12 = new int[6][4];
			this.anIntArrayArray12[0][3] = 0;
			this.anIntArrayArray12[0][1] = 0;
			this.anIntArrayArray12[0][2] = 0;
			this.anIntArrayArray12[0][0] = 0;
			this.anIntArrayArray12[1][0] = 1843;
			this.anIntArrayArray12[1][2] = 0;
			this.anIntArrayArray12[1][3] = 1493;
			this.anIntArrayArray12[1][1] = 0;
			this.anIntArrayArray12[2][1] = 0;
			this.anIntArrayArray12[2][3] = 2939;
			this.anIntArrayArray12[2][2] = 0;
			this.anIntArrayArray12[2][0] = 2457;
			this.anIntArrayArray12[3][3] = 3565;
			this.anIntArrayArray12[3][1] = 0;
			this.anIntArrayArray12[3][2] = 1124;
			this.anIntArrayArray12[3][0] = 2781;
			this.anIntArrayArray12[4][1] = 546;
			this.anIntArrayArray12[4][0] = 3481;
			this.anIntArrayArray12[4][2] = 3084;
			this.anIntArrayArray12[4][3] = 4031;
			this.anIntArrayArray12[5][3] = 4096;
			this.anIntArrayArray12[5][1] = 4096;
			this.anIntArrayArray12[5][2] = 4096;
			this.anIntArrayArray12[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray12 = new int[16][4];
			this.anIntArrayArray12[0][3] = 321;
			this.anIntArrayArray12[0][1] = 80;
			this.anIntArrayArray12[0][2] = 192;
			this.anIntArrayArray12[0][0] = 0;
			this.anIntArrayArray12[1][3] = 562;
			this.anIntArrayArray12[1][2] = 449;
			this.anIntArrayArray12[1][1] = 321;
			this.anIntArrayArray12[1][0] = 155;
			this.anIntArrayArray12[2][0] = 389;
			this.anIntArrayArray12[2][2] = 690;
			this.anIntArrayArray12[2][3] = 803;
			this.anIntArrayArray12[2][1] = 578;
			this.anIntArrayArray12[3][3] = 1140;
			this.anIntArrayArray12[3][1] = 947;
			this.anIntArrayArray12[3][0] = 671;
			this.anIntArrayArray12[3][2] = 995;
			this.anIntArrayArray12[4][1] = 1285;
			this.anIntArrayArray12[4][0] = 897;
			this.anIntArrayArray12[4][3] = 1509;
			this.anIntArrayArray12[4][2] = 1397;
			this.anIntArrayArray12[5][0] = 1175;
			this.anIntArrayArray12[5][1] = 1525;
			this.anIntArrayArray12[5][3] = 1413;
			this.anIntArrayArray12[5][2] = 1429;
			this.anIntArrayArray12[6][3] = 1333;
			this.anIntArrayArray12[6][1] = 1734;
			this.anIntArrayArray12[6][2] = 1461;
			this.anIntArrayArray12[6][0] = 1368;
			this.anIntArrayArray12[7][1] = 1413;
			this.anIntArrayArray12[7][2] = 1525;
			this.anIntArrayArray12[7][3] = 1702;
			this.anIntArrayArray12[7][0] = 1507;
			this.anIntArrayArray12[8][2] = 1590;
			this.anIntArrayArray12[8][3] = 2056;
			this.anIntArrayArray12[8][0] = 1736;
			this.anIntArrayArray12[8][1] = 1108;
			this.anIntArrayArray12[9][2] = 2056;
			this.anIntArrayArray12[9][1] = 1766;
			this.anIntArrayArray12[9][3] = 2666;
			this.anIntArrayArray12[9][0] = 2088;
			this.anIntArrayArray12[10][0] = 2355;
			this.anIntArrayArray12[10][1] = 2409;
			this.anIntArrayArray12[10][2] = 2586;
			this.anIntArrayArray12[10][3] = 3276;
			this.anIntArrayArray12[11][1] = 3116;
			this.anIntArrayArray12[11][0] = 2691;
			this.anIntArrayArray12[11][2] = 3148;
			this.anIntArrayArray12[11][3] = 3228;
			this.anIntArrayArray12[12][0] = 3031;
			this.anIntArrayArray12[12][2] = 3710;
			this.anIntArrayArray12[12][1] = 3806;
			this.anIntArrayArray12[12][3] = 3196;
			this.anIntArrayArray12[13][2] = 3421;
			this.anIntArrayArray12[13][0] = 3522;
			this.anIntArrayArray12[13][3] = 3019;
			this.anIntArrayArray12[13][1] = 3437;
			this.anIntArrayArray12[14][2] = 3148;
			this.anIntArrayArray12[14][1] = 3116;
			this.anIntArrayArray12[14][3] = 3228;
			this.anIntArrayArray12[14][0] = 3727;
			this.anIntArrayArray12[15][3] = 2746;
			this.anIntArrayArray12[15][1] = 2377;
			this.anIntArrayArray12[15][2] = 2505;
			this.anIntArrayArray12[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray12 = new int[4][4];
			this.anIntArrayArray12[0][2] = 4096;
			this.anIntArrayArray12[0][3] = 0;
			this.anIntArrayArray12[0][0] = 2048;
			this.anIntArrayArray12[0][1] = 0;
			this.anIntArrayArray12[1][2] = 4096;
			this.anIntArrayArray12[1][3] = 0;
			this.anIntArrayArray12[1][0] = 2867;
			this.anIntArrayArray12[1][1] = 4096;
			this.anIntArrayArray12[2][0] = 3276;
			this.anIntArrayArray12[2][2] = 4096;
			this.anIntArrayArray12[2][1] = 4096;
			this.anIntArrayArray12[2][3] = 0;
			this.anIntArrayArray12[3][3] = 0;
			this.anIntArrayArray12[3][0] = 4096;
			this.anIntArrayArray12[3][1] = 4096;
			this.anIntArrayArray12[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
