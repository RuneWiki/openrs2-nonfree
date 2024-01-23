import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!lc", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!lc", name = "R", descriptor = "[I")
	private int[] anIntArray247 = new int[257];

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
	private void method2477() {
		@Pc(17) int local17 = this.anIntArrayArray18.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < 257; local23++) {
			@Pc(30) int local30 = 0;
			@Pc(34) int local34 = local23 << 4;
			for (@Pc(36) int local36 = 0; local17 > local36 && this.anIntArrayArray18[local36][0] <= local34; local36++) {
				local30++;
			}
			@Pc(69) int local69;
			@Pc(73) int local73;
			@Pc(77) int local77;
			@Pc(65) int[] local65;
			if (local17 <= local30) {
				local65 = this.anIntArrayArray18[local17 - 1];
				local69 = local65[1];
				local73 = local65[2];
				local77 = local65[3];
			} else {
				local65 = this.anIntArrayArray18[local30];
				if (local30 <= 0) {
					local69 = local65[1];
					local73 = local65[2];
					local77 = local65[3];
				} else {
					@Pc(109) int[] local109 = this.anIntArrayArray18[local30 - 1];
					@Pc(127) int local127 = (local34 - local109[0] << 12) / (local65[0] - local109[0]);
					@Pc(131) int local131 = 4096 - local127;
					local77 = local127 * local65[3] + local109[3] * local131 >> 12;
					local73 = local131 * local109[2] + local127 * local65[2] >> 12;
					local69 = local65[1] * local127 + local109[1] * local131 >> 12;
				}
			}
			local77 >>= 0x4;
			if (local77 < 0) {
				local77 = 0;
			} else if (local77 > 255) {
				local77 = 255;
			}
			local69 >>= 0x4;
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			local73 >>= 0x4;
			if (local73 < 0) {
				local73 = 0;
			} else if (local73 > 255) {
				local73 = 255;
			}
			this.anIntArray247[local23] = local73 << 8 | local69 << 16 | local77;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(16) int local16 = arg0.method2595();
		if (local16 != 0) {
			this.method2479(local16);
			return;
		}
		this.anIntArrayArray18 = new int[arg0.method2595()][4];
		for (@Pc(34) int local34 = 0; local34 < this.anIntArrayArray18.length; local34++) {
			this.anIntArrayArray18[local34][0] = arg0.method2593();
			this.anIntArrayArray18[local34][1] = arg0.method2595() << 4;
			this.anIntArrayArray18[local34][2] = arg0.method2595() << 4;
			this.anIntArrayArray18[local34][3] = arg0.method2595() << 4;
		}
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
		if (this.anIntArrayArray18 == null) {
			this.method2479(1);
		}
		this.method2477();
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
	private void method2479(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray18 = new int[2][4];
			this.anIntArrayArray18[0][1] = 0;
			this.anIntArrayArray18[1][1] = 4096;
			this.anIntArrayArray18[0][2] = 0;
			this.anIntArrayArray18[0][0] = 0;
			this.anIntArrayArray18[0][3] = 0;
			this.anIntArrayArray18[1][3] = 4096;
			this.anIntArrayArray18[1][2] = 4096;
			this.anIntArrayArray18[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray18 = new int[8][4];
			this.anIntArrayArray18[0][2] = 2602;
			this.anIntArrayArray18[1][2] = 1799;
			this.anIntArrayArray18[0][1] = 2650;
			this.anIntArrayArray18[2][2] = 1734;
			this.anIntArrayArray18[1][1] = 2313;
			this.anIntArrayArray18[2][1] = 2618;
			this.anIntArrayArray18[0][0] = 0;
			this.anIntArrayArray18[3][1] = 2296;
			this.anIntArrayArray18[0][3] = 2361;
			this.anIntArrayArray18[1][0] = 2867;
			this.anIntArrayArray18[4][1] = 2072;
			this.anIntArrayArray18[5][1] = 2730;
			this.anIntArrayArray18[3][2] = 1220;
			this.anIntArrayArray18[4][2] = 963;
			this.anIntArrayArray18[1][3] = 1558;
			this.anIntArrayArray18[2][3] = 1413;
			this.anIntArrayArray18[2][0] = 3072;
			this.anIntArrayArray18[5][2] = 2152;
			this.anIntArrayArray18[3][0] = 3276;
			this.anIntArrayArray18[6][1] = 2232;
			this.anIntArrayArray18[7][1] = 1686;
			this.anIntArrayArray18[6][2] = 1060;
			this.anIntArrayArray18[7][2] = 1413;
			this.anIntArrayArray18[3][3] = 947;
			this.anIntArrayArray18[4][3] = 722;
			this.anIntArrayArray18[5][3] = 1766;
			this.anIntArrayArray18[4][0] = 3481;
			this.anIntArrayArray18[6][3] = 915;
			this.anIntArrayArray18[7][3] = 1140;
			this.anIntArrayArray18[5][0] = 3686;
			this.anIntArrayArray18[6][0] = 3891;
			this.anIntArrayArray18[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray18 = new int[7][4];
			this.anIntArrayArray18[0][1] = 0;
			this.anIntArrayArray18[0][3] = 4096;
			this.anIntArrayArray18[1][1] = 0;
			this.anIntArrayArray18[0][0] = 0;
			this.anIntArrayArray18[0][2] = 0;
			this.anIntArrayArray18[1][3] = 4096;
			this.anIntArrayArray18[2][3] = 0;
			this.anIntArrayArray18[2][1] = 0;
			this.anIntArrayArray18[1][2] = 4096;
			this.anIntArrayArray18[2][2] = 4096;
			this.anIntArrayArray18[1][0] = 663;
			this.anIntArrayArray18[3][2] = 4096;
			this.anIntArrayArray18[3][3] = 0;
			this.anIntArrayArray18[3][1] = 4096;
			this.anIntArrayArray18[4][2] = 0;
			this.anIntArrayArray18[4][3] = 0;
			this.anIntArrayArray18[5][3] = 4096;
			this.anIntArrayArray18[5][2] = 0;
			this.anIntArrayArray18[2][0] = 1363;
			this.anIntArrayArray18[4][1] = 4096;
			this.anIntArrayArray18[5][1] = 4096;
			this.anIntArrayArray18[3][0] = 2048;
			this.anIntArrayArray18[6][2] = 0;
			this.anIntArrayArray18[4][0] = 2727;
			this.anIntArrayArray18[5][0] = 3411;
			this.anIntArrayArray18[6][0] = 4096;
			this.anIntArrayArray18[6][1] = 0;
			this.anIntArrayArray18[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray18 = new int[6][4];
			this.anIntArrayArray18[0][2] = 0;
			this.anIntArrayArray18[0][0] = 0;
			this.anIntArrayArray18[1][2] = 0;
			this.anIntArrayArray18[0][3] = 0;
			this.anIntArrayArray18[1][3] = 1493;
			this.anIntArrayArray18[2][3] = 2939;
			this.anIntArrayArray18[0][1] = 0;
			this.anIntArrayArray18[2][2] = 0;
			this.anIntArrayArray18[3][3] = 3565;
			this.anIntArrayArray18[3][2] = 1124;
			this.anIntArrayArray18[4][2] = 3084;
			this.anIntArrayArray18[5][2] = 4096;
			this.anIntArrayArray18[1][0] = 1843;
			this.anIntArrayArray18[4][3] = 4031;
			this.anIntArrayArray18[1][1] = 0;
			this.anIntArrayArray18[2][1] = 0;
			this.anIntArrayArray18[2][0] = 2457;
			this.anIntArrayArray18[3][1] = 0;
			this.anIntArrayArray18[5][3] = 4096;
			this.anIntArrayArray18[3][0] = 2781;
			this.anIntArrayArray18[4][0] = 3481;
			this.anIntArrayArray18[5][0] = 4096;
			this.anIntArrayArray18[4][1] = 546;
			this.anIntArrayArray18[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray18 = new int[16][4];
			this.anIntArrayArray18[0][1] = 80;
			this.anIntArrayArray18[0][0] = 0;
			this.anIntArrayArray18[0][3] = 321;
			this.anIntArrayArray18[1][0] = 155;
			this.anIntArrayArray18[0][2] = 192;
			this.anIntArrayArray18[1][2] = 449;
			this.anIntArrayArray18[2][2] = 690;
			this.anIntArrayArray18[1][3] = 562;
			this.anIntArrayArray18[2][3] = 803;
			this.anIntArrayArray18[1][1] = 321;
			this.anIntArrayArray18[2][0] = 389;
			this.anIntArrayArray18[3][3] = 1140;
			this.anIntArrayArray18[3][0] = 671;
			this.anIntArrayArray18[4][3] = 1509;
			this.anIntArrayArray18[3][2] = 995;
			this.anIntArrayArray18[4][2] = 1397;
			this.anIntArrayArray18[4][0] = 897;
			this.anIntArrayArray18[5][0] = 1175;
			this.anIntArrayArray18[5][3] = 1413;
			this.anIntArrayArray18[6][3] = 1333;
			this.anIntArrayArray18[2][1] = 578;
			this.anIntArrayArray18[3][1] = 947;
			this.anIntArrayArray18[7][3] = 1702;
			this.anIntArrayArray18[8][3] = 2056;
			this.anIntArrayArray18[6][0] = 1368;
			this.anIntArrayArray18[7][0] = 1507;
			this.anIntArrayArray18[9][3] = 2666;
			this.anIntArrayArray18[8][0] = 1736;
			this.anIntArrayArray18[5][2] = 1429;
			this.anIntArrayArray18[6][2] = 1461;
			this.anIntArrayArray18[10][3] = 3276;
			this.anIntArrayArray18[11][3] = 3228;
			this.anIntArrayArray18[12][3] = 3196;
			this.anIntArrayArray18[13][3] = 3019;
			this.anIntArrayArray18[14][3] = 3228;
			this.anIntArrayArray18[9][0] = 2088;
			this.anIntArrayArray18[15][3] = 2746;
			this.anIntArrayArray18[4][1] = 1285;
			this.anIntArrayArray18[5][1] = 1525;
			this.anIntArrayArray18[6][1] = 1734;
			this.anIntArrayArray18[7][1] = 1413;
			this.anIntArrayArray18[10][0] = 2355;
			this.anIntArrayArray18[7][2] = 1525;
			this.anIntArrayArray18[8][2] = 1590;
			this.anIntArrayArray18[8][1] = 1108;
			this.anIntArrayArray18[11][0] = 2691;
			this.anIntArrayArray18[9][2] = 2056;
			this.anIntArrayArray18[9][1] = 1766;
			this.anIntArrayArray18[10][2] = 2586;
			this.anIntArrayArray18[12][0] = 3031;
			this.anIntArrayArray18[11][2] = 3148;
			this.anIntArrayArray18[12][2] = 3710;
			this.anIntArrayArray18[13][2] = 3421;
			this.anIntArrayArray18[10][1] = 2409;
			this.anIntArrayArray18[11][1] = 3116;
			this.anIntArrayArray18[13][0] = 3522;
			this.anIntArrayArray18[14][2] = 3148;
			this.anIntArrayArray18[15][2] = 2505;
			this.anIntArrayArray18[14][0] = 3727;
			this.anIntArrayArray18[12][1] = 3806;
			this.anIntArrayArray18[13][1] = 3437;
			this.anIntArrayArray18[15][0] = 4096;
			this.anIntArrayArray18[14][1] = 3116;
			this.anIntArrayArray18[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray18 = new int[4][4];
			this.anIntArrayArray18[0][2] = 4096;
			this.anIntArrayArray18[1][2] = 4096;
			this.anIntArrayArray18[0][0] = 2048;
			this.anIntArrayArray18[2][2] = 4096;
			this.anIntArrayArray18[3][2] = 0;
			this.anIntArrayArray18[0][3] = 0;
			this.anIntArrayArray18[1][3] = 0;
			this.anIntArrayArray18[1][0] = 2867;
			this.anIntArrayArray18[2][3] = 0;
			this.anIntArrayArray18[0][1] = 0;
			this.anIntArrayArray18[3][3] = 0;
			this.anIntArrayArray18[1][1] = 4096;
			this.anIntArrayArray18[2][1] = 4096;
			this.anIntArrayArray18[2][0] = 3276;
			this.anIntArrayArray18[3][0] = 4096;
			this.anIntArrayArray18[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(23) int[] local23 = this.method4570(arg0, 0);
			@Pc(27) int[] local27 = local12[1];
			@Pc(31) int[] local31 = local12[0];
			@Pc(35) int[] local35 = local12[2];
			for (@Pc(37) int local37 = 0; local37 < Static299.anInt5670; local37++) {
				@Pc(50) int local50 = local23[local37] >> 4;
				if (local50 < 0) {
					local50 = 0;
				}
				if (local50 > 256) {
					local50 = 256;
				}
				local50 = this.anIntArray247[local50];
				local31[local37] = local50 >> 12 & 0xFF0;
				local27[local37] = local50 >> 4 & 0xFF0;
				local35[local37] = (local50 & 0xFF) << 4;
			}
		}
		return local12;
	}
}
