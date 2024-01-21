import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class25 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	private int anInt1219;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
	private int anInt1226;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(II)V")
	public Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static91.method1802(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			this.anInt1219 = local16;
			@Pc(23) int local23 = arg1 / local12;
			this.anIntArrayArray9 = new int[local16][14];
			this.anInt1226 = local23;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(43) double local43 = (double) local33 / (double) local16 + 6.0D;
				@Pc(48) int[] local48 = this.anIntArrayArray9[local33];
				@Pc(56) int local56 = (int) Math.floor(local43 + 1.0D - 7.0D);
				@Pc(62) int local62 = (int) Math.ceil(local43 + 7.0D);
				if (local62 > 14) {
					local62 = 14;
				}
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(79) double local79 = (double) local23 / (double) local16;
				while (local56 < local62) {
					@Pc(83) double local83 = local79;
					@Pc(91) double local91 = ((double) local56 - local43) * 3.141592653589793D;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local83 = local79 * (Math.sin(local91) / local91);
					}
					local83 *= Math.cos(((double) local56 - local43) * 0.2243994752564138D) * 0.46D + 0.54D;
					local48[local56] = (int) Math.floor(local83 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
	public int method923(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray9 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1226 / (long) this.anInt1219) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)I")
	public int method924(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray9 != null) {
			arg0 = (int) ((long) this.anInt1226 * (long) arg0 / (long) this.anInt1219);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([BI)[B")
	public byte[] method925(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray9 != null) {
			@Pc(31) int local31 = (int) ((long) this.anInt1226 * (long) arg0.length / (long) this.anInt1219) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
				@Pc(46) byte local46 = arg0[local40];
				@Pc(51) int[] local51 = this.anIntArrayArray9[local38];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local36 + local53] += local51[local53] * local46;
				}
				local38 += this.anInt1226;
				@Pc(82) int local82 = local38 / this.anInt1219;
				local36 += local82;
				local38 -= this.anInt1219 * local82;
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
}
