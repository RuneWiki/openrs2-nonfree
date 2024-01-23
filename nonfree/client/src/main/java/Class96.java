import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class96 {

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
	private int anInt4483;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	private int anInt4481;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(II)V")
	public Class96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static26.method349(arg1, arg0);
			@Pc(16) int local16 = arg1 / local12;
			this.anInt4483 = local16;
			@Pc(23) int local23 = arg0 / local12;
			this.anIntArrayArray42 = new int[local23][14];
			this.anInt4481 = local23;
			for (@Pc(33) int local33 = 0; local33 < local23; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray42[local33];
				@Pc(48) double local48 = (double) local33 / (double) local23 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				@Pc(62) double local62 = (double) local16 / (double) local23;
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(75) int local75 = (int) Math.ceil(local48 + 7.0D);
				if (local75 > 14) {
					local75 = 14;
				}
				while (local56 < local75) {
					@Pc(92) double local92 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(94) double local94 = local62;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local62 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)I")
	public int method3551(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray42 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4483 / (long) this.anInt4481) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)I")
	public int method3556(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray42 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4483 / (long) this.anInt4481);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([BI)[B")
	public byte[] method3557(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray42 != null) {
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(30) int local30 = (int) ((long) this.anInt4483 * (long) arg0.length / (long) this.anInt4481) + 14;
			@Pc(33) int[] local33 = new int[local30];
			for (@Pc(35) int local35 = 0; local35 < arg0.length; local35++) {
				@Pc(40) byte local40 = arg0[local35];
				@Pc(45) int[] local45 = this.anIntArrayArray42[local15];
				for (@Pc(47) int local47 = 0; local47 < 14; local47++) {
					local33[local47 + local13] += local45[local47] * local40;
				}
				local15 += this.anInt4483;
				@Pc(77) int local77 = local15 / this.anInt4481;
				local15 -= local77 * this.anInt4481;
				local13 += local77;
			}
			arg0 = new byte[local30];
			for (@Pc(102) int local102 = 0; local102 < local30; local102++) {
				@Pc(111) int local111 = local33[local102] + 32768 >> 16;
				if (local111 < -128) {
					arg0[local102] = -128;
				} else if (local111 > 127) {
					arg0[local102] = 127;
				} else {
					arg0[local102] = (byte) local111;
				}
			}
		}
		return arg0;
	}
}
