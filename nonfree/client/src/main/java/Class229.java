import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class229 {

	@OriginalMember(owner = "client!np", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "I")
	private int anInt6308;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "I")
	private int anInt6309;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(II)V")
	public Class229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static284.method4437(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anIntArrayArray45 = new int[local16][14];
			this.anInt6308 = local20;
			this.anInt6309 = local16;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray45[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(79) double local79 = (double) local20 / (double) local16;
				while (local66 > local56) {
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(91) double local91 = local79;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local79 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)I")
	public int method5262(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray45 != null) {
			arg0 = (int) ((long) this.anInt6308 * (long) arg0 / (long) this.anInt6309) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(BI)I")
	public int method5264(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray45 != null) {
			arg0 = (int) ((long) this.anInt6308 * (long) arg0 / (long) this.anInt6309);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([BB)[B")
	public byte[] method5265(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray45 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt6308 / (long) this.anInt6309) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray45[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local39[local41] * local34;
				}
				local26 += this.anInt6308;
				@Pc(70) int local70 = local26 / this.anInt6309;
				local24 += local70;
				local26 -= local70 * this.anInt6309;
			}
			arg0 = new byte[local19];
			for (@Pc(91) int local91 = 0; local91 < local19; local91++) {
				@Pc(101) int local101 = local22[local91] + 32768 >> 16;
				if (local101 < -128) {
					arg0[local91] = -128;
				} else if (local101 <= 127) {
					arg0[local91] = (byte) local101;
				} else {
					arg0[local91] = 127;
				}
			}
		}
		return arg0;
	}
}
