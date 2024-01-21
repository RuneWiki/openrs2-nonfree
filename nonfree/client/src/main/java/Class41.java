import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class41 {

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	private int anInt1882;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt1884;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(II)V")
	public Class41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static155.method2523(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt1882 = local20;
			this.anInt1884 = local16;
			this.anIntArrayArray13 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray13[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				@Pc(75) double local75 = (double) local20 / (double) local16;
				if (local69 > 14) {
					local69 = 14;
				}
				while (local69 > local56) {
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(91) double local91 = local75;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local75 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)I")
	public int method1244(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray13 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1882 / (long) this.anInt1884) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)I")
	public int method1245(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray13 != null) {
			arg0 = (int) ((long) this.anInt1882 * (long) arg0 / (long) this.anInt1884);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BB)[B")
	public byte[] method1250(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray13 != null) {
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt1882 / (long) this.anInt1884) + 14;
			@Pc(31) int[] local31 = new int[local28];
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray13[local11];
				@Pc(44) byte local44 = arg0[local33];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local31[local13 + local46] += local44 * local40[local46];
				}
				local11 += this.anInt1882;
				@Pc(75) int local75 = local11 / this.anInt1884;
				local11 -= this.anInt1884 * local75;
				local13 += local75;
			}
			arg0 = new byte[local28];
			for (@Pc(100) int local100 = 0; local100 < local28; local100++) {
				@Pc(110) int local110 = local31[local100] + 32768 >> 16;
				if (local110 < -128) {
					arg0[local100] = -128;
				} else if (local110 > 127) {
					arg0[local100] = 127;
				} else {
					arg0[local100] = (byte) local110;
				}
			}
		}
		return arg0;
	}
}
