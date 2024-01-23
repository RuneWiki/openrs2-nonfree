import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class4_Sub6_Sub10 extends Class4_Sub6 {

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "[I")
	private int[] anIntArray145 = new int[257];

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
		if (this.anIntArrayArray16 == null) {
			this.method1119(1);
		}
		this.method1126();
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V")
	private void method1119(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray16 = new int[2][4];
			this.anIntArrayArray16[0][2] = 0;
			this.anIntArrayArray16[0][3] = 0;
			this.anIntArrayArray16[1][2] = 4096;
			this.anIntArrayArray16[0][1] = 0;
			this.anIntArrayArray16[1][1] = 4096;
			this.anIntArrayArray16[0][0] = 0;
			this.anIntArrayArray16[1][0] = 4096;
			this.anIntArrayArray16[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray16 = new int[8][4];
			this.anIntArrayArray16[0][2] = 2602;
			this.anIntArrayArray16[0][0] = 0;
			this.anIntArrayArray16[1][2] = 1799;
			this.anIntArrayArray16[2][2] = 1734;
			this.anIntArrayArray16[0][1] = 2650;
			this.anIntArrayArray16[1][0] = 2867;
			this.anIntArrayArray16[3][2] = 1220;
			this.anIntArrayArray16[1][1] = 2313;
			this.anIntArrayArray16[0][3] = 2361;
			this.anIntArrayArray16[4][2] = 963;
			this.anIntArrayArray16[2][1] = 2618;
			this.anIntArrayArray16[5][2] = 2152;
			this.anIntArrayArray16[3][1] = 2296;
			this.anIntArrayArray16[1][3] = 1558;
			this.anIntArrayArray16[4][1] = 2072;
			this.anIntArrayArray16[2][3] = 1413;
			this.anIntArrayArray16[2][0] = 3072;
			this.anIntArrayArray16[3][3] = 947;
			this.anIntArrayArray16[5][1] = 2730;
			this.anIntArrayArray16[4][3] = 722;
			this.anIntArrayArray16[3][0] = 3276;
			this.anIntArrayArray16[5][3] = 1766;
			this.anIntArrayArray16[6][3] = 915;
			this.anIntArrayArray16[6][2] = 1060;
			this.anIntArrayArray16[7][3] = 1140;
			this.anIntArrayArray16[7][2] = 1413;
			this.anIntArrayArray16[6][1] = 2232;
			this.anIntArrayArray16[4][0] = 3481;
			this.anIntArrayArray16[5][0] = 3686;
			this.anIntArrayArray16[6][0] = 3891;
			this.anIntArrayArray16[7][1] = 1686;
			this.anIntArrayArray16[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray16 = new int[7][4];
			this.anIntArrayArray16[0][1] = 0;
			this.anIntArrayArray16[0][0] = 0;
			this.anIntArrayArray16[1][0] = 663;
			this.anIntArrayArray16[2][0] = 1363;
			this.anIntArrayArray16[1][1] = 0;
			this.anIntArrayArray16[0][2] = 0;
			this.anIntArrayArray16[2][1] = 0;
			this.anIntArrayArray16[3][1] = 4096;
			this.anIntArrayArray16[1][2] = 4096;
			this.anIntArrayArray16[3][0] = 2048;
			this.anIntArrayArray16[2][2] = 4096;
			this.anIntArrayArray16[3][2] = 4096;
			this.anIntArrayArray16[4][1] = 4096;
			this.anIntArrayArray16[5][1] = 4096;
			this.anIntArrayArray16[4][2] = 0;
			this.anIntArrayArray16[5][2] = 0;
			this.anIntArrayArray16[6][1] = 0;
			this.anIntArrayArray16[4][0] = 2727;
			this.anIntArrayArray16[0][3] = 4096;
			this.anIntArrayArray16[6][2] = 0;
			this.anIntArrayArray16[5][0] = 3411;
			this.anIntArrayArray16[6][0] = 4096;
			this.anIntArrayArray16[1][3] = 4096;
			this.anIntArrayArray16[2][3] = 0;
			this.anIntArrayArray16[3][3] = 0;
			this.anIntArrayArray16[4][3] = 0;
			this.anIntArrayArray16[5][3] = 4096;
			this.anIntArrayArray16[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray16 = new int[6][4];
			this.anIntArrayArray16[0][3] = 0;
			this.anIntArrayArray16[0][0] = 0;
			this.anIntArrayArray16[1][3] = 1493;
			this.anIntArrayArray16[0][1] = 0;
			this.anIntArrayArray16[1][0] = 1843;
			this.anIntArrayArray16[0][2] = 0;
			this.anIntArrayArray16[1][1] = 0;
			this.anIntArrayArray16[1][2] = 0;
			this.anIntArrayArray16[2][1] = 0;
			this.anIntArrayArray16[3][1] = 0;
			this.anIntArrayArray16[2][0] = 2457;
			this.anIntArrayArray16[2][3] = 2939;
			this.anIntArrayArray16[2][2] = 0;
			this.anIntArrayArray16[4][1] = 546;
			this.anIntArrayArray16[3][3] = 3565;
			this.anIntArrayArray16[5][1] = 4096;
			this.anIntArrayArray16[4][3] = 4031;
			this.anIntArrayArray16[3][2] = 1124;
			this.anIntArrayArray16[3][0] = 2781;
			this.anIntArrayArray16[4][0] = 3481;
			this.anIntArrayArray16[5][0] = 4096;
			this.anIntArrayArray16[4][2] = 3084;
			this.anIntArrayArray16[5][3] = 4096;
			this.anIntArrayArray16[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray16 = new int[16][4];
			this.anIntArrayArray16[0][3] = 321;
			this.anIntArrayArray16[0][0] = 0;
			this.anIntArrayArray16[0][1] = 80;
			this.anIntArrayArray16[1][1] = 321;
			this.anIntArrayArray16[1][0] = 155;
			this.anIntArrayArray16[2][1] = 578;
			this.anIntArrayArray16[1][3] = 562;
			this.anIntArrayArray16[2][3] = 803;
			this.anIntArrayArray16[3][1] = 947;
			this.anIntArrayArray16[0][2] = 192;
			this.anIntArrayArray16[2][0] = 389;
			this.anIntArrayArray16[4][1] = 1285;
			this.anIntArrayArray16[3][0] = 671;
			this.anIntArrayArray16[1][2] = 449;
			this.anIntArrayArray16[3][3] = 1140;
			this.anIntArrayArray16[2][2] = 690;
			this.anIntArrayArray16[4][3] = 1509;
			this.anIntArrayArray16[5][3] = 1413;
			this.anIntArrayArray16[3][2] = 995;
			this.anIntArrayArray16[6][3] = 1333;
			this.anIntArrayArray16[4][0] = 897;
			this.anIntArrayArray16[7][3] = 1702;
			this.anIntArrayArray16[8][3] = 2056;
			this.anIntArrayArray16[5][0] = 1175;
			this.anIntArrayArray16[6][0] = 1368;
			this.anIntArrayArray16[9][3] = 2666;
			this.anIntArrayArray16[7][0] = 1507;
			this.anIntArrayArray16[5][1] = 1525;
			this.anIntArrayArray16[4][2] = 1397;
			this.anIntArrayArray16[6][1] = 1734;
			this.anIntArrayArray16[8][0] = 1736;
			this.anIntArrayArray16[10][3] = 3276;
			this.anIntArrayArray16[5][2] = 1429;
			this.anIntArrayArray16[6][2] = 1461;
			this.anIntArrayArray16[7][2] = 1525;
			this.anIntArrayArray16[8][2] = 1590;
			this.anIntArrayArray16[7][1] = 1413;
			this.anIntArrayArray16[8][1] = 1108;
			this.anIntArrayArray16[9][1] = 1766;
			this.anIntArrayArray16[9][2] = 2056;
			this.anIntArrayArray16[10][2] = 2586;
			this.anIntArrayArray16[9][0] = 2088;
			this.anIntArrayArray16[11][2] = 3148;
			this.anIntArrayArray16[10][0] = 2355;
			this.anIntArrayArray16[11][0] = 2691;
			this.anIntArrayArray16[12][0] = 3031;
			this.anIntArrayArray16[13][0] = 3522;
			this.anIntArrayArray16[14][0] = 3727;
			this.anIntArrayArray16[11][3] = 3228;
			this.anIntArrayArray16[12][2] = 3710;
			this.anIntArrayArray16[13][2] = 3421;
			this.anIntArrayArray16[12][3] = 3196;
			this.anIntArrayArray16[15][0] = 4096;
			this.anIntArrayArray16[10][1] = 2409;
			this.anIntArrayArray16[13][3] = 3019;
			this.anIntArrayArray16[11][1] = 3116;
			this.anIntArrayArray16[12][1] = 3806;
			this.anIntArrayArray16[13][1] = 3437;
			this.anIntArrayArray16[14][2] = 3148;
			this.anIntArrayArray16[14][1] = 3116;
			this.anIntArrayArray16[14][3] = 3228;
			this.anIntArrayArray16[15][2] = 2505;
			this.anIntArrayArray16[15][3] = 2746;
			this.anIntArrayArray16[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray16 = new int[4][4];
			this.anIntArrayArray16[0][3] = 0;
			this.anIntArrayArray16[0][0] = 2048;
			this.anIntArrayArray16[0][1] = 0;
			this.anIntArrayArray16[1][0] = 2867;
			this.anIntArrayArray16[1][3] = 0;
			this.anIntArrayArray16[2][0] = 3276;
			this.anIntArrayArray16[3][0] = 4096;
			this.anIntArrayArray16[0][2] = 4096;
			this.anIntArrayArray16[1][1] = 4096;
			this.anIntArrayArray16[1][2] = 4096;
			this.anIntArrayArray16[2][2] = 4096;
			this.anIntArrayArray16[3][2] = 0;
			this.anIntArrayArray16[2][3] = 0;
			this.anIntArrayArray16[2][1] = 4096;
			this.anIntArrayArray16[3][3] = 0;
			this.anIntArrayArray16[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(28) int[] local28 = this.method4372(0, arg0);
			@Pc(32) int[] local32 = local18[0];
			@Pc(36) int[] local36 = local18[1];
			@Pc(40) int[] local40 = local18[2];
			for (@Pc(42) int local42 = 0; local42 < Static2.anInt19; local42++) {
				@Pc(51) int local51 = local28[local42] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray145[local51];
				local32[local42] = local51 >> 12 & 0xFF0;
				local36[local42] = local51 >> 4 & 0xFF0;
				local40[local42] = (local51 & 0xFF) << 4;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
	private void method1126() {
		@Pc(9) int local9 = this.anIntArrayArray16.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 257; local15++) {
			@Pc(20) int local20 = 0;
			@Pc(24) int local24 = local15 << 4;
			for (@Pc(26) int local26 = 0; local26 < local9 && local24 >= this.anIntArrayArray16[local26][0]; local26++) {
				local20++;
			}
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(59) int local59;
			@Pc(55) int[] local55;
			if (local20 >= local9) {
				local55 = this.anIntArrayArray16[local9 - 1];
				local59 = local55[3];
				local63 = local55[1];
				local67 = local55[2];
			} else {
				local55 = this.anIntArrayArray16[local20];
				if (local20 > 0) {
					@Pc(82) int[] local82 = this.anIntArrayArray16[local20 - 1];
					@Pc(100) int local100 = (local24 - local82[0] << 12) / (local55[0] - local82[0]);
					@Pc(105) int local105 = 4096 - local100;
					local59 = local82[3] * local105 + local100 * local55[3] >> 12;
					local63 = local105 * local82[1] + local55[1] * local100 >> 12;
					local67 = local55[2] * local100 + local105 * local82[2] >> 12;
				} else {
					local63 = local55[1];
					local59 = local55[3];
					local67 = local55[2];
				}
			}
			local67 >>= 0x4;
			local59 >>= 0x4;
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			if (local67 < 0) {
				local67 = 0;
			} else if (local67 > 255) {
				local67 = 255;
			}
			local63 >>= 0x4;
			if (local63 < 0) {
				local63 = 0;
			} else if (local63 > 255) {
				local63 = 255;
			}
			this.anIntArray145[local15] = local59 | local67 << 8 | local63 << 16;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(28) int local28 = arg0.method1874();
		if (local28 != 0) {
			this.method1119(local28);
			return;
		}
		this.anIntArrayArray16 = new int[arg0.method1874()][4];
		for (@Pc(42) int local42 = 0; local42 < this.anIntArrayArray16.length; local42++) {
			this.anIntArrayArray16[local42][0] = arg0.method1837();
			this.anIntArrayArray16[local42][1] = arg0.method1874() << 4;
			this.anIntArrayArray16[local42][2] = arg0.method1874() << 4;
			this.anIntArrayArray16[local42][3] = arg0.method1874() << 4;
		}
	}
}
