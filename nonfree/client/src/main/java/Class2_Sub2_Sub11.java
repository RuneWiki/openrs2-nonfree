import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!hj", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!hj", name = "db", descriptor = "[I")
	private int[] anIntArray348 = new int[257];

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(29) int[] local29 = this.method3955(0, arg0);
			@Pc(33) int[] local33 = local15[1];
			@Pc(37) int[] local37 = local15[0];
			@Pc(41) int[] local41 = local15[2];
			for (@Pc(43) int local43 = 0; local43 < Static54.anInt953; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray348[local51];
				local37[local43] = local51 >> 12 & 0xFF0;
				local33[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
		if (this.anIntArrayArray25 == null) {
			this.method1552(1);
		}
		this.method1549();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(17) int local17 = arg0.method2122();
		if (local17 != 0) {
			this.method1552(local17);
			return;
		}
		this.anIntArrayArray25 = new int[arg0.method2122()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray25.length; local31++) {
			this.anIntArrayArray25[local31][0] = arg0.method2095();
			this.anIntArrayArray25[local31][1] = arg0.method2122() << 4;
			this.anIntArrayArray25[local31][2] = arg0.method2122() << 4;
			this.anIntArrayArray25[local31][3] = arg0.method2122() << 4;
		}
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
	private void method1549() {
		@Pc(14) int local14 = this.anIntArrayArray25.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 257; local18++) {
			@Pc(22) int local22 = 0;
			@Pc(26) int local26 = local18 << 4;
			for (@Pc(28) int local28 = 0; local28 < local14 && this.anIntArrayArray25[local28][0] <= local26; local28++) {
				local22++;
			}
			@Pc(131) int local131;
			@Pc(103) int local103;
			@Pc(117) int local117;
			@Pc(55) int[] local55;
			if (local14 > local22) {
				local55 = this.anIntArrayArray25[local22];
				if (local22 > 0) {
					@Pc(67) int[] local67 = this.anIntArrayArray25[local22 - 1];
					@Pc(84) int local84 = (local26 - local67[0] << 12) / (local55[0] - local67[0]);
					@Pc(89) int local89 = 4096 - local84;
					local103 = local84 * local55[2] + local67[2] * local89 >> 12;
					local117 = local67[3] * local89 + local84 * local55[3] >> 12;
					local131 = local67[1] * local89 + local84 * local55[1] >> 12;
				} else {
					local103 = local55[2];
					local131 = local55[1];
					local117 = local55[3];
				}
			} else {
				local55 = this.anIntArrayArray25[local14 - 1];
				local117 = local55[3];
				local103 = local55[2];
				local131 = local55[1];
			}
			local117 >>= 0x4;
			local103 >>= 0x4;
			local131 >>= 0x4;
			if (local117 < 0) {
				local117 = 0;
			} else if (local117 > 255) {
				local117 = 255;
			}
			if (local103 < 0) {
				local103 = 0;
			} else if (local103 > 255) {
				local103 = 255;
			}
			if (local131 < 0) {
				local131 = 0;
			} else if (local131 > 255) {
				local131 = 255;
			}
			this.anIntArray348[local18] = local117 | local131 << 16 | local103 << 8;
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(II)V")
	private void method1552(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray25 = new int[2][4];
			this.anIntArrayArray25[0][3] = 0;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[1][3] = 4096;
			this.anIntArrayArray25[0][2] = 0;
			this.anIntArrayArray25[1][0] = 4096;
			this.anIntArrayArray25[1][2] = 4096;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray25 = new int[8][4];
			this.anIntArrayArray25[0][1] = 2650;
			this.anIntArrayArray25[0][2] = 2602;
			this.anIntArrayArray25[1][1] = 2313;
			this.anIntArrayArray25[2][1] = 2618;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[1][0] = 2867;
			this.anIntArrayArray25[0][3] = 2361;
			this.anIntArrayArray25[2][0] = 3072;
			this.anIntArrayArray25[1][2] = 1799;
			this.anIntArrayArray25[3][0] = 3276;
			this.anIntArrayArray25[1][3] = 1558;
			this.anIntArrayArray25[4][0] = 3481;
			this.anIntArrayArray25[3][1] = 2296;
			this.anIntArrayArray25[5][0] = 3686;
			this.anIntArrayArray25[4][1] = 2072;
			this.anIntArrayArray25[2][2] = 1734;
			this.anIntArrayArray25[5][1] = 2730;
			this.anIntArrayArray25[3][2] = 1220;
			this.anIntArrayArray25[6][1] = 2232;
			this.anIntArrayArray25[4][2] = 963;
			this.anIntArrayArray25[2][3] = 1413;
			this.anIntArrayArray25[3][3] = 947;
			this.anIntArrayArray25[7][1] = 1686;
			this.anIntArrayArray25[4][3] = 722;
			this.anIntArrayArray25[5][2] = 2152;
			this.anIntArrayArray25[5][3] = 1766;
			this.anIntArrayArray25[6][0] = 3891;
			this.anIntArrayArray25[7][0] = 4096;
			this.anIntArrayArray25[6][3] = 915;
			this.anIntArrayArray25[6][2] = 1060;
			this.anIntArrayArray25[7][2] = 1413;
			this.anIntArrayArray25[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray25 = new int[7][4];
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[1][0] = 663;
			this.anIntArrayArray25[0][2] = 0;
			this.anIntArrayArray25[0][3] = 4096;
			this.anIntArrayArray25[1][2] = 4096;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[1][1] = 0;
			this.anIntArrayArray25[2][0] = 1363;
			this.anIntArrayArray25[2][1] = 0;
			this.anIntArrayArray25[3][0] = 2048;
			this.anIntArrayArray25[1][3] = 4096;
			this.anIntArrayArray25[2][3] = 0;
			this.anIntArrayArray25[3][3] = 0;
			this.anIntArrayArray25[2][2] = 4096;
			this.anIntArrayArray25[4][0] = 2727;
			this.anIntArrayArray25[3][2] = 4096;
			this.anIntArrayArray25[4][2] = 0;
			this.anIntArrayArray25[5][0] = 3411;
			this.anIntArrayArray25[5][2] = 0;
			this.anIntArrayArray25[3][1] = 4096;
			this.anIntArrayArray25[4][1] = 4096;
			this.anIntArrayArray25[6][2] = 0;
			this.anIntArrayArray25[5][1] = 4096;
			this.anIntArrayArray25[6][1] = 0;
			this.anIntArrayArray25[4][3] = 0;
			this.anIntArrayArray25[5][3] = 4096;
			this.anIntArrayArray25[6][3] = 4096;
			this.anIntArrayArray25[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray25 = new int[6][4];
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[1][0] = 1843;
			this.anIntArrayArray25[0][3] = 0;
			this.anIntArrayArray25[2][0] = 2457;
			this.anIntArrayArray25[0][2] = 0;
			this.anIntArrayArray25[1][3] = 1493;
			this.anIntArrayArray25[1][2] = 0;
			this.anIntArrayArray25[2][3] = 2939;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[1][1] = 0;
			this.anIntArrayArray25[3][0] = 2781;
			this.anIntArrayArray25[4][0] = 3481;
			this.anIntArrayArray25[5][0] = 4096;
			this.anIntArrayArray25[2][1] = 0;
			this.anIntArrayArray25[3][3] = 3565;
			this.anIntArrayArray25[3][1] = 0;
			this.anIntArrayArray25[2][2] = 0;
			this.anIntArrayArray25[4][1] = 546;
			this.anIntArrayArray25[4][3] = 4031;
			this.anIntArrayArray25[5][1] = 4096;
			this.anIntArrayArray25[3][2] = 1124;
			this.anIntArrayArray25[5][3] = 4096;
			this.anIntArrayArray25[4][2] = 3084;
			this.anIntArrayArray25[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray25 = new int[16][4];
			this.anIntArrayArray25[0][2] = 192;
			this.anIntArrayArray25[1][2] = 449;
			this.anIntArrayArray25[0][1] = 80;
			this.anIntArrayArray25[0][3] = 321;
			this.anIntArrayArray25[2][2] = 690;
			this.anIntArrayArray25[1][1] = 321;
			this.anIntArrayArray25[3][2] = 995;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[1][0] = 155;
			this.anIntArrayArray25[2][1] = 578;
			this.anIntArrayArray25[2][0] = 389;
			this.anIntArrayArray25[3][1] = 947;
			this.anIntArrayArray25[4][2] = 1397;
			this.anIntArrayArray25[5][2] = 1429;
			this.anIntArrayArray25[6][2] = 1461;
			this.anIntArrayArray25[1][3] = 562;
			this.anIntArrayArray25[4][1] = 1285;
			this.anIntArrayArray25[5][1] = 1525;
			this.anIntArrayArray25[2][3] = 803;
			this.anIntArrayArray25[3][3] = 1140;
			this.anIntArrayArray25[6][1] = 1734;
			this.anIntArrayArray25[7][1] = 1413;
			this.anIntArrayArray25[7][2] = 1525;
			this.anIntArrayArray25[8][2] = 1590;
			this.anIntArrayArray25[3][0] = 671;
			this.anIntArrayArray25[4][3] = 1509;
			this.anIntArrayArray25[8][1] = 1108;
			this.anIntArrayArray25[4][0] = 897;
			this.anIntArrayArray25[9][2] = 2056;
			this.anIntArrayArray25[9][1] = 1766;
			this.anIntArrayArray25[5][0] = 1175;
			this.anIntArrayArray25[10][2] = 2586;
			this.anIntArrayArray25[11][2] = 3148;
			this.anIntArrayArray25[10][1] = 2409;
			this.anIntArrayArray25[6][0] = 1368;
			this.anIntArrayArray25[12][2] = 3710;
			this.anIntArrayArray25[7][0] = 1507;
			this.anIntArrayArray25[8][0] = 1736;
			this.anIntArrayArray25[11][1] = 3116;
			this.anIntArrayArray25[13][2] = 3421;
			this.anIntArrayArray25[5][3] = 1413;
			this.anIntArrayArray25[9][0] = 2088;
			this.anIntArrayArray25[12][1] = 3806;
			this.anIntArrayArray25[10][0] = 2355;
			this.anIntArrayArray25[14][2] = 3148;
			this.anIntArrayArray25[6][3] = 1333;
			this.anIntArrayArray25[7][3] = 1702;
			this.anIntArrayArray25[8][3] = 2056;
			this.anIntArrayArray25[13][1] = 3437;
			this.anIntArrayArray25[11][0] = 2691;
			this.anIntArrayArray25[9][3] = 2666;
			this.anIntArrayArray25[10][3] = 3276;
			this.anIntArrayArray25[12][0] = 3031;
			this.anIntArrayArray25[14][1] = 3116;
			this.anIntArrayArray25[13][0] = 3522;
			this.anIntArrayArray25[15][1] = 2377;
			this.anIntArrayArray25[11][3] = 3228;
			this.anIntArrayArray25[14][0] = 3727;
			this.anIntArrayArray25[15][2] = 2505;
			this.anIntArrayArray25[12][3] = 3196;
			this.anIntArrayArray25[15][0] = 4096;
			this.anIntArrayArray25[13][3] = 3019;
			this.anIntArrayArray25[14][3] = 3228;
			this.anIntArrayArray25[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray25 = new int[4][4];
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[1][1] = 4096;
			this.anIntArrayArray25[0][0] = 2048;
			this.anIntArrayArray25[2][1] = 4096;
			this.anIntArrayArray25[3][1] = 4096;
			this.anIntArrayArray25[0][2] = 4096;
			this.anIntArrayArray25[0][3] = 0;
			this.anIntArrayArray25[1][0] = 2867;
			this.anIntArrayArray25[2][0] = 3276;
			this.anIntArrayArray25[3][0] = 4096;
			this.anIntArrayArray25[1][2] = 4096;
			this.anIntArrayArray25[1][3] = 0;
			this.anIntArrayArray25[2][3] = 0;
			this.anIntArrayArray25[3][3] = 0;
			this.anIntArrayArray25[2][2] = 4096;
			this.anIntArrayArray25[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
