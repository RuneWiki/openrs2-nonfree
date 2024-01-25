import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!bg", name = "N", descriptor = "[I")
	private final int[] anIntArray12 = new int[257];

	static {
		new Class174("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(10) int local10 = arg0.method4096();
		if (local10 != 0) {
			this.method469(local10);
			return;
		}
		this.anIntArrayArray1 = new int[arg0.method4096()][4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArrayArray1.length; local30++) {
			this.anIntArrayArray1[local30][0] = arg0.method4083();
			this.anIntArrayArray1[local30][1] = arg0.method4096() << 4;
			this.anIntArrayArray1[local30][2] = arg0.method4096() << 4;
			this.anIntArrayArray1[local30][3] = arg0.method4096() << 4;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(29) int[] local29 = this.method6139(0, arg0);
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			for (@Pc(43) int local43 = 0; local43 < Static148.anInt2687; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray12[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
		if (this.anIntArrayArray1 == null) {
			this.method469(1);
		}
		this.method470();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	private void method469(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray1 = new int[2][4];
			this.anIntArrayArray1[0][3] = 0;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[0][2] = 0;
			this.anIntArrayArray1[1][3] = 4096;
			this.anIntArrayArray1[1][0] = 4096;
			this.anIntArrayArray1[1][1] = 4096;
			this.anIntArrayArray1[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray1 = new int[8][4];
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[0][3] = 2361;
			this.anIntArrayArray1[0][1] = 2650;
			this.anIntArrayArray1[0][2] = 2602;
			this.anIntArrayArray1[1][1] = 2313;
			this.anIntArrayArray1[1][3] = 1558;
			this.anIntArrayArray1[1][2] = 1799;
			this.anIntArrayArray1[1][0] = 2867;
			this.anIntArrayArray1[2][2] = 1734;
			this.anIntArrayArray1[2][1] = 2618;
			this.anIntArrayArray1[2][3] = 1413;
			this.anIntArrayArray1[2][0] = 3072;
			this.anIntArrayArray1[3][3] = 947;
			this.anIntArrayArray1[3][1] = 2296;
			this.anIntArrayArray1[3][2] = 1220;
			this.anIntArrayArray1[3][0] = 3276;
			this.anIntArrayArray1[4][2] = 963;
			this.anIntArrayArray1[4][3] = 722;
			this.anIntArrayArray1[4][1] = 2072;
			this.anIntArrayArray1[4][0] = 3481;
			this.anIntArrayArray1[5][2] = 2152;
			this.anIntArrayArray1[5][1] = 2730;
			this.anIntArrayArray1[5][0] = 3686;
			this.anIntArrayArray1[5][3] = 1766;
			this.anIntArrayArray1[6][2] = 1060;
			this.anIntArrayArray1[6][3] = 915;
			this.anIntArrayArray1[6][0] = 3891;
			this.anIntArrayArray1[6][1] = 2232;
			this.anIntArrayArray1[7][2] = 1413;
			this.anIntArrayArray1[7][0] = 4096;
			this.anIntArrayArray1[7][1] = 1686;
			this.anIntArrayArray1[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray1 = new int[7][4];
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[0][3] = 4096;
			this.anIntArrayArray1[0][2] = 0;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[1][1] = 0;
			this.anIntArrayArray1[1][2] = 4096;
			this.anIntArrayArray1[1][3] = 4096;
			this.anIntArrayArray1[1][0] = 663;
			this.anIntArrayArray1[2][3] = 0;
			this.anIntArrayArray1[2][0] = 1363;
			this.anIntArrayArray1[2][1] = 0;
			this.anIntArrayArray1[2][2] = 4096;
			this.anIntArrayArray1[3][1] = 4096;
			this.anIntArrayArray1[3][0] = 2048;
			this.anIntArrayArray1[3][3] = 0;
			this.anIntArrayArray1[3][2] = 4096;
			this.anIntArrayArray1[4][3] = 0;
			this.anIntArrayArray1[4][2] = 0;
			this.anIntArrayArray1[4][1] = 4096;
			this.anIntArrayArray1[4][0] = 2727;
			this.anIntArrayArray1[5][2] = 0;
			this.anIntArrayArray1[5][0] = 3411;
			this.anIntArrayArray1[5][1] = 4096;
			this.anIntArrayArray1[5][3] = 4096;
			this.anIntArrayArray1[6][1] = 0;
			this.anIntArrayArray1[6][2] = 0;
			this.anIntArrayArray1[6][0] = 4096;
			this.anIntArrayArray1[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray1 = new int[6][4];
			this.anIntArrayArray1[0][2] = 0;
			this.anIntArrayArray1[0][3] = 0;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[1][2] = 0;
			this.anIntArrayArray1[1][3] = 1493;
			this.anIntArrayArray1[1][1] = 0;
			this.anIntArrayArray1[1][0] = 1843;
			this.anIntArrayArray1[2][0] = 2457;
			this.anIntArrayArray1[2][1] = 0;
			this.anIntArrayArray1[2][2] = 0;
			this.anIntArrayArray1[2][3] = 2939;
			this.anIntArrayArray1[3][2] = 1124;
			this.anIntArrayArray1[3][3] = 3565;
			this.anIntArrayArray1[3][1] = 0;
			this.anIntArrayArray1[3][0] = 2781;
			this.anIntArrayArray1[4][3] = 4031;
			this.anIntArrayArray1[4][2] = 3084;
			this.anIntArrayArray1[4][1] = 546;
			this.anIntArrayArray1[4][0] = 3481;
			this.anIntArrayArray1[5][2] = 4096;
			this.anIntArrayArray1[5][1] = 4096;
			this.anIntArrayArray1[5][3] = 4096;
			this.anIntArrayArray1[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray1 = new int[16][4];
			this.anIntArrayArray1[0][1] = 80;
			this.anIntArrayArray1[0][3] = 321;
			this.anIntArrayArray1[0][2] = 192;
			this.anIntArrayArray1[0][0] = 0;
			this.anIntArrayArray1[1][2] = 449;
			this.anIntArrayArray1[1][1] = 321;
			this.anIntArrayArray1[1][3] = 562;
			this.anIntArrayArray1[1][0] = 155;
			this.anIntArrayArray1[2][2] = 690;
			this.anIntArrayArray1[2][1] = 578;
			this.anIntArrayArray1[2][0] = 389;
			this.anIntArrayArray1[2][3] = 803;
			this.anIntArrayArray1[3][3] = 1140;
			this.anIntArrayArray1[3][1] = 947;
			this.anIntArrayArray1[3][0] = 671;
			this.anIntArrayArray1[3][2] = 995;
			this.anIntArrayArray1[4][2] = 1397;
			this.anIntArrayArray1[4][0] = 897;
			this.anIntArrayArray1[4][3] = 1509;
			this.anIntArrayArray1[4][1] = 1285;
			this.anIntArrayArray1[5][2] = 1429;
			this.anIntArrayArray1[5][3] = 1413;
			this.anIntArrayArray1[5][0] = 1175;
			this.anIntArrayArray1[5][1] = 1525;
			this.anIntArrayArray1[6][3] = 1333;
			this.anIntArrayArray1[6][0] = 1368;
			this.anIntArrayArray1[6][1] = 1734;
			this.anIntArrayArray1[6][2] = 1461;
			this.anIntArrayArray1[7][0] = 1507;
			this.anIntArrayArray1[7][1] = 1413;
			this.anIntArrayArray1[7][3] = 1702;
			this.anIntArrayArray1[7][2] = 1525;
			this.anIntArrayArray1[8][1] = 1108;
			this.anIntArrayArray1[8][2] = 1590;
			this.anIntArrayArray1[8][3] = 2056;
			this.anIntArrayArray1[8][0] = 1736;
			this.anIntArrayArray1[9][1] = 1766;
			this.anIntArrayArray1[9][3] = 2666;
			this.anIntArrayArray1[9][2] = 2056;
			this.anIntArrayArray1[9][0] = 2088;
			this.anIntArrayArray1[10][3] = 3276;
			this.anIntArrayArray1[10][0] = 2355;
			this.anIntArrayArray1[10][2] = 2586;
			this.anIntArrayArray1[10][1] = 2409;
			this.anIntArrayArray1[11][2] = 3148;
			this.anIntArrayArray1[11][1] = 3116;
			this.anIntArrayArray1[11][0] = 2691;
			this.anIntArrayArray1[11][3] = 3228;
			this.anIntArrayArray1[12][0] = 3031;
			this.anIntArrayArray1[12][2] = 3710;
			this.anIntArrayArray1[12][1] = 3806;
			this.anIntArrayArray1[12][3] = 3196;
			this.anIntArrayArray1[13][2] = 3421;
			this.anIntArrayArray1[13][1] = 3437;
			this.anIntArrayArray1[13][3] = 3019;
			this.anIntArrayArray1[13][0] = 3522;
			this.anIntArrayArray1[14][3] = 3228;
			this.anIntArrayArray1[14][1] = 3116;
			this.anIntArrayArray1[14][0] = 3727;
			this.anIntArrayArray1[14][2] = 3148;
			this.anIntArrayArray1[15][2] = 2505;
			this.anIntArrayArray1[15][3] = 2746;
			this.anIntArrayArray1[15][1] = 2377;
			this.anIntArrayArray1[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray1 = new int[4][4];
			this.anIntArrayArray1[0][3] = 0;
			this.anIntArrayArray1[0][1] = 0;
			this.anIntArrayArray1[0][2] = 4096;
			this.anIntArrayArray1[0][0] = 2048;
			this.anIntArrayArray1[1][3] = 0;
			this.anIntArrayArray1[1][2] = 4096;
			this.anIntArrayArray1[1][0] = 2867;
			this.anIntArrayArray1[1][1] = 4096;
			this.anIntArrayArray1[2][0] = 3276;
			this.anIntArrayArray1[2][2] = 4096;
			this.anIntArrayArray1[2][1] = 4096;
			this.anIntArrayArray1[2][3] = 0;
			this.anIntArrayArray1[3][0] = 4096;
			this.anIntArrayArray1[3][1] = 4096;
			this.anIntArrayArray1[3][3] = 0;
			this.anIntArrayArray1[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
	private void method470() {
		@Pc(17) int local17 = this.anIntArrayArray1.length;
		if (local17 <= 0) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < 257; local21++) {
			@Pc(25) int local25 = 0;
			@Pc(29) int local29 = local21 << 4;
			for (@Pc(31) int local31 = 0; local17 > local31 && local29 >= this.anIntArrayArray1[local31][0]; local31++) {
				local25++;
			}
			@Pc(76) int local76;
			@Pc(72) int local72;
			@Pc(68) int local68;
			@Pc(64) int[] local64;
			if (local17 <= local25) {
				local64 = this.anIntArrayArray1[local17 - 1];
				local68 = local64[3];
				local72 = local64[2];
				local76 = local64[1];
			} else {
				local64 = this.anIntArrayArray1[local25];
				if (local25 <= 0) {
					local76 = local64[1];
					local72 = local64[2];
					local68 = local64[3];
				} else {
					@Pc(109) int[] local109 = this.anIntArrayArray1[local25 - 1];
					@Pc(126) int local126 = (local29 - local109[0] << 12) / (local64[0] - local109[0]);
					@Pc(131) int local131 = 4096 - local126;
					local76 = local126 * local64[1] + local131 * local109[1] >> 12;
					local68 = local109[3] * local131 + local126 * local64[3] >> 12;
					local72 = local64[2] * local126 + local131 * local109[2] >> 12;
				}
			}
			local76 >>= 0x4;
			local68 >>= 0x4;
			local72 >>= 0x4;
			if (local72 < 0) {
				local72 = 0;
			} else if (local72 > 255) {
				local72 = 255;
			}
			if (local76 < 0) {
				local76 = 0;
			} else if (local76 > 255) {
				local76 = 255;
			}
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			this.anIntArray12[local21] = local68 | local72 << 8 | local76 << 16;
		}
	}
}
