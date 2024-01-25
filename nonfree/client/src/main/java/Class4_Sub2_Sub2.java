import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class4_Sub2_Sub2 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ak", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ak", name = "J", descriptor = "[I")
	private final int[] anIntArray29 = new int[257];

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(28) int[] local28 = this.method5847(0, arg0);
			@Pc(32) int[] local32 = local11[0];
			@Pc(36) int[] local36 = local11[1];
			@Pc(40) int[] local40 = local11[2];
			for (@Pc(42) int local42 = 0; local42 < Static350.anInt6330; local42++) {
				@Pc(50) int local50 = local28[local42] >> 4;
				if (local50 < 0) {
					local50 = 0;
				}
				if (local50 > 256) {
					local50 = 256;
				}
				local50 = this.anIntArray29[local50];
				local32[local42] = local50 >> 12 & 0xFF0;
				local36[local42] = local50 >> 4 & 0xFF0;
				local40[local42] = (local50 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
		if (this.anIntArrayArray5 == null) {
			this.method308(1);
		}
		this.method309();
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(BI)V")
	private void method308(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray5 = new int[2][4];
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][2] = 0;
			this.anIntArrayArray5[0][3] = 0;
			this.anIntArrayArray5[1][0] = 4096;
			this.anIntArrayArray5[1][3] = 4096;
			this.anIntArrayArray5[1][2] = 4096;
			this.anIntArrayArray5[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray5 = new int[8][4];
			this.anIntArrayArray5[0][2] = 2602;
			this.anIntArrayArray5[0][1] = 2650;
			this.anIntArrayArray5[0][3] = 2361;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[1][2] = 1799;
			this.anIntArrayArray5[1][3] = 1558;
			this.anIntArrayArray5[1][1] = 2313;
			this.anIntArrayArray5[1][0] = 2867;
			this.anIntArrayArray5[2][1] = 2618;
			this.anIntArrayArray5[2][3] = 1413;
			this.anIntArrayArray5[2][0] = 3072;
			this.anIntArrayArray5[2][2] = 1734;
			this.anIntArrayArray5[3][2] = 1220;
			this.anIntArrayArray5[3][0] = 3276;
			this.anIntArrayArray5[3][1] = 2296;
			this.anIntArrayArray5[3][3] = 947;
			this.anIntArrayArray5[4][3] = 722;
			this.anIntArrayArray5[4][1] = 2072;
			this.anIntArrayArray5[4][0] = 3481;
			this.anIntArrayArray5[4][2] = 963;
			this.anIntArrayArray5[5][1] = 2730;
			this.anIntArrayArray5[5][0] = 3686;
			this.anIntArrayArray5[5][2] = 2152;
			this.anIntArrayArray5[5][3] = 1766;
			this.anIntArrayArray5[6][3] = 915;
			this.anIntArrayArray5[6][0] = 3891;
			this.anIntArrayArray5[6][2] = 1060;
			this.anIntArrayArray5[6][1] = 2232;
			this.anIntArrayArray5[7][0] = 4096;
			this.anIntArrayArray5[7][3] = 1140;
			this.anIntArrayArray5[7][1] = 1686;
			this.anIntArrayArray5[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray5 = new int[7][4];
			this.anIntArrayArray5[0][3] = 4096;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][2] = 0;
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[1][0] = 663;
			this.anIntArrayArray5[1][2] = 4096;
			this.anIntArrayArray5[1][1] = 0;
			this.anIntArrayArray5[1][3] = 4096;
			this.anIntArrayArray5[2][0] = 1363;
			this.anIntArrayArray5[2][2] = 4096;
			this.anIntArrayArray5[2][3] = 0;
			this.anIntArrayArray5[2][1] = 0;
			this.anIntArrayArray5[3][2] = 4096;
			this.anIntArrayArray5[3][1] = 4096;
			this.anIntArrayArray5[3][0] = 2048;
			this.anIntArrayArray5[3][3] = 0;
			this.anIntArrayArray5[4][1] = 4096;
			this.anIntArrayArray5[4][2] = 0;
			this.anIntArrayArray5[4][0] = 2727;
			this.anIntArrayArray5[4][3] = 0;
			this.anIntArrayArray5[5][0] = 3411;
			this.anIntArrayArray5[5][3] = 4096;
			this.anIntArrayArray5[5][2] = 0;
			this.anIntArrayArray5[5][1] = 4096;
			this.anIntArrayArray5[6][2] = 0;
			this.anIntArrayArray5[6][0] = 4096;
			this.anIntArrayArray5[6][3] = 4096;
			this.anIntArrayArray5[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray5 = new int[6][4];
			this.anIntArrayArray5[0][3] = 0;
			this.anIntArrayArray5[0][2] = 0;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[1][3] = 1493;
			this.anIntArrayArray5[1][2] = 0;
			this.anIntArrayArray5[1][0] = 1843;
			this.anIntArrayArray5[1][1] = 0;
			this.anIntArrayArray5[2][3] = 2939;
			this.anIntArrayArray5[2][0] = 2457;
			this.anIntArrayArray5[2][1] = 0;
			this.anIntArrayArray5[2][2] = 0;
			this.anIntArrayArray5[3][1] = 0;
			this.anIntArrayArray5[3][3] = 3565;
			this.anIntArrayArray5[3][2] = 1124;
			this.anIntArrayArray5[3][0] = 2781;
			this.anIntArrayArray5[4][3] = 4031;
			this.anIntArrayArray5[4][2] = 3084;
			this.anIntArrayArray5[4][0] = 3481;
			this.anIntArrayArray5[4][1] = 546;
			this.anIntArrayArray5[5][0] = 4096;
			this.anIntArrayArray5[5][1] = 4096;
			this.anIntArrayArray5[5][3] = 4096;
			this.anIntArrayArray5[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray5 = new int[16][4];
			this.anIntArrayArray5[0][1] = 80;
			this.anIntArrayArray5[0][2] = 192;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][3] = 321;
			this.anIntArrayArray5[1][3] = 562;
			this.anIntArrayArray5[1][0] = 155;
			this.anIntArrayArray5[1][1] = 321;
			this.anIntArrayArray5[1][2] = 449;
			this.anIntArrayArray5[2][0] = 389;
			this.anIntArrayArray5[2][1] = 578;
			this.anIntArrayArray5[2][2] = 690;
			this.anIntArrayArray5[2][3] = 803;
			this.anIntArrayArray5[3][1] = 947;
			this.anIntArrayArray5[3][0] = 671;
			this.anIntArrayArray5[3][3] = 1140;
			this.anIntArrayArray5[3][2] = 995;
			this.anIntArrayArray5[4][3] = 1509;
			this.anIntArrayArray5[4][1] = 1285;
			this.anIntArrayArray5[4][0] = 897;
			this.anIntArrayArray5[4][2] = 1397;
			this.anIntArrayArray5[5][0] = 1175;
			this.anIntArrayArray5[5][2] = 1429;
			this.anIntArrayArray5[5][1] = 1525;
			this.anIntArrayArray5[5][3] = 1413;
			this.anIntArrayArray5[6][2] = 1461;
			this.anIntArrayArray5[6][0] = 1368;
			this.anIntArrayArray5[6][3] = 1333;
			this.anIntArrayArray5[6][1] = 1734;
			this.anIntArrayArray5[7][3] = 1702;
			this.anIntArrayArray5[7][1] = 1413;
			this.anIntArrayArray5[7][0] = 1507;
			this.anIntArrayArray5[7][2] = 1525;
			this.anIntArrayArray5[8][0] = 1736;
			this.anIntArrayArray5[8][2] = 1590;
			this.anIntArrayArray5[8][1] = 1108;
			this.anIntArrayArray5[8][3] = 2056;
			this.anIntArrayArray5[9][3] = 2666;
			this.anIntArrayArray5[9][0] = 2088;
			this.anIntArrayArray5[9][1] = 1766;
			this.anIntArrayArray5[9][2] = 2056;
			this.anIntArrayArray5[10][3] = 3276;
			this.anIntArrayArray5[10][0] = 2355;
			this.anIntArrayArray5[10][1] = 2409;
			this.anIntArrayArray5[10][2] = 2586;
			this.anIntArrayArray5[11][0] = 2691;
			this.anIntArrayArray5[11][1] = 3116;
			this.anIntArrayArray5[11][3] = 3228;
			this.anIntArrayArray5[11][2] = 3148;
			this.anIntArrayArray5[12][1] = 3806;
			this.anIntArrayArray5[12][0] = 3031;
			this.anIntArrayArray5[12][3] = 3196;
			this.anIntArrayArray5[12][2] = 3710;
			this.anIntArrayArray5[13][0] = 3522;
			this.anIntArrayArray5[13][1] = 3437;
			this.anIntArrayArray5[13][3] = 3019;
			this.anIntArrayArray5[13][2] = 3421;
			this.anIntArrayArray5[14][1] = 3116;
			this.anIntArrayArray5[14][2] = 3148;
			this.anIntArrayArray5[14][0] = 3727;
			this.anIntArrayArray5[14][3] = 3228;
			this.anIntArrayArray5[15][1] = 2377;
			this.anIntArrayArray5[15][2] = 2505;
			this.anIntArrayArray5[15][3] = 2746;
			this.anIntArrayArray5[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray5 = new int[4][4];
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[0][3] = 0;
			this.anIntArrayArray5[0][0] = 2048;
			this.anIntArrayArray5[0][2] = 4096;
			this.anIntArrayArray5[1][1] = 4096;
			this.anIntArrayArray5[1][0] = 2867;
			this.anIntArrayArray5[1][2] = 4096;
			this.anIntArrayArray5[1][3] = 0;
			this.anIntArrayArray5[2][2] = 4096;
			this.anIntArrayArray5[2][0] = 3276;
			this.anIntArrayArray5[2][3] = 0;
			this.anIntArrayArray5[2][1] = 4096;
			this.anIntArrayArray5[3][1] = 4096;
			this.anIntArrayArray5[3][0] = 4096;
			this.anIntArrayArray5[3][3] = 0;
			this.anIntArrayArray5[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)V")
	private void method309() {
		@Pc(9) int local9 = this.anIntArrayArray5.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 257; local16++) {
			@Pc(20) int local20 = 0;
			@Pc(24) int local24 = local16 << 4;
			for (@Pc(26) int local26 = 0; local26 < local9 && local24 >= this.anIntArrayArray5[local26][0]; local26++) {
				local20++;
			}
			@Pc(119) int local119;
			@Pc(105) int local105;
			@Pc(134) int local134;
			@Pc(57) int[] local57;
			if (local9 > local20) {
				local57 = this.anIntArrayArray5[local20];
				if (local20 > 0) {
					@Pc(69) int[] local69 = this.anIntArrayArray5[local20 - 1];
					@Pc(86) int local86 = (local24 - local69[0] << 12) / (local57[0] - local69[0]);
					@Pc(91) int local91 = 4096 - local86;
					local105 = local69[2] * local91 + local57[2] * local86 >> 12;
					local119 = local57[1] * local86 + local91 * local69[1] >> 12;
					local134 = local57[3] * local86 + local69[3] * local91 >> 12;
				} else {
					local119 = local57[1];
					local134 = local57[3];
					local105 = local57[2];
				}
			} else {
				local57 = this.anIntArrayArray5[local9 - 1];
				local119 = local57[1];
				local134 = local57[3];
				local105 = local57[2];
			}
			local119 >>= 0x4;
			local105 >>= 0x4;
			local134 >>= 0x4;
			if (local134 < 0) {
				local134 = 0;
			} else if (local134 > 255) {
				local134 = 255;
			}
			if (local119 < 0) {
				local119 = 0;
			} else if (local119 > 255) {
				local119 = 255;
			}
			if (local105 < 0) {
				local105 = 0;
			} else if (local105 > 255) {
				local105 = 255;
			}
			this.anIntArray29[local16] = local105 << 8 | local119 << 16 | local134;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(11) int local11 = arg1.method4864();
		if (local11 != 0) {
			this.method308(local11);
			return;
		}
		this.anIntArrayArray5 = new int[arg1.method4864()][4];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArrayArray5.length; local25++) {
			this.anIntArrayArray5[local25][0] = arg1.method4877();
			this.anIntArrayArray5[local25][1] = arg1.method4864() << 4;
			this.anIntArrayArray5[local25][2] = arg1.method4864() << 4;
			this.anIntArrayArray5[local25][3] = arg1.method4864() << 4;
		}
	}
}
