import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class1_Sub3_Sub11 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hw", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!hw", name = "Z", descriptor = "[I")
	private final int[] anIntArray304 = new int[257];

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V")
	private void method3651() {
		@Pc(15) int local15 = this.anIntArrayArray41.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local22 << 4;
			for (@Pc(32) int local32 = 0; local15 > local32 && local30 >= this.anIntArrayArray41[local32][0]; local32++) {
				local26++;
			}
			@Pc(132) int local132;
			@Pc(118) int local118;
			@Pc(104) int local104;
			@Pc(55) int[] local55;
			if (local15 > local26) {
				local55 = this.anIntArrayArray41[local26];
				if (local26 > 0) {
					@Pc(67) int[] local67 = this.anIntArrayArray41[local26 - 1];
					@Pc(85) int local85 = (local30 - local67[0] << 12) / (local55[0] - local67[0]);
					@Pc(90) int local90 = 4096 - local85;
					local104 = local67[3] * local90 + local85 * local55[3] >> 12;
					local118 = local90 * local67[2] + local55[2] * local85 >> 12;
					local132 = local90 * local67[1] + local85 * local55[1] >> 12;
				} else {
					local118 = local55[2];
					local132 = local55[1];
					local104 = local55[3];
				}
			} else {
				local55 = this.anIntArrayArray41[local15 - 1];
				local132 = local55[1];
				local104 = local55[3];
				local118 = local55[2];
			}
			local104 >>= 0x4;
			local132 >>= 0x4;
			local118 >>= 0x4;
			if (local118 < 0) {
				local118 = 0;
			} else if (local118 > 255) {
				local118 = 255;
			}
			if (local132 < 0) {
				local132 = 0;
			} else if (local132 > 255) {
				local132 = 255;
			}
			if (local104 < 0) {
				local104 = 0;
			} else if (local104 > 255) {
				local104 = 255;
			}
			this.anIntArray304[local22] = local132 << 16 | local118 << 8 | local104;
		}
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
		if (this.anIntArrayArray41 == null) {
			this.method3656(1);
		}
		this.method3651();
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(28) int[] local28 = this.method8201(0, arg0);
			@Pc(32) int[] local32 = local18[0];
			@Pc(36) int[] local36 = local18[1];
			@Pc(40) int[] local40 = local18[2];
			for (@Pc(42) int local42 = 0; local42 < Static254.anInt4973; local42++) {
				@Pc(50) int local50 = local28[local42] >> 4;
				if (local50 < 0) {
					local50 = 0;
				}
				if (local50 > 256) {
					local50 = 256;
				}
				local50 = this.anIntArray304[local50];
				local32[local42] = local50 >> 12 & 0xFF0;
				local36[local42] = local50 >> 4 & 0xFF0;
				local40[local42] = (local50 & 0xFF) << 4;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "(II)V")
	private void method3656(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray41 = new int[2][4];
			this.anIntArrayArray41[0][3] = 0;
			this.anIntArrayArray41[0][0] = 0;
			this.anIntArrayArray41[0][1] = 0;
			this.anIntArrayArray41[0][2] = 0;
			this.anIntArrayArray41[1][1] = 4096;
			this.anIntArrayArray41[1][0] = 4096;
			this.anIntArrayArray41[1][2] = 4096;
			this.anIntArrayArray41[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray41 = new int[8][4];
			this.anIntArrayArray41[0][1] = 2650;
			this.anIntArrayArray41[0][2] = 2602;
			this.anIntArrayArray41[0][0] = 0;
			this.anIntArrayArray41[0][3] = 2361;
			this.anIntArrayArray41[1][0] = 2867;
			this.anIntArrayArray41[1][3] = 1558;
			this.anIntArrayArray41[1][2] = 1799;
			this.anIntArrayArray41[1][1] = 2313;
			this.anIntArrayArray41[2][1] = 2618;
			this.anIntArrayArray41[2][0] = 3072;
			this.anIntArrayArray41[2][3] = 1413;
			this.anIntArrayArray41[2][2] = 1734;
			this.anIntArrayArray41[3][1] = 2296;
			this.anIntArrayArray41[3][3] = 947;
			this.anIntArrayArray41[3][2] = 1220;
			this.anIntArrayArray41[3][0] = 3276;
			this.anIntArrayArray41[4][0] = 3481;
			this.anIntArrayArray41[4][2] = 963;
			this.anIntArrayArray41[4][3] = 722;
			this.anIntArrayArray41[4][1] = 2072;
			this.anIntArrayArray41[5][2] = 2152;
			this.anIntArrayArray41[5][1] = 2730;
			this.anIntArrayArray41[5][3] = 1766;
			this.anIntArrayArray41[5][0] = 3686;
			this.anIntArrayArray41[6][1] = 2232;
			this.anIntArrayArray41[6][0] = 3891;
			this.anIntArrayArray41[6][2] = 1060;
			this.anIntArrayArray41[6][3] = 915;
			this.anIntArrayArray41[7][1] = 1686;
			this.anIntArrayArray41[7][2] = 1413;
			this.anIntArrayArray41[7][3] = 1140;
			this.anIntArrayArray41[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray41 = new int[7][4];
			this.anIntArrayArray41[0][1] = 0;
			this.anIntArrayArray41[0][2] = 0;
			this.anIntArrayArray41[0][3] = 4096;
			this.anIntArrayArray41[0][0] = 0;
			this.anIntArrayArray41[1][1] = 0;
			this.anIntArrayArray41[1][3] = 4096;
			this.anIntArrayArray41[1][0] = 663;
			this.anIntArrayArray41[1][2] = 4096;
			this.anIntArrayArray41[2][1] = 0;
			this.anIntArrayArray41[2][0] = 1363;
			this.anIntArrayArray41[2][2] = 4096;
			this.anIntArrayArray41[2][3] = 0;
			this.anIntArrayArray41[3][2] = 4096;
			this.anIntArrayArray41[3][3] = 0;
			this.anIntArrayArray41[3][1] = 4096;
			this.anIntArrayArray41[3][0] = 2048;
			this.anIntArrayArray41[4][0] = 2727;
			this.anIntArrayArray41[4][3] = 0;
			this.anIntArrayArray41[4][2] = 0;
			this.anIntArrayArray41[4][1] = 4096;
			this.anIntArrayArray41[5][1] = 4096;
			this.anIntArrayArray41[5][3] = 4096;
			this.anIntArrayArray41[5][0] = 3411;
			this.anIntArrayArray41[5][2] = 0;
			this.anIntArrayArray41[6][1] = 0;
			this.anIntArrayArray41[6][2] = 0;
			this.anIntArrayArray41[6][0] = 4096;
			this.anIntArrayArray41[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray41 = new int[6][4];
			this.anIntArrayArray41[0][0] = 0;
			this.anIntArrayArray41[0][2] = 0;
			this.anIntArrayArray41[0][1] = 0;
			this.anIntArrayArray41[0][3] = 0;
			this.anIntArrayArray41[1][3] = 1493;
			this.anIntArrayArray41[1][1] = 0;
			this.anIntArrayArray41[1][2] = 0;
			this.anIntArrayArray41[1][0] = 1843;
			this.anIntArrayArray41[2][3] = 2939;
			this.anIntArrayArray41[2][2] = 0;
			this.anIntArrayArray41[2][1] = 0;
			this.anIntArrayArray41[2][0] = 2457;
			this.anIntArrayArray41[3][2] = 1124;
			this.anIntArrayArray41[3][1] = 0;
			this.anIntArrayArray41[3][0] = 2781;
			this.anIntArrayArray41[3][3] = 3565;
			this.anIntArrayArray41[4][3] = 4031;
			this.anIntArrayArray41[4][2] = 3084;
			this.anIntArrayArray41[4][1] = 546;
			this.anIntArrayArray41[4][0] = 3481;
			this.anIntArrayArray41[5][2] = 4096;
			this.anIntArrayArray41[5][0] = 4096;
			this.anIntArrayArray41[5][3] = 4096;
			this.anIntArrayArray41[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray41 = new int[16][4];
			this.anIntArrayArray41[0][2] = 192;
			this.anIntArrayArray41[0][3] = 321;
			this.anIntArrayArray41[0][1] = 80;
			this.anIntArrayArray41[0][0] = 0;
			this.anIntArrayArray41[1][3] = 562;
			this.anIntArrayArray41[1][2] = 449;
			this.anIntArrayArray41[1][0] = 155;
			this.anIntArrayArray41[1][1] = 321;
			this.anIntArrayArray41[2][1] = 578;
			this.anIntArrayArray41[2][3] = 803;
			this.anIntArrayArray41[2][2] = 690;
			this.anIntArrayArray41[2][0] = 389;
			this.anIntArrayArray41[3][0] = 671;
			this.anIntArrayArray41[3][1] = 947;
			this.anIntArrayArray41[3][3] = 1140;
			this.anIntArrayArray41[3][2] = 995;
			this.anIntArrayArray41[4][1] = 1285;
			this.anIntArrayArray41[4][2] = 1397;
			this.anIntArrayArray41[4][0] = 897;
			this.anIntArrayArray41[4][3] = 1509;
			this.anIntArrayArray41[5][1] = 1525;
			this.anIntArrayArray41[5][0] = 1175;
			this.anIntArrayArray41[5][3] = 1413;
			this.anIntArrayArray41[5][2] = 1429;
			this.anIntArrayArray41[6][0] = 1368;
			this.anIntArrayArray41[6][1] = 1734;
			this.anIntArrayArray41[6][3] = 1333;
			this.anIntArrayArray41[6][2] = 1461;
			this.anIntArrayArray41[7][3] = 1702;
			this.anIntArrayArray41[7][1] = 1413;
			this.anIntArrayArray41[7][2] = 1525;
			this.anIntArrayArray41[7][0] = 1507;
			this.anIntArrayArray41[8][3] = 2056;
			this.anIntArrayArray41[8][2] = 1590;
			this.anIntArrayArray41[8][1] = 1108;
			this.anIntArrayArray41[8][0] = 1736;
			this.anIntArrayArray41[9][0] = 2088;
			this.anIntArrayArray41[9][1] = 1766;
			this.anIntArrayArray41[9][2] = 2056;
			this.anIntArrayArray41[9][3] = 2666;
			this.anIntArrayArray41[10][1] = 2409;
			this.anIntArrayArray41[10][3] = 3276;
			this.anIntArrayArray41[10][2] = 2586;
			this.anIntArrayArray41[10][0] = 2355;
			this.anIntArrayArray41[11][3] = 3228;
			this.anIntArrayArray41[11][0] = 2691;
			this.anIntArrayArray41[11][2] = 3148;
			this.anIntArrayArray41[11][1] = 3116;
			this.anIntArrayArray41[12][3] = 3196;
			this.anIntArrayArray41[12][0] = 3031;
			this.anIntArrayArray41[12][2] = 3710;
			this.anIntArrayArray41[12][1] = 3806;
			this.anIntArrayArray41[13][0] = 3522;
			this.anIntArrayArray41[13][1] = 3437;
			this.anIntArrayArray41[13][3] = 3019;
			this.anIntArrayArray41[13][2] = 3421;
			this.anIntArrayArray41[14][0] = 3727;
			this.anIntArrayArray41[14][3] = 3228;
			this.anIntArrayArray41[14][2] = 3148;
			this.anIntArrayArray41[14][1] = 3116;
			this.anIntArrayArray41[15][1] = 2377;
			this.anIntArrayArray41[15][0] = 4096;
			this.anIntArrayArray41[15][2] = 2505;
			this.anIntArrayArray41[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray41 = new int[4][4];
			this.anIntArrayArray41[0][1] = 0;
			this.anIntArrayArray41[0][2] = 4096;
			this.anIntArrayArray41[0][0] = 2048;
			this.anIntArrayArray41[0][3] = 0;
			this.anIntArrayArray41[1][0] = 2867;
			this.anIntArrayArray41[1][2] = 4096;
			this.anIntArrayArray41[1][1] = 4096;
			this.anIntArrayArray41[1][3] = 0;
			this.anIntArrayArray41[2][3] = 0;
			this.anIntArrayArray41[2][1] = 4096;
			this.anIntArrayArray41[2][2] = 4096;
			this.anIntArrayArray41[2][0] = 3276;
			this.anIntArrayArray41[3][0] = 4096;
			this.anIntArrayArray41[3][3] = 0;
			this.anIntArrayArray41[3][2] = 0;
			this.anIntArrayArray41[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(10) int local10 = arg1.method4487();
		if (local10 != 0) {
			this.method3656(local10);
			return;
		}
		this.anIntArrayArray41 = new int[arg1.method4487()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray41.length; local21++) {
			this.anIntArrayArray41[local21][0] = arg1.method4494();
			this.anIntArrayArray41[local21][1] = arg1.method4487() << 4;
			this.anIntArrayArray41[local21][2] = arg1.method4487() << 4;
			this.anIntArrayArray41[local21][3] = arg1.method4487() << 4;
		}
	}
}
