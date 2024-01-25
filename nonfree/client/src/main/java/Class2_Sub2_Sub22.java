import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class2_Sub2_Sub22 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray110;

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "[I")
	private final int[] anIntArray388 = new int[257];

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(7) int local7 = arg0.method6138();
		if (local7 != 0) {
			this.method3483(local7);
			return;
		}
		this.anIntArrayArray110 = new int[arg0.method6138()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray110.length; local21++) {
			this.anIntArrayArray110[local21][0] = arg0.method6148();
			this.anIntArrayArray110[local21][1] = arg0.method6138() << 4;
			this.anIntArrayArray110[local21][2] = arg0.method6138() << 4;
			this.anIntArrayArray110[local21][3] = arg0.method6138() << 4;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
		if (this.anIntArrayArray110 == null) {
			this.method3483(1);
		}
		this.method3484();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
	private void method3483(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray110 = new int[2][4];
			this.anIntArrayArray110[0][3] = 0;
			this.anIntArrayArray110[0][1] = 0;
			this.anIntArrayArray110[0][0] = 0;
			this.anIntArrayArray110[0][2] = 0;
			this.anIntArrayArray110[1][1] = 4096;
			this.anIntArrayArray110[1][2] = 4096;
			this.anIntArrayArray110[1][0] = 4096;
			this.anIntArrayArray110[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray110 = new int[8][4];
			this.anIntArrayArray110[0][2] = 2602;
			this.anIntArrayArray110[0][3] = 2361;
			this.anIntArrayArray110[0][1] = 2650;
			this.anIntArrayArray110[0][0] = 0;
			this.anIntArrayArray110[1][1] = 2313;
			this.anIntArrayArray110[1][3] = 1558;
			this.anIntArrayArray110[1][0] = 2867;
			this.anIntArrayArray110[1][2] = 1799;
			this.anIntArrayArray110[2][2] = 1734;
			this.anIntArrayArray110[2][0] = 3072;
			this.anIntArrayArray110[2][3] = 1413;
			this.anIntArrayArray110[2][1] = 2618;
			this.anIntArrayArray110[3][1] = 2296;
			this.anIntArrayArray110[3][3] = 947;
			this.anIntArrayArray110[3][2] = 1220;
			this.anIntArrayArray110[3][0] = 3276;
			this.anIntArrayArray110[4][2] = 963;
			this.anIntArrayArray110[4][0] = 3481;
			this.anIntArrayArray110[4][1] = 2072;
			this.anIntArrayArray110[4][3] = 722;
			this.anIntArrayArray110[5][3] = 1766;
			this.anIntArrayArray110[5][2] = 2152;
			this.anIntArrayArray110[5][0] = 3686;
			this.anIntArrayArray110[5][1] = 2730;
			this.anIntArrayArray110[6][3] = 915;
			this.anIntArrayArray110[6][0] = 3891;
			this.anIntArrayArray110[6][2] = 1060;
			this.anIntArrayArray110[6][1] = 2232;
			this.anIntArrayArray110[7][2] = 1413;
			this.anIntArrayArray110[7][0] = 4096;
			this.anIntArrayArray110[7][3] = 1140;
			this.anIntArrayArray110[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray110 = new int[7][4];
			this.anIntArrayArray110[0][2] = 0;
			this.anIntArrayArray110[0][3] = 4096;
			this.anIntArrayArray110[0][1] = 0;
			this.anIntArrayArray110[0][0] = 0;
			this.anIntArrayArray110[1][2] = 4096;
			this.anIntArrayArray110[1][0] = 663;
			this.anIntArrayArray110[1][1] = 0;
			this.anIntArrayArray110[1][3] = 4096;
			this.anIntArrayArray110[2][0] = 1363;
			this.anIntArrayArray110[2][1] = 0;
			this.anIntArrayArray110[2][3] = 0;
			this.anIntArrayArray110[2][2] = 4096;
			this.anIntArrayArray110[3][2] = 4096;
			this.anIntArrayArray110[3][0] = 2048;
			this.anIntArrayArray110[3][3] = 0;
			this.anIntArrayArray110[3][1] = 4096;
			this.anIntArrayArray110[4][3] = 0;
			this.anIntArrayArray110[4][2] = 0;
			this.anIntArrayArray110[4][0] = 2727;
			this.anIntArrayArray110[4][1] = 4096;
			this.anIntArrayArray110[5][2] = 0;
			this.anIntArrayArray110[5][1] = 4096;
			this.anIntArrayArray110[5][0] = 3411;
			this.anIntArrayArray110[5][3] = 4096;
			this.anIntArrayArray110[6][1] = 0;
			this.anIntArrayArray110[6][3] = 4096;
			this.anIntArrayArray110[6][0] = 4096;
			this.anIntArrayArray110[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray110 = new int[6][4];
			this.anIntArrayArray110[0][0] = 0;
			this.anIntArrayArray110[0][2] = 0;
			this.anIntArrayArray110[0][3] = 0;
			this.anIntArrayArray110[0][1] = 0;
			this.anIntArrayArray110[1][3] = 1493;
			this.anIntArrayArray110[1][1] = 0;
			this.anIntArrayArray110[1][0] = 1843;
			this.anIntArrayArray110[1][2] = 0;
			this.anIntArrayArray110[2][1] = 0;
			this.anIntArrayArray110[2][0] = 2457;
			this.anIntArrayArray110[2][3] = 2939;
			this.anIntArrayArray110[2][2] = 0;
			this.anIntArrayArray110[3][0] = 2781;
			this.anIntArrayArray110[3][3] = 3565;
			this.anIntArrayArray110[3][1] = 0;
			this.anIntArrayArray110[3][2] = 1124;
			this.anIntArrayArray110[4][2] = 3084;
			this.anIntArrayArray110[4][3] = 4031;
			this.anIntArrayArray110[4][0] = 3481;
			this.anIntArrayArray110[4][1] = 546;
			this.anIntArrayArray110[5][1] = 4096;
			this.anIntArrayArray110[5][0] = 4096;
			this.anIntArrayArray110[5][3] = 4096;
			this.anIntArrayArray110[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray110 = new int[16][4];
			this.anIntArrayArray110[0][0] = 0;
			this.anIntArrayArray110[0][2] = 192;
			this.anIntArrayArray110[0][1] = 80;
			this.anIntArrayArray110[0][3] = 321;
			this.anIntArrayArray110[1][3] = 562;
			this.anIntArrayArray110[1][0] = 155;
			this.anIntArrayArray110[1][1] = 321;
			this.anIntArrayArray110[1][2] = 449;
			this.anIntArrayArray110[2][1] = 578;
			this.anIntArrayArray110[2][3] = 803;
			this.anIntArrayArray110[2][0] = 389;
			this.anIntArrayArray110[2][2] = 690;
			this.anIntArrayArray110[3][0] = 671;
			this.anIntArrayArray110[3][1] = 947;
			this.anIntArrayArray110[3][3] = 1140;
			this.anIntArrayArray110[3][2] = 995;
			this.anIntArrayArray110[4][1] = 1285;
			this.anIntArrayArray110[4][3] = 1509;
			this.anIntArrayArray110[4][2] = 1397;
			this.anIntArrayArray110[4][0] = 897;
			this.anIntArrayArray110[5][3] = 1413;
			this.anIntArrayArray110[5][2] = 1429;
			this.anIntArrayArray110[5][0] = 1175;
			this.anIntArrayArray110[5][1] = 1525;
			this.anIntArrayArray110[6][2] = 1461;
			this.anIntArrayArray110[6][0] = 1368;
			this.anIntArrayArray110[6][1] = 1734;
			this.anIntArrayArray110[6][3] = 1333;
			this.anIntArrayArray110[7][3] = 1702;
			this.anIntArrayArray110[7][0] = 1507;
			this.anIntArrayArray110[7][1] = 1413;
			this.anIntArrayArray110[7][2] = 1525;
			this.anIntArrayArray110[8][1] = 1108;
			this.anIntArrayArray110[8][2] = 1590;
			this.anIntArrayArray110[8][3] = 2056;
			this.anIntArrayArray110[8][0] = 1736;
			this.anIntArrayArray110[9][3] = 2666;
			this.anIntArrayArray110[9][2] = 2056;
			this.anIntArrayArray110[9][0] = 2088;
			this.anIntArrayArray110[9][1] = 1766;
			this.anIntArrayArray110[10][3] = 3276;
			this.anIntArrayArray110[10][0] = 2355;
			this.anIntArrayArray110[10][2] = 2586;
			this.anIntArrayArray110[10][1] = 2409;
			this.anIntArrayArray110[11][2] = 3148;
			this.anIntArrayArray110[11][0] = 2691;
			this.anIntArrayArray110[11][1] = 3116;
			this.anIntArrayArray110[11][3] = 3228;
			this.anIntArrayArray110[12][1] = 3806;
			this.anIntArrayArray110[12][3] = 3196;
			this.anIntArrayArray110[12][0] = 3031;
			this.anIntArrayArray110[12][2] = 3710;
			this.anIntArrayArray110[13][3] = 3019;
			this.anIntArrayArray110[13][2] = 3421;
			this.anIntArrayArray110[13][1] = 3437;
			this.anIntArrayArray110[13][0] = 3522;
			this.anIntArrayArray110[14][2] = 3148;
			this.anIntArrayArray110[14][1] = 3116;
			this.anIntArrayArray110[14][3] = 3228;
			this.anIntArrayArray110[14][0] = 3727;
			this.anIntArrayArray110[15][1] = 2377;
			this.anIntArrayArray110[15][3] = 2746;
			this.anIntArrayArray110[15][2] = 2505;
			this.anIntArrayArray110[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray110 = new int[4][4];
			this.anIntArrayArray110[0][2] = 4096;
			this.anIntArrayArray110[0][0] = 2048;
			this.anIntArrayArray110[0][1] = 0;
			this.anIntArrayArray110[0][3] = 0;
			this.anIntArrayArray110[1][3] = 0;
			this.anIntArrayArray110[1][1] = 4096;
			this.anIntArrayArray110[1][0] = 2867;
			this.anIntArrayArray110[1][2] = 4096;
			this.anIntArrayArray110[2][1] = 4096;
			this.anIntArrayArray110[2][3] = 0;
			this.anIntArrayArray110[2][2] = 4096;
			this.anIntArrayArray110[2][0] = 3276;
			this.anIntArrayArray110[3][1] = 4096;
			this.anIntArrayArray110[3][0] = 4096;
			this.anIntArrayArray110[3][2] = 0;
			this.anIntArrayArray110[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(Z)V")
	private void method3484() {
		@Pc(15) int local15 = this.anIntArrayArray110.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local22 << 4;
			for (@Pc(32) int local32 = 0; local32 < local15 && local30 >= this.anIntArrayArray110[local32][0]; local32++) {
				local26++;
			}
			@Pc(73) int local73;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(61) int[] local61;
			if (local26 >= local15) {
				local61 = this.anIntArrayArray110[local15 - 1];
				local65 = local61[2];
				local69 = local61[3];
				local73 = local61[1];
			} else {
				local61 = this.anIntArrayArray110[local26];
				if (local26 <= 0) {
					local69 = local61[3];
					local65 = local61[2];
					local73 = local61[1];
				} else {
					@Pc(103) int[] local103 = this.anIntArrayArray110[local26 - 1];
					@Pc(120) int local120 = (local30 - local103[0] << 12) / (local61[0] - local103[0]);
					@Pc(125) int local125 = 4096 - local120;
					local65 = local125 * local103[2] + local120 * local61[2] >> 12;
					local69 = local61[3] * local120 + local103[3] * local125 >> 12;
					local73 = local103[1] * local125 + local120 * local61[1] >> 12;
				}
			}
			local69 >>= 0x4;
			local73 >>= 0x4;
			local65 >>= 0x4;
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
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			this.anIntArray388[local22] = local65 << 8 | local73 << 16 | local69;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(23) int[] local23 = this.method6266(0, arg0);
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static398.anInt6955; local37++) {
				@Pc(45) int local45 = local23[local37] >> 4;
				if (local45 < 0) {
					local45 = 0;
				}
				if (local45 > 256) {
					local45 = 256;
				}
				local45 = this.anIntArray388[local45];
				local27[local37] = local45 >> 12 & 0xFF0;
				local31[local37] = local45 >> 4 & 0xFF0;
				local35[local37] = (local45 & 0xFF) << 4;
			}
		}
		return local11;
	}
}
