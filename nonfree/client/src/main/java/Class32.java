import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class32 {

	@OriginalMember(owner = "client!h", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static99.method1598(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anIntArrayArray8 = new int[local20][14];
			this.anInt921 = local20;
			this.anInt923 = local16;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray8[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(77) double local77 = (double) local16 / (double) local20;
				while (local56 < local66) {
					@Pc(86) double local86 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(88) double local88 = local77;
					if (local86 < -1.0E-4D || local86 > 1.0E-4D) {
						local88 = local77 * (Math.sin(local86) / local86);
					}
					local88 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local88 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
	public int method691(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray8 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt923 / (long) this.anInt921) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B[B)[B")
	public byte[] method692(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray8 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt923 * (long) arg0.length / (long) this.anInt921) + 14;
			@Pc(25) int local25 = 0;
			@Pc(28) int[] local28 = new int[local23];
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray8[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local28[local25 + local45] += local43[local45] * local38;
				}
				local30 += this.anInt923;
				@Pc(75) int local75 = local30 / this.anInt921;
				local30 -= local75 * this.anInt921;
				local25 += local75;
			}
			arg0 = new byte[local23];
			for (@Pc(96) int local96 = 0; local96 < local23; local96++) {
				@Pc(106) int local106 = local28[local96] + 32768 >> 16;
				if (local106 < -128) {
					arg0[local96] = -128;
				} else if (local106 > 127) {
					arg0[local96] = 127;
				} else {
					arg0[local96] = (byte) local106;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(II)I")
	public int method693(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray8 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt923 / (long) this.anInt921);
		}
		return arg0;
	}
}
