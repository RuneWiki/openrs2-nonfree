import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jda", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray98;

	@OriginalMember(owner = "client!jda", name = "E", descriptor = "[I")
	private final int[] anIntArray345 = new int[257];

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
		if (this.anIntArrayArray98 == null) {
			this.method3601(1);
		}
		this.method3604();
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(II)V")
	private void method3601(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray98 = new int[2][4];
			this.anIntArrayArray98[0][0] = 0;
			this.anIntArrayArray98[0][2] = 0;
			this.anIntArrayArray98[0][1] = 0;
			this.anIntArrayArray98[0][3] = 0;
			this.anIntArrayArray98[1][3] = 4096;
			this.anIntArrayArray98[1][0] = 4096;
			this.anIntArrayArray98[1][1] = 4096;
			this.anIntArrayArray98[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray98 = new int[8][4];
			this.anIntArrayArray98[0][2] = 2602;
			this.anIntArrayArray98[0][1] = 2650;
			this.anIntArrayArray98[0][3] = 2361;
			this.anIntArrayArray98[0][0] = 0;
			this.anIntArrayArray98[1][0] = 2867;
			this.anIntArrayArray98[1][2] = 1799;
			this.anIntArrayArray98[1][3] = 1558;
			this.anIntArrayArray98[1][1] = 2313;
			this.anIntArrayArray98[2][3] = 1413;
			this.anIntArrayArray98[2][2] = 1734;
			this.anIntArrayArray98[2][0] = 3072;
			this.anIntArrayArray98[2][1] = 2618;
			this.anIntArrayArray98[3][0] = 3276;
			this.anIntArrayArray98[3][2] = 1220;
			this.anIntArrayArray98[3][3] = 947;
			this.anIntArrayArray98[3][1] = 2296;
			this.anIntArrayArray98[4][3] = 722;
			this.anIntArrayArray98[4][0] = 3481;
			this.anIntArrayArray98[4][2] = 963;
			this.anIntArrayArray98[4][1] = 2072;
			this.anIntArrayArray98[5][0] = 3686;
			this.anIntArrayArray98[5][3] = 1766;
			this.anIntArrayArray98[5][2] = 2152;
			this.anIntArrayArray98[5][1] = 2730;
			this.anIntArrayArray98[6][1] = 2232;
			this.anIntArrayArray98[6][3] = 915;
			this.anIntArrayArray98[6][2] = 1060;
			this.anIntArrayArray98[6][0] = 3891;
			this.anIntArrayArray98[7][3] = 1140;
			this.anIntArrayArray98[7][2] = 1413;
			this.anIntArrayArray98[7][0] = 4096;
			this.anIntArrayArray98[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray98 = new int[7][4];
			this.anIntArrayArray98[0][3] = 4096;
			this.anIntArrayArray98[0][0] = 0;
			this.anIntArrayArray98[0][1] = 0;
			this.anIntArrayArray98[0][2] = 0;
			this.anIntArrayArray98[1][3] = 4096;
			this.anIntArrayArray98[1][1] = 0;
			this.anIntArrayArray98[1][0] = 663;
			this.anIntArrayArray98[1][2] = 4096;
			this.anIntArrayArray98[2][0] = 1363;
			this.anIntArrayArray98[2][1] = 0;
			this.anIntArrayArray98[2][2] = 4096;
			this.anIntArrayArray98[2][3] = 0;
			this.anIntArrayArray98[3][0] = 2048;
			this.anIntArrayArray98[3][3] = 0;
			this.anIntArrayArray98[3][2] = 4096;
			this.anIntArrayArray98[3][1] = 4096;
			this.anIntArrayArray98[4][3] = 0;
			this.anIntArrayArray98[4][2] = 0;
			this.anIntArrayArray98[4][1] = 4096;
			this.anIntArrayArray98[4][0] = 2727;
			this.anIntArrayArray98[5][2] = 0;
			this.anIntArrayArray98[5][1] = 4096;
			this.anIntArrayArray98[5][0] = 3411;
			this.anIntArrayArray98[5][3] = 4096;
			this.anIntArrayArray98[6][3] = 4096;
			this.anIntArrayArray98[6][1] = 0;
			this.anIntArrayArray98[6][0] = 4096;
			this.anIntArrayArray98[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray98 = new int[6][4];
			this.anIntArrayArray98[0][2] = 0;
			this.anIntArrayArray98[0][3] = 0;
			this.anIntArrayArray98[0][1] = 0;
			this.anIntArrayArray98[0][0] = 0;
			this.anIntArrayArray98[1][0] = 1843;
			this.anIntArrayArray98[1][1] = 0;
			this.anIntArrayArray98[1][2] = 0;
			this.anIntArrayArray98[1][3] = 1493;
			this.anIntArrayArray98[2][0] = 2457;
			this.anIntArrayArray98[2][2] = 0;
			this.anIntArrayArray98[2][1] = 0;
			this.anIntArrayArray98[2][3] = 2939;
			this.anIntArrayArray98[3][3] = 3565;
			this.anIntArrayArray98[3][0] = 2781;
			this.anIntArrayArray98[3][2] = 1124;
			this.anIntArrayArray98[3][1] = 0;
			this.anIntArrayArray98[4][1] = 546;
			this.anIntArrayArray98[4][2] = 3084;
			this.anIntArrayArray98[4][0] = 3481;
			this.anIntArrayArray98[4][3] = 4031;
			this.anIntArrayArray98[5][3] = 4096;
			this.anIntArrayArray98[5][2] = 4096;
			this.anIntArrayArray98[5][1] = 4096;
			this.anIntArrayArray98[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray98 = new int[16][4];
			this.anIntArrayArray98[0][2] = 192;
			this.anIntArrayArray98[0][0] = 0;
			this.anIntArrayArray98[0][1] = 80;
			this.anIntArrayArray98[0][3] = 321;
			this.anIntArrayArray98[1][2] = 449;
			this.anIntArrayArray98[1][0] = 155;
			this.anIntArrayArray98[1][3] = 562;
			this.anIntArrayArray98[1][1] = 321;
			this.anIntArrayArray98[2][2] = 690;
			this.anIntArrayArray98[2][0] = 389;
			this.anIntArrayArray98[2][1] = 578;
			this.anIntArrayArray98[2][3] = 803;
			this.anIntArrayArray98[3][2] = 995;
			this.anIntArrayArray98[3][3] = 1140;
			this.anIntArrayArray98[3][1] = 947;
			this.anIntArrayArray98[3][0] = 671;
			this.anIntArrayArray98[4][0] = 897;
			this.anIntArrayArray98[4][2] = 1397;
			this.anIntArrayArray98[4][3] = 1509;
			this.anIntArrayArray98[4][1] = 1285;
			this.anIntArrayArray98[5][2] = 1429;
			this.anIntArrayArray98[5][3] = 1413;
			this.anIntArrayArray98[5][1] = 1525;
			this.anIntArrayArray98[5][0] = 1175;
			this.anIntArrayArray98[6][2] = 1461;
			this.anIntArrayArray98[6][3] = 1333;
			this.anIntArrayArray98[6][1] = 1734;
			this.anIntArrayArray98[6][0] = 1368;
			this.anIntArrayArray98[7][2] = 1525;
			this.anIntArrayArray98[7][0] = 1507;
			this.anIntArrayArray98[7][3] = 1702;
			this.anIntArrayArray98[7][1] = 1413;
			this.anIntArrayArray98[8][3] = 2056;
			this.anIntArrayArray98[8][2] = 1590;
			this.anIntArrayArray98[8][1] = 1108;
			this.anIntArrayArray98[8][0] = 1736;
			this.anIntArrayArray98[9][0] = 2088;
			this.anIntArrayArray98[9][2] = 2056;
			this.anIntArrayArray98[9][3] = 2666;
			this.anIntArrayArray98[9][1] = 1766;
			this.anIntArrayArray98[10][0] = 2355;
			this.anIntArrayArray98[10][2] = 2586;
			this.anIntArrayArray98[10][1] = 2409;
			this.anIntArrayArray98[10][3] = 3276;
			this.anIntArrayArray98[11][0] = 2691;
			this.anIntArrayArray98[11][3] = 3228;
			this.anIntArrayArray98[11][2] = 3148;
			this.anIntArrayArray98[11][1] = 3116;
			this.anIntArrayArray98[12][1] = 3806;
			this.anIntArrayArray98[12][3] = 3196;
			this.anIntArrayArray98[12][0] = 3031;
			this.anIntArrayArray98[12][2] = 3710;
			this.anIntArrayArray98[13][2] = 3421;
			this.anIntArrayArray98[13][3] = 3019;
			this.anIntArrayArray98[13][1] = 3437;
			this.anIntArrayArray98[13][0] = 3522;
			this.anIntArrayArray98[14][2] = 3148;
			this.anIntArrayArray98[14][3] = 3228;
			this.anIntArrayArray98[14][1] = 3116;
			this.anIntArrayArray98[14][0] = 3727;
			this.anIntArrayArray98[15][1] = 2377;
			this.anIntArrayArray98[15][2] = 2505;
			this.anIntArrayArray98[15][0] = 4096;
			this.anIntArrayArray98[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray98 = new int[4][4];
			this.anIntArrayArray98[0][1] = 0;
			this.anIntArrayArray98[0][2] = 4096;
			this.anIntArrayArray98[0][3] = 0;
			this.anIntArrayArray98[0][0] = 2048;
			this.anIntArrayArray98[1][1] = 4096;
			this.anIntArrayArray98[1][0] = 2867;
			this.anIntArrayArray98[1][2] = 4096;
			this.anIntArrayArray98[1][3] = 0;
			this.anIntArrayArray98[2][2] = 4096;
			this.anIntArrayArray98[2][0] = 3276;
			this.anIntArrayArray98[2][1] = 4096;
			this.anIntArrayArray98[2][3] = 0;
			this.anIntArrayArray98[3][1] = 4096;
			this.anIntArrayArray98[3][3] = 0;
			this.anIntArrayArray98[3][2] = 0;
			this.anIntArrayArray98[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(19) int local19 = arg0.method5750();
		if (local19 != 0) {
			this.method3601(local19);
			return;
		}
		this.anIntArrayArray98 = new int[arg0.method5750()][4];
		for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray98.length; local33++) {
			this.anIntArrayArray98[local33][0] = arg0.method5771();
			this.anIntArrayArray98[local33][1] = arg0.method5750() << 4;
			this.anIntArrayArray98[local33][2] = arg0.method5750() << 4;
			this.anIntArrayArray98[local33][3] = arg0.method5750() << 4;
		}
	}

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "(I)V")
	private void method3604() {
		@Pc(15) int local15 = this.anIntArrayArray98.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local22 << 4;
			for (@Pc(32) int local32 = 0; local15 > local32 && this.anIntArrayArray98[local32][0] <= local30; local32++) {
				local26++;
			}
			@Pc(131) int local131;
			@Pc(117) int local117;
			@Pc(102) int local102;
			@Pc(55) int[] local55;
			if (local26 < local15) {
				local55 = this.anIntArrayArray98[local26];
				if (local26 > 0) {
					@Pc(67) int[] local67 = this.anIntArrayArray98[local26 - 1];
					@Pc(84) int local84 = (local30 - local67[0] << 12) / (local55[0] - local67[0]);
					@Pc(88) int local88 = 4096 - local84;
					local102 = local88 * local67[3] + local55[3] * local84 >> 12;
					local117 = local84 * local55[2] + local88 * local67[2] >> 12;
					local131 = local84 * local55[1] + local88 * local67[1] >> 12;
				} else {
					local117 = local55[2];
					local102 = local55[3];
					local131 = local55[1];
				}
			} else {
				local55 = this.anIntArrayArray98[local15 - 1];
				local117 = local55[2];
				local102 = local55[3];
				local131 = local55[1];
			}
			local131 >>= 0x4;
			local117 >>= 0x4;
			local102 >>= 0x4;
			if (local117 < 0) {
				local117 = 0;
			} else if (local117 > 255) {
				local117 = 255;
			}
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
			this.anIntArray345[local22] = local131 << 16 | local117 << 8 | local102;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(30) int[] local30 = this.method7709(arg0, 0);
			@Pc(34) int[] local34 = local11[0];
			@Pc(38) int[] local38 = local11[1];
			@Pc(42) int[] local42 = local11[2];
			for (@Pc(44) int local44 = 0; local44 < Static279.anInt4906; local44++) {
				@Pc(52) int local52 = local30[local44] >> 4;
				if (local52 < 0) {
					local52 = 0;
				}
				if (local52 > 256) {
					local52 = 256;
				}
				local52 = this.anIntArray345[local52];
				local34[local44] = local52 >> 12 & 0xFF0;
				local38[local44] = local52 >> 4 & 0xFF0;
				local42[local44] = (local52 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
