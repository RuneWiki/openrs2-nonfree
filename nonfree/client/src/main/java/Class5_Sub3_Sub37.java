import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class5_Sub3_Sub37 extends Class5_Sub3 {

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!wd", name = "I", descriptor = "[I")
	private final int[] anIntArray612 = new int[257];

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
	private void method9048() {
		@Pc(16) int local16 = this.anIntArrayArray67.length;
		if (local16 <= 0) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < 257; local23++) {
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = local23 << 4;
			for (@Pc(33) int local33 = 0; local33 < local16 && this.anIntArrayArray67[local33][0] <= local31; local33++) {
				local27++;
			}
			@Pc(112) int local112;
			@Pc(140) int local140;
			@Pc(126) int local126;
			@Pc(66) int[] local66;
			if (local16 > local27) {
				local66 = this.anIntArrayArray67[local27];
				if (local27 > 0) {
					@Pc(75) int[] local75 = this.anIntArrayArray67[local27 - 1];
					@Pc(93) int local93 = (local31 - local75[0] << 12) / (local66[0] - local75[0]);
					@Pc(98) int local98 = 4096 - local93;
					local112 = local75[1] * local98 + local93 * local66[1] >> 12;
					local126 = local93 * local66[3] + local75[3] * local98 >> 12;
					local140 = local98 * local75[2] + local66[2] * local93 >> 12;
				} else {
					local126 = local66[3];
					local112 = local66[1];
					local140 = local66[2];
				}
			} else {
				local66 = this.anIntArrayArray67[local16 - 1];
				local140 = local66[2];
				local112 = local66[1];
				local126 = local66[3];
			}
			local126 >>= 0x4;
			local140 >>= 0x4;
			local112 >>= 0x4;
			if (local140 < 0) {
				local140 = 0;
			} else if (local140 > 255) {
				local140 = 255;
			}
			if (local112 < 0) {
				local112 = 0;
			} else if (local112 > 255) {
				local112 = 255;
			}
			if (local126 < 0) {
				local126 = 0;
			} else if (local126 > 255) {
				local126 = 255;
			}
			this.anIntArray612[local23] = local126 | local140 << 8 | local112 << 16;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(20) int local20 = arg0.method7291();
		if (local20 != 0) {
			this.method9049(local20);
			return;
		}
		this.anIntArrayArray67 = new int[arg0.method7291()][4];
		for (@Pc(37) int local37 = 0; local37 < this.anIntArrayArray67.length; local37++) {
			this.anIntArrayArray67[local37][0] = arg0.method7333();
			this.anIntArrayArray67[local37][1] = arg0.method7291() << 4;
			this.anIntArrayArray67[local37][2] = arg0.method7291() << 4;
			this.anIntArrayArray67[local37][3] = arg0.method7291() << 4;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V")
	private void method9049(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray67 = new int[2][4];
			this.anIntArrayArray67[0][0] = 0;
			this.anIntArrayArray67[0][1] = 0;
			this.anIntArrayArray67[0][3] = 0;
			this.anIntArrayArray67[0][2] = 0;
			this.anIntArrayArray67[1][3] = 4096;
			this.anIntArrayArray67[1][0] = 4096;
			this.anIntArrayArray67[1][2] = 4096;
			this.anIntArrayArray67[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray67 = new int[8][4];
			this.anIntArrayArray67[0][3] = 2361;
			this.anIntArrayArray67[0][0] = 0;
			this.anIntArrayArray67[0][1] = 2650;
			this.anIntArrayArray67[0][2] = 2602;
			this.anIntArrayArray67[1][2] = 1799;
			this.anIntArrayArray67[1][3] = 1558;
			this.anIntArrayArray67[1][0] = 2867;
			this.anIntArrayArray67[1][1] = 2313;
			this.anIntArrayArray67[2][1] = 2618;
			this.anIntArrayArray67[2][2] = 1734;
			this.anIntArrayArray67[2][0] = 3072;
			this.anIntArrayArray67[2][3] = 1413;
			this.anIntArrayArray67[3][2] = 1220;
			this.anIntArrayArray67[3][1] = 2296;
			this.anIntArrayArray67[3][0] = 3276;
			this.anIntArrayArray67[3][3] = 947;
			this.anIntArrayArray67[4][0] = 3481;
			this.anIntArrayArray67[4][3] = 722;
			this.anIntArrayArray67[4][2] = 963;
			this.anIntArrayArray67[4][1] = 2072;
			this.anIntArrayArray67[5][3] = 1766;
			this.anIntArrayArray67[5][2] = 2152;
			this.anIntArrayArray67[5][1] = 2730;
			this.anIntArrayArray67[5][0] = 3686;
			this.anIntArrayArray67[6][2] = 1060;
			this.anIntArrayArray67[6][0] = 3891;
			this.anIntArrayArray67[6][1] = 2232;
			this.anIntArrayArray67[6][3] = 915;
			this.anIntArrayArray67[7][1] = 1686;
			this.anIntArrayArray67[7][3] = 1140;
			this.anIntArrayArray67[7][2] = 1413;
			this.anIntArrayArray67[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray67 = new int[7][4];
			this.anIntArrayArray67[0][1] = 0;
			this.anIntArrayArray67[0][2] = 0;
			this.anIntArrayArray67[0][3] = 4096;
			this.anIntArrayArray67[0][0] = 0;
			this.anIntArrayArray67[1][0] = 663;
			this.anIntArrayArray67[1][2] = 4096;
			this.anIntArrayArray67[1][1] = 0;
			this.anIntArrayArray67[1][3] = 4096;
			this.anIntArrayArray67[2][0] = 1363;
			this.anIntArrayArray67[2][3] = 0;
			this.anIntArrayArray67[2][1] = 0;
			this.anIntArrayArray67[2][2] = 4096;
			this.anIntArrayArray67[3][1] = 4096;
			this.anIntArrayArray67[3][3] = 0;
			this.anIntArrayArray67[3][0] = 2048;
			this.anIntArrayArray67[3][2] = 4096;
			this.anIntArrayArray67[4][0] = 2727;
			this.anIntArrayArray67[4][1] = 4096;
			this.anIntArrayArray67[4][2] = 0;
			this.anIntArrayArray67[4][3] = 0;
			this.anIntArrayArray67[5][2] = 0;
			this.anIntArrayArray67[5][0] = 3411;
			this.anIntArrayArray67[5][1] = 4096;
			this.anIntArrayArray67[5][3] = 4096;
			this.anIntArrayArray67[6][0] = 4096;
			this.anIntArrayArray67[6][2] = 0;
			this.anIntArrayArray67[6][1] = 0;
			this.anIntArrayArray67[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray67 = new int[6][4];
			this.anIntArrayArray67[0][3] = 0;
			this.anIntArrayArray67[0][0] = 0;
			this.anIntArrayArray67[0][2] = 0;
			this.anIntArrayArray67[0][1] = 0;
			this.anIntArrayArray67[1][1] = 0;
			this.anIntArrayArray67[1][0] = 1843;
			this.anIntArrayArray67[1][2] = 0;
			this.anIntArrayArray67[1][3] = 1493;
			this.anIntArrayArray67[2][2] = 0;
			this.anIntArrayArray67[2][0] = 2457;
			this.anIntArrayArray67[2][1] = 0;
			this.anIntArrayArray67[2][3] = 2939;
			this.anIntArrayArray67[3][0] = 2781;
			this.anIntArrayArray67[3][1] = 0;
			this.anIntArrayArray67[3][3] = 3565;
			this.anIntArrayArray67[3][2] = 1124;
			this.anIntArrayArray67[4][1] = 546;
			this.anIntArrayArray67[4][0] = 3481;
			this.anIntArrayArray67[4][2] = 3084;
			this.anIntArrayArray67[4][3] = 4031;
			this.anIntArrayArray67[5][2] = 4096;
			this.anIntArrayArray67[5][0] = 4096;
			this.anIntArrayArray67[5][1] = 4096;
			this.anIntArrayArray67[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray67 = new int[16][4];
			this.anIntArrayArray67[0][1] = 80;
			this.anIntArrayArray67[0][0] = 0;
			this.anIntArrayArray67[0][3] = 321;
			this.anIntArrayArray67[0][2] = 192;
			this.anIntArrayArray67[1][2] = 449;
			this.anIntArrayArray67[1][0] = 155;
			this.anIntArrayArray67[1][3] = 562;
			this.anIntArrayArray67[1][1] = 321;
			this.anIntArrayArray67[2][3] = 803;
			this.anIntArrayArray67[2][1] = 578;
			this.anIntArrayArray67[2][2] = 690;
			this.anIntArrayArray67[2][0] = 389;
			this.anIntArrayArray67[3][0] = 671;
			this.anIntArrayArray67[3][3] = 1140;
			this.anIntArrayArray67[3][1] = 947;
			this.anIntArrayArray67[3][2] = 995;
			this.anIntArrayArray67[4][2] = 1397;
			this.anIntArrayArray67[4][3] = 1509;
			this.anIntArrayArray67[4][1] = 1285;
			this.anIntArrayArray67[4][0] = 897;
			this.anIntArrayArray67[5][1] = 1525;
			this.anIntArrayArray67[5][2] = 1429;
			this.anIntArrayArray67[5][3] = 1413;
			this.anIntArrayArray67[5][0] = 1175;
			this.anIntArrayArray67[6][3] = 1333;
			this.anIntArrayArray67[6][2] = 1461;
			this.anIntArrayArray67[6][1] = 1734;
			this.anIntArrayArray67[6][0] = 1368;
			this.anIntArrayArray67[7][0] = 1507;
			this.anIntArrayArray67[7][1] = 1413;
			this.anIntArrayArray67[7][3] = 1702;
			this.anIntArrayArray67[7][2] = 1525;
			this.anIntArrayArray67[8][1] = 1108;
			this.anIntArrayArray67[8][0] = 1736;
			this.anIntArrayArray67[8][2] = 1590;
			this.anIntArrayArray67[8][3] = 2056;
			this.anIntArrayArray67[9][0] = 2088;
			this.anIntArrayArray67[9][1] = 1766;
			this.anIntArrayArray67[9][2] = 2056;
			this.anIntArrayArray67[9][3] = 2666;
			this.anIntArrayArray67[10][0] = 2355;
			this.anIntArrayArray67[10][1] = 2409;
			this.anIntArrayArray67[10][3] = 3276;
			this.anIntArrayArray67[10][2] = 2586;
			this.anIntArrayArray67[11][3] = 3228;
			this.anIntArrayArray67[11][1] = 3116;
			this.anIntArrayArray67[11][2] = 3148;
			this.anIntArrayArray67[11][0] = 2691;
			this.anIntArrayArray67[12][0] = 3031;
			this.anIntArrayArray67[12][2] = 3710;
			this.anIntArrayArray67[12][3] = 3196;
			this.anIntArrayArray67[12][1] = 3806;
			this.anIntArrayArray67[13][0] = 3522;
			this.anIntArrayArray67[13][2] = 3421;
			this.anIntArrayArray67[13][1] = 3437;
			this.anIntArrayArray67[13][3] = 3019;
			this.anIntArrayArray67[14][2] = 3148;
			this.anIntArrayArray67[14][0] = 3727;
			this.anIntArrayArray67[14][1] = 3116;
			this.anIntArrayArray67[14][3] = 3228;
			this.anIntArrayArray67[15][0] = 4096;
			this.anIntArrayArray67[15][3] = 2746;
			this.anIntArrayArray67[15][1] = 2377;
			this.anIntArrayArray67[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray67 = new int[4][4];
			this.anIntArrayArray67[0][3] = 0;
			this.anIntArrayArray67[0][2] = 4096;
			this.anIntArrayArray67[0][0] = 2048;
			this.anIntArrayArray67[0][1] = 0;
			this.anIntArrayArray67[1][2] = 4096;
			this.anIntArrayArray67[1][3] = 0;
			this.anIntArrayArray67[1][0] = 2867;
			this.anIntArrayArray67[1][1] = 4096;
			this.anIntArrayArray67[2][0] = 3276;
			this.anIntArrayArray67[2][2] = 4096;
			this.anIntArrayArray67[2][3] = 0;
			this.anIntArrayArray67[2][1] = 4096;
			this.anIntArrayArray67[3][0] = 4096;
			this.anIntArrayArray67[3][2] = 0;
			this.anIntArrayArray67[3][1] = 4096;
			this.anIntArrayArray67[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(32) int[] local32 = this.method9205(arg0, 0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static7.anInt102; local46++) {
				@Pc(54) int local54 = local32[local46] >> 4;
				if (local54 < 0) {
					local54 = 0;
				}
				if (local54 > 256) {
					local54 = 256;
				}
				local54 = this.anIntArray612[local54];
				local36[local46] = local54 >> 12 & 0xFF0;
				local40[local46] = local54 >> 4 & 0xFF0;
				local44[local46] = (local54 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
		if (this.anIntArrayArray67 == null) {
			this.method9049(1);
		}
		this.method9048();
	}
}
