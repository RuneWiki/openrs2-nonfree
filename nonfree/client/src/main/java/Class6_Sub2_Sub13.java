import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class6_Sub2_Sub13 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "[I")
	private final int[] anIntArray267 = new int[257];

	static {
		new Class231("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V")
	private void method2654() {
		@Pc(9) int local9 = this.anIntArrayArray26.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 257; local19++) {
			@Pc(23) int local23 = 0;
			@Pc(27) int local27 = local19 << 4;
			for (@Pc(29) int local29 = 0; local29 < local9 && this.anIntArrayArray26[local29][0] <= local27; local29++) {
				local23++;
			}
			@Pc(66) int local66;
			@Pc(62) int local62;
			@Pc(70) int local70;
			@Pc(58) int[] local58;
			if (local9 <= local23) {
				local58 = this.anIntArrayArray26[local9 - 1];
				local62 = local58[2];
				local66 = local58[1];
				local70 = local58[3];
			} else {
				local58 = this.anIntArrayArray26[local23];
				if (local23 <= 0) {
					local66 = local58[1];
					local70 = local58[3];
					local62 = local58[2];
				} else {
					@Pc(100) int[] local100 = this.anIntArrayArray26[local23 - 1];
					@Pc(117) int local117 = (local27 - local100[0] << 12) / (local58[0] - local100[0]);
					@Pc(121) int local121 = 4096 - local117;
					local66 = local117 * local58[1] + local100[1] * local121 >> 12;
					local62 = local58[2] * local117 + local121 * local100[2] >> 12;
					local70 = local100[3] * local121 + local117 * local58[3] >> 12;
				}
			}
			local62 >>= 0x4;
			local70 >>= 0x4;
			local66 >>= 0x4;
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
			if (local62 < 0) {
				local62 = 0;
			} else if (local62 > 255) {
				local62 = 255;
			}
			this.anIntArray267[local19] = local66 << 16 | local62 << 8 | local70;
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
		if (this.anIntArrayArray26 == null) {
			this.method2656(1);
		}
		this.method2654();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(21) int[] local21 = this.method5858(0, arg0);
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static185.anInt4925; local35++) {
				@Pc(43) int local43 = local21[local35] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local43 = this.anIntArray267[local43];
				local25[local35] = local43 >> 12 & 0xFF0;
				local29[local35] = local43 >> 4 & 0xFF0;
				local33[local35] = (local43 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)V")
	private void method2656(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray26 = new int[2][4];
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[1][3] = 4096;
			this.anIntArrayArray26[1][1] = 4096;
			this.anIntArrayArray26[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray26 = new int[8][4];
			this.anIntArrayArray26[0][3] = 2361;
			this.anIntArrayArray26[0][2] = 2602;
			this.anIntArrayArray26[0][1] = 2650;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][1] = 2313;
			this.anIntArrayArray26[1][3] = 1558;
			this.anIntArrayArray26[1][2] = 1799;
			this.anIntArrayArray26[1][0] = 2867;
			this.anIntArrayArray26[2][0] = 3072;
			this.anIntArrayArray26[2][2] = 1734;
			this.anIntArrayArray26[2][3] = 1413;
			this.anIntArrayArray26[2][1] = 2618;
			this.anIntArrayArray26[3][1] = 2296;
			this.anIntArrayArray26[3][3] = 947;
			this.anIntArrayArray26[3][2] = 1220;
			this.anIntArrayArray26[3][0] = 3276;
			this.anIntArrayArray26[4][1] = 2072;
			this.anIntArrayArray26[4][2] = 963;
			this.anIntArrayArray26[4][0] = 3481;
			this.anIntArrayArray26[4][3] = 722;
			this.anIntArrayArray26[5][0] = 3686;
			this.anIntArrayArray26[5][2] = 2152;
			this.anIntArrayArray26[5][1] = 2730;
			this.anIntArrayArray26[5][3] = 1766;
			this.anIntArrayArray26[6][1] = 2232;
			this.anIntArrayArray26[6][3] = 915;
			this.anIntArrayArray26[6][2] = 1060;
			this.anIntArrayArray26[6][0] = 3891;
			this.anIntArrayArray26[7][3] = 1140;
			this.anIntArrayArray26[7][0] = 4096;
			this.anIntArrayArray26[7][1] = 1686;
			this.anIntArrayArray26[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray26 = new int[7][4];
			this.anIntArrayArray26[0][3] = 4096;
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][0] = 663;
			this.anIntArrayArray26[1][3] = 4096;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[1][1] = 0;
			this.anIntArrayArray26[2][3] = 0;
			this.anIntArrayArray26[2][2] = 4096;
			this.anIntArrayArray26[2][1] = 0;
			this.anIntArrayArray26[2][0] = 1363;
			this.anIntArrayArray26[3][0] = 2048;
			this.anIntArrayArray26[3][3] = 0;
			this.anIntArrayArray26[3][2] = 4096;
			this.anIntArrayArray26[3][1] = 4096;
			this.anIntArrayArray26[4][0] = 2727;
			this.anIntArrayArray26[4][1] = 4096;
			this.anIntArrayArray26[4][3] = 0;
			this.anIntArrayArray26[4][2] = 0;
			this.anIntArrayArray26[5][2] = 0;
			this.anIntArrayArray26[5][1] = 4096;
			this.anIntArrayArray26[5][3] = 4096;
			this.anIntArrayArray26[5][0] = 3411;
			this.anIntArrayArray26[6][1] = 0;
			this.anIntArrayArray26[6][0] = 4096;
			this.anIntArrayArray26[6][3] = 4096;
			this.anIntArrayArray26[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray26 = new int[6][4];
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][1] = 0;
			this.anIntArrayArray26[1][3] = 1493;
			this.anIntArrayArray26[1][0] = 1843;
			this.anIntArrayArray26[1][2] = 0;
			this.anIntArrayArray26[2][2] = 0;
			this.anIntArrayArray26[2][1] = 0;
			this.anIntArrayArray26[2][0] = 2457;
			this.anIntArrayArray26[2][3] = 2939;
			this.anIntArrayArray26[3][2] = 1124;
			this.anIntArrayArray26[3][3] = 3565;
			this.anIntArrayArray26[3][1] = 0;
			this.anIntArrayArray26[3][0] = 2781;
			this.anIntArrayArray26[4][0] = 3481;
			this.anIntArrayArray26[4][2] = 3084;
			this.anIntArrayArray26[4][3] = 4031;
			this.anIntArrayArray26[4][1] = 546;
			this.anIntArrayArray26[5][0] = 4096;
			this.anIntArrayArray26[5][2] = 4096;
			this.anIntArrayArray26[5][1] = 4096;
			this.anIntArrayArray26[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray26 = new int[16][4];
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[0][3] = 321;
			this.anIntArrayArray26[0][2] = 192;
			this.anIntArrayArray26[0][1] = 80;
			this.anIntArrayArray26[1][3] = 562;
			this.anIntArrayArray26[1][0] = 155;
			this.anIntArrayArray26[1][2] = 449;
			this.anIntArrayArray26[1][1] = 321;
			this.anIntArrayArray26[2][1] = 578;
			this.anIntArrayArray26[2][2] = 690;
			this.anIntArrayArray26[2][3] = 803;
			this.anIntArrayArray26[2][0] = 389;
			this.anIntArrayArray26[3][1] = 947;
			this.anIntArrayArray26[3][3] = 1140;
			this.anIntArrayArray26[3][2] = 995;
			this.anIntArrayArray26[3][0] = 671;
			this.anIntArrayArray26[4][3] = 1509;
			this.anIntArrayArray26[4][0] = 897;
			this.anIntArrayArray26[4][2] = 1397;
			this.anIntArrayArray26[4][1] = 1285;
			this.anIntArrayArray26[5][3] = 1413;
			this.anIntArrayArray26[5][2] = 1429;
			this.anIntArrayArray26[5][0] = 1175;
			this.anIntArrayArray26[5][1] = 1525;
			this.anIntArrayArray26[6][0] = 1368;
			this.anIntArrayArray26[6][2] = 1461;
			this.anIntArrayArray26[6][3] = 1333;
			this.anIntArrayArray26[6][1] = 1734;
			this.anIntArrayArray26[7][2] = 1525;
			this.anIntArrayArray26[7][3] = 1702;
			this.anIntArrayArray26[7][0] = 1507;
			this.anIntArrayArray26[7][1] = 1413;
			this.anIntArrayArray26[8][1] = 1108;
			this.anIntArrayArray26[8][3] = 2056;
			this.anIntArrayArray26[8][2] = 1590;
			this.anIntArrayArray26[8][0] = 1736;
			this.anIntArrayArray26[9][1] = 1766;
			this.anIntArrayArray26[9][0] = 2088;
			this.anIntArrayArray26[9][2] = 2056;
			this.anIntArrayArray26[9][3] = 2666;
			this.anIntArrayArray26[10][3] = 3276;
			this.anIntArrayArray26[10][2] = 2586;
			this.anIntArrayArray26[10][1] = 2409;
			this.anIntArrayArray26[10][0] = 2355;
			this.anIntArrayArray26[11][2] = 3148;
			this.anIntArrayArray26[11][1] = 3116;
			this.anIntArrayArray26[11][3] = 3228;
			this.anIntArrayArray26[11][0] = 2691;
			this.anIntArrayArray26[12][3] = 3196;
			this.anIntArrayArray26[12][0] = 3031;
			this.anIntArrayArray26[12][1] = 3806;
			this.anIntArrayArray26[12][2] = 3710;
			this.anIntArrayArray26[13][2] = 3421;
			this.anIntArrayArray26[13][1] = 3437;
			this.anIntArrayArray26[13][0] = 3522;
			this.anIntArrayArray26[13][3] = 3019;
			this.anIntArrayArray26[14][0] = 3727;
			this.anIntArrayArray26[14][2] = 3148;
			this.anIntArrayArray26[14][3] = 3228;
			this.anIntArrayArray26[14][1] = 3116;
			this.anIntArrayArray26[15][3] = 2746;
			this.anIntArrayArray26[15][0] = 4096;
			this.anIntArrayArray26[15][1] = 2377;
			this.anIntArrayArray26[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray26 = new int[4][4];
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[0][0] = 2048;
			this.anIntArrayArray26[0][2] = 4096;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][0] = 2867;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[1][3] = 0;
			this.anIntArrayArray26[1][1] = 4096;
			this.anIntArrayArray26[2][0] = 3276;
			this.anIntArrayArray26[2][3] = 0;
			this.anIntArrayArray26[2][1] = 4096;
			this.anIntArrayArray26[2][2] = 4096;
			this.anIntArrayArray26[3][2] = 0;
			this.anIntArrayArray26[3][1] = 4096;
			this.anIntArrayArray26[3][3] = 0;
			this.anIntArrayArray26[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(17) int local17 = arg0.method3111();
		if (local17 != 0) {
			this.method2656(local17);
			return;
		}
		this.anIntArrayArray26 = new int[arg0.method3111()][4];
		for (@Pc(37) int local37 = 0; local37 < this.anIntArrayArray26.length; local37++) {
			this.anIntArrayArray26[local37][0] = arg0.method3108();
			this.anIntArrayArray26[local37][1] = arg0.method3111() << 4;
			this.anIntArrayArray26[local37][2] = arg0.method3111() << 4;
			this.anIntArrayArray26[local37][3] = arg0.method3111() << 4;
		}
	}
}
