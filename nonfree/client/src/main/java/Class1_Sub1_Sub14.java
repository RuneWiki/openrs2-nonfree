import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gs", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!gs", name = "J", descriptor = "[I")
	private final int[] anIntArray116 = new int[257];

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
	private void method1902(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray60 = new int[2][4];
			this.anIntArrayArray60[0][2] = 0;
			this.anIntArrayArray60[0][3] = 0;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[0][1] = 0;
			this.anIntArrayArray60[1][0] = 4096;
			this.anIntArrayArray60[1][1] = 4096;
			this.anIntArrayArray60[1][2] = 4096;
			this.anIntArrayArray60[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray60 = new int[8][4];
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[0][1] = 2650;
			this.anIntArrayArray60[0][3] = 2361;
			this.anIntArrayArray60[0][2] = 2602;
			this.anIntArrayArray60[1][3] = 1558;
			this.anIntArrayArray60[1][2] = 1799;
			this.anIntArrayArray60[1][1] = 2313;
			this.anIntArrayArray60[1][0] = 2867;
			this.anIntArrayArray60[2][0] = 3072;
			this.anIntArrayArray60[2][1] = 2618;
			this.anIntArrayArray60[2][2] = 1734;
			this.anIntArrayArray60[2][3] = 1413;
			this.anIntArrayArray60[3][3] = 947;
			this.anIntArrayArray60[3][1] = 2296;
			this.anIntArrayArray60[3][0] = 3276;
			this.anIntArrayArray60[3][2] = 1220;
			this.anIntArrayArray60[4][2] = 963;
			this.anIntArrayArray60[4][3] = 722;
			this.anIntArrayArray60[4][1] = 2072;
			this.anIntArrayArray60[4][0] = 3481;
			this.anIntArrayArray60[5][3] = 1766;
			this.anIntArrayArray60[5][2] = 2152;
			this.anIntArrayArray60[5][0] = 3686;
			this.anIntArrayArray60[5][1] = 2730;
			this.anIntArrayArray60[6][1] = 2232;
			this.anIntArrayArray60[6][2] = 1060;
			this.anIntArrayArray60[6][0] = 3891;
			this.anIntArrayArray60[6][3] = 915;
			this.anIntArrayArray60[7][1] = 1686;
			this.anIntArrayArray60[7][3] = 1140;
			this.anIntArrayArray60[7][0] = 4096;
			this.anIntArrayArray60[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray60 = new int[7][4];
			this.anIntArrayArray60[0][2] = 0;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[0][1] = 0;
			this.anIntArrayArray60[0][3] = 4096;
			this.anIntArrayArray60[1][3] = 4096;
			this.anIntArrayArray60[1][0] = 663;
			this.anIntArrayArray60[1][2] = 4096;
			this.anIntArrayArray60[1][1] = 0;
			this.anIntArrayArray60[2][3] = 0;
			this.anIntArrayArray60[2][0] = 1363;
			this.anIntArrayArray60[2][2] = 4096;
			this.anIntArrayArray60[2][1] = 0;
			this.anIntArrayArray60[3][2] = 4096;
			this.anIntArrayArray60[3][3] = 0;
			this.anIntArrayArray60[3][1] = 4096;
			this.anIntArrayArray60[3][0] = 2048;
			this.anIntArrayArray60[4][0] = 2727;
			this.anIntArrayArray60[4][1] = 4096;
			this.anIntArrayArray60[4][3] = 0;
			this.anIntArrayArray60[4][2] = 0;
			this.anIntArrayArray60[5][1] = 4096;
			this.anIntArrayArray60[5][0] = 3411;
			this.anIntArrayArray60[5][2] = 0;
			this.anIntArrayArray60[5][3] = 4096;
			this.anIntArrayArray60[6][1] = 0;
			this.anIntArrayArray60[6][0] = 4096;
			this.anIntArrayArray60[6][3] = 4096;
			this.anIntArrayArray60[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray60 = new int[6][4];
			this.anIntArrayArray60[0][2] = 0;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[0][3] = 0;
			this.anIntArrayArray60[0][1] = 0;
			this.anIntArrayArray60[1][0] = 1843;
			this.anIntArrayArray60[1][2] = 0;
			this.anIntArrayArray60[1][1] = 0;
			this.anIntArrayArray60[1][3] = 1493;
			this.anIntArrayArray60[2][1] = 0;
			this.anIntArrayArray60[2][3] = 2939;
			this.anIntArrayArray60[2][2] = 0;
			this.anIntArrayArray60[2][0] = 2457;
			this.anIntArrayArray60[3][1] = 0;
			this.anIntArrayArray60[3][2] = 1124;
			this.anIntArrayArray60[3][0] = 2781;
			this.anIntArrayArray60[3][3] = 3565;
			this.anIntArrayArray60[4][3] = 4031;
			this.anIntArrayArray60[4][2] = 3084;
			this.anIntArrayArray60[4][0] = 3481;
			this.anIntArrayArray60[4][1] = 546;
			this.anIntArrayArray60[5][3] = 4096;
			this.anIntArrayArray60[5][0] = 4096;
			this.anIntArrayArray60[5][1] = 4096;
			this.anIntArrayArray60[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray60 = new int[16][4];
			this.anIntArrayArray60[0][2] = 192;
			this.anIntArrayArray60[0][3] = 321;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[0][1] = 80;
			this.anIntArrayArray60[1][1] = 321;
			this.anIntArrayArray60[1][2] = 449;
			this.anIntArrayArray60[1][3] = 562;
			this.anIntArrayArray60[1][0] = 155;
			this.anIntArrayArray60[2][1] = 578;
			this.anIntArrayArray60[2][3] = 803;
			this.anIntArrayArray60[2][2] = 690;
			this.anIntArrayArray60[2][0] = 389;
			this.anIntArrayArray60[3][1] = 947;
			this.anIntArrayArray60[3][0] = 671;
			this.anIntArrayArray60[3][2] = 995;
			this.anIntArrayArray60[3][3] = 1140;
			this.anIntArrayArray60[4][3] = 1509;
			this.anIntArrayArray60[4][2] = 1397;
			this.anIntArrayArray60[4][1] = 1285;
			this.anIntArrayArray60[4][0] = 897;
			this.anIntArrayArray60[5][2] = 1429;
			this.anIntArrayArray60[5][1] = 1525;
			this.anIntArrayArray60[5][3] = 1413;
			this.anIntArrayArray60[5][0] = 1175;
			this.anIntArrayArray60[6][0] = 1368;
			this.anIntArrayArray60[6][1] = 1734;
			this.anIntArrayArray60[6][3] = 1333;
			this.anIntArrayArray60[6][2] = 1461;
			this.anIntArrayArray60[7][1] = 1413;
			this.anIntArrayArray60[7][0] = 1507;
			this.anIntArrayArray60[7][3] = 1702;
			this.anIntArrayArray60[7][2] = 1525;
			this.anIntArrayArray60[8][3] = 2056;
			this.anIntArrayArray60[8][2] = 1590;
			this.anIntArrayArray60[8][1] = 1108;
			this.anIntArrayArray60[8][0] = 1736;
			this.anIntArrayArray60[9][0] = 2088;
			this.anIntArrayArray60[9][1] = 1766;
			this.anIntArrayArray60[9][2] = 2056;
			this.anIntArrayArray60[9][3] = 2666;
			this.anIntArrayArray60[10][0] = 2355;
			this.anIntArrayArray60[10][2] = 2586;
			this.anIntArrayArray60[10][1] = 2409;
			this.anIntArrayArray60[10][3] = 3276;
			this.anIntArrayArray60[11][2] = 3148;
			this.anIntArrayArray60[11][0] = 2691;
			this.anIntArrayArray60[11][3] = 3228;
			this.anIntArrayArray60[11][1] = 3116;
			this.anIntArrayArray60[12][1] = 3806;
			this.anIntArrayArray60[12][3] = 3196;
			this.anIntArrayArray60[12][2] = 3710;
			this.anIntArrayArray60[12][0] = 3031;
			this.anIntArrayArray60[13][1] = 3437;
			this.anIntArrayArray60[13][0] = 3522;
			this.anIntArrayArray60[13][2] = 3421;
			this.anIntArrayArray60[13][3] = 3019;
			this.anIntArrayArray60[14][2] = 3148;
			this.anIntArrayArray60[14][0] = 3727;
			this.anIntArrayArray60[14][3] = 3228;
			this.anIntArrayArray60[14][1] = 3116;
			this.anIntArrayArray60[15][2] = 2505;
			this.anIntArrayArray60[15][3] = 2746;
			this.anIntArrayArray60[15][1] = 2377;
			this.anIntArrayArray60[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray60 = new int[4][4];
			this.anIntArrayArray60[0][0] = 2048;
			this.anIntArrayArray60[0][1] = 0;
			this.anIntArrayArray60[0][3] = 0;
			this.anIntArrayArray60[0][2] = 4096;
			this.anIntArrayArray60[1][3] = 0;
			this.anIntArrayArray60[1][0] = 2867;
			this.anIntArrayArray60[1][2] = 4096;
			this.anIntArrayArray60[1][1] = 4096;
			this.anIntArrayArray60[2][0] = 3276;
			this.anIntArrayArray60[2][1] = 4096;
			this.anIntArrayArray60[2][2] = 4096;
			this.anIntArrayArray60[2][3] = 0;
			this.anIntArrayArray60[3][2] = 0;
			this.anIntArrayArray60[3][0] = 4096;
			this.anIntArrayArray60[3][3] = 0;
			this.anIntArrayArray60[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(10) int local10 = arg1.method4463();
		if (local10 != 0) {
			this.method1902(local10);
			return;
		}
		this.anIntArrayArray60 = new int[arg1.method4463()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray60.length; local21++) {
			this.anIntArrayArray60[local21][0] = arg1.method4485();
			this.anIntArrayArray60[local21][1] = arg1.method4463() << 4;
			this.anIntArrayArray60[local21][2] = arg1.method4463() << 4;
			this.anIntArrayArray60[local21][3] = arg1.method4463() << 4;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(30) int[] local30 = this.method5620(arg0, 0);
			@Pc(34) int[] local34 = local16[0];
			@Pc(38) int[] local38 = local16[1];
			@Pc(42) int[] local42 = local16[2];
			for (@Pc(44) int local44 = 0; local44 < Static434.anInt4326; local44++) {
				@Pc(52) int local52 = local30[local44] >> 4;
				if (local52 < 0) {
					local52 = 0;
				}
				if (local52 > 256) {
					local52 = 256;
				}
				local52 = this.anIntArray116[local52];
				local34[local44] = local52 >> 12 & 0xFF0;
				local38[local44] = local52 >> 4 & 0xFF0;
				local42[local44] = (local52 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
	private void method1905() {
		@Pc(17) int local17 = this.anIntArrayArray60.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = local24 << 4;
			for (@Pc(34) int local34 = 0; local17 > local34 && this.anIntArrayArray60[local34][0] <= local32; local34++) {
				local28++;
			}
			@Pc(107) int local107;
			@Pc(121) int local121;
			@Pc(136) int local136;
			@Pc(61) int[] local61;
			if (local28 < local17) {
				local61 = this.anIntArrayArray60[local28];
				if (local28 > 0) {
					@Pc(70) int[] local70 = this.anIntArrayArray60[local28 - 1];
					@Pc(88) int local88 = (local32 - local70[0] << 12) / (local61[0] - local70[0]);
					@Pc(93) int local93 = 4096 - local88;
					local107 = local70[1] * local93 + local61[1] * local88 >> 12;
					local121 = local70[2] * local93 + local88 * local61[2] >> 12;
					local136 = local88 * local61[3] + local93 * local70[3] >> 12;
				} else {
					local107 = local61[1];
					local136 = local61[3];
					local121 = local61[2];
				}
			} else {
				local61 = this.anIntArrayArray60[local17 - 1];
				local121 = local61[2];
				local107 = local61[1];
				local136 = local61[3];
			}
			local107 >>= 0x4;
			local121 >>= 0x4;
			local136 >>= 0x4;
			if (local121 < 0) {
				local121 = 0;
			} else if (local121 > 255) {
				local121 = 255;
			}
			if (local136 < 0) {
				local136 = 0;
			} else if (local136 > 255) {
				local136 = 255;
			}
			if (local107 < 0) {
				local107 = 0;
			} else if (local107 > 255) {
				local107 = 255;
			}
			this.anIntArray116[local24] = local136 | local121 << 8 | local107 << 16;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
		if (this.anIntArrayArray60 == null) {
			this.method1902(1);
		}
		this.method1905();
	}
}
