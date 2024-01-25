import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class2_Sub4_Sub35 extends Class2_Sub4 {

	@OriginalMember(owner = "client!uv", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!uv", name = "E", descriptor = "[I")
	private final int[] anIntArray587 = new int[257];

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(27) int[] local27 = this.method7568(arg0, 0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static143.anInt7434; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray587[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(17) int local17 = arg1.method4464();
		if (local17 != 0) {
			this.method7165(local17);
			return;
		}
		this.anIntArrayArray60 = new int[arg1.method4464()][4];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray60.length; local28++) {
			this.anIntArrayArray60[local28][0] = arg1.method4518();
			this.anIntArrayArray60[local28][1] = arg1.method4464() << 4;
			this.anIntArrayArray60[local28][2] = arg1.method4464() << 4;
			this.anIntArrayArray60[local28][3] = arg1.method4464() << 4;
		}
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(II)V")
	private void method7165(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray60 = new int[2][4];
			this.anIntArrayArray60[0][3] = 0;
			this.anIntArrayArray60[0][2] = 0;
			this.anIntArrayArray60[0][1] = 0;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[1][0] = 4096;
			this.anIntArrayArray60[1][3] = 4096;
			this.anIntArrayArray60[1][1] = 4096;
			this.anIntArrayArray60[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray60 = new int[8][4];
			this.anIntArrayArray60[0][1] = 2650;
			this.anIntArrayArray60[0][3] = 2361;
			this.anIntArrayArray60[0][2] = 2602;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[1][0] = 2867;
			this.anIntArrayArray60[1][1] = 2313;
			this.anIntArrayArray60[1][3] = 1558;
			this.anIntArrayArray60[1][2] = 1799;
			this.anIntArrayArray60[2][1] = 2618;
			this.anIntArrayArray60[2][0] = 3072;
			this.anIntArrayArray60[2][2] = 1734;
			this.anIntArrayArray60[2][3] = 1413;
			this.anIntArrayArray60[3][0] = 3276;
			this.anIntArrayArray60[3][1] = 2296;
			this.anIntArrayArray60[3][2] = 1220;
			this.anIntArrayArray60[3][3] = 947;
			this.anIntArrayArray60[4][0] = 3481;
			this.anIntArrayArray60[4][2] = 963;
			this.anIntArrayArray60[4][1] = 2072;
			this.anIntArrayArray60[4][3] = 722;
			this.anIntArrayArray60[5][1] = 2730;
			this.anIntArrayArray60[5][3] = 1766;
			this.anIntArrayArray60[5][2] = 2152;
			this.anIntArrayArray60[5][0] = 3686;
			this.anIntArrayArray60[6][3] = 915;
			this.anIntArrayArray60[6][2] = 1060;
			this.anIntArrayArray60[6][0] = 3891;
			this.anIntArrayArray60[6][1] = 2232;
			this.anIntArrayArray60[7][3] = 1140;
			this.anIntArrayArray60[7][0] = 4096;
			this.anIntArrayArray60[7][1] = 1686;
			this.anIntArrayArray60[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray60 = new int[7][4];
			this.anIntArrayArray60[0][3] = 4096;
			this.anIntArrayArray60[0][1] = 0;
			this.anIntArrayArray60[0][2] = 0;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[1][0] = 663;
			this.anIntArrayArray60[1][1] = 0;
			this.anIntArrayArray60[1][3] = 4096;
			this.anIntArrayArray60[1][2] = 4096;
			this.anIntArrayArray60[2][2] = 4096;
			this.anIntArrayArray60[2][1] = 0;
			this.anIntArrayArray60[2][0] = 1363;
			this.anIntArrayArray60[2][3] = 0;
			this.anIntArrayArray60[3][3] = 0;
			this.anIntArrayArray60[3][1] = 4096;
			this.anIntArrayArray60[3][2] = 4096;
			this.anIntArrayArray60[3][0] = 2048;
			this.anIntArrayArray60[4][1] = 4096;
			this.anIntArrayArray60[4][0] = 2727;
			this.anIntArrayArray60[4][2] = 0;
			this.anIntArrayArray60[4][3] = 0;
			this.anIntArrayArray60[5][1] = 4096;
			this.anIntArrayArray60[5][3] = 4096;
			this.anIntArrayArray60[5][0] = 3411;
			this.anIntArrayArray60[5][2] = 0;
			this.anIntArrayArray60[6][2] = 0;
			this.anIntArrayArray60[6][0] = 4096;
			this.anIntArrayArray60[6][3] = 4096;
			this.anIntArrayArray60[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray60 = new int[6][4];
			this.anIntArrayArray60[0][3] = 0;
			this.anIntArrayArray60[0][2] = 0;
			this.anIntArrayArray60[0][1] = 0;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[1][3] = 1493;
			this.anIntArrayArray60[1][1] = 0;
			this.anIntArrayArray60[1][0] = 1843;
			this.anIntArrayArray60[1][2] = 0;
			this.anIntArrayArray60[2][1] = 0;
			this.anIntArrayArray60[2][3] = 2939;
			this.anIntArrayArray60[2][0] = 2457;
			this.anIntArrayArray60[2][2] = 0;
			this.anIntArrayArray60[3][0] = 2781;
			this.anIntArrayArray60[3][3] = 3565;
			this.anIntArrayArray60[3][1] = 0;
			this.anIntArrayArray60[3][2] = 1124;
			this.anIntArrayArray60[4][1] = 546;
			this.anIntArrayArray60[4][3] = 4031;
			this.anIntArrayArray60[4][2] = 3084;
			this.anIntArrayArray60[4][0] = 3481;
			this.anIntArrayArray60[5][1] = 4096;
			this.anIntArrayArray60[5][0] = 4096;
			this.anIntArrayArray60[5][2] = 4096;
			this.anIntArrayArray60[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray60 = new int[16][4];
			this.anIntArrayArray60[0][3] = 321;
			this.anIntArrayArray60[0][0] = 0;
			this.anIntArrayArray60[0][1] = 80;
			this.anIntArrayArray60[0][2] = 192;
			this.anIntArrayArray60[1][1] = 321;
			this.anIntArrayArray60[1][2] = 449;
			this.anIntArrayArray60[1][3] = 562;
			this.anIntArrayArray60[1][0] = 155;
			this.anIntArrayArray60[2][3] = 803;
			this.anIntArrayArray60[2][1] = 578;
			this.anIntArrayArray60[2][2] = 690;
			this.anIntArrayArray60[2][0] = 389;
			this.anIntArrayArray60[3][0] = 671;
			this.anIntArrayArray60[3][1] = 947;
			this.anIntArrayArray60[3][2] = 995;
			this.anIntArrayArray60[3][3] = 1140;
			this.anIntArrayArray60[4][1] = 1285;
			this.anIntArrayArray60[4][3] = 1509;
			this.anIntArrayArray60[4][0] = 897;
			this.anIntArrayArray60[4][2] = 1397;
			this.anIntArrayArray60[5][1] = 1525;
			this.anIntArrayArray60[5][2] = 1429;
			this.anIntArrayArray60[5][3] = 1413;
			this.anIntArrayArray60[5][0] = 1175;
			this.anIntArrayArray60[6][1] = 1734;
			this.anIntArrayArray60[6][2] = 1461;
			this.anIntArrayArray60[6][0] = 1368;
			this.anIntArrayArray60[6][3] = 1333;
			this.anIntArrayArray60[7][0] = 1507;
			this.anIntArrayArray60[7][1] = 1413;
			this.anIntArrayArray60[7][3] = 1702;
			this.anIntArrayArray60[7][2] = 1525;
			this.anIntArrayArray60[8][1] = 1108;
			this.anIntArrayArray60[8][3] = 2056;
			this.anIntArrayArray60[8][2] = 1590;
			this.anIntArrayArray60[8][0] = 1736;
			this.anIntArrayArray60[9][2] = 2056;
			this.anIntArrayArray60[9][0] = 2088;
			this.anIntArrayArray60[9][1] = 1766;
			this.anIntArrayArray60[9][3] = 2666;
			this.anIntArrayArray60[10][0] = 2355;
			this.anIntArrayArray60[10][3] = 3276;
			this.anIntArrayArray60[10][2] = 2586;
			this.anIntArrayArray60[10][1] = 2409;
			this.anIntArrayArray60[11][2] = 3148;
			this.anIntArrayArray60[11][3] = 3228;
			this.anIntArrayArray60[11][0] = 2691;
			this.anIntArrayArray60[11][1] = 3116;
			this.anIntArrayArray60[12][3] = 3196;
			this.anIntArrayArray60[12][0] = 3031;
			this.anIntArrayArray60[12][1] = 3806;
			this.anIntArrayArray60[12][2] = 3710;
			this.anIntArrayArray60[13][0] = 3522;
			this.anIntArrayArray60[13][1] = 3437;
			this.anIntArrayArray60[13][2] = 3421;
			this.anIntArrayArray60[13][3] = 3019;
			this.anIntArrayArray60[14][3] = 3228;
			this.anIntArrayArray60[14][1] = 3116;
			this.anIntArrayArray60[14][0] = 3727;
			this.anIntArrayArray60[14][2] = 3148;
			this.anIntArrayArray60[15][1] = 2377;
			this.anIntArrayArray60[15][0] = 4096;
			this.anIntArrayArray60[15][2] = 2505;
			this.anIntArrayArray60[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray60 = new int[4][4];
			this.anIntArrayArray60[0][0] = 2048;
			this.anIntArrayArray60[0][1] = 0;
			this.anIntArrayArray60[0][3] = 0;
			this.anIntArrayArray60[0][2] = 4096;
			this.anIntArrayArray60[1][0] = 2867;
			this.anIntArrayArray60[1][1] = 4096;
			this.anIntArrayArray60[1][2] = 4096;
			this.anIntArrayArray60[1][3] = 0;
			this.anIntArrayArray60[2][3] = 0;
			this.anIntArrayArray60[2][2] = 4096;
			this.anIntArrayArray60[2][0] = 3276;
			this.anIntArrayArray60[2][1] = 4096;
			this.anIntArrayArray60[3][3] = 0;
			this.anIntArrayArray60[3][1] = 4096;
			this.anIntArrayArray60[3][2] = 0;
			this.anIntArrayArray60[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
	private void method7166() {
		@Pc(17) int local17 = this.anIntArrayArray60.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = local24 << 4;
			for (@Pc(34) int local34 = 0; local34 < local17 && this.anIntArrayArray60[local34][0] <= local32; local34++) {
				local28++;
			}
			@Pc(75) int local75;
			@Pc(79) int local79;
			@Pc(71) int local71;
			@Pc(67) int[] local67;
			if (local28 >= local17) {
				local67 = this.anIntArrayArray60[local17 - 1];
				local71 = local67[3];
				local75 = local67[1];
				local79 = local67[2];
			} else {
				local67 = this.anIntArrayArray60[local28];
				if (local28 <= 0) {
					local71 = local67[3];
					local79 = local67[2];
					local75 = local67[1];
				} else {
					@Pc(112) int[] local112 = this.anIntArrayArray60[local28 - 1];
					@Pc(130) int local130 = (local32 - local112[0] << 12) / (local67[0] - local112[0]);
					@Pc(135) int local135 = 4096 - local130;
					local71 = local135 * local112[3] + local130 * local67[3] >> 12;
					local79 = local130 * local67[2] + local112[2] * local135 >> 12;
					local75 = local112[1] * local135 + local67[1] * local130 >> 12;
				}
			}
			local71 >>= 0x4;
			local79 >>= 0x4;
			local75 >>= 0x4;
			if (local71 < 0) {
				local71 = 0;
			} else if (local71 > 255) {
				local71 = 255;
			}
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
			this.anIntArray587[local24] = local75 << 16 | local79 << 8 | local71;
		}
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
		if (this.anIntArrayArray60 == null) {
			this.method7165(1);
		}
		this.method7166();
	}
}
