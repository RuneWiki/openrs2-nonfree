import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class116 {

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
	private int anInt4150;

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
	private int anInt4152;

	@OriginalMember(owner = "client!gfa", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(II)V")
	public Class116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static365.method5684(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt4150 = local16;
			this.anInt4152 = local20;
			this.anIntArrayArray21 = new int[local20][14];
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray21[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(82) double local82 = (double) local16 / (double) local20;
				while (local56 < local69) {
					@Pc(91) double local91 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(93) double local93 = local82;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local82 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "([BZ)[B")
	public byte[] method3381(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray21 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt4150 / (long) this.anInt4152) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray21[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local43[local45] * local38;
				}
				local30 += this.anInt4150;
				@Pc(76) int local76 = local30 / this.anInt4152;
				local28 += local76;
				local30 -= local76 * this.anInt4152;
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

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "([SI)[S")
	public short[] method3382(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray21 != null) {
			@Pc(29) int local29 = (int) ((long) this.anInt4150 * (long) arg0.length / (long) this.anInt4152) + 14;
			@Pc(32) int[] local32 = new int[local29];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
				@Pc(44) short local44 = arg0[local38];
				@Pc(49) int[] local49 = this.anIntArrayArray21[local36];
				for (@Pc(51) int local51 = 0; local51 < 14; local51++) {
					local32[local34 + local51] += local44 * local49[local51] >> 2;
				}
				local36 += this.anInt4150;
				@Pc(82) int local82 = local36 / this.anInt4152;
				local36 -= local82 * this.anInt4152;
				local34 += local82;
			}
			arg0 = new short[local29];
			for (@Pc(103) int local103 = 0; local103 < local29; local103++) {
				@Pc(113) int local113 = local32[local103] + 8192 >> 14;
				if (local113 < -32768) {
					arg0[local103] = -32768;
				} else if (local113 <= 32767) {
					arg0[local103] = (short) local113;
				} else {
					arg0[local103] = 32767;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZI)I")
	public int method3383(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray21 != null) {
			arg0 = (int) ((long) this.anInt4150 * (long) arg0 / (long) this.anInt4152) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IB)I")
	public int method3384(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray21 != null) {
			arg0 = (int) ((long) this.anInt4150 * (long) arg0 / (long) this.anInt4152);
		}
		return arg0;
	}
}
