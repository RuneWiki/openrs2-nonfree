import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!gl", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!gl", name = "Q", descriptor = "[I")
	private final int[] anIntArray285 = new int[257];

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(26) int[] local26 = this.method7128(0, arg0);
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local11[2];
			for (@Pc(40) int local40 = 0; local40 < Static452.anInt7734; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray285[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(IB)V")
	private void method2531(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray36 = new int[2][4];
			this.anIntArrayArray36[0][3] = 0;
			this.anIntArrayArray36[0][1] = 0;
			this.anIntArrayArray36[0][2] = 0;
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[1][1] = 4096;
			this.anIntArrayArray36[1][3] = 4096;
			this.anIntArrayArray36[1][2] = 4096;
			this.anIntArrayArray36[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray36 = new int[8][4];
			this.anIntArrayArray36[0][2] = 2602;
			this.anIntArrayArray36[0][1] = 2650;
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[0][3] = 2361;
			this.anIntArrayArray36[1][2] = 1799;
			this.anIntArrayArray36[1][3] = 1558;
			this.anIntArrayArray36[1][1] = 2313;
			this.anIntArrayArray36[1][0] = 2867;
			this.anIntArrayArray36[2][1] = 2618;
			this.anIntArrayArray36[2][3] = 1413;
			this.anIntArrayArray36[2][0] = 3072;
			this.anIntArrayArray36[2][2] = 1734;
			this.anIntArrayArray36[3][0] = 3276;
			this.anIntArrayArray36[3][2] = 1220;
			this.anIntArrayArray36[3][1] = 2296;
			this.anIntArrayArray36[3][3] = 947;
			this.anIntArrayArray36[4][0] = 3481;
			this.anIntArrayArray36[4][1] = 2072;
			this.anIntArrayArray36[4][3] = 722;
			this.anIntArrayArray36[4][2] = 963;
			this.anIntArrayArray36[5][1] = 2730;
			this.anIntArrayArray36[5][3] = 1766;
			this.anIntArrayArray36[5][2] = 2152;
			this.anIntArrayArray36[5][0] = 3686;
			this.anIntArrayArray36[6][1] = 2232;
			this.anIntArrayArray36[6][2] = 1060;
			this.anIntArrayArray36[6][3] = 915;
			this.anIntArrayArray36[6][0] = 3891;
			this.anIntArrayArray36[7][2] = 1413;
			this.anIntArrayArray36[7][3] = 1140;
			this.anIntArrayArray36[7][1] = 1686;
			this.anIntArrayArray36[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray36 = new int[7][4];
			this.anIntArrayArray36[0][3] = 4096;
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[0][2] = 0;
			this.anIntArrayArray36[0][1] = 0;
			this.anIntArrayArray36[1][1] = 0;
			this.anIntArrayArray36[1][2] = 4096;
			this.anIntArrayArray36[1][0] = 663;
			this.anIntArrayArray36[1][3] = 4096;
			this.anIntArrayArray36[2][0] = 1363;
			this.anIntArrayArray36[2][1] = 0;
			this.anIntArrayArray36[2][2] = 4096;
			this.anIntArrayArray36[2][3] = 0;
			this.anIntArrayArray36[3][2] = 4096;
			this.anIntArrayArray36[3][1] = 4096;
			this.anIntArrayArray36[3][3] = 0;
			this.anIntArrayArray36[3][0] = 2048;
			this.anIntArrayArray36[4][2] = 0;
			this.anIntArrayArray36[4][3] = 0;
			this.anIntArrayArray36[4][1] = 4096;
			this.anIntArrayArray36[4][0] = 2727;
			this.anIntArrayArray36[5][3] = 4096;
			this.anIntArrayArray36[5][1] = 4096;
			this.anIntArrayArray36[5][0] = 3411;
			this.anIntArrayArray36[5][2] = 0;
			this.anIntArrayArray36[6][1] = 0;
			this.anIntArrayArray36[6][0] = 4096;
			this.anIntArrayArray36[6][3] = 4096;
			this.anIntArrayArray36[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray36 = new int[6][4];
			this.anIntArrayArray36[0][1] = 0;
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[0][3] = 0;
			this.anIntArrayArray36[0][2] = 0;
			this.anIntArrayArray36[1][1] = 0;
			this.anIntArrayArray36[1][0] = 1843;
			this.anIntArrayArray36[1][3] = 1493;
			this.anIntArrayArray36[1][2] = 0;
			this.anIntArrayArray36[2][1] = 0;
			this.anIntArrayArray36[2][0] = 2457;
			this.anIntArrayArray36[2][2] = 0;
			this.anIntArrayArray36[2][3] = 2939;
			this.anIntArrayArray36[3][1] = 0;
			this.anIntArrayArray36[3][0] = 2781;
			this.anIntArrayArray36[3][2] = 1124;
			this.anIntArrayArray36[3][3] = 3565;
			this.anIntArrayArray36[4][1] = 546;
			this.anIntArrayArray36[4][0] = 3481;
			this.anIntArrayArray36[4][3] = 4031;
			this.anIntArrayArray36[4][2] = 3084;
			this.anIntArrayArray36[5][2] = 4096;
			this.anIntArrayArray36[5][3] = 4096;
			this.anIntArrayArray36[5][0] = 4096;
			this.anIntArrayArray36[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray36 = new int[16][4];
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[0][3] = 321;
			this.anIntArrayArray36[0][2] = 192;
			this.anIntArrayArray36[0][1] = 80;
			this.anIntArrayArray36[1][0] = 155;
			this.anIntArrayArray36[1][2] = 449;
			this.anIntArrayArray36[1][1] = 321;
			this.anIntArrayArray36[1][3] = 562;
			this.anIntArrayArray36[2][1] = 578;
			this.anIntArrayArray36[2][0] = 389;
			this.anIntArrayArray36[2][2] = 690;
			this.anIntArrayArray36[2][3] = 803;
			this.anIntArrayArray36[3][3] = 1140;
			this.anIntArrayArray36[3][2] = 995;
			this.anIntArrayArray36[3][1] = 947;
			this.anIntArrayArray36[3][0] = 671;
			this.anIntArrayArray36[4][3] = 1509;
			this.anIntArrayArray36[4][2] = 1397;
			this.anIntArrayArray36[4][0] = 897;
			this.anIntArrayArray36[4][1] = 1285;
			this.anIntArrayArray36[5][3] = 1413;
			this.anIntArrayArray36[5][0] = 1175;
			this.anIntArrayArray36[5][1] = 1525;
			this.anIntArrayArray36[5][2] = 1429;
			this.anIntArrayArray36[6][3] = 1333;
			this.anIntArrayArray36[6][1] = 1734;
			this.anIntArrayArray36[6][2] = 1461;
			this.anIntArrayArray36[6][0] = 1368;
			this.anIntArrayArray36[7][2] = 1525;
			this.anIntArrayArray36[7][3] = 1702;
			this.anIntArrayArray36[7][0] = 1507;
			this.anIntArrayArray36[7][1] = 1413;
			this.anIntArrayArray36[8][3] = 2056;
			this.anIntArrayArray36[8][0] = 1736;
			this.anIntArrayArray36[8][2] = 1590;
			this.anIntArrayArray36[8][1] = 1108;
			this.anIntArrayArray36[9][3] = 2666;
			this.anIntArrayArray36[9][1] = 1766;
			this.anIntArrayArray36[9][0] = 2088;
			this.anIntArrayArray36[9][2] = 2056;
			this.anIntArrayArray36[10][1] = 2409;
			this.anIntArrayArray36[10][0] = 2355;
			this.anIntArrayArray36[10][2] = 2586;
			this.anIntArrayArray36[10][3] = 3276;
			this.anIntArrayArray36[11][3] = 3228;
			this.anIntArrayArray36[11][1] = 3116;
			this.anIntArrayArray36[11][2] = 3148;
			this.anIntArrayArray36[11][0] = 2691;
			this.anIntArrayArray36[12][1] = 3806;
			this.anIntArrayArray36[12][2] = 3710;
			this.anIntArrayArray36[12][3] = 3196;
			this.anIntArrayArray36[12][0] = 3031;
			this.anIntArrayArray36[13][0] = 3522;
			this.anIntArrayArray36[13][1] = 3437;
			this.anIntArrayArray36[13][3] = 3019;
			this.anIntArrayArray36[13][2] = 3421;
			this.anIntArrayArray36[14][3] = 3228;
			this.anIntArrayArray36[14][2] = 3148;
			this.anIntArrayArray36[14][1] = 3116;
			this.anIntArrayArray36[14][0] = 3727;
			this.anIntArrayArray36[15][1] = 2377;
			this.anIntArrayArray36[15][2] = 2505;
			this.anIntArrayArray36[15][0] = 4096;
			this.anIntArrayArray36[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray36 = new int[4][4];
			this.anIntArrayArray36[0][0] = 2048;
			this.anIntArrayArray36[0][2] = 4096;
			this.anIntArrayArray36[0][3] = 0;
			this.anIntArrayArray36[0][1] = 0;
			this.anIntArrayArray36[1][3] = 0;
			this.anIntArrayArray36[1][1] = 4096;
			this.anIntArrayArray36[1][2] = 4096;
			this.anIntArrayArray36[1][0] = 2867;
			this.anIntArrayArray36[2][1] = 4096;
			this.anIntArrayArray36[2][3] = 0;
			this.anIntArrayArray36[2][2] = 4096;
			this.anIntArrayArray36[2][0] = 3276;
			this.anIntArrayArray36[3][3] = 0;
			this.anIntArrayArray36[3][1] = 4096;
			this.anIntArrayArray36[3][0] = 4096;
			this.anIntArrayArray36[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(14) int local14 = arg0.method3922();
		if (local14 != 0) {
			this.method2531(local14);
			return;
		}
		this.anIntArrayArray36 = new int[arg0.method3922()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray36.length; local31++) {
			this.anIntArrayArray36[local31][0] = arg0.method3967();
			this.anIntArrayArray36[local31][1] = arg0.method3922() << 4;
			this.anIntArrayArray36[local31][2] = arg0.method3922() << 4;
			this.anIntArrayArray36[local31][3] = arg0.method3922() << 4;
		}
	}

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
		if (this.anIntArrayArray36 == null) {
			this.method2531(1);
		}
		this.method2532();
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
	private void method2532() {
		@Pc(14) int local14 = this.anIntArrayArray36.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 257; local18++) {
			@Pc(22) int local22 = 0;
			@Pc(26) int local26 = local18 << 4;
			for (@Pc(28) int local28 = 0; local28 < local14 && this.anIntArrayArray36[local28][0] <= local26; local28++) {
				local22++;
			}
			@Pc(61) int local61;
			@Pc(65) int local65;
			@Pc(57) int local57;
			@Pc(53) int[] local53;
			if (local22 >= local14) {
				local53 = this.anIntArrayArray36[local14 - 1];
				local57 = local53[3];
				local61 = local53[1];
				local65 = local53[2];
			} else {
				local53 = this.anIntArrayArray36[local22];
				if (local22 <= 0) {
					local57 = local53[3];
					local61 = local53[1];
					local65 = local53[2];
				} else {
					@Pc(95) int[] local95 = this.anIntArrayArray36[local22 - 1];
					@Pc(112) int local112 = (local26 - local95[0] << 12) / (local53[0] - local95[0]);
					@Pc(116) int local116 = 4096 - local112;
					local65 = local95[2] * local116 + local112 * local53[2] >> 12;
					local61 = local53[1] * local112 + local116 * local95[1] >> 12;
					local57 = local116 * local95[3] + local112 * local53[3] >> 12;
				}
			}
			local57 >>= 0x4;
			local61 >>= 0x4;
			local65 >>= 0x4;
			if (local65 < 0) {
				local65 = 0;
			} else if (local65 > 255) {
				local65 = 255;
			}
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			if (local57 < 0) {
				local57 = 0;
			} else if (local57 > 255) {
				local57 = 255;
			}
			this.anIntArray285[local18] = local65 << 8 | local61 << 16 | local57;
		}
	}
}
