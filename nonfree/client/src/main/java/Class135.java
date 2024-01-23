import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class135 {

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	private int anInt4930;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	private int anInt4929;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(II)V")
	public Class135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(13) int local13 = Static34.method725(arg0, arg1);
			@Pc(17) int local17 = arg0 / local13;
			this.anInt4930 = local17;
			@Pc(24) int local24 = arg1 / local13;
			this.anIntArrayArray37 = new int[local17][14];
			this.anInt4929 = local24;
			for (@Pc(34) int local34 = 0; local34 < local17; local34++) {
				@Pc(42) int[] local42 = this.anIntArrayArray37[local34];
				@Pc(50) double local50 = (double) local34 / (double) local17 + 6.0D;
				@Pc(58) int local58 = (int) Math.floor(local50 + 1.0D - 7.0D);
				@Pc(64) double local64 = (double) local24 / (double) local17;
				@Pc(70) int local70 = (int) Math.ceil(local50 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				if (local58 < 0) {
					local58 = 0;
				}
				while (local58 < local70) {
					@Pc(91) double local91 = ((double) local58 - local50) * 3.141592653589793D;
					@Pc(93) double local93 = local64;
					if (-1.0E-4D > local91 || local91 > 1.0E-4D) {
						local93 = local64 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local58 - local50) * 0.2243994752564138D) * 0.46D + 0.54D;
					local42[local58] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local58++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)I")
	public int method3913(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray37 != null) {
			arg0 = (int) ((long) this.anInt4929 * (long) arg0 / (long) this.anInt4930) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z[B)[B")
	public byte[] method3914(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray37 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt4929 * (long) arg0.length / (long) this.anInt4930) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(32) int local32;
			for (local32 = 0; local32 < arg0.length; local32++) {
				@Pc(40) byte local40 = arg0[local32];
				@Pc(45) int[] local45 = this.anIntArrayArray37[local30];
				@Pc(47) int local47;
				for (local47 = 0; local47 < 14; local47++) {
					local26[local47 + local28] += local45[local47] * local40;
				}
				local30 += this.anInt4929;
				local47 = local30 / this.anInt4930;
				local28 += local47;
				local30 -= local47 * this.anInt4930;
			}
			arg0 = new byte[local23];
			for (local32 = 0; local32 < local23; local32++) {
				@Pc(106) int local106 = local26[local32] + 32768 >> 16;
				if (local106 < -128) {
					arg0[local32] = -128;
				} else if (local106 <= 127) {
					arg0[local32] = (byte) local106;
				} else {
					arg0[local32] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I")
	public int method3916(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray37 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4929 / (long) this.anInt4930);
		}
		return arg0;
	}
}
