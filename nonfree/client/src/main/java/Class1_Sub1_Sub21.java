import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mh", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!mh", name = "K", descriptor = "[I")
	private final int[] anIntArray307 = new int[257];

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(26) int[] local26 = this.method6013(arg0, 0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static85.anInt1910; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray307[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
		if (this.anIntArrayArray35 == null) {
			this.method3707(1);
		}
		this.method3708();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(19) int local19 = arg1.method2132();
		if (local19 != 0) {
			this.method3707(local19);
			return;
		}
		this.anIntArrayArray35 = new int[arg1.method2132()][4];
		for (@Pc(38) int local38 = 0; local38 < this.anIntArrayArray35.length; local38++) {
			this.anIntArrayArray35[local38][0] = arg1.method2161();
			this.anIntArrayArray35[local38][1] = arg1.method2132() << 4;
			this.anIntArrayArray35[local38][2] = arg1.method2132() << 4;
			this.anIntArrayArray35[local38][3] = arg1.method2132() << 4;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)V")
	private void method3707(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray35 = new int[2][4];
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][2] = 0;
			this.anIntArrayArray35[0][3] = 0;
			this.anIntArrayArray35[1][2] = 4096;
			this.anIntArrayArray35[1][3] = 4096;
			this.anIntArrayArray35[1][1] = 4096;
			this.anIntArrayArray35[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray35 = new int[8][4];
			this.anIntArrayArray35[0][3] = 2361;
			this.anIntArrayArray35[0][1] = 2650;
			this.anIntArrayArray35[0][2] = 2602;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[1][0] = 2867;
			this.anIntArrayArray35[1][2] = 1799;
			this.anIntArrayArray35[1][1] = 2313;
			this.anIntArrayArray35[1][3] = 1558;
			this.anIntArrayArray35[2][0] = 3072;
			this.anIntArrayArray35[2][2] = 1734;
			this.anIntArrayArray35[2][1] = 2618;
			this.anIntArrayArray35[2][3] = 1413;
			this.anIntArrayArray35[3][2] = 1220;
			this.anIntArrayArray35[3][1] = 2296;
			this.anIntArrayArray35[3][0] = 3276;
			this.anIntArrayArray35[3][3] = 947;
			this.anIntArrayArray35[4][2] = 963;
			this.anIntArrayArray35[4][3] = 722;
			this.anIntArrayArray35[4][0] = 3481;
			this.anIntArrayArray35[4][1] = 2072;
			this.anIntArrayArray35[5][1] = 2730;
			this.anIntArrayArray35[5][0] = 3686;
			this.anIntArrayArray35[5][3] = 1766;
			this.anIntArrayArray35[5][2] = 2152;
			this.anIntArrayArray35[6][1] = 2232;
			this.anIntArrayArray35[6][0] = 3891;
			this.anIntArrayArray35[6][2] = 1060;
			this.anIntArrayArray35[6][3] = 915;
			this.anIntArrayArray35[7][3] = 1140;
			this.anIntArrayArray35[7][2] = 1413;
			this.anIntArrayArray35[7][1] = 1686;
			this.anIntArrayArray35[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray35 = new int[7][4];
			this.anIntArrayArray35[0][3] = 4096;
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][2] = 0;
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[1][1] = 0;
			this.anIntArrayArray35[1][2] = 4096;
			this.anIntArrayArray35[1][0] = 663;
			this.anIntArrayArray35[1][3] = 4096;
			this.anIntArrayArray35[2][0] = 1363;
			this.anIntArrayArray35[2][3] = 0;
			this.anIntArrayArray35[2][2] = 4096;
			this.anIntArrayArray35[2][1] = 0;
			this.anIntArrayArray35[3][2] = 4096;
			this.anIntArrayArray35[3][1] = 4096;
			this.anIntArrayArray35[3][0] = 2048;
			this.anIntArrayArray35[3][3] = 0;
			this.anIntArrayArray35[4][2] = 0;
			this.anIntArrayArray35[4][1] = 4096;
			this.anIntArrayArray35[4][0] = 2727;
			this.anIntArrayArray35[4][3] = 0;
			this.anIntArrayArray35[5][1] = 4096;
			this.anIntArrayArray35[5][2] = 0;
			this.anIntArrayArray35[5][0] = 3411;
			this.anIntArrayArray35[5][3] = 4096;
			this.anIntArrayArray35[6][1] = 0;
			this.anIntArrayArray35[6][2] = 0;
			this.anIntArrayArray35[6][0] = 4096;
			this.anIntArrayArray35[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray35 = new int[6][4];
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][3] = 0;
			this.anIntArrayArray35[0][2] = 0;
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[1][0] = 1843;
			this.anIntArrayArray35[1][1] = 0;
			this.anIntArrayArray35[1][2] = 0;
			this.anIntArrayArray35[1][3] = 1493;
			this.anIntArrayArray35[2][1] = 0;
			this.anIntArrayArray35[2][2] = 0;
			this.anIntArrayArray35[2][0] = 2457;
			this.anIntArrayArray35[2][3] = 2939;
			this.anIntArrayArray35[3][0] = 2781;
			this.anIntArrayArray35[3][3] = 3565;
			this.anIntArrayArray35[3][2] = 1124;
			this.anIntArrayArray35[3][1] = 0;
			this.anIntArrayArray35[4][0] = 3481;
			this.anIntArrayArray35[4][2] = 3084;
			this.anIntArrayArray35[4][3] = 4031;
			this.anIntArrayArray35[4][1] = 546;
			this.anIntArrayArray35[5][0] = 4096;
			this.anIntArrayArray35[5][1] = 4096;
			this.anIntArrayArray35[5][3] = 4096;
			this.anIntArrayArray35[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray35 = new int[16][4];
			this.anIntArrayArray35[0][0] = 0;
			this.anIntArrayArray35[0][3] = 321;
			this.anIntArrayArray35[0][1] = 80;
			this.anIntArrayArray35[0][2] = 192;
			this.anIntArrayArray35[1][3] = 562;
			this.anIntArrayArray35[1][1] = 321;
			this.anIntArrayArray35[1][0] = 155;
			this.anIntArrayArray35[1][2] = 449;
			this.anIntArrayArray35[2][1] = 578;
			this.anIntArrayArray35[2][3] = 803;
			this.anIntArrayArray35[2][0] = 389;
			this.anIntArrayArray35[2][2] = 690;
			this.anIntArrayArray35[3][3] = 1140;
			this.anIntArrayArray35[3][2] = 995;
			this.anIntArrayArray35[3][0] = 671;
			this.anIntArrayArray35[3][1] = 947;
			this.anIntArrayArray35[4][2] = 1397;
			this.anIntArrayArray35[4][0] = 897;
			this.anIntArrayArray35[4][3] = 1509;
			this.anIntArrayArray35[4][1] = 1285;
			this.anIntArrayArray35[5][1] = 1525;
			this.anIntArrayArray35[5][0] = 1175;
			this.anIntArrayArray35[5][2] = 1429;
			this.anIntArrayArray35[5][3] = 1413;
			this.anIntArrayArray35[6][2] = 1461;
			this.anIntArrayArray35[6][3] = 1333;
			this.anIntArrayArray35[6][0] = 1368;
			this.anIntArrayArray35[6][1] = 1734;
			this.anIntArrayArray35[7][2] = 1525;
			this.anIntArrayArray35[7][3] = 1702;
			this.anIntArrayArray35[7][1] = 1413;
			this.anIntArrayArray35[7][0] = 1507;
			this.anIntArrayArray35[8][3] = 2056;
			this.anIntArrayArray35[8][0] = 1736;
			this.anIntArrayArray35[8][1] = 1108;
			this.anIntArrayArray35[8][2] = 1590;
			this.anIntArrayArray35[9][3] = 2666;
			this.anIntArrayArray35[9][2] = 2056;
			this.anIntArrayArray35[9][1] = 1766;
			this.anIntArrayArray35[9][0] = 2088;
			this.anIntArrayArray35[10][3] = 3276;
			this.anIntArrayArray35[10][1] = 2409;
			this.anIntArrayArray35[10][2] = 2586;
			this.anIntArrayArray35[10][0] = 2355;
			this.anIntArrayArray35[11][0] = 2691;
			this.anIntArrayArray35[11][2] = 3148;
			this.anIntArrayArray35[11][3] = 3228;
			this.anIntArrayArray35[11][1] = 3116;
			this.anIntArrayArray35[12][1] = 3806;
			this.anIntArrayArray35[12][0] = 3031;
			this.anIntArrayArray35[12][2] = 3710;
			this.anIntArrayArray35[12][3] = 3196;
			this.anIntArrayArray35[13][0] = 3522;
			this.anIntArrayArray35[13][2] = 3421;
			this.anIntArrayArray35[13][1] = 3437;
			this.anIntArrayArray35[13][3] = 3019;
			this.anIntArrayArray35[14][3] = 3228;
			this.anIntArrayArray35[14][1] = 3116;
			this.anIntArrayArray35[14][2] = 3148;
			this.anIntArrayArray35[14][0] = 3727;
			this.anIntArrayArray35[15][1] = 2377;
			this.anIntArrayArray35[15][0] = 4096;
			this.anIntArrayArray35[15][3] = 2746;
			this.anIntArrayArray35[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray35 = new int[4][4];
			this.anIntArrayArray35[0][1] = 0;
			this.anIntArrayArray35[0][2] = 4096;
			this.anIntArrayArray35[0][0] = 2048;
			this.anIntArrayArray35[0][3] = 0;
			this.anIntArrayArray35[1][2] = 4096;
			this.anIntArrayArray35[1][1] = 4096;
			this.anIntArrayArray35[1][0] = 2867;
			this.anIntArrayArray35[1][3] = 0;
			this.anIntArrayArray35[2][2] = 4096;
			this.anIntArrayArray35[2][0] = 3276;
			this.anIntArrayArray35[2][3] = 0;
			this.anIntArrayArray35[2][1] = 4096;
			this.anIntArrayArray35[3][3] = 0;
			this.anIntArrayArray35[3][0] = 4096;
			this.anIntArrayArray35[3][2] = 0;
			this.anIntArrayArray35[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V")
	private void method3708() {
		@Pc(16) int local16 = this.anIntArrayArray35.length;
		if (local16 <= 0) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < 257; local23++) {
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = local23 << 4;
			for (@Pc(33) int local33 = 0; local16 > local33 && local31 >= this.anIntArrayArray35[local33][0]; local33++) {
				local27++;
			}
			@Pc(117) int local117;
			@Pc(145) int local145;
			@Pc(131) int local131;
			@Pc(68) int[] local68;
			if (local27 < local16) {
				local68 = this.anIntArrayArray35[local27];
				if (local27 > 0) {
					@Pc(80) int[] local80 = this.anIntArrayArray35[local27 - 1];
					@Pc(98) int local98 = (local31 - local80[0] << 12) / (local68[0] - local80[0]);
					@Pc(103) int local103 = 4096 - local98;
					local117 = local68[1] * local98 + local103 * local80[1] >> 12;
					local131 = local103 * local80[3] + local68[3] * local98 >> 12;
					local145 = local98 * local68[2] + local80[2] * local103 >> 12;
				} else {
					local131 = local68[3];
					local117 = local68[1];
					local145 = local68[2];
				}
			} else {
				local68 = this.anIntArrayArray35[local16 - 1];
				local131 = local68[3];
				local117 = local68[1];
				local145 = local68[2];
			}
			local131 >>= 0x4;
			local145 >>= 0x4;
			local117 >>= 0x4;
			if (local131 < 0) {
				local131 = 0;
			} else if (local131 > 255) {
				local131 = 255;
			}
			if (local145 < 0) {
				local145 = 0;
			} else if (local145 > 255) {
				local145 = 255;
			}
			if (local117 < 0) {
				local117 = 0;
			} else if (local117 > 255) {
				local117 = 255;
			}
			this.anIntArray307[local23] = local117 << 16 | local145 << 8 | local131;
		}
	}
}
