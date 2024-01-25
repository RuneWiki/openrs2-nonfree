import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class5_Sub2_Sub7 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ct", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!ct", name = "N", descriptor = "[I")
	private final int[] anIntArray76 = new int[257];

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(22) int local22 = arg0.method7816();
		if (local22 != 0) {
			this.method1903(local22);
			return;
		}
		this.anIntArrayArray6 = new int[arg0.method7816()][4];
		for (@Pc(41) int local41 = 0; local41 < this.anIntArrayArray6.length; local41++) {
			this.anIntArrayArray6[local41][0] = arg0.method7860();
			this.anIntArrayArray6[local41][1] = arg0.method7816() << 4;
			this.anIntArrayArray6[local41][2] = arg0.method7816() << 4;
			this.anIntArrayArray6[local41][3] = arg0.method7816() << 4;
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)V")
	@Override
	public void method8951() {
		if (this.anIntArrayArray6 == null) {
			this.method1903(1);
		}
		this.method1902();
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "(B)V")
	private void method1902() {
		@Pc(9) int local9 = this.anIntArrayArray6.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local30 < local9 && this.anIntArrayArray6[local30][0] <= local28; local30++) {
				local24++;
			}
			@Pc(67) int local67;
			@Pc(63) int local63;
			@Pc(71) int local71;
			@Pc(59) int[] local59;
			if (local9 <= local24) {
				local59 = this.anIntArrayArray6[local9 - 1];
				local63 = local59[2];
				local67 = local59[1];
				local71 = local59[3];
			} else {
				local59 = this.anIntArrayArray6[local24];
				if (local24 <= 0) {
					local67 = local59[1];
					local63 = local59[2];
					local71 = local59[3];
				} else {
					@Pc(104) int[] local104 = this.anIntArrayArray6[local24 - 1];
					@Pc(122) int local122 = (local28 - local104[0] << 12) / (local59[0] - local104[0]);
					@Pc(126) int local126 = 4096 - local122;
					local71 = local122 * local59[3] + local126 * local104[3] >> 12;
					local63 = local104[2] * local126 + local59[2] * local122 >> 12;
					local67 = local59[1] * local122 + local126 * local104[1] >> 12;
				}
			}
			local67 >>= 0x4;
			local63 >>= 0x4;
			local71 >>= 0x4;
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
			if (local63 < 0) {
				local63 = 0;
			} else if (local63 > 255) {
				local63 = 255;
			}
			this.anIntArray76[local20] = local71 | local67 << 16 | local63 << 8;
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(23) int[] local23 = this.method8945(arg0, 0);
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static195.anInt3759; local37++) {
				@Pc(45) int local45 = local23[local37] >> 4;
				if (local45 < 0) {
					local45 = 0;
				}
				if (local45 > 256) {
					local45 = 256;
				}
				local45 = this.anIntArray76[local45];
				local27[local37] = local45 >> 12 & 0xFF0;
				local31[local37] = local45 >> 4 & 0xFF0;
				local35[local37] = (local45 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(II)V")
	private void method1903(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray6 = new int[2][4];
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[1][1] = 4096;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[1][3] = 4096;
			this.anIntArrayArray6[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray6 = new int[8][4];
			this.anIntArrayArray6[0][2] = 2602;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][3] = 2361;
			this.anIntArrayArray6[0][1] = 2650;
			this.anIntArrayArray6[1][0] = 2867;
			this.anIntArrayArray6[1][3] = 1558;
			this.anIntArrayArray6[1][1] = 2313;
			this.anIntArrayArray6[1][2] = 1799;
			this.anIntArrayArray6[2][0] = 3072;
			this.anIntArrayArray6[2][1] = 2618;
			this.anIntArrayArray6[2][3] = 1413;
			this.anIntArrayArray6[2][2] = 1734;
			this.anIntArrayArray6[3][3] = 947;
			this.anIntArrayArray6[3][1] = 2296;
			this.anIntArrayArray6[3][0] = 3276;
			this.anIntArrayArray6[3][2] = 1220;
			this.anIntArrayArray6[4][2] = 963;
			this.anIntArrayArray6[4][3] = 722;
			this.anIntArrayArray6[4][1] = 2072;
			this.anIntArrayArray6[4][0] = 3481;
			this.anIntArrayArray6[5][0] = 3686;
			this.anIntArrayArray6[5][1] = 2730;
			this.anIntArrayArray6[5][2] = 2152;
			this.anIntArrayArray6[5][3] = 1766;
			this.anIntArrayArray6[6][3] = 915;
			this.anIntArrayArray6[6][0] = 3891;
			this.anIntArrayArray6[6][2] = 1060;
			this.anIntArrayArray6[6][1] = 2232;
			this.anIntArrayArray6[7][2] = 1413;
			this.anIntArrayArray6[7][0] = 4096;
			this.anIntArrayArray6[7][3] = 1140;
			this.anIntArrayArray6[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray6 = new int[7][4];
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[0][3] = 4096;
			this.anIntArrayArray6[1][1] = 0;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[1][0] = 663;
			this.anIntArrayArray6[1][3] = 4096;
			this.anIntArrayArray6[2][1] = 0;
			this.anIntArrayArray6[2][2] = 4096;
			this.anIntArrayArray6[2][3] = 0;
			this.anIntArrayArray6[2][0] = 1363;
			this.anIntArrayArray6[3][2] = 4096;
			this.anIntArrayArray6[3][0] = 2048;
			this.anIntArrayArray6[3][3] = 0;
			this.anIntArrayArray6[3][1] = 4096;
			this.anIntArrayArray6[4][2] = 0;
			this.anIntArrayArray6[4][0] = 2727;
			this.anIntArrayArray6[4][3] = 0;
			this.anIntArrayArray6[4][1] = 4096;
			this.anIntArrayArray6[5][1] = 4096;
			this.anIntArrayArray6[5][0] = 3411;
			this.anIntArrayArray6[5][3] = 4096;
			this.anIntArrayArray6[5][2] = 0;
			this.anIntArrayArray6[6][1] = 0;
			this.anIntArrayArray6[6][2] = 0;
			this.anIntArrayArray6[6][3] = 4096;
			this.anIntArrayArray6[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray6 = new int[6][4];
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[1][3] = 1493;
			this.anIntArrayArray6[1][1] = 0;
			this.anIntArrayArray6[1][2] = 0;
			this.anIntArrayArray6[1][0] = 1843;
			this.anIntArrayArray6[2][3] = 2939;
			this.anIntArrayArray6[2][2] = 0;
			this.anIntArrayArray6[2][1] = 0;
			this.anIntArrayArray6[2][0] = 2457;
			this.anIntArrayArray6[3][0] = 2781;
			this.anIntArrayArray6[3][1] = 0;
			this.anIntArrayArray6[3][3] = 3565;
			this.anIntArrayArray6[3][2] = 1124;
			this.anIntArrayArray6[4][2] = 3084;
			this.anIntArrayArray6[4][1] = 546;
			this.anIntArrayArray6[4][0] = 3481;
			this.anIntArrayArray6[4][3] = 4031;
			this.anIntArrayArray6[5][3] = 4096;
			this.anIntArrayArray6[5][2] = 4096;
			this.anIntArrayArray6[5][0] = 4096;
			this.anIntArrayArray6[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray6 = new int[16][4];
			this.anIntArrayArray6[0][1] = 80;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][2] = 192;
			this.anIntArrayArray6[0][3] = 321;
			this.anIntArrayArray6[1][0] = 155;
			this.anIntArrayArray6[1][3] = 562;
			this.anIntArrayArray6[1][1] = 321;
			this.anIntArrayArray6[1][2] = 449;
			this.anIntArrayArray6[2][3] = 803;
			this.anIntArrayArray6[2][1] = 578;
			this.anIntArrayArray6[2][0] = 389;
			this.anIntArrayArray6[2][2] = 690;
			this.anIntArrayArray6[3][3] = 1140;
			this.anIntArrayArray6[3][1] = 947;
			this.anIntArrayArray6[3][0] = 671;
			this.anIntArrayArray6[3][2] = 995;
			this.anIntArrayArray6[4][3] = 1509;
			this.anIntArrayArray6[4][0] = 897;
			this.anIntArrayArray6[4][1] = 1285;
			this.anIntArrayArray6[4][2] = 1397;
			this.anIntArrayArray6[5][2] = 1429;
			this.anIntArrayArray6[5][3] = 1413;
			this.anIntArrayArray6[5][1] = 1525;
			this.anIntArrayArray6[5][0] = 1175;
			this.anIntArrayArray6[6][3] = 1333;
			this.anIntArrayArray6[6][2] = 1461;
			this.anIntArrayArray6[6][1] = 1734;
			this.anIntArrayArray6[6][0] = 1368;
			this.anIntArrayArray6[7][1] = 1413;
			this.anIntArrayArray6[7][0] = 1507;
			this.anIntArrayArray6[7][3] = 1702;
			this.anIntArrayArray6[7][2] = 1525;
			this.anIntArrayArray6[8][3] = 2056;
			this.anIntArrayArray6[8][0] = 1736;
			this.anIntArrayArray6[8][1] = 1108;
			this.anIntArrayArray6[8][2] = 1590;
			this.anIntArrayArray6[9][3] = 2666;
			this.anIntArrayArray6[9][0] = 2088;
			this.anIntArrayArray6[9][1] = 1766;
			this.anIntArrayArray6[9][2] = 2056;
			this.anIntArrayArray6[10][1] = 2409;
			this.anIntArrayArray6[10][3] = 3276;
			this.anIntArrayArray6[10][2] = 2586;
			this.anIntArrayArray6[10][0] = 2355;
			this.anIntArrayArray6[11][0] = 2691;
			this.anIntArrayArray6[11][3] = 3228;
			this.anIntArrayArray6[11][2] = 3148;
			this.anIntArrayArray6[11][1] = 3116;
			this.anIntArrayArray6[12][0] = 3031;
			this.anIntArrayArray6[12][2] = 3710;
			this.anIntArrayArray6[12][1] = 3806;
			this.anIntArrayArray6[12][3] = 3196;
			this.anIntArrayArray6[13][1] = 3437;
			this.anIntArrayArray6[13][2] = 3421;
			this.anIntArrayArray6[13][3] = 3019;
			this.anIntArrayArray6[13][0] = 3522;
			this.anIntArrayArray6[14][2] = 3148;
			this.anIntArrayArray6[14][3] = 3228;
			this.anIntArrayArray6[14][0] = 3727;
			this.anIntArrayArray6[14][1] = 3116;
			this.anIntArrayArray6[15][3] = 2746;
			this.anIntArrayArray6[15][2] = 2505;
			this.anIntArrayArray6[15][0] = 4096;
			this.anIntArrayArray6[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray6 = new int[4][4];
			this.anIntArrayArray6[0][2] = 4096;
			this.anIntArrayArray6[0][0] = 2048;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[1][0] = 2867;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[1][3] = 0;
			this.anIntArrayArray6[1][1] = 4096;
			this.anIntArrayArray6[2][3] = 0;
			this.anIntArrayArray6[2][0] = 3276;
			this.anIntArrayArray6[2][1] = 4096;
			this.anIntArrayArray6[2][2] = 4096;
			this.anIntArrayArray6[3][2] = 0;
			this.anIntArrayArray6[3][3] = 0;
			this.anIntArrayArray6[3][0] = 4096;
			this.anIntArrayArray6[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
