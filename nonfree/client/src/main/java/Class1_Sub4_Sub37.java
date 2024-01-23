import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class1_Sub4_Sub37 extends Class1_Sub4 {

	@OriginalMember(owner = "client!uo", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!uo", name = "S", descriptor = "[I")
	private int[] anIntArray463 = new int[257];

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
		if (this.anIntArrayArray43 == null) {
			this.method4440(1);
		}
		this.method4437();
	}

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)V")
	private void method4437() {
		@Pc(17) int local17 = this.anIntArrayArray43.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(33) int local33 = local24 << 4;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < local17 && this.anIntArrayArray43[local37][0] <= local33; local37++) {
				local35++;
			}
			@Pc(74) int local74;
			@Pc(66) int local66;
			@Pc(70) int local70;
			@Pc(60) int[] local60;
			if (local17 > local35) {
				local60 = this.anIntArrayArray43[local35];
				if (local35 <= 0) {
					local66 = local60[2];
					local70 = local60[3];
					local74 = local60[1];
				} else {
					@Pc(83) int[] local83 = this.anIntArrayArray43[local35 - 1];
					@Pc(101) int local101 = (local33 - local83[0] << 12) / (local60[0] - local83[0]);
					@Pc(106) int local106 = 4096 - local101;
					local70 = local101 * local60[3] + local83[3] * local106 >> 12;
					local66 = local101 * local60[2] + local83[2] * local106 >> 12;
					local74 = local60[1] * local101 + local106 * local83[1] >> 12;
				}
			} else {
				local60 = this.anIntArrayArray43[local17 - 1];
				local74 = local60[1];
				local70 = local60[3];
				local66 = local60[2];
			}
			local66 >>= 0x4;
			if (local66 < 0) {
				local66 = 0;
			} else if (local66 > 255) {
				local66 = 255;
			}
			local70 >>= 0x4;
			local74 >>= 0x4;
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
			this.anIntArray463[local24] = local74 << 16 | local66 << 8 | local70;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(22) int local22 = arg0.method1378();
		if (local22 != 0) {
			this.method4440(local22);
			return;
		}
		this.anIntArrayArray43 = new int[arg0.method1378()][4];
		for (@Pc(40) int local40 = 0; local40 < this.anIntArrayArray43.length; local40++) {
			this.anIntArrayArray43[local40][0] = arg0.method1386();
			this.anIntArrayArray43[local40][1] = arg0.method1378() << 4;
			this.anIntArrayArray43[local40][2] = arg0.method1378() << 4;
			this.anIntArrayArray43[local40][3] = arg0.method1378() << 4;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(18) int[] local18 = this.method4750(arg0, 0);
			@Pc(22) int[] local22 = local7[0];
			@Pc(26) int[] local26 = local7[1];
			@Pc(30) int[] local30 = local7[2];
			for (@Pc(32) int local32 = 0; local32 < Static182.anInt3492; local32++) {
				@Pc(41) int local41 = local18[local32] >> 4;
				if (local41 < 0) {
					local41 = 0;
				}
				if (local41 > 256) {
					local41 = 256;
				}
				local41 = this.anIntArray463[local41];
				local22[local32] = local41 >> 12 & 0xFF0;
				local26[local32] = local41 >> 4 & 0xFF0;
				local30[local32] = (local41 & 0xFF) << 4;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BI)V")
	private void method4440(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray43 = new int[2][4];
			this.anIntArrayArray43[0][1] = 0;
			this.anIntArrayArray43[0][2] = 0;
			this.anIntArrayArray43[1][2] = 4096;
			this.anIntArrayArray43[0][0] = 0;
			this.anIntArrayArray43[1][0] = 4096;
			this.anIntArrayArray43[0][3] = 0;
			this.anIntArrayArray43[1][3] = 4096;
			this.anIntArrayArray43[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray43 = new int[8][4];
			this.anIntArrayArray43[0][2] = 2602;
			this.anIntArrayArray43[0][0] = 0;
			this.anIntArrayArray43[0][1] = 2650;
			this.anIntArrayArray43[1][0] = 2867;
			this.anIntArrayArray43[1][1] = 2313;
			this.anIntArrayArray43[2][1] = 2618;
			this.anIntArrayArray43[2][0] = 3072;
			this.anIntArrayArray43[3][0] = 3276;
			this.anIntArrayArray43[3][1] = 2296;
			this.anIntArrayArray43[4][1] = 2072;
			this.anIntArrayArray43[1][2] = 1799;
			this.anIntArrayArray43[4][0] = 3481;
			this.anIntArrayArray43[5][0] = 3686;
			this.anIntArrayArray43[5][1] = 2730;
			this.anIntArrayArray43[2][2] = 1734;
			this.anIntArrayArray43[3][2] = 1220;
			this.anIntArrayArray43[0][3] = 2361;
			this.anIntArrayArray43[1][3] = 1558;
			this.anIntArrayArray43[2][3] = 1413;
			this.anIntArrayArray43[6][1] = 2232;
			this.anIntArrayArray43[3][3] = 947;
			this.anIntArrayArray43[4][2] = 963;
			this.anIntArrayArray43[5][2] = 2152;
			this.anIntArrayArray43[4][3] = 722;
			this.anIntArrayArray43[6][2] = 1060;
			this.anIntArrayArray43[7][1] = 1686;
			this.anIntArrayArray43[6][0] = 3891;
			this.anIntArrayArray43[7][2] = 1413;
			this.anIntArrayArray43[5][3] = 1766;
			this.anIntArrayArray43[7][0] = 4096;
			this.anIntArrayArray43[6][3] = 915;
			this.anIntArrayArray43[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray43 = new int[7][4];
			this.anIntArrayArray43[0][0] = 0;
			this.anIntArrayArray43[0][2] = 0;
			this.anIntArrayArray43[1][0] = 663;
			this.anIntArrayArray43[1][2] = 4096;
			this.anIntArrayArray43[0][3] = 4096;
			this.anIntArrayArray43[2][0] = 1363;
			this.anIntArrayArray43[3][0] = 2048;
			this.anIntArrayArray43[1][3] = 4096;
			this.anIntArrayArray43[4][0] = 2727;
			this.anIntArrayArray43[2][2] = 4096;
			this.anIntArrayArray43[5][0] = 3411;
			this.anIntArrayArray43[3][2] = 4096;
			this.anIntArrayArray43[6][0] = 4096;
			this.anIntArrayArray43[4][2] = 0;
			this.anIntArrayArray43[0][1] = 0;
			this.anIntArrayArray43[5][2] = 0;
			this.anIntArrayArray43[1][1] = 0;
			this.anIntArrayArray43[6][2] = 0;
			this.anIntArrayArray43[2][1] = 0;
			this.anIntArrayArray43[3][1] = 4096;
			this.anIntArrayArray43[4][1] = 4096;
			this.anIntArrayArray43[5][1] = 4096;
			this.anIntArrayArray43[2][3] = 0;
			this.anIntArrayArray43[6][1] = 0;
			this.anIntArrayArray43[3][3] = 0;
			this.anIntArrayArray43[4][3] = 0;
			this.anIntArrayArray43[5][3] = 4096;
			this.anIntArrayArray43[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray43 = new int[6][4];
			this.anIntArrayArray43[0][3] = 0;
			this.anIntArrayArray43[0][0] = 0;
			this.anIntArrayArray43[1][0] = 1843;
			this.anIntArrayArray43[0][2] = 0;
			this.anIntArrayArray43[0][1] = 0;
			this.anIntArrayArray43[1][1] = 0;
			this.anIntArrayArray43[1][2] = 0;
			this.anIntArrayArray43[2][2] = 0;
			this.anIntArrayArray43[2][0] = 2457;
			this.anIntArrayArray43[1][3] = 1493;
			this.anIntArrayArray43[2][3] = 2939;
			this.anIntArrayArray43[2][1] = 0;
			this.anIntArrayArray43[3][2] = 1124;
			this.anIntArrayArray43[3][0] = 2781;
			this.anIntArrayArray43[4][2] = 3084;
			this.anIntArrayArray43[3][3] = 3565;
			this.anIntArrayArray43[4][3] = 4031;
			this.anIntArrayArray43[5][2] = 4096;
			this.anIntArrayArray43[4][0] = 3481;
			this.anIntArrayArray43[3][1] = 0;
			this.anIntArrayArray43[4][1] = 546;
			this.anIntArrayArray43[5][1] = 4096;
			this.anIntArrayArray43[5][3] = 4096;
			this.anIntArrayArray43[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray43 = new int[16][4];
			this.anIntArrayArray43[0][3] = 321;
			this.anIntArrayArray43[0][1] = 80;
			this.anIntArrayArray43[1][1] = 321;
			this.anIntArrayArray43[1][3] = 562;
			this.anIntArrayArray43[2][1] = 578;
			this.anIntArrayArray43[0][2] = 192;
			this.anIntArrayArray43[2][3] = 803;
			this.anIntArrayArray43[3][1] = 947;
			this.anIntArrayArray43[0][0] = 0;
			this.anIntArrayArray43[4][1] = 1285;
			this.anIntArrayArray43[1][2] = 449;
			this.anIntArrayArray43[2][2] = 690;
			this.anIntArrayArray43[3][2] = 995;
			this.anIntArrayArray43[3][3] = 1140;
			this.anIntArrayArray43[4][3] = 1509;
			this.anIntArrayArray43[4][2] = 1397;
			this.anIntArrayArray43[5][2] = 1429;
			this.anIntArrayArray43[6][2] = 1461;
			this.anIntArrayArray43[1][0] = 155;
			this.anIntArrayArray43[5][1] = 1525;
			this.anIntArrayArray43[5][3] = 1413;
			this.anIntArrayArray43[2][0] = 389;
			this.anIntArrayArray43[7][2] = 1525;
			this.anIntArrayArray43[3][0] = 671;
			this.anIntArrayArray43[6][3] = 1333;
			this.anIntArrayArray43[4][0] = 897;
			this.anIntArrayArray43[7][3] = 1702;
			this.anIntArrayArray43[8][3] = 2056;
			this.anIntArrayArray43[9][3] = 2666;
			this.anIntArrayArray43[8][2] = 1590;
			this.anIntArrayArray43[6][1] = 1734;
			this.anIntArrayArray43[5][0] = 1175;
			this.anIntArrayArray43[9][2] = 2056;
			this.anIntArrayArray43[6][0] = 1368;
			this.anIntArrayArray43[10][2] = 2586;
			this.anIntArrayArray43[10][3] = 3276;
			this.anIntArrayArray43[11][3] = 3228;
			this.anIntArrayArray43[7][1] = 1413;
			this.anIntArrayArray43[11][2] = 3148;
			this.anIntArrayArray43[7][0] = 1507;
			this.anIntArrayArray43[12][2] = 3710;
			this.anIntArrayArray43[8][1] = 1108;
			this.anIntArrayArray43[12][3] = 3196;
			this.anIntArrayArray43[9][1] = 1766;
			this.anIntArrayArray43[13][2] = 3421;
			this.anIntArrayArray43[10][1] = 2409;
			this.anIntArrayArray43[11][1] = 3116;
			this.anIntArrayArray43[12][1] = 3806;
			this.anIntArrayArray43[13][3] = 3019;
			this.anIntArrayArray43[13][1] = 3437;
			this.anIntArrayArray43[14][2] = 3148;
			this.anIntArrayArray43[8][0] = 1736;
			this.anIntArrayArray43[14][1] = 3116;
			this.anIntArrayArray43[15][2] = 2505;
			this.anIntArrayArray43[9][0] = 2088;
			this.anIntArrayArray43[14][3] = 3228;
			this.anIntArrayArray43[15][3] = 2746;
			this.anIntArrayArray43[15][1] = 2377;
			this.anIntArrayArray43[10][0] = 2355;
			this.anIntArrayArray43[11][0] = 2691;
			this.anIntArrayArray43[12][0] = 3031;
			this.anIntArrayArray43[13][0] = 3522;
			this.anIntArrayArray43[14][0] = 3727;
			this.anIntArrayArray43[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray43 = new int[4][4];
			this.anIntArrayArray43[0][0] = 2048;
			this.anIntArrayArray43[1][0] = 2867;
			this.anIntArrayArray43[0][2] = 4096;
			this.anIntArrayArray43[0][3] = 0;
			this.anIntArrayArray43[1][3] = 0;
			this.anIntArrayArray43[2][3] = 0;
			this.anIntArrayArray43[1][2] = 4096;
			this.anIntArrayArray43[3][3] = 0;
			this.anIntArrayArray43[2][0] = 3276;
			this.anIntArrayArray43[0][1] = 0;
			this.anIntArrayArray43[1][1] = 4096;
			this.anIntArrayArray43[2][2] = 4096;
			this.anIntArrayArray43[3][2] = 0;
			this.anIntArrayArray43[3][0] = 4096;
			this.anIntArrayArray43[2][1] = 4096;
			this.anIntArrayArray43[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
