import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class11_Sub2_Sub7 extends Class11_Sub2 {

	@OriginalMember(owner = "client!dl", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!dl", name = "E", descriptor = "[I")
	private final int[] anIntArray68 = new int[257];

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V")
	private void method889() {
		@Pc(13) int local13 = this.anIntArrayArray3.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local27 < local13 && this.anIntArrayArray3[local27][0] <= local25; local27++) {
				local21++;
			}
			@Pc(64) int local64;
			@Pc(56) int local56;
			@Pc(60) int local60;
			@Pc(52) int[] local52;
			if (local13 <= local21) {
				local52 = this.anIntArrayArray3[local13 - 1];
				local56 = local52[2];
				local60 = local52[3];
				local64 = local52[1];
			} else {
				local52 = this.anIntArrayArray3[local21];
				if (local21 > 0) {
					@Pc(80) int[] local80 = this.anIntArrayArray3[local21 - 1];
					@Pc(97) int local97 = (local25 - local80[0] << 12) / (local52[0] - local80[0]);
					@Pc(101) int local101 = 4096 - local97;
					local56 = local97 * local52[2] + local101 * local80[2] >> 12;
					local64 = local52[1] * local97 + local101 * local80[1] >> 12;
					local60 = local52[3] * local97 + local101 * local80[3] >> 12;
				} else {
					local56 = local52[2];
					local60 = local52[3];
					local64 = local52[1];
				}
			}
			local60 >>= 0x4;
			local56 >>= 0x4;
			local64 >>= 0x4;
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			if (local56 < 0) {
				local56 = 0;
			} else if (local56 > 255) {
				local56 = 255;
			}
			this.anIntArray68[local17] = local60 | local56 << 8 | local64 << 16;
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)V")
	private void method890(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray3 = new int[2][4];
			this.anIntArrayArray3[0][0] = 0;
			this.anIntArrayArray3[0][2] = 0;
			this.anIntArrayArray3[0][3] = 0;
			this.anIntArrayArray3[0][1] = 0;
			this.anIntArrayArray3[1][0] = 4096;
			this.anIntArrayArray3[1][2] = 4096;
			this.anIntArrayArray3[1][1] = 4096;
			this.anIntArrayArray3[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray3 = new int[8][4];
			this.anIntArrayArray3[0][1] = 2650;
			this.anIntArrayArray3[0][3] = 2361;
			this.anIntArrayArray3[0][2] = 2602;
			this.anIntArrayArray3[0][0] = 0;
			this.anIntArrayArray3[1][1] = 2313;
			this.anIntArrayArray3[1][0] = 2867;
			this.anIntArrayArray3[1][2] = 1799;
			this.anIntArrayArray3[1][3] = 1558;
			this.anIntArrayArray3[2][3] = 1413;
			this.anIntArrayArray3[2][2] = 1734;
			this.anIntArrayArray3[2][0] = 3072;
			this.anIntArrayArray3[2][1] = 2618;
			this.anIntArrayArray3[3][3] = 947;
			this.anIntArrayArray3[3][0] = 3276;
			this.anIntArrayArray3[3][1] = 2296;
			this.anIntArrayArray3[3][2] = 1220;
			this.anIntArrayArray3[4][3] = 722;
			this.anIntArrayArray3[4][0] = 3481;
			this.anIntArrayArray3[4][2] = 963;
			this.anIntArrayArray3[4][1] = 2072;
			this.anIntArrayArray3[5][1] = 2730;
			this.anIntArrayArray3[5][2] = 2152;
			this.anIntArrayArray3[5][3] = 1766;
			this.anIntArrayArray3[5][0] = 3686;
			this.anIntArrayArray3[6][3] = 915;
			this.anIntArrayArray3[6][2] = 1060;
			this.anIntArrayArray3[6][0] = 3891;
			this.anIntArrayArray3[6][1] = 2232;
			this.anIntArrayArray3[7][3] = 1140;
			this.anIntArrayArray3[7][1] = 1686;
			this.anIntArrayArray3[7][0] = 4096;
			this.anIntArrayArray3[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray3 = new int[7][4];
			this.anIntArrayArray3[0][3] = 4096;
			this.anIntArrayArray3[0][2] = 0;
			this.anIntArrayArray3[0][0] = 0;
			this.anIntArrayArray3[0][1] = 0;
			this.anIntArrayArray3[1][3] = 4096;
			this.anIntArrayArray3[1][2] = 4096;
			this.anIntArrayArray3[1][0] = 663;
			this.anIntArrayArray3[1][1] = 0;
			this.anIntArrayArray3[2][2] = 4096;
			this.anIntArrayArray3[2][3] = 0;
			this.anIntArrayArray3[2][0] = 1363;
			this.anIntArrayArray3[2][1] = 0;
			this.anIntArrayArray3[3][0] = 2048;
			this.anIntArrayArray3[3][2] = 4096;
			this.anIntArrayArray3[3][3] = 0;
			this.anIntArrayArray3[3][1] = 4096;
			this.anIntArrayArray3[4][2] = 0;
			this.anIntArrayArray3[4][3] = 0;
			this.anIntArrayArray3[4][0] = 2727;
			this.anIntArrayArray3[4][1] = 4096;
			this.anIntArrayArray3[5][3] = 4096;
			this.anIntArrayArray3[5][2] = 0;
			this.anIntArrayArray3[5][1] = 4096;
			this.anIntArrayArray3[5][0] = 3411;
			this.anIntArrayArray3[6][0] = 4096;
			this.anIntArrayArray3[6][2] = 0;
			this.anIntArrayArray3[6][1] = 0;
			this.anIntArrayArray3[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray3 = new int[6][4];
			this.anIntArrayArray3[0][3] = 0;
			this.anIntArrayArray3[0][0] = 0;
			this.anIntArrayArray3[0][2] = 0;
			this.anIntArrayArray3[0][1] = 0;
			this.anIntArrayArray3[1][3] = 1493;
			this.anIntArrayArray3[1][1] = 0;
			this.anIntArrayArray3[1][2] = 0;
			this.anIntArrayArray3[1][0] = 1843;
			this.anIntArrayArray3[2][2] = 0;
			this.anIntArrayArray3[2][0] = 2457;
			this.anIntArrayArray3[2][1] = 0;
			this.anIntArrayArray3[2][3] = 2939;
			this.anIntArrayArray3[3][2] = 1124;
			this.anIntArrayArray3[3][0] = 2781;
			this.anIntArrayArray3[3][1] = 0;
			this.anIntArrayArray3[3][3] = 3565;
			this.anIntArrayArray3[4][1] = 546;
			this.anIntArrayArray3[4][2] = 3084;
			this.anIntArrayArray3[4][3] = 4031;
			this.anIntArrayArray3[4][0] = 3481;
			this.anIntArrayArray3[5][0] = 4096;
			this.anIntArrayArray3[5][1] = 4096;
			this.anIntArrayArray3[5][3] = 4096;
			this.anIntArrayArray3[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray3 = new int[16][4];
			this.anIntArrayArray3[0][2] = 192;
			this.anIntArrayArray3[0][1] = 80;
			this.anIntArrayArray3[0][0] = 0;
			this.anIntArrayArray3[0][3] = 321;
			this.anIntArrayArray3[1][0] = 155;
			this.anIntArrayArray3[1][3] = 562;
			this.anIntArrayArray3[1][2] = 449;
			this.anIntArrayArray3[1][1] = 321;
			this.anIntArrayArray3[2][1] = 578;
			this.anIntArrayArray3[2][0] = 389;
			this.anIntArrayArray3[2][3] = 803;
			this.anIntArrayArray3[2][2] = 690;
			this.anIntArrayArray3[3][3] = 1140;
			this.anIntArrayArray3[3][1] = 947;
			this.anIntArrayArray3[3][0] = 671;
			this.anIntArrayArray3[3][2] = 995;
			this.anIntArrayArray3[4][0] = 897;
			this.anIntArrayArray3[4][2] = 1397;
			this.anIntArrayArray3[4][3] = 1509;
			this.anIntArrayArray3[4][1] = 1285;
			this.anIntArrayArray3[5][2] = 1429;
			this.anIntArrayArray3[5][1] = 1525;
			this.anIntArrayArray3[5][3] = 1413;
			this.anIntArrayArray3[5][0] = 1175;
			this.anIntArrayArray3[6][0] = 1368;
			this.anIntArrayArray3[6][3] = 1333;
			this.anIntArrayArray3[6][1] = 1734;
			this.anIntArrayArray3[6][2] = 1461;
			this.anIntArrayArray3[7][3] = 1702;
			this.anIntArrayArray3[7][1] = 1413;
			this.anIntArrayArray3[7][0] = 1507;
			this.anIntArrayArray3[7][2] = 1525;
			this.anIntArrayArray3[8][3] = 2056;
			this.anIntArrayArray3[8][2] = 1590;
			this.anIntArrayArray3[8][1] = 1108;
			this.anIntArrayArray3[8][0] = 1736;
			this.anIntArrayArray3[9][2] = 2056;
			this.anIntArrayArray3[9][3] = 2666;
			this.anIntArrayArray3[9][1] = 1766;
			this.anIntArrayArray3[9][0] = 2088;
			this.anIntArrayArray3[10][3] = 3276;
			this.anIntArrayArray3[10][2] = 2586;
			this.anIntArrayArray3[10][0] = 2355;
			this.anIntArrayArray3[10][1] = 2409;
			this.anIntArrayArray3[11][2] = 3148;
			this.anIntArrayArray3[11][1] = 3116;
			this.anIntArrayArray3[11][3] = 3228;
			this.anIntArrayArray3[11][0] = 2691;
			this.anIntArrayArray3[12][3] = 3196;
			this.anIntArrayArray3[12][1] = 3806;
			this.anIntArrayArray3[12][0] = 3031;
			this.anIntArrayArray3[12][2] = 3710;
			this.anIntArrayArray3[13][0] = 3522;
			this.anIntArrayArray3[13][2] = 3421;
			this.anIntArrayArray3[13][3] = 3019;
			this.anIntArrayArray3[13][1] = 3437;
			this.anIntArrayArray3[14][2] = 3148;
			this.anIntArrayArray3[14][3] = 3228;
			this.anIntArrayArray3[14][1] = 3116;
			this.anIntArrayArray3[14][0] = 3727;
			this.anIntArrayArray3[15][0] = 4096;
			this.anIntArrayArray3[15][2] = 2505;
			this.anIntArrayArray3[15][3] = 2746;
			this.anIntArrayArray3[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray3 = new int[4][4];
			this.anIntArrayArray3[0][1] = 0;
			this.anIntArrayArray3[0][0] = 2048;
			this.anIntArrayArray3[0][2] = 4096;
			this.anIntArrayArray3[0][3] = 0;
			this.anIntArrayArray3[1][0] = 2867;
			this.anIntArrayArray3[1][2] = 4096;
			this.anIntArrayArray3[1][1] = 4096;
			this.anIntArrayArray3[1][3] = 0;
			this.anIntArrayArray3[2][1] = 4096;
			this.anIntArrayArray3[2][2] = 4096;
			this.anIntArrayArray3[2][0] = 3276;
			this.anIntArrayArray3[2][3] = 0;
			this.anIntArrayArray3[3][2] = 0;
			this.anIntArrayArray3[3][3] = 0;
			this.anIntArrayArray3[3][1] = 4096;
			this.anIntArrayArray3[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(27) int[] local27 = this.method5710(0, arg0);
			@Pc(31) int[] local31 = local17[0];
			@Pc(35) int[] local35 = local17[1];
			@Pc(39) int[] local39 = local17[2];
			for (@Pc(41) int local41 = 0; local41 < Static339.anInt6549; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray68[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
		if (this.anIntArrayArray3 == null) {
			this.method890(1);
		}
		this.method889();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(20) int local20 = arg0.method5185();
		if (local20 != 0) {
			this.method890(local20);
			return;
		}
		this.anIntArrayArray3 = new int[arg0.method5185()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray3.length; local31++) {
			this.anIntArrayArray3[local31][0] = arg0.method5187();
			this.anIntArrayArray3[local31][1] = arg0.method5185() << 4;
			this.anIntArrayArray3[local31][2] = arg0.method5185() << 4;
			this.anIntArrayArray3[local31][3] = arg0.method5185() << 4;
		}
	}
}
