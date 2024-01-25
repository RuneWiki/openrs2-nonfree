import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class114 {

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
	private int anInt2863;

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
	private int anInt2862;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(II)V")
	public Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static477.method7047(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anIntArrayArray13 = new int[local16][14];
			this.anInt2863 = local20;
			this.anInt2862 = local16;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray13[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(80) double local80 = (double) local20 / (double) local16;
				while (local69 > local56) {
					@Pc(90) double local90 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(92) double local92 = local80;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local80 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z[B)[B")
	public byte[] method2479(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray13 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt2863 * (long) arg0.length / (long) this.anInt2862) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray13[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local43[local45] * local38;
				}
				local30 += this.anInt2863;
				@Pc(76) int local76 = local30 / this.anInt2862;
				local30 -= local76 * this.anInt2862;
				local28 += local76;
			}
			arg0 = new byte[local23];
			for (@Pc(101) int local101 = 0; local101 < local23; local101++) {
				@Pc(111) int local111 = local26[local101] + 32768 >> 16;
				if (local111 < -128) {
					arg0[local101] = -128;
				} else if (local111 > 127) {
					arg0[local101] = 127;
				} else {
					arg0[local101] = (byte) local111;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)I")
	public int method2480(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray13 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2863 / (long) this.anInt2862) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IZ)I")
	public int method2481(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray13 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2863 / (long) this.anInt2862);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z[S)[S")
	public short[] method2483(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray13 != null) {
			@Pc(31) int local31 = (int) ((long) arg0.length * (long) this.anInt2863 / (long) this.anInt2862) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
				@Pc(46) short local46 = arg0[local40];
				@Pc(51) int[] local51 = this.anIntArrayArray13[local38];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local36 + local53] += local46 * local51[local53] >> 2;
				}
				local38 += this.anInt2863;
				@Pc(87) int local87 = local38 / this.anInt2862;
				local38 -= local87 * this.anInt2862;
				local36 += local87;
			}
			arg0 = new short[local31];
			for (@Pc(108) int local108 = 0; local108 < local31; local108++) {
				@Pc(118) int local118 = local34[local108] + 8192 >> 14;
				if (local118 < -32768) {
					arg0[local108] = -32768;
				} else if (local118 <= 32767) {
					arg0[local108] = (short) local118;
				} else {
					arg0[local108] = 32767;
				}
			}
		}
		return arg0;
	}
}
