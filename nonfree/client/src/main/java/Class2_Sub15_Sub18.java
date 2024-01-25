import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class2_Sub15_Sub18 extends Class2_Sub15 {

	@OriginalMember(owner = "client!lda", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!lda", name = "G", descriptor = "[I")
	private final int[] anIntArray302 = new int[257];

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "(I)V")
	private void method5509() {
		@Pc(17) int local17 = this.anIntArrayArray27.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = local24 << 4;
			for (@Pc(34) int local34 = 0; local17 > local34 && this.anIntArrayArray27[local34][0] <= local32; local34++) {
				local28++;
			}
			@Pc(75) int local75;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(61) int[] local61;
			if (local28 < local17) {
				local61 = this.anIntArrayArray27[local28];
				if (local28 <= 0) {
					local67 = local61[2];
					local71 = local61[3];
					local75 = local61[1];
				} else {
					@Pc(84) int[] local84 = this.anIntArrayArray27[local28 - 1];
					@Pc(102) int local102 = (local32 - local84[0] << 12) / (local61[0] - local84[0]);
					@Pc(107) int local107 = 4096 - local102;
					local67 = local107 * local84[2] + local102 * local61[2] >> 12;
					local75 = local61[1] * local102 + local84[1] * local107 >> 12;
					local71 = local107 * local84[3] + local61[3] * local102 >> 12;
				}
			} else {
				local61 = this.anIntArrayArray27[local17 - 1];
				local75 = local61[1];
				local71 = local61[3];
				local67 = local61[2];
			}
			local75 >>= 0x4;
			local71 >>= 0x4;
			local67 >>= 0x4;
			if (local67 < 0) {
				local67 = 0;
			} else if (local67 > 255) {
				local67 = 255;
			}
			if (local71 < 0) {
				local71 = 0;
			} else if (local71 > 255) {
				local71 = 255;
			}
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 > 255) {
				local75 = 255;
			}
			this.anIntArray302[local24] = local71 | local75 << 16 | local67 << 8;
		}
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
		if (this.anIntArrayArray27 == null) {
			this.method5511(1);
		}
		this.method5509();
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(ZI)V")
	private void method5511(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray27 = new int[2][4];
			this.anIntArrayArray27[0][3] = 0;
			this.anIntArrayArray27[0][1] = 0;
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][2] = 0;
			this.anIntArrayArray27[1][2] = 4096;
			this.anIntArrayArray27[1][1] = 4096;
			this.anIntArrayArray27[1][3] = 4096;
			this.anIntArrayArray27[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray27 = new int[8][4];
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][1] = 2650;
			this.anIntArrayArray27[0][2] = 2602;
			this.anIntArrayArray27[0][3] = 2361;
			this.anIntArrayArray27[1][3] = 1558;
			this.anIntArrayArray27[1][1] = 2313;
			this.anIntArrayArray27[1][0] = 2867;
			this.anIntArrayArray27[1][2] = 1799;
			this.anIntArrayArray27[2][2] = 1734;
			this.anIntArrayArray27[2][3] = 1413;
			this.anIntArrayArray27[2][0] = 3072;
			this.anIntArrayArray27[2][1] = 2618;
			this.anIntArrayArray27[3][3] = 947;
			this.anIntArrayArray27[3][1] = 2296;
			this.anIntArrayArray27[3][2] = 1220;
			this.anIntArrayArray27[3][0] = 3276;
			this.anIntArrayArray27[4][3] = 722;
			this.anIntArrayArray27[4][0] = 3481;
			this.anIntArrayArray27[4][2] = 963;
			this.anIntArrayArray27[4][1] = 2072;
			this.anIntArrayArray27[5][0] = 3686;
			this.anIntArrayArray27[5][3] = 1766;
			this.anIntArrayArray27[5][2] = 2152;
			this.anIntArrayArray27[5][1] = 2730;
			this.anIntArrayArray27[6][1] = 2232;
			this.anIntArrayArray27[6][3] = 915;
			this.anIntArrayArray27[6][2] = 1060;
			this.anIntArrayArray27[6][0] = 3891;
			this.anIntArrayArray27[7][1] = 1686;
			this.anIntArrayArray27[7][2] = 1413;
			this.anIntArrayArray27[7][0] = 4096;
			this.anIntArrayArray27[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray27 = new int[7][4];
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][1] = 0;
			this.anIntArrayArray27[0][3] = 4096;
			this.anIntArrayArray27[0][2] = 0;
			this.anIntArrayArray27[1][0] = 663;
			this.anIntArrayArray27[1][2] = 4096;
			this.anIntArrayArray27[1][3] = 4096;
			this.anIntArrayArray27[1][1] = 0;
			this.anIntArrayArray27[2][3] = 0;
			this.anIntArrayArray27[2][1] = 0;
			this.anIntArrayArray27[2][0] = 1363;
			this.anIntArrayArray27[2][2] = 4096;
			this.anIntArrayArray27[3][1] = 4096;
			this.anIntArrayArray27[3][3] = 0;
			this.anIntArrayArray27[3][2] = 4096;
			this.anIntArrayArray27[3][0] = 2048;
			this.anIntArrayArray27[4][0] = 2727;
			this.anIntArrayArray27[4][3] = 0;
			this.anIntArrayArray27[4][2] = 0;
			this.anIntArrayArray27[4][1] = 4096;
			this.anIntArrayArray27[5][1] = 4096;
			this.anIntArrayArray27[5][3] = 4096;
			this.anIntArrayArray27[5][0] = 3411;
			this.anIntArrayArray27[5][2] = 0;
			this.anIntArrayArray27[6][0] = 4096;
			this.anIntArrayArray27[6][3] = 4096;
			this.anIntArrayArray27[6][2] = 0;
			this.anIntArrayArray27[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray27 = new int[6][4];
			this.anIntArrayArray27[0][1] = 0;
			this.anIntArrayArray27[0][3] = 0;
			this.anIntArrayArray27[0][2] = 0;
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[1][2] = 0;
			this.anIntArrayArray27[1][3] = 1493;
			this.anIntArrayArray27[1][0] = 1843;
			this.anIntArrayArray27[1][1] = 0;
			this.anIntArrayArray27[2][2] = 0;
			this.anIntArrayArray27[2][1] = 0;
			this.anIntArrayArray27[2][0] = 2457;
			this.anIntArrayArray27[2][3] = 2939;
			this.anIntArrayArray27[3][0] = 2781;
			this.anIntArrayArray27[3][2] = 1124;
			this.anIntArrayArray27[3][1] = 0;
			this.anIntArrayArray27[3][3] = 3565;
			this.anIntArrayArray27[4][0] = 3481;
			this.anIntArrayArray27[4][2] = 3084;
			this.anIntArrayArray27[4][1] = 546;
			this.anIntArrayArray27[4][3] = 4031;
			this.anIntArrayArray27[5][2] = 4096;
			this.anIntArrayArray27[5][1] = 4096;
			this.anIntArrayArray27[5][0] = 4096;
			this.anIntArrayArray27[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray27 = new int[16][4];
			this.anIntArrayArray27[0][3] = 321;
			this.anIntArrayArray27[0][2] = 192;
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][1] = 80;
			this.anIntArrayArray27[1][2] = 449;
			this.anIntArrayArray27[1][1] = 321;
			this.anIntArrayArray27[1][0] = 155;
			this.anIntArrayArray27[1][3] = 562;
			this.anIntArrayArray27[2][3] = 803;
			this.anIntArrayArray27[2][0] = 389;
			this.anIntArrayArray27[2][2] = 690;
			this.anIntArrayArray27[2][1] = 578;
			this.anIntArrayArray27[3][2] = 995;
			this.anIntArrayArray27[3][0] = 671;
			this.anIntArrayArray27[3][3] = 1140;
			this.anIntArrayArray27[3][1] = 947;
			this.anIntArrayArray27[4][1] = 1285;
			this.anIntArrayArray27[4][0] = 897;
			this.anIntArrayArray27[4][2] = 1397;
			this.anIntArrayArray27[4][3] = 1509;
			this.anIntArrayArray27[5][2] = 1429;
			this.anIntArrayArray27[5][1] = 1525;
			this.anIntArrayArray27[5][3] = 1413;
			this.anIntArrayArray27[5][0] = 1175;
			this.anIntArrayArray27[6][1] = 1734;
			this.anIntArrayArray27[6][2] = 1461;
			this.anIntArrayArray27[6][3] = 1333;
			this.anIntArrayArray27[6][0] = 1368;
			this.anIntArrayArray27[7][2] = 1525;
			this.anIntArrayArray27[7][0] = 1507;
			this.anIntArrayArray27[7][1] = 1413;
			this.anIntArrayArray27[7][3] = 1702;
			this.anIntArrayArray27[8][2] = 1590;
			this.anIntArrayArray27[8][0] = 1736;
			this.anIntArrayArray27[8][1] = 1108;
			this.anIntArrayArray27[8][3] = 2056;
			this.anIntArrayArray27[9][2] = 2056;
			this.anIntArrayArray27[9][1] = 1766;
			this.anIntArrayArray27[9][0] = 2088;
			this.anIntArrayArray27[9][3] = 2666;
			this.anIntArrayArray27[10][3] = 3276;
			this.anIntArrayArray27[10][1] = 2409;
			this.anIntArrayArray27[10][2] = 2586;
			this.anIntArrayArray27[10][0] = 2355;
			this.anIntArrayArray27[11][0] = 2691;
			this.anIntArrayArray27[11][1] = 3116;
			this.anIntArrayArray27[11][3] = 3228;
			this.anIntArrayArray27[11][2] = 3148;
			this.anIntArrayArray27[12][0] = 3031;
			this.anIntArrayArray27[12][2] = 3710;
			this.anIntArrayArray27[12][1] = 3806;
			this.anIntArrayArray27[12][3] = 3196;
			this.anIntArrayArray27[13][3] = 3019;
			this.anIntArrayArray27[13][2] = 3421;
			this.anIntArrayArray27[13][0] = 3522;
			this.anIntArrayArray27[13][1] = 3437;
			this.anIntArrayArray27[14][0] = 3727;
			this.anIntArrayArray27[14][2] = 3148;
			this.anIntArrayArray27[14][1] = 3116;
			this.anIntArrayArray27[14][3] = 3228;
			this.anIntArrayArray27[15][3] = 2746;
			this.anIntArrayArray27[15][0] = 4096;
			this.anIntArrayArray27[15][1] = 2377;
			this.anIntArrayArray27[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray27 = new int[4][4];
			this.anIntArrayArray27[0][2] = 4096;
			this.anIntArrayArray27[0][1] = 0;
			this.anIntArrayArray27[0][3] = 0;
			this.anIntArrayArray27[0][0] = 2048;
			this.anIntArrayArray27[1][2] = 4096;
			this.anIntArrayArray27[1][1] = 4096;
			this.anIntArrayArray27[1][0] = 2867;
			this.anIntArrayArray27[1][3] = 0;
			this.anIntArrayArray27[2][2] = 4096;
			this.anIntArrayArray27[2][1] = 4096;
			this.anIntArrayArray27[2][3] = 0;
			this.anIntArrayArray27[2][0] = 3276;
			this.anIntArrayArray27[3][2] = 0;
			this.anIntArrayArray27[3][1] = 4096;
			this.anIntArrayArray27[3][3] = 0;
			this.anIntArrayArray27[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(27) int[] local27 = this.method9725(0, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static329.anInt6017; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray302[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(19) int local19 = arg1.method5203();
		if (local19 != 0) {
			this.method5511(local19);
			return;
		}
		this.anIntArrayArray27 = new int[arg1.method5203()][4];
		for (@Pc(38) int local38 = 0; local38 < this.anIntArrayArray27.length; local38++) {
			this.anIntArrayArray27[local38][0] = arg1.method5211();
			this.anIntArrayArray27[local38][1] = arg1.method5203() << 4;
			this.anIntArrayArray27[local38][2] = arg1.method5203() << 4;
			this.anIntArrayArray27[local38][3] = arg1.method5203() << 4;
		}
	}
}
