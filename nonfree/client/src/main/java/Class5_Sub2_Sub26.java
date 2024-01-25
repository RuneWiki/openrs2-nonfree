import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class5_Sub2_Sub26 extends Class5_Sub2 {

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "[I")
	private final int[] anIntArray620 = new int[257];

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(29) int[] local29 = this.method8821(arg0, 0);
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[2];
			for (@Pc(43) int local43 = 0; local43 < Static314.anInt6320; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray620[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
		if (this.anIntArrayArray43 == null) {
			this.method6843(1);
		}
		this.method6844();
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(BI)V")
	private void method6843(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray43 = new int[2][4];
			this.anIntArrayArray43[0][3] = 0;
			this.anIntArrayArray43[0][0] = 0;
			this.anIntArrayArray43[0][1] = 0;
			this.anIntArrayArray43[0][2] = 0;
			this.anIntArrayArray43[1][3] = 4096;
			this.anIntArrayArray43[1][2] = 4096;
			this.anIntArrayArray43[1][0] = 4096;
			this.anIntArrayArray43[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray43 = new int[8][4];
			this.anIntArrayArray43[0][1] = 2650;
			this.anIntArrayArray43[0][0] = 0;
			this.anIntArrayArray43[0][2] = 2602;
			this.anIntArrayArray43[0][3] = 2361;
			this.anIntArrayArray43[1][2] = 1799;
			this.anIntArrayArray43[1][3] = 1558;
			this.anIntArrayArray43[1][0] = 2867;
			this.anIntArrayArray43[1][1] = 2313;
			this.anIntArrayArray43[2][3] = 1413;
			this.anIntArrayArray43[2][0] = 3072;
			this.anIntArrayArray43[2][1] = 2618;
			this.anIntArrayArray43[2][2] = 1734;
			this.anIntArrayArray43[3][0] = 3276;
			this.anIntArrayArray43[3][1] = 2296;
			this.anIntArrayArray43[3][3] = 947;
			this.anIntArrayArray43[3][2] = 1220;
			this.anIntArrayArray43[4][2] = 963;
			this.anIntArrayArray43[4][3] = 722;
			this.anIntArrayArray43[4][1] = 2072;
			this.anIntArrayArray43[4][0] = 3481;
			this.anIntArrayArray43[5][2] = 2152;
			this.anIntArrayArray43[5][0] = 3686;
			this.anIntArrayArray43[5][3] = 1766;
			this.anIntArrayArray43[5][1] = 2730;
			this.anIntArrayArray43[6][1] = 2232;
			this.anIntArrayArray43[6][2] = 1060;
			this.anIntArrayArray43[6][3] = 915;
			this.anIntArrayArray43[6][0] = 3891;
			this.anIntArrayArray43[7][3] = 1140;
			this.anIntArrayArray43[7][2] = 1413;
			this.anIntArrayArray43[7][0] = 4096;
			this.anIntArrayArray43[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray43 = new int[7][4];
			this.anIntArrayArray43[0][2] = 0;
			this.anIntArrayArray43[0][0] = 0;
			this.anIntArrayArray43[0][3] = 4096;
			this.anIntArrayArray43[0][1] = 0;
			this.anIntArrayArray43[1][0] = 663;
			this.anIntArrayArray43[1][1] = 0;
			this.anIntArrayArray43[1][2] = 4096;
			this.anIntArrayArray43[1][3] = 4096;
			this.anIntArrayArray43[2][0] = 1363;
			this.anIntArrayArray43[2][3] = 0;
			this.anIntArrayArray43[2][2] = 4096;
			this.anIntArrayArray43[2][1] = 0;
			this.anIntArrayArray43[3][0] = 2048;
			this.anIntArrayArray43[3][3] = 0;
			this.anIntArrayArray43[3][1] = 4096;
			this.anIntArrayArray43[3][2] = 4096;
			this.anIntArrayArray43[4][2] = 0;
			this.anIntArrayArray43[4][1] = 4096;
			this.anIntArrayArray43[4][3] = 0;
			this.anIntArrayArray43[4][0] = 2727;
			this.anIntArrayArray43[5][3] = 4096;
			this.anIntArrayArray43[5][0] = 3411;
			this.anIntArrayArray43[5][2] = 0;
			this.anIntArrayArray43[5][1] = 4096;
			this.anIntArrayArray43[6][0] = 4096;
			this.anIntArrayArray43[6][1] = 0;
			this.anIntArrayArray43[6][2] = 0;
			this.anIntArrayArray43[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray43 = new int[6][4];
			this.anIntArrayArray43[0][3] = 0;
			this.anIntArrayArray43[0][2] = 0;
			this.anIntArrayArray43[0][1] = 0;
			this.anIntArrayArray43[0][0] = 0;
			this.anIntArrayArray43[1][2] = 0;
			this.anIntArrayArray43[1][1] = 0;
			this.anIntArrayArray43[1][3] = 1493;
			this.anIntArrayArray43[1][0] = 1843;
			this.anIntArrayArray43[2][2] = 0;
			this.anIntArrayArray43[2][0] = 2457;
			this.anIntArrayArray43[2][3] = 2939;
			this.anIntArrayArray43[2][1] = 0;
			this.anIntArrayArray43[3][3] = 3565;
			this.anIntArrayArray43[3][0] = 2781;
			this.anIntArrayArray43[3][1] = 0;
			this.anIntArrayArray43[3][2] = 1124;
			this.anIntArrayArray43[4][3] = 4031;
			this.anIntArrayArray43[4][1] = 546;
			this.anIntArrayArray43[4][0] = 3481;
			this.anIntArrayArray43[4][2] = 3084;
			this.anIntArrayArray43[5][3] = 4096;
			this.anIntArrayArray43[5][1] = 4096;
			this.anIntArrayArray43[5][2] = 4096;
			this.anIntArrayArray43[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray43 = new int[16][4];
			this.anIntArrayArray43[0][2] = 192;
			this.anIntArrayArray43[0][3] = 321;
			this.anIntArrayArray43[0][0] = 0;
			this.anIntArrayArray43[0][1] = 80;
			this.anIntArrayArray43[1][3] = 562;
			this.anIntArrayArray43[1][1] = 321;
			this.anIntArrayArray43[1][2] = 449;
			this.anIntArrayArray43[1][0] = 155;
			this.anIntArrayArray43[2][1] = 578;
			this.anIntArrayArray43[2][3] = 803;
			this.anIntArrayArray43[2][2] = 690;
			this.anIntArrayArray43[2][0] = 389;
			this.anIntArrayArray43[3][2] = 995;
			this.anIntArrayArray43[3][3] = 1140;
			this.anIntArrayArray43[3][1] = 947;
			this.anIntArrayArray43[3][0] = 671;
			this.anIntArrayArray43[4][3] = 1509;
			this.anIntArrayArray43[4][0] = 897;
			this.anIntArrayArray43[4][2] = 1397;
			this.anIntArrayArray43[4][1] = 1285;
			this.anIntArrayArray43[5][2] = 1429;
			this.anIntArrayArray43[5][1] = 1525;
			this.anIntArrayArray43[5][3] = 1413;
			this.anIntArrayArray43[5][0] = 1175;
			this.anIntArrayArray43[6][3] = 1333;
			this.anIntArrayArray43[6][1] = 1734;
			this.anIntArrayArray43[6][2] = 1461;
			this.anIntArrayArray43[6][0] = 1368;
			this.anIntArrayArray43[7][2] = 1525;
			this.anIntArrayArray43[7][0] = 1507;
			this.anIntArrayArray43[7][1] = 1413;
			this.anIntArrayArray43[7][3] = 1702;
			this.anIntArrayArray43[8][2] = 1590;
			this.anIntArrayArray43[8][3] = 2056;
			this.anIntArrayArray43[8][0] = 1736;
			this.anIntArrayArray43[8][1] = 1108;
			this.anIntArrayArray43[9][3] = 2666;
			this.anIntArrayArray43[9][2] = 2056;
			this.anIntArrayArray43[9][1] = 1766;
			this.anIntArrayArray43[9][0] = 2088;
			this.anIntArrayArray43[10][1] = 2409;
			this.anIntArrayArray43[10][3] = 3276;
			this.anIntArrayArray43[10][2] = 2586;
			this.anIntArrayArray43[10][0] = 2355;
			this.anIntArrayArray43[11][3] = 3228;
			this.anIntArrayArray43[11][0] = 2691;
			this.anIntArrayArray43[11][1] = 3116;
			this.anIntArrayArray43[11][2] = 3148;
			this.anIntArrayArray43[12][3] = 3196;
			this.anIntArrayArray43[12][0] = 3031;
			this.anIntArrayArray43[12][2] = 3710;
			this.anIntArrayArray43[12][1] = 3806;
			this.anIntArrayArray43[13][1] = 3437;
			this.anIntArrayArray43[13][0] = 3522;
			this.anIntArrayArray43[13][3] = 3019;
			this.anIntArrayArray43[13][2] = 3421;
			this.anIntArrayArray43[14][0] = 3727;
			this.anIntArrayArray43[14][2] = 3148;
			this.anIntArrayArray43[14][3] = 3228;
			this.anIntArrayArray43[14][1] = 3116;
			this.anIntArrayArray43[15][2] = 2505;
			this.anIntArrayArray43[15][3] = 2746;
			this.anIntArrayArray43[15][1] = 2377;
			this.anIntArrayArray43[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray43 = new int[4][4];
			this.anIntArrayArray43[0][1] = 0;
			this.anIntArrayArray43[0][0] = 2048;
			this.anIntArrayArray43[0][3] = 0;
			this.anIntArrayArray43[0][2] = 4096;
			this.anIntArrayArray43[1][1] = 4096;
			this.anIntArrayArray43[1][3] = 0;
			this.anIntArrayArray43[1][0] = 2867;
			this.anIntArrayArray43[1][2] = 4096;
			this.anIntArrayArray43[2][1] = 4096;
			this.anIntArrayArray43[2][0] = 3276;
			this.anIntArrayArray43[2][2] = 4096;
			this.anIntArrayArray43[2][3] = 0;
			this.anIntArrayArray43[3][1] = 4096;
			this.anIntArrayArray43[3][3] = 0;
			this.anIntArrayArray43[3][2] = 0;
			this.anIntArrayArray43[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	private void method6844() {
		@Pc(17) int local17 = this.anIntArrayArray43.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = local24 << 4;
			for (@Pc(34) int local34 = 0; local17 > local34 && this.anIntArrayArray43[local34][0] <= local32; local34++) {
				local28++;
			}
			@Pc(75) int local75;
			@Pc(71) int local71;
			@Pc(67) int local67;
			@Pc(61) int[] local61;
			if (local28 < local17) {
				local61 = this.anIntArrayArray43[local28];
				if (local28 <= 0) {
					local67 = local61[3];
					local71 = local61[2];
					local75 = local61[1];
				} else {
					@Pc(84) int[] local84 = this.anIntArrayArray43[local28 - 1];
					@Pc(102) int local102 = (local32 - local84[0] << 12) / (local61[0] - local84[0]);
					@Pc(107) int local107 = 4096 - local102;
					local75 = local61[1] * local102 + local84[1] * local107 >> 12;
					local67 = local102 * local61[3] + local107 * local84[3] >> 12;
					local71 = local84[2] * local107 + local61[2] * local102 >> 12;
				}
			} else {
				local61 = this.anIntArrayArray43[local17 - 1];
				local71 = local61[2];
				local75 = local61[1];
				local67 = local61[3];
			}
			local67 >>= 0x4;
			local71 >>= 0x4;
			local75 >>= 0x4;
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
			this.anIntArray620[local24] = local67 | local75 << 16 | local71 << 8;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(15) int local15 = arg0.method8645();
		if (local15 != 0) {
			this.method6843(local15);
			return;
		}
		this.anIntArrayArray43 = new int[arg0.method8645()][4];
		for (@Pc(35) int local35 = 0; local35 < this.anIntArrayArray43.length; local35++) {
			this.anIntArrayArray43[local35][0] = arg0.method8631();
			this.anIntArrayArray43[local35][1] = arg0.method8645() << 4;
			this.anIntArrayArray43[local35][2] = arg0.method8645() << 4;
			this.anIntArrayArray43[local35][3] = arg0.method8645() << 4;
		}
	}
}
