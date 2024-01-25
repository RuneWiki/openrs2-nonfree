import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class1_Sub5_Sub18 extends Class1_Sub5 {

	@OriginalMember(owner = "client!mq", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!mq", name = "R", descriptor = "[I")
	private final int[] anIntArray378 = new int[257];

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)V")
	private void method3362(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray33 = new int[2][4];
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][3] = 0;
			this.anIntArrayArray33[0][2] = 0;
			this.anIntArrayArray33[1][1] = 4096;
			this.anIntArrayArray33[1][3] = 4096;
			this.anIntArrayArray33[1][2] = 4096;
			this.anIntArrayArray33[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray33 = new int[8][4];
			this.anIntArrayArray33[0][2] = 2602;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][3] = 2361;
			this.anIntArrayArray33[0][1] = 2650;
			this.anIntArrayArray33[1][3] = 1558;
			this.anIntArrayArray33[1][1] = 2313;
			this.anIntArrayArray33[1][0] = 2867;
			this.anIntArrayArray33[1][2] = 1799;
			this.anIntArrayArray33[2][1] = 2618;
			this.anIntArrayArray33[2][3] = 1413;
			this.anIntArrayArray33[2][2] = 1734;
			this.anIntArrayArray33[2][0] = 3072;
			this.anIntArrayArray33[3][3] = 947;
			this.anIntArrayArray33[3][0] = 3276;
			this.anIntArrayArray33[3][1] = 2296;
			this.anIntArrayArray33[3][2] = 1220;
			this.anIntArrayArray33[4][2] = 963;
			this.anIntArrayArray33[4][1] = 2072;
			this.anIntArrayArray33[4][0] = 3481;
			this.anIntArrayArray33[4][3] = 722;
			this.anIntArrayArray33[5][2] = 2152;
			this.anIntArrayArray33[5][1] = 2730;
			this.anIntArrayArray33[5][3] = 1766;
			this.anIntArrayArray33[5][0] = 3686;
			this.anIntArrayArray33[6][0] = 3891;
			this.anIntArrayArray33[6][1] = 2232;
			this.anIntArrayArray33[6][2] = 1060;
			this.anIntArrayArray33[6][3] = 915;
			this.anIntArrayArray33[7][3] = 1140;
			this.anIntArrayArray33[7][2] = 1413;
			this.anIntArrayArray33[7][0] = 4096;
			this.anIntArrayArray33[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray33 = new int[7][4];
			this.anIntArrayArray33[0][3] = 4096;
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][2] = 0;
			this.anIntArrayArray33[1][3] = 4096;
			this.anIntArrayArray33[1][2] = 4096;
			this.anIntArrayArray33[1][0] = 663;
			this.anIntArrayArray33[1][1] = 0;
			this.anIntArrayArray33[2][1] = 0;
			this.anIntArrayArray33[2][3] = 0;
			this.anIntArrayArray33[2][0] = 1363;
			this.anIntArrayArray33[2][2] = 4096;
			this.anIntArrayArray33[3][2] = 4096;
			this.anIntArrayArray33[3][0] = 2048;
			this.anIntArrayArray33[3][1] = 4096;
			this.anIntArrayArray33[3][3] = 0;
			this.anIntArrayArray33[4][1] = 4096;
			this.anIntArrayArray33[4][0] = 2727;
			this.anIntArrayArray33[4][2] = 0;
			this.anIntArrayArray33[4][3] = 0;
			this.anIntArrayArray33[5][3] = 4096;
			this.anIntArrayArray33[5][2] = 0;
			this.anIntArrayArray33[5][0] = 3411;
			this.anIntArrayArray33[5][1] = 4096;
			this.anIntArrayArray33[6][3] = 4096;
			this.anIntArrayArray33[6][0] = 4096;
			this.anIntArrayArray33[6][1] = 0;
			this.anIntArrayArray33[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray33 = new int[6][4];
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][3] = 0;
			this.anIntArrayArray33[0][2] = 0;
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[1][2] = 0;
			this.anIntArrayArray33[1][1] = 0;
			this.anIntArrayArray33[1][0] = 1843;
			this.anIntArrayArray33[1][3] = 1493;
			this.anIntArrayArray33[2][2] = 0;
			this.anIntArrayArray33[2][0] = 2457;
			this.anIntArrayArray33[2][1] = 0;
			this.anIntArrayArray33[2][3] = 2939;
			this.anIntArrayArray33[3][2] = 1124;
			this.anIntArrayArray33[3][0] = 2781;
			this.anIntArrayArray33[3][3] = 3565;
			this.anIntArrayArray33[3][1] = 0;
			this.anIntArrayArray33[4][2] = 3084;
			this.anIntArrayArray33[4][1] = 546;
			this.anIntArrayArray33[4][0] = 3481;
			this.anIntArrayArray33[4][3] = 4031;
			this.anIntArrayArray33[5][2] = 4096;
			this.anIntArrayArray33[5][1] = 4096;
			this.anIntArrayArray33[5][0] = 4096;
			this.anIntArrayArray33[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray33 = new int[16][4];
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][1] = 80;
			this.anIntArrayArray33[0][3] = 321;
			this.anIntArrayArray33[0][2] = 192;
			this.anIntArrayArray33[1][1] = 321;
			this.anIntArrayArray33[1][0] = 155;
			this.anIntArrayArray33[1][2] = 449;
			this.anIntArrayArray33[1][3] = 562;
			this.anIntArrayArray33[2][0] = 389;
			this.anIntArrayArray33[2][3] = 803;
			this.anIntArrayArray33[2][1] = 578;
			this.anIntArrayArray33[2][2] = 690;
			this.anIntArrayArray33[3][3] = 1140;
			this.anIntArrayArray33[3][0] = 671;
			this.anIntArrayArray33[3][2] = 995;
			this.anIntArrayArray33[3][1] = 947;
			this.anIntArrayArray33[4][3] = 1509;
			this.anIntArrayArray33[4][2] = 1397;
			this.anIntArrayArray33[4][1] = 1285;
			this.anIntArrayArray33[4][0] = 897;
			this.anIntArrayArray33[5][0] = 1175;
			this.anIntArrayArray33[5][2] = 1429;
			this.anIntArrayArray33[5][3] = 1413;
			this.anIntArrayArray33[5][1] = 1525;
			this.anIntArrayArray33[6][2] = 1461;
			this.anIntArrayArray33[6][3] = 1333;
			this.anIntArrayArray33[6][1] = 1734;
			this.anIntArrayArray33[6][0] = 1368;
			this.anIntArrayArray33[7][1] = 1413;
			this.anIntArrayArray33[7][3] = 1702;
			this.anIntArrayArray33[7][2] = 1525;
			this.anIntArrayArray33[7][0] = 1507;
			this.anIntArrayArray33[8][1] = 1108;
			this.anIntArrayArray33[8][3] = 2056;
			this.anIntArrayArray33[8][2] = 1590;
			this.anIntArrayArray33[8][0] = 1736;
			this.anIntArrayArray33[9][3] = 2666;
			this.anIntArrayArray33[9][0] = 2088;
			this.anIntArrayArray33[9][2] = 2056;
			this.anIntArrayArray33[9][1] = 1766;
			this.anIntArrayArray33[10][1] = 2409;
			this.anIntArrayArray33[10][3] = 3276;
			this.anIntArrayArray33[10][0] = 2355;
			this.anIntArrayArray33[10][2] = 2586;
			this.anIntArrayArray33[11][2] = 3148;
			this.anIntArrayArray33[11][3] = 3228;
			this.anIntArrayArray33[11][0] = 2691;
			this.anIntArrayArray33[11][1] = 3116;
			this.anIntArrayArray33[12][2] = 3710;
			this.anIntArrayArray33[12][1] = 3806;
			this.anIntArrayArray33[12][0] = 3031;
			this.anIntArrayArray33[12][3] = 3196;
			this.anIntArrayArray33[13][1] = 3437;
			this.anIntArrayArray33[13][2] = 3421;
			this.anIntArrayArray33[13][0] = 3522;
			this.anIntArrayArray33[13][3] = 3019;
			this.anIntArrayArray33[14][3] = 3228;
			this.anIntArrayArray33[14][0] = 3727;
			this.anIntArrayArray33[14][2] = 3148;
			this.anIntArrayArray33[14][1] = 3116;
			this.anIntArrayArray33[15][2] = 2505;
			this.anIntArrayArray33[15][1] = 2377;
			this.anIntArrayArray33[15][0] = 4096;
			this.anIntArrayArray33[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray33 = new int[4][4];
			this.anIntArrayArray33[0][0] = 2048;
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[0][2] = 4096;
			this.anIntArrayArray33[0][3] = 0;
			this.anIntArrayArray33[1][2] = 4096;
			this.anIntArrayArray33[1][1] = 4096;
			this.anIntArrayArray33[1][0] = 2867;
			this.anIntArrayArray33[1][3] = 0;
			this.anIntArrayArray33[2][2] = 4096;
			this.anIntArrayArray33[2][1] = 4096;
			this.anIntArrayArray33[2][3] = 0;
			this.anIntArrayArray33[2][0] = 3276;
			this.anIntArrayArray33[3][0] = 4096;
			this.anIntArrayArray33[3][3] = 0;
			this.anIntArrayArray33[3][1] = 4096;
			this.anIntArrayArray33[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(14) int local14 = arg0.method5720();
		if (local14 != 0) {
			this.method3362(local14);
			return;
		}
		this.anIntArrayArray33 = new int[arg0.method5720()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray33.length; local31++) {
			this.anIntArrayArray33[local31][0] = arg0.method5715();
			this.anIntArrayArray33[local31][1] = arg0.method5720() << 4;
			this.anIntArrayArray33[local31][2] = arg0.method5720() << 4;
			this.anIntArrayArray33[local31][3] = arg0.method5720() << 4;
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
		if (this.anIntArrayArray33 == null) {
			this.method3362(1);
		}
		this.method3366();
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(26) int[] local26 = this.method5802(0, arg0);
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local11[2];
			for (@Pc(40) int local40 = 0; local40 < Static75.anInt1566; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray378[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
	private void method3366() {
		@Pc(13) int local13 = this.anIntArrayArray33.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local13 > local30 && this.anIntArrayArray33[local30][0] <= local28; local30++) {
				local24++;
			}
			@Pc(75) int local75;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(63) int[] local63;
			if (local24 >= local13) {
				local63 = this.anIntArrayArray33[local13 - 1];
				local67 = local63[2];
				local71 = local63[3];
				local75 = local63[1];
			} else {
				local63 = this.anIntArrayArray33[local24];
				if (local24 > 0) {
					@Pc(91) int[] local91 = this.anIntArrayArray33[local24 - 1];
					@Pc(108) int local108 = (local28 - local91[0] << 12) / (local63[0] - local91[0]);
					@Pc(113) int local113 = 4096 - local108;
					local71 = local108 * local63[3] + local113 * local91[3] >> 12;
					local75 = local91[1] * local113 + local108 * local63[1] >> 12;
					local67 = local108 * local63[2] + local91[2] * local113 >> 12;
				} else {
					local71 = local63[3];
					local67 = local63[2];
					local75 = local63[1];
				}
			}
			local71 >>= 0x4;
			local75 >>= 0x4;
			local67 >>= 0x4;
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
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 > 255) {
				local75 = 255;
			}
			this.anIntArray378[local20] = local67 << 8 | local75 << 16 | local71;
		}
	}
}
