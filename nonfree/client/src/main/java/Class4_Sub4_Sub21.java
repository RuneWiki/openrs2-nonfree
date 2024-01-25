import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class4_Sub4_Sub21 extends Class4_Sub4 {

	@OriginalMember(owner = "client!le", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "[I")
	private final int[] anIntArray461 = new int[257];

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(10) int local10 = arg1.method6015();
		if (local10 != 0) {
			this.method4611(local10);
			return;
		}
		this.anIntArrayArray57 = new int[arg1.method6015()][4];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray57.length; local27++) {
			this.anIntArrayArray57[local27][0] = arg1.method5982();
			this.anIntArrayArray57[local27][1] = arg1.method6015() << 4;
			this.anIntArrayArray57[local27][2] = arg1.method6015() << 4;
			this.anIntArrayArray57[local27][3] = arg1.method6015() << 4;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	private void method4609() {
		@Pc(9) int local9 = this.anIntArrayArray57.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 257; local19++) {
			@Pc(23) int local23 = 0;
			@Pc(27) int local27 = local19 << 4;
			for (@Pc(29) int local29 = 0; local29 < local9 && local27 >= this.anIntArrayArray57[local29][0]; local29++) {
				local23++;
			}
			@Pc(109) int local109;
			@Pc(137) int local137;
			@Pc(123) int local123;
			@Pc(60) int[] local60;
			if (local23 < local9) {
				local60 = this.anIntArrayArray57[local23];
				if (local23 > 0) {
					@Pc(72) int[] local72 = this.anIntArrayArray57[local23 - 1];
					@Pc(90) int local90 = (local27 - local72[0] << 12) / (local60[0] - local72[0]);
					@Pc(95) int local95 = 4096 - local90;
					local109 = local95 * local72[1] + local60[1] * local90 >> 12;
					local123 = local72[3] * local95 + local60[3] * local90 >> 12;
					local137 = local95 * local72[2] + local90 * local60[2] >> 12;
				} else {
					local109 = local60[1];
					local137 = local60[2];
					local123 = local60[3];
				}
			} else {
				local60 = this.anIntArrayArray57[local9 - 1];
				local137 = local60[2];
				local109 = local60[1];
				local123 = local60[3];
			}
			local123 >>= 0x4;
			local137 >>= 0x4;
			local109 >>= 0x4;
			if (local137 < 0) {
				local137 = 0;
			} else if (local137 > 255) {
				local137 = 255;
			}
			if (local123 < 0) {
				local123 = 0;
			} else if (local123 > 255) {
				local123 = 255;
			}
			if (local109 < 0) {
				local109 = 0;
			} else if (local109 > 255) {
				local109 = 255;
			}
			this.anIntArray461[local19] = local123 | local109 << 16 | local137 << 8;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
	private void method4611(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray57 = new int[2][4];
			this.anIntArrayArray57[0][3] = 0;
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][2] = 0;
			this.anIntArrayArray57[0][1] = 0;
			this.anIntArrayArray57[1][3] = 4096;
			this.anIntArrayArray57[1][1] = 4096;
			this.anIntArrayArray57[1][2] = 4096;
			this.anIntArrayArray57[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray57 = new int[8][4];
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][3] = 2361;
			this.anIntArrayArray57[0][1] = 2650;
			this.anIntArrayArray57[0][2] = 2602;
			this.anIntArrayArray57[1][2] = 1799;
			this.anIntArrayArray57[1][1] = 2313;
			this.anIntArrayArray57[1][0] = 2867;
			this.anIntArrayArray57[1][3] = 1558;
			this.anIntArrayArray57[2][1] = 2618;
			this.anIntArrayArray57[2][2] = 1734;
			this.anIntArrayArray57[2][3] = 1413;
			this.anIntArrayArray57[2][0] = 3072;
			this.anIntArrayArray57[3][0] = 3276;
			this.anIntArrayArray57[3][3] = 947;
			this.anIntArrayArray57[3][1] = 2296;
			this.anIntArrayArray57[3][2] = 1220;
			this.anIntArrayArray57[4][2] = 963;
			this.anIntArrayArray57[4][1] = 2072;
			this.anIntArrayArray57[4][0] = 3481;
			this.anIntArrayArray57[4][3] = 722;
			this.anIntArrayArray57[5][2] = 2152;
			this.anIntArrayArray57[5][3] = 1766;
			this.anIntArrayArray57[5][0] = 3686;
			this.anIntArrayArray57[5][1] = 2730;
			this.anIntArrayArray57[6][1] = 2232;
			this.anIntArrayArray57[6][3] = 915;
			this.anIntArrayArray57[6][2] = 1060;
			this.anIntArrayArray57[6][0] = 3891;
			this.anIntArrayArray57[7][2] = 1413;
			this.anIntArrayArray57[7][3] = 1140;
			this.anIntArrayArray57[7][0] = 4096;
			this.anIntArrayArray57[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray57 = new int[7][4];
			this.anIntArrayArray57[0][3] = 4096;
			this.anIntArrayArray57[0][1] = 0;
			this.anIntArrayArray57[0][2] = 0;
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[1][0] = 663;
			this.anIntArrayArray57[1][3] = 4096;
			this.anIntArrayArray57[1][2] = 4096;
			this.anIntArrayArray57[1][1] = 0;
			this.anIntArrayArray57[2][1] = 0;
			this.anIntArrayArray57[2][0] = 1363;
			this.anIntArrayArray57[2][2] = 4096;
			this.anIntArrayArray57[2][3] = 0;
			this.anIntArrayArray57[3][2] = 4096;
			this.anIntArrayArray57[3][0] = 2048;
			this.anIntArrayArray57[3][1] = 4096;
			this.anIntArrayArray57[3][3] = 0;
			this.anIntArrayArray57[4][2] = 0;
			this.anIntArrayArray57[4][1] = 4096;
			this.anIntArrayArray57[4][3] = 0;
			this.anIntArrayArray57[4][0] = 2727;
			this.anIntArrayArray57[5][1] = 4096;
			this.anIntArrayArray57[5][0] = 3411;
			this.anIntArrayArray57[5][2] = 0;
			this.anIntArrayArray57[5][3] = 4096;
			this.anIntArrayArray57[6][2] = 0;
			this.anIntArrayArray57[6][1] = 0;
			this.anIntArrayArray57[6][3] = 4096;
			this.anIntArrayArray57[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray57 = new int[6][4];
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][1] = 0;
			this.anIntArrayArray57[0][2] = 0;
			this.anIntArrayArray57[0][3] = 0;
			this.anIntArrayArray57[1][1] = 0;
			this.anIntArrayArray57[1][0] = 1843;
			this.anIntArrayArray57[1][3] = 1493;
			this.anIntArrayArray57[1][2] = 0;
			this.anIntArrayArray57[2][3] = 2939;
			this.anIntArrayArray57[2][2] = 0;
			this.anIntArrayArray57[2][1] = 0;
			this.anIntArrayArray57[2][0] = 2457;
			this.anIntArrayArray57[3][0] = 2781;
			this.anIntArrayArray57[3][3] = 3565;
			this.anIntArrayArray57[3][1] = 0;
			this.anIntArrayArray57[3][2] = 1124;
			this.anIntArrayArray57[4][1] = 546;
			this.anIntArrayArray57[4][0] = 3481;
			this.anIntArrayArray57[4][2] = 3084;
			this.anIntArrayArray57[4][3] = 4031;
			this.anIntArrayArray57[5][0] = 4096;
			this.anIntArrayArray57[5][1] = 4096;
			this.anIntArrayArray57[5][2] = 4096;
			this.anIntArrayArray57[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray57 = new int[16][4];
			this.anIntArrayArray57[0][1] = 80;
			this.anIntArrayArray57[0][0] = 0;
			this.anIntArrayArray57[0][2] = 192;
			this.anIntArrayArray57[0][3] = 321;
			this.anIntArrayArray57[1][1] = 321;
			this.anIntArrayArray57[1][2] = 449;
			this.anIntArrayArray57[1][0] = 155;
			this.anIntArrayArray57[1][3] = 562;
			this.anIntArrayArray57[2][3] = 803;
			this.anIntArrayArray57[2][2] = 690;
			this.anIntArrayArray57[2][1] = 578;
			this.anIntArrayArray57[2][0] = 389;
			this.anIntArrayArray57[3][1] = 947;
			this.anIntArrayArray57[3][0] = 671;
			this.anIntArrayArray57[3][2] = 995;
			this.anIntArrayArray57[3][3] = 1140;
			this.anIntArrayArray57[4][0] = 897;
			this.anIntArrayArray57[4][1] = 1285;
			this.anIntArrayArray57[4][2] = 1397;
			this.anIntArrayArray57[4][3] = 1509;
			this.anIntArrayArray57[5][3] = 1413;
			this.anIntArrayArray57[5][2] = 1429;
			this.anIntArrayArray57[5][1] = 1525;
			this.anIntArrayArray57[5][0] = 1175;
			this.anIntArrayArray57[6][3] = 1333;
			this.anIntArrayArray57[6][2] = 1461;
			this.anIntArrayArray57[6][0] = 1368;
			this.anIntArrayArray57[6][1] = 1734;
			this.anIntArrayArray57[7][0] = 1507;
			this.anIntArrayArray57[7][2] = 1525;
			this.anIntArrayArray57[7][3] = 1702;
			this.anIntArrayArray57[7][1] = 1413;
			this.anIntArrayArray57[8][0] = 1736;
			this.anIntArrayArray57[8][1] = 1108;
			this.anIntArrayArray57[8][3] = 2056;
			this.anIntArrayArray57[8][2] = 1590;
			this.anIntArrayArray57[9][1] = 1766;
			this.anIntArrayArray57[9][3] = 2666;
			this.anIntArrayArray57[9][0] = 2088;
			this.anIntArrayArray57[9][2] = 2056;
			this.anIntArrayArray57[10][2] = 2586;
			this.anIntArrayArray57[10][1] = 2409;
			this.anIntArrayArray57[10][0] = 2355;
			this.anIntArrayArray57[10][3] = 3276;
			this.anIntArrayArray57[11][3] = 3228;
			this.anIntArrayArray57[11][0] = 2691;
			this.anIntArrayArray57[11][1] = 3116;
			this.anIntArrayArray57[11][2] = 3148;
			this.anIntArrayArray57[12][3] = 3196;
			this.anIntArrayArray57[12][0] = 3031;
			this.anIntArrayArray57[12][1] = 3806;
			this.anIntArrayArray57[12][2] = 3710;
			this.anIntArrayArray57[13][2] = 3421;
			this.anIntArrayArray57[13][0] = 3522;
			this.anIntArrayArray57[13][1] = 3437;
			this.anIntArrayArray57[13][3] = 3019;
			this.anIntArrayArray57[14][1] = 3116;
			this.anIntArrayArray57[14][0] = 3727;
			this.anIntArrayArray57[14][3] = 3228;
			this.anIntArrayArray57[14][2] = 3148;
			this.anIntArrayArray57[15][0] = 4096;
			this.anIntArrayArray57[15][1] = 2377;
			this.anIntArrayArray57[15][2] = 2505;
			this.anIntArrayArray57[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray57 = new int[4][4];
			this.anIntArrayArray57[0][1] = 0;
			this.anIntArrayArray57[0][0] = 2048;
			this.anIntArrayArray57[0][3] = 0;
			this.anIntArrayArray57[0][2] = 4096;
			this.anIntArrayArray57[1][2] = 4096;
			this.anIntArrayArray57[1][0] = 2867;
			this.anIntArrayArray57[1][1] = 4096;
			this.anIntArrayArray57[1][3] = 0;
			this.anIntArrayArray57[2][3] = 0;
			this.anIntArrayArray57[2][1] = 4096;
			this.anIntArrayArray57[2][2] = 4096;
			this.anIntArrayArray57[2][0] = 3276;
			this.anIntArrayArray57[3][1] = 4096;
			this.anIntArrayArray57[3][3] = 0;
			this.anIntArrayArray57[3][0] = 4096;
			this.anIntArrayArray57[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
		if (this.anIntArrayArray57 == null) {
			this.method4611(1);
		}
		this.method4609();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(26) int[] local26 = this.method7890(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static560.anInt9394; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray461[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}
}
