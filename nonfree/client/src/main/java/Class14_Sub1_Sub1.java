import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class14_Sub1_Sub1 extends Class14_Sub1 {

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "[I")
	private final int[] anIntArray16 = new int[257];

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	private void method126() {
		@Pc(15) int local15 = this.anIntArrayArray5.length;
		if (local15 <= 0) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 257; local19++) {
			@Pc(23) int local23 = 0;
			@Pc(27) int local27 = local19 << 4;
			for (@Pc(29) int local29 = 0; local15 > local29 && this.anIntArrayArray5[local29][0] <= local27; local29++) {
				local23++;
			}
			@Pc(70) int local70;
			@Pc(74) int local74;
			@Pc(66) int local66;
			@Pc(62) int[] local62;
			if (local15 <= local23) {
				local62 = this.anIntArrayArray5[local15 - 1];
				local66 = local62[3];
				local70 = local62[1];
				local74 = local62[2];
			} else {
				local62 = this.anIntArrayArray5[local23];
				if (local23 <= 0) {
					local74 = local62[2];
					local70 = local62[1];
					local66 = local62[3];
				} else {
					@Pc(104) int[] local104 = this.anIntArrayArray5[local23 - 1];
					@Pc(121) int local121 = (local27 - local104[0] << 12) / (local62[0] - local104[0]);
					@Pc(125) int local125 = 4096 - local121;
					local70 = local121 * local62[1] + local125 * local104[1] >> 12;
					local74 = local125 * local104[2] + local121 * local62[2] >> 12;
					local66 = local121 * local62[3] + local104[3] * local125 >> 12;
				}
			}
			local66 >>= 0x4;
			local74 >>= 0x4;
			local70 >>= 0x4;
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 > 255) {
				local74 = 255;
			}
			if (local66 < 0) {
				local66 = 0;
			} else if (local66 > 255) {
				local66 = 255;
			}
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 255) {
				local70 = 255;
			}
			this.anIntArray16[local19] = local66 | local70 << 16 | local74 << 8;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(26) int[] local26 = this.method8897(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static371.anInt6835; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray16[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)V")
	private void method129(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray5 = new int[2][4];
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[0][2] = 0;
			this.anIntArrayArray5[0][3] = 0;
			this.anIntArrayArray5[1][3] = 4096;
			this.anIntArrayArray5[1][1] = 4096;
			this.anIntArrayArray5[1][0] = 4096;
			this.anIntArrayArray5[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray5 = new int[8][4];
			this.anIntArrayArray5[0][3] = 2361;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][2] = 2602;
			this.anIntArrayArray5[0][1] = 2650;
			this.anIntArrayArray5[1][0] = 2867;
			this.anIntArrayArray5[1][3] = 1558;
			this.anIntArrayArray5[1][2] = 1799;
			this.anIntArrayArray5[1][1] = 2313;
			this.anIntArrayArray5[2][3] = 1413;
			this.anIntArrayArray5[2][0] = 3072;
			this.anIntArrayArray5[2][2] = 1734;
			this.anIntArrayArray5[2][1] = 2618;
			this.anIntArrayArray5[3][1] = 2296;
			this.anIntArrayArray5[3][2] = 1220;
			this.anIntArrayArray5[3][3] = 947;
			this.anIntArrayArray5[3][0] = 3276;
			this.anIntArrayArray5[4][3] = 722;
			this.anIntArrayArray5[4][1] = 2072;
			this.anIntArrayArray5[4][0] = 3481;
			this.anIntArrayArray5[4][2] = 963;
			this.anIntArrayArray5[5][2] = 2152;
			this.anIntArrayArray5[5][1] = 2730;
			this.anIntArrayArray5[5][3] = 1766;
			this.anIntArrayArray5[5][0] = 3686;
			this.anIntArrayArray5[6][2] = 1060;
			this.anIntArrayArray5[6][1] = 2232;
			this.anIntArrayArray5[6][0] = 3891;
			this.anIntArrayArray5[6][3] = 915;
			this.anIntArrayArray5[7][2] = 1413;
			this.anIntArrayArray5[7][0] = 4096;
			this.anIntArrayArray5[7][1] = 1686;
			this.anIntArrayArray5[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray5 = new int[7][4];
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][2] = 0;
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[0][3] = 4096;
			this.anIntArrayArray5[1][2] = 4096;
			this.anIntArrayArray5[1][3] = 4096;
			this.anIntArrayArray5[1][1] = 0;
			this.anIntArrayArray5[1][0] = 663;
			this.anIntArrayArray5[2][3] = 0;
			this.anIntArrayArray5[2][1] = 0;
			this.anIntArrayArray5[2][0] = 1363;
			this.anIntArrayArray5[2][2] = 4096;
			this.anIntArrayArray5[3][1] = 4096;
			this.anIntArrayArray5[3][2] = 4096;
			this.anIntArrayArray5[3][0] = 2048;
			this.anIntArrayArray5[3][3] = 0;
			this.anIntArrayArray5[4][0] = 2727;
			this.anIntArrayArray5[4][2] = 0;
			this.anIntArrayArray5[4][1] = 4096;
			this.anIntArrayArray5[4][3] = 0;
			this.anIntArrayArray5[5][3] = 4096;
			this.anIntArrayArray5[5][1] = 4096;
			this.anIntArrayArray5[5][0] = 3411;
			this.anIntArrayArray5[5][2] = 0;
			this.anIntArrayArray5[6][2] = 0;
			this.anIntArrayArray5[6][0] = 4096;
			this.anIntArrayArray5[6][1] = 0;
			this.anIntArrayArray5[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray5 = new int[6][4];
			this.anIntArrayArray5[0][2] = 0;
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][3] = 0;
			this.anIntArrayArray5[1][3] = 1493;
			this.anIntArrayArray5[1][1] = 0;
			this.anIntArrayArray5[1][2] = 0;
			this.anIntArrayArray5[1][0] = 1843;
			this.anIntArrayArray5[2][1] = 0;
			this.anIntArrayArray5[2][2] = 0;
			this.anIntArrayArray5[2][0] = 2457;
			this.anIntArrayArray5[2][3] = 2939;
			this.anIntArrayArray5[3][1] = 0;
			this.anIntArrayArray5[3][0] = 2781;
			this.anIntArrayArray5[3][2] = 1124;
			this.anIntArrayArray5[3][3] = 3565;
			this.anIntArrayArray5[4][0] = 3481;
			this.anIntArrayArray5[4][1] = 546;
			this.anIntArrayArray5[4][3] = 4031;
			this.anIntArrayArray5[4][2] = 3084;
			this.anIntArrayArray5[5][2] = 4096;
			this.anIntArrayArray5[5][1] = 4096;
			this.anIntArrayArray5[5][3] = 4096;
			this.anIntArrayArray5[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray5 = new int[16][4];
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][3] = 321;
			this.anIntArrayArray5[0][2] = 192;
			this.anIntArrayArray5[0][1] = 80;
			this.anIntArrayArray5[1][3] = 562;
			this.anIntArrayArray5[1][0] = 155;
			this.anIntArrayArray5[1][2] = 449;
			this.anIntArrayArray5[1][1] = 321;
			this.anIntArrayArray5[2][2] = 690;
			this.anIntArrayArray5[2][3] = 803;
			this.anIntArrayArray5[2][1] = 578;
			this.anIntArrayArray5[2][0] = 389;
			this.anIntArrayArray5[3][0] = 671;
			this.anIntArrayArray5[3][2] = 995;
			this.anIntArrayArray5[3][3] = 1140;
			this.anIntArrayArray5[3][1] = 947;
			this.anIntArrayArray5[4][2] = 1397;
			this.anIntArrayArray5[4][3] = 1509;
			this.anIntArrayArray5[4][0] = 897;
			this.anIntArrayArray5[4][1] = 1285;
			this.anIntArrayArray5[5][0] = 1175;
			this.anIntArrayArray5[5][2] = 1429;
			this.anIntArrayArray5[5][3] = 1413;
			this.anIntArrayArray5[5][1] = 1525;
			this.anIntArrayArray5[6][0] = 1368;
			this.anIntArrayArray5[6][3] = 1333;
			this.anIntArrayArray5[6][2] = 1461;
			this.anIntArrayArray5[6][1] = 1734;
			this.anIntArrayArray5[7][3] = 1702;
			this.anIntArrayArray5[7][0] = 1507;
			this.anIntArrayArray5[7][2] = 1525;
			this.anIntArrayArray5[7][1] = 1413;
			this.anIntArrayArray5[8][1] = 1108;
			this.anIntArrayArray5[8][2] = 1590;
			this.anIntArrayArray5[8][0] = 1736;
			this.anIntArrayArray5[8][3] = 2056;
			this.anIntArrayArray5[9][3] = 2666;
			this.anIntArrayArray5[9][2] = 2056;
			this.anIntArrayArray5[9][1] = 1766;
			this.anIntArrayArray5[9][0] = 2088;
			this.anIntArrayArray5[10][2] = 2586;
			this.anIntArrayArray5[10][1] = 2409;
			this.anIntArrayArray5[10][3] = 3276;
			this.anIntArrayArray5[10][0] = 2355;
			this.anIntArrayArray5[11][2] = 3148;
			this.anIntArrayArray5[11][3] = 3228;
			this.anIntArrayArray5[11][0] = 2691;
			this.anIntArrayArray5[11][1] = 3116;
			this.anIntArrayArray5[12][1] = 3806;
			this.anIntArrayArray5[12][2] = 3710;
			this.anIntArrayArray5[12][3] = 3196;
			this.anIntArrayArray5[12][0] = 3031;
			this.anIntArrayArray5[13][2] = 3421;
			this.anIntArrayArray5[13][1] = 3437;
			this.anIntArrayArray5[13][3] = 3019;
			this.anIntArrayArray5[13][0] = 3522;
			this.anIntArrayArray5[14][1] = 3116;
			this.anIntArrayArray5[14][0] = 3727;
			this.anIntArrayArray5[14][3] = 3228;
			this.anIntArrayArray5[14][2] = 3148;
			this.anIntArrayArray5[15][1] = 2377;
			this.anIntArrayArray5[15][2] = 2505;
			this.anIntArrayArray5[15][3] = 2746;
			this.anIntArrayArray5[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray5 = new int[4][4];
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[0][2] = 4096;
			this.anIntArrayArray5[0][3] = 0;
			this.anIntArrayArray5[0][0] = 2048;
			this.anIntArrayArray5[1][3] = 0;
			this.anIntArrayArray5[1][2] = 4096;
			this.anIntArrayArray5[1][1] = 4096;
			this.anIntArrayArray5[1][0] = 2867;
			this.anIntArrayArray5[2][1] = 4096;
			this.anIntArrayArray5[2][2] = 4096;
			this.anIntArrayArray5[2][0] = 3276;
			this.anIntArrayArray5[2][3] = 0;
			this.anIntArrayArray5[3][3] = 0;
			this.anIntArrayArray5[3][1] = 4096;
			this.anIntArrayArray5[3][2] = 0;
			this.anIntArrayArray5[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(11) int local11 = arg0.method5866();
		if (local11 != 0) {
			this.method129(local11);
			return;
		}
		this.anIntArrayArray5 = new int[arg0.method5866()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray5.length; local31++) {
			this.anIntArrayArray5[local31][0] = arg0.method5900();
			this.anIntArrayArray5[local31][1] = arg0.method5866() << 4;
			this.anIntArrayArray5[local31][2] = arg0.method5866() << 4;
			this.anIntArrayArray5[local31][3] = arg0.method5866() << 4;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
		if (this.anIntArrayArray5 == null) {
			this.method129(1);
		}
		this.method126();
	}
}
