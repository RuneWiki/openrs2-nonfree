import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class4_Sub3_Sub16 extends Class4_Sub3 {

	@OriginalMember(owner = "client!jt", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!jt", name = "F", descriptor = "[I")
	private final int[] anIntArray300 = new int[257];

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
	private void method3452() {
		@Pc(13) int local13 = this.anIntArrayArray27.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local13 > local30 && local28 >= this.anIntArrayArray27[local30][0]; local30++) {
				local24++;
			}
			@Pc(71) int local71;
			@Pc(67) int local67;
			@Pc(63) int local63;
			@Pc(57) int[] local57;
			if (local24 < local13) {
				local57 = this.anIntArrayArray27[local24];
				if (local24 <= 0) {
					local63 = local57[3];
					local67 = local57[2];
					local71 = local57[1];
				} else {
					@Pc(80) int[] local80 = this.anIntArrayArray27[local24 - 1];
					@Pc(98) int local98 = (local28 - local80[0] << 12) / (local57[0] - local80[0]);
					@Pc(102) int local102 = 4096 - local98;
					local67 = local98 * local57[2] + local102 * local80[2] >> 12;
					local71 = local102 * local80[1] + local98 * local57[1] >> 12;
					local63 = local80[3] * local102 + local98 * local57[3] >> 12;
				}
			} else {
				local57 = this.anIntArrayArray27[local13 - 1];
				local63 = local57[3];
				local71 = local57[1];
				local67 = local57[2];
			}
			local67 >>= 0x4;
			local63 >>= 0x4;
			local71 >>= 0x4;
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
			if (local63 < 0) {
				local63 = 0;
			} else if (local63 > 255) {
				local63 = 255;
			}
			this.anIntArray300[local20] = local71 << 16 | local67 << 8 | local63;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(26) int[] local26 = this.method6337(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static304.anInt5637; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray300[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "(II)V")
	private void method3453(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray27 = new int[2][4];
			this.anIntArrayArray27[0][2] = 0;
			this.anIntArrayArray27[0][3] = 0;
			this.anIntArrayArray27[0][1] = 0;
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[1][3] = 4096;
			this.anIntArrayArray27[1][0] = 4096;
			this.anIntArrayArray27[1][2] = 4096;
			this.anIntArrayArray27[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray27 = new int[8][4];
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][1] = 2650;
			this.anIntArrayArray27[0][3] = 2361;
			this.anIntArrayArray27[0][2] = 2602;
			this.anIntArrayArray27[1][1] = 2313;
			this.anIntArrayArray27[1][0] = 2867;
			this.anIntArrayArray27[1][2] = 1799;
			this.anIntArrayArray27[1][3] = 1558;
			this.anIntArrayArray27[2][1] = 2618;
			this.anIntArrayArray27[2][2] = 1734;
			this.anIntArrayArray27[2][3] = 1413;
			this.anIntArrayArray27[2][0] = 3072;
			this.anIntArrayArray27[3][3] = 947;
			this.anIntArrayArray27[3][2] = 1220;
			this.anIntArrayArray27[3][0] = 3276;
			this.anIntArrayArray27[3][1] = 2296;
			this.anIntArrayArray27[4][3] = 722;
			this.anIntArrayArray27[4][1] = 2072;
			this.anIntArrayArray27[4][2] = 963;
			this.anIntArrayArray27[4][0] = 3481;
			this.anIntArrayArray27[5][1] = 2730;
			this.anIntArrayArray27[5][0] = 3686;
			this.anIntArrayArray27[5][2] = 2152;
			this.anIntArrayArray27[5][3] = 1766;
			this.anIntArrayArray27[6][0] = 3891;
			this.anIntArrayArray27[6][2] = 1060;
			this.anIntArrayArray27[6][1] = 2232;
			this.anIntArrayArray27[6][3] = 915;
			this.anIntArrayArray27[7][1] = 1686;
			this.anIntArrayArray27[7][3] = 1140;
			this.anIntArrayArray27[7][2] = 1413;
			this.anIntArrayArray27[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray27 = new int[7][4];
			this.anIntArrayArray27[0][1] = 0;
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][2] = 0;
			this.anIntArrayArray27[0][3] = 4096;
			this.anIntArrayArray27[1][0] = 663;
			this.anIntArrayArray27[1][1] = 0;
			this.anIntArrayArray27[1][3] = 4096;
			this.anIntArrayArray27[1][2] = 4096;
			this.anIntArrayArray27[2][2] = 4096;
			this.anIntArrayArray27[2][0] = 1363;
			this.anIntArrayArray27[2][3] = 0;
			this.anIntArrayArray27[2][1] = 0;
			this.anIntArrayArray27[3][0] = 2048;
			this.anIntArrayArray27[3][1] = 4096;
			this.anIntArrayArray27[3][2] = 4096;
			this.anIntArrayArray27[3][3] = 0;
			this.anIntArrayArray27[4][2] = 0;
			this.anIntArrayArray27[4][0] = 2727;
			this.anIntArrayArray27[4][3] = 0;
			this.anIntArrayArray27[4][1] = 4096;
			this.anIntArrayArray27[5][3] = 4096;
			this.anIntArrayArray27[5][2] = 0;
			this.anIntArrayArray27[5][0] = 3411;
			this.anIntArrayArray27[5][1] = 4096;
			this.anIntArrayArray27[6][3] = 4096;
			this.anIntArrayArray27[6][0] = 4096;
			this.anIntArrayArray27[6][1] = 0;
			this.anIntArrayArray27[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray27 = new int[6][4];
			this.anIntArrayArray27[0][3] = 0;
			this.anIntArrayArray27[0][1] = 0;
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][2] = 0;
			this.anIntArrayArray27[1][0] = 1843;
			this.anIntArrayArray27[1][1] = 0;
			this.anIntArrayArray27[1][2] = 0;
			this.anIntArrayArray27[1][3] = 1493;
			this.anIntArrayArray27[2][2] = 0;
			this.anIntArrayArray27[2][0] = 2457;
			this.anIntArrayArray27[2][3] = 2939;
			this.anIntArrayArray27[2][1] = 0;
			this.anIntArrayArray27[3][2] = 1124;
			this.anIntArrayArray27[3][0] = 2781;
			this.anIntArrayArray27[3][3] = 3565;
			this.anIntArrayArray27[3][1] = 0;
			this.anIntArrayArray27[4][1] = 546;
			this.anIntArrayArray27[4][0] = 3481;
			this.anIntArrayArray27[4][3] = 4031;
			this.anIntArrayArray27[4][2] = 3084;
			this.anIntArrayArray27[5][2] = 4096;
			this.anIntArrayArray27[5][1] = 4096;
			this.anIntArrayArray27[5][0] = 4096;
			this.anIntArrayArray27[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray27 = new int[16][4];
			this.anIntArrayArray27[0][2] = 192;
			this.anIntArrayArray27[0][0] = 0;
			this.anIntArrayArray27[0][1] = 80;
			this.anIntArrayArray27[0][3] = 321;
			this.anIntArrayArray27[1][1] = 321;
			this.anIntArrayArray27[1][2] = 449;
			this.anIntArrayArray27[1][3] = 562;
			this.anIntArrayArray27[1][0] = 155;
			this.anIntArrayArray27[2][3] = 803;
			this.anIntArrayArray27[2][0] = 389;
			this.anIntArrayArray27[2][2] = 690;
			this.anIntArrayArray27[2][1] = 578;
			this.anIntArrayArray27[3][2] = 995;
			this.anIntArrayArray27[3][0] = 671;
			this.anIntArrayArray27[3][3] = 1140;
			this.anIntArrayArray27[3][1] = 947;
			this.anIntArrayArray27[4][0] = 897;
			this.anIntArrayArray27[4][2] = 1397;
			this.anIntArrayArray27[4][1] = 1285;
			this.anIntArrayArray27[4][3] = 1509;
			this.anIntArrayArray27[5][2] = 1429;
			this.anIntArrayArray27[5][3] = 1413;
			this.anIntArrayArray27[5][1] = 1525;
			this.anIntArrayArray27[5][0] = 1175;
			this.anIntArrayArray27[6][3] = 1333;
			this.anIntArrayArray27[6][2] = 1461;
			this.anIntArrayArray27[6][0] = 1368;
			this.anIntArrayArray27[6][1] = 1734;
			this.anIntArrayArray27[7][0] = 1507;
			this.anIntArrayArray27[7][1] = 1413;
			this.anIntArrayArray27[7][2] = 1525;
			this.anIntArrayArray27[7][3] = 1702;
			this.anIntArrayArray27[8][1] = 1108;
			this.anIntArrayArray27[8][0] = 1736;
			this.anIntArrayArray27[8][2] = 1590;
			this.anIntArrayArray27[8][3] = 2056;
			this.anIntArrayArray27[9][2] = 2056;
			this.anIntArrayArray27[9][1] = 1766;
			this.anIntArrayArray27[9][0] = 2088;
			this.anIntArrayArray27[9][3] = 2666;
			this.anIntArrayArray27[10][0] = 2355;
			this.anIntArrayArray27[10][3] = 3276;
			this.anIntArrayArray27[10][2] = 2586;
			this.anIntArrayArray27[10][1] = 2409;
			this.anIntArrayArray27[11][1] = 3116;
			this.anIntArrayArray27[11][2] = 3148;
			this.anIntArrayArray27[11][3] = 3228;
			this.anIntArrayArray27[11][0] = 2691;
			this.anIntArrayArray27[12][0] = 3031;
			this.anIntArrayArray27[12][3] = 3196;
			this.anIntArrayArray27[12][2] = 3710;
			this.anIntArrayArray27[12][1] = 3806;
			this.anIntArrayArray27[13][3] = 3019;
			this.anIntArrayArray27[13][2] = 3421;
			this.anIntArrayArray27[13][0] = 3522;
			this.anIntArrayArray27[13][1] = 3437;
			this.anIntArrayArray27[14][2] = 3148;
			this.anIntArrayArray27[14][1] = 3116;
			this.anIntArrayArray27[14][0] = 3727;
			this.anIntArrayArray27[14][3] = 3228;
			this.anIntArrayArray27[15][1] = 2377;
			this.anIntArrayArray27[15][2] = 2505;
			this.anIntArrayArray27[15][0] = 4096;
			this.anIntArrayArray27[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray27 = new int[4][4];
			this.anIntArrayArray27[0][1] = 0;
			this.anIntArrayArray27[0][2] = 4096;
			this.anIntArrayArray27[0][0] = 2048;
			this.anIntArrayArray27[0][3] = 0;
			this.anIntArrayArray27[1][1] = 4096;
			this.anIntArrayArray27[1][2] = 4096;
			this.anIntArrayArray27[1][0] = 2867;
			this.anIntArrayArray27[1][3] = 0;
			this.anIntArrayArray27[2][0] = 3276;
			this.anIntArrayArray27[2][1] = 4096;
			this.anIntArrayArray27[2][2] = 4096;
			this.anIntArrayArray27[2][3] = 0;
			this.anIntArrayArray27[3][1] = 4096;
			this.anIntArrayArray27[3][3] = 0;
			this.anIntArrayArray27[3][2] = 0;
			this.anIntArrayArray27[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
		if (this.anIntArrayArray27 == null) {
			this.method3453(1);
		}
		this.method3452();
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(10) int local10 = arg1.method4614();
		if (local10 != 0) {
			this.method3453(local10);
			return;
		}
		this.anIntArrayArray27 = new int[arg1.method4614()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray27.length; local21++) {
			this.anIntArrayArray27[local21][0] = arg1.method4560();
			this.anIntArrayArray27[local21][1] = arg1.method4614() << 4;
			this.anIntArrayArray27[local21][2] = arg1.method4614() << 4;
			this.anIntArrayArray27[local21][3] = arg1.method4614() << 4;
		}
	}
}
