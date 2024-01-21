import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class5_Sub1_Sub10 extends Class5_Sub1 {

	@OriginalMember(owner = "client!gj", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "[I")
	private final int[] anIntArray133 = new int[257];

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(23) int[] local23 = this.method3196(arg0, 0);
			@Pc(27) int[] local27 = local13[2];
			@Pc(31) int[] local31 = local13[0];
			@Pc(35) int[] local35 = local13[1];
			for (@Pc(37) int local37 = 0; local37 < Static174.anInt3489; local37++) {
				@Pc(45) int local45 = local23[local37] >> 4;
				if (local45 < 0) {
					local45 = 0;
				}
				if (local45 > 256) {
					local45 = 256;
				}
				local45 = this.anIntArray133[local45];
				local31[local37] = local45 >> 12 & 0xFF0;
				local35[local37] = local45 >> 4 & 0xFF0;
				local27[local37] = (local45 & 0xFF) << 4;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
		if (this.anIntArrayArray15 == null) {
			this.method1069(1);
		}
		this.method1071();
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V")
	private void method1069(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray15 = new int[2][4];
			this.anIntArrayArray15[0][0] = 0;
			this.anIntArrayArray15[0][3] = 0;
			this.anIntArrayArray15[0][1] = 0;
			this.anIntArrayArray15[1][1] = 4096;
			this.anIntArrayArray15[0][2] = 0;
			this.anIntArrayArray15[1][0] = 4096;
			this.anIntArrayArray15[1][3] = 4096;
			this.anIntArrayArray15[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray15 = new int[8][4];
			this.anIntArrayArray15[0][3] = 2361;
			this.anIntArrayArray15[0][1] = 2650;
			this.anIntArrayArray15[0][2] = 2602;
			this.anIntArrayArray15[1][3] = 1558;
			this.anIntArrayArray15[2][3] = 1413;
			this.anIntArrayArray15[1][1] = 2313;
			this.anIntArrayArray15[3][3] = 947;
			this.anIntArrayArray15[1][2] = 1799;
			this.anIntArrayArray15[0][0] = 0;
			this.anIntArrayArray15[4][3] = 722;
			this.anIntArrayArray15[2][2] = 1734;
			this.anIntArrayArray15[3][2] = 1220;
			this.anIntArrayArray15[5][3] = 1766;
			this.anIntArrayArray15[6][3] = 915;
			this.anIntArrayArray15[4][2] = 963;
			this.anIntArrayArray15[1][0] = 2867;
			this.anIntArrayArray15[2][1] = 2618;
			this.anIntArrayArray15[5][2] = 2152;
			this.anIntArrayArray15[3][1] = 2296;
			this.anIntArrayArray15[6][2] = 1060;
			this.anIntArrayArray15[7][3] = 1140;
			this.anIntArrayArray15[2][0] = 3072;
			this.anIntArrayArray15[3][0] = 3276;
			this.anIntArrayArray15[7][2] = 1413;
			this.anIntArrayArray15[4][1] = 2072;
			this.anIntArrayArray15[5][1] = 2730;
			this.anIntArrayArray15[4][0] = 3481;
			this.anIntArrayArray15[5][0] = 3686;
			this.anIntArrayArray15[6][0] = 3891;
			this.anIntArrayArray15[6][1] = 2232;
			this.anIntArrayArray15[7][0] = 4096;
			this.anIntArrayArray15[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray15 = new int[7][4];
			this.anIntArrayArray15[0][1] = 0;
			this.anIntArrayArray15[0][3] = 4096;
			this.anIntArrayArray15[1][3] = 4096;
			this.anIntArrayArray15[1][1] = 0;
			this.anIntArrayArray15[2][3] = 0;
			this.anIntArrayArray15[0][0] = 0;
			this.anIntArrayArray15[1][0] = 663;
			this.anIntArrayArray15[3][3] = 0;
			this.anIntArrayArray15[0][2] = 0;
			this.anIntArrayArray15[4][3] = 0;
			this.anIntArrayArray15[2][1] = 0;
			this.anIntArrayArray15[3][1] = 4096;
			this.anIntArrayArray15[5][3] = 4096;
			this.anIntArrayArray15[1][2] = 4096;
			this.anIntArrayArray15[2][0] = 1363;
			this.anIntArrayArray15[4][1] = 4096;
			this.anIntArrayArray15[2][2] = 4096;
			this.anIntArrayArray15[3][2] = 4096;
			this.anIntArrayArray15[5][1] = 4096;
			this.anIntArrayArray15[6][1] = 0;
			this.anIntArrayArray15[3][0] = 2048;
			this.anIntArrayArray15[4][0] = 2727;
			this.anIntArrayArray15[5][0] = 3411;
			this.anIntArrayArray15[6][3] = 4096;
			this.anIntArrayArray15[4][2] = 0;
			this.anIntArrayArray15[6][0] = 4096;
			this.anIntArrayArray15[5][2] = 0;
			this.anIntArrayArray15[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray15 = new int[6][4];
			this.anIntArrayArray15[0][0] = 0;
			this.anIntArrayArray15[1][0] = 1843;
			this.anIntArrayArray15[0][3] = 0;
			this.anIntArrayArray15[1][3] = 1493;
			this.anIntArrayArray15[0][2] = 0;
			this.anIntArrayArray15[2][0] = 2457;
			this.anIntArrayArray15[0][1] = 0;
			this.anIntArrayArray15[1][2] = 0;
			this.anIntArrayArray15[1][1] = 0;
			this.anIntArrayArray15[2][2] = 0;
			this.anIntArrayArray15[3][0] = 2781;
			this.anIntArrayArray15[3][2] = 1124;
			this.anIntArrayArray15[4][0] = 3481;
			this.anIntArrayArray15[2][3] = 2939;
			this.anIntArrayArray15[2][1] = 0;
			this.anIntArrayArray15[3][1] = 0;
			this.anIntArrayArray15[5][0] = 4096;
			this.anIntArrayArray15[4][2] = 3084;
			this.anIntArrayArray15[5][2] = 4096;
			this.anIntArrayArray15[3][3] = 3565;
			this.anIntArrayArray15[4][3] = 4031;
			this.anIntArrayArray15[5][3] = 4096;
			this.anIntArrayArray15[4][1] = 546;
			this.anIntArrayArray15[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray15 = new int[16][4];
			this.anIntArrayArray15[0][2] = 192;
			this.anIntArrayArray15[0][0] = 0;
			this.anIntArrayArray15[1][0] = 155;
			this.anIntArrayArray15[0][1] = 80;
			this.anIntArrayArray15[1][2] = 449;
			this.anIntArrayArray15[0][3] = 321;
			this.anIntArrayArray15[2][0] = 389;
			this.anIntArrayArray15[2][2] = 690;
			this.anIntArrayArray15[1][3] = 562;
			this.anIntArrayArray15[3][2] = 995;
			this.anIntArrayArray15[3][0] = 671;
			this.anIntArrayArray15[2][3] = 803;
			this.anIntArrayArray15[4][2] = 1397;
			this.anIntArrayArray15[1][1] = 321;
			this.anIntArrayArray15[2][1] = 578;
			this.anIntArrayArray15[5][2] = 1429;
			this.anIntArrayArray15[4][0] = 897;
			this.anIntArrayArray15[3][3] = 1140;
			this.anIntArrayArray15[6][2] = 1461;
			this.anIntArrayArray15[3][1] = 947;
			this.anIntArrayArray15[5][0] = 1175;
			this.anIntArrayArray15[7][2] = 1525;
			this.anIntArrayArray15[4][3] = 1509;
			this.anIntArrayArray15[6][0] = 1368;
			this.anIntArrayArray15[5][3] = 1413;
			this.anIntArrayArray15[4][1] = 1285;
			this.anIntArrayArray15[7][0] = 1507;
			this.anIntArrayArray15[6][3] = 1333;
			this.anIntArrayArray15[5][1] = 1525;
			this.anIntArrayArray15[8][0] = 1736;
			this.anIntArrayArray15[9][0] = 2088;
			this.anIntArrayArray15[6][1] = 1734;
			this.anIntArrayArray15[7][1] = 1413;
			this.anIntArrayArray15[10][0] = 2355;
			this.anIntArrayArray15[8][2] = 1590;
			this.anIntArrayArray15[8][1] = 1108;
			this.anIntArrayArray15[11][0] = 2691;
			this.anIntArrayArray15[7][3] = 1702;
			this.anIntArrayArray15[9][1] = 1766;
			this.anIntArrayArray15[8][3] = 2056;
			this.anIntArrayArray15[9][2] = 2056;
			this.anIntArrayArray15[10][2] = 2586;
			this.anIntArrayArray15[10][1] = 2409;
			this.anIntArrayArray15[9][3] = 2666;
			this.anIntArrayArray15[12][0] = 3031;
			this.anIntArrayArray15[11][1] = 3116;
			this.anIntArrayArray15[13][0] = 3522;
			this.anIntArrayArray15[14][0] = 3727;
			this.anIntArrayArray15[15][0] = 4096;
			this.anIntArrayArray15[11][2] = 3148;
			this.anIntArrayArray15[10][3] = 3276;
			this.anIntArrayArray15[12][1] = 3806;
			this.anIntArrayArray15[13][1] = 3437;
			this.anIntArrayArray15[12][2] = 3710;
			this.anIntArrayArray15[13][2] = 3421;
			this.anIntArrayArray15[14][1] = 3116;
			this.anIntArrayArray15[15][1] = 2377;
			this.anIntArrayArray15[14][2] = 3148;
			this.anIntArrayArray15[11][3] = 3228;
			this.anIntArrayArray15[12][3] = 3196;
			this.anIntArrayArray15[13][3] = 3019;
			this.anIntArrayArray15[14][3] = 3228;
			this.anIntArrayArray15[15][2] = 2505;
			this.anIntArrayArray15[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray15 = new int[4][4];
			this.anIntArrayArray15[0][3] = 0;
			this.anIntArrayArray15[0][1] = 0;
			this.anIntArrayArray15[0][2] = 4096;
			this.anIntArrayArray15[1][3] = 0;
			this.anIntArrayArray15[1][2] = 4096;
			this.anIntArrayArray15[1][1] = 4096;
			this.anIntArrayArray15[0][0] = 2048;
			this.anIntArrayArray15[1][0] = 2867;
			this.anIntArrayArray15[2][3] = 0;
			this.anIntArrayArray15[2][2] = 4096;
			this.anIntArrayArray15[3][3] = 0;
			this.anIntArrayArray15[3][2] = 0;
			this.anIntArrayArray15[2][1] = 4096;
			this.anIntArrayArray15[3][1] = 4096;
			this.anIntArrayArray15[2][0] = 3276;
			this.anIntArrayArray15[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)V")
	private void method1071() {
		@Pc(16) int local16 = this.anIntArrayArray15.length;
		if (local16 <= 0) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < 257; local23++) {
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = local23 << 4;
			for (@Pc(33) int local33 = 0; local33 < local16 && local31 >= this.anIntArrayArray15[local33][0]; local33++) {
				local27++;
			}
			@Pc(66) int local66;
			@Pc(70) int local70;
			@Pc(62) int local62;
			@Pc(58) int[] local58;
			if (local27 >= local16) {
				local58 = this.anIntArrayArray15[local16 - 1];
				local62 = local58[3];
				local66 = local58[1];
				local70 = local58[2];
			} else {
				local58 = this.anIntArrayArray15[local27];
				if (local27 > 0) {
					@Pc(89) int[] local89 = this.anIntArrayArray15[local27 - 1];
					@Pc(106) int local106 = (local31 - local89[0] << 12) / (local58[0] - local89[0]);
					@Pc(111) int local111 = 4096 - local106;
					local62 = local58[3] * local106 + local89[3] * local111 >> 12;
					local66 = local58[1] * local106 + local89[1] * local111 >> 12;
					local70 = local89[2] * local111 + local58[2] * local106 >> 12;
				} else {
					local66 = local58[1];
					local70 = local58[2];
					local62 = local58[3];
				}
			}
			local66 >>= 0x4;
			local62 >>= 0x4;
			if (local62 < 0) {
				local62 = 0;
			} else if (local62 > 255) {
				local62 = 255;
			}
			if (local66 < 0) {
				local66 = 0;
			} else if (local66 > 255) {
				local66 = 255;
			}
			local70 >>= 0x4;
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 255) {
				local70 = 255;
			}
			this.anIntArray133[local23] = local66 << 16 | local70 << 8 | local62;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(11) int local11 = arg0.method3062();
		if (local11 != 0) {
			this.method1069(local11);
			return;
		}
		this.anIntArrayArray15 = new int[arg0.method3062()][4];
		for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray15.length; local33++) {
			this.anIntArrayArray15[local33][0] = arg0.method3077();
			this.anIntArrayArray15[local33][1] = arg0.method3062() << 4;
			this.anIntArrayArray15[local33][2] = arg0.method3062() << 4;
			this.anIntArrayArray15[local33][3] = arg0.method3062() << 4;
		}
	}
}
