import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class2_Sub7_Sub3 extends Class2_Sub7 {

	@OriginalMember(owner = "client!bn", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bn", name = "R", descriptor = "[I")
	private final int[] anIntArray63 = new int[257];

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(27) int[] local27 = this.method7581(arg0, 0);
			@Pc(31) int[] local31 = local17[0];
			@Pc(35) int[] local35 = local17[1];
			@Pc(39) int[] local39 = local17[2];
			for (@Pc(41) int local41 = 0; local41 < Static352.anInt6485; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray63[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
	private void method810() {
		@Pc(15) int local15 = this.anIntArrayArray5.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local22 << 4;
			for (@Pc(32) int local32 = 0; local32 < local15 && this.anIntArrayArray5[local32][0] <= local30; local32++) {
				local26++;
			}
			@Pc(73) int local73;
			@Pc(77) int local77;
			@Pc(69) int local69;
			@Pc(65) int[] local65;
			if (local26 >= local15) {
				local65 = this.anIntArrayArray5[local15 - 1];
				local69 = local65[3];
				local73 = local65[1];
				local77 = local65[2];
			} else {
				local65 = this.anIntArrayArray5[local26];
				if (local26 <= 0) {
					local77 = local65[2];
					local73 = local65[1];
					local69 = local65[3];
				} else {
					@Pc(110) int[] local110 = this.anIntArrayArray5[local26 - 1];
					@Pc(127) int local127 = (local30 - local110[0] << 12) / (local65[0] - local110[0]);
					@Pc(132) int local132 = 4096 - local127;
					local69 = local65[3] * local127 + local110[3] * local132 >> 12;
					local73 = local65[1] * local127 + local110[1] * local132 >> 12;
					local77 = local110[2] * local132 + local127 * local65[2] >> 12;
				}
			}
			local69 >>= 0x4;
			local77 >>= 0x4;
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
			this.anIntArray63[local22] = local69 | local77 << 8 | local73 << 16;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
		if (this.anIntArrayArray5 == null) {
			this.method815(1);
		}
		this.method810();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V")
	private void method815(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray5 = new int[2][4];
			this.anIntArrayArray5[0][3] = 0;
			this.anIntArrayArray5[0][2] = 0;
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[1][2] = 4096;
			this.anIntArrayArray5[1][0] = 4096;
			this.anIntArrayArray5[1][3] = 4096;
			this.anIntArrayArray5[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray5 = new int[8][4];
			this.anIntArrayArray5[0][2] = 2602;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][3] = 2361;
			this.anIntArrayArray5[0][1] = 2650;
			this.anIntArrayArray5[1][1] = 2313;
			this.anIntArrayArray5[1][3] = 1558;
			this.anIntArrayArray5[1][2] = 1799;
			this.anIntArrayArray5[1][0] = 2867;
			this.anIntArrayArray5[2][3] = 1413;
			this.anIntArrayArray5[2][0] = 3072;
			this.anIntArrayArray5[2][2] = 1734;
			this.anIntArrayArray5[2][1] = 2618;
			this.anIntArrayArray5[3][2] = 1220;
			this.anIntArrayArray5[3][1] = 2296;
			this.anIntArrayArray5[3][0] = 3276;
			this.anIntArrayArray5[3][3] = 947;
			this.anIntArrayArray5[4][0] = 3481;
			this.anIntArrayArray5[4][1] = 2072;
			this.anIntArrayArray5[4][3] = 722;
			this.anIntArrayArray5[4][2] = 963;
			this.anIntArrayArray5[5][0] = 3686;
			this.anIntArrayArray5[5][3] = 1766;
			this.anIntArrayArray5[5][2] = 2152;
			this.anIntArrayArray5[5][1] = 2730;
			this.anIntArrayArray5[6][0] = 3891;
			this.anIntArrayArray5[6][1] = 2232;
			this.anIntArrayArray5[6][3] = 915;
			this.anIntArrayArray5[6][2] = 1060;
			this.anIntArrayArray5[7][0] = 4096;
			this.anIntArrayArray5[7][3] = 1140;
			this.anIntArrayArray5[7][1] = 1686;
			this.anIntArrayArray5[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray5 = new int[7][4];
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][2] = 0;
			this.anIntArrayArray5[0][3] = 4096;
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[1][1] = 0;
			this.anIntArrayArray5[1][3] = 4096;
			this.anIntArrayArray5[1][2] = 4096;
			this.anIntArrayArray5[1][0] = 663;
			this.anIntArrayArray5[2][3] = 0;
			this.anIntArrayArray5[2][2] = 4096;
			this.anIntArrayArray5[2][1] = 0;
			this.anIntArrayArray5[2][0] = 1363;
			this.anIntArrayArray5[3][3] = 0;
			this.anIntArrayArray5[3][2] = 4096;
			this.anIntArrayArray5[3][0] = 2048;
			this.anIntArrayArray5[3][1] = 4096;
			this.anIntArrayArray5[4][0] = 2727;
			this.anIntArrayArray5[4][2] = 0;
			this.anIntArrayArray5[4][3] = 0;
			this.anIntArrayArray5[4][1] = 4096;
			this.anIntArrayArray5[5][1] = 4096;
			this.anIntArrayArray5[5][2] = 0;
			this.anIntArrayArray5[5][3] = 4096;
			this.anIntArrayArray5[5][0] = 3411;
			this.anIntArrayArray5[6][0] = 4096;
			this.anIntArrayArray5[6][1] = 0;
			this.anIntArrayArray5[6][3] = 4096;
			this.anIntArrayArray5[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray5 = new int[6][4];
			this.anIntArrayArray5[0][2] = 0;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[0][3] = 0;
			this.anIntArrayArray5[1][2] = 0;
			this.anIntArrayArray5[1][0] = 1843;
			this.anIntArrayArray5[1][3] = 1493;
			this.anIntArrayArray5[1][1] = 0;
			this.anIntArrayArray5[2][1] = 0;
			this.anIntArrayArray5[2][2] = 0;
			this.anIntArrayArray5[2][3] = 2939;
			this.anIntArrayArray5[2][0] = 2457;
			this.anIntArrayArray5[3][2] = 1124;
			this.anIntArrayArray5[3][3] = 3565;
			this.anIntArrayArray5[3][0] = 2781;
			this.anIntArrayArray5[3][1] = 0;
			this.anIntArrayArray5[4][2] = 3084;
			this.anIntArrayArray5[4][0] = 3481;
			this.anIntArrayArray5[4][3] = 4031;
			this.anIntArrayArray5[4][1] = 546;
			this.anIntArrayArray5[5][1] = 4096;
			this.anIntArrayArray5[5][0] = 4096;
			this.anIntArrayArray5[5][2] = 4096;
			this.anIntArrayArray5[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray5 = new int[16][4];
			this.anIntArrayArray5[0][2] = 192;
			this.anIntArrayArray5[0][3] = 321;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][1] = 80;
			this.anIntArrayArray5[1][0] = 155;
			this.anIntArrayArray5[1][3] = 562;
			this.anIntArrayArray5[1][2] = 449;
			this.anIntArrayArray5[1][1] = 321;
			this.anIntArrayArray5[2][3] = 803;
			this.anIntArrayArray5[2][0] = 389;
			this.anIntArrayArray5[2][2] = 690;
			this.anIntArrayArray5[2][1] = 578;
			this.anIntArrayArray5[3][0] = 671;
			this.anIntArrayArray5[3][1] = 947;
			this.anIntArrayArray5[3][2] = 995;
			this.anIntArrayArray5[3][3] = 1140;
			this.anIntArrayArray5[4][1] = 1285;
			this.anIntArrayArray5[4][2] = 1397;
			this.anIntArrayArray5[4][0] = 897;
			this.anIntArrayArray5[4][3] = 1509;
			this.anIntArrayArray5[5][2] = 1429;
			this.anIntArrayArray5[5][1] = 1525;
			this.anIntArrayArray5[5][0] = 1175;
			this.anIntArrayArray5[5][3] = 1413;
			this.anIntArrayArray5[6][3] = 1333;
			this.anIntArrayArray5[6][1] = 1734;
			this.anIntArrayArray5[6][0] = 1368;
			this.anIntArrayArray5[6][2] = 1461;
			this.anIntArrayArray5[7][0] = 1507;
			this.anIntArrayArray5[7][2] = 1525;
			this.anIntArrayArray5[7][3] = 1702;
			this.anIntArrayArray5[7][1] = 1413;
			this.anIntArrayArray5[8][1] = 1108;
			this.anIntArrayArray5[8][2] = 1590;
			this.anIntArrayArray5[8][3] = 2056;
			this.anIntArrayArray5[8][0] = 1736;
			this.anIntArrayArray5[9][2] = 2056;
			this.anIntArrayArray5[9][0] = 2088;
			this.anIntArrayArray5[9][1] = 1766;
			this.anIntArrayArray5[9][3] = 2666;
			this.anIntArrayArray5[10][3] = 3276;
			this.anIntArrayArray5[10][2] = 2586;
			this.anIntArrayArray5[10][1] = 2409;
			this.anIntArrayArray5[10][0] = 2355;
			this.anIntArrayArray5[11][1] = 3116;
			this.anIntArrayArray5[11][2] = 3148;
			this.anIntArrayArray5[11][0] = 2691;
			this.anIntArrayArray5[11][3] = 3228;
			this.anIntArrayArray5[12][2] = 3710;
			this.anIntArrayArray5[12][3] = 3196;
			this.anIntArrayArray5[12][1] = 3806;
			this.anIntArrayArray5[12][0] = 3031;
			this.anIntArrayArray5[13][1] = 3437;
			this.anIntArrayArray5[13][0] = 3522;
			this.anIntArrayArray5[13][2] = 3421;
			this.anIntArrayArray5[13][3] = 3019;
			this.anIntArrayArray5[14][1] = 3116;
			this.anIntArrayArray5[14][0] = 3727;
			this.anIntArrayArray5[14][3] = 3228;
			this.anIntArrayArray5[14][2] = 3148;
			this.anIntArrayArray5[15][1] = 2377;
			this.anIntArrayArray5[15][2] = 2505;
			this.anIntArrayArray5[15][3] = 2746;
			this.anIntArrayArray5[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray5 = new int[4][4];
			this.anIntArrayArray5[0][2] = 4096;
			this.anIntArrayArray5[0][0] = 2048;
			this.anIntArrayArray5[0][3] = 0;
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[1][0] = 2867;
			this.anIntArrayArray5[1][3] = 0;
			this.anIntArrayArray5[1][1] = 4096;
			this.anIntArrayArray5[1][2] = 4096;
			this.anIntArrayArray5[2][1] = 4096;
			this.anIntArrayArray5[2][3] = 0;
			this.anIntArrayArray5[2][2] = 4096;
			this.anIntArrayArray5[2][0] = 3276;
			this.anIntArrayArray5[3][3] = 0;
			this.anIntArrayArray5[3][0] = 4096;
			this.anIntArrayArray5[3][1] = 4096;
			this.anIntArrayArray5[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(22) int local22 = arg1.method5170();
		if (local22 != 0) {
			this.method815(local22);
			return;
		}
		this.anIntArrayArray5 = new int[arg1.method5170()][4];
		for (@Pc(38) int local38 = 0; local38 < this.anIntArrayArray5.length; local38++) {
			this.anIntArrayArray5[local38][0] = arg1.method5229();
			this.anIntArrayArray5[local38][1] = arg1.method5170() << 4;
			this.anIntArrayArray5[local38][2] = arg1.method5170() << 4;
			this.anIntArrayArray5[local38][3] = arg1.method5170() << 4;
		}
	}
}
