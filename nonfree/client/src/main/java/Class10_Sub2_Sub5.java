import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class10_Sub2_Sub5 extends Class10_Sub2 {

	@OriginalMember(owner = "client!di", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "[I")
	private final int[] anIntArray116 = new int[257];

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)V")
	private void method1390(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray8 = new int[2][4];
			this.anIntArrayArray8[0][3] = 0;
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[0][1] = 0;
			this.anIntArrayArray8[0][2] = 0;
			this.anIntArrayArray8[1][3] = 4096;
			this.anIntArrayArray8[1][0] = 4096;
			this.anIntArrayArray8[1][1] = 4096;
			this.anIntArrayArray8[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray8 = new int[8][4];
			this.anIntArrayArray8[0][2] = 2602;
			this.anIntArrayArray8[0][3] = 2361;
			this.anIntArrayArray8[0][1] = 2650;
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[1][2] = 1799;
			this.anIntArrayArray8[1][3] = 1558;
			this.anIntArrayArray8[1][1] = 2313;
			this.anIntArrayArray8[1][0] = 2867;
			this.anIntArrayArray8[2][2] = 1734;
			this.anIntArrayArray8[2][0] = 3072;
			this.anIntArrayArray8[2][3] = 1413;
			this.anIntArrayArray8[2][1] = 2618;
			this.anIntArrayArray8[3][1] = 2296;
			this.anIntArrayArray8[3][0] = 3276;
			this.anIntArrayArray8[3][2] = 1220;
			this.anIntArrayArray8[3][3] = 947;
			this.anIntArrayArray8[4][3] = 722;
			this.anIntArrayArray8[4][2] = 963;
			this.anIntArrayArray8[4][0] = 3481;
			this.anIntArrayArray8[4][1] = 2072;
			this.anIntArrayArray8[5][3] = 1766;
			this.anIntArrayArray8[5][0] = 3686;
			this.anIntArrayArray8[5][1] = 2730;
			this.anIntArrayArray8[5][2] = 2152;
			this.anIntArrayArray8[6][2] = 1060;
			this.anIntArrayArray8[6][0] = 3891;
			this.anIntArrayArray8[6][1] = 2232;
			this.anIntArrayArray8[6][3] = 915;
			this.anIntArrayArray8[7][1] = 1686;
			this.anIntArrayArray8[7][0] = 4096;
			this.anIntArrayArray8[7][3] = 1140;
			this.anIntArrayArray8[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray8 = new int[7][4];
			this.anIntArrayArray8[0][3] = 4096;
			this.anIntArrayArray8[0][2] = 0;
			this.anIntArrayArray8[0][1] = 0;
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[1][2] = 4096;
			this.anIntArrayArray8[1][3] = 4096;
			this.anIntArrayArray8[1][0] = 663;
			this.anIntArrayArray8[1][1] = 0;
			this.anIntArrayArray8[2][1] = 0;
			this.anIntArrayArray8[2][3] = 0;
			this.anIntArrayArray8[2][2] = 4096;
			this.anIntArrayArray8[2][0] = 1363;
			this.anIntArrayArray8[3][3] = 0;
			this.anIntArrayArray8[3][1] = 4096;
			this.anIntArrayArray8[3][2] = 4096;
			this.anIntArrayArray8[3][0] = 2048;
			this.anIntArrayArray8[4][3] = 0;
			this.anIntArrayArray8[4][1] = 4096;
			this.anIntArrayArray8[4][0] = 2727;
			this.anIntArrayArray8[4][2] = 0;
			this.anIntArrayArray8[5][3] = 4096;
			this.anIntArrayArray8[5][0] = 3411;
			this.anIntArrayArray8[5][1] = 4096;
			this.anIntArrayArray8[5][2] = 0;
			this.anIntArrayArray8[6][2] = 0;
			this.anIntArrayArray8[6][3] = 4096;
			this.anIntArrayArray8[6][1] = 0;
			this.anIntArrayArray8[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray8 = new int[6][4];
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[0][2] = 0;
			this.anIntArrayArray8[0][3] = 0;
			this.anIntArrayArray8[0][1] = 0;
			this.anIntArrayArray8[1][2] = 0;
			this.anIntArrayArray8[1][1] = 0;
			this.anIntArrayArray8[1][0] = 1843;
			this.anIntArrayArray8[1][3] = 1493;
			this.anIntArrayArray8[2][3] = 2939;
			this.anIntArrayArray8[2][1] = 0;
			this.anIntArrayArray8[2][0] = 2457;
			this.anIntArrayArray8[2][2] = 0;
			this.anIntArrayArray8[3][2] = 1124;
			this.anIntArrayArray8[3][0] = 2781;
			this.anIntArrayArray8[3][1] = 0;
			this.anIntArrayArray8[3][3] = 3565;
			this.anIntArrayArray8[4][2] = 3084;
			this.anIntArrayArray8[4][0] = 3481;
			this.anIntArrayArray8[4][3] = 4031;
			this.anIntArrayArray8[4][1] = 546;
			this.anIntArrayArray8[5][2] = 4096;
			this.anIntArrayArray8[5][1] = 4096;
			this.anIntArrayArray8[5][3] = 4096;
			this.anIntArrayArray8[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray8 = new int[16][4];
			this.anIntArrayArray8[0][1] = 80;
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[0][3] = 321;
			this.anIntArrayArray8[0][2] = 192;
			this.anIntArrayArray8[1][3] = 562;
			this.anIntArrayArray8[1][1] = 321;
			this.anIntArrayArray8[1][0] = 155;
			this.anIntArrayArray8[1][2] = 449;
			this.anIntArrayArray8[2][0] = 389;
			this.anIntArrayArray8[2][2] = 690;
			this.anIntArrayArray8[2][3] = 803;
			this.anIntArrayArray8[2][1] = 578;
			this.anIntArrayArray8[3][3] = 1140;
			this.anIntArrayArray8[3][1] = 947;
			this.anIntArrayArray8[3][2] = 995;
			this.anIntArrayArray8[3][0] = 671;
			this.anIntArrayArray8[4][1] = 1285;
			this.anIntArrayArray8[4][2] = 1397;
			this.anIntArrayArray8[4][3] = 1509;
			this.anIntArrayArray8[4][0] = 897;
			this.anIntArrayArray8[5][3] = 1413;
			this.anIntArrayArray8[5][2] = 1429;
			this.anIntArrayArray8[5][1] = 1525;
			this.anIntArrayArray8[5][0] = 1175;
			this.anIntArrayArray8[6][2] = 1461;
			this.anIntArrayArray8[6][3] = 1333;
			this.anIntArrayArray8[6][1] = 1734;
			this.anIntArrayArray8[6][0] = 1368;
			this.anIntArrayArray8[7][1] = 1413;
			this.anIntArrayArray8[7][0] = 1507;
			this.anIntArrayArray8[7][3] = 1702;
			this.anIntArrayArray8[7][2] = 1525;
			this.anIntArrayArray8[8][1] = 1108;
			this.anIntArrayArray8[8][3] = 2056;
			this.anIntArrayArray8[8][0] = 1736;
			this.anIntArrayArray8[8][2] = 1590;
			this.anIntArrayArray8[9][1] = 1766;
			this.anIntArrayArray8[9][3] = 2666;
			this.anIntArrayArray8[9][0] = 2088;
			this.anIntArrayArray8[9][2] = 2056;
			this.anIntArrayArray8[10][0] = 2355;
			this.anIntArrayArray8[10][3] = 3276;
			this.anIntArrayArray8[10][2] = 2586;
			this.anIntArrayArray8[10][1] = 2409;
			this.anIntArrayArray8[11][3] = 3228;
			this.anIntArrayArray8[11][1] = 3116;
			this.anIntArrayArray8[11][2] = 3148;
			this.anIntArrayArray8[11][0] = 2691;
			this.anIntArrayArray8[12][0] = 3031;
			this.anIntArrayArray8[12][3] = 3196;
			this.anIntArrayArray8[12][2] = 3710;
			this.anIntArrayArray8[12][1] = 3806;
			this.anIntArrayArray8[13][2] = 3421;
			this.anIntArrayArray8[13][1] = 3437;
			this.anIntArrayArray8[13][3] = 3019;
			this.anIntArrayArray8[13][0] = 3522;
			this.anIntArrayArray8[14][2] = 3148;
			this.anIntArrayArray8[14][1] = 3116;
			this.anIntArrayArray8[14][0] = 3727;
			this.anIntArrayArray8[14][3] = 3228;
			this.anIntArrayArray8[15][1] = 2377;
			this.anIntArrayArray8[15][0] = 4096;
			this.anIntArrayArray8[15][3] = 2746;
			this.anIntArrayArray8[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray8 = new int[4][4];
			this.anIntArrayArray8[0][2] = 4096;
			this.anIntArrayArray8[0][3] = 0;
			this.anIntArrayArray8[0][0] = 2048;
			this.anIntArrayArray8[0][1] = 0;
			this.anIntArrayArray8[1][1] = 4096;
			this.anIntArrayArray8[1][3] = 0;
			this.anIntArrayArray8[1][0] = 2867;
			this.anIntArrayArray8[1][2] = 4096;
			this.anIntArrayArray8[2][1] = 4096;
			this.anIntArrayArray8[2][0] = 3276;
			this.anIntArrayArray8[2][2] = 4096;
			this.anIntArrayArray8[2][3] = 0;
			this.anIntArrayArray8[3][2] = 0;
			this.anIntArrayArray8[3][0] = 4096;
			this.anIntArrayArray8[3][1] = 4096;
			this.anIntArrayArray8[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
		if (this.anIntArrayArray8 == null) {
			this.method1390(1);
		}
		this.method1392();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(15) int local15 = arg1.method2502();
		if (local15 != 0) {
			this.method1390(local15);
			return;
		}
		this.anIntArrayArray8 = new int[arg1.method2502()][4];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray8.length; local29++) {
			this.anIntArrayArray8[local29][0] = arg1.method2485();
			this.anIntArrayArray8[local29][1] = arg1.method2502() << 4;
			this.anIntArrayArray8[local29][2] = arg1.method2502() << 4;
			this.anIntArrayArray8[local29][3] = arg1.method2502() << 4;
		}
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
	private void method1392() {
		@Pc(9) int local9 = this.anIntArrayArray8.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < 257; local13++) {
			@Pc(17) int local17 = 0;
			@Pc(21) int local21 = local13 << 4;
			for (@Pc(23) int local23 = 0; local23 < local9 && local21 >= this.anIntArrayArray8[local23][0]; local23++) {
				local17++;
			}
			@Pc(64) int local64;
			@Pc(60) int local60;
			@Pc(56) int local56;
			@Pc(50) int[] local50;
			if (local9 > local17) {
				local50 = this.anIntArrayArray8[local17];
				if (local17 <= 0) {
					local56 = local50[3];
					local60 = local50[2];
					local64 = local50[1];
				} else {
					@Pc(73) int[] local73 = this.anIntArrayArray8[local17 - 1];
					@Pc(90) int local90 = (local21 - local73[0] << 12) / (local50[0] - local73[0]);
					@Pc(95) int local95 = 4096 - local90;
					local60 = local50[2] * local90 + local95 * local73[2] >> 12;
					local64 = local73[1] * local95 + local90 * local50[1] >> 12;
					local56 = local73[3] * local95 + local90 * local50[3] >> 12;
				}
			} else {
				local50 = this.anIntArrayArray8[local9 - 1];
				local64 = local50[1];
				local60 = local50[2];
				local56 = local50[3];
			}
			local60 >>= 0x4;
			local56 >>= 0x4;
			local64 >>= 0x4;
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			if (local56 < 0) {
				local56 = 0;
			} else if (local56 > 255) {
				local56 = 255;
			}
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			this.anIntArray116[local13] = local64 << 16 | local60 << 8 | local56;
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(28) int[] local28 = this.method6041(arg0, 0);
			@Pc(32) int[] local32 = local18[0];
			@Pc(36) int[] local36 = local18[1];
			@Pc(40) int[] local40 = local18[2];
			for (@Pc(42) int local42 = 0; local42 < Static121.anInt2458; local42++) {
				@Pc(50) int local50 = local28[local42] >> 4;
				if (local50 < 0) {
					local50 = 0;
				}
				if (local50 > 256) {
					local50 = 256;
				}
				local50 = this.anIntArray116[local50];
				local32[local42] = local50 >> 12 & 0xFF0;
				local36[local42] = local50 >> 4 & 0xFF0;
				local40[local42] = (local50 & 0xFF) << 4;
			}
		}
		return local18;
	}
}
