import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bp", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!bp", name = "O", descriptor = "[I")
	private final int[] anIntArray57 = new int[257];

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(21) int[] local21 = this.method7882(0, arg0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static87.anInt1964; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray57[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)V")
	private void method1117() {
		@Pc(9) int local9 = this.anIntArrayArray6.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < 257; local13++) {
			@Pc(17) int local17 = 0;
			@Pc(21) int local21 = local13 << 4;
			for (@Pc(23) int local23 = 0; local9 > local23 && this.anIntArrayArray6[local23][0] <= local21; local23++) {
				local17++;
			}
			@Pc(64) int local64;
			@Pc(60) int local60;
			@Pc(56) int local56;
			@Pc(52) int[] local52;
			if (local9 <= local17) {
				local52 = this.anIntArrayArray6[local9 - 1];
				local56 = local52[3];
				local60 = local52[2];
				local64 = local52[1];
			} else {
				local52 = this.anIntArrayArray6[local17];
				if (local17 > 0) {
					@Pc(80) int[] local80 = this.anIntArrayArray6[local17 - 1];
					@Pc(98) int local98 = (local21 - local80[0] << 12) / (local52[0] - local80[0]);
					@Pc(103) int local103 = 4096 - local98;
					local64 = local103 * local80[1] + local98 * local52[1] >> 12;
					local56 = local52[3] * local98 + local80[3] * local103 >> 12;
					local60 = local80[2] * local103 + local52[2] * local98 >> 12;
				} else {
					local56 = local52[3];
					local64 = local52[1];
					local60 = local52[2];
				}
			}
			local60 >>= 0x4;
			local64 >>= 0x4;
			local56 >>= 0x4;
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			if (local56 < 0) {
				local56 = 0;
			} else if (local56 > 255) {
				local56 = 255;
			}
			this.anIntArray57[local13] = local56 | local60 << 8 | local64 << 16;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
		if (this.anIntArrayArray6 == null) {
			this.method1118(1);
		}
		this.method1117();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(19) int local19 = arg1.method4393();
		if (local19 != 0) {
			this.method1118(local19);
			return;
		}
		this.anIntArrayArray6 = new int[arg1.method4393()][4];
		for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray6.length; local33++) {
			this.anIntArrayArray6[local33][0] = arg1.method4426();
			this.anIntArrayArray6[local33][1] = arg1.method4393() << 4;
			this.anIntArrayArray6[local33][2] = arg1.method4393() << 4;
			this.anIntArrayArray6[local33][3] = arg1.method4393() << 4;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	private void method1118(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray6 = new int[2][4];
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[1][1] = 4096;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[1][3] = 4096;
			this.anIntArrayArray6[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray6 = new int[8][4];
			this.anIntArrayArray6[0][3] = 2361;
			this.anIntArrayArray6[0][1] = 2650;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][2] = 2602;
			this.anIntArrayArray6[1][1] = 2313;
			this.anIntArrayArray6[1][3] = 1558;
			this.anIntArrayArray6[1][2] = 1799;
			this.anIntArrayArray6[1][0] = 2867;
			this.anIntArrayArray6[2][2] = 1734;
			this.anIntArrayArray6[2][0] = 3072;
			this.anIntArrayArray6[2][3] = 1413;
			this.anIntArrayArray6[2][1] = 2618;
			this.anIntArrayArray6[3][3] = 947;
			this.anIntArrayArray6[3][2] = 1220;
			this.anIntArrayArray6[3][0] = 3276;
			this.anIntArrayArray6[3][1] = 2296;
			this.anIntArrayArray6[4][2] = 963;
			this.anIntArrayArray6[4][1] = 2072;
			this.anIntArrayArray6[4][0] = 3481;
			this.anIntArrayArray6[4][3] = 722;
			this.anIntArrayArray6[5][1] = 2730;
			this.anIntArrayArray6[5][3] = 1766;
			this.anIntArrayArray6[5][0] = 3686;
			this.anIntArrayArray6[5][2] = 2152;
			this.anIntArrayArray6[6][2] = 1060;
			this.anIntArrayArray6[6][3] = 915;
			this.anIntArrayArray6[6][1] = 2232;
			this.anIntArrayArray6[6][0] = 3891;
			this.anIntArrayArray6[7][0] = 4096;
			this.anIntArrayArray6[7][2] = 1413;
			this.anIntArrayArray6[7][1] = 1686;
			this.anIntArrayArray6[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray6 = new int[7][4];
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][3] = 4096;
			this.anIntArrayArray6[1][3] = 4096;
			this.anIntArrayArray6[1][0] = 663;
			this.anIntArrayArray6[1][1] = 0;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[2][1] = 0;
			this.anIntArrayArray6[2][2] = 4096;
			this.anIntArrayArray6[2][3] = 0;
			this.anIntArrayArray6[2][0] = 1363;
			this.anIntArrayArray6[3][3] = 0;
			this.anIntArrayArray6[3][1] = 4096;
			this.anIntArrayArray6[3][0] = 2048;
			this.anIntArrayArray6[3][2] = 4096;
			this.anIntArrayArray6[4][3] = 0;
			this.anIntArrayArray6[4][1] = 4096;
			this.anIntArrayArray6[4][2] = 0;
			this.anIntArrayArray6[4][0] = 2727;
			this.anIntArrayArray6[5][2] = 0;
			this.anIntArrayArray6[5][1] = 4096;
			this.anIntArrayArray6[5][0] = 3411;
			this.anIntArrayArray6[5][3] = 4096;
			this.anIntArrayArray6[6][2] = 0;
			this.anIntArrayArray6[6][3] = 4096;
			this.anIntArrayArray6[6][1] = 0;
			this.anIntArrayArray6[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray6 = new int[6][4];
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][2] = 0;
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[1][3] = 1493;
			this.anIntArrayArray6[1][2] = 0;
			this.anIntArrayArray6[1][0] = 1843;
			this.anIntArrayArray6[1][1] = 0;
			this.anIntArrayArray6[2][2] = 0;
			this.anIntArrayArray6[2][3] = 2939;
			this.anIntArrayArray6[2][1] = 0;
			this.anIntArrayArray6[2][0] = 2457;
			this.anIntArrayArray6[3][0] = 2781;
			this.anIntArrayArray6[3][1] = 0;
			this.anIntArrayArray6[3][3] = 3565;
			this.anIntArrayArray6[3][2] = 1124;
			this.anIntArrayArray6[4][3] = 4031;
			this.anIntArrayArray6[4][0] = 3481;
			this.anIntArrayArray6[4][2] = 3084;
			this.anIntArrayArray6[4][1] = 546;
			this.anIntArrayArray6[5][2] = 4096;
			this.anIntArrayArray6[5][1] = 4096;
			this.anIntArrayArray6[5][0] = 4096;
			this.anIntArrayArray6[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray6 = new int[16][4];
			this.anIntArrayArray6[0][1] = 80;
			this.anIntArrayArray6[0][2] = 192;
			this.anIntArrayArray6[0][3] = 321;
			this.anIntArrayArray6[0][0] = 0;
			this.anIntArrayArray6[1][1] = 321;
			this.anIntArrayArray6[1][3] = 562;
			this.anIntArrayArray6[1][2] = 449;
			this.anIntArrayArray6[1][0] = 155;
			this.anIntArrayArray6[2][2] = 690;
			this.anIntArrayArray6[2][1] = 578;
			this.anIntArrayArray6[2][3] = 803;
			this.anIntArrayArray6[2][0] = 389;
			this.anIntArrayArray6[3][2] = 995;
			this.anIntArrayArray6[3][3] = 1140;
			this.anIntArrayArray6[3][1] = 947;
			this.anIntArrayArray6[3][0] = 671;
			this.anIntArrayArray6[4][2] = 1397;
			this.anIntArrayArray6[4][3] = 1509;
			this.anIntArrayArray6[4][0] = 897;
			this.anIntArrayArray6[4][1] = 1285;
			this.anIntArrayArray6[5][1] = 1525;
			this.anIntArrayArray6[5][2] = 1429;
			this.anIntArrayArray6[5][3] = 1413;
			this.anIntArrayArray6[5][0] = 1175;
			this.anIntArrayArray6[6][2] = 1461;
			this.anIntArrayArray6[6][0] = 1368;
			this.anIntArrayArray6[6][3] = 1333;
			this.anIntArrayArray6[6][1] = 1734;
			this.anIntArrayArray6[7][2] = 1525;
			this.anIntArrayArray6[7][0] = 1507;
			this.anIntArrayArray6[7][3] = 1702;
			this.anIntArrayArray6[7][1] = 1413;
			this.anIntArrayArray6[8][0] = 1736;
			this.anIntArrayArray6[8][3] = 2056;
			this.anIntArrayArray6[8][1] = 1108;
			this.anIntArrayArray6[8][2] = 1590;
			this.anIntArrayArray6[9][2] = 2056;
			this.anIntArrayArray6[9][1] = 1766;
			this.anIntArrayArray6[9][0] = 2088;
			this.anIntArrayArray6[9][3] = 2666;
			this.anIntArrayArray6[10][1] = 2409;
			this.anIntArrayArray6[10][0] = 2355;
			this.anIntArrayArray6[10][2] = 2586;
			this.anIntArrayArray6[10][3] = 3276;
			this.anIntArrayArray6[11][3] = 3228;
			this.anIntArrayArray6[11][0] = 2691;
			this.anIntArrayArray6[11][1] = 3116;
			this.anIntArrayArray6[11][2] = 3148;
			this.anIntArrayArray6[12][0] = 3031;
			this.anIntArrayArray6[12][3] = 3196;
			this.anIntArrayArray6[12][2] = 3710;
			this.anIntArrayArray6[12][1] = 3806;
			this.anIntArrayArray6[13][2] = 3421;
			this.anIntArrayArray6[13][3] = 3019;
			this.anIntArrayArray6[13][0] = 3522;
			this.anIntArrayArray6[13][1] = 3437;
			this.anIntArrayArray6[14][0] = 3727;
			this.anIntArrayArray6[14][3] = 3228;
			this.anIntArrayArray6[14][2] = 3148;
			this.anIntArrayArray6[14][1] = 3116;
			this.anIntArrayArray6[15][0] = 4096;
			this.anIntArrayArray6[15][1] = 2377;
			this.anIntArrayArray6[15][3] = 2746;
			this.anIntArrayArray6[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray6 = new int[4][4];
			this.anIntArrayArray6[0][0] = 2048;
			this.anIntArrayArray6[0][1] = 0;
			this.anIntArrayArray6[0][2] = 4096;
			this.anIntArrayArray6[0][3] = 0;
			this.anIntArrayArray6[1][0] = 2867;
			this.anIntArrayArray6[1][2] = 4096;
			this.anIntArrayArray6[1][3] = 0;
			this.anIntArrayArray6[1][1] = 4096;
			this.anIntArrayArray6[2][2] = 4096;
			this.anIntArrayArray6[2][0] = 3276;
			this.anIntArrayArray6[2][1] = 4096;
			this.anIntArrayArray6[2][3] = 0;
			this.anIntArrayArray6[3][1] = 4096;
			this.anIntArrayArray6[3][3] = 0;
			this.anIntArrayArray6[3][2] = 0;
			this.anIntArrayArray6[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
