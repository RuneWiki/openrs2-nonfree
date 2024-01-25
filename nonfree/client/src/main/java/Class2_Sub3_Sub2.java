import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!aw", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!aw", name = "S", descriptor = "[I")
	private final int[] anIntArray36 = new int[257];

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(7) int local7 = arg0.method8383();
		if (local7 != 0) {
			this.method683(local7);
			return;
		}
		this.anIntArrayArray3 = new int[arg0.method8383()][4];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray3.length; local29++) {
			this.anIntArrayArray3[local29][0] = arg0.method8326();
			this.anIntArrayArray3[local29][1] = arg0.method8383() << 4;
			this.anIntArrayArray3[local29][2] = arg0.method8383() << 4;
			this.anIntArrayArray3[local29][3] = arg0.method8383() << 4;
		}
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(23) int[] local23 = this.method9156(arg0, 0);
			@Pc(27) int[] local27 = local13[0];
			@Pc(31) int[] local31 = local13[1];
			@Pc(35) int[] local35 = local13[2];
			for (@Pc(37) int local37 = 0; local37 < Static222.anInt4971; local37++) {
				@Pc(45) int local45 = local23[local37] >> 4;
				if (local45 < 0) {
					local45 = 0;
				}
				if (local45 > 256) {
					local45 = 256;
				}
				local45 = this.anIntArray36[local45];
				local27[local37] = local45 >> 12 & 0xFF0;
				local31[local37] = local45 >> 4 & 0xFF0;
				local35[local37] = (local45 & 0xFF) << 4;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
		if (this.anIntArrayArray3 == null) {
			this.method683(1);
		}
		this.method684();
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(II)V")
	private void method683(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray3 = new int[2][4];
			this.anIntArrayArray3[0][1] = 0;
			this.anIntArrayArray3[0][2] = 0;
			this.anIntArrayArray3[0][0] = 0;
			this.anIntArrayArray3[0][3] = 0;
			this.anIntArrayArray3[1][3] = 4096;
			this.anIntArrayArray3[1][2] = 4096;
			this.anIntArrayArray3[1][1] = 4096;
			this.anIntArrayArray3[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray3 = new int[8][4];
			this.anIntArrayArray3[0][3] = 2361;
			this.anIntArrayArray3[0][1] = 2650;
			this.anIntArrayArray3[0][0] = 0;
			this.anIntArrayArray3[0][2] = 2602;
			this.anIntArrayArray3[1][2] = 1799;
			this.anIntArrayArray3[1][1] = 2313;
			this.anIntArrayArray3[1][3] = 1558;
			this.anIntArrayArray3[1][0] = 2867;
			this.anIntArrayArray3[2][2] = 1734;
			this.anIntArrayArray3[2][1] = 2618;
			this.anIntArrayArray3[2][3] = 1413;
			this.anIntArrayArray3[2][0] = 3072;
			this.anIntArrayArray3[3][2] = 1220;
			this.anIntArrayArray3[3][0] = 3276;
			this.anIntArrayArray3[3][3] = 947;
			this.anIntArrayArray3[3][1] = 2296;
			this.anIntArrayArray3[4][2] = 963;
			this.anIntArrayArray3[4][3] = 722;
			this.anIntArrayArray3[4][0] = 3481;
			this.anIntArrayArray3[4][1] = 2072;
			this.anIntArrayArray3[5][3] = 1766;
			this.anIntArrayArray3[5][2] = 2152;
			this.anIntArrayArray3[5][0] = 3686;
			this.anIntArrayArray3[5][1] = 2730;
			this.anIntArrayArray3[6][2] = 1060;
			this.anIntArrayArray3[6][0] = 3891;
			this.anIntArrayArray3[6][1] = 2232;
			this.anIntArrayArray3[6][3] = 915;
			this.anIntArrayArray3[7][2] = 1413;
			this.anIntArrayArray3[7][3] = 1140;
			this.anIntArrayArray3[7][1] = 1686;
			this.anIntArrayArray3[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray3 = new int[7][4];
			this.anIntArrayArray3[0][0] = 0;
			this.anIntArrayArray3[0][1] = 0;
			this.anIntArrayArray3[0][2] = 0;
			this.anIntArrayArray3[0][3] = 4096;
			this.anIntArrayArray3[1][3] = 4096;
			this.anIntArrayArray3[1][1] = 0;
			this.anIntArrayArray3[1][0] = 663;
			this.anIntArrayArray3[1][2] = 4096;
			this.anIntArrayArray3[2][0] = 1363;
			this.anIntArrayArray3[2][2] = 4096;
			this.anIntArrayArray3[2][1] = 0;
			this.anIntArrayArray3[2][3] = 0;
			this.anIntArrayArray3[3][0] = 2048;
			this.anIntArrayArray3[3][2] = 4096;
			this.anIntArrayArray3[3][3] = 0;
			this.anIntArrayArray3[3][1] = 4096;
			this.anIntArrayArray3[4][0] = 2727;
			this.anIntArrayArray3[4][1] = 4096;
			this.anIntArrayArray3[4][2] = 0;
			this.anIntArrayArray3[4][3] = 0;
			this.anIntArrayArray3[5][0] = 3411;
			this.anIntArrayArray3[5][3] = 4096;
			this.anIntArrayArray3[5][2] = 0;
			this.anIntArrayArray3[5][1] = 4096;
			this.anIntArrayArray3[6][2] = 0;
			this.anIntArrayArray3[6][3] = 4096;
			this.anIntArrayArray3[6][0] = 4096;
			this.anIntArrayArray3[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray3 = new int[6][4];
			this.anIntArrayArray3[0][2] = 0;
			this.anIntArrayArray3[0][1] = 0;
			this.anIntArrayArray3[0][3] = 0;
			this.anIntArrayArray3[0][0] = 0;
			this.anIntArrayArray3[1][3] = 1493;
			this.anIntArrayArray3[1][1] = 0;
			this.anIntArrayArray3[1][2] = 0;
			this.anIntArrayArray3[1][0] = 1843;
			this.anIntArrayArray3[2][3] = 2939;
			this.anIntArrayArray3[2][2] = 0;
			this.anIntArrayArray3[2][1] = 0;
			this.anIntArrayArray3[2][0] = 2457;
			this.anIntArrayArray3[3][3] = 3565;
			this.anIntArrayArray3[3][1] = 0;
			this.anIntArrayArray3[3][2] = 1124;
			this.anIntArrayArray3[3][0] = 2781;
			this.anIntArrayArray3[4][2] = 3084;
			this.anIntArrayArray3[4][0] = 3481;
			this.anIntArrayArray3[4][1] = 546;
			this.anIntArrayArray3[4][3] = 4031;
			this.anIntArrayArray3[5][0] = 4096;
			this.anIntArrayArray3[5][3] = 4096;
			this.anIntArrayArray3[5][2] = 4096;
			this.anIntArrayArray3[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray3 = new int[16][4];
			this.anIntArrayArray3[0][0] = 0;
			this.anIntArrayArray3[0][3] = 321;
			this.anIntArrayArray3[0][2] = 192;
			this.anIntArrayArray3[0][1] = 80;
			this.anIntArrayArray3[1][0] = 155;
			this.anIntArrayArray3[1][2] = 449;
			this.anIntArrayArray3[1][3] = 562;
			this.anIntArrayArray3[1][1] = 321;
			this.anIntArrayArray3[2][0] = 389;
			this.anIntArrayArray3[2][3] = 803;
			this.anIntArrayArray3[2][1] = 578;
			this.anIntArrayArray3[2][2] = 690;
			this.anIntArrayArray3[3][1] = 947;
			this.anIntArrayArray3[3][3] = 1140;
			this.anIntArrayArray3[3][0] = 671;
			this.anIntArrayArray3[3][2] = 995;
			this.anIntArrayArray3[4][1] = 1285;
			this.anIntArrayArray3[4][3] = 1509;
			this.anIntArrayArray3[4][2] = 1397;
			this.anIntArrayArray3[4][0] = 897;
			this.anIntArrayArray3[5][2] = 1429;
			this.anIntArrayArray3[5][3] = 1413;
			this.anIntArrayArray3[5][0] = 1175;
			this.anIntArrayArray3[5][1] = 1525;
			this.anIntArrayArray3[6][0] = 1368;
			this.anIntArrayArray3[6][2] = 1461;
			this.anIntArrayArray3[6][1] = 1734;
			this.anIntArrayArray3[6][3] = 1333;
			this.anIntArrayArray3[7][2] = 1525;
			this.anIntArrayArray3[7][1] = 1413;
			this.anIntArrayArray3[7][0] = 1507;
			this.anIntArrayArray3[7][3] = 1702;
			this.anIntArrayArray3[8][3] = 2056;
			this.anIntArrayArray3[8][1] = 1108;
			this.anIntArrayArray3[8][2] = 1590;
			this.anIntArrayArray3[8][0] = 1736;
			this.anIntArrayArray3[9][2] = 2056;
			this.anIntArrayArray3[9][3] = 2666;
			this.anIntArrayArray3[9][0] = 2088;
			this.anIntArrayArray3[9][1] = 1766;
			this.anIntArrayArray3[10][0] = 2355;
			this.anIntArrayArray3[10][2] = 2586;
			this.anIntArrayArray3[10][1] = 2409;
			this.anIntArrayArray3[10][3] = 3276;
			this.anIntArrayArray3[11][2] = 3148;
			this.anIntArrayArray3[11][3] = 3228;
			this.anIntArrayArray3[11][1] = 3116;
			this.anIntArrayArray3[11][0] = 2691;
			this.anIntArrayArray3[12][3] = 3196;
			this.anIntArrayArray3[12][0] = 3031;
			this.anIntArrayArray3[12][1] = 3806;
			this.anIntArrayArray3[12][2] = 3710;
			this.anIntArrayArray3[13][3] = 3019;
			this.anIntArrayArray3[13][1] = 3437;
			this.anIntArrayArray3[13][2] = 3421;
			this.anIntArrayArray3[13][0] = 3522;
			this.anIntArrayArray3[14][1] = 3116;
			this.anIntArrayArray3[14][2] = 3148;
			this.anIntArrayArray3[14][3] = 3228;
			this.anIntArrayArray3[14][0] = 3727;
			this.anIntArrayArray3[15][2] = 2505;
			this.anIntArrayArray3[15][3] = 2746;
			this.anIntArrayArray3[15][1] = 2377;
			this.anIntArrayArray3[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray3 = new int[4][4];
			this.anIntArrayArray3[0][1] = 0;
			this.anIntArrayArray3[0][2] = 4096;
			this.anIntArrayArray3[0][3] = 0;
			this.anIntArrayArray3[0][0] = 2048;
			this.anIntArrayArray3[1][0] = 2867;
			this.anIntArrayArray3[1][3] = 0;
			this.anIntArrayArray3[1][1] = 4096;
			this.anIntArrayArray3[1][2] = 4096;
			this.anIntArrayArray3[2][0] = 3276;
			this.anIntArrayArray3[2][1] = 4096;
			this.anIntArrayArray3[2][3] = 0;
			this.anIntArrayArray3[2][2] = 4096;
			this.anIntArrayArray3[3][0] = 4096;
			this.anIntArrayArray3[3][2] = 0;
			this.anIntArrayArray3[3][1] = 4096;
			this.anIntArrayArray3[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "(I)V")
	private void method684() {
		@Pc(15) int local15 = this.anIntArrayArray3.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < 257; local22++) {
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = local22 << 4;
			for (@Pc(32) int local32 = 0; local32 < local15 && this.anIntArrayArray3[local32][0] <= local30; local32++) {
				local26++;
			}
			@Pc(61) int local61;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(57) int[] local57;
			if (local26 >= local15) {
				local57 = this.anIntArrayArray3[local15 - 1];
				local61 = local57[1];
				local65 = local57[2];
				local69 = local57[3];
			} else {
				local57 = this.anIntArrayArray3[local26];
				if (local26 <= 0) {
					local61 = local57[1];
					local69 = local57[3];
					local65 = local57[2];
				} else {
					@Pc(102) int[] local102 = this.anIntArrayArray3[local26 - 1];
					@Pc(119) int local119 = (local30 - local102[0] << 12) / (local57[0] - local102[0]);
					@Pc(124) int local124 = 4096 - local119;
					local61 = local102[1] * local124 + local57[1] * local119 >> 12;
					local69 = local119 * local57[3] + local124 * local102[3] >> 12;
					local65 = local102[2] * local124 + local57[2] * local119 >> 12;
				}
			}
			local65 >>= 0x4;
			local61 >>= 0x4;
			local69 >>= 0x4;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
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
			this.anIntArray36[local22] = local69 | local61 << 16 | local65 << 8;
		}
	}
}
