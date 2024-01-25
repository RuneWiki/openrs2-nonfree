import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class1_Sub2_Sub24 extends Class1_Sub2 {

	@OriginalMember(owner = "client!of", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!of", name = "H", descriptor = "[I")
	private final int[] anIntArray371 = new int[257];

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V")
	private void method3902(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray31 = new int[2][4];
			this.anIntArrayArray31[0][0] = 0;
			this.anIntArrayArray31[0][2] = 0;
			this.anIntArrayArray31[0][3] = 0;
			this.anIntArrayArray31[0][1] = 0;
			this.anIntArrayArray31[1][1] = 4096;
			this.anIntArrayArray31[1][3] = 4096;
			this.anIntArrayArray31[1][0] = 4096;
			this.anIntArrayArray31[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray31 = new int[8][4];
			this.anIntArrayArray31[0][1] = 2650;
			this.anIntArrayArray31[0][2] = 2602;
			this.anIntArrayArray31[0][0] = 0;
			this.anIntArrayArray31[0][3] = 2361;
			this.anIntArrayArray31[1][0] = 2867;
			this.anIntArrayArray31[1][3] = 1558;
			this.anIntArrayArray31[1][2] = 1799;
			this.anIntArrayArray31[1][1] = 2313;
			this.anIntArrayArray31[2][3] = 1413;
			this.anIntArrayArray31[2][2] = 1734;
			this.anIntArrayArray31[2][1] = 2618;
			this.anIntArrayArray31[2][0] = 3072;
			this.anIntArrayArray31[3][0] = 3276;
			this.anIntArrayArray31[3][3] = 947;
			this.anIntArrayArray31[3][1] = 2296;
			this.anIntArrayArray31[3][2] = 1220;
			this.anIntArrayArray31[4][3] = 722;
			this.anIntArrayArray31[4][1] = 2072;
			this.anIntArrayArray31[4][0] = 3481;
			this.anIntArrayArray31[4][2] = 963;
			this.anIntArrayArray31[5][1] = 2730;
			this.anIntArrayArray31[5][0] = 3686;
			this.anIntArrayArray31[5][2] = 2152;
			this.anIntArrayArray31[5][3] = 1766;
			this.anIntArrayArray31[6][1] = 2232;
			this.anIntArrayArray31[6][2] = 1060;
			this.anIntArrayArray31[6][0] = 3891;
			this.anIntArrayArray31[6][3] = 915;
			this.anIntArrayArray31[7][0] = 4096;
			this.anIntArrayArray31[7][2] = 1413;
			this.anIntArrayArray31[7][3] = 1140;
			this.anIntArrayArray31[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray31 = new int[7][4];
			this.anIntArrayArray31[0][1] = 0;
			this.anIntArrayArray31[0][3] = 4096;
			this.anIntArrayArray31[0][0] = 0;
			this.anIntArrayArray31[0][2] = 0;
			this.anIntArrayArray31[1][1] = 0;
			this.anIntArrayArray31[1][0] = 663;
			this.anIntArrayArray31[1][2] = 4096;
			this.anIntArrayArray31[1][3] = 4096;
			this.anIntArrayArray31[2][0] = 1363;
			this.anIntArrayArray31[2][2] = 4096;
			this.anIntArrayArray31[2][1] = 0;
			this.anIntArrayArray31[2][3] = 0;
			this.anIntArrayArray31[3][0] = 2048;
			this.anIntArrayArray31[3][1] = 4096;
			this.anIntArrayArray31[3][2] = 4096;
			this.anIntArrayArray31[3][3] = 0;
			this.anIntArrayArray31[4][0] = 2727;
			this.anIntArrayArray31[4][1] = 4096;
			this.anIntArrayArray31[4][2] = 0;
			this.anIntArrayArray31[4][3] = 0;
			this.anIntArrayArray31[5][2] = 0;
			this.anIntArrayArray31[5][3] = 4096;
			this.anIntArrayArray31[5][1] = 4096;
			this.anIntArrayArray31[5][0] = 3411;
			this.anIntArrayArray31[6][0] = 4096;
			this.anIntArrayArray31[6][3] = 4096;
			this.anIntArrayArray31[6][1] = 0;
			this.anIntArrayArray31[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray31 = new int[6][4];
			this.anIntArrayArray31[0][1] = 0;
			this.anIntArrayArray31[0][3] = 0;
			this.anIntArrayArray31[0][0] = 0;
			this.anIntArrayArray31[0][2] = 0;
			this.anIntArrayArray31[1][2] = 0;
			this.anIntArrayArray31[1][3] = 1493;
			this.anIntArrayArray31[1][1] = 0;
			this.anIntArrayArray31[1][0] = 1843;
			this.anIntArrayArray31[2][1] = 0;
			this.anIntArrayArray31[2][3] = 2939;
			this.anIntArrayArray31[2][0] = 2457;
			this.anIntArrayArray31[2][2] = 0;
			this.anIntArrayArray31[3][0] = 2781;
			this.anIntArrayArray31[3][3] = 3565;
			this.anIntArrayArray31[3][1] = 0;
			this.anIntArrayArray31[3][2] = 1124;
			this.anIntArrayArray31[4][2] = 3084;
			this.anIntArrayArray31[4][1] = 546;
			this.anIntArrayArray31[4][3] = 4031;
			this.anIntArrayArray31[4][0] = 3481;
			this.anIntArrayArray31[5][3] = 4096;
			this.anIntArrayArray31[5][0] = 4096;
			this.anIntArrayArray31[5][2] = 4096;
			this.anIntArrayArray31[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray31 = new int[16][4];
			this.anIntArrayArray31[0][1] = 80;
			this.anIntArrayArray31[0][2] = 192;
			this.anIntArrayArray31[0][0] = 0;
			this.anIntArrayArray31[0][3] = 321;
			this.anIntArrayArray31[1][2] = 449;
			this.anIntArrayArray31[1][1] = 321;
			this.anIntArrayArray31[1][3] = 562;
			this.anIntArrayArray31[1][0] = 155;
			this.anIntArrayArray31[2][0] = 389;
			this.anIntArrayArray31[2][3] = 803;
			this.anIntArrayArray31[2][2] = 690;
			this.anIntArrayArray31[2][1] = 578;
			this.anIntArrayArray31[3][1] = 947;
			this.anIntArrayArray31[3][0] = 671;
			this.anIntArrayArray31[3][3] = 1140;
			this.anIntArrayArray31[3][2] = 995;
			this.anIntArrayArray31[4][3] = 1509;
			this.anIntArrayArray31[4][0] = 897;
			this.anIntArrayArray31[4][2] = 1397;
			this.anIntArrayArray31[4][1] = 1285;
			this.anIntArrayArray31[5][3] = 1413;
			this.anIntArrayArray31[5][2] = 1429;
			this.anIntArrayArray31[5][0] = 1175;
			this.anIntArrayArray31[5][1] = 1525;
			this.anIntArrayArray31[6][1] = 1734;
			this.anIntArrayArray31[6][3] = 1333;
			this.anIntArrayArray31[6][0] = 1368;
			this.anIntArrayArray31[6][2] = 1461;
			this.anIntArrayArray31[7][0] = 1507;
			this.anIntArrayArray31[7][1] = 1413;
			this.anIntArrayArray31[7][3] = 1702;
			this.anIntArrayArray31[7][2] = 1525;
			this.anIntArrayArray31[8][1] = 1108;
			this.anIntArrayArray31[8][3] = 2056;
			this.anIntArrayArray31[8][2] = 1590;
			this.anIntArrayArray31[8][0] = 1736;
			this.anIntArrayArray31[9][2] = 2056;
			this.anIntArrayArray31[9][3] = 2666;
			this.anIntArrayArray31[9][0] = 2088;
			this.anIntArrayArray31[9][1] = 1766;
			this.anIntArrayArray31[10][1] = 2409;
			this.anIntArrayArray31[10][2] = 2586;
			this.anIntArrayArray31[10][0] = 2355;
			this.anIntArrayArray31[10][3] = 3276;
			this.anIntArrayArray31[11][3] = 3228;
			this.anIntArrayArray31[11][0] = 2691;
			this.anIntArrayArray31[11][1] = 3116;
			this.anIntArrayArray31[11][2] = 3148;
			this.anIntArrayArray31[12][0] = 3031;
			this.anIntArrayArray31[12][1] = 3806;
			this.anIntArrayArray31[12][2] = 3710;
			this.anIntArrayArray31[12][3] = 3196;
			this.anIntArrayArray31[13][2] = 3421;
			this.anIntArrayArray31[13][3] = 3019;
			this.anIntArrayArray31[13][1] = 3437;
			this.anIntArrayArray31[13][0] = 3522;
			this.anIntArrayArray31[14][3] = 3228;
			this.anIntArrayArray31[14][2] = 3148;
			this.anIntArrayArray31[14][0] = 3727;
			this.anIntArrayArray31[14][1] = 3116;
			this.anIntArrayArray31[15][2] = 2505;
			this.anIntArrayArray31[15][3] = 2746;
			this.anIntArrayArray31[15][1] = 2377;
			this.anIntArrayArray31[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray31 = new int[4][4];
			this.anIntArrayArray31[0][0] = 2048;
			this.anIntArrayArray31[0][3] = 0;
			this.anIntArrayArray31[0][1] = 0;
			this.anIntArrayArray31[0][2] = 4096;
			this.anIntArrayArray31[1][1] = 4096;
			this.anIntArrayArray31[1][2] = 4096;
			this.anIntArrayArray31[1][3] = 0;
			this.anIntArrayArray31[1][0] = 2867;
			this.anIntArrayArray31[2][1] = 4096;
			this.anIntArrayArray31[2][2] = 4096;
			this.anIntArrayArray31[2][0] = 3276;
			this.anIntArrayArray31[2][3] = 0;
			this.anIntArrayArray31[3][0] = 4096;
			this.anIntArrayArray31[3][1] = 4096;
			this.anIntArrayArray31[3][2] = 0;
			this.anIntArrayArray31[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(26) int[] local26 = this.method5872(0, arg0);
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local11[2];
			for (@Pc(40) int local40 = 0; local40 < Static410.anInt7198; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray371[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(Z)V")
	private void method3903() {
		@Pc(14) int local14 = this.anIntArrayArray31.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 257; local18++) {
			@Pc(22) int local22 = 0;
			@Pc(26) int local26 = local18 << 4;
			for (@Pc(28) int local28 = 0; local28 < local14 && this.anIntArrayArray31[local28][0] <= local26; local28++) {
				local22++;
			}
			@Pc(130) int local130;
			@Pc(116) int local116;
			@Pc(102) int local102;
			@Pc(55) int[] local55;
			if (local22 < local14) {
				local55 = this.anIntArrayArray31[local22];
				if (local22 > 0) {
					@Pc(64) int[] local64 = this.anIntArrayArray31[local22 - 1];
					@Pc(82) int local82 = (local26 - local64[0] << 12) / (local55[0] - local64[0]);
					@Pc(87) int local87 = 4096 - local82;
					local102 = local82 * local55[3] + local64[3] * local87 >> 12;
					local116 = local55[2] * local82 + local64[2] * local87 >> 12;
					local130 = local82 * local55[1] + local87 * local64[1] >> 12;
				} else {
					local116 = local55[2];
					local102 = local55[3];
					local130 = local55[1];
				}
			} else {
				local55 = this.anIntArrayArray31[local14 - 1];
				local102 = local55[3];
				local130 = local55[1];
				local116 = local55[2];
			}
			local130 >>= 0x4;
			local116 >>= 0x4;
			local102 >>= 0x4;
			if (local130 < 0) {
				local130 = 0;
			} else if (local130 > 255) {
				local130 = 255;
			}
			if (local116 < 0) {
				local116 = 0;
			} else if (local116 > 255) {
				local116 = 255;
			}
			if (local102 < 0) {
				local102 = 0;
			} else if (local102 > 255) {
				local102 = 255;
			}
			this.anIntArray371[local18] = local130 << 16 | local116 << 8 | local102;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
		if (this.anIntArrayArray31 == null) {
			this.method3902(1);
		}
		this.method3903();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(7) int local7 = arg0.method4548();
		if (local7 != 0) {
			this.method3902(local7);
			return;
		}
		this.anIntArrayArray31 = new int[arg0.method4548()][4];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray31.length; local27++) {
			this.anIntArrayArray31[local27][0] = arg0.method4498();
			this.anIntArrayArray31[local27][1] = arg0.method4548() << 4;
			this.anIntArrayArray31[local27][2] = arg0.method4548() << 4;
			this.anIntArrayArray31[local27][3] = arg0.method4548() << 4;
		}
	}
}
