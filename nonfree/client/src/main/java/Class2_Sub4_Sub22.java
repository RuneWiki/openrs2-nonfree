import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class2_Sub4_Sub22 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ki", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!ki", name = "E", descriptor = "[I")
	private final int[] anIntArray339 = new int[257];

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(10) int local10 = arg0.method2859();
		if (local10 != 0) {
			this.method4687(local10);
			return;
		}
		this.anIntArrayArray56 = new int[arg0.method2859()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray56.length; local21++) {
			this.anIntArrayArray56[local21][0] = arg0.method2825();
			this.anIntArrayArray56[local21][1] = arg0.method2859() << 4;
			this.anIntArrayArray56[local21][2] = arg0.method2859() << 4;
			this.anIntArrayArray56[local21][3] = arg0.method2859() << 4;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V")
	private void method4687(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray56 = new int[2][4];
			this.anIntArrayArray56[0][3] = 0;
			this.anIntArrayArray56[0][2] = 0;
			this.anIntArrayArray56[0][1] = 0;
			this.anIntArrayArray56[0][0] = 0;
			this.anIntArrayArray56[1][2] = 4096;
			this.anIntArrayArray56[1][0] = 4096;
			this.anIntArrayArray56[1][3] = 4096;
			this.anIntArrayArray56[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray56 = new int[8][4];
			this.anIntArrayArray56[0][2] = 2602;
			this.anIntArrayArray56[0][1] = 2650;
			this.anIntArrayArray56[0][0] = 0;
			this.anIntArrayArray56[0][3] = 2361;
			this.anIntArrayArray56[1][0] = 2867;
			this.anIntArrayArray56[1][3] = 1558;
			this.anIntArrayArray56[1][2] = 1799;
			this.anIntArrayArray56[1][1] = 2313;
			this.anIntArrayArray56[2][1] = 2618;
			this.anIntArrayArray56[2][2] = 1734;
			this.anIntArrayArray56[2][0] = 3072;
			this.anIntArrayArray56[2][3] = 1413;
			this.anIntArrayArray56[3][2] = 1220;
			this.anIntArrayArray56[3][3] = 947;
			this.anIntArrayArray56[3][1] = 2296;
			this.anIntArrayArray56[3][0] = 3276;
			this.anIntArrayArray56[4][0] = 3481;
			this.anIntArrayArray56[4][2] = 963;
			this.anIntArrayArray56[4][3] = 722;
			this.anIntArrayArray56[4][1] = 2072;
			this.anIntArrayArray56[5][2] = 2152;
			this.anIntArrayArray56[5][3] = 1766;
			this.anIntArrayArray56[5][1] = 2730;
			this.anIntArrayArray56[5][0] = 3686;
			this.anIntArrayArray56[6][1] = 2232;
			this.anIntArrayArray56[6][3] = 915;
			this.anIntArrayArray56[6][0] = 3891;
			this.anIntArrayArray56[6][2] = 1060;
			this.anIntArrayArray56[7][1] = 1686;
			this.anIntArrayArray56[7][3] = 1140;
			this.anIntArrayArray56[7][0] = 4096;
			this.anIntArrayArray56[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray56 = new int[7][4];
			this.anIntArrayArray56[0][3] = 4096;
			this.anIntArrayArray56[0][1] = 0;
			this.anIntArrayArray56[0][2] = 0;
			this.anIntArrayArray56[0][0] = 0;
			this.anIntArrayArray56[1][1] = 0;
			this.anIntArrayArray56[1][0] = 663;
			this.anIntArrayArray56[1][3] = 4096;
			this.anIntArrayArray56[1][2] = 4096;
			this.anIntArrayArray56[2][2] = 4096;
			this.anIntArrayArray56[2][1] = 0;
			this.anIntArrayArray56[2][3] = 0;
			this.anIntArrayArray56[2][0] = 1363;
			this.anIntArrayArray56[3][1] = 4096;
			this.anIntArrayArray56[3][2] = 4096;
			this.anIntArrayArray56[3][3] = 0;
			this.anIntArrayArray56[3][0] = 2048;
			this.anIntArrayArray56[4][1] = 4096;
			this.anIntArrayArray56[4][2] = 0;
			this.anIntArrayArray56[4][3] = 0;
			this.anIntArrayArray56[4][0] = 2727;
			this.anIntArrayArray56[5][0] = 3411;
			this.anIntArrayArray56[5][1] = 4096;
			this.anIntArrayArray56[5][2] = 0;
			this.anIntArrayArray56[5][3] = 4096;
			this.anIntArrayArray56[6][1] = 0;
			this.anIntArrayArray56[6][3] = 4096;
			this.anIntArrayArray56[6][0] = 4096;
			this.anIntArrayArray56[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray56 = new int[6][4];
			this.anIntArrayArray56[0][1] = 0;
			this.anIntArrayArray56[0][0] = 0;
			this.anIntArrayArray56[0][2] = 0;
			this.anIntArrayArray56[0][3] = 0;
			this.anIntArrayArray56[1][2] = 0;
			this.anIntArrayArray56[1][1] = 0;
			this.anIntArrayArray56[1][3] = 1493;
			this.anIntArrayArray56[1][0] = 1843;
			this.anIntArrayArray56[2][0] = 2457;
			this.anIntArrayArray56[2][1] = 0;
			this.anIntArrayArray56[2][3] = 2939;
			this.anIntArrayArray56[2][2] = 0;
			this.anIntArrayArray56[3][3] = 3565;
			this.anIntArrayArray56[3][0] = 2781;
			this.anIntArrayArray56[3][1] = 0;
			this.anIntArrayArray56[3][2] = 1124;
			this.anIntArrayArray56[4][1] = 546;
			this.anIntArrayArray56[4][3] = 4031;
			this.anIntArrayArray56[4][0] = 3481;
			this.anIntArrayArray56[4][2] = 3084;
			this.anIntArrayArray56[5][0] = 4096;
			this.anIntArrayArray56[5][3] = 4096;
			this.anIntArrayArray56[5][1] = 4096;
			this.anIntArrayArray56[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray56 = new int[16][4];
			this.anIntArrayArray56[0][3] = 321;
			this.anIntArrayArray56[0][2] = 192;
			this.anIntArrayArray56[0][1] = 80;
			this.anIntArrayArray56[0][0] = 0;
			this.anIntArrayArray56[1][1] = 321;
			this.anIntArrayArray56[1][0] = 155;
			this.anIntArrayArray56[1][2] = 449;
			this.anIntArrayArray56[1][3] = 562;
			this.anIntArrayArray56[2][1] = 578;
			this.anIntArrayArray56[2][3] = 803;
			this.anIntArrayArray56[2][0] = 389;
			this.anIntArrayArray56[2][2] = 690;
			this.anIntArrayArray56[3][0] = 671;
			this.anIntArrayArray56[3][1] = 947;
			this.anIntArrayArray56[3][3] = 1140;
			this.anIntArrayArray56[3][2] = 995;
			this.anIntArrayArray56[4][0] = 897;
			this.anIntArrayArray56[4][2] = 1397;
			this.anIntArrayArray56[4][3] = 1509;
			this.anIntArrayArray56[4][1] = 1285;
			this.anIntArrayArray56[5][3] = 1413;
			this.anIntArrayArray56[5][0] = 1175;
			this.anIntArrayArray56[5][2] = 1429;
			this.anIntArrayArray56[5][1] = 1525;
			this.anIntArrayArray56[6][2] = 1461;
			this.anIntArrayArray56[6][3] = 1333;
			this.anIntArrayArray56[6][0] = 1368;
			this.anIntArrayArray56[6][1] = 1734;
			this.anIntArrayArray56[7][2] = 1525;
			this.anIntArrayArray56[7][1] = 1413;
			this.anIntArrayArray56[7][0] = 1507;
			this.anIntArrayArray56[7][3] = 1702;
			this.anIntArrayArray56[8][2] = 1590;
			this.anIntArrayArray56[8][3] = 2056;
			this.anIntArrayArray56[8][0] = 1736;
			this.anIntArrayArray56[8][1] = 1108;
			this.anIntArrayArray56[9][0] = 2088;
			this.anIntArrayArray56[9][1] = 1766;
			this.anIntArrayArray56[9][3] = 2666;
			this.anIntArrayArray56[9][2] = 2056;
			this.anIntArrayArray56[10][0] = 2355;
			this.anIntArrayArray56[10][2] = 2586;
			this.anIntArrayArray56[10][3] = 3276;
			this.anIntArrayArray56[10][1] = 2409;
			this.anIntArrayArray56[11][3] = 3228;
			this.anIntArrayArray56[11][1] = 3116;
			this.anIntArrayArray56[11][0] = 2691;
			this.anIntArrayArray56[11][2] = 3148;
			this.anIntArrayArray56[12][0] = 3031;
			this.anIntArrayArray56[12][1] = 3806;
			this.anIntArrayArray56[12][3] = 3196;
			this.anIntArrayArray56[12][2] = 3710;
			this.anIntArrayArray56[13][2] = 3421;
			this.anIntArrayArray56[13][3] = 3019;
			this.anIntArrayArray56[13][0] = 3522;
			this.anIntArrayArray56[13][1] = 3437;
			this.anIntArrayArray56[14][0] = 3727;
			this.anIntArrayArray56[14][1] = 3116;
			this.anIntArrayArray56[14][3] = 3228;
			this.anIntArrayArray56[14][2] = 3148;
			this.anIntArrayArray56[15][1] = 2377;
			this.anIntArrayArray56[15][3] = 2746;
			this.anIntArrayArray56[15][2] = 2505;
			this.anIntArrayArray56[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray56 = new int[4][4];
			this.anIntArrayArray56[0][0] = 2048;
			this.anIntArrayArray56[0][1] = 0;
			this.anIntArrayArray56[0][2] = 4096;
			this.anIntArrayArray56[0][3] = 0;
			this.anIntArrayArray56[1][3] = 0;
			this.anIntArrayArray56[1][0] = 2867;
			this.anIntArrayArray56[1][1] = 4096;
			this.anIntArrayArray56[1][2] = 4096;
			this.anIntArrayArray56[2][0] = 3276;
			this.anIntArrayArray56[2][1] = 4096;
			this.anIntArrayArray56[2][2] = 4096;
			this.anIntArrayArray56[2][3] = 0;
			this.anIntArrayArray56[3][2] = 0;
			this.anIntArrayArray56[3][0] = 4096;
			this.anIntArrayArray56[3][1] = 4096;
			this.anIntArrayArray56[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(26) int[] local26 = this.method8892(arg0, 0);
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local11[2];
			for (@Pc(40) int local40 = 0; local40 < Static395.anInt6816; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray339[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
		if (this.anIntArrayArray56 == null) {
			this.method4687(1);
		}
		this.method4690();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	private void method4690() {
		@Pc(9) int local9 = this.anIntArrayArray56.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local22 << 4;
			for (@Pc(32) int local32 = 0; local32 < local9 && local30 >= this.anIntArrayArray56[local32][0]; local32++) {
				local26++;
			}
			@Pc(73) int local73;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(61) int[] local61;
			if (local26 >= local9) {
				local61 = this.anIntArrayArray56[local9 - 1];
				local65 = local61[2];
				local69 = local61[3];
				local73 = local61[1];
			} else {
				local61 = this.anIntArrayArray56[local26];
				if (local26 <= 0) {
					local69 = local61[3];
					local73 = local61[1];
					local65 = local61[2];
				} else {
					@Pc(103) int[] local103 = this.anIntArrayArray56[local26 - 1];
					@Pc(121) int local121 = (local30 - local103[0] << 12) / (local61[0] - local103[0]);
					@Pc(126) int local126 = 4096 - local121;
					local65 = local103[2] * local126 + local61[2] * local121 >> 12;
					local73 = local103[1] * local126 + local61[1] * local121 >> 12;
					local69 = local126 * local103[3] + local121 * local61[3] >> 12;
				}
			}
			local69 >>= 0x4;
			local73 >>= 0x4;
			local65 >>= 0x4;
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			if (local65 < 0) {
				local65 = 0;
			} else if (local65 > 255) {
				local65 = 255;
			}
			if (local73 < 0) {
				local73 = 0;
			} else if (local73 > 255) {
				local73 = 255;
			}
			this.anIntArray339[local22] = local69 | local73 << 16 | local65 << 8;
		}
	}
}
