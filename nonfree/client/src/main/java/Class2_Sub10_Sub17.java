import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class2_Sub10_Sub17 extends Class2_Sub10 {

	@OriginalMember(owner = "client!jo", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "[I")
	private final int[] anIntArray357 = new int[257];

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	private void method4371() {
		@Pc(9) int local9 = this.anIntArrayArray45.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 257; local16++) {
			@Pc(20) int local20 = 0;
			@Pc(24) int local24 = local16 << 4;
			for (@Pc(26) int local26 = 0; local9 > local26 && local24 >= this.anIntArrayArray45[local26][0]; local26++) {
				local20++;
			}
			@Pc(59) int local59;
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(53) int[] local53;
			if (local9 > local20) {
				local53 = this.anIntArrayArray45[local20];
				if (local20 <= 0) {
					local59 = local53[1];
					local63 = local53[2];
					local67 = local53[3];
				} else {
					@Pc(76) int[] local76 = this.anIntArrayArray45[local20 - 1];
					@Pc(94) int local94 = (local24 - local76[0] << 12) / (local53[0] - local76[0]);
					@Pc(99) int local99 = 4096 - local94;
					local63 = local94 * local53[2] + local76[2] * local99 >> 12;
					local67 = local53[3] * local94 + local76[3] * local99 >> 12;
					local59 = local99 * local76[1] + local94 * local53[1] >> 12;
				}
			} else {
				local53 = this.anIntArrayArray45[local9 - 1];
				local67 = local53[3];
				local59 = local53[1];
				local63 = local53[2];
			}
			local67 >>= 0x4;
			local59 >>= 0x4;
			local63 >>= 0x4;
			if (local63 < 0) {
				local63 = 0;
			} else if (local63 > 255) {
				local63 = 255;
			}
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
			this.anIntArray357[local16] = local63 << 8 | local59 << 16 | local67;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(21) int[] local21 = this.method8402(arg0, 0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static93.anInt1862; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray357[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
	private void method4374(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray45 = new int[2][4];
			this.anIntArrayArray45[0][2] = 0;
			this.anIntArrayArray45[0][0] = 0;
			this.anIntArrayArray45[0][1] = 0;
			this.anIntArrayArray45[0][3] = 0;
			this.anIntArrayArray45[1][3] = 4096;
			this.anIntArrayArray45[1][2] = 4096;
			this.anIntArrayArray45[1][1] = 4096;
			this.anIntArrayArray45[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray45 = new int[8][4];
			this.anIntArrayArray45[0][1] = 2650;
			this.anIntArrayArray45[0][2] = 2602;
			this.anIntArrayArray45[0][0] = 0;
			this.anIntArrayArray45[0][3] = 2361;
			this.anIntArrayArray45[1][3] = 1558;
			this.anIntArrayArray45[1][0] = 2867;
			this.anIntArrayArray45[1][1] = 2313;
			this.anIntArrayArray45[1][2] = 1799;
			this.anIntArrayArray45[2][3] = 1413;
			this.anIntArrayArray45[2][0] = 3072;
			this.anIntArrayArray45[2][1] = 2618;
			this.anIntArrayArray45[2][2] = 1734;
			this.anIntArrayArray45[3][3] = 947;
			this.anIntArrayArray45[3][2] = 1220;
			this.anIntArrayArray45[3][0] = 3276;
			this.anIntArrayArray45[3][1] = 2296;
			this.anIntArrayArray45[4][3] = 722;
			this.anIntArrayArray45[4][1] = 2072;
			this.anIntArrayArray45[4][0] = 3481;
			this.anIntArrayArray45[4][2] = 963;
			this.anIntArrayArray45[5][2] = 2152;
			this.anIntArrayArray45[5][1] = 2730;
			this.anIntArrayArray45[5][3] = 1766;
			this.anIntArrayArray45[5][0] = 3686;
			this.anIntArrayArray45[6][1] = 2232;
			this.anIntArrayArray45[6][0] = 3891;
			this.anIntArrayArray45[6][2] = 1060;
			this.anIntArrayArray45[6][3] = 915;
			this.anIntArrayArray45[7][1] = 1686;
			this.anIntArrayArray45[7][0] = 4096;
			this.anIntArrayArray45[7][2] = 1413;
			this.anIntArrayArray45[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray45 = new int[7][4];
			this.anIntArrayArray45[0][2] = 0;
			this.anIntArrayArray45[0][1] = 0;
			this.anIntArrayArray45[0][0] = 0;
			this.anIntArrayArray45[0][3] = 4096;
			this.anIntArrayArray45[1][0] = 663;
			this.anIntArrayArray45[1][3] = 4096;
			this.anIntArrayArray45[1][1] = 0;
			this.anIntArrayArray45[1][2] = 4096;
			this.anIntArrayArray45[2][3] = 0;
			this.anIntArrayArray45[2][0] = 1363;
			this.anIntArrayArray45[2][1] = 0;
			this.anIntArrayArray45[2][2] = 4096;
			this.anIntArrayArray45[3][3] = 0;
			this.anIntArrayArray45[3][0] = 2048;
			this.anIntArrayArray45[3][2] = 4096;
			this.anIntArrayArray45[3][1] = 4096;
			this.anIntArrayArray45[4][1] = 4096;
			this.anIntArrayArray45[4][3] = 0;
			this.anIntArrayArray45[4][0] = 2727;
			this.anIntArrayArray45[4][2] = 0;
			this.anIntArrayArray45[5][0] = 3411;
			this.anIntArrayArray45[5][1] = 4096;
			this.anIntArrayArray45[5][2] = 0;
			this.anIntArrayArray45[5][3] = 4096;
			this.anIntArrayArray45[6][2] = 0;
			this.anIntArrayArray45[6][1] = 0;
			this.anIntArrayArray45[6][0] = 4096;
			this.anIntArrayArray45[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray45 = new int[6][4];
			this.anIntArrayArray45[0][2] = 0;
			this.anIntArrayArray45[0][1] = 0;
			this.anIntArrayArray45[0][0] = 0;
			this.anIntArrayArray45[0][3] = 0;
			this.anIntArrayArray45[1][0] = 1843;
			this.anIntArrayArray45[1][2] = 0;
			this.anIntArrayArray45[1][1] = 0;
			this.anIntArrayArray45[1][3] = 1493;
			this.anIntArrayArray45[2][2] = 0;
			this.anIntArrayArray45[2][3] = 2939;
			this.anIntArrayArray45[2][0] = 2457;
			this.anIntArrayArray45[2][1] = 0;
			this.anIntArrayArray45[3][0] = 2781;
			this.anIntArrayArray45[3][2] = 1124;
			this.anIntArrayArray45[3][3] = 3565;
			this.anIntArrayArray45[3][1] = 0;
			this.anIntArrayArray45[4][3] = 4031;
			this.anIntArrayArray45[4][0] = 3481;
			this.anIntArrayArray45[4][2] = 3084;
			this.anIntArrayArray45[4][1] = 546;
			this.anIntArrayArray45[5][2] = 4096;
			this.anIntArrayArray45[5][0] = 4096;
			this.anIntArrayArray45[5][1] = 4096;
			this.anIntArrayArray45[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray45 = new int[16][4];
			this.anIntArrayArray45[0][2] = 192;
			this.anIntArrayArray45[0][1] = 80;
			this.anIntArrayArray45[0][0] = 0;
			this.anIntArrayArray45[0][3] = 321;
			this.anIntArrayArray45[1][3] = 562;
			this.anIntArrayArray45[1][2] = 449;
			this.anIntArrayArray45[1][1] = 321;
			this.anIntArrayArray45[1][0] = 155;
			this.anIntArrayArray45[2][0] = 389;
			this.anIntArrayArray45[2][3] = 803;
			this.anIntArrayArray45[2][1] = 578;
			this.anIntArrayArray45[2][2] = 690;
			this.anIntArrayArray45[3][0] = 671;
			this.anIntArrayArray45[3][3] = 1140;
			this.anIntArrayArray45[3][2] = 995;
			this.anIntArrayArray45[3][1] = 947;
			this.anIntArrayArray45[4][3] = 1509;
			this.anIntArrayArray45[4][2] = 1397;
			this.anIntArrayArray45[4][0] = 897;
			this.anIntArrayArray45[4][1] = 1285;
			this.anIntArrayArray45[5][3] = 1413;
			this.anIntArrayArray45[5][1] = 1525;
			this.anIntArrayArray45[5][2] = 1429;
			this.anIntArrayArray45[5][0] = 1175;
			this.anIntArrayArray45[6][0] = 1368;
			this.anIntArrayArray45[6][2] = 1461;
			this.anIntArrayArray45[6][3] = 1333;
			this.anIntArrayArray45[6][1] = 1734;
			this.anIntArrayArray45[7][1] = 1413;
			this.anIntArrayArray45[7][3] = 1702;
			this.anIntArrayArray45[7][0] = 1507;
			this.anIntArrayArray45[7][2] = 1525;
			this.anIntArrayArray45[8][0] = 1736;
			this.anIntArrayArray45[8][3] = 2056;
			this.anIntArrayArray45[8][2] = 1590;
			this.anIntArrayArray45[8][1] = 1108;
			this.anIntArrayArray45[9][0] = 2088;
			this.anIntArrayArray45[9][2] = 2056;
			this.anIntArrayArray45[9][1] = 1766;
			this.anIntArrayArray45[9][3] = 2666;
			this.anIntArrayArray45[10][1] = 2409;
			this.anIntArrayArray45[10][2] = 2586;
			this.anIntArrayArray45[10][3] = 3276;
			this.anIntArrayArray45[10][0] = 2355;
			this.anIntArrayArray45[11][0] = 2691;
			this.anIntArrayArray45[11][3] = 3228;
			this.anIntArrayArray45[11][2] = 3148;
			this.anIntArrayArray45[11][1] = 3116;
			this.anIntArrayArray45[12][3] = 3196;
			this.anIntArrayArray45[12][1] = 3806;
			this.anIntArrayArray45[12][0] = 3031;
			this.anIntArrayArray45[12][2] = 3710;
			this.anIntArrayArray45[13][1] = 3437;
			this.anIntArrayArray45[13][2] = 3421;
			this.anIntArrayArray45[13][0] = 3522;
			this.anIntArrayArray45[13][3] = 3019;
			this.anIntArrayArray45[14][0] = 3727;
			this.anIntArrayArray45[14][1] = 3116;
			this.anIntArrayArray45[14][3] = 3228;
			this.anIntArrayArray45[14][2] = 3148;
			this.anIntArrayArray45[15][2] = 2505;
			this.anIntArrayArray45[15][1] = 2377;
			this.anIntArrayArray45[15][3] = 2746;
			this.anIntArrayArray45[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray45 = new int[4][4];
			this.anIntArrayArray45[0][2] = 4096;
			this.anIntArrayArray45[0][0] = 2048;
			this.anIntArrayArray45[0][1] = 0;
			this.anIntArrayArray45[0][3] = 0;
			this.anIntArrayArray45[1][2] = 4096;
			this.anIntArrayArray45[1][0] = 2867;
			this.anIntArrayArray45[1][1] = 4096;
			this.anIntArrayArray45[1][3] = 0;
			this.anIntArrayArray45[2][3] = 0;
			this.anIntArrayArray45[2][0] = 3276;
			this.anIntArrayArray45[2][2] = 4096;
			this.anIntArrayArray45[2][1] = 4096;
			this.anIntArrayArray45[3][1] = 4096;
			this.anIntArrayArray45[3][0] = 4096;
			this.anIntArrayArray45[3][3] = 0;
			this.anIntArrayArray45[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
		if (this.anIntArrayArray45 == null) {
			this.method4374(1);
		}
		this.method4371();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(12) int local12 = arg0.method6904();
		if (local12 != 0) {
			this.method4374(local12);
			return;
		}
		this.anIntArrayArray45 = new int[arg0.method6904()][4];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArrayArray45.length; local23++) {
			this.anIntArrayArray45[local23][0] = arg0.method6884();
			this.anIntArrayArray45[local23][1] = arg0.method6904() << 4;
			this.anIntArrayArray45[local23][2] = arg0.method6904() << 4;
			this.anIntArrayArray45[local23][3] = arg0.method6904() << 4;
		}
	}
}
