import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!gs", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!gs", name = "V", descriptor = "[I")
	private final int[] anIntArray226 = new int[257];

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	@Override
	public void method5877() {
		if (this.anIntArrayArray78 == null) {
			this.method2423(1);
		}
		this.method2422();
	}

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)V")
	private void method2422() {
		@Pc(9) int local9 = this.anIntArrayArray78.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 257; local18++) {
			@Pc(22) int local22 = 0;
			@Pc(26) int local26 = local18 << 4;
			for (@Pc(28) int local28 = 0; local28 < local9 && local26 >= this.anIntArrayArray78[local28][0]; local28++) {
				local22++;
			}
			@Pc(73) int local73;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(61) int[] local61;
			if (local9 <= local22) {
				local61 = this.anIntArrayArray78[local9 - 1];
				local65 = local61[2];
				local69 = local61[3];
				local73 = local61[1];
			} else {
				local61 = this.anIntArrayArray78[local22];
				if (local22 <= 0) {
					local69 = local61[3];
					local73 = local61[1];
					local65 = local61[2];
				} else {
					@Pc(103) int[] local103 = this.anIntArrayArray78[local22 - 1];
					@Pc(121) int local121 = (local26 - local103[0] << 12) / (local61[0] - local103[0]);
					@Pc(126) int local126 = 4096 - local121;
					local73 = local126 * local103[1] + local61[1] * local121 >> 12;
					local65 = local61[2] * local121 + local126 * local103[2] >> 12;
					local69 = local121 * local61[3] + local126 * local103[3] >> 12;
				}
			}
			local65 >>= 0x4;
			local73 >>= 0x4;
			local69 >>= 0x4;
			if (local73 < 0) {
				local73 = 0;
			} else if (local73 > 255) {
				local73 = 255;
			}
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			if (local65 < 0) {
				local65 = 0;
			} else if (local65 > 255) {
				local65 = 255;
			}
			this.anIntArray226[local18] = local69 | local73 << 16 | local65 << 8;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)V")
	private void method2423(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray78 = new int[2][4];
			this.anIntArrayArray78[0][2] = 0;
			this.anIntArrayArray78[0][0] = 0;
			this.anIntArrayArray78[0][1] = 0;
			this.anIntArrayArray78[0][3] = 0;
			this.anIntArrayArray78[1][1] = 4096;
			this.anIntArrayArray78[1][2] = 4096;
			this.anIntArrayArray78[1][0] = 4096;
			this.anIntArrayArray78[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray78 = new int[8][4];
			this.anIntArrayArray78[0][1] = 2650;
			this.anIntArrayArray78[0][2] = 2602;
			this.anIntArrayArray78[0][3] = 2361;
			this.anIntArrayArray78[0][0] = 0;
			this.anIntArrayArray78[1][1] = 2313;
			this.anIntArrayArray78[1][2] = 1799;
			this.anIntArrayArray78[1][3] = 1558;
			this.anIntArrayArray78[1][0] = 2867;
			this.anIntArrayArray78[2][2] = 1734;
			this.anIntArrayArray78[2][0] = 3072;
			this.anIntArrayArray78[2][1] = 2618;
			this.anIntArrayArray78[2][3] = 1413;
			this.anIntArrayArray78[3][2] = 1220;
			this.anIntArrayArray78[3][1] = 2296;
			this.anIntArrayArray78[3][0] = 3276;
			this.anIntArrayArray78[3][3] = 947;
			this.anIntArrayArray78[4][2] = 963;
			this.anIntArrayArray78[4][0] = 3481;
			this.anIntArrayArray78[4][1] = 2072;
			this.anIntArrayArray78[4][3] = 722;
			this.anIntArrayArray78[5][0] = 3686;
			this.anIntArrayArray78[5][1] = 2730;
			this.anIntArrayArray78[5][2] = 2152;
			this.anIntArrayArray78[5][3] = 1766;
			this.anIntArrayArray78[6][3] = 915;
			this.anIntArrayArray78[6][1] = 2232;
			this.anIntArrayArray78[6][2] = 1060;
			this.anIntArrayArray78[6][0] = 3891;
			this.anIntArrayArray78[7][1] = 1686;
			this.anIntArrayArray78[7][2] = 1413;
			this.anIntArrayArray78[7][3] = 1140;
			this.anIntArrayArray78[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray78 = new int[7][4];
			this.anIntArrayArray78[0][1] = 0;
			this.anIntArrayArray78[0][3] = 4096;
			this.anIntArrayArray78[0][2] = 0;
			this.anIntArrayArray78[0][0] = 0;
			this.anIntArrayArray78[1][2] = 4096;
			this.anIntArrayArray78[1][0] = 663;
			this.anIntArrayArray78[1][1] = 0;
			this.anIntArrayArray78[1][3] = 4096;
			this.anIntArrayArray78[2][0] = 1363;
			this.anIntArrayArray78[2][3] = 0;
			this.anIntArrayArray78[2][2] = 4096;
			this.anIntArrayArray78[2][1] = 0;
			this.anIntArrayArray78[3][0] = 2048;
			this.anIntArrayArray78[3][3] = 0;
			this.anIntArrayArray78[3][2] = 4096;
			this.anIntArrayArray78[3][1] = 4096;
			this.anIntArrayArray78[4][3] = 0;
			this.anIntArrayArray78[4][0] = 2727;
			this.anIntArrayArray78[4][2] = 0;
			this.anIntArrayArray78[4][1] = 4096;
			this.anIntArrayArray78[5][0] = 3411;
			this.anIntArrayArray78[5][1] = 4096;
			this.anIntArrayArray78[5][2] = 0;
			this.anIntArrayArray78[5][3] = 4096;
			this.anIntArrayArray78[6][1] = 0;
			this.anIntArrayArray78[6][0] = 4096;
			this.anIntArrayArray78[6][2] = 0;
			this.anIntArrayArray78[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray78 = new int[6][4];
			this.anIntArrayArray78[0][1] = 0;
			this.anIntArrayArray78[0][2] = 0;
			this.anIntArrayArray78[0][0] = 0;
			this.anIntArrayArray78[0][3] = 0;
			this.anIntArrayArray78[1][2] = 0;
			this.anIntArrayArray78[1][1] = 0;
			this.anIntArrayArray78[1][3] = 1493;
			this.anIntArrayArray78[1][0] = 1843;
			this.anIntArrayArray78[2][1] = 0;
			this.anIntArrayArray78[2][0] = 2457;
			this.anIntArrayArray78[2][3] = 2939;
			this.anIntArrayArray78[2][2] = 0;
			this.anIntArrayArray78[3][3] = 3565;
			this.anIntArrayArray78[3][0] = 2781;
			this.anIntArrayArray78[3][1] = 0;
			this.anIntArrayArray78[3][2] = 1124;
			this.anIntArrayArray78[4][1] = 546;
			this.anIntArrayArray78[4][0] = 3481;
			this.anIntArrayArray78[4][2] = 3084;
			this.anIntArrayArray78[4][3] = 4031;
			this.anIntArrayArray78[5][0] = 4096;
			this.anIntArrayArray78[5][1] = 4096;
			this.anIntArrayArray78[5][2] = 4096;
			this.anIntArrayArray78[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray78 = new int[16][4];
			this.anIntArrayArray78[0][3] = 321;
			this.anIntArrayArray78[0][1] = 80;
			this.anIntArrayArray78[0][2] = 192;
			this.anIntArrayArray78[0][0] = 0;
			this.anIntArrayArray78[1][1] = 321;
			this.anIntArrayArray78[1][3] = 562;
			this.anIntArrayArray78[1][0] = 155;
			this.anIntArrayArray78[1][2] = 449;
			this.anIntArrayArray78[2][1] = 578;
			this.anIntArrayArray78[2][2] = 690;
			this.anIntArrayArray78[2][3] = 803;
			this.anIntArrayArray78[2][0] = 389;
			this.anIntArrayArray78[3][2] = 995;
			this.anIntArrayArray78[3][3] = 1140;
			this.anIntArrayArray78[3][0] = 671;
			this.anIntArrayArray78[3][1] = 947;
			this.anIntArrayArray78[4][0] = 897;
			this.anIntArrayArray78[4][2] = 1397;
			this.anIntArrayArray78[4][1] = 1285;
			this.anIntArrayArray78[4][3] = 1509;
			this.anIntArrayArray78[5][3] = 1413;
			this.anIntArrayArray78[5][2] = 1429;
			this.anIntArrayArray78[5][1] = 1525;
			this.anIntArrayArray78[5][0] = 1175;
			this.anIntArrayArray78[6][3] = 1333;
			this.anIntArrayArray78[6][1] = 1734;
			this.anIntArrayArray78[6][2] = 1461;
			this.anIntArrayArray78[6][0] = 1368;
			this.anIntArrayArray78[7][3] = 1702;
			this.anIntArrayArray78[7][1] = 1413;
			this.anIntArrayArray78[7][2] = 1525;
			this.anIntArrayArray78[7][0] = 1507;
			this.anIntArrayArray78[8][1] = 1108;
			this.anIntArrayArray78[8][0] = 1736;
			this.anIntArrayArray78[8][3] = 2056;
			this.anIntArrayArray78[8][2] = 1590;
			this.anIntArrayArray78[9][0] = 2088;
			this.anIntArrayArray78[9][1] = 1766;
			this.anIntArrayArray78[9][3] = 2666;
			this.anIntArrayArray78[9][2] = 2056;
			this.anIntArrayArray78[10][2] = 2586;
			this.anIntArrayArray78[10][1] = 2409;
			this.anIntArrayArray78[10][0] = 2355;
			this.anIntArrayArray78[10][3] = 3276;
			this.anIntArrayArray78[11][2] = 3148;
			this.anIntArrayArray78[11][0] = 2691;
			this.anIntArrayArray78[11][1] = 3116;
			this.anIntArrayArray78[11][3] = 3228;
			this.anIntArrayArray78[12][3] = 3196;
			this.anIntArrayArray78[12][2] = 3710;
			this.anIntArrayArray78[12][1] = 3806;
			this.anIntArrayArray78[12][0] = 3031;
			this.anIntArrayArray78[13][3] = 3019;
			this.anIntArrayArray78[13][2] = 3421;
			this.anIntArrayArray78[13][0] = 3522;
			this.anIntArrayArray78[13][1] = 3437;
			this.anIntArrayArray78[14][3] = 3228;
			this.anIntArrayArray78[14][2] = 3148;
			this.anIntArrayArray78[14][1] = 3116;
			this.anIntArrayArray78[14][0] = 3727;
			this.anIntArrayArray78[15][2] = 2505;
			this.anIntArrayArray78[15][0] = 4096;
			this.anIntArrayArray78[15][1] = 2377;
			this.anIntArrayArray78[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray78 = new int[4][4];
			this.anIntArrayArray78[0][3] = 0;
			this.anIntArrayArray78[0][1] = 0;
			this.anIntArrayArray78[0][0] = 2048;
			this.anIntArrayArray78[0][2] = 4096;
			this.anIntArrayArray78[1][1] = 4096;
			this.anIntArrayArray78[1][2] = 4096;
			this.anIntArrayArray78[1][0] = 2867;
			this.anIntArrayArray78[1][3] = 0;
			this.anIntArrayArray78[2][0] = 3276;
			this.anIntArrayArray78[2][1] = 4096;
			this.anIntArrayArray78[2][2] = 4096;
			this.anIntArrayArray78[2][3] = 0;
			this.anIntArrayArray78[3][3] = 0;
			this.anIntArrayArray78[3][1] = 4096;
			this.anIntArrayArray78[3][0] = 4096;
			this.anIntArrayArray78[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(14) int local14 = arg1.method4421();
		if (local14 != 0) {
			this.method2423(local14);
			return;
		}
		this.anIntArrayArray78 = new int[arg1.method4421()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray78.length; local31++) {
			this.anIntArrayArray78[local31][0] = arg1.method4464();
			this.anIntArrayArray78[local31][1] = arg1.method4421() << 4;
			this.anIntArrayArray78[local31][2] = arg1.method4421() << 4;
			this.anIntArrayArray78[local31][3] = arg1.method4421() << 4;
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(21) int[] local21 = this.method5876(0, arg0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static339.anInt6735; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray226[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
