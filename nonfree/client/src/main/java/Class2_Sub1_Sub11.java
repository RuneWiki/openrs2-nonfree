import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!eo", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!eo", name = "I", descriptor = "[I")
	private int[] anIntArray154 = new int[257];

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)V")
	private void method1384(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray4 = new int[2][4];
			this.anIntArrayArray4[0][3] = 0;
			this.anIntArrayArray4[0][1] = 0;
			this.anIntArrayArray4[1][1] = 4096;
			this.anIntArrayArray4[1][3] = 4096;
			this.anIntArrayArray4[0][0] = 0;
			this.anIntArrayArray4[1][0] = 4096;
			this.anIntArrayArray4[0][2] = 0;
			this.anIntArrayArray4[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray4 = new int[8][4];
			this.anIntArrayArray4[0][1] = 2650;
			this.anIntArrayArray4[0][0] = 0;
			this.anIntArrayArray4[1][0] = 2867;
			this.anIntArrayArray4[0][2] = 2602;
			this.anIntArrayArray4[1][1] = 2313;
			this.anIntArrayArray4[2][1] = 2618;
			this.anIntArrayArray4[3][1] = 2296;
			this.anIntArrayArray4[4][1] = 2072;
			this.anIntArrayArray4[5][1] = 2730;
			this.anIntArrayArray4[0][3] = 2361;
			this.anIntArrayArray4[1][3] = 1558;
			this.anIntArrayArray4[2][3] = 1413;
			this.anIntArrayArray4[6][1] = 2232;
			this.anIntArrayArray4[1][2] = 1799;
			this.anIntArrayArray4[2][2] = 1734;
			this.anIntArrayArray4[2][0] = 3072;
			this.anIntArrayArray4[7][1] = 1686;
			this.anIntArrayArray4[3][0] = 3276;
			this.anIntArrayArray4[3][3] = 947;
			this.anIntArrayArray4[4][0] = 3481;
			this.anIntArrayArray4[4][3] = 722;
			this.anIntArrayArray4[3][2] = 1220;
			this.anIntArrayArray4[5][0] = 3686;
			this.anIntArrayArray4[6][0] = 3891;
			this.anIntArrayArray4[4][2] = 963;
			this.anIntArrayArray4[5][3] = 1766;
			this.anIntArrayArray4[7][0] = 4096;
			this.anIntArrayArray4[6][3] = 915;
			this.anIntArrayArray4[5][2] = 2152;
			this.anIntArrayArray4[6][2] = 1060;
			this.anIntArrayArray4[7][2] = 1413;
			this.anIntArrayArray4[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray4 = new int[7][4];
			this.anIntArrayArray4[0][1] = 0;
			this.anIntArrayArray4[0][3] = 4096;
			this.anIntArrayArray4[0][2] = 0;
			this.anIntArrayArray4[1][2] = 4096;
			this.anIntArrayArray4[0][0] = 0;
			this.anIntArrayArray4[1][3] = 4096;
			this.anIntArrayArray4[1][0] = 663;
			this.anIntArrayArray4[2][2] = 4096;
			this.anIntArrayArray4[1][1] = 0;
			this.anIntArrayArray4[2][3] = 0;
			this.anIntArrayArray4[3][3] = 0;
			this.anIntArrayArray4[2][0] = 1363;
			this.anIntArrayArray4[3][0] = 2048;
			this.anIntArrayArray4[4][0] = 2727;
			this.anIntArrayArray4[5][0] = 3411;
			this.anIntArrayArray4[4][3] = 0;
			this.anIntArrayArray4[2][1] = 0;
			this.anIntArrayArray4[6][0] = 4096;
			this.anIntArrayArray4[3][1] = 4096;
			this.anIntArrayArray4[3][2] = 4096;
			this.anIntArrayArray4[4][1] = 4096;
			this.anIntArrayArray4[4][2] = 0;
			this.anIntArrayArray4[5][3] = 4096;
			this.anIntArrayArray4[6][3] = 4096;
			this.anIntArrayArray4[5][2] = 0;
			this.anIntArrayArray4[6][2] = 0;
			this.anIntArrayArray4[5][1] = 4096;
			this.anIntArrayArray4[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray4 = new int[6][4];
			this.anIntArrayArray4[0][1] = 0;
			this.anIntArrayArray4[1][1] = 0;
			this.anIntArrayArray4[0][0] = 0;
			this.anIntArrayArray4[2][1] = 0;
			this.anIntArrayArray4[0][3] = 0;
			this.anIntArrayArray4[0][2] = 0;
			this.anIntArrayArray4[1][2] = 0;
			this.anIntArrayArray4[3][1] = 0;
			this.anIntArrayArray4[1][3] = 1493;
			this.anIntArrayArray4[1][0] = 1843;
			this.anIntArrayArray4[2][0] = 2457;
			this.anIntArrayArray4[2][2] = 0;
			this.anIntArrayArray4[2][3] = 2939;
			this.anIntArrayArray4[3][2] = 1124;
			this.anIntArrayArray4[4][2] = 3084;
			this.anIntArrayArray4[3][3] = 3565;
			this.anIntArrayArray4[5][2] = 4096;
			this.anIntArrayArray4[4][1] = 546;
			this.anIntArrayArray4[5][1] = 4096;
			this.anIntArrayArray4[4][3] = 4031;
			this.anIntArrayArray4[3][0] = 2781;
			this.anIntArrayArray4[4][0] = 3481;
			this.anIntArrayArray4[5][0] = 4096;
			this.anIntArrayArray4[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray4 = new int[16][4];
			this.anIntArrayArray4[0][3] = 321;
			this.anIntArrayArray4[0][2] = 192;
			this.anIntArrayArray4[0][1] = 80;
			this.anIntArrayArray4[0][0] = 0;
			this.anIntArrayArray4[1][1] = 321;
			this.anIntArrayArray4[1][0] = 155;
			this.anIntArrayArray4[2][0] = 389;
			this.anIntArrayArray4[2][1] = 578;
			this.anIntArrayArray4[3][0] = 671;
			this.anIntArrayArray4[4][0] = 897;
			this.anIntArrayArray4[1][3] = 562;
			this.anIntArrayArray4[3][1] = 947;
			this.anIntArrayArray4[4][1] = 1285;
			this.anIntArrayArray4[5][1] = 1525;
			this.anIntArrayArray4[2][3] = 803;
			this.anIntArrayArray4[3][3] = 1140;
			this.anIntArrayArray4[4][3] = 1509;
			this.anIntArrayArray4[5][0] = 1175;
			this.anIntArrayArray4[6][0] = 1368;
			this.anIntArrayArray4[5][3] = 1413;
			this.anIntArrayArray4[7][0] = 1507;
			this.anIntArrayArray4[6][1] = 1734;
			this.anIntArrayArray4[8][0] = 1736;
			this.anIntArrayArray4[7][1] = 1413;
			this.anIntArrayArray4[6][3] = 1333;
			this.anIntArrayArray4[9][0] = 2088;
			this.anIntArrayArray4[1][2] = 449;
			this.anIntArrayArray4[10][0] = 2355;
			this.anIntArrayArray4[11][0] = 2691;
			this.anIntArrayArray4[7][3] = 1702;
			this.anIntArrayArray4[8][3] = 2056;
			this.anIntArrayArray4[12][0] = 3031;
			this.anIntArrayArray4[13][0] = 3522;
			this.anIntArrayArray4[9][3] = 2666;
			this.anIntArrayArray4[14][0] = 3727;
			this.anIntArrayArray4[10][3] = 3276;
			this.anIntArrayArray4[8][1] = 1108;
			this.anIntArrayArray4[2][2] = 690;
			this.anIntArrayArray4[15][0] = 4096;
			this.anIntArrayArray4[11][3] = 3228;
			this.anIntArrayArray4[12][3] = 3196;
			this.anIntArrayArray4[13][3] = 3019;
			this.anIntArrayArray4[14][3] = 3228;
			this.anIntArrayArray4[15][3] = 2746;
			this.anIntArrayArray4[9][1] = 1766;
			this.anIntArrayArray4[10][1] = 2409;
			this.anIntArrayArray4[11][1] = 3116;
			this.anIntArrayArray4[12][1] = 3806;
			this.anIntArrayArray4[3][2] = 995;
			this.anIntArrayArray4[4][2] = 1397;
			this.anIntArrayArray4[13][1] = 3437;
			this.anIntArrayArray4[14][1] = 3116;
			this.anIntArrayArray4[15][1] = 2377;
			this.anIntArrayArray4[5][2] = 1429;
			this.anIntArrayArray4[6][2] = 1461;
			this.anIntArrayArray4[7][2] = 1525;
			this.anIntArrayArray4[8][2] = 1590;
			this.anIntArrayArray4[9][2] = 2056;
			this.anIntArrayArray4[10][2] = 2586;
			this.anIntArrayArray4[11][2] = 3148;
			this.anIntArrayArray4[12][2] = 3710;
			this.anIntArrayArray4[13][2] = 3421;
			this.anIntArrayArray4[14][2] = 3148;
			this.anIntArrayArray4[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray4 = new int[4][4];
			this.anIntArrayArray4[0][2] = 4096;
			this.anIntArrayArray4[0][1] = 0;
			this.anIntArrayArray4[0][0] = 2048;
			this.anIntArrayArray4[1][1] = 4096;
			this.anIntArrayArray4[1][2] = 4096;
			this.anIntArrayArray4[2][1] = 4096;
			this.anIntArrayArray4[0][3] = 0;
			this.anIntArrayArray4[1][3] = 0;
			this.anIntArrayArray4[1][0] = 2867;
			this.anIntArrayArray4[2][3] = 0;
			this.anIntArrayArray4[3][1] = 4096;
			this.anIntArrayArray4[3][3] = 0;
			this.anIntArrayArray4[2][2] = 4096;
			this.anIntArrayArray4[3][2] = 0;
			this.anIntArrayArray4[2][0] = 3276;
			this.anIntArrayArray4[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(29) int[] local29 = this.method4601(arg0, 0);
			@Pc(33) int[] local33 = local13[1];
			@Pc(37) int[] local37 = local13[2];
			@Pc(41) int[] local41 = local13[0];
			for (@Pc(43) int local43 = 0; local43 < Static281.anInt5558; local43++) {
				@Pc(52) int local52 = local29[local43] >> 4;
				if (local52 < 0) {
					local52 = 0;
				}
				if (local52 > 256) {
					local52 = 256;
				}
				local52 = this.anIntArray154[local52];
				local41[local43] = local52 >> 12 & 0xFF0;
				local33[local43] = local52 >> 4 & 0xFF0;
				local37[local43] = (local52 & 0xFF) << 4;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(11) int local11 = arg0.method2146();
		if (local11 != 0) {
			this.method1384(local11);
			return;
		}
		this.anIntArrayArray4 = new int[arg0.method2146()][4];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArrayArray4.length; local22++) {
			this.anIntArrayArray4[local22][0] = arg0.method2130();
			this.anIntArrayArray4[local22][1] = arg0.method2146() << 4;
			this.anIntArrayArray4[local22][2] = arg0.method2146() << 4;
			this.anIntArrayArray4[local22][3] = arg0.method2146() << 4;
		}
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V")
	private void method1389() {
		@Pc(9) int local9 = this.anIntArrayArray4.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < 257; local21++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local21 << 4;
			for (@Pc(32) int local32 = 0; local32 < local9 && this.anIntArrayArray4[local32][0] <= local30; local32++) {
				local26++;
			}
			@Pc(76) int local76;
			@Pc(72) int local72;
			@Pc(68) int local68;
			@Pc(59) int[] local59;
			if (local9 > local26) {
				local59 = this.anIntArrayArray4[local26];
				if (local26 <= 0) {
					local68 = local59[3];
					local72 = local59[2];
					local76 = local59[1];
				} else {
					@Pc(85) int[] local85 = this.anIntArrayArray4[local26 - 1];
					@Pc(103) int local103 = (local30 - local85[0] << 12) / (local59[0] - local85[0]);
					@Pc(108) int local108 = 4096 - local103;
					local76 = local59[1] * local103 + local85[1] * local108 >> 12;
					local72 = local85[2] * local108 + local59[2] * local103 >> 12;
					local68 = local85[3] * local108 + local59[3] * local103 >> 12;
				}
			} else {
				local59 = this.anIntArrayArray4[local9 - 1];
				local76 = local59[1];
				local68 = local59[3];
				local72 = local59[2];
			}
			local72 >>= 0x4;
			if (local72 < 0) {
				local72 = 0;
			} else if (local72 > 255) {
				local72 = 255;
			}
			local68 >>= 0x4;
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			local76 >>= 0x4;
			if (local76 < 0) {
				local76 = 0;
			} else if (local76 > 255) {
				local76 = 255;
			}
			this.anIntArray154[local21] = local76 << 16 | local72 << 8 | local68;
		}
	}

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
		if (this.anIntArrayArray4 == null) {
			this.method1384(1);
		}
		this.method1389();
	}
}
