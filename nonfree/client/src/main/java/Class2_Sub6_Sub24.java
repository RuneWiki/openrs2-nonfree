import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class2_Sub6_Sub24 extends Class2_Sub6 {

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!nh", name = "X", descriptor = "[I")
	private final int[] anIntArray527 = new int[257];

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(31) int[] local31 = this.method5635(arg0, 0);
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			@Pc(43) int[] local43 = local11[2];
			for (@Pc(45) int local45 = 0; local45 < Static151.anInt2711; local45++) {
				@Pc(53) int local53 = local31[local45] >> 4;
				if (local53 < 0) {
					local53 = 0;
				}
				if (local53 > 256) {
					local53 = 256;
				}
				local53 = this.anIntArray527[local53];
				local35[local45] = local53 >> 12 & 0xFF0;
				local39[local45] = local53 >> 4 & 0xFF0;
				local43[local45] = (local53 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
	private void method3837(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray27 = new int[2][4];
			this.anIntArrayArray27[0][3] = 0;
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][1] = 0;
			this.anIntArrayArray27[0][2] = 0;
			this.anIntArrayArray27[1][0] = 4096;
			this.anIntArrayArray27[1][1] = 4096;
			this.anIntArrayArray27[1][2] = 4096;
			this.anIntArrayArray27[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray27 = new int[8][4];
			this.anIntArrayArray27[0][3] = 2361;
			this.anIntArrayArray27[0][1] = 2650;
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][2] = 2602;
			this.anIntArrayArray27[1][3] = 1558;
			this.anIntArrayArray27[1][2] = 1799;
			this.anIntArrayArray27[1][1] = 2313;
			this.anIntArrayArray27[1][0] = 2867;
			this.anIntArrayArray27[2][0] = 3072;
			this.anIntArrayArray27[2][1] = 2618;
			this.anIntArrayArray27[2][3] = 1413;
			this.anIntArrayArray27[2][2] = 1734;
			this.anIntArrayArray27[3][0] = 3276;
			this.anIntArrayArray27[3][2] = 1220;
			this.anIntArrayArray27[3][1] = 2296;
			this.anIntArrayArray27[3][3] = 947;
			this.anIntArrayArray27[4][2] = 963;
			this.anIntArrayArray27[4][3] = 722;
			this.anIntArrayArray27[4][0] = 3481;
			this.anIntArrayArray27[4][1] = 2072;
			this.anIntArrayArray27[5][0] = 3686;
			this.anIntArrayArray27[5][2] = 2152;
			this.anIntArrayArray27[5][1] = 2730;
			this.anIntArrayArray27[5][3] = 1766;
			this.anIntArrayArray27[6][1] = 2232;
			this.anIntArrayArray27[6][3] = 915;
			this.anIntArrayArray27[6][2] = 1060;
			this.anIntArrayArray27[6][0] = 3891;
			this.anIntArrayArray27[7][0] = 4096;
			this.anIntArrayArray27[7][2] = 1413;
			this.anIntArrayArray27[7][3] = 1140;
			this.anIntArrayArray27[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray27 = new int[7][4];
			this.anIntArrayArray27[0][3] = 4096;
			this.anIntArrayArray27[0][2] = 0;
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][1] = 0;
			this.anIntArrayArray27[1][1] = 0;
			this.anIntArrayArray27[1][0] = 663;
			this.anIntArrayArray27[1][3] = 4096;
			this.anIntArrayArray27[1][2] = 4096;
			this.anIntArrayArray27[2][0] = 1363;
			this.anIntArrayArray27[2][2] = 4096;
			this.anIntArrayArray27[2][1] = 0;
			this.anIntArrayArray27[2][3] = 0;
			this.anIntArrayArray27[3][2] = 4096;
			this.anIntArrayArray27[3][0] = 2048;
			this.anIntArrayArray27[3][3] = 0;
			this.anIntArrayArray27[3][1] = 4096;
			this.anIntArrayArray27[4][0] = 2727;
			this.anIntArrayArray27[4][1] = 4096;
			this.anIntArrayArray27[4][3] = 0;
			this.anIntArrayArray27[4][2] = 0;
			this.anIntArrayArray27[5][0] = 3411;
			this.anIntArrayArray27[5][2] = 0;
			this.anIntArrayArray27[5][1] = 4096;
			this.anIntArrayArray27[5][3] = 4096;
			this.anIntArrayArray27[6][0] = 4096;
			this.anIntArrayArray27[6][1] = 0;
			this.anIntArrayArray27[6][2] = 0;
			this.anIntArrayArray27[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray27 = new int[6][4];
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][3] = 0;
			this.anIntArrayArray27[0][1] = 0;
			this.anIntArrayArray27[0][2] = 0;
			this.anIntArrayArray27[1][2] = 0;
			this.anIntArrayArray27[1][3] = 1493;
			this.anIntArrayArray27[1][0] = 1843;
			this.anIntArrayArray27[1][1] = 0;
			this.anIntArrayArray27[2][3] = 2939;
			this.anIntArrayArray27[2][1] = 0;
			this.anIntArrayArray27[2][0] = 2457;
			this.anIntArrayArray27[2][2] = 0;
			this.anIntArrayArray27[3][2] = 1124;
			this.anIntArrayArray27[3][1] = 0;
			this.anIntArrayArray27[3][3] = 3565;
			this.anIntArrayArray27[3][0] = 2781;
			this.anIntArrayArray27[4][3] = 4031;
			this.anIntArrayArray27[4][1] = 546;
			this.anIntArrayArray27[4][0] = 3481;
			this.anIntArrayArray27[4][2] = 3084;
			this.anIntArrayArray27[5][2] = 4096;
			this.anIntArrayArray27[5][0] = 4096;
			this.anIntArrayArray27[5][1] = 4096;
			this.anIntArrayArray27[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray27 = new int[16][4];
			this.anIntArrayArray27[0][1] = 80;
			this.anIntArrayArray27[0][2] = 192;
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][3] = 321;
			this.anIntArrayArray27[1][1] = 321;
			this.anIntArrayArray27[1][3] = 562;
			this.anIntArrayArray27[1][2] = 449;
			this.anIntArrayArray27[1][0] = 155;
			this.anIntArrayArray27[2][0] = 389;
			this.anIntArrayArray27[2][2] = 690;
			this.anIntArrayArray27[2][1] = 578;
			this.anIntArrayArray27[2][3] = 803;
			this.anIntArrayArray27[3][0] = 671;
			this.anIntArrayArray27[3][2] = 995;
			this.anIntArrayArray27[3][3] = 1140;
			this.anIntArrayArray27[3][1] = 947;
			this.anIntArrayArray27[4][1] = 1285;
			this.anIntArrayArray27[4][0] = 897;
			this.anIntArrayArray27[4][2] = 1397;
			this.anIntArrayArray27[4][3] = 1509;
			this.anIntArrayArray27[5][0] = 1175;
			this.anIntArrayArray27[5][1] = 1525;
			this.anIntArrayArray27[5][2] = 1429;
			this.anIntArrayArray27[5][3] = 1413;
			this.anIntArrayArray27[6][2] = 1461;
			this.anIntArrayArray27[6][0] = 1368;
			this.anIntArrayArray27[6][1] = 1734;
			this.anIntArrayArray27[6][3] = 1333;
			this.anIntArrayArray27[7][3] = 1702;
			this.anIntArrayArray27[7][2] = 1525;
			this.anIntArrayArray27[7][0] = 1507;
			this.anIntArrayArray27[7][1] = 1413;
			this.anIntArrayArray27[8][1] = 1108;
			this.anIntArrayArray27[8][0] = 1736;
			this.anIntArrayArray27[8][2] = 1590;
			this.anIntArrayArray27[8][3] = 2056;
			this.anIntArrayArray27[9][3] = 2666;
			this.anIntArrayArray27[9][2] = 2056;
			this.anIntArrayArray27[9][1] = 1766;
			this.anIntArrayArray27[9][0] = 2088;
			this.anIntArrayArray27[10][3] = 3276;
			this.anIntArrayArray27[10][1] = 2409;
			this.anIntArrayArray27[10][0] = 2355;
			this.anIntArrayArray27[10][2] = 2586;
			this.anIntArrayArray27[11][2] = 3148;
			this.anIntArrayArray27[11][3] = 3228;
			this.anIntArrayArray27[11][1] = 3116;
			this.anIntArrayArray27[11][0] = 2691;
			this.anIntArrayArray27[12][2] = 3710;
			this.anIntArrayArray27[12][0] = 3031;
			this.anIntArrayArray27[12][3] = 3196;
			this.anIntArrayArray27[12][1] = 3806;
			this.anIntArrayArray27[13][1] = 3437;
			this.anIntArrayArray27[13][3] = 3019;
			this.anIntArrayArray27[13][2] = 3421;
			this.anIntArrayArray27[13][0] = 3522;
			this.anIntArrayArray27[14][2] = 3148;
			this.anIntArrayArray27[14][1] = 3116;
			this.anIntArrayArray27[14][0] = 3727;
			this.anIntArrayArray27[14][3] = 3228;
			this.anIntArrayArray27[15][2] = 2505;
			this.anIntArrayArray27[15][3] = 2746;
			this.anIntArrayArray27[15][1] = 2377;
			this.anIntArrayArray27[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray27 = new int[4][4];
			this.anIntArrayArray27[0][3] = 0;
			this.anIntArrayArray27[0][2] = 4096;
			this.anIntArrayArray27[0][0] = 2048;
			this.anIntArrayArray27[0][1] = 0;
			this.anIntArrayArray27[1][0] = 2867;
			this.anIntArrayArray27[1][1] = 4096;
			this.anIntArrayArray27[1][3] = 0;
			this.anIntArrayArray27[1][2] = 4096;
			this.anIntArrayArray27[2][2] = 4096;
			this.anIntArrayArray27[2][1] = 4096;
			this.anIntArrayArray27[2][3] = 0;
			this.anIntArrayArray27[2][0] = 3276;
			this.anIntArrayArray27[3][1] = 4096;
			this.anIntArrayArray27[3][2] = 0;
			this.anIntArrayArray27[3][3] = 0;
			this.anIntArrayArray27[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	private void method3839() {
		@Pc(15) int local15 = this.anIntArrayArray27.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local22 << 4;
			for (@Pc(32) int local32 = 0; local15 > local32 && local30 >= this.anIntArrayArray27[local32][0]; local32++) {
				local26++;
			}
			@Pc(121) int local121;
			@Pc(135) int local135;
			@Pc(107) int local107;
			@Pc(59) int[] local59;
			if (local15 > local26) {
				local59 = this.anIntArrayArray27[local26];
				if (local26 > 0) {
					@Pc(71) int[] local71 = this.anIntArrayArray27[local26 - 1];
					@Pc(88) int local88 = (local30 - local71[0] << 12) / (local59[0] - local71[0]);
					@Pc(93) int local93 = 4096 - local88;
					local107 = local93 * local71[3] + local59[3] * local88 >> 12;
					local121 = local59[1] * local88 + local71[1] * local93 >> 12;
					local135 = local88 * local59[2] + local93 * local71[2] >> 12;
				} else {
					local135 = local59[2];
					local121 = local59[1];
					local107 = local59[3];
				}
			} else {
				local59 = this.anIntArrayArray27[local15 - 1];
				local121 = local59[1];
				local107 = local59[3];
				local135 = local59[2];
			}
			local135 >>= 0x4;
			local121 >>= 0x4;
			local107 >>= 0x4;
			if (local107 < 0) {
				local107 = 0;
			} else if (local107 > 255) {
				local107 = 255;
			}
			if (local135 < 0) {
				local135 = 0;
			} else if (local135 > 255) {
				local135 = 255;
			}
			if (local121 < 0) {
				local121 = 0;
			} else if (local121 > 255) {
				local121 = 255;
			}
			this.anIntArray527[local22] = local135 << 8 | local121 << 16 | local107;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(7) int local7 = arg0.method4240();
		if (local7 != 0) {
			this.method3837(local7);
			return;
		}
		this.anIntArrayArray27 = new int[arg0.method4240()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray27.length; local21++) {
			this.anIntArrayArray27[local21][0] = arg0.method4245();
			this.anIntArrayArray27[local21][1] = arg0.method4240() << 4;
			this.anIntArrayArray27[local21][2] = arg0.method4240() << 4;
			this.anIntArrayArray27[local21][3] = arg0.method4240() << 4;
		}
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
		if (this.anIntArrayArray27 == null) {
			this.method3837(1);
		}
		this.method3839();
	}
}
