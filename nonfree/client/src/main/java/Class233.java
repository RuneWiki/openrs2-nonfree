import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class233 {

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
	private int anInt6412;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray159;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
	private int anInt6413;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(II)V")
	public Class233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static142.method1875(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt6412 = local24;
			this.anIntArrayArray159 = new int[local20][14];
			this.anInt6413 = local20;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray159[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(81) double local81 = (double) local24 / (double) local20;
				while (local60 < local70) {
					@Pc(90) double local90 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(92) double local92 = local81;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local81 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)I")
	public int method4937(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray159 != null) {
			arg0 = (int) ((long) this.anInt6412 * (long) arg0 / (long) this.anInt6413) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[B)[B")
	public byte[] method4938(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray159 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt6412 / (long) this.anInt6413) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray159[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local34 * local39[local41];
				}
				local26 += this.anInt6412;
				@Pc(70) int local70 = local26 / this.anInt6413;
				local24 += local70;
				local26 -= local70 * this.anInt6413;
			}
			arg0 = new byte[local19];
			for (@Pc(91) int local91 = 0; local91 < local19; local91++) {
				@Pc(101) int local101 = local22[local91] + 32768 >> 16;
				if (local101 < -128) {
					arg0[local91] = -128;
				} else if (local101 <= 127) {
					arg0[local91] = (byte) local101;
				} else {
					arg0[local91] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I")
	public int method4939(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray159 != null) {
			arg0 = (int) ((long) this.anInt6412 * (long) arg0 / (long) this.anInt6413);
		}
		return arg0;
	}
}
