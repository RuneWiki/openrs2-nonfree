import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class6_Sub3_Sub26 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "[I")
	private final int[] anIntArray453 = new int[257];

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
		if (this.anIntArrayArray54 == null) {
			this.method5217(1);
		}
		this.method5220();
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(II)V")
	private void method5217(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray54 = new int[2][4];
			this.anIntArrayArray54[0][3] = 0;
			this.anIntArrayArray54[0][1] = 0;
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][2] = 0;
			this.anIntArrayArray54[1][2] = 4096;
			this.anIntArrayArray54[1][0] = 4096;
			this.anIntArrayArray54[1][1] = 4096;
			this.anIntArrayArray54[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray54 = new int[8][4];
			this.anIntArrayArray54[0][2] = 2602;
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][3] = 2361;
			this.anIntArrayArray54[0][1] = 2650;
			this.anIntArrayArray54[1][2] = 1799;
			this.anIntArrayArray54[1][0] = 2867;
			this.anIntArrayArray54[1][1] = 2313;
			this.anIntArrayArray54[1][3] = 1558;
			this.anIntArrayArray54[2][1] = 2618;
			this.anIntArrayArray54[2][3] = 1413;
			this.anIntArrayArray54[2][0] = 3072;
			this.anIntArrayArray54[2][2] = 1734;
			this.anIntArrayArray54[3][3] = 947;
			this.anIntArrayArray54[3][1] = 2296;
			this.anIntArrayArray54[3][2] = 1220;
			this.anIntArrayArray54[3][0] = 3276;
			this.anIntArrayArray54[4][1] = 2072;
			this.anIntArrayArray54[4][2] = 963;
			this.anIntArrayArray54[4][3] = 722;
			this.anIntArrayArray54[4][0] = 3481;
			this.anIntArrayArray54[5][2] = 2152;
			this.anIntArrayArray54[5][0] = 3686;
			this.anIntArrayArray54[5][3] = 1766;
			this.anIntArrayArray54[5][1] = 2730;
			this.anIntArrayArray54[6][3] = 915;
			this.anIntArrayArray54[6][0] = 3891;
			this.anIntArrayArray54[6][1] = 2232;
			this.anIntArrayArray54[6][2] = 1060;
			this.anIntArrayArray54[7][3] = 1140;
			this.anIntArrayArray54[7][2] = 1413;
			this.anIntArrayArray54[7][1] = 1686;
			this.anIntArrayArray54[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray54 = new int[7][4];
			this.anIntArrayArray54[0][3] = 4096;
			this.anIntArrayArray54[0][1] = 0;
			this.anIntArrayArray54[0][2] = 0;
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[1][3] = 4096;
			this.anIntArrayArray54[1][0] = 663;
			this.anIntArrayArray54[1][2] = 4096;
			this.anIntArrayArray54[1][1] = 0;
			this.anIntArrayArray54[2][3] = 0;
			this.anIntArrayArray54[2][1] = 0;
			this.anIntArrayArray54[2][0] = 1363;
			this.anIntArrayArray54[2][2] = 4096;
			this.anIntArrayArray54[3][1] = 4096;
			this.anIntArrayArray54[3][3] = 0;
			this.anIntArrayArray54[3][0] = 2048;
			this.anIntArrayArray54[3][2] = 4096;
			this.anIntArrayArray54[4][3] = 0;
			this.anIntArrayArray54[4][0] = 2727;
			this.anIntArrayArray54[4][1] = 4096;
			this.anIntArrayArray54[4][2] = 0;
			this.anIntArrayArray54[5][2] = 0;
			this.anIntArrayArray54[5][1] = 4096;
			this.anIntArrayArray54[5][0] = 3411;
			this.anIntArrayArray54[5][3] = 4096;
			this.anIntArrayArray54[6][0] = 4096;
			this.anIntArrayArray54[6][1] = 0;
			this.anIntArrayArray54[6][2] = 0;
			this.anIntArrayArray54[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray54 = new int[6][4];
			this.anIntArrayArray54[0][2] = 0;
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][3] = 0;
			this.anIntArrayArray54[0][1] = 0;
			this.anIntArrayArray54[1][3] = 1493;
			this.anIntArrayArray54[1][1] = 0;
			this.anIntArrayArray54[1][2] = 0;
			this.anIntArrayArray54[1][0] = 1843;
			this.anIntArrayArray54[2][2] = 0;
			this.anIntArrayArray54[2][0] = 2457;
			this.anIntArrayArray54[2][3] = 2939;
			this.anIntArrayArray54[2][1] = 0;
			this.anIntArrayArray54[3][3] = 3565;
			this.anIntArrayArray54[3][1] = 0;
			this.anIntArrayArray54[3][0] = 2781;
			this.anIntArrayArray54[3][2] = 1124;
			this.anIntArrayArray54[4][0] = 3481;
			this.anIntArrayArray54[4][3] = 4031;
			this.anIntArrayArray54[4][2] = 3084;
			this.anIntArrayArray54[4][1] = 546;
			this.anIntArrayArray54[5][2] = 4096;
			this.anIntArrayArray54[5][3] = 4096;
			this.anIntArrayArray54[5][1] = 4096;
			this.anIntArrayArray54[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray54 = new int[16][4];
			this.anIntArrayArray54[0][2] = 192;
			this.anIntArrayArray54[0][0] = 0;
			this.anIntArrayArray54[0][1] = 80;
			this.anIntArrayArray54[0][3] = 321;
			this.anIntArrayArray54[1][2] = 449;
			this.anIntArrayArray54[1][3] = 562;
			this.anIntArrayArray54[1][1] = 321;
			this.anIntArrayArray54[1][0] = 155;
			this.anIntArrayArray54[2][3] = 803;
			this.anIntArrayArray54[2][1] = 578;
			this.anIntArrayArray54[2][2] = 690;
			this.anIntArrayArray54[2][0] = 389;
			this.anIntArrayArray54[3][0] = 671;
			this.anIntArrayArray54[3][3] = 1140;
			this.anIntArrayArray54[3][1] = 947;
			this.anIntArrayArray54[3][2] = 995;
			this.anIntArrayArray54[4][2] = 1397;
			this.anIntArrayArray54[4][1] = 1285;
			this.anIntArrayArray54[4][0] = 897;
			this.anIntArrayArray54[4][3] = 1509;
			this.anIntArrayArray54[5][2] = 1429;
			this.anIntArrayArray54[5][3] = 1413;
			this.anIntArrayArray54[5][0] = 1175;
			this.anIntArrayArray54[5][1] = 1525;
			this.anIntArrayArray54[6][2] = 1461;
			this.anIntArrayArray54[6][3] = 1333;
			this.anIntArrayArray54[6][1] = 1734;
			this.anIntArrayArray54[6][0] = 1368;
			this.anIntArrayArray54[7][2] = 1525;
			this.anIntArrayArray54[7][3] = 1702;
			this.anIntArrayArray54[7][1] = 1413;
			this.anIntArrayArray54[7][0] = 1507;
			this.anIntArrayArray54[8][1] = 1108;
			this.anIntArrayArray54[8][3] = 2056;
			this.anIntArrayArray54[8][0] = 1736;
			this.anIntArrayArray54[8][2] = 1590;
			this.anIntArrayArray54[9][2] = 2056;
			this.anIntArrayArray54[9][0] = 2088;
			this.anIntArrayArray54[9][1] = 1766;
			this.anIntArrayArray54[9][3] = 2666;
			this.anIntArrayArray54[10][3] = 3276;
			this.anIntArrayArray54[10][1] = 2409;
			this.anIntArrayArray54[10][0] = 2355;
			this.anIntArrayArray54[10][2] = 2586;
			this.anIntArrayArray54[11][1] = 3116;
			this.anIntArrayArray54[11][3] = 3228;
			this.anIntArrayArray54[11][0] = 2691;
			this.anIntArrayArray54[11][2] = 3148;
			this.anIntArrayArray54[12][2] = 3710;
			this.anIntArrayArray54[12][1] = 3806;
			this.anIntArrayArray54[12][0] = 3031;
			this.anIntArrayArray54[12][3] = 3196;
			this.anIntArrayArray54[13][2] = 3421;
			this.anIntArrayArray54[13][0] = 3522;
			this.anIntArrayArray54[13][3] = 3019;
			this.anIntArrayArray54[13][1] = 3437;
			this.anIntArrayArray54[14][3] = 3228;
			this.anIntArrayArray54[14][1] = 3116;
			this.anIntArrayArray54[14][2] = 3148;
			this.anIntArrayArray54[14][0] = 3727;
			this.anIntArrayArray54[15][3] = 2746;
			this.anIntArrayArray54[15][1] = 2377;
			this.anIntArrayArray54[15][0] = 4096;
			this.anIntArrayArray54[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray54 = new int[4][4];
			this.anIntArrayArray54[0][3] = 0;
			this.anIntArrayArray54[0][1] = 0;
			this.anIntArrayArray54[0][0] = 2048;
			this.anIntArrayArray54[0][2] = 4096;
			this.anIntArrayArray54[1][2] = 4096;
			this.anIntArrayArray54[1][0] = 2867;
			this.anIntArrayArray54[1][3] = 0;
			this.anIntArrayArray54[1][1] = 4096;
			this.anIntArrayArray54[2][0] = 3276;
			this.anIntArrayArray54[2][1] = 4096;
			this.anIntArrayArray54[2][3] = 0;
			this.anIntArrayArray54[2][2] = 4096;
			this.anIntArrayArray54[3][3] = 0;
			this.anIntArrayArray54[3][2] = 0;
			this.anIntArrayArray54[3][1] = 4096;
			this.anIntArrayArray54[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(7) int local7 = arg1.method6019();
		if (local7 != 0) {
			this.method5217(local7);
			return;
		}
		this.anIntArrayArray54 = new int[arg1.method6019()][4];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray54.length; local27++) {
			this.anIntArrayArray54[local27][0] = arg1.method6044();
			this.anIntArrayArray54[local27][1] = arg1.method6019() << 4;
			this.anIntArrayArray54[local27][2] = arg1.method6019() << 4;
			this.anIntArrayArray54[local27][3] = arg1.method6019() << 4;
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(27) int[] local27 = this.method7950(0, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static35.anInt670; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray453[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	private void method5220() {
		@Pc(9) int local9 = this.anIntArrayArray54.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 257; local16++) {
			@Pc(20) int local20 = 0;
			@Pc(24) int local24 = local16 << 4;
			for (@Pc(26) int local26 = 0; local26 < local9 && local24 >= this.anIntArrayArray54[local26][0]; local26++) {
				local20++;
			}
			@Pc(111) int local111;
			@Pc(97) int local97;
			@Pc(125) int local125;
			@Pc(49) int[] local49;
			if (local9 > local20) {
				local49 = this.anIntArrayArray54[local20];
				if (local20 > 0) {
					@Pc(61) int[] local61 = this.anIntArrayArray54[local20 - 1];
					@Pc(78) int local78 = (local24 - local61[0] << 12) / (local49[0] - local61[0]);
					@Pc(83) int local83 = 4096 - local78;
					local97 = local83 * local61[2] + local49[2] * local78 >> 12;
					local111 = local61[1] * local83 + local78 * local49[1] >> 12;
					local125 = local78 * local49[3] + local83 * local61[3] >> 12;
				} else {
					local125 = local49[3];
					local111 = local49[1];
					local97 = local49[2];
				}
			} else {
				local49 = this.anIntArrayArray54[local9 - 1];
				local97 = local49[2];
				local125 = local49[3];
				local111 = local49[1];
			}
			local125 >>= 0x4;
			local97 >>= 0x4;
			local111 >>= 0x4;
			if (local111 < 0) {
				local111 = 0;
			} else if (local111 > 255) {
				local111 = 255;
			}
			if (local125 < 0) {
				local125 = 0;
			} else if (local125 > 255) {
				local125 = 255;
			}
			if (local97 < 0) {
				local97 = 0;
			} else if (local97 > 255) {
				local97 = 255;
			}
			this.anIntArray453[local16] = local125 | local111 << 16 | local97 << 8;
		}
	}
}
