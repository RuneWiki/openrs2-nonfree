import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class77 {

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
	private int anInt2930;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
	private int anInt2932;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(II)V")
	public Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static67.method1977(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt2930 = local24;
			this.anIntArrayArray31 = new int[local24][14];
			this.anInt2932 = local20;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray31[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) double local70 = (double) local20 / (double) local24;
				@Pc(76) int local76 = (int) Math.ceil(local52 + 7.0D);
				if (local76 > 14) {
					local76 = 14;
				}
				while (local60 < local76) {
					@Pc(85) double local85 = local70;
					@Pc(92) double local92 = ((double) local60 - local52) * 3.141592653589793D;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local85 = local70 * (Math.sin(local92) / local92);
					}
					local85 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local85 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)I")
	public int method2071(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray31 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2932 / (long) this.anInt2930) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([BB)[B")
	public byte[] method2073(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray31 != null) {
			@Pc(24) int local24 = (int) ((long) this.anInt2932 * (long) arg0.length / (long) this.anInt2930) + 14;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) byte local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray31[local31];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local27[local29 + local46] += local39 * local44[local46];
				}
				local31 += this.anInt2932;
				@Pc(75) int local75 = local31 / this.anInt2930;
				local29 += local75;
				local31 -= this.anInt2930 * local75;
			}
			arg0 = new byte[local24];
			for (@Pc(96) int local96 = 0; local96 < local24; local96++) {
				@Pc(106) int local106 = local27[local96] + 32768 >> 16;
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

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IB)I")
	public int method2075(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray31 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2932 / (long) this.anInt2930);
		}
		return arg0;
	}
}
