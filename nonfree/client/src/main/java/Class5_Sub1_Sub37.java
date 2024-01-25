import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class5_Sub1_Sub37 extends Class5_Sub1 {

	@OriginalMember(owner = "client!rj", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!rj", name = "E", descriptor = "[I")
	private final int[] anIntArray405 = new int[257];

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
	private void method4632() {
		@Pc(15) int local15 = this.anIntArrayArray52.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 257; local19++) {
			@Pc(23) int local23 = 0;
			@Pc(27) int local27 = local19 << 4;
			for (@Pc(29) int local29 = 0; local15 > local29 && local27 >= this.anIntArrayArray52[local29][0]; local29++) {
				local23++;
			}
			@Pc(69) int local69;
			@Pc(73) int local73;
			@Pc(77) int local77;
			@Pc(60) int[] local60;
			if (local23 < local15) {
				local60 = this.anIntArrayArray52[local23];
				if (local23 <= 0) {
					local69 = local60[1];
					local73 = local60[2];
					local77 = local60[3];
				} else {
					@Pc(86) int[] local86 = this.anIntArrayArray52[local23 - 1];
					@Pc(104) int local104 = (local27 - local86[0] << 12) / (local60[0] - local86[0]);
					@Pc(109) int local109 = 4096 - local104;
					local73 = local109 * local86[2] + local60[2] * local104 >> 12;
					local77 = local109 * local86[3] + local60[3] * local104 >> 12;
					local69 = local86[1] * local109 + local60[1] * local104 >> 12;
				}
			} else {
				local60 = this.anIntArrayArray52[local15 - 1];
				local77 = local60[3];
				local69 = local60[1];
				local73 = local60[2];
			}
			local77 >>= 0x4;
			local69 >>= 0x4;
			local73 >>= 0x4;
			if (local73 < 0) {
				local73 = 0;
			} else if (local73 > 255) {
				local73 = 255;
			}
			if (local77 < 0) {
				local77 = 0;
			} else if (local77 > 255) {
				local77 = 255;
			}
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			this.anIntArray405[local19] = local77 | local69 << 16 | local73 << 8;
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V")
	private void method4634(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray52 = new int[2][4];
			this.anIntArrayArray52[0][0] = 0;
			this.anIntArrayArray52[0][3] = 0;
			this.anIntArrayArray52[0][2] = 0;
			this.anIntArrayArray52[0][1] = 0;
			this.anIntArrayArray52[1][3] = 4096;
			this.anIntArrayArray52[1][2] = 4096;
			this.anIntArrayArray52[1][1] = 4096;
			this.anIntArrayArray52[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray52 = new int[8][4];
			this.anIntArrayArray52[0][3] = 2361;
			this.anIntArrayArray52[0][1] = 2650;
			this.anIntArrayArray52[0][0] = 0;
			this.anIntArrayArray52[0][2] = 2602;
			this.anIntArrayArray52[1][1] = 2313;
			this.anIntArrayArray52[1][0] = 2867;
			this.anIntArrayArray52[1][2] = 1799;
			this.anIntArrayArray52[1][3] = 1558;
			this.anIntArrayArray52[2][2] = 1734;
			this.anIntArrayArray52[2][0] = 3072;
			this.anIntArrayArray52[2][3] = 1413;
			this.anIntArrayArray52[2][1] = 2618;
			this.anIntArrayArray52[3][2] = 1220;
			this.anIntArrayArray52[3][3] = 947;
			this.anIntArrayArray52[3][1] = 2296;
			this.anIntArrayArray52[3][0] = 3276;
			this.anIntArrayArray52[4][3] = 722;
			this.anIntArrayArray52[4][1] = 2072;
			this.anIntArrayArray52[4][2] = 963;
			this.anIntArrayArray52[4][0] = 3481;
			this.anIntArrayArray52[5][3] = 1766;
			this.anIntArrayArray52[5][2] = 2152;
			this.anIntArrayArray52[5][1] = 2730;
			this.anIntArrayArray52[5][0] = 3686;
			this.anIntArrayArray52[6][3] = 915;
			this.anIntArrayArray52[6][2] = 1060;
			this.anIntArrayArray52[6][0] = 3891;
			this.anIntArrayArray52[6][1] = 2232;
			this.anIntArrayArray52[7][3] = 1140;
			this.anIntArrayArray52[7][0] = 4096;
			this.anIntArrayArray52[7][1] = 1686;
			this.anIntArrayArray52[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray52 = new int[7][4];
			this.anIntArrayArray52[0][0] = 0;
			this.anIntArrayArray52[0][1] = 0;
			this.anIntArrayArray52[0][2] = 0;
			this.anIntArrayArray52[0][3] = 4096;
			this.anIntArrayArray52[1][0] = 663;
			this.anIntArrayArray52[1][2] = 4096;
			this.anIntArrayArray52[1][3] = 4096;
			this.anIntArrayArray52[1][1] = 0;
			this.anIntArrayArray52[2][0] = 1363;
			this.anIntArrayArray52[2][1] = 0;
			this.anIntArrayArray52[2][2] = 4096;
			this.anIntArrayArray52[2][3] = 0;
			this.anIntArrayArray52[3][1] = 4096;
			this.anIntArrayArray52[3][0] = 2048;
			this.anIntArrayArray52[3][3] = 0;
			this.anIntArrayArray52[3][2] = 4096;
			this.anIntArrayArray52[4][0] = 2727;
			this.anIntArrayArray52[4][1] = 4096;
			this.anIntArrayArray52[4][2] = 0;
			this.anIntArrayArray52[4][3] = 0;
			this.anIntArrayArray52[5][0] = 3411;
			this.anIntArrayArray52[5][2] = 0;
			this.anIntArrayArray52[5][3] = 4096;
			this.anIntArrayArray52[5][1] = 4096;
			this.anIntArrayArray52[6][2] = 0;
			this.anIntArrayArray52[6][0] = 4096;
			this.anIntArrayArray52[6][1] = 0;
			this.anIntArrayArray52[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray52 = new int[6][4];
			this.anIntArrayArray52[0][2] = 0;
			this.anIntArrayArray52[0][3] = 0;
			this.anIntArrayArray52[0][0] = 0;
			this.anIntArrayArray52[0][1] = 0;
			this.anIntArrayArray52[1][0] = 1843;
			this.anIntArrayArray52[1][1] = 0;
			this.anIntArrayArray52[1][2] = 0;
			this.anIntArrayArray52[1][3] = 1493;
			this.anIntArrayArray52[2][3] = 2939;
			this.anIntArrayArray52[2][0] = 2457;
			this.anIntArrayArray52[2][2] = 0;
			this.anIntArrayArray52[2][1] = 0;
			this.anIntArrayArray52[3][0] = 2781;
			this.anIntArrayArray52[3][1] = 0;
			this.anIntArrayArray52[3][3] = 3565;
			this.anIntArrayArray52[3][2] = 1124;
			this.anIntArrayArray52[4][0] = 3481;
			this.anIntArrayArray52[4][1] = 546;
			this.anIntArrayArray52[4][3] = 4031;
			this.anIntArrayArray52[4][2] = 3084;
			this.anIntArrayArray52[5][2] = 4096;
			this.anIntArrayArray52[5][0] = 4096;
			this.anIntArrayArray52[5][3] = 4096;
			this.anIntArrayArray52[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray52 = new int[16][4];
			this.anIntArrayArray52[0][0] = 0;
			this.anIntArrayArray52[0][1] = 80;
			this.anIntArrayArray52[0][3] = 321;
			this.anIntArrayArray52[0][2] = 192;
			this.anIntArrayArray52[1][2] = 449;
			this.anIntArrayArray52[1][0] = 155;
			this.anIntArrayArray52[1][1] = 321;
			this.anIntArrayArray52[1][3] = 562;
			this.anIntArrayArray52[2][3] = 803;
			this.anIntArrayArray52[2][2] = 690;
			this.anIntArrayArray52[2][0] = 389;
			this.anIntArrayArray52[2][1] = 578;
			this.anIntArrayArray52[3][3] = 1140;
			this.anIntArrayArray52[3][1] = 947;
			this.anIntArrayArray52[3][2] = 995;
			this.anIntArrayArray52[3][0] = 671;
			this.anIntArrayArray52[4][3] = 1509;
			this.anIntArrayArray52[4][1] = 1285;
			this.anIntArrayArray52[4][2] = 1397;
			this.anIntArrayArray52[4][0] = 897;
			this.anIntArrayArray52[5][3] = 1413;
			this.anIntArrayArray52[5][0] = 1175;
			this.anIntArrayArray52[5][1] = 1525;
			this.anIntArrayArray52[5][2] = 1429;
			this.anIntArrayArray52[6][0] = 1368;
			this.anIntArrayArray52[6][1] = 1734;
			this.anIntArrayArray52[6][2] = 1461;
			this.anIntArrayArray52[6][3] = 1333;
			this.anIntArrayArray52[7][0] = 1507;
			this.anIntArrayArray52[7][1] = 1413;
			this.anIntArrayArray52[7][3] = 1702;
			this.anIntArrayArray52[7][2] = 1525;
			this.anIntArrayArray52[8][3] = 2056;
			this.anIntArrayArray52[8][2] = 1590;
			this.anIntArrayArray52[8][1] = 1108;
			this.anIntArrayArray52[8][0] = 1736;
			this.anIntArrayArray52[9][3] = 2666;
			this.anIntArrayArray52[9][0] = 2088;
			this.anIntArrayArray52[9][1] = 1766;
			this.anIntArrayArray52[9][2] = 2056;
			this.anIntArrayArray52[10][1] = 2409;
			this.anIntArrayArray52[10][2] = 2586;
			this.anIntArrayArray52[10][3] = 3276;
			this.anIntArrayArray52[10][0] = 2355;
			this.anIntArrayArray52[11][1] = 3116;
			this.anIntArrayArray52[11][0] = 2691;
			this.anIntArrayArray52[11][3] = 3228;
			this.anIntArrayArray52[11][2] = 3148;
			this.anIntArrayArray52[12][0] = 3031;
			this.anIntArrayArray52[12][3] = 3196;
			this.anIntArrayArray52[12][1] = 3806;
			this.anIntArrayArray52[12][2] = 3710;
			this.anIntArrayArray52[13][1] = 3437;
			this.anIntArrayArray52[13][3] = 3019;
			this.anIntArrayArray52[13][2] = 3421;
			this.anIntArrayArray52[13][0] = 3522;
			this.anIntArrayArray52[14][1] = 3116;
			this.anIntArrayArray52[14][3] = 3228;
			this.anIntArrayArray52[14][0] = 3727;
			this.anIntArrayArray52[14][2] = 3148;
			this.anIntArrayArray52[15][3] = 2746;
			this.anIntArrayArray52[15][2] = 2505;
			this.anIntArrayArray52[15][0] = 4096;
			this.anIntArrayArray52[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray52 = new int[4][4];
			this.anIntArrayArray52[0][0] = 2048;
			this.anIntArrayArray52[0][2] = 4096;
			this.anIntArrayArray52[0][1] = 0;
			this.anIntArrayArray52[0][3] = 0;
			this.anIntArrayArray52[1][2] = 4096;
			this.anIntArrayArray52[1][1] = 4096;
			this.anIntArrayArray52[1][0] = 2867;
			this.anIntArrayArray52[1][3] = 0;
			this.anIntArrayArray52[2][3] = 0;
			this.anIntArrayArray52[2][2] = 4096;
			this.anIntArrayArray52[2][0] = 3276;
			this.anIntArrayArray52[2][1] = 4096;
			this.anIntArrayArray52[3][2] = 0;
			this.anIntArrayArray52[3][3] = 0;
			this.anIntArrayArray52[3][0] = 4096;
			this.anIntArrayArray52[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
		if (this.anIntArrayArray52 == null) {
			this.method4634(1);
		}
		this.method4632();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(16) int local16 = arg1.method5539();
		if (local16 != 0) {
			this.method4634(local16);
			return;
		}
		this.anIntArrayArray52 = new int[arg1.method5539()][4];
		for (@Pc(35) int local35 = 0; local35 < this.anIntArrayArray52.length; local35++) {
			this.anIntArrayArray52[local35][0] = arg1.method5598();
			this.anIntArrayArray52[local35][1] = arg1.method5539() << 4;
			this.anIntArrayArray52[local35][2] = arg1.method5539() << 4;
			this.anIntArrayArray52[local35][3] = arg1.method5539() << 4;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(28) int[] local28 = this.method5772(0, arg0);
			@Pc(32) int[] local32 = local18[0];
			@Pc(36) int[] local36 = local18[1];
			@Pc(40) int[] local40 = local18[2];
			for (@Pc(42) int local42 = 0; local42 < Static148.anInt2666; local42++) {
				@Pc(50) int local50 = local28[local42] >> 4;
				if (local50 < 0) {
					local50 = 0;
				}
				if (local50 > 256) {
					local50 = 256;
				}
				local50 = this.anIntArray405[local50];
				local32[local42] = local50 >> 12 & 0xFF0;
				local36[local42] = local50 >> 4 & 0xFF0;
				local40[local42] = (local50 & 0xFF) << 4;
			}
		}
		return local18;
	}
}
