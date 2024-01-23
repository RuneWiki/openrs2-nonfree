import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class4_Sub1_Sub32 extends Class4_Sub1 {

	@OriginalMember(owner = "client!s", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!s", name = "V", descriptor = "[I")
	private int[] anIntArray383 = new int[257];

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)V")
	private void method3761(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray33 = new int[2][4];
			this.anIntArrayArray33[0][3] = 0;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[1][0] = 4096;
			this.anIntArrayArray33[1][3] = 4096;
			this.anIntArrayArray33[0][2] = 0;
			this.anIntArrayArray33[1][2] = 4096;
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray33 = new int[8][4];
			this.anIntArrayArray33[0][1] = 2650;
			this.anIntArrayArray33[1][1] = 2313;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][2] = 2602;
			this.anIntArrayArray33[0][3] = 2361;
			this.anIntArrayArray33[2][1] = 2618;
			this.anIntArrayArray33[1][2] = 1799;
			this.anIntArrayArray33[3][1] = 2296;
			this.anIntArrayArray33[2][2] = 1734;
			this.anIntArrayArray33[1][3] = 1558;
			this.anIntArrayArray33[2][3] = 1413;
			this.anIntArrayArray33[3][2] = 1220;
			this.anIntArrayArray33[1][0] = 2867;
			this.anIntArrayArray33[4][1] = 2072;
			this.anIntArrayArray33[2][0] = 3072;
			this.anIntArrayArray33[3][0] = 3276;
			this.anIntArrayArray33[5][1] = 2730;
			this.anIntArrayArray33[6][1] = 2232;
			this.anIntArrayArray33[4][0] = 3481;
			this.anIntArrayArray33[4][2] = 963;
			this.anIntArrayArray33[5][0] = 3686;
			this.anIntArrayArray33[5][2] = 2152;
			this.anIntArrayArray33[7][1] = 1686;
			this.anIntArrayArray33[6][2] = 1060;
			this.anIntArrayArray33[6][0] = 3891;
			this.anIntArrayArray33[3][3] = 947;
			this.anIntArrayArray33[7][2] = 1413;
			this.anIntArrayArray33[7][0] = 4096;
			this.anIntArrayArray33[4][3] = 722;
			this.anIntArrayArray33[5][3] = 1766;
			this.anIntArrayArray33[6][3] = 915;
			this.anIntArrayArray33[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray33 = new int[7][4];
			this.anIntArrayArray33[0][2] = 0;
			this.anIntArrayArray33[0][3] = 4096;
			this.anIntArrayArray33[1][2] = 4096;
			this.anIntArrayArray33[2][2] = 4096;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[3][2] = 4096;
			this.anIntArrayArray33[4][2] = 0;
			this.anIntArrayArray33[1][3] = 4096;
			this.anIntArrayArray33[5][2] = 0;
			this.anIntArrayArray33[1][1] = 0;
			this.anIntArrayArray33[2][3] = 0;
			this.anIntArrayArray33[6][2] = 0;
			this.anIntArrayArray33[2][1] = 0;
			this.anIntArrayArray33[3][1] = 4096;
			this.anIntArrayArray33[1][0] = 663;
			this.anIntArrayArray33[3][3] = 0;
			this.anIntArrayArray33[4][3] = 0;
			this.anIntArrayArray33[2][0] = 1363;
			this.anIntArrayArray33[3][0] = 2048;
			this.anIntArrayArray33[5][3] = 4096;
			this.anIntArrayArray33[4][1] = 4096;
			this.anIntArrayArray33[4][0] = 2727;
			this.anIntArrayArray33[6][3] = 4096;
			this.anIntArrayArray33[5][1] = 4096;
			this.anIntArrayArray33[5][0] = 3411;
			this.anIntArrayArray33[6][0] = 4096;
			this.anIntArrayArray33[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray33 = new int[6][4];
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[0][2] = 0;
			this.anIntArrayArray33[1][1] = 0;
			this.anIntArrayArray33[0][3] = 0;
			this.anIntArrayArray33[1][2] = 0;
			this.anIntArrayArray33[1][3] = 1493;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[2][1] = 0;
			this.anIntArrayArray33[2][3] = 2939;
			this.anIntArrayArray33[3][3] = 3565;
			this.anIntArrayArray33[4][3] = 4031;
			this.anIntArrayArray33[1][0] = 1843;
			this.anIntArrayArray33[2][2] = 0;
			this.anIntArrayArray33[5][3] = 4096;
			this.anIntArrayArray33[3][2] = 1124;
			this.anIntArrayArray33[4][2] = 3084;
			this.anIntArrayArray33[5][2] = 4096;
			this.anIntArrayArray33[2][0] = 2457;
			this.anIntArrayArray33[3][1] = 0;
			this.anIntArrayArray33[4][1] = 546;
			this.anIntArrayArray33[5][1] = 4096;
			this.anIntArrayArray33[3][0] = 2781;
			this.anIntArrayArray33[4][0] = 3481;
			this.anIntArrayArray33[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray33 = new int[16][4];
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][2] = 192;
			this.anIntArrayArray33[0][1] = 80;
			this.anIntArrayArray33[1][2] = 449;
			this.anIntArrayArray33[1][0] = 155;
			this.anIntArrayArray33[2][0] = 389;
			this.anIntArrayArray33[0][3] = 321;
			this.anIntArrayArray33[2][2] = 690;
			this.anIntArrayArray33[1][1] = 321;
			this.anIntArrayArray33[2][1] = 578;
			this.anIntArrayArray33[3][1] = 947;
			this.anIntArrayArray33[1][3] = 562;
			this.anIntArrayArray33[3][2] = 995;
			this.anIntArrayArray33[2][3] = 803;
			this.anIntArrayArray33[3][3] = 1140;
			this.anIntArrayArray33[4][3] = 1509;
			this.anIntArrayArray33[4][1] = 1285;
			this.anIntArrayArray33[5][3] = 1413;
			this.anIntArrayArray33[5][1] = 1525;
			this.anIntArrayArray33[6][3] = 1333;
			this.anIntArrayArray33[4][2] = 1397;
			this.anIntArrayArray33[7][3] = 1702;
			this.anIntArrayArray33[3][0] = 671;
			this.anIntArrayArray33[4][0] = 897;
			this.anIntArrayArray33[6][1] = 1734;
			this.anIntArrayArray33[7][1] = 1413;
			this.anIntArrayArray33[5][0] = 1175;
			this.anIntArrayArray33[8][1] = 1108;
			this.anIntArrayArray33[6][0] = 1368;
			this.anIntArrayArray33[8][3] = 2056;
			this.anIntArrayArray33[9][3] = 2666;
			this.anIntArrayArray33[9][1] = 1766;
			this.anIntArrayArray33[10][3] = 3276;
			this.anIntArrayArray33[5][2] = 1429;
			this.anIntArrayArray33[6][2] = 1461;
			this.anIntArrayArray33[11][3] = 3228;
			this.anIntArrayArray33[7][2] = 1525;
			this.anIntArrayArray33[7][0] = 1507;
			this.anIntArrayArray33[12][3] = 3196;
			this.anIntArrayArray33[8][2] = 1590;
			this.anIntArrayArray33[10][1] = 2409;
			this.anIntArrayArray33[8][0] = 1736;
			this.anIntArrayArray33[9][0] = 2088;
			this.anIntArrayArray33[13][3] = 3019;
			this.anIntArrayArray33[14][3] = 3228;
			this.anIntArrayArray33[9][2] = 2056;
			this.anIntArrayArray33[10][2] = 2586;
			this.anIntArrayArray33[10][0] = 2355;
			this.anIntArrayArray33[11][0] = 2691;
			this.anIntArrayArray33[11][2] = 3148;
			this.anIntArrayArray33[12][2] = 3710;
			this.anIntArrayArray33[11][1] = 3116;
			this.anIntArrayArray33[12][0] = 3031;
			this.anIntArrayArray33[13][2] = 3421;
			this.anIntArrayArray33[15][3] = 2746;
			this.anIntArrayArray33[12][1] = 3806;
			this.anIntArrayArray33[13][0] = 3522;
			this.anIntArrayArray33[13][1] = 3437;
			this.anIntArrayArray33[14][2] = 3148;
			this.anIntArrayArray33[14][0] = 3727;
			this.anIntArrayArray33[14][1] = 3116;
			this.anIntArrayArray33[15][0] = 4096;
			this.anIntArrayArray33[15][2] = 2505;
			this.anIntArrayArray33[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray33 = new int[4][4];
			this.anIntArrayArray33[0][3] = 0;
			this.anIntArrayArray33[1][3] = 0;
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[1][1] = 4096;
			this.anIntArrayArray33[2][3] = 0;
			this.anIntArrayArray33[3][3] = 0;
			this.anIntArrayArray33[2][1] = 4096;
			this.anIntArrayArray33[0][0] = 2048;
			this.anIntArrayArray33[3][1] = 4096;
			this.anIntArrayArray33[0][2] = 4096;
			this.anIntArrayArray33[1][0] = 2867;
			this.anIntArrayArray33[1][2] = 4096;
			this.anIntArrayArray33[2][0] = 3276;
			this.anIntArrayArray33[3][0] = 4096;
			this.anIntArrayArray33[2][2] = 4096;
			this.anIntArrayArray33[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
	private void method3762() {
		@Pc(9) int local9 = this.anIntArrayArray33.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 257; local15++) {
			@Pc(22) int local22 = 0;
			@Pc(26) int local26 = local15 << 4;
			for (@Pc(28) int local28 = 0; local28 < local9 && this.anIntArrayArray33[local28][0] <= local26; local28++) {
				local22++;
			}
			@Pc(72) int local72;
			@Pc(68) int local68;
			@Pc(64) int local64;
			@Pc(55) int[] local55;
			if (local9 > local22) {
				local55 = this.anIntArrayArray33[local22];
				if (local22 <= 0) {
					local64 = local55[3];
					local68 = local55[2];
					local72 = local55[1];
				} else {
					@Pc(81) int[] local81 = this.anIntArrayArray33[local22 - 1];
					@Pc(99) int local99 = (local26 - local81[0] << 12) / (local55[0] - local81[0]);
					@Pc(104) int local104 = 4096 - local99;
					local68 = local99 * local55[2] + local104 * local81[2] >> 12;
					local72 = local99 * local55[1] + local81[1] * local104 >> 12;
					local64 = local81[3] * local104 + local55[3] * local99 >> 12;
				}
			} else {
				local55 = this.anIntArrayArray33[local9 - 1];
				local64 = local55[3];
				local72 = local55[1];
				local68 = local55[2];
			}
			local68 >>= 0x4;
			local72 >>= 0x4;
			if (local72 < 0) {
				local72 = 0;
			} else if (local72 > 255) {
				local72 = 255;
			}
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			local64 >>= 0x4;
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			this.anIntArray383[local15] = local64 | local68 << 8 | local72 << 16;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(30) int[] local30 = this.method4538(0, arg0);
			@Pc(34) int[] local34 = local19[0];
			@Pc(38) int[] local38 = local19[1];
			@Pc(42) int[] local42 = local19[2];
			for (@Pc(44) int local44 = 0; local44 < Static68.anInt1753; local44++) {
				@Pc(53) int local53 = local30[local44] >> 4;
				if (local53 < 0) {
					local53 = 0;
				}
				if (local53 > 256) {
					local53 = 256;
				}
				local53 = this.anIntArray383[local53];
				local34[local44] = local53 >> 12 & 0xFF0;
				local38[local44] = local53 >> 4 & 0xFF0;
				local42[local44] = (local53 & 0xFF) << 4;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(16) int local16 = arg1.method3110();
		if (local16 != 0) {
			this.method3761(local16);
			return;
		}
		this.anIntArrayArray33 = new int[arg1.method3110()][4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArrayArray33.length; local30++) {
			this.anIntArrayArray33[local30][0] = arg1.method3085();
			this.anIntArrayArray33[local30][1] = arg1.method3110() << 4;
			this.anIntArrayArray33[local30][2] = arg1.method3110() << 4;
			this.anIntArrayArray33[local30][3] = arg1.method3110() << 4;
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
		if (this.anIntArrayArray33 == null) {
			this.method3761(1);
		}
		this.method3762();
	}
}
