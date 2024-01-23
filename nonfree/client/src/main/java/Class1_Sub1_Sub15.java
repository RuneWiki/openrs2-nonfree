import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ji", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ji", name = "V", descriptor = "[I")
	private int[] anIntArray223 = new int[257];

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(14) int local14 = arg0.method2945();
		if (local14 != 0) {
			this.method1794(local14);
			return;
		}
		this.anIntArrayArray26 = new int[arg0.method2945()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray26.length; local31++) {
			this.anIntArrayArray26[local31][0] = arg0.method2964();
			this.anIntArrayArray26[local31][1] = arg0.method2945() << 4;
			this.anIntArrayArray26[local31][2] = arg0.method2945() << 4;
			this.anIntArrayArray26[local31][3] = arg0.method2945() << 4;
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(II)V")
	private void method1794(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray26 = new int[2][4];
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][1] = 4096;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[1][3] = 4096;
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[1][0] = 4096;
			this.anIntArrayArray26[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray26 = new int[8][4];
			this.anIntArrayArray26[0][2] = 2602;
			this.anIntArrayArray26[1][2] = 1799;
			this.anIntArrayArray26[0][1] = 2650;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[2][2] = 1734;
			this.anIntArrayArray26[1][0] = 2867;
			this.anIntArrayArray26[3][2] = 1220;
			this.anIntArrayArray26[4][2] = 963;
			this.anIntArrayArray26[2][0] = 3072;
			this.anIntArrayArray26[1][1] = 2313;
			this.anIntArrayArray26[5][2] = 2152;
			this.anIntArrayArray26[6][2] = 1060;
			this.anIntArrayArray26[3][0] = 3276;
			this.anIntArrayArray26[2][1] = 2618;
			this.anIntArrayArray26[3][1] = 2296;
			this.anIntArrayArray26[0][3] = 2361;
			this.anIntArrayArray26[4][0] = 3481;
			this.anIntArrayArray26[5][0] = 3686;
			this.anIntArrayArray26[7][2] = 1413;
			this.anIntArrayArray26[6][0] = 3891;
			this.anIntArrayArray26[1][3] = 1558;
			this.anIntArrayArray26[4][1] = 2072;
			this.anIntArrayArray26[2][3] = 1413;
			this.anIntArrayArray26[3][3] = 947;
			this.anIntArrayArray26[4][3] = 722;
			this.anIntArrayArray26[5][3] = 1766;
			this.anIntArrayArray26[7][0] = 4096;
			this.anIntArrayArray26[5][1] = 2730;
			this.anIntArrayArray26[6][3] = 915;
			this.anIntArrayArray26[7][3] = 1140;
			this.anIntArrayArray26[6][1] = 2232;
			this.anIntArrayArray26[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray26 = new int[7][4];
			this.anIntArrayArray26[0][3] = 4096;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][3] = 4096;
			this.anIntArrayArray26[1][1] = 0;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[2][3] = 0;
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[1][0] = 663;
			this.anIntArrayArray26[2][0] = 1363;
			this.anIntArrayArray26[3][3] = 0;
			this.anIntArrayArray26[4][3] = 0;
			this.anIntArrayArray26[3][0] = 2048;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[2][2] = 4096;
			this.anIntArrayArray26[3][2] = 4096;
			this.anIntArrayArray26[4][2] = 0;
			this.anIntArrayArray26[5][3] = 4096;
			this.anIntArrayArray26[5][2] = 0;
			this.anIntArrayArray26[2][1] = 0;
			this.anIntArrayArray26[3][1] = 4096;
			this.anIntArrayArray26[6][3] = 4096;
			this.anIntArrayArray26[6][2] = 0;
			this.anIntArrayArray26[4][1] = 4096;
			this.anIntArrayArray26[5][1] = 4096;
			this.anIntArrayArray26[6][1] = 0;
			this.anIntArrayArray26[4][0] = 2727;
			this.anIntArrayArray26[5][0] = 3411;
			this.anIntArrayArray26[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray26 = new int[6][4];
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[1][2] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[2][2] = 0;
			this.anIntArrayArray26[1][1] = 0;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[3][2] = 1124;
			this.anIntArrayArray26[2][1] = 0;
			this.anIntArrayArray26[1][0] = 1843;
			this.anIntArrayArray26[3][1] = 0;
			this.anIntArrayArray26[2][0] = 2457;
			this.anIntArrayArray26[3][0] = 2781;
			this.anIntArrayArray26[4][2] = 3084;
			this.anIntArrayArray26[5][2] = 4096;
			this.anIntArrayArray26[4][1] = 546;
			this.anIntArrayArray26[1][3] = 1493;
			this.anIntArrayArray26[5][1] = 4096;
			this.anIntArrayArray26[2][3] = 2939;
			this.anIntArrayArray26[3][3] = 3565;
			this.anIntArrayArray26[4][0] = 3481;
			this.anIntArrayArray26[5][0] = 4096;
			this.anIntArrayArray26[4][3] = 4031;
			this.anIntArrayArray26[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray26 = new int[16][4];
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][0] = 155;
			this.anIntArrayArray26[0][1] = 80;
			this.anIntArrayArray26[0][3] = 321;
			this.anIntArrayArray26[1][1] = 321;
			this.anIntArrayArray26[2][1] = 578;
			this.anIntArrayArray26[3][1] = 947;
			this.anIntArrayArray26[0][2] = 192;
			this.anIntArrayArray26[1][3] = 562;
			this.anIntArrayArray26[2][3] = 803;
			this.anIntArrayArray26[3][3] = 1140;
			this.anIntArrayArray26[1][2] = 449;
			this.anIntArrayArray26[2][2] = 690;
			this.anIntArrayArray26[2][0] = 389;
			this.anIntArrayArray26[3][2] = 995;
			this.anIntArrayArray26[3][0] = 671;
			this.anIntArrayArray26[4][0] = 897;
			this.anIntArrayArray26[4][2] = 1397;
			this.anIntArrayArray26[5][2] = 1429;
			this.anIntArrayArray26[5][0] = 1175;
			this.anIntArrayArray26[6][0] = 1368;
			this.anIntArrayArray26[4][3] = 1509;
			this.anIntArrayArray26[7][0] = 1507;
			this.anIntArrayArray26[4][1] = 1285;
			this.anIntArrayArray26[8][0] = 1736;
			this.anIntArrayArray26[6][2] = 1461;
			this.anIntArrayArray26[7][2] = 1525;
			this.anIntArrayArray26[8][2] = 1590;
			this.anIntArrayArray26[9][2] = 2056;
			this.anIntArrayArray26[9][0] = 2088;
			this.anIntArrayArray26[5][3] = 1413;
			this.anIntArrayArray26[10][2] = 2586;
			this.anIntArrayArray26[11][2] = 3148;
			this.anIntArrayArray26[5][1] = 1525;
			this.anIntArrayArray26[10][0] = 2355;
			this.anIntArrayArray26[11][0] = 2691;
			this.anIntArrayArray26[12][0] = 3031;
			this.anIntArrayArray26[13][0] = 3522;
			this.anIntArrayArray26[14][0] = 3727;
			this.anIntArrayArray26[6][3] = 1333;
			this.anIntArrayArray26[12][2] = 3710;
			this.anIntArrayArray26[13][2] = 3421;
			this.anIntArrayArray26[14][2] = 3148;
			this.anIntArrayArray26[15][0] = 4096;
			this.anIntArrayArray26[6][1] = 1734;
			this.anIntArrayArray26[15][2] = 2505;
			this.anIntArrayArray26[7][3] = 1702;
			this.anIntArrayArray26[7][1] = 1413;
			this.anIntArrayArray26[8][1] = 1108;
			this.anIntArrayArray26[9][1] = 1766;
			this.anIntArrayArray26[8][3] = 2056;
			this.anIntArrayArray26[9][3] = 2666;
			this.anIntArrayArray26[10][1] = 2409;
			this.anIntArrayArray26[10][3] = 3276;
			this.anIntArrayArray26[11][3] = 3228;
			this.anIntArrayArray26[12][3] = 3196;
			this.anIntArrayArray26[11][1] = 3116;
			this.anIntArrayArray26[12][1] = 3806;
			this.anIntArrayArray26[13][3] = 3019;
			this.anIntArrayArray26[13][1] = 3437;
			this.anIntArrayArray26[14][1] = 3116;
			this.anIntArrayArray26[15][1] = 2377;
			this.anIntArrayArray26[14][3] = 3228;
			this.anIntArrayArray26[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray26 = new int[4][4];
			this.anIntArrayArray26[0][2] = 4096;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[0][0] = 2048;
			this.anIntArrayArray26[1][1] = 4096;
			this.anIntArrayArray26[1][3] = 0;
			this.anIntArrayArray26[2][1] = 4096;
			this.anIntArrayArray26[1][0] = 2867;
			this.anIntArrayArray26[2][3] = 0;
			this.anIntArrayArray26[3][1] = 4096;
			this.anIntArrayArray26[2][0] = 3276;
			this.anIntArrayArray26[2][2] = 4096;
			this.anIntArrayArray26[3][2] = 0;
			this.anIntArrayArray26[3][3] = 0;
			this.anIntArrayArray26[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(17) int[] local17 = this.method3706(arg0, 0);
			@Pc(21) int[] local21 = local7[0];
			@Pc(25) int[] local25 = local7[2];
			@Pc(29) int[] local29 = local7[1];
			for (@Pc(31) int local31 = 0; local31 < Static11.anInt294; local31++) {
				@Pc(39) int local39 = local17[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local39 = this.anIntArray223[local39];
				local21[local31] = local39 >> 12 & 0xFF0;
				local29[local31] = local39 >> 4 & 0xFF0;
				local25[local31] = (local39 & 0xFF) << 4;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
		if (this.anIntArrayArray26 == null) {
			this.method1794(1);
		}
		this.method1796();
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
	private void method1796() {
		@Pc(14) int local14 = this.anIntArrayArray26.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 257; local18++) {
			@Pc(22) int local22 = 0;
			@Pc(26) int local26 = local18 << 4;
			for (@Pc(28) int local28 = 0; local14 > local28 && this.anIntArrayArray26[local28][0] <= local26; local28++) {
				local22++;
			}
			@Pc(69) int local69;
			@Pc(73) int local73;
			@Pc(65) int local65;
			@Pc(61) int[] local61;
			if (local22 >= local14) {
				local61 = this.anIntArrayArray26[local14 - 1];
				local65 = local61[3];
				local69 = local61[1];
				local73 = local61[2];
			} else {
				local61 = this.anIntArrayArray26[local22];
				if (local22 <= 0) {
					local65 = local61[3];
					local69 = local61[1];
					local73 = local61[2];
				} else {
					@Pc(103) int[] local103 = this.anIntArrayArray26[local22 - 1];
					@Pc(120) int local120 = (local26 - local103[0] << 12) / (local61[0] - local103[0]);
					@Pc(125) int local125 = 4096 - local120;
					local69 = local61[1] * local120 + local125 * local103[1] >> 12;
					local65 = local61[3] * local120 + local125 * local103[3] >> 12;
					local73 = local120 * local61[2] + local103[2] * local125 >> 12;
				}
			}
			local73 >>= 0x4;
			if (local73 < 0) {
				local73 = 0;
			} else if (local73 > 255) {
				local73 = 255;
			}
			local65 >>= 0x4;
			if (local65 < 0) {
				local65 = 0;
			} else if (local65 > 255) {
				local65 = 255;
			}
			local69 >>= 0x4;
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			this.anIntArray223[local18] = local65 | local73 << 8 | local69 << 16;
		}
	}
}
