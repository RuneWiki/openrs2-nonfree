import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class49 {

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
	private int anInt1959;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
	private int anInt1953;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(II)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static196.method2907(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt1959 = local24;
			this.anInt1953 = local20;
			this.anIntArrayArray18 = new int[local24][14];
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray18[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(86) double local86 = (double) local20 / (double) local24;
				while (local73 > local60) {
					@Pc(96) double local96 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(98) double local98 = local86;
					if (local96 < -1.0E-4D || local96 > 1.0E-4D) {
						local98 = local86 * (Math.sin(local96) / local96);
					}
					local98 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local98 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)I")
	public int method1504(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray18 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1953 / (long) this.anInt1959);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I")
	public int method1508(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray18 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1953 / (long) this.anInt1959) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[B)[B")
	public byte[] method1509(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray18 != null) {
			@Pc(11) int local11 = 0;
			@Pc(26) int local26 = (int) ((long) this.anInt1953 * (long) arg0.length / (long) this.anInt1959) + 14;
			@Pc(28) int local28 = 0;
			@Pc(31) int[] local31 = new int[local26];
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) byte local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray18[local11];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local31[local46 + local28] += local39 * local44[local46];
				}
				local11 += this.anInt1953;
				@Pc(77) int local77 = local11 / this.anInt1959;
				local28 += local77;
				local11 -= this.anInt1959 * local77;
			}
			arg0 = new byte[local26];
			for (@Pc(102) int local102 = 0; local102 < local26; local102++) {
				@Pc(112) int local112 = local31[local102] + 32768 >> 16;
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
}
