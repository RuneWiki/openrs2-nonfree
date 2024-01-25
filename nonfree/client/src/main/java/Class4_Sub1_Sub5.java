import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!cca", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cca", name = "F", descriptor = "[I")
	private final int[] anIntArray35 = new int[257];

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(14) int local14 = arg1.method4905();
		if (local14 != 0) {
			this.method988(local14);
			return;
		}
		this.anIntArrayArray8 = new int[arg1.method4905()][4];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArrayArray8.length; local25++) {
			this.anIntArrayArray8[local25][0] = arg1.method4936();
			this.anIntArrayArray8[local25][1] = arg1.method4905() << 4;
			this.anIntArrayArray8[local25][2] = arg1.method4905() << 4;
			this.anIntArrayArray8[local25][3] = arg1.method4905() << 4;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
		if (this.anIntArrayArray8 == null) {
			this.method988(1);
		}
		this.method987();
	}

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "(B)V")
	private void method987() {
		@Pc(17) int local17 = this.anIntArrayArray8.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = local24 << 4;
			for (@Pc(34) int local34 = 0; local17 > local34 && local32 >= this.anIntArrayArray8[local34][0]; local34++) {
				local28++;
			}
			@Pc(74) int local74;
			@Pc(82) int local82;
			@Pc(78) int local78;
			@Pc(65) int[] local65;
			if (local17 > local28) {
				local65 = this.anIntArrayArray8[local28];
				if (local28 <= 0) {
					local74 = local65[1];
					local78 = local65[3];
					local82 = local65[2];
				} else {
					@Pc(91) int[] local91 = this.anIntArrayArray8[local28 - 1];
					@Pc(108) int local108 = (local32 - local91[0] << 12) / (local65[0] - local91[0]);
					@Pc(113) int local113 = 4096 - local108;
					local78 = local108 * local65[3] + local113 * local91[3] >> 12;
					local82 = local91[2] * local113 + local108 * local65[2] >> 12;
					local74 = local113 * local91[1] + local65[1] * local108 >> 12;
				}
			} else {
				local65 = this.anIntArrayArray8[local17 - 1];
				local82 = local65[2];
				local74 = local65[1];
				local78 = local65[3];
			}
			local82 >>= 0x4;
			local78 >>= 0x4;
			local74 >>= 0x4;
			if (local78 < 0) {
				local78 = 0;
			} else if (local78 > 255) {
				local78 = 255;
			}
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 > 255) {
				local82 = 255;
			}
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 > 255) {
				local74 = 255;
			}
			this.anIntArray35[local24] = local78 | local74 << 16 | local82 << 8;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IB)V")
	private void method988(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray8 = new int[2][4];
			this.anIntArrayArray8[0][1] = 0;
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[0][3] = 0;
			this.anIntArrayArray8[0][2] = 0;
			this.anIntArrayArray8[1][3] = 4096;
			this.anIntArrayArray8[1][0] = 4096;
			this.anIntArrayArray8[1][2] = 4096;
			this.anIntArrayArray8[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray8 = new int[8][4];
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[0][3] = 2361;
			this.anIntArrayArray8[0][1] = 2650;
			this.anIntArrayArray8[0][2] = 2602;
			this.anIntArrayArray8[1][2] = 1799;
			this.anIntArrayArray8[1][0] = 2867;
			this.anIntArrayArray8[1][1] = 2313;
			this.anIntArrayArray8[1][3] = 1558;
			this.anIntArrayArray8[2][1] = 2618;
			this.anIntArrayArray8[2][2] = 1734;
			this.anIntArrayArray8[2][0] = 3072;
			this.anIntArrayArray8[2][3] = 1413;
			this.anIntArrayArray8[3][2] = 1220;
			this.anIntArrayArray8[3][1] = 2296;
			this.anIntArrayArray8[3][0] = 3276;
			this.anIntArrayArray8[3][3] = 947;
			this.anIntArrayArray8[4][2] = 963;
			this.anIntArrayArray8[4][1] = 2072;
			this.anIntArrayArray8[4][0] = 3481;
			this.anIntArrayArray8[4][3] = 722;
			this.anIntArrayArray8[5][0] = 3686;
			this.anIntArrayArray8[5][1] = 2730;
			this.anIntArrayArray8[5][3] = 1766;
			this.anIntArrayArray8[5][2] = 2152;
			this.anIntArrayArray8[6][3] = 915;
			this.anIntArrayArray8[6][0] = 3891;
			this.anIntArrayArray8[6][2] = 1060;
			this.anIntArrayArray8[6][1] = 2232;
			this.anIntArrayArray8[7][1] = 1686;
			this.anIntArrayArray8[7][3] = 1140;
			this.anIntArrayArray8[7][2] = 1413;
			this.anIntArrayArray8[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray8 = new int[7][4];
			this.anIntArrayArray8[0][3] = 4096;
			this.anIntArrayArray8[0][1] = 0;
			this.anIntArrayArray8[0][2] = 0;
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[1][1] = 0;
			this.anIntArrayArray8[1][0] = 663;
			this.anIntArrayArray8[1][3] = 4096;
			this.anIntArrayArray8[1][2] = 4096;
			this.anIntArrayArray8[2][2] = 4096;
			this.anIntArrayArray8[2][1] = 0;
			this.anIntArrayArray8[2][3] = 0;
			this.anIntArrayArray8[2][0] = 1363;
			this.anIntArrayArray8[3][2] = 4096;
			this.anIntArrayArray8[3][0] = 2048;
			this.anIntArrayArray8[3][1] = 4096;
			this.anIntArrayArray8[3][3] = 0;
			this.anIntArrayArray8[4][1] = 4096;
			this.anIntArrayArray8[4][3] = 0;
			this.anIntArrayArray8[4][0] = 2727;
			this.anIntArrayArray8[4][2] = 0;
			this.anIntArrayArray8[5][1] = 4096;
			this.anIntArrayArray8[5][0] = 3411;
			this.anIntArrayArray8[5][3] = 4096;
			this.anIntArrayArray8[5][2] = 0;
			this.anIntArrayArray8[6][2] = 0;
			this.anIntArrayArray8[6][3] = 4096;
			this.anIntArrayArray8[6][0] = 4096;
			this.anIntArrayArray8[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray8 = new int[6][4];
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[0][1] = 0;
			this.anIntArrayArray8[0][2] = 0;
			this.anIntArrayArray8[0][3] = 0;
			this.anIntArrayArray8[1][0] = 1843;
			this.anIntArrayArray8[1][1] = 0;
			this.anIntArrayArray8[1][2] = 0;
			this.anIntArrayArray8[1][3] = 1493;
			this.anIntArrayArray8[2][3] = 2939;
			this.anIntArrayArray8[2][2] = 0;
			this.anIntArrayArray8[2][0] = 2457;
			this.anIntArrayArray8[2][1] = 0;
			this.anIntArrayArray8[3][1] = 0;
			this.anIntArrayArray8[3][3] = 3565;
			this.anIntArrayArray8[3][0] = 2781;
			this.anIntArrayArray8[3][2] = 1124;
			this.anIntArrayArray8[4][3] = 4031;
			this.anIntArrayArray8[4][1] = 546;
			this.anIntArrayArray8[4][2] = 3084;
			this.anIntArrayArray8[4][0] = 3481;
			this.anIntArrayArray8[5][2] = 4096;
			this.anIntArrayArray8[5][3] = 4096;
			this.anIntArrayArray8[5][0] = 4096;
			this.anIntArrayArray8[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray8 = new int[16][4];
			this.anIntArrayArray8[0][1] = 80;
			this.anIntArrayArray8[0][3] = 321;
			this.anIntArrayArray8[0][2] = 192;
			this.anIntArrayArray8[0][0] = 0;
			this.anIntArrayArray8[1][2] = 449;
			this.anIntArrayArray8[1][3] = 562;
			this.anIntArrayArray8[1][1] = 321;
			this.anIntArrayArray8[1][0] = 155;
			this.anIntArrayArray8[2][1] = 578;
			this.anIntArrayArray8[2][0] = 389;
			this.anIntArrayArray8[2][2] = 690;
			this.anIntArrayArray8[2][3] = 803;
			this.anIntArrayArray8[3][3] = 1140;
			this.anIntArrayArray8[3][1] = 947;
			this.anIntArrayArray8[3][2] = 995;
			this.anIntArrayArray8[3][0] = 671;
			this.anIntArrayArray8[4][1] = 1285;
			this.anIntArrayArray8[4][2] = 1397;
			this.anIntArrayArray8[4][0] = 897;
			this.anIntArrayArray8[4][3] = 1509;
			this.anIntArrayArray8[5][2] = 1429;
			this.anIntArrayArray8[5][0] = 1175;
			this.anIntArrayArray8[5][1] = 1525;
			this.anIntArrayArray8[5][3] = 1413;
			this.anIntArrayArray8[6][1] = 1734;
			this.anIntArrayArray8[6][3] = 1333;
			this.anIntArrayArray8[6][0] = 1368;
			this.anIntArrayArray8[6][2] = 1461;
			this.anIntArrayArray8[7][3] = 1702;
			this.anIntArrayArray8[7][1] = 1413;
			this.anIntArrayArray8[7][2] = 1525;
			this.anIntArrayArray8[7][0] = 1507;
			this.anIntArrayArray8[8][2] = 1590;
			this.anIntArrayArray8[8][1] = 1108;
			this.anIntArrayArray8[8][3] = 2056;
			this.anIntArrayArray8[8][0] = 1736;
			this.anIntArrayArray8[9][3] = 2666;
			this.anIntArrayArray8[9][1] = 1766;
			this.anIntArrayArray8[9][2] = 2056;
			this.anIntArrayArray8[9][0] = 2088;
			this.anIntArrayArray8[10][3] = 3276;
			this.anIntArrayArray8[10][2] = 2586;
			this.anIntArrayArray8[10][0] = 2355;
			this.anIntArrayArray8[10][1] = 2409;
			this.anIntArrayArray8[11][2] = 3148;
			this.anIntArrayArray8[11][3] = 3228;
			this.anIntArrayArray8[11][0] = 2691;
			this.anIntArrayArray8[11][1] = 3116;
			this.anIntArrayArray8[12][2] = 3710;
			this.anIntArrayArray8[12][3] = 3196;
			this.anIntArrayArray8[12][1] = 3806;
			this.anIntArrayArray8[12][0] = 3031;
			this.anIntArrayArray8[13][3] = 3019;
			this.anIntArrayArray8[13][2] = 3421;
			this.anIntArrayArray8[13][0] = 3522;
			this.anIntArrayArray8[13][1] = 3437;
			this.anIntArrayArray8[14][3] = 3228;
			this.anIntArrayArray8[14][0] = 3727;
			this.anIntArrayArray8[14][1] = 3116;
			this.anIntArrayArray8[14][2] = 3148;
			this.anIntArrayArray8[15][2] = 2505;
			this.anIntArrayArray8[15][3] = 2746;
			this.anIntArrayArray8[15][0] = 4096;
			this.anIntArrayArray8[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray8 = new int[4][4];
			this.anIntArrayArray8[0][0] = 2048;
			this.anIntArrayArray8[0][2] = 4096;
			this.anIntArrayArray8[0][1] = 0;
			this.anIntArrayArray8[0][3] = 0;
			this.anIntArrayArray8[1][0] = 2867;
			this.anIntArrayArray8[1][3] = 0;
			this.anIntArrayArray8[1][1] = 4096;
			this.anIntArrayArray8[1][2] = 4096;
			this.anIntArrayArray8[2][3] = 0;
			this.anIntArrayArray8[2][0] = 3276;
			this.anIntArrayArray8[2][1] = 4096;
			this.anIntArrayArray8[2][2] = 4096;
			this.anIntArrayArray8[3][0] = 4096;
			this.anIntArrayArray8[3][3] = 0;
			this.anIntArrayArray8[3][2] = 0;
			this.anIntArrayArray8[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(26) int[] local26 = this.method8392(arg0, 0);
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local11[2];
			for (@Pc(40) int local40 = 0; local40 < Static376.anInt7260; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray35[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
