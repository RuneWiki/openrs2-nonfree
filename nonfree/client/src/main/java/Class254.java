import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class254 {

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
	private int anInt7270;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
	private int anInt7269;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(II)V")
	public Class254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static240.method4014(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt7270 = local20;
			this.anIntArrayArray56 = new int[local20][14];
			this.anInt7269 = local24;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray56[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local24 / (double) local20;
				while (local70 > local60) {
					@Pc(92) double local92 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(94) double local94 = local83;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local83 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B[B)[B")
	public byte[] method5816(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray56 != null) {
			@Pc(24) int local24 = (int) ((long) arg0.length * (long) this.anInt7269 / (long) this.anInt7270) + 14;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) byte local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray56[local31];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local27[local46 + local29] += local44[local46] * local39;
				}
				local31 += this.anInt7269;
				@Pc(77) int local77 = local31 / this.anInt7270;
				local31 -= local77 * this.anInt7270;
				local29 += local77;
			}
			arg0 = new byte[local24];
			for (@Pc(102) int local102 = 0; local102 < local24; local102++) {
				@Pc(112) int local112 = local27[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 <= 127) {
					arg0[local102] = (byte) local112;
				} else {
					arg0[local102] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
	public int method5817(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray56 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7269 / (long) this.anInt7270) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)I")
	public int method5818(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray56 != null) {
			arg0 = (int) ((long) this.anInt7269 * (long) arg0 / (long) this.anInt7270);
		}
		return arg0;
	}
}
