import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class1_Sub3_Sub34 extends Class1_Sub3 {

	@OriginalMember(owner = "client!tk", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!tk", name = "O", descriptor = "[I")
	private int[] anIntArray434 = new int[257];

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(7) int local7 = arg0.method1772();
		if (local7 != 0) {
			this.method3841(local7);
			return;
		}
		this.anIntArrayArray36 = new int[arg0.method1772()][4];
		for (@Pc(18) int local18 = 0; local18 < this.anIntArrayArray36.length; local18++) {
			this.anIntArrayArray36[local18][0] = arg0.method1764();
			this.anIntArrayArray36[local18][1] = arg0.method1772() << 4;
			this.anIntArrayArray36[local18][2] = arg0.method1772() << 4;
			this.anIntArrayArray36[local18][3] = arg0.method1772() << 4;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
	private void method3839() {
		@Pc(9) int local9 = this.anIntArrayArray36.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 257; local16++) {
			@Pc(20) int local20 = 0;
			@Pc(24) int local24 = local16 << 4;
			for (@Pc(26) int local26 = 0; local26 < local9 && this.anIntArrayArray36[local26][0] <= local24; local26++) {
				local20++;
			}
			@Pc(59) int local59;
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(55) int[] local55;
			if (local9 <= local20) {
				local55 = this.anIntArrayArray36[local9 - 1];
				local59 = local55[1];
				local63 = local55[2];
				local67 = local55[3];
			} else {
				local55 = this.anIntArrayArray36[local20];
				if (local20 <= 0) {
					local59 = local55[1];
					local63 = local55[2];
					local67 = local55[3];
				} else {
					@Pc(100) int[] local100 = this.anIntArrayArray36[local20 - 1];
					@Pc(118) int local118 = (local24 - local100[0] << 12) / (local55[0] - local100[0]);
					@Pc(123) int local123 = 4096 - local118;
					local59 = local100[1] * local123 + local118 * local55[1] >> 12;
					local67 = local118 * local55[3] + local100[3] * local123 >> 12;
					local63 = local123 * local100[2] + local55[2] * local118 >> 12;
				}
			}
			local67 >>= 0x4;
			local59 >>= 0x4;
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
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			this.anIntArray434[local16] = local59 << 16 | local63 << 8 | local67;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(29) int[] local29 = this.method4117(0, arg0);
			@Pc(33) int[] local33 = local19[2];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[0];
			for (@Pc(43) int local43 = 0; local43 < Static110.anInt2934; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray434[local51];
				local41[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local33[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
	@Override
	public void method4118() {
		if (this.anIntArrayArray36 == null) {
			this.method3841(1);
		}
		this.method3839();
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V")
	private void method3841(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray36 = new int[2][4];
			this.anIntArrayArray36[0][3] = 0;
			this.anIntArrayArray36[0][2] = 0;
			this.anIntArrayArray36[1][3] = 4096;
			this.anIntArrayArray36[0][1] = 0;
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[1][2] = 4096;
			this.anIntArrayArray36[1][1] = 4096;
			this.anIntArrayArray36[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray36 = new int[8][4];
			this.anIntArrayArray36[0][3] = 2361;
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[0][1] = 2650;
			this.anIntArrayArray36[1][1] = 2313;
			this.anIntArrayArray36[1][3] = 1558;
			this.anIntArrayArray36[2][1] = 2618;
			this.anIntArrayArray36[0][2] = 2602;
			this.anIntArrayArray36[1][2] = 1799;
			this.anIntArrayArray36[2][3] = 1413;
			this.anIntArrayArray36[2][2] = 1734;
			this.anIntArrayArray36[3][2] = 1220;
			this.anIntArrayArray36[1][0] = 2867;
			this.anIntArrayArray36[3][3] = 947;
			this.anIntArrayArray36[3][1] = 2296;
			this.anIntArrayArray36[4][2] = 963;
			this.anIntArrayArray36[5][2] = 2152;
			this.anIntArrayArray36[4][3] = 722;
			this.anIntArrayArray36[2][0] = 3072;
			this.anIntArrayArray36[5][3] = 1766;
			this.anIntArrayArray36[6][2] = 1060;
			this.anIntArrayArray36[7][2] = 1413;
			this.anIntArrayArray36[6][3] = 915;
			this.anIntArrayArray36[7][3] = 1140;
			this.anIntArrayArray36[4][1] = 2072;
			this.anIntArrayArray36[5][1] = 2730;
			this.anIntArrayArray36[3][0] = 3276;
			this.anIntArrayArray36[4][0] = 3481;
			this.anIntArrayArray36[5][0] = 3686;
			this.anIntArrayArray36[6][1] = 2232;
			this.anIntArrayArray36[6][0] = 3891;
			this.anIntArrayArray36[7][1] = 1686;
			this.anIntArrayArray36[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray36 = new int[7][4];
			this.anIntArrayArray36[0][3] = 4096;
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[1][0] = 663;
			this.anIntArrayArray36[2][0] = 1363;
			this.anIntArrayArray36[1][3] = 4096;
			this.anIntArrayArray36[3][0] = 2048;
			this.anIntArrayArray36[4][0] = 2727;
			this.anIntArrayArray36[0][2] = 0;
			this.anIntArrayArray36[0][1] = 0;
			this.anIntArrayArray36[1][2] = 4096;
			this.anIntArrayArray36[2][2] = 4096;
			this.anIntArrayArray36[3][2] = 4096;
			this.anIntArrayArray36[2][3] = 0;
			this.anIntArrayArray36[5][0] = 3411;
			this.anIntArrayArray36[1][1] = 0;
			this.anIntArrayArray36[4][2] = 0;
			this.anIntArrayArray36[6][0] = 4096;
			this.anIntArrayArray36[5][2] = 0;
			this.anIntArrayArray36[3][3] = 0;
			this.anIntArrayArray36[6][2] = 0;
			this.anIntArrayArray36[2][1] = 0;
			this.anIntArrayArray36[3][1] = 4096;
			this.anIntArrayArray36[4][1] = 4096;
			this.anIntArrayArray36[4][3] = 0;
			this.anIntArrayArray36[5][3] = 4096;
			this.anIntArrayArray36[5][1] = 4096;
			this.anIntArrayArray36[6][1] = 0;
			this.anIntArrayArray36[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray36 = new int[6][4];
			this.anIntArrayArray36[0][3] = 0;
			this.anIntArrayArray36[0][2] = 0;
			this.anIntArrayArray36[0][1] = 0;
			this.anIntArrayArray36[1][2] = 0;
			this.anIntArrayArray36[1][3] = 1493;
			this.anIntArrayArray36[2][3] = 2939;
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[1][0] = 1843;
			this.anIntArrayArray36[3][3] = 3565;
			this.anIntArrayArray36[4][3] = 4031;
			this.anIntArrayArray36[1][1] = 0;
			this.anIntArrayArray36[2][1] = 0;
			this.anIntArrayArray36[5][3] = 4096;
			this.anIntArrayArray36[2][0] = 2457;
			this.anIntArrayArray36[3][1] = 0;
			this.anIntArrayArray36[3][0] = 2781;
			this.anIntArrayArray36[4][1] = 546;
			this.anIntArrayArray36[5][1] = 4096;
			this.anIntArrayArray36[4][0] = 3481;
			this.anIntArrayArray36[5][0] = 4096;
			this.anIntArrayArray36[2][2] = 0;
			this.anIntArrayArray36[3][2] = 1124;
			this.anIntArrayArray36[4][2] = 3084;
			this.anIntArrayArray36[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray36 = new int[16][4];
			this.anIntArrayArray36[0][1] = 80;
			this.anIntArrayArray36[0][2] = 192;
			this.anIntArrayArray36[0][0] = 0;
			this.anIntArrayArray36[0][3] = 321;
			this.anIntArrayArray36[1][1] = 321;
			this.anIntArrayArray36[2][1] = 578;
			this.anIntArrayArray36[1][0] = 155;
			this.anIntArrayArray36[1][3] = 562;
			this.anIntArrayArray36[1][2] = 449;
			this.anIntArrayArray36[2][2] = 690;
			this.anIntArrayArray36[2][0] = 389;
			this.anIntArrayArray36[3][0] = 671;
			this.anIntArrayArray36[3][2] = 995;
			this.anIntArrayArray36[3][1] = 947;
			this.anIntArrayArray36[4][1] = 1285;
			this.anIntArrayArray36[4][0] = 897;
			this.anIntArrayArray36[5][0] = 1175;
			this.anIntArrayArray36[5][1] = 1525;
			this.anIntArrayArray36[2][3] = 803;
			this.anIntArrayArray36[6][0] = 1368;
			this.anIntArrayArray36[7][0] = 1507;
			this.anIntArrayArray36[3][3] = 1140;
			this.anIntArrayArray36[4][3] = 1509;
			this.anIntArrayArray36[6][1] = 1734;
			this.anIntArrayArray36[5][3] = 1413;
			this.anIntArrayArray36[8][0] = 1736;
			this.anIntArrayArray36[7][1] = 1413;
			this.anIntArrayArray36[6][3] = 1333;
			this.anIntArrayArray36[8][1] = 1108;
			this.anIntArrayArray36[9][1] = 1766;
			this.anIntArrayArray36[4][2] = 1397;
			this.anIntArrayArray36[5][2] = 1429;
			this.anIntArrayArray36[7][3] = 1702;
			this.anIntArrayArray36[9][0] = 2088;
			this.anIntArrayArray36[10][1] = 2409;
			this.anIntArrayArray36[8][3] = 2056;
			this.anIntArrayArray36[6][2] = 1461;
			this.anIntArrayArray36[7][2] = 1525;
			this.anIntArrayArray36[8][2] = 1590;
			this.anIntArrayArray36[11][1] = 3116;
			this.anIntArrayArray36[10][0] = 2355;
			this.anIntArrayArray36[9][3] = 2666;
			this.anIntArrayArray36[10][3] = 3276;
			this.anIntArrayArray36[12][1] = 3806;
			this.anIntArrayArray36[11][3] = 3228;
			this.anIntArrayArray36[13][1] = 3437;
			this.anIntArrayArray36[9][2] = 2056;
			this.anIntArrayArray36[14][1] = 3116;
			this.anIntArrayArray36[11][0] = 2691;
			this.anIntArrayArray36[12][0] = 3031;
			this.anIntArrayArray36[13][0] = 3522;
			this.anIntArrayArray36[15][1] = 2377;
			this.anIntArrayArray36[12][3] = 3196;
			this.anIntArrayArray36[14][0] = 3727;
			this.anIntArrayArray36[15][0] = 4096;
			this.anIntArrayArray36[13][3] = 3019;
			this.anIntArrayArray36[14][3] = 3228;
			this.anIntArrayArray36[15][3] = 2746;
			this.anIntArrayArray36[10][2] = 2586;
			this.anIntArrayArray36[11][2] = 3148;
			this.anIntArrayArray36[12][2] = 3710;
			this.anIntArrayArray36[13][2] = 3421;
			this.anIntArrayArray36[14][2] = 3148;
			this.anIntArrayArray36[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray36 = new int[4][4];
			this.anIntArrayArray36[0][1] = 0;
			this.anIntArrayArray36[0][3] = 0;
			this.anIntArrayArray36[0][0] = 2048;
			this.anIntArrayArray36[1][3] = 0;
			this.anIntArrayArray36[1][1] = 4096;
			this.anIntArrayArray36[2][1] = 4096;
			this.anIntArrayArray36[2][3] = 0;
			this.anIntArrayArray36[1][0] = 2867;
			this.anIntArrayArray36[2][0] = 3276;
			this.anIntArrayArray36[3][1] = 4096;
			this.anIntArrayArray36[3][0] = 4096;
			this.anIntArrayArray36[0][2] = 4096;
			this.anIntArrayArray36[1][2] = 4096;
			this.anIntArrayArray36[3][3] = 0;
			this.anIntArrayArray36[2][2] = 4096;
			this.anIntArrayArray36[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
