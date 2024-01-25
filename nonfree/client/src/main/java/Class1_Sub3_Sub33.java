import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class1_Sub3_Sub33 extends Class1_Sub3 {

	@OriginalMember(owner = "client!u", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray191;

	@OriginalMember(owner = "client!u", name = "N", descriptor = "[I")
	private final int[] anIntArray572 = new int[257];

	static {
		new Class84("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
	private void method5405() {
		@Pc(9) int local9 = this.anIntArrayArray191.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local9 > local30 && this.anIntArrayArray191[local30][0] <= local28; local30++) {
				local24++;
			}
			@Pc(75) int local75;
			@Pc(71) int local71;
			@Pc(67) int local67;
			@Pc(63) int[] local63;
			if (local9 <= local24) {
				local63 = this.anIntArrayArray191[local9 - 1];
				local67 = local63[3];
				local71 = local63[2];
				local75 = local63[1];
			} else {
				local63 = this.anIntArrayArray191[local24];
				if (local24 <= 0) {
					local75 = local63[1];
					local71 = local63[2];
					local67 = local63[3];
				} else {
					@Pc(108) int[] local108 = this.anIntArrayArray191[local24 - 1];
					@Pc(125) int local125 = (local28 - local108[0] << 12) / (local63[0] - local108[0]);
					@Pc(129) int local129 = 4096 - local125;
					local75 = local108[1] * local129 + local63[1] * local125 >> 12;
					local67 = local125 * local63[3] + local129 * local108[3] >> 12;
					local71 = local63[2] * local125 + local108[2] * local129 >> 12;
				}
			}
			local71 >>= 0x4;
			local75 >>= 0x4;
			local67 >>= 0x4;
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
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 > 255) {
				local75 = 255;
			}
			this.anIntArray572[local20] = local67 | local75 << 16 | local71 << 8;
		}
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
		if (this.anIntArrayArray191 == null) {
			this.method5406(1);
		}
		this.method5405();
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(II)V")
	private void method5406(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray191 = new int[2][4];
			this.anIntArrayArray191[0][3] = 0;
			this.anIntArrayArray191[0][0] = 0;
			this.anIntArrayArray191[0][2] = 0;
			this.anIntArrayArray191[0][1] = 0;
			this.anIntArrayArray191[1][2] = 4096;
			this.anIntArrayArray191[1][1] = 4096;
			this.anIntArrayArray191[1][3] = 4096;
			this.anIntArrayArray191[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray191 = new int[8][4];
			this.anIntArrayArray191[0][2] = 2602;
			this.anIntArrayArray191[0][0] = 0;
			this.anIntArrayArray191[0][3] = 2361;
			this.anIntArrayArray191[0][1] = 2650;
			this.anIntArrayArray191[1][3] = 1558;
			this.anIntArrayArray191[1][2] = 1799;
			this.anIntArrayArray191[1][0] = 2867;
			this.anIntArrayArray191[1][1] = 2313;
			this.anIntArrayArray191[2][2] = 1734;
			this.anIntArrayArray191[2][1] = 2618;
			this.anIntArrayArray191[2][3] = 1413;
			this.anIntArrayArray191[2][0] = 3072;
			this.anIntArrayArray191[3][0] = 3276;
			this.anIntArrayArray191[3][1] = 2296;
			this.anIntArrayArray191[3][2] = 1220;
			this.anIntArrayArray191[3][3] = 947;
			this.anIntArrayArray191[4][1] = 2072;
			this.anIntArrayArray191[4][0] = 3481;
			this.anIntArrayArray191[4][2] = 963;
			this.anIntArrayArray191[4][3] = 722;
			this.anIntArrayArray191[5][0] = 3686;
			this.anIntArrayArray191[5][1] = 2730;
			this.anIntArrayArray191[5][3] = 1766;
			this.anIntArrayArray191[5][2] = 2152;
			this.anIntArrayArray191[6][0] = 3891;
			this.anIntArrayArray191[6][1] = 2232;
			this.anIntArrayArray191[6][2] = 1060;
			this.anIntArrayArray191[6][3] = 915;
			this.anIntArrayArray191[7][1] = 1686;
			this.anIntArrayArray191[7][3] = 1140;
			this.anIntArrayArray191[7][0] = 4096;
			this.anIntArrayArray191[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray191 = new int[7][4];
			this.anIntArrayArray191[0][2] = 0;
			this.anIntArrayArray191[0][0] = 0;
			this.anIntArrayArray191[0][3] = 4096;
			this.anIntArrayArray191[0][1] = 0;
			this.anIntArrayArray191[1][0] = 663;
			this.anIntArrayArray191[1][3] = 4096;
			this.anIntArrayArray191[1][2] = 4096;
			this.anIntArrayArray191[1][1] = 0;
			this.anIntArrayArray191[2][0] = 1363;
			this.anIntArrayArray191[2][2] = 4096;
			this.anIntArrayArray191[2][3] = 0;
			this.anIntArrayArray191[2][1] = 0;
			this.anIntArrayArray191[3][3] = 0;
			this.anIntArrayArray191[3][0] = 2048;
			this.anIntArrayArray191[3][1] = 4096;
			this.anIntArrayArray191[3][2] = 4096;
			this.anIntArrayArray191[4][1] = 4096;
			this.anIntArrayArray191[4][3] = 0;
			this.anIntArrayArray191[4][2] = 0;
			this.anIntArrayArray191[4][0] = 2727;
			this.anIntArrayArray191[5][1] = 4096;
			this.anIntArrayArray191[5][3] = 4096;
			this.anIntArrayArray191[5][0] = 3411;
			this.anIntArrayArray191[5][2] = 0;
			this.anIntArrayArray191[6][3] = 4096;
			this.anIntArrayArray191[6][2] = 0;
			this.anIntArrayArray191[6][1] = 0;
			this.anIntArrayArray191[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray191 = new int[6][4];
			this.anIntArrayArray191[0][3] = 0;
			this.anIntArrayArray191[0][0] = 0;
			this.anIntArrayArray191[0][1] = 0;
			this.anIntArrayArray191[0][2] = 0;
			this.anIntArrayArray191[1][1] = 0;
			this.anIntArrayArray191[1][2] = 0;
			this.anIntArrayArray191[1][0] = 1843;
			this.anIntArrayArray191[1][3] = 1493;
			this.anIntArrayArray191[2][3] = 2939;
			this.anIntArrayArray191[2][0] = 2457;
			this.anIntArrayArray191[2][1] = 0;
			this.anIntArrayArray191[2][2] = 0;
			this.anIntArrayArray191[3][1] = 0;
			this.anIntArrayArray191[3][2] = 1124;
			this.anIntArrayArray191[3][3] = 3565;
			this.anIntArrayArray191[3][0] = 2781;
			this.anIntArrayArray191[4][2] = 3084;
			this.anIntArrayArray191[4][1] = 546;
			this.anIntArrayArray191[4][0] = 3481;
			this.anIntArrayArray191[4][3] = 4031;
			this.anIntArrayArray191[5][2] = 4096;
			this.anIntArrayArray191[5][1] = 4096;
			this.anIntArrayArray191[5][0] = 4096;
			this.anIntArrayArray191[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray191 = new int[16][4];
			this.anIntArrayArray191[0][0] = 0;
			this.anIntArrayArray191[0][3] = 321;
			this.anIntArrayArray191[0][2] = 192;
			this.anIntArrayArray191[0][1] = 80;
			this.anIntArrayArray191[1][1] = 321;
			this.anIntArrayArray191[1][0] = 155;
			this.anIntArrayArray191[1][2] = 449;
			this.anIntArrayArray191[1][3] = 562;
			this.anIntArrayArray191[2][1] = 578;
			this.anIntArrayArray191[2][0] = 389;
			this.anIntArrayArray191[2][3] = 803;
			this.anIntArrayArray191[2][2] = 690;
			this.anIntArrayArray191[3][0] = 671;
			this.anIntArrayArray191[3][3] = 1140;
			this.anIntArrayArray191[3][2] = 995;
			this.anIntArrayArray191[3][1] = 947;
			this.anIntArrayArray191[4][3] = 1509;
			this.anIntArrayArray191[4][0] = 897;
			this.anIntArrayArray191[4][1] = 1285;
			this.anIntArrayArray191[4][2] = 1397;
			this.anIntArrayArray191[5][1] = 1525;
			this.anIntArrayArray191[5][2] = 1429;
			this.anIntArrayArray191[5][0] = 1175;
			this.anIntArrayArray191[5][3] = 1413;
			this.anIntArrayArray191[6][3] = 1333;
			this.anIntArrayArray191[6][1] = 1734;
			this.anIntArrayArray191[6][0] = 1368;
			this.anIntArrayArray191[6][2] = 1461;
			this.anIntArrayArray191[7][0] = 1507;
			this.anIntArrayArray191[7][3] = 1702;
			this.anIntArrayArray191[7][1] = 1413;
			this.anIntArrayArray191[7][2] = 1525;
			this.anIntArrayArray191[8][0] = 1736;
			this.anIntArrayArray191[8][3] = 2056;
			this.anIntArrayArray191[8][2] = 1590;
			this.anIntArrayArray191[8][1] = 1108;
			this.anIntArrayArray191[9][2] = 2056;
			this.anIntArrayArray191[9][3] = 2666;
			this.anIntArrayArray191[9][1] = 1766;
			this.anIntArrayArray191[9][0] = 2088;
			this.anIntArrayArray191[10][2] = 2586;
			this.anIntArrayArray191[10][0] = 2355;
			this.anIntArrayArray191[10][1] = 2409;
			this.anIntArrayArray191[10][3] = 3276;
			this.anIntArrayArray191[11][3] = 3228;
			this.anIntArrayArray191[11][1] = 3116;
			this.anIntArrayArray191[11][0] = 2691;
			this.anIntArrayArray191[11][2] = 3148;
			this.anIntArrayArray191[12][1] = 3806;
			this.anIntArrayArray191[12][0] = 3031;
			this.anIntArrayArray191[12][2] = 3710;
			this.anIntArrayArray191[12][3] = 3196;
			this.anIntArrayArray191[13][3] = 3019;
			this.anIntArrayArray191[13][1] = 3437;
			this.anIntArrayArray191[13][0] = 3522;
			this.anIntArrayArray191[13][2] = 3421;
			this.anIntArrayArray191[14][3] = 3228;
			this.anIntArrayArray191[14][1] = 3116;
			this.anIntArrayArray191[14][0] = 3727;
			this.anIntArrayArray191[14][2] = 3148;
			this.anIntArrayArray191[15][3] = 2746;
			this.anIntArrayArray191[15][2] = 2505;
			this.anIntArrayArray191[15][1] = 2377;
			this.anIntArrayArray191[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray191 = new int[4][4];
			this.anIntArrayArray191[0][1] = 0;
			this.anIntArrayArray191[0][2] = 4096;
			this.anIntArrayArray191[0][3] = 0;
			this.anIntArrayArray191[0][0] = 2048;
			this.anIntArrayArray191[1][1] = 4096;
			this.anIntArrayArray191[1][2] = 4096;
			this.anIntArrayArray191[1][0] = 2867;
			this.anIntArrayArray191[1][3] = 0;
			this.anIntArrayArray191[2][0] = 3276;
			this.anIntArrayArray191[2][2] = 4096;
			this.anIntArrayArray191[2][1] = 4096;
			this.anIntArrayArray191[2][3] = 0;
			this.anIntArrayArray191[3][0] = 4096;
			this.anIntArrayArray191[3][2] = 0;
			this.anIntArrayArray191[3][1] = 4096;
			this.anIntArrayArray191[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(7) int local7 = arg0.method4130();
		if (local7 != 0) {
			this.method5406(local7);
			return;
		}
		this.anIntArrayArray191 = new int[arg0.method4130()][4];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray191.length; local29++) {
			this.anIntArrayArray191[local29][0] = arg0.method4093();
			this.anIntArrayArray191[local29][1] = arg0.method4130() << 4;
			this.anIntArrayArray191[local29][2] = arg0.method4130() << 4;
			this.anIntArrayArray191[local29][3] = arg0.method4130() << 4;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(29) int[] local29 = this.method6076(0, arg0);
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			for (@Pc(43) int local43 = 0; local43 < Static347.anInt5974; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray572[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
