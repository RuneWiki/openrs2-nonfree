import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class163 {

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
	private int anInt5034;

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
	private int anInt5031;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(II)V")
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(13) int local13 = Static137.method2207(arg1, arg0);
			@Pc(17) int local17 = arg1 / local13;
			this.anInt5034 = local17;
			@Pc(24) int local24 = arg0 / local13;
			this.anInt5031 = local24;
			this.anIntArrayArray39 = new int[local24][14];
			for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
				@Pc(46) int[] local46 = this.anIntArrayArray39[local34];
				@Pc(54) double local54 = (double) local34 / (double) local24 + 6.0D;
				@Pc(62) int local62 = (int) Math.floor(local54 + 1.0D - 7.0D);
				@Pc(68) double local68 = (double) local17 / (double) local24;
				if (local62 < 0) {
					local62 = 0;
				}
				@Pc(80) int local80 = (int) Math.ceil(local54 + 7.0D);
				if (local80 > 14) {
					local80 = 14;
				}
				while (local80 > local62) {
					@Pc(92) double local92 = local68;
					@Pc(99) double local99 = ((double) local62 - local54) * 3.141592653589793D;
					if (local99 < -1.0E-4D || local99 > 1.0E-4D) {
						local92 = local68 * (Math.sin(local99) / local99);
					}
					local92 *= Math.cos(((double) local62 - local54) * 0.2243994752564138D) * 0.46D + 0.54D;
					local46[local62] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local62++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z[B)[B")
	public byte[] method3911(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray39 != null) {
			@Pc(25) int local25 = (int) ((long) arg0.length * (long) this.anInt5034 / (long) this.anInt5031) + 14;
			@Pc(27) int local27 = 0;
			@Pc(30) int[] local30 = new int[local25];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34;
			for (local34 = 0; local34 < arg0.length; local34++) {
				@Pc(46) byte local46 = arg0[local34];
				@Pc(51) int[] local51 = this.anIntArrayArray39[local32];
				@Pc(53) int local53;
				for (local53 = 0; local53 < 14; local53++) {
					local30[local53 + local27] += local51[local53] * local46;
				}
				local32 += this.anInt5034;
				local53 = local32 / this.anInt5031;
				local32 -= local53 * this.anInt5031;
				local27 += local53;
			}
			arg0 = new byte[local25];
			for (local34 = 0; local34 < local25; local34++) {
				@Pc(118) int local118 = local30[local34] + 32768 >> 16;
				if (local118 < -128) {
					arg0[local34] = -128;
				} else if (local118 > 127) {
					arg0[local34] = 127;
				} else {
					arg0[local34] = (byte) local118;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I")
	public int method3913(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray39 != null) {
			arg0 = (int) ((long) this.anInt5034 * (long) arg0 / (long) this.anInt5031) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)I")
	public int method3914(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray39 != null) {
			arg0 = (int) ((long) this.anInt5034 * (long) arg0 / (long) this.anInt5031);
		}
		return arg0;
	}
}
