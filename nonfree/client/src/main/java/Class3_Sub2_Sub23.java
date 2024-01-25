import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class3_Sub2_Sub23 extends Class3_Sub2 {

	@OriginalMember(owner = "client!me", name = "J", descriptor = "[I")
	public static final int[] anIntArray373 = new int[120];

	@OriginalMember(owner = "client!me", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "[I")
	private final int[] anIntArray372 = new int[257];

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray373[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(29) int[] local29 = this.method8669(arg0, 0);
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			for (@Pc(43) int local43 = 0; local43 < Static201.anInt3738; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray372[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
	private void method5542() {
		@Pc(9) int local9 = this.anIntArrayArray30.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < 257; local13++) {
			@Pc(17) int local17 = 0;
			@Pc(21) int local21 = local13 << 4;
			for (@Pc(23) int local23 = 0; local9 > local23 && local21 >= this.anIntArrayArray30[local23][0]; local23++) {
				local17++;
			}
			@Pc(56) int local56;
			@Pc(52) int local52;
			@Pc(60) int local60;
			@Pc(46) int[] local46;
			if (local9 > local17) {
				local46 = this.anIntArrayArray30[local17];
				if (local17 <= 0) {
					local52 = local46[2];
					local56 = local46[1];
					local60 = local46[3];
				} else {
					@Pc(69) int[] local69 = this.anIntArrayArray30[local17 - 1];
					@Pc(86) int local86 = (local21 - local69[0] << 12) / (local46[0] - local69[0]);
					@Pc(91) int local91 = 4096 - local86;
					local60 = local86 * local46[3] + local91 * local69[3] >> 12;
					local56 = local86 * local46[1] + local69[1] * local91 >> 12;
					local52 = local91 * local69[2] + local46[2] * local86 >> 12;
				}
			} else {
				local46 = this.anIntArrayArray30[local9 - 1];
				local56 = local46[1];
				local60 = local46[3];
				local52 = local46[2];
			}
			local52 >>= 0x4;
			local60 >>= 0x4;
			local56 >>= 0x4;
			if (local52 < 0) {
				local52 = 0;
			} else if (local52 > 255) {
				local52 = 255;
			}
			if (local56 < 0) {
				local56 = 0;
			} else if (local56 > 255) {
				local56 = 255;
			}
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			this.anIntArray372[local13] = local60 | local52 << 8 | local56 << 16;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)V")
	private void method5543(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray30 = new int[2][4];
			this.anIntArrayArray30[0][2] = 0;
			this.anIntArrayArray30[0][3] = 0;
			this.anIntArrayArray30[0][1] = 0;
			this.anIntArrayArray30[0][0] = 0;
			this.anIntArrayArray30[1][3] = 4096;
			this.anIntArrayArray30[1][1] = 4096;
			this.anIntArrayArray30[1][0] = 4096;
			this.anIntArrayArray30[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray30 = new int[8][4];
			this.anIntArrayArray30[0][0] = 0;
			this.anIntArrayArray30[0][1] = 2650;
			this.anIntArrayArray30[0][2] = 2602;
			this.anIntArrayArray30[0][3] = 2361;
			this.anIntArrayArray30[1][3] = 1558;
			this.anIntArrayArray30[1][2] = 1799;
			this.anIntArrayArray30[1][0] = 2867;
			this.anIntArrayArray30[1][1] = 2313;
			this.anIntArrayArray30[2][0] = 3072;
			this.anIntArrayArray30[2][2] = 1734;
			this.anIntArrayArray30[2][1] = 2618;
			this.anIntArrayArray30[2][3] = 1413;
			this.anIntArrayArray30[3][1] = 2296;
			this.anIntArrayArray30[3][3] = 947;
			this.anIntArrayArray30[3][2] = 1220;
			this.anIntArrayArray30[3][0] = 3276;
			this.anIntArrayArray30[4][2] = 963;
			this.anIntArrayArray30[4][1] = 2072;
			this.anIntArrayArray30[4][0] = 3481;
			this.anIntArrayArray30[4][3] = 722;
			this.anIntArrayArray30[5][0] = 3686;
			this.anIntArrayArray30[5][3] = 1766;
			this.anIntArrayArray30[5][2] = 2152;
			this.anIntArrayArray30[5][1] = 2730;
			this.anIntArrayArray30[6][1] = 2232;
			this.anIntArrayArray30[6][2] = 1060;
			this.anIntArrayArray30[6][0] = 3891;
			this.anIntArrayArray30[6][3] = 915;
			this.anIntArrayArray30[7][1] = 1686;
			this.anIntArrayArray30[7][0] = 4096;
			this.anIntArrayArray30[7][3] = 1140;
			this.anIntArrayArray30[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray30 = new int[7][4];
			this.anIntArrayArray30[0][1] = 0;
			this.anIntArrayArray30[0][0] = 0;
			this.anIntArrayArray30[0][2] = 0;
			this.anIntArrayArray30[0][3] = 4096;
			this.anIntArrayArray30[1][1] = 0;
			this.anIntArrayArray30[1][3] = 4096;
			this.anIntArrayArray30[1][2] = 4096;
			this.anIntArrayArray30[1][0] = 663;
			this.anIntArrayArray30[2][0] = 1363;
			this.anIntArrayArray30[2][3] = 0;
			this.anIntArrayArray30[2][2] = 4096;
			this.anIntArrayArray30[2][1] = 0;
			this.anIntArrayArray30[3][0] = 2048;
			this.anIntArrayArray30[3][3] = 0;
			this.anIntArrayArray30[3][2] = 4096;
			this.anIntArrayArray30[3][1] = 4096;
			this.anIntArrayArray30[4][2] = 0;
			this.anIntArrayArray30[4][0] = 2727;
			this.anIntArrayArray30[4][3] = 0;
			this.anIntArrayArray30[4][1] = 4096;
			this.anIntArrayArray30[5][3] = 4096;
			this.anIntArrayArray30[5][2] = 0;
			this.anIntArrayArray30[5][0] = 3411;
			this.anIntArrayArray30[5][1] = 4096;
			this.anIntArrayArray30[6][0] = 4096;
			this.anIntArrayArray30[6][1] = 0;
			this.anIntArrayArray30[6][2] = 0;
			this.anIntArrayArray30[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray30 = new int[6][4];
			this.anIntArrayArray30[0][0] = 0;
			this.anIntArrayArray30[0][2] = 0;
			this.anIntArrayArray30[0][3] = 0;
			this.anIntArrayArray30[0][1] = 0;
			this.anIntArrayArray30[1][3] = 1493;
			this.anIntArrayArray30[1][0] = 1843;
			this.anIntArrayArray30[1][2] = 0;
			this.anIntArrayArray30[1][1] = 0;
			this.anIntArrayArray30[2][1] = 0;
			this.anIntArrayArray30[2][2] = 0;
			this.anIntArrayArray30[2][3] = 2939;
			this.anIntArrayArray30[2][0] = 2457;
			this.anIntArrayArray30[3][1] = 0;
			this.anIntArrayArray30[3][0] = 2781;
			this.anIntArrayArray30[3][3] = 3565;
			this.anIntArrayArray30[3][2] = 1124;
			this.anIntArrayArray30[4][2] = 3084;
			this.anIntArrayArray30[4][3] = 4031;
			this.anIntArrayArray30[4][1] = 546;
			this.anIntArrayArray30[4][0] = 3481;
			this.anIntArrayArray30[5][2] = 4096;
			this.anIntArrayArray30[5][1] = 4096;
			this.anIntArrayArray30[5][0] = 4096;
			this.anIntArrayArray30[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray30 = new int[16][4];
			this.anIntArrayArray30[0][3] = 321;
			this.anIntArrayArray30[0][1] = 80;
			this.anIntArrayArray30[0][2] = 192;
			this.anIntArrayArray30[0][0] = 0;
			this.anIntArrayArray30[1][2] = 449;
			this.anIntArrayArray30[1][1] = 321;
			this.anIntArrayArray30[1][0] = 155;
			this.anIntArrayArray30[1][3] = 562;
			this.anIntArrayArray30[2][3] = 803;
			this.anIntArrayArray30[2][2] = 690;
			this.anIntArrayArray30[2][0] = 389;
			this.anIntArrayArray30[2][1] = 578;
			this.anIntArrayArray30[3][3] = 1140;
			this.anIntArrayArray30[3][1] = 947;
			this.anIntArrayArray30[3][2] = 995;
			this.anIntArrayArray30[3][0] = 671;
			this.anIntArrayArray30[4][0] = 897;
			this.anIntArrayArray30[4][1] = 1285;
			this.anIntArrayArray30[4][2] = 1397;
			this.anIntArrayArray30[4][3] = 1509;
			this.anIntArrayArray30[5][0] = 1175;
			this.anIntArrayArray30[5][1] = 1525;
			this.anIntArrayArray30[5][3] = 1413;
			this.anIntArrayArray30[5][2] = 1429;
			this.anIntArrayArray30[6][2] = 1461;
			this.anIntArrayArray30[6][3] = 1333;
			this.anIntArrayArray30[6][0] = 1368;
			this.anIntArrayArray30[6][1] = 1734;
			this.anIntArrayArray30[7][2] = 1525;
			this.anIntArrayArray30[7][0] = 1507;
			this.anIntArrayArray30[7][3] = 1702;
			this.anIntArrayArray30[7][1] = 1413;
			this.anIntArrayArray30[8][2] = 1590;
			this.anIntArrayArray30[8][1] = 1108;
			this.anIntArrayArray30[8][0] = 1736;
			this.anIntArrayArray30[8][3] = 2056;
			this.anIntArrayArray30[9][2] = 2056;
			this.anIntArrayArray30[9][0] = 2088;
			this.anIntArrayArray30[9][1] = 1766;
			this.anIntArrayArray30[9][3] = 2666;
			this.anIntArrayArray30[10][2] = 2586;
			this.anIntArrayArray30[10][3] = 3276;
			this.anIntArrayArray30[10][1] = 2409;
			this.anIntArrayArray30[10][0] = 2355;
			this.anIntArrayArray30[11][0] = 2691;
			this.anIntArrayArray30[11][1] = 3116;
			this.anIntArrayArray30[11][3] = 3228;
			this.anIntArrayArray30[11][2] = 3148;
			this.anIntArrayArray30[12][2] = 3710;
			this.anIntArrayArray30[12][0] = 3031;
			this.anIntArrayArray30[12][3] = 3196;
			this.anIntArrayArray30[12][1] = 3806;
			this.anIntArrayArray30[13][0] = 3522;
			this.anIntArrayArray30[13][2] = 3421;
			this.anIntArrayArray30[13][1] = 3437;
			this.anIntArrayArray30[13][3] = 3019;
			this.anIntArrayArray30[14][1] = 3116;
			this.anIntArrayArray30[14][0] = 3727;
			this.anIntArrayArray30[14][3] = 3228;
			this.anIntArrayArray30[14][2] = 3148;
			this.anIntArrayArray30[15][1] = 2377;
			this.anIntArrayArray30[15][0] = 4096;
			this.anIntArrayArray30[15][2] = 2505;
			this.anIntArrayArray30[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray30 = new int[4][4];
			this.anIntArrayArray30[0][3] = 0;
			this.anIntArrayArray30[0][2] = 4096;
			this.anIntArrayArray30[0][0] = 2048;
			this.anIntArrayArray30[0][1] = 0;
			this.anIntArrayArray30[1][1] = 4096;
			this.anIntArrayArray30[1][2] = 4096;
			this.anIntArrayArray30[1][3] = 0;
			this.anIntArrayArray30[1][0] = 2867;
			this.anIntArrayArray30[2][1] = 4096;
			this.anIntArrayArray30[2][2] = 4096;
			this.anIntArrayArray30[2][0] = 3276;
			this.anIntArrayArray30[2][3] = 0;
			this.anIntArrayArray30[3][3] = 0;
			this.anIntArrayArray30[3][0] = 4096;
			this.anIntArrayArray30[3][2] = 0;
			this.anIntArrayArray30[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(20) int local20 = arg0.method5633();
		if (local20 != 0) {
			this.method5543(local20);
			return;
		}
		this.anIntArrayArray30 = new int[arg0.method5633()][4];
		for (@Pc(39) int local39 = 0; local39 < this.anIntArrayArray30.length; local39++) {
			this.anIntArrayArray30[local39][0] = arg0.method5610();
			this.anIntArrayArray30[local39][1] = arg0.method5633() << 4;
			this.anIntArrayArray30[local39][2] = arg0.method5633() << 4;
			this.anIntArrayArray30[local39][3] = arg0.method5633() << 4;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	@Override
	public void method8673() {
		if (this.anIntArrayArray30 == null) {
			this.method5543(1);
		}
		this.method5542();
	}
}
