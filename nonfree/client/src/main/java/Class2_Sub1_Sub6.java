import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!dl", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!dl", name = "X", descriptor = "[I")
	private int[] anIntArray94 = new int[257];

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)V")
	private void method1011() {
		@Pc(17) int local17 = this.anIntArrayArray11.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(31) int local31 = local22 << 4;
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = 0; local35 < local17 && local31 >= this.anIntArrayArray11[local35][0]; local35++) {
				local33++;
			}
			@Pc(78) int local78;
			@Pc(74) int local74;
			@Pc(70) int local70;
			@Pc(66) int[] local66;
			if (local17 <= local33) {
				local66 = this.anIntArrayArray11[local17 - 1];
				local70 = local66[3];
				local74 = local66[2];
				local78 = local66[1];
			} else {
				local66 = this.anIntArrayArray11[local33];
				if (local33 <= 0) {
					local78 = local66[1];
					local74 = local66[2];
					local70 = local66[3];
				} else {
					@Pc(107) int[] local107 = this.anIntArrayArray11[local33 - 1];
					@Pc(124) int local124 = (local31 - local107[0] << 12) / (local66[0] - local107[0]);
					@Pc(128) int local128 = 4096 - local124;
					local74 = local128 * local107[2] + local66[2] * local124 >> 12;
					local70 = local66[3] * local124 + local107[3] * local128 >> 12;
					local78 = local124 * local66[1] + local107[1] * local128 >> 12;
				}
			}
			local70 >>= 0x4;
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 255) {
				local70 = 255;
			}
			local74 >>= 0x4;
			local78 >>= 0x4;
			if (local78 < 0) {
				local78 = 0;
			} else if (local78 > 255) {
				local78 = 255;
			}
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 > 255) {
				local74 = 255;
			}
			this.anIntArray94[local22] = local74 << 8 | local78 << 16 | local70;
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(21) int[] local21 = this.method4946(arg0, 0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static114.anInt1359; local35++) {
				@Pc(44) int local44 = local21[local35] >> 4;
				if (local44 < 0) {
					local44 = 0;
				}
				if (local44 > 256) {
					local44 = 256;
				}
				local44 = this.anIntArray94[local44];
				local25[local35] = local44 >> 12 & 0xFF0;
				local29[local35] = local44 >> 4 & 0xFF0;
				local33[local35] = (local44 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
		if (this.anIntArrayArray11 == null) {
			this.method1012(1);
		}
		this.method1011();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)V")
	private void method1012(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray11 = new int[2][4];
			this.anIntArrayArray11[0][0] = 0;
			this.anIntArrayArray11[0][1] = 0;
			this.anIntArrayArray11[0][3] = 0;
			this.anIntArrayArray11[1][1] = 4096;
			this.anIntArrayArray11[0][2] = 0;
			this.anIntArrayArray11[1][3] = 4096;
			this.anIntArrayArray11[1][2] = 4096;
			this.anIntArrayArray11[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray11 = new int[8][4];
			this.anIntArrayArray11[0][2] = 2602;
			this.anIntArrayArray11[0][1] = 2650;
			this.anIntArrayArray11[0][0] = 0;
			this.anIntArrayArray11[1][1] = 2313;
			this.anIntArrayArray11[2][1] = 2618;
			this.anIntArrayArray11[1][2] = 1799;
			this.anIntArrayArray11[1][0] = 2867;
			this.anIntArrayArray11[2][0] = 3072;
			this.anIntArrayArray11[3][1] = 2296;
			this.anIntArrayArray11[4][1] = 2072;
			this.anIntArrayArray11[5][1] = 2730;
			this.anIntArrayArray11[3][0] = 3276;
			this.anIntArrayArray11[0][3] = 2361;
			this.anIntArrayArray11[6][1] = 2232;
			this.anIntArrayArray11[4][0] = 3481;
			this.anIntArrayArray11[7][1] = 1686;
			this.anIntArrayArray11[2][2] = 1734;
			this.anIntArrayArray11[3][2] = 1220;
			this.anIntArrayArray11[1][3] = 1558;
			this.anIntArrayArray11[5][0] = 3686;
			this.anIntArrayArray11[4][2] = 963;
			this.anIntArrayArray11[5][2] = 2152;
			this.anIntArrayArray11[6][0] = 3891;
			this.anIntArrayArray11[7][0] = 4096;
			this.anIntArrayArray11[6][2] = 1060;
			this.anIntArrayArray11[2][3] = 1413;
			this.anIntArrayArray11[7][2] = 1413;
			this.anIntArrayArray11[3][3] = 947;
			this.anIntArrayArray11[4][3] = 722;
			this.anIntArrayArray11[5][3] = 1766;
			this.anIntArrayArray11[6][3] = 915;
			this.anIntArrayArray11[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray11 = new int[7][4];
			this.anIntArrayArray11[0][1] = 0;
			this.anIntArrayArray11[0][2] = 0;
			this.anIntArrayArray11[0][0] = 0;
			this.anIntArrayArray11[0][3] = 4096;
			this.anIntArrayArray11[1][3] = 4096;
			this.anIntArrayArray11[1][2] = 4096;
			this.anIntArrayArray11[2][2] = 4096;
			this.anIntArrayArray11[2][3] = 0;
			this.anIntArrayArray11[3][3] = 0;
			this.anIntArrayArray11[1][0] = 663;
			this.anIntArrayArray11[1][1] = 0;
			this.anIntArrayArray11[2][1] = 0;
			this.anIntArrayArray11[3][2] = 4096;
			this.anIntArrayArray11[4][2] = 0;
			this.anIntArrayArray11[2][0] = 1363;
			this.anIntArrayArray11[3][1] = 4096;
			this.anIntArrayArray11[4][1] = 4096;
			this.anIntArrayArray11[5][1] = 4096;
			this.anIntArrayArray11[5][2] = 0;
			this.anIntArrayArray11[6][1] = 0;
			this.anIntArrayArray11[3][0] = 2048;
			this.anIntArrayArray11[6][2] = 0;
			this.anIntArrayArray11[4][0] = 2727;
			this.anIntArrayArray11[5][0] = 3411;
			this.anIntArrayArray11[4][3] = 0;
			this.anIntArrayArray11[5][3] = 4096;
			this.anIntArrayArray11[6][3] = 4096;
			this.anIntArrayArray11[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray11 = new int[6][4];
			this.anIntArrayArray11[0][1] = 0;
			this.anIntArrayArray11[0][0] = 0;
			this.anIntArrayArray11[1][1] = 0;
			this.anIntArrayArray11[1][0] = 1843;
			this.anIntArrayArray11[2][0] = 2457;
			this.anIntArrayArray11[3][0] = 2781;
			this.anIntArrayArray11[4][0] = 3481;
			this.anIntArrayArray11[0][2] = 0;
			this.anIntArrayArray11[1][2] = 0;
			this.anIntArrayArray11[5][0] = 4096;
			this.anIntArrayArray11[0][3] = 0;
			this.anIntArrayArray11[2][2] = 0;
			this.anIntArrayArray11[3][2] = 1124;
			this.anIntArrayArray11[4][2] = 3084;
			this.anIntArrayArray11[1][3] = 1493;
			this.anIntArrayArray11[2][1] = 0;
			this.anIntArrayArray11[5][2] = 4096;
			this.anIntArrayArray11[2][3] = 2939;
			this.anIntArrayArray11[3][1] = 0;
			this.anIntArrayArray11[4][1] = 546;
			this.anIntArrayArray11[3][3] = 3565;
			this.anIntArrayArray11[5][1] = 4096;
			this.anIntArrayArray11[4][3] = 4031;
			this.anIntArrayArray11[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray11 = new int[16][4];
			this.anIntArrayArray11[0][1] = 80;
			this.anIntArrayArray11[0][2] = 192;
			this.anIntArrayArray11[1][2] = 449;
			this.anIntArrayArray11[0][0] = 0;
			this.anIntArrayArray11[1][0] = 155;
			this.anIntArrayArray11[2][0] = 389;
			this.anIntArrayArray11[2][2] = 690;
			this.anIntArrayArray11[3][0] = 671;
			this.anIntArrayArray11[1][1] = 321;
			this.anIntArrayArray11[3][2] = 995;
			this.anIntArrayArray11[4][2] = 1397;
			this.anIntArrayArray11[5][2] = 1429;
			this.anIntArrayArray11[0][3] = 321;
			this.anIntArrayArray11[6][2] = 1461;
			this.anIntArrayArray11[7][2] = 1525;
			this.anIntArrayArray11[4][0] = 897;
			this.anIntArrayArray11[8][2] = 1590;
			this.anIntArrayArray11[9][2] = 2056;
			this.anIntArrayArray11[1][3] = 562;
			this.anIntArrayArray11[10][2] = 2586;
			this.anIntArrayArray11[2][3] = 803;
			this.anIntArrayArray11[5][0] = 1175;
			this.anIntArrayArray11[11][2] = 3148;
			this.anIntArrayArray11[2][1] = 578;
			this.anIntArrayArray11[3][3] = 1140;
			this.anIntArrayArray11[6][0] = 1368;
			this.anIntArrayArray11[4][3] = 1509;
			this.anIntArrayArray11[3][1] = 947;
			this.anIntArrayArray11[12][2] = 3710;
			this.anIntArrayArray11[13][2] = 3421;
			this.anIntArrayArray11[4][1] = 1285;
			this.anIntArrayArray11[5][1] = 1525;
			this.anIntArrayArray11[14][2] = 3148;
			this.anIntArrayArray11[6][1] = 1734;
			this.anIntArrayArray11[7][1] = 1413;
			this.anIntArrayArray11[15][2] = 2505;
			this.anIntArrayArray11[8][1] = 1108;
			this.anIntArrayArray11[7][0] = 1507;
			this.anIntArrayArray11[5][3] = 1413;
			this.anIntArrayArray11[8][0] = 1736;
			this.anIntArrayArray11[9][0] = 2088;
			this.anIntArrayArray11[9][1] = 1766;
			this.anIntArrayArray11[10][0] = 2355;
			this.anIntArrayArray11[6][3] = 1333;
			this.anIntArrayArray11[7][3] = 1702;
			this.anIntArrayArray11[8][3] = 2056;
			this.anIntArrayArray11[9][3] = 2666;
			this.anIntArrayArray11[11][0] = 2691;
			this.anIntArrayArray11[12][0] = 3031;
			this.anIntArrayArray11[13][0] = 3522;
			this.anIntArrayArray11[14][0] = 3727;
			this.anIntArrayArray11[10][1] = 2409;
			this.anIntArrayArray11[15][0] = 4096;
			this.anIntArrayArray11[11][1] = 3116;
			this.anIntArrayArray11[12][1] = 3806;
			this.anIntArrayArray11[13][1] = 3437;
			this.anIntArrayArray11[14][1] = 3116;
			this.anIntArrayArray11[10][3] = 3276;
			this.anIntArrayArray11[11][3] = 3228;
			this.anIntArrayArray11[12][3] = 3196;
			this.anIntArrayArray11[13][3] = 3019;
			this.anIntArrayArray11[15][1] = 2377;
			this.anIntArrayArray11[14][3] = 3228;
			this.anIntArrayArray11[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray11 = new int[4][4];
			this.anIntArrayArray11[0][2] = 4096;
			this.anIntArrayArray11[0][0] = 2048;
			this.anIntArrayArray11[0][3] = 0;
			this.anIntArrayArray11[1][3] = 0;
			this.anIntArrayArray11[2][3] = 0;
			this.anIntArrayArray11[1][2] = 4096;
			this.anIntArrayArray11[3][3] = 0;
			this.anIntArrayArray11[0][1] = 0;
			this.anIntArrayArray11[2][2] = 4096;
			this.anIntArrayArray11[1][0] = 2867;
			this.anIntArrayArray11[1][1] = 4096;
			this.anIntArrayArray11[2][0] = 3276;
			this.anIntArrayArray11[3][0] = 4096;
			this.anIntArrayArray11[3][2] = 0;
			this.anIntArrayArray11[2][1] = 4096;
			this.anIntArrayArray11[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(11) int local11 = arg0.method4261();
		if (local11 != 0) {
			this.method1012(local11);
			return;
		}
		this.anIntArrayArray11 = new int[arg0.method4261()][4];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArrayArray11.length; local25++) {
			this.anIntArrayArray11[local25][0] = arg0.method4242();
			this.anIntArrayArray11[local25][1] = arg0.method4261() << 4;
			this.anIntArrayArray11[local25][2] = arg0.method4261() << 4;
			this.anIntArrayArray11[local25][3] = arg0.method4261() << 4;
		}
	}
}
