import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class63 {

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "[I")
	public static int[] anIntArray230 = new int[99];

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
	private int anInt2029;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	private int anInt2021;

	static {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 99; local9++) {
			@Pc(14) int local14 = local9 + 1;
			@Pc(27) int local27 = (int) ((double) local14 + Math.pow(2.0D, (double) local14 / 7.0D) * 300.0D);
			local7 += local27;
			anIntArray230[local9] = local7 / 4;
		}
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(II)V")
	public Class63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static80.method1280(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt2029 = local16;
			this.anIntArrayArray53 = new int[local16][14];
			this.anInt2021 = local20;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray53[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) double local66 = (double) local20 / (double) local16;
				@Pc(72) int local72 = (int) Math.ceil(local48 + 7.0D);
				if (local72 > 14) {
					local72 = 14;
				}
				while (local56 < local72) {
					@Pc(88) double local88 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(90) double local90 = local66;
					if (local88 < -1.0E-4D || local88 > 1.0E-4D) {
						local90 = local66 * (Math.sin(local88) / local88);
					}
					local90 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local90 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)I")
	public int method1373(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray53 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2021 / (long) this.anInt2029);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
	public int method1374(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray53 != null) {
			arg0 = (int) ((long) this.anInt2021 * (long) arg0 / (long) this.anInt2029) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B[B)[B")
	public byte[] method1377(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray53 != null) {
			@Pc(31) int local31 = (int) ((long) this.anInt2021 * (long) arg0.length / (long) this.anInt2029) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
				@Pc(47) int[] local47 = this.anIntArrayArray53[local36];
				@Pc(51) byte local51 = arg0[local40];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local53 + local38] += local47[local53] * local51;
				}
				local36 += this.anInt2021;
				@Pc(82) int local82 = local36 / this.anInt2029;
				local38 += local82;
				local36 -= this.anInt2029 * local82;
			}
			arg0 = new byte[local31];
			for (@Pc(107) int local107 = 0; local107 < local31; local107++) {
				@Pc(117) int local117 = local34[local107] + 32768 >> 16;
				if (local117 < -128) {
					arg0[local107] = -128;
				} else if (local117 > 127) {
					arg0[local107] = 127;
				} else {
					arg0[local107] = (byte) local117;
				}
			}
		}
		return arg0;
	}
}
