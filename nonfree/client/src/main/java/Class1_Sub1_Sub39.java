import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wg", name = "qb", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!wg", name = "fb", descriptor = "[I")
	private int[] anIntArray376 = new int[257];

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
		if (this.anIntArrayArray40 == null) {
			this.method3746(1);
		}
		this.method3740();
	}

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)V")
	private void method3740() {
		@Pc(14) int local14 = this.anIntArrayArray40.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 257; local18++) {
			@Pc(22) int local22 = 0;
			@Pc(26) int local26 = local18 << 4;
			for (@Pc(28) int local28 = 0; local14 > local28 && local26 >= this.anIntArrayArray40[local28][0]; local28++) {
				local22++;
			}
			@Pc(61) int local61;
			@Pc(69) int local69;
			@Pc(65) int local65;
			@Pc(55) int[] local55;
			if (local22 < local14) {
				local55 = this.anIntArrayArray40[local22];
				if (local22 <= 0) {
					local61 = local55[1];
					local65 = local55[3];
					local69 = local55[2];
				} else {
					@Pc(78) int[] local78 = this.anIntArrayArray40[local22 - 1];
					@Pc(95) int local95 = (local26 - local78[0] << 12) / (local55[0] - local78[0]);
					@Pc(100) int local100 = 4096 - local95;
					local65 = local95 * local55[3] + local100 * local78[3] >> 12;
					local69 = local78[2] * local100 + local95 * local55[2] >> 12;
					local61 = local78[1] * local100 + local95 * local55[1] >> 12;
				}
			} else {
				local55 = this.anIntArrayArray40[local14 - 1];
				local61 = local55[1];
				local69 = local55[2];
				local65 = local55[3];
			}
			local61 >>= 0x4;
			local65 >>= 0x4;
			if (local65 < 0) {
				local65 = 0;
			} else if (local65 > 255) {
				local65 = 255;
			}
			local69 >>= 0x4;
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray376[local18] = local65 | local69 << 8 | local61 << 16;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(16) int local16 = arg0.method3793();
		if (local16 != 0) {
			this.method3746(local16);
			return;
		}
		this.anIntArrayArray40 = new int[arg0.method3793()][4];
		for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray40.length; local33++) {
			this.anIntArrayArray40[local33][0] = arg0.method3805();
			this.anIntArrayArray40[local33][1] = arg0.method3793() << 4;
			this.anIntArrayArray40[local33][2] = arg0.method3793() << 4;
			this.anIntArrayArray40[local33][3] = arg0.method3793() << 4;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(26) int[] local26 = this.method3733(arg0, 0);
			@Pc(30) int[] local30 = local16[2];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[0];
			for (@Pc(40) int local40 = 0; local40 < Static157.anInt3431; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray376[local48];
				local38[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local30[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(II)V")
	private void method3746(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray40 = new int[2][4];
			this.anIntArrayArray40[0][2] = 0;
			this.anIntArrayArray40[1][2] = 4096;
			this.anIntArrayArray40[0][1] = 0;
			this.anIntArrayArray40[1][1] = 4096;
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[1][0] = 4096;
			this.anIntArrayArray40[0][3] = 0;
			this.anIntArrayArray40[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray40 = new int[8][4];
			this.anIntArrayArray40[0][3] = 2361;
			this.anIntArrayArray40[1][3] = 1558;
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[0][1] = 2650;
			this.anIntArrayArray40[2][3] = 1413;
			this.anIntArrayArray40[0][2] = 2602;
			this.anIntArrayArray40[1][2] = 1799;
			this.anIntArrayArray40[1][1] = 2313;
			this.anIntArrayArray40[2][1] = 2618;
			this.anIntArrayArray40[3][1] = 2296;
			this.anIntArrayArray40[3][3] = 947;
			this.anIntArrayArray40[4][1] = 2072;
			this.anIntArrayArray40[1][0] = 2867;
			this.anIntArrayArray40[5][1] = 2730;
			this.anIntArrayArray40[6][1] = 2232;
			this.anIntArrayArray40[7][1] = 1686;
			this.anIntArrayArray40[4][3] = 722;
			this.anIntArrayArray40[2][0] = 3072;
			this.anIntArrayArray40[2][2] = 1734;
			this.anIntArrayArray40[3][2] = 1220;
			this.anIntArrayArray40[3][0] = 3276;
			this.anIntArrayArray40[5][3] = 1766;
			this.anIntArrayArray40[4][0] = 3481;
			this.anIntArrayArray40[5][0] = 3686;
			this.anIntArrayArray40[6][0] = 3891;
			this.anIntArrayArray40[4][2] = 963;
			this.anIntArrayArray40[6][3] = 915;
			this.anIntArrayArray40[5][2] = 2152;
			this.anIntArrayArray40[7][0] = 4096;
			this.anIntArrayArray40[7][3] = 1140;
			this.anIntArrayArray40[6][2] = 1060;
			this.anIntArrayArray40[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray40 = new int[7][4];
			this.anIntArrayArray40[0][1] = 0;
			this.anIntArrayArray40[0][3] = 4096;
			this.anIntArrayArray40[1][1] = 0;
			this.anIntArrayArray40[1][3] = 4096;
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[0][2] = 0;
			this.anIntArrayArray40[2][1] = 0;
			this.anIntArrayArray40[3][1] = 4096;
			this.anIntArrayArray40[1][0] = 663;
			this.anIntArrayArray40[2][0] = 1363;
			this.anIntArrayArray40[1][2] = 4096;
			this.anIntArrayArray40[3][0] = 2048;
			this.anIntArrayArray40[2][2] = 4096;
			this.anIntArrayArray40[4][1] = 4096;
			this.anIntArrayArray40[4][0] = 2727;
			this.anIntArrayArray40[5][0] = 3411;
			this.anIntArrayArray40[3][2] = 4096;
			this.anIntArrayArray40[5][1] = 4096;
			this.anIntArrayArray40[2][3] = 0;
			this.anIntArrayArray40[4][2] = 0;
			this.anIntArrayArray40[6][0] = 4096;
			this.anIntArrayArray40[5][2] = 0;
			this.anIntArrayArray40[3][3] = 0;
			this.anIntArrayArray40[4][3] = 0;
			this.anIntArrayArray40[6][2] = 0;
			this.anIntArrayArray40[5][3] = 4096;
			this.anIntArrayArray40[6][1] = 0;
			this.anIntArrayArray40[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray40 = new int[6][4];
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[0][2] = 0;
			this.anIntArrayArray40[0][3] = 0;
			this.anIntArrayArray40[0][1] = 0;
			this.anIntArrayArray40[1][2] = 0;
			this.anIntArrayArray40[1][3] = 1493;
			this.anIntArrayArray40[2][3] = 2939;
			this.anIntArrayArray40[1][0] = 1843;
			this.anIntArrayArray40[1][1] = 0;
			this.anIntArrayArray40[2][2] = 0;
			this.anIntArrayArray40[3][3] = 3565;
			this.anIntArrayArray40[2][0] = 2457;
			this.anIntArrayArray40[3][2] = 1124;
			this.anIntArrayArray40[2][1] = 0;
			this.anIntArrayArray40[3][1] = 0;
			this.anIntArrayArray40[4][1] = 546;
			this.anIntArrayArray40[3][0] = 2781;
			this.anIntArrayArray40[5][1] = 4096;
			this.anIntArrayArray40[4][0] = 3481;
			this.anIntArrayArray40[5][0] = 4096;
			this.anIntArrayArray40[4][2] = 3084;
			this.anIntArrayArray40[4][3] = 4031;
			this.anIntArrayArray40[5][3] = 4096;
			this.anIntArrayArray40[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray40 = new int[16][4];
			this.anIntArrayArray40[0][2] = 192;
			this.anIntArrayArray40[0][1] = 80;
			this.anIntArrayArray40[1][1] = 321;
			this.anIntArrayArray40[2][1] = 578;
			this.anIntArrayArray40[1][2] = 449;
			this.anIntArrayArray40[3][1] = 947;
			this.anIntArrayArray40[2][2] = 690;
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[0][3] = 321;
			this.anIntArrayArray40[4][1] = 1285;
			this.anIntArrayArray40[1][3] = 562;
			this.anIntArrayArray40[3][2] = 995;
			this.anIntArrayArray40[1][0] = 155;
			this.anIntArrayArray40[2][0] = 389;
			this.anIntArrayArray40[5][1] = 1525;
			this.anIntArrayArray40[3][0] = 671;
			this.anIntArrayArray40[4][0] = 897;
			this.anIntArrayArray40[2][3] = 803;
			this.anIntArrayArray40[3][3] = 1140;
			this.anIntArrayArray40[6][1] = 1734;
			this.anIntArrayArray40[5][0] = 1175;
			this.anIntArrayArray40[7][1] = 1413;
			this.anIntArrayArray40[4][3] = 1509;
			this.anIntArrayArray40[8][1] = 1108;
			this.anIntArrayArray40[5][3] = 1413;
			this.anIntArrayArray40[9][1] = 1766;
			this.anIntArrayArray40[10][1] = 2409;
			this.anIntArrayArray40[6][3] = 1333;
			this.anIntArrayArray40[6][0] = 1368;
			this.anIntArrayArray40[4][2] = 1397;
			this.anIntArrayArray40[5][2] = 1429;
			this.anIntArrayArray40[7][0] = 1507;
			this.anIntArrayArray40[7][3] = 1702;
			this.anIntArrayArray40[8][0] = 1736;
			this.anIntArrayArray40[9][0] = 2088;
			this.anIntArrayArray40[11][1] = 3116;
			this.anIntArrayArray40[12][1] = 3806;
			this.anIntArrayArray40[6][2] = 1461;
			this.anIntArrayArray40[7][2] = 1525;
			this.anIntArrayArray40[10][0] = 2355;
			this.anIntArrayArray40[11][0] = 2691;
			this.anIntArrayArray40[8][3] = 2056;
			this.anIntArrayArray40[12][0] = 3031;
			this.anIntArrayArray40[9][3] = 2666;
			this.anIntArrayArray40[13][1] = 3437;
			this.anIntArrayArray40[14][1] = 3116;
			this.anIntArrayArray40[8][2] = 1590;
			this.anIntArrayArray40[9][2] = 2056;
			this.anIntArrayArray40[15][1] = 2377;
			this.anIntArrayArray40[13][0] = 3522;
			this.anIntArrayArray40[10][3] = 3276;
			this.anIntArrayArray40[10][2] = 2586;
			this.anIntArrayArray40[11][2] = 3148;
			this.anIntArrayArray40[12][2] = 3710;
			this.anIntArrayArray40[14][0] = 3727;
			this.anIntArrayArray40[13][2] = 3421;
			this.anIntArrayArray40[15][0] = 4096;
			this.anIntArrayArray40[14][2] = 3148;
			this.anIntArrayArray40[11][3] = 3228;
			this.anIntArrayArray40[15][2] = 2505;
			this.anIntArrayArray40[12][3] = 3196;
			this.anIntArrayArray40[13][3] = 3019;
			this.anIntArrayArray40[14][3] = 3228;
			this.anIntArrayArray40[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray40 = new int[4][4];
			this.anIntArrayArray40[0][1] = 0;
			this.anIntArrayArray40[1][1] = 4096;
			this.anIntArrayArray40[2][1] = 4096;
			this.anIntArrayArray40[3][1] = 4096;
			this.anIntArrayArray40[0][2] = 4096;
			this.anIntArrayArray40[1][2] = 4096;
			this.anIntArrayArray40[0][0] = 2048;
			this.anIntArrayArray40[1][0] = 2867;
			this.anIntArrayArray40[2][0] = 3276;
			this.anIntArrayArray40[2][2] = 4096;
			this.anIntArrayArray40[3][2] = 0;
			this.anIntArrayArray40[3][0] = 4096;
			this.anIntArrayArray40[0][3] = 0;
			this.anIntArrayArray40[1][3] = 0;
			this.anIntArrayArray40[2][3] = 0;
			this.anIntArrayArray40[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
