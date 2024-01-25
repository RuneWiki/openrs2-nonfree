import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class4_Sub2_Sub16 extends Class4_Sub2 {

	@OriginalMember(owner = "client!la", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "[I")
	private final int[] anIntArray405 = new int[257];

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
	private void method4514() {
		@Pc(16) int local16 = this.anIntArrayArray35.length;
		if (local16 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local16 > local30 && local28 >= this.anIntArrayArray35[local30][0]; local30++) {
				local24++;
			}
			@Pc(116) int local116;
			@Pc(131) int local131;
			@Pc(102) int local102;
			@Pc(57) int[] local57;
			if (local16 > local24) {
				local57 = this.anIntArrayArray35[local24];
				if (local24 > 0) {
					@Pc(66) int[] local66 = this.anIntArrayArray35[local24 - 1];
					@Pc(83) int local83 = (local28 - local66[0] << 12) / (local57[0] - local66[0]);
					@Pc(88) int local88 = 4096 - local83;
					local102 = local57[3] * local83 + local66[3] * local88 >> 12;
					local116 = local83 * local57[1] + local66[1] * local88 >> 12;
					local131 = local83 * local57[2] + local66[2] * local88 >> 12;
				} else {
					local116 = local57[1];
					local131 = local57[2];
					local102 = local57[3];
				}
			} else {
				local57 = this.anIntArrayArray35[local16 - 1];
				local131 = local57[2];
				local102 = local57[3];
				local116 = local57[1];
			}
			local102 >>= 0x4;
			local131 >>= 0x4;
			local116 >>= 0x4;
			if (local102 < 0) {
				local102 = 0;
			} else if (local102 > 255) {
				local102 = 255;
			}
			if (local131 < 0) {
				local131 = 0;
			} else if (local131 > 255) {
				local131 = 255;
			}
			if (local116 < 0) {
				local116 = 0;
			} else if (local116 > 255) {
				local116 = 255;
			}
			this.anIntArray405[local20] = local102 | local131 << 8 | local116 << 16;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)V")
	private void method4517(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray35 = new int[2][4];
			this.anIntArrayArray35[0][2] = 0;
			this.anIntArrayArray35[0][3] = 0;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[1][0] = 4096;
			this.anIntArrayArray35[1][2] = 4096;
			this.anIntArrayArray35[1][3] = 4096;
			this.anIntArrayArray35[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray35 = new int[8][4];
			this.anIntArrayArray35[0][2] = 2602;
			this.anIntArrayArray35[0][3] = 2361;
			this.anIntArrayArray35[0][1] = 2650;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[1][3] = 1558;
			this.anIntArrayArray35[1][0] = 2867;
			this.anIntArrayArray35[1][1] = 2313;
			this.anIntArrayArray35[1][2] = 1799;
			this.anIntArrayArray35[2][3] = 1413;
			this.anIntArrayArray35[2][2] = 1734;
			this.anIntArrayArray35[2][1] = 2618;
			this.anIntArrayArray35[2][0] = 3072;
			this.anIntArrayArray35[3][2] = 1220;
			this.anIntArrayArray35[3][1] = 2296;
			this.anIntArrayArray35[3][0] = 3276;
			this.anIntArrayArray35[3][3] = 947;
			this.anIntArrayArray35[4][1] = 2072;
			this.anIntArrayArray35[4][2] = 963;
			this.anIntArrayArray35[4][3] = 722;
			this.anIntArrayArray35[4][0] = 3481;
			this.anIntArrayArray35[5][3] = 1766;
			this.anIntArrayArray35[5][1] = 2730;
			this.anIntArrayArray35[5][0] = 3686;
			this.anIntArrayArray35[5][2] = 2152;
			this.anIntArrayArray35[6][3] = 915;
			this.anIntArrayArray35[6][2] = 1060;
			this.anIntArrayArray35[6][0] = 3891;
			this.anIntArrayArray35[6][1] = 2232;
			this.anIntArrayArray35[7][0] = 4096;
			this.anIntArrayArray35[7][2] = 1413;
			this.anIntArrayArray35[7][1] = 1686;
			this.anIntArrayArray35[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray35 = new int[7][4];
			this.anIntArrayArray35[0][2] = 0;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[0][3] = 4096;
			this.anIntArrayArray35[1][0] = 663;
			this.anIntArrayArray35[1][3] = 4096;
			this.anIntArrayArray35[1][1] = 0;
			this.anIntArrayArray35[1][2] = 4096;
			this.anIntArrayArray35[2][3] = 0;
			this.anIntArrayArray35[2][2] = 4096;
			this.anIntArrayArray35[2][1] = 0;
			this.anIntArrayArray35[2][0] = 1363;
			this.anIntArrayArray35[3][0] = 2048;
			this.anIntArrayArray35[3][3] = 0;
			this.anIntArrayArray35[3][1] = 4096;
			this.anIntArrayArray35[3][2] = 4096;
			this.anIntArrayArray35[4][3] = 0;
			this.anIntArrayArray35[4][2] = 0;
			this.anIntArrayArray35[4][0] = 2727;
			this.anIntArrayArray35[4][1] = 4096;
			this.anIntArrayArray35[5][0] = 3411;
			this.anIntArrayArray35[5][3] = 4096;
			this.anIntArrayArray35[5][2] = 0;
			this.anIntArrayArray35[5][1] = 4096;
			this.anIntArrayArray35[6][3] = 4096;
			this.anIntArrayArray35[6][2] = 0;
			this.anIntArrayArray35[6][1] = 0;
			this.anIntArrayArray35[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray35 = new int[6][4];
			this.anIntArrayArray35[0][2] = 0;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][3] = 0;
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[1][0] = 1843;
			this.anIntArrayArray35[1][2] = 0;
			this.anIntArrayArray35[1][3] = 1493;
			this.anIntArrayArray35[1][1] = 0;
			this.anIntArrayArray35[2][1] = 0;
			this.anIntArrayArray35[2][3] = 2939;
			this.anIntArrayArray35[2][2] = 0;
			this.anIntArrayArray35[2][0] = 2457;
			this.anIntArrayArray35[3][2] = 1124;
			this.anIntArrayArray35[3][0] = 2781;
			this.anIntArrayArray35[3][1] = 0;
			this.anIntArrayArray35[3][3] = 3565;
			this.anIntArrayArray35[4][2] = 3084;
			this.anIntArrayArray35[4][1] = 546;
			this.anIntArrayArray35[4][3] = 4031;
			this.anIntArrayArray35[4][0] = 3481;
			this.anIntArrayArray35[5][1] = 4096;
			this.anIntArrayArray35[5][0] = 4096;
			this.anIntArrayArray35[5][3] = 4096;
			this.anIntArrayArray35[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray35 = new int[16][4];
			this.anIntArrayArray35[0][3] = 321;
			this.anIntArrayArray35[0][2] = 192;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][1] = 80;
			this.anIntArrayArray35[1][3] = 562;
			this.anIntArrayArray35[1][0] = 155;
			this.anIntArrayArray35[1][1] = 321;
			this.anIntArrayArray35[1][2] = 449;
			this.anIntArrayArray35[2][2] = 690;
			this.anIntArrayArray35[2][3] = 803;
			this.anIntArrayArray35[2][0] = 389;
			this.anIntArrayArray35[2][1] = 578;
			this.anIntArrayArray35[3][2] = 995;
			this.anIntArrayArray35[3][3] = 1140;
			this.anIntArrayArray35[3][0] = 671;
			this.anIntArrayArray35[3][1] = 947;
			this.anIntArrayArray35[4][3] = 1509;
			this.anIntArrayArray35[4][2] = 1397;
			this.anIntArrayArray35[4][0] = 897;
			this.anIntArrayArray35[4][1] = 1285;
			this.anIntArrayArray35[5][0] = 1175;
			this.anIntArrayArray35[5][2] = 1429;
			this.anIntArrayArray35[5][1] = 1525;
			this.anIntArrayArray35[5][3] = 1413;
			this.anIntArrayArray35[6][0] = 1368;
			this.anIntArrayArray35[6][2] = 1461;
			this.anIntArrayArray35[6][3] = 1333;
			this.anIntArrayArray35[6][1] = 1734;
			this.anIntArrayArray35[7][1] = 1413;
			this.anIntArrayArray35[7][3] = 1702;
			this.anIntArrayArray35[7][2] = 1525;
			this.anIntArrayArray35[7][0] = 1507;
			this.anIntArrayArray35[8][1] = 1108;
			this.anIntArrayArray35[8][0] = 1736;
			this.anIntArrayArray35[8][3] = 2056;
			this.anIntArrayArray35[8][2] = 1590;
			this.anIntArrayArray35[9][3] = 2666;
			this.anIntArrayArray35[9][1] = 1766;
			this.anIntArrayArray35[9][2] = 2056;
			this.anIntArrayArray35[9][0] = 2088;
			this.anIntArrayArray35[10][3] = 3276;
			this.anIntArrayArray35[10][1] = 2409;
			this.anIntArrayArray35[10][0] = 2355;
			this.anIntArrayArray35[10][2] = 2586;
			this.anIntArrayArray35[11][3] = 3228;
			this.anIntArrayArray35[11][0] = 2691;
			this.anIntArrayArray35[11][2] = 3148;
			this.anIntArrayArray35[11][1] = 3116;
			this.anIntArrayArray35[12][2] = 3710;
			this.anIntArrayArray35[12][0] = 3031;
			this.anIntArrayArray35[12][3] = 3196;
			this.anIntArrayArray35[12][1] = 3806;
			this.anIntArrayArray35[13][1] = 3437;
			this.anIntArrayArray35[13][2] = 3421;
			this.anIntArrayArray35[13][3] = 3019;
			this.anIntArrayArray35[13][0] = 3522;
			this.anIntArrayArray35[14][3] = 3228;
			this.anIntArrayArray35[14][1] = 3116;
			this.anIntArrayArray35[14][2] = 3148;
			this.anIntArrayArray35[14][0] = 3727;
			this.anIntArrayArray35[15][3] = 2746;
			this.anIntArrayArray35[15][2] = 2505;
			this.anIntArrayArray35[15][0] = 4096;
			this.anIntArrayArray35[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray35 = new int[4][4];
			this.anIntArrayArray35[0][2] = 4096;
			this.anIntArrayArray35[0][3] = 0;
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[0][0] = 2048;
			this.anIntArrayArray35[1][2] = 4096;
			this.anIntArrayArray35[1][0] = 2867;
			this.anIntArrayArray35[1][1] = 4096;
			this.anIntArrayArray35[1][3] = 0;
			this.anIntArrayArray35[2][1] = 4096;
			this.anIntArrayArray35[2][0] = 3276;
			this.anIntArrayArray35[2][3] = 0;
			this.anIntArrayArray35[2][2] = 4096;
			this.anIntArrayArray35[3][0] = 4096;
			this.anIntArrayArray35[3][3] = 0;
			this.anIntArrayArray35[3][1] = 4096;
			this.anIntArrayArray35[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
		if (this.anIntArrayArray35 == null) {
			this.method4517(1);
		}
		this.method4514();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(14) int local14 = arg1.method8865();
		if (local14 != 0) {
			this.method4517(local14);
			return;
		}
		this.anIntArrayArray35 = new int[arg1.method8865()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray35.length; local31++) {
			this.anIntArrayArray35[local31][0] = arg1.method8859();
			this.anIntArrayArray35[local31][1] = arg1.method8865() << 4;
			this.anIntArrayArray35[local31][2] = arg1.method8865() << 4;
			this.anIntArrayArray35[local31][3] = arg1.method8865() << 4;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(26) int[] local26 = this.method8768(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static269.anInt4330; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray405[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}
}
