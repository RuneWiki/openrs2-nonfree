import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class3_Sub3_Sub27 extends Class3_Sub3 {

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!og", name = "O", descriptor = "[I")
	private final int[] anIntArray369 = new int[257];

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
		if (this.anIntArrayArray40 == null) {
			this.method3866(1);
		}
		this.method3865();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(18) int local18 = arg0.method3643();
		if (local18 != 0) {
			this.method3866(local18);
			return;
		}
		this.anIntArrayArray40 = new int[arg0.method3643()][4];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray40.length; local32++) {
			this.anIntArrayArray40[local32][0] = arg0.method3649();
			this.anIntArrayArray40[local32][1] = arg0.method3643() << 4;
			this.anIntArrayArray40[local32][2] = arg0.method3643() << 4;
			this.anIntArrayArray40[local32][3] = arg0.method3643() << 4;
		}
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
	private void method3865() {
		@Pc(13) int local13 = this.anIntArrayArray40.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local13 > local30 && this.anIntArrayArray40[local30][0] <= local28; local30++) {
				local24++;
			}
			@Pc(70) int local70;
			@Pc(74) int local74;
			@Pc(78) int local78;
			@Pc(61) int[] local61;
			if (local13 > local24) {
				local61 = this.anIntArrayArray40[local24];
				if (local24 <= 0) {
					local70 = local61[1];
					local74 = local61[2];
					local78 = local61[3];
				} else {
					@Pc(87) int[] local87 = this.anIntArrayArray40[local24 - 1];
					@Pc(105) int local105 = (local28 - local87[0] << 12) / (local61[0] - local87[0]);
					@Pc(110) int local110 = 4096 - local105;
					local74 = local105 * local61[2] + local110 * local87[2] >> 12;
					local78 = local87[3] * local110 + local105 * local61[3] >> 12;
					local70 = local105 * local61[1] + local87[1] * local110 >> 12;
				}
			} else {
				local61 = this.anIntArrayArray40[local13 - 1];
				local70 = local61[1];
				local74 = local61[2];
				local78 = local61[3];
			}
			local74 >>= 0x4;
			local70 >>= 0x4;
			local78 >>= 0x4;
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 > 255) {
				local74 = 255;
			}
			if (local78 < 0) {
				local78 = 0;
			} else if (local78 > 255) {
				local78 = 255;
			}
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 255) {
				local70 = 255;
			}
			this.anIntArray369[local20] = local74 << 8 | local70 << 16 | local78;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)V")
	private void method3866(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray40 = new int[2][4];
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[0][3] = 0;
			this.anIntArrayArray40[0][1] = 0;
			this.anIntArrayArray40[0][2] = 0;
			this.anIntArrayArray40[1][1] = 4096;
			this.anIntArrayArray40[1][2] = 4096;
			this.anIntArrayArray40[1][3] = 4096;
			this.anIntArrayArray40[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray40 = new int[8][4];
			this.anIntArrayArray40[0][1] = 2650;
			this.anIntArrayArray40[0][3] = 2361;
			this.anIntArrayArray40[0][2] = 2602;
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[1][2] = 1799;
			this.anIntArrayArray40[1][0] = 2867;
			this.anIntArrayArray40[1][3] = 1558;
			this.anIntArrayArray40[1][1] = 2313;
			this.anIntArrayArray40[2][1] = 2618;
			this.anIntArrayArray40[2][2] = 1734;
			this.anIntArrayArray40[2][0] = 3072;
			this.anIntArrayArray40[2][3] = 1413;
			this.anIntArrayArray40[3][3] = 947;
			this.anIntArrayArray40[3][2] = 1220;
			this.anIntArrayArray40[3][0] = 3276;
			this.anIntArrayArray40[3][1] = 2296;
			this.anIntArrayArray40[4][1] = 2072;
			this.anIntArrayArray40[4][0] = 3481;
			this.anIntArrayArray40[4][3] = 722;
			this.anIntArrayArray40[4][2] = 963;
			this.anIntArrayArray40[5][1] = 2730;
			this.anIntArrayArray40[5][2] = 2152;
			this.anIntArrayArray40[5][3] = 1766;
			this.anIntArrayArray40[5][0] = 3686;
			this.anIntArrayArray40[6][2] = 1060;
			this.anIntArrayArray40[6][1] = 2232;
			this.anIntArrayArray40[6][0] = 3891;
			this.anIntArrayArray40[6][3] = 915;
			this.anIntArrayArray40[7][2] = 1413;
			this.anIntArrayArray40[7][3] = 1140;
			this.anIntArrayArray40[7][0] = 4096;
			this.anIntArrayArray40[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray40 = new int[7][4];
			this.anIntArrayArray40[0][3] = 4096;
			this.anIntArrayArray40[0][1] = 0;
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[0][2] = 0;
			this.anIntArrayArray40[1][2] = 4096;
			this.anIntArrayArray40[1][0] = 663;
			this.anIntArrayArray40[1][3] = 4096;
			this.anIntArrayArray40[1][1] = 0;
			this.anIntArrayArray40[2][2] = 4096;
			this.anIntArrayArray40[2][3] = 0;
			this.anIntArrayArray40[2][0] = 1363;
			this.anIntArrayArray40[2][1] = 0;
			this.anIntArrayArray40[3][3] = 0;
			this.anIntArrayArray40[3][0] = 2048;
			this.anIntArrayArray40[3][1] = 4096;
			this.anIntArrayArray40[3][2] = 4096;
			this.anIntArrayArray40[4][2] = 0;
			this.anIntArrayArray40[4][3] = 0;
			this.anIntArrayArray40[4][1] = 4096;
			this.anIntArrayArray40[4][0] = 2727;
			this.anIntArrayArray40[5][3] = 4096;
			this.anIntArrayArray40[5][0] = 3411;
			this.anIntArrayArray40[5][1] = 4096;
			this.anIntArrayArray40[5][2] = 0;
			this.anIntArrayArray40[6][0] = 4096;
			this.anIntArrayArray40[6][3] = 4096;
			this.anIntArrayArray40[6][1] = 0;
			this.anIntArrayArray40[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray40 = new int[6][4];
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[0][3] = 0;
			this.anIntArrayArray40[0][2] = 0;
			this.anIntArrayArray40[0][1] = 0;
			this.anIntArrayArray40[1][3] = 1493;
			this.anIntArrayArray40[1][1] = 0;
			this.anIntArrayArray40[1][0] = 1843;
			this.anIntArrayArray40[1][2] = 0;
			this.anIntArrayArray40[2][0] = 2457;
			this.anIntArrayArray40[2][3] = 2939;
			this.anIntArrayArray40[2][1] = 0;
			this.anIntArrayArray40[2][2] = 0;
			this.anIntArrayArray40[3][2] = 1124;
			this.anIntArrayArray40[3][1] = 0;
			this.anIntArrayArray40[3][0] = 2781;
			this.anIntArrayArray40[3][3] = 3565;
			this.anIntArrayArray40[4][0] = 3481;
			this.anIntArrayArray40[4][1] = 546;
			this.anIntArrayArray40[4][2] = 3084;
			this.anIntArrayArray40[4][3] = 4031;
			this.anIntArrayArray40[5][3] = 4096;
			this.anIntArrayArray40[5][0] = 4096;
			this.anIntArrayArray40[5][2] = 4096;
			this.anIntArrayArray40[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray40 = new int[16][4];
			this.anIntArrayArray40[0][1] = 80;
			this.anIntArrayArray40[0][3] = 321;
			this.anIntArrayArray40[0][0] = 0;
			this.anIntArrayArray40[0][2] = 192;
			this.anIntArrayArray40[1][2] = 449;
			this.anIntArrayArray40[1][1] = 321;
			this.anIntArrayArray40[1][0] = 155;
			this.anIntArrayArray40[1][3] = 562;
			this.anIntArrayArray40[2][2] = 690;
			this.anIntArrayArray40[2][0] = 389;
			this.anIntArrayArray40[2][3] = 803;
			this.anIntArrayArray40[2][1] = 578;
			this.anIntArrayArray40[3][0] = 671;
			this.anIntArrayArray40[3][1] = 947;
			this.anIntArrayArray40[3][2] = 995;
			this.anIntArrayArray40[3][3] = 1140;
			this.anIntArrayArray40[4][1] = 1285;
			this.anIntArrayArray40[4][2] = 1397;
			this.anIntArrayArray40[4][0] = 897;
			this.anIntArrayArray40[4][3] = 1509;
			this.anIntArrayArray40[5][1] = 1525;
			this.anIntArrayArray40[5][2] = 1429;
			this.anIntArrayArray40[5][3] = 1413;
			this.anIntArrayArray40[5][0] = 1175;
			this.anIntArrayArray40[6][2] = 1461;
			this.anIntArrayArray40[6][0] = 1368;
			this.anIntArrayArray40[6][1] = 1734;
			this.anIntArrayArray40[6][3] = 1333;
			this.anIntArrayArray40[7][2] = 1525;
			this.anIntArrayArray40[7][1] = 1413;
			this.anIntArrayArray40[7][0] = 1507;
			this.anIntArrayArray40[7][3] = 1702;
			this.anIntArrayArray40[8][1] = 1108;
			this.anIntArrayArray40[8][0] = 1736;
			this.anIntArrayArray40[8][2] = 1590;
			this.anIntArrayArray40[8][3] = 2056;
			this.anIntArrayArray40[9][0] = 2088;
			this.anIntArrayArray40[9][3] = 2666;
			this.anIntArrayArray40[9][1] = 1766;
			this.anIntArrayArray40[9][2] = 2056;
			this.anIntArrayArray40[10][1] = 2409;
			this.anIntArrayArray40[10][3] = 3276;
			this.anIntArrayArray40[10][0] = 2355;
			this.anIntArrayArray40[10][2] = 2586;
			this.anIntArrayArray40[11][3] = 3228;
			this.anIntArrayArray40[11][1] = 3116;
			this.anIntArrayArray40[11][0] = 2691;
			this.anIntArrayArray40[11][2] = 3148;
			this.anIntArrayArray40[12][1] = 3806;
			this.anIntArrayArray40[12][2] = 3710;
			this.anIntArrayArray40[12][0] = 3031;
			this.anIntArrayArray40[12][3] = 3196;
			this.anIntArrayArray40[13][1] = 3437;
			this.anIntArrayArray40[13][0] = 3522;
			this.anIntArrayArray40[13][3] = 3019;
			this.anIntArrayArray40[13][2] = 3421;
			this.anIntArrayArray40[14][1] = 3116;
			this.anIntArrayArray40[14][0] = 3727;
			this.anIntArrayArray40[14][3] = 3228;
			this.anIntArrayArray40[14][2] = 3148;
			this.anIntArrayArray40[15][3] = 2746;
			this.anIntArrayArray40[15][2] = 2505;
			this.anIntArrayArray40[15][0] = 4096;
			this.anIntArrayArray40[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray40 = new int[4][4];
			this.anIntArrayArray40[0][0] = 2048;
			this.anIntArrayArray40[0][3] = 0;
			this.anIntArrayArray40[0][2] = 4096;
			this.anIntArrayArray40[0][1] = 0;
			this.anIntArrayArray40[1][0] = 2867;
			this.anIntArrayArray40[1][2] = 4096;
			this.anIntArrayArray40[1][3] = 0;
			this.anIntArrayArray40[1][1] = 4096;
			this.anIntArrayArray40[2][3] = 0;
			this.anIntArrayArray40[2][1] = 4096;
			this.anIntArrayArray40[2][2] = 4096;
			this.anIntArrayArray40[2][0] = 3276;
			this.anIntArrayArray40[3][1] = 4096;
			this.anIntArrayArray40[3][2] = 0;
			this.anIntArrayArray40[3][3] = 0;
			this.anIntArrayArray40[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(27) int[] local27 = this.method5733(arg0, 0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static131.anInt2755; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray369[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
