import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class2_Sub6_Sub17 extends Class2_Sub6 {

	@OriginalMember(owner = "client!mc", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "[I")
	private final int[] anIntArray367 = new int[257];

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
		if (this.anIntArrayArray28 == null) {
			this.method4571(1);
		}
		this.method4570();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(16) int local16 = arg1.method8547();
		if (local16 != 0) {
			this.method4571(local16);
			return;
		}
		this.anIntArrayArray28 = new int[arg1.method8547()][4];
		for (@Pc(35) int local35 = 0; local35 < this.anIntArrayArray28.length; local35++) {
			this.anIntArrayArray28[local35][0] = arg1.method8546();
			this.anIntArrayArray28[local35][1] = arg1.method8547() << 4;
			this.anIntArrayArray28[local35][2] = arg1.method8547() << 4;
			this.anIntArrayArray28[local35][3] = arg1.method8547() << 4;
		}
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V")
	private void method4570() {
		@Pc(9) int local9 = this.anIntArrayArray28.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 257; local16++) {
			@Pc(20) int local20 = 0;
			@Pc(24) int local24 = local16 << 4;
			for (@Pc(26) int local26 = 0; local26 < local9 && this.anIntArrayArray28[local26][0] <= local24; local26++) {
				local20++;
			}
			@Pc(70) int local70;
			@Pc(62) int local62;
			@Pc(66) int local66;
			@Pc(53) int[] local53;
			if (local9 > local20) {
				local53 = this.anIntArrayArray28[local20];
				if (local20 <= 0) {
					local62 = local53[2];
					local66 = local53[3];
					local70 = local53[1];
				} else {
					@Pc(79) int[] local79 = this.anIntArrayArray28[local20 - 1];
					@Pc(97) int local97 = (local24 - local79[0] << 12) / (local53[0] - local79[0]);
					@Pc(101) int local101 = 4096 - local97;
					local70 = local101 * local79[1] + local97 * local53[1] >> 12;
					local62 = local97 * local53[2] + local101 * local79[2] >> 12;
					local66 = local97 * local53[3] + local79[3] * local101 >> 12;
				}
			} else {
				local53 = this.anIntArrayArray28[local9 - 1];
				local70 = local53[1];
				local66 = local53[3];
				local62 = local53[2];
			}
			local66 >>= 0x4;
			local62 >>= 0x4;
			local70 >>= 0x4;
			if (local62 < 0) {
				local62 = 0;
			} else if (local62 > 255) {
				local62 = 255;
			}
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 255) {
				local70 = 255;
			}
			if (local66 < 0) {
				local66 = 0;
			} else if (local66 > 255) {
				local66 = 255;
			}
			this.anIntArray367[local16] = local70 << 16 | local62 << 8 | local66;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(23) int[] local23 = this.method8461(0, arg0);
			@Pc(27) int[] local27 = local13[0];
			@Pc(31) int[] local31 = local13[1];
			@Pc(35) int[] local35 = local13[2];
			for (@Pc(37) int local37 = 0; local37 < Static51.anInt1085; local37++) {
				@Pc(45) int local45 = local23[local37] >> 4;
				if (local45 < 0) {
					local45 = 0;
				}
				if (local45 > 256) {
					local45 = 256;
				}
				local45 = this.anIntArray367[local45];
				local27[local37] = local45 >> 12 & 0xFF0;
				local31[local37] = local45 >> 4 & 0xFF0;
				local35[local37] = (local45 & 0xFF) << 4;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V")
	private void method4571(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray28 = new int[2][4];
			this.anIntArrayArray28[0][3] = 0;
			this.anIntArrayArray28[0][2] = 0;
			this.anIntArrayArray28[0][1] = 0;
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[1][0] = 4096;
			this.anIntArrayArray28[1][2] = 4096;
			this.anIntArrayArray28[1][1] = 4096;
			this.anIntArrayArray28[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray28 = new int[8][4];
			this.anIntArrayArray28[0][3] = 2361;
			this.anIntArrayArray28[0][2] = 2602;
			this.anIntArrayArray28[0][1] = 2650;
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[1][0] = 2867;
			this.anIntArrayArray28[1][3] = 1558;
			this.anIntArrayArray28[1][2] = 1799;
			this.anIntArrayArray28[1][1] = 2313;
			this.anIntArrayArray28[2][1] = 2618;
			this.anIntArrayArray28[2][0] = 3072;
			this.anIntArrayArray28[2][2] = 1734;
			this.anIntArrayArray28[2][3] = 1413;
			this.anIntArrayArray28[3][1] = 2296;
			this.anIntArrayArray28[3][3] = 947;
			this.anIntArrayArray28[3][2] = 1220;
			this.anIntArrayArray28[3][0] = 3276;
			this.anIntArrayArray28[4][2] = 963;
			this.anIntArrayArray28[4][3] = 722;
			this.anIntArrayArray28[4][0] = 3481;
			this.anIntArrayArray28[4][1] = 2072;
			this.anIntArrayArray28[5][0] = 3686;
			this.anIntArrayArray28[5][2] = 2152;
			this.anIntArrayArray28[5][1] = 2730;
			this.anIntArrayArray28[5][3] = 1766;
			this.anIntArrayArray28[6][1] = 2232;
			this.anIntArrayArray28[6][0] = 3891;
			this.anIntArrayArray28[6][2] = 1060;
			this.anIntArrayArray28[6][3] = 915;
			this.anIntArrayArray28[7][0] = 4096;
			this.anIntArrayArray28[7][2] = 1413;
			this.anIntArrayArray28[7][1] = 1686;
			this.anIntArrayArray28[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray28 = new int[7][4];
			this.anIntArrayArray28[0][3] = 4096;
			this.anIntArrayArray28[0][1] = 0;
			this.anIntArrayArray28[0][2] = 0;
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[1][0] = 663;
			this.anIntArrayArray28[1][2] = 4096;
			this.anIntArrayArray28[1][1] = 0;
			this.anIntArrayArray28[1][3] = 4096;
			this.anIntArrayArray28[2][2] = 4096;
			this.anIntArrayArray28[2][1] = 0;
			this.anIntArrayArray28[2][0] = 1363;
			this.anIntArrayArray28[2][3] = 0;
			this.anIntArrayArray28[3][2] = 4096;
			this.anIntArrayArray28[3][1] = 4096;
			this.anIntArrayArray28[3][0] = 2048;
			this.anIntArrayArray28[3][3] = 0;
			this.anIntArrayArray28[4][0] = 2727;
			this.anIntArrayArray28[4][3] = 0;
			this.anIntArrayArray28[4][2] = 0;
			this.anIntArrayArray28[4][1] = 4096;
			this.anIntArrayArray28[5][3] = 4096;
			this.anIntArrayArray28[5][2] = 0;
			this.anIntArrayArray28[5][1] = 4096;
			this.anIntArrayArray28[5][0] = 3411;
			this.anIntArrayArray28[6][2] = 0;
			this.anIntArrayArray28[6][1] = 0;
			this.anIntArrayArray28[6][0] = 4096;
			this.anIntArrayArray28[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray28 = new int[6][4];
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[0][1] = 0;
			this.anIntArrayArray28[0][3] = 0;
			this.anIntArrayArray28[0][2] = 0;
			this.anIntArrayArray28[1][0] = 1843;
			this.anIntArrayArray28[1][1] = 0;
			this.anIntArrayArray28[1][2] = 0;
			this.anIntArrayArray28[1][3] = 1493;
			this.anIntArrayArray28[2][0] = 2457;
			this.anIntArrayArray28[2][2] = 0;
			this.anIntArrayArray28[2][3] = 2939;
			this.anIntArrayArray28[2][1] = 0;
			this.anIntArrayArray28[3][3] = 3565;
			this.anIntArrayArray28[3][2] = 1124;
			this.anIntArrayArray28[3][1] = 0;
			this.anIntArrayArray28[3][0] = 2781;
			this.anIntArrayArray28[4][3] = 4031;
			this.anIntArrayArray28[4][0] = 3481;
			this.anIntArrayArray28[4][2] = 3084;
			this.anIntArrayArray28[4][1] = 546;
			this.anIntArrayArray28[5][0] = 4096;
			this.anIntArrayArray28[5][1] = 4096;
			this.anIntArrayArray28[5][3] = 4096;
			this.anIntArrayArray28[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray28 = new int[16][4];
			this.anIntArrayArray28[0][2] = 192;
			this.anIntArrayArray28[0][1] = 80;
			this.anIntArrayArray28[0][0] = 0;
			this.anIntArrayArray28[0][3] = 321;
			this.anIntArrayArray28[1][3] = 562;
			this.anIntArrayArray28[1][0] = 155;
			this.anIntArrayArray28[1][2] = 449;
			this.anIntArrayArray28[1][1] = 321;
			this.anIntArrayArray28[2][0] = 389;
			this.anIntArrayArray28[2][3] = 803;
			this.anIntArrayArray28[2][1] = 578;
			this.anIntArrayArray28[2][2] = 690;
			this.anIntArrayArray28[3][1] = 947;
			this.anIntArrayArray28[3][0] = 671;
			this.anIntArrayArray28[3][3] = 1140;
			this.anIntArrayArray28[3][2] = 995;
			this.anIntArrayArray28[4][2] = 1397;
			this.anIntArrayArray28[4][0] = 897;
			this.anIntArrayArray28[4][1] = 1285;
			this.anIntArrayArray28[4][3] = 1509;
			this.anIntArrayArray28[5][2] = 1429;
			this.anIntArrayArray28[5][1] = 1525;
			this.anIntArrayArray28[5][3] = 1413;
			this.anIntArrayArray28[5][0] = 1175;
			this.anIntArrayArray28[6][1] = 1734;
			this.anIntArrayArray28[6][2] = 1461;
			this.anIntArrayArray28[6][3] = 1333;
			this.anIntArrayArray28[6][0] = 1368;
			this.anIntArrayArray28[7][0] = 1507;
			this.anIntArrayArray28[7][3] = 1702;
			this.anIntArrayArray28[7][2] = 1525;
			this.anIntArrayArray28[7][1] = 1413;
			this.anIntArrayArray28[8][2] = 1590;
			this.anIntArrayArray28[8][0] = 1736;
			this.anIntArrayArray28[8][1] = 1108;
			this.anIntArrayArray28[8][3] = 2056;
			this.anIntArrayArray28[9][3] = 2666;
			this.anIntArrayArray28[9][0] = 2088;
			this.anIntArrayArray28[9][2] = 2056;
			this.anIntArrayArray28[9][1] = 1766;
			this.anIntArrayArray28[10][0] = 2355;
			this.anIntArrayArray28[10][3] = 3276;
			this.anIntArrayArray28[10][2] = 2586;
			this.anIntArrayArray28[10][1] = 2409;
			this.anIntArrayArray28[11][0] = 2691;
			this.anIntArrayArray28[11][1] = 3116;
			this.anIntArrayArray28[11][2] = 3148;
			this.anIntArrayArray28[11][3] = 3228;
			this.anIntArrayArray28[12][3] = 3196;
			this.anIntArrayArray28[12][2] = 3710;
			this.anIntArrayArray28[12][1] = 3806;
			this.anIntArrayArray28[12][0] = 3031;
			this.anIntArrayArray28[13][0] = 3522;
			this.anIntArrayArray28[13][3] = 3019;
			this.anIntArrayArray28[13][2] = 3421;
			this.anIntArrayArray28[13][1] = 3437;
			this.anIntArrayArray28[14][3] = 3228;
			this.anIntArrayArray28[14][2] = 3148;
			this.anIntArrayArray28[14][0] = 3727;
			this.anIntArrayArray28[14][1] = 3116;
			this.anIntArrayArray28[15][1] = 2377;
			this.anIntArrayArray28[15][2] = 2505;
			this.anIntArrayArray28[15][0] = 4096;
			this.anIntArrayArray28[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray28 = new int[4][4];
			this.anIntArrayArray28[0][2] = 4096;
			this.anIntArrayArray28[0][1] = 0;
			this.anIntArrayArray28[0][0] = 2048;
			this.anIntArrayArray28[0][3] = 0;
			this.anIntArrayArray28[1][2] = 4096;
			this.anIntArrayArray28[1][1] = 4096;
			this.anIntArrayArray28[1][0] = 2867;
			this.anIntArrayArray28[1][3] = 0;
			this.anIntArrayArray28[2][2] = 4096;
			this.anIntArrayArray28[2][0] = 3276;
			this.anIntArrayArray28[2][1] = 4096;
			this.anIntArrayArray28[2][3] = 0;
			this.anIntArrayArray28[3][2] = 0;
			this.anIntArrayArray28[3][0] = 4096;
			this.anIntArrayArray28[3][1] = 4096;
			this.anIntArrayArray28[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
