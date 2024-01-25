import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!fo", name = "G", descriptor = "[I")
	private final int[] anIntArray211 = new int[257];

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(12) int local12 = arg1.method2048(255);
		if (local12 != 0) {
			this.method2931(local12);
			return;
		}
		this.anIntArrayArray11 = new int[arg1.method2048(255)][4];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray11.length; local26++) {
			this.anIntArrayArray11[local26][0] = arg1.method2028(-14795);
			this.anIntArrayArray11[local26][1] = arg1.method2048(255) << 4;
			this.anIntArrayArray11[local26][2] = arg1.method2048(255) << 4;
			this.anIntArrayArray11[local26][3] = arg1.method2048(255) << 4;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)V")
	private void method2931(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray11 = new int[2][4];
			this.anIntArrayArray11[0][0] = 0;
			this.anIntArrayArray11[0][3] = 0;
			this.anIntArrayArray11[0][2] = 0;
			this.anIntArrayArray11[0][1] = 0;
			this.anIntArrayArray11[1][0] = 4096;
			this.anIntArrayArray11[1][2] = 4096;
			this.anIntArrayArray11[1][1] = 4096;
			this.anIntArrayArray11[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray11 = new int[8][4];
			this.anIntArrayArray11[0][3] = 2361;
			this.anIntArrayArray11[0][2] = 2602;
			this.anIntArrayArray11[0][1] = 2650;
			this.anIntArrayArray11[0][0] = 0;
			this.anIntArrayArray11[1][1] = 2313;
			this.anIntArrayArray11[1][2] = 1799;
			this.anIntArrayArray11[1][0] = 2867;
			this.anIntArrayArray11[1][3] = 1558;
			this.anIntArrayArray11[2][2] = 1734;
			this.anIntArrayArray11[2][1] = 2618;
			this.anIntArrayArray11[2][0] = 3072;
			this.anIntArrayArray11[2][3] = 1413;
			this.anIntArrayArray11[3][3] = 947;
			this.anIntArrayArray11[3][1] = 2296;
			this.anIntArrayArray11[3][0] = 3276;
			this.anIntArrayArray11[3][2] = 1220;
			this.anIntArrayArray11[4][0] = 3481;
			this.anIntArrayArray11[4][1] = 2072;
			this.anIntArrayArray11[4][3] = 722;
			this.anIntArrayArray11[4][2] = 963;
			this.anIntArrayArray11[5][1] = 2730;
			this.anIntArrayArray11[5][0] = 3686;
			this.anIntArrayArray11[5][2] = 2152;
			this.anIntArrayArray11[5][3] = 1766;
			this.anIntArrayArray11[6][1] = 2232;
			this.anIntArrayArray11[6][2] = 1060;
			this.anIntArrayArray11[6][3] = 915;
			this.anIntArrayArray11[6][0] = 3891;
			this.anIntArrayArray11[7][1] = 1686;
			this.anIntArrayArray11[7][0] = 4096;
			this.anIntArrayArray11[7][2] = 1413;
			this.anIntArrayArray11[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray11 = new int[7][4];
			this.anIntArrayArray11[0][2] = 0;
			this.anIntArrayArray11[0][0] = 0;
			this.anIntArrayArray11[0][1] = 0;
			this.anIntArrayArray11[0][3] = 4096;
			this.anIntArrayArray11[1][2] = 4096;
			this.anIntArrayArray11[1][0] = 663;
			this.anIntArrayArray11[1][1] = 0;
			this.anIntArrayArray11[1][3] = 4096;
			this.anIntArrayArray11[2][3] = 0;
			this.anIntArrayArray11[2][0] = 1363;
			this.anIntArrayArray11[2][2] = 4096;
			this.anIntArrayArray11[2][1] = 0;
			this.anIntArrayArray11[3][1] = 4096;
			this.anIntArrayArray11[3][3] = 0;
			this.anIntArrayArray11[3][0] = 2048;
			this.anIntArrayArray11[3][2] = 4096;
			this.anIntArrayArray11[4][3] = 0;
			this.anIntArrayArray11[4][1] = 4096;
			this.anIntArrayArray11[4][0] = 2727;
			this.anIntArrayArray11[4][2] = 0;
			this.anIntArrayArray11[5][0] = 3411;
			this.anIntArrayArray11[5][3] = 4096;
			this.anIntArrayArray11[5][2] = 0;
			this.anIntArrayArray11[5][1] = 4096;
			this.anIntArrayArray11[6][2] = 0;
			this.anIntArrayArray11[6][1] = 0;
			this.anIntArrayArray11[6][0] = 4096;
			this.anIntArrayArray11[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray11 = new int[6][4];
			this.anIntArrayArray11[0][3] = 0;
			this.anIntArrayArray11[0][2] = 0;
			this.anIntArrayArray11[0][0] = 0;
			this.anIntArrayArray11[0][1] = 0;
			this.anIntArrayArray11[1][1] = 0;
			this.anIntArrayArray11[1][2] = 0;
			this.anIntArrayArray11[1][3] = 1493;
			this.anIntArrayArray11[1][0] = 1843;
			this.anIntArrayArray11[2][3] = 2939;
			this.anIntArrayArray11[2][1] = 0;
			this.anIntArrayArray11[2][0] = 2457;
			this.anIntArrayArray11[2][2] = 0;
			this.anIntArrayArray11[3][1] = 0;
			this.anIntArrayArray11[3][2] = 1124;
			this.anIntArrayArray11[3][3] = 3565;
			this.anIntArrayArray11[3][0] = 2781;
			this.anIntArrayArray11[4][3] = 4031;
			this.anIntArrayArray11[4][1] = 546;
			this.anIntArrayArray11[4][2] = 3084;
			this.anIntArrayArray11[4][0] = 3481;
			this.anIntArrayArray11[5][2] = 4096;
			this.anIntArrayArray11[5][1] = 4096;
			this.anIntArrayArray11[5][3] = 4096;
			this.anIntArrayArray11[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray11 = new int[16][4];
			this.anIntArrayArray11[0][3] = 321;
			this.anIntArrayArray11[0][1] = 80;
			this.anIntArrayArray11[0][2] = 192;
			this.anIntArrayArray11[0][0] = 0;
			this.anIntArrayArray11[1][3] = 562;
			this.anIntArrayArray11[1][2] = 449;
			this.anIntArrayArray11[1][0] = 155;
			this.anIntArrayArray11[1][1] = 321;
			this.anIntArrayArray11[2][3] = 803;
			this.anIntArrayArray11[2][2] = 690;
			this.anIntArrayArray11[2][0] = 389;
			this.anIntArrayArray11[2][1] = 578;
			this.anIntArrayArray11[3][1] = 947;
			this.anIntArrayArray11[3][2] = 995;
			this.anIntArrayArray11[3][3] = 1140;
			this.anIntArrayArray11[3][0] = 671;
			this.anIntArrayArray11[4][0] = 897;
			this.anIntArrayArray11[4][3] = 1509;
			this.anIntArrayArray11[4][1] = 1285;
			this.anIntArrayArray11[4][2] = 1397;
			this.anIntArrayArray11[5][3] = 1413;
			this.anIntArrayArray11[5][1] = 1525;
			this.anIntArrayArray11[5][2] = 1429;
			this.anIntArrayArray11[5][0] = 1175;
			this.anIntArrayArray11[6][3] = 1333;
			this.anIntArrayArray11[6][0] = 1368;
			this.anIntArrayArray11[6][1] = 1734;
			this.anIntArrayArray11[6][2] = 1461;
			this.anIntArrayArray11[7][3] = 1702;
			this.anIntArrayArray11[7][0] = 1507;
			this.anIntArrayArray11[7][2] = 1525;
			this.anIntArrayArray11[7][1] = 1413;
			this.anIntArrayArray11[8][0] = 1736;
			this.anIntArrayArray11[8][2] = 1590;
			this.anIntArrayArray11[8][3] = 2056;
			this.anIntArrayArray11[8][1] = 1108;
			this.anIntArrayArray11[9][0] = 2088;
			this.anIntArrayArray11[9][1] = 1766;
			this.anIntArrayArray11[9][3] = 2666;
			this.anIntArrayArray11[9][2] = 2056;
			this.anIntArrayArray11[10][2] = 2586;
			this.anIntArrayArray11[10][1] = 2409;
			this.anIntArrayArray11[10][3] = 3276;
			this.anIntArrayArray11[10][0] = 2355;
			this.anIntArrayArray11[11][0] = 2691;
			this.anIntArrayArray11[11][3] = 3228;
			this.anIntArrayArray11[11][2] = 3148;
			this.anIntArrayArray11[11][1] = 3116;
			this.anIntArrayArray11[12][0] = 3031;
			this.anIntArrayArray11[12][2] = 3710;
			this.anIntArrayArray11[12][3] = 3196;
			this.anIntArrayArray11[12][1] = 3806;
			this.anIntArrayArray11[13][0] = 3522;
			this.anIntArrayArray11[13][1] = 3437;
			this.anIntArrayArray11[13][2] = 3421;
			this.anIntArrayArray11[13][3] = 3019;
			this.anIntArrayArray11[14][2] = 3148;
			this.anIntArrayArray11[14][0] = 3727;
			this.anIntArrayArray11[14][3] = 3228;
			this.anIntArrayArray11[14][1] = 3116;
			this.anIntArrayArray11[15][2] = 2505;
			this.anIntArrayArray11[15][1] = 2377;
			this.anIntArrayArray11[15][0] = 4096;
			this.anIntArrayArray11[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray11 = new int[4][4];
			this.anIntArrayArray11[0][1] = 0;
			this.anIntArrayArray11[0][0] = 2048;
			this.anIntArrayArray11[0][3] = 0;
			this.anIntArrayArray11[0][2] = 4096;
			this.anIntArrayArray11[1][3] = 0;
			this.anIntArrayArray11[1][0] = 2867;
			this.anIntArrayArray11[1][2] = 4096;
			this.anIntArrayArray11[1][1] = 4096;
			this.anIntArrayArray11[2][0] = 3276;
			this.anIntArrayArray11[2][3] = 0;
			this.anIntArrayArray11[2][2] = 4096;
			this.anIntArrayArray11[2][1] = 4096;
			this.anIntArrayArray11[3][1] = 4096;
			this.anIntArrayArray11[3][0] = 4096;
			this.anIntArrayArray11[3][2] = 0;
			this.anIntArrayArray11[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
		if (this.anIntArrayArray11 == null) {
			this.method2931(1);
		}
		this.method2933();
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(29) int[] local29 = this.method9577(0, arg0);
			@Pc(33) int[] local33 = local17[0];
			@Pc(37) int[] local37 = local17[1];
			@Pc(41) int[] local41 = local17[2];
			for (@Pc(43) int local43 = 0; local43 < Static379.anInt5859; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray211[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V")
	private void method2933() {
		@Pc(9) int local9 = this.anIntArrayArray11.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 257; local16++) {
			@Pc(20) int local20 = 0;
			@Pc(24) int local24 = local16 << 4;
			for (@Pc(26) int local26 = 0; local9 > local26 && local24 >= this.anIntArrayArray11[local26][0]; local26++) {
				local20++;
			}
			@Pc(69) int local69;
			@Pc(73) int local73;
			@Pc(77) int local77;
			@Pc(63) int[] local63;
			if (local9 > local20) {
				local63 = this.anIntArrayArray11[local20];
				if (local20 <= 0) {
					local69 = local63[1];
					local73 = local63[2];
					local77 = local63[3];
				} else {
					@Pc(86) int[] local86 = this.anIntArrayArray11[local20 - 1];
					@Pc(104) int local104 = (local24 - local86[0] << 12) / (local63[0] - local86[0]);
					@Pc(109) int local109 = 4096 - local104;
					local69 = local104 * local63[1] + local86[1] * local109 >> 12;
					local73 = local104 * local63[2] + local109 * local86[2] >> 12;
					local77 = local63[3] * local104 + local86[3] * local109 >> 12;
				}
			} else {
				local63 = this.anIntArrayArray11[local9 - 1];
				local73 = local63[2];
				local77 = local63[3];
				local69 = local63[1];
			}
			local69 >>= 0x4;
			local73 >>= 0x4;
			local77 >>= 0x4;
			if (local73 < 0) {
				local73 = 0;
			} else if (local73 > 255) {
				local73 = 255;
			}
			if (local77 < 0) {
				local77 = 0;
			} else if (local77 > 255) {
				local77 = 255;
			}
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			this.anIntArray211[local16] = local73 << 8 | local69 << 16 | local77;
		}
	}
}
