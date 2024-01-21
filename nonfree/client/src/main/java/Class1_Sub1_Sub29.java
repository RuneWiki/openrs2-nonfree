import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!og", name = "vb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!og", name = "nb", descriptor = "[I")
	private final int[] anIntArray378 = new int[257];

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
		if (this.anIntArrayArray33 == null) {
			this.method2562(1);
		}
		this.method2563();
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)V")
	private void method2562(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray33 = new int[2][4];
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][2] = 0;
			this.anIntArrayArray33[1][0] = 4096;
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[0][3] = 0;
			this.anIntArrayArray33[1][1] = 4096;
			this.anIntArrayArray33[1][3] = 4096;
			this.anIntArrayArray33[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray33 = new int[8][4];
			this.anIntArrayArray33[0][1] = 2650;
			this.anIntArrayArray33[0][3] = 2361;
			this.anIntArrayArray33[1][3] = 1558;
			this.anIntArrayArray33[0][2] = 2602;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[1][1] = 2313;
			this.anIntArrayArray33[1][0] = 2867;
			this.anIntArrayArray33[2][1] = 2618;
			this.anIntArrayArray33[2][0] = 3072;
			this.anIntArrayArray33[2][3] = 1413;
			this.anIntArrayArray33[3][1] = 2296;
			this.anIntArrayArray33[1][2] = 1799;
			this.anIntArrayArray33[4][1] = 2072;
			this.anIntArrayArray33[5][1] = 2730;
			this.anIntArrayArray33[3][3] = 947;
			this.anIntArrayArray33[2][2] = 1734;
			this.anIntArrayArray33[3][2] = 1220;
			this.anIntArrayArray33[4][3] = 722;
			this.anIntArrayArray33[6][1] = 2232;
			this.anIntArrayArray33[3][0] = 3276;
			this.anIntArrayArray33[4][2] = 963;
			this.anIntArrayArray33[5][2] = 2152;
			this.anIntArrayArray33[7][1] = 1686;
			this.anIntArrayArray33[6][2] = 1060;
			this.anIntArrayArray33[4][0] = 3481;
			this.anIntArrayArray33[5][3] = 1766;
			this.anIntArrayArray33[7][2] = 1413;
			this.anIntArrayArray33[5][0] = 3686;
			this.anIntArrayArray33[6][3] = 915;
			this.anIntArrayArray33[7][3] = 1140;
			this.anIntArrayArray33[6][0] = 3891;
			this.anIntArrayArray33[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray33 = new int[7][4];
			this.anIntArrayArray33[0][2] = 0;
			this.anIntArrayArray33[0][3] = 4096;
			this.anIntArrayArray33[1][3] = 4096;
			this.anIntArrayArray33[2][3] = 0;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[1][1] = 0;
			this.anIntArrayArray33[1][2] = 4096;
			this.anIntArrayArray33[1][0] = 663;
			this.anIntArrayArray33[2][0] = 1363;
			this.anIntArrayArray33[3][0] = 2048;
			this.anIntArrayArray33[2][1] = 0;
			this.anIntArrayArray33[3][3] = 0;
			this.anIntArrayArray33[4][3] = 0;
			this.anIntArrayArray33[5][3] = 4096;
			this.anIntArrayArray33[4][0] = 2727;
			this.anIntArrayArray33[5][0] = 3411;
			this.anIntArrayArray33[2][2] = 4096;
			this.anIntArrayArray33[6][0] = 4096;
			this.anIntArrayArray33[6][3] = 4096;
			this.anIntArrayArray33[3][1] = 4096;
			this.anIntArrayArray33[3][2] = 4096;
			this.anIntArrayArray33[4][2] = 0;
			this.anIntArrayArray33[4][1] = 4096;
			this.anIntArrayArray33[5][2] = 0;
			this.anIntArrayArray33[6][2] = 0;
			this.anIntArrayArray33[5][1] = 4096;
			this.anIntArrayArray33[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray33 = new int[6][4];
			this.anIntArrayArray33[0][2] = 0;
			this.anIntArrayArray33[1][2] = 0;
			this.anIntArrayArray33[2][2] = 0;
			this.anIntArrayArray33[0][3] = 0;
			this.anIntArrayArray33[3][2] = 1124;
			this.anIntArrayArray33[1][3] = 1493;
			this.anIntArrayArray33[4][2] = 3084;
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[2][3] = 2939;
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[1][0] = 1843;
			this.anIntArrayArray33[2][0] = 2457;
			this.anIntArrayArray33[5][2] = 4096;
			this.anIntArrayArray33[3][3] = 3565;
			this.anIntArrayArray33[3][0] = 2781;
			this.anIntArrayArray33[4][0] = 3481;
			this.anIntArrayArray33[5][0] = 4096;
			this.anIntArrayArray33[1][1] = 0;
			this.anIntArrayArray33[4][3] = 4031;
			this.anIntArrayArray33[2][1] = 0;
			this.anIntArrayArray33[3][1] = 0;
			this.anIntArrayArray33[5][3] = 4096;
			this.anIntArrayArray33[4][1] = 546;
			this.anIntArrayArray33[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray33 = new int[16][4];
			this.anIntArrayArray33[0][0] = 0;
			this.anIntArrayArray33[0][3] = 321;
			this.anIntArrayArray33[1][3] = 562;
			this.anIntArrayArray33[0][1] = 80;
			this.anIntArrayArray33[1][1] = 321;
			this.anIntArrayArray33[0][2] = 192;
			this.anIntArrayArray33[1][2] = 449;
			this.anIntArrayArray33[2][3] = 803;
			this.anIntArrayArray33[3][3] = 1140;
			this.anIntArrayArray33[4][3] = 1509;
			this.anIntArrayArray33[5][3] = 1413;
			this.anIntArrayArray33[1][0] = 155;
			this.anIntArrayArray33[2][1] = 578;
			this.anIntArrayArray33[3][1] = 947;
			this.anIntArrayArray33[2][2] = 690;
			this.anIntArrayArray33[4][1] = 1285;
			this.anIntArrayArray33[6][3] = 1333;
			this.anIntArrayArray33[5][1] = 1525;
			this.anIntArrayArray33[7][3] = 1702;
			this.anIntArrayArray33[2][0] = 389;
			this.anIntArrayArray33[6][1] = 1734;
			this.anIntArrayArray33[3][0] = 671;
			this.anIntArrayArray33[8][3] = 2056;
			this.anIntArrayArray33[3][2] = 995;
			this.anIntArrayArray33[7][1] = 1413;
			this.anIntArrayArray33[9][3] = 2666;
			this.anIntArrayArray33[10][3] = 3276;
			this.anIntArrayArray33[8][1] = 1108;
			this.anIntArrayArray33[11][3] = 3228;
			this.anIntArrayArray33[12][3] = 3196;
			this.anIntArrayArray33[4][2] = 1397;
			this.anIntArrayArray33[13][3] = 3019;
			this.anIntArrayArray33[9][1] = 1766;
			this.anIntArrayArray33[5][2] = 1429;
			this.anIntArrayArray33[14][3] = 3228;
			this.anIntArrayArray33[10][1] = 2409;
			this.anIntArrayArray33[15][3] = 2746;
			this.anIntArrayArray33[6][2] = 1461;
			this.anIntArrayArray33[7][2] = 1525;
			this.anIntArrayArray33[8][2] = 1590;
			this.anIntArrayArray33[11][1] = 3116;
			this.anIntArrayArray33[12][1] = 3806;
			this.anIntArrayArray33[9][2] = 2056;
			this.anIntArrayArray33[10][2] = 2586;
			this.anIntArrayArray33[11][2] = 3148;
			this.anIntArrayArray33[12][2] = 3710;
			this.anIntArrayArray33[13][1] = 3437;
			this.anIntArrayArray33[13][2] = 3421;
			this.anIntArrayArray33[4][0] = 897;
			this.anIntArrayArray33[14][1] = 3116;
			this.anIntArrayArray33[14][2] = 3148;
			this.anIntArrayArray33[15][2] = 2505;
			this.anIntArrayArray33[5][0] = 1175;
			this.anIntArrayArray33[15][1] = 2377;
			this.anIntArrayArray33[6][0] = 1368;
			this.anIntArrayArray33[7][0] = 1507;
			this.anIntArrayArray33[8][0] = 1736;
			this.anIntArrayArray33[9][0] = 2088;
			this.anIntArrayArray33[10][0] = 2355;
			this.anIntArrayArray33[11][0] = 2691;
			this.anIntArrayArray33[12][0] = 3031;
			this.anIntArrayArray33[13][0] = 3522;
			this.anIntArrayArray33[14][0] = 3727;
			this.anIntArrayArray33[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray33 = new int[4][4];
			this.anIntArrayArray33[0][0] = 2048;
			this.anIntArrayArray33[0][2] = 4096;
			this.anIntArrayArray33[0][3] = 0;
			this.anIntArrayArray33[1][2] = 4096;
			this.anIntArrayArray33[1][0] = 2867;
			this.anIntArrayArray33[2][2] = 4096;
			this.anIntArrayArray33[3][2] = 0;
			this.anIntArrayArray33[2][0] = 3276;
			this.anIntArrayArray33[1][3] = 0;
			this.anIntArrayArray33[2][3] = 0;
			this.anIntArrayArray33[0][1] = 0;
			this.anIntArrayArray33[3][0] = 4096;
			this.anIntArrayArray33[1][1] = 4096;
			this.anIntArrayArray33[2][1] = 4096;
			this.anIntArrayArray33[3][3] = 0;
			this.anIntArrayArray33[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(9) int[][] local9 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(23) int[] local23 = this.method3303(arg0, 0);
			@Pc(27) int[] local27 = local9[0];
			@Pc(31) int[] local31 = local9[1];
			@Pc(35) int[] local35 = local9[2];
			for (@Pc(37) int local37 = 0; local37 < Static176.anInt3921; local37++) {
				@Pc(45) int local45 = local23[local37] >> 4;
				if (local45 < 0) {
					local45 = 0;
				}
				if (local45 > 256) {
					local45 = 256;
				}
				local45 = this.anIntArray378[local45];
				local27[local37] = local45 >> 12 & 0xFF0;
				local31[local37] = local45 >> 4 & 0xFF0;
				local35[local37] = (local45 & 0xFF) << 4;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(10) int local10 = arg1.method1738();
		if (local10 != 0) {
			this.method2562(local10);
			return;
		}
		this.anIntArrayArray33 = new int[arg1.method1738()][4];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray33.length; local24++) {
			this.anIntArrayArray33[local24][0] = arg1.method1753();
			this.anIntArrayArray33[local24][1] = arg1.method1738() << 4;
			this.anIntArrayArray33[local24][2] = arg1.method1738() << 4;
			this.anIntArrayArray33[local24][3] = arg1.method1738() << 4;
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(B)V")
	private void method2563() {
		@Pc(16) int local16 = this.anIntArrayArray33.length;
		if (local16 <= 0) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < 257; local23++) {
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = local23 << 4;
			for (@Pc(33) int local33 = 0; local16 > local33 && local31 >= this.anIntArrayArray33[local33][0]; local33++) {
				local27++;
			}
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(73) int local73;
			@Pc(56) int[] local56;
			if (local27 < local16) {
				local56 = this.anIntArrayArray33[local27];
				if (local27 <= 0) {
					local65 = local56[1];
					local69 = local56[2];
					local73 = local56[3];
				} else {
					@Pc(82) int[] local82 = this.anIntArrayArray33[local27 - 1];
					@Pc(100) int local100 = (local31 - local82[0] << 12) / (local56[0] - local82[0]);
					@Pc(105) int local105 = 4096 - local100;
					local65 = local56[1] * local100 + local105 * local82[1] >> 12;
					local69 = local100 * local56[2] + local105 * local82[2] >> 12;
					local73 = local56[3] * local100 + local82[3] * local105 >> 12;
				}
			} else {
				local56 = this.anIntArrayArray33[local16 - 1];
				local65 = local56[1];
				local73 = local56[3];
				local69 = local56[2];
			}
			local69 >>= 0x4;
			local65 >>= 0x4;
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			local73 >>= 0x4;
			if (local65 < 0) {
				local65 = 0;
			} else if (local65 > 255) {
				local65 = 255;
			}
			if (local73 < 0) {
				local73 = 0;
			} else if (local73 > 255) {
				local73 = 255;
			}
			this.anIntArray378[local23] = local73 | local65 << 16 | local69 << 8;
		}
	}
}
