import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bu", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!bu", name = "O", descriptor = "[I")
	private final int[] anIntArray70 = new int[257];

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(15) int local15 = arg1.method6538();
		if (local15 != 0) {
			this.method1227(local15);
			return;
		}
		this.anIntArrayArray15 = new int[arg1.method6538()][4];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray15.length; local32++) {
			this.anIntArrayArray15[local32][0] = arg1.method6535();
			this.anIntArrayArray15[local32][1] = arg1.method6538() << 4;
			this.anIntArrayArray15[local32][2] = arg1.method6538() << 4;
			this.anIntArrayArray15[local32][3] = arg1.method6538() << 4;
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(29) int[] local29 = this.method8362(arg0, 0);
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[2];
			for (@Pc(43) int local43 = 0; local43 < Static131.anInt2935; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray70[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V")
	private void method1224() {
		@Pc(13) int local13 = this.anIntArrayArray15.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local27 < local13 && local25 >= this.anIntArrayArray15[local27][0]; local27++) {
				local21++;
			}
			@Pc(59) int local59;
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(50) int[] local50;
			if (local21 < local13) {
				local50 = this.anIntArrayArray15[local21];
				if (local21 <= 0) {
					local59 = local50[1];
					local63 = local50[2];
					local67 = local50[3];
				} else {
					@Pc(76) int[] local76 = this.anIntArrayArray15[local21 - 1];
					@Pc(94) int local94 = (local25 - local76[0] << 12) / (local50[0] - local76[0]);
					@Pc(99) int local99 = 4096 - local94;
					local67 = local50[3] * local94 + local99 * local76[3] >> 12;
					local63 = local99 * local76[2] + local94 * local50[2] >> 12;
					local59 = local99 * local76[1] + local50[1] * local94 >> 12;
				}
			} else {
				local50 = this.anIntArrayArray15[local13 - 1];
				local63 = local50[2];
				local67 = local50[3];
				local59 = local50[1];
			}
			local59 >>= 0x4;
			local63 >>= 0x4;
			local67 >>= 0x4;
			if (local63 < 0) {
				local63 = 0;
			} else if (local63 > 255) {
				local63 = 255;
			}
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			if (local67 < 0) {
				local67 = 0;
			} else if (local67 > 255) {
				local67 = 255;
			}
			this.anIntArray70[local17] = local63 << 8 | local59 << 16 | local67;
		}
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
		if (this.anIntArrayArray15 == null) {
			this.method1227(1);
		}
		this.method1224();
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)V")
	private void method1227(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray15 = new int[2][4];
			this.anIntArrayArray15[0][3] = 0;
			this.anIntArrayArray15[0][1] = 0;
			this.anIntArrayArray15[0][0] = 0;
			this.anIntArrayArray15[0][2] = 0;
			this.anIntArrayArray15[1][2] = 4096;
			this.anIntArrayArray15[1][0] = 4096;
			this.anIntArrayArray15[1][1] = 4096;
			this.anIntArrayArray15[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray15 = new int[8][4];
			this.anIntArrayArray15[0][1] = 2650;
			this.anIntArrayArray15[0][0] = 0;
			this.anIntArrayArray15[0][3] = 2361;
			this.anIntArrayArray15[0][2] = 2602;
			this.anIntArrayArray15[1][1] = 2313;
			this.anIntArrayArray15[1][2] = 1799;
			this.anIntArrayArray15[1][3] = 1558;
			this.anIntArrayArray15[1][0] = 2867;
			this.anIntArrayArray15[2][3] = 1413;
			this.anIntArrayArray15[2][2] = 1734;
			this.anIntArrayArray15[2][0] = 3072;
			this.anIntArrayArray15[2][1] = 2618;
			this.anIntArrayArray15[3][3] = 947;
			this.anIntArrayArray15[3][0] = 3276;
			this.anIntArrayArray15[3][2] = 1220;
			this.anIntArrayArray15[3][1] = 2296;
			this.anIntArrayArray15[4][2] = 963;
			this.anIntArrayArray15[4][1] = 2072;
			this.anIntArrayArray15[4][3] = 722;
			this.anIntArrayArray15[4][0] = 3481;
			this.anIntArrayArray15[5][3] = 1766;
			this.anIntArrayArray15[5][1] = 2730;
			this.anIntArrayArray15[5][2] = 2152;
			this.anIntArrayArray15[5][0] = 3686;
			this.anIntArrayArray15[6][3] = 915;
			this.anIntArrayArray15[6][2] = 1060;
			this.anIntArrayArray15[6][1] = 2232;
			this.anIntArrayArray15[6][0] = 3891;
			this.anIntArrayArray15[7][3] = 1140;
			this.anIntArrayArray15[7][1] = 1686;
			this.anIntArrayArray15[7][2] = 1413;
			this.anIntArrayArray15[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray15 = new int[7][4];
			this.anIntArrayArray15[0][0] = 0;
			this.anIntArrayArray15[0][1] = 0;
			this.anIntArrayArray15[0][3] = 4096;
			this.anIntArrayArray15[0][2] = 0;
			this.anIntArrayArray15[1][0] = 663;
			this.anIntArrayArray15[1][1] = 0;
			this.anIntArrayArray15[1][3] = 4096;
			this.anIntArrayArray15[1][2] = 4096;
			this.anIntArrayArray15[2][1] = 0;
			this.anIntArrayArray15[2][0] = 1363;
			this.anIntArrayArray15[2][2] = 4096;
			this.anIntArrayArray15[2][3] = 0;
			this.anIntArrayArray15[3][1] = 4096;
			this.anIntArrayArray15[3][2] = 4096;
			this.anIntArrayArray15[3][0] = 2048;
			this.anIntArrayArray15[3][3] = 0;
			this.anIntArrayArray15[4][0] = 2727;
			this.anIntArrayArray15[4][2] = 0;
			this.anIntArrayArray15[4][3] = 0;
			this.anIntArrayArray15[4][1] = 4096;
			this.anIntArrayArray15[5][3] = 4096;
			this.anIntArrayArray15[5][0] = 3411;
			this.anIntArrayArray15[5][1] = 4096;
			this.anIntArrayArray15[5][2] = 0;
			this.anIntArrayArray15[6][3] = 4096;
			this.anIntArrayArray15[6][1] = 0;
			this.anIntArrayArray15[6][0] = 4096;
			this.anIntArrayArray15[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray15 = new int[6][4];
			this.anIntArrayArray15[0][0] = 0;
			this.anIntArrayArray15[0][3] = 0;
			this.anIntArrayArray15[0][1] = 0;
			this.anIntArrayArray15[0][2] = 0;
			this.anIntArrayArray15[1][1] = 0;
			this.anIntArrayArray15[1][3] = 1493;
			this.anIntArrayArray15[1][2] = 0;
			this.anIntArrayArray15[1][0] = 1843;
			this.anIntArrayArray15[2][2] = 0;
			this.anIntArrayArray15[2][0] = 2457;
			this.anIntArrayArray15[2][3] = 2939;
			this.anIntArrayArray15[2][1] = 0;
			this.anIntArrayArray15[3][1] = 0;
			this.anIntArrayArray15[3][2] = 1124;
			this.anIntArrayArray15[3][3] = 3565;
			this.anIntArrayArray15[3][0] = 2781;
			this.anIntArrayArray15[4][2] = 3084;
			this.anIntArrayArray15[4][0] = 3481;
			this.anIntArrayArray15[4][3] = 4031;
			this.anIntArrayArray15[4][1] = 546;
			this.anIntArrayArray15[5][3] = 4096;
			this.anIntArrayArray15[5][1] = 4096;
			this.anIntArrayArray15[5][2] = 4096;
			this.anIntArrayArray15[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray15 = new int[16][4];
			this.anIntArrayArray15[0][3] = 321;
			this.anIntArrayArray15[0][0] = 0;
			this.anIntArrayArray15[0][2] = 192;
			this.anIntArrayArray15[0][1] = 80;
			this.anIntArrayArray15[1][2] = 449;
			this.anIntArrayArray15[1][0] = 155;
			this.anIntArrayArray15[1][1] = 321;
			this.anIntArrayArray15[1][3] = 562;
			this.anIntArrayArray15[2][0] = 389;
			this.anIntArrayArray15[2][2] = 690;
			this.anIntArrayArray15[2][3] = 803;
			this.anIntArrayArray15[2][1] = 578;
			this.anIntArrayArray15[3][1] = 947;
			this.anIntArrayArray15[3][2] = 995;
			this.anIntArrayArray15[3][3] = 1140;
			this.anIntArrayArray15[3][0] = 671;
			this.anIntArrayArray15[4][0] = 897;
			this.anIntArrayArray15[4][2] = 1397;
			this.anIntArrayArray15[4][1] = 1285;
			this.anIntArrayArray15[4][3] = 1509;
			this.anIntArrayArray15[5][1] = 1525;
			this.anIntArrayArray15[5][3] = 1413;
			this.anIntArrayArray15[5][0] = 1175;
			this.anIntArrayArray15[5][2] = 1429;
			this.anIntArrayArray15[6][1] = 1734;
			this.anIntArrayArray15[6][3] = 1333;
			this.anIntArrayArray15[6][0] = 1368;
			this.anIntArrayArray15[6][2] = 1461;
			this.anIntArrayArray15[7][3] = 1702;
			this.anIntArrayArray15[7][0] = 1507;
			this.anIntArrayArray15[7][1] = 1413;
			this.anIntArrayArray15[7][2] = 1525;
			this.anIntArrayArray15[8][0] = 1736;
			this.anIntArrayArray15[8][3] = 2056;
			this.anIntArrayArray15[8][2] = 1590;
			this.anIntArrayArray15[8][1] = 1108;
			this.anIntArrayArray15[9][1] = 1766;
			this.anIntArrayArray15[9][0] = 2088;
			this.anIntArrayArray15[9][2] = 2056;
			this.anIntArrayArray15[9][3] = 2666;
			this.anIntArrayArray15[10][3] = 3276;
			this.anIntArrayArray15[10][0] = 2355;
			this.anIntArrayArray15[10][2] = 2586;
			this.anIntArrayArray15[10][1] = 2409;
			this.anIntArrayArray15[11][2] = 3148;
			this.anIntArrayArray15[11][3] = 3228;
			this.anIntArrayArray15[11][0] = 2691;
			this.anIntArrayArray15[11][1] = 3116;
			this.anIntArrayArray15[12][1] = 3806;
			this.anIntArrayArray15[12][2] = 3710;
			this.anIntArrayArray15[12][3] = 3196;
			this.anIntArrayArray15[12][0] = 3031;
			this.anIntArrayArray15[13][0] = 3522;
			this.anIntArrayArray15[13][2] = 3421;
			this.anIntArrayArray15[13][1] = 3437;
			this.anIntArrayArray15[13][3] = 3019;
			this.anIntArrayArray15[14][2] = 3148;
			this.anIntArrayArray15[14][3] = 3228;
			this.anIntArrayArray15[14][0] = 3727;
			this.anIntArrayArray15[14][1] = 3116;
			this.anIntArrayArray15[15][0] = 4096;
			this.anIntArrayArray15[15][1] = 2377;
			this.anIntArrayArray15[15][2] = 2505;
			this.anIntArrayArray15[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray15 = new int[4][4];
			this.anIntArrayArray15[0][0] = 2048;
			this.anIntArrayArray15[0][1] = 0;
			this.anIntArrayArray15[0][3] = 0;
			this.anIntArrayArray15[0][2] = 4096;
			this.anIntArrayArray15[1][0] = 2867;
			this.anIntArrayArray15[1][3] = 0;
			this.anIntArrayArray15[1][1] = 4096;
			this.anIntArrayArray15[1][2] = 4096;
			this.anIntArrayArray15[2][1] = 4096;
			this.anIntArrayArray15[2][3] = 0;
			this.anIntArrayArray15[2][2] = 4096;
			this.anIntArrayArray15[2][0] = 3276;
			this.anIntArrayArray15[3][1] = 4096;
			this.anIntArrayArray15[3][0] = 4096;
			this.anIntArrayArray15[3][3] = 0;
			this.anIntArrayArray15[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
