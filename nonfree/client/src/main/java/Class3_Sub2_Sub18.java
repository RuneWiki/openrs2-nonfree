import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class3_Sub2_Sub18 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lca", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!lca", name = "z", descriptor = "[I")
	private final int[] anIntArray390 = new int[257];

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(17) int local17 = arg0.method4888();
		if (local17 != 0) {
			this.method5107(local17);
			return;
		}
		this.anIntArrayArray65 = new int[arg0.method4888()][4];
		for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray65.length; local33++) {
			this.anIntArrayArray65[local33][0] = arg0.method4858();
			this.anIntArrayArray65[local33][1] = arg0.method4888() << 4;
			this.anIntArrayArray65[local33][2] = arg0.method4888() << 4;
			this.anIntArrayArray65[local33][3] = arg0.method4888() << 4;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
		if (this.anIntArrayArray65 == null) {
			this.method5107(1);
		}
		this.method5104();
	}

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "(B)V")
	private void method5104() {
		@Pc(16) int local16 = this.anIntArrayArray65.length;
		if (local16 <= 0) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < 257; local23++) {
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = local23 << 4;
			for (@Pc(33) int local33 = 0; local16 > local33 && this.anIntArrayArray65[local33][0] <= local31; local33++) {
				local27++;
			}
			@Pc(70) int local70;
			@Pc(74) int local74;
			@Pc(78) int local78;
			@Pc(66) int[] local66;
			if (local16 <= local27) {
				local66 = this.anIntArrayArray65[local16 - 1];
				local70 = local66[1];
				local74 = local66[2];
				local78 = local66[3];
			} else {
				local66 = this.anIntArrayArray65[local27];
				if (local27 > 0) {
					@Pc(94) int[] local94 = this.anIntArrayArray65[local27 - 1];
					@Pc(110) int local110 = (local31 - local94[0] << 12) / (local66[0] - local94[0]);
					@Pc(114) int local114 = 4096 - local110;
					local78 = local94[3] * local114 + local110 * local66[3] >> 12;
					local70 = local110 * local66[1] + local114 * local94[1] >> 12;
					local74 = local94[2] * local114 + local110 * local66[2] >> 12;
				} else {
					local78 = local66[3];
					local74 = local66[2];
					local70 = local66[1];
				}
			}
			local74 >>= 0x4;
			local78 >>= 0x4;
			local70 >>= 0x4;
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 255) {
				local70 = 255;
			}
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 > 255) {
				local74 = 255;
			}
			if (local78 < 0) {
				local78 = 0;
			} else if (local78 > 255) {
				local78 = 255;
			}
			this.anIntArray390[local23] = local70 << 16 | local74 << 8 | local78;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(26) int[] local26 = this.method8716(0, arg0);
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local11[2];
			for (@Pc(40) int local40 = 0; local40 < Static30.anInt908; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray390[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(IB)V")
	private void method5107(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray65 = new int[2][4];
			this.anIntArrayArray65[0][2] = 0;
			this.anIntArrayArray65[0][3] = 0;
			this.anIntArrayArray65[0][1] = 0;
			this.anIntArrayArray65[0][0] = 0;
			this.anIntArrayArray65[1][3] = 4096;
			this.anIntArrayArray65[1][1] = 4096;
			this.anIntArrayArray65[1][2] = 4096;
			this.anIntArrayArray65[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray65 = new int[8][4];
			this.anIntArrayArray65[0][3] = 2361;
			this.anIntArrayArray65[0][0] = 0;
			this.anIntArrayArray65[0][1] = 2650;
			this.anIntArrayArray65[0][2] = 2602;
			this.anIntArrayArray65[1][2] = 1799;
			this.anIntArrayArray65[1][0] = 2867;
			this.anIntArrayArray65[1][1] = 2313;
			this.anIntArrayArray65[1][3] = 1558;
			this.anIntArrayArray65[2][0] = 3072;
			this.anIntArrayArray65[2][3] = 1413;
			this.anIntArrayArray65[2][2] = 1734;
			this.anIntArrayArray65[2][1] = 2618;
			this.anIntArrayArray65[3][2] = 1220;
			this.anIntArrayArray65[3][0] = 3276;
			this.anIntArrayArray65[3][3] = 947;
			this.anIntArrayArray65[3][1] = 2296;
			this.anIntArrayArray65[4][1] = 2072;
			this.anIntArrayArray65[4][0] = 3481;
			this.anIntArrayArray65[4][3] = 722;
			this.anIntArrayArray65[4][2] = 963;
			this.anIntArrayArray65[5][2] = 2152;
			this.anIntArrayArray65[5][1] = 2730;
			this.anIntArrayArray65[5][3] = 1766;
			this.anIntArrayArray65[5][0] = 3686;
			this.anIntArrayArray65[6][2] = 1060;
			this.anIntArrayArray65[6][3] = 915;
			this.anIntArrayArray65[6][0] = 3891;
			this.anIntArrayArray65[6][1] = 2232;
			this.anIntArrayArray65[7][1] = 1686;
			this.anIntArrayArray65[7][3] = 1140;
			this.anIntArrayArray65[7][0] = 4096;
			this.anIntArrayArray65[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray65 = new int[7][4];
			this.anIntArrayArray65[0][2] = 0;
			this.anIntArrayArray65[0][1] = 0;
			this.anIntArrayArray65[0][3] = 4096;
			this.anIntArrayArray65[0][0] = 0;
			this.anIntArrayArray65[1][2] = 4096;
			this.anIntArrayArray65[1][1] = 0;
			this.anIntArrayArray65[1][0] = 663;
			this.anIntArrayArray65[1][3] = 4096;
			this.anIntArrayArray65[2][2] = 4096;
			this.anIntArrayArray65[2][1] = 0;
			this.anIntArrayArray65[2][3] = 0;
			this.anIntArrayArray65[2][0] = 1363;
			this.anIntArrayArray65[3][1] = 4096;
			this.anIntArrayArray65[3][2] = 4096;
			this.anIntArrayArray65[3][3] = 0;
			this.anIntArrayArray65[3][0] = 2048;
			this.anIntArrayArray65[4][0] = 2727;
			this.anIntArrayArray65[4][2] = 0;
			this.anIntArrayArray65[4][1] = 4096;
			this.anIntArrayArray65[4][3] = 0;
			this.anIntArrayArray65[5][1] = 4096;
			this.anIntArrayArray65[5][0] = 3411;
			this.anIntArrayArray65[5][2] = 0;
			this.anIntArrayArray65[5][3] = 4096;
			this.anIntArrayArray65[6][3] = 4096;
			this.anIntArrayArray65[6][2] = 0;
			this.anIntArrayArray65[6][1] = 0;
			this.anIntArrayArray65[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray65 = new int[6][4];
			this.anIntArrayArray65[0][0] = 0;
			this.anIntArrayArray65[0][1] = 0;
			this.anIntArrayArray65[0][3] = 0;
			this.anIntArrayArray65[0][2] = 0;
			this.anIntArrayArray65[1][1] = 0;
			this.anIntArrayArray65[1][2] = 0;
			this.anIntArrayArray65[1][0] = 1843;
			this.anIntArrayArray65[1][3] = 1493;
			this.anIntArrayArray65[2][0] = 2457;
			this.anIntArrayArray65[2][1] = 0;
			this.anIntArrayArray65[2][2] = 0;
			this.anIntArrayArray65[2][3] = 2939;
			this.anIntArrayArray65[3][0] = 2781;
			this.anIntArrayArray65[3][1] = 0;
			this.anIntArrayArray65[3][2] = 1124;
			this.anIntArrayArray65[3][3] = 3565;
			this.anIntArrayArray65[4][1] = 546;
			this.anIntArrayArray65[4][3] = 4031;
			this.anIntArrayArray65[4][2] = 3084;
			this.anIntArrayArray65[4][0] = 3481;
			this.anIntArrayArray65[5][1] = 4096;
			this.anIntArrayArray65[5][0] = 4096;
			this.anIntArrayArray65[5][3] = 4096;
			this.anIntArrayArray65[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray65 = new int[16][4];
			this.anIntArrayArray65[0][3] = 321;
			this.anIntArrayArray65[0][2] = 192;
			this.anIntArrayArray65[0][1] = 80;
			this.anIntArrayArray65[0][0] = 0;
			this.anIntArrayArray65[1][1] = 321;
			this.anIntArrayArray65[1][2] = 449;
			this.anIntArrayArray65[1][0] = 155;
			this.anIntArrayArray65[1][3] = 562;
			this.anIntArrayArray65[2][0] = 389;
			this.anIntArrayArray65[2][2] = 690;
			this.anIntArrayArray65[2][3] = 803;
			this.anIntArrayArray65[2][1] = 578;
			this.anIntArrayArray65[3][0] = 671;
			this.anIntArrayArray65[3][3] = 1140;
			this.anIntArrayArray65[3][1] = 947;
			this.anIntArrayArray65[3][2] = 995;
			this.anIntArrayArray65[4][2] = 1397;
			this.anIntArrayArray65[4][1] = 1285;
			this.anIntArrayArray65[4][3] = 1509;
			this.anIntArrayArray65[4][0] = 897;
			this.anIntArrayArray65[5][2] = 1429;
			this.anIntArrayArray65[5][0] = 1175;
			this.anIntArrayArray65[5][3] = 1413;
			this.anIntArrayArray65[5][1] = 1525;
			this.anIntArrayArray65[6][2] = 1461;
			this.anIntArrayArray65[6][0] = 1368;
			this.anIntArrayArray65[6][1] = 1734;
			this.anIntArrayArray65[6][3] = 1333;
			this.anIntArrayArray65[7][2] = 1525;
			this.anIntArrayArray65[7][3] = 1702;
			this.anIntArrayArray65[7][1] = 1413;
			this.anIntArrayArray65[7][0] = 1507;
			this.anIntArrayArray65[8][0] = 1736;
			this.anIntArrayArray65[8][2] = 1590;
			this.anIntArrayArray65[8][3] = 2056;
			this.anIntArrayArray65[8][1] = 1108;
			this.anIntArrayArray65[9][0] = 2088;
			this.anIntArrayArray65[9][3] = 2666;
			this.anIntArrayArray65[9][1] = 1766;
			this.anIntArrayArray65[9][2] = 2056;
			this.anIntArrayArray65[10][1] = 2409;
			this.anIntArrayArray65[10][0] = 2355;
			this.anIntArrayArray65[10][2] = 2586;
			this.anIntArrayArray65[10][3] = 3276;
			this.anIntArrayArray65[11][0] = 2691;
			this.anIntArrayArray65[11][1] = 3116;
			this.anIntArrayArray65[11][2] = 3148;
			this.anIntArrayArray65[11][3] = 3228;
			this.anIntArrayArray65[12][2] = 3710;
			this.anIntArrayArray65[12][0] = 3031;
			this.anIntArrayArray65[12][1] = 3806;
			this.anIntArrayArray65[12][3] = 3196;
			this.anIntArrayArray65[13][2] = 3421;
			this.anIntArrayArray65[13][3] = 3019;
			this.anIntArrayArray65[13][1] = 3437;
			this.anIntArrayArray65[13][0] = 3522;
			this.anIntArrayArray65[14][1] = 3116;
			this.anIntArrayArray65[14][3] = 3228;
			this.anIntArrayArray65[14][0] = 3727;
			this.anIntArrayArray65[14][2] = 3148;
			this.anIntArrayArray65[15][2] = 2505;
			this.anIntArrayArray65[15][1] = 2377;
			this.anIntArrayArray65[15][0] = 4096;
			this.anIntArrayArray65[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray65 = new int[4][4];
			this.anIntArrayArray65[0][2] = 4096;
			this.anIntArrayArray65[0][3] = 0;
			this.anIntArrayArray65[0][0] = 2048;
			this.anIntArrayArray65[0][1] = 0;
			this.anIntArrayArray65[1][1] = 4096;
			this.anIntArrayArray65[1][3] = 0;
			this.anIntArrayArray65[1][2] = 4096;
			this.anIntArrayArray65[1][0] = 2867;
			this.anIntArrayArray65[2][1] = 4096;
			this.anIntArrayArray65[2][0] = 3276;
			this.anIntArrayArray65[2][3] = 0;
			this.anIntArrayArray65[2][2] = 4096;
			this.anIntArrayArray65[3][3] = 0;
			this.anIntArrayArray65[3][2] = 0;
			this.anIntArrayArray65[3][0] = 4096;
			this.anIntArrayArray65[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
