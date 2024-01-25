import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class6_Sub5_Sub30 extends Class6_Sub5 {

	@OriginalMember(owner = "client!td", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "[I")
	private final int[] anIntArray462 = new int[257];

	static {
		new Class267("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
		if (this.anIntArrayArray45 == null) {
			this.method5634(1);
		}
		this.method5633();
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
	private void method5633() {
		@Pc(9) int local9 = this.anIntArrayArray45.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 257; local16++) {
			@Pc(20) int local20 = 0;
			@Pc(24) int local24 = local16 << 4;
			for (@Pc(26) int local26 = 0; local26 < local9 && this.anIntArrayArray45[local26][0] <= local24; local26++) {
				local20++;
			}
			@Pc(75) int local75;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(63) int[] local63;
			if (local9 <= local20) {
				local63 = this.anIntArrayArray45[local9 - 1];
				local67 = local63[2];
				local71 = local63[3];
				local75 = local63[1];
			} else {
				local63 = this.anIntArrayArray45[local20];
				if (local20 > 0) {
					@Pc(94) int[] local94 = this.anIntArrayArray45[local20 - 1];
					@Pc(112) int local112 = (local24 - local94[0] << 12) / (local63[0] - local94[0]);
					@Pc(117) int local117 = 4096 - local112;
					local71 = local63[3] * local112 + local94[3] * local117 >> 12;
					local67 = local117 * local94[2] + local63[2] * local112 >> 12;
					local75 = local94[1] * local117 + local112 * local63[1] >> 12;
				} else {
					local75 = local63[1];
					local71 = local63[3];
					local67 = local63[2];
				}
			}
			local75 >>= 0x4;
			local67 >>= 0x4;
			local71 >>= 0x4;
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 > 255) {
				local75 = 255;
			}
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
			this.anIntArray462[local16] = local67 << 8 | local75 << 16 | local71;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(18) int local18 = arg1.method6433();
		if (local18 != 0) {
			this.method5634(local18);
			return;
		}
		this.anIntArrayArray45 = new int[arg1.method6433()][4];
		for (@Pc(39) int local39 = 0; local39 < this.anIntArrayArray45.length; local39++) {
			this.anIntArrayArray45[local39][0] = arg1.method6485();
			this.anIntArrayArray45[local39][1] = arg1.method6433() << 4;
			this.anIntArrayArray45[local39][2] = arg1.method6433() << 4;
			this.anIntArrayArray45[local39][3] = arg1.method6433() << 4;
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(II)V")
	private void method5634(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray45 = new int[2][4];
			this.anIntArrayArray45[0][3] = 0;
			this.anIntArrayArray45[0][1] = 0;
			this.anIntArrayArray45[0][2] = 0;
			this.anIntArrayArray45[0][0] = 0;
			this.anIntArrayArray45[1][1] = 4096;
			this.anIntArrayArray45[1][0] = 4096;
			this.anIntArrayArray45[1][3] = 4096;
			this.anIntArrayArray45[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray45 = new int[8][4];
			this.anIntArrayArray45[0][1] = 2650;
			this.anIntArrayArray45[0][0] = 0;
			this.anIntArrayArray45[0][3] = 2361;
			this.anIntArrayArray45[0][2] = 2602;
			this.anIntArrayArray45[1][2] = 1799;
			this.anIntArrayArray45[1][1] = 2313;
			this.anIntArrayArray45[1][3] = 1558;
			this.anIntArrayArray45[1][0] = 2867;
			this.anIntArrayArray45[2][0] = 3072;
			this.anIntArrayArray45[2][3] = 1413;
			this.anIntArrayArray45[2][1] = 2618;
			this.anIntArrayArray45[2][2] = 1734;
			this.anIntArrayArray45[3][3] = 947;
			this.anIntArrayArray45[3][2] = 1220;
			this.anIntArrayArray45[3][0] = 3276;
			this.anIntArrayArray45[3][1] = 2296;
			this.anIntArrayArray45[4][0] = 3481;
			this.anIntArrayArray45[4][2] = 963;
			this.anIntArrayArray45[4][1] = 2072;
			this.anIntArrayArray45[4][3] = 722;
			this.anIntArrayArray45[5][2] = 2152;
			this.anIntArrayArray45[5][3] = 1766;
			this.anIntArrayArray45[5][0] = 3686;
			this.anIntArrayArray45[5][1] = 2730;
			this.anIntArrayArray45[6][0] = 3891;
			this.anIntArrayArray45[6][1] = 2232;
			this.anIntArrayArray45[6][3] = 915;
			this.anIntArrayArray45[6][2] = 1060;
			this.anIntArrayArray45[7][3] = 1140;
			this.anIntArrayArray45[7][0] = 4096;
			this.anIntArrayArray45[7][1] = 1686;
			this.anIntArrayArray45[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray45 = new int[7][4];
			this.anIntArrayArray45[0][0] = 0;
			this.anIntArrayArray45[0][3] = 4096;
			this.anIntArrayArray45[0][1] = 0;
			this.anIntArrayArray45[0][2] = 0;
			this.anIntArrayArray45[1][2] = 4096;
			this.anIntArrayArray45[1][3] = 4096;
			this.anIntArrayArray45[1][1] = 0;
			this.anIntArrayArray45[1][0] = 663;
			this.anIntArrayArray45[2][3] = 0;
			this.anIntArrayArray45[2][2] = 4096;
			this.anIntArrayArray45[2][1] = 0;
			this.anIntArrayArray45[2][0] = 1363;
			this.anIntArrayArray45[3][0] = 2048;
			this.anIntArrayArray45[3][1] = 4096;
			this.anIntArrayArray45[3][2] = 4096;
			this.anIntArrayArray45[3][3] = 0;
			this.anIntArrayArray45[4][0] = 2727;
			this.anIntArrayArray45[4][1] = 4096;
			this.anIntArrayArray45[4][3] = 0;
			this.anIntArrayArray45[4][2] = 0;
			this.anIntArrayArray45[5][3] = 4096;
			this.anIntArrayArray45[5][1] = 4096;
			this.anIntArrayArray45[5][2] = 0;
			this.anIntArrayArray45[5][0] = 3411;
			this.anIntArrayArray45[6][3] = 4096;
			this.anIntArrayArray45[6][1] = 0;
			this.anIntArrayArray45[6][2] = 0;
			this.anIntArrayArray45[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray45 = new int[6][4];
			this.anIntArrayArray45[0][1] = 0;
			this.anIntArrayArray45[0][3] = 0;
			this.anIntArrayArray45[0][2] = 0;
			this.anIntArrayArray45[0][0] = 0;
			this.anIntArrayArray45[1][2] = 0;
			this.anIntArrayArray45[1][3] = 1493;
			this.anIntArrayArray45[1][1] = 0;
			this.anIntArrayArray45[1][0] = 1843;
			this.anIntArrayArray45[2][2] = 0;
			this.anIntArrayArray45[2][0] = 2457;
			this.anIntArrayArray45[2][1] = 0;
			this.anIntArrayArray45[2][3] = 2939;
			this.anIntArrayArray45[3][0] = 2781;
			this.anIntArrayArray45[3][3] = 3565;
			this.anIntArrayArray45[3][2] = 1124;
			this.anIntArrayArray45[3][1] = 0;
			this.anIntArrayArray45[4][3] = 4031;
			this.anIntArrayArray45[4][2] = 3084;
			this.anIntArrayArray45[4][1] = 546;
			this.anIntArrayArray45[4][0] = 3481;
			this.anIntArrayArray45[5][1] = 4096;
			this.anIntArrayArray45[5][0] = 4096;
			this.anIntArrayArray45[5][3] = 4096;
			this.anIntArrayArray45[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray45 = new int[16][4];
			this.anIntArrayArray45[0][3] = 321;
			this.anIntArrayArray45[0][0] = 0;
			this.anIntArrayArray45[0][2] = 192;
			this.anIntArrayArray45[0][1] = 80;
			this.anIntArrayArray45[1][3] = 562;
			this.anIntArrayArray45[1][0] = 155;
			this.anIntArrayArray45[1][1] = 321;
			this.anIntArrayArray45[1][2] = 449;
			this.anIntArrayArray45[2][3] = 803;
			this.anIntArrayArray45[2][0] = 389;
			this.anIntArrayArray45[2][2] = 690;
			this.anIntArrayArray45[2][1] = 578;
			this.anIntArrayArray45[3][3] = 1140;
			this.anIntArrayArray45[3][2] = 995;
			this.anIntArrayArray45[3][0] = 671;
			this.anIntArrayArray45[3][1] = 947;
			this.anIntArrayArray45[4][0] = 897;
			this.anIntArrayArray45[4][3] = 1509;
			this.anIntArrayArray45[4][1] = 1285;
			this.anIntArrayArray45[4][2] = 1397;
			this.anIntArrayArray45[5][0] = 1175;
			this.anIntArrayArray45[5][3] = 1413;
			this.anIntArrayArray45[5][2] = 1429;
			this.anIntArrayArray45[5][1] = 1525;
			this.anIntArrayArray45[6][0] = 1368;
			this.anIntArrayArray45[6][3] = 1333;
			this.anIntArrayArray45[6][2] = 1461;
			this.anIntArrayArray45[6][1] = 1734;
			this.anIntArrayArray45[7][1] = 1413;
			this.anIntArrayArray45[7][3] = 1702;
			this.anIntArrayArray45[7][0] = 1507;
			this.anIntArrayArray45[7][2] = 1525;
			this.anIntArrayArray45[8][2] = 1590;
			this.anIntArrayArray45[8][1] = 1108;
			this.anIntArrayArray45[8][0] = 1736;
			this.anIntArrayArray45[8][3] = 2056;
			this.anIntArrayArray45[9][3] = 2666;
			this.anIntArrayArray45[9][1] = 1766;
			this.anIntArrayArray45[9][2] = 2056;
			this.anIntArrayArray45[9][0] = 2088;
			this.anIntArrayArray45[10][0] = 2355;
			this.anIntArrayArray45[10][2] = 2586;
			this.anIntArrayArray45[10][1] = 2409;
			this.anIntArrayArray45[10][3] = 3276;
			this.anIntArrayArray45[11][3] = 3228;
			this.anIntArrayArray45[11][1] = 3116;
			this.anIntArrayArray45[11][2] = 3148;
			this.anIntArrayArray45[11][0] = 2691;
			this.anIntArrayArray45[12][3] = 3196;
			this.anIntArrayArray45[12][0] = 3031;
			this.anIntArrayArray45[12][2] = 3710;
			this.anIntArrayArray45[12][1] = 3806;
			this.anIntArrayArray45[13][1] = 3437;
			this.anIntArrayArray45[13][0] = 3522;
			this.anIntArrayArray45[13][2] = 3421;
			this.anIntArrayArray45[13][3] = 3019;
			this.anIntArrayArray45[14][3] = 3228;
			this.anIntArrayArray45[14][0] = 3727;
			this.anIntArrayArray45[14][1] = 3116;
			this.anIntArrayArray45[14][2] = 3148;
			this.anIntArrayArray45[15][2] = 2505;
			this.anIntArrayArray45[15][1] = 2377;
			this.anIntArrayArray45[15][3] = 2746;
			this.anIntArrayArray45[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray45 = new int[4][4];
			this.anIntArrayArray45[0][1] = 0;
			this.anIntArrayArray45[0][0] = 2048;
			this.anIntArrayArray45[0][2] = 4096;
			this.anIntArrayArray45[0][3] = 0;
			this.anIntArrayArray45[1][0] = 2867;
			this.anIntArrayArray45[1][1] = 4096;
			this.anIntArrayArray45[1][3] = 0;
			this.anIntArrayArray45[1][2] = 4096;
			this.anIntArrayArray45[2][2] = 4096;
			this.anIntArrayArray45[2][1] = 4096;
			this.anIntArrayArray45[2][3] = 0;
			this.anIntArrayArray45[2][0] = 3276;
			this.anIntArrayArray45[3][2] = 0;
			this.anIntArrayArray45[3][3] = 0;
			this.anIntArrayArray45[3][1] = 4096;
			this.anIntArrayArray45[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(26) int[] local26 = this.method6543(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static240.anInt4386; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray462[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}
}
