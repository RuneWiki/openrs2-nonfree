import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class2_Sub1_Sub31 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sl", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!sl", name = "L", descriptor = "[I")
	private final int[] anIntArray519 = new int[257];

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)V")
	private void method5213(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray53 = new int[2][4];
			this.anIntArrayArray53[0][2] = 0;
			this.anIntArrayArray53[0][3] = 0;
			this.anIntArrayArray53[0][0] = 0;
			this.anIntArrayArray53[0][1] = 0;
			this.anIntArrayArray53[1][3] = 4096;
			this.anIntArrayArray53[1][1] = 4096;
			this.anIntArrayArray53[1][2] = 4096;
			this.anIntArrayArray53[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray53 = new int[8][4];
			this.anIntArrayArray53[0][1] = 2650;
			this.anIntArrayArray53[0][3] = 2361;
			this.anIntArrayArray53[0][2] = 2602;
			this.anIntArrayArray53[0][0] = 0;
			this.anIntArrayArray53[1][1] = 2313;
			this.anIntArrayArray53[1][0] = 2867;
			this.anIntArrayArray53[1][2] = 1799;
			this.anIntArrayArray53[1][3] = 1558;
			this.anIntArrayArray53[2][0] = 3072;
			this.anIntArrayArray53[2][3] = 1413;
			this.anIntArrayArray53[2][2] = 1734;
			this.anIntArrayArray53[2][1] = 2618;
			this.anIntArrayArray53[3][3] = 947;
			this.anIntArrayArray53[3][1] = 2296;
			this.anIntArrayArray53[3][2] = 1220;
			this.anIntArrayArray53[3][0] = 3276;
			this.anIntArrayArray53[4][0] = 3481;
			this.anIntArrayArray53[4][2] = 963;
			this.anIntArrayArray53[4][3] = 722;
			this.anIntArrayArray53[4][1] = 2072;
			this.anIntArrayArray53[5][0] = 3686;
			this.anIntArrayArray53[5][2] = 2152;
			this.anIntArrayArray53[5][1] = 2730;
			this.anIntArrayArray53[5][3] = 1766;
			this.anIntArrayArray53[6][3] = 915;
			this.anIntArrayArray53[6][1] = 2232;
			this.anIntArrayArray53[6][2] = 1060;
			this.anIntArrayArray53[6][0] = 3891;
			this.anIntArrayArray53[7][3] = 1140;
			this.anIntArrayArray53[7][0] = 4096;
			this.anIntArrayArray53[7][1] = 1686;
			this.anIntArrayArray53[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray53 = new int[7][4];
			this.anIntArrayArray53[0][1] = 0;
			this.anIntArrayArray53[0][0] = 0;
			this.anIntArrayArray53[0][3] = 4096;
			this.anIntArrayArray53[0][2] = 0;
			this.anIntArrayArray53[1][1] = 0;
			this.anIntArrayArray53[1][0] = 663;
			this.anIntArrayArray53[1][2] = 4096;
			this.anIntArrayArray53[1][3] = 4096;
			this.anIntArrayArray53[2][0] = 1363;
			this.anIntArrayArray53[2][3] = 0;
			this.anIntArrayArray53[2][2] = 4096;
			this.anIntArrayArray53[2][1] = 0;
			this.anIntArrayArray53[3][0] = 2048;
			this.anIntArrayArray53[3][2] = 4096;
			this.anIntArrayArray53[3][3] = 0;
			this.anIntArrayArray53[3][1] = 4096;
			this.anIntArrayArray53[4][3] = 0;
			this.anIntArrayArray53[4][0] = 2727;
			this.anIntArrayArray53[4][1] = 4096;
			this.anIntArrayArray53[4][2] = 0;
			this.anIntArrayArray53[5][0] = 3411;
			this.anIntArrayArray53[5][2] = 0;
			this.anIntArrayArray53[5][3] = 4096;
			this.anIntArrayArray53[5][1] = 4096;
			this.anIntArrayArray53[6][1] = 0;
			this.anIntArrayArray53[6][0] = 4096;
			this.anIntArrayArray53[6][2] = 0;
			this.anIntArrayArray53[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray53 = new int[6][4];
			this.anIntArrayArray53[0][3] = 0;
			this.anIntArrayArray53[0][2] = 0;
			this.anIntArrayArray53[0][0] = 0;
			this.anIntArrayArray53[0][1] = 0;
			this.anIntArrayArray53[1][1] = 0;
			this.anIntArrayArray53[1][0] = 1843;
			this.anIntArrayArray53[1][3] = 1493;
			this.anIntArrayArray53[1][2] = 0;
			this.anIntArrayArray53[2][2] = 0;
			this.anIntArrayArray53[2][3] = 2939;
			this.anIntArrayArray53[2][1] = 0;
			this.anIntArrayArray53[2][0] = 2457;
			this.anIntArrayArray53[3][3] = 3565;
			this.anIntArrayArray53[3][1] = 0;
			this.anIntArrayArray53[3][2] = 1124;
			this.anIntArrayArray53[3][0] = 2781;
			this.anIntArrayArray53[4][0] = 3481;
			this.anIntArrayArray53[4][3] = 4031;
			this.anIntArrayArray53[4][2] = 3084;
			this.anIntArrayArray53[4][1] = 546;
			this.anIntArrayArray53[5][3] = 4096;
			this.anIntArrayArray53[5][0] = 4096;
			this.anIntArrayArray53[5][1] = 4096;
			this.anIntArrayArray53[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray53 = new int[16][4];
			this.anIntArrayArray53[0][0] = 0;
			this.anIntArrayArray53[0][3] = 321;
			this.anIntArrayArray53[0][2] = 192;
			this.anIntArrayArray53[0][1] = 80;
			this.anIntArrayArray53[1][1] = 321;
			this.anIntArrayArray53[1][3] = 562;
			this.anIntArrayArray53[1][0] = 155;
			this.anIntArrayArray53[1][2] = 449;
			this.anIntArrayArray53[2][0] = 389;
			this.anIntArrayArray53[2][3] = 803;
			this.anIntArrayArray53[2][1] = 578;
			this.anIntArrayArray53[2][2] = 690;
			this.anIntArrayArray53[3][2] = 995;
			this.anIntArrayArray53[3][3] = 1140;
			this.anIntArrayArray53[3][0] = 671;
			this.anIntArrayArray53[3][1] = 947;
			this.anIntArrayArray53[4][3] = 1509;
			this.anIntArrayArray53[4][2] = 1397;
			this.anIntArrayArray53[4][1] = 1285;
			this.anIntArrayArray53[4][0] = 897;
			this.anIntArrayArray53[5][2] = 1429;
			this.anIntArrayArray53[5][0] = 1175;
			this.anIntArrayArray53[5][1] = 1525;
			this.anIntArrayArray53[5][3] = 1413;
			this.anIntArrayArray53[6][3] = 1333;
			this.anIntArrayArray53[6][1] = 1734;
			this.anIntArrayArray53[6][2] = 1461;
			this.anIntArrayArray53[6][0] = 1368;
			this.anIntArrayArray53[7][0] = 1507;
			this.anIntArrayArray53[7][2] = 1525;
			this.anIntArrayArray53[7][3] = 1702;
			this.anIntArrayArray53[7][1] = 1413;
			this.anIntArrayArray53[8][1] = 1108;
			this.anIntArrayArray53[8][2] = 1590;
			this.anIntArrayArray53[8][3] = 2056;
			this.anIntArrayArray53[8][0] = 1736;
			this.anIntArrayArray53[9][2] = 2056;
			this.anIntArrayArray53[9][3] = 2666;
			this.anIntArrayArray53[9][1] = 1766;
			this.anIntArrayArray53[9][0] = 2088;
			this.anIntArrayArray53[10][3] = 3276;
			this.anIntArrayArray53[10][0] = 2355;
			this.anIntArrayArray53[10][2] = 2586;
			this.anIntArrayArray53[10][1] = 2409;
			this.anIntArrayArray53[11][1] = 3116;
			this.anIntArrayArray53[11][2] = 3148;
			this.anIntArrayArray53[11][0] = 2691;
			this.anIntArrayArray53[11][3] = 3228;
			this.anIntArrayArray53[12][1] = 3806;
			this.anIntArrayArray53[12][2] = 3710;
			this.anIntArrayArray53[12][0] = 3031;
			this.anIntArrayArray53[12][3] = 3196;
			this.anIntArrayArray53[13][3] = 3019;
			this.anIntArrayArray53[13][0] = 3522;
			this.anIntArrayArray53[13][1] = 3437;
			this.anIntArrayArray53[13][2] = 3421;
			this.anIntArrayArray53[14][3] = 3228;
			this.anIntArrayArray53[14][1] = 3116;
			this.anIntArrayArray53[14][0] = 3727;
			this.anIntArrayArray53[14][2] = 3148;
			this.anIntArrayArray53[15][2] = 2505;
			this.anIntArrayArray53[15][1] = 2377;
			this.anIntArrayArray53[15][0] = 4096;
			this.anIntArrayArray53[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray53 = new int[4][4];
			this.anIntArrayArray53[0][3] = 0;
			this.anIntArrayArray53[0][2] = 4096;
			this.anIntArrayArray53[0][0] = 2048;
			this.anIntArrayArray53[0][1] = 0;
			this.anIntArrayArray53[1][2] = 4096;
			this.anIntArrayArray53[1][3] = 0;
			this.anIntArrayArray53[1][0] = 2867;
			this.anIntArrayArray53[1][1] = 4096;
			this.anIntArrayArray53[2][1] = 4096;
			this.anIntArrayArray53[2][3] = 0;
			this.anIntArrayArray53[2][2] = 4096;
			this.anIntArrayArray53[2][0] = 3276;
			this.anIntArrayArray53[3][1] = 4096;
			this.anIntArrayArray53[3][3] = 0;
			this.anIntArrayArray53[3][0] = 4096;
			this.anIntArrayArray53[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
		if (this.anIntArrayArray53 == null) {
			this.method5213(1);
		}
		this.method5215();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(16) int local16 = arg1.method5732();
		if (local16 != 0) {
			this.method5213(local16);
			return;
		}
		this.anIntArrayArray53 = new int[arg1.method5732()][4];
		for (@Pc(35) int local35 = 0; local35 < this.anIntArrayArray53.length; local35++) {
			this.anIntArrayArray53[local35][0] = arg1.method5753();
			this.anIntArrayArray53[local35][1] = arg1.method5732() << 4;
			this.anIntArrayArray53[local35][2] = arg1.method5732() << 4;
			this.anIntArrayArray53[local35][3] = arg1.method5732() << 4;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(26) int[] local26 = this.method6069(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static391.anInt7118; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray519[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V")
	private void method5215() {
		@Pc(13) int local13 = this.anIntArrayArray53.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local27 < local13 && local25 >= this.anIntArrayArray53[local27][0]; local27++) {
				local21++;
			}
			@Pc(64) int local64;
			@Pc(56) int local56;
			@Pc(60) int local60;
			@Pc(50) int[] local50;
			if (local13 > local21) {
				local50 = this.anIntArrayArray53[local21];
				if (local21 <= 0) {
					local56 = local50[2];
					local60 = local50[3];
					local64 = local50[1];
				} else {
					@Pc(73) int[] local73 = this.anIntArrayArray53[local21 - 1];
					@Pc(90) int local90 = (local25 - local73[0] << 12) / (local50[0] - local73[0]);
					@Pc(95) int local95 = 4096 - local90;
					local64 = local95 * local73[1] + local50[1] * local90 >> 12;
					local60 = local90 * local50[3] + local73[3] * local95 >> 12;
					local56 = local50[2] * local90 + local73[2] * local95 >> 12;
				}
			} else {
				local50 = this.anIntArrayArray53[local13 - 1];
				local56 = local50[2];
				local60 = local50[3];
				local64 = local50[1];
			}
			local64 >>= 0x4;
			local56 >>= 0x4;
			local60 >>= 0x4;
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
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			this.anIntArray519[local17] = local64 << 16 | local56 << 8 | local60;
		}
	}
}
