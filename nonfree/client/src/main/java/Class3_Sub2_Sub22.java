import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class3_Sub2_Sub22 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lw", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!lw", name = "E", descriptor = "[I")
	private final int[] anIntArray370 = new int[257];

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)V")
	private void method5731() {
		@Pc(18) int local18 = this.anIntArrayArray37.length;
		if (local18 <= 0) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < 257; local25++) {
			@Pc(29) int local29 = 0;
			@Pc(33) int local33 = local25 << 4;
			for (@Pc(35) int local35 = 0; local18 > local35 && local33 >= this.anIntArrayArray37[local35][0]; local35++) {
				local29++;
			}
			@Pc(116) int local116;
			@Pc(144) int local144;
			@Pc(130) int local130;
			@Pc(68) int[] local68;
			if (local29 < local18) {
				local68 = this.anIntArrayArray37[local29];
				if (local29 > 0) {
					@Pc(80) int[] local80 = this.anIntArrayArray37[local29 - 1];
					@Pc(97) int local97 = (local33 - local80[0] << 12) / (local68[0] - local80[0]);
					@Pc(102) int local102 = 4096 - local97;
					local116 = local97 * local68[1] + local102 * local80[1] >> 12;
					local130 = local97 * local68[3] + local80[3] * local102 >> 12;
					local144 = local68[2] * local97 + local102 * local80[2] >> 12;
				} else {
					local130 = local68[3];
					local144 = local68[2];
					local116 = local68[1];
				}
			} else {
				local68 = this.anIntArrayArray37[local18 - 1];
				local130 = local68[3];
				local116 = local68[1];
				local144 = local68[2];
			}
			local130 >>= 0x4;
			local144 >>= 0x4;
			local116 >>= 0x4;
			if (local144 < 0) {
				local144 = 0;
			} else if (local144 > 255) {
				local144 = 255;
			}
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
			this.anIntArray370[local25] = local130 | local144 << 8 | local116 << 16;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
		if (this.anIntArrayArray37 == null) {
			this.method5732(1);
		}
		this.method5731();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BI)V")
	private void method5732(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray37 = new int[2][4];
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[1][0] = 4096;
			this.anIntArrayArray37[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray37 = new int[8][4];
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][2] = 2602;
			this.anIntArrayArray37[0][1] = 2650;
			this.anIntArrayArray37[0][3] = 2361;
			this.anIntArrayArray37[1][1] = 2313;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[1][3] = 1558;
			this.anIntArrayArray37[1][2] = 1799;
			this.anIntArrayArray37[2][1] = 2618;
			this.anIntArrayArray37[2][3] = 1413;
			this.anIntArrayArray37[2][2] = 1734;
			this.anIntArrayArray37[2][0] = 3072;
			this.anIntArrayArray37[3][1] = 2296;
			this.anIntArrayArray37[3][0] = 3276;
			this.anIntArrayArray37[3][2] = 1220;
			this.anIntArrayArray37[3][3] = 947;
			this.anIntArrayArray37[4][3] = 722;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[4][2] = 963;
			this.anIntArrayArray37[4][1] = 2072;
			this.anIntArrayArray37[5][2] = 2152;
			this.anIntArrayArray37[5][0] = 3686;
			this.anIntArrayArray37[5][3] = 1766;
			this.anIntArrayArray37[5][1] = 2730;
			this.anIntArrayArray37[6][3] = 915;
			this.anIntArrayArray37[6][1] = 2232;
			this.anIntArrayArray37[6][2] = 1060;
			this.anIntArrayArray37[6][0] = 3891;
			this.anIntArrayArray37[7][0] = 4096;
			this.anIntArrayArray37[7][2] = 1413;
			this.anIntArrayArray37[7][1] = 1686;
			this.anIntArrayArray37[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray37 = new int[7][4];
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][3] = 4096;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[1][3] = 4096;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[1][0] = 663;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[2][0] = 1363;
			this.anIntArrayArray37[3][0] = 2048;
			this.anIntArrayArray37[3][2] = 4096;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[3][3] = 0;
			this.anIntArrayArray37[4][2] = 0;
			this.anIntArrayArray37[4][3] = 0;
			this.anIntArrayArray37[4][1] = 4096;
			this.anIntArrayArray37[4][0] = 2727;
			this.anIntArrayArray37[5][3] = 4096;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[5][0] = 3411;
			this.anIntArrayArray37[5][2] = 0;
			this.anIntArrayArray37[6][3] = 4096;
			this.anIntArrayArray37[6][1] = 0;
			this.anIntArrayArray37[6][0] = 4096;
			this.anIntArrayArray37[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray37 = new int[6][4];
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[1][0] = 1843;
			this.anIntArrayArray37[1][2] = 0;
			this.anIntArrayArray37[1][3] = 1493;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[2][3] = 2939;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[2][0] = 2457;
			this.anIntArrayArray37[2][2] = 0;
			this.anIntArrayArray37[3][1] = 0;
			this.anIntArrayArray37[3][0] = 2781;
			this.anIntArrayArray37[3][3] = 3565;
			this.anIntArrayArray37[3][2] = 1124;
			this.anIntArrayArray37[4][2] = 3084;
			this.anIntArrayArray37[4][1] = 546;
			this.anIntArrayArray37[4][3] = 4031;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[5][2] = 4096;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[5][3] = 4096;
			this.anIntArrayArray37[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray37 = new int[16][4];
			this.anIntArrayArray37[0][2] = 192;
			this.anIntArrayArray37[0][1] = 80;
			this.anIntArrayArray37[0][3] = 321;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][1] = 321;
			this.anIntArrayArray37[1][2] = 449;
			this.anIntArrayArray37[1][0] = 155;
			this.anIntArrayArray37[1][3] = 562;
			this.anIntArrayArray37[2][2] = 690;
			this.anIntArrayArray37[2][1] = 578;
			this.anIntArrayArray37[2][0] = 389;
			this.anIntArrayArray37[2][3] = 803;
			this.anIntArrayArray37[3][1] = 947;
			this.anIntArrayArray37[3][0] = 671;
			this.anIntArrayArray37[3][2] = 995;
			this.anIntArrayArray37[3][3] = 1140;
			this.anIntArrayArray37[4][2] = 1397;
			this.anIntArrayArray37[4][0] = 897;
			this.anIntArrayArray37[4][1] = 1285;
			this.anIntArrayArray37[4][3] = 1509;
			this.anIntArrayArray37[5][3] = 1413;
			this.anIntArrayArray37[5][1] = 1525;
			this.anIntArrayArray37[5][2] = 1429;
			this.anIntArrayArray37[5][0] = 1175;
			this.anIntArrayArray37[6][2] = 1461;
			this.anIntArrayArray37[6][0] = 1368;
			this.anIntArrayArray37[6][1] = 1734;
			this.anIntArrayArray37[6][3] = 1333;
			this.anIntArrayArray37[7][2] = 1525;
			this.anIntArrayArray37[7][0] = 1507;
			this.anIntArrayArray37[7][3] = 1702;
			this.anIntArrayArray37[7][1] = 1413;
			this.anIntArrayArray37[8][1] = 1108;
			this.anIntArrayArray37[8][2] = 1590;
			this.anIntArrayArray37[8][0] = 1736;
			this.anIntArrayArray37[8][3] = 2056;
			this.anIntArrayArray37[9][0] = 2088;
			this.anIntArrayArray37[9][3] = 2666;
			this.anIntArrayArray37[9][2] = 2056;
			this.anIntArrayArray37[9][1] = 1766;
			this.anIntArrayArray37[10][1] = 2409;
			this.anIntArrayArray37[10][0] = 2355;
			this.anIntArrayArray37[10][2] = 2586;
			this.anIntArrayArray37[10][3] = 3276;
			this.anIntArrayArray37[11][0] = 2691;
			this.anIntArrayArray37[11][1] = 3116;
			this.anIntArrayArray37[11][3] = 3228;
			this.anIntArrayArray37[11][2] = 3148;
			this.anIntArrayArray37[12][0] = 3031;
			this.anIntArrayArray37[12][2] = 3710;
			this.anIntArrayArray37[12][3] = 3196;
			this.anIntArrayArray37[12][1] = 3806;
			this.anIntArrayArray37[13][1] = 3437;
			this.anIntArrayArray37[13][3] = 3019;
			this.anIntArrayArray37[13][2] = 3421;
			this.anIntArrayArray37[13][0] = 3522;
			this.anIntArrayArray37[14][3] = 3228;
			this.anIntArrayArray37[14][0] = 3727;
			this.anIntArrayArray37[14][2] = 3148;
			this.anIntArrayArray37[14][1] = 3116;
			this.anIntArrayArray37[15][1] = 2377;
			this.anIntArrayArray37[15][2] = 2505;
			this.anIntArrayArray37[15][3] = 2746;
			this.anIntArrayArray37[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray37 = new int[4][4];
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[0][0] = 2048;
			this.anIntArrayArray37[0][2] = 4096;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[1][3] = 0;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[2][1] = 4096;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[2][0] = 3276;
			this.anIntArrayArray37[3][0] = 4096;
			this.anIntArrayArray37[3][2] = 0;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(29) int[] local29 = this.method9204(arg0, 0);
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[2];
			for (@Pc(43) int local43 = 0; local43 < Static636.anInt10302; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray370[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(17) int local17 = arg1.method5322(-53);
		if (local17 != 0) {
			this.method5732(local17);
			return;
		}
		this.anIntArrayArray37 = new int[arg1.method5322(-79)][4];
		for (@Pc(36) int local36 = 0; local36 < this.anIntArrayArray37.length; local36++) {
			this.anIntArrayArray37[local36][0] = arg1.method5272();
			this.anIntArrayArray37[local36][1] = arg1.method5322(-64) << 4;
			this.anIntArrayArray37[local36][2] = arg1.method5322(-38) << 4;
			this.anIntArrayArray37[local36][3] = arg1.method5322(-9) << 4;
		}
	}
}
