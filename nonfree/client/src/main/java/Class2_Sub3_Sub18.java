import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class2_Sub3_Sub18 extends Class2_Sub3 {

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!kf", name = "M", descriptor = "[I")
	private final int[] anIntArray291 = new int[257];

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V")
	private void method3331() {
		@Pc(9) int local9 = this.anIntArrayArray34.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local9 > local30 && this.anIntArrayArray34[local30][0] <= local28; local30++) {
				local24++;
			}
			@Pc(118) int local118;
			@Pc(104) int local104;
			@Pc(132) int local132;
			@Pc(57) int[] local57;
			if (local24 < local9) {
				local57 = this.anIntArrayArray34[local24];
				if (local24 > 0) {
					@Pc(69) int[] local69 = this.anIntArrayArray34[local24 - 1];
					@Pc(86) int local86 = (local28 - local69[0] << 12) / (local57[0] - local69[0]);
					@Pc(90) int local90 = 4096 - local86;
					local104 = local90 * local69[2] + local86 * local57[2] >> 12;
					local118 = local90 * local69[1] + local86 * local57[1] >> 12;
					local132 = local69[3] * local90 + local86 * local57[3] >> 12;
				} else {
					local104 = local57[2];
					local118 = local57[1];
					local132 = local57[3];
				}
			} else {
				local57 = this.anIntArrayArray34[local9 - 1];
				local104 = local57[2];
				local132 = local57[3];
				local118 = local57[1];
			}
			local132 >>= 0x4;
			local104 >>= 0x4;
			local118 >>= 0x4;
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
			if (local104 < 0) {
				local104 = 0;
			} else if (local104 > 255) {
				local104 = 255;
			}
			this.anIntArray291[local20] = local132 | local118 << 16 | local104 << 8;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(15) int local15 = arg1.method3124();
		if (local15 != 0) {
			this.method3333(local15);
			return;
		}
		this.anIntArrayArray34 = new int[arg1.method3124()][4];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray34.length; local26++) {
			this.anIntArrayArray34[local26][0] = arg1.method3104();
			this.anIntArrayArray34[local26][1] = arg1.method3124() << 4;
			this.anIntArrayArray34[local26][2] = arg1.method3124() << 4;
			this.anIntArrayArray34[local26][3] = arg1.method3124() << 4;
		}
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
		if (this.anIntArrayArray34 == null) {
			this.method3333(1);
		}
		this.method3331();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)V")
	private void method3333(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray34 = new int[2][4];
			this.anIntArrayArray34[0][0] = 0;
			this.anIntArrayArray34[0][3] = 0;
			this.anIntArrayArray34[0][1] = 0;
			this.anIntArrayArray34[0][2] = 0;
			this.anIntArrayArray34[1][1] = 4096;
			this.anIntArrayArray34[1][0] = 4096;
			this.anIntArrayArray34[1][2] = 4096;
			this.anIntArrayArray34[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray34 = new int[8][4];
			this.anIntArrayArray34[0][3] = 2361;
			this.anIntArrayArray34[0][2] = 2602;
			this.anIntArrayArray34[0][1] = 2650;
			this.anIntArrayArray34[0][0] = 0;
			this.anIntArrayArray34[1][0] = 2867;
			this.anIntArrayArray34[1][2] = 1799;
			this.anIntArrayArray34[1][1] = 2313;
			this.anIntArrayArray34[1][3] = 1558;
			this.anIntArrayArray34[2][3] = 1413;
			this.anIntArrayArray34[2][0] = 3072;
			this.anIntArrayArray34[2][1] = 2618;
			this.anIntArrayArray34[2][2] = 1734;
			this.anIntArrayArray34[3][1] = 2296;
			this.anIntArrayArray34[3][3] = 947;
			this.anIntArrayArray34[3][0] = 3276;
			this.anIntArrayArray34[3][2] = 1220;
			this.anIntArrayArray34[4][0] = 3481;
			this.anIntArrayArray34[4][3] = 722;
			this.anIntArrayArray34[4][1] = 2072;
			this.anIntArrayArray34[4][2] = 963;
			this.anIntArrayArray34[5][0] = 3686;
			this.anIntArrayArray34[5][1] = 2730;
			this.anIntArrayArray34[5][2] = 2152;
			this.anIntArrayArray34[5][3] = 1766;
			this.anIntArrayArray34[6][2] = 1060;
			this.anIntArrayArray34[6][1] = 2232;
			this.anIntArrayArray34[6][3] = 915;
			this.anIntArrayArray34[6][0] = 3891;
			this.anIntArrayArray34[7][1] = 1686;
			this.anIntArrayArray34[7][2] = 1413;
			this.anIntArrayArray34[7][3] = 1140;
			this.anIntArrayArray34[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray34 = new int[7][4];
			this.anIntArrayArray34[0][0] = 0;
			this.anIntArrayArray34[0][3] = 4096;
			this.anIntArrayArray34[0][2] = 0;
			this.anIntArrayArray34[0][1] = 0;
			this.anIntArrayArray34[1][1] = 0;
			this.anIntArrayArray34[1][0] = 663;
			this.anIntArrayArray34[1][2] = 4096;
			this.anIntArrayArray34[1][3] = 4096;
			this.anIntArrayArray34[2][2] = 4096;
			this.anIntArrayArray34[2][1] = 0;
			this.anIntArrayArray34[2][0] = 1363;
			this.anIntArrayArray34[2][3] = 0;
			this.anIntArrayArray34[3][2] = 4096;
			this.anIntArrayArray34[3][0] = 2048;
			this.anIntArrayArray34[3][3] = 0;
			this.anIntArrayArray34[3][1] = 4096;
			this.anIntArrayArray34[4][2] = 0;
			this.anIntArrayArray34[4][1] = 4096;
			this.anIntArrayArray34[4][3] = 0;
			this.anIntArrayArray34[4][0] = 2727;
			this.anIntArrayArray34[5][0] = 3411;
			this.anIntArrayArray34[5][2] = 0;
			this.anIntArrayArray34[5][1] = 4096;
			this.anIntArrayArray34[5][3] = 4096;
			this.anIntArrayArray34[6][3] = 4096;
			this.anIntArrayArray34[6][2] = 0;
			this.anIntArrayArray34[6][1] = 0;
			this.anIntArrayArray34[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray34 = new int[6][4];
			this.anIntArrayArray34[0][3] = 0;
			this.anIntArrayArray34[0][2] = 0;
			this.anIntArrayArray34[0][0] = 0;
			this.anIntArrayArray34[0][1] = 0;
			this.anIntArrayArray34[1][1] = 0;
			this.anIntArrayArray34[1][3] = 1493;
			this.anIntArrayArray34[1][0] = 1843;
			this.anIntArrayArray34[1][2] = 0;
			this.anIntArrayArray34[2][3] = 2939;
			this.anIntArrayArray34[2][1] = 0;
			this.anIntArrayArray34[2][0] = 2457;
			this.anIntArrayArray34[2][2] = 0;
			this.anIntArrayArray34[3][0] = 2781;
			this.anIntArrayArray34[3][3] = 3565;
			this.anIntArrayArray34[3][1] = 0;
			this.anIntArrayArray34[3][2] = 1124;
			this.anIntArrayArray34[4][0] = 3481;
			this.anIntArrayArray34[4][3] = 4031;
			this.anIntArrayArray34[4][1] = 546;
			this.anIntArrayArray34[4][2] = 3084;
			this.anIntArrayArray34[5][3] = 4096;
			this.anIntArrayArray34[5][0] = 4096;
			this.anIntArrayArray34[5][2] = 4096;
			this.anIntArrayArray34[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray34 = new int[16][4];
			this.anIntArrayArray34[0][2] = 192;
			this.anIntArrayArray34[0][0] = 0;
			this.anIntArrayArray34[0][3] = 321;
			this.anIntArrayArray34[0][1] = 80;
			this.anIntArrayArray34[1][2] = 449;
			this.anIntArrayArray34[1][1] = 321;
			this.anIntArrayArray34[1][0] = 155;
			this.anIntArrayArray34[1][3] = 562;
			this.anIntArrayArray34[2][1] = 578;
			this.anIntArrayArray34[2][3] = 803;
			this.anIntArrayArray34[2][2] = 690;
			this.anIntArrayArray34[2][0] = 389;
			this.anIntArrayArray34[3][2] = 995;
			this.anIntArrayArray34[3][3] = 1140;
			this.anIntArrayArray34[3][1] = 947;
			this.anIntArrayArray34[3][0] = 671;
			this.anIntArrayArray34[4][3] = 1509;
			this.anIntArrayArray34[4][0] = 897;
			this.anIntArrayArray34[4][1] = 1285;
			this.anIntArrayArray34[4][2] = 1397;
			this.anIntArrayArray34[5][2] = 1429;
			this.anIntArrayArray34[5][0] = 1175;
			this.anIntArrayArray34[5][3] = 1413;
			this.anIntArrayArray34[5][1] = 1525;
			this.anIntArrayArray34[6][2] = 1461;
			this.anIntArrayArray34[6][0] = 1368;
			this.anIntArrayArray34[6][3] = 1333;
			this.anIntArrayArray34[6][1] = 1734;
			this.anIntArrayArray34[7][1] = 1413;
			this.anIntArrayArray34[7][2] = 1525;
			this.anIntArrayArray34[7][3] = 1702;
			this.anIntArrayArray34[7][0] = 1507;
			this.anIntArrayArray34[8][2] = 1590;
			this.anIntArrayArray34[8][0] = 1736;
			this.anIntArrayArray34[8][3] = 2056;
			this.anIntArrayArray34[8][1] = 1108;
			this.anIntArrayArray34[9][1] = 1766;
			this.anIntArrayArray34[9][3] = 2666;
			this.anIntArrayArray34[9][0] = 2088;
			this.anIntArrayArray34[9][2] = 2056;
			this.anIntArrayArray34[10][0] = 2355;
			this.anIntArrayArray34[10][2] = 2586;
			this.anIntArrayArray34[10][1] = 2409;
			this.anIntArrayArray34[10][3] = 3276;
			this.anIntArrayArray34[11][3] = 3228;
			this.anIntArrayArray34[11][2] = 3148;
			this.anIntArrayArray34[11][0] = 2691;
			this.anIntArrayArray34[11][1] = 3116;
			this.anIntArrayArray34[12][1] = 3806;
			this.anIntArrayArray34[12][0] = 3031;
			this.anIntArrayArray34[12][2] = 3710;
			this.anIntArrayArray34[12][3] = 3196;
			this.anIntArrayArray34[13][3] = 3019;
			this.anIntArrayArray34[13][2] = 3421;
			this.anIntArrayArray34[13][1] = 3437;
			this.anIntArrayArray34[13][0] = 3522;
			this.anIntArrayArray34[14][3] = 3228;
			this.anIntArrayArray34[14][2] = 3148;
			this.anIntArrayArray34[14][1] = 3116;
			this.anIntArrayArray34[14][0] = 3727;
			this.anIntArrayArray34[15][0] = 4096;
			this.anIntArrayArray34[15][2] = 2505;
			this.anIntArrayArray34[15][3] = 2746;
			this.anIntArrayArray34[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray34 = new int[4][4];
			this.anIntArrayArray34[0][2] = 4096;
			this.anIntArrayArray34[0][1] = 0;
			this.anIntArrayArray34[0][3] = 0;
			this.anIntArrayArray34[0][0] = 2048;
			this.anIntArrayArray34[1][0] = 2867;
			this.anIntArrayArray34[1][2] = 4096;
			this.anIntArrayArray34[1][1] = 4096;
			this.anIntArrayArray34[1][3] = 0;
			this.anIntArrayArray34[2][2] = 4096;
			this.anIntArrayArray34[2][3] = 0;
			this.anIntArrayArray34[2][0] = 3276;
			this.anIntArrayArray34[2][1] = 4096;
			this.anIntArrayArray34[3][1] = 4096;
			this.anIntArrayArray34[3][0] = 4096;
			this.anIntArrayArray34[3][3] = 0;
			this.anIntArrayArray34[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(26) int[] local26 = this.method5700(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static263.anInt5504; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray291[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}
}
