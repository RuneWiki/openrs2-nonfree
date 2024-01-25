import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class3_Sub9_Sub27 extends Class3_Sub9 {

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "[I")
	private final int[] anIntArray516 = new int[257];

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(17) int local17 = arg0.method8632();
		if (local17 != 0) {
			this.method5307(local17);
			return;
		}
		this.anIntArrayArray35 = new int[arg0.method8632()][4];
		for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray35.length; local33++) {
			this.anIntArrayArray35[local33][0] = arg0.method8593();
			this.anIntArrayArray35[local33][1] = arg0.method8632() << 4;
			this.anIntArrayArray35[local33][2] = arg0.method8632() << 4;
			this.anIntArrayArray35[local33][3] = arg0.method8632() << 4;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(27) int[] local27 = this.method9162(arg0, 0);
			@Pc(31) int[] local31 = local17[0];
			@Pc(35) int[] local35 = local17[1];
			@Pc(39) int[] local39 = local17[2];
			for (@Pc(41) int local41 = 0; local41 < Static62.anInt1251; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray516[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	private void method5305() {
		@Pc(13) int local13 = this.anIntArrayArray35.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local27 < local13 && this.anIntArrayArray35[local27][0] <= local25; local27++) {
				local21++;
			}
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(60) int local60;
			@Pc(56) int[] local56;
			if (local13 <= local21) {
				local56 = this.anIntArrayArray35[local13 - 1];
				local60 = local56[3];
				local64 = local56[1];
				local68 = local56[2];
			} else {
				local56 = this.anIntArrayArray35[local21];
				if (local21 <= 0) {
					local64 = local56[1];
					local60 = local56[3];
					local68 = local56[2];
				} else {
					@Pc(101) int[] local101 = this.anIntArrayArray35[local21 - 1];
					@Pc(119) int local119 = (local25 - local101[0] << 12) / (local56[0] - local101[0]);
					@Pc(124) int local124 = 4096 - local119;
					local68 = local119 * local56[2] + local101[2] * local124 >> 12;
					local64 = local101[1] * local124 + local119 * local56[1] >> 12;
					local60 = local124 * local101[3] + local119 * local56[3] >> 12;
				}
			}
			local60 >>= 0x4;
			local64 >>= 0x4;
			local68 >>= 0x4;
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			this.anIntArray516[local17] = local68 << 8 | local64 << 16 | local60;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
		if (this.anIntArrayArray35 == null) {
			this.method5307(1);
		}
		this.method5305();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	private void method5307(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray35 = new int[2][4];
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[0][3] = 0;
			this.anIntArrayArray35[0][2] = 0;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[1][2] = 4096;
			this.anIntArrayArray35[1][3] = 4096;
			this.anIntArrayArray35[1][0] = 4096;
			this.anIntArrayArray35[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray35 = new int[8][4];
			this.anIntArrayArray35[0][3] = 2361;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][1] = 2650;
			this.anIntArrayArray35[0][2] = 2602;
			this.anIntArrayArray35[1][0] = 2867;
			this.anIntArrayArray35[1][1] = 2313;
			this.anIntArrayArray35[1][2] = 1799;
			this.anIntArrayArray35[1][3] = 1558;
			this.anIntArrayArray35[2][0] = 3072;
			this.anIntArrayArray35[2][1] = 2618;
			this.anIntArrayArray35[2][3] = 1413;
			this.anIntArrayArray35[2][2] = 1734;
			this.anIntArrayArray35[3][0] = 3276;
			this.anIntArrayArray35[3][3] = 947;
			this.anIntArrayArray35[3][2] = 1220;
			this.anIntArrayArray35[3][1] = 2296;
			this.anIntArrayArray35[4][3] = 722;
			this.anIntArrayArray35[4][1] = 2072;
			this.anIntArrayArray35[4][0] = 3481;
			this.anIntArrayArray35[4][2] = 963;
			this.anIntArrayArray35[5][1] = 2730;
			this.anIntArrayArray35[5][3] = 1766;
			this.anIntArrayArray35[5][2] = 2152;
			this.anIntArrayArray35[5][0] = 3686;
			this.anIntArrayArray35[6][2] = 1060;
			this.anIntArrayArray35[6][3] = 915;
			this.anIntArrayArray35[6][0] = 3891;
			this.anIntArrayArray35[6][1] = 2232;
			this.anIntArrayArray35[7][2] = 1413;
			this.anIntArrayArray35[7][3] = 1140;
			this.anIntArrayArray35[7][0] = 4096;
			this.anIntArrayArray35[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray35 = new int[7][4];
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][2] = 0;
			this.anIntArrayArray35[0][3] = 4096;
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[1][3] = 4096;
			this.anIntArrayArray35[1][1] = 0;
			this.anIntArrayArray35[1][2] = 4096;
			this.anIntArrayArray35[1][0] = 663;
			this.anIntArrayArray35[2][2] = 4096;
			this.anIntArrayArray35[2][3] = 0;
			this.anIntArrayArray35[2][0] = 1363;
			this.anIntArrayArray35[2][1] = 0;
			this.anIntArrayArray35[3][1] = 4096;
			this.anIntArrayArray35[3][0] = 2048;
			this.anIntArrayArray35[3][2] = 4096;
			this.anIntArrayArray35[3][3] = 0;
			this.anIntArrayArray35[4][3] = 0;
			this.anIntArrayArray35[4][2] = 0;
			this.anIntArrayArray35[4][0] = 2727;
			this.anIntArrayArray35[4][1] = 4096;
			this.anIntArrayArray35[5][1] = 4096;
			this.anIntArrayArray35[5][0] = 3411;
			this.anIntArrayArray35[5][3] = 4096;
			this.anIntArrayArray35[5][2] = 0;
			this.anIntArrayArray35[6][3] = 4096;
			this.anIntArrayArray35[6][0] = 4096;
			this.anIntArrayArray35[6][2] = 0;
			this.anIntArrayArray35[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray35 = new int[6][4];
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[0][3] = 0;
			this.anIntArrayArray35[0][2] = 0;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[1][3] = 1493;
			this.anIntArrayArray35[1][0] = 1843;
			this.anIntArrayArray35[1][1] = 0;
			this.anIntArrayArray35[1][2] = 0;
			this.anIntArrayArray35[2][0] = 2457;
			this.anIntArrayArray35[2][3] = 2939;
			this.anIntArrayArray35[2][1] = 0;
			this.anIntArrayArray35[2][2] = 0;
			this.anIntArrayArray35[3][1] = 0;
			this.anIntArrayArray35[3][0] = 2781;
			this.anIntArrayArray35[3][3] = 3565;
			this.anIntArrayArray35[3][2] = 1124;
			this.anIntArrayArray35[4][0] = 3481;
			this.anIntArrayArray35[4][2] = 3084;
			this.anIntArrayArray35[4][3] = 4031;
			this.anIntArrayArray35[4][1] = 546;
			this.anIntArrayArray35[5][2] = 4096;
			this.anIntArrayArray35[5][1] = 4096;
			this.anIntArrayArray35[5][0] = 4096;
			this.anIntArrayArray35[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray35 = new int[16][4];
			this.anIntArrayArray35[0][3] = 321;
			this.anIntArrayArray35[0][1] = 80;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][2] = 192;
			this.anIntArrayArray35[1][3] = 562;
			this.anIntArrayArray35[1][2] = 449;
			this.anIntArrayArray35[1][0] = 155;
			this.anIntArrayArray35[1][1] = 321;
			this.anIntArrayArray35[2][3] = 803;
			this.anIntArrayArray35[2][2] = 690;
			this.anIntArrayArray35[2][1] = 578;
			this.anIntArrayArray35[2][0] = 389;
			this.anIntArrayArray35[3][1] = 947;
			this.anIntArrayArray35[3][2] = 995;
			this.anIntArrayArray35[3][3] = 1140;
			this.anIntArrayArray35[3][0] = 671;
			this.anIntArrayArray35[4][3] = 1509;
			this.anIntArrayArray35[4][2] = 1397;
			this.anIntArrayArray35[4][1] = 1285;
			this.anIntArrayArray35[4][0] = 897;
			this.anIntArrayArray35[5][3] = 1413;
			this.anIntArrayArray35[5][0] = 1175;
			this.anIntArrayArray35[5][2] = 1429;
			this.anIntArrayArray35[5][1] = 1525;
			this.anIntArrayArray35[6][0] = 1368;
			this.anIntArrayArray35[6][3] = 1333;
			this.anIntArrayArray35[6][2] = 1461;
			this.anIntArrayArray35[6][1] = 1734;
			this.anIntArrayArray35[7][1] = 1413;
			this.anIntArrayArray35[7][2] = 1525;
			this.anIntArrayArray35[7][0] = 1507;
			this.anIntArrayArray35[7][3] = 1702;
			this.anIntArrayArray35[8][3] = 2056;
			this.anIntArrayArray35[8][0] = 1736;
			this.anIntArrayArray35[8][1] = 1108;
			this.anIntArrayArray35[8][2] = 1590;
			this.anIntArrayArray35[9][3] = 2666;
			this.anIntArrayArray35[9][2] = 2056;
			this.anIntArrayArray35[9][1] = 1766;
			this.anIntArrayArray35[9][0] = 2088;
			this.anIntArrayArray35[10][1] = 2409;
			this.anIntArrayArray35[10][2] = 2586;
			this.anIntArrayArray35[10][0] = 2355;
			this.anIntArrayArray35[10][3] = 3276;
			this.anIntArrayArray35[11][0] = 2691;
			this.anIntArrayArray35[11][3] = 3228;
			this.anIntArrayArray35[11][1] = 3116;
			this.anIntArrayArray35[11][2] = 3148;
			this.anIntArrayArray35[12][3] = 3196;
			this.anIntArrayArray35[12][0] = 3031;
			this.anIntArrayArray35[12][2] = 3710;
			this.anIntArrayArray35[12][1] = 3806;
			this.anIntArrayArray35[13][1] = 3437;
			this.anIntArrayArray35[13][2] = 3421;
			this.anIntArrayArray35[13][3] = 3019;
			this.anIntArrayArray35[13][0] = 3522;
			this.anIntArrayArray35[14][2] = 3148;
			this.anIntArrayArray35[14][3] = 3228;
			this.anIntArrayArray35[14][1] = 3116;
			this.anIntArrayArray35[14][0] = 3727;
			this.anIntArrayArray35[15][2] = 2505;
			this.anIntArrayArray35[15][1] = 2377;
			this.anIntArrayArray35[15][3] = 2746;
			this.anIntArrayArray35[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray35 = new int[4][4];
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[0][3] = 0;
			this.anIntArrayArray35[0][0] = 2048;
			this.anIntArrayArray35[0][2] = 4096;
			this.anIntArrayArray35[1][2] = 4096;
			this.anIntArrayArray35[1][1] = 4096;
			this.anIntArrayArray35[1][0] = 2867;
			this.anIntArrayArray35[1][3] = 0;
			this.anIntArrayArray35[2][2] = 4096;
			this.anIntArrayArray35[2][0] = 3276;
			this.anIntArrayArray35[2][1] = 4096;
			this.anIntArrayArray35[2][3] = 0;
			this.anIntArrayArray35[3][3] = 0;
			this.anIntArrayArray35[3][1] = 4096;
			this.anIntArrayArray35[3][0] = 4096;
			this.anIntArrayArray35[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
