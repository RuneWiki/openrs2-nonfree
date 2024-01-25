import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class3_Sub2_Sub13 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jk", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!jk", name = "J", descriptor = "[I")
	private final int[] anIntArray239 = new int[257];

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
		if (this.anIntArrayArray25 == null) {
			this.method3057(1);
		}
		this.method3058();
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(26) int[] local26 = this.method5894(0, arg0);
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local11[2];
			for (@Pc(40) int local40 = 0; local40 < Static406.anInt6694; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray239[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(II)V")
	private void method3057(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray25 = new int[2][4];
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[0][3] = 0;
			this.anIntArrayArray25[0][2] = 0;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[1][1] = 4096;
			this.anIntArrayArray25[1][2] = 4096;
			this.anIntArrayArray25[1][3] = 4096;
			this.anIntArrayArray25[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray25 = new int[8][4];
			this.anIntArrayArray25[0][3] = 2361;
			this.anIntArrayArray25[0][2] = 2602;
			this.anIntArrayArray25[0][1] = 2650;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[1][2] = 1799;
			this.anIntArrayArray25[1][0] = 2867;
			this.anIntArrayArray25[1][3] = 1558;
			this.anIntArrayArray25[1][1] = 2313;
			this.anIntArrayArray25[2][1] = 2618;
			this.anIntArrayArray25[2][0] = 3072;
			this.anIntArrayArray25[2][3] = 1413;
			this.anIntArrayArray25[2][2] = 1734;
			this.anIntArrayArray25[3][0] = 3276;
			this.anIntArrayArray25[3][3] = 947;
			this.anIntArrayArray25[3][1] = 2296;
			this.anIntArrayArray25[3][2] = 1220;
			this.anIntArrayArray25[4][1] = 2072;
			this.anIntArrayArray25[4][3] = 722;
			this.anIntArrayArray25[4][0] = 3481;
			this.anIntArrayArray25[4][2] = 963;
			this.anIntArrayArray25[5][2] = 2152;
			this.anIntArrayArray25[5][1] = 2730;
			this.anIntArrayArray25[5][3] = 1766;
			this.anIntArrayArray25[5][0] = 3686;
			this.anIntArrayArray25[6][2] = 1060;
			this.anIntArrayArray25[6][1] = 2232;
			this.anIntArrayArray25[6][3] = 915;
			this.anIntArrayArray25[6][0] = 3891;
			this.anIntArrayArray25[7][1] = 1686;
			this.anIntArrayArray25[7][0] = 4096;
			this.anIntArrayArray25[7][2] = 1413;
			this.anIntArrayArray25[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray25 = new int[7][4];
			this.anIntArrayArray25[0][3] = 4096;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[0][2] = 0;
			this.anIntArrayArray25[1][2] = 4096;
			this.anIntArrayArray25[1][3] = 4096;
			this.anIntArrayArray25[1][1] = 0;
			this.anIntArrayArray25[1][0] = 663;
			this.anIntArrayArray25[2][3] = 0;
			this.anIntArrayArray25[2][2] = 4096;
			this.anIntArrayArray25[2][1] = 0;
			this.anIntArrayArray25[2][0] = 1363;
			this.anIntArrayArray25[3][0] = 2048;
			this.anIntArrayArray25[3][3] = 0;
			this.anIntArrayArray25[3][1] = 4096;
			this.anIntArrayArray25[3][2] = 4096;
			this.anIntArrayArray25[4][2] = 0;
			this.anIntArrayArray25[4][0] = 2727;
			this.anIntArrayArray25[4][3] = 0;
			this.anIntArrayArray25[4][1] = 4096;
			this.anIntArrayArray25[5][3] = 4096;
			this.anIntArrayArray25[5][1] = 4096;
			this.anIntArrayArray25[5][0] = 3411;
			this.anIntArrayArray25[5][2] = 0;
			this.anIntArrayArray25[6][0] = 4096;
			this.anIntArrayArray25[6][2] = 0;
			this.anIntArrayArray25[6][3] = 4096;
			this.anIntArrayArray25[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray25 = new int[6][4];
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[0][2] = 0;
			this.anIntArrayArray25[0][3] = 0;
			this.anIntArrayArray25[1][3] = 1493;
			this.anIntArrayArray25[1][0] = 1843;
			this.anIntArrayArray25[1][2] = 0;
			this.anIntArrayArray25[1][1] = 0;
			this.anIntArrayArray25[2][2] = 0;
			this.anIntArrayArray25[2][3] = 2939;
			this.anIntArrayArray25[2][1] = 0;
			this.anIntArrayArray25[2][0] = 2457;
			this.anIntArrayArray25[3][2] = 1124;
			this.anIntArrayArray25[3][3] = 3565;
			this.anIntArrayArray25[3][1] = 0;
			this.anIntArrayArray25[3][0] = 2781;
			this.anIntArrayArray25[4][1] = 546;
			this.anIntArrayArray25[4][2] = 3084;
			this.anIntArrayArray25[4][3] = 4031;
			this.anIntArrayArray25[4][0] = 3481;
			this.anIntArrayArray25[5][1] = 4096;
			this.anIntArrayArray25[5][2] = 4096;
			this.anIntArrayArray25[5][3] = 4096;
			this.anIntArrayArray25[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray25 = new int[16][4];
			this.anIntArrayArray25[0][3] = 321;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[0][2] = 192;
			this.anIntArrayArray25[0][1] = 80;
			this.anIntArrayArray25[1][2] = 449;
			this.anIntArrayArray25[1][1] = 321;
			this.anIntArrayArray25[1][3] = 562;
			this.anIntArrayArray25[1][0] = 155;
			this.anIntArrayArray25[2][3] = 803;
			this.anIntArrayArray25[2][1] = 578;
			this.anIntArrayArray25[2][0] = 389;
			this.anIntArrayArray25[2][2] = 690;
			this.anIntArrayArray25[3][1] = 947;
			this.anIntArrayArray25[3][2] = 995;
			this.anIntArrayArray25[3][0] = 671;
			this.anIntArrayArray25[3][3] = 1140;
			this.anIntArrayArray25[4][3] = 1509;
			this.anIntArrayArray25[4][0] = 897;
			this.anIntArrayArray25[4][1] = 1285;
			this.anIntArrayArray25[4][2] = 1397;
			this.anIntArrayArray25[5][3] = 1413;
			this.anIntArrayArray25[5][1] = 1525;
			this.anIntArrayArray25[5][2] = 1429;
			this.anIntArrayArray25[5][0] = 1175;
			this.anIntArrayArray25[6][1] = 1734;
			this.anIntArrayArray25[6][2] = 1461;
			this.anIntArrayArray25[6][3] = 1333;
			this.anIntArrayArray25[6][0] = 1368;
			this.anIntArrayArray25[7][1] = 1413;
			this.anIntArrayArray25[7][3] = 1702;
			this.anIntArrayArray25[7][0] = 1507;
			this.anIntArrayArray25[7][2] = 1525;
			this.anIntArrayArray25[8][2] = 1590;
			this.anIntArrayArray25[8][1] = 1108;
			this.anIntArrayArray25[8][3] = 2056;
			this.anIntArrayArray25[8][0] = 1736;
			this.anIntArrayArray25[9][1] = 1766;
			this.anIntArrayArray25[9][0] = 2088;
			this.anIntArrayArray25[9][3] = 2666;
			this.anIntArrayArray25[9][2] = 2056;
			this.anIntArrayArray25[10][3] = 3276;
			this.anIntArrayArray25[10][0] = 2355;
			this.anIntArrayArray25[10][1] = 2409;
			this.anIntArrayArray25[10][2] = 2586;
			this.anIntArrayArray25[11][1] = 3116;
			this.anIntArrayArray25[11][3] = 3228;
			this.anIntArrayArray25[11][0] = 2691;
			this.anIntArrayArray25[11][2] = 3148;
			this.anIntArrayArray25[12][1] = 3806;
			this.anIntArrayArray25[12][2] = 3710;
			this.anIntArrayArray25[12][0] = 3031;
			this.anIntArrayArray25[12][3] = 3196;
			this.anIntArrayArray25[13][3] = 3019;
			this.anIntArrayArray25[13][1] = 3437;
			this.anIntArrayArray25[13][2] = 3421;
			this.anIntArrayArray25[13][0] = 3522;
			this.anIntArrayArray25[14][3] = 3228;
			this.anIntArrayArray25[14][2] = 3148;
			this.anIntArrayArray25[14][1] = 3116;
			this.anIntArrayArray25[14][0] = 3727;
			this.anIntArrayArray25[15][0] = 4096;
			this.anIntArrayArray25[15][1] = 2377;
			this.anIntArrayArray25[15][3] = 2746;
			this.anIntArrayArray25[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray25 = new int[4][4];
			this.anIntArrayArray25[0][2] = 4096;
			this.anIntArrayArray25[0][3] = 0;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[0][0] = 2048;
			this.anIntArrayArray25[1][1] = 4096;
			this.anIntArrayArray25[1][2] = 4096;
			this.anIntArrayArray25[1][3] = 0;
			this.anIntArrayArray25[1][0] = 2867;
			this.anIntArrayArray25[2][1] = 4096;
			this.anIntArrayArray25[2][0] = 3276;
			this.anIntArrayArray25[2][2] = 4096;
			this.anIntArrayArray25[2][3] = 0;
			this.anIntArrayArray25[3][0] = 4096;
			this.anIntArrayArray25[3][3] = 0;
			this.anIntArrayArray25[3][1] = 4096;
			this.anIntArrayArray25[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(B)V")
	private void method3058() {
		@Pc(17) int local17 = this.anIntArrayArray25.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = local24 << 4;
			for (@Pc(34) int local34 = 0; local34 < local17 && local32 >= this.anIntArrayArray25[local34][0]; local34++) {
				local28++;
			}
			@Pc(71) int local71;
			@Pc(67) int local67;
			@Pc(75) int local75;
			@Pc(63) int[] local63;
			if (local17 <= local28) {
				local63 = this.anIntArrayArray25[local17 - 1];
				local67 = local63[2];
				local71 = local63[1];
				local75 = local63[3];
			} else {
				local63 = this.anIntArrayArray25[local28];
				if (local28 > 0) {
					@Pc(91) int[] local91 = this.anIntArrayArray25[local28 - 1];
					@Pc(109) int local109 = (local32 - local91[0] << 12) / (local63[0] - local91[0]);
					@Pc(114) int local114 = 4096 - local109;
					local67 = local109 * local63[2] + local114 * local91[2] >> 12;
					local71 = local114 * local91[1] + local63[1] * local109 >> 12;
					local75 = local109 * local63[3] + local114 * local91[3] >> 12;
				} else {
					local67 = local63[2];
					local71 = local63[1];
					local75 = local63[3];
				}
			}
			local75 >>= 0x4;
			local71 >>= 0x4;
			local67 >>= 0x4;
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
			if (local67 < 0) {
				local67 = 0;
			} else if (local67 > 255) {
				local67 = 255;
			}
			this.anIntArray239[local24] = local75 | local67 << 8 | local71 << 16;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(10) int local10 = arg0.method2582();
		if (local10 != 0) {
			this.method3057(local10);
			return;
		}
		this.anIntArrayArray25 = new int[arg0.method2582()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray25.length; local21++) {
			this.anIntArrayArray25[local21][0] = arg0.method2588();
			this.anIntArrayArray25[local21][1] = arg0.method2582() << 4;
			this.anIntArrayArray25[local21][2] = arg0.method2582() << 4;
			this.anIntArrayArray25[local21][3] = arg0.method2582() << 4;
		}
	}
}
