import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class3_Sub6_Sub22 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ok", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray72;

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "[I")
	private final int[] anIntArray377 = new int[257];

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(12) int local12 = arg0.method6814();
		if (local12 != 0) {
			this.method5409(local12);
			return;
		}
		this.anIntArrayArray72 = new int[arg0.method6814()][4];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray72.length; local26++) {
			this.anIntArrayArray72[local26][0] = arg0.method6811();
			this.anIntArrayArray72[local26][1] = arg0.method6814() << 4;
			this.anIntArrayArray72[local26][2] = arg0.method6814() << 4;
			this.anIntArrayArray72[local26][3] = arg0.method6814() << 4;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(27) int[] local27 = this.method8001(0, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static481.anInt8358; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray377[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)V")
	private void method5408() {
		@Pc(9) int local9 = this.anIntArrayArray72.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < 257; local13++) {
			@Pc(17) int local17 = 0;
			@Pc(21) int local21 = local13 << 4;
			for (@Pc(23) int local23 = 0; local23 < local9 && local21 >= this.anIntArrayArray72[local23][0]; local23++) {
				local17++;
			}
			@Pc(68) int local68;
			@Pc(64) int local64;
			@Pc(60) int local60;
			@Pc(54) int[] local54;
			if (local17 < local9) {
				local54 = this.anIntArrayArray72[local17];
				if (local17 <= 0) {
					local60 = local54[3];
					local64 = local54[2];
					local68 = local54[1];
				} else {
					@Pc(77) int[] local77 = this.anIntArrayArray72[local17 - 1];
					@Pc(95) int local95 = (local21 - local77[0] << 12) / (local54[0] - local77[0]);
					@Pc(99) int local99 = 4096 - local95;
					local68 = local54[1] * local95 + local77[1] * local99 >> 12;
					local60 = local95 * local54[3] + local99 * local77[3] >> 12;
					local64 = local95 * local54[2] + local77[2] * local99 >> 12;
				}
			} else {
				local54 = this.anIntArrayArray72[local9 - 1];
				local64 = local54[2];
				local60 = local54[3];
				local68 = local54[1];
			}
			local60 >>= 0x4;
			local68 >>= 0x4;
			local64 >>= 0x4;
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			this.anIntArray377[local13] = local68 << 16 | local64 << 8 | local60;
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V")
	private void method5409(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray72 = new int[2][4];
			this.anIntArrayArray72[0][2] = 0;
			this.anIntArrayArray72[0][3] = 0;
			this.anIntArrayArray72[0][1] = 0;
			this.anIntArrayArray72[0][0] = 0;
			this.anIntArrayArray72[1][1] = 4096;
			this.anIntArrayArray72[1][2] = 4096;
			this.anIntArrayArray72[1][3] = 4096;
			this.anIntArrayArray72[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray72 = new int[8][4];
			this.anIntArrayArray72[0][2] = 2602;
			this.anIntArrayArray72[0][0] = 0;
			this.anIntArrayArray72[0][1] = 2650;
			this.anIntArrayArray72[0][3] = 2361;
			this.anIntArrayArray72[1][3] = 1558;
			this.anIntArrayArray72[1][2] = 1799;
			this.anIntArrayArray72[1][0] = 2867;
			this.anIntArrayArray72[1][1] = 2313;
			this.anIntArrayArray72[2][1] = 2618;
			this.anIntArrayArray72[2][2] = 1734;
			this.anIntArrayArray72[2][3] = 1413;
			this.anIntArrayArray72[2][0] = 3072;
			this.anIntArrayArray72[3][1] = 2296;
			this.anIntArrayArray72[3][2] = 1220;
			this.anIntArrayArray72[3][0] = 3276;
			this.anIntArrayArray72[3][3] = 947;
			this.anIntArrayArray72[4][0] = 3481;
			this.anIntArrayArray72[4][1] = 2072;
			this.anIntArrayArray72[4][3] = 722;
			this.anIntArrayArray72[4][2] = 963;
			this.anIntArrayArray72[5][0] = 3686;
			this.anIntArrayArray72[5][1] = 2730;
			this.anIntArrayArray72[5][2] = 2152;
			this.anIntArrayArray72[5][3] = 1766;
			this.anIntArrayArray72[6][1] = 2232;
			this.anIntArrayArray72[6][3] = 915;
			this.anIntArrayArray72[6][0] = 3891;
			this.anIntArrayArray72[6][2] = 1060;
			this.anIntArrayArray72[7][3] = 1140;
			this.anIntArrayArray72[7][1] = 1686;
			this.anIntArrayArray72[7][0] = 4096;
			this.anIntArrayArray72[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray72 = new int[7][4];
			this.anIntArrayArray72[0][0] = 0;
			this.anIntArrayArray72[0][1] = 0;
			this.anIntArrayArray72[0][3] = 4096;
			this.anIntArrayArray72[0][2] = 0;
			this.anIntArrayArray72[1][3] = 4096;
			this.anIntArrayArray72[1][2] = 4096;
			this.anIntArrayArray72[1][1] = 0;
			this.anIntArrayArray72[1][0] = 663;
			this.anIntArrayArray72[2][1] = 0;
			this.anIntArrayArray72[2][3] = 0;
			this.anIntArrayArray72[2][0] = 1363;
			this.anIntArrayArray72[2][2] = 4096;
			this.anIntArrayArray72[3][2] = 4096;
			this.anIntArrayArray72[3][1] = 4096;
			this.anIntArrayArray72[3][3] = 0;
			this.anIntArrayArray72[3][0] = 2048;
			this.anIntArrayArray72[4][3] = 0;
			this.anIntArrayArray72[4][1] = 4096;
			this.anIntArrayArray72[4][2] = 0;
			this.anIntArrayArray72[4][0] = 2727;
			this.anIntArrayArray72[5][3] = 4096;
			this.anIntArrayArray72[5][0] = 3411;
			this.anIntArrayArray72[5][1] = 4096;
			this.anIntArrayArray72[5][2] = 0;
			this.anIntArrayArray72[6][2] = 0;
			this.anIntArrayArray72[6][1] = 0;
			this.anIntArrayArray72[6][0] = 4096;
			this.anIntArrayArray72[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray72 = new int[6][4];
			this.anIntArrayArray72[0][3] = 0;
			this.anIntArrayArray72[0][1] = 0;
			this.anIntArrayArray72[0][2] = 0;
			this.anIntArrayArray72[0][0] = 0;
			this.anIntArrayArray72[1][3] = 1493;
			this.anIntArrayArray72[1][2] = 0;
			this.anIntArrayArray72[1][1] = 0;
			this.anIntArrayArray72[1][0] = 1843;
			this.anIntArrayArray72[2][1] = 0;
			this.anIntArrayArray72[2][3] = 2939;
			this.anIntArrayArray72[2][0] = 2457;
			this.anIntArrayArray72[2][2] = 0;
			this.anIntArrayArray72[3][2] = 1124;
			this.anIntArrayArray72[3][3] = 3565;
			this.anIntArrayArray72[3][1] = 0;
			this.anIntArrayArray72[3][0] = 2781;
			this.anIntArrayArray72[4][1] = 546;
			this.anIntArrayArray72[4][0] = 3481;
			this.anIntArrayArray72[4][3] = 4031;
			this.anIntArrayArray72[4][2] = 3084;
			this.anIntArrayArray72[5][3] = 4096;
			this.anIntArrayArray72[5][1] = 4096;
			this.anIntArrayArray72[5][0] = 4096;
			this.anIntArrayArray72[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray72 = new int[16][4];
			this.anIntArrayArray72[0][1] = 80;
			this.anIntArrayArray72[0][3] = 321;
			this.anIntArrayArray72[0][2] = 192;
			this.anIntArrayArray72[0][0] = 0;
			this.anIntArrayArray72[1][3] = 562;
			this.anIntArrayArray72[1][1] = 321;
			this.anIntArrayArray72[1][0] = 155;
			this.anIntArrayArray72[1][2] = 449;
			this.anIntArrayArray72[2][0] = 389;
			this.anIntArrayArray72[2][1] = 578;
			this.anIntArrayArray72[2][2] = 690;
			this.anIntArrayArray72[2][3] = 803;
			this.anIntArrayArray72[3][3] = 1140;
			this.anIntArrayArray72[3][2] = 995;
			this.anIntArrayArray72[3][1] = 947;
			this.anIntArrayArray72[3][0] = 671;
			this.anIntArrayArray72[4][0] = 897;
			this.anIntArrayArray72[4][2] = 1397;
			this.anIntArrayArray72[4][3] = 1509;
			this.anIntArrayArray72[4][1] = 1285;
			this.anIntArrayArray72[5][2] = 1429;
			this.anIntArrayArray72[5][3] = 1413;
			this.anIntArrayArray72[5][1] = 1525;
			this.anIntArrayArray72[5][0] = 1175;
			this.anIntArrayArray72[6][1] = 1734;
			this.anIntArrayArray72[6][0] = 1368;
			this.anIntArrayArray72[6][2] = 1461;
			this.anIntArrayArray72[6][3] = 1333;
			this.anIntArrayArray72[7][0] = 1507;
			this.anIntArrayArray72[7][1] = 1413;
			this.anIntArrayArray72[7][3] = 1702;
			this.anIntArrayArray72[7][2] = 1525;
			this.anIntArrayArray72[8][3] = 2056;
			this.anIntArrayArray72[8][1] = 1108;
			this.anIntArrayArray72[8][2] = 1590;
			this.anIntArrayArray72[8][0] = 1736;
			this.anIntArrayArray72[9][1] = 1766;
			this.anIntArrayArray72[9][3] = 2666;
			this.anIntArrayArray72[9][2] = 2056;
			this.anIntArrayArray72[9][0] = 2088;
			this.anIntArrayArray72[10][0] = 2355;
			this.anIntArrayArray72[10][3] = 3276;
			this.anIntArrayArray72[10][1] = 2409;
			this.anIntArrayArray72[10][2] = 2586;
			this.anIntArrayArray72[11][3] = 3228;
			this.anIntArrayArray72[11][0] = 2691;
			this.anIntArrayArray72[11][2] = 3148;
			this.anIntArrayArray72[11][1] = 3116;
			this.anIntArrayArray72[12][0] = 3031;
			this.anIntArrayArray72[12][2] = 3710;
			this.anIntArrayArray72[12][3] = 3196;
			this.anIntArrayArray72[12][1] = 3806;
			this.anIntArrayArray72[13][1] = 3437;
			this.anIntArrayArray72[13][0] = 3522;
			this.anIntArrayArray72[13][3] = 3019;
			this.anIntArrayArray72[13][2] = 3421;
			this.anIntArrayArray72[14][0] = 3727;
			this.anIntArrayArray72[14][2] = 3148;
			this.anIntArrayArray72[14][3] = 3228;
			this.anIntArrayArray72[14][1] = 3116;
			this.anIntArrayArray72[15][1] = 2377;
			this.anIntArrayArray72[15][0] = 4096;
			this.anIntArrayArray72[15][2] = 2505;
			this.anIntArrayArray72[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray72 = new int[4][4];
			this.anIntArrayArray72[0][2] = 4096;
			this.anIntArrayArray72[0][0] = 2048;
			this.anIntArrayArray72[0][3] = 0;
			this.anIntArrayArray72[0][1] = 0;
			this.anIntArrayArray72[1][1] = 4096;
			this.anIntArrayArray72[1][2] = 4096;
			this.anIntArrayArray72[1][0] = 2867;
			this.anIntArrayArray72[1][3] = 0;
			this.anIntArrayArray72[2][3] = 0;
			this.anIntArrayArray72[2][1] = 4096;
			this.anIntArrayArray72[2][0] = 3276;
			this.anIntArrayArray72[2][2] = 4096;
			this.anIntArrayArray72[3][0] = 4096;
			this.anIntArrayArray72[3][2] = 0;
			this.anIntArrayArray72[3][1] = 4096;
			this.anIntArrayArray72[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
		if (this.anIntArrayArray72 == null) {
			this.method5409(1);
		}
		this.method5408();
	}
}
