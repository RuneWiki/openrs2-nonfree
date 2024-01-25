import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class14_Sub7_Sub27 extends Class14_Sub7 {

	@OriginalMember(owner = "client!nl", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!nl", name = "K", descriptor = "[I")
	private final int[] anIntArray361 = new int[257];

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(18) int local18 = arg1.method7695(113);
		if (local18 != 0) {
			this.method6234(local18);
			return;
		}
		this.anIntArrayArray49 = new int[arg1.method7695(105)][4];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray49.length; local32++) {
			this.anIntArrayArray49[local32][0] = arg1.method7717(-1978450544);
			this.anIntArrayArray49[local32][1] = arg1.method7695(94) << 4;
			this.anIntArrayArray49[local32][2] = arg1.method7695(99) << 4;
			this.anIntArrayArray49[local32][3] = arg1.method7695(102) << 4;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(29) int[] local29 = this.method9379(0, arg0);
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[2];
			for (@Pc(43) int local43 = 0; local43 < Static613.anInt10114; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray361[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
		if (this.anIntArrayArray49 == null) {
			this.method6234(1);
		}
		this.method6233();
	}

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "(I)V")
	private void method6233() {
		@Pc(14) int local14 = this.anIntArrayArray49.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 257; local18++) {
			@Pc(22) int local22 = 0;
			@Pc(26) int local26 = local18 << 4;
			for (@Pc(28) int local28 = 0; local28 < local14 && this.anIntArrayArray49[local28][0] <= local26; local28++) {
				local22++;
			}
			@Pc(75) int local75;
			@Pc(79) int local79;
			@Pc(71) int local71;
			@Pc(67) int[] local67;
			if (local22 >= local14) {
				local67 = this.anIntArrayArray49[local14 - 1];
				local71 = local67[3];
				local75 = local67[1];
				local79 = local67[2];
			} else {
				local67 = this.anIntArrayArray49[local22];
				if (local22 > 0) {
					@Pc(98) int[] local98 = this.anIntArrayArray49[local22 - 1];
					@Pc(116) int local116 = (local26 - local98[0] << 12) / (local67[0] - local98[0]);
					@Pc(121) int local121 = 4096 - local116;
					local75 = local116 * local67[1] + local121 * local98[1] >> 12;
					local79 = local116 * local67[2] + local121 * local98[2] >> 12;
					local71 = local116 * local67[3] + local121 * local98[3] >> 12;
				} else {
					local75 = local67[1];
					local71 = local67[3];
					local79 = local67[2];
				}
			}
			local79 >>= 0x4;
			local71 >>= 0x4;
			local75 >>= 0x4;
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 > 255) {
				local79 = 255;
			}
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 > 255) {
				local75 = 255;
			}
			if (local71 < 0) {
				local71 = 0;
			} else if (local71 > 255) {
				local71 = 255;
			}
			this.anIntArray361[local18] = local79 << 8 | local75 << 16 | local71;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)V")
	private void method6234(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray49 = new int[2][4];
			this.anIntArrayArray49[0][2] = 0;
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[0][3] = 0;
			this.anIntArrayArray49[0][1] = 0;
			this.anIntArrayArray49[1][2] = 4096;
			this.anIntArrayArray49[1][0] = 4096;
			this.anIntArrayArray49[1][3] = 4096;
			this.anIntArrayArray49[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray49 = new int[8][4];
			this.anIntArrayArray49[0][3] = 2361;
			this.anIntArrayArray49[0][1] = 2650;
			this.anIntArrayArray49[0][2] = 2602;
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[1][2] = 1799;
			this.anIntArrayArray49[1][1] = 2313;
			this.anIntArrayArray49[1][0] = 2867;
			this.anIntArrayArray49[1][3] = 1558;
			this.anIntArrayArray49[2][2] = 1734;
			this.anIntArrayArray49[2][1] = 2618;
			this.anIntArrayArray49[2][3] = 1413;
			this.anIntArrayArray49[2][0] = 3072;
			this.anIntArrayArray49[3][2] = 1220;
			this.anIntArrayArray49[3][0] = 3276;
			this.anIntArrayArray49[3][3] = 947;
			this.anIntArrayArray49[3][1] = 2296;
			this.anIntArrayArray49[4][2] = 963;
			this.anIntArrayArray49[4][3] = 722;
			this.anIntArrayArray49[4][0] = 3481;
			this.anIntArrayArray49[4][1] = 2072;
			this.anIntArrayArray49[5][0] = 3686;
			this.anIntArrayArray49[5][3] = 1766;
			this.anIntArrayArray49[5][1] = 2730;
			this.anIntArrayArray49[5][2] = 2152;
			this.anIntArrayArray49[6][3] = 915;
			this.anIntArrayArray49[6][1] = 2232;
			this.anIntArrayArray49[6][2] = 1060;
			this.anIntArrayArray49[6][0] = 3891;
			this.anIntArrayArray49[7][0] = 4096;
			this.anIntArrayArray49[7][2] = 1413;
			this.anIntArrayArray49[7][3] = 1140;
			this.anIntArrayArray49[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray49 = new int[7][4];
			this.anIntArrayArray49[0][1] = 0;
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[0][2] = 0;
			this.anIntArrayArray49[0][3] = 4096;
			this.anIntArrayArray49[1][3] = 4096;
			this.anIntArrayArray49[1][1] = 0;
			this.anIntArrayArray49[1][0] = 663;
			this.anIntArrayArray49[1][2] = 4096;
			this.anIntArrayArray49[2][0] = 1363;
			this.anIntArrayArray49[2][1] = 0;
			this.anIntArrayArray49[2][2] = 4096;
			this.anIntArrayArray49[2][3] = 0;
			this.anIntArrayArray49[3][3] = 0;
			this.anIntArrayArray49[3][0] = 2048;
			this.anIntArrayArray49[3][2] = 4096;
			this.anIntArrayArray49[3][1] = 4096;
			this.anIntArrayArray49[4][3] = 0;
			this.anIntArrayArray49[4][0] = 2727;
			this.anIntArrayArray49[4][2] = 0;
			this.anIntArrayArray49[4][1] = 4096;
			this.anIntArrayArray49[5][1] = 4096;
			this.anIntArrayArray49[5][2] = 0;
			this.anIntArrayArray49[5][3] = 4096;
			this.anIntArrayArray49[5][0] = 3411;
			this.anIntArrayArray49[6][0] = 4096;
			this.anIntArrayArray49[6][1] = 0;
			this.anIntArrayArray49[6][3] = 4096;
			this.anIntArrayArray49[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray49 = new int[6][4];
			this.anIntArrayArray49[0][3] = 0;
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[0][1] = 0;
			this.anIntArrayArray49[0][2] = 0;
			this.anIntArrayArray49[1][3] = 1493;
			this.anIntArrayArray49[1][0] = 1843;
			this.anIntArrayArray49[1][2] = 0;
			this.anIntArrayArray49[1][1] = 0;
			this.anIntArrayArray49[2][1] = 0;
			this.anIntArrayArray49[2][3] = 2939;
			this.anIntArrayArray49[2][2] = 0;
			this.anIntArrayArray49[2][0] = 2457;
			this.anIntArrayArray49[3][2] = 1124;
			this.anIntArrayArray49[3][3] = 3565;
			this.anIntArrayArray49[3][0] = 2781;
			this.anIntArrayArray49[3][1] = 0;
			this.anIntArrayArray49[4][2] = 3084;
			this.anIntArrayArray49[4][1] = 546;
			this.anIntArrayArray49[4][0] = 3481;
			this.anIntArrayArray49[4][3] = 4031;
			this.anIntArrayArray49[5][1] = 4096;
			this.anIntArrayArray49[5][2] = 4096;
			this.anIntArrayArray49[5][0] = 4096;
			this.anIntArrayArray49[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray49 = new int[16][4];
			this.anIntArrayArray49[0][1] = 80;
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[0][3] = 321;
			this.anIntArrayArray49[0][2] = 192;
			this.anIntArrayArray49[1][2] = 449;
			this.anIntArrayArray49[1][1] = 321;
			this.anIntArrayArray49[1][0] = 155;
			this.anIntArrayArray49[1][3] = 562;
			this.anIntArrayArray49[2][3] = 803;
			this.anIntArrayArray49[2][1] = 578;
			this.anIntArrayArray49[2][0] = 389;
			this.anIntArrayArray49[2][2] = 690;
			this.anIntArrayArray49[3][3] = 1140;
			this.anIntArrayArray49[3][1] = 947;
			this.anIntArrayArray49[3][0] = 671;
			this.anIntArrayArray49[3][2] = 995;
			this.anIntArrayArray49[4][1] = 1285;
			this.anIntArrayArray49[4][2] = 1397;
			this.anIntArrayArray49[4][0] = 897;
			this.anIntArrayArray49[4][3] = 1509;
			this.anIntArrayArray49[5][2] = 1429;
			this.anIntArrayArray49[5][0] = 1175;
			this.anIntArrayArray49[5][1] = 1525;
			this.anIntArrayArray49[5][3] = 1413;
			this.anIntArrayArray49[6][0] = 1368;
			this.anIntArrayArray49[6][3] = 1333;
			this.anIntArrayArray49[6][2] = 1461;
			this.anIntArrayArray49[6][1] = 1734;
			this.anIntArrayArray49[7][0] = 1507;
			this.anIntArrayArray49[7][1] = 1413;
			this.anIntArrayArray49[7][2] = 1525;
			this.anIntArrayArray49[7][3] = 1702;
			this.anIntArrayArray49[8][0] = 1736;
			this.anIntArrayArray49[8][1] = 1108;
			this.anIntArrayArray49[8][3] = 2056;
			this.anIntArrayArray49[8][2] = 1590;
			this.anIntArrayArray49[9][2] = 2056;
			this.anIntArrayArray49[9][0] = 2088;
			this.anIntArrayArray49[9][1] = 1766;
			this.anIntArrayArray49[9][3] = 2666;
			this.anIntArrayArray49[10][0] = 2355;
			this.anIntArrayArray49[10][1] = 2409;
			this.anIntArrayArray49[10][2] = 2586;
			this.anIntArrayArray49[10][3] = 3276;
			this.anIntArrayArray49[11][1] = 3116;
			this.anIntArrayArray49[11][0] = 2691;
			this.anIntArrayArray49[11][3] = 3228;
			this.anIntArrayArray49[11][2] = 3148;
			this.anIntArrayArray49[12][2] = 3710;
			this.anIntArrayArray49[12][3] = 3196;
			this.anIntArrayArray49[12][1] = 3806;
			this.anIntArrayArray49[12][0] = 3031;
			this.anIntArrayArray49[13][0] = 3522;
			this.anIntArrayArray49[13][3] = 3019;
			this.anIntArrayArray49[13][1] = 3437;
			this.anIntArrayArray49[13][2] = 3421;
			this.anIntArrayArray49[14][2] = 3148;
			this.anIntArrayArray49[14][0] = 3727;
			this.anIntArrayArray49[14][3] = 3228;
			this.anIntArrayArray49[14][1] = 3116;
			this.anIntArrayArray49[15][3] = 2746;
			this.anIntArrayArray49[15][1] = 2377;
			this.anIntArrayArray49[15][0] = 4096;
			this.anIntArrayArray49[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray49 = new int[4][4];
			this.anIntArrayArray49[0][0] = 2048;
			this.anIntArrayArray49[0][3] = 0;
			this.anIntArrayArray49[0][2] = 4096;
			this.anIntArrayArray49[0][1] = 0;
			this.anIntArrayArray49[1][0] = 2867;
			this.anIntArrayArray49[1][2] = 4096;
			this.anIntArrayArray49[1][3] = 0;
			this.anIntArrayArray49[1][1] = 4096;
			this.anIntArrayArray49[2][2] = 4096;
			this.anIntArrayArray49[2][0] = 3276;
			this.anIntArrayArray49[2][3] = 0;
			this.anIntArrayArray49[2][1] = 4096;
			this.anIntArrayArray49[3][0] = 4096;
			this.anIntArrayArray49[3][2] = 0;
			this.anIntArrayArray49[3][3] = 0;
			this.anIntArrayArray49[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
