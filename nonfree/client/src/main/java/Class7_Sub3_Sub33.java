import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class7_Sub3_Sub33 extends Class7_Sub3 {

	@OriginalMember(owner = "client!tk", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!tk", name = "N", descriptor = "[I")
	private final int[] anIntArray561 = new int[257];

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
		if (this.anIntArrayArray52 == null) {
			this.method4969(1);
		}
		this.method4971();
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(26) int[] local26 = this.method5591(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static58.anInt1052; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray561[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(18) int local18 = arg1.method3981();
		if (local18 != 0) {
			this.method4969(local18);
			return;
		}
		this.anIntArrayArray52 = new int[arg1.method3981()][4];
		for (@Pc(37) int local37 = 0; local37 < this.anIntArrayArray52.length; local37++) {
			this.anIntArrayArray52[local37][0] = arg1.method3943();
			this.anIntArrayArray52[local37][1] = arg1.method3981() << 4;
			this.anIntArrayArray52[local37][2] = arg1.method3981() << 4;
			this.anIntArrayArray52[local37][3] = arg1.method3981() << 4;
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V")
	private void method4969(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray52 = new int[2][4];
			this.anIntArrayArray52[0][0] = 0;
			this.anIntArrayArray52[0][2] = 0;
			this.anIntArrayArray52[0][1] = 0;
			this.anIntArrayArray52[0][3] = 0;
			this.anIntArrayArray52[1][0] = 4096;
			this.anIntArrayArray52[1][3] = 4096;
			this.anIntArrayArray52[1][2] = 4096;
			this.anIntArrayArray52[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray52 = new int[8][4];
			this.anIntArrayArray52[0][1] = 2650;
			this.anIntArrayArray52[0][3] = 2361;
			this.anIntArrayArray52[0][2] = 2602;
			this.anIntArrayArray52[0][0] = 0;
			this.anIntArrayArray52[1][0] = 2867;
			this.anIntArrayArray52[1][3] = 1558;
			this.anIntArrayArray52[1][2] = 1799;
			this.anIntArrayArray52[1][1] = 2313;
			this.anIntArrayArray52[2][3] = 1413;
			this.anIntArrayArray52[2][1] = 2618;
			this.anIntArrayArray52[2][0] = 3072;
			this.anIntArrayArray52[2][2] = 1734;
			this.anIntArrayArray52[3][2] = 1220;
			this.anIntArrayArray52[3][3] = 947;
			this.anIntArrayArray52[3][1] = 2296;
			this.anIntArrayArray52[3][0] = 3276;
			this.anIntArrayArray52[4][1] = 2072;
			this.anIntArrayArray52[4][3] = 722;
			this.anIntArrayArray52[4][2] = 963;
			this.anIntArrayArray52[4][0] = 3481;
			this.anIntArrayArray52[5][0] = 3686;
			this.anIntArrayArray52[5][2] = 2152;
			this.anIntArrayArray52[5][1] = 2730;
			this.anIntArrayArray52[5][3] = 1766;
			this.anIntArrayArray52[6][1] = 2232;
			this.anIntArrayArray52[6][2] = 1060;
			this.anIntArrayArray52[6][3] = 915;
			this.anIntArrayArray52[6][0] = 3891;
			this.anIntArrayArray52[7][0] = 4096;
			this.anIntArrayArray52[7][3] = 1140;
			this.anIntArrayArray52[7][2] = 1413;
			this.anIntArrayArray52[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray52 = new int[7][4];
			this.anIntArrayArray52[0][1] = 0;
			this.anIntArrayArray52[0][3] = 4096;
			this.anIntArrayArray52[0][0] = 0;
			this.anIntArrayArray52[0][2] = 0;
			this.anIntArrayArray52[1][2] = 4096;
			this.anIntArrayArray52[1][0] = 663;
			this.anIntArrayArray52[1][1] = 0;
			this.anIntArrayArray52[1][3] = 4096;
			this.anIntArrayArray52[2][1] = 0;
			this.anIntArrayArray52[2][2] = 4096;
			this.anIntArrayArray52[2][3] = 0;
			this.anIntArrayArray52[2][0] = 1363;
			this.anIntArrayArray52[3][1] = 4096;
			this.anIntArrayArray52[3][2] = 4096;
			this.anIntArrayArray52[3][0] = 2048;
			this.anIntArrayArray52[3][3] = 0;
			this.anIntArrayArray52[4][1] = 4096;
			this.anIntArrayArray52[4][3] = 0;
			this.anIntArrayArray52[4][2] = 0;
			this.anIntArrayArray52[4][0] = 2727;
			this.anIntArrayArray52[5][0] = 3411;
			this.anIntArrayArray52[5][2] = 0;
			this.anIntArrayArray52[5][1] = 4096;
			this.anIntArrayArray52[5][3] = 4096;
			this.anIntArrayArray52[6][2] = 0;
			this.anIntArrayArray52[6][1] = 0;
			this.anIntArrayArray52[6][3] = 4096;
			this.anIntArrayArray52[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray52 = new int[6][4];
			this.anIntArrayArray52[0][2] = 0;
			this.anIntArrayArray52[0][0] = 0;
			this.anIntArrayArray52[0][1] = 0;
			this.anIntArrayArray52[0][3] = 0;
			this.anIntArrayArray52[1][2] = 0;
			this.anIntArrayArray52[1][1] = 0;
			this.anIntArrayArray52[1][3] = 1493;
			this.anIntArrayArray52[1][0] = 1843;
			this.anIntArrayArray52[2][1] = 0;
			this.anIntArrayArray52[2][3] = 2939;
			this.anIntArrayArray52[2][2] = 0;
			this.anIntArrayArray52[2][0] = 2457;
			this.anIntArrayArray52[3][1] = 0;
			this.anIntArrayArray52[3][3] = 3565;
			this.anIntArrayArray52[3][0] = 2781;
			this.anIntArrayArray52[3][2] = 1124;
			this.anIntArrayArray52[4][2] = 3084;
			this.anIntArrayArray52[4][1] = 546;
			this.anIntArrayArray52[4][0] = 3481;
			this.anIntArrayArray52[4][3] = 4031;
			this.anIntArrayArray52[5][1] = 4096;
			this.anIntArrayArray52[5][0] = 4096;
			this.anIntArrayArray52[5][3] = 4096;
			this.anIntArrayArray52[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray52 = new int[16][4];
			this.anIntArrayArray52[0][2] = 192;
			this.anIntArrayArray52[0][3] = 321;
			this.anIntArrayArray52[0][1] = 80;
			this.anIntArrayArray52[0][0] = 0;
			this.anIntArrayArray52[1][1] = 321;
			this.anIntArrayArray52[1][3] = 562;
			this.anIntArrayArray52[1][0] = 155;
			this.anIntArrayArray52[1][2] = 449;
			this.anIntArrayArray52[2][2] = 690;
			this.anIntArrayArray52[2][1] = 578;
			this.anIntArrayArray52[2][3] = 803;
			this.anIntArrayArray52[2][0] = 389;
			this.anIntArrayArray52[3][1] = 947;
			this.anIntArrayArray52[3][0] = 671;
			this.anIntArrayArray52[3][3] = 1140;
			this.anIntArrayArray52[3][2] = 995;
			this.anIntArrayArray52[4][3] = 1509;
			this.anIntArrayArray52[4][2] = 1397;
			this.anIntArrayArray52[4][0] = 897;
			this.anIntArrayArray52[4][1] = 1285;
			this.anIntArrayArray52[5][2] = 1429;
			this.anIntArrayArray52[5][0] = 1175;
			this.anIntArrayArray52[5][1] = 1525;
			this.anIntArrayArray52[5][3] = 1413;
			this.anIntArrayArray52[6][2] = 1461;
			this.anIntArrayArray52[6][0] = 1368;
			this.anIntArrayArray52[6][3] = 1333;
			this.anIntArrayArray52[6][1] = 1734;
			this.anIntArrayArray52[7][2] = 1525;
			this.anIntArrayArray52[7][3] = 1702;
			this.anIntArrayArray52[7][0] = 1507;
			this.anIntArrayArray52[7][1] = 1413;
			this.anIntArrayArray52[8][0] = 1736;
			this.anIntArrayArray52[8][1] = 1108;
			this.anIntArrayArray52[8][3] = 2056;
			this.anIntArrayArray52[8][2] = 1590;
			this.anIntArrayArray52[9][3] = 2666;
			this.anIntArrayArray52[9][1] = 1766;
			this.anIntArrayArray52[9][2] = 2056;
			this.anIntArrayArray52[9][0] = 2088;
			this.anIntArrayArray52[10][2] = 2586;
			this.anIntArrayArray52[10][0] = 2355;
			this.anIntArrayArray52[10][3] = 3276;
			this.anIntArrayArray52[10][1] = 2409;
			this.anIntArrayArray52[11][3] = 3228;
			this.anIntArrayArray52[11][1] = 3116;
			this.anIntArrayArray52[11][2] = 3148;
			this.anIntArrayArray52[11][0] = 2691;
			this.anIntArrayArray52[12][1] = 3806;
			this.anIntArrayArray52[12][2] = 3710;
			this.anIntArrayArray52[12][3] = 3196;
			this.anIntArrayArray52[12][0] = 3031;
			this.anIntArrayArray52[13][2] = 3421;
			this.anIntArrayArray52[13][0] = 3522;
			this.anIntArrayArray52[13][3] = 3019;
			this.anIntArrayArray52[13][1] = 3437;
			this.anIntArrayArray52[14][2] = 3148;
			this.anIntArrayArray52[14][3] = 3228;
			this.anIntArrayArray52[14][0] = 3727;
			this.anIntArrayArray52[14][1] = 3116;
			this.anIntArrayArray52[15][3] = 2746;
			this.anIntArrayArray52[15][2] = 2505;
			this.anIntArrayArray52[15][1] = 2377;
			this.anIntArrayArray52[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray52 = new int[4][4];
			this.anIntArrayArray52[0][1] = 0;
			this.anIntArrayArray52[0][3] = 0;
			this.anIntArrayArray52[0][2] = 4096;
			this.anIntArrayArray52[0][0] = 2048;
			this.anIntArrayArray52[1][1] = 4096;
			this.anIntArrayArray52[1][2] = 4096;
			this.anIntArrayArray52[1][0] = 2867;
			this.anIntArrayArray52[1][3] = 0;
			this.anIntArrayArray52[2][1] = 4096;
			this.anIntArrayArray52[2][2] = 4096;
			this.anIntArrayArray52[2][3] = 0;
			this.anIntArrayArray52[2][0] = 3276;
			this.anIntArrayArray52[3][0] = 4096;
			this.anIntArrayArray52[3][3] = 0;
			this.anIntArrayArray52[3][1] = 4096;
			this.anIntArrayArray52[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
	private void method4971() {
		@Pc(16) int local16 = this.anIntArrayArray52.length;
		if (local16 <= 0) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < 257; local23++) {
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = local23 << 4;
			for (@Pc(33) int local33 = 0; local33 < local16 && this.anIntArrayArray52[local33][0] <= local31; local33++) {
				local27++;
			}
			@Pc(70) int local70;
			@Pc(66) int local66;
			@Pc(74) int local74;
			@Pc(60) int[] local60;
			if (local16 > local27) {
				local60 = this.anIntArrayArray52[local27];
				if (local27 <= 0) {
					local66 = local60[2];
					local70 = local60[1];
					local74 = local60[3];
				} else {
					@Pc(83) int[] local83 = this.anIntArrayArray52[local27 - 1];
					@Pc(101) int local101 = (local31 - local83[0] << 12) / (local60[0] - local83[0]);
					@Pc(106) int local106 = 4096 - local101;
					local70 = local60[1] * local101 + local106 * local83[1] >> 12;
					local66 = local60[2] * local101 + local106 * local83[2] >> 12;
					local74 = local106 * local83[3] + local101 * local60[3] >> 12;
				}
			} else {
				local60 = this.anIntArrayArray52[local16 - 1];
				local66 = local60[2];
				local74 = local60[3];
				local70 = local60[1];
			}
			local74 >>= 0x4;
			local66 >>= 0x4;
			local70 >>= 0x4;
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
			if (local66 < 0) {
				local66 = 0;
			} else if (local66 > 255) {
				local66 = 255;
			}
			this.anIntArray561[local23] = local70 << 16 | local66 << 8 | local74;
		}
	}
}
