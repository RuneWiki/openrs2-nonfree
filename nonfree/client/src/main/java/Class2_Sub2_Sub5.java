import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!dh", name = "I", descriptor = "[I")
	private final int[] anIntArray124 = new int[257];

	static {
		new Class209(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V")
	private void method1246() {
		@Pc(9) int local9 = this.anIntArrayArray9.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 257; local16++) {
			@Pc(20) int local20 = 0;
			@Pc(24) int local24 = local16 << 4;
			for (@Pc(26) int local26 = 0; local9 > local26 && local24 >= this.anIntArrayArray9[local26][0]; local26++) {
				local20++;
			}
			@Pc(67) int local67;
			@Pc(63) int local63;
			@Pc(71) int local71;
			@Pc(59) int[] local59;
			if (local9 <= local20) {
				local59 = this.anIntArrayArray9[local9 - 1];
				local63 = local59[2];
				local67 = local59[1];
				local71 = local59[3];
			} else {
				local59 = this.anIntArrayArray9[local20];
				if (local20 <= 0) {
					local67 = local59[1];
					local63 = local59[2];
					local71 = local59[3];
				} else {
					@Pc(101) int[] local101 = this.anIntArrayArray9[local20 - 1];
					@Pc(119) int local119 = (local24 - local101[0] << 12) / (local59[0] - local101[0]);
					@Pc(123) int local123 = 4096 - local119;
					local63 = local101[2] * local123 + local119 * local59[2] >> 12;
					local71 = local123 * local101[3] + local119 * local59[3] >> 12;
					local67 = local101[1] * local123 + local59[1] * local119 >> 12;
				}
			}
			local71 >>= 0x4;
			local63 >>= 0x4;
			local67 >>= 0x4;
			if (local67 < 0) {
				local67 = 0;
			} else if (local67 > 255) {
				local67 = 255;
			}
			if (local63 < 0) {
				local63 = 0;
			} else if (local63 > 255) {
				local63 = 255;
			}
			if (local71 < 0) {
				local71 = 0;
			} else if (local71 > 255) {
				local71 = 255;
			}
			this.anIntArray124[local16] = local67 << 16 | local63 << 8 | local71;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(21) int[] local21 = this.method5839(arg0, 0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static429.anInt6518; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray124[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V")
	private void method1249(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray9 = new int[2][4];
			this.anIntArrayArray9[0][3] = 0;
			this.anIntArrayArray9[0][2] = 0;
			this.anIntArrayArray9[0][0] = 0;
			this.anIntArrayArray9[0][1] = 0;
			this.anIntArrayArray9[1][1] = 4096;
			this.anIntArrayArray9[1][3] = 4096;
			this.anIntArrayArray9[1][0] = 4096;
			this.anIntArrayArray9[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray9 = new int[8][4];
			this.anIntArrayArray9[0][0] = 0;
			this.anIntArrayArray9[0][3] = 2361;
			this.anIntArrayArray9[0][2] = 2602;
			this.anIntArrayArray9[0][1] = 2650;
			this.anIntArrayArray9[1][1] = 2313;
			this.anIntArrayArray9[1][3] = 1558;
			this.anIntArrayArray9[1][0] = 2867;
			this.anIntArrayArray9[1][2] = 1799;
			this.anIntArrayArray9[2][0] = 3072;
			this.anIntArrayArray9[2][1] = 2618;
			this.anIntArrayArray9[2][3] = 1413;
			this.anIntArrayArray9[2][2] = 1734;
			this.anIntArrayArray9[3][0] = 3276;
			this.anIntArrayArray9[3][2] = 1220;
			this.anIntArrayArray9[3][1] = 2296;
			this.anIntArrayArray9[3][3] = 947;
			this.anIntArrayArray9[4][2] = 963;
			this.anIntArrayArray9[4][3] = 722;
			this.anIntArrayArray9[4][1] = 2072;
			this.anIntArrayArray9[4][0] = 3481;
			this.anIntArrayArray9[5][1] = 2730;
			this.anIntArrayArray9[5][0] = 3686;
			this.anIntArrayArray9[5][3] = 1766;
			this.anIntArrayArray9[5][2] = 2152;
			this.anIntArrayArray9[6][2] = 1060;
			this.anIntArrayArray9[6][1] = 2232;
			this.anIntArrayArray9[6][0] = 3891;
			this.anIntArrayArray9[6][3] = 915;
			this.anIntArrayArray9[7][0] = 4096;
			this.anIntArrayArray9[7][1] = 1686;
			this.anIntArrayArray9[7][2] = 1413;
			this.anIntArrayArray9[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray9 = new int[7][4];
			this.anIntArrayArray9[0][2] = 0;
			this.anIntArrayArray9[0][3] = 4096;
			this.anIntArrayArray9[0][1] = 0;
			this.anIntArrayArray9[0][0] = 0;
			this.anIntArrayArray9[1][1] = 0;
			this.anIntArrayArray9[1][3] = 4096;
			this.anIntArrayArray9[1][0] = 663;
			this.anIntArrayArray9[1][2] = 4096;
			this.anIntArrayArray9[2][2] = 4096;
			this.anIntArrayArray9[2][0] = 1363;
			this.anIntArrayArray9[2][3] = 0;
			this.anIntArrayArray9[2][1] = 0;
			this.anIntArrayArray9[3][1] = 4096;
			this.anIntArrayArray9[3][0] = 2048;
			this.anIntArrayArray9[3][2] = 4096;
			this.anIntArrayArray9[3][3] = 0;
			this.anIntArrayArray9[4][2] = 0;
			this.anIntArrayArray9[4][0] = 2727;
			this.anIntArrayArray9[4][3] = 0;
			this.anIntArrayArray9[4][1] = 4096;
			this.anIntArrayArray9[5][3] = 4096;
			this.anIntArrayArray9[5][1] = 4096;
			this.anIntArrayArray9[5][2] = 0;
			this.anIntArrayArray9[5][0] = 3411;
			this.anIntArrayArray9[6][0] = 4096;
			this.anIntArrayArray9[6][3] = 4096;
			this.anIntArrayArray9[6][1] = 0;
			this.anIntArrayArray9[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray9 = new int[6][4];
			this.anIntArrayArray9[0][2] = 0;
			this.anIntArrayArray9[0][0] = 0;
			this.anIntArrayArray9[0][1] = 0;
			this.anIntArrayArray9[0][3] = 0;
			this.anIntArrayArray9[1][0] = 1843;
			this.anIntArrayArray9[1][3] = 1493;
			this.anIntArrayArray9[1][2] = 0;
			this.anIntArrayArray9[1][1] = 0;
			this.anIntArrayArray9[2][2] = 0;
			this.anIntArrayArray9[2][3] = 2939;
			this.anIntArrayArray9[2][0] = 2457;
			this.anIntArrayArray9[2][1] = 0;
			this.anIntArrayArray9[3][3] = 3565;
			this.anIntArrayArray9[3][2] = 1124;
			this.anIntArrayArray9[3][0] = 2781;
			this.anIntArrayArray9[3][1] = 0;
			this.anIntArrayArray9[4][2] = 3084;
			this.anIntArrayArray9[4][1] = 546;
			this.anIntArrayArray9[4][3] = 4031;
			this.anIntArrayArray9[4][0] = 3481;
			this.anIntArrayArray9[5][1] = 4096;
			this.anIntArrayArray9[5][3] = 4096;
			this.anIntArrayArray9[5][0] = 4096;
			this.anIntArrayArray9[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray9 = new int[16][4];
			this.anIntArrayArray9[0][2] = 192;
			this.anIntArrayArray9[0][3] = 321;
			this.anIntArrayArray9[0][0] = 0;
			this.anIntArrayArray9[0][1] = 80;
			this.anIntArrayArray9[1][0] = 155;
			this.anIntArrayArray9[1][1] = 321;
			this.anIntArrayArray9[1][2] = 449;
			this.anIntArrayArray9[1][3] = 562;
			this.anIntArrayArray9[2][0] = 389;
			this.anIntArrayArray9[2][1] = 578;
			this.anIntArrayArray9[2][2] = 690;
			this.anIntArrayArray9[2][3] = 803;
			this.anIntArrayArray9[3][1] = 947;
			this.anIntArrayArray9[3][2] = 995;
			this.anIntArrayArray9[3][0] = 671;
			this.anIntArrayArray9[3][3] = 1140;
			this.anIntArrayArray9[4][3] = 1509;
			this.anIntArrayArray9[4][1] = 1285;
			this.anIntArrayArray9[4][0] = 897;
			this.anIntArrayArray9[4][2] = 1397;
			this.anIntArrayArray9[5][3] = 1413;
			this.anIntArrayArray9[5][0] = 1175;
			this.anIntArrayArray9[5][2] = 1429;
			this.anIntArrayArray9[5][1] = 1525;
			this.anIntArrayArray9[6][1] = 1734;
			this.anIntArrayArray9[6][2] = 1461;
			this.anIntArrayArray9[6][3] = 1333;
			this.anIntArrayArray9[6][0] = 1368;
			this.anIntArrayArray9[7][0] = 1507;
			this.anIntArrayArray9[7][1] = 1413;
			this.anIntArrayArray9[7][2] = 1525;
			this.anIntArrayArray9[7][3] = 1702;
			this.anIntArrayArray9[8][0] = 1736;
			this.anIntArrayArray9[8][3] = 2056;
			this.anIntArrayArray9[8][2] = 1590;
			this.anIntArrayArray9[8][1] = 1108;
			this.anIntArrayArray9[9][2] = 2056;
			this.anIntArrayArray9[9][0] = 2088;
			this.anIntArrayArray9[9][1] = 1766;
			this.anIntArrayArray9[9][3] = 2666;
			this.anIntArrayArray9[10][1] = 2409;
			this.anIntArrayArray9[10][2] = 2586;
			this.anIntArrayArray9[10][3] = 3276;
			this.anIntArrayArray9[10][0] = 2355;
			this.anIntArrayArray9[11][0] = 2691;
			this.anIntArrayArray9[11][1] = 3116;
			this.anIntArrayArray9[11][2] = 3148;
			this.anIntArrayArray9[11][3] = 3228;
			this.anIntArrayArray9[12][3] = 3196;
			this.anIntArrayArray9[12][1] = 3806;
			this.anIntArrayArray9[12][2] = 3710;
			this.anIntArrayArray9[12][0] = 3031;
			this.anIntArrayArray9[13][2] = 3421;
			this.anIntArrayArray9[13][3] = 3019;
			this.anIntArrayArray9[13][0] = 3522;
			this.anIntArrayArray9[13][1] = 3437;
			this.anIntArrayArray9[14][1] = 3116;
			this.anIntArrayArray9[14][0] = 3727;
			this.anIntArrayArray9[14][3] = 3228;
			this.anIntArrayArray9[14][2] = 3148;
			this.anIntArrayArray9[15][0] = 4096;
			this.anIntArrayArray9[15][1] = 2377;
			this.anIntArrayArray9[15][2] = 2505;
			this.anIntArrayArray9[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray9 = new int[4][4];
			this.anIntArrayArray9[0][1] = 0;
			this.anIntArrayArray9[0][0] = 2048;
			this.anIntArrayArray9[0][2] = 4096;
			this.anIntArrayArray9[0][3] = 0;
			this.anIntArrayArray9[1][3] = 0;
			this.anIntArrayArray9[1][1] = 4096;
			this.anIntArrayArray9[1][2] = 4096;
			this.anIntArrayArray9[1][0] = 2867;
			this.anIntArrayArray9[2][1] = 4096;
			this.anIntArrayArray9[2][0] = 3276;
			this.anIntArrayArray9[2][2] = 4096;
			this.anIntArrayArray9[2][3] = 0;
			this.anIntArrayArray9[3][2] = 0;
			this.anIntArrayArray9[3][0] = 4096;
			this.anIntArrayArray9[3][1] = 4096;
			this.anIntArrayArray9[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
		if (this.anIntArrayArray9 == null) {
			this.method1249(1);
		}
		this.method1246();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(17) int local17 = arg0.method5495();
		if (local17 != 0) {
			this.method1249(local17);
			return;
		}
		this.anIntArrayArray9 = new int[arg0.method5495()][4];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray9.length; local28++) {
			this.anIntArrayArray9[local28][0] = arg0.method5500();
			this.anIntArrayArray9[local28][1] = arg0.method5495() << 4;
			this.anIntArrayArray9[local28][2] = arg0.method5495() << 4;
			this.anIntArrayArray9[local28][3] = arg0.method5495() << 4;
		}
	}
}
