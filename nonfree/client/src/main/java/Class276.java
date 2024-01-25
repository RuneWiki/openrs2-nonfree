import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class276 {

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray87;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
	private int anInt7305;

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
	private int anInt7308;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(II)V")
	public Class276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static568.method7908(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anIntArrayArray87 = new int[local20][14];
			this.anInt7305 = local20;
			this.anInt7308 = local16;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray87[local33];
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
				while (local69 > local56) {
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

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)I")
	public int method6368(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray87 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7308 / (long) this.anInt7305) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I[B)[B")
	public byte[] method6369(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray87 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt7308 / (long) this.anInt7305) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray87[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local38 * local43[local45];
				}
				local30 += this.anInt7308;
				@Pc(77) int local77 = local30 / this.anInt7305;
				local28 += local77;
				local30 -= this.anInt7305 * local77;
			}
			arg0 = new byte[local23];
			for (@Pc(102) int local102 = 0; local102 < local23; local102++) {
				@Pc(112) int local112 = local26[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 > 127) {
					arg0[local102] = 127;
				} else {
					arg0[local102] = (byte) local112;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z[S)[S")
	public short[] method6371(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray87 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt7308 * (long) arg0.length / (long) this.anInt7305) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) short local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray87[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34 >> 2;
				}
				local26 += this.anInt7308;
				@Pc(72) int local72 = local26 / this.anInt7305;
				local26 -= this.anInt7305 * local72;
				local24 += local72;
			}
			arg0 = new short[local19];
			for (@Pc(97) int local97 = 0; local97 < local19; local97++) {
				@Pc(107) int local107 = local22[local97] + 8192 >> 14;
				if (local107 < -32768) {
					arg0[local97] = -32768;
				} else if (local107 > 32767) {
					arg0[local97] = 32767;
				} else {
					arg0[local97] = (short) local107;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(IB)I")
	public int method6372(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray87 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7308 / (long) this.anInt7305);
		}
		return arg0;
	}
}
