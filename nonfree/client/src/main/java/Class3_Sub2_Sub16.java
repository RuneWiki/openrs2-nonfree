import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class3_Sub2_Sub16 extends Class3_Sub2 {

	@OriginalMember(owner = "client!iu", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!iu", name = "I", descriptor = "[I")
	private final int[] anIntArray317 = new int[257];

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(14) int local14 = arg1.method8401();
		if (local14 != 0) {
			this.method4684(local14);
			return;
		}
		this.anIntArrayArray50 = new int[arg1.method8401()][4];
		for (@Pc(34) int local34 = 0; local34 < this.anIntArrayArray50.length; local34++) {
			this.anIntArrayArray50[local34][0] = arg1.method8414();
			this.anIntArrayArray50[local34][1] = arg1.method8401() << 4;
			this.anIntArrayArray50[local34][2] = arg1.method8401() << 4;
			this.anIntArrayArray50[local34][3] = arg1.method8401() << 4;
		}
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
		if (this.anIntArrayArray50 == null) {
			this.method4684(1);
		}
		this.method4683();
	}

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "(I)V")
	private void method4683() {
		@Pc(13) int local13 = this.anIntArrayArray50.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 257; local17++) {
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = local17 << 4;
			for (@Pc(27) int local27 = 0; local27 < local13 && local25 >= this.anIntArrayArray50[local27][0]; local27++) {
				local21++;
			}
			@Pc(64) int local64;
			@Pc(60) int local60;
			@Pc(68) int local68;
			@Pc(54) int[] local54;
			if (local21 < local13) {
				local54 = this.anIntArrayArray50[local21];
				if (local21 <= 0) {
					local60 = local54[2];
					local64 = local54[1];
					local68 = local54[3];
				} else {
					@Pc(77) int[] local77 = this.anIntArrayArray50[local21 - 1];
					@Pc(95) int local95 = (local25 - local77[0] << 12) / (local54[0] - local77[0]);
					@Pc(100) int local100 = 4096 - local95;
					local68 = local54[3] * local95 + local77[3] * local100 >> 12;
					local64 = local100 * local77[1] + local95 * local54[1] >> 12;
					local60 = local54[2] * local95 + local100 * local77[2] >> 12;
				}
			} else {
				local54 = this.anIntArrayArray50[local13 - 1];
				local68 = local54[3];
				local60 = local54[2];
				local64 = local54[1];
			}
			local68 >>= 0x4;
			local64 >>= 0x4;
			local60 >>= 0x4;
			if (local68 < 0) {
				local68 = 0;
			} else if (local68 > 255) {
				local68 = 255;
			}
			if (local64 < 0) {
				local64 = 0;
			} else if (local64 > 255) {
				local64 = 255;
			}
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 > 255) {
				local60 = 255;
			}
			this.anIntArray317[local17] = local68 | local60 << 8 | local64 << 16;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(26) int[] local26 = this.method8340(arg0, 0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static164.anInt8839; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray317[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)V")
	private void method4684(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray50 = new int[2][4];
			this.anIntArrayArray50[0][1] = 0;
			this.anIntArrayArray50[0][0] = 0;
			this.anIntArrayArray50[0][3] = 0;
			this.anIntArrayArray50[0][2] = 0;
			this.anIntArrayArray50[1][2] = 4096;
			this.anIntArrayArray50[1][3] = 4096;
			this.anIntArrayArray50[1][1] = 4096;
			this.anIntArrayArray50[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray50 = new int[8][4];
			this.anIntArrayArray50[0][3] = 2361;
			this.anIntArrayArray50[0][2] = 2602;
			this.anIntArrayArray50[0][0] = 0;
			this.anIntArrayArray50[0][1] = 2650;
			this.anIntArrayArray50[1][2] = 1799;
			this.anIntArrayArray50[1][0] = 2867;
			this.anIntArrayArray50[1][3] = 1558;
			this.anIntArrayArray50[1][1] = 2313;
			this.anIntArrayArray50[2][1] = 2618;
			this.anIntArrayArray50[2][2] = 1734;
			this.anIntArrayArray50[2][0] = 3072;
			this.anIntArrayArray50[2][3] = 1413;
			this.anIntArrayArray50[3][0] = 3276;
			this.anIntArrayArray50[3][1] = 2296;
			this.anIntArrayArray50[3][2] = 1220;
			this.anIntArrayArray50[3][3] = 947;
			this.anIntArrayArray50[4][1] = 2072;
			this.anIntArrayArray50[4][0] = 3481;
			this.anIntArrayArray50[4][3] = 722;
			this.anIntArrayArray50[4][2] = 963;
			this.anIntArrayArray50[5][2] = 2152;
			this.anIntArrayArray50[5][1] = 2730;
			this.anIntArrayArray50[5][0] = 3686;
			this.anIntArrayArray50[5][3] = 1766;
			this.anIntArrayArray50[6][1] = 2232;
			this.anIntArrayArray50[6][2] = 1060;
			this.anIntArrayArray50[6][3] = 915;
			this.anIntArrayArray50[6][0] = 3891;
			this.anIntArrayArray50[7][1] = 1686;
			this.anIntArrayArray50[7][0] = 4096;
			this.anIntArrayArray50[7][2] = 1413;
			this.anIntArrayArray50[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray50 = new int[7][4];
			this.anIntArrayArray50[0][3] = 4096;
			this.anIntArrayArray50[0][1] = 0;
			this.anIntArrayArray50[0][2] = 0;
			this.anIntArrayArray50[0][0] = 0;
			this.anIntArrayArray50[1][1] = 0;
			this.anIntArrayArray50[1][0] = 663;
			this.anIntArrayArray50[1][3] = 4096;
			this.anIntArrayArray50[1][2] = 4096;
			this.anIntArrayArray50[2][3] = 0;
			this.anIntArrayArray50[2][2] = 4096;
			this.anIntArrayArray50[2][1] = 0;
			this.anIntArrayArray50[2][0] = 1363;
			this.anIntArrayArray50[3][2] = 4096;
			this.anIntArrayArray50[3][1] = 4096;
			this.anIntArrayArray50[3][0] = 2048;
			this.anIntArrayArray50[3][3] = 0;
			this.anIntArrayArray50[4][2] = 0;
			this.anIntArrayArray50[4][3] = 0;
			this.anIntArrayArray50[4][0] = 2727;
			this.anIntArrayArray50[4][1] = 4096;
			this.anIntArrayArray50[5][0] = 3411;
			this.anIntArrayArray50[5][1] = 4096;
			this.anIntArrayArray50[5][3] = 4096;
			this.anIntArrayArray50[5][2] = 0;
			this.anIntArrayArray50[6][1] = 0;
			this.anIntArrayArray50[6][0] = 4096;
			this.anIntArrayArray50[6][3] = 4096;
			this.anIntArrayArray50[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray50 = new int[6][4];
			this.anIntArrayArray50[0][2] = 0;
			this.anIntArrayArray50[0][0] = 0;
			this.anIntArrayArray50[0][1] = 0;
			this.anIntArrayArray50[0][3] = 0;
			this.anIntArrayArray50[1][2] = 0;
			this.anIntArrayArray50[1][0] = 1843;
			this.anIntArrayArray50[1][1] = 0;
			this.anIntArrayArray50[1][3] = 1493;
			this.anIntArrayArray50[2][1] = 0;
			this.anIntArrayArray50[2][0] = 2457;
			this.anIntArrayArray50[2][2] = 0;
			this.anIntArrayArray50[2][3] = 2939;
			this.anIntArrayArray50[3][3] = 3565;
			this.anIntArrayArray50[3][0] = 2781;
			this.anIntArrayArray50[3][2] = 1124;
			this.anIntArrayArray50[3][1] = 0;
			this.anIntArrayArray50[4][0] = 3481;
			this.anIntArrayArray50[4][1] = 546;
			this.anIntArrayArray50[4][2] = 3084;
			this.anIntArrayArray50[4][3] = 4031;
			this.anIntArrayArray50[5][0] = 4096;
			this.anIntArrayArray50[5][2] = 4096;
			this.anIntArrayArray50[5][1] = 4096;
			this.anIntArrayArray50[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray50 = new int[16][4];
			this.anIntArrayArray50[0][0] = 0;
			this.anIntArrayArray50[0][3] = 321;
			this.anIntArrayArray50[0][2] = 192;
			this.anIntArrayArray50[0][1] = 80;
			this.anIntArrayArray50[1][2] = 449;
			this.anIntArrayArray50[1][3] = 562;
			this.anIntArrayArray50[1][1] = 321;
			this.anIntArrayArray50[1][0] = 155;
			this.anIntArrayArray50[2][2] = 690;
			this.anIntArrayArray50[2][0] = 389;
			this.anIntArrayArray50[2][3] = 803;
			this.anIntArrayArray50[2][1] = 578;
			this.anIntArrayArray50[3][3] = 1140;
			this.anIntArrayArray50[3][2] = 995;
			this.anIntArrayArray50[3][1] = 947;
			this.anIntArrayArray50[3][0] = 671;
			this.anIntArrayArray50[4][1] = 1285;
			this.anIntArrayArray50[4][3] = 1509;
			this.anIntArrayArray50[4][0] = 897;
			this.anIntArrayArray50[4][2] = 1397;
			this.anIntArrayArray50[5][1] = 1525;
			this.anIntArrayArray50[5][0] = 1175;
			this.anIntArrayArray50[5][3] = 1413;
			this.anIntArrayArray50[5][2] = 1429;
			this.anIntArrayArray50[6][3] = 1333;
			this.anIntArrayArray50[6][2] = 1461;
			this.anIntArrayArray50[6][0] = 1368;
			this.anIntArrayArray50[6][1] = 1734;
			this.anIntArrayArray50[7][3] = 1702;
			this.anIntArrayArray50[7][1] = 1413;
			this.anIntArrayArray50[7][2] = 1525;
			this.anIntArrayArray50[7][0] = 1507;
			this.anIntArrayArray50[8][0] = 1736;
			this.anIntArrayArray50[8][3] = 2056;
			this.anIntArrayArray50[8][1] = 1108;
			this.anIntArrayArray50[8][2] = 1590;
			this.anIntArrayArray50[9][1] = 1766;
			this.anIntArrayArray50[9][2] = 2056;
			this.anIntArrayArray50[9][3] = 2666;
			this.anIntArrayArray50[9][0] = 2088;
			this.anIntArrayArray50[10][3] = 3276;
			this.anIntArrayArray50[10][0] = 2355;
			this.anIntArrayArray50[10][1] = 2409;
			this.anIntArrayArray50[10][2] = 2586;
			this.anIntArrayArray50[11][2] = 3148;
			this.anIntArrayArray50[11][0] = 2691;
			this.anIntArrayArray50[11][3] = 3228;
			this.anIntArrayArray50[11][1] = 3116;
			this.anIntArrayArray50[12][2] = 3710;
			this.anIntArrayArray50[12][0] = 3031;
			this.anIntArrayArray50[12][1] = 3806;
			this.anIntArrayArray50[12][3] = 3196;
			this.anIntArrayArray50[13][0] = 3522;
			this.anIntArrayArray50[13][3] = 3019;
			this.anIntArrayArray50[13][1] = 3437;
			this.anIntArrayArray50[13][2] = 3421;
			this.anIntArrayArray50[14][3] = 3228;
			this.anIntArrayArray50[14][1] = 3116;
			this.anIntArrayArray50[14][2] = 3148;
			this.anIntArrayArray50[14][0] = 3727;
			this.anIntArrayArray50[15][3] = 2746;
			this.anIntArrayArray50[15][2] = 2505;
			this.anIntArrayArray50[15][1] = 2377;
			this.anIntArrayArray50[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray50 = new int[4][4];
			this.anIntArrayArray50[0][2] = 4096;
			this.anIntArrayArray50[0][1] = 0;
			this.anIntArrayArray50[0][3] = 0;
			this.anIntArrayArray50[0][0] = 2048;
			this.anIntArrayArray50[1][2] = 4096;
			this.anIntArrayArray50[1][3] = 0;
			this.anIntArrayArray50[1][0] = 2867;
			this.anIntArrayArray50[1][1] = 4096;
			this.anIntArrayArray50[2][1] = 4096;
			this.anIntArrayArray50[2][0] = 3276;
			this.anIntArrayArray50[2][3] = 0;
			this.anIntArrayArray50[2][2] = 4096;
			this.anIntArrayArray50[3][0] = 4096;
			this.anIntArrayArray50[3][2] = 0;
			this.anIntArrayArray50[3][1] = 4096;
			this.anIntArrayArray50[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
