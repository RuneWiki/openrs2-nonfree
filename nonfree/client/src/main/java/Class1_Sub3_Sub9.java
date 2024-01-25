import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dm", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!dm", name = "R", descriptor = "[I")
	private final int[] anIntArray163 = new int[257];

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
	private void method1490() {
		@Pc(15) int local15 = this.anIntArrayArray18.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local22 << 4;
			for (@Pc(32) int local32 = 0; local15 > local32 && this.anIntArrayArray18[local32][0] <= local30; local32++) {
				local26++;
			}
			@Pc(77) int local77;
			@Pc(73) int local73;
			@Pc(69) int local69;
			@Pc(63) int[] local63;
			if (local26 < local15) {
				local63 = this.anIntArrayArray18[local26];
				if (local26 <= 0) {
					local69 = local63[3];
					local73 = local63[2];
					local77 = local63[1];
				} else {
					@Pc(86) int[] local86 = this.anIntArrayArray18[local26 - 1];
					@Pc(103) int local103 = (local30 - local86[0] << 12) / (local63[0] - local86[0]);
					@Pc(108) int local108 = 4096 - local103;
					local73 = local63[2] * local103 + local108 * local86[2] >> 12;
					local77 = local86[1] * local108 + local103 * local63[1] >> 12;
					local69 = local86[3] * local108 + local103 * local63[3] >> 12;
				}
			} else {
				local63 = this.anIntArrayArray18[local15 - 1];
				local73 = local63[2];
				local69 = local63[3];
				local77 = local63[1];
			}
			local77 >>= 0x4;
			local73 >>= 0x4;
			local69 >>= 0x4;
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			if (local77 < 0) {
				local77 = 0;
			} else if (local77 > 255) {
				local77 = 255;
			}
			if (local73 < 0) {
				local73 = 0;
			} else if (local73 > 255) {
				local73 = 255;
			}
			this.anIntArray163[local22] = local69 | local73 << 8 | local77 << 16;
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(II)V")
	private void method1491(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray18 = new int[2][4];
			this.anIntArrayArray18[0][0] = 0;
			this.anIntArrayArray18[0][3] = 0;
			this.anIntArrayArray18[0][2] = 0;
			this.anIntArrayArray18[0][1] = 0;
			this.anIntArrayArray18[1][1] = 4096;
			this.anIntArrayArray18[1][3] = 4096;
			this.anIntArrayArray18[1][0] = 4096;
			this.anIntArrayArray18[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray18 = new int[8][4];
			this.anIntArrayArray18[0][3] = 2361;
			this.anIntArrayArray18[0][2] = 2602;
			this.anIntArrayArray18[0][1] = 2650;
			this.anIntArrayArray18[0][0] = 0;
			this.anIntArrayArray18[1][0] = 2867;
			this.anIntArrayArray18[1][2] = 1799;
			this.anIntArrayArray18[1][1] = 2313;
			this.anIntArrayArray18[1][3] = 1558;
			this.anIntArrayArray18[2][1] = 2618;
			this.anIntArrayArray18[2][0] = 3072;
			this.anIntArrayArray18[2][2] = 1734;
			this.anIntArrayArray18[2][3] = 1413;
			this.anIntArrayArray18[3][0] = 3276;
			this.anIntArrayArray18[3][2] = 1220;
			this.anIntArrayArray18[3][1] = 2296;
			this.anIntArrayArray18[3][3] = 947;
			this.anIntArrayArray18[4][3] = 722;
			this.anIntArrayArray18[4][1] = 2072;
			this.anIntArrayArray18[4][2] = 963;
			this.anIntArrayArray18[4][0] = 3481;
			this.anIntArrayArray18[5][0] = 3686;
			this.anIntArrayArray18[5][3] = 1766;
			this.anIntArrayArray18[5][2] = 2152;
			this.anIntArrayArray18[5][1] = 2730;
			this.anIntArrayArray18[6][3] = 915;
			this.anIntArrayArray18[6][1] = 2232;
			this.anIntArrayArray18[6][2] = 1060;
			this.anIntArrayArray18[6][0] = 3891;
			this.anIntArrayArray18[7][0] = 4096;
			this.anIntArrayArray18[7][1] = 1686;
			this.anIntArrayArray18[7][3] = 1140;
			this.anIntArrayArray18[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray18 = new int[7][4];
			this.anIntArrayArray18[0][0] = 0;
			this.anIntArrayArray18[0][1] = 0;
			this.anIntArrayArray18[0][2] = 0;
			this.anIntArrayArray18[0][3] = 4096;
			this.anIntArrayArray18[1][1] = 0;
			this.anIntArrayArray18[1][2] = 4096;
			this.anIntArrayArray18[1][0] = 663;
			this.anIntArrayArray18[1][3] = 4096;
			this.anIntArrayArray18[2][2] = 4096;
			this.anIntArrayArray18[2][3] = 0;
			this.anIntArrayArray18[2][0] = 1363;
			this.anIntArrayArray18[2][1] = 0;
			this.anIntArrayArray18[3][2] = 4096;
			this.anIntArrayArray18[3][0] = 2048;
			this.anIntArrayArray18[3][1] = 4096;
			this.anIntArrayArray18[3][3] = 0;
			this.anIntArrayArray18[4][0] = 2727;
			this.anIntArrayArray18[4][1] = 4096;
			this.anIntArrayArray18[4][2] = 0;
			this.anIntArrayArray18[4][3] = 0;
			this.anIntArrayArray18[5][3] = 4096;
			this.anIntArrayArray18[5][2] = 0;
			this.anIntArrayArray18[5][0] = 3411;
			this.anIntArrayArray18[5][1] = 4096;
			this.anIntArrayArray18[6][0] = 4096;
			this.anIntArrayArray18[6][1] = 0;
			this.anIntArrayArray18[6][2] = 0;
			this.anIntArrayArray18[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray18 = new int[6][4];
			this.anIntArrayArray18[0][2] = 0;
			this.anIntArrayArray18[0][3] = 0;
			this.anIntArrayArray18[0][0] = 0;
			this.anIntArrayArray18[0][1] = 0;
			this.anIntArrayArray18[1][2] = 0;
			this.anIntArrayArray18[1][0] = 1843;
			this.anIntArrayArray18[1][3] = 1493;
			this.anIntArrayArray18[1][1] = 0;
			this.anIntArrayArray18[2][2] = 0;
			this.anIntArrayArray18[2][3] = 2939;
			this.anIntArrayArray18[2][1] = 0;
			this.anIntArrayArray18[2][0] = 2457;
			this.anIntArrayArray18[3][1] = 0;
			this.anIntArrayArray18[3][0] = 2781;
			this.anIntArrayArray18[3][3] = 3565;
			this.anIntArrayArray18[3][2] = 1124;
			this.anIntArrayArray18[4][1] = 546;
			this.anIntArrayArray18[4][2] = 3084;
			this.anIntArrayArray18[4][3] = 4031;
			this.anIntArrayArray18[4][0] = 3481;
			this.anIntArrayArray18[5][0] = 4096;
			this.anIntArrayArray18[5][3] = 4096;
			this.anIntArrayArray18[5][2] = 4096;
			this.anIntArrayArray18[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray18 = new int[16][4];
			this.anIntArrayArray18[0][1] = 80;
			this.anIntArrayArray18[0][2] = 192;
			this.anIntArrayArray18[0][3] = 321;
			this.anIntArrayArray18[0][0] = 0;
			this.anIntArrayArray18[1][0] = 155;
			this.anIntArrayArray18[1][3] = 562;
			this.anIntArrayArray18[1][2] = 449;
			this.anIntArrayArray18[1][1] = 321;
			this.anIntArrayArray18[2][0] = 389;
			this.anIntArrayArray18[2][2] = 690;
			this.anIntArrayArray18[2][3] = 803;
			this.anIntArrayArray18[2][1] = 578;
			this.anIntArrayArray18[3][1] = 947;
			this.anIntArrayArray18[3][2] = 995;
			this.anIntArrayArray18[3][0] = 671;
			this.anIntArrayArray18[3][3] = 1140;
			this.anIntArrayArray18[4][0] = 897;
			this.anIntArrayArray18[4][3] = 1509;
			this.anIntArrayArray18[4][1] = 1285;
			this.anIntArrayArray18[4][2] = 1397;
			this.anIntArrayArray18[5][1] = 1525;
			this.anIntArrayArray18[5][3] = 1413;
			this.anIntArrayArray18[5][2] = 1429;
			this.anIntArrayArray18[5][0] = 1175;
			this.anIntArrayArray18[6][2] = 1461;
			this.anIntArrayArray18[6][3] = 1333;
			this.anIntArrayArray18[6][1] = 1734;
			this.anIntArrayArray18[6][0] = 1368;
			this.anIntArrayArray18[7][0] = 1507;
			this.anIntArrayArray18[7][3] = 1702;
			this.anIntArrayArray18[7][2] = 1525;
			this.anIntArrayArray18[7][1] = 1413;
			this.anIntArrayArray18[8][2] = 1590;
			this.anIntArrayArray18[8][0] = 1736;
			this.anIntArrayArray18[8][3] = 2056;
			this.anIntArrayArray18[8][1] = 1108;
			this.anIntArrayArray18[9][2] = 2056;
			this.anIntArrayArray18[9][0] = 2088;
			this.anIntArrayArray18[9][1] = 1766;
			this.anIntArrayArray18[9][3] = 2666;
			this.anIntArrayArray18[10][2] = 2586;
			this.anIntArrayArray18[10][3] = 3276;
			this.anIntArrayArray18[10][0] = 2355;
			this.anIntArrayArray18[10][1] = 2409;
			this.anIntArrayArray18[11][3] = 3228;
			this.anIntArrayArray18[11][0] = 2691;
			this.anIntArrayArray18[11][1] = 3116;
			this.anIntArrayArray18[11][2] = 3148;
			this.anIntArrayArray18[12][2] = 3710;
			this.anIntArrayArray18[12][0] = 3031;
			this.anIntArrayArray18[12][3] = 3196;
			this.anIntArrayArray18[12][1] = 3806;
			this.anIntArrayArray18[13][3] = 3019;
			this.anIntArrayArray18[13][1] = 3437;
			this.anIntArrayArray18[13][0] = 3522;
			this.anIntArrayArray18[13][2] = 3421;
			this.anIntArrayArray18[14][1] = 3116;
			this.anIntArrayArray18[14][3] = 3228;
			this.anIntArrayArray18[14][0] = 3727;
			this.anIntArrayArray18[14][2] = 3148;
			this.anIntArrayArray18[15][2] = 2505;
			this.anIntArrayArray18[15][1] = 2377;
			this.anIntArrayArray18[15][0] = 4096;
			this.anIntArrayArray18[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray18 = new int[4][4];
			this.anIntArrayArray18[0][2] = 4096;
			this.anIntArrayArray18[0][1] = 0;
			this.anIntArrayArray18[0][0] = 2048;
			this.anIntArrayArray18[0][3] = 0;
			this.anIntArrayArray18[1][1] = 4096;
			this.anIntArrayArray18[1][0] = 2867;
			this.anIntArrayArray18[1][2] = 4096;
			this.anIntArrayArray18[1][3] = 0;
			this.anIntArrayArray18[2][3] = 0;
			this.anIntArrayArray18[2][2] = 4096;
			this.anIntArrayArray18[2][1] = 4096;
			this.anIntArrayArray18[2][0] = 3276;
			this.anIntArrayArray18[3][0] = 4096;
			this.anIntArrayArray18[3][2] = 0;
			this.anIntArrayArray18[3][3] = 0;
			this.anIntArrayArray18[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(14) int local14 = arg1.method4532();
		if (local14 != 0) {
			this.method1491(local14);
			return;
		}
		this.anIntArrayArray18 = new int[arg1.method4532()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray18.length; local31++) {
			this.anIntArrayArray18[local31][0] = arg1.method4556();
			this.anIntArrayArray18[local31][1] = arg1.method4532() << 4;
			this.anIntArrayArray18[local31][2] = arg1.method4532() << 4;
			this.anIntArrayArray18[local31][3] = arg1.method4532() << 4;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(26) int[] local26 = this.method5532(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static153.anInt3378; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray163[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
		if (this.anIntArrayArray18 == null) {
			this.method1491(1);
		}
		this.method1490();
	}
}
