import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class95 {

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
	private int anInt2829;

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
	private int anInt2825;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(II)V")
	public Class95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static315.method5212(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt2829 = local24;
			this.anIntArrayArray28 = new int[local20][14];
			this.anInt2825 = local20;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray28[local37];
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
				while (local60 < local70) {
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

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[B)[B")
	public byte[] method2615(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray28 != null) {
			@Pc(31) int local31 = (int) ((long) this.anInt2829 * (long) arg0.length / (long) this.anInt2825) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
				@Pc(46) byte local46 = arg0[local40];
				@Pc(51) int[] local51 = this.anIntArrayArray28[local38];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local36 + local53] += local46 * local51[local53];
				}
				local38 += this.anInt2829;
				@Pc(82) int local82 = local38 / this.anInt2825;
				local36 += local82;
				local38 -= local82 * this.anInt2825;
			}
			arg0 = new byte[local31];
			for (@Pc(103) int local103 = 0; local103 < local31; local103++) {
				@Pc(113) int local113 = local34[local103] + 32768 >> 16;
				if (local113 < -128) {
					arg0[local103] = -128;
				} else if (local113 > 127) {
					arg0[local103] = 127;
				} else {
					arg0[local103] = (byte) local113;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
	public int method2623(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray28 != null) {
			arg0 = (int) ((long) this.anInt2829 * (long) arg0 / (long) this.anInt2825);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)I")
	public int method2624(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray28 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2829 / (long) this.anInt2825) + 6;
		}
		return arg0;
	}
}
