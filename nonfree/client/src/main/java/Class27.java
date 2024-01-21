import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class27 {

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	private int anInt1183;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	private int anInt1184;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(II)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static24.method519(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt1183 = local20;
			this.anIntArrayArray10 = new int[local16][14];
			this.anInt1184 = local16;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray10[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				@Pc(72) double local72 = (double) local20 / (double) local16;
				if (local66 > 14) {
					local66 = 14;
				}
				while (local56 < local66) {
					@Pc(83) double local83 = local72;
					@Pc(90) double local90 = ((double) local56 - local48) * 3.141592653589793D;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local83 = local72 * (Math.sin(local90) / local90);
					}
					local83 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local83 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B[B)[B")
	public byte[] method825(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray10 != null) {
			@Pc(6) int local6 = 0;
			@Pc(21) int local21 = (int) ((long) arg0.length * (long) this.anInt1183 / (long) this.anInt1184) + 14;
			@Pc(23) int local23 = 0;
			@Pc(26) int[] local26 = new int[local21];
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray10[local6];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local26[local23 + local41] += local34 * local39[local41];
				}
				local6 += this.anInt1183;
				@Pc(72) int local72 = local6 / this.anInt1184;
				local23 += local72;
				local6 -= this.anInt1184 * local72;
			}
			arg0 = new byte[local21];
			for (@Pc(93) int local93 = 0; local93 < local21; local93++) {
				@Pc(103) int local103 = local26[local93] + 32768 >> 16;
				if (local103 < -128) {
					arg0[local93] = -128;
				} else if (local103 > 127) {
					arg0[local93] = 127;
				} else {
					arg0[local93] = (byte) local103;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)I")
	public int method826(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray10 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1183 / (long) this.anInt1184) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
	public int method827(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray10 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1183 / (long) this.anInt1184);
		}
		return arg0;
	}
}
