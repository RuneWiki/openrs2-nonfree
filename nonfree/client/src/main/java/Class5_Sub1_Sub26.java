import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class5_Sub1_Sub26 extends Class5_Sub1 {

	@OriginalMember(owner = "client!or", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!or", name = "L", descriptor = "[I")
	private final int[] anIntArray511 = new int[257];

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(II)V")
	private void method5566(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray54 = new int[2][4];
			this.anIntArrayArray54[0][2] = 0;
			this.anIntArrayArray54[0][1] = 0;
			this.anIntArrayArray54[0][3] = 0;
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[1][2] = 4096;
			this.anIntArrayArray54[1][3] = 4096;
			this.anIntArrayArray54[1][1] = 4096;
			this.anIntArrayArray54[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray54 = new int[8][4];
			this.anIntArrayArray54[0][1] = 2650;
			this.anIntArrayArray54[0][2] = 2602;
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][3] = 2361;
			this.anIntArrayArray54[1][1] = 2313;
			this.anIntArrayArray54[1][3] = 1558;
			this.anIntArrayArray54[1][2] = 1799;
			this.anIntArrayArray54[1][0] = 2867;
			this.anIntArrayArray54[2][1] = 2618;
			this.anIntArrayArray54[2][2] = 1734;
			this.anIntArrayArray54[2][3] = 1413;
			this.anIntArrayArray54[2][0] = 3072;
			this.anIntArrayArray54[3][2] = 1220;
			this.anIntArrayArray54[3][3] = 947;
			this.anIntArrayArray54[3][0] = 3276;
			this.anIntArrayArray54[3][1] = 2296;
			this.anIntArrayArray54[4][0] = 3481;
			this.anIntArrayArray54[4][1] = 2072;
			this.anIntArrayArray54[4][2] = 963;
			this.anIntArrayArray54[4][3] = 722;
			this.anIntArrayArray54[5][3] = 1766;
			this.anIntArrayArray54[5][2] = 2152;
			this.anIntArrayArray54[5][1] = 2730;
			this.anIntArrayArray54[5][0] = 3686;
			this.anIntArrayArray54[6][1] = 2232;
			this.anIntArrayArray54[6][3] = 915;
			this.anIntArrayArray54[6][2] = 1060;
			this.anIntArrayArray54[6][0] = 3891;
			this.anIntArrayArray54[7][3] = 1140;
			this.anIntArrayArray54[7][1] = 1686;
			this.anIntArrayArray54[7][2] = 1413;
			this.anIntArrayArray54[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray54 = new int[7][4];
			this.anIntArrayArray54[0][1] = 0;
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][2] = 0;
			this.anIntArrayArray54[0][3] = 4096;
			this.anIntArrayArray54[1][2] = 4096;
			this.anIntArrayArray54[1][0] = 663;
			this.anIntArrayArray54[1][1] = 0;
			this.anIntArrayArray54[1][3] = 4096;
			this.anIntArrayArray54[2][2] = 4096;
			this.anIntArrayArray54[2][0] = 1363;
			this.anIntArrayArray54[2][3] = 0;
			this.anIntArrayArray54[2][1] = 0;
			this.anIntArrayArray54[3][3] = 0;
			this.anIntArrayArray54[3][1] = 4096;
			this.anIntArrayArray54[3][0] = 2048;
			this.anIntArrayArray54[3][2] = 4096;
			this.anIntArrayArray54[4][0] = 2727;
			this.anIntArrayArray54[4][3] = 0;
			this.anIntArrayArray54[4][1] = 4096;
			this.anIntArrayArray54[4][2] = 0;
			this.anIntArrayArray54[5][3] = 4096;
			this.anIntArrayArray54[5][2] = 0;
			this.anIntArrayArray54[5][0] = 3411;
			this.anIntArrayArray54[5][1] = 4096;
			this.anIntArrayArray54[6][2] = 0;
			this.anIntArrayArray54[6][3] = 4096;
			this.anIntArrayArray54[6][0] = 4096;
			this.anIntArrayArray54[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray54 = new int[6][4];
			this.anIntArrayArray54[0][2] = 0;
			this.anIntArrayArray54[0][1] = 0;
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][3] = 0;
			this.anIntArrayArray54[1][2] = 0;
			this.anIntArrayArray54[1][0] = 1843;
			this.anIntArrayArray54[1][1] = 0;
			this.anIntArrayArray54[1][3] = 1493;
			this.anIntArrayArray54[2][2] = 0;
			this.anIntArrayArray54[2][3] = 2939;
			this.anIntArrayArray54[2][1] = 0;
			this.anIntArrayArray54[2][0] = 2457;
			this.anIntArrayArray54[3][0] = 2781;
			this.anIntArrayArray54[3][1] = 0;
			this.anIntArrayArray54[3][2] = 1124;
			this.anIntArrayArray54[3][3] = 3565;
			this.anIntArrayArray54[4][3] = 4031;
			this.anIntArrayArray54[4][1] = 546;
			this.anIntArrayArray54[4][2] = 3084;
			this.anIntArrayArray54[4][0] = 3481;
			this.anIntArrayArray54[5][3] = 4096;
			this.anIntArrayArray54[5][1] = 4096;
			this.anIntArrayArray54[5][2] = 4096;
			this.anIntArrayArray54[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray54 = new int[16][4];
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][2] = 192;
			this.anIntArrayArray54[0][1] = 80;
			this.anIntArrayArray54[0][3] = 321;
			this.anIntArrayArray54[1][2] = 449;
			this.anIntArrayArray54[1][1] = 321;
			this.anIntArrayArray54[1][0] = 155;
			this.anIntArrayArray54[1][3] = 562;
			this.anIntArrayArray54[2][0] = 389;
			this.anIntArrayArray54[2][2] = 690;
			this.anIntArrayArray54[2][1] = 578;
			this.anIntArrayArray54[2][3] = 803;
			this.anIntArrayArray54[3][0] = 671;
			this.anIntArrayArray54[3][2] = 995;
			this.anIntArrayArray54[3][1] = 947;
			this.anIntArrayArray54[3][3] = 1140;
			this.anIntArrayArray54[4][3] = 1509;
			this.anIntArrayArray54[4][2] = 1397;
			this.anIntArrayArray54[4][0] = 897;
			this.anIntArrayArray54[4][1] = 1285;
			this.anIntArrayArray54[5][3] = 1413;
			this.anIntArrayArray54[5][1] = 1525;
			this.anIntArrayArray54[5][2] = 1429;
			this.anIntArrayArray54[5][0] = 1175;
			this.anIntArrayArray54[6][1] = 1734;
			this.anIntArrayArray54[6][3] = 1333;
			this.anIntArrayArray54[6][0] = 1368;
			this.anIntArrayArray54[6][2] = 1461;
			this.anIntArrayArray54[7][0] = 1507;
			this.anIntArrayArray54[7][2] = 1525;
			this.anIntArrayArray54[7][1] = 1413;
			this.anIntArrayArray54[7][3] = 1702;
			this.anIntArrayArray54[8][0] = 1736;
			this.anIntArrayArray54[8][1] = 1108;
			this.anIntArrayArray54[8][2] = 1590;
			this.anIntArrayArray54[8][3] = 2056;
			this.anIntArrayArray54[9][2] = 2056;
			this.anIntArrayArray54[9][0] = 2088;
			this.anIntArrayArray54[9][3] = 2666;
			this.anIntArrayArray54[9][1] = 1766;
			this.anIntArrayArray54[10][1] = 2409;
			this.anIntArrayArray54[10][0] = 2355;
			this.anIntArrayArray54[10][3] = 3276;
			this.anIntArrayArray54[10][2] = 2586;
			this.anIntArrayArray54[11][3] = 3228;
			this.anIntArrayArray54[11][0] = 2691;
			this.anIntArrayArray54[11][2] = 3148;
			this.anIntArrayArray54[11][1] = 3116;
			this.anIntArrayArray54[12][3] = 3196;
			this.anIntArrayArray54[12][0] = 3031;
			this.anIntArrayArray54[12][2] = 3710;
			this.anIntArrayArray54[12][1] = 3806;
			this.anIntArrayArray54[13][1] = 3437;
			this.anIntArrayArray54[13][2] = 3421;
			this.anIntArrayArray54[13][0] = 3522;
			this.anIntArrayArray54[13][3] = 3019;
			this.anIntArrayArray54[14][3] = 3228;
			this.anIntArrayArray54[14][0] = 3727;
			this.anIntArrayArray54[14][1] = 3116;
			this.anIntArrayArray54[14][2] = 3148;
			this.anIntArrayArray54[15][3] = 2746;
			this.anIntArrayArray54[15][2] = 2505;
			this.anIntArrayArray54[15][0] = 4096;
			this.anIntArrayArray54[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray54 = new int[4][4];
			this.anIntArrayArray54[0][3] = 0;
			this.anIntArrayArray54[0][1] = 0;
			this.anIntArrayArray54[0][2] = 4096;
			this.anIntArrayArray54[0][0] = 2048;
			this.anIntArrayArray54[1][1] = 4096;
			this.anIntArrayArray54[1][2] = 4096;
			this.anIntArrayArray54[1][3] = 0;
			this.anIntArrayArray54[1][0] = 2867;
			this.anIntArrayArray54[2][3] = 0;
			this.anIntArrayArray54[2][2] = 4096;
			this.anIntArrayArray54[2][0] = 3276;
			this.anIntArrayArray54[2][1] = 4096;
			this.anIntArrayArray54[3][3] = 0;
			this.anIntArrayArray54[3][2] = 0;
			this.anIntArrayArray54[3][1] = 4096;
			this.anIntArrayArray54[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(20) int local20 = arg1.method4220();
		if (local20 != 0) {
			this.method5566(local20);
			return;
		}
		this.anIntArrayArray54 = new int[arg1.method4220()][4];
		for (@Pc(39) int local39 = 0; local39 < this.anIntArrayArray54.length; local39++) {
			this.anIntArrayArray54[local39][0] = arg1.method4227();
			this.anIntArrayArray54[local39][1] = arg1.method4220() << 4;
			this.anIntArrayArray54[local39][2] = arg1.method4220() << 4;
			this.anIntArrayArray54[local39][3] = arg1.method4220() << 4;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
	private void method5567() {
		@Pc(16) int local16 = this.anIntArrayArray54.length;
		if (local16 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local16 > local30 && this.anIntArrayArray54[local30][0] <= local28; local30++) {
				local24++;
			}
			@Pc(79) int local79;
			@Pc(75) int local75;
			@Pc(71) int local71;
			@Pc(67) int[] local67;
			if (local24 >= local16) {
				local67 = this.anIntArrayArray54[local16 - 1];
				local71 = local67[3];
				local75 = local67[2];
				local79 = local67[1];
			} else {
				local67 = this.anIntArrayArray54[local24];
				if (local24 <= 0) {
					local75 = local67[2];
					local71 = local67[3];
					local79 = local67[1];
				} else {
					@Pc(112) int[] local112 = this.anIntArrayArray54[local24 - 1];
					@Pc(130) int local130 = (local28 - local112[0] << 12) / (local67[0] - local112[0]);
					@Pc(134) int local134 = 4096 - local130;
					local71 = local134 * local112[3] + local67[3] * local130 >> 12;
					local75 = local130 * local67[2] + local112[2] * local134 >> 12;
					local79 = local134 * local112[1] + local67[1] * local130 >> 12;
				}
			}
			local71 >>= 0x4;
			local75 >>= 0x4;
			local79 >>= 0x4;
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
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 > 255) {
				local79 = 255;
			}
			this.anIntArray511[local20] = local75 << 8 | local79 << 16 | local71;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		if (this.anIntArrayArray54 == null) {
			this.method5566(1);
		}
		this.method5567();
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(29) int[] local29 = this.method7160(0, arg0);
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[2];
			for (@Pc(43) int local43 = 0; local43 < Static147.anInt3075; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray511[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local19;
	}
}
