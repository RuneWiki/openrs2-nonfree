import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class7_Sub4_Sub1 extends Class7_Sub4 {

	@OriginalMember(owner = "client!cb", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "[I")
	private final int[] anIntArray142 = new int[257];

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
		if (this.anIntArrayArray12 == null) {
			this.method723(1);
		}
		this.method724();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(19) int local19 = arg0.method2772();
		if (local19 != 0) {
			this.method723(local19);
			return;
		}
		this.anIntArrayArray12 = new int[arg0.method2772()][4];
		for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray12.length; local33++) {
			this.anIntArrayArray12[local33][0] = arg0.method2764();
			this.anIntArrayArray12[local33][1] = arg0.method2772() << 4;
			this.anIntArrayArray12[local33][2] = arg0.method2772() << 4;
			this.anIntArrayArray12[local33][3] = arg0.method2772() << 4;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
	private void method723(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray12 = new int[2][4];
			this.anIntArrayArray12[0][0] = 0;
			this.anIntArrayArray12[0][2] = 0;
			this.anIntArrayArray12[0][3] = 0;
			this.anIntArrayArray12[0][1] = 0;
			this.anIntArrayArray12[1][3] = 4096;
			this.anIntArrayArray12[1][1] = 4096;
			this.anIntArrayArray12[1][0] = 4096;
			this.anIntArrayArray12[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray12 = new int[8][4];
			this.anIntArrayArray12[0][2] = 2602;
			this.anIntArrayArray12[0][3] = 2361;
			this.anIntArrayArray12[0][1] = 2650;
			this.anIntArrayArray12[0][0] = 0;
			this.anIntArrayArray12[1][1] = 2313;
			this.anIntArrayArray12[1][3] = 1558;
			this.anIntArrayArray12[1][0] = 2867;
			this.anIntArrayArray12[1][2] = 1799;
			this.anIntArrayArray12[2][3] = 1413;
			this.anIntArrayArray12[2][0] = 3072;
			this.anIntArrayArray12[2][1] = 2618;
			this.anIntArrayArray12[2][2] = 1734;
			this.anIntArrayArray12[3][1] = 2296;
			this.anIntArrayArray12[3][3] = 947;
			this.anIntArrayArray12[3][0] = 3276;
			this.anIntArrayArray12[3][2] = 1220;
			this.anIntArrayArray12[4][1] = 2072;
			this.anIntArrayArray12[4][2] = 963;
			this.anIntArrayArray12[4][0] = 3481;
			this.anIntArrayArray12[4][3] = 722;
			this.anIntArrayArray12[5][0] = 3686;
			this.anIntArrayArray12[5][1] = 2730;
			this.anIntArrayArray12[5][2] = 2152;
			this.anIntArrayArray12[5][3] = 1766;
			this.anIntArrayArray12[6][1] = 2232;
			this.anIntArrayArray12[6][0] = 3891;
			this.anIntArrayArray12[6][2] = 1060;
			this.anIntArrayArray12[6][3] = 915;
			this.anIntArrayArray12[7][0] = 4096;
			this.anIntArrayArray12[7][3] = 1140;
			this.anIntArrayArray12[7][1] = 1686;
			this.anIntArrayArray12[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray12 = new int[7][4];
			this.anIntArrayArray12[0][1] = 0;
			this.anIntArrayArray12[0][3] = 4096;
			this.anIntArrayArray12[0][2] = 0;
			this.anIntArrayArray12[0][0] = 0;
			this.anIntArrayArray12[1][0] = 663;
			this.anIntArrayArray12[1][1] = 0;
			this.anIntArrayArray12[1][2] = 4096;
			this.anIntArrayArray12[1][3] = 4096;
			this.anIntArrayArray12[2][0] = 1363;
			this.anIntArrayArray12[2][1] = 0;
			this.anIntArrayArray12[2][3] = 0;
			this.anIntArrayArray12[2][2] = 4096;
			this.anIntArrayArray12[3][0] = 2048;
			this.anIntArrayArray12[3][3] = 0;
			this.anIntArrayArray12[3][1] = 4096;
			this.anIntArrayArray12[3][2] = 4096;
			this.anIntArrayArray12[4][0] = 2727;
			this.anIntArrayArray12[4][1] = 4096;
			this.anIntArrayArray12[4][3] = 0;
			this.anIntArrayArray12[4][2] = 0;
			this.anIntArrayArray12[5][3] = 4096;
			this.anIntArrayArray12[5][1] = 4096;
			this.anIntArrayArray12[5][0] = 3411;
			this.anIntArrayArray12[5][2] = 0;
			this.anIntArrayArray12[6][0] = 4096;
			this.anIntArrayArray12[6][2] = 0;
			this.anIntArrayArray12[6][3] = 4096;
			this.anIntArrayArray12[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray12 = new int[6][4];
			this.anIntArrayArray12[0][0] = 0;
			this.anIntArrayArray12[0][1] = 0;
			this.anIntArrayArray12[0][3] = 0;
			this.anIntArrayArray12[0][2] = 0;
			this.anIntArrayArray12[1][0] = 1843;
			this.anIntArrayArray12[1][1] = 0;
			this.anIntArrayArray12[1][2] = 0;
			this.anIntArrayArray12[1][3] = 1493;
			this.anIntArrayArray12[2][1] = 0;
			this.anIntArrayArray12[2][3] = 2939;
			this.anIntArrayArray12[2][2] = 0;
			this.anIntArrayArray12[2][0] = 2457;
			this.anIntArrayArray12[3][3] = 3565;
			this.anIntArrayArray12[3][0] = 2781;
			this.anIntArrayArray12[3][2] = 1124;
			this.anIntArrayArray12[3][1] = 0;
			this.anIntArrayArray12[4][1] = 546;
			this.anIntArrayArray12[4][2] = 3084;
			this.anIntArrayArray12[4][0] = 3481;
			this.anIntArrayArray12[4][3] = 4031;
			this.anIntArrayArray12[5][1] = 4096;
			this.anIntArrayArray12[5][3] = 4096;
			this.anIntArrayArray12[5][2] = 4096;
			this.anIntArrayArray12[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray12 = new int[16][4];
			this.anIntArrayArray12[0][0] = 0;
			this.anIntArrayArray12[0][3] = 321;
			this.anIntArrayArray12[0][1] = 80;
			this.anIntArrayArray12[0][2] = 192;
			this.anIntArrayArray12[1][3] = 562;
			this.anIntArrayArray12[1][0] = 155;
			this.anIntArrayArray12[1][2] = 449;
			this.anIntArrayArray12[1][1] = 321;
			this.anIntArrayArray12[2][2] = 690;
			this.anIntArrayArray12[2][1] = 578;
			this.anIntArrayArray12[2][3] = 803;
			this.anIntArrayArray12[2][0] = 389;
			this.anIntArrayArray12[3][3] = 1140;
			this.anIntArrayArray12[3][2] = 995;
			this.anIntArrayArray12[3][0] = 671;
			this.anIntArrayArray12[3][1] = 947;
			this.anIntArrayArray12[4][3] = 1509;
			this.anIntArrayArray12[4][1] = 1285;
			this.anIntArrayArray12[4][2] = 1397;
			this.anIntArrayArray12[4][0] = 897;
			this.anIntArrayArray12[5][3] = 1413;
			this.anIntArrayArray12[5][2] = 1429;
			this.anIntArrayArray12[5][0] = 1175;
			this.anIntArrayArray12[5][1] = 1525;
			this.anIntArrayArray12[6][0] = 1368;
			this.anIntArrayArray12[6][1] = 1734;
			this.anIntArrayArray12[6][2] = 1461;
			this.anIntArrayArray12[6][3] = 1333;
			this.anIntArrayArray12[7][2] = 1525;
			this.anIntArrayArray12[7][3] = 1702;
			this.anIntArrayArray12[7][0] = 1507;
			this.anIntArrayArray12[7][1] = 1413;
			this.anIntArrayArray12[8][0] = 1736;
			this.anIntArrayArray12[8][3] = 2056;
			this.anIntArrayArray12[8][1] = 1108;
			this.anIntArrayArray12[8][2] = 1590;
			this.anIntArrayArray12[9][3] = 2666;
			this.anIntArrayArray12[9][2] = 2056;
			this.anIntArrayArray12[9][1] = 1766;
			this.anIntArrayArray12[9][0] = 2088;
			this.anIntArrayArray12[10][1] = 2409;
			this.anIntArrayArray12[10][3] = 3276;
			this.anIntArrayArray12[10][2] = 2586;
			this.anIntArrayArray12[10][0] = 2355;
			this.anIntArrayArray12[11][2] = 3148;
			this.anIntArrayArray12[11][3] = 3228;
			this.anIntArrayArray12[11][1] = 3116;
			this.anIntArrayArray12[11][0] = 2691;
			this.anIntArrayArray12[12][0] = 3031;
			this.anIntArrayArray12[12][3] = 3196;
			this.anIntArrayArray12[12][2] = 3710;
			this.anIntArrayArray12[12][1] = 3806;
			this.anIntArrayArray12[13][2] = 3421;
			this.anIntArrayArray12[13][0] = 3522;
			this.anIntArrayArray12[13][1] = 3437;
			this.anIntArrayArray12[13][3] = 3019;
			this.anIntArrayArray12[14][3] = 3228;
			this.anIntArrayArray12[14][0] = 3727;
			this.anIntArrayArray12[14][2] = 3148;
			this.anIntArrayArray12[14][1] = 3116;
			this.anIntArrayArray12[15][3] = 2746;
			this.anIntArrayArray12[15][2] = 2505;
			this.anIntArrayArray12[15][1] = 2377;
			this.anIntArrayArray12[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray12 = new int[4][4];
			this.anIntArrayArray12[0][3] = 0;
			this.anIntArrayArray12[0][1] = 0;
			this.anIntArrayArray12[0][2] = 4096;
			this.anIntArrayArray12[0][0] = 2048;
			this.anIntArrayArray12[1][3] = 0;
			this.anIntArrayArray12[1][0] = 2867;
			this.anIntArrayArray12[1][1] = 4096;
			this.anIntArrayArray12[1][2] = 4096;
			this.anIntArrayArray12[2][1] = 4096;
			this.anIntArrayArray12[2][2] = 4096;
			this.anIntArrayArray12[2][3] = 0;
			this.anIntArrayArray12[2][0] = 3276;
			this.anIntArrayArray12[3][0] = 4096;
			this.anIntArrayArray12[3][1] = 4096;
			this.anIntArrayArray12[3][3] = 0;
			this.anIntArrayArray12[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(26) int[] local26 = this.method5634(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static201.anInt4174; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray142[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
	private void method724() {
		@Pc(15) int local15 = this.anIntArrayArray12.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local22 << 4;
			for (@Pc(32) int local32 = 0; local32 < local15 && local30 >= this.anIntArrayArray12[local32][0]; local32++) {
				local26++;
			}
			@Pc(134) int local134;
			@Pc(104) int local104;
			@Pc(119) int local119;
			@Pc(59) int[] local59;
			if (local26 < local15) {
				local59 = this.anIntArrayArray12[local26];
				if (local26 > 0) {
					@Pc(68) int[] local68 = this.anIntArrayArray12[local26 - 1];
					@Pc(85) int local85 = (local30 - local68[0] << 12) / (local59[0] - local68[0]);
					@Pc(89) int local89 = 4096 - local85;
					local104 = local59[2] * local85 + local68[2] * local89 >> 12;
					local119 = local85 * local59[3] + local89 * local68[3] >> 12;
					local134 = local59[1] * local85 + local68[1] * local89 >> 12;
				} else {
					local134 = local59[1];
					local104 = local59[2];
					local119 = local59[3];
				}
			} else {
				local59 = this.anIntArrayArray12[local15 - 1];
				local119 = local59[3];
				local104 = local59[2];
				local134 = local59[1];
			}
			local119 >>= 0x4;
			local104 >>= 0x4;
			local134 >>= 0x4;
			if (local134 < 0) {
				local134 = 0;
			} else if (local134 > 255) {
				local134 = 255;
			}
			if (local104 < 0) {
				local104 = 0;
			} else if (local104 > 255) {
				local104 = 255;
			}
			if (local119 < 0) {
				local119 = 0;
			} else if (local119 > 255) {
				local119 = 255;
			}
			this.anIntArray142[local22] = local119 | local104 << 8 | local134 << 16;
		}
	}
}
