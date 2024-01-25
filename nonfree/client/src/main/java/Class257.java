import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class257 {

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	private int anInt6997;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
	private int anInt6998;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(II)V")
	public Class257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static278.method3709(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anIntArrayArray59 = new int[local16][14];
			this.anInt6997 = local16;
			this.anInt6998 = local20;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray59[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(82) double local82 = (double) local20 / (double) local16;
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

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([BB)[B")
	public byte[] method5464(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray59 != null) {
			@Pc(24) int local24 = (int) ((long) this.anInt6998 * (long) arg0.length / (long) this.anInt6997) + 14;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) byte local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray59[local31];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local27[local46 + local29] += local44[local46] * local39;
				}
				local31 += this.anInt6998;
				@Pc(77) int local77 = local31 / this.anInt6997;
				local29 += local77;
				local31 -= this.anInt6997 * local77;
			}
			arg0 = new byte[local24];
			for (@Pc(98) int local98 = 0; local98 < local24; local98++) {
				@Pc(108) int local108 = local27[local98] + 32768 >> 16;
				if (local108 < -128) {
					arg0[local98] = -128;
				} else if (local108 > 127) {
					arg0[local98] = 127;
				} else {
					arg0[local98] = (byte) local108;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)I")
	public int method5467(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray59 != null) {
			arg0 = (int) ((long) this.anInt6998 * (long) arg0 / (long) this.anInt6997) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)I")
	public int method5468(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray59 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt6998 / (long) this.anInt6997);
		}
		return arg0;
	}
}
