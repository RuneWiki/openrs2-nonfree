import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class12_Sub1_Sub23 extends Class12_Sub1 {

	@OriginalMember(owner = "client!pp", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "[I")
	private final int[] anIntArray487 = new int[257];

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
		if (this.anIntArrayArray64 == null) {
			this.method6085(1);
		}
		this.method6086();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(26) int[] local26 = this.method7795(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static357.anInt6670; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray487[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(10) int local10 = arg0.method5216();
		if (local10 != 0) {
			this.method6085(local10);
			return;
		}
		this.anIntArrayArray64 = new int[arg0.method5216()][4];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray64.length; local27++) {
			this.anIntArrayArray64[local27][0] = arg0.method5199();
			this.anIntArrayArray64[local27][1] = arg0.method5216() << 4;
			this.anIntArrayArray64[local27][2] = arg0.method5216() << 4;
			this.anIntArrayArray64[local27][3] = arg0.method5216() << 4;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)V")
	private void method6085(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray64 = new int[2][4];
			this.anIntArrayArray64[0][1] = 0;
			this.anIntArrayArray64[0][3] = 0;
			this.anIntArrayArray64[0][0] = 0;
			this.anIntArrayArray64[0][2] = 0;
			this.anIntArrayArray64[1][3] = 4096;
			this.anIntArrayArray64[1][1] = 4096;
			this.anIntArrayArray64[1][2] = 4096;
			this.anIntArrayArray64[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray64 = new int[8][4];
			this.anIntArrayArray64[0][3] = 2361;
			this.anIntArrayArray64[0][1] = 2650;
			this.anIntArrayArray64[0][0] = 0;
			this.anIntArrayArray64[0][2] = 2602;
			this.anIntArrayArray64[1][3] = 1558;
			this.anIntArrayArray64[1][2] = 1799;
			this.anIntArrayArray64[1][1] = 2313;
			this.anIntArrayArray64[1][0] = 2867;
			this.anIntArrayArray64[2][2] = 1734;
			this.anIntArrayArray64[2][3] = 1413;
			this.anIntArrayArray64[2][0] = 3072;
			this.anIntArrayArray64[2][1] = 2618;
			this.anIntArrayArray64[3][0] = 3276;
			this.anIntArrayArray64[3][2] = 1220;
			this.anIntArrayArray64[3][1] = 2296;
			this.anIntArrayArray64[3][3] = 947;
			this.anIntArrayArray64[4][3] = 722;
			this.anIntArrayArray64[4][2] = 963;
			this.anIntArrayArray64[4][1] = 2072;
			this.anIntArrayArray64[4][0] = 3481;
			this.anIntArrayArray64[5][1] = 2730;
			this.anIntArrayArray64[5][0] = 3686;
			this.anIntArrayArray64[5][2] = 2152;
			this.anIntArrayArray64[5][3] = 1766;
			this.anIntArrayArray64[6][1] = 2232;
			this.anIntArrayArray64[6][2] = 1060;
			this.anIntArrayArray64[6][0] = 3891;
			this.anIntArrayArray64[6][3] = 915;
			this.anIntArrayArray64[7][2] = 1413;
			this.anIntArrayArray64[7][1] = 1686;
			this.anIntArrayArray64[7][0] = 4096;
			this.anIntArrayArray64[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray64 = new int[7][4];
			this.anIntArrayArray64[0][2] = 0;
			this.anIntArrayArray64[0][3] = 4096;
			this.anIntArrayArray64[0][0] = 0;
			this.anIntArrayArray64[0][1] = 0;
			this.anIntArrayArray64[1][3] = 4096;
			this.anIntArrayArray64[1][2] = 4096;
			this.anIntArrayArray64[1][1] = 0;
			this.anIntArrayArray64[1][0] = 663;
			this.anIntArrayArray64[2][3] = 0;
			this.anIntArrayArray64[2][0] = 1363;
			this.anIntArrayArray64[2][2] = 4096;
			this.anIntArrayArray64[2][1] = 0;
			this.anIntArrayArray64[3][0] = 2048;
			this.anIntArrayArray64[3][3] = 0;
			this.anIntArrayArray64[3][1] = 4096;
			this.anIntArrayArray64[3][2] = 4096;
			this.anIntArrayArray64[4][1] = 4096;
			this.anIntArrayArray64[4][2] = 0;
			this.anIntArrayArray64[4][0] = 2727;
			this.anIntArrayArray64[4][3] = 0;
			this.anIntArrayArray64[5][1] = 4096;
			this.anIntArrayArray64[5][2] = 0;
			this.anIntArrayArray64[5][0] = 3411;
			this.anIntArrayArray64[5][3] = 4096;
			this.anIntArrayArray64[6][0] = 4096;
			this.anIntArrayArray64[6][3] = 4096;
			this.anIntArrayArray64[6][2] = 0;
			this.anIntArrayArray64[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray64 = new int[6][4];
			this.anIntArrayArray64[0][1] = 0;
			this.anIntArrayArray64[0][3] = 0;
			this.anIntArrayArray64[0][2] = 0;
			this.anIntArrayArray64[0][0] = 0;
			this.anIntArrayArray64[1][0] = 1843;
			this.anIntArrayArray64[1][2] = 0;
			this.anIntArrayArray64[1][1] = 0;
			this.anIntArrayArray64[1][3] = 1493;
			this.anIntArrayArray64[2][1] = 0;
			this.anIntArrayArray64[2][0] = 2457;
			this.anIntArrayArray64[2][3] = 2939;
			this.anIntArrayArray64[2][2] = 0;
			this.anIntArrayArray64[3][2] = 1124;
			this.anIntArrayArray64[3][3] = 3565;
			this.anIntArrayArray64[3][0] = 2781;
			this.anIntArrayArray64[3][1] = 0;
			this.anIntArrayArray64[4][1] = 546;
			this.anIntArrayArray64[4][0] = 3481;
			this.anIntArrayArray64[4][3] = 4031;
			this.anIntArrayArray64[4][2] = 3084;
			this.anIntArrayArray64[5][2] = 4096;
			this.anIntArrayArray64[5][1] = 4096;
			this.anIntArrayArray64[5][0] = 4096;
			this.anIntArrayArray64[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray64 = new int[16][4];
			this.anIntArrayArray64[0][1] = 80;
			this.anIntArrayArray64[0][3] = 321;
			this.anIntArrayArray64[0][0] = 0;
			this.anIntArrayArray64[0][2] = 192;
			this.anIntArrayArray64[1][1] = 321;
			this.anIntArrayArray64[1][2] = 449;
			this.anIntArrayArray64[1][0] = 155;
			this.anIntArrayArray64[1][3] = 562;
			this.anIntArrayArray64[2][1] = 578;
			this.anIntArrayArray64[2][2] = 690;
			this.anIntArrayArray64[2][3] = 803;
			this.anIntArrayArray64[2][0] = 389;
			this.anIntArrayArray64[3][0] = 671;
			this.anIntArrayArray64[3][3] = 1140;
			this.anIntArrayArray64[3][1] = 947;
			this.anIntArrayArray64[3][2] = 995;
			this.anIntArrayArray64[4][2] = 1397;
			this.anIntArrayArray64[4][3] = 1509;
			this.anIntArrayArray64[4][0] = 897;
			this.anIntArrayArray64[4][1] = 1285;
			this.anIntArrayArray64[5][0] = 1175;
			this.anIntArrayArray64[5][2] = 1429;
			this.anIntArrayArray64[5][3] = 1413;
			this.anIntArrayArray64[5][1] = 1525;
			this.anIntArrayArray64[6][2] = 1461;
			this.anIntArrayArray64[6][3] = 1333;
			this.anIntArrayArray64[6][1] = 1734;
			this.anIntArrayArray64[6][0] = 1368;
			this.anIntArrayArray64[7][0] = 1507;
			this.anIntArrayArray64[7][2] = 1525;
			this.anIntArrayArray64[7][1] = 1413;
			this.anIntArrayArray64[7][3] = 1702;
			this.anIntArrayArray64[8][2] = 1590;
			this.anIntArrayArray64[8][3] = 2056;
			this.anIntArrayArray64[8][0] = 1736;
			this.anIntArrayArray64[8][1] = 1108;
			this.anIntArrayArray64[9][1] = 1766;
			this.anIntArrayArray64[9][0] = 2088;
			this.anIntArrayArray64[9][2] = 2056;
			this.anIntArrayArray64[9][3] = 2666;
			this.anIntArrayArray64[10][1] = 2409;
			this.anIntArrayArray64[10][3] = 3276;
			this.anIntArrayArray64[10][0] = 2355;
			this.anIntArrayArray64[10][2] = 2586;
			this.anIntArrayArray64[11][1] = 3116;
			this.anIntArrayArray64[11][3] = 3228;
			this.anIntArrayArray64[11][0] = 2691;
			this.anIntArrayArray64[11][2] = 3148;
			this.anIntArrayArray64[12][0] = 3031;
			this.anIntArrayArray64[12][2] = 3710;
			this.anIntArrayArray64[12][3] = 3196;
			this.anIntArrayArray64[12][1] = 3806;
			this.anIntArrayArray64[13][3] = 3019;
			this.anIntArrayArray64[13][2] = 3421;
			this.anIntArrayArray64[13][1] = 3437;
			this.anIntArrayArray64[13][0] = 3522;
			this.anIntArrayArray64[14][0] = 3727;
			this.anIntArrayArray64[14][3] = 3228;
			this.anIntArrayArray64[14][2] = 3148;
			this.anIntArrayArray64[14][1] = 3116;
			this.anIntArrayArray64[15][3] = 2746;
			this.anIntArrayArray64[15][0] = 4096;
			this.anIntArrayArray64[15][2] = 2505;
			this.anIntArrayArray64[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray64 = new int[4][4];
			this.anIntArrayArray64[0][1] = 0;
			this.anIntArrayArray64[0][3] = 0;
			this.anIntArrayArray64[0][0] = 2048;
			this.anIntArrayArray64[0][2] = 4096;
			this.anIntArrayArray64[1][3] = 0;
			this.anIntArrayArray64[1][1] = 4096;
			this.anIntArrayArray64[1][2] = 4096;
			this.anIntArrayArray64[1][0] = 2867;
			this.anIntArrayArray64[2][1] = 4096;
			this.anIntArrayArray64[2][2] = 4096;
			this.anIntArrayArray64[2][3] = 0;
			this.anIntArrayArray64[2][0] = 3276;
			this.anIntArrayArray64[3][3] = 0;
			this.anIntArrayArray64[3][1] = 4096;
			this.anIntArrayArray64[3][2] = 0;
			this.anIntArrayArray64[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V")
	private void method6086() {
		@Pc(13) int local13 = this.anIntArrayArray64.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local30 < local13 && this.anIntArrayArray64[local30][0] <= local28; local30++) {
				local24++;
			}
			@Pc(67) int local67;
			@Pc(75) int local75;
			@Pc(71) int local71;
			@Pc(63) int[] local63;
			if (local24 >= local13) {
				local63 = this.anIntArrayArray64[local13 - 1];
				local67 = local63[1];
				local71 = local63[3];
				local75 = local63[2];
			} else {
				local63 = this.anIntArrayArray64[local24];
				if (local24 <= 0) {
					local67 = local63[1];
					local75 = local63[2];
					local71 = local63[3];
				} else {
					@Pc(108) int[] local108 = this.anIntArrayArray64[local24 - 1];
					@Pc(124) int local124 = (local28 - local108[0] << 12) / (local63[0] - local108[0]);
					@Pc(128) int local128 = 4096 - local124;
					local75 = local63[2] * local124 + local128 * local108[2] >> 12;
					local67 = local63[1] * local124 + local108[1] * local128 >> 12;
					local71 = local63[3] * local124 + local128 * local108[3] >> 12;
				}
			}
			local67 >>= 0x4;
			local71 >>= 0x4;
			local75 >>= 0x4;
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
			if (local67 < 0) {
				local67 = 0;
			} else if (local67 > 255) {
				local67 = 255;
			}
			this.anIntArray487[local20] = local75 << 8 | local67 << 16 | local71;
		}
	}
}
