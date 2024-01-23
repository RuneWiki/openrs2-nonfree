import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "[I")
	private int[] anIntArray35 = new int[257];

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
		if (this.anIntArrayArray2 == null) {
			this.method297(1);
		}
		this.method298();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(8) int local8 = arg0.method1853();
		if (local8 != 0) {
			this.method297(local8);
			return;
		}
		this.anIntArrayArray2 = new int[arg0.method1853()][4];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArrayArray2.length; local22++) {
			this.anIntArrayArray2[local22][0] = arg0.method1879();
			this.anIntArrayArray2[local22][1] = arg0.method1853() << 4;
			this.anIntArrayArray2[local22][2] = arg0.method1853() << 4;
			this.anIntArrayArray2[local22][3] = arg0.method1853() << 4;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(22) int[] local22 = this.method4464(arg0, 0);
			@Pc(26) int[] local26 = local7[0];
			@Pc(30) int[] local30 = local7[1];
			@Pc(34) int[] local34 = local7[2];
			for (@Pc(36) int local36 = 0; local36 < Static6.anInt4960; local36++) {
				@Pc(49) int local49 = local22[local36] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray35[local49];
				local26[local36] = local49 >> 12 & 0xFF0;
				local30[local36] = local49 >> 4 & 0xFF0;
				local34[local36] = (local49 & 0xFF) << 4;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V")
	private void method297(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray2 = new int[2][4];
			this.anIntArrayArray2[0][3] = 0;
			this.anIntArrayArray2[1][3] = 4096;
			this.anIntArrayArray2[0][0] = 0;
			this.anIntArrayArray2[0][1] = 0;
			this.anIntArrayArray2[0][2] = 0;
			this.anIntArrayArray2[1][1] = 4096;
			this.anIntArrayArray2[1][2] = 4096;
			this.anIntArrayArray2[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray2 = new int[8][4];
			this.anIntArrayArray2[0][1] = 2650;
			this.anIntArrayArray2[0][3] = 2361;
			this.anIntArrayArray2[1][1] = 2313;
			this.anIntArrayArray2[0][2] = 2602;
			this.anIntArrayArray2[1][2] = 1799;
			this.anIntArrayArray2[0][0] = 0;
			this.anIntArrayArray2[2][1] = 2618;
			this.anIntArrayArray2[2][2] = 1734;
			this.anIntArrayArray2[1][3] = 1558;
			this.anIntArrayArray2[3][1] = 2296;
			this.anIntArrayArray2[4][1] = 2072;
			this.anIntArrayArray2[5][1] = 2730;
			this.anIntArrayArray2[6][1] = 2232;
			this.anIntArrayArray2[3][2] = 1220;
			this.anIntArrayArray2[2][3] = 1413;
			this.anIntArrayArray2[4][2] = 963;
			this.anIntArrayArray2[1][0] = 2867;
			this.anIntArrayArray2[7][1] = 1686;
			this.anIntArrayArray2[3][3] = 947;
			this.anIntArrayArray2[4][3] = 722;
			this.anIntArrayArray2[5][2] = 2152;
			this.anIntArrayArray2[2][0] = 3072;
			this.anIntArrayArray2[3][0] = 3276;
			this.anIntArrayArray2[5][3] = 1766;
			this.anIntArrayArray2[6][2] = 1060;
			this.anIntArrayArray2[6][3] = 915;
			this.anIntArrayArray2[7][2] = 1413;
			this.anIntArrayArray2[4][0] = 3481;
			this.anIntArrayArray2[7][3] = 1140;
			this.anIntArrayArray2[5][0] = 3686;
			this.anIntArrayArray2[6][0] = 3891;
			this.anIntArrayArray2[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray2 = new int[7][4];
			this.anIntArrayArray2[0][3] = 4096;
			this.anIntArrayArray2[1][3] = 4096;
			this.anIntArrayArray2[2][3] = 0;
			this.anIntArrayArray2[0][0] = 0;
			this.anIntArrayArray2[0][1] = 0;
			this.anIntArrayArray2[1][1] = 0;
			this.anIntArrayArray2[0][2] = 0;
			this.anIntArrayArray2[1][2] = 4096;
			this.anIntArrayArray2[2][1] = 0;
			this.anIntArrayArray2[3][1] = 4096;
			this.anIntArrayArray2[3][3] = 0;
			this.anIntArrayArray2[1][0] = 663;
			this.anIntArrayArray2[2][0] = 1363;
			this.anIntArrayArray2[4][3] = 0;
			this.anIntArrayArray2[4][1] = 4096;
			this.anIntArrayArray2[3][0] = 2048;
			this.anIntArrayArray2[5][1] = 4096;
			this.anIntArrayArray2[2][2] = 4096;
			this.anIntArrayArray2[4][0] = 2727;
			this.anIntArrayArray2[5][3] = 4096;
			this.anIntArrayArray2[6][1] = 0;
			this.anIntArrayArray2[6][3] = 4096;
			this.anIntArrayArray2[3][2] = 4096;
			this.anIntArrayArray2[4][2] = 0;
			this.anIntArrayArray2[5][2] = 0;
			this.anIntArrayArray2[6][2] = 0;
			this.anIntArrayArray2[5][0] = 3411;
			this.anIntArrayArray2[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray2 = new int[6][4];
			this.anIntArrayArray2[0][2] = 0;
			this.anIntArrayArray2[0][3] = 0;
			this.anIntArrayArray2[1][2] = 0;
			this.anIntArrayArray2[1][3] = 1493;
			this.anIntArrayArray2[2][2] = 0;
			this.anIntArrayArray2[3][2] = 1124;
			this.anIntArrayArray2[2][3] = 2939;
			this.anIntArrayArray2[0][0] = 0;
			this.anIntArrayArray2[4][2] = 3084;
			this.anIntArrayArray2[0][1] = 0;
			this.anIntArrayArray2[1][1] = 0;
			this.anIntArrayArray2[3][3] = 3565;
			this.anIntArrayArray2[4][3] = 4031;
			this.anIntArrayArray2[1][0] = 1843;
			this.anIntArrayArray2[5][2] = 4096;
			this.anIntArrayArray2[5][3] = 4096;
			this.anIntArrayArray2[2][0] = 2457;
			this.anIntArrayArray2[2][1] = 0;
			this.anIntArrayArray2[3][0] = 2781;
			this.anIntArrayArray2[3][1] = 0;
			this.anIntArrayArray2[4][1] = 546;
			this.anIntArrayArray2[5][1] = 4096;
			this.anIntArrayArray2[4][0] = 3481;
			this.anIntArrayArray2[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray2 = new int[16][4];
			this.anIntArrayArray2[0][0] = 0;
			this.anIntArrayArray2[0][2] = 192;
			this.anIntArrayArray2[0][1] = 80;
			this.anIntArrayArray2[1][0] = 155;
			this.anIntArrayArray2[0][3] = 321;
			this.anIntArrayArray2[2][0] = 389;
			this.anIntArrayArray2[1][3] = 562;
			this.anIntArrayArray2[1][2] = 449;
			this.anIntArrayArray2[3][0] = 671;
			this.anIntArrayArray2[4][0] = 897;
			this.anIntArrayArray2[1][1] = 321;
			this.anIntArrayArray2[2][1] = 578;
			this.anIntArrayArray2[2][2] = 690;
			this.anIntArrayArray2[3][2] = 995;
			this.anIntArrayArray2[4][2] = 1397;
			this.anIntArrayArray2[3][1] = 947;
			this.anIntArrayArray2[2][3] = 803;
			this.anIntArrayArray2[4][1] = 1285;
			this.anIntArrayArray2[5][2] = 1429;
			this.anIntArrayArray2[5][1] = 1525;
			this.anIntArrayArray2[6][2] = 1461;
			this.anIntArrayArray2[5][0] = 1175;
			this.anIntArrayArray2[3][3] = 1140;
			this.anIntArrayArray2[4][3] = 1509;
			this.anIntArrayArray2[5][3] = 1413;
			this.anIntArrayArray2[6][0] = 1368;
			this.anIntArrayArray2[7][0] = 1507;
			this.anIntArrayArray2[7][2] = 1525;
			this.anIntArrayArray2[8][2] = 1590;
			this.anIntArrayArray2[9][2] = 2056;
			this.anIntArrayArray2[6][1] = 1734;
			this.anIntArrayArray2[7][1] = 1413;
			this.anIntArrayArray2[8][1] = 1108;
			this.anIntArrayArray2[10][2] = 2586;
			this.anIntArrayArray2[8][0] = 1736;
			this.anIntArrayArray2[6][3] = 1333;
			this.anIntArrayArray2[11][2] = 3148;
			this.anIntArrayArray2[12][2] = 3710;
			this.anIntArrayArray2[9][1] = 1766;
			this.anIntArrayArray2[10][1] = 2409;
			this.anIntArrayArray2[7][3] = 1702;
			this.anIntArrayArray2[11][1] = 3116;
			this.anIntArrayArray2[13][2] = 3421;
			this.anIntArrayArray2[8][3] = 2056;
			this.anIntArrayArray2[12][1] = 3806;
			this.anIntArrayArray2[9][0] = 2088;
			this.anIntArrayArray2[14][2] = 3148;
			this.anIntArrayArray2[13][1] = 3437;
			this.anIntArrayArray2[10][0] = 2355;
			this.anIntArrayArray2[15][2] = 2505;
			this.anIntArrayArray2[9][3] = 2666;
			this.anIntArrayArray2[11][0] = 2691;
			this.anIntArrayArray2[10][3] = 3276;
			this.anIntArrayArray2[14][1] = 3116;
			this.anIntArrayArray2[12][0] = 3031;
			this.anIntArrayArray2[15][1] = 2377;
			this.anIntArrayArray2[11][3] = 3228;
			this.anIntArrayArray2[12][3] = 3196;
			this.anIntArrayArray2[13][3] = 3019;
			this.anIntArrayArray2[13][0] = 3522;
			this.anIntArrayArray2[14][0] = 3727;
			this.anIntArrayArray2[14][3] = 3228;
			this.anIntArrayArray2[15][3] = 2746;
			this.anIntArrayArray2[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray2 = new int[4][4];
			this.anIntArrayArray2[0][0] = 2048;
			this.anIntArrayArray2[0][3] = 0;
			this.anIntArrayArray2[1][0] = 2867;
			this.anIntArrayArray2[0][2] = 4096;
			this.anIntArrayArray2[2][0] = 3276;
			this.anIntArrayArray2[3][0] = 4096;
			this.anIntArrayArray2[0][1] = 0;
			this.anIntArrayArray2[1][3] = 0;
			this.anIntArrayArray2[2][3] = 0;
			this.anIntArrayArray2[1][1] = 4096;
			this.anIntArrayArray2[1][2] = 4096;
			this.anIntArrayArray2[2][2] = 4096;
			this.anIntArrayArray2[3][3] = 0;
			this.anIntArrayArray2[2][1] = 4096;
			this.anIntArrayArray2[3][1] = 4096;
			this.anIntArrayArray2[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
	private void method298() {
		@Pc(14) int local14 = this.anIntArrayArray2.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(29) int local29 = 0;
			@Pc(33) int local33 = local22 << 4;
			for (@Pc(35) int local35 = 0; local35 < local14 && this.anIntArrayArray2[local35][0] <= local33; local35++) {
				local29++;
			}
			@Pc(74) int local74;
			@Pc(66) int local66;
			@Pc(70) int local70;
			@Pc(62) int[] local62;
			if (local14 <= local29) {
				local62 = this.anIntArrayArray2[local14 - 1];
				local66 = local62[2];
				local70 = local62[3];
				local74 = local62[1];
			} else {
				local62 = this.anIntArrayArray2[local29];
				if (local29 <= 0) {
					local66 = local62[2];
					local70 = local62[3];
					local74 = local62[1];
				} else {
					@Pc(106) int[] local106 = this.anIntArrayArray2[local29 - 1];
					@Pc(124) int local124 = (local33 - local106[0] << 12) / (local62[0] - local106[0]);
					@Pc(129) int local129 = 4096 - local124;
					local70 = local129 * local106[3] + local124 * local62[3] >> 12;
					local74 = local62[1] * local124 + local129 * local106[1] >> 12;
					local66 = local62[2] * local124 + local106[2] * local129 >> 12;
				}
			}
			local70 >>= 0x4;
			local66 >>= 0x4;
			if (local66 < 0) {
				local66 = 0;
			} else if (local66 > 255) {
				local66 = 255;
			}
			local74 >>= 0x4;
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 255) {
				local70 = 255;
			}
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 > 255) {
				local74 = 255;
			}
			this.anIntArray35[local22] = local74 << 16 | local66 << 8 | local70;
		}
	}
}
