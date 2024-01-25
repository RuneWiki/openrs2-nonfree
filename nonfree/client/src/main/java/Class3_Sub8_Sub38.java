import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class3_Sub8_Sub38 extends Class3_Sub8 {

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!vi", name = "P", descriptor = "[I")
	private final int[] anIntArray558 = new int[257];

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(7) int local7 = arg1.method7954();
		if (local7 != 0) {
			this.method8631(local7);
			return;
		}
		this.anIntArrayArray57 = new int[arg1.method7954()][4];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray57.length; local24++) {
			this.anIntArrayArray57[local24][0] = arg1.method7951();
			this.anIntArrayArray57[local24][1] = arg1.method7954() << 4;
			this.anIntArrayArray57[local24][2] = arg1.method7954() << 4;
			this.anIntArrayArray57[local24][3] = arg1.method7954() << 4;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(29) int[] local29 = this.method8776(arg0, 0);
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			for (@Pc(43) int local43 = 0; local43 < Static91.anInt1849; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray558[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V")
	private void method8628() {
		@Pc(17) int local17 = this.anIntArrayArray57.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < 257; local24++) {
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = local24 << 4;
			for (@Pc(34) int local34 = 0; local17 > local34 && this.anIntArrayArray57[local34][0] <= local32; local34++) {
				local28++;
			}
			@Pc(106) int local106;
			@Pc(135) int local135;
			@Pc(121) int local121;
			@Pc(61) int[] local61;
			if (local17 > local28) {
				local61 = this.anIntArrayArray57[local28];
				if (local28 > 0) {
					@Pc(70) int[] local70 = this.anIntArrayArray57[local28 - 1];
					@Pc(87) int local87 = (local32 - local70[0] << 12) / (local61[0] - local70[0]);
					@Pc(92) int local92 = 4096 - local87;
					local106 = local61[1] * local87 + local92 * local70[1] >> 12;
					local121 = local87 * local61[3] + local92 * local70[3] >> 12;
					local135 = local92 * local70[2] + local61[2] * local87 >> 12;
				} else {
					local106 = local61[1];
					local121 = local61[3];
					local135 = local61[2];
				}
			} else {
				local61 = this.anIntArrayArray57[local17 - 1];
				local135 = local61[2];
				local106 = local61[1];
				local121 = local61[3];
			}
			local121 >>= 0x4;
			local106 >>= 0x4;
			local135 >>= 0x4;
			if (local121 < 0) {
				local121 = 0;
			} else if (local121 > 255) {
				local121 = 255;
			}
			if (local135 < 0) {
				local135 = 0;
			} else if (local135 > 255) {
				local135 = 255;
			}
			if (local106 < 0) {
				local106 = 0;
			} else if (local106 > 255) {
				local106 = 255;
			}
			this.anIntArray558[local24] = local135 << 8 | local106 << 16 | local121;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	private void method8631(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray57 = new int[2][4];
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][2] = 0;
			this.anIntArrayArray57[0][3] = 0;
			this.anIntArrayArray57[0][1] = 0;
			this.anIntArrayArray57[1][0] = 4096;
			this.anIntArrayArray57[1][3] = 4096;
			this.anIntArrayArray57[1][1] = 4096;
			this.anIntArrayArray57[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray57 = new int[8][4];
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][2] = 2602;
			this.anIntArrayArray57[0][3] = 2361;
			this.anIntArrayArray57[0][1] = 2650;
			this.anIntArrayArray57[1][3] = 1558;
			this.anIntArrayArray57[1][1] = 2313;
			this.anIntArrayArray57[1][2] = 1799;
			this.anIntArrayArray57[1][0] = 2867;
			this.anIntArrayArray57[2][3] = 1413;
			this.anIntArrayArray57[2][0] = 3072;
			this.anIntArrayArray57[2][1] = 2618;
			this.anIntArrayArray57[2][2] = 1734;
			this.anIntArrayArray57[3][1] = 2296;
			this.anIntArrayArray57[3][0] = 3276;
			this.anIntArrayArray57[3][2] = 1220;
			this.anIntArrayArray57[3][3] = 947;
			this.anIntArrayArray57[4][0] = 3481;
			this.anIntArrayArray57[4][1] = 2072;
			this.anIntArrayArray57[4][2] = 963;
			this.anIntArrayArray57[4][3] = 722;
			this.anIntArrayArray57[5][2] = 2152;
			this.anIntArrayArray57[5][3] = 1766;
			this.anIntArrayArray57[5][0] = 3686;
			this.anIntArrayArray57[5][1] = 2730;
			this.anIntArrayArray57[6][1] = 2232;
			this.anIntArrayArray57[6][2] = 1060;
			this.anIntArrayArray57[6][0] = 3891;
			this.anIntArrayArray57[6][3] = 915;
			this.anIntArrayArray57[7][2] = 1413;
			this.anIntArrayArray57[7][0] = 4096;
			this.anIntArrayArray57[7][3] = 1140;
			this.anIntArrayArray57[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray57 = new int[7][4];
			this.anIntArrayArray57[0][3] = 4096;
			this.anIntArrayArray57[0][2] = 0;
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][1] = 0;
			this.anIntArrayArray57[1][2] = 4096;
			this.anIntArrayArray57[1][3] = 4096;
			this.anIntArrayArray57[1][1] = 0;
			this.anIntArrayArray57[1][0] = 663;
			this.anIntArrayArray57[2][0] = 1363;
			this.anIntArrayArray57[2][1] = 0;
			this.anIntArrayArray57[2][3] = 0;
			this.anIntArrayArray57[2][2] = 4096;
			this.anIntArrayArray57[3][3] = 0;
			this.anIntArrayArray57[3][1] = 4096;
			this.anIntArrayArray57[3][2] = 4096;
			this.anIntArrayArray57[3][0] = 2048;
			this.anIntArrayArray57[4][0] = 2727;
			this.anIntArrayArray57[4][3] = 0;
			this.anIntArrayArray57[4][1] = 4096;
			this.anIntArrayArray57[4][2] = 0;
			this.anIntArrayArray57[5][1] = 4096;
			this.anIntArrayArray57[5][0] = 3411;
			this.anIntArrayArray57[5][3] = 4096;
			this.anIntArrayArray57[5][2] = 0;
			this.anIntArrayArray57[6][0] = 4096;
			this.anIntArrayArray57[6][2] = 0;
			this.anIntArrayArray57[6][3] = 4096;
			this.anIntArrayArray57[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray57 = new int[6][4];
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][2] = 0;
			this.anIntArrayArray57[0][1] = 0;
			this.anIntArrayArray57[0][3] = 0;
			this.anIntArrayArray57[1][0] = 1843;
			this.anIntArrayArray57[1][1] = 0;
			this.anIntArrayArray57[1][3] = 1493;
			this.anIntArrayArray57[1][2] = 0;
			this.anIntArrayArray57[2][0] = 2457;
			this.anIntArrayArray57[2][1] = 0;
			this.anIntArrayArray57[2][2] = 0;
			this.anIntArrayArray57[2][3] = 2939;
			this.anIntArrayArray57[3][1] = 0;
			this.anIntArrayArray57[3][3] = 3565;
			this.anIntArrayArray57[3][0] = 2781;
			this.anIntArrayArray57[3][2] = 1124;
			this.anIntArrayArray57[4][0] = 3481;
			this.anIntArrayArray57[4][1] = 546;
			this.anIntArrayArray57[4][3] = 4031;
			this.anIntArrayArray57[4][2] = 3084;
			this.anIntArrayArray57[5][3] = 4096;
			this.anIntArrayArray57[5][1] = 4096;
			this.anIntArrayArray57[5][2] = 4096;
			this.anIntArrayArray57[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray57 = new int[16][4];
			this.anIntArrayArray57[0][1] = 80;
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][2] = 192;
			this.anIntArrayArray57[0][3] = 321;
			this.anIntArrayArray57[1][2] = 449;
			this.anIntArrayArray57[1][3] = 562;
			this.anIntArrayArray57[1][0] = 155;
			this.anIntArrayArray57[1][1] = 321;
			this.anIntArrayArray57[2][0] = 389;
			this.anIntArrayArray57[2][3] = 803;
			this.anIntArrayArray57[2][2] = 690;
			this.anIntArrayArray57[2][1] = 578;
			this.anIntArrayArray57[3][3] = 1140;
			this.anIntArrayArray57[3][2] = 995;
			this.anIntArrayArray57[3][1] = 947;
			this.anIntArrayArray57[3][0] = 671;
			this.anIntArrayArray57[4][2] = 1397;
			this.anIntArrayArray57[4][0] = 897;
			this.anIntArrayArray57[4][3] = 1509;
			this.anIntArrayArray57[4][1] = 1285;
			this.anIntArrayArray57[5][3] = 1413;
			this.anIntArrayArray57[5][0] = 1175;
			this.anIntArrayArray57[5][1] = 1525;
			this.anIntArrayArray57[5][2] = 1429;
			this.anIntArrayArray57[6][3] = 1333;
			this.anIntArrayArray57[6][0] = 1368;
			this.anIntArrayArray57[6][2] = 1461;
			this.anIntArrayArray57[6][1] = 1734;
			this.anIntArrayArray57[7][0] = 1507;
			this.anIntArrayArray57[7][3] = 1702;
			this.anIntArrayArray57[7][2] = 1525;
			this.anIntArrayArray57[7][1] = 1413;
			this.anIntArrayArray57[8][0] = 1736;
			this.anIntArrayArray57[8][2] = 1590;
			this.anIntArrayArray57[8][1] = 1108;
			this.anIntArrayArray57[8][3] = 2056;
			this.anIntArrayArray57[9][3] = 2666;
			this.anIntArrayArray57[9][0] = 2088;
			this.anIntArrayArray57[9][1] = 1766;
			this.anIntArrayArray57[9][2] = 2056;
			this.anIntArrayArray57[10][1] = 2409;
			this.anIntArrayArray57[10][2] = 2586;
			this.anIntArrayArray57[10][0] = 2355;
			this.anIntArrayArray57[10][3] = 3276;
			this.anIntArrayArray57[11][0] = 2691;
			this.anIntArrayArray57[11][3] = 3228;
			this.anIntArrayArray57[11][2] = 3148;
			this.anIntArrayArray57[11][1] = 3116;
			this.anIntArrayArray57[12][3] = 3196;
			this.anIntArrayArray57[12][2] = 3710;
			this.anIntArrayArray57[12][0] = 3031;
			this.anIntArrayArray57[12][1] = 3806;
			this.anIntArrayArray57[13][0] = 3522;
			this.anIntArrayArray57[13][3] = 3019;
			this.anIntArrayArray57[13][1] = 3437;
			this.anIntArrayArray57[13][2] = 3421;
			this.anIntArrayArray57[14][0] = 3727;
			this.anIntArrayArray57[14][1] = 3116;
			this.anIntArrayArray57[14][2] = 3148;
			this.anIntArrayArray57[14][3] = 3228;
			this.anIntArrayArray57[15][3] = 2746;
			this.anIntArrayArray57[15][1] = 2377;
			this.anIntArrayArray57[15][2] = 2505;
			this.anIntArrayArray57[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray57 = new int[4][4];
			this.anIntArrayArray57[0][0] = 2048;
			this.anIntArrayArray57[0][2] = 4096;
			this.anIntArrayArray57[0][3] = 0;
			this.anIntArrayArray57[0][1] = 0;
			this.anIntArrayArray57[1][1] = 4096;
			this.anIntArrayArray57[1][2] = 4096;
			this.anIntArrayArray57[1][3] = 0;
			this.anIntArrayArray57[1][0] = 2867;
			this.anIntArrayArray57[2][0] = 3276;
			this.anIntArrayArray57[2][1] = 4096;
			this.anIntArrayArray57[2][3] = 0;
			this.anIntArrayArray57[2][2] = 4096;
			this.anIntArrayArray57[3][3] = 0;
			this.anIntArrayArray57[3][0] = 4096;
			this.anIntArrayArray57[3][2] = 0;
			this.anIntArrayArray57[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
		if (this.anIntArrayArray57 == null) {
			this.method8631(1);
		}
		this.method8628();
	}
}
