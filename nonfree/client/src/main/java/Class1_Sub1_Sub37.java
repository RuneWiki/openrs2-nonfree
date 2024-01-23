import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "[I")
	private int[] anIntArray569 = new int[257];

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(29) int[] local29 = this.method4746(0, arg0);
			@Pc(33) int[] local33 = local15[1];
			@Pc(37) int[] local37 = local15[0];
			@Pc(41) int[] local41 = local15[2];
			for (@Pc(43) int local43 = 0; local43 < Static75.anInt1848; local43++) {
				@Pc(52) int local52 = local29[local43] >> 4;
				if (local52 < 0) {
					local52 = 0;
				}
				if (local52 > 256) {
					local52 = 256;
				}
				local52 = this.anIntArray569[local52];
				local37[local43] = local52 >> 12 & 0xFF0;
				local33[local43] = local52 >> 4 & 0xFF0;
				local41[local43] = (local52 & 0xFF) << 4;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(15) int local15 = arg0.method2655();
		if (local15 != 0) {
			this.method4463(local15);
			return;
		}
		this.anIntArrayArray41 = new int[arg0.method2655()][4];
		for (@Pc(35) int local35 = 0; local35 < this.anIntArrayArray41.length; local35++) {
			this.anIntArrayArray41[local35][0] = arg0.method2652();
			this.anIntArrayArray41[local35][1] = arg0.method2655() << 4;
			this.anIntArrayArray41[local35][2] = arg0.method2655() << 4;
			this.anIntArrayArray41[local35][3] = arg0.method2655() << 4;
		}
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
	private void method4460() {
		@Pc(17) int local17 = this.anIntArrayArray41.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(33) int local33 = local24 << 4;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local17 > local37 && local33 >= this.anIntArrayArray41[local37][0]; local37++) {
				local35++;
			}
			@Pc(133) int local133;
			@Pc(119) int local119;
			@Pc(147) int local147;
			@Pc(70) int[] local70;
			if (local17 > local35) {
				local70 = this.anIntArrayArray41[local35];
				if (local35 > 0) {
					@Pc(82) int[] local82 = this.anIntArrayArray41[local35 - 1];
					@Pc(100) int local100 = (local33 - local82[0] << 12) / (local70[0] - local82[0]);
					@Pc(105) int local105 = 4096 - local100;
					local119 = local105 * local82[2] + local100 * local70[2] >> 12;
					local133 = local100 * local70[1] + local82[1] * local105 >> 12;
					local147 = local82[3] * local105 + local70[3] * local100 >> 12;
				} else {
					local147 = local70[3];
					local133 = local70[1];
					local119 = local70[2];
				}
			} else {
				local70 = this.anIntArrayArray41[local17 - 1];
				local147 = local70[3];
				local119 = local70[2];
				local133 = local70[1];
			}
			local133 >>= 0x4;
			if (local133 < 0) {
				local133 = 0;
			} else if (local133 > 255) {
				local133 = 255;
			}
			local147 >>= 0x4;
			if (local147 < 0) {
				local147 = 0;
			} else if (local147 > 255) {
				local147 = 255;
			}
			local119 >>= 0x4;
			if (local119 < 0) {
				local119 = 0;
			} else if (local119 > 255) {
				local119 = 255;
			}
			this.anIntArray569[local24] = local133 << 16 | local119 << 8 | local147;
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
		if (this.anIntArrayArray41 == null) {
			this.method4463(1);
		}
		this.method4460();
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
	private void method4463(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray41 = new int[2][4];
			this.anIntArrayArray41[0][1] = 0;
			this.anIntArrayArray41[1][1] = 4096;
			this.anIntArrayArray41[0][2] = 0;
			this.anIntArrayArray41[0][0] = 0;
			this.anIntArrayArray41[1][2] = 4096;
			this.anIntArrayArray41[0][3] = 0;
			this.anIntArrayArray41[1][3] = 4096;
			this.anIntArrayArray41[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray41 = new int[8][4];
			this.anIntArrayArray41[0][3] = 2361;
			this.anIntArrayArray41[1][3] = 1558;
			this.anIntArrayArray41[0][0] = 0;
			this.anIntArrayArray41[0][1] = 2650;
			this.anIntArrayArray41[2][3] = 1413;
			this.anIntArrayArray41[1][1] = 2313;
			this.anIntArrayArray41[1][0] = 2867;
			this.anIntArrayArray41[3][3] = 947;
			this.anIntArrayArray41[4][3] = 722;
			this.anIntArrayArray41[2][1] = 2618;
			this.anIntArrayArray41[5][3] = 1766;
			this.anIntArrayArray41[3][1] = 2296;
			this.anIntArrayArray41[4][1] = 2072;
			this.anIntArrayArray41[5][1] = 2730;
			this.anIntArrayArray41[6][1] = 2232;
			this.anIntArrayArray41[7][1] = 1686;
			this.anIntArrayArray41[2][0] = 3072;
			this.anIntArrayArray41[3][0] = 3276;
			this.anIntArrayArray41[0][2] = 2602;
			this.anIntArrayArray41[6][3] = 915;
			this.anIntArrayArray41[4][0] = 3481;
			this.anIntArrayArray41[1][2] = 1799;
			this.anIntArrayArray41[7][3] = 1140;
			this.anIntArrayArray41[5][0] = 3686;
			this.anIntArrayArray41[6][0] = 3891;
			this.anIntArrayArray41[7][0] = 4096;
			this.anIntArrayArray41[2][2] = 1734;
			this.anIntArrayArray41[3][2] = 1220;
			this.anIntArrayArray41[4][2] = 963;
			this.anIntArrayArray41[5][2] = 2152;
			this.anIntArrayArray41[6][2] = 1060;
			this.anIntArrayArray41[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray41 = new int[7][4];
			this.anIntArrayArray41[0][3] = 4096;
			this.anIntArrayArray41[1][3] = 4096;
			this.anIntArrayArray41[0][0] = 0;
			this.anIntArrayArray41[0][2] = 0;
			this.anIntArrayArray41[0][1] = 0;
			this.anIntArrayArray41[1][2] = 4096;
			this.anIntArrayArray41[2][3] = 0;
			this.anIntArrayArray41[3][3] = 0;
			this.anIntArrayArray41[1][0] = 663;
			this.anIntArrayArray41[4][3] = 0;
			this.anIntArrayArray41[1][1] = 0;
			this.anIntArrayArray41[5][3] = 4096;
			this.anIntArrayArray41[2][1] = 0;
			this.anIntArrayArray41[2][2] = 4096;
			this.anIntArrayArray41[2][0] = 1363;
			this.anIntArrayArray41[3][0] = 2048;
			this.anIntArrayArray41[3][2] = 4096;
			this.anIntArrayArray41[3][1] = 4096;
			this.anIntArrayArray41[4][1] = 4096;
			this.anIntArrayArray41[4][0] = 2727;
			this.anIntArrayArray41[4][2] = 0;
			this.anIntArrayArray41[5][1] = 4096;
			this.anIntArrayArray41[5][2] = 0;
			this.anIntArrayArray41[5][0] = 3411;
			this.anIntArrayArray41[6][0] = 4096;
			this.anIntArrayArray41[6][1] = 0;
			this.anIntArrayArray41[6][3] = 4096;
			this.anIntArrayArray41[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray41 = new int[6][4];
			this.anIntArrayArray41[0][3] = 0;
			this.anIntArrayArray41[0][0] = 0;
			this.anIntArrayArray41[0][2] = 0;
			this.anIntArrayArray41[1][3] = 1493;
			this.anIntArrayArray41[1][2] = 0;
			this.anIntArrayArray41[1][0] = 1843;
			this.anIntArrayArray41[2][2] = 0;
			this.anIntArrayArray41[2][3] = 2939;
			this.anIntArrayArray41[3][3] = 3565;
			this.anIntArrayArray41[4][3] = 4031;
			this.anIntArrayArray41[2][0] = 2457;
			this.anIntArrayArray41[3][0] = 2781;
			this.anIntArrayArray41[3][2] = 1124;
			this.anIntArrayArray41[0][1] = 0;
			this.anIntArrayArray41[1][1] = 0;
			this.anIntArrayArray41[4][2] = 3084;
			this.anIntArrayArray41[5][3] = 4096;
			this.anIntArrayArray41[4][0] = 3481;
			this.anIntArrayArray41[5][2] = 4096;
			this.anIntArrayArray41[2][1] = 0;
			this.anIntArrayArray41[3][1] = 0;
			this.anIntArrayArray41[5][0] = 4096;
			this.anIntArrayArray41[4][1] = 546;
			this.anIntArrayArray41[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray41 = new int[16][4];
			this.anIntArrayArray41[0][3] = 321;
			this.anIntArrayArray41[1][3] = 562;
			this.anIntArrayArray41[2][3] = 803;
			this.anIntArrayArray41[0][0] = 0;
			this.anIntArrayArray41[0][1] = 80;
			this.anIntArrayArray41[0][2] = 192;
			this.anIntArrayArray41[3][3] = 1140;
			this.anIntArrayArray41[1][2] = 449;
			this.anIntArrayArray41[4][3] = 1509;
			this.anIntArrayArray41[5][3] = 1413;
			this.anIntArrayArray41[1][1] = 321;
			this.anIntArrayArray41[1][0] = 155;
			this.anIntArrayArray41[6][3] = 1333;
			this.anIntArrayArray41[2][0] = 389;
			this.anIntArrayArray41[7][3] = 1702;
			this.anIntArrayArray41[8][3] = 2056;
			this.anIntArrayArray41[2][1] = 578;
			this.anIntArrayArray41[9][3] = 2666;
			this.anIntArrayArray41[3][1] = 947;
			this.anIntArrayArray41[10][3] = 3276;
			this.anIntArrayArray41[11][3] = 3228;
			this.anIntArrayArray41[12][3] = 3196;
			this.anIntArrayArray41[4][1] = 1285;
			this.anIntArrayArray41[2][2] = 690;
			this.anIntArrayArray41[5][1] = 1525;
			this.anIntArrayArray41[13][3] = 3019;
			this.anIntArrayArray41[14][3] = 3228;
			this.anIntArrayArray41[3][2] = 995;
			this.anIntArrayArray41[15][3] = 2746;
			this.anIntArrayArray41[6][1] = 1734;
			this.anIntArrayArray41[4][2] = 1397;
			this.anIntArrayArray41[5][2] = 1429;
			this.anIntArrayArray41[6][2] = 1461;
			this.anIntArrayArray41[7][2] = 1525;
			this.anIntArrayArray41[7][1] = 1413;
			this.anIntArrayArray41[8][1] = 1108;
			this.anIntArrayArray41[3][0] = 671;
			this.anIntArrayArray41[4][0] = 897;
			this.anIntArrayArray41[8][2] = 1590;
			this.anIntArrayArray41[5][0] = 1175;
			this.anIntArrayArray41[6][0] = 1368;
			this.anIntArrayArray41[9][1] = 1766;
			this.anIntArrayArray41[10][1] = 2409;
			this.anIntArrayArray41[7][0] = 1507;
			this.anIntArrayArray41[9][2] = 2056;
			this.anIntArrayArray41[10][2] = 2586;
			this.anIntArrayArray41[8][0] = 1736;
			this.anIntArrayArray41[11][2] = 3148;
			this.anIntArrayArray41[12][2] = 3710;
			this.anIntArrayArray41[9][0] = 2088;
			this.anIntArrayArray41[10][0] = 2355;
			this.anIntArrayArray41[11][0] = 2691;
			this.anIntArrayArray41[11][1] = 3116;
			this.anIntArrayArray41[12][0] = 3031;
			this.anIntArrayArray41[13][2] = 3421;
			this.anIntArrayArray41[12][1] = 3806;
			this.anIntArrayArray41[13][0] = 3522;
			this.anIntArrayArray41[14][0] = 3727;
			this.anIntArrayArray41[15][0] = 4096;
			this.anIntArrayArray41[13][1] = 3437;
			this.anIntArrayArray41[14][2] = 3148;
			this.anIntArrayArray41[14][1] = 3116;
			this.anIntArrayArray41[15][2] = 2505;
			this.anIntArrayArray41[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray41 = new int[4][4];
			this.anIntArrayArray41[0][1] = 0;
			this.anIntArrayArray41[1][1] = 4096;
			this.anIntArrayArray41[0][0] = 2048;
			this.anIntArrayArray41[0][3] = 0;
			this.anIntArrayArray41[0][2] = 4096;
			this.anIntArrayArray41[1][3] = 0;
			this.anIntArrayArray41[1][0] = 2867;
			this.anIntArrayArray41[2][1] = 4096;
			this.anIntArrayArray41[2][3] = 0;
			this.anIntArrayArray41[1][2] = 4096;
			this.anIntArrayArray41[2][2] = 4096;
			this.anIntArrayArray41[3][2] = 0;
			this.anIntArrayArray41[3][3] = 0;
			this.anIntArrayArray41[2][0] = 3276;
			this.anIntArrayArray41[3][1] = 4096;
			this.anIntArrayArray41[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
