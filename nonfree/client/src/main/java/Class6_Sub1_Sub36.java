import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class6_Sub1_Sub36 extends Class6_Sub1 {

	@OriginalMember(owner = "client!tj", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray196;

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "[I")
	private final int[] anIntArray645 = new int[257];

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(13) int local13 = arg0.method3972();
		if (local13 != 0) {
			this.method5197(local13);
			return;
		}
		this.anIntArrayArray196 = new int[arg0.method3972()][4];
		for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray196.length; local33++) {
			this.anIntArrayArray196[local33][0] = arg0.method4021();
			this.anIntArrayArray196[local33][1] = arg0.method3972() << 4;
			this.anIntArrayArray196[local33][2] = arg0.method3972() << 4;
			this.anIntArrayArray196[local33][3] = arg0.method3972() << 4;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
		if (this.anIntArrayArray196 == null) {
			this.method5197(1);
		}
		this.method5200();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(27) int[] local27 = this.method5609(0, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static299.anInt5659; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray645[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
	private void method5197(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray196 = new int[2][4];
			this.anIntArrayArray196[0][0] = 0;
			this.anIntArrayArray196[0][1] = 0;
			this.anIntArrayArray196[0][2] = 0;
			this.anIntArrayArray196[0][3] = 0;
			this.anIntArrayArray196[1][1] = 4096;
			this.anIntArrayArray196[1][3] = 4096;
			this.anIntArrayArray196[1][2] = 4096;
			this.anIntArrayArray196[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray196 = new int[8][4];
			this.anIntArrayArray196[0][3] = 2361;
			this.anIntArrayArray196[0][0] = 0;
			this.anIntArrayArray196[0][1] = 2650;
			this.anIntArrayArray196[0][2] = 2602;
			this.anIntArrayArray196[1][3] = 1558;
			this.anIntArrayArray196[1][0] = 2867;
			this.anIntArrayArray196[1][2] = 1799;
			this.anIntArrayArray196[1][1] = 2313;
			this.anIntArrayArray196[2][0] = 3072;
			this.anIntArrayArray196[2][3] = 1413;
			this.anIntArrayArray196[2][1] = 2618;
			this.anIntArrayArray196[2][2] = 1734;
			this.anIntArrayArray196[3][1] = 2296;
			this.anIntArrayArray196[3][0] = 3276;
			this.anIntArrayArray196[3][3] = 947;
			this.anIntArrayArray196[3][2] = 1220;
			this.anIntArrayArray196[4][3] = 722;
			this.anIntArrayArray196[4][1] = 2072;
			this.anIntArrayArray196[4][0] = 3481;
			this.anIntArrayArray196[4][2] = 963;
			this.anIntArrayArray196[5][3] = 1766;
			this.anIntArrayArray196[5][0] = 3686;
			this.anIntArrayArray196[5][1] = 2730;
			this.anIntArrayArray196[5][2] = 2152;
			this.anIntArrayArray196[6][3] = 915;
			this.anIntArrayArray196[6][2] = 1060;
			this.anIntArrayArray196[6][0] = 3891;
			this.anIntArrayArray196[6][1] = 2232;
			this.anIntArrayArray196[7][2] = 1413;
			this.anIntArrayArray196[7][3] = 1140;
			this.anIntArrayArray196[7][0] = 4096;
			this.anIntArrayArray196[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray196 = new int[7][4];
			this.anIntArrayArray196[0][3] = 4096;
			this.anIntArrayArray196[0][1] = 0;
			this.anIntArrayArray196[0][2] = 0;
			this.anIntArrayArray196[0][0] = 0;
			this.anIntArrayArray196[1][0] = 663;
			this.anIntArrayArray196[1][2] = 4096;
			this.anIntArrayArray196[1][1] = 0;
			this.anIntArrayArray196[1][3] = 4096;
			this.anIntArrayArray196[2][0] = 1363;
			this.anIntArrayArray196[2][1] = 0;
			this.anIntArrayArray196[2][3] = 0;
			this.anIntArrayArray196[2][2] = 4096;
			this.anIntArrayArray196[3][2] = 4096;
			this.anIntArrayArray196[3][1] = 4096;
			this.anIntArrayArray196[3][0] = 2048;
			this.anIntArrayArray196[3][3] = 0;
			this.anIntArrayArray196[4][0] = 2727;
			this.anIntArrayArray196[4][3] = 0;
			this.anIntArrayArray196[4][2] = 0;
			this.anIntArrayArray196[4][1] = 4096;
			this.anIntArrayArray196[5][3] = 4096;
			this.anIntArrayArray196[5][2] = 0;
			this.anIntArrayArray196[5][0] = 3411;
			this.anIntArrayArray196[5][1] = 4096;
			this.anIntArrayArray196[6][2] = 0;
			this.anIntArrayArray196[6][1] = 0;
			this.anIntArrayArray196[6][0] = 4096;
			this.anIntArrayArray196[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray196 = new int[6][4];
			this.anIntArrayArray196[0][3] = 0;
			this.anIntArrayArray196[0][0] = 0;
			this.anIntArrayArray196[0][2] = 0;
			this.anIntArrayArray196[0][1] = 0;
			this.anIntArrayArray196[1][0] = 1843;
			this.anIntArrayArray196[1][3] = 1493;
			this.anIntArrayArray196[1][2] = 0;
			this.anIntArrayArray196[1][1] = 0;
			this.anIntArrayArray196[2][2] = 0;
			this.anIntArrayArray196[2][1] = 0;
			this.anIntArrayArray196[2][0] = 2457;
			this.anIntArrayArray196[2][3] = 2939;
			this.anIntArrayArray196[3][1] = 0;
			this.anIntArrayArray196[3][2] = 1124;
			this.anIntArrayArray196[3][3] = 3565;
			this.anIntArrayArray196[3][0] = 2781;
			this.anIntArrayArray196[4][3] = 4031;
			this.anIntArrayArray196[4][1] = 546;
			this.anIntArrayArray196[4][0] = 3481;
			this.anIntArrayArray196[4][2] = 3084;
			this.anIntArrayArray196[5][2] = 4096;
			this.anIntArrayArray196[5][3] = 4096;
			this.anIntArrayArray196[5][1] = 4096;
			this.anIntArrayArray196[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray196 = new int[16][4];
			this.anIntArrayArray196[0][3] = 321;
			this.anIntArrayArray196[0][2] = 192;
			this.anIntArrayArray196[0][0] = 0;
			this.anIntArrayArray196[0][1] = 80;
			this.anIntArrayArray196[1][2] = 449;
			this.anIntArrayArray196[1][1] = 321;
			this.anIntArrayArray196[1][3] = 562;
			this.anIntArrayArray196[1][0] = 155;
			this.anIntArrayArray196[2][0] = 389;
			this.anIntArrayArray196[2][2] = 690;
			this.anIntArrayArray196[2][3] = 803;
			this.anIntArrayArray196[2][1] = 578;
			this.anIntArrayArray196[3][0] = 671;
			this.anIntArrayArray196[3][1] = 947;
			this.anIntArrayArray196[3][2] = 995;
			this.anIntArrayArray196[3][3] = 1140;
			this.anIntArrayArray196[4][0] = 897;
			this.anIntArrayArray196[4][3] = 1509;
			this.anIntArrayArray196[4][2] = 1397;
			this.anIntArrayArray196[4][1] = 1285;
			this.anIntArrayArray196[5][2] = 1429;
			this.anIntArrayArray196[5][0] = 1175;
			this.anIntArrayArray196[5][3] = 1413;
			this.anIntArrayArray196[5][1] = 1525;
			this.anIntArrayArray196[6][3] = 1333;
			this.anIntArrayArray196[6][2] = 1461;
			this.anIntArrayArray196[6][0] = 1368;
			this.anIntArrayArray196[6][1] = 1734;
			this.anIntArrayArray196[7][1] = 1413;
			this.anIntArrayArray196[7][3] = 1702;
			this.anIntArrayArray196[7][2] = 1525;
			this.anIntArrayArray196[7][0] = 1507;
			this.anIntArrayArray196[8][2] = 1590;
			this.anIntArrayArray196[8][0] = 1736;
			this.anIntArrayArray196[8][1] = 1108;
			this.anIntArrayArray196[8][3] = 2056;
			this.anIntArrayArray196[9][2] = 2056;
			this.anIntArrayArray196[9][1] = 1766;
			this.anIntArrayArray196[9][3] = 2666;
			this.anIntArrayArray196[9][0] = 2088;
			this.anIntArrayArray196[10][0] = 2355;
			this.anIntArrayArray196[10][3] = 3276;
			this.anIntArrayArray196[10][2] = 2586;
			this.anIntArrayArray196[10][1] = 2409;
			this.anIntArrayArray196[11][2] = 3148;
			this.anIntArrayArray196[11][0] = 2691;
			this.anIntArrayArray196[11][3] = 3228;
			this.anIntArrayArray196[11][1] = 3116;
			this.anIntArrayArray196[12][3] = 3196;
			this.anIntArrayArray196[12][1] = 3806;
			this.anIntArrayArray196[12][2] = 3710;
			this.anIntArrayArray196[12][0] = 3031;
			this.anIntArrayArray196[13][1] = 3437;
			this.anIntArrayArray196[13][0] = 3522;
			this.anIntArrayArray196[13][3] = 3019;
			this.anIntArrayArray196[13][2] = 3421;
			this.anIntArrayArray196[14][3] = 3228;
			this.anIntArrayArray196[14][1] = 3116;
			this.anIntArrayArray196[14][2] = 3148;
			this.anIntArrayArray196[14][0] = 3727;
			this.anIntArrayArray196[15][2] = 2505;
			this.anIntArrayArray196[15][3] = 2746;
			this.anIntArrayArray196[15][0] = 4096;
			this.anIntArrayArray196[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray196 = new int[4][4];
			this.anIntArrayArray196[0][0] = 2048;
			this.anIntArrayArray196[0][1] = 0;
			this.anIntArrayArray196[0][3] = 0;
			this.anIntArrayArray196[0][2] = 4096;
			this.anIntArrayArray196[1][3] = 0;
			this.anIntArrayArray196[1][2] = 4096;
			this.anIntArrayArray196[1][1] = 4096;
			this.anIntArrayArray196[1][0] = 2867;
			this.anIntArrayArray196[2][3] = 0;
			this.anIntArrayArray196[2][0] = 3276;
			this.anIntArrayArray196[2][1] = 4096;
			this.anIntArrayArray196[2][2] = 4096;
			this.anIntArrayArray196[3][1] = 4096;
			this.anIntArrayArray196[3][2] = 0;
			this.anIntArrayArray196[3][3] = 0;
			this.anIntArrayArray196[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(Z)V")
	private void method5200() {
		@Pc(15) int local15 = this.anIntArrayArray196.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local22 << 4;
			for (@Pc(32) int local32 = 0; local32 < local15 && this.anIntArrayArray196[local32][0] <= local30; local32++) {
				local26++;
			}
			@Pc(73) int local73;
			@Pc(69) int local69;
			@Pc(65) int local65;
			@Pc(61) int[] local61;
			if (local15 <= local26) {
				local61 = this.anIntArrayArray196[local15 - 1];
				local65 = local61[3];
				local69 = local61[2];
				local73 = local61[1];
			} else {
				local61 = this.anIntArrayArray196[local26];
				if (local26 > 0) {
					@Pc(89) int[] local89 = this.anIntArrayArray196[local26 - 1];
					@Pc(107) int local107 = (local30 - local89[0] << 12) / (local61[0] - local89[0]);
					@Pc(111) int local111 = 4096 - local107;
					local69 = local89[2] * local111 + local61[2] * local107 >> 12;
					local65 = local61[3] * local107 + local89[3] * local111 >> 12;
					local73 = local89[1] * local111 + local61[1] * local107 >> 12;
				} else {
					local65 = local61[3];
					local69 = local61[2];
					local73 = local61[1];
				}
			}
			local73 >>= 0x4;
			local69 >>= 0x4;
			local65 >>= 0x4;
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			if (local73 < 0) {
				local73 = 0;
			} else if (local73 > 255) {
				local73 = 255;
			}
			if (local65 < 0) {
				local65 = 0;
			} else if (local65 > 255) {
				local65 = 255;
			}
			this.anIntArray645[local22] = local65 | local73 << 16 | local69 << 8;
		}
	}
}
