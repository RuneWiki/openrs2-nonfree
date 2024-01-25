import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class6_Sub1_Sub33 extends Class6_Sub1 {

	@OriginalMember(owner = "client!sg", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!sg", name = "D", descriptor = "[I")
	private final int[] anIntArray471 = new int[257];

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(27) int[] local27 = this.method8731(arg0, 0);
			@Pc(31) int[] local31 = local17[0];
			@Pc(35) int[] local35 = local17[1];
			@Pc(39) int[] local39 = local17[2];
			for (@Pc(41) int local41 = 0; local41 < Static53.anInt1787; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray471[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
		if (this.anIntArrayArray48 == null) {
			this.method7444(1);
		}
		this.method7446();
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)V")
	private void method7444(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray48 = new int[2][4];
			this.anIntArrayArray48[0][0] = 0;
			this.anIntArrayArray48[0][1] = 0;
			this.anIntArrayArray48[0][3] = 0;
			this.anIntArrayArray48[0][2] = 0;
			this.anIntArrayArray48[1][2] = 4096;
			this.anIntArrayArray48[1][0] = 4096;
			this.anIntArrayArray48[1][1] = 4096;
			this.anIntArrayArray48[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray48 = new int[8][4];
			this.anIntArrayArray48[0][3] = 2361;
			this.anIntArrayArray48[0][0] = 0;
			this.anIntArrayArray48[0][1] = 2650;
			this.anIntArrayArray48[0][2] = 2602;
			this.anIntArrayArray48[1][3] = 1558;
			this.anIntArrayArray48[1][2] = 1799;
			this.anIntArrayArray48[1][1] = 2313;
			this.anIntArrayArray48[1][0] = 2867;
			this.anIntArrayArray48[2][2] = 1734;
			this.anIntArrayArray48[2][3] = 1413;
			this.anIntArrayArray48[2][1] = 2618;
			this.anIntArrayArray48[2][0] = 3072;
			this.anIntArrayArray48[3][1] = 2296;
			this.anIntArrayArray48[3][3] = 947;
			this.anIntArrayArray48[3][0] = 3276;
			this.anIntArrayArray48[3][2] = 1220;
			this.anIntArrayArray48[4][1] = 2072;
			this.anIntArrayArray48[4][3] = 722;
			this.anIntArrayArray48[4][0] = 3481;
			this.anIntArrayArray48[4][2] = 963;
			this.anIntArrayArray48[5][2] = 2152;
			this.anIntArrayArray48[5][0] = 3686;
			this.anIntArrayArray48[5][1] = 2730;
			this.anIntArrayArray48[5][3] = 1766;
			this.anIntArrayArray48[6][2] = 1060;
			this.anIntArrayArray48[6][0] = 3891;
			this.anIntArrayArray48[6][1] = 2232;
			this.anIntArrayArray48[6][3] = 915;
			this.anIntArrayArray48[7][0] = 4096;
			this.anIntArrayArray48[7][1] = 1686;
			this.anIntArrayArray48[7][2] = 1413;
			this.anIntArrayArray48[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray48 = new int[7][4];
			this.anIntArrayArray48[0][2] = 0;
			this.anIntArrayArray48[0][3] = 4096;
			this.anIntArrayArray48[0][0] = 0;
			this.anIntArrayArray48[0][1] = 0;
			this.anIntArrayArray48[1][2] = 4096;
			this.anIntArrayArray48[1][0] = 663;
			this.anIntArrayArray48[1][1] = 0;
			this.anIntArrayArray48[1][3] = 4096;
			this.anIntArrayArray48[2][1] = 0;
			this.anIntArrayArray48[2][3] = 0;
			this.anIntArrayArray48[2][2] = 4096;
			this.anIntArrayArray48[2][0] = 1363;
			this.anIntArrayArray48[3][0] = 2048;
			this.anIntArrayArray48[3][1] = 4096;
			this.anIntArrayArray48[3][3] = 0;
			this.anIntArrayArray48[3][2] = 4096;
			this.anIntArrayArray48[4][1] = 4096;
			this.anIntArrayArray48[4][0] = 2727;
			this.anIntArrayArray48[4][2] = 0;
			this.anIntArrayArray48[4][3] = 0;
			this.anIntArrayArray48[5][0] = 3411;
			this.anIntArrayArray48[5][2] = 0;
			this.anIntArrayArray48[5][3] = 4096;
			this.anIntArrayArray48[5][1] = 4096;
			this.anIntArrayArray48[6][2] = 0;
			this.anIntArrayArray48[6][0] = 4096;
			this.anIntArrayArray48[6][3] = 4096;
			this.anIntArrayArray48[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray48 = new int[6][4];
			this.anIntArrayArray48[0][2] = 0;
			this.anIntArrayArray48[0][1] = 0;
			this.anIntArrayArray48[0][3] = 0;
			this.anIntArrayArray48[0][0] = 0;
			this.anIntArrayArray48[1][2] = 0;
			this.anIntArrayArray48[1][1] = 0;
			this.anIntArrayArray48[1][3] = 1493;
			this.anIntArrayArray48[1][0] = 1843;
			this.anIntArrayArray48[2][1] = 0;
			this.anIntArrayArray48[2][0] = 2457;
			this.anIntArrayArray48[2][3] = 2939;
			this.anIntArrayArray48[2][2] = 0;
			this.anIntArrayArray48[3][2] = 1124;
			this.anIntArrayArray48[3][0] = 2781;
			this.anIntArrayArray48[3][3] = 3565;
			this.anIntArrayArray48[3][1] = 0;
			this.anIntArrayArray48[4][0] = 3481;
			this.anIntArrayArray48[4][3] = 4031;
			this.anIntArrayArray48[4][2] = 3084;
			this.anIntArrayArray48[4][1] = 546;
			this.anIntArrayArray48[5][3] = 4096;
			this.anIntArrayArray48[5][1] = 4096;
			this.anIntArrayArray48[5][0] = 4096;
			this.anIntArrayArray48[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray48 = new int[16][4];
			this.anIntArrayArray48[0][0] = 0;
			this.anIntArrayArray48[0][1] = 80;
			this.anIntArrayArray48[0][3] = 321;
			this.anIntArrayArray48[0][2] = 192;
			this.anIntArrayArray48[1][2] = 449;
			this.anIntArrayArray48[1][1] = 321;
			this.anIntArrayArray48[1][3] = 562;
			this.anIntArrayArray48[1][0] = 155;
			this.anIntArrayArray48[2][3] = 803;
			this.anIntArrayArray48[2][0] = 389;
			this.anIntArrayArray48[2][1] = 578;
			this.anIntArrayArray48[2][2] = 690;
			this.anIntArrayArray48[3][1] = 947;
			this.anIntArrayArray48[3][3] = 1140;
			this.anIntArrayArray48[3][0] = 671;
			this.anIntArrayArray48[3][2] = 995;
			this.anIntArrayArray48[4][3] = 1509;
			this.anIntArrayArray48[4][2] = 1397;
			this.anIntArrayArray48[4][1] = 1285;
			this.anIntArrayArray48[4][0] = 897;
			this.anIntArrayArray48[5][2] = 1429;
			this.anIntArrayArray48[5][1] = 1525;
			this.anIntArrayArray48[5][0] = 1175;
			this.anIntArrayArray48[5][3] = 1413;
			this.anIntArrayArray48[6][2] = 1461;
			this.anIntArrayArray48[6][1] = 1734;
			this.anIntArrayArray48[6][0] = 1368;
			this.anIntArrayArray48[6][3] = 1333;
			this.anIntArrayArray48[7][0] = 1507;
			this.anIntArrayArray48[7][3] = 1702;
			this.anIntArrayArray48[7][2] = 1525;
			this.anIntArrayArray48[7][1] = 1413;
			this.anIntArrayArray48[8][2] = 1590;
			this.anIntArrayArray48[8][1] = 1108;
			this.anIntArrayArray48[8][0] = 1736;
			this.anIntArrayArray48[8][3] = 2056;
			this.anIntArrayArray48[9][2] = 2056;
			this.anIntArrayArray48[9][0] = 2088;
			this.anIntArrayArray48[9][3] = 2666;
			this.anIntArrayArray48[9][1] = 1766;
			this.anIntArrayArray48[10][0] = 2355;
			this.anIntArrayArray48[10][2] = 2586;
			this.anIntArrayArray48[10][1] = 2409;
			this.anIntArrayArray48[10][3] = 3276;
			this.anIntArrayArray48[11][2] = 3148;
			this.anIntArrayArray48[11][0] = 2691;
			this.anIntArrayArray48[11][1] = 3116;
			this.anIntArrayArray48[11][3] = 3228;
			this.anIntArrayArray48[12][2] = 3710;
			this.anIntArrayArray48[12][3] = 3196;
			this.anIntArrayArray48[12][1] = 3806;
			this.anIntArrayArray48[12][0] = 3031;
			this.anIntArrayArray48[13][3] = 3019;
			this.anIntArrayArray48[13][2] = 3421;
			this.anIntArrayArray48[13][1] = 3437;
			this.anIntArrayArray48[13][0] = 3522;
			this.anIntArrayArray48[14][2] = 3148;
			this.anIntArrayArray48[14][0] = 3727;
			this.anIntArrayArray48[14][3] = 3228;
			this.anIntArrayArray48[14][1] = 3116;
			this.anIntArrayArray48[15][2] = 2505;
			this.anIntArrayArray48[15][3] = 2746;
			this.anIntArrayArray48[15][0] = 4096;
			this.anIntArrayArray48[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray48 = new int[4][4];
			this.anIntArrayArray48[0][0] = 2048;
			this.anIntArrayArray48[0][3] = 0;
			this.anIntArrayArray48[0][1] = 0;
			this.anIntArrayArray48[0][2] = 4096;
			this.anIntArrayArray48[1][3] = 0;
			this.anIntArrayArray48[1][2] = 4096;
			this.anIntArrayArray48[1][1] = 4096;
			this.anIntArrayArray48[1][0] = 2867;
			this.anIntArrayArray48[2][3] = 0;
			this.anIntArrayArray48[2][0] = 3276;
			this.anIntArrayArray48[2][1] = 4096;
			this.anIntArrayArray48[2][2] = 4096;
			this.anIntArrayArray48[3][1] = 4096;
			this.anIntArrayArray48[3][3] = 0;
			this.anIntArrayArray48[3][0] = 4096;
			this.anIntArrayArray48[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(16) int local16 = arg1.method8246();
		if (local16 != 0) {
			this.method7444(local16);
			return;
		}
		this.anIntArrayArray48 = new int[arg1.method8246()][4];
		for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray48.length; local33++) {
			this.anIntArrayArray48[local33][0] = arg1.method8220();
			this.anIntArrayArray48[local33][1] = arg1.method8246() << 4;
			this.anIntArrayArray48[local33][2] = arg1.method8246() << 4;
			this.anIntArrayArray48[local33][3] = arg1.method8246() << 4;
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	private void method7446() {
		@Pc(9) int local9 = this.anIntArrayArray48.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local9 > local30 && local28 >= this.anIntArrayArray48[local30][0]; local30++) {
				local24++;
			}
			@Pc(135) int local135;
			@Pc(106) int local106;
			@Pc(120) int local120;
			@Pc(61) int[] local61;
			if (local9 > local24) {
				local61 = this.anIntArrayArray48[local24];
				if (local24 > 0) {
					@Pc(70) int[] local70 = this.anIntArrayArray48[local24 - 1];
					@Pc(87) int local87 = (local28 - local70[0] << 12) / (local61[0] - local70[0]);
					@Pc(92) int local92 = 4096 - local87;
					local106 = local61[2] * local87 + local70[2] * local92 >> 12;
					local120 = local70[3] * local92 + local87 * local61[3] >> 12;
					local135 = local87 * local61[1] + local70[1] * local92 >> 12;
				} else {
					local120 = local61[3];
					local106 = local61[2];
					local135 = local61[1];
				}
			} else {
				local61 = this.anIntArrayArray48[local9 - 1];
				local135 = local61[1];
				local120 = local61[3];
				local106 = local61[2];
			}
			local135 >>= 0x4;
			local106 >>= 0x4;
			local120 >>= 0x4;
			if (local106 < 0) {
				local106 = 0;
			} else if (local106 > 255) {
				local106 = 255;
			}
			if (local120 < 0) {
				local120 = 0;
			} else if (local120 > 255) {
				local120 = 255;
			}
			if (local135 < 0) {
				local135 = 0;
			} else if (local135 > 255) {
				local135 = 255;
			}
			this.anIntArray471[local20] = local120 | local135 << 16 | local106 << 8;
		}
	}
}
