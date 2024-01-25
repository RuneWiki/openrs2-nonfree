import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class194 {

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
	private int anInt5989;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
	private int anInt5991;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(II)V")
	public Class194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static269.method4843(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt5989 = local16;
			this.anIntArrayArray47 = new int[local20][14];
			this.anInt5991 = local20;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray47[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(79) double local79 = (double) local16 / (double) local20;
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

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)I")
	public int method5195(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray47 != null) {
			arg0 = (int) ((long) this.anInt5989 * (long) arg0 / (long) this.anInt5991) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B[B)[B")
	public byte[] method5196(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray47 != null) {
			@Pc(31) int local31 = (int) ((long) arg0.length * (long) this.anInt5989 / (long) this.anInt5991) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
				@Pc(46) byte local46 = arg0[local40];
				@Pc(51) int[] local51 = this.anIntArrayArray47[local38];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local53 + local36] += local51[local53] * local46;
				}
				local38 += this.anInt5989;
				@Pc(82) int local82 = local38 / this.anInt5991;
				local38 -= this.anInt5991 * local82;
				local36 += local82;
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

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(BI)I")
	public int method5197(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray47 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt5989 / (long) this.anInt5991);
		}
		return arg0;
	}
}
